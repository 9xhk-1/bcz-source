package com.igexin.push.core.a.b;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37665a = com.igexin.push.config.c.f37542a + "_QueryTagResultAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.c.a.c.a.a(f37665a + "|query tag result resp data = " + jSONObject, new Object[0]);
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("query_tag_result")) {
                return true;
            }
            String string = jSONObject.getString("tags");
            com.igexin.push.core.l.a().a(jSONObject.getString("sn"), jSONObject.getString(ma.b.f72948u), jSONObject.getString("tags"));
            if (TextUtils.isEmpty(string)) {
                string = "none";
            }
            com.igexin.push.core.e.f.a().e(string);
            return true;
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return true;
        }
    }
}
