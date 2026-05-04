package com.alipay.sdk.m.u;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.alipay.sdk.app.AlipayResultActivity;
import com.alipay.sdk.m.s.a;
import com.alipay.sdk.m.u.n;
import com.baicizhan.client.business.webview.JsonParams;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: j, reason: collision with root package name */
    public static final String f11074j = "failed";

    /* renamed from: k, reason: collision with root package name */
    public static final String f11075k = "scheme_failed";

    /* renamed from: a, reason: collision with root package name */
    public Activity f11076a;

    /* renamed from: b, reason: collision with root package name */
    public volatile IAlixPay f11077b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11079d;

    /* renamed from: e, reason: collision with root package name */
    public g f11080e;

    /* renamed from: f, reason: collision with root package name */
    public final com.alipay.sdk.m.s.a f11081f;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11078c = IAlixPay.class;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11082g = false;

    /* renamed from: h, reason: collision with root package name */
    public String f11083h = null;

    /* renamed from: i, reason: collision with root package name */
    public String f11084i = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements AlipayResultActivity.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f11085a;

        public a(CountDownLatch countDownLatch) {
            this.f11085a = countDownLatch;
        }

        @Override // com.alipay.sdk.app.AlipayResultActivity.a
        public void a(int i11, String str, String str2) {
            h.this.f11083h = com.alipay.sdk.m.j.b.a(i11, str, str2);
            this.f11085a.countDown();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements APayEntranceActivity.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f11087a;

        public b(Object obj) {
            this.f11087a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            h.this.f11084i = str;
            synchronized (this.f11087a) {
                try {
                    this.f11087a.notify();
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ APayEntranceActivity.a f11089a;

        public c(APayEntranceActivity.a aVar) {
            this.f11089a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f11081f == null || h.this.f11081f.d()) {
                return;
            }
            com.alipay.sdk.m.k.a.b(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10645e0, "");
            if (com.alipay.sdk.m.m.a.D().w()) {
                h.this.f11081f.b(true);
                this.f11089a.a(com.alipay.sdk.m.j.b.a());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f11091a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f11092b;

        public d(Intent intent, Object obj) {
            this.f11091a = intent;
            this.f11092b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (h.this.f11076a != null) {
                    h.this.f11076a.startActivity(this.f11091a);
                    return;
                }
                com.alipay.sdk.m.k.a.b(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10643c0, "");
                Context a11 = h.this.f11081f.a();
                if (a11 != null) {
                    a11.startActivity(this.f11091a);
                }
            } finally {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends IRemoteServiceCallback.Stub {
        public e() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10661p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (h.this.f11080e != null) {
                    h.this.f11080e.a();
                }
                if (h.this.f11081f != null) {
                    h.this.f11081f.c(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i11, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i11);
                intent.putExtras(bundle);
            } catch (Exception e11) {
                com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.Z, e11);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, "isFg", runningAppProcessInfo.processName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + runningAppProcessInfo.importance + HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            } catch (Throwable unused) {
            }
            try {
                if (h.this.f11076a == null) {
                    com.alipay.sdk.m.k.a.b(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10641a0, "");
                    Context a11 = h.this.f11081f.a();
                    if (a11 != null) {
                        a11.startActivity(intent);
                        return;
                    }
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                h.this.f11076a.startActivity(intent);
                com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, "stAct2", "" + (SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10642b0, th2);
                throw th2;
            }
        }

        public /* synthetic */ e(h hVar, a aVar) {
            this();
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z11, String str) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements ServiceConnection {
        public f() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, "srvCon");
            synchronized (h.this.f11078c) {
                h.this.f11077b = IAlixPay.Stub.asInterface(iBinder);
                h.this.f11078c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            com.alipay.sdk.m.k.a.a(h.this.f11081f, com.alipay.sdk.m.k.b.f10653l, "srvDis");
            h.this.f11077b = null;
        }

        public /* synthetic */ f(h hVar, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a();

        void b();
    }

    public h(Activity activity, com.alipay.sdk.m.s.a aVar, g gVar) {
        this.f11076a = activity;
        this.f11081f = aVar;
        this.f11080e = gVar;
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.A, "alipaySdk");
    }

    private String b(String str, String str2) {
        JSONObject jSONObject;
        Object obj = new Object();
        String a11 = n.a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSAStart", a11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + elapsedRealtime);
        a.C0175a.a(this.f11081f, a11);
        b bVar = new b(obj);
        APayEntranceActivity.f10395h.put(a11, bVar);
        try {
            HashMap<String, String> a12 = com.alipay.sdk.m.s.a.a(this.f11081f);
            a12.put("ts_intent", String.valueOf(elapsedRealtime));
            jSONObject = new JSONObject(a12);
        } catch (Throwable th2) {
            try {
                com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSALocEx", th2);
                jSONObject = null;
            } catch (InterruptedException e11) {
                com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSAWaiting", e11);
                com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
                return com.alipay.sdk.m.j.b.a(cVar.b(), cVar.a(), "");
            } catch (Throwable th3) {
                com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSAEx", th3);
                n.a("alipaySdk", com.alipay.sdk.m.l.b.f10740q, this.f11076a, this.f11081f);
                return f11075k;
            }
        }
        Intent intent = new Intent(this.f11076a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra(APayEntranceActivity.f10391d, str);
        intent.putExtra(APayEntranceActivity.f10392e, str2);
        intent.putExtra(APayEntranceActivity.f10393f, a11);
        if (jSONObject != null) {
            intent.putExtra(APayEntranceActivity.f10394g, jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new c(bVar), com.alipay.sdk.m.m.a.D().k());
        Activity activity = this.f11076a;
        com.alipay.sdk.m.s.a aVar = this.f11081f;
        com.alipay.sdk.m.k.a.a(activity, aVar, str, aVar.f11016d);
        if (com.alipay.sdk.m.m.a.D().z()) {
            new Handler(Looper.getMainLooper()).post(new d(intent, obj));
        } else {
            try {
                Activity activity2 = this.f11076a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    com.alipay.sdk.m.k.a.b(this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10641a0, "");
                    Context a13 = this.f11081f.a();
                    if (a13 != null) {
                        a13.startActivity(intent);
                    }
                }
            } catch (Throwable th4) {
                com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10642b0, th4);
                throw th4;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.f11084i;
        String str4 = "unknown";
        try {
            String str5 = l.a(this.f11081f, str3).get(l.f11107a);
            str4 = str5 == null ? "null" : str5;
        } catch (Throwable th5) {
            com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSAStatEx", th5);
        }
        com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSADone-" + str4);
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSAEmpty");
        return f11075k;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #1 {all -> 0x0050, blocks: (B:12:0x0023, B:14:0x002b, B:17:0x0033, B:20:0x003c, B:23:0x0042, B:26:0x004b, B:27:0x0056, B:30:0x005b, B:32:0x0065, B:73:0x0052), top: B:11:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            r1 = 0
            com.alipay.sdk.m.m.a r2 = com.alipay.sdk.m.m.a.D()     // Catch: java.lang.Throwable -> Lae
            java.util.List r2 = r2.l()     // Catch: java.lang.Throwable -> Lae
            com.alipay.sdk.m.m.a r3 = com.alipay.sdk.m.m.a.D()     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.f10810h     // Catch: java.lang.Throwable -> Lae
            if (r3 == 0) goto L15
            if (r2 != 0) goto L17
        L15:
            java.util.List<com.alipay.sdk.m.m.a$b> r2 = com.alipay.sdk.m.j.a.f10605d     // Catch: java.lang.Throwable -> Lae
        L17:
            com.alipay.sdk.m.s.a r3 = r8.f11081f     // Catch: java.lang.Throwable -> Lae
            android.app.Activity r4 = r8.f11076a     // Catch: java.lang.Throwable -> Lae
            com.alipay.sdk.m.u.n$c r2 = com.alipay.sdk.m.u.n.a(r3, r4, r2)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "failed"
            if (r2 == 0) goto Lad
            com.alipay.sdk.m.s.a r4 = r8.f11081f     // Catch: java.lang.Throwable -> L50
            boolean r4 = r2.a(r4)     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto Lad
            boolean r4 = r2.a()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L33
            goto Lad
        L33:
            android.content.pm.PackageInfo r4 = r2.f11124a     // Catch: java.lang.Throwable -> L50
            boolean r4 = com.alipay.sdk.m.u.n.a(r4)     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L3c
            return r3
        L3c:
            android.content.pm.PackageInfo r3 = r2.f11124a     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L52
            java.lang.String r4 = "com.eg.android.AlipayGphone"
            java.lang.String r3 = r3.packageName     // Catch: java.lang.Throwable -> L50
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4b
            goto L52
        L4b:
            android.content.pm.PackageInfo r3 = r2.f11124a     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r3.packageName     // Catch: java.lang.Throwable -> L50
            goto L56
        L50:
            r3 = move-exception
            goto Lb0
        L52:
            java.lang.String r0 = com.alipay.sdk.m.u.n.b()     // Catch: java.lang.Throwable -> L50
        L56:
            android.content.pm.PackageInfo r3 = r2.f11124a     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L5b
            r1 = r3
        L5b:
            com.alipay.sdk.m.m.a r3 = com.alipay.sdk.m.m.a.D()     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto Lb9
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L50
            if (r4 <= 0) goto Lb9
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb9
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONObject r3 = r4.optJSONObject(r0)     // Catch: java.lang.Throwable -> Lb9
            if (r3 == 0) goto Lb9
            int r4 = r3.length()     // Catch: java.lang.Throwable -> Lb9
            if (r4 <= 0) goto Lb9
            java.util.Iterator r4 = r3.keys()     // Catch: java.lang.Throwable -> Lb9
        L80:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb9
            int r6 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L80
            int r7 = r1.versionCode     // Catch: java.lang.Throwable -> Lb9
            if (r7 < r6) goto L80
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> Lb9
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> Lb9
            com.alipay.sdk.m.m.a r6 = com.alipay.sdk.m.m.a.D()     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> Lb9
            android.app.Activity r7 = r8.f11076a     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> Lb9
            boolean r5 = r6.a(r7, r5)     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> Lb9
            r8.f11082g = r5     // Catch: java.lang.Exception -> L80 java.lang.Throwable -> Lb9
            if (r5 == 0) goto L80
            goto Lb9
        Lad:
            return r3
        Lae:
            r3 = move-exception
            r2 = r1
        Lb0:
            com.alipay.sdk.m.s.a r4 = r8.f11081f
            java.lang.String r5 = "biz"
            java.lang.String r6 = "CheckClientSignEx"
            com.alipay.sdk.m.k.a.a(r4, r5, r6, r3)
        Lb9:
            com.alipay.sdk.m.s.a r3 = r8.f11081f
            boolean r3 = com.alipay.sdk.m.u.n.b(r3)
            if (r10 != 0) goto Lc5
            boolean r10 = r8.f11082g
            if (r10 == 0) goto Ld6
        Lc5:
            if (r3 != 0) goto Ld6
            android.app.Activity r10 = r8.f11076a
            com.alipay.sdk.m.s.a r3 = r8.f11081f
            boolean r10 = b(r0, r10, r3)
            if (r10 == 0) goto Ld6
            java.lang.String r9 = r8.a(r9, r0, r1)
            return r9
        Ld6:
            java.lang.String r9 = r8.a(r9, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.u.h.a(java.lang.String, boolean):java.lang.String");
    }

    private void a(n.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.f11124a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f11076a.startActivity(intent);
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.f10647g0, th2);
        }
        Thread.sleep(200L);
    }

    private String a(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.A, "pay payInvokeAct");
        com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, com.alipay.sdk.m.k.b.X, str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3);
        Activity activity = this.f11076a;
        com.alipay.sdk.m.s.a aVar = this.f11081f;
        com.alipay.sdk.m.k.a.a(activity, aVar, str, aVar.f11016d);
        return b(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r9, java.lang.String r10, android.content.pm.PackageInfo r11, com.alipay.sdk.m.u.n.c r12) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.u.h.a(java.lang.String, java.lang.String, android.content.pm.PackageInfo, com.alipay.sdk.m.u.n$c):java.lang.String");
    }

    public static boolean b(String str, Context context, com.alipay.sdk.m.s.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "BSADetectFail");
            return false;
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "BSADetectFail", th2);
            return false;
        }
    }

    private String a(String str, String str2) {
        String str3;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        String a11 = n.a(32);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPStart", a11 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + elapsedRealtime);
        a.C0175a.a(this.f11081f, a11);
        AlipayResultActivity.f10399a.put(a11, new a(countDownLatch));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourcePid", Binder.getCallingPid());
            jSONObject.put(com.alipay.sdk.m.l.b.f10727d, str);
            jSONObject.put(PushClientConstants.TAG_PKG_NAME, this.f11076a.getPackageName());
            jSONObject.put(JsonParams.ShareResultO.CHANNEL_WEIXIN, a11);
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes("UTF-8"), 2);
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path(com.igexin.push.core.b.f37745q).appendQueryParameter("appId", "20000125");
            appendQueryParameter.appendQueryParameter("mqpSchemePay", encodeToString);
            try {
                HashMap<String, String> a12 = com.alipay.sdk.m.s.a.a(this.f11081f);
                a12.put("ts_scheme", String.valueOf(elapsedRealtime));
                appendQueryParameter.appendQueryParameter("mqpLoc", new JSONObject(a12).toString());
            } catch (Throwable th2) {
                com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPLocEx", th2);
            }
            String uri = appendQueryParameter.build().toString();
            Intent intent = new Intent();
            intent.setPackage(str2);
            intent.addFlags(268435456);
            intent.setData(Uri.parse(uri));
            Activity activity = this.f11076a;
            com.alipay.sdk.m.s.a aVar = this.f11081f;
            com.alipay.sdk.m.k.a.a(activity, aVar, str, aVar.f11016d);
            this.f11076a.startActivity(intent);
            com.alipay.sdk.m.u.e.d(com.alipay.sdk.m.l.a.A, "pay scheme waiting " + uri);
            countDownLatch.await();
            String str4 = this.f11083h;
            try {
                str3 = l.a(this.f11081f, str4).get(l.f11107a);
                if (str3 == null) {
                    str3 = "null";
                }
            } catch (Throwable th3) {
                com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPStatEx", th3);
                str3 = "unknown";
            }
            com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPDone-" + str3);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPEmpty");
            return f11075k;
        } catch (InterruptedException e11) {
            com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPWaiting", e11);
            com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
            return com.alipay.sdk.m.j.b.a(cVar.b(), cVar.a(), "");
        } catch (Throwable th4) {
            com.alipay.sdk.m.k.a.a(this.f11081f, com.alipay.sdk.m.k.b.f10653l, "BSPEx", th4);
            return f11075k;
        }
    }

    public static boolean a(String str, Context context, com.alipay.sdk.m.s.a aVar) {
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.setClassName(str, "com.alipay.android.msp.ui.views.MspContainerActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "BSPDetectFail");
            return false;
        } catch (Throwable th2) {
            com.alipay.sdk.m.k.a.a(aVar, com.alipay.sdk.m.k.b.f10653l, "BSPDetectFail", th2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.String, java.lang.Boolean> a(java.lang.String r19, java.lang.String r20, com.alipay.sdk.m.s.a r21) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.u.h.a(java.lang.String, java.lang.String, com.alipay.sdk.m.s.a):android.util.Pair");
    }

    public void a() {
        this.f11076a = null;
        this.f11080e = null;
    }
}
