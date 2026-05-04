package com.huawei.hms.push;

import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k {
    public int B;
    public String D;

    /* renamed from: b, reason: collision with root package name */
    public int f36186b;

    /* renamed from: c, reason: collision with root package name */
    public String f36187c;

    /* renamed from: d, reason: collision with root package name */
    public String f36188d;

    /* renamed from: l, reason: collision with root package name */
    public String f36196l;

    /* renamed from: m, reason: collision with root package name */
    public String f36197m;

    /* renamed from: n, reason: collision with root package name */
    public String f36198n;

    /* renamed from: o, reason: collision with root package name */
    public String f36199o;

    /* renamed from: p, reason: collision with root package name */
    public String f36200p;

    /* renamed from: r, reason: collision with root package name */
    public String f36202r;

    /* renamed from: s, reason: collision with root package name */
    public String f36203s;

    /* renamed from: z, reason: collision with root package name */
    public String f36210z;

    /* renamed from: a, reason: collision with root package name */
    public String f36185a = "";

    /* renamed from: e, reason: collision with root package name */
    public String f36189e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f36190f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f36191g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f36192h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f36193i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f36194j = "";

    /* renamed from: k, reason: collision with root package name */
    public String f36195k = "";

    /* renamed from: q, reason: collision with root package name */
    public String f36201q = "";

    /* renamed from: t, reason: collision with root package name */
    public int f36204t = n.STYLE_DEFAULT.ordinal();

    /* renamed from: u, reason: collision with root package name */
    public String f36205u = "";

    /* renamed from: v, reason: collision with root package name */
    public String f36206v = "";

    /* renamed from: w, reason: collision with root package name */
    public String f36207w = "";

    /* renamed from: x, reason: collision with root package name */
    public int f36208x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f36209y = 0;
    public String A = "";
    public String C = "";
    public String E = "";
    public String F = "";

    public k(byte[] bArr, byte[] bArr2) {
        Charset charset = x.f36237a;
        this.f36202r = new String(bArr, charset);
        this.f36203s = new String(bArr2, charset);
    }

    public final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject);
        jSONObject2.put("group", this.f36185a);
        jSONObject2.put("tag", this.A);
        jSONObject2.put(RemoteMessageConst.Notification.AUTO_CANCEL, this.f36208x);
        jSONObject2.put("visibility", this.f36209y);
        jSONObject2.put(RemoteMessageConst.Notification.WHEN, this.f36210z);
        return jSONObject2;
    }

    public final JSONObject b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cmd", this.f36191g);
        jSONObject2.put("content", this.f36192h);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_ICON, this.f36193i);
        jSONObject2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, this.f36194j);
        jSONObject2.put("notifySummary", this.f36195k);
        jSONObject2.put(RemoteMessageConst.MessageBody.PARAM, jSONObject);
        return jSONObject2;
    }

    public final void c(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(AdvertisementOption.AD_PACKAGE)) {
            String string = jSONObject.getString(AdvertisementOption.AD_PACKAGE);
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(string) || string.length() >= 48) {
                this.f36188d = string.substring(0, 48);
                return;
            }
            int length = 48 - string.length();
            for (int i11 = 0; i11 < length; i11++) {
                sb2.append("0");
            }
            sb2.append(string);
            this.f36188d = sb2.toString();
        }
    }

    public final boolean d(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has(RemoteMessageConst.Notification.CLICK_ACTION)) {
            this.f36197m = jSONObject.getString(RemoteMessageConst.Notification.CLICK_ACTION);
        }
        if (jSONObject.has(RemoteMessageConst.Notification.INTENT_URI)) {
            this.f36187c = jSONObject.getString(RemoteMessageConst.Notification.INTENT_URI);
        }
        if (jSONObject.has("appPackageName")) {
            this.f36196l = jSONObject.getString("appPackageName");
            return true;
        }
        HMSLog.d("PushSelfShowLog", "appPackageName is null");
        return false;
    }

    public final boolean e(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("msgId")) {
            HMSLog.i("PushSelfShowLog", "msgId == null");
            return false;
        }
        Object obj = jSONObject.get("msgId");
        if (obj instanceof String) {
            this.f36189e = (String) obj;
            return true;
        }
        if (!(obj instanceof Integer)) {
            return true;
        }
        this.f36189e = String.valueOf(((Integer) obj).intValue());
        return true;
    }

    public final boolean f(JSONObject jSONObject) {
        HMSLog.d("PushSelfShowLog", "enter parseNotifyParam");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
            if (jSONObject2.has("style")) {
                this.f36204t = jSONObject2.getInt("style");
            }
            this.f36205u = jSONObject2.optString("bigTitle");
            this.f36206v = jSONObject2.optString("bigContent");
            this.E = jSONObject2.optString("icon");
            return true;
        } catch (JSONException e11) {
            HMSLog.i("PushSelfShowLog", e11.toString());
            return false;
        }
    }

    public final void g(JSONObject jSONObject) {
        this.f36185a = jSONObject.optString("group");
        HMSLog.d("PushSelfShowLog", "NOTIFY_GROUP:" + this.f36185a);
        this.f36208x = jSONObject.optInt(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        HMSLog.d("PushSelfShowLog", "autoCancel: " + this.f36208x);
        this.f36209y = jSONObject.optInt("visibility", 0);
        this.f36210z = jSONObject.optString(RemoteMessageConst.Notification.WHEN);
        this.A = jSONObject.optString("tag");
    }

    public final boolean h(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PARAM);
            if (jSONObject2.has("autoClear")) {
                this.f36186b = jSONObject2.getInt("autoClear");
            } else {
                this.f36186b = 0;
            }
            if ("app".equals(this.f36191g) || "cosa".equals(this.f36191g)) {
                d(jSONObject2);
                return true;
            }
            if ("url".equals(this.f36191g)) {
                k(jSONObject2);
                return true;
            }
            if (!"rp".equals(this.f36191g)) {
                return true;
            }
            j(jSONObject2);
            return true;
        } catch (Exception e11) {
            HMSLog.e("PushSelfShowLog", "ParseParam error ", e11);
            return false;
        }
    }

    public final boolean i(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(RemoteMessageConst.MessageBody.PS_CONTENT)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
            this.f36191g = jSONObject2.getString("cmd");
            this.f36192h = jSONObject2.optString("content");
            this.f36193i = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.f36194j = jSONObject2.optString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.f36195k = jSONObject2.optString("notifySummary");
            this.D = jSONObject2.optString(RemoteMessageConst.Notification.TICKER);
            if ((!jSONObject2.has(RemoteMessageConst.MessageBody.NOTIFY_DETAIL) || f(jSONObject2)) && jSONObject2.has(RemoteMessageConst.MessageBody.PARAM)) {
                return h(jSONObject2);
            }
        }
        return false;
    }

    public final boolean j(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (jSONObject.has("appPackageName")) {
            this.f36196l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            HMSLog.d("PushSelfShowLog", "rpl or rpt is null");
            return false;
        }
        this.f36199o = jSONObject.getString("rpl");
        this.f36200p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f36201q = jSONObject.getString("rpct");
        return true;
    }

    public final boolean k(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return false;
        }
        if (!jSONObject.has("url")) {
            HMSLog.d("PushSelfShowLog", "url is null");
            return false;
        }
        this.f36198n = jSONObject.getString("url");
        if (jSONObject.has("appPackageName")) {
            this.f36196l = jSONObject.getString("appPackageName");
        }
        if (!jSONObject.has("rpt") || !jSONObject.has("rpl")) {
            return true;
        }
        this.f36199o = jSONObject.getString("rpl");
        this.f36200p = jSONObject.getString("rpt");
        if (!jSONObject.has("rpct")) {
            return true;
        }
        this.f36201q = jSONObject.getString("rpct");
        return true;
    }

    public String l() {
        return this.f36185a;
    }

    public String m() {
        return this.E;
    }

    public String n() {
        return this.f36187c;
    }

    public byte[] o() {
        try {
            return a(a(b(v()), r())).toString().getBytes(x.f36237a);
        } catch (JSONException e11) {
            HMSLog.e("PushSelfShowLog", "getMsgData failed JSONException:", e11);
            return new byte[0];
        }
    }

    public String p() {
        HMSLog.d("PushSelfShowLog", "msgId =" + this.f36189e);
        return this.f36189e;
    }

    public String q() {
        return this.A;
    }

    public final JSONObject r() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("style", this.f36204t);
        jSONObject.put("bigTitle", this.f36205u);
        jSONObject.put("bigContent", this.f36206v);
        jSONObject.put("bigPic", this.f36207w);
        return jSONObject;
    }

    public int s() {
        return this.B;
    }

    public String t() {
        return this.f36195k;
    }

    public String u() {
        return this.f36194j;
    }

    public final JSONObject v() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoClear", this.f36186b);
        jSONObject.put("url", this.f36198n);
        jSONObject.put("rpl", this.f36199o);
        jSONObject.put("rpt", this.f36200p);
        jSONObject.put("rpct", this.f36201q);
        jSONObject.put("appPackageName", this.f36196l);
        jSONObject.put(RemoteMessageConst.Notification.CLICK_ACTION, this.f36197m);
        jSONObject.put(RemoteMessageConst.Notification.INTENT_URI, this.f36187c);
        return jSONObject;
    }

    public int w() {
        return this.f36204t;
    }

    public String x() {
        return this.D;
    }

    public byte[] y() {
        return this.f36203s.getBytes(x.f36237a);
    }

    public boolean z() {
        try {
            if (TextUtils.isEmpty(this.f36202r)) {
                HMSLog.d("PushSelfShowLog", "msg is null");
                return false;
            }
            JSONObject jSONObject = new JSONObject(this.f36202r);
            g(jSONObject);
            JSONObject jSONObject2 = jSONObject.getJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
            if (!e(jSONObject2)) {
                return false;
            }
            this.f36190f = jSONObject2.optString("dispPkgName");
            c(jSONObject2);
            this.B = jSONObject2.optInt(RemoteMessageConst.Notification.NOTIFY_ID, -1);
            this.C = jSONObject2.optString("data");
            this.F = jSONObject2.optString(RemoteMessageConst.ANALYTIC_INFO);
            return i(jSONObject2);
        } catch (JSONException unused) {
            HMSLog.d("PushSelfShowLog", "parse message exception.");
            return false;
        } catch (Exception e11) {
            HMSLog.d("PushSelfShowLog", e11.toString());
            return false;
        }
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dispPkgName", this.f36190f);
        jSONObject3.put("msgId", this.f36189e);
        jSONObject3.put(AdvertisementOption.AD_PACKAGE, this.f36188d);
        jSONObject3.put(RemoteMessageConst.Notification.NOTIFY_ID, this.B);
        jSONObject3.put(RemoteMessageConst.MessageBody.PS_CONTENT, jSONObject);
        jSONObject3.put(RemoteMessageConst.MessageBody.NOTIFY_DETAIL, jSONObject2);
        jSONObject3.put(RemoteMessageConst.Notification.TICKER, this.D);
        jSONObject3.put("data", this.C);
        return jSONObject3;
    }

    public String b() {
        return this.F;
    }

    public String d() {
        return this.f36196l;
    }

    public String g() {
        return this.f36206v;
    }

    public int e() {
        return this.f36208x;
    }

    public int f() {
        return this.f36186b;
    }

    public String j() {
        return this.f36192h;
    }

    public String c() {
        return this.f36188d;
    }

    public String k() {
        return this.f36190f;
    }

    public String h() {
        return this.f36205u;
    }

    public String i() {
        return this.f36191g;
    }

    public String a() {
        return this.f36197m;
    }

    public void a(int i11) {
        this.B = i11;
    }
}
