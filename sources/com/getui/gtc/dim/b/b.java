package com.getui.gtc.dim.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import ba0.j1;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.CommonUtil;
import com.getui.gtc.dim.b.d;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    private static final b f29860i = new b();

    /* renamed from: j, reason: collision with root package name */
    private long f29869j = 0;

    /* renamed from: a, reason: collision with root package name */
    long f29861a = 10;

    /* renamed from: b, reason: collision with root package name */
    long f29862b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f29863c = 3600;

    /* renamed from: d, reason: collision with root package name */
    long f29864d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f29865e = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f29871l = -1;

    /* renamed from: f, reason: collision with root package name */
    boolean f29866f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f29867g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f29868h = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f29872m = true;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, a> f29870k = new HashMap(4);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f29873a;

        /* renamed from: b, reason: collision with root package name */
        public long f29874b;

        /* renamed from: c, reason: collision with root package name */
        public String f29875c;

        /* renamed from: d, reason: collision with root package name */
        public String f29876d;

        /* renamed from: e, reason: collision with root package name */
        public int f29877e;

        /* renamed from: f, reason: collision with root package name */
        public int f29878f;

        /* renamed from: g, reason: collision with root package name */
        public int f29879g;

        /* renamed from: h, reason: collision with root package name */
        public int f29880h;

        public final String toString() {
            return "Config{key='" + this.f29873a + "', sdkTotalRuntimeCondition=" + this.f29874b + ", timeRangeStart='" + this.f29875c + "', timeRangeEnd='" + this.f29876d + "', timeRangeState=" + this.f29877e + ", weekState=" + this.f29878f + ", sdkAccessCountCondition=" + this.f29879g + ", installDurationDayCondition=" + this.f29880h + l50.b.f69928j;
        }
    }

    /* renamed from: com.getui.gtc.dim.b.b$b, reason: collision with other inner class name */
    public static class C0351b {
        public static Calendar a(long j11, String str) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            int parseInt3 = Integer.parseInt(split[2]);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            calendar.set(11, parseInt);
            calendar.set(12, parseInt2);
            calendar.set(13, parseInt3);
            calendar.set(14, 0);
            return calendar;
        }

        public static boolean a(long j11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            int i11 = calendar.get(7);
            return i11 == 1 || i11 == 7;
        }
    }

    private b() {
    }

    public static b a() {
        return f29860i;
    }

    private long b() {
        long j11;
        synchronized (this) {
            try {
                if (this.f29871l < 0) {
                    this.f29871l = b("dim-key-sdk-sync-install-time");
                }
                j11 = this.f29871l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    private static boolean c() {
        if (e(f("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5pbnN0YWxsZXI=")) || e(f("Y29tLnNhdXJpay5zdWJzdHJhdGU="))) {
            return true;
        }
        try {
            ClassLoader.getSystemClassLoader().loadClass(f("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRIZWxwZXJz"));
            return true;
        } catch (Exception e11) {
            String f11 = f("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRCcmlkZ2U=");
            String f12 = f("bWFpbg==");
            String f13 = f("aGFuZGxlSG9va2VkTWV0aG9k");
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(f11) && (stackTraceElement.getMethodName().equals(f12) || stackTraceElement.getMethodName().equals(f13))) {
                    return true;
                }
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            e11.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            if (stringWriter.toString().contains(f("eHBvc2Vk"))) {
                return true;
            }
            try {
                HashSet<String> hashSet = new HashSet();
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!readLine.endsWith(".so") && !readLine.endsWith(j1.f6559f)) {
                        }
                        hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                    } finally {
                        try {
                            return false;
                        } finally {
                        }
                    }
                }
                String f14 = f("Y29tLnNhdXJpay5zdWJzdHJhdGU=");
                String f15 = f("WHBvc2VkQnJpZGdlLmphcg==");
                for (String str : hashSet) {
                    if (str.contains(f14)) {
                        return true;
                    }
                    if (str.contains(f15)) {
                        return true;
                    }
                }
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.b(th2);
                return false;
            }
            return false;
        }
    }

    public static List<a> d(String str) {
        String[] strArr;
        int i11;
        String str2;
        long parseLong;
        String str3;
        ArrayList arrayList = new ArrayList();
        try {
            String[] split = str.split(",");
            int length = split.length;
            char c11 = 0;
            int i12 = 0;
            while (i12 < length) {
                String str4 = split[i12];
                if (!TextUtils.isEmpty(str4)) {
                    String[] split2 = str4.split("\\|");
                    if (split2.length == 6) {
                        try {
                            str2 = split2[c11];
                            parseLong = Long.parseLong(split2[1]);
                            str3 = split2[2];
                        } catch (Throwable th2) {
                            th = th2;
                            strArr = split;
                            i11 = length;
                        }
                        if (Pattern.compile("^\\d{2}:\\d{2}:\\d{2}-\\d{2}:\\d{2}:\\d{2}#[0-3]$").matcher(str3).matches()) {
                            String[] split3 = str3.split("#");
                            String[] split4 = split3[c11].split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                            String str5 = split4[c11];
                            String str6 = split4[1];
                            int parseInt = Integer.parseInt(split3[1]);
                            int parseInt2 = Integer.parseInt(split2[3]);
                            int parseInt3 = Integer.parseInt(split2[4]);
                            int parseInt4 = Integer.parseInt(split2[5]);
                            long j11 = parseInt3;
                            b bVar = f29860i;
                            strArr = split;
                            i11 = length;
                            try {
                                if (j11 > bVar.f29861a) {
                                    bVar.f29861a = j11;
                                }
                                if (parseLong > bVar.f29863c) {
                                    bVar.f29863c = parseLong;
                                }
                                a aVar = new a();
                                aVar.f29873a = str2;
                                aVar.f29874b = parseLong;
                                aVar.f29875c = str5;
                                aVar.f29876d = str6;
                                aVar.f29877e = parseInt;
                                aVar.f29878f = parseInt2;
                                aVar.f29879g = parseInt3;
                                aVar.f29880h = parseInt4;
                                arrayList.add(aVar);
                            } catch (Throwable th3) {
                                th = th3;
                                com.getui.gtc.dim.e.b.b(th);
                                i12++;
                                split = strArr;
                                length = i11;
                                c11 = 0;
                            }
                            i12++;
                            split = strArr;
                            length = i11;
                            c11 = 0;
                        }
                    }
                }
                strArr = split;
                i11 = length;
                i12++;
                split = strArr;
                length = i11;
                c11 = 0;
            }
        } catch (Throwable th4) {
            com.getui.gtc.dim.e.b.b(th4);
        }
        return arrayList;
    }

    private static boolean e(String str) {
        try {
            com.getui.gtc.dim.e.d.a(str, 0);
            com.getui.gtc.dim.e.b.a("specific " + str + " p info hit success");
            return true;
        } catch (Throwable unused) {
            com.getui.gtc.dim.e.b.a("specific " + str + " p info hit failed");
            return false;
        }
    }

    private static String f(String str) {
        return new String(Base64.decode(str, 0));
    }

    public static long b(String str) {
        try {
            d unused = d.a.f29885a;
            h a11 = d.a(str);
            Object obj = a11 != null ? a11.f29919a : null;
            r0 = obj instanceof String ? Long.parseLong((String) obj) : -1L;
            com.getui.gtc.dim.e.b.a("dim sys get " + str + " from db: " + r0);
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
        }
        if (r0 < 0) {
            return 0L;
        }
        return r0;
    }

    public final void a(long j11) {
        if (this.f29872m) {
            this.f29869j = j11;
            synchronized (this) {
                try {
                    if (b() == 0) {
                        this.f29871l = System.currentTimeMillis() + j11;
                        d unused = d.a.f29885a;
                        d.a("dim-key-sdk-sync-install-time", (Object) String.valueOf(this.f29871l));
                        com.getui.gtc.dim.e.b.a("dim sys server install time set: " + this.f29871l);
                    }
                } catch (Throwable th2) {
                    com.getui.gtc.dim.e.b.b(th2);
                } finally {
                }
            }
        }
        com.getui.gtc.dim.e.b.a("dim sys syncTime set: " + j11 + ", syncTime: " + this.f29872m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r5 <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r5 > 3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r5 != 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (com.getui.gtc.dim.b.b.C0351b.a(r3) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r2.f29878f != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (com.getui.gtc.dim.b.b.C0351b.a(r3) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        r5 = r2.f29879g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r5 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        if (r13.f29862b >= r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        com.getui.gtc.dim.e.b.a("check filed condition : " + r14 + " , 4 not passed, " + r13.f29862b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        r9 = b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        if (r9 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        r9 = com.getui.gtc.dim.e.d.a(com.getui.gtc.base.GtcProvider.context().getPackageName(), 0).firstInstallTime;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r2.f29880h <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        if ((r3 - r9) >= (r2 * 86400000)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        com.getui.gtc.dim.e.b.a("check filed condition : " + r14 + " , 5 not passed, " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        com.getui.gtc.dim.e.b.a("check filed condition : " + r14 + " , passed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012c, code lost:
    
        com.getui.gtc.dim.e.b.a("check filed condition : " + r14 + " , 3 not passed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0140, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.b.b.c(java.lang.String):boolean");
    }

    public final void a(String str) {
        try {
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                String str3 = split[0];
                boolean z11 = true;
                if (Integer.parseInt(split[1]) != 1) {
                    z11 = false;
                }
                if ("dim".equals(str3)) {
                    this.f29866f = z11;
                } else if ("xp".equals(str3)) {
                    this.f29867g = z11;
                } else if ("du".equals(str3)) {
                    this.f29868h = z11;
                } else if ("st".equals(str3)) {
                    this.f29872m = z11;
                }
            }
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
        }
        com.getui.gtc.dim.e.b.a("dim sys globalHC policy set: ".concat(String.valueOf(str)));
    }

    public final void a(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29870k.put(str, aVar);
        com.getui.gtc.dim.e.b.a("dim sys globalHC set: " + str + " : " + aVar);
    }

    private static boolean a(Context context) {
        try {
            if (!CommonUtil.isAppForeground()) {
                Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                return registerReceiver == null || registerReceiver.getExtras() == null || registerReceiver.getExtras().getInt("plugged") == 2;
            }
            boolean z11 = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
            Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver2 != null && registerReceiver2.getExtras() != null) {
                return z11 && registerReceiver2.getExtras().getInt("plugged") == 2;
            }
            return true;
        } catch (Throwable th2) {
            com.getui.gtc.dim.e.b.b(th2);
        }
        return true;
    }

    public static boolean a(boolean z11, boolean z12) {
        if (z11) {
            try {
                if (CommonUtil.isAppDebugEnable()) {
                    com.getui.gtc.dim.e.b.b("check safe f: debuggable");
                    return false;
                }
            } catch (Throwable th2) {
                com.getui.gtc.dim.e.b.b(th2);
                return false;
            }
        }
        if (z11 && a(GtcProvider.context())) {
            com.getui.gtc.dim.e.b.b("check safe f: u-model");
            return false;
        }
        if (!z12 || !c()) {
            String str = Build.FINGERPRINT;
            if (!str.contains("generic") && !str.contains("unknown") && !str.contains("generic_x86") && !str.contains("vbox")) {
                String str2 = Build.MODEL;
                if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                    String str3 = Build.HARDWARE;
                    if (!"goldfish".equals(str3) && !"ranchu".equals(str3)) {
                        com.getui.gtc.dim.e.b.a("check safe s");
                        return true;
                    }
                }
            }
            com.getui.gtc.dim.e.b.b("check safe f: emulator");
            return false;
        }
        com.getui.gtc.dim.e.b.b("check safe f: xp");
        return false;
    }
}
