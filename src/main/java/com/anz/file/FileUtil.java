package com.anz.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileUtil {

    private static int BUFFER_READER_SIZE = 20 * 1024 * 1024;

    public static BufferedReader createReader(String url) throws FileNotFoundException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(url));
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(isr, BUFFER_READER_SIZE);
        return br;

    }

}
