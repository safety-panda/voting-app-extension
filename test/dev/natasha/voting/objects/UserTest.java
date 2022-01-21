package dev.natasha.voting.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void newVoterWithParams() {
        Voter voter1 = new Voter(1, true, "Jane", "Doe", 18, "123 Internet Street");
        int id = voter1.getVoterID();

        assertEquals(1, id);
    }

    @Test
    void newVoterNoParams() {
        Voter voter1 = new Voter();
        int id = voter1.getVoterID();

        assertEquals(0, id);
    }

    @Test
    void updatesUserRoleOnVoterCreation() {
        Voter voter1 = new Voter();
        String role = voter1.getRole();

        assertEquals("VOTER", role);
    }

    @Test
    void updatesUserRoleOnAdminCreation() {
        Administrator Admin1 = new Administrator();
        String role = Admin1.getRole();

        assertEquals("ADMINISTRATOR", role);
    }

    @Test
    void updatesUserRoleOnAuditorCreation() {
        Auditor Auditor1 = new Auditor();
        String role = Auditor1.getRole();

        assertEquals("AUDITOR", role);
    }
}