package com.alipay.sdk.m.a0;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.huawei.hms.android.SystemUtils;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import q9.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f10468b = new b();

    /* renamed from: a, reason: collision with root package name */
    public f f10469a;

    public static b a(f fVar) {
        b bVar = f10468b;
        bVar.f10469a = fVar;
        return bVar;
    }

    public static String b() {
        long j11;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j11 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    public static String c() {
        long j11;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j11 = statFs.getBlockSize() * statFs.getAvailableBlocks();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d() {
        /*
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L51
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L51
            r1 = 1
            r5 = r1
        L1b:
            r6 = 100
            if (r5 >= r6) goto L46
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L46
            java.lang.String r7 = "Serial"
            int r7 = r6.indexOf(r7)     // Catch: java.lang.Throwable -> L44
            if (r7 < 0) goto L41
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch: java.lang.Throwable -> L44
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r6.substring(r5, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L44
            goto L46
        L41:
            int r5 = r5 + 1
            goto L1b
        L44:
            r1 = r4
            goto L51
        L46:
            r4.close()     // Catch: java.lang.Throwable -> L49
        L49:
            r3.close()     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L4d:
            r3 = r1
            goto L51
        L4f:
            r2 = r1
            r3 = r2
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L56
        L56:
            if (r3 == 0) goto L5b
            r3.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            if (r2 == 0) goto L60
        L5d:
            r2.close()     // Catch: java.lang.Throwable -> L60
        L60:
            if (r0 != 0) goto L64
            java.lang.String r0 = ""
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.d():java.lang.String");
    }

    public static String e() {
        String t11 = t();
        return !com.alipay.sdk.m.z.a.a(t11) ? t11 : u();
    }

    public static String f() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String[] split;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    split = bufferedReader.readLine().split(":\\s+", 2);
                } catch (Throwable unused) {
                    fileReader2 = fileReader;
                    if (fileReader2 != null) {
                        try {
                            fileReader2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        if (split == null || split.length <= 1) {
            try {
                fileReader.close();
            } catch (Throwable unused6) {
            }
            bufferedReader.close();
            return "";
        }
        String str = split[1];
        try {
            fileReader.close();
        } catch (Throwable unused7) {
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused8) {
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2b
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L25
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L29
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L29
            int r1 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L29
            long r1 = (long) r1
        L25:
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L35
        L29:
            r3 = r4
            goto L2e
        L2b:
            r0 = r3
            goto L29
        L2d:
            r0 = r3
        L2e:
            if (r3 == 0) goto L33
            r3.close()     // Catch: java.lang.Throwable -> L33
        L33:
            if (r0 == 0) goto L38
        L35:
            r0.close()     // Catch: java.lang.Throwable -> L38
        L38:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.g():java.lang.String");
    }

    public static String h() {
        long j11;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j11 = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    public static String i() {
        long j11;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j11 = statFs.getBlockSize() * statFs.getBlockCount();
        } catch (Throwable unused) {
            j11 = 0;
        }
        return String.valueOf(j11);
    }

    public static String j() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod(ct.d.f46852f, String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String k() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String l() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String m() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String n() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SystemClock.elapsedRealtime());
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o() {
        try {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb2.append(ChipTextInputComboView.b.f32535b + ":");
            for (int i11 = 0; i11 < 7; i11++) {
                sb2.append(new File(strArr[i11]).exists() ? "1" : "0");
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String p() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ChipTextInputComboView.b.f32535b);
        sb2.append(":");
        for (int i11 = 0; i11 <= 0; i11++) {
            try {
                Class.forName(strArr[0]);
                sb2.append("1");
            } catch (Throwable unused) {
                sb2.append("0");
            }
        }
        return sb2.toString();
    }

    public static String q() {
        LineNumberReader lineNumberReader;
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb2.append(ChipTextInputComboView.b.f32535b + ":");
        for (String str : linkedHashMap.keySet()) {
            char c11 = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c11 = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb2.append('0');
                        if (lineNumberReader == null) {
                        }
                        lineNumberReader.close();
                    }
                }
                sb2.append(c11);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb2.toString();
    }

    public static String r() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ChipTextInputComboView.b.f32535b + ":");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            char c11 = '0';
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                if (lowerCase != null && lowerCase.contains(str3)) {
                    c11 = '1';
                }
            } catch (Throwable unused) {
            }
            sb2.append(c11);
        }
        return sb2.toString();
    }

    public static String s() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ChipTextInputComboView.b.f32535b + ":");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put(SystemUtils.PRODUCT_BRAND, "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String b11 = com.alipay.sdk.m.z.a.b(str, "");
            sb2.append((b11 == null || !b11.contains(str2)) ? '0' : '1');
        }
        return sb2.toString();
    }

    public static String t() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                    try {
                        fileReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (com.alipay.sdk.m.z.a.a(readLine)) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (Throwable unused7) {
        }
        try {
            fileReader.close();
        } catch (Throwable unused8) {
        }
        return trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        r1 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0048, code lost:
    
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L42
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L42
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L40
        L11:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L3a
            boolean r4 = com.alipay.sdk.m.z.a.a(r2)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L11
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L11
            int r4 = r2.length     // Catch: java.lang.Throwable -> L3e
            r5 = 1
            if (r4 <= r5) goto L11
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L11
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L3e
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L4a
            goto L4a
        L3e:
            r2 = r3
            goto L43
        L40:
            r0 = r2
            goto L3e
        L42:
            r0 = r2
        L43:
            if (r2 == 0) goto L48
            r2.close()     // Catch: java.lang.Throwable -> L48
        L48:
            if (r0 == 0) goto L4d
        L4a:
            r0.close()     // Catch: java.lang.Throwable -> L4d
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.u():java.lang.String");
    }

    private String v() {
        String a11 = d.a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
        if (a11 != null) {
            return a11;
        }
        if (this.f10469a.isBackgroundRunning()) {
            return "";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements() && a11 == null) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            a11 = nextElement.getHostAddress().toString();
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String str = a11 != null ? a11 : "";
        d.a(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, str);
        return str;
    }

    public static String f(Context context) {
        int i11 = 0;
        try {
            i11 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i11 == 1 ? "1" : "0";
    }

    public static String g(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i11 = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i11));
            jSONObject.put(NotificationCompat.CATEGORY_CALL, String.valueOf(streamVolume));
            jSONObject.put(h.f81945i, String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put(NotificationCompat.CATEGORY_ALARM, String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String h(android.content.Context r3) {
        /*
            if (r3 == 0) goto L4d
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L4d
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            r0 = -1
            java.util.List r3 = r3.getSensorList(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L4d
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4d
        L22:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L44
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L4d
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.getVersion()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.getVendor()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L44:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = com.alipay.sdk.m.z.a.e(r3)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.h(android.content.Context):java.lang.String");
    }

    public static String i(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String k(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.widthPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String l(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.heightPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String m(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x000e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String n(android.content.Context r3) {
        /*
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            java.lang.String r0 = ""
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Le
            r2 = 29
            if (r1 < r2) goto L10
        Le:
            r3 = r0
            goto L1f
        L10:
            r2 = 26
            if (r1 < r2) goto L1d
            r1 = 28
            if (r3 < r1) goto L1d
            java.lang.String r3 = m1.a.a()     // Catch: java.lang.Throwable -> Le
            goto L1f
        L1d:
            java.lang.String r3 = android.os.Build.SERIAL     // Catch: java.lang.Throwable -> Le
        L1f:
            if (r3 != 0) goto L22
            goto L23
        L22:
            r0 = r3
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.n(android.content.Context):java.lang.String");
    }

    public static String o(Context context) {
        long j11;
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long j12 = 0;
            for (int i11 = 0; i11 < 5; i11++) {
                try {
                    j11 = new File(strArr[i11]).lastModified();
                } catch (Throwable unused) {
                    j11 = -1;
                }
                j12 = Math.max(j11, j12);
            }
            return "1:" + j12;
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String p(android.content.Context r3) {
        /*
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            android.content.Intent r3 = r3.registerReceiver(r1, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r3.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "status"
            int r3 = r3.getIntExtra(r2, r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 2
            if (r3 == r1) goto L22
            r1 = 5
            if (r3 != r1) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L2d
            java.lang.String r3 = "1"
            goto L2f
        L2d:
            java.lang.String r3 = "0"
        L2f:
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            return r3
        L3f:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.p(android.content.Context):java.lang.String");
    }

    public static String q(Context context) {
        NetworkInfo activeNetworkInfo;
        if (a(context, yk.e.f100168b)) {
            return "";
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
        }
        if (activeNetworkInfo == null) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            return (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) ? "2G" : (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) ? "3G" : subtype == 13 ? "4G" : "UNKNOW";
        }
        return null;
    }

    public final String a() {
        try {
            return String.valueOf(new File(nk.b.f75177c).listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public final synchronized String b(Context context) {
        try {
            String a11 = d.a("NetworkOperatorName");
            if (a11 != null) {
                return a11;
            }
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        a11 = telephonyManager.getNetworkOperatorName();
                    }
                } catch (Throwable unused) {
                }
            }
            if (a11 != null) {
                if ("null".equals(a11)) {
                }
                d.a("NetworkOperatorName", a11);
                return a11;
            }
            a11 = "";
            d.a("NetworkOperatorName", a11);
            return a11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r0.length() == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String c(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "SimSerial"
            java.lang.String r0 = com.alipay.sdk.m.a0.d.a(r0)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r2)
            return r0
        Lb:
            com.alipay.sdk.m.a0.f r1 = r2.f10469a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isBackgroundRunning()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L17:
            r3 = move-exception
            goto L42
        L19:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = a(r3, r1)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L25
            java.lang.String r3 = ""
            monitor-exit(r2)
            return r3
        L25:
            java.lang.String r1 = "phone"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch: java.lang.Throwable -> L3b
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r3.getSimSerialNumber()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L39
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L3b
        L39:
            java.lang.String r0 = ""
        L3b:
            java.lang.String r3 = "SimSerial"
            com.alipay.sdk.m.a0.d.a(r3, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return r0
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.a0.b.c(android.content.Context):java.lang.String");
    }

    public final synchronized String d(Context context) {
        String androidId = this.f10469a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String a11 = d.a("ANDROIDID");
        if (a11 != null) {
            return a11;
        }
        if (this.f10469a.isBackgroundRunning()) {
            return "";
        }
        try {
            a11 = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
        }
        if (a11 == null) {
            a11 = "";
        }
        d.a("ANDROIDID", a11);
        return a11;
    }

    public final String e(Context context) {
        try {
            String q11 = q(context);
            String v11 = v();
            if (!com.alipay.sdk.m.z.a.b(q11) || !com.alipay.sdk.m.z.a.b(v11)) {
                return "";
            }
            return q11 + ":" + v();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final synchronized String a(Context context) {
        String subscriberId = this.f10469a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String a11 = d.a("imsi");
        if (a11 != null) {
            return a11;
        }
        if (this.f10469a.isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a11 = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
        }
        if (a11 == null) {
            a11 = "";
        }
        d.a("imsi", a11);
        return a11;
    }

    public static boolean a(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) != 0;
    }
}
