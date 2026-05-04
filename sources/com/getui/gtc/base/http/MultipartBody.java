package com.getui.gtc.base.http;

import com.getui.gtc.base.http.Headers;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kx.a0;

/* loaded from: classes6.dex */
public final class MultipartBody extends RequestBody {
    private final String boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {a0.f68904b, a0.f68904b};

    public static final class Builder {
        private final String boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public final Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public final MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new MultipartBody(this.boundary, this.type, this.parts);
        }

        public final Builder setType(MediaType mediaType) {
            if (mediaType == null) {
                throw new NullPointerException("type == null");
            }
            if (!mediaType.type().equals("multipart")) {
                throw new IllegalArgumentException("multipart != ".concat(String.valueOf(mediaType)));
            }
            this.type = mediaType;
            return this;
        }

        public Builder(String str) {
            this.type = MultipartBody.FORM;
            this.parts = new ArrayList();
            this.boundary = str;
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public final Builder addPart(Part part) {
            if (part == null) {
                throw new NullPointerException("part == null");
            }
            this.parts.add(part);
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }
    }

    public static final class Part {
        final RequestBody body;
        final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static Part create(Headers headers, RequestBody requestBody) {
            if (requestBody == null) {
                throw new NullPointerException("body == null");
            }
            if (headers != null && headers.get("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers == null || headers.get("Content-Length") == null) {
                return new Part(headers, requestBody);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            return createFormData(str, str2, requestBody, null);
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody, String str3) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            StringBuilder sb2 = new StringBuilder("form-data; name=");
            MultipartBody.appendQuotedString(sb2, str);
            if (str2 != null) {
                sb2.append("; filename=");
                MultipartBody.appendQuotedString(sb2, str2);
            }
            Headers.Builder addUnsafeNonAscii = new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2.toString());
            if (str3 != null) {
                addUnsafeNonAscii.add("Content-Transfer-Encoding", str3);
            }
            return create(addUnsafeNonAscii.build(), requestBody);
        }
    }

    public MultipartBody(String str, MediaType mediaType, List<Part> list) {
        this.boundary = str;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + str);
        this.parts = Collections.unmodifiableList(new ArrayList(list));
    }

    public static void appendQuotedString(StringBuilder sb2, String str) {
        String str2;
        sb2.append('\"');
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\n') {
                str2 = "%0A";
            } else if (charAt == '\r') {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb2.append(charAt);
            } else {
                str2 = "%22";
            }
            sb2.append(str2);
        }
        sb2.append('\"');
    }

    private long writeOrCountBytes(OutputStream outputStream, boolean z11) throws IOException {
        BufferedSink bufferedSink;
        BufferedSink bufferedSink2;
        if (z11) {
            bufferedSink = new BufferedSink(new ByteArrayOutputStream());
            bufferedSink2 = bufferedSink;
        } else {
            bufferedSink = new BufferedSink(outputStream);
            bufferedSink2 = bufferedSink;
            bufferedSink = null;
        }
        int size = this.parts.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Part part = this.parts.get(i11);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            bufferedSink2.write(DASHDASH);
            bufferedSink2.write(this.boundary);
            bufferedSink2.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    bufferedSink2.writeUtf8(headers.name(i12)).write(COLONSPACE).writeUtf8(headers.value(i12)).write(CRLF);
                }
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                bufferedSink2.writeUtf8("Content-Type: ").writeUtf8(contentType.toString()).write(CRLF);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength != -1) {
                bufferedSink2.writeUtf8("Content-Length: ").writeLong(contentLength).write(CRLF);
            } else if (z11) {
                bufferedSink.close();
                return -1L;
            }
            byte[] bArr = CRLF;
            bufferedSink2.write(bArr);
            if (z11) {
                j11 += contentLength;
            } else {
                requestBody.writeTo(outputStream);
            }
            bufferedSink2.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        bufferedSink2.write(bArr2);
        bufferedSink2.write(this.boundary);
        bufferedSink2.write(bArr2);
        bufferedSink2.write(CRLF);
        if (!z11) {
            return j11;
        }
        long size3 = j11 + bufferedSink.size();
        bufferedSink.close();
        return size3;
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // com.getui.gtc.base.http.RequestBody
    public final long contentLength() {
        long j11 = this.contentLength;
        if (j11 != -1) {
            return j11;
        }
        try {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        } catch (IOException e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    @Override // com.getui.gtc.base.http.RequestBody
    public final MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i11) {
        return this.parts.get(i11);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.originalType;
    }

    @Override // com.getui.gtc.base.http.RequestBody
    public final void writeTo(OutputStream outputStream) throws IOException {
        writeOrCountBytes(outputStream, false);
    }
}
