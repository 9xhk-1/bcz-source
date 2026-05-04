package w60;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.entity.ContentType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l extends a implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f95462e;

    public l(String str, ContentType contentType) throws UnsupportedCharsetException {
        e80.a.j(str, "Source string");
        Charset charset = contentType != null ? contentType.getCharset() : null;
        this.f95462e = str.getBytes(charset == null ? c80.f.f8331t : charset);
        if (contentType != null) {
            i(contentType.toString());
        }
    }

    @Override // org.apache.http.HttpEntity
    public long c0() {
        return this.f95462e.length;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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
    public InputStream w() throws IOException {
        return new ByteArrayInputStream(this.f95462e);
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        e80.a.j(outputStream, "Output stream");
        outputStream.write(this.f95462e);
        outputStream.flush();
    }

    @Deprecated
    public l(String str, String str2, String str3) throws UnsupportedEncodingException {
        e80.a.j(str, "Source string");
        str2 = str2 == null ? "text/plain" : str2;
        str3 = str3 == null ? "ISO-8859-1" : str3;
        this.f95462e = str.getBytes(str3);
        i(str2 + c80.f.E + str3);
    }

    public l(String str, String str2) throws UnsupportedCharsetException {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), str2));
    }

    public l(String str, Charset charset) {
        this(str, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset));
    }

    public l(String str) throws UnsupportedEncodingException {
        this(str, ContentType.DEFAULT_TEXT);
    }
}
