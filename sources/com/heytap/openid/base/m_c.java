package com.heytap.openid.base;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.heytap.openid.sdk.m_h;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.open.SocialOperation;

/* loaded from: classes7.dex */
public class m_c {
    public Handler m_f;
    public HandlerThread m_g;
    public Context m_h;
    public volatile IInterface m_a = null;
    public String m_b = null;
    public String m_c = null;
    public final Object m_d = new Object();
    public ServiceConnection m_e = null;
    public boolean m_i = false;
    public boolean m_j = false;
    public boolean m_k = false;
    public volatile ContentProviderClient m_l = null;
    public IBinder.DeathRecipient m_m = new m_a();

    public class m_a implements IBinder.DeathRecipient {
        public m_a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public native void binderDied();
    }

    public Intent m_a() {
        throw null;
    }

    public boolean m_b(String str) {
        throw null;
    }

    public String m_c(String str) {
        throw null;
    }

    public String m_d(String str) {
        m_h.m_a("2049");
        Bundle bundle = new Bundle();
        bundle.putString(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, this.m_b);
        bundle.putString(SocialOperation.GAME_SIGNATURE, this.m_c);
        try {
            return this.m_l != null ? this.m_l.call(str, null, bundle).getString(str) : "";
        } catch (RemoteException unused) {
            Log.e("IDHelper", "3149");
            return "";
        } catch (Exception e11) {
            m_h.m_a("3150", e11);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m_e(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.m_d
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            r1.append(r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = " 2023"
            r1.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            com.heytap.openid.sdk.m_h.m_a(r1)     // Catch: java.lang.Throwable -> L2c
            android.os.Handler r1 = r7.m_f     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L1c
            goto L43
        L1c:
            android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "RESET_OUID"
            boolean r2 = r8.equals(r2)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            r2 = 3
            r1.what = r2     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r8 = move-exception
            goto L8f
        L2e:
            r2 = 1
            r1.what = r2     // Catch: java.lang.Throwable -> L2c
        L31:
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2c
            r2.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "IdType"
            r2.putString(r3, r8)     // Catch: java.lang.Throwable -> L2c
            r1.setData(r2)     // Catch: java.lang.Throwable -> L2c
            android.os.Handler r2 = r7.m_f     // Catch: java.lang.Throwable -> L2c
            r2.sendMessage(r1)     // Catch: java.lang.Throwable -> L2c
        L43:
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "DUID"
            boolean r3 = r8.equals(r3)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L52
            r3 = 5000(0x1388, float:7.006E-42)
            goto L54
        L52:
            r3 = 2000(0x7d0, float:2.803E-42)
        L54:
            java.lang.Object r4 = r7.m_d     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L5b java.lang.InterruptedException -> L5d
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L5b java.lang.InterruptedException -> L5d
            r4.wait(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L5b java.lang.InterruptedException -> L5d
            goto L68
        L5b:
            r4 = move-exception
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            java.lang.String r5 = "1058"
        L61:
            com.heytap.openid.sdk.m_h.m_a(r5, r4)     // Catch: java.lang.Throwable -> L2c
            goto L68
        L65:
            java.lang.String r5 = "1022"
            goto L61
        L68:
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L2c
            long r4 = r4 - r1
            long r1 = (long) r3
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L79
            java.lang.String r1 = "1023"
            java.lang.String r2 = "IDHelper"
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L2c
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            r1.append(r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r8 = " 2024"
            r1.append(r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            com.heytap.openid.sdk.m_h.m_a(r8)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.openid.base.m_c.m_e(java.lang.String):void");
    }

    public void m_a(Context context, String str, String str2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        if (r3.m_l != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
    
        r3.m_l.close();
        r3.m_l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d2, code lost:
    
        if (r3.m_l == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m_a(android.content.Context r4, java.util.List<java.lang.String> r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.openid.base.m_c.m_a(android.content.Context, java.util.List, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m_a(java.util.List<java.lang.String> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "2048"
            com.heytap.openid.sdk.m_h.m_a(r0)
            android.os.IInterface r0 = r4.m_a
            if (r0 != 0) goto L57
            java.lang.String r0 = "2009"
            com.heytap.openid.sdk.m_h.m_a(r0)
            android.content.Context r0 = r4.m_h
            android.content.Intent r1 = r4.m_a()     // Catch: java.lang.Exception -> L48
            android.content.ServiceConnection r2 = r4.m_e     // Catch: java.lang.Exception -> L48
            r3 = 1
            boolean r0 = r0.bindService(r1, r2, r3)     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L4a
            java.lang.String r0 = "2013"
            com.heytap.openid.sdk.m_h.m_a(r0)     // Catch: java.lang.Exception -> L48
            android.os.IInterface r0 = r4.m_a     // Catch: java.lang.Exception -> L48
            if (r0 != 0) goto L57
            java.lang.Object r0 = r4.m_d     // Catch: java.lang.Exception -> L48
            monitor-enter(r0)     // Catch: java.lang.Exception -> L48
            android.os.IInterface r1 = r4.m_a     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.lang.InterruptedException -> L39
            if (r1 != 0) goto L44
            java.lang.Object r1 = r4.m_d     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.lang.InterruptedException -> L39
            r2 = 10000(0x2710, double:4.9407E-320)
            r1.wait(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37 java.lang.InterruptedException -> L39
            goto L44
        L35:
            r1 = move-exception
            goto L46
        L37:
            r1 = move-exception
            goto L3b
        L39:
            r1 = move-exception
            goto L41
        L3b:
            java.lang.String r2 = "1057"
        L3d:
            com.heytap.openid.sdk.m_h.m_a(r2, r1)     // Catch: java.lang.Throwable -> L35
            goto L44
        L41:
            java.lang.String r2 = "1006"
            goto L3d
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            goto L57
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Exception -> L48
        L48:
            r0 = move-exception
            goto L52
        L4a:
            java.lang.String r0 = "1007"
            java.lang.String r1 = "IDHelper"
            android.util.Log.e(r1, r0)     // Catch: java.lang.Exception -> L48
            goto L57
        L52:
            java.lang.String r1 = "1008"
            com.heytap.openid.sdk.m_h.m_a(r1, r0)
        L57:
            android.os.IInterface r0 = r4.m_a
            if (r0 != 0) goto L63
            java.lang.String r5 = "IDHelper"
            java.lang.String r0 = "1004"
            android.util.Log.e(r5, r0)
            return
        L63:
            android.os.Handler r0 = r4.m_f
            r1 = 2
            if (r0 != 0) goto L69
            goto L6c
        L69:
            r0.removeMessages(r1)
        L6c:
            java.util.Iterator r5 = r5.iterator()
        L70:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            r4.m_e(r0)
            goto L70
        L80:
            android.os.Handler r5 = r4.m_f
            if (r5 != 0) goto L85
            goto L93
        L85:
            android.os.Message r5 = r5.obtainMessage()
            r5.what = r1
            android.os.Handler r0 = r4.m_f
            r1 = 300000(0x493e0, double:1.482197E-318)
            r0.sendMessageDelayed(r5, r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.openid.base.m_c.m_a(java.util.List):void");
    }

    public boolean m_a(String str) {
        throw null;
    }
}
