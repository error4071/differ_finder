package hexlet.code;


public class DiffResult {
    private final Object file1;
    private final Object file2;

    public DiffResult(Object file1, Object file2) {
        this.file1 = file1;
        this.file2 = file2;
    }
    public final Object getFile1() {
        return file1;
    }
    public final Object getFile2() {
        return file2;
    }
}