package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.alipay.sdk.m.u.l;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d extends a {
    public d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.a.c
    public final Object a() {
        try {
            String str = new String(this.f10259b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt(l.f11107a);
            if (i11 == 1000) {
                return this.f10258a == String.class ? jSONObject.optString("result") : com.alipay.sdk.m.e.e.a(jSONObject.optString("result"), this.f10258a);
            }
            throw new RpcException(Integer.valueOf(i11), jSONObject.optString("tips"));
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder("response  =");
            sb2.append(new String(this.f10259b));
            sb2.append(":");
            sb2.append(e11);
            throw new RpcException((Integer) 10, sb2.toString() == null ? "" : e11.getMessage());
        }
    }
}
