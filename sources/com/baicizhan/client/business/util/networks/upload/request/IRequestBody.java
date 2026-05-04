package com.baicizhan.client.business.util.networks.upload.request;

import com.baicizhan.client.business.util.FileUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class IRequestBody {
    public static final String TAG = "IRequestBody";
    private List<BodyElement> bodyElements;
    protected byte[] datas;

    /* renamed from: is, reason: collision with root package name */
    protected InputStream f16707is;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BodyElement {
        public byte[] byteValue;
        public List<String> descriptionLines;
        public String strValue;
    }

    public IRequestBody(InputStream is2) {
        this.f16707is = is2;
    }

    public abstract List<BodyElement> createBodyElements();

    public List<BodyElement> getBodyElements() {
        return this.bodyElements;
    }

    public abstract String getBoundary();

    public abstract String getMultipartFormData();

    public void prepare() {
        if (this.datas == null) {
            InputStream inputStream = this.f16707is;
            try {
                if (inputStream == null) {
                    return;
                }
                try {
                    this.datas = FileUtils.getBytes(inputStream);
                    FileUtils.closeQuietly(this.f16707is);
                    this.bodyElements = createBodyElements();
                } catch (IOException e11) {
                    c.d(TAG, "request body prepare failed. " + e11, new Object[0]);
                    FileUtils.closeQuietly(this.f16707is);
                }
            } catch (Throwable th2) {
                FileUtils.closeQuietly(this.f16707is);
                throw th2;
            }
        }
    }
}
