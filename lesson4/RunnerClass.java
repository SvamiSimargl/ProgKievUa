package lesson4;

public class RunnerClass {
    public static void main(String[] args) {
        Directory root = new Directory();
        Directory dir1 = new Directory();
        dir1.addFile(new File("f1", 10));
        dir1.addFile(new File("f2", 20));
        root.addNewDirectory(dir1);

        Directory dir2 = new Directory();
        Directory dir3 = new Directory();
        dir3.addFile(new File("f3", 30));
        dir2.addNewDirectory(dir3);
        dir2.addFile(new File("f4", 40));
        root.addNewDirectory(dir2);

        root.addFile(new File("f5", 50));

        System.out.println("Total size root directory = " + root.getSize() + "B");
    }
}
