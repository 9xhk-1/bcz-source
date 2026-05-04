package g80;

import androidx.camera.core.impl.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Random;
import n6.m;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f53487a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f53488b;

    /* renamed from: c, reason: collision with root package name */
    public static String f53489c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f53490d = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final String f53491a = "jansi-" + c.i();

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f53491a) && !str.endsWith(".lck");
        }
    }

    public static void a() {
        File[] listFiles = new File(h().getAbsolutePath()).listFiles(new a());
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e11) {
                        System.err.println("Failed to delete old native lib" + e11.getMessage());
                    }
                }
            }
        }
    }

    public static String b(InputStream inputStream, InputStream inputStream2) throws IOException {
        byte[] bArr = new byte[8192];
        byte[] bArr2 = new byte[8192];
        do {
            int o11 = o(inputStream, bArr);
            int o12 = o(inputStream2, bArr2);
            if (o11 <= 0) {
                if (o12 > 0) {
                    return "EOF on first stream but not second";
                }
                return null;
            }
            if (o12 <= 0) {
                return "EOF on second stream but not first";
            }
            if (o12 != o11) {
                return "Read size different (" + o11 + " vs " + o12 + j.f81007d;
            }
        } while (Arrays.equals(bArr, bArr2));
        return "Content differs";
    }

    public static boolean c(String str, String str2, String str3) {
        InputStream resourceAsStream;
        Path path;
        StandardCopyOption standardCopyOption;
        String str4 = str + "/" + str2;
        String format = String.format("jansi-%s-%s-%s", i(), n(), str2);
        File file = new File(str3, format);
        File file2 = new File(str3, format + ".lck");
        try {
            try {
                resourceAsStream = c.class.getResourceAsStream(str4);
            } catch (Throwable th2) {
                file.deleteOnExit();
                file2.deleteOnExit();
                throw th2;
            }
        } catch (IOException e11) {
            System.err.println(e11.getMessage());
        }
        try {
            if (!file2.exists()) {
                new FileOutputStream(file2).close();
            }
            path = file.toPath();
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            Files.copy(resourceAsStream, path, standardCopyOption);
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            file.deleteOnExit();
            file2.deleteOnExit();
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(true);
            InputStream resourceAsStream2 = c.class.getResourceAsStream(str4);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    String b11 = b(resourceAsStream2, fileInputStream);
                    if (b11 != null) {
                        throw new RuntimeException(String.format("Failed to write a native library file at %s because %s", file, b11));
                    }
                    fileInputStream.close();
                    if (resourceAsStream2 != null) {
                        resourceAsStream2.close();
                    }
                    if (m(file)) {
                        f53489c = c.class.getResource(str4).toExternalForm();
                        return true;
                    }
                    return false;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static int d() {
        String[] split = i().split("\\.");
        if (split.length > 0) {
            return Integer.parseInt(split[0]);
        }
        return 1;
    }

    public static int e() {
        String[] split = i().split("\\.");
        if (split.length > 1) {
            return Integer.parseInt(split[1]);
        }
        return 0;
    }

    public static String f() {
        return f53488b;
    }

    public static String g() {
        return f53489c;
    }

    public static File h() {
        return new File(System.getProperty("jansi.tmpdir", System.getProperty("java.io.tmpdir")));
    }

    public static String i() {
        URL resource = c.class.getResource("/org/fusesource/jansi/jansi.properties");
        String str = "unknown";
        if (resource != null) {
            try {
                Properties properties = new Properties();
                properties.load(resource.openStream());
                str = properties.getProperty("version", "unknown");
                return str.trim().replaceAll("[^0-9.]", "");
            } catch (IOException e11) {
                System.err.println(e11);
            }
        }
        return str;
    }

    public static boolean j(String str) {
        return c.class.getResource(str) != null;
    }

    public static synchronized boolean k() {
        boolean z11;
        synchronized (c.class) {
            if (!f53487a) {
                Thread thread = new Thread(new Runnable() { // from class: g80.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a();
                    }
                }, "cleanup");
                thread.setPriority(1);
                thread.setDaemon(true);
                thread.start();
            }
            try {
                l();
            } catch (Exception e11) {
                if (!Boolean.parseBoolean(System.getProperty(f80.f.f51317r, m.f74525c))) {
                    throw new RuntimeException("Unable to load jansi native library. You may want set the `jansi.graceful` system property to true to be able to use Jansi on your platform", e11);
                }
            }
            z11 = f53487a;
        }
        return z11;
    }

    public static void l() throws Exception {
        if (f53487a) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        String property = System.getProperty("library.jansi.path");
        String property2 = System.getProperty("library.jansi.name");
        if (property2 == null) {
            property2 = System.mapLibraryName("jansi");
            if (property2.endsWith(".dylib")) {
                property2 = property2.replace(".dylib", ".jnilib");
            }
        }
        if (property != null) {
            String str = property + "/" + h.c();
            if (m(new File(str, property2))) {
                f53487a = true;
                return;
            }
            linkedList.add(str);
            if (m(new File(property, property2))) {
                f53487a = true;
                return;
            }
            linkedList.add(property);
        }
        String format = String.format("/%s/native/%s", c.class.getPackage().getName().replace('.', '/'), h.c());
        if (j(format + "/" + property2)) {
            if (c(format, property2, h().getAbsolutePath())) {
                f53487a = true;
                return;
            }
            linkedList.add(format);
        }
        for (String str2 : System.getProperty("java.library.path", "").split(File.pathSeparator)) {
            if (!str2.isEmpty()) {
                if (m(new File(str2, property2))) {
                    f53487a = true;
                    return;
                }
                linkedList.add(str2);
            }
        }
        throw new Exception(String.format("No native library found for os.name=%s, os.arch=%s, paths=[%s]", h.d(), h.a(), u.a(File.pathSeparator, linkedList)));
    }

    public static boolean m(File file) {
        if (file.exists()) {
            try {
                String absolutePath = file.getAbsolutePath();
                System.load(absolutePath);
                f53488b = absolutePath;
                return true;
            } catch (UnsatisfiedLinkError e11) {
                if (file.canExecute()) {
                    System.err.printf("Failed to load native library:%s. osinfo: %s%n", file.getName(), h.c());
                } else {
                    System.err.printf("Failed to load native library:%s. The native library file at %s is not executable, make sure that the directory is mounted on a partition without the noexec flag, or set the jansi.tmpdir system property to point to a proper location.  osinfo: %s%n", file.getName(), file, h.c());
                }
                System.err.println(e11);
            }
        }
        return false;
    }

    public static String n() {
        return Long.toHexString(new Random().nextLong());
    }

    public static int o(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            int read = inputStream.read(bArr, i11, length - i11);
            if (read <= 0) {
                break;
            }
            i11 += read;
        }
        return i11;
    }
}
