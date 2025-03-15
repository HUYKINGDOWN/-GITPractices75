/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.cmucs426.model;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class UserTest {

    @Test
    public void testUserConstructor() {
        User user = new User("user1", "user1@cmucs246.com");
        assertEquals(user.getEmail(), "user1@cmucs246.com");
    }

    @Test
    public void testSetEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.setEmail("newemail@cmucs246.com");
        assertEquals(user.getEmail(), "newemail@cmucs246.com");
    }

    @Test
    public void testUpdateEmail() {
        User user = new User("user1", "user1@cmucs246.com");
        user.updateEmail("updatedemail@cmucs246.com");
        assertEquals(user.getEmail(), "updatedemail@cmucs246.com");
    }
}

