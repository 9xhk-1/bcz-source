package com.mob.secverify.pure.core.ope.cm.a;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.alipay.sdk.m.u.i;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.mob.secverify.pure.b.e;
import com.mob.secverify.pure.core.ope.cm.a.c;
import com.mob.secverify.pure.core.ope.cm.d.j;
import com.mob.secverify.pure.core.ope.cm.net.NetworkUtil;
import com.mob.tools.utils.Hashon;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f40906a;

    private b() {
    }

    public void b(final Context context, final d dVar, final a aVar, final com.mob.secverify.b.b bVar) {
        c.a(new c.a(context, dVar) { // from class: com.mob.secverify.pure.core.ope.cm.a.b.2
            @Override // com.mob.secverify.pure.core.ope.cm.a.c.a
            public void a() {
                Log.i("[SecPure] ==>%s", "get platform token >>>>>>>>" + dVar.f40941q);
                d dVar2 = dVar;
                if (dVar2.f40944t == 1) {
                    dVar2.f40943s = BasicPushStatus.SUCCESS_CODE;
                }
                com.mob.secverify.pure.core.ope.cm.net.a.a(j.a(j.b()));
                d dVar3 = dVar;
                dVar3.f40926b = dVar3.f40926b + "getAuthToken;";
                dVar.f40948x = "6.0";
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                String substring = com.mob.secverify.pure.b.b.r().substring(0, 57);
                d dVar4 = dVar;
                new NetworkUtil(context, bVar).a(substring, com.mob.secverify.pure.b.b.a(dVar4.H, dVar4.G, dVar4.f40940p, dVar4.f40942r), false, new NetworkUtil.NetworkCallback() { // from class: com.mob.secverify.pure.core.ope.cm.a.b.2.1
                    @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                    public void onFailed(String str, String str2, String str3) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("resultCode", str);
                            jSONObject.put(SocialConstants.PARAM_APP_DESC, str2);
                        } catch (Throwable th2) {
                            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str, dVar, new Throwable(jSONObject.toString()));
                        }
                        e.a(context).a();
                    }

                    @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                    public void onSuccess(String str, String str2) {
                        String str3 = new com.mob.secverify.pure.core.ope.cm.b.d().b(str).f40989m;
                        Log.d("SecPure", "resultCode:" + str3);
                        d dVar5 = dVar;
                        dVar5.f40925a = dVar5.f40925a + str3 + i.f11097b;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        d dVar6 = dVar;
                        dVar6.f40929e = dVar6.f40929e + elapsedRealtime2 + i.f11097b;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str3, dVar, str);
                        }
                        e.a(context).a();
                    }
                }, "POST", dVar);
            }
        });
    }

    public static b a() {
        if (f40906a == null) {
            synchronized (b.class) {
                try {
                    if (f40906a == null) {
                        f40906a = new b();
                    }
                } finally {
                }
            }
        }
        return f40906a;
    }

    public void a(final Context context, final d dVar, final a aVar, final com.mob.secverify.b.b bVar) {
        c.a(new c.a(context, dVar) { // from class: com.mob.secverify.pure.core.ope.cm.a.b.1
            @Override // com.mob.secverify.pure.core.ope.cm.a.c.a
            public void a() {
                com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "getPhoneScrip >>>>>>>>");
                d dVar2 = dVar;
                dVar2.f40926b = dVar2.f40926b + "getPrePhonescrip;";
                dVar.f40948x = "7.0";
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                String substring = com.mob.secverify.pure.b.b.q().substring(0, 55);
                d dVar3 = dVar;
                String f11 = com.mob.secverify.pure.b.b.f(dVar3.H, dVar3.G);
                try {
                    JSONObject jSONObject = new JSONObject(f11);
                    String string = jSONObject.getString("aesKey");
                    jSONObject.remove("aesKey");
                    f11 = jSONObject.toString();
                    dVar.f40930f = string;
                } catch (JSONException unused) {
                    com.mob.secverify.b.c.a().a("SecPure", "no aes key");
                }
                new NetworkUtil(context, bVar).a(substring, f11, true, new NetworkUtil.NetworkCallback() { // from class: com.mob.secverify.pure.core.ope.cm.a.b.1.1
                    @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                    public void onFailed(String str, String str2, String str3) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("resultCode", str);
                            jSONObject2.put(SocialConstants.PARAM_APP_DESC, str2);
                        } catch (Throwable th2) {
                            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
                        }
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(str, dVar, new Throwable(jSONObject2.toString()));
                        }
                        e.a(context).a();
                    }

                    @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                    public void onSuccess(String str, String str2) {
                        String a11 = b.this.a(str);
                        d dVar4 = dVar;
                        dVar4.f40925a = dVar4.f40925a + a11 + i.f11097b;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        d dVar5 = dVar;
                        dVar5.f40929e = dVar5.f40929e + elapsedRealtime2 + i.f11097b;
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.a(a11, dVar, str);
                        }
                        e.a(context).a();
                    }
                }, "POST", dVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        try {
            return String.valueOf(new Hashon().fromJson(str).get("resultCode"));
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "getResultCode exception.", th2);
            return "";
        }
    }
}
