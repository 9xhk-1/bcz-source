package com.tencent.liteav.audio.impl.route;

import com.alipay.sdk.m.u.i;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, a> f43072a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private String f43073b = "DEVICE_NONE";

    /* renamed from: c, reason: collision with root package name */
    private String f43074c = "DEVICE_NONE";

    /* renamed from: d, reason: collision with root package name */
    private String f43075d = "DEVICE_NONE";

    /* renamed from: e, reason: collision with root package name */
    private String f43076e = "unknown";

    /* renamed from: f, reason: collision with root package name */
    private boolean f43077f = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f43078a = "DEVICE_NONE";

        /* renamed from: b, reason: collision with root package name */
        private boolean f43079b = false;

        /* renamed from: c, reason: collision with root package name */
        private int f43080c = 0;

        public boolean a(String str, int i11) {
            if (str == null || str.length() <= 0 || !h.f(str)) {
                return false;
            }
            this.f43078a = str;
            this.f43080c = i11;
            return true;
        }

        public boolean b() {
            return this.f43079b;
        }

        public int c() {
            return this.f43080c;
        }

        public String a() {
            return this.f43078a;
        }

        public void a(boolean z11) {
            this.f43079b = z11;
        }
    }

    private void l() {
        TXCLog.i("TXCDeviceConfigManager", "ConnectedDevice:" + h() + ", ConnectingDevice:" + g() + ", prevConnectedDevice:" + i() + ", available hightest priority device:" + f() + "device count:" + e());
        Iterator<Map.Entry<String, a>> it = this.f43072a.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            TXCLog.i("TXCDeviceConfigManager", "name: %s, visible: %b, priority: %d", value.f43078a, Boolean.valueOf(value.f43079b), Integer.valueOf(value.f43080c));
        }
    }

    public synchronized boolean a(String str) {
        try {
            TXCAudioNativeInterface.LogTraceEntry(" strConfigs:" + str);
            if (str != null && str.length() > 0) {
                String replace = str.replace("\n", "").replace(c1.g.f7467d, "");
                if (replace.length() <= 0) {
                    return false;
                }
                if (!replace.contains(i.f11097b)) {
                    replace = replace + i.f11097b;
                }
                String[] split = replace.split(i.f11097b);
                if (1 > split.length) {
                    return false;
                }
                for (int i11 = 0; i11 < split.length; i11++) {
                    a(split[i11], i11);
                }
                l();
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized boolean b() {
        return this.f43077f;
    }

    public synchronized void c() {
        this.f43077f = false;
    }

    public String d() {
        return this.f43076e;
    }

    public synchronized int e() {
        return this.f43072a.size();
    }

    public synchronized String f() {
        a aVar;
        try {
            Iterator<Map.Entry<String, a>> it = this.f43072a.entrySet().iterator();
            aVar = null;
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    if (value.b()) {
                        if (aVar != null && value.c() < aVar.c()) {
                        }
                        aVar = value;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar != null ? aVar.a() : "DEVICE_SPEAKERPHONE";
    }

    public synchronized String g() {
        a aVar;
        aVar = this.f43072a.get(this.f43075d);
        return (aVar == null || !aVar.b()) ? null : this.f43075d;
    }

    public synchronized String h() {
        a aVar = this.f43072a.get(this.f43074c);
        if (aVar == null || !aVar.b()) {
            return "DEVICE_NONE";
        }
        return this.f43074c;
    }

    public synchronized String i() {
        String str;
        str = "DEVICE_NONE";
        a aVar = this.f43072a.get(this.f43073b);
        if (aVar != null && aVar.b()) {
            str = this.f43073b;
        }
        return str;
    }

    public synchronized void j() {
        this.f43075d = "";
    }

    public synchronized ArrayList<String> k() {
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, a>> it = this.f43072a.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (value != null && value.b()) {
                arrayList.add(value.a());
            }
        }
        return arrayList;
    }

    public void b(String str) {
        if (str == null) {
            this.f43076e = "unknown";
        } else if (str.isEmpty()) {
            this.f43076e = "unknown";
        } else {
            this.f43076e = str;
        }
    }

    public synchronized void d(String str) {
        a aVar = this.f43072a.get(str);
        if (aVar != null && aVar.b()) {
            this.f43075d = str;
        }
    }

    public synchronized void e(String str) {
        try {
            a aVar = this.f43072a.get(str);
            if (aVar != null && aVar.b()) {
                String str2 = this.f43074c;
                if (str2 != null && !str2.equals(str)) {
                    this.f43073b = this.f43074c;
                }
                this.f43074c = str;
                this.f43075d = "";
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean c(String str) {
        a aVar = this.f43072a.get(str);
        if (aVar == null) {
            return false;
        }
        return aVar.b();
    }

    public static boolean f(String str) {
        return "DEVICE_SPEAKERPHONE".equals(str) || "DEVICE_EARPHONE".equals(str) || "DEVICE_WIREDHEADSET".equals(str) || "DEVICE_BLUETOOTHHEADSET".equals(str);
    }

    private void a(String str, int i11) {
        TXCAudioNativeInterface.LogTraceEntry(" devName:" + str + " priority:" + i11);
        a aVar = new a();
        if (!aVar.a(str, i11)) {
            TXCLog.e("TXCDeviceConfigManager", " err dev init!");
            return;
        }
        if (this.f43072a.containsKey(str)) {
            TXCLog.e("TXCDeviceConfigManager", "err dev exist!");
            return;
        }
        this.f43072a.put(str, aVar);
        this.f43077f = true;
        TXCLog.i("TXCDeviceConfigManager", "add device, name: %s", str);
        TXCAudioNativeInterface.LogTraceExit();
    }

    public synchronized void a() {
        this.f43072a.clear();
        this.f43073b = "DEVICE_NONE";
        this.f43074c = "DEVICE_NONE";
        this.f43075d = "DEVICE_NONE";
    }

    public synchronized boolean a(String str, boolean z11) {
        boolean z12;
        a aVar = this.f43072a.get(str);
        if (aVar == null || aVar.b() == z11) {
            z12 = false;
        } else {
            aVar.a(z11);
            z12 = true;
            this.f43077f = true;
            TXCLog.i("TXCDeviceConfigManager", "update device visibility, device: %s, visible: %s", str, Boolean.valueOf(z11));
        }
        return z12;
    }
}
