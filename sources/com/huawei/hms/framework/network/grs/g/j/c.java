package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f35723a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35724b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f35725c = new HashSet();

    public c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f35723a = grsBaseInfo;
        this.f35724b = context;
    }

    private String e() {
        Set<String> b11 = com.huawei.hms.framework.network.grs.f.b.a(this.f35724b.getPackageName()).b();
        if (b11.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = b11.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.i("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private String f() {
        Logger.v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f35725c.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public Context a() {
        return this.f35724b;
    }

    public GrsBaseInfo b() {
        return this.f35723a;
    }

    public String c() {
        return this.f35725c.size() == 0 ? e() : f();
    }

    public Set<String> d() {
        return this.f35725c;
    }

    public void a(String str) {
        this.f35725c.add(str);
    }
}
