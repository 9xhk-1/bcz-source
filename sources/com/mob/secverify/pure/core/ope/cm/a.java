package com.mob.secverify.pure.core.ope.cm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mob.MobSDK;
import com.mob.secverify.b.b;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.exception.VerifyErr;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.pure.core.ope.cm.a.c;
import com.mob.secverify.pure.core.ope.cm.a.d;
import com.mob.secverify.pure.core.ope.cm.b.c;
import com.mob.secverify.pure.core.ope.cm.b.h;
import com.mob.secverify.pure.core.ope.cm.d.e;
import com.mob.secverify.pure.core.ope.cm.d.f;
import com.mob.secverify.pure.core.ope.cm.d.i;
import com.mob.secverify.pure.core.ope.cm.d.j;
import com.mob.secverify.pure.core.ope.cm.net.NetworkUtil;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;
import com.mob.tools.utils.DeviceHelper;
import com.tencent.open.SocialConstants;
import n6.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends com.mob.secverify.pure.core.ope.a {

    /* renamed from: g, reason: collision with root package name */
    private static long f40891g = 8000;

    /* renamed from: h, reason: collision with root package name */
    private static volatile boolean f40892h = false;

    /* renamed from: i, reason: collision with root package name */
    private b f40893i;

    public a(String str, String str2, String str3, b bVar) {
        super(str, str2, str3);
        this.f40893i = bVar;
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void b(InternalCallback<VerifyResult> internalCallback) {
        a((InternalCallback) internalCallback, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, String str, final d dVar, Throwable th2) {
        if (!j.e()) {
            new com.mob.secverify.pure.core.ope.cm.c.b().a(context, str, dVar, th2);
        }
        c.a(new c.a(context, dVar) { // from class: com.mob.secverify.pure.core.ope.cm.a.2
            @Override // com.mob.secverify.pure.core.ope.cm.a.c.a
            public void a() {
                if ((dVar.f40947w || j.a()) && !a.f40892h) {
                    a.b(context, dVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, final d dVar) {
        c.a(new c.a(context, dVar) { // from class: com.mob.secverify.pure.core.ope.cm.a.3
            @Override // com.mob.secverify.pure.core.ope.cm.a.c.a
            public void a() {
                com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "get config >>>>>>>>");
                String c11 = com.mob.secverify.pure.b.b.c(dVar.H);
                new NetworkUtil(context, null).a(com.mob.secverify.pure.b.b.s().substring(0, 46), c11, false, new NetworkUtil.NetworkCallback() { // from class: com.mob.secverify.pure.core.ope.cm.a.3.1
                    @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                    public void onFailed(String str, String str2, String str3) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("resultCode", str);
                            jSONObject.put(SocialConstants.PARAM_APP_DESC, str2);
                        } catch (Throwable th2) {
                            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
                        }
                    }

                    @Override // com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback
                    public void onSuccess(String str, String str2) {
                        com.mob.secverify.pure.core.ope.cm.b.b b11 = new com.mob.secverify.pure.core.ope.cm.b.b().b(str);
                        if ("103000".equals(b11.f40956d)) {
                            boolean unused = a.f40892h = true;
                            try {
                                j.a(new JSONObject(b11.a()));
                            } catch (JSONException e11) {
                                com.mob.secverify.b.c.a().a(e11, e11.getMessage());
                            }
                        }
                    }
                }, "POST", dVar);
            }
        });
    }

    private void b() {
        i.f(null);
        i.c(0L);
    }

    @Override // com.mob.secverify.pure.core.ope.a
    public void a(InternalCallback<PreVerifyResult> internalCallback) {
        a((InternalCallback) internalCallback, false);
    }

    private void a(final InternalCallback internalCallback, final boolean z11) {
        InternalCallback internalCallback2;
        try {
            String h11 = i.h();
            com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Buffered scrip: " + h11);
            boolean z12 = System.currentTimeMillis() - i.i() >= 3600000;
            try {
                if (TextUtils.isEmpty(h11) || z12) {
                    com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Request scrip!");
                    b();
                    d dVar = new d();
                    String str = "general";
                    if (z11) {
                        str = "login";
                    }
                    dVar.M = str;
                    dVar.N = "";
                    dVar.O = System.currentTimeMillis();
                    String str2 = this.f40833d;
                    dVar.H = str2;
                    String str3 = this.f40834e;
                    dVar.G = str3;
                    dVar.B = false;
                    if (a(dVar, str2, str3, "preGetMobile", 3)) {
                        com.mob.secverify.pure.core.ope.cm.a.b.a().a(this.f40835f, dVar, new com.mob.secverify.pure.core.ope.cm.a.a() { // from class: com.mob.secverify.pure.core.ope.cm.a.1
                            @Override // com.mob.secverify.pure.core.ope.cm.a.a
                            public void a(String str4, d dVar2, String str5) {
                                com.mob.secverify.pure.core.ope.cm.b.c a11 = new com.mob.secverify.pure.core.ope.cm.b.c().b(str5).a(dVar2);
                                if (!"103000".equals(str4)) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("resultCode", str4);
                                        jSONObject.put(SocialConstants.PARAM_APP_DESC, a11.f40966e);
                                    } catch (Throwable unused) {
                                    }
                                    if (z11) {
                                        internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR, new Throwable(jSONObject.toString())));
                                        return;
                                    } else {
                                        internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_CODE_ERR, new Throwable(jSONObject.toString())));
                                        return;
                                    }
                                }
                                h a12 = a11.a();
                                i.f(a12.c());
                                i.c(System.currentTimeMillis());
                                c.a aVar = a11.f40967f;
                                if (aVar != null) {
                                    String str6 = aVar.f40976i;
                                    if (TextUtils.isEmpty(str6)) {
                                        str6 = aVar.f40977j;
                                    }
                                    dVar2.f40939o = str6;
                                    dVar2.f40940p = aVar.f40968a;
                                    dVar2.f40941q = aVar.f40974g;
                                    dVar2.f40942r = aVar.f40969b;
                                }
                                if (z11) {
                                    a aVar2 = a.this;
                                    aVar2.a(((com.mob.secverify.pure.core.ope.a) aVar2).f40835f, dVar2, a12.b(), null, internalCallback, a.this.f40893i);
                                    return;
                                }
                                a.b(((com.mob.secverify.pure.core.ope.a) a.this).f40835f, str4, dVar2, null);
                                try {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("resultCode", "103000");
                                    jSONObject2.put(SocialConstants.PARAM_APP_DESC, m.f74525c);
                                    jSONObject2.put("traceId", dVar2.D);
                                    com.mob.secverify.a.b bVar = new com.mob.secverify.a.b(-1, jSONObject2);
                                    bVar.c(a12.b());
                                    com.mob.secverify.pure.b.c.a().a(bVar);
                                } catch (Throwable unused2) {
                                }
                                internalCallback.onSuccess(a12.d());
                            }

                            @Override // com.mob.secverify.pure.core.ope.cm.a.a
                            public void a(String str4, d dVar2, Throwable th2) {
                                if (z11) {
                                    internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR, th2));
                                } else {
                                    internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_CODE_ERR, th2));
                                }
                                a.b(((com.mob.secverify.pure.core.ope.a) a.this).f40835f, str4, dVar2, th2);
                            }
                        }, this.f40893i);
                        return;
                    } else {
                        internalCallback.onFailure(new VerifyException(VerifyErr.C_ILLEGAL_PARAMS));
                        return;
                    }
                }
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "Use buff scrip!");
                h a11 = new h().a(h11);
                if (z11) {
                    com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "VerifyResult class");
                    internalCallback2 = internalCallback;
                    try {
                        a(this.f40835f, null, a11.b(), a11.a(), internalCallback2, this.f40893i);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        com.mob.secverify.b.c.a().a(th);
                        internalCallback2.onFailure(new VerifyException(VerifyErr.C_UNKNOWN_ERROR));
                        return;
                    }
                }
                com.mob.secverify.b.c.a().b("[SecPure] ==>%s", "PreVerifyResult class");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", "103000");
                jSONObject.put(SocialConstants.PARAM_APP_DESC, m.f74525c);
                jSONObject.put("traceId", f.a());
                com.mob.secverify.a.b bVar = new com.mob.secverify.a.b(-1, jSONObject);
                bVar.c(a11.b());
                com.mob.secverify.pure.b.c.a().a(bVar);
                internalCallback.onSuccess(a11.d());
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            internalCallback2 = internalCallback;
        }
    }

    private static boolean a(d dVar, String str, String str2, String str3, int i11) {
        boolean z11;
        dVar.D = f.a();
        long currentTimeMillis = System.currentTimeMillis();
        dVar.E = com.mob.secverify.pure.core.ope.cm.d.d.a(currentTimeMillis);
        dVar.F = currentTimeMillis;
        dVar.C = str3;
        dVar.G = str2;
        dVar.H = str;
        dVar.f40950z = String.valueOf(f40891g);
        dVar.f40944t = i11;
        dVar.f40928d = j.d();
        try {
            z11 = DeviceHelper.getInstance(MobSDK.getContext()).checkPermission("android.permission.READ_PHONE_STATE");
        } catch (Throwable unused) {
            Log.d("[SecPure] ==>%s", "Check permission error");
            z11 = false;
        }
        Log.d("[SecPure] ==>%s", "has READ_PHONE_STATE permission?" + z11);
        dVar.I = z11;
        dVar.J = e.p();
        dVar.K = String.valueOf(e.m());
        dVar.L = e.q();
        String c11 = e.c();
        String b11 = e.b();
        String n11 = e.n();
        String g11 = e.g();
        dVar.f40938n = b11;
        dVar.f40936l = n11;
        dVar.f40927c = g11;
        if (TextUtils.isEmpty(c11)) {
            Log.d("[SecPure] ==>%s", "use iccid as cache key");
            dVar.f40935k = true;
        }
        dVar.f40937m = c11;
        Log.d("[SecPure] ==>%s", "isCachePhoneScrip = " + dVar.B);
        if (!TextUtils.isEmpty(g11)) {
            return true;
        }
        dVar.f40931g = "0";
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, d dVar, final String str, String str2, final InternalCallback<VerifyResult> internalCallback, b bVar) {
        if (dVar == null) {
            dVar = new d();
            dVar.M = "login";
            dVar.N = "";
            dVar.O = System.currentTimeMillis();
            dVar.f40940p = str2;
            dVar.H = this.f40833d;
            dVar.G = this.f40834e;
            dVar.B = true;
        }
        if (a(dVar, this.f40833d, this.f40834e, "loginAuth", 1)) {
            com.mob.secverify.pure.core.ope.cm.a.b.a().b(context, dVar, new com.mob.secverify.pure.core.ope.cm.a.a() { // from class: com.mob.secverify.pure.core.ope.cm.a.4
                @Override // com.mob.secverify.pure.core.ope.cm.a.a
                public void a(String str3, d dVar2, String str4) {
                    com.mob.secverify.pure.core.ope.cm.b.d b11 = new com.mob.secverify.pure.core.ope.cm.b.d().b(str4);
                    com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "Cmcc Verify response code = " + str3);
                    a.b(context, str3, dVar2, null);
                    if (!"103000".equals(str3)) {
                        internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR, new Throwable(str4)));
                        return;
                    }
                    dVar2.f40940p = b11.f40979a;
                    dVar2.f40939o = b11.f40982d;
                    VerifyResult a11 = b11.a();
                    a11.setSecurityPhone(str);
                    internalCallback.onSuccess(a11);
                }

                @Override // com.mob.secverify.pure.core.ope.cm.a.a
                public void a(String str3, d dVar2, Throwable th2) {
                    a.b(context, str3, dVar2, th2);
                    internalCallback.onFailure(new VerifyException(VerifyErr.C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR, th2));
                }
            }, bVar);
        } else {
            internalCallback.onFailure(new VerifyException(VerifyErr.C_ILLEGAL_PARAMS));
        }
        b();
    }
}
