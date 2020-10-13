package com.playalong.InMemoryFileSystem;

public abstract class FileEntity {

    /**
     *  A file system will have different files and directories
     *  directories will have sub-directories
     *  Add a file to a directory
     *  Add a new directory to the file system
     *  Delete a file
     *  Delete a Directory
     *  Open a file => Get the default application to open and open the file
     *              => change the last Accessed of the file
     *              => change the last Accessed of the parent directories
     *  Open a Directory => Show the contents of the directory
     *  Upon deleting a file, we assume that there is a function that physically deletes the file.
     *  We just take care of removing it from the hierarchy.
     *  Update name
     */

    protected String name;
    protected long createdAt;
    protected long lastModifiedAt;
    protected long lastAccessedAt;
    protected Directory parent;
    protected int size;

    //constructor
    public FileEntity(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(long lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastAccessedAt(long lastAccessedAt) {
        this.lastAccessedAt = lastAccessedAt;
    }

    public abstract int size();

    public abstract void deleteEntity();

    public void updateName(String name) {
        this.name = name;
    }

}
