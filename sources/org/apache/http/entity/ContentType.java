package org.apache.http.entity;

import androidx.media3.common.MimeTypes;
import e80.i;
import i0.l;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import ku.r0;
import l70.r;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.b;
import org.apache.http.e;
import org.apache.http.f;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.v;
import t60.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class ContentType implements Serializable {
    public static final ContentType APPLICATION_ATOM_XML;
    public static final ContentType APPLICATION_FORM_URLENCODED;
    public static final ContentType APPLICATION_JSON;
    public static final ContentType APPLICATION_OCTET_STREAM;
    public static final ContentType APPLICATION_SOAP_XML;
    public static final ContentType APPLICATION_SVG_XML;
    public static final ContentType APPLICATION_XHTML_XML;
    public static final ContentType APPLICATION_XML;
    private static final Map<String, ContentType> CONTENT_TYPE_MAP;
    public static final ContentType DEFAULT_BINARY;
    public static final ContentType DEFAULT_TEXT;
    public static final ContentType IMAGE_BMP;
    public static final ContentType IMAGE_GIF;
    public static final ContentType IMAGE_JPEG;
    public static final ContentType IMAGE_PNG;
    public static final ContentType IMAGE_SVG;
    public static final ContentType IMAGE_TIFF;
    public static final ContentType IMAGE_WEBP;
    public static final ContentType MULTIPART_FORM_DATA;
    public static final ContentType TEXT_HTML;
    public static final ContentType TEXT_PLAIN;
    public static final ContentType TEXT_XML;
    public static final ContentType WILDCARD;
    private static final long serialVersionUID = -7768694718232371896L;
    private final Charset charset;
    private final String mimeType;
    private final v[] params;

    static {
        Charset charset = b.f77709g;
        ContentType create = create("application/atom+xml", charset);
        APPLICATION_ATOM_XML = create;
        ContentType create2 = create("application/x-www-form-urlencoded", charset);
        APPLICATION_FORM_URLENCODED = create2;
        Charset charset2 = b.f77707e;
        ContentType create3 = create(r0.f68791f, charset2);
        APPLICATION_JSON = create3;
        APPLICATION_OCTET_STREAM = create("application/octet-stream", (Charset) null);
        APPLICATION_SOAP_XML = create("application/soap+xml", charset2);
        ContentType create4 = create("application/svg+xml", charset);
        APPLICATION_SVG_XML = create4;
        ContentType create5 = create("application/xhtml+xml", charset);
        APPLICATION_XHTML_XML = create5;
        ContentType create6 = create("application/xml", charset);
        APPLICATION_XML = create6;
        ContentType create7 = create(MimeTypes.IMAGE_BMP);
        IMAGE_BMP = create7;
        ContentType create8 = create("image/gif");
        IMAGE_GIF = create8;
        ContentType create9 = create("image/jpeg");
        IMAGE_JPEG = create9;
        ContentType create10 = create(MimeTypes.IMAGE_PNG);
        IMAGE_PNG = create10;
        ContentType create11 = create("image/svg+xml");
        IMAGE_SVG = create11;
        ContentType create12 = create("image/tiff");
        IMAGE_TIFF = create12;
        ContentType create13 = create("image/webp");
        IMAGE_WEBP = create13;
        ContentType create14 = create("multipart/form-data", charset);
        MULTIPART_FORM_DATA = create14;
        ContentType create15 = create("text/html", charset);
        TEXT_HTML = create15;
        ContentType create16 = create("text/plain", charset);
        TEXT_PLAIN = create16;
        ContentType create17 = create(l.f60049d, charset);
        TEXT_XML = create17;
        WILDCARD = create("*/*", (Charset) null);
        ContentType[] contentTypeArr = {create, create2, create3, create4, create5, create6, create7, create8, create9, create10, create11, create12, create13, create14, create15, create16, create17};
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < 17; i11++) {
            ContentType contentType = contentTypeArr[i11];
            hashMap.put(contentType.getMimeType(), contentType);
        }
        CONTENT_TYPE_MAP = Collections.unmodifiableMap(hashMap);
        DEFAULT_TEXT = TEXT_PLAIN;
        DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
    }

    public ContentType(String str, Charset charset) {
        this.mimeType = str;
        this.charset = charset;
        this.params = null;
    }

    public static ContentType create(String str, Charset charset) {
        String lowerCase = ((String) e80.a.e(str, "MIME type")).toLowerCase(Locale.ROOT);
        e80.a.a(valid(lowerCase), "MIME type may not contain reserved characters");
        return new ContentType(lowerCase, charset);
    }

    public static ContentType get(HttpEntity httpEntity) throws ParseException, UnsupportedCharsetException {
        e contentType;
        if (httpEntity != null && (contentType = httpEntity.getContentType()) != null) {
            f[] elements = contentType.getElements();
            if (elements.length > 0) {
                return create(elements[0], true);
            }
        }
        return null;
    }

    public static ContentType getByMimeType(String str) {
        if (str == null) {
            return null;
        }
        return CONTENT_TYPE_MAP.get(str);
    }

    public static ContentType getLenient(HttpEntity httpEntity) {
        e contentType;
        if (httpEntity != null && (contentType = httpEntity.getContentType()) != null) {
            try {
                f[] elements = contentType.getElements();
                if (elements.length > 0) {
                    return create(elements[0], false);
                }
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static ContentType getLenientOrDefault(HttpEntity httpEntity) throws ParseException, UnsupportedCharsetException {
        ContentType contentType = get(httpEntity);
        return contentType != null ? contentType : DEFAULT_TEXT;
    }

    public static ContentType getOrDefault(HttpEntity httpEntity) throws ParseException, UnsupportedCharsetException {
        ContentType contentType = get(httpEntity);
        return contentType != null ? contentType : DEFAULT_TEXT;
    }

    public static ContentType parse(String str) throws ParseException, UnsupportedCharsetException {
        e80.a.j(str, "Content type");
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        f[] a11 = l70.f.f70688c.a(charArrayBuffer, new r(0, str.length()));
        if (a11.length > 0) {
            return create(a11[0], true);
        }
        throw new ParseException("Invalid content type: " + str);
    }

    private static boolean valid(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\"' || charAt == ',' || charAt == ';') {
                return false;
            }
        }
        return true;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getParameter(String str) {
        e80.a.f(str, "Parameter name");
        v[] vVarArr = this.params;
        if (vVarArr == null) {
            return null;
        }
        for (v vVar : vVarArr) {
            if (vVar.getName().equalsIgnoreCase(str)) {
                return vVar.getValue();
            }
        }
        return null;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.append(this.mimeType);
        if (this.params != null) {
            charArrayBuffer.append("; ");
            l70.e.f70684b.a(charArrayBuffer, this.params, false);
        } else if (this.charset != null) {
            charArrayBuffer.append(c80.f.E);
            charArrayBuffer.append(this.charset.name());
        }
        return charArrayBuffer.toString();
    }

    public ContentType withCharset(Charset charset) {
        return create(getMimeType(), charset);
    }

    public ContentType withParameters(v... vVarArr) throws UnsupportedCharsetException {
        if (vVarArr.length == 0) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v[] vVarArr2 = this.params;
        if (vVarArr2 != null) {
            for (v vVar : vVarArr2) {
                linkedHashMap.put(vVar.getName(), vVar.getValue());
            }
        }
        for (v vVar2 : vVarArr) {
            linkedHashMap.put(vVar2.getName(), vVar2.getValue());
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size() + 1);
        if (this.charset != null && !linkedHashMap.containsKey("charset")) {
            arrayList.add(new BasicNameValuePair("charset", this.charset.name()));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
        }
        return create(getMimeType(), (v[]) arrayList.toArray(new v[arrayList.size()]), true);
    }

    public ContentType withCharset(String str) {
        return create(getMimeType(), str);
    }

    public static ContentType create(String str) {
        return create(str, (Charset) null);
    }

    public ContentType(String str, Charset charset, v[] vVarArr) {
        this.mimeType = str;
        this.charset = charset;
        this.params = vVarArr;
    }

    public static ContentType create(String str, String str2) throws UnsupportedCharsetException {
        return create(str, !i.b(str2) ? Charset.forName(str2) : null);
    }

    private static ContentType create(f fVar, boolean z11) {
        return create(fVar.getName(), fVar.getParameters(), z11);
    }

    private static ContentType create(String str, v[] vVarArr, boolean z11) {
        Charset charset;
        int length = vVarArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            v vVar = vVarArr[i11];
            if (vVar.getName().equalsIgnoreCase("charset")) {
                String value = vVar.getValue();
                if (!i.b(value)) {
                    try {
                        charset = Charset.forName(value);
                    } catch (UnsupportedCharsetException e11) {
                        if (z11) {
                            throw e11;
                        }
                    }
                }
            } else {
                i11++;
            }
        }
        charset = null;
        if (vVarArr.length <= 0) {
            vVarArr = null;
        }
        return new ContentType(str, charset, vVarArr);
    }

    public static ContentType create(String str, v... vVarArr) throws UnsupportedCharsetException {
        e80.a.a(valid(((String) e80.a.e(str, "MIME type")).toLowerCase(Locale.ROOT)), "MIME type may not contain reserved characters");
        return create(str, vVarArr, true);
    }
}
