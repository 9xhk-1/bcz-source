package com.mob.secverify.pure.core.ope.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.mob.secverify.b.b;
import com.mob.secverify.b.c;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.exception.VerifyErr;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.pure.b.d;
import com.mob.secverify.pure.b.f;
import com.mob.secverify.pure.core.ope.b.c.e;
import com.mob.secverify.pure.core.ope.b.c.g;
import com.mob.secverify.pure.core.ope.b.c.j;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a f40861a;

    /* renamed from: b, reason: collision with root package name */
    private Context f40862b;

    /* renamed from: c, reason: collision with root package name */
    private VerifyErr f40863c;

    private a(Context context) {
        this.f40862b = context;
    }

    public static a a(Context context) {
        if (f40861a == null) {
            synchronized (a.class) {
                try {
                    if (f40861a == null) {
                        f40861a = new a(context);
                    }
                } finally {
                }
            }
        }
        return f40861a;
    }

    private com.mob.secverify.pure.core.ope.b.b.a b(e eVar, HttpURLConnection httpURLConnection) {
        int responseCode;
        if (httpURLConnection != null) {
            try {
                responseCode = httpURLConnection.getResponseCode();
            } catch (Exception e11) {
                c.a().b("[SecPure][%s][%s] ==>%s", "RequestHelper", "redirectOrResponse", "network request exception" + e11.toString());
                return null;
            }
        } else {
            responseCode = -1;
        }
        if (responseCode == 200) {
            return new com.mob.secverify.pure.core.ope.b.b.a(0, a(httpURLConnection, "UTF-8"), false);
        }
        if (responseCode != 301 && responseCode != 302) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
        String path = httpURLConnection.getURL().getPath();
        if (TextUtils.isEmpty(headerField) || eVar == null) {
            return null;
        }
        eVar.b().b(headerField);
        HttpURLConnection a11 = eVar.a(headerField, false);
        if (TextUtils.isEmpty(headerField2)) {
            a11.setRequestProperty("Cookie", j.a());
        } else {
            if ("/ctcnet/gctcmc.do".equals(path)) {
                j.a(headerField2);
            }
            a11.setRequestProperty("Cookie", headerField2);
        }
        if (a11 == null) {
            return new com.mob.secverify.pure.core.ope.b.b.a(0, a(), false);
        }
        eVar.c();
        return a(eVar, a11);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.net.HttpURLConnection r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "[SecPure] ==>%s"
            r1 = 0
            if (r5 == 0) goto L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L2b java.io.UnsupportedEncodingException -> L2e
            r2.<init>()     // Catch: java.io.IOException -> L2b java.io.UnsupportedEncodingException -> L2e
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            r4.<init>(r5, r6)     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            r3.<init>(r4)     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
        L18:
            java.lang.String r5 = r3.readLine()     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            if (r5 == 0) goto L4a
            r2.append(r5)     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            r5 = 10
            r2.append(r5)     // Catch: java.io.IOException -> L27 java.io.UnsupportedEncodingException -> L29
            goto L18
        L27:
            r5 = move-exception
            goto L31
        L29:
            r5 = move-exception
            goto L3d
        L2b:
            r5 = move-exception
            r2 = r1
            goto L31
        L2e:
            r5 = move-exception
            r2 = r1
            goto L3d
        L31:
            com.mob.secverify.b.c r6 = com.mob.secverify.b.c.a()
            java.lang.String r5 = r5.toString()
            r6.c(r0, r5)
            goto L4a
        L3d:
            com.mob.secverify.b.c r6 = com.mob.secverify.b.c.a()
            java.lang.String r5 = r5.toString()
            r6.c(r0, r5)
            goto L4a
        L49:
            r2 = r1
        L4a:
            if (r2 != 0) goto L4d
            return r1
        L4d:
            java.lang.String r5 = r2.toString()
            java.lang.String r5 = r5.trim()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.b.a.a.a(java.net.HttpURLConnection, java.lang.String):java.lang.String");
    }

    private static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("status", 102001);
            jSONObject.put("msg", f.a("switch_mobile_network_failed", "switch mobile network failed"));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a(d dVar, InternalCallback internalCallback, b bVar, String str, String str2) {
        if (dVar.a() == 2) {
            this.f40863c = VerifyErr.C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_TOKEN_ERR;
        } else {
            this.f40863c = VerifyErr.C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_CODE_ERR;
        }
        g a11 = com.mob.secverify.pure.core.ope.b.c.f.a().a(str, str2);
        if (a11 == null) {
            internalCallback.onFailure(new VerifyException(this.f40863c, new Throwable("params exception")));
            return;
        }
        e eVar = new e(this.f40862b, a11);
        String a12 = eVar.a();
        if (bVar != null) {
            bVar.a("cu_switch_s");
        }
        HttpURLConnection a13 = eVar.a(a12, false);
        if (bVar != null) {
            bVar.a("cu_switch_e");
        }
        if (a13 == null) {
            internalCallback.onFailure(new VerifyException(this.f40863c, new Throwable("network request exception")));
            return;
        }
        com.mob.secverify.pure.core.ope.b.b.a a14 = a(eVar, a13);
        if (bVar != null) {
            bVar.a("cu_request");
        }
        if (a14.a() == 0 && a14.b() != null) {
            String obj = a14.b().toString();
            try {
                if (new JSONObject(obj).optInt("code") != 0) {
                    internalCallback.onFailure(new VerifyException(this.f40863c, new Throwable(obj)));
                    return;
                }
                com.mob.secverify.a.a a15 = a(obj, str2);
                if (a15 == null) {
                    internalCallback.onFailure(new VerifyException(this.f40863c, new Throwable("decode exception")));
                    return;
                }
                if (dVar.a() == 1) {
                    PreVerifyResult preVerifyResult = new PreVerifyResult(a15.e(), "CUCC");
                    com.mob.secverify.pure.b.c.a().a(a15);
                    j.b(obj);
                    internalCallback.onSuccess(preVerifyResult);
                    return;
                }
                VerifyResult verifyResult = new VerifyResult(a15.e(), a15.c(), "CUCC");
                j.b(null);
                internalCallback.onSuccess(verifyResult);
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        internalCallback.onFailure(new VerifyException(this.f40863c, new Throwable((String) a14.b())));
    }

    private com.mob.secverify.a.a a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new com.mob.secverify.a.d(jSONObject.optInt("code"), jSONObject.optString("msg"), jSONObject.optInt("status"), com.mob.secverify.pure.core.ope.b.c.b.a(jSONObject.optString("obj"), str2), jSONObject.optString(ma.b.f72887a));
        } catch (Throwable th2) {
            c.a().b("[SecPure][%s][%s] ==>%s", "RequestHelper", "getAccessCode", "server data format error" + th2);
            return null;
        }
    }

    private com.mob.secverify.pure.core.ope.b.b.a a(e eVar, HttpURLConnection httpURLConnection) {
        com.mob.secverify.pure.core.ope.b.b.a aVar;
        try {
            aVar = b(eVar, eVar.a(httpURLConnection));
        } catch (Throwable th2) {
            c.a().b("[SecPure][%s][%s] ==>%s", "getResultEntity network request exception" + th2.toString());
            aVar = null;
        }
        return aVar == null ? new com.mob.secverify.pure.core.ope.b.b.a(1, f.a("network_exception", "network exception"), false) : aVar;
    }
}
