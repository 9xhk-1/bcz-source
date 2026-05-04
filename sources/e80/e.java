package e80;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.entity.ContentType;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49586a = 4096;

    public static void a(HttpEntity httpEntity) throws IOException {
        InputStream w11;
        if (httpEntity == null || !httpEntity.q() || (w11 = httpEntity.w()) == null) {
            return;
        }
        w11.close();
    }

    public static void b(HttpEntity httpEntity) {
        try {
            a(httpEntity);
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static String c(HttpEntity httpEntity) throws ParseException {
        v b11;
        a.j(httpEntity, "Entity");
        if (httpEntity.getContentType() == null) {
            return null;
        }
        org.apache.http.f[] elements = httpEntity.getContentType().getElements();
        if (elements.length <= 0 || (b11 = elements[0].b("charset")) == null) {
            return null;
        }
        return b11.getValue();
    }

    @Deprecated
    public static String d(HttpEntity httpEntity) throws ParseException {
        a.j(httpEntity, "Entity");
        if (httpEntity.getContentType() == null) {
            return null;
        }
        org.apache.http.f[] elements = httpEntity.getContentType().getElements();
        if (elements.length > 0) {
            return elements[0].getName();
        }
        return null;
    }

    public static byte[] e(HttpEntity httpEntity) throws IOException {
        a.j(httpEntity, "Entity");
        InputStream w11 = httpEntity.w();
        if (w11 == null) {
            return null;
        }
        try {
            a.a(httpEntity.c0() <= SieveCacheKt.NodeLinkMask, "HTTP entity too large to be buffered in memory");
            int c02 = (int) httpEntity.c0();
            if (c02 < 0) {
                c02 = 4096;
            }
            ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(c02);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = w11.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayBuffer.toByteArray();
                    w11.close();
                    return byteArray;
                }
                byteArrayBuffer.append(bArr, 0, read);
            }
        } catch (Throwable th2) {
            w11.close();
            throw th2;
        }
    }

    public static String f(HttpEntity httpEntity) throws IOException, ParseException {
        a.j(httpEntity, "Entity");
        return i(httpEntity, ContentType.get(httpEntity));
    }

    public static String g(HttpEntity httpEntity, String str) throws IOException, ParseException {
        return h(httpEntity, str != null ? Charset.forName(str) : null);
    }

    public static String h(HttpEntity httpEntity, Charset charset) throws IOException, ParseException {
        ContentType contentType;
        a.j(httpEntity, "Entity");
        try {
            contentType = ContentType.get(httpEntity);
        } catch (UnsupportedCharsetException e11) {
            if (charset == null) {
                throw new UnsupportedEncodingException(e11.getMessage());
            }
            contentType = null;
        }
        if (contentType == null) {
            contentType = ContentType.DEFAULT_TEXT.withCharset(charset);
        } else if (contentType.getCharset() == null) {
            contentType = contentType.withCharset(charset);
        }
        return i(httpEntity, contentType);
    }

    public static String i(HttpEntity httpEntity, ContentType contentType) throws IOException {
        InputStream w11 = httpEntity.w();
        Charset charset = null;
        if (w11 == null) {
            return null;
        }
        try {
            a.a(httpEntity.c0() <= SieveCacheKt.NodeLinkMask, "HTTP entity too large to be buffered in memory");
            int c02 = (int) httpEntity.c0();
            if (c02 < 0) {
                c02 = 4096;
            }
            if (contentType != null) {
                Charset charset2 = contentType.getCharset();
                if (charset2 == null) {
                    ContentType byMimeType = ContentType.getByMimeType(contentType.getMimeType());
                    if (byMimeType != null) {
                        charset = byMimeType.getCharset();
                    }
                } else {
                    charset = charset2;
                }
            }
            if (charset == null) {
                charset = c80.f.f8331t;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(w11, charset);
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(c02);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String charArrayBuffer2 = charArrayBuffer.toString();
                    w11.close();
                    return charArrayBuffer2;
                }
                charArrayBuffer.append(cArr, 0, read);
            }
        } catch (Throwable th2) {
            w11.close();
            throw th2;
        }
    }

    public static void j(HttpResponse httpResponse, HttpEntity httpEntity) throws IOException {
        a.j(httpResponse, "Response");
        a(httpResponse.getEntity());
        httpResponse.setEntity(httpEntity);
    }
}
