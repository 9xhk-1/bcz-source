package yb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends d {

    /* renamed from: b, reason: collision with root package name */
    public final int f99782b = 1024;

    /* renamed from: c, reason: collision with root package name */
    public final String f99783c = ".gz";

    public void b(File file) throws Exception {
        c(file, true);
    }

    public void c(File file, boolean delete) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file.getPath() + ".gz");
        d(fileInputStream, fileOutputStream);
        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        if (delete) {
            file.delete();
        }
    }

    public void d(InputStream is2, OutputStream os2) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(os2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = is2.read(bArr, 0, 1024);
            if (read == -1 || a()) {
                break;
            } else {
                gZIPOutputStream.write(bArr, 0, read);
            }
        }
        gZIPOutputStream.finish();
        gZIPOutputStream.flush();
        gZIPOutputStream.close();
    }

    public void e(String path) throws Exception {
        f(path, true);
    }

    public void f(String path, boolean delete) throws Exception {
        c(new File(path), delete);
    }

    public byte[] g(byte[] data) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }

    public String h(File src, File dest, xb.c cancelable) throws Exception {
        return i(src, dest, true, cancelable);
    }

    public String i(File src, File dest, boolean delete, xb.c cancelable) throws Exception {
        return dest != null ? j(src, dest.getAbsolutePath(), delete, cancelable) : j(src, null, delete, cancelable);
    }

    public String j(File src, String dest, boolean delete, xb.c cancelable) throws Exception {
        if (dest == null) {
            dest = src.getPath().replace(".gz", "");
        }
        FileInputStream fileInputStream = new FileInputStream(src);
        FileOutputStream fileOutputStream = new FileOutputStream(dest);
        q(fileInputStream, fileOutputStream, cancelable);
        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        if (delete && !a()) {
            src.delete();
        }
        return dest;
    }

    public String k(File file, xb.c cancelable) throws Exception {
        return l(file, true, cancelable);
    }

    public String l(File file, boolean delete, xb.c cancelable) throws Exception {
        return j(file, null, delete, cancelable);
    }

    public String m(String src, String dest, xb.c cancelable) throws Exception {
        return n(src, dest, true, cancelable);
    }

    public String n(String src, String dest, boolean delete, xb.c cancelable) throws Exception {
        return j(new File(src), dest, delete, cancelable);
    }

    public String o(String path, xb.c cancelable) throws Exception {
        return p(path, true, cancelable);
    }

    public String p(String path, boolean delete, xb.c cancelable) throws Exception {
        return l(new File(path), delete, cancelable);
    }

    public void q(InputStream is2, OutputStream os2, xb.c cancelable) throws Exception {
        this.f99785a = cancelable;
        GZIPInputStream gZIPInputStream = new GZIPInputStream(is2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr, 0, 1024);
            if (read == -1 || a()) {
                break;
            } else {
                os2.write(bArr, 0, read);
            }
        }
        gZIPInputStream.close();
    }

    public byte[] r(byte[] data, xb.c cancelable) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        q(byteArrayInputStream, byteArrayOutputStream, cancelable);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        return byteArray;
    }
}
