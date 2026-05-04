package com.igexin.push.core.a.b;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37666a = "ReceivedAction";

    @Override // com.igexin.push.core.a.b.a
    public final boolean a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has("action") && jSONObject.getString("action").equals(com.igexin.push.core.b.F)) {
                String string = jSONObject.getString("id");
                com.igexin.c.a.c.a.a("ReceivedAction received, cmd id :".concat(String.valueOf(string)), new Object[0]);
                try {
                    com.igexin.push.core.e.e.a().a(Long.parseLong(string), false);
                    com.igexin.push.core.a.b.d();
                    com.igexin.push.core.a.b.g();
                } catch (NumberFormatException e11) {
                    com.igexin.c.a.c.a.a("ReceivedAction|" + e11.toString(), new Object[0]);
                }
            }
            return true;
        } catch (Exception e12) {
            com.igexin.c.a.c.a.a(e12);
            com.igexin.c.a.c.a.a("ReceivedAction|" + e12.toString(), new Object[0]);
            return true;
        }
    }
}
