package com.zx.a.I8b7;

import com.huawei.hms.api.FailedBinderCallBack;
import com.zx.a.I8b7.l2;
import com.zx.a.I8b7.v3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public JSONArray f46747a = new JSONArray();

    /* renamed from: b, reason: collision with root package name */
    public JSONArray f46748b = new JSONArray();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f46749a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f46750b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46751c;

        public a(String str, String str2, String str3) {
            this.f46749a = str;
            this.f46750b = str2;
            this.f46751c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (y.this.f46747a.length() >= 100) {
                    r2.a("events length > MAX_COUNT " + y.this.f46747a.length());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", currentTimeMillis);
                jSONObject.put(FailedBinderCallBack.CALLER_ID, this.f46749a);
                jSONObject.put("action", this.f46750b);
                jSONObject.put("params", this.f46751c);
                y.this.f46747a.put(jSONObject);
                r2.a("events add:" + jSONObject.toString());
                if (m3.G) {
                    r2.a("events save:" + y.this.f46747a.toString());
                    l2 l2Var = l2.a.f46573a;
                    u3 u3Var = l2Var.f46572a;
                    String jSONArray = y.this.f46747a.toString();
                    u3Var.getClass();
                    l2Var.f46572a.a(23, jSONArray, true);
                }
            } catch (Throwable th2) {
                r2.a(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final y f46753a = new y();
    }

    public final void a(Runnable runnable) {
        try {
            v3.f.f46726a.f46722b.execute(runnable);
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }

    public final JSONArray a(JSONArray jSONArray, JSONArray jSONArray2, int i11) throws JSONException {
        JSONArray jSONArray3 = new JSONArray();
        int i12 = 0;
        while (true) {
            if (i12 < jSONArray.length()) {
                if (jSONArray3.length() >= i11) {
                    break;
                }
                jSONArray3.put(jSONArray.get(i12));
                i12++;
            } else {
                for (int i13 = 0; i13 < jSONArray2.length() && jSONArray3.length() < i11; i13++) {
                    jSONArray3.put(jSONArray2.get(i13));
                }
            }
        }
        return jSONArray3;
    }

    public void a(String str, String str2, String str3) {
        try {
            a(new a(str, str2, str3));
        } catch (Throwable th2) {
            r2.a(th2);
        }
    }
}
