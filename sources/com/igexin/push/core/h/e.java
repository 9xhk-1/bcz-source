package com.igexin.push.core.h;

import com.igexin.c.a.b.g;
import com.igexin.push.config.SDKUrlConfig;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e extends com.igexin.push.f.a.d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38179a = "UploadBiLogPlugin";

    /* renamed from: b, reason: collision with root package name */
    public boolean f38180b;

    /* renamed from: c, reason: collision with root package name */
    private int f38181c;

    public e(String str, byte[] bArr, int i11) {
        super(str);
        this.f38181c = i11;
        a(bArr, i11);
    }

    @Override // com.igexin.push.f.a.d
    public void a(byte[] bArr) throws Exception {
        JSONObject jSONObject = new JSONObject(new String(bArr));
        if (jSONObject.has("result") && com.igexin.push.core.b.B.equals(jSONObject.getString("result"))) {
            this.f38180b = true;
            if (this.f38181c == 10) {
                com.igexin.c.a.c.a.b("UploadBITask", "upload type 10 success ####");
            }
        }
    }

    @Override // com.igexin.c.a.d.a.e
    public final int c() {
        return 0;
    }

    private e(byte[] bArr, int i11) {
        super(SDKUrlConfig.getBiUploadServiceUrl());
        a(bArr, i11);
    }

    private void a(byte[] bArr, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "upload_BI");
            jSONObject.put("BIType", String.valueOf(i11));
            jSONObject.put("cid", com.igexin.push.core.e.A);
            jSONObject.put("BIData", new String(g.c(bArr), "UTF-8"));
            this.f38530g = jSONObject.toString().getBytes();
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }
}
