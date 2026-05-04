package com.igexin.push.core.a.b;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class l extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37670a = com.igexin.push.config.c.f37542a + "_UnBindAliasResultAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.c.a.c.a.a(f37670a + "|unbind alias result resp data = " + jSONObject, new Object[0]);
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("response_unbind")) {
                return true;
            }
            com.igexin.push.core.l.a().c(jSONObject.getString("sn"), jSONObject.getString("result"));
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a(f37670a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + e11.toString(), new Object[0]);
            return true;
        }
    }
}
