/**
 * Oshi (https://github.com/dblock/oshi)
 *
 * Copyright (c) 2010 - 2016 The Oshi Project Team
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Maintainers:
 * dblock[at]dblock[dot]org
 * widdis[at]gmail[dot]com
 * enrico.bianchi[at]gmail[dot]com
 *
 * Contributors:
 * https://github.com/dblock/oshi/graphs/contributors
 */
package oshi.util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * Tests FileUtil
 */
public class FileUtilTest {

    /*
     * File sources
     */
    private static String THISCLASS = "src/test/java/oshi/util/FileUtilTest.java";
    private static String INT_FILE = "src/test/resources/test.integer.txt";
    private static String STRING_FILE = "src/test/resources/test.string.txt";
    private static String NO_FILE = "does/not/exist";

    /**
     * Test read file.
     */
    @Test
    public void testReadFile() {
        List<String> thisFile = null;
        // Try file not found
        thisFile = FileUtil.readFile(NO_FILE);
        assertEquals(0, thisFile.size());
        // Try this file
        thisFile = FileUtil.readFile(THISCLASS);
        // Comment ONE line
        int lineOne = 0;
        // Comment TWO line
        int lineTwo = 0;
        for (int i = 0; i < thisFile.size(); i++) {
            String line = thisFile.get(i);
            if (lineOne == 0 && line.contains("Comment ONE line")) {
                lineOne = i;
                continue;
            }
            if (lineTwo == 0 && line.contains("Comment TWO line")) {
                lineTwo = i;
                break;
            }
        }
        assertEquals(2, lineTwo - lineOne);
    }

    /**
     * Test get*FromFile
     */
    @Test
    public void testGetFromFile() {
        assertEquals(123L, FileUtil.getLongFromFile(INT_FILE));
        assertEquals(0L, FileUtil.getLongFromFile(STRING_FILE));
        assertEquals(0L, FileUtil.getLongFromFile(NO_FILE));

        assertEquals(123, FileUtil.getIntFromFile(INT_FILE));
        assertEquals(0, FileUtil.getIntFromFile(STRING_FILE));
        assertEquals(0, FileUtil.getIntFromFile(NO_FILE));

        assertEquals("123", FileUtil.getStringFromFile(INT_FILE));
        assertEquals("", FileUtil.getStringFromFile(NO_FILE));

        assertEquals(5, FileUtil.getSplitFromFile(STRING_FILE).length);
        assertEquals(0, FileUtil.getSplitFromFile(NO_FILE).length);
    }
}
