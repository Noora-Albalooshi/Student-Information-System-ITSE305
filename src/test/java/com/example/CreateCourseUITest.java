package com.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class CreateCourseUITest {

    private CreateCourseUI ui;

    @AfterEach
void tearDown() throws Exception {
    if (ui != null) {
        SwingUtilities.invokeAndWait(() -> ui.dispose());
    }
}

    @Test
    void testUIComponentsExist() throws Exception {
        SwingUtilities.invokeAndWait(() -> ui = new CreateCourseUI());

        JTextField idField = (JTextField) getPrivateField(ui, "idField");
        JTextField nameField = (JTextField) getPrivateField(ui, "nameField");
        JTextField creditField = (JTextField) getPrivateField(ui, "creditField");
        JTextField prerequisiteField = (JTextField) getPrivateField(ui, "prerequisiteField");
        JTextArea outputArea = (JTextArea) getPrivateField(ui, "outputArea");
        JButton addButton = (JButton) getPrivateField(ui, "addButton");

        assertNotNull(idField);
        assertNotNull(nameField);
        assertNotNull(creditField);
        assertNotNull(prerequisiteField);
        assertNotNull(outputArea);
        assertNotNull(addButton);

        assertEquals("Create Course", ui.getTitle());
        assertEquals("Add Course", addButton.getText());
    }

    @Test
    void testAddCourseThroughUI() throws Exception {
        SwingUtilities.invokeAndWait(() -> ui = new CreateCourseUI());

        JTextField idField = (JTextField) getPrivateField(ui, "idField");
        JTextField nameField = (JTextField) getPrivateField(ui, "nameField");
        JTextField creditField = (JTextField) getPrivateField(ui, "creditField");
        JTextField prerequisiteField = (JTextField) getPrivateField(ui, "prerequisiteField");
        JTextArea outputArea = (JTextArea) getPrivateField(ui, "outputArea");
        JButton addButton = (JButton) getPrivateField(ui, "addButton");

        SwingUtilities.invokeAndWait(() -> {
            idField.setText("ITCS113");
            nameField.setText("Java 1 Programming");
            creditField.setText("3");
            prerequisiteField.setText("None");
            addButton.doClick();
        });

        String output = outputArea.getText();

        assertTrue(output.contains("Course added successfully!"));
        assertTrue(output.contains("Course ID: ITCS113"));
        assertTrue(output.contains("Course Name: Java 1 Programming"));
        assertTrue(output.contains("Credit Hours: 3"));
        assertTrue(output.contains("Prerequisite: None"));
    }

    private Object getPrivateField(Object obj, String fieldName) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }
}