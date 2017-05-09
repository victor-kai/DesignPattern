package com.anz.file;

import java.io.IOException;

public interface FileProcessor {

    public boolean processIngestedFile(String url, Long headerSchemaId, Long schemaId, Long trailerSchemaID)
            throws IOException;

    public boolean processDistributedFile(String url, Long headerSchemaId, Long schemaId, Long trailerSchemaID)
            throws IOException;

}
