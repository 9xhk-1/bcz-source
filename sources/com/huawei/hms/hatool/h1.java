package com.huawei.hms.hatool;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    private List<b1> f35815a;

    /* renamed from: b, reason: collision with root package name */
    private k0 f35816b;

    /* renamed from: c, reason: collision with root package name */
    private t0 f35817c;

    /* renamed from: d, reason: collision with root package name */
    private o1 f35818d;

    /* renamed from: e, reason: collision with root package name */
    private String f35819e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f35820f;

    public h1(String str) {
        this.f35820f = str;
    }

    @Override // com.huawei.hms.hatool.o1
    public JSONObject a() {
        String str;
        List<b1> list = this.f35815a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f35816b == null || this.f35817c == null || this.f35818d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f35816b.a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a11 = this.f35818d.a();
            a11.put("properties", this.f35817c.a());
            try {
                a11.put("events_global_properties", new JSONObject(this.f35819e));
            } catch (JSONException unused) {
                a11.put("events_global_properties", this.f35819e);
            }
            jSONObject2.put("events_common", a11);
            JSONArray jSONArray = new JSONArray();
            Iterator<b1> it = this.f35815a.iterator();
            while (it.hasNext()) {
                JSONObject a12 = it.next().a();
                if (a12 != null) {
                    jSONArray.put(a12);
                } else {
                    v.e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String a13 = n.a(k1.a(jSONObject2.toString().getBytes("UTF-8")), this.f35820f);
                if (TextUtils.isEmpty(a13)) {
                    v.e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, a13);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        v.e("hmsSdk", str);
        return null;
    }

    public void a(k0 k0Var) {
        this.f35816b = k0Var;
    }

    public void a(l lVar) {
        this.f35818d = lVar;
    }

    public void a(t0 t0Var) {
        this.f35817c = t0Var;
    }

    public void a(String str) {
        if (str != null) {
            this.f35819e = str;
        }
    }

    public void a(List<b1> list) {
        this.f35815a = list;
    }
}
