package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testCreateNewFileInTemporaryFolder() throws IOException {
        File created = temporaryFolder.newFile("file.txt");

        assertTrue(created.isFile());
        assertEquals(temporaryFolder.getRoot(),created.getParentFile());
    }
}
