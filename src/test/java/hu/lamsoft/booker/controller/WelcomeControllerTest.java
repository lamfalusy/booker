package hu.lamsoft.booker.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

class WelcomeControllerTest {

    @Test
    void testGreeting() {
        // Given
        WelcomeController underTest = new WelcomeController();
        Model model = Mockito.mock(Model.class);
        String expected = "welcome";
        
        // When
        String actual = underTest.greeting(model);
        
        // Then
        Assertions.assertEquals(expected, actual);
    }
    
}
