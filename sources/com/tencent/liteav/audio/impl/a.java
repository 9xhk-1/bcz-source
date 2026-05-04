package com.tencent.liteav.audio.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final a f42964a = new a();

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<Integer, WeakReference<b>> f42965b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private PhoneStateListener f42966c = null;

    /* renamed from: d, reason: collision with root package name */
    private Context f42967d;

    private a() {
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.f42966c == null || this.f42967d == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.2
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f42966c != null && a.this.f42967d != null) {
                    try {
                        ((TelephonyManager) a.this.f42967d.getApplicationContext().getSystemService("phone")).listen(a.this.f42966c, 0);
                    } catch (Exception e11) {
                        TXCLog.e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e11);
                    }
                }
                a.this.f42966c = null;
            }
        });
    }

    public static a a() {
        return f42964a;
    }

    public synchronized void a(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f42965b.put(Integer.valueOf(bVar.hashCode()), new WeakReference<>(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(int i11) {
        try {
            Iterator<Map.Entry<Integer, WeakReference<b>>> it = this.f42965b.entrySet().iterator();
            while (it.hasNext()) {
                b bVar = it.next().getValue().get();
                if (bVar != null) {
                    bVar.onCallStateChanged(i11);
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(Context context) {
        if (this.f42966c != null) {
            return;
        }
        this.f42967d = context.getApplicationContext();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f42966c != null) {
                    return;
                }
                a.this.f42966c = new PhoneStateListener() { // from class: com.tencent.liteav.audio.impl.a.1.1
                    @Override // android.telephony.PhoneStateListener
                    public void onCallStateChanged(int i11, String str) {
                        super.onCallStateChanged(i11, str);
                        TXCLog.i("AudioCenter:TXCTelephonyMgr", "onCallStateChanged:" + i11);
                        a.this.a(i11);
                    }
                };
                try {
                    ((TelephonyManager) a.this.f42967d.getSystemService("phone")).listen(a.this.f42966c, 32);
                } catch (Exception e11) {
                    TXCLog.e("AudioCenter:TXCTelephonyMgr", "TelephonyManager listen error ", e11);
                }
            }
        });
    }
}
