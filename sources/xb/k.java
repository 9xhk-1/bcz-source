package xb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f97974a = 1024;

    public static void a(InputStream is2, OutputStream os2) throws Exception {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(os2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = is2.read(bArr, 0, 1024);
            if (read == -1) {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
            gZIPOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] b(byte[] data) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        a(byteArrayInputStream, byteArrayOutputStream);
        byteArrayInputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static void c(InputStream is2, OutputStream os2) throws Exception {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(is2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr, 0, 1024);
            if (read == -1) {
                gZIPInputStream.close();
                return;
            }
            os2.write(bArr, 0, read);
        }
    }

    public static byte[] d(byte[] compressed) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressed);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(byteArrayInputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
