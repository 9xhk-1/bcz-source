package a3;

import com.badlogic.gdx.utils.BufferUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1706a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1707b = new byte[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends ByteArrayOutputStream {
        public a(int i11) {
            super(i11);
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized byte[] toByteArray() {
            int i11 = ((ByteArrayOutputStream) this).count;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i11 == bArr.length) {
                return bArr;
            }
            return super.toByteArray();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static int b(InputStream inputStream, ByteBuffer byteBuffer, byte[] bArr) throws IOException {
        int position = byteBuffer.position();
        int i11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byteBuffer.position(position);
                return i11;
            }
            BufferUtils.c(bArr, 0, byteBuffer, read);
            i11 += read;
            byteBuffer.position(position + i11);
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        e(inputStream, outputStream, new byte[4096]);
    }

    public static void d(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
        e(inputStream, outputStream, new byte[i11]);
    }

    public static void e(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void f(InputStream inputStream, ByteBuffer byteBuffer) throws IOException {
        b(inputStream, byteBuffer, new byte[4096]);
    }

    public static void g(InputStream inputStream, ByteBuffer byteBuffer, int i11) throws IOException {
        b(inputStream, byteBuffer, new byte[i11]);
    }

    public static byte[] h(InputStream inputStream) throws IOException {
        return i(inputStream, inputStream.available());
    }

    public static byte[] i(InputStream inputStream, int i11) throws IOException {
        a aVar = new a(Math.max(0, i11));
        c(inputStream, aVar);
        return aVar.toByteArray();
    }

    public static String j(InputStream inputStream) throws IOException {
        return l(inputStream, inputStream.available(), null);
    }

    public static String k(InputStream inputStream, int i11) throws IOException {
        return l(inputStream, i11, null);
    }

    public static String l(InputStream inputStream, int i11, @d0 String str) throws IOException {
        InputStreamReader inputStreamReader = str == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str);
        StringWriter stringWriter = new StringWriter(Math.max(0, i11));
        char[] cArr = new char[4096];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }
}
