package com.playalong.InMemoryFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileEntity {

    private List<FileEntity> children;

    public Directory(String name, Directory parent) {
        super(name, parent);
        children = new ArrayList<>();
    }

    public List<FileEntity> getChildren() {
        return children;
    }

    public void addFileEntity(FileEntity file) { //adding a new file / directory to this directory
        children.add(file);
    }

    @Override
    public int size() {
        int totalSize = 0;
        for (FileEntity file: children) {
            totalSize += file.size();
        }
        return totalSize;
    }

    public List<FileEntity> getContents() {
        return children;
    }

    @Override
    public void deleteEntity() {
        this.children.clear();
        parent.getChildren().remove(this);
    }
}
