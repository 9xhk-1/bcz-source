package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.liteav.basic.log.TXCLog;
import hr.a;
import java.util.ArrayList;
import java.util.List;
import jr.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HwAudioKit {

    /* renamed from: h, reason: collision with root package name */
    public static final String f36775h = "HwAudioKit.HwAudioKit";

    /* renamed from: i, reason: collision with root package name */
    public static final String f36776i = "com.huawei.multimedia.audioengine.HwAudioEngineService";

    /* renamed from: j, reason: collision with root package name */
    public static final List<Integer> f36777j = new ArrayList(0);

    /* renamed from: a, reason: collision with root package name */
    public Context f36778a;

    /* renamed from: d, reason: collision with root package name */
    public jr.b f36781d;

    /* renamed from: b, reason: collision with root package name */
    public hr.a f36779b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36780c = false;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f36782e = null;

    /* renamed from: f, reason: collision with root package name */
    public ServiceConnection f36783f = new a();

    /* renamed from: g, reason: collision with root package name */
    public IBinder.DeathRecipient f36784g = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum FeatureType {
        HWAUDIO_FEATURE_KARAOKE(1);

        private int mFeatureType;

        FeatureType(int i11) {
            this.mFeatureType = i11;
        }

        public int getFeatureType() {
            return this.mFeatureType;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HwAudioKit.this.f36779b = a.AbstractBinderC0681a.x0(iBinder);
            TXCLog.i(HwAudioKit.f36775h, "onServiceConnected");
            if (HwAudioKit.this.f36779b != null) {
                HwAudioKit.this.f36780c = true;
                TXCLog.i(HwAudioKit.f36775h, "onServiceConnected, mIHwAudioEngine is not null");
                HwAudioKit.this.f36781d.f(0);
                HwAudioKit hwAudioKit = HwAudioKit.this;
                hwAudioKit.q(hwAudioKit.f36778a.getPackageName(), ir.b.f62707a);
                HwAudioKit.this.r(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TXCLog.i(HwAudioKit.f36775h, "onServiceDisconnected");
            HwAudioKit.this.f36779b = null;
            HwAudioKit.this.f36780c = false;
            HwAudioKit.this.f36781d.f(4);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements IBinder.DeathRecipient {
        public b() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            HwAudioKit.this.f36782e.unlinkToDeath(HwAudioKit.this.f36784g, 0);
            HwAudioKit.this.f36781d.f(6);
            TXCLog.e(HwAudioKit.f36775h, "service binder died");
            HwAudioKit.this.f36782e = null;
        }
    }

    public HwAudioKit(Context context, c cVar) {
        this.f36778a = null;
        jr.b d11 = jr.b.d();
        this.f36781d = d11;
        d11.g(cVar);
        this.f36778a = context;
    }

    public final void k(Context context) {
        TXCLog.i(f36775h, "bindService, mIsServiceConnected = %b", Boolean.valueOf(this.f36780c));
        jr.b bVar = this.f36781d;
        if (bVar == null || this.f36780c) {
            return;
        }
        bVar.a(context, this.f36783f, f36776i);
    }

    public <T extends jr.a> T l(FeatureType featureType) {
        jr.b bVar = this.f36781d;
        if (bVar == null || featureType == null) {
            return null;
        }
        return (T) bVar.b(featureType.getFeatureType(), this.f36778a);
    }

    public void m() {
        TXCLog.i(f36775h, "destroy, mIsServiceConnected = %b", Boolean.valueOf(this.f36780c));
        if (this.f36780c) {
            this.f36780c = false;
            this.f36781d.h(this.f36778a, this.f36783f);
        }
    }

    public List<Integer> n() {
        TXCLog.i(f36775h, "getSupportedFeatures");
        try {
            hr.a aVar = this.f36779b;
            if (aVar != null && this.f36780c) {
                return aVar.l0();
            }
        } catch (RemoteException unused) {
            TXCLog.e(f36775h, "getSupportedFeatures, createFeature,wait bind service fail");
        }
        TXCLog.i(f36775h, "getSupportedFeatures, service not bind");
        return f36777j;
    }

    public void o() {
        TXCLog.i(f36775h, "initialize");
        Context context = this.f36778a;
        if (context == null) {
            TXCLog.i(f36775h, "mContext is null");
            this.f36781d.f(7);
        } else if (this.f36781d.e(context)) {
            k(this.f36778a);
        } else {
            TXCLog.i(f36775h, "not install AudioKitEngine");
            this.f36781d.f(2);
        }
    }

    public boolean p(FeatureType featureType) {
        if (featureType == null) {
            return false;
        }
        TXCLog.i(f36775h, "isFeatureSupported, type = %d", Integer.valueOf(featureType.getFeatureType()));
        try {
            hr.a aVar = this.f36779b;
            if (aVar != null && this.f36780c) {
                return aVar.w0(featureType.getFeatureType());
            }
        } catch (RemoteException e11) {
            TXCLog.e(f36775h, "isFeatureSupported,RemoteException ex : %s", e11.getMessage());
        }
        return false;
    }

    public final void q(String str, String str2) {
        TXCLog.i(f36775h, "serviceInit");
        try {
            hr.a aVar = this.f36779b;
            if (aVar == null || !this.f36780c) {
                return;
            }
            aVar.U(str, str2);
        } catch (RemoteException e11) {
            TXCLog.e(f36775h, "isFeatureSupported,RemoteException ex : %s", e11.getMessage());
        }
    }

    public final void r(IBinder iBinder) {
        this.f36782e = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f36784g, 0);
            } catch (RemoteException unused) {
                this.f36781d.f(5);
                TXCLog.e(f36775h, "serviceLinkToDeath, RemoteException");
            }
        }
    }
}
