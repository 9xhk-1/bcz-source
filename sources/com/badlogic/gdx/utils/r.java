package com.badlogic.gdx.utils;

import com.badlogic.gdx.utils.Architecture;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    public static Os f13437b;

    /* renamed from: c, reason: collision with root package name */
    public static Architecture.Bitness f13438c;

    /* renamed from: d, reason: collision with root package name */
    public static Architecture f13439d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static boolean f13440e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static boolean f13441f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static boolean f13442g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static boolean f13443h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static boolean f13444i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static boolean f13445j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static boolean f13446k;

    /* renamed from: l, reason: collision with root package name */
    public static final HashSet<String> f13447l;

    /* renamed from: m, reason: collision with root package name */
    public static final Random f13448m;

    /* renamed from: a, reason: collision with root package name */
    public String f13449a;

    static {
        Architecture.Bitness bitness = Architecture.Bitness._32;
        f13438c = bitness;
        Architecture architecture = Architecture.x86;
        f13439d = architecture;
        if (System.getProperty("os.name").contains("Windows")) {
            f13437b = Os.Windows;
        } else if (System.getProperty("os.name").contains("Linux")) {
            f13437b = Os.Linux;
        } else if (System.getProperty("os.name").contains("Mac")) {
            f13437b = Os.MacOsX;
        }
        if (System.getProperty("os.arch").startsWith("arm") || System.getProperty("os.arch").startsWith("aarch64")) {
            f13439d = Architecture.ARM;
        } else if (System.getProperty("os.arch").startsWith("riscv")) {
            f13439d = Architecture.RISCV;
        } else if (System.getProperty("os.arch").startsWith("loongarch")) {
            f13439d = Architecture.LOONGARCH;
        }
        if (System.getProperty("os.arch").contains("64") || System.getProperty("os.arch").startsWith("armv8")) {
            f13438c = Architecture.Bitness._64;
        } else if (System.getProperty("os.arch").contains("128")) {
            f13438c = Architecture.Bitness._128;
        }
        boolean z11 = System.getProperty("moe.platform.name") != null;
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.contains("Android Runtime")) {
            f13437b = Os.Android;
            f13438c = bitness;
            f13439d = architecture;
        }
        if (z11 || (f13437b != Os.Android && f13437b != Os.Windows && f13437b != Os.Linux && f13437b != Os.MacOsX)) {
            f13437b = Os.IOS;
            f13438c = bitness;
            f13439d = architecture;
        }
        f13440e = f13437b == Os.Windows;
        f13441f = f13437b == Os.Linux;
        f13442g = f13437b == Os.MacOsX;
        f13443h = f13437b == Os.IOS;
        f13444i = f13437b == Os.Android;
        f13445j = f13439d == Architecture.ARM;
        f13446k = f13438c == Architecture.Bitness._64;
        f13447l = new HashSet<>();
        f13448m = new Random();
    }

    public r() {
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized boolean i(String str) {
        boolean contains;
        synchronized (r.class) {
            contains = f13447l.contains(str);
        }
        return contains;
    }

    public static String n() {
        Random random = f13448m;
        return new UUID(random.nextLong(), random.nextLong()).toString();
    }

    public static synchronized void p(String str) {
        synchronized (r.class) {
            f13447l.add(str);
        }
    }

    public final boolean a(File file) {
        try {
            Method method = File.class.getMethod("canExecute", null);
            if (((Boolean) method.invoke(file, null)).booleanValue()) {
                return true;
            }
            Class cls = Boolean.TYPE;
            File.class.getMethod("setExecutable", cls, cls).invoke(file, Boolean.TRUE, Boolean.FALSE);
            return ((Boolean) method.invoke(file, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean b(File file) {
        File parentFile = file.getParentFile();
        if (!file.exists()) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                return false;
            }
        } else {
            if (!file.canWrite() || !a(file)) {
                return false;
            }
            file = new File(parentFile, n().toString());
        }
        try {
            new FileOutputStream(file).close();
            if (a(file)) {
                file.delete();
                return true;
            }
            file.delete();
            return false;
        } catch (Throwable unused) {
            file.delete();
            return false;
        }
    }

    public String d(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                c(inputStream);
                throw th2;
            }
        }
        c(inputStream);
        return Long.toString(crc32.getValue(), 16);
    }

    public File e(String str, String str2) throws IOException {
        try {
            String d11 = d(o(str));
            if (str2 == null) {
                str2 = d11;
            }
            File h11 = h(str2, new File(str).getName());
            if (h11 == null && (h11 = h(n(), new File(str).getName())) == null) {
                throw new SharedLibraryLoadRuntimeException("Unable to find writable path to extract file. Is the user home directory writable?");
            }
            return f(str, d11, h11);
        } catch (RuntimeException e11) {
            File file = new File(System.getProperty("java.library.path"), str);
            if (file.exists()) {
                return file;
            }
            throw e11;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(9:(4:41|42|(9:9|10|11|12|13|14|15|(3:16|17|(1:21)(2:19|20))|22)|7)|11|12|13|14|15|(4:16|17|(0)(0)|20)|22|7)|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0041, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[EDGE_INSN: B:21:0x0035->B:22:0x0035 BREAK  A[LOOP:0: B:16:0x002e->B:20:0x003d], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File f(java.lang.String r7, java.lang.String r8, java.io.File r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9.exists()
            r1 = 0
            if (r0 == 0) goto L11
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L11
            r0.<init>(r9)     // Catch: java.io.FileNotFoundException -> L11
            java.lang.String r0 = r6.d(r0)     // Catch: java.io.FileNotFoundException -> L11
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L1a
            boolean r8 = r0.equals(r8)
            if (r8 != 0) goto L3b
        L1a:
            java.io.InputStream r8 = r6.o(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51
            java.io.File r0 = r9.getParentFile()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            r0.mkdirs()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L49
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
        L2e:
            int r2 = r8.read(r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            r3 = -1
            if (r2 != r3) goto L3c
            c(r8)
            c(r0)
        L3b:
            return r9
        L3c:
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            goto L2e
        L41:
            r7 = move-exception
        L42:
            r1 = r8
            goto L78
        L44:
            r1 = move-exception
            goto L55
        L46:
            r7 = move-exception
            r0 = r1
            goto L42
        L49:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L55
        L4e:
            r7 = move-exception
            r0 = r1
            goto L78
        L51:
            r8 = move-exception
            r0 = r1
            r1 = r8
            r8 = r0
        L55:
            com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException r2 = new com.badlogic.gdx.utils.SharedLibraryLoadRuntimeException     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "Error extracting file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L41
            r3.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = "\nTo: "
            r3.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L41
            r3.append(r7)     // Catch: java.lang.Throwable -> L41
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L41
            r2.<init>(r7, r1)     // Catch: java.lang.Throwable -> L41
            throw r2     // Catch: java.lang.Throwable -> L41
        L78:
            c(r1)
            c(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.r.f(java.lang.String, java.lang.String, java.io.File):java.io.File");
    }

    public void g(String str, File file) throws IOException {
        f(str, d(o(str)), new File(file, new File(str).getName()));
    }

    public final File h(String str, String str2) {
        File file = new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + str, str2);
        if (!b(file)) {
            try {
                File createTempFile = File.createTempFile(str, null);
                if (createTempFile.delete()) {
                    File file2 = new File(createTempFile, str2);
                    if (b(file2)) {
                        return file2;
                    }
                }
            } catch (IOException unused) {
            }
            File file3 = new File(System.getProperty("user.home") + "/.libgdx/" + str, str2);
            if (b(file3)) {
                return file3;
            }
            File file4 = new File(".temp/" + str, str2);
            if (b(file4)) {
                return file4;
            }
            if (System.getenv("APP_SANDBOX_CONTAINER_ID") == null) {
                return null;
            }
        }
        return file;
    }

    public void j(String str) {
        String m11;
        String str2;
        if (f13437b == Os.IOS) {
            return;
        }
        synchronized (r.class) {
            try {
                if (i(str)) {
                    return;
                }
                m11 = m(str);
                if (f13437b == Os.Android) {
                    System.loadLibrary(m11);
                } else {
                    l(m11);
                }
                p(str);
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't load shared library '");
                sb2.append(m11);
                sb2.append("' for target: ");
                if (f13437b == Os.Android) {
                    str2 = "Android";
                } else {
                    str2 = System.getProperty("os.name") + j2.O + f13439d.name() + j2.O + f13438c.name().substring(1) + "-bit";
                }
                sb2.append(str2);
                throw new SharedLibraryLoadRuntimeException(sb2.toString(), th2);
            } finally {
            }
        }
    }

    public final Throwable k(String str, String str2, File file) {
        try {
            System.load(f(str, str2, file).getAbsolutePath());
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    public final void l(String str) {
        String d11 = d(o(str));
        String name = new File(str).getName();
        Throwable k11 = k(str, d11, new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + d11, name));
        if (k11 == null) {
            return;
        }
        try {
            File createTempFile = File.createTempFile(d11, null);
            if (createTempFile.delete()) {
                if (k(str, d11, createTempFile) == null) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        if (k(str, d11, new File(System.getProperty("user.home") + "/.libgdx/" + d11, name)) == null) {
            return;
        }
        if (k(str, d11, new File(".temp/" + d11, name)) == null) {
            return;
        }
        File file = new File(System.getProperty("java.library.path"), str);
        if (!file.exists()) {
            throw new SharedLibraryLoadRuntimeException(k11);
        }
        System.load(file.getAbsolutePath());
    }

    public String m(String str) {
        if (f13437b == Os.Android) {
            return str;
        }
        return f13437b.getLibPrefix() + str + f13439d.toSuffix() + f13438c.toSuffix() + "." + f13437b.getLibExtension();
    }

    public final InputStream o(String str) {
        if (this.f13449a == null) {
            InputStream resourceAsStream = r.class.getResourceAsStream("/" + str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new SharedLibraryLoadRuntimeException("Unable to read file for extraction: " + str);
        }
        try {
            ZipFile zipFile = new ZipFile(this.f13449a);
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return zipFile.getInputStream(entry);
            }
            throw new SharedLibraryLoadRuntimeException("Couldn't find '" + str + "' in JAR: " + this.f13449a);
        } catch (IOException e11) {
            throw new SharedLibraryLoadRuntimeException("Error reading '" + str + "' in JAR: " + this.f13449a, e11);
        }
    }

    public r(String str) {
        this.f13449a = str;
    }
}
