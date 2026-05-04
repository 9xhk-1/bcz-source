package com.zx.a.I8b7;

import com.zx.a.I8b7.n0;
import com.zx.a.I8b7.t1;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j implements n0 {
    @Override // com.zx.a.I8b7.n0
    public t1 a(n0.a aVar) throws IOException {
        j1 j1Var = (j1) aVar;
        q1 q1Var = j1Var.f46552c;
        HttpURLConnection httpURLConnection = j1Var.f46553d;
        if (httpURLConnection.getDoOutput() && q1Var.f46662d != null) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            r1 r1Var = (r1) q1Var.f46662d;
            outputStream.write(r1Var.f46677c, r1Var.f46678d, r1Var.f46676b);
            c2.a(outputStream);
        }
        int responseCode = httpURLConnection.getResponseCode();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        x0 b11 = x0.b("text/json; charset=utf-8");
        if (httpURLConnection.getContentType() != null) {
            b11 = x0.b(httpURLConnection.getContentType());
        }
        String responseMessage = httpURLConnection.getResponseMessage();
        t1.a aVar2 = new t1.a();
        aVar2.f46696b = responseCode;
        aVar2.f46698d = new HashMap(headerFields);
        aVar2.f46697c = responseMessage;
        aVar2.f46699e = u1.a(b11, httpURLConnection.getContentLength(), responseCode == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream());
        aVar2.f46695a = q1Var;
        return aVar2.a();
    }
}
