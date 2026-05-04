package com.zx.a.I8b7;

import com.zx.a.I8b7.l2;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f46764c;

    public z(y yVar, int i11, String str) {
        this.f46764c = yVar;
        this.f46762a = i11;
        this.f46763b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f46764c.f46748b.length() >= 10) {
                r2.a("error list length > MAX_COUNT " + this.f46764c.f46748b.length());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f46762a);
            jSONObject.put("msg", this.f46763b);
            this.f46764c.f46748b.put(jSONObject);
            r2.a("error add:" + jSONObject);
            if (m3.G) {
                r2.a("error save:" + this.f46764c.f46748b.toString());
                l2 l2Var = l2.a.f46573a;
                u3 u3Var = l2Var.f46572a;
                String jSONArray = this.f46764c.f46748b.toString();
                u3Var.getClass();
                l2Var.f46572a.a(321, jSONArray, true);
            }
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
