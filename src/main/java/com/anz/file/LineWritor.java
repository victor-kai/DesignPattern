package com.anz.file;

import java.util.List;

public interface LineWritor {

    public void write(List<Column> list);

    public boolean validate();
}
