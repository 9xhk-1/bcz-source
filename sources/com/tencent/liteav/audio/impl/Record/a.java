package com.tencent.liteav.audio.impl.Record;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<c> f42943a;

    /* renamed from: b, reason: collision with root package name */
    private int f42944b;

    /* renamed from: c, reason: collision with root package name */
    private int f42945c;

    /* renamed from: d, reason: collision with root package name */
    private int f42946d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42947e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f42948f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f42949g;

    private void b() {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.f42943a;
                cVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.onAudioRecordStart();
        } else {
            TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordStart:no callback");
        }
    }

    private void c() {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.f42943a;
                cVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.onAudioRecordStop();
        } else {
            TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordStop:no callback");
        }
    }

    public void a() {
        this.f42947e = false;
        long currentTimeMillis = System.currentTimeMillis();
        Thread thread = this.f42948f;
        if (thread != null && thread.isAlive() && Thread.currentThread().getId() != this.f42948f.getId()) {
            try {
                this.f42948f.join();
            } catch (Exception e11) {
                TXCLog.e("AudioCenter:TXCAudioBGMRecord", "record stop Exception: " + e11.getMessage());
            }
        }
        TXCLog.i("AudioCenter:TXCAudioBGMRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - currentTimeMillis));
        this.f42948f = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f42947e) {
            TXCLog.w("AudioCenter:TXCAudioBGMRecord", "audio record: abandom start audio sys record thread!");
            return;
        }
        b();
        int i11 = this.f42944b;
        int i12 = this.f42945c;
        int i13 = this.f42946d;
        int i14 = ((i12 * 1024) * i13) / 8;
        byte[] bArr = new byte[i14];
        this.f42949g = bArr;
        Arrays.fill(bArr, (byte) 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = 0;
        while (this.f42947e && !Thread.interrupted()) {
            if (((((((System.currentTimeMillis() - currentTimeMillis) * i11) * i12) * i13) / 8) / 1000) - j11 < i14) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            } else {
                byte[] bArr2 = this.f42949g;
                j11 += bArr2.length;
                a(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
            }
        }
        c();
    }

    private void a(byte[] bArr, int i11, long j11) {
        c cVar;
        synchronized (this) {
            try {
                WeakReference<c> weakReference = this.f42943a;
                cVar = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cVar != null) {
            cVar.onAudioRecordPCM(bArr, i11, j11);
        } else {
            TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordPcmData:no callback");
        }
    }
}
