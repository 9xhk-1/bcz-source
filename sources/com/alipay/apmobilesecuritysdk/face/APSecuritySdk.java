package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.alipay.sdk.m.a0.f;
import com.alipay.sdk.m.l.b;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class APSecuritySdk implements f {

    /* renamed from: a, reason: collision with root package name */
    public static APSecuritySdk f10377a;
    public static APSecBgCheckerInterface bgChecker;

    /* renamed from: c, reason: collision with root package name */
    public static IDeviceInfo f10378c;

    /* renamed from: d, reason: collision with root package name */
    public static Object f10379d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Context f10380b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f10380b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f10378c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f10377a == null) {
            synchronized (f10379d) {
                try {
                    if (f10377a == null) {
                        f10377a = new APSecuritySdk(context);
                    }
                } finally {
                }
            }
        }
        return f10377a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f10378c = iDeviceInfo;
    }

    @Override // com.alipay.sdk.m.a0.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f10378c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String a11 = a.a(this.f10380b, "");
        if (com.alipay.sdk.m.z.a.a(a11)) {
            initToken(0, new HashMap(), null);
        }
        return a11;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202303020703";
    }

    @Override // com.alipay.sdk.m.a0.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f10378c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f10380b, "");
            tokenResult.clientKey = h.f(this.f10380b);
            tokenResult.apdid = a.a(this.f10380b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f10380b);
            if (com.alipay.sdk.m.z.a.a(tokenResult.apdid) || com.alipay.sdk.m.z.a.a(tokenResult.apdidToken) || com.alipay.sdk.m.z.a.a(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i11, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i11);
        String b11 = h.b(this.f10380b);
        String c11 = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (com.alipay.sdk.m.z.a.b(b11) && !com.alipay.sdk.m.z.a.a(b11, c11)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.f10380b);
            d.a(this.f10380b);
            g.a(this.f10380b);
            i.h();
        }
        if (!com.alipay.sdk.m.z.a.a(b11, c11)) {
            h.c(this.f10380b, c11);
        }
        String a11 = com.alipay.sdk.m.z.a.a(map, b.f10730g, "");
        String a12 = com.alipay.sdk.m.z.a.a(map, "tid", "");
        String a13 = com.alipay.sdk.m.z.a.a(map, "userId", "");
        if (com.alipay.sdk.m.z.a.a(a11)) {
            a11 = UtdidWrapper.getUtdid(this.f10380b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(b.f10730g, a11);
        hashMap.put("tid", a12);
        hashMap.put("userId", a13);
        hashMap.put("appName", "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
        com.alipay.apmobilesecuritysdk.f.b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.f10380b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }

    @Override // com.alipay.sdk.m.a0.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
