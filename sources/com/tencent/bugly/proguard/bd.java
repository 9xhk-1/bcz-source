package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bd implements NativeExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42451a;

    /* renamed from: b, reason: collision with root package name */
    private final as f42452b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f42453c;

    /* renamed from: d, reason: collision with root package name */
    private final ac f42454d;

    public bd(Context context, aa aaVar, as asVar, ac acVar) {
        this.f42451a = context;
        this.f42452b = asVar;
        this.f42453c = aaVar;
        this.f42454d = acVar;
    }

    private static Map<String, String> a(String[] strArr) {
        HashMap hashMap = new HashMap(strArr == null ? 1 : strArr.length);
        if (strArr == null) {
            al.c("not found extraMsg", new Object[0]);
            return hashMap;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str = strArr[i11];
            if (str != null) {
                al.a("Extra message[%d]: %s", Integer.valueOf(i11), str);
                String[] split = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                } else {
                    al.d("bad extraMsg %s", str);
                }
            }
        }
        return hashMap;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final boolean getAndUpdateAnrState() {
        if (ay.a() == null) {
            return false;
        }
        ay a11 = ay.a();
        if (a11.f42413a.get()) {
            al.c("anr is processing, return", new Object[0]);
            return false;
        }
        ActivityManager activityManager = a11.f42414b;
        if (z.a(activityManager) || az.a(activityManager, 0L) == null) {
            al.c("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (a11.a(System.currentTimeMillis())) {
            return false;
        }
        return a11.a(true);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final void handleNativeException(int i11, int i12, long j11, long j12, String str, String str2, String str3, String str4, int i13, String str5, int i14, int i15, int i16, String str6, String str7) {
        al.a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i11, i12, j11, j12, str, str2, str3, str4, i13, str5, i14, i15, i16, str6, str7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:60:0x0016, B:4:0x0038, B:6:0x004b, B:8:0x0053, B:9:0x005f, B:11:0x006b, B:14:0x0072, B:15:0x007e, B:17:0x0099, B:18:0x00cc, B:20:0x00ed, B:21:0x00f4, B:24:0x0100, B:26:0x0108, B:34:0x014c, B:35:0x0150, B:37:0x015a, B:38:0x016f, B:40:0x018a, B:42:0x0192, B:44:0x01c5, B:46:0x01cd, B:48:0x01d8, B:50:0x01e0, B:52:0x01e5, B:53:0x01ea, B:56:0x00b7, B:57:0x007c), top: B:59:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ed A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:60:0x0016, B:4:0x0038, B:6:0x004b, B:8:0x0053, B:9:0x005f, B:11:0x006b, B:14:0x0072, B:15:0x007e, B:17:0x0099, B:18:0x00cc, B:20:0x00ed, B:21:0x00f4, B:24:0x0100, B:26:0x0108, B:34:0x014c, B:35:0x0150, B:37:0x015a, B:38:0x016f, B:40:0x018a, B:42:0x0192, B:44:0x01c5, B:46:0x01cd, B:48:0x01d8, B:50:0x01e0, B:52:0x01e5, B:53:0x01ea, B:56:0x00b7, B:57:0x007c), top: B:59:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:60:0x0016, B:4:0x0038, B:6:0x004b, B:8:0x0053, B:9:0x005f, B:11:0x006b, B:14:0x0072, B:15:0x007e, B:17:0x0099, B:18:0x00cc, B:20:0x00ed, B:21:0x00f4, B:24:0x0100, B:26:0x0108, B:34:0x014c, B:35:0x0150, B:37:0x015a, B:38:0x016f, B:40:0x018a, B:42:0x0192, B:44:0x01c5, B:46:0x01cd, B:48:0x01d8, B:50:0x01e0, B:52:0x01e5, B:53:0x01ea, B:56:0x00b7, B:57:0x007c), top: B:59:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:60:0x0016, B:4:0x0038, B:6:0x004b, B:8:0x0053, B:9:0x005f, B:11:0x006b, B:14:0x0072, B:15:0x007e, B:17:0x0099, B:18:0x00cc, B:20:0x00ed, B:21:0x00f4, B:24:0x0100, B:26:0x0108, B:34:0x014c, B:35:0x0150, B:37:0x015a, B:38:0x016f, B:40:0x018a, B:42:0x0192, B:44:0x01c5, B:46:0x01cd, B:48:0x01d8, B:50:0x01e0, B:52:0x01e5, B:53:0x01ea, B:56:0x00b7, B:57:0x007c), top: B:59:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b7 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:60:0x0016, B:4:0x0038, B:6:0x004b, B:8:0x0053, B:9:0x005f, B:11:0x006b, B:14:0x0072, B:15:0x007e, B:17:0x0099, B:18:0x00cc, B:20:0x00ed, B:21:0x00f4, B:24:0x0100, B:26:0x0108, B:34:0x014c, B:35:0x0150, B:37:0x015a, B:38:0x016f, B:40:0x018a, B:42:0x0192, B:44:0x01c5, B:46:0x01cd, B:48:0x01d8, B:50:0x01e0, B:52:0x01e5, B:53:0x01ea, B:56:0x00b7, B:57:0x007c), top: B:59:0x0016 }] */
    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleNativeException2(int r21, int r22, long r23, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, int r33, int r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String[] r38) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.bd.handleNativeException2(int, int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public final CrashDetailBean packageCrashDatas(String str, String str2, long j11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z11, boolean z12) {
        int i11;
        String str12;
        int indexOf;
        boolean i12 = at.a().i();
        if (i12) {
            al.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f42104b = 1;
        crashDetailBean.f42107e = this.f42453c.g();
        aa aaVar = this.f42453c;
        crashDetailBean.f42108f = aaVar.f42198o;
        crashDetailBean.f42109g = aaVar.q();
        crashDetailBean.f42115m = this.f42453c.f();
        crashDetailBean.f42116n = str3;
        crashDetailBean.f42117o = i12 ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f42118p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f42119q = str13;
        crashDetailBean.f42120r = j11;
        crashDetailBean.f42123u = ap.c(str13.getBytes());
        crashDetailBean.A = str;
        crashDetailBean.B = str2;
        crashDetailBean.L = this.f42453c.s();
        crashDetailBean.f42110h = this.f42453c.p();
        crashDetailBean.f42111i = this.f42453c.A();
        crashDetailBean.f42124v = str8;
        String dumpFilePath = NativeCrashHandler.getInstance() != null ? NativeCrashHandler.getDumpFilePath() : null;
        String a11 = be.a(dumpFilePath, str8);
        if (!ap.b(a11)) {
            crashDetailBean.Z = a11;
        }
        crashDetailBean.f42103aa = be.b(dumpFilePath);
        crashDetailBean.f42125w = be.a(str9, at.f42350f, at.f42355k, at.f42360p);
        crashDetailBean.f42126x = be.a(str10, at.f42350f, null, true);
        crashDetailBean.N = str7;
        crashDetailBean.O = str6;
        crashDetailBean.P = str11;
        crashDetailBean.F = this.f42453c.k();
        crashDetailBean.G = this.f42453c.j();
        crashDetailBean.H = this.f42453c.l();
        crashDetailBean.I = ab.b(this.f42451a);
        crashDetailBean.J = ab.g();
        crashDetailBean.K = ab.h();
        if (!z11) {
            crashDetailBean.C = -1L;
            crashDetailBean.D = -1L;
            crashDetailBean.E = -1L;
            if (crashDetailBean.f42125w == null) {
                crashDetailBean.f42125w = "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.Q = -1L;
            crashDetailBean.U = -1;
            crashDetailBean.V = -1;
            crashDetailBean.W = map;
            crashDetailBean.X = this.f42453c.y();
            crashDetailBean.f42128z = null;
            if (str == null) {
                crashDetailBean.A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f42127y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.C = ab.j();
        crashDetailBean.D = ab.f();
        crashDetailBean.E = ab.l();
        crashDetailBean.f42127y = ao.a();
        aa aaVar2 = this.f42453c;
        crashDetailBean.Q = aaVar2.f42160a;
        crashDetailBean.R = aaVar2.a();
        crashDetailBean.f42128z = ap.a(this.f42453c.Q, at.f42352h);
        int indexOf2 = crashDetailBean.f42119q.indexOf("java:\n");
        if (indexOf2 > 0 && (i11 = indexOf2 + 6) < crashDetailBean.f42119q.length()) {
            String str14 = crashDetailBean.f42119q;
            String substring = str14.substring(i11, str14.length() - 1);
            if (substring.length() > 0 && crashDetailBean.f42128z.containsKey(crashDetailBean.B) && (indexOf = (str12 = crashDetailBean.f42128z.get(crashDetailBean.B)).indexOf(substring)) > 0) {
                String substring2 = str12.substring(indexOf);
                crashDetailBean.f42128z.put(crashDetailBean.B, substring2);
                crashDetailBean.f42119q = crashDetailBean.f42119q.substring(0, i11);
                crashDetailBean.f42119q += substring2;
            }
        }
        if (str == null) {
            crashDetailBean.A = this.f42453c.f42187d;
        }
        crashDetailBean.U = this.f42453c.z();
        aa aaVar3 = this.f42453c;
        crashDetailBean.V = aaVar3.f42207x;
        crashDetailBean.W = aaVar3.t();
        crashDetailBean.X = this.f42453c.y();
        return crashDetailBean;
    }
}
