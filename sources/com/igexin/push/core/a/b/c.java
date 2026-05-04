package com.igexin.push.core.a.b;

import com.igexin.push.config.a.AnonymousClass5;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37659a = "BlockClientAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has("action") && jSONObject.getString("action").equals("block_client") && jSONObject.has("duration")) {
                long j11 = jSONObject.getLong("duration") * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                if (j11 != 0) {
                    com.igexin.push.config.d.f37584d = currentTimeMillis + j11;
                    com.igexin.c.a.b.e.a().a((com.igexin.c.a.d.f) com.igexin.push.config.a.a().new AnonymousClass5(), false, true);
                    com.igexin.push.f.f.a().d();
                }
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        return true;
    }
}
