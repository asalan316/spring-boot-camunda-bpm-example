package com.ak.bpm;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

@SpringBootTest
public class CredentialsTest {

    @Autowired
    private Credentials credentials;

    @Test
    public void testPASSWORD_isNotEmpty() {
        assertThat(credentials.getPASSWORD()).isNotNull();

    }

    @Test
    public void getUSERNAME() {
    }
}