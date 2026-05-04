package t70;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m extends w60.a implements i, n {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f89966e;

    /* renamed from: f, reason: collision with root package name */
    public final ByteBuffer f89967f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final byte[] f89968g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final ByteBuffer f89969h;

    public m(String str, ContentType contentType) {
        e80.a.j(str, "Source string");
        Charset charset = contentType != null ? contentType.getCharset() : null;
        byte[] bytes = str.getBytes(charset == null ? c80.f.f8331t : charset);
        this.f89966e = bytes;
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        this.f89967f = wrap;
        this.f89968g = bytes;
        this.f89969h = wrap;
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
        return this.f89966e.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f89967f.rewind();
    }

    @Override // t70.i
    public void d(m70.c cVar, m70.g gVar) throws IOException {
        cVar.write(this.f89967f);
        if (this.f89967f.hasRemaining()) {
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
        return new ByteArrayInputStream(this.f89966e);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        outputStream.write(this.f89966e);
        outputStream.flush();
    }

    public m(String str, String str2) throws UnsupportedEncodingException {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), str2));
    }

    public m(String str, Charset charset) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset));
    }

    public m(String str) throws UnsupportedEncodingException {
        this(str, ContentType.DEFAULT_TEXT);
    }
}
