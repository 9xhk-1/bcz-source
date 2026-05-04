package com.mob.secverify.pure.core.ope.cm.c;

import android.content.Context;
import android.text.TextUtils;
import com.mob.secverify.b.c;
import com.mob.secverify.pure.core.ope.cm.CmCallback;
import com.mob.secverify.pure.core.ope.cm.a.c;
import com.mob.secverify.pure.core.ope.cm.a.d;
import com.mob.secverify.pure.core.ope.cm.b.e;
import com.mob.secverify.pure.core.ope.cm.d.e;
import com.mob.secverify.pure.core.ope.cm.d.i;
import com.mob.secverify.pure.core.ope.cm.d.j;
import com.mob.secverify.pure.core.ope.cm.net.NetworkUtil;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private d f41018a;

    /* renamed from: b, reason: collision with root package name */
    private Context f41019b;

    public void a(Context context, String str, d dVar, Throwable th2) {
        JSONArray jSONArray;
        this.f41019b = context;
        try {
            a aVar = new a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resultCode", str);
            jSONObject.put("PGWResultCode", dVar.f40949y);
            JSONObject jSONObject2 = new JSONObject();
            aVar.B(String.valueOf(e.q()));
            jSONObject2.put("timeOut", dVar.f40950z);
            jSONObject2.put("imsiState", dVar.A);
            if (dVar.B) {
                aVar.t("scrip");
            } else {
                aVar.t("pgw");
            }
            if ("loginAuth".equals(dVar.C)) {
                aVar.y("loginAuth");
            } else if ("mobileAuth".equals(dVar.C)) {
                aVar.y("mobileAuth");
            } else {
                aVar.y("preGetMobile");
            }
            aVar.u(dVar.D);
            aVar.z(dVar.H);
            aVar.n(e.l());
            aVar.o(e.i());
            aVar.A("quick_login_android_5.7.2");
            aVar.l("android");
            aVar.m(dVar.f40950z);
            aVar.v(dVar.E);
            aVar.a(dVar.I ? "1" : "0");
            long currentTimeMillis = System.currentTimeMillis();
            aVar.x(com.mob.secverify.pure.core.ope.cm.d.d.a(currentTimeMillis));
            aVar.k(String.valueOf(currentTimeMillis - dVar.F));
            aVar.j(dVar.f40926b);
            dVar.f40926b = "";
            aVar.f(dVar.f40925a);
            dVar.f40925a = "";
            aVar.g(dVar.f40929e);
            dVar.f40929e = "";
            aVar.h(String.valueOf(dVar.P));
            aVar.q(dVar.f40927c);
            int i11 = dVar.L;
            if (i11 == 0) {
                aVar.B(String.valueOf(e.q()));
            } else {
                aVar.B(String.valueOf(i11));
            }
            aVar.w(dVar.J);
            aVar.i(e.d());
            aVar.r(e.e());
            aVar.s(e.f());
            aVar.p(dVar.K);
            aVar.e(str);
            aVar.d("0");
            aVar.c(dVar.A);
            aVar.k(String.valueOf(System.currentTimeMillis() - dVar.O));
            if (th2 != null) {
                jSONArray = new JSONArray();
                JSONObject jSONObject3 = new JSONObject();
                StringBuffer stringBuffer = new StringBuffer();
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    stringBuffer.append("\n");
                    stringBuffer.append(stackTraceElement.toString());
                }
                jSONObject3.put("message", th2.toString());
                jSONObject3.put("stack", stringBuffer.toString());
                jSONArray.put(jSONObject3);
            } else {
                jSONArray = null;
            }
            if (a.f40993b.size() > 0) {
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                }
                Iterator<Throwable> it = a.f40993b.iterator();
                while (it.hasNext()) {
                    Throwable next = it.next();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    JSONObject jSONObject4 = new JSONObject();
                    for (StackTraceElement stackTraceElement2 : next.getStackTrace()) {
                        stringBuffer2.append("\n");
                        stringBuffer2.append(stackTraceElement2.toString());
                    }
                    jSONObject4.put("message", next.toString());
                    jSONObject4.put("stack", stringBuffer2.toString());
                    jSONArray.put(jSONObject4);
                }
                a.f40993b.clear();
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                aVar.a(jSONArray);
            }
            aVar.b(i.a());
            aVar.C(e.g());
            c.a().b("[SecPure] ==>%s", "login log " + aVar.a());
            a(this.f41019b, aVar.a(), dVar);
        } catch (Throwable th3) {
            c.a().a(th3, th3.getMessage());
        }
    }

    public void a(Context context, final String str, d dVar) {
        this.f41018a = dVar;
        this.f41019b = context;
        com.mob.secverify.pure.core.ope.cm.a.c.a(new c.a() { // from class: com.mob.secverify.pure.core.ope.cm.c.b.1
            @Override // com.mob.secverify.pure.core.ope.cm.a.c.a
            public void a() {
                b.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(new JSONObject(str));
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Append logs error.");
        }
        a(jSONArray, (CmCallback) null);
    }

    private void a(JSONArray jSONArray, CmCallback cmCallback) {
        com.mob.secverify.pure.core.ope.cm.b.e eVar = new com.mob.secverify.pure.core.ope.cm.b.e();
        e.a aVar = new e.a();
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        aVar.a(jSONArray);
        eVar.a(aVar);
        String c11 = j.c();
        if (TextUtils.isEmpty(c11)) {
            c11 = com.mob.secverify.pure.b.b.t().substring(0, 46);
        }
        com.mob.secverify.pure.core.ope.cm.net.a.a(j.a(j.c()));
        a(c11, eVar, (CmCallback<String>) cmCallback);
    }

    private void a(String str, com.mob.secverify.pure.core.ope.cm.b.e eVar, final CmCallback<String> cmCallback) {
        if (j.g() == 0 || j.f() == 0 || System.currentTimeMillis() > i.f() + j.g()) {
            new NetworkUtil(this.f41019b, null).a(str, com.mob.secverify.pure.b.b.b(this.f41018a.H, eVar.a().a().toString()), false, new NetworkUtil.NetworkCallback() { // from class: com.mob.secverify.pure.core.ope.cm.c.b.2
                @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                public void onFailed(String str2, String str3, String str4) {
                    if (j.g() != 0 && j.f() != 0) {
                        int g11 = i.g() + 1;
                        if (g11 >= j.f()) {
                            i.c(0);
                            i.b(System.currentTimeMillis());
                        } else {
                            i.c(g11);
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("resultCode", str2);
                        jSONObject.put(SocialConstants.PARAM_APP_DESC, str3);
                    } catch (Throwable th2) {
                        com.mob.secverify.b.c.a().a(th2, th2.getMessage());
                    }
                    CmCallback cmCallback2 = cmCallback;
                    if (cmCallback2 != null) {
                        cmCallback2.onFailed(new Throwable(jSONObject.toString()));
                    }
                }

                @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                public void onSuccess(String str2, String str3) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        CmCallback cmCallback2 = cmCallback;
                        if (cmCallback2 != null) {
                            cmCallback2.onSuccess(jSONObject.toString());
                        }
                    } catch (Throwable th2) {
                        com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
                        onFailed("200021", "data parser exception ", str3);
                    }
                }
            }, "POST", this.f41018a);
        }
    }
}
