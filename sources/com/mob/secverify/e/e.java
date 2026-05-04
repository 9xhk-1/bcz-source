package com.mob.secverify.e;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import com.mob.MobSDK;
import com.mob.tools.utils.DeviceHelper;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f40728a;

    /* renamed from: g, reason: collision with root package name */
    private static DeviceHelper f40729g = DeviceHelper.getInstance(MobSDK.getContext());

    /* renamed from: b, reason: collision with root package name */
    private Context f40730b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f40731c = -1;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f40732d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f40733e = "-1";

    /* renamed from: f, reason: collision with root package name */
    private TelephonyManager f40734f = null;

    private String e() {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        try {
            Context context = this.f40730b;
            if (context != null && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && connectionInfo.getBSSID() != null) {
                String valueOf = String.valueOf(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100));
                this.f40733e = valueOf;
                if ("0".equals(valueOf)) {
                    this.f40733e = "-1";
                }
            }
            return this.f40733e;
        } catch (Exception e11) {
            this.f40733e = "-1";
            com.mob.secverify.b.c.a().b(e11);
            return this.f40733e;
        }
    }

    public String b() {
        TelephonyManager telephonyManager;
        if (this.f40734f == null && this.f40730b == null) {
            this.f40730b = MobSDK.getContext();
            new com.mob.secverify.c.b() { // from class: com.mob.secverify.e.e.2
                @Override // com.mob.secverify.c.b
                public void a() {
                    e eVar = e.this;
                    eVar.a(eVar.f40730b);
                }
            }.start();
        }
        try {
            DeviceHelper deviceHelper = f40729g;
            if (deviceHelper == null || !deviceHelper.checkPermission("android.permission.READ_PHONE_STATE") || (telephonyManager = this.f40734f) == null) {
                return "UNKNOWN";
            }
            switch (telephonyManager.getDataNetworkType()) {
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO0";
                case 6:
                    return "EVDOA";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "IDEN";
                case 12:
                    return "EVDOB";
                case 13:
                    return "LTE";
                case 14:
                    return "EHRPD";
                case 15:
                    return "HSPAP";
                case 16:
                    return "GSM";
                case 17:
                    return "TD_SCDMA";
                case 18:
                    return "IWLAN";
                case 19:
                    return "LTE_CA";
                case 20:
                    return "NR";
                default:
                    return "UNKNOWN";
            }
        } catch (Throwable unused) {
            return "UNKNOWN";
        }
    }

    public String c() {
        try {
            if (h.c(MobSDK.getContext())) {
                this.f40733e = e();
            } else {
                this.f40733e = "0";
            }
            return this.f40733e;
        } catch (Exception e11) {
            com.mob.secverify.b.c.a().b(e11);
            return "-1";
        }
    }

    public int d() {
        try {
            if (!h.a(MobSDK.getContext())) {
                this.f40731c = 0;
            } else if (this.f40731c > 0) {
                this.f40731c = -1;
            }
            return this.f40731c;
        } catch (Exception e11) {
            com.mob.secverify.b.c.a().b(e11);
            return -1;
        }
    }

    public static e a() {
        if (f40728a == null) {
            synchronized (e.class) {
                try {
                    if (f40728a == null) {
                        f40728a = new e();
                    }
                } finally {
                }
            }
        }
        return f40728a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r10.f40731c = ((java.lang.Integer) r11.getClass().getMethod("getGsmDbm", null).invoke(r11, null)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r10.f40731c != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r10.f40731c = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        com.mob.secverify.b.c.a().c("[SecPure] ==>%s", r10.f40731c + " getGsmDbm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r5 >= 3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r3[r5] != r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r10.f40731c = ((java.lang.Integer) r11.getClass().getMethod("getDbm", null).invoke(r11, null)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r10.f40731c != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        r10.f40731c = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        r10.f40731c = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        r10.f40731c = r11.getGsmSignalStrength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r10.f40731c != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        r10.f40731c = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.telephony.SignalStrength r11) {
        /*
            r10 = this;
            java.lang.String r0 = "[SecPure] ==>%s"
            r1 = 9
            int[] r2 = new int[r1]
            r2 = {x00b2: FILL_ARRAY_DATA , data: [3, 5, 6, 8, 9, 10, 12, 14, 15} // fill-array
            r3 = 18
            r4 = 19
            r5 = 13
            int[] r3 = new int[]{r5, r3, r4}
            android.telephony.TelephonyManager r4 = r10.f40734f
            if (r4 != 0) goto L1e
            android.content.Context r4 = com.mob.MobSDK.getContext()
            r10.a(r4)
        L1e:
            android.telephony.TelephonyManager r4 = r10.f40734f     // Catch: java.lang.Throwable -> L4b
            int r4 = r4.getNetworkType()     // Catch: java.lang.Throwable -> L4b
            r5 = 0
            r6 = r5
        L26:
            r7 = 0
            r8 = -1
            if (r6 >= r1) goto L6e
            r9 = r2[r6]     // Catch: java.lang.Throwable -> L4b
            if (r9 != r4) goto L6b
            java.lang.Class r1 = r11.getClass()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            java.lang.String r2 = "getGsmDbm"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r7)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            java.lang.Object r11 = r1.invoke(r11, r7)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            r10.f40731c = r11     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            int r11 = r10.f40731c     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            if (r11 != 0) goto L4d
            r10.f40731c = r8     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            goto L4d
        L4b:
            r11 = move-exception
            goto La5
        L4d:
            com.mob.secverify.b.c r11 = com.mob.secverify.b.c.a()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            int r2 = r10.f40731c     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            r1.append(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            java.lang.String r2 = " getGsmDbm"
            r1.append(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            r11.c(r0, r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L68
            return
        L68:
            r10.f40731c = r8     // Catch: java.lang.Throwable -> L4b
            goto Lb0
        L6b:
            int r6 = r6 + 1
            goto L26
        L6e:
            r1 = 3
            if (r5 >= r1) goto L98
            r1 = r3[r5]     // Catch: java.lang.Throwable -> L4b
            if (r1 != r4) goto L95
            java.lang.Class r1 = r11.getClass()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            java.lang.String r2 = "getDbm"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r7)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            java.lang.Object r11 = r1.invoke(r11, r7)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            r10.f40731c = r11     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            int r11 = r10.f40731c     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            if (r11 != 0) goto Lb0
            r10.f40731c = r8     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L92
            return
        L92:
            r10.f40731c = r8     // Catch: java.lang.Throwable -> L4b
            goto Lb0
        L95:
            int r5 = r5 + 1
            goto L6e
        L98:
            int r11 = r11.getGsmSignalStrength()     // Catch: java.lang.Throwable -> L4b
            r10.f40731c = r11     // Catch: java.lang.Throwable -> L4b
            int r11 = r10.f40731c     // Catch: java.lang.Throwable -> L4b
            if (r11 != 0) goto Lb0
            r10.f40731c = r8     // Catch: java.lang.Throwable -> L4b
            return
        La5:
            com.mob.secverify.b.c r1 = com.mob.secverify.b.c.a()
            java.lang.String r2 = r11.toString()
            r1.b(r11, r0, r2)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.e.e.a(android.telephony.SignalStrength):void");
    }

    public void a(Context context) {
        if (context != null) {
            try {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                PhoneStateListener phoneStateListener = new PhoneStateListener() { // from class: com.mob.secverify.e.e.1
                    @Override // android.telephony.PhoneStateListener
                    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                        super.onSignalStrengthsChanged(signalStrength);
                        e.this.a(signalStrength);
                    }
                };
                this.f40730b = context;
                if (this.f40734f == null) {
                    this.f40734f = (TelephonyManager) context.getSystemService("phone");
                    List<SubscriptionInfo> c11 = a.c();
                    if (c11 != null && !c11.isEmpty()) {
                        Iterator<SubscriptionInfo> it = c11.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            SubscriptionInfo next = it.next();
                            int a11 = a.a(next);
                            if (a.b(next)) {
                                this.f40734f = this.f40734f.createForSubscriptionId(a11);
                                break;
                            }
                        }
                    }
                }
                this.f40734f.listen(phoneStateListener, 256);
                Looper.loop();
            } catch (Exception e11) {
                com.mob.secverify.b.c.a().b(e11);
            }
        }
    }
}
