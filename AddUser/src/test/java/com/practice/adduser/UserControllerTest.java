package com.practice.adduser;

import com.practice.domain.user.GatewayResponse;
import com.practice.domain.user.UserRequest;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserControllerTest {

    @Test
    public void handleRequest() {
        UserController userController = new UserController();
        GatewayResponse result = (GatewayResponse) userController.handleRequest(new UserRequest("Iftekhar"), null);
        assertEquals(result.getStatusCode(), 200);
        assertEquals(result.getHeaders().get("Content-Type"), "application/json");
        String content = result.getBody();
        assertNotNull(content);
        assertTrue(content.contains("\"message\""));
        assertTrue(content.contains("\"hello Iftekhar"));
        assertTrue(content.contains("\"location\""));
    }
}
