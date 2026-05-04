package com.tencent.liteav.audio.impl.route;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import c40.t0;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class f extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static int f43064a;

    /* renamed from: b, reason: collision with root package name */
    private final long f43065b = a();

    /* renamed from: c, reason: collision with root package name */
    private final Context f43066c;

    /* renamed from: d, reason: collision with root package name */
    private final e f43067d;

    /* renamed from: e, reason: collision with root package name */
    private a f43068e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {
        public void a(int i11) {
        }

        public void b(int i11, String str) {
        }

        public void a(int i11, String str) {
        }

        public void b(boolean z11) {
        }

        public void a(int i11, String str, boolean z11) {
        }

        public void a(int i11, boolean z11) {
        }

        public void a(int i11, String[] strArr, String str, String str2, String str3) {
        }

        public void a(String str, long j11) {
        }

        public void a(String str, String str2) {
        }

        public void a(boolean z11) {
        }

        public void a(String[] strArr, String str, String str2, String str3) {
        }
    }

    public f(Context context, e eVar, a aVar) {
        this.f43068e = null;
        this.f43068e = aVar;
        this.f43066c = context;
        this.f43067d = eVar;
        if (context == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioSession | Invalid parameters: ctx = ");
            sb2.append(context == null ? "null" : "{object}");
            sb2.append("; cb = ");
            sb2.append(aVar == null ? "null" : "{object}");
            TXCLog.w("TXCAudioSession", sb2.toString());
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES");
        intentFilter.addAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
        if (context != null) {
            try {
                com.tencent.liteav.basic.a.a.a(context).a(this, intentFilter);
            } catch (Exception e11) {
                TXCLog.e("TXCAudioSession", "registerReceiver Exception: " + e11.getMessage());
            }
        }
        a(this, true);
        TXCLog.i("TXCAudioSession", "TraeAudioSession create, mSessionId: " + this.f43065b);
    }

    public static long a() {
        long myPid = Process.myPid() << 32;
        int i11 = f43064a + 1;
        f43064a = i11;
        return myPid + i11;
    }

    public void b() {
        TXCLog.i("TXCAudioSession", "TraeAudioSession release, mSessionId: " + this.f43065b);
        Context context = this.f43066c;
        if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (Exception unused) {
            }
            com.tencent.liteav.basic.a.a.a(this.f43066c).a(this);
        }
        a(this, false);
        this.f43068e = null;
    }

    public int c() {
        return this.f43067d.a("OPERATION_STOPSERVICE", this.f43065b);
    }

    public void d() {
        this.f43067d.c("OPERATION_GETCONNECTEDDEVICE", this.f43065b);
    }

    public void e() {
        this.f43067d.d("OPERATION_VOICECALL_POSTROCESS", this.f43065b);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        try {
            if (intent == null) {
                TXCLog.w("TXCAudioSession", "[ERROR] intent = null!!");
                return;
            }
            long longExtra = intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE);
            String stringExtra = intent.getStringExtra("PARAM_OPERATION");
            int intExtra = intent.getIntExtra("PARAM_RES_ERRCODE", 0);
            str = "\n";
            if ("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY".equals(intent.getAction())) {
                if ("NOTIFY_SERVICE_STATE".equals(stringExtra)) {
                    boolean booleanExtra = intent.getBooleanExtra("NOTIFY_SERVICE_STATE_DATE", false);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[onServiceStateUpdate]");
                    sb2.append(booleanExtra ? t0.f7979d : t0.f7980e);
                    TXCLog.i("TXCAudioSession", sb2.toString());
                    a aVar = this.f43068e;
                    if (aVar != null) {
                        aVar.a(booleanExtra);
                        return;
                    }
                    return;
                }
                if ("NOTIFY_DEVICELISTUPDATE".equals(stringExtra)) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST");
                    String stringExtra2 = intent.getStringExtra("EXTRA_DATA_CONNECTEDDEVICE");
                    String stringExtra3 = intent.getStringExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE");
                    String stringExtra4 = intent.getStringExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME");
                    StringBuilder sb3 = new StringBuilder("\n");
                    for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                        sb3.append("    ");
                        sb3.append(i11);
                        sb3.append(" ");
                        sb3.append(stringArrayExtra[i11]);
                        sb3.append("\n");
                    }
                    sb3.append("\n");
                    TXCLog.i("TXCAudioSession", "[onDeviceListUpdate]  connected:" + stringExtra2 + " prevConnected:" + stringExtra3 + " bt:" + stringExtra4 + " Num:" + stringArrayExtra.length + ((Object) sb3));
                    a aVar2 = this.f43068e;
                    if (aVar2 != null) {
                        aVar2.a(stringArrayExtra, stringExtra2, stringExtra3, stringExtra4);
                        return;
                    }
                    return;
                }
                if ("NOTIFY_DEVICECHANGABLE_UPDATE".equals(stringExtra)) {
                    boolean booleanExtra2 = intent.getBooleanExtra("NOTIFY_DEVICECHANGABLE_UPDATE_DATE", true);
                    TXCLog.i("TXCAudioSession", "[onDeviceChangabledUpdate]" + booleanExtra2);
                    a aVar3 = this.f43068e;
                    if (aVar3 != null) {
                        aVar3.b(booleanExtra2);
                        return;
                    }
                    return;
                }
                if ("NOTIFY_ROUTESWITCHSTART".equals(stringExtra)) {
                    String stringExtra5 = intent.getStringExtra("EXTRA_DATA_ROUTESWITCHSTART_FROM");
                    String stringExtra6 = intent.getStringExtra("EXTRA_DATA_ROUTESWITCHSTART_TO");
                    a aVar4 = this.f43068e;
                    if (aVar4 == null || stringExtra5 == null || stringExtra6 == null) {
                        return;
                    }
                    aVar4.a(stringExtra5, stringExtra6);
                    return;
                }
                if ("NOTIFY_ROUTESWITCHEND".equals(stringExtra)) {
                    String stringExtra7 = intent.getStringExtra("EXTRA_DATA_ROUTESWITCHEND_DEV");
                    long longExtra2 = intent.getLongExtra("EXTRA_DATA_ROUTESWITCHEND_TIME", -1L);
                    a aVar5 = this.f43068e;
                    if (aVar5 == null || stringExtra7 == null || longExtra2 == -1) {
                        return;
                    }
                    aVar5.a(stringExtra7, longExtra2);
                    return;
                }
                return;
            }
            try {
                if ("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES".equals(intent.getAction()) && this.f43065b == longExtra) {
                    try {
                        if ("OPERATION_GETDEVICELIST".equals(stringExtra)) {
                            String[] stringArrayExtra2 = intent.getStringArrayExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST");
                            String stringExtra8 = intent.getStringExtra("EXTRA_DATA_CONNECTEDDEVICE");
                            String stringExtra9 = intent.getStringExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE");
                            String stringExtra10 = intent.getStringExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME");
                            StringBuilder sb4 = new StringBuilder("\n");
                            for (int i12 = 0; i12 < stringArrayExtra2.length; i12++) {
                                sb4.append("    ");
                                sb4.append(i12);
                                sb4.append(" ");
                                sb4.append(stringArrayExtra2[i12]);
                                sb4.append("\n");
                            }
                            sb4.append("\n");
                            TXCLog.i("TXCAudioSession", "[onGetDeviceListRes] err:" + intExtra + " connected:" + stringExtra8 + " prevConnected:" + stringExtra9 + " bt:" + stringExtra10 + " Num:" + stringArrayExtra2.length + ((Object) sb4));
                            a aVar6 = this.f43068e;
                            if (aVar6 != null) {
                                aVar6.a(intExtra, stringArrayExtra2, stringExtra8, stringExtra9, stringExtra10);
                                return;
                            }
                            return;
                        }
                        if ("OPERATION_CONNECTDEVICE".equals(stringExtra)) {
                            String stringExtra11 = intent.getStringExtra("CONNECTDEVICE_RESULT_DEVICENAME");
                            TXCLog.i("TXCAudioSession", "[onConnectDeviceRes] err:" + intExtra + " dev:" + stringExtra11);
                            a aVar7 = this.f43068e;
                            if (aVar7 != null) {
                                aVar7.a(intExtra, stringExtra11, intExtra == 0);
                                return;
                            }
                            return;
                        }
                        if ("OPERATION_ISDEVICECHANGABLED".equals(stringExtra)) {
                            boolean booleanExtra3 = intent.getBooleanExtra("ISDEVICECHANGABLED_REULT_ISCHANGABLED", false);
                            TXCLog.i("TXCAudioSession", "[onIsDeviceChangabledRes] err:" + intExtra + " Changabled:" + booleanExtra3);
                            a aVar8 = this.f43068e;
                            if (aVar8 != null) {
                                aVar8.a(intExtra, booleanExtra3);
                                return;
                            }
                            return;
                        }
                        if ("OPERATION_GETCONNECTEDDEVICE".equals(stringExtra)) {
                            String stringExtra12 = intent.getStringExtra("GETCONNECTEDDEVICE_REULT_LIST");
                            TXCLog.i("TXCAudioSession", "[onGetConnectedDeviceRes] err:" + intExtra + " dev:" + stringExtra12);
                            a aVar9 = this.f43068e;
                            if (aVar9 != null) {
                                aVar9.a(intExtra, stringExtra12);
                                return;
                            }
                            return;
                        }
                        if (!"OPERATION_GETCONNECTINGDEVICE".equals(stringExtra)) {
                            if ("OPERATION_VOICECALL_PREPROCESS".equals(stringExtra)) {
                                TXCLog.i("TXCAudioSession", "[onVoicecallPreprocess] err:" + intExtra);
                                a aVar10 = this.f43068e;
                                if (aVar10 != null) {
                                    aVar10.a(intExtra);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        String stringExtra13 = intent.getStringExtra("GETCONNECTINGDEVICE_REULT_LIST");
                        TXCLog.i("TXCAudioSession", "[onGetConnectingDeviceRes] err:" + intExtra + " dev:" + stringExtra13);
                        a aVar11 = this.f43068e;
                        if (aVar11 != null) {
                            aVar11.b(intExtra, stringExtra13);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        TXCLog.e(str, " nSessinId = " + this.f43065b + " onReceive::intent:" + intent.toString() + " intent.getAction():" + intent.getAction() + " Exception:" + e.getMessage());
                    }
                }
            } catch (Exception e12) {
                e = e12;
                str = "TXCAudioSession";
            }
        } catch (Exception e13) {
            e = e13;
            str = "TXCAudioSession";
        }
    }

    private void a(f fVar, boolean z11) {
        if (this.f43066c == null) {
            return;
        }
        this.f43067d.a(fVar, z11, this.f43065b);
    }

    public int a(String str) {
        if (str == null || str.length() <= 0) {
            str = "internal_disable_dev_switch";
        }
        return this.f43067d.a("OPERATION_STARTSERVICE", this.f43065b, str);
    }

    public void a(int i11) {
        this.f43067d.a("OPERATION_VOICECALL_PREPROCESS", this.f43065b, i11);
    }

    public void b(String str) {
        this.f43067d.b("OPERATION_CONNECTDEVICE", this.f43065b, str);
    }

    public void a(Intent intent) {
        try {
            if (intent == null) {
                TXCLog.w("TXCAudioSession", "[ERROR] intent = null!!");
                return;
            }
            long longExtra = intent.getLongExtra("PARAM_SESSIONID", Long.MIN_VALUE);
            String stringExtra = intent.getStringExtra("PARAM_OPERATION");
            int intExtra = intent.getIntExtra("PARAM_RES_ERRCODE", 0);
            if ("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES".equals(intent.getAction()) && this.f43065b == longExtra && "OPERATION_VOICECALL_PREPROCESS".equals(stringExtra)) {
                TXCLog.w("TXCAudioSession", "[onReceiveCallback onVoicecallPreprocess] err:" + intExtra);
                a aVar = this.f43068e;
                if (aVar != null) {
                    aVar.a(intExtra);
                }
            }
        } catch (Exception e11) {
            TXCLog.e("TXCAudioSession", " nSessinId = " + this.f43065b + " onReceive::intent:" + intent.toString() + " intent.getAction():" + intent.getAction() + " Exception:" + e11.getMessage());
        }
    }
}
