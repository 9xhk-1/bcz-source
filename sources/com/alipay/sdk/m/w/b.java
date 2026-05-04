package com.alipay.sdk.m.w;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.m.w.a;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements a.InterfaceC0177a<Object, Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.m.w.a.InterfaceC0177a
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.w.b$b, reason: collision with other inner class name */
    public static class CallableC0178b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11135a;

        public CallableC0178b(Context context) {
            this.f11135a = context;
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            return com.alipay.sdk.m.b.c.a(this.f11135a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a.InterfaceC0177a<Object, Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.m.w.a.InterfaceC0177a
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements Callable<NetworkInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11136a;

        public d(Context context) {
            this.f11136a = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f11136a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements a.InterfaceC0177a<Object, Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.m.w.a.InterfaceC0177a
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11137a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.s.a f11138b;

        public f(Context context, com.alipay.sdk.m.s.a aVar) {
            this.f11137a = context;
            this.f11138b = aVar;
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            try {
                return com.alipay.sdk.m.n0.a.c(this.f11137a);
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.b(this.f11138b, com.alipay.sdk.m.k.b.f10659o, com.alipay.sdk.m.k.b.f10671u, th2.getClass().getName());
                return "";
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements a.InterfaceC0177a<Object, Boolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.alipay.sdk.m.w.a.InterfaceC0177a
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11139a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11140b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f11141c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.s.a f11142d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements APSecuritySdk.InitResultListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f11143a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f11144b;

            public a(String[] strArr, ConditionVariable conditionVariable) {
                this.f11143a = strArr;
                this.f11144b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f11143a[0] = tokenResult.apdidToken;
                }
                this.f11144b.open();
            }
        }

        public h(String str, String str2, Context context, com.alipay.sdk.m.s.a aVar) {
            this.f11139a = str;
            this.f11140b = str2;
            this.f11141c = context;
            this.f11142d = aVar;
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            HashMap hashMap = new HashMap();
            hashMap.put("tid", this.f11139a);
            hashMap.put(com.alipay.sdk.m.l.b.f10730g, this.f11140b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f11141c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, hashMap, new a(strArr, conditionVariable));
                conditionVariable.block(3000L);
            } catch (Throwable th2) {
                com.alipay.sdk.m.u.e.a(th2);
                com.alipay.sdk.m.k.a.b(this.f11142d, com.alipay.sdk.m.k.b.f10659o, com.alipay.sdk.m.k.b.f10665r, th2.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                com.alipay.sdk.m.k.a.b(this.f11142d, com.alipay.sdk.m.k.b.f10659o, com.alipay.sdk.m.k.b.f10667s, "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo a(com.alipay.sdk.m.s.a aVar, Context context) {
        Context a11 = com.alipay.sdk.m.w.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) com.alipay.sdk.m.w.a.a(2, 10L, timeUnit, new c(), new d(a11), false, 10L, timeUnit, aVar, false);
    }

    public static String b(com.alipay.sdk.m.s.a aVar, Context context) {
        if (!com.alipay.sdk.m.m.a.D().x()) {
            return "";
        }
        return (String) com.alipay.sdk.m.w.a.a(1, 1L, TimeUnit.DAYS, new a(), new CallableC0178b(com.alipay.sdk.m.w.a.a(context)), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
    }

    public static String c(com.alipay.sdk.m.s.a aVar, Context context) {
        return (String) com.alipay.sdk.m.w.a.a(3, 1L, TimeUnit.DAYS, new e(), new f(com.alipay.sdk.m.w.a.a(context), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }

    public static String a(com.alipay.sdk.m.s.a aVar, Context context, String str, String str2) {
        Context a11 = com.alipay.sdk.m.w.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) com.alipay.sdk.m.w.a.a(4, 10L, timeUnit, new g(), new h(str, str2, a11, aVar), true, 3L, timeUnit, aVar, true);
    }
}
