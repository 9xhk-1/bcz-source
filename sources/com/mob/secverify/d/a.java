package com.mob.secverify.d;

import com.mob.MobCommunicator;
import com.mob.MobSDK;
import com.mob.secverify.b.c;
import com.mob.secverify.common.exception.VerifyErr;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f40716a;

    /* renamed from: b, reason: collision with root package name */
    private MobCommunicator f40717b;

    /* renamed from: c, reason: collision with root package name */
    private final Hashon f40718c = new Hashon();

    /* renamed from: d, reason: collision with root package name */
    private NetworkHelper f40719d;

    private a(boolean z11) {
        String str;
        String str2;
        if (z11) {
            str = "97ef82c15a0d8f056f3eabe8e06adc47dccef8b3bc45824ebf1b0e4d04ad696ce390a719f23bfd726a709fccfbd8074cecf1cddfc5989a9c1d99ccd829d8991b";
            str2 = "1eac6c0206e34ff3d7cc558d05f657a99dc01bd75f44a72cd86a875ff8fa97e3b024627a68374ab90eddee7f182b9dcee2f64f97113e7473673e6b293d416220d725a60552c679bc37d1826982e0b9ef000c8d202126d665acf3698c1eae656eb0d06b6c0b923ff0f4194aa46634634c39c854bd75086b66eff132dc308746d3";
        } else {
            str = "d008219b14c84872559aaf9e69d1348175289c186912da64b2393bab376bb0d6b471220cb29cbc9875b148b593eb9d7c4c359549a1aff22f6de9d18d22f0b6cb";
            str2 = "1f228b2b8fbb7317674db20bab1d4b0f0ddb3e1f3a93177f1821c026ffd7c6b782be720a308ab69bf6c631c3c0c4d68bf9d92ddaaf712a032d591ba1c296df13332a23e37b281e5fd9b93ab016dd3efc5de45e264ed692ac63ac40013f507cd272b7aeeb85be9fe2f31f11b8c55d904b5331932c70c7cf3f2b05cb802f6b89a7";
        }
        this.f40717b = new MobCommunicator(1024, str, str2);
        this.f40719d = new NetworkHelper();
    }

    public static a a(boolean z11) {
        if (f40716a == null) {
            synchronized (a.class) {
                try {
                    if (f40716a == null) {
                        f40716a = new a(z11);
                    }
                } finally {
                }
            }
        }
        return f40716a;
    }

    public HashMap b(HashMap<String, Object> hashMap, String str) throws VerifyException {
        if (MobSDK.isForb()) {
            com.mob.secverify.b.a aVar = com.mob.secverify.b.a.Init_No_Privacy;
            throw new VerifyException(aVar.a(), aVar.b());
        }
        try {
            return (HashMap) this.f40717b.requestSynchronized(hashMap, str, false);
        } catch (Throwable th2) {
            com.mob.secverify.b.a aVar2 = com.mob.secverify.b.a.Init_Server_Error;
            throw new VerifyException(aVar2.a(), aVar2.b(), th2);
        }
    }

    public void a(HashMap<String, Object> hashMap, String str, C0489a<HashMap> c0489a) {
        a(hashMap, str, false, c0489a);
    }

    public void a(HashMap<String, Object> hashMap, String str, boolean z11, C0489a<HashMap> c0489a) {
        if (MobSDK.isForb()) {
            return;
        }
        try {
            HashMap hashMap2 = (HashMap) this.f40717b.requestSynchronized(hashMap, str, false);
            if (z11) {
                if (hashMap2 != null && !hashMap2.isEmpty()) {
                    c0489a.onResultError(new VerifyException(VerifyErr.C_RESPONSE_DATA_ABNORMAL));
                    return;
                }
                c0489a.onResultOk(hashMap2);
                return;
            }
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                c0489a.onResultOk(hashMap2);
                return;
            }
            c0489a.onResultError(new VerifyException(VerifyErr.C_RESPONSE_DATA_ABNORMAL));
        } catch (Throwable th2) {
            c.a().b("[SecPure] ==>%s", "url:" + str + "request error:" + th2.getMessage());
            c0489a.onResultError(new VerifyException(VerifyErr.C_RESPONSE_DATA_ABNORMAL, th2));
        }
    }

    public HashMap<String, Object> a(HashMap<String, Object> hashMap, String str) throws Throwable {
        return (HashMap) this.f40717b.requestSynchronized(hashMap, str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r0 = com.mob.secverify.b.a.Init_Server_Error;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        throw new com.mob.secverify.common.exception.VerifyException(r0.a(), r0.b(), new java.lang.Throwable(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap a(java.lang.String r6) throws com.mob.secverify.common.exception.VerifyException {
        /*
            r5 = this;
            boolean r0 = com.mob.MobSDK.isForb()
            if (r0 != 0) goto Lc4
            com.mob.tools.network.NetworkHelper$NetworkTimeOut r0 = new com.mob.tools.network.NetworkHelper$NetworkTimeOut     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            r1 = 3000(0xbb8, float:4.204E-42)
            r0.connectionTimeout = r1     // Catch: java.lang.Throwable -> L32
            r1 = 5000(0x1388, float:7.006E-42)
            r0.readTimout = r1     // Catch: java.lang.Throwable -> L32
            com.mob.tools.network.NetworkHelper r1 = r5.f40719d     // Catch: java.lang.Throwable -> L32
            r2 = 0
            java.lang.String r6 = r1.httpGet(r6, r2, r2, r0)     // Catch: java.lang.Throwable -> L32
            r0 = 0
            byte[] r6 = android.util.Base64.decode(r6, r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = com.mob.secverify.e.g.d()     // Catch: java.lang.Throwable -> L32
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            com.mob.secverify.pure.b.c r1 = com.mob.secverify.pure.b.c.a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.f()     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r6 = move-exception
            goto L8f
        L34:
            java.lang.String r6 = com.mob.tools.utils.Data.AES128Decode(r1, r6)     // Catch: java.lang.Throwable -> L32
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L32
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "res"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> L32
            r3 = 1
            com.mob.tools.utils.Hashon r4 = r5.f40718c     // Catch: java.lang.Throwable -> L4b
            java.util.HashMap r2 = r4.fromJson(r6)     // Catch: java.lang.Throwable -> L4b
            goto L4c
        L4b:
            r0 = r3
        L4c:
            java.lang.String r6 = "status"
            int r6 = r1.optInt(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "error"
            java.lang.String r1 = r1.optString(r4)     // Catch: java.lang.Throwable -> L32
            r4 = 200(0xc8, float:2.8E-43)
            if (r6 != r4) goto L60
            if (r0 == 0) goto L5f
            goto L60
        L5f:
            r3 = r0
        L60:
            if (r3 != 0) goto L7a
            if (r2 == 0) goto L65
            return r2
        L65:
            com.mob.secverify.common.exception.VerifyException r6 = new com.mob.secverify.common.exception.VerifyException     // Catch: java.lang.Throwable -> L32
            com.mob.secverify.b.a r0 = com.mob.secverify.b.a.Init_Server_Error     // Catch: java.lang.Throwable -> L32
            int r2 = r0.a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L32
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L32
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L7a:
            com.mob.secverify.common.exception.VerifyException r6 = new com.mob.secverify.common.exception.VerifyException     // Catch: java.lang.Throwable -> L32
            com.mob.secverify.b.a r0 = com.mob.secverify.b.a.Init_Server_Error     // Catch: java.lang.Throwable -> L32
            int r2 = r0.a()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L32
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L32
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L8f:
            com.mob.secverify.b.c r0 = com.mob.secverify.b.c.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cdn init error: "
            r1.append(r2)
            java.lang.String r2 = com.mob.secverify.e.h.a(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "[SecPure] ==>%s"
            r0.b(r2, r1)
            boolean r0 = r6 instanceof com.mob.secverify.common.exception.VerifyException
            if (r0 == 0) goto Lb4
            com.mob.secverify.common.exception.VerifyException r6 = (com.mob.secverify.common.exception.VerifyException) r6
            throw r6
        Lb4:
            com.mob.secverify.common.exception.VerifyException r0 = new com.mob.secverify.common.exception.VerifyException
            com.mob.secverify.b.a r1 = com.mob.secverify.b.a.Init_Unexpected_Error
            int r2 = r1.a()
            java.lang.String r1 = r1.b()
            r0.<init>(r2, r1, r6)
            throw r0
        Lc4:
            com.mob.secverify.common.exception.VerifyException r6 = new com.mob.secverify.common.exception.VerifyException
            com.mob.secverify.b.a r0 = com.mob.secverify.b.a.Init_No_Privacy
            int r1 = r0.a()
            java.lang.String r0 = r0.b()
            r6.<init>(r1, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.d.a.a(java.lang.String):java.util.HashMap");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.mob.secverify.d.a$a, reason: collision with other inner class name */
    public static class C0489a<T> {
        public void onResultError(VerifyException verifyException) {
        }

        public void onResultOk(T t11) {
        }
    }
}
