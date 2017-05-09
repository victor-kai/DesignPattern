package com.anz.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public abstract class FileReader {

    protected BufferedReader buffer;

    protected List<Column> headerColumns;
    protected List<Column> contentColumns;
    protected List<Column> trailerColumns;

    public abstract List<Column> iterateLine(LineReader<String> lineReader) throws IOException;

}
