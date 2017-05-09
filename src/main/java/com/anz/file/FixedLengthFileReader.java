package com.anz.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FixedLengthFileReader extends FileReader {

    public FixedLengthFileReader(BufferedReader buffer, List<Column> headerColumns, List<Column> contentColumns,
            List<Column> trailerColumns) {
        this.headerColumns = headerColumns;
        this.contentColumns = contentColumns;
        this.trailerColumns = trailerColumns;
        this.buffer = buffer;
    }

    @Override
    public List<Column> iterateLine(LineReader<String> lineReader) throws IOException {

        boolean hasHeader = this.headerColumns == null ? false : true;
        boolean hasTrailer = this.trailerColumns == null ? false : true;
        boolean hasTitle = false;

        boolean headerNotValidated = true;
        boolean validationResult = false;
        List<List<Column>> file = new ArrayList<List<Column>>();
        List<Column> oneLine;
        String line;
        String temp = buffer.readLine();

        while ((line = temp) != null) {

            if (headerNotValidated && hasHeader) {
                headerNotValidated = false;
                validationResult = lineReader.validateHeader(line, this.headerColumns);
                if (!validationResult) {
                    break;
                }
            }

            temp = buffer.readLine();
            if (temp == null && hasTrailer) {
                validationResult = lineReader.validateTrailer(line, this.trailerColumns);
                break;

            } else {
                validationResult = lineReader.validateContent(line, contentColumns);
                if (!validationResult) {
                    break;
                }
                oneLine = lineReader.parseLine(line, this.contentColumns);
                file.add(oneLine);
            }

            if (file.size() > 200) {
                storeToDB("");
            }
        }

        if (!validationResult) {
            throw new IOException("Validation failed.");
        }

        return null;
    }

    private void storeToDB(String tablename) {

    }
}
