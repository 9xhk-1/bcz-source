package t70;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j extends w60.a implements i, n {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f89953e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89954f;

    /* renamed from: g, reason: collision with root package name */
    public final int f89955g;

    /* renamed from: h, reason: collision with root package name */
    public final ByteBuffer f89956h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public final byte[] f89957i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public final ByteBuffer f89958j;

    public j(byte[] bArr, ContentType contentType) {
        e80.a.j(bArr, "Source byte array");
        this.f89953e = bArr;
        this.f89954f = 0;
        this.f89955g = bArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f89956h = wrap;
        this.f89957i = bArr;
        this.f89958j = wrap;
        if (contentType != null) {
            i(contentType.toString());
        }
    }

    @Override // t70.n
    @Deprecated
    public void a() {
        close();
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f89955g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f89956h.rewind();
    }

    @Override // t70.i
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        cVar.write(this.f89956h);
        if (this.f89956h.hasRemaining()) {
            return;
        }
        cVar.complete();
    }

    @Override // org.apache.http.HttpEntity
    public boolean n() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean q() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream w() {
        return new ByteArrayInputStream(this.f89953e, this.f89954f, this.f89955g);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        outputStream.write(this.f89953e, this.f89954f, this.f89955g);
        outputStream.flush();
    }

    public j(byte[] bArr, int i11, int i12, ContentType contentType) {
        int i13;
        e80.a.j(bArr, "Source byte array");
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) >= 0 && i13 <= bArr.length) {
            this.f89953e = bArr;
            this.f89954f = i11;
            this.f89955g = i12;
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i11, i12);
            this.f89956h = wrap;
            this.f89957i = bArr;
            this.f89958j = wrap;
            if (contentType != null) {
                i(contentType.toString());
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("off: " + i11 + " len: " + i12 + " b.length: " + bArr.length);
    }

    public j(byte[] bArr) {
        this(bArr, null);
    }

    public j(byte[] bArr, int i11, int i12) {
        this(bArr, i11, i12, null);
    }
}
