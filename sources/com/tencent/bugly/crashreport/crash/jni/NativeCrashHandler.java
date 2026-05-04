package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.aa;
import com.tencent.bugly.proguard.ab;
import com.tencent.bugly.proguard.ac;
import com.tencent.bugly.proguard.ak;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.ap;
import com.tencent.bugly.proguard.as;
import com.tencent.bugly.proguard.at;
import com.tencent.bugly.proguard.bd;
import com.tencent.bugly.proguard.be;
import com.tencent.bugly.proguard.q;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NativeCrashHandler implements q {

    /* renamed from: a, reason: collision with root package name */
    static String f42143a = null;

    /* renamed from: b, reason: collision with root package name */
    private static NativeCrashHandler f42144b = null;

    /* renamed from: c, reason: collision with root package name */
    private static int f42145c = 1;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f42146n = true;

    /* renamed from: d, reason: collision with root package name */
    private final Context f42147d;

    /* renamed from: e, reason: collision with root package name */
    private final aa f42148e;

    /* renamed from: f, reason: collision with root package name */
    private final ak f42149f;

    /* renamed from: g, reason: collision with root package name */
    private NativeExceptionHandler f42150g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f42151h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42152i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42153j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f42154k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f42155l = false;

    /* renamed from: m, reason: collision with root package name */
    private as f42156m;

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, aa aaVar, as asVar, ak akVar, boolean z11, String str) {
        this.f42147d = ap.a(context);
        if (ap.b(f42143a)) {
            try {
                if (ap.b(str)) {
                    str = context.getDir("bugly", 0).getAbsolutePath();
                }
            } catch (Throwable unused) {
                str = "/data/data/" + aa.a(context).f42186c + "/app_bugly";
            }
            f42143a = str;
        }
        this.f42156m = asVar;
        this.f42148e = aaVar;
        this.f42149f = akVar;
        this.f42151h = z11;
        this.f42150g = new bd(context, aaVar, asVar, ac.a());
    }

    public static synchronized String getDumpFilePath() {
        String str;
        synchronized (NativeCrashHandler.class) {
            str = f42143a;
        }
        return str;
    }

    public static synchronized NativeCrashHandler getInstance(Context context, aa aaVar, as asVar, ac acVar, ak akVar, boolean z11, String str) {
        NativeCrashHandler nativeCrashHandler;
        synchronized (NativeCrashHandler.class) {
            try {
                if (f42144b == null) {
                    f42144b = new NativeCrashHandler(context, aaVar, asVar, akVar, z11, str);
                }
                nativeCrashHandler = f42144b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nativeCrashHandler;
    }

    private native String getProperties(String str);

    private native String getSoCpuAbi();

    public static boolean isShouldHandleInJava() {
        return f42146n;
    }

    public static synchronized void setDumpFilePath(String str) {
        synchronized (NativeCrashHandler.class) {
            f42143a = str;
        }
    }

    public static void setShouldHandleInJava(boolean z11) {
        f42146n = z11;
        NativeCrashHandler nativeCrashHandler = f42144b;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.a(999, String.valueOf(z11));
        }
    }

    @Override // com.tencent.bugly.proguard.q
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f42152i || this.f42153j) && str != null && str2 != null && str3 != null) {
            try {
                if (this.f42153j) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f42149f.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                int i11;
                if (!ap.a(NativeCrashHandler.this.f42147d, "native_record_lock")) {
                    al.a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    return;
                }
                if (!NativeCrashHandler.f42146n) {
                    NativeCrashHandler.a(NativeCrashHandler.this, "false");
                }
                CrashDetailBean a11 = be.a(NativeCrashHandler.this.f42147d, NativeCrashHandler.f42143a, NativeCrashHandler.this.f42150g);
                if (a11 != null) {
                    al.a("[Native] Get crash from native record.", new Object[0]);
                    if (!NativeCrashHandler.this.f42156m.a(a11, true)) {
                        NativeCrashHandler.this.f42156m.b(a11, false);
                    }
                    be.a(false, NativeCrashHandler.f42143a);
                }
                final NativeCrashHandler nativeCrashHandler = NativeCrashHandler.this;
                long b11 = ap.b() - at.f42354j;
                long b12 = ap.b() + 86400000;
                File file = new File(NativeCrashHandler.f42143a);
                if (file.exists() && file.isDirectory()) {
                    try {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null && listFiles.length != 0) {
                            Arrays.sort(listFiles, new Comparator<File>() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.2
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(File file2, File file3) {
                                    return Long.compare(file3.lastModified(), file2.lastModified());
                                }
                            });
                            int length = listFiles.length;
                            long j11 = 0;
                            int i12 = 0;
                            int i13 = 0;
                            while (i11 < length) {
                                File file2 = listFiles[i11];
                                long lastModified = file2.lastModified();
                                j11 += file2.length();
                                i11 = (lastModified >= b11 && lastModified < b12 && j11 < at.f42353i) ? i11 + 1 : 0;
                                al.a("[Native] Delete record file: %s", file2.getAbsolutePath());
                                i12++;
                                if (file2.delete()) {
                                    i13++;
                                }
                            }
                            al.c("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i12), Integer.valueOf(i13));
                        }
                    } catch (Throwable th2) {
                        al.a(th2);
                    }
                }
                ap.b(NativeCrashHandler.this.f42147d, "native_record_lock");
            }
        });
    }

    public void disableCatchAnrTrace() {
        f42145c = 1;
    }

    public void dumpAnrNativeStack() {
        a(19, "1");
    }

    public void enableCatchAnrTrace() {
        f42145c |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return a(DescriptorProtos.Edition.EDITION_PROTO2_VALUE, m.f74525c);
    }

    @Override // com.tencent.bugly.proguard.q
    public String getLogFromNative() {
        if (!this.f42152i && !this.f42153j) {
            return null;
        }
        try {
            return this.f42153j ? getNativeLog() : (String) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null);
        } catch (UnsatisfiedLinkError unused) {
            return null;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f42150g;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public String getRunningCpuAbi() {
        try {
            return getSoCpuAbi();
        } catch (Throwable unused) {
            al.d("get so cpu abi failed，please upgrade bugly so version", new Object[0]);
            return "";
        }
    }

    public String getSystemProperty(String str) {
        return (this.f42153j || this.f42152i) ? getProperties(str) : "fail";
    }

    public boolean isEnableCatchAnrTrace() {
        return (f42145c & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f42155l;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z11 = strategyBean.f42084f;
                if (z11 != this.f42154k) {
                    al.d("server native changed to %b", Boolean.valueOf(z11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z12 = ac.a().c().f42084f && this.f42155l;
        if (z12 != this.f42154k) {
            al.a("native changed to %b", Boolean.valueOf(z12));
            b(z12);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f42152i || this.f42153j) && str != null && str2 != null) {
            try {
                if (this.f42153j) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th2) {
                if (!al.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z11, int i11);

    public void removeEmptyNativeRecordFiles() {
        be.c(f42143a);
    }

    public native String removeNativeKeyValue(String str);

    public void resendSigquit() {
        a(20, "");
    }

    public boolean setNativeAppChannel(String str) {
        return a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return a(10, str);
    }

    public native void setNativeInfo(int i11, String str);

    @Override // com.tencent.bugly.proguard.q
    public boolean setNativeIsAppForeground(boolean z11) {
        return a(14, z11 ? m.f74525c : "false");
    }

    public boolean setNativeLaunchTime(long j11) {
        try {
            return a(15, String.valueOf(j11));
        } catch (NumberFormatException e11) {
            if (al.a(e11)) {
                return false;
            }
            e11.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return a(11, str);
    }

    public synchronized void setUserOpened(boolean z11) {
        try {
            c(z11);
            boolean isUserOpened = isUserOpened();
            ac a11 = ac.a();
            if (a11 != null) {
                isUserOpened = isUserOpened && a11.c().f42084f;
            }
            if (isUserOpened != this.f42154k) {
                al.a("native changed to %b", Boolean.valueOf(isUserOpened));
                b(isUserOpened);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f42153j && !this.f42152i) {
                boolean b11 = ap.b(this.f42148e.f42203t);
                boolean z11 = !b11;
                if (at.f42347b) {
                    boolean a11 = a(b11 ? "Bugly_Native" : this.f42148e.f42203t, z11);
                    this.f42153j = a11;
                    if (!a11 && b11) {
                        this.f42152i = a("NativeRQD", false);
                    }
                } else {
                    String str = "Bugly_Native";
                    aa aaVar = this.f42148e;
                    String str2 = aaVar.f42203t;
                    if (b11) {
                        aaVar.getClass();
                    } else {
                        str = str2;
                    }
                    this.f42153j = a(str, z11);
                }
                if (this.f42153j || this.f42152i) {
                    a(this.f42151h);
                    setNativeAppVersion(this.f42148e.f42198o);
                    setNativeAppChannel(this.f42148e.f42202s);
                    setNativeAppPackage(this.f42148e.f42186c);
                    setNativeUserId(this.f42148e.f());
                    setNativeIsAppForeground(this.f42148e.a());
                    setNativeLaunchTime(this.f42148e.f42160a);
                    return;
                }
                return;
            }
            a(this.f42151h);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f42153j) {
            testCrash();
        } else {
            al.d("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public void unBlockSigquit(boolean z11) {
        if (z11) {
            a(21, m.f74525c);
        } else {
            a(21, "false");
        }
    }

    public native String unregist();

    private synchronized void c() {
        if (!this.f42154k) {
            al.d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
            if (unregist() != null) {
                al.a("[Native] Successfully closed native crash report.", new Object[0]);
                this.f42154k = false;
                return;
            }
        } catch (Throwable unused) {
            al.c("[Native] Failed to close native crash report.", new Object[0]);
        }
        try {
            ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f42154k = false;
            al.a("[Native] Successfully closed native crash report.", new Object[0]);
        } catch (Throwable unused2) {
            al.c("[Native] Failed to close native crash report.", new Object[0]);
            this.f42153j = false;
            this.f42152i = false;
        }
    }

    public static /* synthetic */ boolean a(NativeCrashHandler nativeCrashHandler, String str) {
        return nativeCrashHandler.a(999, str);
    }

    private synchronized void b(boolean z11) {
        if (z11) {
            startNativeMonitor();
        } else {
            c();
        }
    }

    private synchronized void a(boolean z11) {
        if (this.f42154k) {
            al.d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        int i11 = 1;
        if (this.f42153j) {
            try {
                String regist = regist(f42143a, z11, f42145c);
                if (regist != null) {
                    al.a("[Native] Native Crash Report enable.", new Object[0]);
                    this.f42148e.f42204u = regist;
                    String concat = Constants.ACCEPT_TIME_SEPARATOR_SERVER.concat(regist);
                    if (!at.f42347b && !this.f42148e.f42191h.contains(concat)) {
                        aa aaVar = this.f42148e;
                        aaVar.f42191h = aaVar.f42191h.concat(Constants.ACCEPT_TIME_SEPARATOR_SERVER).concat(this.f42148e.f42204u);
                    }
                    al.a("comInfo.sdkVersion %s", this.f42148e.f42191h);
                    this.f42154k = true;
                    String runningCpuAbi = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi)) {
                        this.f42148e.e(runningCpuAbi);
                    }
                    return;
                }
            } catch (Throwable unused) {
                al.c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f42152i) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", new Class[]{String.class, String.class, cls, cls}, new Object[]{f42143a, ab.d(), Integer.valueOf(z11 ? 1 : 5), 1});
                if (str == null) {
                    String str2 = f42143a;
                    String d11 = ab.d();
                    aa.b();
                    str = (String) ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", new Class[]{String.class, String.class, cls}, new Object[]{str2, d11, Integer.valueOf(aa.B())});
                }
                if (str != null) {
                    this.f42154k = true;
                    this.f42148e.f42204u = str;
                    ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    if (!z11) {
                        i11 = 5;
                    }
                    ap.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", new Class[]{cls}, new Object[]{Integer.valueOf(i11)});
                    String runningCpuAbi2 = getRunningCpuAbi();
                    if (!TextUtils.isEmpty(runningCpuAbi2)) {
                        this.f42148e.e(runningCpuAbi2);
                    }
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f42153j = false;
        this.f42152i = false;
    }

    public static synchronized NativeCrashHandler getInstance() {
        NativeCrashHandler nativeCrashHandler;
        synchronized (NativeCrashHandler.class) {
            nativeCrashHandler = f42144b;
        }
        return nativeCrashHandler;
    }

    public void testNativeCrash(boolean z11, boolean z12, boolean z13) {
        a(16, String.valueOf(z11));
        a(17, String.valueOf(z12));
        a(18, String.valueOf(z13));
        testNativeCrash();
    }

    private synchronized void c(boolean z11) {
        if (this.f42155l != z11) {
            al.a("user change native %b", Boolean.valueOf(z11));
            this.f42155l = z11;
        }
    }

    private static boolean a(String str, boolean z11) {
        boolean z12;
        try {
            al.a("[Native] Trying to load so: %s", str);
            if (z11) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
        } catch (Throwable th2) {
            th = th2;
            z12 = false;
        }
        try {
            al.a("[Native] Successfully loaded SO: %s", str);
            return true;
        } catch (Throwable th3) {
            z12 = true;
            th = th3;
            al.d(th.getMessage(), new Object[0]);
            al.d("[Native] Failed to load so: %s", str);
            return z12;
        }
    }

    private boolean a(int i11, String str) {
        if (!this.f42153j) {
            return false;
        }
        try {
            setNativeInfo(i11, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
    }
}
