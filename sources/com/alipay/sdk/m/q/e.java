package com.alipay.sdk.m.q;

import android.content.Context;
import com.alipay.sdk.m.o.a;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends com.alipay.sdk.m.p.e {
    @Override // com.alipay.sdk.m.p.e
    public String a(com.alipay.sdk.m.s.a aVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.m.p.e
    public boolean c() {
        return false;
    }

    @Override // com.alipay.sdk.m.p.e
    public JSONObject a() {
        return null;
    }

    @Override // com.alipay.sdk.m.p.e
    public Map<String, String> a(boolean z11, String str) {
        return new HashMap();
    }

    @Override // com.alipay.sdk.m.p.e
    public com.alipay.sdk.m.p.b a(com.alipay.sdk.m.s.a aVar, Context context, String str) throws Throwable {
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.A, "mdap post");
        byte[] a11 = com.alipay.sdk.m.n.b.a(str.getBytes(Charset.forName("UTF-8")));
        HashMap hashMap = new HashMap();
        hashMap.put("utdId", com.alipay.sdk.m.s.b.d().c());
        hashMap.put("logHeader", "RAW");
        hashMap.put("bizCode", com.alipay.sdk.m.u.e.f11053b);
        hashMap.put("productId", "alipaysdk_android");
        hashMap.put("Content-Encoding", "Gzip");
        hashMap.put("productVersion", "15.8.15");
        a.b a12 = com.alipay.sdk.m.o.a.a(context, new a.C0171a(com.alipay.sdk.m.l.a.f10702e, hashMap, a11));
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.A, "mdap got " + a12);
        if (a12 != null) {
            boolean a13 = com.alipay.sdk.m.p.e.a(a12);
            try {
                byte[] bArr = a12.f10888c;
                if (a13) {
                    bArr = com.alipay.sdk.m.n.b.b(bArr);
                }
                return new com.alipay.sdk.m.p.b("", new String(bArr, Charset.forName("UTF-8")));
            } catch (Exception e11) {
                com.alipay.sdk.m.u.e.a(e11);
                return null;
            }
        }
        throw new RuntimeException("Response is null");
    }
}
