package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreateCourseUIRegressionTest0 {

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
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test001");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        assertTrue(int0 == 7, "'" + int0 + "' != '" + 7 + "'");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test002");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        assertTrue(int0 == 10, "'" + int0 + "' != '" + 10 + "'");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test003");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test004");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test005");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        assertTrue(int0 == 3, "'" + int0 + "' != '" + 3 + "'");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test006");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        assertTrue(int0 == 4, "'" + int0 + "' != '" + 4 + "'");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test007");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        assertTrue(float0 == 0.5f, "'" + float0 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test008");
        int int0 = java.awt.Frame.ICONIFIED;
        assertTrue(int0 == 1, "'" + int0 + "' != '" + 1 + "'");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test009");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        assertTrue(int0 == 6, "'" + int0 + "' != '" + 6 + "'");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test010");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test011");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        assertTrue(int0 == 11, "'" + int0 + "' != '" + 11 + "'");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test012");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        assertTrue(int0 == 6, "'" + int0 + "' != '" + 6 + "'");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test013");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test014");
        int int0 = java.awt.Frame.HAND_CURSOR;
        assertTrue(int0 == 12, "'" + int0 + "' != '" + 12 + "'");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test015");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        java.lang.Class<?> wildcardClass1 = windowArray0.getClass();
        assertNotNull(windowArray0);
        assertArrayEquals(windowArray0, new java.awt.Window[] {});
        assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test016");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test017");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        assertTrue(float0 == 0.0f, "'" + float0 + "' != '" + 0.0f + "'");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test018");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        assertTrue(float0 == 0.0f, "'" + float0 + "' != '" + 0.0f + "'");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test019");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        assertTrue(float0 == 1.0f, "'" + float0 + "' != '" + 1.0f + "'");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test020");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        assertTrue(int0 == 8, "'" + int0 + "' != '" + 8 + "'");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test021");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        assertTrue(int0 == 4, "'" + int0 + "' != '" + 4 + "'");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test022");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        assertNotNull(frameArray0);
        assertArrayEquals(frameArray0, new java.awt.Frame[] {});
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test023");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        assertTrue(int0 == 1, "'" + int0 + "' != '" + 1 + "'");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test024");
        int int0 = java.awt.image.ImageObserver.ERROR;
        assertTrue(int0 == 64, "'" + int0 + "' != '" + 64 + "'");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test025");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        assertTrue(int0 == 8, "'" + int0 + "' != '" + 8 + "'");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test026");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        assertTrue(int0 == 1, "'" + int0 + "' != '" + 1 + "'");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test027");
        int int0 = java.awt.image.ImageObserver.ABORT;
        assertTrue(int0 == 128, "'" + int0 + "' != '" + 128 + "'");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test028");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        assertTrue(boolean0 == true, "'" + boolean0 + "' != '" + true + "'");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test029");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        assertTrue(int0 == 4, "'" + int0 + "' != '" + 4 + "'");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test030");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test031");
        int int0 = java.awt.Frame.NORMAL;
        assertTrue(int0 == 0, "'" + int0 + "' != '" + 0 + "'");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test032");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        assertTrue(int0 == 2, "'" + int0 + "' != '" + 2 + "'");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test033");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        assertTrue(int0 == 9, "'" + int0 + "' != '" + 9 + "'");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test034");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        assertTrue(int0 == 13, "'" + int0 + "' != '" + 13 + "'");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test035");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        assertTrue(int0 == 1, "'" + int0 + "' != '" + 1 + "'");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test036");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        assertTrue(int0 == 32, "'" + int0 + "' != '" + 32 + "'");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test037");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        assertTrue(int0 == 16, "'" + int0 + "' != '" + 16 + "'");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test038");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        assertTrue(int0 == 3, "'" + int0 + "' != '" + 3 + "'");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test039");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        assertTrue(int0 == 5, "'" + int0 + "' != '" + 5 + "'");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test040");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        assertTrue(float0 == 1.0f, "'" + float0 + "' != '" + 1.0f + "'");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test041");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.Dimension dimension2 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.resize(dimension2);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"width\" because \"d\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test042");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.io.PrintStream printStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.list(printStream10, 7);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame6" + "'", str9, "frame6");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test043");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.Event event8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jMenuBar7.mouseDrag(event8, 64, 7);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test044");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        createCourseUI0.transferFocus();
        java.awt.event.ContainerListener containerListener3 = null;
        createCourseUI0.removeContainerListener(containerListener3);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test045");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        java.awt.Graphics graphics3 = null;
        createCourseUI0.print(graphics3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test046");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setExtendedState((int) '#');
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test047");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        javax.swing.JLayeredPane jLayeredPane4 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setLayeredPane(jLayeredPane4);
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test048");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.Event event5 = null;
        boolean boolean8 = createCourseUI0.mouseMove(event5, 5, (int) (byte) 100);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test049");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        int int2 = createCourseUI0.countComponents();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component5 = createCourseUI0.add("frame18", (java.awt.Component) createCourseUI4);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(int2 == 1, "'" + int2 + "' != '" + 1 + "'");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test050");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test051");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str12 = createCourseUI4.getName();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        java.awt.Point point16 = createCourseUI14.getLocation();
        java.awt.Component component17 = createCourseUI4.getComponentAt(point16);
        java.awt.Component component18 = createCourseUI1.findComponentAt(point16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = component18.inside(4, 13);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str12 + "' != '" + "frame21" + "'", str12, "frame21");
        assertNotNull(point16);
        assertNotNull(component17);
        assertNull(component18);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test052");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        int int5 = createCourseUI0.getComponentCount();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test053");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        boolean boolean5 = createCourseUI0.isMaximumSizeSet();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setContentPane((java.awt.Container) createCourseUI6);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test054");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.list(printWriter5, 6);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test055");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        java.io.PrintWriter printWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.list(printWriter4);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test056");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.BufferCapabilities bufferCapabilities11 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.createBufferStrategy((int) (short) -1, bufferCapabilities11);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame24" + "'", str9, "frame24");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test057");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        boolean boolean5 = createCourseUI0.isMaximumSizeSet();
        java.awt.Container container6 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setContentPane(container6);
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: contentPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test058");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Rectangle rectangle7 = createCourseUI0.getMaximizedBounds();
        java.awt.Font font8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics9 = createCourseUI0.getFontMetrics(font8);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(rectangle7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test059");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Rectangle rectangle7 = createCourseUI0.getMaximizedBounds();
        createCourseUI0.firePropertyChange("hi!", 0.5f, (float) '#');
        java.awt.Event event12 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.deliverEvent(event12);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(rectangle7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test060");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.awt.dnd.DropTarget dropTarget7 = container6.getDropTarget();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertNull(dropTarget7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test061");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        createCourseUI0.revalidate();
        float float14 = createCourseUI0.getAlignmentY();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertTrue(float14 == 0.5f,"'" + float14 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test062");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        javax.swing.JMenuBar jMenuBar3 = null;
        createCourseUI0.setJMenuBar(jMenuBar3);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true,"'" + boolean2 + "' != '" + true + "'");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test063");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        boolean boolean9 = createCourseUI1.isAlwaysOnTopSupported();
        java.awt.event.MouseListener mouseListener10 = null;
        createCourseUI1.removeMouseListener(mouseListener10);
        boolean boolean12 = createCourseUI1.isVisible();
        assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test064");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        boolean boolean9 = createCourseUI1.isAlwaysOnTopSupported();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        boolean boolean13 = createCourseUI10.isFontSet();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = createCourseUI1.add((java.awt.Component) createCourseUI10, (int) (byte) 1);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test065");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        int int2 = createCourseUI0.countComponents();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component4 = createCourseUI0.getComponent(12);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        assertTrue(int2 == 1, "'" + int2 + "' != '" + 1 + "'");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test066");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        java.awt.PopupMenu popupMenu7 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.add(popupMenu7);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test067");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        component12.removePropertyChangeListener("frame30", propertyChangeListener14);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test068");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isDisplayable();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test069");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        createCourseUI0.transferFocusUpCycle();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test070");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component11 = createCourseUI0.add((java.awt.Component) createCourseUI3, 0);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test071");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        createCourseUI1.toBack();
        assertEquals("'" + str9 + "' != '" + "frame46" + "'", str9, "frame46");
        assertNotNull(dimension10);
        assertNull(point12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test072");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.pack();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        float float12 = createCourseUI11.getAlignmentX();
        java.awt.Event event13 = null;
        boolean boolean15 = createCourseUI11.action(event13, (java.lang.Object) (byte) 1);
        boolean boolean16 = createCourseUI11.isFocusOwner();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component18 = createCourseUI0.add((java.awt.Component) createCourseUI11, (int) (byte) 10);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(float12 == 0.5f, "'" + float12 + "' != '" + 0.5f + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test073");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        createCourseUI0.firePropertyChange("com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", '4', ' ');
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test074");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        java.awt.BufferCapabilities bufferCapabilities4 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.createBufferStrategy((int) (short) 0, bufferCapabilities4);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test075");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        float float21 = createCourseUI20.getAlignmentX();
        java.awt.Event event22 = null;
        boolean boolean24 = createCourseUI20.action(event22, (java.lang.Object) (byte) 1);
        boolean boolean25 = createCourseUI20.isFocusOwner();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI9.setComponentZOrder((java.awt.Component) createCourseUI20, 0);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(float21 == 0.5f, "'" + float21 + "' != '" + 0.5f + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertTrue(boolean25 == false, "'" + boolean25 + "' != '" + false + "'");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test076");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Rectangle rectangle7 = createCourseUI0.getMaximizedBounds();
        createCourseUI0.firePropertyChange("hi!", 0.5f, (float) '#');
        createCourseUI0.setFocusTraversalKeysEnabled(false);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(rectangle7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test077");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray11 = createCourseUI1.getWindowFocusListeners();
        assertEquals("'" + str9 + "' != '" + "frame52" + "'", str9, "frame52");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(windowFocusListenerArray11);
        assertArrayEquals(windowFocusListenerArray11, new java.awt.event.WindowFocusListener[] {});
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test078");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        createCourseUI0.repaint();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test079");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        boolean boolean9 = createCourseUI1.isMaximumSizeSet();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test080");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.lang.String str7 = createCourseUI0.toString();
        java.awt.Event event8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = createCourseUI0.postEvent(event8);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertEquals("'" + str7 + "' != '" + "com.example.CreateCourseUI[frame63,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "com.example.CreateCourseUI[frame63,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test081");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        java.awt.event.FocusListener focusListener13 = null;
        createCourseUI1.removeFocusListener(focusListener13);
        createCourseUI1.list();
        assertEquals("'" + str9 + "' != '" + "frame70" + "'", str9, "frame70");
        assertNotNull(dimension10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test082");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Graphics graphics10 = null;
        createCourseUI0.paintComponents(graphics10);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test083");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        java.awt.Window window5 = createCourseUI0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = window5.isFocusCycleRoot();
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNull(window5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test084");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.show(true);
        java.awt.Graphics graphics12 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.update(graphics12);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test085");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        boolean boolean4 = createCourseUI0.isFocusOwner();
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test086");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setOpacity((float) (short) -1);
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test087");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        createCourseUI0.setFocusTraversalKeysEnabled(true);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test088");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        boolean boolean13 = createCourseUI1.isShowing();
        int int14 = createCourseUI1.getCursorType();
        assertEquals("'" + str9 + "' != '" + "frame80" + "'", str9, "frame80");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(int14 == 0, "'" + int14 + "' != '" + 0 + "'");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test089");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        createCourseUI0.setEnabled(true);
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.list(printWriter12, (int) (short) 100);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test090");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        com.example.CreateCourseUI createCourseUI5 = new com.example.CreateCourseUI();
        createCourseUI5.setName("");
        boolean boolean8 = createCourseUI5.isFocusOwner();
        java.awt.Rectangle rectangle9 = null;
        createCourseUI5.setMaximizedBounds(rectangle9);
        java.awt.Container container11 = createCourseUI5.getContentPane();
        java.lang.String str12 = createCourseUI5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component14 = createCourseUI0.add((java.awt.Component) createCourseUI5, 32);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(container11);
        assertEquals("'" + str12 + "' != '" + "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str12, "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test091");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        createCourseUI0.invalidate();
        createCourseUI0.setLocationByPlatform(true);
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test092");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            component9.list(printWriter10);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test093");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI4.setName("");
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI7.setLocationRelativeTo((java.awt.Component) createCourseUI8);
        java.awt.Event event10 = null;
        boolean boolean13 = createCourseUI7.mouseUp(event10, (int) '#', 12);
        java.awt.Color color14 = createCourseUI7.getBackground();
        java.awt.LayoutManager layoutManager15 = createCourseUI7.getLayout();
        createCourseUI4.setLayout(layoutManager15);
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI17.setLocationRelativeTo((java.awt.Component) createCourseUI18);
        createCourseUI18.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str26 = createCourseUI18.getName();
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        createCourseUI27.setLocationRelativeTo((java.awt.Component) createCourseUI28);
        java.awt.Point point30 = createCourseUI28.getLocation();
        java.awt.Component component31 = createCourseUI18.getComponentAt(point30);
        createCourseUI4.setLocation(point30);
        java.awt.Rectangle rectangle33 = createCourseUI4.getBounds();
        boolean boolean34 = createCourseUI0.action(event3, (java.lang.Object) rectangle33);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(color14);
        assertNotNull(layoutManager15);
        assertEquals("'" + str26 + "' != '" + "frame88" + "'", str26, "frame88");
        assertNotNull(point30);
        assertNotNull(component31);
        assertNotNull(rectangle33);
        assertTrue(boolean34 == false, "'" + boolean34 + "' != '" + false + "'");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test094");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.pack();
        java.awt.Insets insets11 = createCourseUI0.insets();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        createCourseUI0.addPropertyChangeListener("frame27", propertyChangeListener13);
        createCourseUI0.setTitle("frame69");
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        java.awt.Event event21 = null;
        boolean boolean24 = createCourseUI18.mouseUp(event21, (int) '#', 12);
        java.awt.Component component27 = createCourseUI18.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean28 = createCourseUI18.isForegroundSet();
        createCourseUI18.toBack();
        createCourseUI18.firePropertyChange("frame62", (long) 5, 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component34 = createCourseUI0.add("frame36", (java.awt.Component) createCourseUI18);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertNotNull(insets11);
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(component27);
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test095");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        java.awt.Point point4 = createCourseUI1.location();
        java.awt.event.MouseListener mouseListener5 = null;
        createCourseUI1.removeMouseListener(mouseListener5);
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.list(printStream7);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertNotNull(point3);
        assertNotNull(point4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test096");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        float float16 = createCourseUI15.getAlignmentX();
        java.awt.Event event17 = null;
        boolean boolean19 = createCourseUI15.action(event17, (java.lang.Object) (byte) 1);
        createCourseUI15.setName("");
        java.awt.Dimension dimension22 = createCourseUI15.minimumSize();
        component14.resize(dimension22);
        assertEquals("'" + str9 + "' != '" + "frame95" + "'", str9, "frame95");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertTrue(float16 == 0.5f, "'" + float16 + "' != '" + 0.5f + "'");
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNotNull(dimension22);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test097");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isAutoRequestFocus();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.list(printWriter6, 0);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test098");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.setOpacity((float) (short) 100);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame99" + "'", str9, "frame99");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test099");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.setState((int) (byte) 100);
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        createCourseUI6.setVisible(true);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setComponentZOrder((java.awt.Component) createCourseUI6, (int) 'a');
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test100");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        createCourseUI0.setLocationByPlatform(true);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test101");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        java.awt.Dimension dimension8 = createCourseUI0.getMinimumSize();
        boolean boolean9 = createCourseUI0.isFocusable();
        assertNotNull(dimension8);
        assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test102");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.lang.String str7 = createCourseUI0.toString();
        javax.swing.JMenuBar jMenuBar8 = null;
        createCourseUI0.setJMenuBar(jMenuBar8);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component11 = createCourseUI0.getComponent(160);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 160");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertEquals("'" + str7 + "' != '" + "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test103");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        java.awt.Point point4 = createCourseUI1.location();
        java.awt.Component component5 = createCourseUI1.getMostRecentFocusOwner();
        java.awt.Graphics graphics6 = null;
        createCourseUI1.paintAll(graphics6);
        int int8 = createCourseUI1.getY();
        assertNotNull(point3);
        assertNotNull(point4);
        assertNotNull(component5);
        assertTrue(int8 == 160, "'" + int8 + "' != '" + 160 + "'");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test104");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        java.util.Locale locale4 = createCourseUI0.getLocale();
        javax.swing.JMenuBar jMenuBar5 = createCourseUI0.getJMenuBar();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(locale4);
        assertEquals(locale4.toString(), "en_US");
        assertNull(jMenuBar5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test105");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.util.ResourceBundle resourceBundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.applyResourceBundle(resourceBundle5);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test106");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        boolean boolean4 = createCourseUI0.isMinimumSizeSet();
        com.example.CreateCourseUI createCourseUI5 = new com.example.CreateCourseUI();
        createCourseUI5.setName("");
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        createCourseUI8.setLocationRelativeTo((java.awt.Component) createCourseUI9);
        java.awt.Event event11 = null;
        boolean boolean14 = createCourseUI8.mouseUp(event11, (int) '#', 12);
        java.awt.Color color15 = createCourseUI8.getBackground();
        java.awt.LayoutManager layoutManager16 = createCourseUI8.getLayout();
        createCourseUI5.setLayout(layoutManager16);
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str27 = createCourseUI19.getName();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI29 = new com.example.CreateCourseUI();
        createCourseUI28.setLocationRelativeTo((java.awt.Component) createCourseUI29);
        java.awt.Point point31 = createCourseUI29.getLocation();
        java.awt.Component component32 = createCourseUI19.getComponentAt(point31);
        createCourseUI5.setLocation(point31);
        java.awt.Component component34 = createCourseUI0.findComponentAt(point31);
        float float35 = createCourseUI0.getAlignmentX();
        java.awt.Container container36 = createCourseUI0.getFocusCycleRootAncestor();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(color15);
        assertNotNull(layoutManager16);
        assertEquals("'" + str27 + "' != '" + "frame108" + "'", str27, "frame108");
        assertNotNull(point31);
        assertNotNull(component32);
        assertNull(component34);
        assertTrue(float35 == 0.5f, "'" + float35 + "' != '" + 0.5f + "'");
        assertNull(container36);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test107");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        createCourseUI7.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str15 = createCourseUI7.getName();
        java.awt.Dimension dimension16 = createCourseUI7.minimumSize();
        createCourseUI0.setMaximumSize(dimension16);
        java.awt.Graphics graphics18 = null;
        createCourseUI0.printComponents(graphics18);
        java.awt.Graphics graphics20 = null;
        createCourseUI0.paintComponents(graphics20);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertEquals("'" + str15 + "' != '" + "frame110" + "'", str15, "frame110");
        assertNotNull(dimension16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test108");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Graphics graphics7 = null;
        createCourseUI0.paintComponents(graphics7);
        boolean boolean9 = createCourseUI0.isMinimumSizeSet();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test109");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        java.awt.Event event2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = createCourseUI0.lostFocus(event2, obj3);
        java.awt.image.ColorModel colorModel5 = createCourseUI0.getColorModel();
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame111,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame111,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(colorModel5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test110");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        boolean boolean20 = createCourseUI0.isAlwaysOnTopSupported();
        java.awt.im.InputMethodRequests inputMethodRequests21 = createCourseUI0.getInputMethodRequests();
        createCourseUI0.repaint(0, 6, (int) (byte) 10, 160);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertNull(inputMethodRequests21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test111");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        java.awt.Insets insets4 = createCourseUI0.getInsets();
        createCourseUI0.firePropertyChange("com.example.CreateCourseUI[frame89,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (long) (short) 100, (long) (short) 100);
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(insets4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test112");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        createCourseUI20.setLocationRelativeTo((java.awt.Component) createCourseUI21);
        java.awt.Event event23 = null;
        boolean boolean26 = createCourseUI20.mouseUp(event23, (int) '#', 12);
        java.awt.Color color27 = createCourseUI20.getBackground();
        int int28 = createCourseUI20.getState();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setGlassPane((java.awt.Component) createCourseUI20);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(color27);
        assertTrue(int28 == 0, "'" + int28 + "' != '" + 0 + "'");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test113");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        java.util.Locale locale4 = createCourseUI0.getLocale();
        createCourseUI0.setFocusable(true);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(locale4);
        assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test114");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        boolean boolean18 = createCourseUI1.getFocusableWindowState();
        java.awt.Event event19 = null;
        boolean boolean22 = createCourseUI1.mouseEnter(event19, (int) (short) 100, 5);
        assertEquals("'" + str9 + "' != '" + "frame116" + "'", str9, "frame116");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertTrue(boolean18 == true, "'" + boolean18 + "' != '" + true + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test115");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Point point7 = createCourseUI0.location();
        java.awt.Image image8 = null;
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        boolean boolean14 = createCourseUI11.isFontSet();
        java.awt.Insets insets15 = createCourseUI11.getInsets();
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI11.mouseUp(event16, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle20 = createCourseUI11.getBounds();
        int int21 = createCourseUI0.checkImage(image8, (int) (short) -1, (int) (short) 100, (java.awt.image.ImageObserver) createCourseUI11);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        createCourseUI11.addHierarchyBoundsListener(hierarchyBoundsListener22);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(point7);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(insets15);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNotNull(rectangle20);
        assertTrue(int21 == 32, "'" + int21 + "' != '" + 32 + "'");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test116");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        createCourseUI0.setFocusableWindowState(false);
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        createCourseUI0.removeMouseMotionListener(mouseMotionListener6);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test117");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        java.awt.Component component4 = createCourseUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar5 = createCourseUI0.getMenuBar();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertNotNull(component4);
        assertNull(menuBar5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test118");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.Window.Type type13 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.setType(type13);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame122" + "'", str9, "frame122");
        assertNotNull(dimension10);
        assertNull(point12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test119");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        createCourseUI1.setSize(13, 433);
        assertEquals("'" + str9 + "' != '" + "frame123" + "'", str9, "frame123");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test120");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.Container container14 = createCourseUI1.getParent();
        java.awt.Graphics graphics15 = null;
        // The following exception was thrown during execution in test generation
        try {
            container14.printAll(graphics15);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame125" + "'", str9, "frame125");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNull(container14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test121");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        java.awt.Insets insets15 = createCourseUI1.insets();
        assertEquals("'" + str9 + "' != '" + "frame128" + "'", str9, "frame128");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertNotNull(insets15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test122");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.GraphicsConfiguration graphicsConfiguration9 = createCourseUI0.getGraphicsConfiguration();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(graphicsConfiguration9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test123");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setVisible(true);
        createCourseUI0.setFocusable(true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test124");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.Dimension dimension8 = createCourseUI0.minimumSize();
        java.lang.String str9 = createCourseUI0.getName();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(dimension8);
        assertEquals("'" + str9 + "' != '" + "frame134" + "'", str9, "frame134");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test125");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        createCourseUI1.removeHierarchyListener(hierarchyListener13);
        assertEquals("'" + str9 + "' != '" + "frame135" + "'", str9, "frame135");
        assertNotNull(dimension10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test126");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        java.awt.im.InputContext inputContext7 = createCourseUI1.getInputContext();
        createCourseUI1.setResizable(false);
        boolean boolean10 = createCourseUI1.isActive();
        assertNotNull(inputContext7);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test127");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        createCourseUI0.move(7, 7);
        boolean boolean12 = createCourseUI0.isValidateRoot();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test128");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = createCourseUI1.requestFocusInWindow(cause11);
        java.lang.String str13 = createCourseUI1.getTitle();
        assertEquals("'" + str9 + "' != '" + "frame138" + "'", str9, "frame138");
        assertNotNull(dimension10);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertEquals("'" + str13 + "' != '" + "Create Course" + "'", str13, "Create Course");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test129");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.setState((int) (byte) 100);
        boolean boolean6 = createCourseUI0.isFocusableWindow();
        createCourseUI0.transferFocusUpCycle();
        assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test130");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        java.awt.Insets insets4 = createCourseUI0.getInsets();
        java.awt.Event event5 = null;
        boolean boolean8 = createCourseUI0.mouseUp(event5, (int) (byte) 1, (int) '4');
        java.lang.String str9 = createCourseUI0.toString();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(insets4);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame140,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame140,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test131");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        createCourseUI1.firePropertyChange("frame23", (short) 1, (short) (byte) -1);
        java.awt.Font font8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics9 = createCourseUI1.getFontMetrics(font8);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertNotNull(point3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test132");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        boolean boolean11 = createCourseUI1.isForegroundSet();
        boolean boolean12 = createCourseUI1.getIgnoreRepaint();
        assertEquals("'" + str9 + "' != '" + "frame141" + "'", str9, "frame141");
        assertNotNull(dimension10);
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test133");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        boolean boolean10 = createCourseUI0.isDisplayable();
        java.lang.Object obj11 = createCourseUI0.getTreeLock();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(obj11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test134");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        java.awt.Shape shape10 = null;
        createCourseUI0.setMixingCutoutShape(shape10);
        java.awt.Dimension dimension12 = createCourseUI0.getMinimumSize();
        java.util.List<java.awt.Image> imageList13 = createCourseUI0.getIconImages();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame146,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame146,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(dimension12);
        assertNotNull(imageList13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test135");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = createCourseUI0.isForegroundSet();
        createCourseUI0.toBack();
        createCourseUI0.firePropertyChange("frame62", (long) 5, 0L);
        boolean boolean16 = createCourseUI0.getIgnoreRepaint();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test136");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = createCourseUI1.isFocusTraversalPolicyProvider();
        assertEquals("'" + str9 + "' != '" + "frame148" + "'", str9, "frame148");
        assertNotNull(dimension10);
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test137");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        java.awt.Image image11 = createCourseUI0.getIconImage();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertNull(image11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test138");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        java.awt.AWTEvent aWTEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.dispatchEvent(aWTEvent4);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test139");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        createCourseUI0.setResizable(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test140");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        boolean boolean15 = createCourseUI1.isShowing();
        assertEquals("'" + str9 + "' != '" + "frame153" + "'", str9, "frame153");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test141");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        int int3 = createCourseUI1.getExtendedState();
        java.awt.Event event4 = null;
        boolean boolean7 = createCourseUI1.mouseDrag(event4, (int) (short) 0, (int) 'a');
        assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test142");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        java.awt.Insets insets4 = createCourseUI0.getInsets();
        java.awt.Event event5 = null;
        boolean boolean8 = createCourseUI0.mouseUp(event5, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle9 = createCourseUI0.getBounds();
        createCourseUI0.doLayout();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(insets4);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(rectangle9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test143");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        createCourseUI0.setFocusableWindowState(false);
        int int6 = createCourseUI0.getX();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI7.setLocationRelativeTo((java.awt.Component) createCourseUI8);
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        createCourseUI11.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str19 = createCourseUI11.getName();
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        createCourseUI20.setLocationRelativeTo((java.awt.Component) createCourseUI21);
        java.awt.Point point23 = createCourseUI21.getLocation();
        java.awt.Component component24 = createCourseUI11.getComponentAt(point23);
        java.awt.Component component25 = createCourseUI8.findComponentAt(point23);
        boolean boolean26 = createCourseUI0.contains(point23);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertTrue(int6 == 433, "'" + int6 + "' != '" + 433 + "'");
        assertEquals("'" + str19 + "' != '" + "frame159" + "'", str19, "frame159");
        assertNotNull(point23);
        assertNotNull(component24);
        assertNull(component25);
        assertTrue(boolean26 == true, "'" + boolean26 + "' != '" + true + "'");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test144");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        java.awt.Shape shape10 = null;
        createCourseUI0.setMixingCutoutShape(shape10);
        java.awt.Dimension dimension12 = createCourseUI0.getMinimumSize();
        int int13 = createCourseUI0.getWidth();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame161,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame161,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(dimension12);
        assertTrue(int13 == 500, "'" + int13 + "' != '" + 500 + "'");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test145");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        java.awt.Point point4 = createCourseUI1.location();
        java.awt.Component component5 = createCourseUI1.getMostRecentFocusOwner();
        java.awt.Graphics graphics6 = null;
        createCourseUI1.paintAll(graphics6);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.applyResourceBundle("frame112");
            fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name frame112, locale en_US");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        assertNotNull(point3);
        assertNotNull(point4);
        assertNotNull(component5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test146");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        createCourseUI0.pack();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = createCourseUI0.getPropertyChangeListeners("frame11");
        java.awt.AWTEvent aWTEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.dispatchEvent(aWTEvent8);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertNotNull(propertyChangeListenerArray7);
        assertArrayEquals(propertyChangeListenerArray7, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test147");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        createCourseUI0.setState(13);
        java.lang.Object obj10 = createCourseUI0.getTreeLock();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertNotNull(obj10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test148");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        createCourseUI0.setEnabled(true);
        java.awt.Component[] componentArray12 = createCourseUI0.getComponents();
        java.awt.Event event13 = null;
        java.lang.Object obj14 = null;
        boolean boolean15 = createCourseUI0.gotFocus(event13, obj14);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(componentArray12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test149");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        boolean boolean11 = createCourseUI0.isForegroundSet();
        boolean boolean12 = createCourseUI0.isOpaque();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test150");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        createCourseUI14.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str22 = createCourseUI14.getName();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI14.getComponentAt(point26);
        createCourseUI0.setLocation(point26);
        java.awt.Rectangle rectangle29 = createCourseUI0.getBounds();
        java.awt.event.ContainerListener containerListener30 = null;
        createCourseUI0.addContainerListener(containerListener30);
        float float32 = createCourseUI0.getOpacity();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertEquals("'" + str22 + "' != '" + "frame173" + "'", str22, "frame173");
        assertNotNull(point26);
        assertNotNull(component27);
        assertNotNull(rectangle29);
        assertTrue(float32 == 1.0f, "'" + float32 + "' != '" + 1.0f + "'");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test151");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        int int2 = createCourseUI0.getState();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str12 = createCourseUI4.getName();
        java.awt.Dimension dimension13 = createCourseUI4.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        createCourseUI4.removeWindowFocusListener(windowFocusListener14);
        createCourseUI4.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType17 = null;
        createCourseUI4.setModalExclusionType(modalExclusionType17);
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        createCourseUI4.removeInputMethodListener(inputMethodListener19);
        java.awt.LayoutManager layoutManager21 = createCourseUI4.getLayout();
        createCourseUI0.setLayout(layoutManager21);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        assertEquals("'" + str12 + "' != '" + "frame174" + "'", str12, "frame174");
        assertNotNull(dimension13);
        assertNotNull(layoutManager21);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test152");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Point point7 = createCourseUI0.location();
        createCourseUI0.firePropertyChange("frame69", (short) (byte) -1, (short) 100);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(point7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test153");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        createCourseUI1.addHierarchyListener(hierarchyListener16);
        java.awt.Event event18 = null;
        boolean boolean21 = createCourseUI1.mouseUp(event18, 0, 10);
        assertEquals("'" + str9 + "' != '" + "frame175" + "'", str9, "frame175");
        assertNotNull(dimension10);
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test154");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage(16, 100);
        createCourseUI0.transferFocusBackward();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test155");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        createCourseUI14.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str22 = createCourseUI14.getName();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI14.getComponentAt(point26);
        createCourseUI0.setLocation(point26);
        java.awt.Event event29 = null;
        boolean boolean32 = createCourseUI0.mouseUp(event29, 11, 500);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertEquals("'" + str22 + "' != '" + "frame184" + "'", str22, "frame184");
        assertNotNull(point26);
        assertNotNull(component27);
        assertTrue(boolean32 == false, "'" + boolean32 + "' != '" + false + "'");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test156");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        boolean boolean11 = createCourseUI0.isForegroundSet();
        java.awt.event.MouseMotionListener mouseMotionListener12 = null;
        createCourseUI0.addMouseMotionListener(mouseMotionListener12);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test157");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI4.setName("");
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI7.setLocationRelativeTo((java.awt.Component) createCourseUI8);
        java.awt.Event event10 = null;
        boolean boolean13 = createCourseUI7.mouseUp(event10, (int) '#', 12);
        java.awt.Color color14 = createCourseUI7.getBackground();
        java.awt.LayoutManager layoutManager15 = createCourseUI7.getLayout();
        createCourseUI4.setLayout(layoutManager15);
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI17.setLocationRelativeTo((java.awt.Component) createCourseUI18);
        createCourseUI18.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str26 = createCourseUI18.getName();
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        createCourseUI27.setLocationRelativeTo((java.awt.Component) createCourseUI28);
        java.awt.Point point30 = createCourseUI28.getLocation();
        java.awt.Component component31 = createCourseUI18.getComponentAt(point30);
        createCourseUI4.setLocation(point30);
        java.awt.Rectangle rectangle33 = createCourseUI4.getBounds();
        java.awt.event.ContainerListener containerListener34 = null;
        createCourseUI4.addContainerListener(containerListener34);
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        boolean boolean37 = createCourseUI0.isAlwaysOnTop();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(color14);
        assertNotNull(layoutManager15);
        assertEquals("'" + str26 + "' != '" + "frame185" + "'", str26, "frame185");
        assertNotNull(point30);
        assertNotNull(component31);
        assertNotNull(rectangle33);
        assertTrue(boolean37 == false, "'" + boolean37 + "' != '" + false + "'");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test158");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Dimension dimension7 = createCourseUI0.minimumSize();
        createCourseUI0.setIgnoreRepaint(false);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(dimension7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test159");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Rectangle rectangle7 = createCourseUI0.getMaximizedBounds();
        createCourseUI0.firePropertyChange("hi!", 0.5f, (float) '#');
        boolean boolean12 = createCourseUI0.isAutoRequestFocus();
        java.awt.Cursor cursor13 = null;
        createCourseUI0.setCursor(cursor13);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(rectangle7);
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test160");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.show(true);
        java.awt.Dimension dimension12 = createCourseUI0.preferredSize();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertNotNull(dimension12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test161");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.awt.event.WindowListener windowListener7 = null;
        createCourseUI0.removeWindowListener(windowListener7);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setOpacity((float) 64);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test162");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.MouseListener[] mouseListenerArray16 = createCourseUI1.getMouseListeners();
        createCourseUI1.firePropertyChange("frame170", (short) 100, (short) -1);
        assertEquals("'" + str9 + "' != '" + "frame188" + "'", str9, "frame188");
        assertNotNull(dimension10);
        assertNotNull(mouseListenerArray16);
        assertArrayEquals(mouseListenerArray16, new java.awt.event.MouseListener[] {});
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test163");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray14 = createCourseUI1.getWindowFocusListeners();
        java.awt.Image image15 = null;
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI18.setFocusableWindowState(false);
        float float21 = createCourseUI18.getOpacity();
        boolean boolean22 = createCourseUI1.prepareImage(image15, (int) '#', (int) (byte) 10, (java.awt.image.ImageObserver) createCourseUI18);
        java.awt.event.MouseMotionListener mouseMotionListener23 = null;
        createCourseUI18.removeMouseMotionListener(mouseMotionListener23);
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI26 = new com.example.CreateCourseUI();
        createCourseUI25.setLocationRelativeTo((java.awt.Component) createCourseUI26);
        createCourseUI26.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str34 = createCourseUI26.getName();
        java.awt.Dimension dimension35 = createCourseUI26.minimumSize();
        java.awt.Point point37 = createCourseUI26.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener38 = null;
        createCourseUI26.removeInputMethodListener(inputMethodListener38);
        boolean boolean40 = createCourseUI26.isMinimumSizeSet();
        createCourseUI26.enableInputMethods(false);
        javax.swing.JRootPane jRootPane43 = createCourseUI26.getRootPane();
        java.lang.Object obj44 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI18.add((java.awt.Component) createCourseUI26, obj44);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame189" + "'", str9, "frame189");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray14);
        assertArrayEquals(windowFocusListenerArray14, new java.awt.event.WindowFocusListener[] {});
        assertTrue(float21 == 1.0f, "'" + float21 + "' != '" + 1.0f + "'");
        assertTrue(boolean22 == true, "'" + boolean22 + "' != '" + true + "'");
        assertEquals("'" + str34 + "' != '" + "frame190" + "'", str34, "frame190");
        assertNotNull(dimension35);
        assertNull(point37);
        assertTrue(boolean40 == false, "'" + boolean40 + "' != '" + false + "'");
        assertNotNull(jRootPane43);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test164");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        boolean boolean5 = createCourseUI0.inside(2, 0);
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test165");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        java.awt.Insets insets4 = createCourseUI0.getInsets();
        java.lang.Class<?> wildcardClass5 = createCourseUI0.getClass();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(insets4);
        assertNotNull(wildcardClass5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test166");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        java.awt.Point point10 = createCourseUI0.getMousePosition(true);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
        assertNull(point10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test167");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        boolean boolean10 = createCourseUI1.isEnabled();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        java.awt.Point point14 = createCourseUI12.getLocation();
        java.awt.Point point15 = createCourseUI12.location();
        java.awt.Component component16 = createCourseUI12.getMostRecentFocusOwner();
        java.awt.Graphics graphics17 = null;
        createCourseUI12.paintAll(graphics17);
        java.awt.Toolkit toolkit19 = createCourseUI12.getToolkit();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component21 = createCourseUI1.add((java.awt.Component) createCourseUI12, (int) (short) -1);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame193" + "'", str9, "frame193");
        assertTrue(boolean10 == true, "'" + boolean10 + "' != '" + true + "'");
        assertNotNull(point14);
        assertNotNull(point15);
        assertNotNull(component16);
        assertNotNull(toolkit19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test168");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.setAlwaysOnTop(false);
        java.lang.String str5 = createCourseUI1.toString();
        assertEquals("'" + str5 + "' != '" + "com.example.CreateCourseUI[frame194,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str5, "com.example.CreateCourseUI[frame194,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test169");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Color color16 = createCourseUI9.getBackground();
        javax.accessibility.AccessibleContext accessibleContext17 = createCourseUI9.getAccessibleContext();
        java.lang.String str18 = createCourseUI9.toString();
        java.awt.Shape shape19 = null;
        createCourseUI9.setMixingCutoutShape(shape19);
        createCourseUI9.enableInputMethods(true);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setGlassPane((java.awt.Component) createCourseUI9);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(color16);
        assertNotNull(accessibleContext17);
        assertEquals("'" + str18 + "' != '" + "com.example.CreateCourseUI[frame195,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str18, "com.example.CreateCourseUI[frame195,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test170");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        java.awt.Point point4 = createCourseUI1.location();
        java.awt.event.MouseListener mouseListener5 = null;
        createCourseUI1.removeMouseListener(mouseListener5);
        createCourseUI1.transferFocusBackward();
        assertNotNull(point3);
        assertNotNull(point4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test171");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        createCourseUI0.transferFocus();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        createCourseUI7.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str15 = createCourseUI7.getName();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        createCourseUI16.setLocationRelativeTo((java.awt.Component) createCourseUI17);
        java.awt.Point point19 = createCourseUI17.getLocation();
        java.awt.Component component20 = createCourseUI7.getComponentAt(point19);
        java.awt.Component component21 = createCourseUI4.findComponentAt(point19);
        createCourseUI0.setLocation(point19);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setOpacity(0.5f);
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertEquals("'" + str15 + "' != '" + "frame197" + "'", str15, "frame197");
        assertNotNull(point19);
        assertNotNull(component20);
        assertNull(component21);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test172");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        java.awt.event.FocusListener focusListener13 = null;
        createCourseUI1.removeFocusListener(focusListener13);
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        boolean boolean16 = createCourseUI15.isForegroundSet();
        boolean boolean17 = createCourseUI15.isValid();
        java.awt.Toolkit toolkit18 = createCourseUI15.getToolkit();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component19 = createCourseUI1.add((java.awt.Component) createCourseUI15);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame200" + "'", str9, "frame200");
        assertNotNull(dimension10);
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(toolkit18);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test173");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        int int3 = createCourseUI1.getExtendedState();
        float float4 = createCourseUI1.getOpacity();
        assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
        assertTrue(float4 == 1.0f, "'" + float4 + "' != '" + 1.0f + "'");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test174");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        java.util.Locale locale4 = createCourseUI0.getLocale();
        boolean boolean5 = createCourseUI0.isOpaque();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = createCourseUI0.getComponent(184);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 184");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(locale4);
        assertEquals(locale4.toString(), "en_US");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test175");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.event.FocusListener[] focusListenerArray13 = createCourseUI1.getFocusListeners();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        float float15 = createCourseUI14.getAlignmentX();
        java.awt.Event event16 = null;
        boolean boolean18 = createCourseUI14.action(event16, (java.lang.Object) (byte) 1);
        createCourseUI1.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        assertEquals("'" + str9 + "' != '" + "frame201" + "'", str9, "frame201");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(focusListenerArray13);
        assertArrayEquals(focusListenerArray13, new java.awt.event.FocusListener[] {});
        assertTrue(float15 == 0.5f, "'" + float15 + "' != '" + 0.5f + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test176");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        int int8 = createCourseUI0.getCursorType();
        java.awt.event.ContainerListener containerListener9 = null;
        createCourseUI0.removeContainerListener(containerListener9);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test177");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        java.awt.Event event4 = null;
        java.awt.Window[] windowArray5 = java.awt.Window.getWindows();
        java.lang.Class<?> wildcardClass6 = windowArray5.getClass();
        boolean boolean7 = createCourseUI0.gotFocus(event4, (java.lang.Object) wildcardClass6);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertNotNull(windowArray5);
        assertNotNull(wildcardClass6);
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test178");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        boolean boolean14 = createCourseUI1.isFocused();
        java.util.Locale locale15 = createCourseUI1.getLocale();
        assertEquals("'" + str9 + "' != '" + "frame202" + "'", str9, "frame202");
        assertNotNull(dimension10);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(locale15);
        assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test179");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.ComponentListener componentListener14 = null;
        createCourseUI1.removeComponentListener(componentListener14);
        boolean boolean16 = createCourseUI1.isLightweight();
        java.util.List<java.awt.Image> imageList17 = createCourseUI1.getIconImages();
        java.awt.AWTEvent aWTEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.dispatchEvent(aWTEvent18);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame203" + "'", str9, "frame203");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(imageList17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test180");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = createCourseUI0.postEvent(event5);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test181");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = createCourseUI0.isForegroundSet();
        java.awt.Component component11 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setGlassPane(component11);
            fail("Expected exception of type java.lang.NullPointerException; message: glassPane cannot be set to null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test182");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        boolean boolean4 = createCourseUI0.isMinimumSizeSet();
        java.awt.Point point5 = createCourseUI0.getLocation();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(point5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test183");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        java.awt.LayoutManager layoutManager8 = createCourseUI0.getLayout();
        java.awt.Image image9 = null;
        createCourseUI0.setIconImage(image9);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(layoutManager8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test184");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.Component component2 = createCourseUI0.getGlassPane();
        java.awt.dnd.DropTarget dropTarget3 = null;
        createCourseUI0.setDropTarget(dropTarget3);
        assertNotNull(component2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test185");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowListener windowListener15 = null;
        createCourseUI1.addWindowListener(windowListener15);
        assertEquals("'" + str9 + "' != '" + "frame209" + "'", str9, "frame209");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test186");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy8 = createCourseUI0.getFocusTraversalPolicy();
        int int9 = createCourseUI0.getX();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(focusTraversalPolicy8);
        assertTrue(int9 == 433, "'" + int9 + "' != '" + 433 + "'");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test187");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = createCourseUI0.getBaselineResizeBehavior();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray10 = createCourseUI0.getHierarchyBoundsListeners();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER), "'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'");
        assertNotNull(hierarchyBoundsListenerArray10);
        assertArrayEquals(hierarchyBoundsListenerArray10, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test188");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        java.awt.MenuBar menuBar7 = null;
        createCourseUI0.setMenuBar(menuBar7);
        java.awt.Event event9 = null;
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Event event13 = null;
        boolean boolean16 = createCourseUI10.mouseUp(event13, (int) '#', 12);
        java.awt.Component component19 = createCourseUI10.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI10.show(true);
        boolean boolean22 = createCourseUI0.lostFocus(event9, (java.lang.Object) true);
        int int23 = createCourseUI0.getComponentCount();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(component19);
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(int23 == 1, "'" + int23 + "' != '" + 1 + "'");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test189");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI4.setName("");
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI7.setLocationRelativeTo((java.awt.Component) createCourseUI8);
        java.awt.Event event10 = null;
        boolean boolean13 = createCourseUI7.mouseUp(event10, (int) '#', 12);
        java.awt.Color color14 = createCourseUI7.getBackground();
        java.awt.LayoutManager layoutManager15 = createCourseUI7.getLayout();
        createCourseUI4.setLayout(layoutManager15);
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI17.setLocationRelativeTo((java.awt.Component) createCourseUI18);
        createCourseUI18.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str26 = createCourseUI18.getName();
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        createCourseUI27.setLocationRelativeTo((java.awt.Component) createCourseUI28);
        java.awt.Point point30 = createCourseUI28.getLocation();
        java.awt.Component component31 = createCourseUI18.getComponentAt(point30);
        createCourseUI4.setLocation(point30);
        java.awt.Rectangle rectangle33 = createCourseUI4.getBounds();
        java.awt.event.ContainerListener containerListener34 = null;
        createCourseUI4.addContainerListener(containerListener34);
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray37 = createCourseUI0.getWindowFocusListeners();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(color14);
        assertNotNull(layoutManager15);
        assertEquals("'" + str26 + "' != '" + "frame212" + "'", str26, "frame212");
        assertNotNull(point30);
        assertNotNull(component31);
        assertNotNull(rectangle33);
        assertNotNull(windowFocusListenerArray37);
        assertArrayEquals(windowFocusListenerArray37, new java.awt.event.WindowFocusListener[] {});
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test190");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str12 = createCourseUI4.getName();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        java.awt.Point point16 = createCourseUI14.getLocation();
        java.awt.Component component17 = createCourseUI4.getComponentAt(point16);
        java.awt.Component component18 = createCourseUI1.findComponentAt(point16);
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.list(printWriter19, 128);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str12 + "' != '" + "frame214" + "'", str12, "frame214");
        assertNotNull(point16);
        assertNotNull(component17);
        assertNull(component18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test191");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        java.awt.Component component4 = createCourseUI0.getMostRecentFocusOwner();
        java.awt.im.InputMethodRequests inputMethodRequests5 = createCourseUI0.getInputMethodRequests();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertNotNull(component4);
        assertNull(inputMethodRequests5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test192");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        java.awt.Window window5 = createCourseUI0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = window5.isFocused();
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNull(window5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test193");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = createCourseUI1.requestFocusInWindow(cause11);
        createCourseUI1.setAlwaysOnTop(false);
        java.awt.Rectangle rectangle15 = createCourseUI1.getMaximizedBounds();
        assertEquals("'" + str9 + "' != '" + "frame216" + "'", str9, "frame216");
        assertNotNull(dimension10);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNull(rectangle15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test194");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray14 = createCourseUI1.getWindowFocusListeners();
        java.awt.Image image15 = null;
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI18.setFocusableWindowState(false);
        float float21 = createCourseUI18.getOpacity();
        boolean boolean22 = createCourseUI1.prepareImage(image15, (int) '#', (int) (byte) 10, (java.awt.image.ImageObserver) createCourseUI18);
        java.awt.dnd.DropTarget dropTarget23 = createCourseUI18.getDropTarget();
        java.awt.Image image24 = null;
        boolean boolean30 = createCourseUI18.imageUpdate(image24, (int) 'a', (int) (byte) 10, (int) ' ', 0, 7);
        assertEquals("'" + str9 + "' != '" + "frame217" + "'", str9, "frame217");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray14);
        assertArrayEquals(windowFocusListenerArray14, new java.awt.event.WindowFocusListener[] {});
        assertTrue(float21 == 1.0f, "'" + float21 + "' != '" + 1.0f + "'");
        assertTrue(boolean22 == true, "'" + boolean22 + "' != '" + true + "'");
        assertNull(dropTarget23);
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test195");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        java.util.Locale locale4 = createCourseUI0.getLocale();
        boolean boolean5 = createCourseUI0.isOpaque();
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI0.mouseDown(event6, (int) (short) 100, (int) (short) 1);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(locale4);
        assertEquals(locale4.toString(), "en_US");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test196");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        java.awt.Event event15 = null;
        boolean boolean18 = component14.mouseDrag(event15, (int) (byte) 1, 0);
        assertEquals("'" + str9 + "' != '" + "frame218" + "'", str9, "frame218");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test197");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        int int2 = createCourseUI0.getWidth();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        createCourseUI0.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Rectangle rectangle5 = createCourseUI0.bounds();
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = createCourseUI0.requestFocusInWindow(cause6);
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame220,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame220,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(int2 == 500, "'" + int2 + "' != '" + 500 + "'");
        assertNotNull(rectangle5);
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test198");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.FocusTraversalPolicy focusTraversalPolicy2 = createCourseUI0.getFocusTraversalPolicy();
        java.awt.image.BufferStrategy bufferStrategy3 = createCourseUI0.getBufferStrategy();
        java.awt.ImageCapabilities imageCapabilities6 = null;
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage(2, 64, imageCapabilities6);
        assertNotNull(focusTraversalPolicy2);
        assertNull(bufferStrategy3);
        assertNull(volatileImage7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test199");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        boolean boolean7 = createCourseUI0.contains(5, 3);
        java.awt.Image image8 = createCourseUI0.getIconImage();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Event event13 = null;
        boolean boolean16 = createCourseUI10.mouseUp(event13, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar17 = createCourseUI10.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = createCourseUI10.getWindowStateListeners();
        createCourseUI10.setEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component21 = createCourseUI0.add("frame170", (java.awt.Component) createCourseUI10);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
        assertNull(image8);
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNull(jMenuBar17);
        assertNotNull(windowStateListenerArray18);
        assertArrayEquals(windowStateListenerArray18, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test200");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        java.awt.Point point14 = createCourseUI12.getLocation();
        java.awt.Component component15 = createCourseUI0.getComponentAt(point14);
        java.awt.event.WindowListener[] windowListenerArray16 = createCourseUI0.getWindowListeners();
        float float17 = createCourseUI0.getOpacity();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertNotNull(point14);
        assertNotNull(component15);
        assertNotNull(windowListenerArray16);
        assertArrayEquals(windowListenerArray16, new java.awt.event.WindowListener[] {});
        assertTrue(float17 == 1.0f, "'" + float17 + "' != '" + 1.0f + "'");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test201");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str12 = createCourseUI4.getName();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        java.awt.Point point16 = createCourseUI14.getLocation();
        java.awt.Component component17 = createCourseUI4.getComponentAt(point16);
        java.awt.Component component18 = createCourseUI1.findComponentAt(point16);
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI19.setName("");
        com.example.CreateCourseUI createCourseUI22 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        createCourseUI22.setLocationRelativeTo((java.awt.Component) createCourseUI23);
        java.awt.Event event25 = null;
        boolean boolean28 = createCourseUI22.mouseUp(event25, (int) '#', 12);
        java.awt.Color color29 = createCourseUI22.getBackground();
        java.awt.LayoutManager layoutManager30 = createCourseUI22.getLayout();
        createCourseUI19.setLayout(layoutManager30);
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI33 = new com.example.CreateCourseUI();
        createCourseUI32.setLocationRelativeTo((java.awt.Component) createCourseUI33);
        createCourseUI33.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str41 = createCourseUI33.getName();
        com.example.CreateCourseUI createCourseUI42 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI43 = new com.example.CreateCourseUI();
        createCourseUI42.setLocationRelativeTo((java.awt.Component) createCourseUI43);
        java.awt.Point point45 = createCourseUI43.getLocation();
        java.awt.Component component46 = createCourseUI33.getComponentAt(point45);
        createCourseUI19.setLocation(point45);
        java.awt.Rectangle rectangle48 = createCourseUI19.getBounds();
        java.awt.event.ContainerListener containerListener49 = null;
        createCourseUI19.addContainerListener(containerListener49);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component51 = createCourseUI1.add((java.awt.Component) createCourseUI19);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str12 + "' != '" + "frame225" + "'", str12, "frame225");
        assertNotNull(point16);
        assertNotNull(component17);
        assertNull(component18);
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(color29);
        assertNotNull(layoutManager30);
        assertEquals("'" + str41 + "' != '" + "frame226" + "'", str41, "frame226");
        assertNotNull(point45);
        assertNotNull(component46);
        assertNotNull(rectangle48);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test202");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        boolean boolean9 = createCourseUI1.isAlwaysOnTopSupported();
        java.awt.event.MouseListener mouseListener10 = null;
        createCourseUI1.removeMouseListener(mouseListener10);
        createCourseUI1.disable();
        assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test203");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        int int3 = createCourseUI1.getExtendedState();
        java.awt.Window window4 = createCourseUI1.getOwner();
        assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
        assertNull(window4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test204");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.hide();
        createCourseUI0.setFocusable(false);
        java.awt.ImageCapabilities imageCapabilities10 = null;
        java.awt.image.VolatileImage volatileImage11 = createCourseUI0.createVolatileImage((int) (byte) 0, 6, imageCapabilities10);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI12.setLocationRelativeTo((java.awt.Component) createCourseUI13);
        createCourseUI13.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str21 = createCourseUI13.getName();
        java.awt.Dimension dimension22 = createCourseUI13.minimumSize();
        java.awt.Point point24 = createCourseUI13.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        createCourseUI13.removeInputMethodListener(inputMethodListener25);
        boolean boolean27 = createCourseUI13.isMinimumSizeSet();
        createCourseUI13.enableInputMethods(false);
        javax.swing.JRootPane jRootPane30 = createCourseUI13.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.add((java.awt.Component) jRootPane30, (java.lang.Object) (byte) 1);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraint must be a string (or null)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNull(volatileImage11);
        assertEquals("'" + str21 + "' != '" + "frame231" + "'", str21, "frame231");
        assertNotNull(dimension22);
        assertNull(point24);
        assertTrue(boolean27 == false, "'" + boolean27 + "' != '" + false + "'");
        assertNotNull(jRootPane30);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test205");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = createCourseUI0.getBaselineResizeBehavior();
        createCourseUI0.toBack();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER), "'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test206");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        boolean boolean8 = createCourseUI0.isEnabled();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        createCourseUI9.setFocusableWindowState(false);
        float float12 = createCourseUI9.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = createCourseUI9.getHierarchyListeners();
        float float14 = createCourseUI9.getAlignmentY();
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = null;
        createCourseUI9.setModalExclusionType(modalExclusionType15);
        java.awt.Dimension dimension17 = createCourseUI9.getMinimumSize();
        createCourseUI0.setSize(dimension17);
        boolean boolean19 = createCourseUI0.isPreferredSizeSet();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
        assertTrue(float12 == 1.0f, "'" + float12 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray13);
        assertArrayEquals(hierarchyListenerArray13, new java.awt.event.HierarchyListener[] {});
        assertTrue(float14 == 0.5f, "'" + float14 + "' != '" + 0.5f + "'");
        assertNotNull(dimension17);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test207");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component11 = createCourseUI0.getComponent((int) (byte) -1);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test208");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        java.awt.Image image2 = null;
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        boolean boolean6 = createCourseUI3.isFontSet();
        java.awt.Insets insets7 = createCourseUI3.getInsets();
        java.awt.Event event8 = null;
        boolean boolean11 = createCourseUI3.mouseUp(event8, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle12 = createCourseUI3.getBounds();
        int int13 = createCourseUI0.checkImage(image2, (java.awt.image.ImageObserver) createCourseUI3);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = createCourseUI3.getComponent((int) (byte) 1);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame234,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame234,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(insets7);
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertNotNull(rectangle12);
        assertTrue(int13 == 32, "'" + int13 + "' != '" + 32 + "'");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test209");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.invalidate();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI5 = new com.example.CreateCourseUI();
        createCourseUI4.setLocationRelativeTo((java.awt.Component) createCourseUI5);
        java.awt.Event event7 = null;
        boolean boolean10 = createCourseUI4.mouseUp(event7, (int) '#', 12);
        java.awt.Rectangle rectangle11 = createCourseUI4.getMaximizedBounds();
        createCourseUI4.firePropertyChange("hi!", 0.5f, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component17 = createCourseUI1.add((java.awt.Component) createCourseUI4, 8);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNull(rectangle11);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test210");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        float float5 = createCourseUI0.getAlignmentY();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        createCourseUI0.setModalExclusionType(modalExclusionType6);
        createCourseUI0.list();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(float5 == 0.5f, "'" + float5 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test211");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        java.awt.event.WindowListener windowListener4 = null;
        createCourseUI0.removeWindowListener(windowListener4);
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        java.awt.Event event9 = null;
        boolean boolean12 = createCourseUI6.mouseUp(event9, (int) '#', 12);
        java.awt.Color color13 = createCourseUI6.getBackground();
        javax.accessibility.AccessibleContext accessibleContext14 = createCourseUI6.getAccessibleContext();
        createCourseUI6.transferFocusDownCycle();
        java.awt.Component component18 = createCourseUI6.getComponentAt((int) ' ', 4);
        java.awt.Image image19 = null;
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setFocusableWindowState(false);
        float float23 = createCourseUI20.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray24 = createCourseUI20.getHierarchyListeners();
        float float25 = createCourseUI20.getAlignmentY();
        boolean boolean26 = component18.prepareImage(image19, (java.awt.image.ImageObserver) createCourseUI20);
        java.awt.Point point27 = component18.getLocation();
        boolean boolean28 = createCourseUI0.contains(point27);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(color13);
        assertNotNull(accessibleContext14);
        assertNotNull(component18);
        assertTrue(float23 == 1.0f, "'" + float23 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray24);
        assertArrayEquals(hierarchyListenerArray24, new java.awt.event.HierarchyListener[] {});
        assertTrue(float25 == 0.5f, "'" + float25 + "' != '" + 0.5f + "'");
        assertTrue(boolean26 == true, "'" + boolean26 + "' != '" + true + "'");
        assertNotNull(point27);
        assertTrue(boolean28 == true, "'" + boolean28 + "' != '" + true + "'");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test212");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isAutoRequestFocus();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = createCourseUI0.getMouseMotionListeners();
        javax.swing.TransferHandler transferHandler7 = null;
        createCourseUI0.setTransferHandler(transferHandler7);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertNotNull(mouseMotionListenerArray6);
        assertArrayEquals(mouseMotionListenerArray6, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test213");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        createCourseUI14.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str22 = createCourseUI14.getName();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI14.getComponentAt(point26);
        createCourseUI0.setLocation(point26);
        java.awt.Rectangle rectangle29 = createCourseUI0.getBounds();
        java.awt.event.ContainerListener containerListener30 = null;
        createCourseUI0.addContainerListener(containerListener30);
        createCourseUI0.list();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertEquals("'" + str22 + "' != '" + "frame238" + "'", str22, "frame238");
        assertNotNull(point26);
        assertNotNull(component27);
        assertNotNull(rectangle29);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test214");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        float float8 = createCourseUI7.getAlignmentX();
        java.awt.Event event9 = null;
        boolean boolean11 = createCourseUI7.action(event9, (java.lang.Object) (byte) 1);
        createCourseUI7.setName("");
        java.awt.Dimension dimension14 = createCourseUI7.minimumSize();
        java.util.List<java.awt.Image> imageList15 = createCourseUI7.getIconImages();
        createCourseUI0.setIconImages(imageList15);
        boolean boolean17 = createCourseUI0.isResizable();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(float8 == 0.5f, "'" + float8 + "' != '" + 0.5f + "'");
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertNotNull(dimension14);
        assertNotNull(imageList15);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test215");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.event.FocusEvent.Cause cause5 = null;
        createCourseUI0.requestFocus(cause5);
        createCourseUI0.addNotify();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test216");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.MenuBar menuBar4 = createCourseUI0.getMenuBar();
        java.awt.Rectangle rectangle5 = createCourseUI0.bounds();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        float float7 = createCourseUI6.getAlignmentX();
        java.awt.Graphics graphics8 = null;
        createCourseUI6.paintComponents(graphics8);
        java.awt.Dimension dimension10 = createCourseUI6.getMinimumSize();
        java.awt.Color color11 = createCourseUI6.getBackground();
        createCourseUI0.setBackground(color11);
        boolean boolean13 = createCourseUI0.isCursorSet();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNull(menuBar4);
        assertNotNull(rectangle5);
        assertTrue(float7 == 0.5f, "'" + float7 + "' != '" + 0.5f + "'");
        assertNotNull(dimension10);
        assertNotNull(color11);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test217");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        boolean boolean5 = createCourseUI0.isResizable();
        boolean boolean6 = createCourseUI0.isEnabled();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test218");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setFocusableWindowState(false);
        float float23 = createCourseUI20.getOpacity();
        java.awt.Dimension dimension24 = createCourseUI20.getMaximumSize();
        createCourseUI9.setMaximumSize(dimension24);
        java.awt.event.WindowStateListener windowStateListener26 = null;
        createCourseUI9.addWindowStateListener(windowStateListener26);
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        boolean boolean29 = createCourseUI28.isForegroundSet();
        int int30 = createCourseUI28.getState();
        com.example.CreateCourseUI createCourseUI31 = new com.example.CreateCourseUI();
        float float32 = createCourseUI31.getAlignmentX();
        java.awt.Event event33 = null;
        boolean boolean35 = createCourseUI31.action(event33, (java.lang.Object) (byte) 1);
        boolean boolean36 = createCourseUI31.isFocusOwner();
        java.awt.Color color37 = createCourseUI31.getBackground();
        createCourseUI28.setBackground(color37);
        boolean boolean39 = createCourseUI28.isFocusTraversalPolicyProvider();
        com.example.CreateCourseUI createCourseUI40 = new com.example.CreateCourseUI();
        createCourseUI40.setName("");
        com.example.CreateCourseUI createCourseUI43 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI44 = new com.example.CreateCourseUI();
        createCourseUI43.setLocationRelativeTo((java.awt.Component) createCourseUI44);
        java.awt.Event event46 = null;
        boolean boolean49 = createCourseUI43.mouseUp(event46, (int) '#', 12);
        java.awt.Color color50 = createCourseUI43.getBackground();
        java.awt.LayoutManager layoutManager51 = createCourseUI43.getLayout();
        createCourseUI40.setLayout(layoutManager51);
        com.example.CreateCourseUI createCourseUI53 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI54 = new com.example.CreateCourseUI();
        createCourseUI53.setLocationRelativeTo((java.awt.Component) createCourseUI54);
        createCourseUI54.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str62 = createCourseUI54.getName();
        com.example.CreateCourseUI createCourseUI63 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI64 = new com.example.CreateCourseUI();
        createCourseUI63.setLocationRelativeTo((java.awt.Component) createCourseUI64);
        java.awt.Point point66 = createCourseUI64.getLocation();
        java.awt.Component component67 = createCourseUI54.getComponentAt(point66);
        createCourseUI40.setLocation(point66);
        java.awt.Rectangle rectangle69 = createCourseUI40.getBounds();
        java.awt.event.ContainerListener containerListener70 = null;
        createCourseUI40.addContainerListener(containerListener70);
        com.example.CreateCourseUI createCourseUI72 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI73 = new com.example.CreateCourseUI();
        createCourseUI72.setLocationRelativeTo((java.awt.Component) createCourseUI73);
        boolean boolean75 = createCourseUI72.isFontSet();
        java.awt.Insets insets76 = createCourseUI72.getInsets();
        java.awt.Event event77 = null;
        boolean boolean80 = createCourseUI72.mouseUp(event77, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle81 = createCourseUI72.getBounds();
        java.awt.Rectangle rectangle82 = createCourseUI40.getBounds(rectangle81);
        java.awt.Rectangle rectangle83 = createCourseUI28.getBounds(rectangle81);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI9.setShape((java.awt.Shape) rectangle81);
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(float23 == 1.0f, "'" + float23 + "' != '" + 1.0f + "'");
        assertNotNull(dimension24);
        assertTrue(boolean29 == false, "'" + boolean29 + "' != '" + false + "'");
        assertTrue(int30 == 0, "'" + int30 + "' != '" + 0 + "'");
        assertTrue(float32 == 0.5f, "'" + float32 + "' != '" + 0.5f + "'");
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
        assertTrue(boolean36 == false, "'" + boolean36 + "' != '" + false + "'");
        assertNotNull(color37);
        assertTrue(boolean39 == false, "'" + boolean39 + "' != '" + false + "'");
        assertTrue(boolean49 == false, "'" + boolean49 + "' != '" + false + "'");
        assertNotNull(color50);
        assertNotNull(layoutManager51);
        assertEquals("'" + str62 + "' != '" + "frame241" + "'", str62, "frame241");
        assertNotNull(point66);
        assertNotNull(component67);
        assertNotNull(rectangle69);
        assertTrue(boolean75 == false, "'" + boolean75 + "' != '" + false + "'");
        assertNotNull(insets76);
        assertTrue(boolean80 == false, "'" + boolean80 + "' != '" + false + "'");
        assertNotNull(rectangle81);
        assertNotNull(rectangle82);
        assertNotNull(rectangle83);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test219");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        int int8 = createCourseUI0.getCursorType();
        java.awt.event.InputMethodListener inputMethodListener9 = null;
        createCourseUI0.removeInputMethodListener(inputMethodListener9);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test220");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Rectangle rectangle7 = createCourseUI0.getMaximizedBounds();
        createCourseUI0.setEnabled(true);
        boolean boolean10 = createCourseUI0.isMaximumSizeSet();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(rectangle7);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test221");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.event.HierarchyListener hierarchyListener5 = null;
        createCourseUI0.removeHierarchyListener(hierarchyListener5);
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = createCourseUI0.getPropertyChangeListeners();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertNotNull(propertyChangeListenerArray9);
        assertArrayEquals(propertyChangeListenerArray9, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test222");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        float float15 = createCourseUI1.getAlignmentX();
        assertEquals("'" + str9 + "' != '" + "frame246" + "'", str9, "frame246");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertTrue(float15 == 0.5f, "'" + float15 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test223");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isAutoRequestFocus();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = createCourseUI0.getMouseMotionListeners();
        createCourseUI0.setFocusableWindowState(true);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertNotNull(mouseMotionListenerArray6);
        assertArrayEquals(mouseMotionListenerArray6, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test224");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        boolean boolean13 = createCourseUI12.isForegroundSet();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.keyUp(event14, (int) (byte) 0);
        java.awt.Toolkit toolkit17 = createCourseUI12.getToolkit();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI18.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        createCourseUI18.removeHierarchyBoundsListener(hierarchyBoundsListener20);
        createCourseUI18.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean26 = createCourseUI18.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray27 = createCourseUI18.getMouseListeners();
        java.awt.Dimension dimension28 = createCourseUI18.minimumSize();
        com.example.CreateCourseUI createCourseUI29 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI30 = new com.example.CreateCourseUI();
        createCourseUI29.setLocationRelativeTo((java.awt.Component) createCourseUI30);
        java.awt.Point point32 = createCourseUI30.getLocation();
        java.awt.Component component33 = createCourseUI18.getComponentAt(point32);
        java.awt.Event event34 = null;
        boolean boolean37 = createCourseUI18.mouseUp(event34, 11, 5);
        java.awt.Event event38 = null;
        boolean boolean40 = createCourseUI18.action(event38, (java.lang.Object) 11);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.add((java.awt.Component) createCourseUI12, (java.lang.Object) createCourseUI18, 3);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(toolkit17);
        assertTrue(boolean26 == false, "'" + boolean26 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray27);
        assertArrayEquals(mouseListenerArray27, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension28);
        assertNotNull(point32);
        assertNotNull(component33);
        assertTrue(boolean37 == false, "'" + boolean37 + "' != '" + false + "'");
        assertTrue(boolean40 == false, "'" + boolean40 + "' != '" + false + "'");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test225");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = createCourseUI0.isForegroundSet();
        createCourseUI0.toBack();
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI0.mouseEnter(event12, (int) '4', (int) (byte) 10);
        java.awt.event.MouseListener mouseListener16 = null;
        createCourseUI0.removeMouseListener(mouseListener16);
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        java.awt.Event event21 = null;
        boolean boolean24 = createCourseUI18.mouseUp(event21, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation25 = null;
        createCourseUI18.setComponentOrientation(componentOrientation25);
        java.awt.ImageCapabilities imageCapabilities29 = null;
        java.awt.image.VolatileImage volatileImage30 = createCourseUI18.createVolatileImage((int) ' ', 8, imageCapabilities29);
        javax.accessibility.AccessibleContext accessibleContext31 = createCourseUI18.getAccessibleContext();
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI33 = new com.example.CreateCourseUI();
        createCourseUI32.setLocationRelativeTo((java.awt.Component) createCourseUI33);
        createCourseUI33.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str41 = createCourseUI33.getName();
        java.lang.String str42 = createCourseUI33.getTitle();
        java.lang.String str43 = createCourseUI33.getWarningString();
        createCourseUI33.firePropertyChange("", (short) 10, (short) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.add((java.awt.Component) createCourseUI18, (java.lang.Object) "", (int) (short) -1);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNull(volatileImage30);
        assertNotNull(accessibleContext31);
        assertEquals("'" + str41 + "' != '" + "frame248" + "'", str41, "frame248");
        assertEquals("'" + str42 + "' != '" + "Create Course" + "'", str42, "Create Course");
        assertNull(str43);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test226");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        boolean boolean8 = createCourseUI0.isEnabled();
        createCourseUI0.list();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test227");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.ComponentListener componentListener14 = null;
        createCourseUI1.removeComponentListener(componentListener14);
        boolean boolean16 = createCourseUI1.isLightweight();
        boolean boolean17 = createCourseUI1.isFocusCycleRoot();
        createCourseUI1.transferFocus();
        assertEquals("'" + str9 + "' != '" + "frame251" + "'", str9, "frame251");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test228");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        createCourseUI0.setState(13);
        createCourseUI0.repaint((long) 8, (int) (byte) 1, (int) 'a', 100, (int) (short) 0);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test229");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        boolean boolean13 = createCourseUI1.isShowing();
        java.util.ResourceBundle resourceBundle14 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.applyResourceBundle(resourceBundle14);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame252" + "'", str9, "frame252");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test230");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        java.awt.MenuBar menuBar7 = null;
        createCourseUI0.setMenuBar(menuBar7);
        java.awt.event.InputMethodListener inputMethodListener9 = null;
        createCourseUI0.removeInputMethodListener(inputMethodListener9);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test231");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        int int9 = createCourseUI0.getX();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertTrue(int9 == 433, "'" + int9 + "' != '" + 433 + "'");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test232");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.show(true);
        java.awt.Component component12 = createCourseUI0.getGlassPane();
        javax.swing.JLayeredPane jLayeredPane13 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setLayeredPane(jLayeredPane13);
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertNotNull(component12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test233");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Image[] imageArray14 = new java.awt.Image[] {};
        java.util.ArrayList<java.awt.Image> imageList15 = new java.util.ArrayList<java.awt.Image>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.awt.Image>) imageList15, imageArray14);
        createCourseUI1.setIconImages((java.util.List<java.awt.Image>) imageList15);
        assertEquals("'" + str9 + "' != '" + "frame260" + "'", str9, "frame260");
        assertNotNull(dimension10);
        assertNotNull(imageArray14);
        assertArrayEquals(imageArray14, new java.awt.Image[] {});
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test234");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.MenuBar menuBar4 = createCourseUI0.getMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = createCourseUI0.areFocusTraversalKeysSet(32);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNull(menuBar4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test235");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        createCourseUI1.transferFocus();
        boolean boolean8 = createCourseUI1.isFocusableWindow();
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test236");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        createCourseUI14.setLocationRelativeTo((java.awt.Component) createCourseUI15);
        createCourseUI15.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str23 = createCourseUI15.getName();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        createCourseUI24.setLocationRelativeTo((java.awt.Component) createCourseUI25);
        java.awt.Point point27 = createCourseUI25.getLocation();
        java.awt.Component component28 = createCourseUI15.getComponentAt(point27);
        java.awt.Component component29 = createCourseUI12.findComponentAt(point27);
        java.awt.Component component30 = createCourseUI1.getComponentAt(point27);
        java.awt.GraphicsConfiguration graphicsConfiguration31 = createCourseUI1.getGraphicsConfiguration();
        createCourseUI1.setName("frame25");
        assertEquals("'" + str9 + "' != '" + "frame261" + "'", str9, "frame261");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertEquals("'" + str23 + "' != '" + "frame262" + "'", str23, "frame262");
        assertNotNull(point27);
        assertNotNull(component28);
        assertNull(component29);
        assertNotNull(component30);
        assertNotNull(graphicsConfiguration31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test237");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray5 = createCourseUI0.getWindowFocusListeners();
        java.awt.event.FocusListener focusListener6 = null;
        createCourseUI0.addFocusListener(focusListener6);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
        assertNotNull(windowFocusListenerArray5);
        assertArrayEquals(windowFocusListenerArray5, new java.awt.event.WindowFocusListener[] {});
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test238");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.awt.event.WindowListener windowListener7 = null;
        createCourseUI0.removeWindowListener(windowListener7);
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.list(printStream9);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test239");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        java.awt.Graphics graphics3 = null;
        createCourseUI0.paintComponents(graphics3);
        java.awt.Image image5 = createCourseUI0.getIconImage();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertNull(image5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test240");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isFocused();
        boolean boolean2 = createCourseUI0.isPreferredSizeSet();
        java.awt.Color color3 = createCourseUI0.getForeground();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNull(color3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test241");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        createCourseUI1.addHierarchyListener(hierarchyListener16);
        createCourseUI1.validate();
        assertEquals("'" + str9 + "' != '" + "frame263" + "'", str9, "frame263");
        assertNotNull(dimension10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test242");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage(16, 100);
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        boolean boolean9 = createCourseUI8.isForegroundSet();
        boolean boolean10 = createCourseUI8.isValid();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        createCourseUI12.setAlwaysOnTop(false);
        int int16 = createCourseUI8.getComponentZOrder((java.awt.Component) createCourseUI12);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = createCourseUI8.getPropertyChangeListeners("frame48");
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI19.setLocationRelativeTo((java.awt.Component) createCourseUI20);
        createCourseUI20.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str28 = createCourseUI20.getName();
        java.awt.Dimension dimension29 = createCourseUI20.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener30 = null;
        createCourseUI20.removeWindowFocusListener(windowFocusListener30);
        createCourseUI20.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType33 = null;
        createCourseUI20.setModalExclusionType(modalExclusionType33);
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        createCourseUI20.removeInputMethodListener(inputMethodListener35);
        java.awt.LayoutManager layoutManager37 = createCourseUI20.getLayout();
        createCourseUI8.setLayout(layoutManager37);
        createCourseUI0.setLayout(layoutManager37);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(int16 == (-1), "'" + int16 + "' != '" + (-1) + "'");
        assertNotNull(propertyChangeListenerArray18);
        assertArrayEquals(propertyChangeListenerArray18, new java.beans.PropertyChangeListener[] {});
        assertEquals("'" + str28 + "' != '" + "frame266" + "'", str28, "frame266");
        assertNotNull(dimension29);
        assertNotNull(layoutManager37);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test243");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        createCourseUI1.addInputMethodListener(inputMethodListener3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test244");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        boolean boolean4 = createCourseUI0.getIgnoreRepaint();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test245");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.event.MouseMotionListener mouseMotionListener6 = null;
        createCourseUI0.addMouseMotionListener(mouseMotionListener6);
        java.awt.MenuBar menuBar8 = null;
        createCourseUI0.setMenuBar(menuBar8);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test246");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        int int6 = createCourseUI0.getExtendedState();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(int6 == 0, "'" + int6 + "' != '" + 0 + "'");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test247");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        boolean boolean13 = createCourseUI1.isFocusOwner();
        assertEquals("'" + str9 + "' != '" + "frame269" + "'", str9, "frame269");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test248");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        boolean boolean8 = createCourseUI0.isEnabled();
        java.awt.Graphics graphics9 = createCourseUI0.getGraphics();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
        assertNull(graphics9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test249");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.Component component2 = createCourseUI0.getGlassPane();
        java.awt.event.WindowListener[] windowListenerArray3 = createCourseUI0.getWindowListeners();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        createCourseUI0.addPropertyChangeListener("frame145", propertyChangeListener5);
        createCourseUI0.doLayout();
        assertNotNull(component2);
        assertNotNull(windowListenerArray3);
        assertArrayEquals(windowListenerArray3, new java.awt.event.WindowListener[] {});
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test250");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        boolean boolean10 = createCourseUI0.isDisplayable();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point11 = createCourseUI0.getLocationOnScreen();
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test251");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        java.awt.Component component4 = createCourseUI0.getMostRecentFocusOwner();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point5 = component4.getLocationOnScreen();
            fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertNotNull(component4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test252");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.Color color5 = createCourseUI0.getBackground();
        createCourseUI0.setAutoRequestFocus(true);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNotNull(color5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test253");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Dimension dimension7 = createCourseUI0.minimumSize();
        createCourseUI0.firePropertyChange("frame66", 'a', 'a');
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(dimension7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test254");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Graphics graphics7 = null;
        createCourseUI0.paintComponents(graphics7);
        java.awt.Graphics graphics9 = null;
        createCourseUI0.printAll(graphics9);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test255");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        createCourseUI0.firePropertyChange("frame66", (byte) 0, (byte) 10);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test256");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Graphics graphics14 = null;
        createCourseUI1.update(graphics14);
        assertEquals("'" + str9 + "' != '" + "frame276" + "'", str9, "frame276");
        assertNotNull(dimension10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test257");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        com.example.CreateCourseUI createCourseUI5 = new com.example.CreateCourseUI();
        createCourseUI5.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        createCourseUI5.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        createCourseUI5.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean13 = createCourseUI5.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray14 = createCourseUI5.getMouseListeners();
        java.awt.Dimension dimension15 = createCourseUI5.minimumSize();
        createCourseUI0.resize(dimension15);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray14);
        assertArrayEquals(mouseListenerArray14, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension15);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test258");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        java.awt.Image image13 = null;
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI14.setFocusableWindowState(false);
        float float17 = createCourseUI14.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray18 = createCourseUI14.getHierarchyListeners();
        float float19 = createCourseUI14.getAlignmentY();
        boolean boolean20 = component12.prepareImage(image13, (java.awt.image.ImageObserver) createCourseUI14);
        java.awt.Point point21 = component12.getLocation();
        java.awt.Dimension dimension22 = component12.getSize();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
        assertTrue(float17 == 1.0f, "'" + float17 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray18);
        assertArrayEquals(hierarchyListenerArray18, new java.awt.event.HierarchyListener[] {});
        assertTrue(float19 == 0.5f, "'" + float19 + "' != '" + 0.5f + "'");
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertNotNull(point21);
        assertNotNull(dimension22);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test259");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        createCourseUI0.enable(false);
        createCourseUI0.toBack();
        java.awt.event.ContainerListener containerListener11 = null;
        createCourseUI0.addContainerListener(containerListener11);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test260");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        createCourseUI0.setResizable(true);
        boolean boolean12 = createCourseUI0.isLocationByPlatform();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test261");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        createCourseUI3.setFocusableWindowState(false);
        java.awt.Point point6 = createCourseUI3.getLocation();
        java.awt.Component component7 = createCourseUI1.findComponentAt(point6);
        assertNotNull(point6);
        assertNull(component7);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test262");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        createCourseUI0.setFocusCycleRoot(false);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test263");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.lang.String str7 = createCourseUI0.toString();
        createCourseUI0.firePropertyChange("frame98", ' ', 'a');
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = createCourseUI0.getFocusTraversalPolicy();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertEquals("'" + str7 + "' != '" + "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(focusTraversalPolicy12);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test264");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        java.util.Locale locale4 = createCourseUI0.getLocale();
        boolean boolean5 = createCourseUI0.isOpaque();
        createCourseUI0.invalidate();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI7.setName("");
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Event event13 = null;
        boolean boolean16 = createCourseUI10.mouseUp(event13, (int) '#', 12);
        java.awt.Color color17 = createCourseUI10.getBackground();
        java.awt.LayoutManager layoutManager18 = createCourseUI10.getLayout();
        createCourseUI7.setLayout(layoutManager18);
        createCourseUI0.setLayout(layoutManager18);
        java.awt.event.MouseMotionListener mouseMotionListener21 = null;
        createCourseUI0.addMouseMotionListener(mouseMotionListener21);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(locale4);
        assertEquals(locale4.toString(), "en_US");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(color17);
        assertNotNull(layoutManager18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test265");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setFocusableWindowState(false);
        float float23 = createCourseUI20.getOpacity();
        java.awt.Dimension dimension24 = createCourseUI20.getMaximumSize();
        createCourseUI9.setMaximumSize(dimension24);
        java.awt.event.WindowStateListener windowStateListener26 = null;
        createCourseUI9.addWindowStateListener(windowStateListener26);
        createCourseUI9.setLocationByPlatform(false);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(float23 == 1.0f, "'" + float23 + "' != '" + 1.0f + "'");
        assertNotNull(dimension24);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test266");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        boolean boolean5 = createCourseUI0.isResizable();
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI0.mouseUp(event6, 13, 4);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test267");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        java.awt.event.MouseListener mouseListener9 = null;
        createCourseUI0.addMouseListener(mouseListener9);
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        createCourseUI0.addInputMethodListener(inputMethodListener11);
        java.awt.event.WindowFocusListener windowFocusListener13 = null;
        createCourseUI0.addWindowFocusListener(windowFocusListener13);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test268");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        int int8 = createCourseUI0.getCursorType();
        java.awt.BufferCapabilities bufferCapabilities10 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.createBufferStrategy((int) (byte) 1, bufferCapabilities10);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test269");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        javax.swing.JMenuBar jMenuBar3 = createCourseUI0.getJMenuBar();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertNull(jMenuBar3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test270");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Point point13 = createCourseUI11.getLocation();
        java.awt.Component component14 = createCourseUI1.getComponentAt(point13);
        boolean boolean15 = createCourseUI1.isResizable();
        boolean boolean16 = createCourseUI1.isMinimumSizeSet();
        java.awt.Shape shape17 = createCourseUI1.getShape();
        assertEquals("'" + str9 + "' != '" + "frame283" + "'", str9, "frame283");
        assertNotNull(point13);
        assertNotNull(component14);
        assertTrue(boolean15 == true, "'" + boolean15 + "' != '" + true + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNull(shape17);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test271");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.lang.String str7 = createCourseUI0.toString();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        createCourseUI0.removePropertyChangeListener(propertyChangeListener8);
        java.awt.image.ColorModel colorModel10 = createCourseUI0.getColorModel();
        java.awt.Image image11 = null;
        createCourseUI0.setIconImage(image11);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertEquals("'" + str7 + "' != '" + "com.example.CreateCourseUI[frame284,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "com.example.CreateCourseUI[frame284,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(colorModel10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test272");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        java.awt.Graphics graphics6 = null;
        createCourseUI0.paintComponents(graphics6);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.list(printWriter8, 184);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test273");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Font font10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics11 = createCourseUI0.getFontMetrics(font10);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test274");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray14 = createCourseUI1.getWindowFocusListeners();
        java.awt.Image image15 = null;
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI18.setFocusableWindowState(false);
        float float21 = createCourseUI18.getOpacity();
        boolean boolean22 = createCourseUI1.prepareImage(image15, (int) '#', (int) (byte) 10, (java.awt.image.ImageObserver) createCourseUI18);
        java.awt.dnd.DropTarget dropTarget23 = createCourseUI18.getDropTarget();
        int int24 = createCourseUI18.getY();
        assertEquals("'" + str9 + "' != '" + "frame288" + "'", str9, "frame288");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray14);
        assertArrayEquals(windowFocusListenerArray14, new java.awt.event.WindowFocusListener[] {});
        assertTrue(float21 == 1.0f, "'" + float21 + "' != '" + 1.0f + "'");
        assertTrue(boolean22 == true, "'" + boolean22 + "' != '" + true + "'");
        assertNull(dropTarget23);
        assertTrue(int24 == 160, "'" + int24 + "' != '" + 160 + "'");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test275");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        createCourseUI0.resize(0, 10);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test276");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        int int2 = createCourseUI0.getState();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        float float4 = createCourseUI3.getAlignmentX();
        java.awt.Event event5 = null;
        boolean boolean7 = createCourseUI3.action(event5, (java.lang.Object) (byte) 1);
        boolean boolean8 = createCourseUI3.isFocusOwner();
        java.awt.Color color9 = createCourseUI3.getBackground();
        createCourseUI0.setBackground(color9);
        boolean boolean11 = createCourseUI0.isFocusTraversalPolicyProvider();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI12.setName("");
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        createCourseUI15.setLocationRelativeTo((java.awt.Component) createCourseUI16);
        java.awt.Event event18 = null;
        boolean boolean21 = createCourseUI15.mouseUp(event18, (int) '#', 12);
        java.awt.Color color22 = createCourseUI15.getBackground();
        java.awt.LayoutManager layoutManager23 = createCourseUI15.getLayout();
        createCourseUI12.setLayout(layoutManager23);
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI26 = new com.example.CreateCourseUI();
        createCourseUI25.setLocationRelativeTo((java.awt.Component) createCourseUI26);
        createCourseUI26.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str34 = createCourseUI26.getName();
        com.example.CreateCourseUI createCourseUI35 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI36 = new com.example.CreateCourseUI();
        createCourseUI35.setLocationRelativeTo((java.awt.Component) createCourseUI36);
        java.awt.Point point38 = createCourseUI36.getLocation();
        java.awt.Component component39 = createCourseUI26.getComponentAt(point38);
        createCourseUI12.setLocation(point38);
        java.awt.Rectangle rectangle41 = createCourseUI12.getBounds();
        java.awt.event.ContainerListener containerListener42 = null;
        createCourseUI12.addContainerListener(containerListener42);
        com.example.CreateCourseUI createCourseUI44 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI45 = new com.example.CreateCourseUI();
        createCourseUI44.setLocationRelativeTo((java.awt.Component) createCourseUI45);
        boolean boolean47 = createCourseUI44.isFontSet();
        java.awt.Insets insets48 = createCourseUI44.getInsets();
        java.awt.Event event49 = null;
        boolean boolean52 = createCourseUI44.mouseUp(event49, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle53 = createCourseUI44.getBounds();
        java.awt.Rectangle rectangle54 = createCourseUI12.getBounds(rectangle53);
        java.awt.Rectangle rectangle55 = createCourseUI0.getBounds(rectangle53);
        createCourseUI0.disable();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        assertTrue(float4 == 0.5f, "'" + float4 + "' != '" + 0.5f + "'");
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(color9);
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
        assertNotNull(color22);
        assertNotNull(layoutManager23);
        assertEquals("'" + str34 + "' != '" + "frame289" + "'", str34, "frame289");
        assertNotNull(point38);
        assertNotNull(component39);
        assertNotNull(rectangle41);
        assertTrue(boolean47 == false, "'" + boolean47 + "' != '" + false + "'");
        assertNotNull(insets48);
        assertTrue(boolean52 == false, "'" + boolean52 + "' != '" + false + "'");
        assertNotNull(rectangle53);
        assertNotNull(rectangle54);
        assertNotNull(rectangle55);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test277");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        createCourseUI0.layout();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test278");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        createCourseUI0.setEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.setDefaultCloseOperation((int) '4');
            fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test279");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        createCourseUI1.firePropertyChange("frame23", (short) 1, (short) (byte) -1);
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        boolean boolean9 = createCourseUI8.isForegroundSet();
        createCourseUI8.setFocusable(false);
        java.util.Locale locale12 = createCourseUI8.getLocale();
        boolean boolean13 = createCourseUI8.isOpaque();
        createCourseUI8.invalidate();
        boolean boolean15 = createCourseUI1.isAncestorOf((java.awt.Component) createCourseUI8);
        createCourseUI1.pack();
        assertNotNull(point3);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(locale12);
        assertEquals(locale12.toString(), "en_US");
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test280");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Point point13 = createCourseUI11.getLocation();
        java.awt.Component component14 = createCourseUI1.getComponentAt(point13);
        java.awt.ComponentOrientation componentOrientation15 = null;
        createCourseUI1.setComponentOrientation(componentOrientation15);
        assertEquals("'" + str9 + "' != '" + "frame292" + "'", str9, "frame292");
        assertNotNull(point13);
        assertNotNull(component14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test281");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.ComponentListener componentListener14 = null;
        createCourseUI1.removeComponentListener(componentListener14);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.setCursor(433);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame293" + "'", str9, "frame293");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test282");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.lang.String str7 = createCourseUI0.toString();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        createCourseUI0.removePropertyChangeListener(propertyChangeListener8);
        java.awt.im.InputMethodRequests inputMethodRequests10 = createCourseUI0.getInputMethodRequests();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertEquals("'" + str7 + "' != '" + "com.example.CreateCourseUI[frame294,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "com.example.CreateCourseUI[frame294,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNull(inputMethodRequests10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test283");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.createBufferStrategy(160);
            fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test284");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.show(true);
        java.awt.Component component12 = createCourseUI0.getGlassPane();
        component12.list();
        component12.firePropertyChange("frame266", (long) 13, (long) 32);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertNotNull(component12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test285");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        int int5 = createCourseUI0.getHeight();
        createCourseUI0.setAlwaysOnTop(true);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(int5 == 400, "'" + int5 + "' != '" + 400 + "'");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test286");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.pack();
        java.awt.Insets insets11 = createCourseUI0.insets();
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        createCourseUI0.removeHierarchyListener(hierarchyListener12);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertNotNull(insets11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test287");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        createCourseUI0.move(7, 7);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.createBufferStrategy((int) (byte) -1);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test288");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        createCourseUI0.setSize((-1), (int) (byte) -1);
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        createCourseUI0.removeInputMethodListener(inputMethodListener5);
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame299,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame299,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test289");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Point point13 = createCourseUI11.getLocation();
        java.awt.Component component14 = createCourseUI1.getComponentAt(point13);
        boolean boolean15 = createCourseUI1.isResizable();
        boolean boolean16 = createCourseUI1.hasFocus();
        assertEquals("'" + str9 + "' != '" + "frame302" + "'", str9, "frame302");
        assertNotNull(point13);
        assertNotNull(component14);
        assertTrue(boolean15 == true, "'" + boolean15 + "' != '" + true + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test290");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isFocused();
        java.awt.Insets insets2 = createCourseUI0.getInsets();
        boolean boolean3 = createCourseUI0.hasFocus();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(insets2);
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test291");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        boolean boolean18 = createCourseUI1.getFocusableWindowState();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        createCourseUI1.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.io.PrintStream printStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.list(printStream21);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame303" + "'", str9, "frame303");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertTrue(boolean18 == true, "'" + boolean18 + "' != '" + true + "'");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test292");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        java.awt.im.InputContext inputContext11 = createCourseUI0.getInputContext();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        boolean boolean13 = createCourseUI12.isForegroundSet();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.keyUp(event14, (int) (byte) 0);
        java.awt.Toolkit toolkit17 = createCourseUI12.getToolkit();
        java.awt.Image image18 = null;
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI22 = new com.example.CreateCourseUI();
        createCourseUI21.setLocationRelativeTo((java.awt.Component) createCourseUI22);
        java.awt.Event event24 = null;
        boolean boolean27 = createCourseUI21.mouseUp(event24, (int) '#', 12);
        java.awt.Component component30 = createCourseUI21.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int31 = createCourseUI12.checkImage(image18, 0, (-1), (java.awt.image.ImageObserver) createCourseUI21);
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        createCourseUI32.setFocusableWindowState(false);
        float float35 = createCourseUI32.getOpacity();
        java.awt.Dimension dimension36 = createCourseUI32.getMaximumSize();
        createCourseUI21.setMaximumSize(dimension36);
        createCourseUI0.resize(dimension36);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
        assertNotNull(inputContext11);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(toolkit17);
        assertTrue(boolean27 == false, "'" + boolean27 + "' != '" + false + "'");
        assertNotNull(component30);
        assertTrue(int31 == 32, "'" + int31 + "' != '" + 32 + "'");
        assertTrue(float35 == 1.0f, "'" + float35 + "' != '" + 1.0f + "'");
        assertNotNull(dimension36);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test293");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        java.awt.Toolkit toolkit3 = createCourseUI0.getToolkit();
        java.util.List<java.awt.Image> imageList4 = createCourseUI0.getIconImages();
        java.awt.event.MouseListener[] mouseListenerArray5 = createCourseUI0.getMouseListeners();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        boolean boolean7 = createCourseUI6.isForegroundSet();
        java.awt.Event event8 = null;
        boolean boolean10 = createCourseUI6.keyUp(event8, (int) (byte) 0);
        java.awt.Toolkit toolkit11 = createCourseUI6.getToolkit();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI12.setLocationRelativeTo((java.awt.Component) createCourseUI13);
        createCourseUI13.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str21 = createCourseUI13.getName();
        java.awt.Dimension dimension22 = createCourseUI13.minimumSize();
        createCourseUI6.setMaximumSize(dimension22);
        createCourseUI0.setSize(dimension22);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(toolkit3);
        assertNotNull(imageList4);
        assertNotNull(mouseListenerArray5);
        assertArrayEquals(mouseListenerArray5, new java.awt.event.MouseListener[] {});
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(toolkit11);
        assertEquals("'" + str21 + "' != '" + "frame304" + "'", str21, "frame304");
        assertNotNull(dimension22);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test294");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setCursor(1);
        java.awt.Component component13 = null;
        int int14 = createCourseUI1.getComponentZOrder(component13);
        assertEquals("'" + str9 + "' != '" + "frame305" + "'", str9, "frame305");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertTrue(int14 == (-1), "'" + int14 + "' != '" + (-1) + "'");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test295");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        java.awt.Event event11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = createCourseUI0.handleEvent(event11);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test296");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Event event10 = null;
        boolean boolean13 = createCourseUI1.mouseMove(event10, 13, (int) (byte) -1);
        assertEquals("'" + str9 + "' != '" + "frame307" + "'", str9, "frame307");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test297");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setFocusableWindowState(false);
        float float23 = createCourseUI20.getOpacity();
        java.awt.Dimension dimension24 = createCourseUI20.getMaximumSize();
        createCourseUI9.setMaximumSize(dimension24);
        int int26 = createCourseUI9.countComponents();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(float23 == 1.0f, "'" + float23 + "' != '" + 1.0f + "'");
        assertNotNull(dimension24);
        assertTrue(int26 == 1, "'" + int26 + "' != '" + 1 + "'");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test298");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        createCourseUI1.removeMouseWheelListener(mouseWheelListener14);
        assertEquals("'" + str9 + "' != '" + "frame311" + "'", str9, "frame311");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test299");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        boolean boolean13 = createCourseUI1.isShowing();
        java.awt.Point point15 = createCourseUI1.getMousePosition(false);
        int int16 = createCourseUI1.countComponents();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI17.setLocationRelativeTo((java.awt.Component) createCourseUI18);
        java.awt.Event event20 = null;
        boolean boolean23 = createCourseUI17.mouseUp(event20, (int) '#', 12);
        java.awt.Color color24 = createCourseUI17.getBackground();
        javax.accessibility.AccessibleContext accessibleContext25 = createCourseUI17.getAccessibleContext();
        createCourseUI17.transferFocusDownCycle();
        java.awt.Component component29 = createCourseUI17.getComponentAt((int) ' ', 4);
        java.awt.Dimension dimension30 = component29.getSize();
        com.example.CreateCourseUI createCourseUI31 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        createCourseUI31.setLocationRelativeTo((java.awt.Component) createCourseUI32);
        createCourseUI32.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str40 = createCourseUI32.getName();
        java.awt.Dimension dimension41 = createCourseUI32.minimumSize();
        java.awt.Event event42 = null;
        boolean boolean44 = createCourseUI32.gotFocus(event42, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray45 = createCourseUI32.getWindowFocusListeners();
        java.awt.event.ContainerListener containerListener46 = null;
        createCourseUI32.addContainerListener(containerListener46);
        java.awt.Component component50 = createCourseUI32.getComponentAt((int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.add(component29, (java.lang.Object) component50, 433);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame312" + "'", str9, "frame312");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNull(point15);
        assertTrue(int16 == 1, "'" + int16 + "' != '" + 1 + "'");
        assertTrue(boolean23 == false, "'" + boolean23 + "' != '" + false + "'");
        assertNotNull(color24);
        assertNotNull(accessibleContext25);
        assertNotNull(component29);
        assertNotNull(dimension30);
        assertEquals("'" + str40 + "' != '" + "frame313" + "'", str40, "frame313");
        assertNotNull(dimension41);
        assertTrue(boolean44 == false, "'" + boolean44 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray45);
        assertArrayEquals(windowFocusListenerArray45, new java.awt.event.WindowFocusListener[] {});
        assertNotNull(component50);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test300");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        createCourseUI0.disable();
        createCourseUI0.setSize(160, 10);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test301");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        createCourseUI0.firePropertyChange("frame64", '#', '4');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray12 = createCourseUI0.getHierarchyBoundsListeners();
        java.awt.LayoutManager layoutManager13 = createCourseUI0.getLayout();
        assertNotNull(hierarchyBoundsListenerArray12);
        assertArrayEquals(hierarchyBoundsListenerArray12, new java.awt.event.HierarchyBoundsListener[] {});
        assertNotNull(layoutManager13);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test302");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.ComponentListener componentListener14 = null;
        createCourseUI1.removeComponentListener(componentListener14);
        boolean boolean16 = createCourseUI1.isLightweight();
        boolean boolean17 = createCourseUI1.isFocusCycleRoot();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray18 = createCourseUI1.getWindowFocusListeners();
        assertEquals("'" + str9 + "' != '" + "frame315" + "'", str9, "frame315");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertNotNull(windowFocusListenerArray18);
        assertArrayEquals(windowFocusListenerArray18, new java.awt.event.WindowFocusListener[] {});
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test303");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        createCourseUI0.validate();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test304");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        boolean boolean10 = createCourseUI0.isDisplayable();
        java.awt.MenuBar menuBar11 = null;
        createCourseUI0.setMenuBar(menuBar11);
        java.awt.Graphics graphics13 = createCourseUI0.getGraphics();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNull(graphics13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test305");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        java.awt.event.MouseListener mouseListener3 = null;
        createCourseUI0.removeMouseListener(mouseListener3);
        float float5 = createCourseUI0.getAlignmentX();
        createCourseUI0.setSize(128, 5);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(float5 == 0.5f, "'" + float5 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test306");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.Dimension dimension9 = createCourseUI0.getMaximumSize();
        java.awt.Event event10 = null;
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        boolean boolean12 = createCourseUI11.isForegroundSet();
        java.awt.Component[] componentArray13 = createCourseUI11.getComponents();
        boolean boolean14 = createCourseUI0.action(event10, (java.lang.Object) createCourseUI11);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(dimension9);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(componentArray13);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test307");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        createCourseUI1.transferFocus();
        java.awt.Dimension dimension8 = createCourseUI1.preferredSize();
        assertNotNull(dimension8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test308");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        boolean boolean17 = createCourseUI1.contains((int) 'a', (int) (short) 0);
        java.util.List<java.awt.Image> imageList18 = createCourseUI1.getIconImages();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.createBufferStrategy(100);
            fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame318" + "'", str9, "frame318");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertNotNull(imageList18);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test309");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        java.awt.MenuBar menuBar7 = null;
        createCourseUI0.setMenuBar(menuBar7);
        java.awt.Container container9 = createCourseUI0.getParent();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
        assertNull(container9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test310");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        java.awt.Point point4 = createCourseUI1.location();
        java.awt.dnd.DropTarget dropTarget5 = null;
        createCourseUI1.setDropTarget(dropTarget5);
        assertNotNull(point3);
        assertNotNull(point4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test311");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isFocused();
        createCourseUI0.setFocusable(true);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test312");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        java.awt.Window window5 = createCourseUI0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.ComponentOrientation componentOrientation6 = window5.getComponentOrientation();
            fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNull(window5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test313");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy8 = createCourseUI0.getFocusTraversalPolicy();
        java.awt.Image image9 = null;
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        createCourseUI12.transferFocus();
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        createCourseUI15.setLocationRelativeTo((java.awt.Component) createCourseUI16);
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str27 = createCourseUI19.getName();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI29 = new com.example.CreateCourseUI();
        createCourseUI28.setLocationRelativeTo((java.awt.Component) createCourseUI29);
        java.awt.Point point31 = createCourseUI29.getLocation();
        java.awt.Component component32 = createCourseUI19.getComponentAt(point31);
        java.awt.Component component33 = createCourseUI16.findComponentAt(point31);
        createCourseUI12.setLocation(point31);
        int int35 = createCourseUI0.checkImage(image9, 128, 7, (java.awt.image.ImageObserver) createCourseUI12);
        java.awt.event.HierarchyListener[] hierarchyListenerArray36 = createCourseUI0.getHierarchyListeners();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(focusTraversalPolicy8);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertEquals("'" + str27 + "' != '" + "frame320" + "'", str27, "frame320");
        assertNotNull(point31);
        assertNotNull(component32);
        assertNull(component33);
        assertTrue(int35 == 32, "'" + int35 + "' != '" + 32 + "'");
        assertNotNull(hierarchyListenerArray36);
        assertArrayEquals(hierarchyListenerArray36, new java.awt.event.HierarchyListener[] {});
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test314");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.setAlwaysOnTop(false);
        int int8 = createCourseUI0.getComponentZOrder((java.awt.Component) createCourseUI4);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = createCourseUI4.getHierarchyBoundsListeners();
        createCourseUI4.hide();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = createCourseUI4.getPropertyChangeListeners();
        java.awt.event.WindowListener windowListener12 = null;
        createCourseUI4.removeWindowListener(windowListener12);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(int8 == (-1), "'" + int8 + "' != '" + (-1) + "'");
        assertNotNull(hierarchyBoundsListenerArray9);
        assertArrayEquals(hierarchyBoundsListenerArray9, new java.awt.event.HierarchyBoundsListener[] {});
        assertNotNull(propertyChangeListenerArray11);
        assertArrayEquals(propertyChangeListenerArray11, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test315");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        java.awt.Component component4 = createCourseUI0.getMostRecentFocusOwner();
        component4.repaint((long) (short) -1);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertNotNull(component4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test316");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        boolean boolean20 = createCourseUI0.isAlwaysOnTopSupported();
        int int23 = createCourseUI0.getBaseline((int) (byte) 1, 16);
        java.awt.Event event24 = null;
        boolean boolean27 = createCourseUI0.mouseDrag(event24, (int) 'a', 8);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertTrue(int23 == (-1), "'" + int23 + "' != '" + (-1) + "'");
        assertTrue(boolean27 == false, "'" + boolean27 + "' != '" + false + "'");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test317");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.ComponentListener componentListener14 = null;
        createCourseUI1.removeComponentListener(componentListener14);
        java.lang.String str16 = createCourseUI1.getWarningString();
        assertEquals("'" + str9 + "' != '" + "frame322" + "'", str9, "frame322");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNull(str16);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test318");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Rectangle rectangle7 = createCourseUI0.getMaximizedBounds();
        createCourseUI0.firePropertyChange("hi!", 0.5f, (float) '#');
        java.awt.Image image12 = null;
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI13.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        createCourseUI13.removeHierarchyBoundsListener(hierarchyBoundsListener15);
        createCourseUI13.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean21 = createCourseUI13.isLightweight();
        javax.swing.JMenuBar jMenuBar22 = createCourseUI13.getJMenuBar();
        int int23 = createCourseUI0.checkImage(image12, (java.awt.image.ImageObserver) jMenuBar22);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(rectangle7);
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
        assertNull(jMenuBar22);
        assertTrue(int23 == 32, "'" + int23 + "' != '" + 32 + "'");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test319");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str12 = createCourseUI4.getName();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        java.awt.Point point16 = createCourseUI14.getLocation();
        java.awt.Component component17 = createCourseUI4.getComponentAt(point16);
        java.awt.Component component18 = createCourseUI1.findComponentAt(point16);
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        createCourseUI1.addMouseMotionListener(mouseMotionListener19);
        javax.swing.JRootPane jRootPane21 = createCourseUI1.getRootPane();
        assertEquals("'" + str12 + "' != '" + "frame326" + "'", str12, "frame326");
        assertNotNull(point16);
        assertNotNull(component17);
        assertNull(component18);
        assertNotNull(jRootPane21);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test320");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.util.Locale locale5 = createCourseUI0.getLocale();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertNotNull(locale5);
        assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test321");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = createCourseUI1.isMinimumSizeSet();
        createCourseUI1.enableInputMethods(false);
        javax.swing.JRootPane jRootPane18 = createCourseUI1.getRootPane();
        java.awt.im.InputMethodRequests inputMethodRequests19 = createCourseUI1.getInputMethodRequests();
        assertEquals("'" + str9 + "' != '" + "frame328" + "'", str9, "frame328");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(jRootPane18);
        assertNull(inputMethodRequests19);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test322");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        boolean boolean20 = createCourseUI0.isEnabled();
        boolean boolean21 = createCourseUI0.isMaximumSizeSet();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test323");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.setAlwaysOnTop(false);
        java.awt.Dialog.ModalExclusionType modalExclusionType5 = createCourseUI1.getModalExclusionType();
        java.awt.Event event6 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.deliverEvent(event6);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(modalExclusionType5.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE), "'" + modalExclusionType5 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test324");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = createCourseUI0.isForegroundSet();
        createCourseUI0.toBack();
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI0.mouseEnter(event12, (int) '4', (int) (byte) 10);
        java.awt.Dimension dimension16 = createCourseUI0.getPreferredSize();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(dimension16);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test325");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isAutoRequestFocus();
        java.awt.Component component6 = createCourseUI0.getGlassPane();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.remove(400);
            fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 400");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertNotNull(component6);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test326");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.Shape shape5 = createCourseUI0.getShape();
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI0.mouseMove(event6, 8, (int) (short) -1);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertNull(shape5);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test327");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        java.awt.Image image13 = null;
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI14.setFocusableWindowState(false);
        float float17 = createCourseUI14.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray18 = createCourseUI14.getHierarchyListeners();
        float float19 = createCourseUI14.getAlignmentY();
        boolean boolean20 = component12.prepareImage(image13, (java.awt.image.ImageObserver) createCourseUI14);
        boolean boolean21 = createCourseUI14.isShowing();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
        assertTrue(float17 == 1.0f, "'" + float17 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray18);
        assertArrayEquals(hierarchyListenerArray18, new java.awt.event.HierarchyListener[] {});
        assertTrue(float19 == 0.5f, "'" + float19 + "' != '" + 0.5f + "'");
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test328");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        createCourseUI0.addNotify();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        java.awt.Point point9 = createCourseUI7.getLocation();
        java.awt.Point point10 = createCourseUI7.location();
        java.awt.Component component11 = createCourseUI0.getComponentAt(point10);
        boolean boolean12 = createCourseUI0.isShowing();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
        assertNotNull(point9);
        assertNotNull(point10);
        assertNotNull(component11);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test329");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        int int5 = createCourseUI0.getComponentCount();
        java.awt.Event event6 = null;
        boolean boolean8 = createCourseUI0.gotFocus(event6, (java.lang.Object) 7);
        boolean boolean9 = createCourseUI0.isResizable();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(boolean9 == true, "'" + boolean9 + "' != '" + true + "'");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test330");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.MenuBar menuBar4 = createCourseUI0.getMenuBar();
        java.awt.Rectangle rectangle5 = createCourseUI0.bounds();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        float float7 = createCourseUI6.getAlignmentX();
        java.awt.Graphics graphics8 = null;
        createCourseUI6.paintComponents(graphics8);
        java.awt.Dimension dimension10 = createCourseUI6.getMinimumSize();
        java.awt.Color color11 = createCourseUI6.getBackground();
        createCourseUI0.setBackground(color11);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = createCourseUI0.getPropertyChangeListeners("frame66");
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNull(menuBar4);
        assertNotNull(rectangle5);
        assertTrue(float7 == 0.5f, "'" + float7 + "' != '" + 0.5f + "'");
        assertNotNull(dimension10);
        assertNotNull(color11);
        assertNotNull(propertyChangeListenerArray14);
        assertArrayEquals(propertyChangeListenerArray14, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test331");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        java.awt.MenuBar menuBar7 = null;
        createCourseUI0.setMenuBar(menuBar7);
        java.awt.Event event9 = null;
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Event event13 = null;
        boolean boolean16 = createCourseUI10.mouseUp(event13, (int) '#', 12);
        java.awt.Component component19 = createCourseUI10.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI10.show(true);
        boolean boolean22 = createCourseUI0.lostFocus(event9, (java.lang.Object) true);
        java.awt.Event event23 = null;
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        createCourseUI24.setLocationRelativeTo((java.awt.Component) createCourseUI25);
        createCourseUI25.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str33 = createCourseUI25.getName();
        boolean boolean34 = createCourseUI25.isEnabled();
        boolean boolean35 = createCourseUI0.gotFocus(event23, (java.lang.Object) boolean34);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(component19);
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertEquals("'" + str33 + "' != '" + "frame330" + "'", str33, "frame330");
        assertTrue(boolean34 == true, "'" + boolean34 + "' != '" + true + "'");
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test332");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = createCourseUI0.getBaselineResizeBehavior();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER), "'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test333");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        createCourseUI0.setFocusTraversalKeysEnabled(false);
        boolean boolean12 = createCourseUI0.hasFocus();
        boolean boolean13 = createCourseUI0.isVisible();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        boolean boolean15 = createCourseUI14.isForegroundSet();
        int int16 = createCourseUI14.getState();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        float float18 = createCourseUI17.getAlignmentX();
        java.awt.Event event19 = null;
        boolean boolean21 = createCourseUI17.action(event19, (java.lang.Object) (byte) 1);
        boolean boolean22 = createCourseUI17.isFocusOwner();
        java.awt.Color color23 = createCourseUI17.getBackground();
        createCourseUI14.setBackground(color23);
        boolean boolean25 = createCourseUI14.isFocusTraversalPolicyProvider();
        com.example.CreateCourseUI createCourseUI26 = new com.example.CreateCourseUI();
        createCourseUI26.setName("");
        com.example.CreateCourseUI createCourseUI29 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI30 = new com.example.CreateCourseUI();
        createCourseUI29.setLocationRelativeTo((java.awt.Component) createCourseUI30);
        java.awt.Event event32 = null;
        boolean boolean35 = createCourseUI29.mouseUp(event32, (int) '#', 12);
        java.awt.Color color36 = createCourseUI29.getBackground();
        java.awt.LayoutManager layoutManager37 = createCourseUI29.getLayout();
        createCourseUI26.setLayout(layoutManager37);
        com.example.CreateCourseUI createCourseUI39 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI40 = new com.example.CreateCourseUI();
        createCourseUI39.setLocationRelativeTo((java.awt.Component) createCourseUI40);
        createCourseUI40.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str48 = createCourseUI40.getName();
        com.example.CreateCourseUI createCourseUI49 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI50 = new com.example.CreateCourseUI();
        createCourseUI49.setLocationRelativeTo((java.awt.Component) createCourseUI50);
        java.awt.Point point52 = createCourseUI50.getLocation();
        java.awt.Component component53 = createCourseUI40.getComponentAt(point52);
        createCourseUI26.setLocation(point52);
        java.awt.Rectangle rectangle55 = createCourseUI26.getBounds();
        java.awt.event.ContainerListener containerListener56 = null;
        createCourseUI26.addContainerListener(containerListener56);
        com.example.CreateCourseUI createCourseUI58 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI59 = new com.example.CreateCourseUI();
        createCourseUI58.setLocationRelativeTo((java.awt.Component) createCourseUI59);
        boolean boolean61 = createCourseUI58.isFontSet();
        java.awt.Insets insets62 = createCourseUI58.getInsets();
        java.awt.Event event63 = null;
        boolean boolean66 = createCourseUI58.mouseUp(event63, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle67 = createCourseUI58.getBounds();
        java.awt.Rectangle rectangle68 = createCourseUI26.getBounds(rectangle67);
        java.awt.Rectangle rectangle69 = createCourseUI14.getBounds(rectangle67);
        createCourseUI0.setMaximizedBounds(rectangle69);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame332,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame332,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertTrue(int16 == 0, "'" + int16 + "' != '" + 0 + "'");
        assertTrue(float18 == 0.5f, "'" + float18 + "' != '" + 0.5f + "'");
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(color23);
        assertTrue(boolean25 == false, "'" + boolean25 + "' != '" + false + "'");
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
        assertNotNull(color36);
        assertNotNull(layoutManager37);
        assertEquals("'" + str48 + "' != '" + "frame333" + "'", str48, "frame333");
        assertNotNull(point52);
        assertNotNull(component53);
        assertNotNull(rectangle55);
        assertTrue(boolean61 == false, "'" + boolean61 + "' != '" + false + "'");
        assertNotNull(insets62);
        assertTrue(boolean66 == false, "'" + boolean66 + "' != '" + false + "'");
        assertNotNull(rectangle67);
        assertNotNull(rectangle68);
        assertNotNull(rectangle69);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test334");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        createCourseUI0.removeMouseWheelListener(mouseWheelListener11);
        java.awt.MenuBar menuBar13 = null;
        createCourseUI0.setMenuBar(menuBar13);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test335");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        boolean boolean8 = createCourseUI0.isEnabled();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        createCourseUI9.setFocusableWindowState(false);
        float float12 = createCourseUI9.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = createCourseUI9.getHierarchyListeners();
        float float14 = createCourseUI9.getAlignmentY();
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = null;
        createCourseUI9.setModalExclusionType(modalExclusionType15);
        java.awt.Dimension dimension17 = createCourseUI9.getMinimumSize();
        createCourseUI0.setSize(dimension17);
        int int19 = createCourseUI0.countComponents();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
        assertTrue(float12 == 1.0f, "'" + float12 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray13);
        assertArrayEquals(hierarchyListenerArray13, new java.awt.event.HierarchyListener[] {});
        assertTrue(float14 == 0.5f, "'" + float14 + "' != '" + 0.5f + "'");
        assertNotNull(dimension17);
        assertTrue(int19 == 1, "'" + int19 + "' != '" + 1 + "'");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test336");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        java.awt.Graphics graphics18 = null;
        createCourseUI1.printAll(graphics18);
        boolean boolean20 = createCourseUI1.hasFocus();
        assertEquals("'" + str9 + "' != '" + "frame334" + "'", str9, "frame334");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test337");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        java.awt.event.FocusListener focusListener13 = null;
        createCourseUI1.removeFocusListener(focusListener13);
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        createCourseUI15.setLocationRelativeTo((java.awt.Component) createCourseUI16);
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str27 = createCourseUI19.getName();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI29 = new com.example.CreateCourseUI();
        createCourseUI28.setLocationRelativeTo((java.awt.Component) createCourseUI29);
        java.awt.Point point31 = createCourseUI29.getLocation();
        java.awt.Component component32 = createCourseUI19.getComponentAt(point31);
        java.awt.Component component33 = createCourseUI16.findComponentAt(point31);
        java.awt.Component component34 = createCourseUI1.getComponentAt(point31);
        assertEquals("'" + str9 + "' != '" + "frame335" + "'", str9, "frame335");
        assertNotNull(dimension10);
        assertEquals("'" + str27 + "' != '" + "frame336" + "'", str27, "frame336");
        assertNotNull(point31);
        assertNotNull(component32);
        assertNull(component33);
        assertNotNull(component34);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test338");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        createCourseUI14.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str22 = createCourseUI14.getName();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI14.getComponentAt(point26);
        createCourseUI0.setLocation(point26);
        java.awt.Rectangle rectangle29 = createCourseUI0.getBounds();
        java.awt.event.ContainerListener containerListener30 = null;
        createCourseUI0.addContainerListener(containerListener30);
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI33 = new com.example.CreateCourseUI();
        createCourseUI32.setLocationRelativeTo((java.awt.Component) createCourseUI33);
        boolean boolean35 = createCourseUI32.isFontSet();
        java.awt.Insets insets36 = createCourseUI32.getInsets();
        java.awt.Event event37 = null;
        boolean boolean40 = createCourseUI32.mouseUp(event37, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle41 = createCourseUI32.getBounds();
        java.awt.Rectangle rectangle42 = createCourseUI0.getBounds(rectangle41);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior43 = createCourseUI0.getBaselineResizeBehavior();
        boolean boolean44 = createCourseUI0.isDisplayable();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertEquals("'" + str22 + "' != '" + "frame337" + "'", str22, "frame337");
        assertNotNull(point26);
        assertNotNull(component27);
        assertNotNull(rectangle29);
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
        assertNotNull(insets36);
        assertTrue(boolean40 == false, "'" + boolean40 + "' != '" + false + "'");
        assertNotNull(rectangle41);
        assertNotNull(rectangle42);
        assertTrue(baselineResizeBehavior43.equals(java.awt.Component.BaselineResizeBehavior.OTHER), "'" + baselineResizeBehavior43 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'");
        assertTrue(boolean44 == false, "'" + boolean44 + "' != '" + false + "'");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test339");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.setAlwaysOnTop(false);
        int int8 = createCourseUI0.getComponentZOrder((java.awt.Component) createCourseUI4);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = createCourseUI0.getPropertyChangeListeners("frame48");
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI0.keyDown(event11, 433);
        java.awt.event.WindowFocusListener windowFocusListener14 = null;
        createCourseUI0.addWindowFocusListener(windowFocusListener14);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(int8 == (-1), "'" + int8 + "' != '" + (-1) + "'");
        assertNotNull(propertyChangeListenerArray10);
        assertArrayEquals(propertyChangeListenerArray10, new java.beans.PropertyChangeListener[] {});
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test340");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        java.util.Locale locale5 = createCourseUI0.getLocale();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertNotNull(locale5);
        assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test341");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        java.awt.Image image13 = null;
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI14.setFocusableWindowState(false);
        float float17 = createCourseUI14.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray18 = createCourseUI14.getHierarchyListeners();
        float float19 = createCourseUI14.getAlignmentY();
        boolean boolean20 = component12.prepareImage(image13, (java.awt.image.ImageObserver) createCourseUI14);
        java.awt.Event event21 = null;
        boolean boolean24 = createCourseUI14.mouseDrag(event21, 4, 0);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
        assertTrue(float17 == 1.0f, "'" + float17 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray18);
        assertArrayEquals(hierarchyListenerArray18, new java.awt.event.HierarchyListener[] {});
        assertTrue(float19 == 0.5f, "'" + float19 + "' != '" + 0.5f + "'");
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test342");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        boolean boolean8 = createCourseUI0.inside(5, (int) (short) -1);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test343");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        java.awt.event.ComponentListener componentListener12 = null;
        component11.removeComponentListener(componentListener12);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test344");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        int int20 = createCourseUI0.getCursorType();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(int20 == 0, "'" + int20 + "' != '" + 0 + "'");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test345");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setFocusableWindowState(false);
        float float23 = createCourseUI20.getOpacity();
        java.awt.Dimension dimension24 = createCourseUI20.getMaximumSize();
        createCourseUI9.setMaximumSize(dimension24);
        java.awt.event.WindowStateListener windowStateListener26 = null;
        createCourseUI9.addWindowStateListener(windowStateListener26);
        int int28 = createCourseUI9.getDefaultCloseOperation();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(float23 == 1.0f, "'" + float23 + "' != '" + 1.0f + "'");
        assertNotNull(dimension24);
        assertTrue(int28 == 3, "'" + int28 + "' != '" + 3 + "'");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test346");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = createCourseUI0.isForegroundSet();
        createCourseUI0.toBack();
        java.awt.Image image12 = null;
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        boolean boolean16 = createCourseUI15.isForegroundSet();
        java.awt.Component[] componentArray17 = createCourseUI15.getComponents();
        java.awt.Image image18 = createCourseUI15.getIconImage();
        createCourseUI15.setFocusTraversalPolicyProvider(false);
        boolean boolean21 = createCourseUI0.prepareImage(image12, 9, (int) (byte) 0, (java.awt.image.ImageObserver) createCourseUI15);
        java.awt.AWTEvent aWTEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.dispatchEvent(aWTEvent22);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertNotNull(componentArray17);
        assertNull(image18);
        assertTrue(boolean21 == true, "'" + boolean21 + "' != '" + true + "'");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test347");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        createCourseUI0.transferFocus();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        createCourseUI7.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str15 = createCourseUI7.getName();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        createCourseUI16.setLocationRelativeTo((java.awt.Component) createCourseUI17);
        java.awt.Point point19 = createCourseUI17.getLocation();
        java.awt.Component component20 = createCourseUI7.getComponentAt(point19);
        java.awt.Component component21 = createCourseUI4.findComponentAt(point19);
        createCourseUI0.setLocation(point19);
        java.awt.Image image23 = null;
        boolean boolean29 = createCourseUI0.imageUpdate(image23, 500, (int) (byte) 10, 8, 9, 3);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertEquals("'" + str15 + "' != '" + "frame338" + "'", str15, "frame338");
        assertNotNull(point19);
        assertNotNull(component20);
        assertNull(component21);
        assertTrue(boolean29 == false, "'" + boolean29 + "' != '" + false + "'");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test348");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        createCourseUI0.move(7, 7);
        java.awt.Font font12 = createCourseUI0.getFont();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(font12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test349");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.AWTEvent aWTEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.dispatchEvent(aWTEvent4);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test350");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.event.FocusListener focusListener3 = null;
        createCourseUI0.addFocusListener(focusListener3);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.list(printWriter5, 32);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test351");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        int int2 = createCourseUI0.getState();
        java.awt.Image image3 = null;
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        boolean boolean7 = createCourseUI6.isForegroundSet();
        java.awt.Event event8 = null;
        boolean boolean10 = createCourseUI6.keyUp(event8, (int) (byte) 0);
        java.awt.Toolkit toolkit11 = createCourseUI6.getToolkit();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI12.setLocationRelativeTo((java.awt.Component) createCourseUI13);
        createCourseUI13.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str21 = createCourseUI13.getName();
        java.awt.Dimension dimension22 = createCourseUI13.minimumSize();
        createCourseUI6.setMaximumSize(dimension22);
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        createCourseUI6.removeInputMethodListener(inputMethodListener24);
        int int26 = createCourseUI0.checkImage(image3, 100, (int) '4', (java.awt.image.ImageObserver) createCourseUI6);
        java.awt.Graphics graphics27 = null;
        createCourseUI6.paintComponents(graphics27);
        java.awt.Event event29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = createCourseUI6.handleEvent(event29);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertNotNull(toolkit11);
        assertEquals("'" + str21 + "' != '" + "frame339" + "'", str21, "frame339");
        assertNotNull(dimension22);
        assertTrue(int26 == 32, "'" + int26 + "' != '" + 32 + "'");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test352");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        int int5 = createCourseUI0.getComponentCount();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test353");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        boolean boolean8 = createCourseUI0.isUndecorated();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        createCourseUI10.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str18 = createCourseUI10.getName();
        java.awt.Dimension dimension19 = createCourseUI10.minimumSize();
        java.awt.Event event20 = null;
        boolean boolean22 = createCourseUI10.gotFocus(event20, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray23 = createCourseUI10.getWindowFocusListeners();
        java.awt.Image image24 = null;
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        createCourseUI27.setFocusableWindowState(false);
        float float30 = createCourseUI27.getOpacity();
        boolean boolean31 = createCourseUI10.prepareImage(image24, (int) '#', (int) (byte) 10, (java.awt.image.ImageObserver) createCourseUI27);
        createCourseUI10.setUndecorated(false);
        java.awt.dnd.DropTarget dropTarget34 = null;
        createCourseUI10.setDropTarget(dropTarget34);
        createCourseUI0.remove((java.awt.Component) createCourseUI10);
        createCourseUI10.enable();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertEquals("'" + str18 + "' != '" + "frame342" + "'", str18, "frame342");
        assertNotNull(dimension19);
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray23);
        assertArrayEquals(windowFocusListenerArray23, new java.awt.event.WindowFocusListener[] {});
        assertTrue(float30 == 1.0f, "'" + float30 + "' != '" + 1.0f + "'");
        assertTrue(boolean31 == true, "'" + boolean31 + "' != '" + true + "'");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test354");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        boolean boolean18 = createCourseUI1.getFocusableWindowState();
        java.awt.Point point19 = createCourseUI1.getMousePosition();
        java.awt.event.WindowListener[] windowListenerArray20 = createCourseUI1.getWindowListeners();
        assertEquals("'" + str9 + "' != '" + "frame344" + "'", str9, "frame344");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertTrue(boolean18 == true, "'" + boolean18 + "' != '" + true + "'");
        assertNull(point19);
        assertNotNull(windowListenerArray20);
        assertArrayEquals(windowListenerArray20, new java.awt.event.WindowListener[] {});
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test355");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = createCourseUI0.getPropertyChangeListeners("frame120");
        assertNotNull(propertyChangeListenerArray9);
        assertArrayEquals(propertyChangeListenerArray9, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test356");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.Component component2 = createCourseUI0.getGlassPane();
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        component2.removeMouseMotionListener(mouseMotionListener3);
        assertNotNull(component2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test357");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        int int5 = createCourseUI0.getComponentCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = createCourseUI0.areFocusTraversalKeysSet(5);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test358");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        createCourseUI1.firePropertyChange("frame23", (short) 1, (short) (byte) -1);
        java.util.Locale locale8 = createCourseUI1.getLocale();
        assertNotNull(point3);
        assertNotNull(locale8);
        assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test359");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        java.awt.Shape shape10 = null;
        createCourseUI0.setMixingCutoutShape(shape10);
        createCourseUI0.enableInputMethods(true);
        boolean boolean14 = createCourseUI0.isPreferredSizeSet();
        java.awt.event.MouseListener mouseListener15 = null;
        createCourseUI0.removeMouseListener(mouseListener15);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame347,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame347,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test360");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setFocusableWindowState(false);
        float float23 = createCourseUI20.getOpacity();
        java.awt.Dimension dimension24 = createCourseUI20.getMaximumSize();
        createCourseUI9.setMaximumSize(dimension24);
        java.awt.event.WindowStateListener windowStateListener26 = null;
        createCourseUI9.addWindowStateListener(windowStateListener26);
        createCourseUI9.nextFocus();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(float23 == 1.0f, "'" + float23 + "' != '" + 1.0f + "'");
        assertNotNull(dimension24);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test361");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        java.awt.Window window5 = createCourseUI0.getOwner();
        java.awt.event.WindowListener windowListener6 = null;
        createCourseUI0.removeWindowListener(windowListener6);
        createCourseUI0.transferFocus();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNull(window5);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test362");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.awt.event.WindowListener windowListener7 = null;
        createCourseUI0.removeWindowListener(windowListener7);
        java.awt.Image image9 = null;
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI12.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
        createCourseUI12.removeHierarchyBoundsListener(hierarchyBoundsListener14);
        createCourseUI12.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean20 = createCourseUI12.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray21 = createCourseUI12.getMouseListeners();
        java.awt.Dimension dimension22 = createCourseUI12.minimumSize();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI12.getComponentAt(point26);
        boolean boolean28 = component27.isFocusTraversable();
        int int29 = createCourseUI0.checkImage(image9, (int) '#', (int) '4', (java.awt.image.ImageObserver) component27);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet31 = createCourseUI0.getFocusTraversalKeys(9);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray21);
        assertArrayEquals(mouseListenerArray21, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension22);
        assertNotNull(point26);
        assertNotNull(component27);
        assertTrue(boolean28 == true, "'" + boolean28 + "' != '" + true + "'");
        assertTrue(int29 == 32, "'" + int29 + "' != '" + 32 + "'");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test363");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.hide();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        createCourseUI6.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        createCourseUI6.removeHierarchyBoundsListener(hierarchyBoundsListener8);
        createCourseUI6.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean14 = createCourseUI6.isLightweight();
        java.awt.Point point15 = createCourseUI6.location();
        javax.swing.TransferHandler transferHandler16 = null;
        createCourseUI6.setTransferHandler(transferHandler16);
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.setAlwaysOnTop(false);
        java.awt.Dialog.ModalExclusionType modalExclusionType23 = createCourseUI19.getModalExclusionType();
        createCourseUI6.setModalExclusionType(modalExclusionType23);
        createCourseUI0.setModalExclusionType(modalExclusionType23);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(point15);
        assertTrue(modalExclusionType23.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE), "'" + modalExclusionType23 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test364");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        createCourseUI0.enable();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI12.setFocusableWindowState(false);
        float float15 = createCourseUI12.getOpacity();
        java.awt.MenuBar menuBar16 = createCourseUI12.getMenuBar();
        java.awt.Rectangle rectangle17 = createCourseUI12.bounds();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        float float19 = createCourseUI18.getAlignmentX();
        java.awt.Graphics graphics20 = null;
        createCourseUI18.paintComponents(graphics20);
        java.awt.Dimension dimension22 = createCourseUI18.getMinimumSize();
        java.awt.Color color23 = createCourseUI18.getBackground();
        createCourseUI12.setBackground(color23);
        createCourseUI0.setForeground(color23);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertTrue(float15 == 1.0f, "'" + float15 + "' != '" + 1.0f + "'");
        assertNull(menuBar16);
        assertNotNull(rectangle17);
        assertTrue(float19 == 0.5f, "'" + float19 + "' != '" + 0.5f + "'");
        assertNotNull(dimension22);
        assertNotNull(color23);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test365");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        java.awt.Event event11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = createCourseUI0.postEvent(event11);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test366");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        java.awt.Point point13 = createCourseUI11.getLocation();
        java.awt.Component component14 = createCourseUI1.getComponentAt(point13);
        boolean boolean15 = createCourseUI1.isResizable();
        boolean boolean16 = createCourseUI1.isMinimumSizeSet();
        java.awt.Event event17 = null;
        boolean boolean20 = createCourseUI1.mouseDown(event17, 6, (int) (short) 1);
        assertEquals("'" + str9 + "' != '" + "frame351" + "'", str9, "frame351");
        assertNotNull(point13);
        assertNotNull(component14);
        assertTrue(boolean15 == true, "'" + boolean15 + "' != '" + true + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test367");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        createCourseUI0.addInputMethodListener(inputMethodListener10);
        createCourseUI0.setState((int) (byte) -1);
        java.awt.image.VolatileImage volatileImage16 = createCourseUI0.createVolatileImage(11, (int) (short) 1);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame352,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame352,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNull(volatileImage16);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test368");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = createCourseUI1.isMinimumSizeSet();
        createCourseUI1.enableInputMethods(false);
        javax.swing.JRootPane jRootPane18 = createCourseUI1.getRootPane();
        jRootPane18.transferFocusUpCycle();
        assertEquals("'" + str9 + "' != '" + "frame353" + "'", str9, "frame353");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(jRootPane18);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test369");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        createCourseUI0.removePropertyChangeListener(propertyChangeListener4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI0.mouseExit(event6, (int) (byte) 1, 160);
        java.util.Locale locale10 = createCourseUI0.getLocale();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        createCourseUI12.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str20 = createCourseUI12.getName();
        java.awt.Dimension dimension21 = createCourseUI12.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener22 = null;
        createCourseUI12.removeWindowFocusListener(windowFocusListener22);
        boolean boolean24 = createCourseUI12.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests25 = createCourseUI12.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener26 = null;
        createCourseUI12.removeWindowStateListener(windowStateListener26);
        boolean boolean28 = createCourseUI12.isResizable();
        java.awt.ComponentOrientation componentOrientation29 = null;
        createCourseUI12.setComponentOrientation(componentOrientation29);
        createCourseUI0.remove((java.awt.Component) createCourseUI12);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(locale10);
        assertEquals(locale10.toString(), "en_US");
        assertEquals("'" + str20 + "' != '" + "frame354" + "'", str20, "frame354");
        assertNotNull(dimension21);
        assertTrue(boolean24 == true, "'" + boolean24 + "' != '" + true + "'");
        assertNull(inputMethodRequests25);
        assertTrue(boolean28 == true, "'" + boolean28 + "' != '" + true + "'");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test370");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        createCourseUI0.pack();
        boolean boolean6 = createCourseUI0.isBackgroundSet();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test371");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener16);
        java.awt.LayoutManager layoutManager18 = createCourseUI1.getLayout();
        java.awt.image.ColorModel colorModel19 = createCourseUI1.getColorModel();
        javax.swing.TransferHandler transferHandler20 = createCourseUI1.getTransferHandler();
        assertEquals("'" + str9 + "' != '" + "frame355" + "'", str9, "frame355");
        assertNotNull(dimension10);
        assertNotNull(layoutManager18);
        assertNotNull(colorModel19);
        assertNull(transferHandler20);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test372");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        java.awt.Point point6 = createCourseUI0.getMousePosition(false);
        java.awt.Component component9 = createCourseUI0.getComponentAt(12, 8);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertNull(point6);
        assertNotNull(component9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test373");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        java.awt.Point point14 = createCourseUI12.getLocation();
        java.awt.Component component15 = createCourseUI0.getComponentAt(point14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        createCourseUI0.removeHierarchyListener(hierarchyListener16);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertNotNull(point14);
        assertNotNull(component15);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test374");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        createCourseUI14.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str22 = createCourseUI14.getName();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI14.getComponentAt(point26);
        createCourseUI0.setLocation(point26);
        java.awt.FocusTraversalPolicy focusTraversalPolicy29 = createCourseUI0.getFocusTraversalPolicy();
        boolean boolean30 = createCourseUI0.isResizable();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertEquals("'" + str22 + "' != '" + "frame359" + "'", str22, "frame359");
        assertNotNull(point26);
        assertNotNull(component27);
        assertNotNull(focusTraversalPolicy29);
        assertTrue(boolean30 == true, "'" + boolean30 + "' != '" + true + "'");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test375");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        createCourseUI0.addNotify();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        java.awt.Point point9 = createCourseUI7.getLocation();
        java.awt.Point point10 = createCourseUI7.location();
        java.awt.Component component11 = createCourseUI0.getComponentAt(point10);
        component11.revalidate();
        component11.repaint((long) '#');
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
        assertNotNull(point9);
        assertNotNull(point10);
        assertNotNull(component11);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test376");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        java.awt.Container container12 = createCourseUI0.getParent();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertNull(container12);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test377");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        int int15 = createCourseUI1.getY();
        createCourseUI1.removeNotify();
        createCourseUI1.show(false);
        assertEquals("'" + str9 + "' != '" + "frame360" + "'", str9, "frame360");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(int15 == 160, "'" + int15 + "' != '" + 160 + "'");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test378");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy8 = createCourseUI0.getFocusTraversalPolicy();
        java.awt.event.ContainerListener containerListener9 = null;
        createCourseUI0.addContainerListener(containerListener9);
        java.awt.Container container11 = createCourseUI0.getFocusCycleRootAncestor();
        java.awt.MenuBar menuBar12 = createCourseUI0.getMenuBar();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(focusTraversalPolicy8);
        assertNull(container11);
        assertNull(menuBar12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test379");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        createCourseUI14.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str22 = createCourseUI14.getName();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI14.getComponentAt(point26);
        createCourseUI0.setLocation(point26);
        java.awt.Rectangle rectangle29 = createCourseUI0.getBounds();
        java.awt.event.ContainerListener containerListener30 = null;
        createCourseUI0.addContainerListener(containerListener30);
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI33 = new com.example.CreateCourseUI();
        createCourseUI32.setLocationRelativeTo((java.awt.Component) createCourseUI33);
        boolean boolean35 = createCourseUI32.isFontSet();
        java.awt.Insets insets36 = createCourseUI32.getInsets();
        java.awt.Event event37 = null;
        boolean boolean40 = createCourseUI32.mouseUp(event37, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle41 = createCourseUI32.getBounds();
        java.awt.Rectangle rectangle42 = createCourseUI0.getBounds(rectangle41);
        java.lang.String str43 = createCourseUI0.getWarningString();
        com.example.CreateCourseUI createCourseUI44 = new com.example.CreateCourseUI();
        createCourseUI44.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener46 = null;
        createCourseUI44.removeHierarchyBoundsListener(hierarchyBoundsListener46);
        createCourseUI44.firePropertyChange("frame3", (-1L), (long) '4');
        java.awt.Dimension dimension52 = createCourseUI44.getMinimumSize();
        createCourseUI0.setMinimumSize(dimension52);
        createCourseUI0.setFocusable(false);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertEquals("'" + str22 + "' != '" + "frame362" + "'", str22, "frame362");
        assertNotNull(point26);
        assertNotNull(component27);
        assertNotNull(rectangle29);
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
        assertNotNull(insets36);
        assertTrue(boolean40 == false, "'" + boolean40 + "' != '" + false + "'");
        assertNotNull(rectangle41);
        assertNotNull(rectangle42);
        assertNull(str43);
        assertNotNull(dimension52);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test380");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI4.setName("");
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI7.setLocationRelativeTo((java.awt.Component) createCourseUI8);
        java.awt.Event event10 = null;
        boolean boolean13 = createCourseUI7.mouseUp(event10, (int) '#', 12);
        java.awt.Color color14 = createCourseUI7.getBackground();
        java.awt.LayoutManager layoutManager15 = createCourseUI7.getLayout();
        createCourseUI4.setLayout(layoutManager15);
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI17.setLocationRelativeTo((java.awt.Component) createCourseUI18);
        createCourseUI18.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str26 = createCourseUI18.getName();
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        createCourseUI27.setLocationRelativeTo((java.awt.Component) createCourseUI28);
        java.awt.Point point30 = createCourseUI28.getLocation();
        java.awt.Component component31 = createCourseUI18.getComponentAt(point30);
        createCourseUI4.setLocation(point30);
        java.awt.Rectangle rectangle33 = createCourseUI4.getBounds();
        java.awt.event.ContainerListener containerListener34 = null;
        createCourseUI4.addContainerListener(containerListener34);
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI0.reshape(12, 0, (int) ' ', 9);
        java.awt.Event event42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = createCourseUI0.handleEvent(event42);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(color14);
        assertNotNull(layoutManager15);
        assertEquals("'" + str26 + "' != '" + "frame364" + "'", str26, "frame364");
        assertNotNull(point30);
        assertNotNull(component31);
        assertNotNull(rectangle33);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test381");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        createCourseUI0.enable();
        createCourseUI0.setEnabled(true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test382");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        int int2 = createCourseUI0.getWidth();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        createCourseUI0.addHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Cursor cursor5 = null;
        createCourseUI0.setCursor(cursor5);
        java.awt.Component component7 = null;
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI8.setName("");
        boolean boolean11 = createCourseUI8.isFocusOwner();
        java.awt.Rectangle rectangle12 = null;
        createCourseUI8.setMaximizedBounds(rectangle12);
        java.awt.Container container14 = createCourseUI8.getContentPane();
        java.lang.String str15 = createCourseUI8.toString();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.add(component7, (java.lang.Object) createCourseUI8);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame365,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame365,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(int2 == 500, "'" + int2 + "' != '" + 500 + "'");
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertNotNull(container14);
        assertEquals("'" + str15 + "' != '" + "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str15, "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test383");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        createCourseUI1.addHierarchyListener(hierarchyListener16);
        boolean boolean18 = createCourseUI1.isShowing();
        assertEquals("'" + str9 + "' != '" + "frame366" + "'", str9, "frame366");
        assertNotNull(dimension10);
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test384");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        boolean boolean7 = createCourseUI0.contains(5, 3);
        java.awt.Image image8 = createCourseUI0.getIconImage();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        createCourseUI0.addWindowFocusListener(windowFocusListener9);
        float float11 = createCourseUI0.getOpacity();
        java.awt.Component component14 = createCourseUI0.getComponentAt((int) (byte) 10, 0);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
        assertNull(image8);
        assertTrue(float11 == 1.0f, "'" + float11 + "' != '" + 1.0f + "'");
        assertNotNull(component14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test385");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Point point7 = createCourseUI0.location();
        java.awt.Image image8 = null;
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        boolean boolean14 = createCourseUI11.isFontSet();
        java.awt.Insets insets15 = createCourseUI11.getInsets();
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI11.mouseUp(event16, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle20 = createCourseUI11.getBounds();
        int int21 = createCourseUI0.checkImage(image8, (int) (short) -1, (int) (short) 100, (java.awt.image.ImageObserver) createCourseUI11);
        java.awt.Image image22 = null;
        boolean boolean28 = createCourseUI0.imageUpdate(image22, (int) (byte) 0, (int) (short) 10, (int) (byte) 0, (int) '4', 433);
        int int29 = createCourseUI0.getDefaultCloseOperation();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(point7);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(insets15);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNotNull(rectangle20);
        assertTrue(int21 == 32, "'" + int21 + "' != '" + 32 + "'");
        assertTrue(boolean28 == true, "'" + boolean28 + "' != '" + true + "'");
        assertTrue(int29 == 3, "'" + int29 + "' != '" + 3 + "'");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test386");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.getIgnoreRepaint();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str27 = createCourseUI19.getName();
        java.awt.Dimension dimension28 = createCourseUI19.minimumSize();
        java.awt.Point point30 = createCourseUI19.getMousePosition(false);
        boolean boolean31 = createCourseUI19.isShowing();
        boolean boolean32 = createCourseUI19.isShowing();
        com.example.CreateCourseUI createCourseUI33 = new com.example.CreateCourseUI();
        boolean boolean34 = createCourseUI33.isForegroundSet();
        boolean boolean35 = createCourseUI33.isFocusTraversable();
        int int36 = createCourseUI33.countComponents();
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        createCourseUI33.removePropertyChangeListener(propertyChangeListener37);
        java.awt.Event event39 = null;
        boolean boolean42 = createCourseUI33.mouseExit(event39, (int) (byte) 1, 160);
        java.util.Locale locale43 = createCourseUI33.getLocale();
        createCourseUI19.setLocale(locale43);
        createCourseUI1.setLocale(locale43);
        assertEquals("'" + str9 + "' != '" + "frame367" + "'", str9, "frame367");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertEquals("'" + str27 + "' != '" + "frame368" + "'", str27, "frame368");
        assertNotNull(dimension28);
        assertNull(point30);
        assertTrue(boolean31 == false, "'" + boolean31 + "' != '" + false + "'");
        assertTrue(boolean32 == false, "'" + boolean32 + "' != '" + false + "'");
        assertTrue(boolean34 == false, "'" + boolean34 + "' != '" + false + "'");
        assertTrue(boolean35 == true, "'" + boolean35 + "' != '" + true + "'");
        assertTrue(int36 == 1, "'" + int36 + "' != '" + 1 + "'");
        assertTrue(boolean42 == false, "'" + boolean42 + "' != '" + false + "'");
        assertNotNull(locale43);
        assertEquals(locale43.toString(), "en_US");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test387");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        boolean boolean8 = createCourseUI0.isUndecorated();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        createCourseUI10.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str18 = createCourseUI10.getName();
        java.awt.Dimension dimension19 = createCourseUI10.minimumSize();
        java.awt.Event event20 = null;
        boolean boolean22 = createCourseUI10.gotFocus(event20, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray23 = createCourseUI10.getWindowFocusListeners();
        java.awt.Image image24 = null;
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        createCourseUI27.setFocusableWindowState(false);
        float float30 = createCourseUI27.getOpacity();
        boolean boolean31 = createCourseUI10.prepareImage(image24, (int) '#', (int) (byte) 10, (java.awt.image.ImageObserver) createCourseUI27);
        createCourseUI10.setUndecorated(false);
        java.awt.dnd.DropTarget dropTarget34 = null;
        createCourseUI10.setDropTarget(dropTarget34);
        createCourseUI0.remove((java.awt.Component) createCourseUI10);
        java.awt.event.WindowFocusListener windowFocusListener37 = null;
        createCourseUI10.removeWindowFocusListener(windowFocusListener37);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertEquals("'" + str18 + "' != '" + "frame371" + "'", str18, "frame371");
        assertNotNull(dimension19);
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray23);
        assertArrayEquals(windowFocusListenerArray23, new java.awt.event.WindowFocusListener[] {});
        assertTrue(float30 == 1.0f, "'" + float30 + "' != '" + 1.0f + "'");
        assertTrue(boolean31 == true, "'" + boolean31 + "' != '" + true + "'");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test388");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        int int11 = createCourseUI1.getExtendedState();
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI1.mouseUp(event12, (int) (byte) 1, 184);
        java.lang.String str16 = createCourseUI1.toString();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray17 = createCourseUI1.getMouseMotionListeners();
        assertEquals("'" + str9 + "' != '" + "frame372" + "'", str9, "frame372");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertTrue(int11 == 0, "'" + int11 + "' != '" + 0 + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertEquals("'" + str16 + "' != '" + "com.example.CreateCourseUI[frame372,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str16, "com.example.CreateCourseUI[frame372,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(mouseMotionListenerArray17);
        assertArrayEquals(mouseMotionListenerArray17, new java.awt.event.MouseMotionListener[] {});
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test389");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        java.awt.im.InputContext inputContext7 = createCourseUI1.getInputContext();
        createCourseUI1.setResizable(false);
        java.awt.Rectangle rectangle10 = createCourseUI1.getMaximizedBounds();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        createCourseUI12.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str20 = createCourseUI12.getName();
        java.awt.Dimension dimension21 = createCourseUI12.minimumSize();
        java.awt.event.FocusEvent.Cause cause22 = null;
        boolean boolean23 = createCourseUI12.requestFocusInWindow(cause22);
        createCourseUI1.remove((java.awt.Component) createCourseUI12);
        java.awt.Dimension dimension25 = createCourseUI1.getMaximumSize();
        assertNotNull(inputContext7);
        assertNull(rectangle10);
        assertEquals("'" + str20 + "' != '" + "frame373" + "'", str20, "frame373");
        assertNotNull(dimension21);
        assertTrue(boolean23 == false, "'" + boolean23 + "' != '" + false + "'");
        assertNotNull(dimension25);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test390");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.setAlwaysOnTop(false);
        int int8 = createCourseUI0.getComponentZOrder((java.awt.Component) createCourseUI4);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = createCourseUI4.getHierarchyBoundsListeners();
        createCourseUI4.hide();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = createCourseUI4.getPropertyChangeListeners();
        boolean boolean12 = createCourseUI4.isBackgroundSet();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(int8 == (-1), "'" + int8 + "' != '" + (-1) + "'");
        assertNotNull(hierarchyBoundsListenerArray9);
        assertArrayEquals(hierarchyBoundsListenerArray9, new java.awt.event.HierarchyBoundsListener[] {});
        assertNotNull(propertyChangeListenerArray11);
        assertArrayEquals(propertyChangeListenerArray11, new java.beans.PropertyChangeListener[] {});
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test391");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.setState((int) (byte) 100);
        boolean boolean6 = createCourseUI0.isFocusableWindow();
        java.lang.Object obj7 = createCourseUI0.getTreeLock();
        createCourseUI0.setSize(3, 64);
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        createCourseUI0.addInputMethodListener(inputMethodListener11);
        assertTrue(boolean6 == true, "'" + boolean6 + "' != '" + true + "'");
        assertNotNull(obj7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test392");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = createCourseUI1.isMinimumSizeSet();
        createCourseUI1.enableInputMethods(false);
        javax.swing.JRootPane jRootPane18 = createCourseUI1.getRootPane();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI19.setLocationRelativeTo((java.awt.Component) createCourseUI20);
        java.awt.Event event22 = null;
        boolean boolean25 = createCourseUI19.mouseUp(event22, (int) '#', 12);
        java.awt.Color color26 = createCourseUI19.getBackground();
        javax.accessibility.AccessibleContext accessibleContext27 = createCourseUI19.getAccessibleContext();
        java.lang.String str28 = createCourseUI19.toString();
        java.awt.Shape shape29 = null;
        createCourseUI19.setMixingCutoutShape(shape29);
        java.awt.Dimension dimension31 = createCourseUI19.getMinimumSize();
        createCourseUI1.resize(dimension31);
        java.awt.Component[] componentArray33 = createCourseUI1.getComponents();
        assertEquals("'" + str9 + "' != '" + "frame375" + "'", str9, "frame375");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(jRootPane18);
        assertTrue(boolean25 == false, "'" + boolean25 + "' != '" + false + "'");
        assertNotNull(color26);
        assertNotNull(accessibleContext27);
        assertEquals("'" + str28 + "' != '" + "com.example.CreateCourseUI[frame376,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str28, "com.example.CreateCourseUI[frame376,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(dimension31);
        assertNotNull(componentArray33);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test393");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        createCourseUI0.setFocusTraversalPolicyProvider(true);
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test394");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        boolean boolean13 = createCourseUI1.isShowing();
        java.awt.Point point15 = createCourseUI1.getMousePosition(false);
        int int16 = createCourseUI1.countComponents();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        createCourseUI17.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        createCourseUI17.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        createCourseUI17.setState((int) (byte) 100);
        boolean boolean23 = createCourseUI17.isFocusableWindow();
        java.lang.Object obj24 = createCourseUI17.getTreeLock();
        createCourseUI17.setSize(3, 64);
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI1.add((java.awt.Component) createCourseUI17, (java.lang.Object) "frame337", (int) (short) -1);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame377" + "'", str9, "frame377");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNull(point15);
        assertTrue(int16 == 1, "'" + int16 + "' != '" + 1 + "'");
        assertTrue(boolean23 == true, "'" + boolean23 + "' != '" + true + "'");
        assertNotNull(obj24);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test395");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Graphics graphics10 = null;
        createCourseUI3.paintComponents(graphics10);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI12.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
        createCourseUI12.removeHierarchyBoundsListener(hierarchyBoundsListener14);
        createCourseUI12.firePropertyChange("frame3", (-1L), (long) '4');
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.setName("");
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Event event26 = null;
        boolean boolean29 = createCourseUI23.mouseUp(event26, (int) '#', 12);
        java.awt.Color color30 = createCourseUI23.getBackground();
        java.awt.LayoutManager layoutManager31 = createCourseUI23.getLayout();
        createCourseUI20.setLayout(layoutManager31);
        com.example.CreateCourseUI createCourseUI33 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI34 = new com.example.CreateCourseUI();
        createCourseUI33.setLocationRelativeTo((java.awt.Component) createCourseUI34);
        createCourseUI34.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str42 = createCourseUI34.getName();
        com.example.CreateCourseUI createCourseUI43 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI44 = new com.example.CreateCourseUI();
        createCourseUI43.setLocationRelativeTo((java.awt.Component) createCourseUI44);
        java.awt.Point point46 = createCourseUI44.getLocation();
        java.awt.Component component47 = createCourseUI34.getComponentAt(point46);
        createCourseUI20.setLocation(point46);
        java.awt.Rectangle rectangle49 = createCourseUI20.getBounds();
        createCourseUI12.setMaximizedBounds(rectangle49);
        java.awt.Rectangle rectangle51 = createCourseUI3.getBounds(rectangle49);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component52 = createCourseUI0.add("com.example.CreateCourseUI[frame33,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component) createCourseUI3);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertTrue(boolean29 == false, "'" + boolean29 + "' != '" + false + "'");
        assertNotNull(color30);
        assertNotNull(layoutManager31);
        assertEquals("'" + str42 + "' != '" + "frame380" + "'", str42, "frame380");
        assertNotNull(point46);
        assertNotNull(component47);
        assertNotNull(rectangle49);
        assertNotNull(rectangle51);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test396");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        java.awt.Event event2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = createCourseUI0.lostFocus(event2, obj3);
        boolean boolean5 = createCourseUI0.isBackgroundSet();
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame381,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame381,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test397");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.Dimension dimension4 = createCourseUI0.getMaximumSize();
        java.awt.event.FocusEvent.Cause cause5 = null;
        createCourseUI0.requestFocus(cause5);
        boolean boolean7 = createCourseUI0.isFocusTraversalPolicySet();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(dimension4);
        assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test398");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JRootPane jRootPane7 = createCourseUI0.getRootPane();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(jRootPane7);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test399");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        createCourseUI0.revalidate();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray15 = createCourseUI0.getPropertyChangeListeners("frame88");
        java.awt.Event event16 = null;
        boolean boolean18 = createCourseUI0.keyDown(event16, 13);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertNotNull(propertyChangeListenerArray15);
        assertArrayEquals(propertyChangeListenerArray15, new java.beans.PropertyChangeListener[] {});
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test400");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        java.lang.String str11 = createCourseUI1.getWarningString();
        java.awt.Font font12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics13 = createCourseUI1.getFontMetrics(font12);
            fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame385" + "'", str9, "frame385");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNull(str11);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test401");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        createCourseUI0.doLayout();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test402");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        createCourseUI0.addNotify();
        createCourseUI0.setTitle("frame202");
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test403");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray14 = createCourseUI1.getWindowFocusListeners();
        java.awt.Toolkit toolkit15 = createCourseUI1.getToolkit();
        assertEquals("'" + str9 + "' != '" + "frame388" + "'", str9, "frame388");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray14);
        assertArrayEquals(windowFocusListenerArray14, new java.awt.event.WindowFocusListener[] {});
        assertNotNull(toolkit15);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test404");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = createCourseUI1.requestFocusInWindow(cause11);
        createCourseUI1.setAlwaysOnTop(false);
        java.awt.Image image15 = null;
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str27 = createCourseUI19.getName();
        java.awt.Dimension dimension28 = createCourseUI19.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener29 = null;
        createCourseUI19.removeWindowFocusListener(windowFocusListener29);
        boolean boolean31 = createCourseUI19.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests32 = createCourseUI19.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener33 = null;
        createCourseUI19.removeWindowStateListener(windowStateListener33);
        boolean boolean35 = createCourseUI19.isResizable();
        int int36 = createCourseUI1.checkImage(image15, (int) (byte) 0, 160, (java.awt.image.ImageObserver) createCourseUI19);
        java.awt.MenuBar menuBar37 = null;
        createCourseUI1.setMenuBar(menuBar37);
        createCourseUI1.transferFocus();
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        createCourseUI1.addPropertyChangeListener(propertyChangeListener40);
        assertEquals("'" + str9 + "' != '" + "frame390" + "'", str9, "frame390");
        assertNotNull(dimension10);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertEquals("'" + str27 + "' != '" + "frame391" + "'", str27, "frame391");
        assertNotNull(dimension28);
        assertTrue(boolean31 == true, "'" + boolean31 + "' != '" + true + "'");
        assertNull(inputMethodRequests32);
        assertTrue(boolean35 == true, "'" + boolean35 + "' != '" + true + "'");
        assertTrue(int36 == 32, "'" + int36 + "' != '" + 32 + "'");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test405");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        boolean boolean10 = createCourseUI0.isDisplayable();
        boolean boolean11 = createCourseUI0.isValidateRoot();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.createBufferStrategy((int) '#');
            fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean11 == true, "'" + boolean11 + "' != '" + true + "'");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test406");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        boolean boolean13 = createCourseUI1.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests14 = createCourseUI1.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        createCourseUI1.removeWindowStateListener(windowStateListener15);
        boolean boolean17 = createCourseUI1.isResizable();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        createCourseUI1.addInputMethodListener(inputMethodListener18);
        assertEquals("'" + str9 + "' != '" + "frame393" + "'", str9, "frame393");
        assertNotNull(dimension10);
        assertTrue(boolean13 == true, "'" + boolean13 + "' != '" + true + "'");
        assertNull(inputMethodRequests14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test407");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Dimension dimension4 = createCourseUI0.getMinimumSize();
        java.awt.image.VolatileImage volatileImage7 = createCourseUI0.createVolatileImage((int) (short) 10, (int) (byte) -1);
        boolean boolean8 = createCourseUI0.isEnabled();
        java.awt.Dimension dimension9 = createCourseUI0.getMaximumSize();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(dimension4);
        assertNull(volatileImage7);
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
        assertNotNull(dimension9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test408");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        boolean boolean10 = createCourseUI1.isEnabled();
        java.awt.im.InputContext inputContext11 = createCourseUI1.getInputContext();
        javax.swing.JRootPane jRootPane12 = createCourseUI1.getRootPane();
        assertEquals("'" + str9 + "' != '" + "frame394" + "'", str9, "frame394");
        assertTrue(boolean10 == true, "'" + boolean10 + "' != '" + true + "'");
        assertNotNull(inputContext11);
        assertNotNull(jRootPane12);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test409");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        createCourseUI0.setTitle("frame54");
        boolean boolean9 = createCourseUI0.isDoubleBuffered();
        createCourseUI0.revalidate();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test410");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        java.lang.String str11 = createCourseUI1.getWarningString();
        java.awt.Component[] componentArray12 = createCourseUI1.getComponents();
        java.awt.Image image13 = null;
        createCourseUI1.setIconImage(image13);
        assertEquals("'" + str9 + "' != '" + "frame395" + "'", str9, "frame395");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNull(str11);
        assertNotNull(componentArray12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test411");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isAutoRequestFocus();
        createCourseUI0.list();
        boolean boolean7 = createCourseUI0.isFocusCycleRoot();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test412");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        java.awt.Font font20 = null;
        createCourseUI0.setFont(font20);
        createCourseUI0.setEnabled(true);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test413");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        java.awt.im.InputContext inputContext7 = createCourseUI1.getInputContext();
        createCourseUI1.setResizable(false);
        java.awt.Rectangle rectangle10 = createCourseUI1.getMaximizedBounds();
        java.lang.Object obj11 = createCourseUI1.getTreeLock();
        assertNotNull(inputContext7);
        assertNull(rectangle10);
        assertNotNull(obj11);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test414");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        boolean boolean10 = createCourseUI0.isDisplayable();
        boolean boolean11 = createCourseUI0.isValidateRoot();
        boolean boolean12 = createCourseUI0.isFocusTraversable();
        boolean boolean13 = createCourseUI0.isVisible();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean11 == true, "'" + boolean11 + "' != '" + true + "'");
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test415");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        boolean boolean7 = createCourseUI0.contains(5, 3);
        java.awt.Image image8 = createCourseUI0.getIconImage();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        createCourseUI10.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str18 = createCourseUI10.getName();
        java.awt.Dimension dimension19 = createCourseUI10.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener20 = null;
        createCourseUI10.removeWindowFocusListener(windowFocusListener20);
        boolean boolean22 = createCourseUI10.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests23 = createCourseUI10.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener24 = null;
        createCourseUI10.removeWindowStateListener(windowStateListener24);
        java.awt.image.BufferStrategy bufferStrategy26 = createCourseUI10.getBufferStrategy();
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI28 = new com.example.CreateCourseUI();
        createCourseUI27.setLocationRelativeTo((java.awt.Component) createCourseUI28);
        createCourseUI28.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str36 = createCourseUI28.getName();
        com.example.CreateCourseUI createCourseUI37 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI38 = new com.example.CreateCourseUI();
        createCourseUI37.setLocationRelativeTo((java.awt.Component) createCourseUI38);
        java.awt.Point point40 = createCourseUI38.getLocation();
        java.awt.Component component41 = createCourseUI28.getComponentAt(point40);
        createCourseUI10.setLocation(point40);
        java.awt.event.MouseWheelListener mouseWheelListener43 = null;
        createCourseUI10.addMouseWheelListener(mouseWheelListener43);
        createCourseUI0.remove((java.awt.Component) createCourseUI10);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
        assertNull(image8);
        assertEquals("'" + str18 + "' != '" + "frame398" + "'", str18, "frame398");
        assertNotNull(dimension19);
        assertTrue(boolean22 == true, "'" + boolean22 + "' != '" + true + "'");
        assertNull(inputMethodRequests23);
        assertNull(bufferStrategy26);
        assertEquals("'" + str36 + "' != '" + "frame399" + "'", str36, "frame399");
        assertNotNull(point40);
        assertNotNull(component41);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test416");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.lang.String str7 = createCourseUI0.toString();
        java.awt.Component component8 = createCourseUI0.getFocusOwner();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertEquals("'" + str7 + "' != '" + "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str7, "com.example.CreateCourseUI[,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNull(component8);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test417");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = createCourseUI1.isFontSet();
        java.awt.Rectangle rectangle19 = createCourseUI1.getBounds();
        createCourseUI1.setVisible(true);
        assertEquals("'" + str9 + "' != '" + "frame400" + "'", str9, "frame400");
        assertNotNull(dimension10);
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(rectangle19);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test418");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        createCourseUI1.firePropertyChange("frame202", (float) 3, (float) 64);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test419");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        float float8 = createCourseUI7.getAlignmentX();
        java.awt.Event event9 = null;
        boolean boolean11 = createCourseUI7.action(event9, (java.lang.Object) (byte) 1);
        createCourseUI7.setName("");
        java.awt.Dimension dimension14 = createCourseUI7.minimumSize();
        java.util.List<java.awt.Image> imageList15 = createCourseUI7.getIconImages();
        createCourseUI0.setIconImages(imageList15);
        createCourseUI0.requestFocus();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertTrue(float8 == 0.5f, "'" + float8 + "' != '" + 0.5f + "'");
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertNotNull(dimension14);
        assertNotNull(imageList15);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test420");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.Container container14 = createCourseUI1.getParent();
        java.awt.event.FocusListener[] focusListenerArray15 = createCourseUI1.getFocusListeners();
        assertEquals("'" + str9 + "' != '" + "frame401" + "'", str9, "frame401");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNull(container14);
        assertNotNull(focusListenerArray15);
        assertArrayEquals(focusListenerArray15, new java.awt.event.FocusListener[] {});
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test421");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        java.awt.Point point3 = createCourseUI0.getMousePosition();
        createCourseUI0.repaint(7, 100, (int) (short) 0, 100);
        createCourseUI0.setLocation((int) '#', (int) (short) 100);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI12.setLocationRelativeTo((java.awt.Component) createCourseUI13);
        createCourseUI13.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str21 = createCourseUI13.getName();
        java.awt.Dimension dimension22 = createCourseUI13.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener23 = null;
        createCourseUI13.removeWindowFocusListener(windowFocusListener23);
        createCourseUI13.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = null;
        createCourseUI13.setModalExclusionType(modalExclusionType26);
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        createCourseUI13.removeInputMethodListener(inputMethodListener28);
        java.awt.Dimension dimension30 = createCourseUI13.getMaximumSize();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component31 = createCourseUI0.add((java.awt.Component) createCourseUI13);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertNull(point3);
        assertEquals("'" + str21 + "' != '" + "frame402" + "'", str21, "frame402");
        assertNotNull(dimension22);
        assertNotNull(dimension30);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test422");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = createCourseUI0.getPropertyChangeListeners("frame16");
        boolean boolean15 = createCourseUI0.isEnabled();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
        assertNotNull(propertyChangeListenerArray14);
        assertArrayEquals(propertyChangeListenerArray14, new java.beans.PropertyChangeListener[] {});
        assertTrue(boolean15 == true, "'" + boolean15 + "' != '" + true + "'");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test423");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        java.awt.Toolkit toolkit5 = createCourseUI0.getToolkit();
        java.awt.Image image6 = null;
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI9.setLocationRelativeTo((java.awt.Component) createCourseUI10);
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI9.mouseUp(event12, (int) '#', 12);
        java.awt.Component component18 = createCourseUI9.getComponentAt((int) (short) 0, (int) (byte) 10);
        int int19 = createCourseUI0.checkImage(image6, 0, (-1), (java.awt.image.ImageObserver) createCourseUI9);
        int int20 = createCourseUI0.getY();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(toolkit5);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(component18);
        assertTrue(int19 == 32, "'" + int19 + "' != '" + 32 + "'");
        assertTrue(int20 == 160, "'" + int20 + "' != '" + 160 + "'");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test424");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.keyUp(event2, (int) (byte) 0);
        boolean boolean7 = createCourseUI0.contains(5, 3);
        java.awt.Image image8 = createCourseUI0.getIconImage();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        createCourseUI0.addWindowFocusListener(windowFocusListener9);
        float float11 = createCourseUI0.getOpacity();
        boolean boolean12 = createCourseUI0.isFocusTraversalPolicySet();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean7 == true, "'" + boolean7 + "' != '" + true + "'");
        assertNull(image8);
        assertTrue(float11 == 1.0f, "'" + float11 + "' != '" + 1.0f + "'");
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test425");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        boolean boolean20 = createCourseUI0.isAlwaysOnTopSupported();
        java.awt.im.InputMethodRequests inputMethodRequests21 = createCourseUI0.getInputMethodRequests();
        boolean boolean22 = createCourseUI0.isDisplayable();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Dimension dimension23 = createCourseUI0.minimumSize();
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.ComponentOrientation.isLeftToRight()\" because the return value of \"java.awt.Container.getComponentOrientation()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertNull(inputMethodRequests21);
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test426");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        boolean boolean10 = createCourseUI1.isEnabled();
        createCourseUI1.firePropertyChange("frame31", (byte) 10, (byte) -1);
        assertEquals("'" + str9 + "' != '" + "frame403" + "'", str9, "frame403");
        assertTrue(boolean10 == true, "'" + boolean10 + "' != '" + true + "'");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test427");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener16);
        java.awt.LayoutManager layoutManager18 = createCourseUI1.getLayout();
        java.awt.event.WindowListener windowListener19 = null;
        createCourseUI1.removeWindowListener(windowListener19);
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI22 = new com.example.CreateCourseUI();
        createCourseUI21.setLocationRelativeTo((java.awt.Component) createCourseUI22);
        createCourseUI22.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str30 = createCourseUI22.getName();
        java.lang.String str31 = createCourseUI22.getTitle();
        createCourseUI22.setAlwaysOnTop(true);
        java.awt.Container container34 = createCourseUI22.getContentPane();
        java.awt.Component component35 = createCourseUI22.getGlassPane();
        boolean boolean38 = createCourseUI22.contains((int) 'a', (int) (short) 0);
        java.util.List<java.awt.Image> imageList39 = createCourseUI22.getIconImages();
        createCourseUI1.setIconImages(imageList39);
        assertEquals("'" + str9 + "' != '" + "frame404" + "'", str9, "frame404");
        assertNotNull(dimension10);
        assertNotNull(layoutManager18);
        assertEquals("'" + str30 + "' != '" + "frame405" + "'", str30, "frame405");
        assertEquals("'" + str31 + "' != '" + "Create Course" + "'", str31, "Create Course");
        assertNotNull(container34);
        assertNotNull(component35);
        assertTrue(boolean38 == true, "'" + boolean38 + "' != '" + true + "'");
        assertNotNull(imageList39);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test428");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        boolean boolean3 = createCourseUI0.isFontSet();
        java.awt.Insets insets4 = createCourseUI0.getInsets();
        java.awt.Event event5 = null;
        boolean boolean8 = createCourseUI0.mouseUp(event5, (int) (byte) 1, (int) '4');
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        createCourseUI0.removePropertyChangeListener("frame43", propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = createCourseUI0.areFocusTraversalKeysSet(4);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(insets4);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test429");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        boolean boolean5 = createCourseUI0.isResizable();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        int int9 = createCourseUI7.getExtendedState();
        boolean boolean10 = createCourseUI7.isAutoRequestFocus();
        createCourseUI7.doLayout();
        createCourseUI7.requestFocus();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        java.awt.Event event14 = null;
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        createCourseUI15.setLocationRelativeTo((java.awt.Component) createCourseUI16);
        createCourseUI16.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str24 = createCourseUI16.getName();
        java.awt.Dimension dimension25 = createCourseUI16.minimumSize();
        java.awt.Event event26 = null;
        boolean boolean28 = createCourseUI16.gotFocus(event26, (java.lang.Object) 9);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray29 = createCourseUI16.getWindowFocusListeners();
        java.awt.event.ContainerListener containerListener30 = null;
        createCourseUI16.addContainerListener(containerListener30);
        java.awt.Component component34 = createCourseUI16.getComponentAt((int) (byte) 1, (int) (byte) 0);
        boolean boolean35 = createCourseUI7.lostFocus(event14, (java.lang.Object) (byte) 0);
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        assertTrue(boolean10 == true, "'" + boolean10 + "' != '" + true + "'");
        assertEquals("'" + str24 + "' != '" + "frame406" + "'", str24, "frame406");
        assertNotNull(dimension25);
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray29);
        assertArrayEquals(windowFocusListenerArray29, new java.awt.event.WindowFocusListener[] {});
        assertNotNull(component34);
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test430");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.resize(160, (int) (byte) 0);
        assertEquals("'" + str9 + "' != '" + "frame407" + "'", str9, "frame407");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test431");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        boolean boolean5 = createCourseUI0.isFocusOwner();
        java.awt.Color color6 = createCourseUI0.getBackground();
        java.awt.Event event7 = null;
        boolean boolean10 = createCourseUI0.mouseUp(event7, (int) (short) 10, (int) (short) 0);
        java.awt.Event event11 = null;
        boolean boolean14 = createCourseUI0.mouseDrag(event11, 3, 3);
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean5 == false, "'" + boolean5 + "' != '" + false + "'");
        assertNotNull(color6);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test432");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        createCourseUI0.setFocusTraversalKeysEnabled(false);
        boolean boolean12 = createCourseUI0.hasFocus();
        boolean boolean13 = createCourseUI0.isVisible();
        boolean boolean15 = createCourseUI0.areFocusTraversalKeysSet(0);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray16 = createCourseUI0.getHierarchyBoundsListeners();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame408,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame408,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(hierarchyBoundsListenerArray16);
        assertArrayEquals(hierarchyBoundsListenerArray16, new java.awt.event.HierarchyBoundsListener[] {});
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test433");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        java.awt.event.FocusListener focusListener13 = null;
        createCourseUI1.removeFocusListener(focusListener13);
        java.awt.Component component15 = createCourseUI1.getMostRecentFocusOwner();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = createCourseUI1.getBaselineResizeBehavior();
        boolean boolean17 = createCourseUI1.isShowing();
        assertEquals("'" + str9 + "' != '" + "frame409" + "'", str9, "frame409");
        assertNotNull(dimension10);
        assertNotNull(component15);
        assertTrue(baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER), "'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test434");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setFocusableWindowState(false);
        float float3 = createCourseUI0.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray4 = createCourseUI0.getHierarchyListeners();
        boolean boolean5 = createCourseUI0.isResizable();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        int int9 = createCourseUI7.getExtendedState();
        boolean boolean10 = createCourseUI7.isAutoRequestFocus();
        createCourseUI7.doLayout();
        createCourseUI7.requestFocus();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        boolean boolean14 = createCourseUI0.isValid();
        assertTrue(float3 == 1.0f, "'" + float3 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray4);
        assertArrayEquals(hierarchyListenerArray4, new java.awt.event.HierarchyListener[] {});
        assertTrue(boolean5 == true, "'" + boolean5 + "' != '" + true + "'");
        assertTrue(int9 == 0, "'" + int9 + "' != '" + 0 + "'");
        assertTrue(boolean10 == true, "'" + boolean10 + "' != '" + true + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test435");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.setAlwaysOnTop(false);
        java.awt.Image image5 = createCourseUI1.getIconImage();
        assertNull(image5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test436");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        boolean boolean13 = createCourseUI1.isShowing();
        java.awt.Point point15 = createCourseUI1.getMousePosition(false);
        int int16 = createCourseUI1.countComponents();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        createCourseUI17.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        createCourseUI17.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        createCourseUI17.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean25 = createCourseUI17.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray26 = createCourseUI17.getMouseListeners();
        java.awt.Dimension dimension27 = createCourseUI17.minimumSize();
        createCourseUI1.setMaximumSize(dimension27);
        assertEquals("'" + str9 + "' != '" + "frame410" + "'", str9, "frame410");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNull(point15);
        assertTrue(int16 == 1, "'" + int16 + "' != '" + 1 + "'");
        assertTrue(boolean25 == false, "'" + boolean25 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray26);
        assertArrayEquals(mouseListenerArray26, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension27);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test437");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        boolean boolean8 = createCourseUI0.isUndecorated();
        int int9 = createCourseUI0.getY();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        createCourseUI10.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        createCourseUI10.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        createCourseUI10.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean18 = createCourseUI10.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray19 = createCourseUI10.getMouseListeners();
        java.awt.Dimension dimension20 = createCourseUI10.minimumSize();
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI22 = new com.example.CreateCourseUI();
        createCourseUI21.setLocationRelativeTo((java.awt.Component) createCourseUI22);
        java.awt.Point point24 = createCourseUI22.getLocation();
        java.awt.Component component25 = createCourseUI10.getComponentAt(point24);
        java.awt.Component component26 = createCourseUI0.getComponentAt(point24);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertTrue(int9 == 184, "'" + int9 + "' != '" + 184 + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray19);
        assertArrayEquals(mouseListenerArray19, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension20);
        assertNotNull(point24);
        assertNotNull(component25);
        assertNotNull(component26);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test438");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.ImageCapabilities imageCapabilities11 = null;
        java.awt.image.VolatileImage volatileImage12 = createCourseUI0.createVolatileImage((int) ' ', 8, imageCapabilities11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        float float14 = createCourseUI13.getAlignmentX();
        java.awt.Event event15 = null;
        boolean boolean17 = createCourseUI13.action(event15, (java.lang.Object) (byte) 1);
        boolean boolean18 = createCourseUI13.isFocusOwner();
        java.awt.Color color19 = createCourseUI13.getBackground();
        java.awt.MenuBar menuBar20 = null;
        createCourseUI13.setMenuBar(menuBar20);
        boolean boolean22 = createCourseUI0.isAncestorOf((java.awt.Component) createCourseUI13);
        createCourseUI13.firePropertyChange("com.example.CreateCourseUI[frame168,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double) 'a', (double) 184);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(volatileImage12);
        assertTrue(float14 == 0.5f, "'" + float14 + "' != '" + 0.5f + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(color19);
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test439");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.event.FocusListener[] focusListenerArray13 = createCourseUI1.getFocusListeners();
        java.awt.Graphics graphics14 = null;
        createCourseUI1.printAll(graphics14);
        createCourseUI1.setLocation((-1), (int) '#');
        java.awt.Dimension dimension19 = createCourseUI1.size();
        assertEquals("'" + str9 + "' != '" + "frame413" + "'", str9, "frame413");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(focusListenerArray13);
        assertArrayEquals(focusListenerArray13, new java.awt.event.FocusListener[] {});
        assertNotNull(dimension19);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test440");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Point point3 = createCourseUI1.getLocation();
        createCourseUI1.firePropertyChange("frame23", (short) 1, (short) (byte) -1);
        float float8 = createCourseUI1.getAlignmentY();
        java.awt.Point point9 = createCourseUI1.getMousePosition();
        assertNotNull(point3);
        assertTrue(float8 == 0.5f, "'" + float8 + "' != '" + 0.5f + "'");
        assertNull(point9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test441");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Font font3 = null;
        createCourseUI1.setFont(font3);
        java.awt.event.KeyListener keyListener5 = null;
        createCourseUI1.removeKeyListener(keyListener5);
        java.awt.im.InputContext inputContext7 = createCourseUI1.getInputContext();
        createCourseUI1.setResizable(false);
        java.lang.String str10 = createCourseUI1.getTitle();
        boolean boolean11 = createCourseUI1.requestFocusInWindow();
        assertNotNull(inputContext7);
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test442");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.setAlwaysOnTop(false);
        java.awt.Graphics graphics5 = createCourseUI1.getGraphics();
        assertNull(graphics5);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test443");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.invalidate();
        java.awt.Component component4 = createCourseUI1.getMostRecentFocusOwner();
        com.example.CreateCourseUI createCourseUI5 = new com.example.CreateCourseUI();
        float float6 = createCourseUI5.getAlignmentX();
        java.awt.Event event7 = null;
        boolean boolean9 = createCourseUI5.action(event7, (java.lang.Object) (byte) 1);
        boolean boolean10 = createCourseUI5.isFocusOwner();
        int int11 = createCourseUI1.getComponentZOrder((java.awt.Component) createCourseUI5);
        assertNotNull(component4);
        assertTrue(float6 == 0.5f, "'" + float6 + "' != '" + 0.5f + "'");
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(int11 == (-1), "'" + int11 + "' != '" + (-1) + "'");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test444");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean10 = createCourseUI0.isForegroundSet();
        createCourseUI0.toBack();
        java.awt.Event event12 = null;
        boolean boolean15 = createCourseUI0.mouseEnter(event12, (int) '4', (int) (byte) 10);
        java.awt.event.MouseListener mouseListener16 = null;
        createCourseUI0.removeMouseListener(mouseListener16);
        boolean boolean18 = createCourseUI0.isDoubleBuffered();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertTrue(boolean10 == false, "'" + boolean10 + "' != '" + false + "'");
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test445");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Rectangle rectangle10 = createCourseUI0.getMaximizedBounds();
        boolean boolean11 = createCourseUI0.isFocusableWindow();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNull(rectangle10);
        assertTrue(boolean11 == true, "'" + boolean11 + "' != '" + true + "'");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test446");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        boolean boolean11 = createCourseUI0.requestFocusInWindow();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test447");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray8 = jMenuBar7.getHierarchyBoundsListeners();
            fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test448");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        java.awt.Toolkit toolkit3 = createCourseUI0.getToolkit();
        java.awt.Cursor cursor4 = null;
        createCourseUI0.setCursor(cursor4);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertNotNull(toolkit3);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test449");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI13.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        createCourseUI13.removeHierarchyBoundsListener(hierarchyBoundsListener15);
        createCourseUI13.setState((int) (byte) 100);
        boolean boolean19 = createCourseUI13.isFocusableWindow();
        java.lang.Object obj20 = createCourseUI13.getTreeLock();
        createCourseUI13.setState(12);
        createCourseUI13.addNotify();
        java.awt.Color color24 = createCourseUI13.getBackground();
        createCourseUI1.setBackground(color24);
        assertEquals("'" + str9 + "' != '" + "frame416" + "'", str9, "frame416");
        assertNotNull(dimension10);
        assertTrue(boolean19 == true, "'" + boolean19 + "' != '" + true + "'");
        assertNotNull(obj20);
        assertNotNull(color24);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test450");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        createCourseUI8.setLocationRelativeTo((java.awt.Component) createCourseUI9);
        java.awt.Font font11 = null;
        createCourseUI9.setFont(font11);
        java.awt.event.KeyListener keyListener13 = null;
        createCourseUI9.removeKeyListener(keyListener13);
        createCourseUI9.transferFocus();
        // The following exception was thrown during execution in test generation
        try {
            createCourseUI0.add((java.awt.Component) createCourseUI9, (java.lang.Object) "frame3");
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test451");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.Point point9 = createCourseUI0.location();
        javax.swing.TransferHandler transferHandler10 = null;
        createCourseUI0.setTransferHandler(transferHandler10);
        java.awt.MenuComponent menuComponent12 = null;
        createCourseUI0.remove(menuComponent12);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(point9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test452");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.setAlwaysOnTop(false);
        int int8 = createCourseUI0.getComponentZOrder((java.awt.Component) createCourseUI4);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = createCourseUI4.getHierarchyBoundsListeners();
        createCourseUI4.hide();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        boolean boolean12 = createCourseUI11.isForegroundSet();
        java.awt.Component[] componentArray13 = createCourseUI11.getComponents();
        java.awt.ComponentOrientation componentOrientation14 = createCourseUI11.getComponentOrientation();
        createCourseUI4.setComponentOrientation(componentOrientation14);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(int8 == (-1), "'" + int8 + "' != '" + (-1) + "'");
        assertNotNull(hierarchyBoundsListenerArray9);
        assertArrayEquals(hierarchyBoundsListenerArray9, new java.awt.event.HierarchyBoundsListener[] {});
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(componentArray13);
        assertNotNull(componentOrientation14);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test453");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = createCourseUI1.requestFocusInWindow(cause11);
        java.awt.event.WindowStateListener windowStateListener13 = null;
        createCourseUI1.addWindowStateListener(windowStateListener13);
        assertEquals("'" + str9 + "' != '" + "frame419" + "'", str9, "frame419");
        assertNotNull(dimension10);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test454");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = createCourseUI1.isMinimumSizeSet();
        createCourseUI1.enableInputMethods(false);
        javax.swing.JRootPane jRootPane18 = createCourseUI1.getRootPane();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI19.setLocationRelativeTo((java.awt.Component) createCourseUI20);
        java.awt.Event event22 = null;
        boolean boolean25 = createCourseUI19.mouseUp(event22, (int) '#', 12);
        java.awt.Color color26 = createCourseUI19.getBackground();
        javax.accessibility.AccessibleContext accessibleContext27 = createCourseUI19.getAccessibleContext();
        java.lang.String str28 = createCourseUI19.toString();
        java.awt.Shape shape29 = null;
        createCourseUI19.setMixingCutoutShape(shape29);
        java.awt.Dimension dimension31 = createCourseUI19.getMinimumSize();
        createCourseUI1.resize(dimension31);
        java.awt.Component component35 = createCourseUI1.getComponentAt(128, 1);
        assertEquals("'" + str9 + "' != '" + "frame420" + "'", str9, "frame420");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(jRootPane18);
        assertTrue(boolean25 == false, "'" + boolean25 + "' != '" + false + "'");
        assertNotNull(color26);
        assertNotNull(accessibleContext27);
        assertEquals("'" + str28 + "' != '" + "com.example.CreateCourseUI[frame421,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str28, "com.example.CreateCourseUI[frame421,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(dimension31);
        assertNotNull(component35);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test455");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        createCourseUI7.setLocationRelativeTo((java.awt.Component) createCourseUI8);
        createCourseUI8.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str16 = createCourseUI8.getName();
        java.lang.String str17 = createCourseUI8.getTitle();
        createCourseUI8.setAlwaysOnTop(true);
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI20.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        createCourseUI20.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        createCourseUI20.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean28 = createCourseUI20.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray29 = createCourseUI20.getMouseListeners();
        java.awt.Dimension dimension30 = createCourseUI20.minimumSize();
        com.example.CreateCourseUI createCourseUI31 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        createCourseUI31.setLocationRelativeTo((java.awt.Component) createCourseUI32);
        java.awt.Point point34 = createCourseUI32.getLocation();
        java.awt.Component component35 = createCourseUI20.getComponentAt(point34);
        java.awt.Point point36 = createCourseUI8.getLocation(point34);
        boolean boolean37 = createCourseUI0.contains(point34);
        createCourseUI0.reshape(400, 433, (int) '4', (int) '4');
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertEquals("'" + str16 + "' != '" + "frame422" + "'", str16, "frame422");
        assertEquals("'" + str17 + "' != '" + "Create Course" + "'", str17, "Create Course");
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray29);
        assertArrayEquals(mouseListenerArray29, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension30);
        assertNotNull(point34);
        assertNotNull(component35);
        assertNotNull(point36);
        assertTrue(boolean37 == true, "'" + boolean37 + "' != '" + true + "'");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test456");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        int int3 = createCourseUI1.getExtendedState();
        boolean boolean4 = createCourseUI1.isAutoRequestFocus();
        int int5 = createCourseUI1.getCursorType();
        assertTrue(int3 == 0, "'" + int3 + "' != '" + 0 + "'");
        assertTrue(boolean4 == true, "'" + boolean4 + "' != '" + true + "'");
        assertTrue(int5 == 0, "'" + int5 + "' != '" + 0 + "'");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test457");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Rectangle rectangle10 = createCourseUI0.getBounds();
        createCourseUI0.toBack();
        java.awt.LayoutManager layoutManager12 = createCourseUI0.getLayout();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(rectangle10);
        assertNotNull(layoutManager12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test458");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        java.awt.Container container11 = createCourseUI1.getFocusCycleRootAncestor();
        createCourseUI1.show(false);
        assertEquals("'" + str9 + "' != '" + "frame425" + "'", str9, "frame425");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNull(container11);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test459");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        java.lang.String str1 = createCourseUI0.toString();
        java.awt.Event event2 = null;
        java.lang.Object obj3 = new java.lang.Object();
        boolean boolean4 = createCourseUI0.lostFocus(event2, obj3);
        createCourseUI0.toFront();
        createCourseUI0.disable();
        assertEquals("'" + str1 + "' != '" + "com.example.CreateCourseUI[frame426,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str1, "com.example.CreateCourseUI[frame426,433,160,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test460");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        createCourseUI0.firePropertyChange("frame64", '#', '4');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray12 = createCourseUI0.getHierarchyBoundsListeners();
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI13.setFocusableWindowState(false);
        float float16 = createCourseUI13.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray17 = createCourseUI13.getHierarchyListeners();
        float float18 = createCourseUI13.getAlignmentY();
        java.awt.Dialog.ModalExclusionType modalExclusionType19 = null;
        createCourseUI13.setModalExclusionType(modalExclusionType19);
        java.awt.Dimension dimension21 = createCourseUI13.getMinimumSize();
        createCourseUI0.setMaximumSize(dimension21);
        createCourseUI0.removeAll();
        assertNotNull(hierarchyBoundsListenerArray12);
        assertArrayEquals(hierarchyBoundsListenerArray12, new java.awt.event.HierarchyBoundsListener[] {});
        assertTrue(float16 == 1.0f, "'" + float16 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray17);
        assertArrayEquals(hierarchyListenerArray17, new java.awt.event.HierarchyListener[] {});
        assertTrue(float18 == 0.5f, "'" + float18 + "' != '" + 0.5f + "'");
        assertNotNull(dimension21);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test461");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        createCourseUI0.setFocusableWindowState(false);
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        boolean boolean7 = createCourseUI6.isForegroundSet();
        int int8 = createCourseUI6.getState();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        float float10 = createCourseUI9.getAlignmentX();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI9.action(event11, (java.lang.Object) (byte) 1);
        boolean boolean14 = createCourseUI9.isFocusOwner();
        java.awt.Color color15 = createCourseUI9.getBackground();
        createCourseUI6.setBackground(color15);
        boolean boolean17 = createCourseUI6.isFocusTraversalPolicyProvider();
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        createCourseUI18.setName("");
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI22 = new com.example.CreateCourseUI();
        createCourseUI21.setLocationRelativeTo((java.awt.Component) createCourseUI22);
        java.awt.Event event24 = null;
        boolean boolean27 = createCourseUI21.mouseUp(event24, (int) '#', 12);
        java.awt.Color color28 = createCourseUI21.getBackground();
        java.awt.LayoutManager layoutManager29 = createCourseUI21.getLayout();
        createCourseUI18.setLayout(layoutManager29);
        com.example.CreateCourseUI createCourseUI31 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        createCourseUI31.setLocationRelativeTo((java.awt.Component) createCourseUI32);
        createCourseUI32.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str40 = createCourseUI32.getName();
        com.example.CreateCourseUI createCourseUI41 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI42 = new com.example.CreateCourseUI();
        createCourseUI41.setLocationRelativeTo((java.awt.Component) createCourseUI42);
        java.awt.Point point44 = createCourseUI42.getLocation();
        java.awt.Component component45 = createCourseUI32.getComponentAt(point44);
        createCourseUI18.setLocation(point44);
        java.awt.Rectangle rectangle47 = createCourseUI18.getBounds();
        java.awt.event.ContainerListener containerListener48 = null;
        createCourseUI18.addContainerListener(containerListener48);
        com.example.CreateCourseUI createCourseUI50 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI51 = new com.example.CreateCourseUI();
        createCourseUI50.setLocationRelativeTo((java.awt.Component) createCourseUI51);
        boolean boolean53 = createCourseUI50.isFontSet();
        java.awt.Insets insets54 = createCourseUI50.getInsets();
        java.awt.Event event55 = null;
        boolean boolean58 = createCourseUI50.mouseUp(event55, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle59 = createCourseUI50.getBounds();
        java.awt.Rectangle rectangle60 = createCourseUI18.getBounds(rectangle59);
        java.awt.Rectangle rectangle61 = createCourseUI6.getBounds(rectangle59);
        createCourseUI0.setBounds(rectangle61);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(int8 == 0, "'" + int8 + "' != '" + 0 + "'");
        assertTrue(float10 == 0.5f, "'" + float10 + "' != '" + 0.5f + "'");
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(color15);
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertTrue(boolean27 == false, "'" + boolean27 + "' != '" + false + "'");
        assertNotNull(color28);
        assertNotNull(layoutManager29);
        assertEquals("'" + str40 + "' != '" + "frame428" + "'", str40, "frame428");
        assertNotNull(point44);
        assertNotNull(component45);
        assertNotNull(rectangle47);
        assertTrue(boolean53 == false, "'" + boolean53 + "' != '" + false + "'");
        assertNotNull(insets54);
        assertTrue(boolean58 == false, "'" + boolean58 + "' != '" + false + "'");
        assertNotNull(rectangle59);
        assertNotNull(rectangle60);
        assertNotNull(rectangle61);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test462");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = createCourseUI1.isMinimumSizeSet();
        createCourseUI1.enableInputMethods(false);
        createCourseUI1.show(false);
        assertEquals("'" + str9 + "' != '" + "frame429" + "'", str9, "frame429");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test463");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        createCourseUI0.pack();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = createCourseUI0.getPropertyChangeListeners("frame11");
        boolean boolean8 = createCourseUI0.isLightweight();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertNotNull(propertyChangeListenerArray7);
        assertArrayEquals(propertyChangeListenerArray7, new java.beans.PropertyChangeListener[] {});
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test464");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        createCourseUI0.setVisible(true);
        createCourseUI0.layout();
        int int10 = createCourseUI0.getExtendedState();
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertTrue(int10 == 0, "'" + int10 + "' != '" + 0 + "'");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test465");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        boolean boolean10 = createCourseUI1.isEnabled();
        createCourseUI1.dispose();
        assertEquals("'" + str9 + "' != '" + "frame430" + "'", str9, "frame430");
        assertTrue(boolean10 == true, "'" + boolean10 + "' != '" + true + "'");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test466");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        createCourseUI0.removeMouseWheelListener(mouseWheelListener11);
        java.awt.Graphics graphics13 = null;
        createCourseUI0.paintAll(graphics13);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test467");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI13.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        createCourseUI13.removeHierarchyBoundsListener(hierarchyBoundsListener15);
        createCourseUI13.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean21 = createCourseUI13.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray22 = createCourseUI13.getMouseListeners();
        java.awt.Dimension dimension23 = createCourseUI13.minimumSize();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        createCourseUI24.setLocationRelativeTo((java.awt.Component) createCourseUI25);
        java.awt.Point point27 = createCourseUI25.getLocation();
        java.awt.Component component28 = createCourseUI13.getComponentAt(point27);
        java.awt.Point point29 = createCourseUI1.getLocation(point27);
        java.awt.Dialog.ModalExclusionType modalExclusionType30 = createCourseUI1.getModalExclusionType();
        assertEquals("'" + str9 + "' != '" + "frame431" + "'", str9, "frame431");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray22);
        assertArrayEquals(mouseListenerArray22, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension23);
        assertNotNull(point27);
        assertNotNull(component28);
        assertNotNull(point29);
        assertTrue(modalExclusionType30.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE), "'" + modalExclusionType30 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test468");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        java.awt.Point point14 = createCourseUI12.getLocation();
        java.awt.Component component15 = createCourseUI0.getComponentAt(point14);
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI0.mouseUp(event16, 11, 5);
        java.awt.Event event20 = null;
        boolean boolean22 = createCourseUI0.action(event20, (java.lang.Object) 11);
        createCourseUI0.validate();
        java.awt.Dialog.ModalExclusionType modalExclusionType24 = createCourseUI0.getModalExclusionType();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertNotNull(point14);
        assertNotNull(component15);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertTrue(modalExclusionType24.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE), "'" + modalExclusionType24 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test469");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        java.awt.Component[] componentArray2 = createCourseUI0.getComponents();
        java.awt.Image image3 = createCourseUI0.getIconImage();
        createCourseUI0.setFocusTraversalPolicyProvider(false);
        java.awt.Graphics graphics6 = null;
        createCourseUI0.paintComponents(graphics6);
        com.example.CreateCourseUI createCourseUI8 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI9 = new com.example.CreateCourseUI();
        createCourseUI8.setLocationRelativeTo((java.awt.Component) createCourseUI9);
        java.awt.Event event11 = null;
        boolean boolean14 = createCourseUI8.mouseUp(event11, (int) '#', 12);
        java.awt.Color color15 = createCourseUI8.getBackground();
        javax.accessibility.AccessibleContext accessibleContext16 = createCourseUI8.getAccessibleContext();
        createCourseUI8.transferFocusDownCycle();
        java.awt.Component component20 = createCourseUI8.getComponentAt((int) ' ', 4);
        boolean boolean21 = createCourseUI8.isUndecorated();
        java.awt.Point point22 = createCourseUI8.location();
        createCourseUI0.setLocation(point22);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertNotNull(componentArray2);
        assertNull(image3);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(color15);
        assertNotNull(accessibleContext16);
        assertNotNull(component20);
        assertTrue(boolean21 == false, "'" + boolean21 + "' != '" + false + "'");
        assertNotNull(point22);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test470");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        createCourseUI0.addPropertyChangeListener(propertyChangeListener8);
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        createCourseUI10.setLocationRelativeTo((java.awt.Component) createCourseUI11);
        boolean boolean13 = createCourseUI10.isFontSet();
        java.awt.Insets insets14 = createCourseUI10.getInsets();
        java.awt.Event event15 = null;
        boolean boolean18 = createCourseUI10.mouseUp(event15, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle19 = createCourseUI10.getBounds();
        createCourseUI0.setBounds(rectangle19);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
        assertNotNull(insets14);
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertNotNull(rectangle19);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test471");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.FocusTraversalPolicy focusTraversalPolicy2 = createCourseUI0.getFocusTraversalPolicy();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        createCourseUI3.list();
        int int5 = createCourseUI3.countComponents();
        com.example.CreateCourseUI createCourseUI6 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI7 = new com.example.CreateCourseUI();
        createCourseUI6.setLocationRelativeTo((java.awt.Component) createCourseUI7);
        java.awt.Event event9 = null;
        boolean boolean12 = createCourseUI6.mouseUp(event9, (int) '#', 12);
        java.awt.Component component15 = createCourseUI6.getComponentAt((int) (short) 0, (int) (byte) 10);
        boolean boolean16 = createCourseUI6.isForegroundSet();
        createCourseUI6.toBack();
        java.awt.Window.Type type18 = createCourseUI6.getType();
        createCourseUI3.setType(type18);
        createCourseUI0.setType(type18);
        assertNotNull(focusTraversalPolicy2);
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertNotNull(component15);
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(type18.equals(java.awt.Window.Type.NORMAL), "'" + type18 + "' != '" + java.awt.Window.Type.NORMAL + "'");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test472");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = createCourseUI1.requestFocusInWindow(cause11);
        createCourseUI1.setAlwaysOnTop(false);
        java.awt.Image image15 = null;
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        createCourseUI19.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str27 = createCourseUI19.getName();
        java.awt.Dimension dimension28 = createCourseUI19.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener29 = null;
        createCourseUI19.removeWindowFocusListener(windowFocusListener29);
        boolean boolean31 = createCourseUI19.isFocusTraversable();
        java.awt.im.InputMethodRequests inputMethodRequests32 = createCourseUI19.getInputMethodRequests();
        java.awt.event.WindowStateListener windowStateListener33 = null;
        createCourseUI19.removeWindowStateListener(windowStateListener33);
        boolean boolean35 = createCourseUI19.isResizable();
        int int36 = createCourseUI1.checkImage(image15, (int) (byte) 0, 160, (java.awt.image.ImageObserver) createCourseUI19);
        java.awt.MenuBar menuBar37 = null;
        createCourseUI1.setMenuBar(menuBar37);
        createCourseUI1.transferFocus();
        createCourseUI1.repaint(64, (int) (byte) -1, 0, 3);
        assertEquals("'" + str9 + "' != '" + "frame437" + "'", str9, "frame437");
        assertNotNull(dimension10);
        assertTrue(boolean12 == false, "'" + boolean12 + "' != '" + false + "'");
        assertEquals("'" + str27 + "' != '" + "frame438" + "'", str27, "frame438");
        assertNotNull(dimension28);
        assertTrue(boolean31 == true, "'" + boolean31 + "' != '" + true + "'");
        assertNull(inputMethodRequests32);
        assertTrue(boolean35 == true, "'" + boolean35 + "' != '" + true + "'");
        assertTrue(int36 == 32, "'" + int36 + "' != '" + 32 + "'");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test473");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        int int5 = createCourseUI0.getComponentCount();
        boolean boolean6 = createCourseUI0.isLightweight();
        createCourseUI0.transferFocusDownCycle();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test474");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        createCourseUI1.doLayout();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        createCourseUI1.setModalExclusionType(modalExclusionType14);
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener16);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray19 = createCourseUI1.getPropertyChangeListeners("frame276");
        assertEquals("'" + str9 + "' != '" + "frame439" + "'", str9, "frame439");
        assertNotNull(dimension10);
        assertNotNull(propertyChangeListenerArray19);
        assertArrayEquals(propertyChangeListenerArray19, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test475");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        createCourseUI1.removeWindowFocusListener(windowFocusListener11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI13.setLocationRelativeTo((java.awt.Component) createCourseUI14);
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI13.mouseUp(event16, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation20 = null;
        createCourseUI13.setComponentOrientation(componentOrientation20);
        int int22 = createCourseUI1.getComponentZOrder((java.awt.Component) createCourseUI13);
        createCourseUI1.hide();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        createCourseUI24.setLocationRelativeTo((java.awt.Component) createCourseUI25);
        createCourseUI25.setAlwaysOnTop(false);
        java.awt.Dialog.ModalExclusionType modalExclusionType29 = createCourseUI25.getModalExclusionType();
        createCourseUI1.setModalExclusionType(modalExclusionType29);
        com.example.CreateCourseUI createCourseUI31 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI32 = new com.example.CreateCourseUI();
        createCourseUI31.setLocationRelativeTo((java.awt.Component) createCourseUI32);
        createCourseUI32.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str40 = createCourseUI32.getName();
        com.example.CreateCourseUI createCourseUI41 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI42 = new com.example.CreateCourseUI();
        createCourseUI41.setLocationRelativeTo((java.awt.Component) createCourseUI42);
        java.awt.Point point44 = createCourseUI42.getLocation();
        java.awt.Component component45 = createCourseUI32.getComponentAt(point44);
        boolean boolean46 = createCourseUI1.contains(point44);
        assertEquals("'" + str9 + "' != '" + "frame440" + "'", str9, "frame440");
        assertNotNull(dimension10);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertTrue(int22 == (-1), "'" + int22 + "' != '" + (-1) + "'");
        assertTrue(modalExclusionType29.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE), "'" + modalExclusionType29 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'");
        assertEquals("'" + str40 + "' != '" + "frame441" + "'", str40, "frame441");
        assertNotNull(point44);
        assertNotNull(component45);
        assertTrue(boolean46 == true, "'" + boolean46 + "' != '" + true + "'");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test476");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Point point7 = createCourseUI0.location();
        java.awt.Image image8 = null;
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        boolean boolean14 = createCourseUI11.isFontSet();
        java.awt.Insets insets15 = createCourseUI11.getInsets();
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI11.mouseUp(event16, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle20 = createCourseUI11.getBounds();
        int int21 = createCourseUI0.checkImage(image8, (int) (short) -1, (int) (short) 100, (java.awt.image.ImageObserver) createCourseUI11);
        java.awt.Event event22 = null;
        boolean boolean24 = createCourseUI0.gotFocus(event22, (java.lang.Object) "frame375");
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(point7);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(insets15);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNotNull(rectangle20);
        assertTrue(int21 == 32, "'" + int21 + "' != '" + 32 + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test477");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        boolean boolean17 = createCourseUI1.contains((int) 'a', (int) (short) 0);
        com.example.CreateCourseUI createCourseUI18 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        createCourseUI18.setLocationRelativeTo((java.awt.Component) createCourseUI19);
        java.awt.Event event21 = null;
        boolean boolean24 = createCourseUI18.mouseUp(event21, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation25 = null;
        createCourseUI18.setComponentOrientation(componentOrientation25);
        java.awt.Component component29 = createCourseUI18.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI30 = new com.example.CreateCourseUI();
        float float31 = createCourseUI30.getAlignmentX();
        java.awt.Event event32 = null;
        boolean boolean34 = createCourseUI30.action(event32, (java.lang.Object) (byte) 1);
        boolean boolean35 = createCourseUI30.isFocusOwner();
        java.awt.Color color36 = createCourseUI30.getBackground();
        createCourseUI18.setBackground(color36);
        boolean boolean38 = createCourseUI18.isAlwaysOnTopSupported();
        java.awt.Image image39 = null;
        com.example.CreateCourseUI createCourseUI42 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI43 = new com.example.CreateCourseUI();
        createCourseUI42.setLocationRelativeTo((java.awt.Component) createCourseUI43);
        createCourseUI43.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str51 = createCourseUI43.getName();
        java.awt.Dimension dimension52 = createCourseUI43.minimumSize();
        java.awt.Event event53 = null;
        boolean boolean55 = createCourseUI43.gotFocus(event53, (java.lang.Object) 9);
        java.awt.Component component56 = createCourseUI43.getGlassPane();
        boolean boolean57 = createCourseUI18.prepareImage(image39, 16, 100, (java.awt.image.ImageObserver) component56);
        createCourseUI1.setLocationRelativeTo((java.awt.Component) createCourseUI18);
        java.awt.Cursor cursor59 = null;
        createCourseUI1.setCursor(cursor59);
        boolean boolean61 = createCourseUI1.hasFocus();
        assertEquals("'" + str9 + "' != '" + "frame442" + "'", str9, "frame442");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertTrue(boolean17 == true, "'" + boolean17 + "' != '" + true + "'");
        assertTrue(boolean24 == false, "'" + boolean24 + "' != '" + false + "'");
        assertNotNull(component29);
        assertTrue(float31 == 0.5f, "'" + float31 + "' != '" + 0.5f + "'");
        assertTrue(boolean34 == false, "'" + boolean34 + "' != '" + false + "'");
        assertTrue(boolean35 == false, "'" + boolean35 + "' != '" + false + "'");
        assertNotNull(color36);
        assertTrue(boolean38 == true, "'" + boolean38 + "' != '" + true + "'");
        assertEquals("'" + str51 + "' != '" + "frame443" + "'", str51, "frame443");
        assertNotNull(dimension52);
        assertTrue(boolean55 == false, "'" + boolean55 + "' != '" + false + "'");
        assertNotNull(component56);
        assertTrue(boolean57 == true, "'" + boolean57 + "' != '" + true + "'");
        assertTrue(boolean61 == false, "'" + boolean61 + "' != '" + false + "'");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test478");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        java.awt.Dimension dimension10 = createCourseUI0.minimumSize();
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        java.awt.Point point14 = createCourseUI12.getLocation();
        java.awt.Component component15 = createCourseUI0.getComponentAt(point14);
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI0.mouseUp(event16, 11, 5);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray20 = createCourseUI0.getWindowFocusListeners();
        int int21 = createCourseUI0.getWidth();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension10);
        assertNotNull(point14);
        assertNotNull(component15);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNotNull(windowFocusListenerArray20);
        assertArrayEquals(windowFocusListenerArray20, new java.awt.event.WindowFocusListener[] {});
        assertTrue(int21 == 500, "'" + int21 + "' != '" + 500 + "'");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test479");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        createCourseUI0.pack();
        boolean boolean6 = createCourseUI0.isVisible();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test480");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isFocusTraversable();
        int int3 = createCourseUI0.countComponents();
        java.awt.Graphics graphics4 = createCourseUI0.getGraphics();
        createCourseUI0.addNotify();
        createCourseUI0.firePropertyChange("frame184", (long) 5, (long) '#');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = createCourseUI0.getPropertyChangeListeners();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == true, "'" + boolean2 + "' != '" + true + "'");
        assertTrue(int3 == 1, "'" + int3 + "' != '" + 1 + "'");
        assertNull(graphics4);
        assertNotNull(propertyChangeListenerArray10);
        assertArrayEquals(propertyChangeListenerArray10, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test481");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        java.awt.Event event6 = null;
        boolean boolean9 = createCourseUI3.mouseUp(event6, (int) '#', 12);
        java.awt.Color color10 = createCourseUI3.getBackground();
        java.awt.LayoutManager layoutManager11 = createCourseUI3.getLayout();
        createCourseUI0.setLayout(layoutManager11);
        createCourseUI0.revalidate();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray15 = createCourseUI0.getPropertyChangeListeners("frame88");
        createCourseUI0.validate();
        createCourseUI0.requestFocus();
        assertTrue(boolean9 == false, "'" + boolean9 + "' != '" + false + "'");
        assertNotNull(color10);
        assertNotNull(layoutManager11);
        assertNotNull(propertyChangeListenerArray15);
        assertArrayEquals(propertyChangeListenerArray15, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test482");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Event event2 = null;
        boolean boolean4 = createCourseUI0.action(event2, (java.lang.Object) (byte) 1);
        createCourseUI0.setName("");
        java.awt.Point point7 = createCourseUI0.location();
        java.awt.Image image8 = null;
        com.example.CreateCourseUI createCourseUI11 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI11.setLocationRelativeTo((java.awt.Component) createCourseUI12);
        boolean boolean14 = createCourseUI11.isFontSet();
        java.awt.Insets insets15 = createCourseUI11.getInsets();
        java.awt.Event event16 = null;
        boolean boolean19 = createCourseUI11.mouseUp(event16, (int) (byte) 1, (int) '4');
        java.awt.Rectangle rectangle20 = createCourseUI11.getBounds();
        int int21 = createCourseUI0.checkImage(image8, (int) (short) -1, (int) (short) 100, (java.awt.image.ImageObserver) createCourseUI11);
        java.awt.event.KeyListener[] keyListenerArray22 = createCourseUI0.getKeyListeners();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertNotNull(point7);
        assertTrue(boolean14 == false, "'" + boolean14 + "' != '" + false + "'");
        assertNotNull(insets15);
        assertTrue(boolean19 == false, "'" + boolean19 + "' != '" + false + "'");
        assertNotNull(rectangle20);
        assertTrue(int21 == 32, "'" + int21 + "' != '" + 32 + "'");
        assertNotNull(keyListenerArray22);
        assertArrayEquals(keyListenerArray22, new java.awt.event.KeyListener[] {});
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test483");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.lang.String str10 = createCourseUI1.getTitle();
        createCourseUI1.setAlwaysOnTop(true);
        java.awt.Container container13 = createCourseUI1.getContentPane();
        java.awt.Component component14 = createCourseUI1.getGlassPane();
        com.example.CreateCourseUI createCourseUI15 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        createCourseUI15.setLocationRelativeTo((java.awt.Component) createCourseUI16);
        createCourseUI16.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str24 = createCourseUI16.getName();
        java.awt.Dimension dimension25 = createCourseUI16.minimumSize();
        java.awt.Point point27 = createCourseUI16.getMousePosition(false);
        boolean boolean28 = createCourseUI16.isShowing();
        boolean boolean29 = createCourseUI16.isShowing();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component30 = createCourseUI1.add((java.awt.Component) createCourseUI16);
            fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame445" + "'", str9, "frame445");
        assertEquals("'" + str10 + "' != '" + "Create Course" + "'", str10, "Create Course");
        assertNotNull(container13);
        assertNotNull(component14);
        assertEquals("'" + str24 + "' != '" + "frame446" + "'", str24, "frame446");
        assertNotNull(dimension25);
        assertNull(point27);
        assertTrue(boolean28 == false, "'" + boolean28 + "' != '" + false + "'");
        assertTrue(boolean29 == false, "'" + boolean29 + "' != '" + false + "'");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test484");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        javax.swing.JMenuBar jMenuBar7 = createCourseUI0.getJMenuBar();
        java.awt.event.WindowStateListener[] windowStateListenerArray8 = createCourseUI0.getWindowStateListeners();
        createCourseUI0.setEnabled(true);
        javax.swing.JMenuBar jMenuBar11 = null;
        createCourseUI0.setJMenuBar(jMenuBar11);
        java.awt.event.WindowFocusListener windowFocusListener13 = null;
        createCourseUI0.removeWindowFocusListener(windowFocusListener13);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNull(jMenuBar7);
        assertNotNull(windowStateListenerArray8);
        assertArrayEquals(windowStateListenerArray8, new java.awt.event.WindowStateListener[] {});
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test485");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        createCourseUI0.setFocusable(false);
        boolean boolean4 = createCourseUI0.isFocusTraversalPolicyProvider();
        com.example.CreateCourseUI createCourseUI5 = new com.example.CreateCourseUI();
        createCourseUI5.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        createCourseUI5.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        createCourseUI5.firePropertyChange("frame3", (-1L), (long) '4');
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        createCourseUI13.setName("");
        com.example.CreateCourseUI createCourseUI16 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI17 = new com.example.CreateCourseUI();
        createCourseUI16.setLocationRelativeTo((java.awt.Component) createCourseUI17);
        java.awt.Event event19 = null;
        boolean boolean22 = createCourseUI16.mouseUp(event19, (int) '#', 12);
        java.awt.Color color23 = createCourseUI16.getBackground();
        java.awt.LayoutManager layoutManager24 = createCourseUI16.getLayout();
        createCourseUI13.setLayout(layoutManager24);
        com.example.CreateCourseUI createCourseUI26 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI27 = new com.example.CreateCourseUI();
        createCourseUI26.setLocationRelativeTo((java.awt.Component) createCourseUI27);
        createCourseUI27.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str35 = createCourseUI27.getName();
        com.example.CreateCourseUI createCourseUI36 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI37 = new com.example.CreateCourseUI();
        createCourseUI36.setLocationRelativeTo((java.awt.Component) createCourseUI37);
        java.awt.Point point39 = createCourseUI37.getLocation();
        java.awt.Component component40 = createCourseUI27.getComponentAt(point39);
        createCourseUI13.setLocation(point39);
        java.awt.Rectangle rectangle42 = createCourseUI13.getBounds();
        createCourseUI5.setMaximizedBounds(rectangle42);
        createCourseUI0.setBounds(rectangle42);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean4 == false, "'" + boolean4 + "' != '" + false + "'");
        assertTrue(boolean22 == false, "'" + boolean22 + "' != '" + false + "'");
        assertNotNull(color23);
        assertNotNull(layoutManager24);
        assertEquals("'" + str35 + "' != '" + "frame448" + "'", str35, "frame448");
        assertNotNull(point39);
        assertNotNull(component40);
        assertNotNull(rectangle42);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test486");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setName("");
        boolean boolean3 = createCourseUI0.isFocusOwner();
        java.awt.Rectangle rectangle4 = null;
        createCourseUI0.setMaximizedBounds(rectangle4);
        java.awt.Container container6 = createCourseUI0.getContentPane();
        java.awt.event.WindowListener windowListener7 = null;
        createCourseUI0.removeWindowListener(windowListener7);
        java.awt.Image image9 = null;
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        createCourseUI12.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
        createCourseUI12.removeHierarchyBoundsListener(hierarchyBoundsListener14);
        createCourseUI12.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean20 = createCourseUI12.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray21 = createCourseUI12.getMouseListeners();
        java.awt.Dimension dimension22 = createCourseUI12.minimumSize();
        com.example.CreateCourseUI createCourseUI23 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        createCourseUI23.setLocationRelativeTo((java.awt.Component) createCourseUI24);
        java.awt.Point point26 = createCourseUI24.getLocation();
        java.awt.Component component27 = createCourseUI12.getComponentAt(point26);
        boolean boolean28 = component27.isFocusTraversable();
        int int29 = createCourseUI0.checkImage(image9, (int) '#', (int) '4', (java.awt.image.ImageObserver) component27);
        createCourseUI0.disable();
        java.awt.Point point32 = createCourseUI0.getMousePosition(true);
        assertTrue(boolean3 == false, "'" + boolean3 + "' != '" + false + "'");
        assertNotNull(container6);
        assertTrue(boolean20 == false, "'" + boolean20 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray21);
        assertArrayEquals(mouseListenerArray21, new java.awt.event.MouseListener[] {});
        assertNotNull(dimension22);
        assertNotNull(point26);
        assertNotNull(component27);
        assertTrue(boolean28 == true, "'" + boolean28 + "' != '" + true + "'");
        assertTrue(int29 == 32, "'" + int29 + "' != '" + 32 + "'");
        assertNull(point32);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test487");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        createCourseUI0.pack();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = createCourseUI0.getPropertyChangeListeners("frame11");
        createCourseUI0.list();
        createCourseUI0.disable();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertNotNull(propertyChangeListenerArray7);
        assertArrayEquals(propertyChangeListenerArray7, new java.beans.PropertyChangeListener[] {});
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test488");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        java.lang.String str9 = createCourseUI0.toString();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        createCourseUI0.addInputMethodListener(inputMethodListener10);
        createCourseUI0.setState((int) (byte) -1);
        createCourseUI0.repaint();
        createCourseUI0.doLayout();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertEquals("'" + str9 + "' != '" + "com.example.CreateCourseUI[frame451,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "com.example.CreateCourseUI[frame451,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test489");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.event.MouseListener[] mouseListenerArray4 = createCourseUI0.getMouseListeners();
        int int5 = createCourseUI0.getComponentCount();
        createCourseUI0.firePropertyChange("frame153", (long) 12, (long) ' ');
        java.awt.Rectangle rectangle10 = createCourseUI0.getMaximizedBounds();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray4);
        assertArrayEquals(mouseListenerArray4, new java.awt.event.MouseListener[] {});
        assertTrue(int5 == 1, "'" + int5 + "' != '" + 1 + "'");
        assertNull(rectangle10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test490");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray9 = createCourseUI0.getMouseListeners();
        int int10 = createCourseUI0.getDefaultCloseOperation();
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(mouseListenerArray9);
        assertArrayEquals(mouseListenerArray9, new java.awt.event.MouseListener[] {});
        assertTrue(int10 == 3, "'" + int10 + "' != '" + 3 + "'");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test491");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.ComponentOrientation componentOrientation7 = null;
        createCourseUI0.setComponentOrientation(componentOrientation7);
        java.awt.Component component11 = createCourseUI0.locate((int) '4', (int) (byte) 0);
        com.example.CreateCourseUI createCourseUI12 = new com.example.CreateCourseUI();
        float float13 = createCourseUI12.getAlignmentX();
        java.awt.Event event14 = null;
        boolean boolean16 = createCourseUI12.action(event14, (java.lang.Object) (byte) 1);
        boolean boolean17 = createCourseUI12.isFocusOwner();
        java.awt.Color color18 = createCourseUI12.getBackground();
        createCourseUI0.setBackground(color18);
        boolean boolean20 = createCourseUI0.isEnabled();
        boolean boolean21 = createCourseUI0.isFocusCycleRoot();
        javax.swing.TransferHandler transferHandler22 = createCourseUI0.getTransferHandler();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component11);
        assertTrue(float13 == 0.5f, "'" + float13 + "' != '" + 0.5f + "'");
        assertTrue(boolean16 == false, "'" + boolean16 + "' != '" + false + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertNotNull(color18);
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertTrue(boolean21 == true, "'" + boolean21 + "' != '" + true + "'");
        assertNull(transferHandler22);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test492");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.list();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        createCourseUI0.removeHierarchyBoundsListener(hierarchyBoundsListener2);
        createCourseUI0.firePropertyChange("frame3", (-1L), (long) '4');
        boolean boolean8 = createCourseUI0.isLightweight();
        java.awt.Dimension dimension9 = createCourseUI0.getMaximumSize();
        com.example.CreateCourseUI createCourseUI10 = new com.example.CreateCourseUI();
        float float11 = createCourseUI10.getAlignmentX();
        java.awt.Graphics graphics12 = null;
        createCourseUI10.paintComponents(graphics12);
        java.awt.event.MouseListener[] mouseListenerArray14 = createCourseUI10.getMouseListeners();
        createCourseUI10.pack();
        int int16 = createCourseUI0.getComponentZOrder((java.awt.Component) createCourseUI10);
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(dimension9);
        assertTrue(float11 == 0.5f, "'" + float11 + "' != '" + 0.5f + "'");
        assertNotNull(mouseListenerArray14);
        assertArrayEquals(mouseListenerArray14, new java.awt.event.MouseListener[] {});
        assertTrue(int16 == (-1), "'" + int16 + "' != '" + (-1) + "'");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test493");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        float float1 = createCourseUI0.getAlignmentX();
        java.awt.Graphics graphics2 = null;
        createCourseUI0.paintComponents(graphics2);
        java.awt.Event event4 = null;
        boolean boolean7 = createCourseUI0.mouseMove(event4, (int) ' ', (int) (short) 0);
        boolean boolean8 = createCourseUI0.isValidateRoot();
        assertTrue(float1 == 0.5f, "'" + float1 + "' != '" + 0.5f + "'");
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean8 == true, "'" + boolean8 + "' != '" + true + "'");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test494");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Event event11 = null;
        boolean boolean13 = createCourseUI1.gotFocus(event11, (java.lang.Object) 9);
        java.awt.event.ComponentListener componentListener14 = null;
        createCourseUI1.removeComponentListener(componentListener14);
        java.awt.Event event16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = createCourseUI1.postEvent(event16);
            fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        assertEquals("'" + str9 + "' != '" + "frame454" + "'", str9, "frame454");
        assertNotNull(dimension10);
        assertTrue(boolean13 == false, "'" + boolean13 + "' != '" + false + "'");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test495");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        int int2 = createCourseUI0.getState();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        float float4 = createCourseUI3.getAlignmentX();
        java.awt.Event event5 = null;
        boolean boolean7 = createCourseUI3.action(event5, (java.lang.Object) (byte) 1);
        boolean boolean8 = createCourseUI3.isFocusOwner();
        java.awt.Color color9 = createCourseUI3.getBackground();
        createCourseUI0.setBackground(color9);
        boolean boolean11 = createCourseUI0.isFocusTraversalPolicyProvider();
        java.awt.Insets insets12 = createCourseUI0.insets();
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(int2 == 0, "'" + int2 + "' != '" + 0 + "'");
        assertTrue(float4 == 0.5f, "'" + float4 + "' != '" + 0.5f + "'");
        assertTrue(boolean7 == false, "'" + boolean7 + "' != '" + false + "'");
        assertTrue(boolean8 == false, "'" + boolean8 + "' != '" + false + "'");
        assertNotNull(color9);
        assertTrue(boolean11 == false, "'" + boolean11 + "' != '" + false + "'");
        assertNotNull(insets12);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test496");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        createCourseUI0.setVisible(true);
        int int3 = createCourseUI0.getWidth();
        assertTrue(int3 == 500, "'" + int3 + "' != '" + 500 + "'");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test497");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Color color7 = createCourseUI0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = createCourseUI0.getAccessibleContext();
        createCourseUI0.transferFocusDownCycle();
        java.awt.Component component12 = createCourseUI0.getComponentAt((int) ' ', 4);
        java.awt.Image image13 = null;
        com.example.CreateCourseUI createCourseUI14 = new com.example.CreateCourseUI();
        createCourseUI14.setFocusableWindowState(false);
        float float17 = createCourseUI14.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray18 = createCourseUI14.getHierarchyListeners();
        float float19 = createCourseUI14.getAlignmentY();
        boolean boolean20 = component12.prepareImage(image13, (java.awt.image.ImageObserver) createCourseUI14);
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        createCourseUI21.setName("");
        com.example.CreateCourseUI createCourseUI24 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI25 = new com.example.CreateCourseUI();
        createCourseUI24.setLocationRelativeTo((java.awt.Component) createCourseUI25);
        java.awt.Event event27 = null;
        boolean boolean30 = createCourseUI24.mouseUp(event27, (int) '#', 12);
        java.awt.Color color31 = createCourseUI24.getBackground();
        java.awt.LayoutManager layoutManager32 = createCourseUI24.getLayout();
        createCourseUI21.setLayout(layoutManager32);
        boolean boolean34 = createCourseUI14.isFocusCycleRoot((java.awt.Container) createCourseUI21);
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(color7);
        assertNotNull(accessibleContext8);
        assertNotNull(component12);
        assertTrue(float17 == 1.0f, "'" + float17 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray18);
        assertArrayEquals(hierarchyListenerArray18, new java.awt.event.HierarchyListener[] {});
        assertTrue(float19 == 0.5f, "'" + float19 + "' != '" + 0.5f + "'");
        assertTrue(boolean20 == true, "'" + boolean20 + "' != '" + true + "'");
        assertTrue(boolean30 == false, "'" + boolean30 + "' != '" + false + "'");
        assertNotNull(color31);
        assertNotNull(layoutManager32);
        assertTrue(boolean34 == false, "'" + boolean34 + "' != '" + false + "'");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test498");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        createCourseUI1.repaint(0L, (int) (short) -1, (int) (short) 0, 3, 0);
        java.lang.String str9 = createCourseUI1.getName();
        java.awt.Dimension dimension10 = createCourseUI1.minimumSize();
        java.awt.Point point12 = createCourseUI1.getMousePosition(false);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        createCourseUI1.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = createCourseUI1.isMinimumSizeSet();
        createCourseUI1.enableInputMethods(false);
        javax.swing.JRootPane jRootPane18 = createCourseUI1.getRootPane();
        com.example.CreateCourseUI createCourseUI19 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI20 = new com.example.CreateCourseUI();
        createCourseUI19.setLocationRelativeTo((java.awt.Component) createCourseUI20);
        java.awt.Event event22 = null;
        boolean boolean25 = createCourseUI19.mouseUp(event22, (int) '#', 12);
        java.awt.Color color26 = createCourseUI19.getBackground();
        javax.accessibility.AccessibleContext accessibleContext27 = createCourseUI19.getAccessibleContext();
        java.lang.String str28 = createCourseUI19.toString();
        java.awt.Shape shape29 = null;
        createCourseUI19.setMixingCutoutShape(shape29);
        java.awt.Dimension dimension31 = createCourseUI19.getMinimumSize();
        createCourseUI1.resize(dimension31);
        java.awt.event.FocusListener focusListener33 = null;
        createCourseUI1.removeFocusListener(focusListener33);
        assertEquals("'" + str9 + "' != '" + "frame455" + "'", str9, "frame455");
        assertNotNull(dimension10);
        assertNull(point12);
        assertTrue(boolean15 == false, "'" + boolean15 + "' != '" + false + "'");
        assertNotNull(jRootPane18);
        assertTrue(boolean25 == false, "'" + boolean25 + "' != '" + false + "'");
        assertNotNull(color26);
        assertNotNull(accessibleContext27);
        assertEquals("'" + str28 + "' != '" + "com.example.CreateCourseUI[frame456,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str28, "com.example.CreateCourseUI[frame456,433,184,500x400,invalid,hidden,layout=java.awt.BorderLayout,title=Create Course,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        assertNotNull(dimension31);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test499");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        boolean boolean1 = createCourseUI0.isForegroundSet();
        boolean boolean2 = createCourseUI0.isValid();
        com.example.CreateCourseUI createCourseUI3 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI4 = new com.example.CreateCourseUI();
        createCourseUI3.setLocationRelativeTo((java.awt.Component) createCourseUI4);
        createCourseUI4.setAlwaysOnTop(false);
        int int8 = createCourseUI0.getComponentZOrder((java.awt.Component) createCourseUI4);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = createCourseUI0.getPropertyChangeListeners("frame48");
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        createCourseUI0.addInputMethodListener(inputMethodListener11);
        com.example.CreateCourseUI createCourseUI13 = new com.example.CreateCourseUI();
        float float14 = createCourseUI13.getAlignmentX();
        java.awt.Event event15 = null;
        boolean boolean17 = createCourseUI13.action(event15, (java.lang.Object) (byte) 1);
        boolean boolean18 = createCourseUI13.isFocusOwner();
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        createCourseUI13.addMouseMotionListener(mouseMotionListener19);
        com.example.CreateCourseUI createCourseUI21 = new com.example.CreateCourseUI();
        createCourseUI21.setFocusableWindowState(false);
        float float24 = createCourseUI21.getOpacity();
        java.awt.event.HierarchyListener[] hierarchyListenerArray25 = createCourseUI21.getHierarchyListeners();
        java.awt.Window.Type type26 = createCourseUI21.getType();
        createCourseUI13.setType(type26);
        createCourseUI0.setType(type26);
        assertTrue(boolean1 == false, "'" + boolean1 + "' != '" + false + "'");
        assertTrue(boolean2 == false, "'" + boolean2 + "' != '" + false + "'");
        assertTrue(int8 == (-1), "'" + int8 + "' != '" + (-1) + "'");
        assertNotNull(propertyChangeListenerArray10);
        assertArrayEquals(propertyChangeListenerArray10, new java.beans.PropertyChangeListener[] {});
        assertTrue(float14 == 0.5f, "'" + float14 + "' != '" + 0.5f + "'");
        assertTrue(boolean17 == false, "'" + boolean17 + "' != '" + false + "'");
        assertTrue(boolean18 == false, "'" + boolean18 + "' != '" + false + "'");
        assertTrue(float24 == 1.0f, "'" + float24 + "' != '" + 1.0f + "'");
        assertNotNull(hierarchyListenerArray25);
        assertArrayEquals(hierarchyListenerArray25, new java.awt.event.HierarchyListener[] {});
        assertTrue(type26.equals(java.awt.Window.Type.NORMAL), "'" + type26 + "' != '" + java.awt.Window.Type.NORMAL + "'");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CreateCourseUIRegressionTest0.test500");
        com.example.CreateCourseUI createCourseUI0 = new com.example.CreateCourseUI();
        com.example.CreateCourseUI createCourseUI1 = new com.example.CreateCourseUI();
        createCourseUI0.setLocationRelativeTo((java.awt.Component) createCourseUI1);
        java.awt.Event event3 = null;
        boolean boolean6 = createCourseUI0.mouseUp(event3, (int) '#', 12);
        java.awt.Component component9 = createCourseUI0.getComponentAt((int) (short) 0, (int) (byte) 10);
        createCourseUI0.pack();
        java.awt.Insets insets11 = createCourseUI0.insets();
        boolean boolean12 = createCourseUI0.isBackgroundSet();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray13 = createCourseUI0.getWindowFocusListeners();
        assertTrue(boolean6 == false, "'" + boolean6 + "' != '" + false + "'");
        assertNotNull(component9);
        assertNotNull(insets11);
        assertTrue(boolean12 == true, "'" + boolean12 + "' != '" + true + "'");
        assertNotNull(windowFocusListenerArray13);
        assertArrayEquals(windowFocusListenerArray13, new java.awt.event.WindowFocusListener[] {});
    }
}

