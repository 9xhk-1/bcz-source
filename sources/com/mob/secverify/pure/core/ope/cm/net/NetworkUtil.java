package com.mob.secverify.pure.core.ope.cm.net;

import android.content.Context;
import android.net.Network;
import android.util.Log;
import com.mob.MobSDK;
import com.mob.secverify.b.b;
import com.mob.secverify.b.c;
import com.mob.secverify.e.h;
import com.mob.secverify.pure.core.ope.b.c.e;
import com.mob.secverify.pure.core.ope.cm.a.d;
import java.lang.Thread;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class NetworkUtil {

    /* renamed from: a, reason: collision with root package name */
    private String f41030a;

    /* renamed from: d, reason: collision with root package name */
    private Context f41033d;

    /* renamed from: f, reason: collision with root package name */
    private b f41035f;

    /* renamed from: b, reason: collision with root package name */
    private String f41031b = "";

    /* renamed from: c, reason: collision with root package name */
    private int f41032c = 1;

    /* renamed from: e, reason: collision with root package name */
    private String f41034e = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface NetworkCallback {
        void onFailed(String str, String str2, String str3);

        void onSuccess(String str, String str2);
    }

    public NetworkUtil(Context context, b bVar) {
        this.f41033d = context.getApplicationContext();
        this.f41035f = bVar;
    }

    private static void a(HttpsURLConnection httpsURLConnection, String str, d dVar) {
        c.a().b("[SecPure] ==>%s", "Switch to HttpsURLConnection");
        if (dVar.f40928d || str.contains("https://config.cmpassport.com/client/uniConfig")) {
            return;
        }
        httpsURLConnection.setSSLSocketFactory(new a(dVar).a().getSocketFactory());
    }

    public void a(final String str, final String str2, final boolean z11, final NetworkCallback networkCallback, final String str3, final d dVar) {
        this.f41030a = dVar.D;
        c.a().b("[SecPure] ==>%s", "traceId: " + this.f41030a);
        Thread thread = new Thread() { // from class: com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                c.a().b("[SecPure] ==>%s", "forceWap: " + z11);
                if (!z11) {
                    NetworkUtil.this.a(str, str2, networkCallback, (Network) null, str3, dVar);
                } else if ("WIFI".equals(e.b(MobSDK.getContext()))) {
                    NetworkUtil.this.a(str, str2, networkCallback, str3, dVar);
                } else {
                    NetworkUtil.this.a(str, str2, networkCallback, (Network) null, str3, dVar);
                }
            }
        };
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.2
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread2, Throwable th2) {
                NetworkUtil.this.f41031b = com.mob.secverify.pure.core.ope.cm.d.d.a();
                c.a().a(th2);
                networkCallback.onFailed(String.valueOf(102003), h.a("network_exception", "network exception"), NetworkUtil.this.f41031b);
            }
        });
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:61:0x01ab, B:63:0x01b4, B:70:0x01d6, B:72:0x01da, B:73:0x01f8), top: B:60:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e A[Catch: all -> 0x018d, TRY_ENTER, TryCatch #7 {all -> 0x018d, blocks: (B:42:0x0189, B:43:0x018f, B:65:0x020e, B:67:0x0213), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0213 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #7 {all -> 0x018d, blocks: (B:42:0x0189, B:43:0x018f, B:65:0x020e, B:67:0x0213), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d6 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:61:0x01ab, B:63:0x01b4, B:70:0x01d6, B:72:0x01da, B:73:0x01f8), top: B:60:0x01ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r18, java.lang.String r19, com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback r20, android.net.Network r21, java.lang.String r22, com.mob.secverify.pure.core.ope.cm.a.d r23) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.a(java.lang.String, java.lang.String, com.mob.secverify.pure.core.ope.cm.net.NetworkUtil$NetworkCallback, android.net.Network, java.lang.String, com.mob.secverify.pure.core.ope.cm.a.d):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, NetworkCallback networkCallback, String str3, d dVar) {
        NetworkUtil networkUtil;
        NetworkCallback networkCallback2;
        Throwable th2;
        try {
            b bVar = this.f41035f;
            if (bVar != null) {
                try {
                    bVar.a("cm_switch_s");
                } catch (Throwable th3) {
                    th2 = th3;
                    networkUtil = this;
                    networkCallback2 = networkCallback;
                    Log.d("[SecPure] ==>%s", "mobile network switch failed:" + th2.getMessage());
                    networkCallback2.onFailed(String.valueOf(102004), h.a("switch_failed", "switch failed"), networkUtil.f41031b);
                }
            }
            Network a11 = com.mob.secverify.pure.b.e.a(this.f41033d).a(str);
            b bVar2 = this.f41035f;
            if (bVar2 != null) {
                bVar2.a("cm_switch_e");
            }
            this.f41031b = com.mob.secverify.pure.core.ope.cm.d.d.a();
            networkUtil = this;
            networkCallback2 = networkCallback;
            try {
                networkUtil.a(str, str2, networkCallback2, a11, str3, dVar);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                Log.d("[SecPure] ==>%s", "mobile network switch failed:" + th2.getMessage());
                networkCallback2.onFailed(String.valueOf(102004), h.a("switch_failed", "switch failed"), networkUtil.f41031b);
            }
        } catch (Throwable th5) {
            th = th5;
            networkUtil = this;
            networkCallback2 = networkCallback;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e0  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.mob.secverify.pure.core.ope.cm.net.NetworkUtil$NetworkCallback] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.mob.secverify.pure.core.ope.cm.net.NetworkUtil$NetworkCallback] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [com.mob.secverify.pure.core.ope.cm.net.NetworkUtil$NetworkCallback] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [com.mob.secverify.pure.core.ope.cm.net.NetworkUtil$NetworkCallback] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r18, int r19, com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.NetworkCallback r20, java.net.HttpURLConnection r21, android.net.Network r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.mob.secverify.pure.core.ope.cm.a.d r26) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.cm.net.NetworkUtil.a(java.lang.String, int, com.mob.secverify.pure.core.ope.cm.net.NetworkUtil$NetworkCallback, java.net.HttpURLConnection, android.net.Network, java.lang.String, java.lang.String, java.lang.String, com.mob.secverify.pure.core.ope.cm.a.d):void");
    }
}
