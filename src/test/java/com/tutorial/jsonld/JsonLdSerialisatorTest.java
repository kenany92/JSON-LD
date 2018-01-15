/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.jsonld;

import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsonLdSerialisatorTest {
    
    public JsonLdSerialisatorTest() {
    }

    /**
     * Test of compact method, of class JsonLdSerialisator.
     * @throws java.lang.Exception
     */
    @Test
    public void testCompact() throws Exception {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = cl.getResourceAsStream("file.json");
        JsonLdSerialisator instance = new JsonLdSerialisator();
        Object expResult = null;
        Object result = instance.compact(inputStream);

        assertNotNull("The compaction result is not null", result);

    }
    
}
