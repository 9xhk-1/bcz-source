package com.igexin.push.core.a.b;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class k extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37669a = com.igexin.push.config.c.f37542a + "_SetTagResultAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.c.a.c.a.a(f37669a + "|set tag result resp data = " + jSONObject, new Object[0]);
        try {
            if (jSONObject.has("action") && jSONObject.getString("action").equals("settag_result")) {
                com.igexin.push.core.l.a().a(jSONObject.getString("sn"), jSONObject.getString(ma.b.f72948u));
            }
            if (!jSONObject.getString(ma.b.f72948u).equals("0") || com.igexin.push.core.e.f38028e == null) {
                return true;
            }
            com.igexin.push.core.e.f.a().e(com.igexin.push.core.e.f38028e);
            com.igexin.push.core.e.f38028e = null;
            return true;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            com.igexin.c.a.c.a.a(f37669a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + e11.toString(), new Object[0]);
            return true;
        }
    }
}
