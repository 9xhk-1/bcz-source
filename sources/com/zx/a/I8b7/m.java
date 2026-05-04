package com.zx.a.I8b7;

import android.net.Network;
import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.m2;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m implements m2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46577a;

    public m(String str) {
        this.f46577a = str;
    }

    @Override // com.zx.a.I8b7.m2.b
    public void a(int i11, String str) {
    }

    public final void b(Network network) {
        try {
            JSONArray jSONArray = new JSONObject(this.f46577a).getJSONArray("config");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                m3.f46595k.put(network != null ? d0.a(network, jSONObject) : e0.a(jSONObject));
            }
            l2 l2Var = l2.a.f46573a;
            u3 u3Var = l2Var.f46572a;
            JSONArray jSONArray2 = m3.f46595k;
            u3Var.getClass();
            if (jSONArray2 == null) {
                return;
            }
            l2Var.f46572a.a(63, jSONArray2.toString(), true);
            r2.a("reqBZ had changed refresh:" + jSONArray2);
        } catch (Throwable th2) {
            r2.a(th2.getMessage());
        }
    }

    @Override // com.zx.a.I8b7.m2.b
    public void a(Network network) {
        b(network);
    }

    @Override // com.zx.a.I8b7.m2.b
    public void a() {
        b(null);
    }
}
