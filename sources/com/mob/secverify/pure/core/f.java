package com.mob.secverify.pure.core;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.secverify.a.g;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.d.a;
import com.mob.secverify.e.h;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f40824a;

    private f() {
    }

    public static f a() {
        if (f40824a == null) {
            synchronized (f.class) {
                try {
                    if (f40824a == null) {
                        f40824a = new f();
                    }
                } finally {
                }
            }
        }
        return f40824a;
    }

    public String b() throws VerifyException {
        try {
            String c11 = com.mob.secverify.c.a.a().c();
            if (TextUtils.isEmpty(c11)) {
                com.mob.secverify.b.c.a().a("[SecPure][%s][%s] ==>%s", "VerifyCore", "getAccessToken", "Get token failed: get duid cost more than 10 seconds ");
                throw new VerifyException(new Throwable("Get token overtime"));
            }
            String str = "0:" + com.mob.secverify.e.b.a(c11);
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "VerifyCore", "getAccessToken", "Get token success: " + str);
            return str;
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().b(th2, "[SecPure][%s][%s] ==>%s", "VerifyCore", "getAccessToken", "Get token failed: " + th2.getMessage());
            if (th2 instanceof VerifyException) {
                throw th2;
            }
            throw new VerifyException(th2);
        }
    }

    public void c() {
        if (MobSDK.isForb()) {
            return;
        }
        com.mob.secverify.d.a.a(false).a(com.mob.secverify.c.a.a().b(), com.mob.secverify.c.c.a(1) + "api/pv", true, new a.C0489a<HashMap>() { // from class: com.mob.secverify.pure.core.f.1
            @Override // com.mob.secverify.d.a.C0489a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResultOk(HashMap hashMap) {
            }

            @Override // com.mob.secverify.d.a.C0489a
            public void onResultError(VerifyException verifyException) {
            }
        });
    }

    public HashMap d() throws VerifyException {
        long currentTimeMillis = System.currentTimeMillis();
        if (!h.b(MobSDK.getContext())) {
            com.mob.secverify.b.a aVar = com.mob.secverify.b.a.Init_No_Net;
            throw new VerifyException(aVar.a(), aVar.b());
        }
        HashMap<String, Object> d11 = com.mob.secverify.c.a.a().d();
        com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "init params cost time: " + (System.currentTimeMillis() - currentTimeMillis));
        if (TextUtils.isEmpty((String) d11.get(com.alipay.sdk.m.s.a.f11004r))) {
            com.mob.secverify.b.a aVar2 = com.mob.secverify.b.a.Init_APPKEY_NULL;
            throw new VerifyException(aVar2.a(), aVar2.b());
        }
        String str = com.mob.secverify.c.c.a(1) + "api/initSec";
        com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "do old init request");
        return com.mob.secverify.d.a.a(false).b(d11, str);
    }

    public HashMap e() throws VerifyException {
        if (!h.b(MobSDK.getContext())) {
            com.mob.secverify.b.a aVar = com.mob.secverify.b.a.Init_No_Net;
            throw new VerifyException(aVar.a(), aVar.b());
        }
        if (TextUtils.isEmpty(MobSDK.getAppkey())) {
            com.mob.secverify.b.a aVar2 = com.mob.secverify.b.a.Init_APPKEY_NULL;
            throw new VerifyException(aVar2.a(), aVar2.b());
        }
        String str = com.mob.secverify.c.c.a(3) + "api/initSecCdn/1/";
        StringBuilder sb2 = new StringBuilder();
        String packageName = DeviceHelper.getInstance(MobSDK.getContext()).getPackageName();
        String signMD5 = DeviceHelper.getInstance(MobSDK.getContext()).getSignMD5(packageName);
        sb2.append(MobSDK.getAppkey());
        sb2.append("/");
        sb2.append(packageName);
        sb2.append("/");
        sb2.append(signMD5);
        return com.mob.secverify.d.a.a(false).a(str + sb2.toString());
    }

    public void a(final String str, final InternalCallback<g> internalCallback) {
        if (MobSDK.isForb()) {
            internalCallback.onFailure(new VerifyException(new com.mob.secverify.common.exception.a()));
        } else {
            new Thread(new Runnable() { // from class: com.mob.secverify.pure.core.f.2
                @Override // java.lang.Runnable
                public void run() {
                    HashMap<String, Object> a11 = com.mob.secverify.c.a.a().a(str);
                    com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "VerifyCore", "requestCache", "start requestCache` with params" + new Hashon().fromHashMap(a11));
                    String b11 = a.a().b();
                    if (TextUtils.isEmpty(b11)) {
                        b11 = com.mob.secverify.c.c.a(2) + "api/usedMobile";
                    }
                    com.mob.secverify.d.a.a(false).a(a11, b11, new a.C0489a<HashMap>() { // from class: com.mob.secverify.pure.core.f.2.1
                        @Override // com.mob.secverify.d.a.C0489a
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public void onResultOk(HashMap hashMap) {
                            internalCallback.onSuccess(new g().b(new Hashon().fromHashMap(hashMap)));
                        }

                        @Override // com.mob.secverify.d.a.C0489a
                        public void onResultError(VerifyException verifyException) {
                            internalCallback.onFailure(verifyException);
                        }
                    });
                }
            }).start();
        }
    }
}
