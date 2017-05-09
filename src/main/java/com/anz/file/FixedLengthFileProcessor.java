package com.anz.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FixedLengthFileProcessor implements FileProcessor {

    @Override
    public boolean processIngestedFile(String url, Long headerSchemaId, Long schemaId, Long trailerSchemaID)
            throws IOException {

        List<Column> header = new ArrayList<Column>();
        List<Column> content = new ArrayList<Column>();
        List<Column> trailer = new ArrayList<Column>();

        BufferedReader buffer = FileUtil.createReader(url);
        FileReader reader = new FixedLengthFileReader(buffer, header, content, trailer);
        reader.iterateLine(new LineReader<String>() {

            @Override
            public List<Column> parseLine(String object, List<Column> columns) {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public boolean validateHeader(String object, List<Column> columns) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean validateContent(String object, List<Column> columns) {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean validateTrailer(String object, List<Column> columns) {
                // TODO Auto-generated method stub
                return false;
            }

        });

        return true;
    }

    @Override
    public boolean processDistributedFile(String url, Long headerSchemaId, Long schemaId, Long trailerSchemaID)
            throws IOException {
        // TODO Auto-generated method stub
        return false;
    }
}
