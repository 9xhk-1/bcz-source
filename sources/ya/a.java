package ya;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {
    public static boolean a(String path) {
        int lastIndexOf = path.lastIndexOf(File.separator);
        if (lastIndexOf > 0 && !d(path.substring(0, lastIndexOf + 1))) {
            return false;
        }
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static void b(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                b(file2);
            }
        }
        file.delete();
    }

    public static void c(String filename) {
        b(new File(filename));
    }

    public static boolean d(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static boolean e(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return true;
        }
        return file.mkdir();
    }

    public static boolean f(String srcFilename, String dstFilename) {
        return new File(srcFilename).renameTo(new File(dstFilename));
    }

    public static String[] g(String path) {
        int lastIndexOf = path.lastIndexOf(46);
        return lastIndexOf > 0 ? new String[]{path.substring(0, lastIndexOf), path.substring(lastIndexOf + 1)} : new String[]{path, ""};
    }
}
