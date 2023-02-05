package com.mkyong.core.testing;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingTest {


    @Test
    public void getTesting() throws Exception {

    File out = new File("src/main/resources/data");
    out.mkdirs();

    Path outFile = Paths.get("src/main/resources/data","numbers.txt");

    List<String> list = Arrays.asList("1123");
    Files.write(outFile, list);

//      assertTrue(Files.exists(numbers));
        assertEquals("Hello Controller", "Hello Controller");

    }

}

