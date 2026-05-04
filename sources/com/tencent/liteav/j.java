package com.tencent.liteav;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: c, reason: collision with root package name */
    protected Context f43620c;

    /* renamed from: e, reason: collision with root package name */
    protected WeakReference<com.tencent.liteav.basic.b.b> f43622e;

    /* renamed from: b, reason: collision with root package name */
    protected d f43619b = null;

    /* renamed from: d, reason: collision with root package name */
    protected TXCloudVideoView f43621d = null;

    public j(Context context) {
        this.f43620c = null;
        if (context != null) {
            this.f43620c = context.getApplicationContext();
        }
    }

    public int a(String str) {
        return -1;
    }

    public abstract int a(String str, int i11);

    public abstract int a(boolean z11);

    public abstract void a(int i11);

    public abstract void a(com.tencent.liteav.basic.c.k kVar);

    public abstract void a(boolean z11, int i11);

    public void b() {
        TXCLog.w("TXIPlayer", "resume not support");
    }

    public abstract void b(int i11);

    public abstract void b(boolean z11);

    public abstract void c(int i11);

    public abstract void c(boolean z11);

    public abstract boolean c();

    public TextureView d() {
        return null;
    }

    public abstract void d(int i11);

    public abstract int e();

    public abstract int e(int i11);

    public void e(boolean z11) {
        TXCLog.w("TXIPlayer", "autoPlay not implement");
    }

    public boolean f() {
        return false;
    }

    public long g() {
        return 0L;
    }

    public abstract int j();

    public d w() {
        return this.f43619b;
    }

    public void a(int i11, int i12) {
    }

    public void b(float f11) {
        TXCLog.w("TXIPlayer", "rate not implement");
    }

    public boolean d(boolean z11) {
        return false;
    }

    public void f(int i11) {
        TXCLog.w("TXIPlayer", "seek not support");
    }

    public void a(Surface surface) {
    }

    public void a(k kVar, com.tencent.liteav.basic.enums.b bVar, Object obj) {
    }

    public void a(TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
    }

    public void a(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
    }

    public void a(d dVar) {
        this.f43619b = dVar;
        if (dVar == null) {
            this.f43619b = new d();
        }
    }

    public void a() {
        TXCLog.w("TXIPlayer", "pause not support");
    }

    public void a(TXCloudVideoView tXCloudVideoView) {
        this.f43621d = tXCloudVideoView;
    }

    public void a(com.tencent.liteav.basic.b.b bVar) {
        this.f43622e = new WeakReference<>(bVar);
    }

    public void h() {
    }
}
