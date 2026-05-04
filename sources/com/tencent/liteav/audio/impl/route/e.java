package com.tencent.liteav.audio.impl.route;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import com.tencent.liteav.audio.impl.route.a;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    private Context f43000b;

    /* renamed from: n, reason: collision with root package name */
    private i f43012n;

    /* renamed from: a, reason: collision with root package name */
    private AudioManager f42999a = null;

    /* renamed from: c, reason: collision with root package name */
    private int f43001c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f43002d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f43003e = -1;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.liteav.audio.impl.route.d f43004f = com.tencent.liteav.audio.impl.route.d.HEADSET_AVAILABLE;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f43005g = {false};

    /* renamed from: h, reason: collision with root package name */
    private a.EnumC0508a f43006h = a.EnumC0508a.STOPPED;

    /* renamed from: i, reason: collision with root package name */
    private boolean f43007i = false;

    /* renamed from: j, reason: collision with root package name */
    private final com.tencent.liteav.audio.impl.route.g f43008j = new com.tencent.liteav.audio.impl.route.g();

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.liteav.audio.impl.route.h f43009k = new com.tencent.liteav.audio.impl.route.h();

    /* renamed from: l, reason: collision with root package name */
    private com.tencent.liteav.audio.impl.route.b f43010l = null;

    /* renamed from: m, reason: collision with root package name */
    private String f43011m = "DEVICE_NONE";

    /* renamed from: o, reason: collision with root package name */
    private h f43013o = null;

    /* renamed from: p, reason: collision with root package name */
    private final Object f43014p = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.audio.impl.route.e$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43024a;

        static {
            int[] iArr = new int[a.values().length];
            f43024a = iArr;
            try {
                iArr[a.MESSAGE_DISABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43024a[a.MESSAGE_GETDEVICELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43024a[a.MESSAGE_ISDEVICECHANGABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43024a[a.MESSAGE_GETCONNECTEDDEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43024a[a.MESSAGE_GETCONNECTINGDEVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43024a[a.MESSAGE_VOICECALLPREPROCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43024a[a.MESSAGE_VOICECALLPOSTPROCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43024a[a.MESSAGE_CONNECTDEVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43024a[a.MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43024a[a.MESSAGE_AUTO_DEVICELIST_UPDATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43024a[a.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43024a[a.MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43024a[a.MESSAGE_NOTIFY_DEVICELIST_UPDATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        MESSAGE_ENABLE,
        MESSAGE_DISABLE,
        MESSAGE_GETDEVICELIST,
        MESSAGE_CONNECTDEVICE,
        MESSAGE_ISDEVICECHANGABLED,
        MESSAGE_GETCONNECTEDDEVICE,
        MESSAGE_GETCONNECTINGDEVICE,
        MESSAGE_VOICECALLPREPROCESS,
        MESSAGE_VOICECALLPOSTPROCESS,
        MESSAGE_AUTO_DEVICELIST_UPDATE,
        MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE,
        MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE,
        MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE,
        MESSAGE_NOTIFY_DEVICELIST_UPDATE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends h {
        public c() {
            super();
        }

        private void f() {
            e.this.f42999a.setBluetoothScoOn(true);
            e.this.f42999a.startBluetoothSco();
        }

        private void g() {
            try {
                e.this.f42999a.stopBluetoothSco();
                e.this.f42999a.setBluetoothScoOn(false);
            } catch (Exception unused) {
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public void a() {
            if (e.this.c() || e.this.f43006h == a.EnumC0508a.STOPPED) {
                TXCLog.i("TXCAudioRouteManager", "connect bluetoothHeadset: do nothing, IsMusicScene: %b, scene: %s", Boolean.valueOf(e.this.c()), e.this.f43006h);
                d();
                return;
            }
            try {
                if (e.this.f43004f == com.tencent.liteav.audio.impl.route.d.SCO_DISCONNECTED) {
                    TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread SCO_DISCONNECTED sleep 5000");
                    Thread.sleep(5000L);
                } else {
                    TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread sleep 1000");
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException unused) {
            }
            e.this.f43004f = com.tencent.liteav.audio.impl.route.d.HEADSET_AVAILABLE;
            if (this.f43051b) {
                e.this.f43004f = com.tencent.liteav.audio.impl.route.d.SCO_CONNECTING;
                synchronized (e.this.f43005g) {
                    e.this.f43005g[0] = false;
                }
                f();
                TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread _startBluetoothSco");
            }
            int i11 = 1;
            while (true) {
                if (!this.f43051b) {
                    break;
                }
                TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread i:" + i11 + " is bluetooth sco on:" + e.this.f42999a.isBluetoothScoOn() + " bluetooth name:" + e.this.f43009k.d());
                if (e.this.f43004f == com.tencent.liteav.audio.impl.route.d.SCO_CONNECTED) {
                    TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread bluetoothState ==  BluetoothState.SCO_CONNECTED 1");
                    d();
                    break;
                }
                synchronized (e.this.f43005g) {
                    if (!e.this.f43005g[0]) {
                        try {
                            e.this.f43005g.wait(4000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
                if (e.this.f43004f == com.tencent.liteav.audio.impl.route.d.SCO_CONNECTED) {
                    TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread bluetoothState == BluetoothState.SCO_CONNECTED 2");
                    d();
                    break;
                }
                int i12 = i11 + 1;
                if (i11 > 3) {
                    break;
                }
                g();
                try {
                    Thread.sleep(4000L);
                } catch (InterruptedException unused3) {
                }
                e.this.f43004f = com.tencent.liteav.audio.impl.route.d.SCO_CONNECTING;
                synchronized (e.this.f43005g) {
                    e.this.f43005g[0] = false;
                }
                f();
                TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread retry start sco");
                i11 = i12;
            }
            if (e.this.f43004f != com.tencent.liteav.audio.impl.route.d.SCO_CONNECTED) {
                TXCLog.e("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread sco fail,remove btheadset");
                e.this.f43009k.a(b(), false);
                e.this.f43009k.j();
                a(10);
                e.this.a(false);
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public String b() {
            return "DEVICE_BLUETOOTHHEADSET";
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public void c() {
            if (e.this.f42999a == null) {
                return;
            }
            TXCLog.i("TXCAudioRouteManager", "bluetoothHeadsetSwitchThread _quit _stopBluetoothSco");
            g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends h {
        public d() {
            super();
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public void a() {
            d();
            int i11 = 0;
            while (this.f43051b) {
                if (e.this.c() || e.this.f43006h == a.EnumC0508a.STOPPED) {
                    TXCLog.d("TXCAudioRouteManager", "connect earphone: do nothing");
                } else if (e.this.f42999a.isSpeakerphoneOn()) {
                    e eVar = e.this;
                    eVar.a(eVar.f43000b, false);
                }
                try {
                    Thread.sleep(i11 < 5 ? 1000L : 4000L);
                } catch (Exception unused) {
                }
                i11++;
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public String b() {
            return "DEVICE_EARPHONE";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.audio.impl.route.e$e, reason: collision with other inner class name */
    public class C0509e extends h {
        public C0509e() {
            super();
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public void a() {
            d();
            int i11 = 0;
            while (this.f43051b) {
                if (e.this.c() || e.this.f43006h == a.EnumC0508a.STOPPED) {
                    TXCLog.d("TXCAudioRouteManager", "connect headset: do nothing");
                } else if (e.this.f42999a.isSpeakerphoneOn()) {
                    e.this.f42999a.setWiredHeadsetOn(true);
                    e eVar = e.this;
                    eVar.a(eVar.f43000b, false);
                }
                try {
                    Thread.sleep(i11 < 5 ? 1000L : 4000L);
                } catch (InterruptedException unused) {
                }
                i11++;
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public String b() {
            return "DEVICE_WIREDHEADSET";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<i> f43049a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            i iVar = this.f43049a.get();
            if (iVar != null) {
                iVar.a(message);
            }
        }

        private f(i iVar) {
            this.f43049a = new WeakReference<>(iVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends h {
        public g() {
            super();
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public void a() {
            d();
            TXCLog.i("TXCAudioRouteManager", "run:" + b() + " _running:" + this.f43051b);
            int i11 = 0;
            while (this.f43051b) {
                if (e.this.c() || e.this.f43006h == a.EnumC0508a.STOPPED) {
                    TXCLog.d("TXCAudioRouteManager", "connect speakerPhone: do nothing, mCurrentIOScene: %s", e.this.f43006h);
                } else if (!e.this.f42999a.isSpeakerphoneOn()) {
                    e eVar = e.this;
                    eVar.a(eVar.f43000b, true);
                }
                try {
                    Thread.sleep(i11 < 5 ? 1000L : 4000L);
                } catch (InterruptedException unused) {
                }
                i11++;
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.e.h
        public String b() {
            return "DEVICE_SPEAKERPHONE";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class h extends Thread {

        /* renamed from: b, reason: collision with root package name */
        protected boolean f43051b = true;

        /* renamed from: c, reason: collision with root package name */
        protected final boolean[] f43052c = {false};

        /* renamed from: d, reason: collision with root package name */
        protected HashMap<String, Object> f43053d = null;

        public h() {
            TXCLog.i("TXCAudioRouteManager", "construct SwitchThread: " + b());
        }

        public abstract void a();

        public void a(HashMap<String, Object> hashMap) {
            this.f43053d = hashMap;
        }

        public abstract String b();

        public void d() {
            e.this.f43009k.e(b());
            a(0);
        }

        public void e() {
            TXCAudioNativeInterface.LogTraceEntry(b());
            this.f43051b = false;
            TXCLog.i("TXCAudioRouteManager", "quit:" + b() + " isRunning:" + this.f43051b);
            interrupt();
            c();
            synchronized (this.f43052c) {
                boolean[] zArr = this.f43052c;
                if (!zArr[0]) {
                    try {
                        zArr.wait(10000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            TXCAudioNativeInterface.LogTraceEntry(b());
            e.this.f43009k.d(b());
            e.this.f();
            a();
            synchronized (this.f43052c) {
                boolean[] zArr = this.f43052c;
                zArr[0] = true;
                zArr.notifyAll();
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        public void a(int i11) {
            TXCAudioNativeInterface.LogTraceEntry(b() + " err:" + i11);
            e.this.f();
            if (this.f43053d == null) {
                e.this.b();
                return;
            }
            e eVar = e.this;
            eVar.f43011m = eVar.f43009k.h();
            Long l11 = (Long) this.f43053d.get("PARAM_SESSIONID");
            TXCLog.i("TXCAudioRouteManager", "sessonID:" + l11);
            if (l11 == null || l11.longValue() == Long.MIN_VALUE) {
                e.this.b();
                TXCLog.w("TXCAudioRouteManager", "processDeviceConnectRes sid null,don't send res");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String) this.f43053d.get("PARAM_DEVICE"));
            if (e.this.a(intent, this.f43053d, i11) == 0) {
                e.this.b();
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        public void c() {
        }
    }

    public e(Context context) {
        this.f43000b = null;
        this.f43012n = null;
        TXCAudioNativeInterface.LogTraceEntry(" context:" + context);
        if (context == null) {
            return;
        }
        this.f43000b = context;
        this.f43012n = new i(this);
        TXCAudioNativeInterface.LogTraceExit();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            TXCLog.d("TXCAudioRouteManager", "onReceive intent or context is null!");
            return;
        }
        try {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("PARAM_OPERATION");
            TXCLog.i("TXCAudioRouteManager", "receive Action: " + intent.getAction());
            com.tencent.liteav.audio.impl.route.h hVar = this.f43009k;
            if (hVar == null) {
                TXCLog.d("TXCAudioRouteManager", "mDeviceConfigManager is null!");
                return;
            }
            boolean c11 = hVar.c("DEVICE_WIREDHEADSET");
            boolean c12 = this.f43009k.c("DEVICE_BLUETOOTHHEADSET");
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                a(intent);
                if (!c11 && this.f43009k.c("DEVICE_WIREDHEADSET")) {
                    a("DEVICE_WIREDHEADSET", true);
                }
                if (!c11 || this.f43009k.c("DEVICE_WIREDHEADSET")) {
                    return;
                }
                a("DEVICE_WIREDHEADSET", false);
                return;
            }
            if (!"com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST".equals(action)) {
                com.tencent.liteav.audio.impl.route.h hVar2 = this.f43009k;
                if (hVar2 != null) {
                    com.tencent.liteav.audio.impl.route.b bVar = this.f43010l;
                    if (bVar != null) {
                        bVar.a(context, intent, hVar2);
                    }
                    if (!c12 && this.f43009k.c("DEVICE_BLUETOOTHHEADSET")) {
                        a("DEVICE_BLUETOOTHHEADSET", true);
                    }
                    if (!c12 || this.f43009k.c("DEVICE_BLUETOOTHHEADSET")) {
                        return;
                    }
                    a("DEVICE_BLUETOOTHHEADSET", false);
                    return;
                }
                return;
            }
            TXCLog.i("TXCAudioRouteManager", "operation: " + stringExtra);
            if ("OPERATION_STARTSERVICE".equals(stringExtra)) {
                a(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), intent.getStringExtra("EXTRA_DATA_DEVICECONFIG"));
                return;
            }
            if ("OPERATION_STOPSERVICE".equals(stringExtra)) {
                a(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
                return;
            }
            if ("OPERATION_GETDEVICELIST".equals(stringExtra)) {
                e(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
                return;
            }
            if ("OPERATION_CONNECTDEVICE".equals(stringExtra)) {
                b(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), intent.getStringExtra("CONNECTDEVICE_DEVICENAME"));
                return;
            }
            if ("OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE".equals(stringExtra)) {
                b(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
                return;
            }
            if ("OPERATION_ISDEVICECHANGABLED".equals(stringExtra)) {
                f(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
                return;
            }
            if ("OPERATION_GETCONNECTEDDEVICE".equals(stringExtra)) {
                c(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
                return;
            }
            if ("OPERATION_GETCONNECTINGDEVICE".equals(stringExtra)) {
                g(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
                return;
            }
            if ("OPERATION_VOICECALL_PREPROCESS".equals(stringExtra)) {
                a(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE), intent.getIntExtra("PARAM_MODEPOLICY", -1));
            } else if ("OPERATION_VOICECALL_POSTROCESS".equals(stringExtra)) {
                d(stringExtra, intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE));
            }
        } catch (Exception e11) {
            TXCLog.e("TXCAudioRouteManager", "deal with receiver failed." + e11.getMessage());
        }
    }

    private void e() {
        if (this.f43009k.c("DEVICE_WIREDHEADSET") || this.f43009k.c("DEVICE_BLUETOOTHHEADSET")) {
            TXCLog.i("TXCAudioRouteManager", "detected headset plugin,so disable earphone");
            this.f43009k.a("DEVICE_EARPHONE", false);
        } else {
            TXCLog.i("TXCAudioRouteManager", "detected headset plugout,so enable earphone");
            this.f43009k.a("DEVICE_EARPHONE", true);
        }
    }

    private void f(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        a(a.MESSAGE_ISDEVICECHANGABLED, hashMap);
    }

    private void g(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        a(a.MESSAGE_GETCONNECTINGDEVICE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return this.f43006h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        boolean z11;
        String[] strArr = {"DEVICE_BLUETOOTHHEADSET", "DEVICE_WIREDHEADSET", "DEVICE_SPEAKERPHONE"};
        for (int i11 = 0; i11 < 3; i11++) {
            String str = strArr[i11];
            if (str.equals("DEVICE_BLUETOOTHHEADSET")) {
                com.tencent.liteav.audio.impl.route.b bVar = this.f43010l;
                if (bVar == null) {
                    z11 = this.f43009k.a(str, false);
                } else {
                    z11 = this.f43009k.a(str, bVar.c());
                }
            } else if (str.equals("DEVICE_WIREDHEADSET")) {
                z11 = this.f43009k.a(str, this.f42999a.isWiredHeadsetOn());
            } else {
                if (str.equals("DEVICE_SPEAKERPHONE")) {
                    this.f43009k.a(str, true);
                }
                z11 = false;
            }
            if (z11) {
                TXCLog.i("TXCAudioRouteManager", "update visibility success, dev: %s, visible: %b", str, Boolean.valueOf(this.f43009k.c(str)));
            }
        }
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(int i11) {
        if (c()) {
            return 0;
        }
        if (i11 >= 0) {
            TXCLog.i("TXCAudioRouteManager", "[Config] getCallAudioMode modePolicy:" + i11 + " mode:" + i11);
            return i11;
        }
        TXCLog.w("TXCAudioRouteManager", "[Config] getCallAudioMode _modePolicy:" + i11 + " mode:3facturer:" + Build.MANUFACTURER + " model:" + Build.MODEL);
        return 3;
    }

    public void c(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        a(a.MESSAGE_GETCONNECTEDDEVICE, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f43000b == null) {
            return;
        }
        final boolean a11 = a();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.route.e.3
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
                intent.putExtra("PARAM_OPERATION", "NOTIFY_DEVICECHANGABLE_UPDATE");
                intent.putExtra("NOTIFY_DEVICECHANGABLE_UPDATE_DATE", a11);
                if (e.this.f43000b != null) {
                    com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(intent);
                }
            }
        });
    }

    private void e(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        a(a.MESSAGE_GETDEVICELIST, hashMap);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends Thread {

        /* renamed from: c, reason: collision with root package name */
        private final boolean[] f43057c;

        /* renamed from: e, reason: collision with root package name */
        private final e f43059e;

        /* renamed from: b, reason: collision with root package name */
        private Handler f43056b = null;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43058d = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f43060f = true;

        /* renamed from: g, reason: collision with root package name */
        private String f43061g = "";

        /* renamed from: h, reason: collision with root package name */
        private long f43062h = -1;

        /* renamed from: i, reason: collision with root package name */
        private String f43063i = "";

        public i(e eVar) {
            boolean[] zArr = {false};
            this.f43057c = zArr;
            this.f43059e = eVar;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            TXCLog.i("TXCAudioRouteManager", "TraeAudioManagerLooper start...");
            start();
            synchronized (zArr) {
                if (!zArr[0]) {
                    try {
                        zArr.wait(3000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            TXCLog.i("TXCAudioRouteManager", "start used:" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        }

        private void b() {
            TXCAudioNativeInterface.LogTraceEntry("");
            try {
                e eVar = e.this;
                eVar.f42999a = (AudioManager) eVar.f43000b.getSystemService("audio");
                e eVar2 = e.this;
                eVar2.f43010l = eVar2.a(eVar2.f43000b, e.this.f43009k);
                IntentFilter intentFilter = new IntentFilter();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                e.this.f43010l.a(intentFilter, intentFilter2);
                e.this.f43000b.registerReceiver(this.f43059e, intentFilter);
                intentFilter2.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
                com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(this.f43059e, intentFilter2);
                TXCLog.i("TXCAudioRouteManager", "register receiver in _init");
            } catch (Exception e11) {
                TXCLog.e("TXCAudioRouteManager", "init failed, " + e11.getMessage());
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        private void c() {
            TXCAudioNativeInterface.LogTraceEntry("");
            try {
                e eVar = e.this;
                eVar.f42999a = (AudioManager) eVar.f43000b.getSystemService("audio");
                if (e.this.f43010l == null) {
                    e eVar2 = e.this;
                    eVar2.f43010l = eVar2.a(eVar2.f43000b, e.this.f43009k);
                }
                try {
                    e.this.f43000b.unregisterReceiver(this.f43059e);
                } catch (Exception unused) {
                }
                TXCLog.i("TXCAudioRouteManager", "unregister receiver in _prev_startService");
                com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(this.f43059e);
                IntentFilter intentFilter = new IntentFilter();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                e.this.f43010l.a(intentFilter, intentFilter2);
                intentFilter2.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
                e.this.f43000b.registerReceiver(this.f43059e, intentFilter);
                TXCLog.i("TXCAudioRouteManager", "register receiver in _prev_startService");
                com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(this.f43059e, intentFilter2);
            } catch (Exception e11) {
                TXCLog.w("TXCAudioRouteManager", "prev start service failed." + e11.getMessage());
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        private void d() {
            TXCAudioNativeInterface.LogTraceEntry("");
            try {
                if (e.this.f43010l != null) {
                    e.this.f43010l.b();
                }
                e.this.f43010l = null;
                if (e.this.f43000b != null) {
                    try {
                        e.this.f43000b.unregisterReceiver(this.f43059e);
                    } catch (Exception unused) {
                    }
                    TXCLog.i("TXCAudioRouteManager", "unregister receiver in _post_stopService");
                    com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(this.f43059e);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST");
                    com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(this.f43059e, intentFilter);
                }
            } catch (Exception e11) {
                TXCLog.e("TXCAudioRouteManager", "stop service failed." + e11.getMessage());
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        private void e() {
            TXCAudioNativeInterface.LogTraceEntry("");
            try {
                a();
                if (e.this.f43010l != null) {
                    e.this.f43010l.b();
                    e.this.f43010l = null;
                }
                if (e.this.f43000b != null) {
                    try {
                        e.this.f43000b.unregisterReceiver(this.f43059e);
                    } catch (Exception unused) {
                    }
                    TXCLog.i("TXCAudioRouteManager", "unregister receiver in _uninit");
                    com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(this.f43059e);
                    e.this.f43000b = null;
                }
                if (e.this.f43009k != null) {
                    e.this.f43009k.a();
                }
            } catch (Exception e11) {
                TXCLog.e("TXCAudioRouteManager", "uninit failed." + e11.getMessage());
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        private void f() {
            TXCAudioNativeInterface.LogTraceEntry(" activeMode:" + e.this.f43001c);
            if (e.this.f42999a == null) {
                TXCLog.e("TXCAudioRouteManager", "AudioManager is null!");
                return;
            }
            if (e.this.f43001c != 1) {
                TXCLog.e("TXCAudioRouteManager", "active mode is not AUDIO_MANAGER_ACTIVE_VOICECALL!");
                return;
            }
            e.this.f43001c = 0;
            if (e.this.f43002d != -1) {
                e eVar = e.this;
                eVar.a(eVar.f43002d);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("PARAM_SESSIONID", Long.valueOf(this.f43062h));
            hashMap.put("PARAM_OPERATION", this.f43063i);
            e.this.a(new Intent(), (HashMap<String, Object>) hashMap, 6);
            TXCAudioNativeInterface.LogTraceExit();
        }

        public int a(a aVar, HashMap<String, Object> hashMap) {
            Handler handler = this.f43056b;
            if (handler != null) {
                Message obtain = Message.obtain(handler, aVar.ordinal(), hashMap);
                if (aVar != a.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE || e.this.a()) {
                    return this.f43056b.sendMessage(obtain) ? 0 : -1;
                }
                TXCLog.w("TXCAudioRouteManager", "sendMessageDelayed, device is connecting, plugin need delay 1 second");
                return this.f43056b.sendMessageDelayed(obtain, 1000L) ? 0 : -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" fail mMsgHandler==null _enabled:");
            sb2.append(this.f43058d ? "Y" : "N");
            sb2.append(" activeMode:");
            sb2.append(e.this.f43001c);
            sb2.append(" msg:");
            sb2.append(aVar);
            TXCAudioNativeInterface.LogTraceEntry(sb2.toString());
            return -1;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            TXCAudioNativeInterface.LogTraceEntry("");
            Looper.prepare();
            this.f43056b = new f(this);
            b();
            synchronized (this.f43057c) {
                boolean[] zArr = this.f43057c;
                zArr[0] = true;
                zArr.notifyAll();
            }
            Looper.loop();
            e();
            synchronized (this.f43057c) {
                boolean[] zArr2 = this.f43057c;
                zArr2[0] = false;
                zArr2.notifyAll();
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        public void a(HashMap<String, Object> hashMap) {
            TXCAudioNativeInterface.LogTraceEntry("");
            if (e.this.f43000b == null) {
                return;
            }
            String str = (String) hashMap.get("EXTRA_DATA_DEVICECONFIG");
            TXCLog.i("TXCAudioRouteManager", "startService cfg:%s, enabled: %s, activeMode: %d", str, Boolean.valueOf(this.f43058d), Integer.valueOf(e.this.f43001c));
            if ((this.f43058d && this.f43061g.equals(str)) || e.this.f43001c != 0) {
                e.this.a(true);
                TXCLog.i("TXCAudioRouteManager", "service is started.");
                return;
            }
            if (this.f43058d) {
                a();
            }
            c();
            e.this.f43009k.a();
            e.this.f43009k.a(str);
            this.f43061g = str;
            this.f43058d = true;
            e.this.f43007i = false;
            e.this.d();
            a(this.f43058d);
            TXCAudioNativeInterface.LogTraceExit();
        }

        private void d(HashMap<String, Object> hashMap) {
            TXCAudioNativeInterface.LogTraceEntry(" activeMode:" + e.this.f43001c);
            if (e.this.f42999a != null) {
                if (e.this.f43001c == 1) {
                    e.this.f43001c = 0;
                    TXCAudioNativeInterface.LogTraceExit();
                    return;
                } else {
                    TXCLog.e("TXCAudioRouteManager", "active mode is not ACTIVE_VOICECALL!");
                    e.this.a(new Intent(), hashMap, 3);
                    return;
                }
            }
            TXCLog.e("TXCAudioRouteManager", "InternalVoicecallPostprocess AudioManager is null!");
        }

        private void b(HashMap<String, Object> hashMap) {
            Intent intent = new Intent();
            synchronized (e.this.f43009k) {
                ArrayList<String> k11 = e.this.f43009k.k();
                String h11 = e.this.f43009k.h();
                String i11 = e.this.f43009k.i();
                intent.putExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST", (String[]) k11.toArray(new String[0]));
                intent.putExtra("EXTRA_DATA_CONNECTEDDEVICE", h11);
                intent.putExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE", i11);
                intent.putExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME", e.this.f43009k.d());
            }
            e.this.a(intent, hashMap, 0);
        }

        private void c(HashMap<String, Object> hashMap) {
            TXCAudioNativeInterface.LogTraceEntry(" activeMode:" + e.this.f43001c);
            if (hashMap == null || e.this.f43009k == null) {
                return;
            }
            if (e.this.f42999a != null) {
                if (e.this.f43001c == 1) {
                    e.this.a(new Intent(), hashMap, 2);
                    return;
                }
                this.f43062h = ((Long) hashMap.get("PARAM_SESSIONID")).longValue();
                this.f43063i = (String) hashMap.get("PARAM_OPERATION");
                e.this.f43001c = 1;
                e eVar = e.this;
                eVar.f43002d = eVar.f42999a.getMode();
                Integer num = (Integer) hashMap.get("PARAM_MODEPOLICY");
                if (num == null) {
                    TXCLog.e("TXCAudioRouteManager", "params.get(PARAM_MODEPOLICY)==null!!");
                    e.this.f43003e = -1;
                } else {
                    e.this.f43003e = num.intValue();
                }
                TXCLog.i("TXCAudioRouteManager", "audio mode policy:" + e.this.f43003e);
                e eVar2 = e.this;
                eVar2.a(eVar2.b(eVar2.f43003e));
                e.this.a(new Intent(), hashMap, 0);
                TXCAudioNativeInterface.LogTraceExit();
                return;
            }
            TXCLog.e("TXCAudioRouteManager", " InternalVoicecallPreprocess am==null!!");
        }

        private void a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" _enabled:");
            sb2.append(this.f43058d ? "Y" : "N");
            sb2.append(" activeMode:");
            sb2.append(e.this.f43001c);
            TXCAudioNativeInterface.LogTraceEntry(sb2.toString());
            if (this.f43058d) {
                e.this.f43007i = true;
                if (e.this.f43001c == 1) {
                    f();
                }
                synchronized (e.this.f43014p) {
                    try {
                        if (e.this.f43013o != null) {
                            TXCLog.w("TXCAudioRouteManager", "switchThread:" + e.this.f43013o.b());
                            e.this.f43013o.e();
                            e.this.f43013o = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f43058d = false;
                a(false);
                if (e.this.f42999a != null && e.this.f43000b != null) {
                    try {
                        e.this.a(0);
                    } catch (Exception e11) {
                        TXCLog.e("TXCAudioRouteManager", "set mode failed." + e11.getMessage());
                    }
                }
                d();
                TXCAudioNativeInterface.LogTraceExit();
            }
        }

        private void a(boolean z11) {
            if (e.this.f43000b == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
            intent.putExtra("PARAM_OPERATION", "NOTIFY_SERVICE_STATE");
            intent.putExtra("NOTIFY_SERVICE_STATE_DATE", z11);
            com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(intent);
        }

        public void a(Message message) {
            HashMap<String, Object> hashMap;
            int i11 = message.what;
            if (i11 >= 0 && i11 < a.values().length) {
                a aVar = a.values()[message.what];
                try {
                    hashMap = (HashMap) message.obj;
                } catch (Exception unused) {
                    TXCLog.e("TXCAudioRouteManager", "");
                    hashMap = null;
                }
                TXCLog.i("TXCAudioRouteManager", "handle message: " + message.what + " _enabled:" + this.f43058d);
                if (aVar == a.MESSAGE_ENABLE) {
                    a(hashMap);
                    return;
                }
                if (!this.f43058d) {
                    TXCLog.w("TXCAudioRouteManager", "service has been disabled, skip.");
                    e.this.a(new Intent(), hashMap, 1);
                    return;
                }
                switch (AnonymousClass4.f43024a[aVar.ordinal()]) {
                    case 1:
                        a();
                        break;
                    case 2:
                        b(hashMap);
                        break;
                    case 3:
                        e.this.b(hashMap);
                        break;
                    case 4:
                        e.this.c(hashMap);
                        break;
                    case 5:
                        e.this.d(hashMap);
                        break;
                    case 6:
                        c(hashMap);
                        break;
                    case 7:
                        d(hashMap);
                        break;
                    case 8:
                        e.this.a(hashMap);
                        break;
                    case 9:
                    case 10:
                        String f11 = e.this.f43009k.f();
                        String h11 = e.this.f43009k.h();
                        TXCLog.i("TXCAudioRouteManager", "MESSAGE_AUTO_DEVICELIST_UPDATE connectedDev:" + h11 + " highestDev" + f11);
                        if (e.this.f43006h != a.EnumC0508a.STOPPED && this.f43060f) {
                            this.f43060f = false;
                            e.this.a(f11, (HashMap<String, Object>) null, true);
                            break;
                        } else if ("DEVICE_BLUETOOTHHEADSET".equals(h11) || !f11.equals(h11)) {
                            e.this.a(f11, (HashMap<String, Object>) null, false);
                            break;
                        } else {
                            e.this.b();
                            break;
                        }
                        break;
                    case 11:
                        String str = (String) hashMap.get("PARAM_DEVICE");
                        if (e.this.a(str, (HashMap<String, Object>) null, false) != 0) {
                            TXCLog.i("TXCAudioRouteManager", "device plug in: " + str + ", sessionConnectedDev:" + e.this.f43011m + " connected fail,auto switch!");
                            e eVar = e.this;
                            eVar.a(eVar.f43009k.f(), (HashMap<String, Object>) null, false);
                            break;
                        }
                        break;
                    case 12:
                        e eVar2 = e.this;
                        if (eVar2.a(eVar2.f43011m, (HashMap<String, Object>) null, false) != 0) {
                            TXCLog.i("TXCAudioRouteManager", "device plug out:" + ((String) hashMap.get("PARAM_DEVICE")) + " sessionConnectedDev:" + e.this.f43011m + ", connected fail, auto switch!");
                            e eVar3 = e.this;
                            eVar3.a(eVar3.f43009k.f(), (HashMap<String, Object>) null, false);
                            break;
                        }
                        break;
                    case 13:
                        e.this.b();
                        break;
                }
                return;
            }
            TXCLog.e("TXCAudioRouteManager", "invalid message: %d", Integer.valueOf(message.what));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HashMap<String, Object> hashMap) {
        Intent intent = new Intent();
        intent.putExtra("GETCONNECTEDDEVICE_REULT_LIST", this.f43009k.h());
        a(intent, hashMap, 0);
    }

    public void b(String str, long j11, String str2) {
        if (str2 == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        hashMap.put("CONNECTDEVICE_DEVICENAME", str2);
        hashMap.put("PARAM_DEVICE", str2);
        a(a.MESSAGE_CONNECTDEVICE, hashMap);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(11)
    public class b extends com.tencent.liteav.audio.impl.route.b implements BluetoothProfile.ServiceListener {

        /* renamed from: b, reason: collision with root package name */
        private Context f43041b = null;

        /* renamed from: c, reason: collision with root package name */
        private com.tencent.liteav.audio.impl.route.h f43042c = null;

        /* renamed from: d, reason: collision with root package name */
        private BluetoothAdapter f43043d = null;

        /* renamed from: e, reason: collision with root package name */
        private BluetoothProfile f43044e = null;

        /* renamed from: f, reason: collision with root package name */
        private final Object f43045f = new Object();

        public b() {
        }

        private List<BluetoothDevice> d() {
            if (this.f43044e == null) {
                return null;
            }
            try {
                if (e.this.f43000b != null && Build.VERSION.SDK_INT >= 31 && e.this.f43000b.checkPermission("android.permission.BLUETOOTH_CONNECT", Process.myPid(), Process.myUid()) != 0) {
                    return null;
                }
                return this.f43044e.getConnectedDevices();
            } catch (Exception e11) {
                TXCLog.e("TXCAudioRouteManager", "get connected devices failed." + e11.getMessage());
                return null;
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.b
        @TargetApi(11)
        public boolean a(Context context, com.tencent.liteav.audio.impl.route.h hVar) {
            TXCAudioNativeInterface.LogTraceEntry("");
            if (context == null || hVar == null) {
                TXCLog.e("TXCAudioRouteManager", "err ctx is null or devCfg is null");
                return false;
            }
            this.f43041b = context;
            this.f43042c = hVar;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f43043d = defaultAdapter;
            if (defaultAdapter == null) {
                TXCLog.e("TXCAudioRouteManager", "getDefaultAdapter return null!");
                return false;
            }
            synchronized (this.f43045f) {
                try {
                    if (this.f43043d.isEnabled() && this.f43044e == null && !this.f43043d.getProfileProxy(this.f43041b, this, 1)) {
                        TXCLog.e("TXCAudioRouteManager", "BluetoohHeadsetCheck: getProfileProxy HEADSET fail!");
                        return false;
                    }
                    TXCAudioNativeInterface.LogTraceExit();
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.b
        public void b() {
            TXCAudioNativeInterface.LogTraceEntry(" profile:" + this.f43044e);
            synchronized (this.f43045f) {
                try {
                    try {
                        BluetoothAdapter bluetoothAdapter = this.f43043d;
                        if (bluetoothAdapter != null) {
                            BluetoothProfile bluetoothProfile = this.f43044e;
                            if (bluetoothProfile != null) {
                                bluetoothAdapter.closeProfileProxy(1, bluetoothProfile);
                            }
                            this.f43044e = null;
                        }
                    } catch (Exception e11) {
                        TXCLog.e("TXCAudioRouteManager", "closeProfileProxy failed.", e11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        @Override // com.tencent.liteav.audio.impl.route.b
        public boolean c() {
            synchronized (this.f43045f) {
                try {
                    List<BluetoothDevice> d11 = d();
                    if (d11 == null) {
                        return false;
                    }
                    return d11.size() > 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:8:0x002d, B:11:0x0033, B:12:0x0061, B:14:0x006a, B:16:0x006e, B:17:0x0093, B:19:0x0099, B:21:0x009f, B:23:0x00a3, B:26:0x00c7, B:28:0x00d0, B:33:0x00a9, B:35:0x00e6), top: B:7:0x002d, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[SYNTHETIC] */
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        @android.annotation.TargetApi(11)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onServiceConnected(int r9, android.bluetooth.BluetoothProfile r10) {
            /*
                Method dump skipped, instructions count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.impl.route.e.b.onServiceConnected(int, android.bluetooth.BluetoothProfile):void");
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        @TargetApi(11)
        public void onServiceDisconnected(int i11) {
            TXCAudioNativeInterface.LogTraceEntry("_profile:" + this.f43044e + " profile:" + i11);
            if (i11 == 1) {
                TXCLog.i("TXCAudioRouteManager", "TRAEBluetoohProxy: HEADSET Disconnected");
                if (c()) {
                    e.this.a("DEVICE_BLUETOOTHHEADSET", false);
                }
                synchronized (this.f43045f) {
                    try {
                        BluetoothProfile bluetoothProfile = this.f43044e;
                        if (bluetoothProfile != null) {
                            this.f43043d.closeProfileProxy(1, bluetoothProfile);
                            this.f43044e = null;
                        }
                    } finally {
                    }
                }
            }
            TXCAudioNativeInterface.LogTraceExit();
        }

        @Override // com.tencent.liteav.audio.impl.route.b
        public void b(IntentFilter intentFilter, IntentFilter intentFilter2) {
            TXCLog.i("TXCAudioRouteManager", "add extra action " + a());
            intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        }

        @Override // com.tencent.liteav.audio.impl.route.b
        public void a(Context context, Intent intent) {
            if ("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                if (intExtra != 12) {
                    if (intExtra == 10) {
                        e.this.a(true);
                        TXCLog.i("TXCAudioRouteManager", "receive bluetooth audio state changed to STATE_AUDIO_DISCONNECTED");
                        return;
                    }
                    return;
                }
                if (e.this.f43004f == com.tencent.liteav.audio.impl.route.d.SCO_CONNECTING) {
                    TXCLog.i("TXCAudioRouteManager", "receive bluetooth audio state changed to SCO_CONNECTED");
                    e.this.f43004f = com.tencent.liteav.audio.impl.route.d.SCO_CONNECTED;
                    synchronized (e.this.f43005g) {
                        e.this.f43005g[0] = true;
                        e.this.f43005g.notifyAll();
                    }
                    return;
                }
                return;
            }
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                TXCLog.i("TXCAudioRouteManager", "receive bluetooth headset connection state changed: %s", com.tencent.liteav.audio.impl.route.b.c(intExtra2));
                if (intExtra2 == 0) {
                    e.this.f43004f = com.tencent.liteav.audio.impl.route.d.HEADSET_UNAVAILABLE;
                    this.f43042c.a("DEVICE_BLUETOOTHHEADSET", false);
                    return;
                } else {
                    if (intExtra2 != 2) {
                        return;
                    }
                    e.this.f43004f = com.tencent.liteav.audio.impl.route.d.HEADSET_AVAILABLE;
                    this.f43042c.a("DEVICE_BLUETOOTHHEADSET", true);
                    TXCLog.i("TXCAudioRouteManager", "ACTION_CONNECTION_STATE_CHANGED BluetoothProfile.STATE_CONNECTED");
                    e.this.a(false);
                    return;
                }
            }
            if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                int intExtra4 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("receive bluetooth connection state changed, EXTRA_CONNECTION_STATE ");
                sb2.append(com.tencent.liteav.audio.impl.route.b.b(intExtra3));
                sb2.append(", EXTRA_PREVIOUS_CONNECTION_STATE ");
                sb2.append(com.tencent.liteav.audio.impl.route.b.b(intExtra4));
                sb2.append(", EXTRA_DEVICE ");
                sb2.append(bluetoothDevice != null ? bluetoothDevice.getName() : "unknown name");
                TXCLog.i("TXCAudioRouteManager", sb2.toString());
                if (intExtra3 != 2) {
                    if (intExtra3 == 0) {
                        this.f43042c.a("DEVICE_BLUETOOTHHEADSET", false);
                    }
                } else {
                    String name = bluetoothDevice != null ? bluetoothDevice.getName() : "unkown";
                    if (!name.contains("FreeBuds")) {
                        this.f43042c.a("DEVICE_BLUETOOTHHEADSET", true);
                    }
                    this.f43042c.b(name);
                }
            }
        }

        @Override // com.tencent.liteav.audio.impl.route.b
        public String a() {
            return "BluetoohHeadsetCheck";
        }
    }

    public void b(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        a(a.MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE, hashMap);
    }

    public synchronized void a(com.tencent.liteav.audio.impl.route.f fVar, boolean z11, long j11) {
        try {
            if (z11) {
                this.f43008j.a(fVar, j11);
                TXCLog.d("TXCAudioRouteManager", "[register] add AudioSession: " + j11);
            } else {
                this.f43008j.b(j11);
                TXCLog.d("TXCAudioRouteManager", "[register] remove AudioSession: " + j11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void d(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        a(a.MESSAGE_VOICECALLPOSTPROCESS, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(HashMap<String, Object> hashMap) {
        Intent intent = new Intent();
        intent.putExtra("ISDEVICECHANGABLED_REULT_ISCHANGABLED", a());
        a(intent, hashMap, 0);
    }

    public void a(a.EnumC0508a enumC0508a) {
        this.f43006h = enumC0508a;
        TXCLog.i("TXCAudioRouteManager", "set audio io scene to %s", enumC0508a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HashMap<String, Object> hashMap) {
        Intent intent = new Intent();
        intent.putExtra("GETCONNECTINGDEVICE_REULT_LIST", this.f43009k.g());
        a(intent, hashMap, 0);
    }

    public void b() {
        TXCAudioNativeInterface.LogTraceEntry("");
        if (this.f43000b == null) {
            return;
        }
        final Intent intent = new Intent();
        synchronized (this) {
            ArrayList<String> k11 = this.f43009k.k();
            String h11 = this.f43009k.h();
            String i11 = this.f43009k.i();
            String d11 = this.f43009k.d();
            intent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
            intent.putExtra("PARAM_OPERATION", "NOTIFY_DEVICELISTUPDATE");
            intent.putExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST", (String[]) k11.toArray(new String[0]));
            intent.putExtra("EXTRA_DATA_CONNECTEDDEVICE", h11);
            intent.putExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE", i11);
            intent.putExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME", d11);
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.route.e.2
            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f43000b != null) {
                    com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(intent);
                }
            }
        });
        TXCAudioNativeInterface.LogTraceExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z11) {
        if (z11 || this.f43009k.b()) {
            TXCLog.i("TXCAudioRouteManager", "checkAutoDeviceListUpdate got update!");
            e();
            this.f43009k.c();
            a(a.MESSAGE_AUTO_DEVICELIST_UPDATE, new HashMap<>());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z11) {
        if (this.f43009k.b()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkDevicePlug got update dev:");
            sb2.append(str);
            sb2.append(z11 ? " piugin" : " plugout");
            sb2.append(", connectedDev:");
            sb2.append(this.f43009k.h());
            TXCLog.i("TXCAudioRouteManager", sb2.toString());
            e();
            this.f43009k.c();
            if (z11) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("PARAM_DEVICE", str);
                a(a.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE, hashMap);
                return;
            }
            String h11 = this.f43009k.h();
            if (!h11.equals(str) && !h11.equals("DEVICE_NONE")) {
                TXCLog.i("TXCAudioRouteManager", "No switch,plugout:" + str + " connectedDev:" + h11);
                a(a.MESSAGE_NOTIFY_DEVICELIST_UPDATE, new HashMap<>());
                return;
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("PARAM_DEVICE", str);
            a(a.MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE, hashMap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, boolean z11) {
        if (context == null) {
            TXCLog.e("TXCAudioRouteManager", "Could not InternalSetSpeaker, context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            TXCLog.e("TXCAudioRouteManager", "Could not InternalSetSpeaker AudioManager is null.");
            return;
        }
        TXCLog.i("TXCAudioRouteManager", "InternalSetSpeaker entry, speaker on: " + audioManager.isSpeakerphoneOn() + "-->:" + z11);
        try {
            if (audioManager.isSpeakerphoneOn() != z11) {
                audioManager.setSpeakerphoneOn(z11);
            }
        } catch (Exception e11) {
            TXCLog.e("TXCAudioRouteManager", "setSpeakerphoneOn failed with " + e11.getMessage());
        }
        TXCLog.i("TXCAudioRouteManager", "InternalSetSpeaker exit:" + z11 + " res:" + (audioManager.isSpeakerphoneOn() == z11 ? 0 : -1) + " mode:" + audioManager.getMode());
    }

    public void a(int i11) {
        TXCLog.i("TXCAudioRouteManager", "set audio mode to " + i11);
        AudioManager audioManager = this.f42999a;
        if (audioManager == null) {
            TXCLog.w("TXCAudioRouteManager", "setMode:" + i11 + " fail because AudioManager is null.");
            return;
        }
        audioManager.setMode(i11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setMode:");
        sb2.append(i11);
        sb2.append(this.f42999a.getMode() != i11 ? "fail" : "success");
        TXCLog.i("TXCAudioRouteManager", sb2.toString());
    }

    private void a(Intent intent) {
        String stringExtra = intent.getStringExtra("name");
        if (stringExtra == null) {
            stringExtra = "unkonw";
        }
        String str = " [" + stringExtra + "] ";
        int intExtra = intent.getIntExtra("state", -1);
        if (intExtra != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(intExtra == 0 ? "unplugged" : "plugged");
            str = sb2.toString();
        }
        String str2 = str + " mic:";
        int intExtra2 = intent.getIntExtra(PermissionStatusUtilKt.PERMISSION_MICROPHONE, -1);
        if (intExtra2 != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(intExtra2 == 1 ? "Y" : "unkown");
            str2 = sb3.toString();
        }
        TXCLog.i("TXCAudioRouteManager", "onHeadsetPlug:: " + str2);
        com.tencent.liteav.audio.impl.route.h hVar = this.f43009k;
        if (hVar != null) {
            hVar.a("DEVICE_WIREDHEADSET", 1 == intExtra);
        }
    }

    private int a(a aVar, HashMap<String, Object> hashMap) {
        i iVar = this.f43012n;
        if (iVar != null) {
            return iVar.a(aVar, hashMap);
        }
        return -1;
    }

    public int a(String str, long j11, String str2) {
        if (str2.length() <= 0) {
            return -1;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        hashMap.put("EXTRA_DATA_DEVICECONFIG", str2);
        return a(a.MESSAGE_ENABLE, hashMap);
    }

    public int a(String str, long j11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        return a(a.MESSAGE_DISABLE, hashMap);
    }

    public void a(String str, long j11, int i11) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("PARAM_SESSIONID", Long.valueOf(j11));
        hashMap.put("PARAM_OPERATION", str);
        hashMap.put("PARAM_MODEPOLICY", Integer.valueOf(i11));
        a(a.MESSAGE_VOICECALLPREPROCESS, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> hashMap) {
        int i11;
        TXCAudioNativeInterface.LogTraceEntry("");
        if (hashMap == null || this.f43000b == null) {
            return;
        }
        if (c()) {
            TXCLog.w("TXCAudioRouteManager", "InternalSessionConnectDevice failed, because it's in music scene");
            return;
        }
        String str = (String) hashMap.get("PARAM_DEVICE");
        Log.i("TXCAudioRouteManager", "ConnectDevice: " + str);
        if (!this.f43006h.b() && str.equals("DEVICE_EARPHONE")) {
            TXCLog.e("TXCAudioRouteManager", "InternalSessionConnectDevice IsEarPhoneSupported = false, Connect device:" + str + " failed");
            return;
        }
        boolean a11 = a();
        if (com.tencent.liteav.audio.impl.route.h.f(str)) {
            i11 = !this.f43009k.c(str) ? 8 : !a11 ? 9 : 0;
        } else {
            i11 = 7;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sessonID:");
        sb2.append((Long) hashMap.get("PARAM_SESSIONID"));
        sb2.append(" devName:");
        sb2.append(str);
        sb2.append(" bChangabled:");
        sb2.append(a11 ? "Y" : "N");
        sb2.append(" err:");
        sb2.append(i11);
        TXCLog.i("TXCAudioRouteManager", sb2.toString());
        if (i11 != 0) {
            Intent intent = new Intent();
            intent.putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String) hashMap.get("PARAM_DEVICE"));
            a(intent, hashMap, i11);
            return;
        }
        if (str.equals(this.f43009k.h())) {
            TXCLog.e("TXCAudioRouteManager", str + " has connected!");
            Intent intent2 = new Intent();
            intent2.putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String) hashMap.get("PARAM_DEVICE"));
            a(intent2, hashMap, i11);
            return;
        }
        TXCLog.i("TXCAudioRouteManager", str + "is connecting.");
        a(str, hashMap, false);
        TXCAudioNativeInterface.LogTraceExit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public int a(String str, HashMap<String, Object> hashMap, boolean z11) {
        TXCAudioNativeInterface.LogTraceEntry(" devName:" + str);
        if (str == null) {
            return -1;
        }
        if (!z11 && !"DEVICE_BLUETOOTHHEADSET".equals(str) && !this.f43009k.h().equals("DEVICE_NONE") && str.equals(this.f43009k.h())) {
            return 0;
        }
        if (com.tencent.liteav.audio.impl.route.h.f(str) && this.f43009k.c(str)) {
            if (!a()) {
                TXCLog.e("TXCAudioRouteManager", "InternalIsDeviceChangeable fail");
                return -1;
            }
            if (this.f43007i) {
                TXCLog.e("TXCAudioRouteManager", "InternalConnectDevice fail,ready to stopService");
                return -1;
            }
            synchronized (this.f43014p) {
                try {
                    if (!this.f43007i) {
                        this.f43009k.d(str);
                        if (this.f43013o != null) {
                            TXCLog.i("TXCAudioRouteManager", "_switchThread:" + this.f43013o.b());
                            this.f43013o.e();
                            this.f43013o = null;
                        }
                        switch (str.hashCode()) {
                            case -1261879272:
                                if (str.equals("DEVICE_SPEAKERPHONE")) {
                                    this.f43013o = new g();
                                    break;
                                }
                                break;
                            case -463197279:
                                if (str.equals("DEVICE_EARPHONE")) {
                                    this.f43013o = new d();
                                    break;
                                }
                                break;
                            case 715243628:
                                if (str.equals("DEVICE_WIREDHEADSET")) {
                                    this.f43013o = new C0509e();
                                    break;
                                }
                                break;
                            case 770344669:
                                if (str.equals("DEVICE_BLUETOOTHHEADSET")) {
                                    this.f43013o = new c();
                                    break;
                                }
                                break;
                        }
                        h hVar = this.f43013o;
                        if (hVar != null) {
                            hVar.a(hashMap);
                            this.f43013o.start();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            TXCAudioNativeInterface.LogTraceExit();
            return 0;
        }
        TXCLog.e("TXCAudioRouteManager", "checkDevName fail");
        return -1;
    }

    public boolean a() {
        String g11 = this.f43009k.g();
        return g11 == null || g11.equals("DEVICE_NONE") || g11.equals("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(final Intent intent, HashMap<String, Object> hashMap, final int i11) {
        if (this.f43000b == null) {
            return -1;
        }
        Long l11 = (Long) hashMap.get("PARAM_SESSIONID");
        TXCLog.i("TXCAudioRouteManager", " sessonID:" + l11 + " " + ((String) hashMap.get("PARAM_OPERATION")));
        if (l11 != null && l11.longValue() != Long.MIN_VALUE) {
            final Long l12 = (Long) hashMap.get("PARAM_SESSIONID");
            final String str = (String) hashMap.get("PARAM_OPERATION");
            if ("OPERATION_VOICECALL_PREPROCESS".equals(str)) {
                intent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
                intent.putExtra("PARAM_SESSIONID", l12);
                intent.putExtra("PARAM_OPERATION", str);
                intent.putExtra("PARAM_RES_ERRCODE", i11);
                com.tencent.liteav.audio.impl.route.g gVar = this.f43008j;
                if (gVar == null) {
                    return 0;
                }
                gVar.a(intent);
                return 0;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.audio.impl.route.e.1
                @Override // java.lang.Runnable
                public void run() {
                    intent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
                    intent.putExtra("PARAM_SESSIONID", l12);
                    intent.putExtra("PARAM_OPERATION", str);
                    intent.putExtra("PARAM_RES_ERRCODE", i11);
                    if (e.this.f43000b != null) {
                        com.tencent.liteav.basic.a.a.a(e.this.f43000b).a(intent);
                    }
                }
            });
            return 0;
        }
        b();
        TXCLog.e("TXCAudioRouteManager", "sendResBroadcast sid null,don't send res");
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.liteav.audio.impl.route.b a(Context context, com.tencent.liteav.audio.impl.route.h hVar) {
        com.tencent.liteav.audio.impl.route.b bVar = new b();
        if (!bVar.a(context, hVar)) {
            bVar = new com.tencent.liteav.audio.impl.route.c();
        }
        TXCLog.i("TXCAudioRouteManager", "CreateBluetoothCheck:" + bVar.a() + " skip android4.3: false");
        return bVar;
    }
}
