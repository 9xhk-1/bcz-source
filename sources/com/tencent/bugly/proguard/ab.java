package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f42210a = new ArrayList<a>() { // from class: com.tencent.bugly.proguard.ab.1
        {
            byte b11 = 0;
            add(new l(b11));
            add(new f(b11));
            add(new g(b11));
            add(new m(b11));
            add(new h(b11));
            add(new i(b11));
            add(new k(b11));
            add(new e(b11));
            add(new j(b11));
            add(new b(b11));
            add(new d(b11));
            add(new c(b11));
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Map<Integer, String> f42211b = new HashMap<Integer, String>() { // from class: com.tencent.bugly.proguard.ab.2
        {
            put(1, "GPRS");
            put(2, "EDGE");
            put(3, "UMTS");
            put(8, "HSDPA");
            put(9, "HSUPA");
            put(10, "HSPA");
            put(4, "CDMA");
            put(5, "EVDO_0");
            put(6, "EVDO_A");
            put(7, "1xRTT");
            put(11, "iDen");
            put(12, "EVDO_B");
            put(13, "LTE");
            put(14, "eHRPD");
            put(15, "HSPA+");
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f42212c = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {
        private a() {
        }

        public abstract String a();

        public /* synthetic */ a(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.gn.gnromvernumber");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "amigo/" + a11 + "/" + ap.a("ro.build.display.id");
        }

        public /* synthetic */ b(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends a {
        private c() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            return ap.a("ro.build.fingerprint") + "/" + ap.a("ro.build.rom.id");
        }

        public /* synthetic */ c(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends a {
        private d() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.build.tyd.kbstyle_version");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "dido/".concat(a11);
        }

        public /* synthetic */ d(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends a {
        private e() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.aa.romver");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "htc/" + a11 + "/" + ap.a("ro.build.description");
        }

        public /* synthetic */ e(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends a {
        private f() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a(com.alipay.sdk.m.c.a.f10484a);
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "HuaWei/EMOTION/".concat(a11);
        }

        public /* synthetic */ f(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g extends a {
        private g() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.lenovo.series");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "Lenovo/VIBE/".concat(String.valueOf(ap.a("ro.build.version.incremental")));
        }

        public /* synthetic */ g(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h extends a {
        private h() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.meizu.product.model");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "Meizu/FLYME/" + ap.a("ro.build.display.id");
        }

        public /* synthetic */ h(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends a {
        private i() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.build.version.opporom");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "Oppo/COLOROS/".concat(a11);
        }

        public /* synthetic */ i(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j extends a {
        private j() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.lewa.version");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "tcl/" + a11 + "/" + ap.a("ro.build.display.id");
        }

        public /* synthetic */ j(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k extends a {
        private k() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.vivo.os.build.display.id");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "vivo/FUNTOUCH/".concat(a11);
        }

        public /* synthetic */ k(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends a {
        private l() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.miui.ui.version.name");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "XiaoMi/MIUI/".concat(a11);
        }

        public /* synthetic */ l(byte b11) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m extends a {
        private m() {
            super((byte) 0);
        }

        @Override // com.tencent.bugly.proguard.ab.a
        public final String a() {
            String a11 = ap.a("ro.build.nubia.rom.name");
            if (ap.b(a11) || a11.equals("fail")) {
                return null;
            }
            return "Zte/NUBIA/" + a11 + "_" + ap.a("ro.build.nubia.rom.code");
        }

        public /* synthetic */ m(byte b11) {
            this();
        }
    }

    public static String a() {
        try {
            return Build.MODEL;
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static String b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static int c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return -1;
            }
            th2.printStackTrace();
            return -1;
        }
    }

    public static String d() {
        try {
            return String.valueOf(System.getProperty("os.arch"));
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return -1L;
            }
            th2.printStackTrace();
            return -1L;
        }
    }

    public static long f() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return -1L;
            }
            th2.printStackTrace();
            return -1L;
        }
    }

    public static long g() {
        BufferedReader bufferedReader;
        Throwable th2;
        long j11 = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (readLine.startsWith("VmSize")) {
                        j11 = Long.parseLong(readLine.replaceAll("[^\\d]", ""));
                        break;
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    al.a(th2);
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            bufferedReader = null;
            th2 = th5;
        }
        return j11 * 1024;
    }

    public static long h() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    public static long i() {
        FileReader fileReader;
        Throwable th2;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        long parseLong = Long.parseLong(readLine.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            if (!al.a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e12) {
                            if (!al.a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                        return parseLong;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e13) {
                        if (!al.a(e13)) {
                            e13.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e14) {
                        if (al.a(e14)) {
                            return -1L;
                        }
                        e14.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        if (!al.a(th2)) {
                            th2.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e15) {
                                if (!al.a(e15)) {
                                    e15.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e16) {
                            if (al.a(e16)) {
                                return -2L;
                            }
                            e16.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th4) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e17) {
                                if (!al.a(e17)) {
                                    e17.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e18) {
                                if (!al.a(e18)) {
                                    e18.printStackTrace();
                                }
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader = null;
            }
        } catch (Throwable th6) {
            fileReader = null;
            th2 = th6;
            bufferedReader = null;
        }
    }

    public static long j() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 2048);
                try {
                    bufferedReader2.readLine();
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e11) {
                            if (!al.a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e12) {
                            if (!al.a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long parseLong = Long.parseLong(readLine.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e13) {
                            if (!al.a(e13)) {
                                e13.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e14) {
                            if (!al.a(e14)) {
                                e14.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long parseLong2 = parseLong + (Long.parseLong(readLine2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024);
                    String readLine3 = bufferedReader2.readLine();
                    if (readLine3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e15) {
                            if (!al.a(e15)) {
                                e15.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e16) {
                            if (!al.a(e16)) {
                                e16.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long parseLong3 = parseLong2 + (Long.parseLong(readLine3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024);
                    try {
                        bufferedReader2.close();
                    } catch (IOException e17) {
                        if (!al.a(e17)) {
                            e17.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e18) {
                        if (!al.a(e18)) {
                            e18.printStackTrace();
                        }
                    }
                    return parseLong3;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e19) {
                                if (!al.a(e19)) {
                                    e19.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e21) {
                            if (al.a(e21)) {
                                return -2L;
                            }
                            e21.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th3) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e22) {
                                if (!al.a(e22)) {
                                    e22.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e23) {
                                if (!al.a(e23)) {
                                    e23.printStackTrace();
                                }
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            fileReader = null;
        }
    }

    public static long k() {
        if (!s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return -2L;
            }
            th2.printStackTrace();
            return -2L;
        }
    }

    public static long l() {
        if (!s()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return -2L;
            }
            th2.printStackTrace();
            return -2L;
        }
    }

    public static String m() {
        return "";
    }

    public static String n() {
        Iterator<a> it = f42210a.iterator();
        while (it.hasNext()) {
            String a11 = it.next().a();
            if (!TextUtils.isEmpty(a11)) {
                return a11;
            }
        }
        return null;
    }

    public static boolean o() {
        return !TextUtils.isEmpty(new i((byte) 0).a());
    }

    public static boolean p() {
        return !TextUtils.isEmpty(new k((byte) 0).a());
    }

    public static boolean q() {
        boolean z11;
        String[] strArr = f42212c;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z11 = false;
                break;
            }
            if (new File(strArr[i11]).exists()) {
                z11 = true;
                break;
            }
            i11++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z11;
    }

    public static boolean r() {
        float maxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f11 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f12 = maxMemory - f11;
        al.c("maxMemory : %f", Float.valueOf(maxMemory));
        al.c("totalMemory : %f", Float.valueOf(f11));
        al.c("freeMemory : %f", Float.valueOf(f12));
        return f12 < 10.0f;
    }

    private static boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    public static String c(Context context) {
        TelephonyManager telephonyManager;
        String str = "unknown";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0 || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return "unknown";
            }
            int networkType = telephonyManager.getNetworkType();
            String str2 = f42211b.get(Integer.valueOf(networkType));
            if (str2 != null) {
                return str2;
            }
            try {
                return "MOBILE(" + networkType + pn.j.f81007d;
            } catch (Exception e11) {
                e = e11;
                str = str2;
                if (!al.a(e)) {
                    e.printStackTrace();
                }
                return str;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    public static String a(Context context) {
        if (context != null && context.getApplicationInfo() != null) {
            String str = context.getApplicationInfo().nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                if (str.endsWith("arm")) {
                    return "armeabi-v7a";
                }
                if (str.endsWith(g80.h.f53501g)) {
                    return "arm64-v8a";
                }
                if (str.endsWith(g80.h.f53495a)) {
                    return g80.h.f53495a;
                }
                if (str.endsWith(g80.h.f53496b)) {
                    return g80.h.f53496b;
                }
                return "fail";
            }
            return "fail";
        }
        return "fail";
    }

    public static long b(Context context) {
        long pss;
        ActivityManager activityManager;
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Throwable unused) {
            pss = Debug.getPss();
        }
        if (activityManager == null) {
            return 0L;
        }
        pss = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        return pss * 1024;
    }
}
