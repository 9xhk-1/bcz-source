package r00;

import a00.d0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import yz.w0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ByteStreamsKt")
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r00.a$a, reason: collision with other inner class name */
    public static final class C1024a extends d0 {

        /* renamed from: a, reason: collision with root package name */
        public int f82775a = -1;

        /* renamed from: b, reason: collision with root package name */
        public boolean f82776b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f82777c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BufferedInputStream f82778d;

        public C1024a(BufferedInputStream bufferedInputStream) {
            this.f82778d = bufferedInputStream;
        }

        public final boolean b() {
            return this.f82777c;
        }

        public final int c() {
            return this.f82775a;
        }

        public final boolean d() {
            return this.f82776b;
        }

        public final void e() {
            if (this.f82776b || this.f82777c) {
                return;
            }
            int read = this.f82778d.read();
            this.f82775a = read;
            this.f82776b = true;
            this.f82777c = read == -1;
        }

        public final void f(boolean z11) {
            this.f82777c = z11;
        }

        public final void g(int i11) {
            this.f82775a = i11;
        }

        public final void h(boolean z11) {
            this.f82776b = z11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            e();
            return !this.f82777c;
        }

        @Override // a00.d0
        public byte nextByte() {
            e();
            if (this.f82777c) {
                throw new NoSuchElementException("Input stream is over.");
            }
            byte b11 = (byte) this.f82775a;
            this.f82776b = false;
            return b11;
        }
    }

    @o00.f
    public static final BufferedInputStream a(InputStream inputStream, int i11) {
        g0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i11);
    }

    @o00.f
    public static final BufferedOutputStream b(OutputStream outputStream, int i11) {
        g0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i11);
    }

    public static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        g0.p(inputStream, "<this>");
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i11);
    }

    public static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        g0.p(outputStream, "<this>");
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i11);
    }

    @o00.f
    public static final BufferedReader e(InputStream inputStream, Charset charset) {
        g0.p(inputStream, "<this>");
        g0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(inputStream, "<this>");
        g0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
    }

    @o00.f
    public static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        g0.p(outputStream, "<this>");
        g0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    public static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(outputStream, "<this>");
        g0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(outputStream, charset), 8192);
    }

    @o00.f
    public static final ByteArrayInputStream i(String str, Charset charset) {
        g0.p(str, "<this>");
        g0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        g0.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(str, "<this>");
        g0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        g0.o(bytes, "getBytes(...)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@m80.k InputStream inputStream, @m80.k OutputStream out, int i11) {
        g0.p(inputStream, "<this>");
        g0.p(out, "out");
        byte[] bArr = new byte[i11];
        int read = inputStream.read(bArr);
        long j11 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j11 += read;
            read = inputStream.read(bArr);
        }
        return j11;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 8192;
        }
        return k(inputStream, outputStream, i11);
    }

    @o00.f
    public static final ByteArrayInputStream m(byte[] bArr) {
        g0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @o00.f
    public static final ByteArrayInputStream n(byte[] bArr, int i11, int i12) {
        g0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i11, i12);
    }

    @m80.k
    public static final d0 o(@m80.k BufferedInputStream bufferedInputStream) {
        g0.p(bufferedInputStream, "<this>");
        return new C1024a(bufferedInputStream);
    }

    @y0(version = "1.3")
    @m80.k
    public static final byte[] p(@m80.k InputStream inputStream) {
        g0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        g0.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @yz.n(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @w0(expression = "readBytes()", imports = {}))
    @m80.k
    @yz.o(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] q(@m80.k InputStream inputStream, int i11) {
        g0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i11, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        g0.o(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8192;
        }
        return q(inputStream, i11);
    }

    @o00.f
    public static final InputStreamReader s(InputStream inputStream, Charset charset) {
        g0.p(inputStream, "<this>");
        g0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    public static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(inputStream, "<this>");
        g0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @o00.f
    public static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        g0.p(outputStream, "<this>");
        g0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    public static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        g0.p(outputStream, "<this>");
        g0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
