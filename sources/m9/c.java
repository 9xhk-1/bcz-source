package m9;

import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import ub.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f72679e = "QiniuResourceDownloader";

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f72680f;

    /* renamed from: g, reason: collision with root package name */
    public static String[] f72681g;

    /* renamed from: a, reason: collision with root package name */
    public int f72682a;

    /* renamed from: b, reason: collision with root package name */
    public ub.a f72683b = new a.b().a();

    /* renamed from: c, reason: collision with root package name */
    public int f72684c;

    /* renamed from: d, reason: collision with root package name */
    public float f72685d;

    static {
        String[] strArr = {gb.d.f53556a, gb.d.f53557b};
        f72680f = strArr;
        f72681g = strArr;
    }

    public c() {
        f(3000);
        k(5000);
        this.f72683b.F(2);
    }

    public static String[] c() {
        return f72681g;
    }

    public static String d(String urlPath) {
        return e(f72681g[0], urlPath);
    }

    public static String e(String dns, String urlPath) {
        if (TextUtils.isEmpty(urlPath)) {
            return null;
        }
        if (urlPath.startsWith("http")) {
            return urlPath;
        }
        String replace = urlPath.replace(" ", "%20");
        if (replace.charAt(0) != '/') {
            return String.format("%s/%s", dns, replace);
        }
        return dns + replace;
    }

    public static void g(List<String> dns) {
        if (xb.e.h(dns)) {
            return;
        }
        h((String[]) dns.toArray(new String[dns.size()]));
    }

    public static void h(String... dns) {
        if (dns == null || dns.length <= 0) {
            return;
        }
        qb.c.b(f72679e, "setDns " + Arrays.toString(dns), new Object[0]);
        f72681g = dns;
    }

    public File a(String urlPath, String path) throws Exception {
        File file;
        if (TextUtils.isEmpty(urlPath)) {
            throw new Exception("url null");
        }
        File file2 = new File(path);
        int i11 = 0;
        while (true) {
            String[] strArr = f72681g;
            if (i11 >= strArr.length) {
                File file3 = file2;
                qb.c.d(f72679e, "download failed, delete file %s , success = %b", file3.getAbsoluteFile(), Boolean.valueOf(file3.delete()));
                throw new Exception("download failed, errorCode: " + this.f72684c + ", urlPath: " + urlPath);
            }
            String e11 = e(strArr[(this.f72682a + i11) % strArr.length], urlPath);
            boolean delete = file2.delete();
            this.f72683b.H(e11);
            this.f72683b.E(path);
            qb.c.i(f72679e, "try download %d del %b exists %b: %s -> %s", Integer.valueOf(i11), Boolean.valueOf(delete), Boolean.valueOf(file2.exists()), e11, path);
            if (delete || !file2.exists()) {
                file = file2;
            } else {
                StatFs statFs = new StatFs(file2.getPath());
                File parentFile = file2.getParentFile();
                qb.c.i(f72679e, "file info [absPath %s, canExe %b, canR %b, canW %b, isAbs %b, isDir %b, isF %b, isH %b, exists %b, lastM %s, length %d, available %d, total %d]", file2.getAbsolutePath(), Boolean.valueOf(file2.canExecute()), Boolean.valueOf(file2.canRead()), Boolean.valueOf(file2.canWrite()), Boolean.valueOf(file2.isAbsolute()), Boolean.valueOf(file2.isDirectory()), Boolean.valueOf(file2.isFile()), Boolean.valueOf(file2.isHidden()), Boolean.valueOf(file2.exists()), new Date(file2.lastModified()), Long.valueOf(file2.length()), Long.valueOf(statFs.getAvailableBytes()), Long.valueOf(statFs.getTotalBytes()));
                StatFs statFs2 = new StatFs(parentFile.getPath());
                file = file2;
                qb.c.i(f72679e, "file info [absPath %s, canExe %b, canR %b, canW %b, isAbs %b, isDir %b, isF %b, isH %b, exists %b, lastM %s, length %d, available %d, total %d]", parentFile.getAbsolutePath(), Boolean.valueOf(parentFile.canExecute()), Boolean.valueOf(parentFile.canRead()), Boolean.valueOf(parentFile.canWrite()), Boolean.valueOf(parentFile.isAbsolute()), Boolean.valueOf(parentFile.isDirectory()), Boolean.valueOf(parentFile.isFile()), Boolean.valueOf(parentFile.isHidden()), Boolean.valueOf(parentFile.exists()), new Date(parentFile.lastModified()), Long.valueOf(parentFile.length()), Long.valueOf(statFs2.getAvailableBytes()), Long.valueOf(statFs2.getTotalBytes()));
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean I = this.f72683b.I();
            long currentTimeMillis2 = System.currentTimeMillis();
            qb.c.i(f72679e, "download file result: " + I + "; code:" + this.f72683b.r(), new Object[0]);
            this.f72684c = this.f72683b.r();
            if (I) {
                long j11 = currentTimeMillis2 - currentTimeMillis;
                if (j11 > 0) {
                    this.f72685d = (file.length() * 1000.0f) / j11;
                } else {
                    this.f72685d = 9.223372E18f;
                }
                if (file.exists() && file.length() > 0) {
                    return file;
                }
            } else {
                qb.c.o(f72679e, "try download failed " + i11 + ", errorcode " + this.f72684c + ": " + e11 + " -> " + path, new Object[0]);
                int i12 = this.f72684c;
                if (i12 >= 400 && i12 < 500) {
                    qb.c.d(f72679e, "download failed, delete file %s , %b", file.getAbsoluteFile(), Boolean.valueOf(file.delete()));
                    throw new Exception("http response " + this.f72684c);
                }
            }
            i11++;
            file2 = file;
        }
    }

    public float b() {
        return this.f72685d;
    }

    public void f(int connectTimeout) {
        this.f72683b.D(connectTimeout);
    }

    public void i(int initialDnsIndex) {
        this.f72682a = initialDnsIndex % f72681g.length;
    }

    public void j(int maxRetryCount) {
        this.f72683b.F(maxRetryCount);
    }

    public void k(int readTimeout) {
        this.f72683b.G(readTimeout);
    }

    public c(int connectTimeOut, int readTimeOut, int maxCount) {
        f(connectTimeOut);
        k(readTimeOut);
        this.f72683b.F(maxCount);
    }
}
