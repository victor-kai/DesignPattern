package com.anz.file;

import java.io.IOException;

public class TestDemo {

    private static String path = "C:\\ANZ Materials\\PRDM\\Requirement\\Epic 3. Data Acqusition - APCA HVCS & LVCS files\\APCA Sample files\\";
    private static String bicfile = "BICDirApr16.txt";
    private static String bsbfile = "BSBDirectoryApr16-241.txt";

    public static void main(String[] args) throws IOException {
        testforbic();
    }

    private static void testforbic() throws IOException {
        String url = path + bicfile;

        System.out.println(" " + FileSector.Content.name());
    }

}
