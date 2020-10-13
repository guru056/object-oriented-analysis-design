package com.playalong.InMemoryFileSystem;

public class File extends FileEntity {

    private String extension;
    final String DEFAULT_EXT = "txt";

    public File(String name, Directory parent) {
        super(name, parent);
        this.extension = DEFAULT_EXT;
        size = 0;
        parent.addFileEntity(this);
    }

    public File(String name, Directory parent, String extension) {
        super(name, parent);
        this.extension = extension; //check for valid extensions
        size = 0;
        parent.addFileEntity(this);
    }

    public File(String name, Directory parent, String extension, int size) {
        super(name, parent);
        this.extension = extension; //check for valid extensions
        this.size = size;
        parent.addFileEntity(this);
    }

    @Override
    public int size() {
        return size;
    }

    public void open() {
        //find the default application
        //open the file using the application
    }

    @Override
    public void deleteEntity() {
        this.parent.getChildren().remove(this);
    }
}
