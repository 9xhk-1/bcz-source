package com.tencent.open.web.security;

import android.webkit.WebView;
import com.tencent.open.b;
import com.tencent.open.c.d;
import com.tencent.open.log.SLog;
import org.json.JSONException;
import org.json.JSONObject;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends b.a {

    /* renamed from: d, reason: collision with root package name */
    private String f44624d;

    public c(WebView webView, long j11, String str, String str2) {
        super(webView, j11, str);
        this.f44624d = str2;
    }

    private void b(String str) {
        WebView webView = this.f44447a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:");
            stringBuffer.append("if(!!");
            stringBuffer.append(this.f44624d);
            stringBuffer.append("){");
            stringBuffer.append(this.f44624d);
            stringBuffer.append(j.f81006c);
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String stringBuffer2 = stringBuffer.toString();
            SLog.v("openSDK_LOG.SecureJsListener", "-->callback, callback: " + stringBuffer2);
            webView.loadUrl(stringBuffer2);
        }
    }

    @Override // com.tencent.open.b.a
    public void a(Object obj) {
        SLog.v("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + obj);
    }

    @Override // com.tencent.open.b.a
    public void a() {
        SLog.d("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // com.tencent.open.b.a
    public void a(String str) {
        SLog.v("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", !d.f44491a ? -4 : 0);
            jSONObject.put("sn", this.f44448b);
            jSONObject.put("data", str);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        b(jSONObject.toString());
    }
}
