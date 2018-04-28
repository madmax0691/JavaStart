import javax.security.auth.callback.TextOutputCallback;

public class BytesConverter {
    public static void main(String[] args) {
        long totalBytes = 254318501496L;

        long gigaBytes = totalBytes / (long)Math.pow(10, 3);
        long megaBytes = totalBytes/(long)(Math.pow(10, 3));
        long kiloBytes = totalBytes/(long)(Math.pow(2, 2));
        long bytes = totalBytes%(long)(Math.pow(2, 10));

        System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                + kiloBytes + " KB, " + bytes + " B");
    }
}
