package tz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f91310a;

    /* renamed from: b, reason: collision with root package name */
    public String f91311b;

    /* renamed from: c, reason: collision with root package name */
    public Pair f91312c;

    public j(Context context) {
        this.f91310a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f91311b
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            android.content.Context r1 = r9.f91310a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = tz.i0.f91295f     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L1d
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1d
            android.net.wifi.WifiInfo r1 = r1.getConnectionInfo()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1d
            java.lang.String r1 = r1.getMacAddress()     // Catch: java.lang.Throwable -> L1d
            goto L1e
        L1d:
            r1 = r0
        L1e:
            boolean r2 = r9.d(r1)
            if (r2 != 0) goto L25
            return r1
        L25:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = tz.i0.f91297h     // Catch: java.lang.Throwable -> L3a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L3a
        L3a:
            boolean r2 = r9.d(r1)
            if (r2 != 0) goto L41
            return r1
        L41:
            java.util.Enumeration r2 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Exception -> L9e
            java.util.ArrayList r2 = java.util.Collections.list(r2)     // Catch: java.lang.Exception -> L9e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L9e
        L4d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L9e
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L9e
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3     // Catch: java.lang.Exception -> L9e
            java.lang.String r4 = tz.i0.f91296g     // Catch: java.lang.Exception -> L9e
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Exception -> L9e
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> L9e
            if (r4 == 0) goto L4d
            byte[] r3 = r3.getHardwareAddress()     // Catch: java.lang.Exception -> L9e
            if (r3 == 0) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9e
            r4.<init>()     // Catch: java.lang.Exception -> L9e
            int r5 = r3.length     // Catch: java.lang.Exception -> L9e
            r6 = 0
        L72:
            if (r6 >= r5) goto L8a
            r7 = r3[r6]     // Catch: java.lang.Exception -> L9e
            java.lang.String r8 = "%02X:"
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)     // Catch: java.lang.Exception -> L9e
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L9e
            java.lang.String r7 = java.lang.String.format(r8, r7)     // Catch: java.lang.Exception -> L9e
            r4.append(r7)     // Catch: java.lang.Exception -> L9e
            int r6 = r6 + 1
            goto L72
        L8a:
            int r3 = r4.length()     // Catch: java.lang.Exception -> L9e
            if (r3 <= 0) goto L99
            int r3 = r4.length()     // Catch: java.lang.Exception -> L9e
            int r3 = r3 + (-1)
            r4.deleteCharAt(r3)     // Catch: java.lang.Exception -> L9e
        L99:
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L9e
            goto L4d
        L9e:
            boolean r2 = r9.d(r1)
            if (r2 == 0) goto La5
            goto La6
        La5:
            r0 = r1
        La6:
            if (r0 != 0) goto Laa
            java.lang.String r0 = ""
        Laa:
            r9.f91311b = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tz.j.a():java.lang.String");
    }

    public final boolean b(String str) {
        return TextUtils.isEmpty(str) || str.equals(i0.f91299j) || str.equals(i0.f91300k);
    }

    @SuppressLint({"HardwareIds"})
    public Pair c() {
        String str;
        String str2;
        String imei;
        Pair pair = this.f91312c;
        if (pair != null) {
            return pair;
        }
        if (l0.b(this.f91310a)) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f91310a.getSystemService("phone");
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    str = telephonyManager.getImei();
                    try {
                        str2 = telephonyManager.getImei(1);
                        imei = telephonyManager.getImei(2);
                        if (TextUtils.equals(str, str2)) {
                            str2 = imei;
                        }
                    } catch (SecurityException | Exception unused) {
                    }
                } else {
                    str = telephonyManager.getDeviceId();
                }
            } catch (SecurityException | Exception unused2) {
                str = null;
            }
            str2 = null;
        } else {
            str = null;
            str2 = null;
        }
        if (b(str)) {
            str = null;
        }
        Pair pair2 = new Pair(str, b(str2) ? null : str2);
        this.f91312c = pair2;
        return pair2;
    }

    public final boolean d(String str) {
        return TextUtils.isEmpty(str) || str.equals(i0.f91301l);
    }
}
