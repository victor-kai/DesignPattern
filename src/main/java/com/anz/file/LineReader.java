package com.anz.file;

import java.util.List;

public interface LineReader<T> {

    public abstract List<Column> parseLine(T object, List<Column> columns);

    public abstract boolean validateHeader(T object, List<Column> columns);

    public abstract boolean validateContent(T object, List<Column> columns);

    public abstract boolean validateTrailer(T object, List<Column> columns);

}
