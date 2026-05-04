package com.igexin.push.core.a.b;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37658a = com.igexin.push.config.c.f37542a + "_BindAliasResultAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.c.a.c.a.b(f37658a, "bind alias result resp data = ".concat(String.valueOf(jSONObject)));
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("response_bind")) {
                return true;
            }
            com.igexin.push.core.l.a().b(jSONObject.getString("sn"), jSONObject.getString("result"));
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return true;
        }
    }
}
