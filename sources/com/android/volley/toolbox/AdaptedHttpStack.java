package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class AdaptedHttpStack extends BaseHttpStack {
    private final HttpStack mHttpStack;

    public AdaptedHttpStack(HttpStack httpStack) {
        this.mHttpStack = httpStack;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            org.apache.http.HttpResponse performRequest = this.mHttpStack.performRequest(request, map);
            int statusCode = performRequest.n().getStatusCode();
            e[] x11 = performRequest.x();
            ArrayList arrayList = new ArrayList(x11.length);
            for (e eVar : x11) {
                arrayList.add(new Header(eVar.getName(), eVar.getValue()));
            }
            if (performRequest.getEntity() == null) {
                return new HttpResponse(statusCode, arrayList);
            }
            long c02 = performRequest.getEntity().c0();
            if (((int) c02) == c02) {
                return new HttpResponse(statusCode, arrayList, (int) performRequest.getEntity().c0(), performRequest.getEntity().w());
            }
            throw new IOException("Response too large: " + c02);
        } catch (ConnectTimeoutException e11) {
            throw new SocketTimeoutException(e11.getMessage());
        }
    }
}
