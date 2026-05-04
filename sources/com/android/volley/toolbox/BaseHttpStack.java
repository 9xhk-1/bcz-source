package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import l70.i;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.e;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicStatusLine;
import w60.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class BaseHttpStack implements HttpStack {
    public abstract HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;

    @Override // com.android.volley.toolbox.HttpStack
    @Deprecated
    public final org.apache.http.HttpResponse performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpResponse executeRequest = executeRequest(request, map);
        i iVar = new i(new BasicStatusLine(new ProtocolVersion(HttpVersion.HTTP, 1, 1), executeRequest.getStatusCode(), ""));
        ArrayList arrayList = new ArrayList();
        for (Header header : executeRequest.getHeaders()) {
            arrayList.add(new BasicHeader(header.getName(), header.getValue()));
        }
        iVar.u((e[]) arrayList.toArray(new e[0]));
        InputStream content = executeRequest.getContent();
        if (content != null) {
            b bVar = new b();
            bVar.f0(content);
            bVar.h0(executeRequest.getContentLength());
            iVar.setEntity(bVar);
        }
        return iVar;
    }
}
