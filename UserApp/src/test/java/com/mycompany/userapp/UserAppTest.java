/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.userapp;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class UserAppTest {

    @Test
    public void testUserConstructor() {
        UserApp user = new UserApp("user1", "user1@cmucs246.com");
        assertEquals(user.getEmail(), "user1@cmucs246.com");
    }

    @Test
    public void testSetEmail() {
        UserApp user = new UserApp("user1", "user1@cmucs246.com");
        user.setEmail("newemail@cmucs246.com");
        assertEquals(user.getEmail(), "newemail@cmucs246.com");
    }

    @Test
    public void testUpdateEmail() {
        UserApp user = new UserApp("user1", "user1@cmucs246.com");
        user.updateEmail("updatedemail@cmucs246.com");
        assertEquals(user.getEmail(), "updatedemail@cmucs246.com");
    }
}

