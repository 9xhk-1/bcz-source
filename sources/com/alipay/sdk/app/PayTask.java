package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.e;
import com.alipay.sdk.m.u.h;
import com.alipay.sdk.m.u.i;
import com.alipay.sdk.m.u.l;
import com.alipay.sdk.m.u.n;
import com.alipay.sdk.util.H5PayResultModel;
import com.tencent.mobileqq.openpay.constants.OpenConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PayTask {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f10437h = h.class;

    /* renamed from: i, reason: collision with root package name */
    public static long f10438i;

    /* renamed from: a, reason: collision with root package name */
    public Activity f10439a;

    /* renamed from: b, reason: collision with root package name */
    public com.alipay.sdk.m.x.a f10440b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10441c = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: d, reason: collision with root package name */
    public final String f10442d = "mclient.alipay.com/service/rest.htm";

    /* renamed from: e, reason: collision with root package name */
    public final String f10443e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* renamed from: f, reason: collision with root package name */
    public final String f10444f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* renamed from: g, reason: collision with root package name */
    public Map<String, c> f10445g = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10446a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10447b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f10448c;

        public a(String str, boolean z11, H5PayCallback h5PayCallback) {
            this.f10446a = str;
            this.f10447b = z11;
            this.f10448c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            H5PayResultModel h5Pay = PayTask.this.h5Pay(new com.alipay.sdk.m.s.a(PayTask.this.f10439a, this.f10446a, "payInterceptorWithUrl"), this.f10446a, this.f10447b);
            e.d(com.alipay.sdk.m.l.a.A, "inc finished: " + h5Pay.getResultCode());
            this.f10448c.onPayResult(h5Pay);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public String f10451a;

        /* renamed from: b, reason: collision with root package name */
        public String f10452b;

        /* renamed from: c, reason: collision with root package name */
        public String f10453c;

        /* renamed from: d, reason: collision with root package name */
        public String f10454d;

        public c() {
            this.f10451a = "";
            this.f10452b = "";
            this.f10453c = "";
            this.f10454d = "";
        }

        public String a() {
            return this.f10453c;
        }

        public String b() {
            return this.f10451a;
        }

        public String c() {
            return this.f10452b;
        }

        public String d() {
            return this.f10454d;
        }

        public void a(String str) {
            this.f10453c = str;
        }

        public void b(String str) {
            this.f10451a = str;
        }

        public void c(String str) {
            this.f10452b = str;
        }

        public void d(String str) {
            this.f10454d = str;
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this();
        }
    }

    public PayTask(Activity activity) {
        this.f10439a = activity;
        com.alipay.sdk.m.s.b.d().a(this.f10439a);
        this.f10440b = new com.alipay.sdk.m.x.a(activity, com.alipay.sdk.m.x.a.f11147j);
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                com.alipay.sdk.m.s.b.d().a(context);
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - f10438i < com.alipay.sdk.m.m.a.D().d()) {
                    return false;
                }
                f10438i = elapsedRealtime;
                com.alipay.sdk.m.m.a.D().a(com.alipay.sdk.m.s.a.h(), context.getApplicationContext(), false, 4);
                return true;
            } catch (Exception e11) {
                e.a(e11);
                return false;
            }
        }
    }

    public void dismissLoading() {
        com.alipay.sdk.m.x.a aVar = this.f10440b;
        if (aVar != null) {
            aVar.a();
            this.f10440b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0019, code lost:
    
        if (r0.startsWith("http://wappaygw.alipay.com/service/rest.htm") != false) goto L12;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String fetchOrderInfoFromH5PayUrl(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.fetchOrderInfoFromH5PayUrl(java.lang.String):java.lang.String");
    }

    public synchronized String fetchTradeToken() {
        return i.a(new com.alipay.sdk.m.s.a(this.f10439a, "", "fetchTradeToken"), this.f10439a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.15";
    }

    public synchronized H5PayResultModel h5Pay(com.alipay.sdk.m.s.a aVar, String str, boolean z11) {
        H5PayResultModel h5PayResultModel;
        h5PayResultModel = new H5PayResultModel();
        try {
            String[] split = a(aVar, str, z11).split(i.f11097b);
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                int indexOf = str2.indexOf("={");
                if (indexOf >= 0) {
                    String substring = str2.substring(0, indexOf);
                    hashMap.put(substring, a(str2, substring));
                }
            }
            if (hashMap.containsKey(l.f11107a)) {
                h5PayResultModel.setResultCode(hashMap.get(l.f11107a));
            }
            h5PayResultModel.setReturnUrl(a(str, hashMap));
            if (TextUtils.isEmpty(h5PayResultModel.getReturnUrl())) {
                com.alipay.sdk.m.k.a.b(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10658n0, "");
            }
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10660o0, th2);
            e.a(th2);
        }
        return h5PayResultModel;
    }

    public synchronized String pay(String str, boolean z11) {
        if (com.alipay.sdk.m.u.b.a()) {
            return com.alipay.sdk.m.j.b.b();
        }
        return a(new com.alipay.sdk.m.s.a(this.f10439a, str, OpenConstants.API_NAME_PAY), str, z11);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z11, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        try {
            fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
            if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
                e.d(com.alipay.sdk.m.l.a.A, "intercepted: " + fetchOrderInfoFromH5PayUrl);
                new Thread(new a(fetchOrderInfoFromH5PayUrl, z11, h5PayCallback)).start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z11) {
        String a11;
        com.alipay.sdk.m.s.a aVar;
        try {
            if (com.alipay.sdk.m.u.b.a()) {
                a11 = com.alipay.sdk.m.j.b.b();
                aVar = null;
            } else {
                com.alipay.sdk.m.s.a aVar2 = new com.alipay.sdk.m.s.a(this.f10439a, str, "payV2");
                a11 = a(aVar2, str, z11);
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return l.a(aVar, a11);
    }

    public void showLoading() {
        com.alipay.sdk.m.x.a aVar = this.f10440b;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010b, code lost:
    
        if (com.alipay.sdk.m.m.a.D().s() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0170, code lost:
    
        dismissLoading();
        com.alipay.sdk.m.k.a.b(r6.f10439a.getApplicationContext(), r7, r8, r7.f11016d);
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.A, "pay returning: " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0163, code lost:
    
        com.alipay.sdk.m.m.a.D().a(r7, r6.f10439a.getApplicationContext(), false, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if (com.alipay.sdk.m.m.a.D().s() != false) goto L38;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.lang.String a(com.alipay.sdk.m.s.a r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.m.s.a, java.lang.String, boolean):java.lang.String");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements h.g {
        public b() {
        }

        @Override // com.alipay.sdk.m.u.h.g
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // com.alipay.sdk.m.u.h.g
        public void b() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:8:0x001e, B:10:0x0044, B:12:0x0051, B:13:0x0059), top: B:7:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "sc"
            java.lang.String r1 = ""
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L18
            r3 = 0
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r6.versionName     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> L16
            goto L1e
        L16:
            r6 = move-exception
            goto L1a
        L18:
            r6 = move-exception
            r2 = r1
        L1a:
            com.alipay.sdk.m.u.e.a(r6)
            r6 = r1
        L1e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "appkey"
            java.lang.String r5 = "2014052600006128"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "ty"
            java.lang.String r5 = "and_lite"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "sv"
            java.lang.String r5 = "h.a.3.8.15"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "an"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "av"
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "sdk_start_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L57
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L57
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != 0) goto L59
            java.lang.String r6 = "h5tonative"
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r6 = move-exception
            goto L5e
        L59:
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L57
            return r6
        L5e:
            com.alipay.sdk.m.u.e.a(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(android.content.Context):java.lang.String");
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    private boolean a(boolean z11, boolean z12, String str, StringBuilder sb2, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                String str3 = strArr[i11];
                if (!TextUtils.isEmpty(map.get(str3))) {
                    str2 = map.get(str3);
                    break;
                }
                i11++;
            } else {
                str2 = "";
                break;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return !z12;
        }
        if (z11) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=\"");
            sb2.append(str2);
            sb2.append("\"");
            return true;
        }
        sb2.append(str);
        sb2.append("=\"");
        sb2.append(str2);
        sb2.append("\"");
        return true;
    }

    private String a(String str, Map<String, String> map) throws UnsupportedEncodingException {
        boolean equals = "9000".equals(map.get(l.f11107a));
        String str2 = map.get("result");
        c remove = this.f10445g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String a11 = a(n.a("&callBackUrl=\"", "\"", str2), n.a("&call_back_url=\"", "\"", str2), n.a(com.alipay.sdk.m.l.a.f10718u, "\"", str2), URLDecoder.decode(n.a(com.alipay.sdk.m.l.a.f10719v, "&", str2), "utf-8"), URLDecoder.decode(n.a("&callBackUrl=", "&", str2), "utf-8"), n.a("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(a11)) {
                return a11;
            }
        }
        if (remove != null) {
            String b11 = equals ? remove.b() : remove.c();
            if (!TextUtils.isEmpty(b11)) {
                return b11;
            }
        }
        return remove != null ? com.alipay.sdk.m.m.a.D().r() : "";
    }

    private String a(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(i.f11099d));
    }

    private h.g a() {
        return new b();
    }

    private String a(String str, com.alipay.sdk.m.s.a aVar) {
        String a11 = aVar.a(str);
        if (a11.contains("paymethod=\"expressGateway\"")) {
            return a(aVar, a11);
        }
        List<a.b> l11 = com.alipay.sdk.m.m.a.D().l();
        if (!com.alipay.sdk.m.m.a.D().f10810h || l11 == null) {
            l11 = com.alipay.sdk.m.j.a.f10605d;
        }
        if (n.a(aVar, (Context) this.f10439a, l11, true)) {
            h hVar = new h(this.f10439a, aVar, a());
            e.d(com.alipay.sdk.m.l.a.A, "pay inner started: " + a11);
            String a12 = hVar.a(a11, false);
            if (!TextUtils.isEmpty(a12)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("resultStatus={");
                com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.ACTIVITY_NOT_START_EXIT;
                sb2.append(cVar.b());
                sb2.append(i.f11099d);
                if (a12.contains(sb2.toString())) {
                    n.a("alipaySdk", com.alipay.sdk.m.l.b.f10740q, this.f10439a, aVar);
                    if (com.alipay.sdk.m.m.a.D().A()) {
                        a12 = hVar.a(a11, true);
                    } else {
                        a12 = a12.replace("resultStatus={" + cVar.b() + i.f11099d, "resultStatus={" + com.alipay.sdk.m.j.c.CANCELED.b() + i.f11099d);
                    }
                }
            }
            e.d(com.alipay.sdk.m.l.a.A, "pay inner raw result: " + a12);
            hVar.a();
            boolean w11 = com.alipay.sdk.m.m.a.D().w();
            if (!TextUtils.equals(a12, "failed") && !TextUtils.equals(a12, h.f11075k) && (!w11 || !aVar.e())) {
                if (TextUtils.isEmpty(a12)) {
                    return com.alipay.sdk.m.j.b.a();
                }
                if (!a12.contains(PayResultActivity.f10425b)) {
                    return a12;
                }
                com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10652k0);
                return a(aVar, a11, l11, a12, this.f10439a);
            }
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10649i0);
            return a(aVar, a11);
        }
        com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10650j0);
        return a(aVar, a11);
    }

    public static String a(com.alipay.sdk.m.s.a aVar, String str, List<a.b> list, String str2, Activity activity) {
        n.c a11 = n.a(aVar, activity, list);
        if (a11 == null || a11.a(aVar) || a11.a() || !TextUtils.equals(a11.f11124a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        e.b(com.alipay.sdk.m.l.a.A, "PayTask not_login");
        String valueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> hashMap = PayResultActivity.f10426c;
        hashMap.put(valueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f10429f, str);
        intent.putExtra(PayResultActivity.f10430g, activity.getPackageName());
        intent.putExtra(PayResultActivity.f10428e, valueOf);
        a.C0175a.a(aVar, intent);
        activity.startActivity(intent);
        synchronized (hashMap.get(valueOf)) {
            try {
                e.b(com.alipay.sdk.m.l.a.A, "PayTask wait");
                hashMap.get(valueOf).wait();
            } catch (InterruptedException unused) {
                e.b(com.alipay.sdk.m.l.a.A, "PayTask interrupted");
                return com.alipay.sdk.m.j.b.a();
            }
        }
        String str3 = PayResultActivity.b.f10436b;
        e.b(com.alipay.sdk.m.l.a.A, "PayTask ret: " + str3);
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(com.alipay.sdk.m.s.a r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.m.s.a, java.lang.String):java.lang.String");
    }

    private void a(com.alipay.sdk.m.s.a aVar, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString(com.alipay.sdk.m.t.a.f11033j);
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                return;
            }
            com.alipay.sdk.m.t.a.a(com.alipay.sdk.m.s.b.d().b()).a(optString, optString2);
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.P, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        r0 = r6.c();
        r11 = com.alipay.sdk.m.j.b.a(java.lang.Integer.valueOf(r0[1]).intValue(), r0[0], com.alipay.sdk.m.u.n.e(r10, r0[2]));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(com.alipay.sdk.m.s.a r10, com.alipay.sdk.m.r.b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(com.alipay.sdk.m.s.a, com.alipay.sdk.m.r.b, java.lang.String):java.lang.String");
    }

    private String a(com.alipay.sdk.m.s.a aVar, com.alipay.sdk.m.r.b bVar) {
        String[] c11 = bVar.c();
        Intent intent = new Intent(this.f10439a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", c11[0]);
        if (c11.length == 2) {
            bundle.putString("cookie", c11[1]);
        }
        intent.putExtras(bundle);
        a.C0175a.a(aVar, intent);
        this.f10439a.startActivity(intent);
        Object obj = f10437h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e11) {
                e.a(e11);
                return com.alipay.sdk.m.j.b.a();
            }
        }
        String d11 = com.alipay.sdk.m.j.b.d();
        return TextUtils.isEmpty(d11) ? com.alipay.sdk.m.j.b.a() : d11;
    }
}
