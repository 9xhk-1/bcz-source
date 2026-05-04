package com.baicizhan.client.business.util.networks.upload;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.android.volley.toolbox.StringRequest;
import com.baicizhan.client.business.util.networks.upload.request.CommonRequest;
import com.baicizhan.client.business.util.networks.upload.request.IRequestBody;
import java.util.concurrent.Callable;
import rb.f;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class RxUploader {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CommonStringRequestFactory implements IStringRequestFactory {
        public static final int UPLOAD_TYPE_AVATAR = 0;
        public static final int UPLOAD_TYPE_WEBVIEW_IMG = 1;
        private final IRequestBody requestBody;
        private final int type;

        public CommonStringRequestFactory(int type, IRequestBody requestBody) {
            this.type = type;
            this.requestBody = requestBody;
        }

        @Override // com.baicizhan.client.business.util.networks.upload.RxUploader.IStringRequestFactory
        public StringRequest createRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
            IRequestBody iRequestBody;
            int i11 = this.type;
            if ((i11 != 0 && i11 != 1) || (iRequestBody = this.requestBody) == null) {
                return null;
            }
            iRequestBody.prepare();
            return new CommonRequest(this.requestBody, url, listener, errorListener);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface IStringRequestFactory {
        StringRequest createRequest(String url, Response.Listener<String> listener, Response.ErrorListener errorListener);
    }

    private RxUploader() {
    }

    public static c<String> upload(final String url, final IStringRequestFactory requestFactory) {
        return c.z2(new Callable<String>() { // from class: com.baicizhan.client.business.util.networks.upload.RxUploader.1
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                RequestFuture newFuture = RequestFuture.newFuture();
                StringRequest createRequest = IStringRequestFactory.this.createRequest(url, newFuture, newFuture);
                if (createRequest == null) {
                    return null;
                }
                f.e(createRequest, new DefaultRetryPolicy(20000, 0, 0.0f));
                return (String) newFuture.get();
            }
        }).w5(bc0.c.e());
    }
}
