package vb;

import android.os.Process;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import qb.c;
import qb.d;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: j, reason: collision with root package name */
    public static final long f93807j = 100000000;

    /* renamed from: k, reason: collision with root package name */
    public static final int f93808k = 151;

    /* renamed from: l, reason: collision with root package name */
    public static final long f93809l = 1000;

    /* renamed from: m, reason: collision with root package name */
    public static final int f93810m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f93811n = 3020;

    /* renamed from: o, reason: collision with root package name */
    public static final String f93812o = "tmp";

    /* renamed from: p, reason: collision with root package name */
    public static final String f93813p = "lock";

    /* renamed from: a, reason: collision with root package name */
    public volatile String f93814a;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f93815b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f93816c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f93817d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f93818e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f93819f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93820g;

    /* renamed from: h, reason: collision with root package name */
    public File f93821h;

    /* renamed from: i, reason: collision with root package name */
    public File f93822i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Comparator<File> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File lhs, File rhs) {
            if (lhs == null && rhs == null) {
                return 0;
            }
            if (lhs == null) {
                return -1;
            }
            if (rhs == null) {
                return 1;
            }
            long lastModified = lhs.lastModified() - rhs.lastModified();
            if (lastModified < 0) {
                return -1;
            }
            return lastModified == 0 ? 0 : 1;
        }
    }

    public a(String path) {
        this(path, f93807j, f93811n);
    }

    public synchronized boolean a() throws Exception {
        File file;
        if (this.f93820g && (file = this.f93821h) != null) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    d(file2);
                }
            }
            return true;
        }
        return false;
    }

    public synchronized void b() {
        File file;
        try {
            if (this.f93820g && (file = this.f93822i) != null) {
                file.delete();
            }
        } finally {
            this.f93820g = false;
            this.f93821h = null;
            this.f93822i = null;
        }
    }

    public boolean c(String name) {
        File j11 = j(name);
        if (j11 == null) {
            return true;
        }
        return j11.delete();
    }

    public final boolean d(File dir) {
        if (dir.isDirectory()) {
            for (String str : dir.list()) {
                if (!d(new File(dir, str))) {
                    return false;
                }
            }
        }
        return dir.delete();
    }

    public synchronized boolean e() throws Exception {
        File file;
        if (this.f93820g && (file = this.f93821h) != null && !d(file)) {
            return false;
        }
        b();
        return true;
    }

    public final String f(String name) {
        if (name == null || "".equals(name.trim())) {
            return null;
        }
        return new String(f.o(name));
    }

    public boolean g(String name) {
        return j(name) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] h(java.lang.String r8) {
        /*
            r7 = this;
            java.io.File r0 = r7.j(r8)
            r1 = 0
            if (r0 == 0) goto L6c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3c
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r0.<init>()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L36
            r3 = 4194304(0x400000, float:5.877472E-39)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
        L15:
            int r4 = r2.read(r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            if (r4 <= 0) goto L25
            r5 = 0
            r0.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            goto L15
        L20:
            r8 = move-exception
        L21:
            r1 = r2
            goto L61
        L23:
            r3 = move-exception
            goto L3f
        L25:
            r0.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            byte[] r8 = r0.toByteArray()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r2.close()     // Catch: java.io.IOException -> L2f
        L2f:
            r0.close()     // Catch: java.io.IOException -> L32
        L32:
            return r8
        L33:
            r8 = move-exception
            r0 = r1
            goto L21
        L36:
            r3 = move-exception
            r0 = r1
            goto L3f
        L39:
            r8 = move-exception
            r0 = r1
            goto L61
        L3c:
            r3 = move-exception
            r0 = r1
            r2 = r0
        L3f:
            boolean r4 = qb.d.b()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L56
            java.lang.String r4 = ""
            java.lang.String r5 = "rcl [%s] get bytes [%s] error"
            java.lang.String r6 = r7.f93814a     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r8 = new java.lang.Object[]{r6, r8}     // Catch: java.lang.Throwable -> L20
            java.lang.String r8 = java.lang.String.format(r5, r8)     // Catch: java.lang.Throwable -> L20
            qb.c.p(r4, r8, r3)     // Catch: java.lang.Throwable -> L20
        L56:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.io.IOException -> L5b
        L5b:
            if (r0 == 0) goto L60
            r0.close()     // Catch: java.io.IOException -> L60
        L60:
            return r1
        L61:
            if (r1 == 0) goto L66
            r1.close()     // Catch: java.io.IOException -> L66
        L66:
            if (r0 == 0) goto L6b
            r0.close()     // Catch: java.io.IOException -> L6b
        L6b:
            throw r8
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.a.h(java.lang.String):byte[]");
    }

    public long i() {
        return this.f93815b;
    }

    public synchronized File j(String name) {
        String f11 = f(name);
        if (f11 != null && !"".equals(f11.trim())) {
            int k11 = k(f11);
            if (k11 >= 0 && k11 < this.f93819f) {
                File file = new File(this.f93821h, "" + k11);
                if (file.exists() && file.isDirectory()) {
                    File file2 = new File(file, f11);
                    if (file2.exists()) {
                        if (file2.isFile()) {
                            return file2;
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    public final int k(String name) {
        if (name != null && !"".equals(name.trim())) {
            byte[] bytes = name.getBytes();
            if (bytes != null && bytes.length != 0) {
                int length = bytes.length;
                int i11 = 0;
                byte b11 = 1;
                int i12 = 0;
                while (i11 < length) {
                    i12 = (i12 + (bytes[i11] * b11)) % this.f93819f;
                    i11++;
                    b11++;
                }
                while (i12 < 0) {
                    i12 += this.f93819f;
                }
                return i12 % this.f93819f;
            }
            if (d.b()) {
                c.q("", "rcl %s get dir id %s sign md5 error", this.f93814a, name);
            }
        }
        return -1;
    }

    public int l() {
        return this.f93816c;
    }

    public String m() {
        return this.f93814a;
    }

    public final LinkedList<File> n(File subDir) {
        File[] listFiles = subDir.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return null;
        }
        LinkedList<File> linkedList = new LinkedList<>();
        for (File file : listFiles) {
            linkedList.add(file);
        }
        Collections.sort(linkedList, new b());
        return linkedList;
    }

    public String o(String name) {
        return p(name, "UTF-8");
    }

    public String p(String name, String encoding) {
        byte[] h11 = h(name);
        if (h11 != null) {
            try {
                return new String(h11, encoding);
            } catch (Exception e11) {
                if (d.b()) {
                    c.p("", String.format("rcl [%s] get string [%s] encoding [%s] error", this.f93814a, name, encoding), e11);
                }
            }
        }
        return null;
    }

    public synchronized boolean q(boolean autoCreate) throws Exception {
        PrintWriter printWriter;
        if (this.f93820g) {
            if (d.b()) {
                c.q("", "rcl %s has been opened", this.f93814a);
            }
            return false;
        }
        try {
            File file = new File(this.f93814a);
            this.f93821h = file;
            if (file.exists() && !this.f93821h.isDirectory()) {
                if (d.b()) {
                    c.q("", "rcl %s is not a dir", this.f93814a);
                }
                return false;
            }
            if (!this.f93821h.exists()) {
                if (!autoCreate) {
                    if (d.b()) {
                        c.q("", "rcl %s dir does not exist, and not auto create", this.f93814a);
                    }
                    if (!this.f93820g) {
                        this.f93821h = null;
                        this.f93822i = null;
                    }
                    return false;
                }
                if (!this.f93821h.mkdirs()) {
                    if (d.b()) {
                        c.q("", "rcl %s mkdirs %s error", this.f93814a, this.f93821h.getAbsolutePath());
                    }
                    if (!this.f93820g) {
                        this.f93821h = null;
                        this.f93822i = null;
                    }
                    return false;
                }
                for (int i11 = 0; i11 < this.f93819f; i11++) {
                    File file2 = new File(this.f93821h, "" + i11);
                    if (!file2.mkdir()) {
                        if (d.b()) {
                            c.q("", "rcl %s mkdir %s error", this.f93814a, file2.getAbsolutePath());
                        }
                        if (!this.f93820g) {
                            this.f93821h = null;
                            this.f93822i = null;
                        }
                        return false;
                    }
                }
            }
            File file3 = new File(this.f93821h, f93813p);
            this.f93822i = file3;
            if (!file3.exists()) {
                if (!this.f93822i.createNewFile()) {
                    if (d.b()) {
                        c.q("", "rcl %s create lock file %s error", this.f93814a, this.f93822i.getAbsolutePath());
                    }
                    if (!this.f93820g) {
                        this.f93821h = null;
                        this.f93822i = null;
                    }
                    return false;
                }
                int myPid = Process.myPid();
                try {
                    printWriter = new PrintWriter(this.f93822i);
                    try {
                        printWriter.println(myPid);
                        printWriter.flush();
                        printWriter.close();
                    } catch (Throwable th2) {
                        th = th2;
                        if (printWriter != null) {
                            printWriter.flush();
                            printWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    printWriter = null;
                }
            }
            this.f93820g = true;
            return true;
        } finally {
            if (!this.f93820g) {
                this.f93821h = null;
                this.f93822i = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[Catch: all -> 0x0054, SYNTHETIC, TRY_ENTER, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x0005, B:6:0x000c, B:9:0x001a, B:12:0x0022, B:14:0x0028, B:17:0x002e, B:19:0x004c, B:24:0x0057, B:26:0x005d, B:28:0x0063, B:30:0x0069, B:33:0x007c, B:35:0x0083, B:37:0x0089, B:39:0x008f, B:41:0x0098, B:44:0x00a4, B:46:0x00aa, B:51:0x00bd, B:52:0x00c3, B:54:0x00c9, B:56:0x00d5, B:58:0x00e2, B:61:0x00e9, B:63:0x00ef, B:65:0x00f7, B:69:0x0107, B:71:0x010d, B:76:0x0122, B:78:0x0128, B:82:0x014d, B:84:0x0158, B:104:0x01ad, B:106:0x01b0, B:116:0x01ba, B:118:0x01bd, B:157:0x01f8, B:150:0x01fd, B:151:0x0200, B:141:0x01ec, B:137:0x01f1), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean r(java.lang.String r19, java.io.File r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.a.r(java.lang.String, java.io.File, boolean):boolean");
    }

    public synchronized boolean s(String name, InputStream is2) {
        FileOutputStream fileOutputStream;
        if (name != null) {
            if (!"".equals(name.trim()) && is2 != null) {
                File file = new File(this.f93821h, f93812o);
                if (file.exists() && !file.isDirectory()) {
                    return false;
                }
                if (!file.exists() && !file.mkdirs()) {
                    if (d.b()) {
                        c.q("", "rcl %s mkdirs %s error", this.f93814a, file.getAbsoluteFile().toString());
                    }
                    return false;
                }
                File file2 = new File(file, f(name + "." + System.currentTimeMillis()));
                if (file2.exists() && !file2.delete()) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                try {
                    byte[] bArr = new byte[4194304];
                    while (true) {
                        int read = is2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    boolean r11 = r(name, file2, true);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                    if (!r11) {
                        file2.delete();
                    }
                    return r11;
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream2 = fileOutputStream;
                    if (d.b()) {
                        c.p("", String.format("rcl [%s] save [%s] error", this.f93814a, name), e);
                    }
                    file2.delete();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    file2.delete();
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    file2.delete();
                    throw th;
                }
            }
        }
        return false;
    }

    public boolean t(String name, String content, String encoding) {
        if (content != null && !"".equals(content)) {
            try {
                byte[] bytes = content.getBytes(encoding);
                return u(name, bytes, bytes.length);
            } catch (UnsupportedEncodingException unused) {
                if (d.b()) {
                    c.q("rcl %s save %s content %s encoding %s error", this.f93814a, name, content, encoding);
                }
            }
        }
        return false;
    }

    public boolean u(String name, byte[] bytes, int length) {
        if (name == null || "".equals(name.trim()) || bytes == null || bytes.length < length) {
            return false;
        }
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bytes, 0, length);
            try {
                boolean s11 = s(name, byteArrayInputStream2);
                try {
                    byteArrayInputStream2.close();
                } catch (IOException unused) {
                }
                return s11;
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream = byteArrayInputStream2;
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public a(String path, int maxFileCount) {
        this(path, Long.MAX_VALUE, maxFileCount);
    }

    public a(String path, long capacity, int maxFileCount) {
        this.f93820g = false;
        this.f93821h = null;
        this.f93822i = null;
        if (path != null && !"".equals(path.trim()) && capacity > 0 && maxFileCount > 0) {
            this.f93814a = path;
            this.f93815b = capacity;
            this.f93816c = maxFileCount;
            this.f93817d = 151;
            this.f93819f = maxFileCount / this.f93817d;
            if (this.f93819f < 1) {
                this.f93819f = 1;
            }
            this.f93818e = capacity / this.f93819f;
            if (this.f93818e < 1000) {
                this.f93818e = 1000L;
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
