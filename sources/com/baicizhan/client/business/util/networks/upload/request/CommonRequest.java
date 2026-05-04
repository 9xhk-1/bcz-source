package com.baicizhan.client.business.util.networks.upload.request;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.networks.upload.request.IRequestBody;
import com.baicizhan.client.framework.network.http.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CommonRequest extends StringRequest {
    private final IRequestBody requestBody;

    public CommonRequest(@NonNull IRequestBody requestBody, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(1, url, listener, errorListener);
        this.requestBody = requestBody;
    }

    @Override // com.android.volley.Request
    public byte[] getBody() throws AuthFailureError {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb2 = new StringBuilder();
        IRequestBody iRequestBody = this.requestBody;
        List<IRequestBody.BodyElement> bodyElements = iRequestBody != null ? iRequestBody.getBodyElements() : null;
        if (bodyElements != null && !bodyElements.isEmpty()) {
            try {
                String boundary = this.requestBody.getBoundary();
                for (IRequestBody.BodyElement bodyElement : bodyElements) {
                    List<String> list = bodyElement.descriptionLines;
                    if (list != null && !list.isEmpty()) {
                        sb2.append(HttpRequest.f17578o);
                        sb2.append(boundary);
                        sb2.append("\r\n");
                        Iterator<String> it = bodyElement.descriptionLines.iterator();
                        while (it.hasNext()) {
                            sb2.append(it.next());
                            sb2.append("\r\n");
                        }
                        sb2.append("\r\n");
                        if (!TextUtils.isEmpty(bodyElement.strValue)) {
                            sb2.append(bodyElement.strValue);
                        } else if (bodyElement.byteValue != null) {
                            byteArrayOutputStream.write(sb2.toString().getBytes("utf-8"));
                            byteArrayOutputStream.write(bodyElement.byteValue);
                            sb2 = new StringBuilder();
                        }
                        sb2.append("\r\n");
                    }
                }
                sb2.append(HttpRequest.f17578o);
                sb2.append(boundary);
                sb2.append(HttpRequest.f17578o);
                sb2.append("\r\n");
                byteArrayOutputStream.write(sb2.toString().getBytes("utf-8"));
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        if (this.requestBody == null) {
            return null;
        }
        return this.requestBody.getMultipartFormData() + "; boundary=" + this.requestBody.getBoundary();
    }

    @Override // com.android.volley.Request
    public Map<String, String> getHeaders() throws AuthFailureError {
        UserRecord p11 = x.r().p();
        if (p11 == null) {
            return super.getHeaders();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "access_token=" + p11.getToken());
        return hashMap;
    }
}
