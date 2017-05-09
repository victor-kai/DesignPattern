package com.anz.file;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

public abstract class AbstractFile {

    protected List<Column> header;
    protected List<List<Column>> content;
    protected List<Column> trailer;
    protected BufferedReader readerBuffer;
    protected BufferedOutputStream writerBuffer;
    protected String url;
    protected File file;
    protected String fileType;
    protected String delimtedSybmol;
    protected int length;
    protected boolean hasHeader;
    protected boolean hasTrailer;
    protected boolean hasTitle;
    protected FileProcessor fileProcessor;
    protected LineReader lineReader;
    protected LineWritor lineWritor;

    protected int bufferSize = 20 * 1024 * 1024;

    public abstract String generateFilename(String filenameRegularExpression);

    public abstract void getBufferedReader() throws IOException;

    public void getFileType() {
        if (url != null) {
            file = new File(url);
        } else {
            return;
        }
        fileType = FilenameUtils.getExtension(file.getName());
    }

    public abstract List<Column> getHeader(FileProcessor fileProcessor) throws IOException;

    public abstract List<Column> getTrailer(FileProcessor fileProcessor) throws IOException;

    public abstract List<List<Column>> getContent(FileProcessor fileProcessor) throws IOException;
}
