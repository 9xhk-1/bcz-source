package com.igexin.push.core.a.b;

import com.igexin.push.d.c.n;
import com.igexin.sdk.main.FeedbackImpl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class d extends com.igexin.push.core.a.a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f37660b = "FormatMsgAction";

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, a> f37661c;

    public d() {
        HashMap hashMap = new HashMap();
        f37661c = hashMap;
        hashMap.put(com.igexin.push.core.b.G, new h());
        f37661c.put("response_deviceid", new i());
        f37661c.put(com.igexin.push.core.b.E, new e());
        f37661c.put(com.igexin.push.core.b.F, new g());
        f37661c.put("sendmessage_feedback", new j());
        f37661c.put("block_client", new c());
        f37661c.put("settag_result", new k());
        f37661c.put("query_tag_result", new f());
        f37661c.put("response_bind", new b());
        f37661c.put("response_unbind", new l());
    }

    @Override // com.igexin.push.core.a.a
    public final void a() {
    }

    @Override // com.igexin.push.core.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public final boolean a(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!nVar.d() || nVar.f38501f == null) {
            return false;
        }
        try {
            final JSONObject jSONObject = new JSONObject((String) nVar.f38501f);
            if (jSONObject.has("action") && !jSONObject.getString("action").equals(com.igexin.push.core.b.F) && !jSONObject.getString("action").equals(com.igexin.push.core.b.G) && jSONObject.has("id")) {
                FeedbackImpl.getInstance().asyncFeedback(new Runnable() { // from class: com.igexin.push.core.a.b.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String optString = jSONObject.optString("id");
                        com.igexin.push.core.a.b.d();
                        com.igexin.push.core.a.b.a(optString);
                    }
                });
            }
            if (!jSONObject.has("action")) {
                return false;
            }
            a aVar = f37661c.get(jSONObject.getString("action"));
            if (aVar != null) {
                return aVar.a(obj, jSONObject);
            }
            return false;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }

    @Override // com.igexin.push.core.a.a
    public final void b() {
    }
}
