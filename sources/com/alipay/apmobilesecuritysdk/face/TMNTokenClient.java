package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.sdk.m.l.b;
import com.alipay.sdk.m.z.a;
import com.tencent.connect.common.Constants;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class TMNTokenClient {

    /* renamed from: a, reason: collision with root package name */
    public static TMNTokenClient f10385a;

    /* renamed from: b, reason: collision with root package name */
    public Context f10386b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface InitResultListener {
        void onResult(String str, int i11);
    }

    public TMNTokenClient(Context context) {
        this.f10386b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f10386b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f10385a == null) {
            synchronized (TMNTokenClient.class) {
                try {
                    if (f10385a == null) {
                        f10385a = new TMNTokenClient(context);
                    }
                } finally {
                }
            }
        }
        return f10385a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.a(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.a(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(b.f10730g, UtdidWrapper.getUtdid(this.f10386b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put("appName", str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put("rpcVersion", Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
        com.alipay.apmobilesecuritysdk.f.b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int a11 = new com.alipay.apmobilesecuritysdk.a.a(TMNTokenClient.this.f10386b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (a11 != 0) {
                    initResultListener2.onResult("", a11);
                } else {
                    initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(TMNTokenClient.this.f10386b, str), 0);
                }
            }
        });
    }
}
