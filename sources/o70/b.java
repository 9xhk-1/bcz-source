package o70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T> extends w70.b<T> {

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f76341d;

    /* renamed from: e, reason: collision with root package name */
    public final CharBuffer f76342e;

    /* renamed from: f, reason: collision with root package name */
    public CharsetDecoder f76343f;

    public b(int i11) {
        this.f76341d = ByteBuffer.allocate(i11);
        this.f76342e = CharBuffer.allocate(i11);
    }

    @Override // w70.b
    public final void f(m70.a aVar, m70.g gVar) throws IOException {
        e80.b.f(this.f76341d, "Byte buffer");
        if (aVar.read(this.f76341d) <= 0) {
            return;
        }
        this.f76341d.flip();
        boolean e11 = aVar.e();
        r(this.f76343f.decode(this.f76341d, this.f76342e, e11), gVar);
        this.f76341d.compact();
        if (e11) {
            r(this.f76343f.flush(this.f76342e), gVar);
        }
    }

    @Override // w70.b
    public final void i(HttpEntity httpEntity, ContentType contentType) throws IOException {
        if (contentType == null) {
            contentType = ContentType.DEFAULT_TEXT;
        }
        this.f76343f = q(contentType);
    }

    public CharsetDecoder q(ContentType contentType) {
        Charset charset = contentType != null ? contentType.getCharset() : null;
        if (charset == null) {
            charset = c80.f.f8331t;
        }
        return charset.newDecoder();
    }

    public final void r(CoderResult coderResult, m70.g gVar) throws IOException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f76342e.flip();
        if (this.f76342e.hasRemaining()) {
            w(this.f76342e, gVar);
        }
        this.f76342e.clear();
    }

    public abstract void w(CharBuffer charBuffer, m70.g gVar) throws IOException;

    public b() {
        this(8192);
    }

    @Override // w70.b
    public void k() {
    }
}
