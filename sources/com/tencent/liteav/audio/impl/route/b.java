package com.tencent.liteav.audio.impl.route;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public abstract class b {
    public static String b(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    public static String c(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    public abstract String a();

    public abstract void a(Context context, Intent intent);

    public void a(IntentFilter intentFilter, IntentFilter intentFilter2) {
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        b(intentFilter, intentFilter2);
    }

    public abstract boolean a(Context context, h hVar);

    public abstract void b();

    public abstract void b(IntentFilter intentFilter, IntentFilter intentFilter2);

    public abstract boolean c();

    public void a(Context context, Intent intent, h hVar) {
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            TXCLog.i("BluetoohHeadsetCheckBase", "receive ACTION_STATE_CHANGED, EXTRA_STATE: %s, EXTRA_PREVIOUS_STATE: %s", a(intExtra), a(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1)));
            if (intExtra == 10) {
                TXCLog.i("BluetoohHeadsetCheckBase", "BT off");
                hVar.a("DEVICE_BLUETOOTHHEADSET", false);
                return;
            } else {
                if (intExtra == 12) {
                    TXCLog.i("BluetoohHeadsetCheckBase", "BT OFF-->ON, need update its visibility.");
                    return;
                }
                return;
            }
        }
        a(context, intent);
    }

    public static String a(int i11) {
        switch (i11) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "unknown";
        }
    }
}
