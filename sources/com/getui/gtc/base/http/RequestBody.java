package com.getui.gtc.base.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class RequestBody {
    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() { // from class: com.getui.gtc.base.http.RequestBody.2
                @Override // com.getui.gtc.base.http.RequestBody
                public final long contentLength() {
                    return file.length();
                }

                @Override // com.getui.gtc.base.http.RequestBody
                public final MediaType contentType() {
                    return MediaType.this;
                }

                @Override // com.getui.gtc.base.http.RequestBody
                public final void writeTo(OutputStream outputStream) throws IOException {
                    FileInputStream fileInputStream = null;
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = fileInputStream2.read(bArr);
                                if (read == -1) {
                                    Util.closeQuietly(fileInputStream2);
                                    return;
                                }
                                outputStream.write(bArr, 0, read);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            Util.closeQuietly(fileInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i11, final int i12) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        Util.checkOffsetAndCount(bArr.length, i11, i12);
        return new RequestBody() { // from class: com.getui.gtc.base.http.RequestBody.1
            @Override // com.getui.gtc.base.http.RequestBody
            public final long contentLength() {
                return i12;
            }

            @Override // com.getui.gtc.base.http.RequestBody
            public final MediaType contentType() {
                return MediaType.this;
            }

            @Override // com.getui.gtc.base.http.RequestBody
            public final void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr, i11, i12);
            }
        };
    }
}
