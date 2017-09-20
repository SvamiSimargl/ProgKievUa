package lesson4;

public class Directory {

    private int size;

    public int getSize() {
        return size;
    }

    public void addFile(File file) {
        size += file.getSize();
    }

    public void addNewDirectory(Directory directory) {
        size += directory.getSize();
    }

}
