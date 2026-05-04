package com.getui.gtc.base.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/* loaded from: classes6.dex */
public class FormBody extends RequestBody {
    static final String CHARSET_NAME = "UTF-8";
    static final MediaType CONTENT_TYPE = MediaType.get("application/x-www-form-urlencoded");
    final ByteArrayOutputStream content = new ByteArrayOutputStream();

    public void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    @Override // com.getui.gtc.base.http.RequestBody
    public long contentLength() {
        return this.content.size();
    }

    @Override // com.getui.gtc.base.http.RequestBody
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    @Override // com.getui.gtc.base.http.RequestBody
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.content.toByteArray());
    }

    public void addField(String str, boolean z11, String str2, boolean z12) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        if (str2 == null) {
            throw new NullPointerException("value");
        }
        if (this.content.size() > 0) {
            this.content.write(38);
        }
        if (z11) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
        if (z12) {
            str2 = URLEncoder.encode(str2, "UTF-8");
        }
        this.content.write(str.getBytes("UTF-8"));
        this.content.write(61);
        this.content.write(str2.getBytes("UTF-8"));
    }
}
