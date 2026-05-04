package com.alipay.sdk.m.m;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.j;
import com.alipay.sdk.m.u.n;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ku.w1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    public static final String A0 = "cfg_max_time";
    public static final String B0 = "get_oa_id";
    public static final String C0 = "notifyFailApp";
    public static final String D0 = "startactivity_in_ui_thread";
    public static final String E = "DynCon";
    public static final String E0 = "scheme_pay_2";
    public static final int F = 10000;
    public static final String F0 = "intercept_batch";
    public static final String G = "https://h5.m.taobao.com/mlapp/olist.html";
    public static final String G0 = "bind_with_startActivity";
    public static final int H = 10;
    public static final String H0 = "startActivity_InsteadOf_Scheme";
    public static final boolean I = false;
    public static final String I0 = "enableStartActivityFallback";
    public static final boolean J = true;
    public static final String J0 = "enableBindExFallback";
    public static final boolean K = false;
    public static a K0 = null;
    public static final boolean L = true;
    public static final boolean M = true;
    public static final String N = "";
    public static final boolean O = false;
    public static final boolean P = false;
    public static final boolean Q = false;
    public static final boolean R = false;
    public static final boolean S = true;
    public static final String T = "";
    public static final boolean U = false;
    public static final boolean V = false;
    public static final boolean W = false;
    public static final int X = 1000;
    public static final boolean Y = true;
    public static final String Z = "";

    /* renamed from: a0, reason: collision with root package name */
    public static final boolean f10777a0 = false;

    /* renamed from: b0, reason: collision with root package name */
    public static final boolean f10778b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    public static final boolean f10779c0 = false;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f10780d0 = 1000;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f10781e0 = 20000;

    /* renamed from: f0, reason: collision with root package name */
    public static final boolean f10782f0 = false;

    /* renamed from: g0, reason: collision with root package name */
    public static final String f10783g0 = "alipay_cashier_dynamic_config";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f10784h0 = "timeout";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f10785i0 = "h5_port_degrade";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f10786j0 = "st_sdk_config";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f10787k0 = "tbreturl";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f10788l0 = "launchAppSwitch";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f10789m0 = "configQueryInterval";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f10790n0 = "deg_log_mcgw";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f10791o0 = "deg_start_srv_first";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f10792p0 = "prev_jump_dual";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f10793q0 = "use_sc_only";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f10794r0 = "retry_aidl_activity_not_start";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f10795s0 = "bind_use_imp";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f10796t0 = "retry_bnd_once";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f10797u0 = "skip_trans";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f10798v0 = "start_trans";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f10799w0 = "up_before_pay";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f10800x0 = "lck_k";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f10801y0 = "use_sc_lck_a";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f10802z0 = "utdid_factor";
    public JSONObject A;

    /* renamed from: a, reason: collision with root package name */
    public int f10803a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10804b = false;

    /* renamed from: c, reason: collision with root package name */
    public String f10805c = G;

    /* renamed from: d, reason: collision with root package name */
    public int f10806d = 10;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10807e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10808f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10809g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10810h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10811i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10812j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10813k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f10814l = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f10815m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10816n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10817o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10818p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10819q = true;

    /* renamed from: r, reason: collision with root package name */
    public String f10820r = "";

    /* renamed from: s, reason: collision with root package name */
    public String f10821s = "";

    /* renamed from: t, reason: collision with root package name */
    public boolean f10822t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10823u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10824v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10825w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10826x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f10827y = 1000;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10828z = false;
    public boolean B = true;
    public List<b> C = null;
    public int D = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.m.a$a, reason: collision with other inner class name */
    public class RunnableC0170a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.s.a f10829a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f10830b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f10831c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f10832d;

        public RunnableC0170a(com.alipay.sdk.m.s.a aVar, Context context, boolean z11, int i11) {
            this.f10829a = aVar;
            this.f10830b = context;
            this.f10831c = z11;
            this.f10832d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.alipay.sdk.m.p.b a11 = new com.alipay.sdk.m.q.b().a(this.f10829a, this.f10830b);
                if (a11 != null) {
                    a.this.a(this.f10829a, a11.a());
                    a.this.a(com.alipay.sdk.m.s.a.h());
                    com.alipay.sdk.m.k.a.a(this.f10829a, com.alipay.sdk.m.k.b.f10653l, "offcfg|" + this.f10831c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f10832d);
                }
            } catch (Throwable th2) {
                e.a(th2);
            }
        }
    }

    private int C() {
        return this.f10827y;
    }

    public static a D() {
        if (K0 == null) {
            a aVar = new a();
            K0 = aVar;
            aVar.t();
        }
        return K0;
    }

    private JSONObject E() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f10784h0, k());
        jSONObject.put(f10785i0, y());
        jSONObject.put(f10787k0, r());
        jSONObject.put(f10789m0, d());
        jSONObject.put(f10788l0, b.a(l()));
        jSONObject.put(E0, i());
        jSONObject.put(F0, h());
        jSONObject.put(f10790n0, e());
        jSONObject.put(f10791o0, f());
        jSONObject.put(f10792p0, m());
        jSONObject.put(f10793q0, g());
        jSONObject.put(f10795s0, b());
        jSONObject.put(f10796t0, n());
        jSONObject.put(f10797u0, p());
        jSONObject.put(f10798v0, B());
        jSONObject.put(f10799w0, s());
        jSONObject.put(f10801y0, o());
        jSONObject.put(f10800x0, j());
        jSONObject.put(G0, c());
        jSONObject.put(H0, q());
        jSONObject.put(f10794r0, A());
        jSONObject.put(A0, C());
        jSONObject.put(B0, x());
        jSONObject.put(C0, v());
        jSONObject.put(I0, w());
        jSONObject.put(J0, u());
        jSONObject.put(D0, z());
        jSONObject.put(com.alipay.sdk.m.u.a.f11046b, a());
        return jSONObject;
    }

    public boolean A() {
        return this.f10826x;
    }

    public boolean B() {
        return this.f10818p;
    }

    public boolean b() {
        return this.f10815m;
    }

    public String c() {
        return this.f10821s;
    }

    public int d() {
        return this.f10806d;
    }

    public boolean e() {
        return this.f10811i;
    }

    public boolean f() {
        return this.f10812j;
    }

    public String g() {
        return this.f10814l;
    }

    public boolean h() {
        return this.f10808f;
    }

    public boolean i() {
        return this.f10807e;
    }

    public String j() {
        return this.f10820r;
    }

    public int k() {
        int i11 = this.f10803a;
        if (i11 < 1000 || i11 > 20000) {
            e.b(E, "time(def) = 10000");
            return 10000;
        }
        e.b(E, "time = " + this.f10803a);
        return this.f10803a;
    }

    public List<b> l() {
        return this.C;
    }

    public boolean m() {
        return this.f10813k;
    }

    public boolean n() {
        return this.f10816n;
    }

    public boolean o() {
        return this.f10825w;
    }

    public boolean p() {
        return this.f10817o;
    }

    public boolean q() {
        return this.f10822t;
    }

    public String r() {
        return this.f10805c;
    }

    public boolean s() {
        return this.f10819q;
    }

    public void t() {
        Context b11 = com.alipay.sdk.m.s.b.d().b();
        String a11 = j.a(com.alipay.sdk.m.s.a.h(), b11, f10783g0, null);
        try {
            this.D = Integer.parseInt(j.a(com.alipay.sdk.m.s.a.h(), b11, f10802z0, "-1"));
        } catch (Exception unused) {
        }
        a(a11);
    }

    public boolean u() {
        return this.f10824v;
    }

    public boolean v() {
        return this.f10828z;
    }

    public boolean w() {
        return this.f10823u;
    }

    public boolean x() {
        return this.B;
    }

    public boolean y() {
        return this.f10804b;
    }

    public boolean z() {
        return this.f10809g;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f10834a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10835b;

        /* renamed from: c, reason: collision with root package name */
        public final String f10836c;

        public b(String str, int i11, String str2) {
            this.f10834a = str;
            this.f10835b = i11;
            this.f10836c = str2;
        }

        public static b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt("v", 0), jSONObject.optString("pk"));
        }

        public String toString() {
            return String.valueOf(a(this));
        }

        public static List<b> a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                b a11 = a(jSONArray.optJSONObject(i11));
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return arrayList;
        }

        public static JSONObject a(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.f10834a).put("v", bVar.f10835b).put("pk", bVar.f10836c);
            } catch (JSONException e11) {
                e.a(e11);
                return null;
            }
        }

        public static JSONArray a(List<b> list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(a(it.next()));
            }
            return jSONArray;
        }
    }

    public JSONObject a() {
        return this.A;
    }

    public void a(boolean z11) {
        this.f10810h = z11;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a(new JSONObject(str));
        } catch (Throwable th2) {
            e.a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.alipay.sdk.m.s.a aVar) {
        try {
            JSONObject E2 = E();
            j.b(aVar, com.alipay.sdk.m.s.b.d().b(), f10783g0, E2.toString());
        } catch (Exception e11) {
            e.a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.alipay.sdk.m.s.a aVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(f10786j0);
            com.alipay.sdk.m.u.a.a(aVar, optJSONObject, com.alipay.sdk.m.u.a.a(aVar, jSONObject));
            if (optJSONObject != null) {
                a(optJSONObject);
            } else {
                e.e(E, w1.f68856f);
            }
        } catch (Throwable th2) {
            e.a(th2);
        }
    }

    private void a(JSONObject jSONObject) {
        this.f10803a = jSONObject.optInt(f10784h0, 10000);
        this.f10804b = jSONObject.optBoolean(f10785i0, false);
        this.f10805c = jSONObject.optString(f10787k0, G).trim();
        this.f10806d = jSONObject.optInt(f10789m0, 10);
        this.C = b.a(jSONObject.optJSONArray(f10788l0));
        this.f10807e = jSONObject.optBoolean(E0, false);
        this.f10808f = jSONObject.optBoolean(F0, true);
        this.f10811i = jSONObject.optBoolean(f10790n0, false);
        this.f10812j = jSONObject.optBoolean(f10791o0, true);
        this.f10813k = jSONObject.optBoolean(f10792p0, true);
        this.f10814l = jSONObject.optString(f10793q0, "");
        this.f10815m = jSONObject.optBoolean(f10795s0, false);
        this.f10816n = jSONObject.optBoolean(f10796t0, false);
        this.f10817o = jSONObject.optBoolean(f10797u0, false);
        this.f10818p = jSONObject.optBoolean(f10798v0, false);
        this.f10819q = jSONObject.optBoolean(f10799w0, true);
        this.f10820r = jSONObject.optString(f10800x0, "");
        this.f10825w = jSONObject.optBoolean(f10801y0, false);
        this.f10826x = jSONObject.optBoolean(f10794r0, false);
        this.f10828z = jSONObject.optBoolean(C0, false);
        this.f10821s = jSONObject.optString(G0, "");
        this.f10822t = jSONObject.optBoolean(H0, false);
        this.f10827y = jSONObject.optInt(A0, 1000);
        this.B = jSONObject.optBoolean(B0, true);
        this.f10823u = jSONObject.optBoolean(I0, false);
        this.f10824v = jSONObject.optBoolean(J0, false);
        this.f10809g = jSONObject.optBoolean(D0, false);
        this.A = jSONObject.optJSONObject(com.alipay.sdk.m.u.a.f11046b);
    }

    public void a(com.alipay.sdk.m.s.a aVar, Context context, boolean z11, int i11) {
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "oncfg|" + z11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i11);
        RunnableC0170a runnableC0170a = new RunnableC0170a(aVar, context, z11, i11);
        if (z11 && !n.h()) {
            int C = C();
            if (n.a(C, runnableC0170a, "AlipayDCPBlok")) {
                return;
            }
            com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10656m0, "" + C);
            return;
        }
        Thread thread = new Thread(runnableC0170a);
        thread.setName("AlipayDCP");
        thread.start();
    }

    public boolean a(Context context, int i11) {
        if (this.D == -1) {
            this.D = n.a();
            j.b(com.alipay.sdk.m.s.a.h(), context, f10802z0, String.valueOf(this.D));
        }
        return this.D < i11;
    }
}
