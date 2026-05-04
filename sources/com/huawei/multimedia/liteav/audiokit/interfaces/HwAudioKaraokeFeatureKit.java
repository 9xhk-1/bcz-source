package com.huawei.multimedia.liteav.audiokit.interfaces;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.liteav.basic.log.TXCLog;
import hr.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HwAudioKaraokeFeatureKit extends jr.a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f36764h = "HwAudioKit.HwAudioKaraokeFeatureKit";

    /* renamed from: i, reason: collision with root package name */
    public static final String f36765i = "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService";

    /* renamed from: a, reason: collision with root package name */
    public Context f36766a;

    /* renamed from: b, reason: collision with root package name */
    public jr.b f36767b;

    /* renamed from: d, reason: collision with root package name */
    public hr.b f36769d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36768c = false;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f36770e = null;

    /* renamed from: f, reason: collision with root package name */
    public ServiceConnection f36771f = new a();

    /* renamed from: g, reason: collision with root package name */
    public IBinder.DeathRecipient f36772g = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");

        private String mParameName;

        ParameName(String str) {
            this.mParameName = str;
        }

        public String getParameName() {
            return this.mParameName;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            TXCLog.i(HwAudioKaraokeFeatureKit.f36764h, "onServiceConnected");
            HwAudioKaraokeFeatureKit.this.f36769d = b.a.x0(iBinder);
            if (HwAudioKaraokeFeatureKit.this.f36769d != null) {
                HwAudioKaraokeFeatureKit.this.f36768c = true;
                HwAudioKaraokeFeatureKit.this.f36767b.f(1000);
                HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = HwAudioKaraokeFeatureKit.this;
                hwAudioKaraokeFeatureKit.q(hwAudioKaraokeFeatureKit.f36766a.getPackageName());
                HwAudioKaraokeFeatureKit.this.r(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            TXCLog.i(HwAudioKaraokeFeatureKit.f36764h, "onServiceDisconnected");
            HwAudioKaraokeFeatureKit.this.f36768c = false;
            if (HwAudioKaraokeFeatureKit.this.f36767b != null) {
                HwAudioKaraokeFeatureKit.this.f36767b.f(1001);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements IBinder.DeathRecipient {
        public b() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            TXCLog.e(HwAudioKaraokeFeatureKit.f36764h, "binderDied");
            HwAudioKaraokeFeatureKit.this.f36770e.unlinkToDeath(HwAudioKaraokeFeatureKit.this.f36772g, 0);
            HwAudioKaraokeFeatureKit.this.f36767b.f(1003);
            HwAudioKaraokeFeatureKit.this.f36770e = null;
        }
    }

    public HwAudioKaraokeFeatureKit(Context context) {
        this.f36767b = null;
        this.f36767b = jr.b.d();
        this.f36766a = context;
    }

    public final void k(Context context) {
        TXCLog.i(f36764h, "bindService");
        jr.b bVar = this.f36767b;
        if (bVar == null || this.f36768c) {
            return;
        }
        bVar.a(context, this.f36771f, f36765i);
    }

    public void l() {
        TXCLog.i(f36764h, "destroy, mIsServiceConnected = %b", Boolean.valueOf(this.f36768c));
        if (this.f36768c) {
            this.f36768c = false;
            this.f36767b.h(this.f36766a, this.f36771f);
        }
    }

    public int m(boolean z11) {
        TXCLog.i(f36764h, "enableKaraokeFeature, enable = %b", Boolean.valueOf(z11));
        try {
            hr.b bVar = this.f36769d;
            if (bVar == null || !this.f36768c) {
                return -2;
            }
            return bVar.Y(z11);
        } catch (RemoteException e11) {
            TXCLog.e(f36764h, "enableKaraokeFeature,RemoteException ex : %s", e11.getMessage());
            return -2;
        }
    }

    public int n() {
        TXCLog.i(f36764h, "getKaraokeLatency");
        try {
            hr.b bVar = this.f36769d;
            if (bVar == null || !this.f36768c) {
                return -1;
            }
            return bVar.m0();
        } catch (RemoteException e11) {
            TXCLog.e(f36764h, "getKaraokeLatency,RemoteException ex : %s", e11.getMessage());
            return -1;
        }
    }

    public void o(Context context) {
        TXCLog.i(f36764h, "initialize");
        if (context == null) {
            TXCLog.i(f36764h, "initialize, context is null");
        } else if (this.f36767b.e(context)) {
            k(context);
        } else {
            this.f36767b.f(2);
            TXCLog.i(f36764h, "initialize, not install AudioEngine");
        }
    }

    public boolean p() {
        TXCLog.i(f36764h, "isKaraokeFeatureSupport");
        try {
            hr.b bVar = this.f36769d;
            if (bVar == null || !this.f36768c) {
                return false;
            }
            return bVar.n0();
        } catch (RemoteException e11) {
            TXCLog.e(f36764h, "isFeatureSupported,RemoteException ex : %s", e11.getMessage());
            return false;
        }
    }

    public final void q(String str) {
        try {
            hr.b bVar = this.f36769d;
            if (bVar == null || !this.f36768c) {
                return;
            }
            bVar.J(str);
        } catch (RemoteException e11) {
            TXCLog.e(f36764h, "isFeatureSupported,RemoteException ex : %s", e11.getMessage());
        }
    }

    public final void r(IBinder iBinder) {
        this.f36770e = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.f36772g, 0);
            } catch (RemoteException unused) {
                this.f36767b.f(1002);
                TXCLog.e(f36764h, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public int s(ParameName parameName, int i11) {
        if (parameName == null) {
            return ir.a.f62706o;
        }
        try {
            TXCLog.i(f36764h, "parame.getParameName() = %s, parameValue = %d", parameName.getParameName(), Integer.valueOf(i11));
            hr.b bVar = this.f36769d;
            if (bVar == null || !this.f36768c) {
                return -2;
            }
            return bVar.a0(parameName.getParameName(), i11);
        } catch (RemoteException e11) {
            TXCLog.e(f36764h, "setParameter,RemoteException ex : %s", e11.getMessage());
            return -2;
        }
    }
}
