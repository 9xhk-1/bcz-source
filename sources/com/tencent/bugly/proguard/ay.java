package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ay {

    /* renamed from: f, reason: collision with root package name */
    public static ay f42412f;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f42414b;

    /* renamed from: c, reason: collision with root package name */
    final aa f42415c;

    /* renamed from: d, reason: collision with root package name */
    final ak f42416d;

    /* renamed from: e, reason: collision with root package name */
    String f42417e;

    /* renamed from: g, reason: collision with root package name */
    private final Context f42418g;

    /* renamed from: h, reason: collision with root package name */
    private final ac f42419h;

    /* renamed from: i, reason: collision with root package name */
    private final as f42420i;

    /* renamed from: k, reason: collision with root package name */
    private FileObserver f42422k;

    /* renamed from: m, reason: collision with root package name */
    private bg f42424m;

    /* renamed from: n, reason: collision with root package name */
    private int f42425n;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f42413a = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    private final Object f42421j = new Object();

    /* renamed from: l, reason: collision with root package name */
    private boolean f42423l = true;

    /* renamed from: o, reason: collision with root package name */
    private long f42426o = 0;

    public ay(Context context, ac acVar, aa aaVar, ak akVar, as asVar) {
        Context a11 = ap.a(context);
        this.f42418g = a11;
        this.f42414b = (ActivityManager) a11.getSystemService("activity");
        if (ap.b(NativeCrashHandler.getDumpFilePath())) {
            this.f42417e = context.getDir("bugly", 0).getAbsolutePath();
        } else {
            this.f42417e = NativeCrashHandler.getDumpFilePath();
        }
        this.f42415c = aaVar;
        this.f42416d = akVar;
        this.f42419h = acVar;
        this.f42420i = asVar;
    }

    private synchronized void c() {
        if (e()) {
            al.d("start when started!", new Object[0]);
            return;
        }
        FileObserver fileObserver = new FileObserver("/data/anr/") { // from class: com.tencent.bugly.proguard.ay.1
            @Override // android.os.FileObserver
            public final void onEvent(int i11, String str) {
                if (str == null) {
                    return;
                }
                final String concat = "/data/anr/".concat(str);
                al.d("watching file %s", concat);
                if (concat.contains(ma.b.f72897d)) {
                    ay.this.f42416d.a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ay ayVar = ay.this;
                            String str2 = concat;
                            if (ayVar.a(true)) {
                                try {
                                    al.c("read trace first dump for create time!", new Object[0]);
                                    TraceFileHelper.a readFirstDumpInfo = TraceFileHelper.readFirstDumpInfo(str2, false);
                                    long j11 = readFirstDumpInfo != null ? readFirstDumpInfo.f42136c : -1L;
                                    if (j11 == -1) {
                                        al.d("trace dump fail could not get time!", new Object[0]);
                                        j11 = System.currentTimeMillis();
                                    }
                                    if (ayVar.a(j11)) {
                                        return;
                                    }
                                    ayVar.a(j11, str2);
                                } catch (Throwable th2) {
                                    if (!al.a(th2)) {
                                        th2.printStackTrace();
                                    }
                                    al.e("handle anr error %s", th2.getClass().toString());
                                }
                            }
                        }
                    });
                } else {
                    al.d("not anr file %s", concat);
                }
            }
        };
        this.f42422k = fileObserver;
        try {
            fileObserver.startWatching();
            al.a("start anr monitor!", new Object[0]);
            this.f42416d.a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.2
                @Override // java.lang.Runnable
                public final void run() {
                    ay.a(ay.this);
                }
            });
        } catch (Throwable th2) {
            this.f42422k = null;
            al.d("start anr monitor failed!", new Object[0]);
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private synchronized void d() {
        if (!e()) {
            al.d("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f42422k.stopWatching();
            this.f42422k = null;
            al.d("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            al.d("stop anr monitor failed!", new Object[0]);
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private synchronized boolean e() {
        return this.f42422k != null;
    }

    private synchronized boolean f() {
        return this.f42423l;
    }

    private synchronized void g() {
        if (e()) {
            al.d("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f42417e)) {
            return;
        }
        synchronized (this.f42421j) {
            try {
                bg bgVar = this.f42424m;
                if (bgVar != null) {
                    if (!bgVar.isAlive()) {
                    }
                }
                bg bgVar2 = new bg();
                this.f42424m = bgVar2;
                boolean z11 = this.f42415c.S;
                bgVar2.f42464b = z11;
                al.c("set record stack trace enable:".concat(String.valueOf(z11)), new Object[0]);
                bg bgVar3 = this.f42424m;
                StringBuilder sb2 = new StringBuilder("Bugly-ThreadMonitor");
                int i11 = this.f42425n;
                this.f42425n = i11 + 1;
                sb2.append(i11);
                bgVar3.setName(sb2.toString());
                this.f42424m.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        FileObserver fileObserver = new FileObserver(this.f42417e) { // from class: com.tencent.bugly.proguard.ay.3
            @Override // android.os.FileObserver
            public final void onEvent(int i12, String str) {
                if (str == null) {
                    return;
                }
                al.d("observe file, dir:%s fileName:%s", ay.this.f42417e, str);
                if (!str.startsWith("manual_bugly_trace_") || !str.endsWith(".txt")) {
                    al.c("not manual trace file, ignore.", new Object[0]);
                    return;
                }
                if (!ay.this.f42413a.get()) {
                    al.c("proc is not in anr, just ignore", new Object[0]);
                    return;
                }
                if (ay.this.f42415c.a()) {
                    al.c("Found foreground anr, resend sigquit immediately.", new Object[0]);
                    NativeCrashHandler.getInstance().resendSigquit();
                    long a11 = am.a(str, "manual_bugly_trace_", ".txt");
                    ay.this.a(a11, ay.this.f42417e + "/" + str);
                    al.c("Finish handling one anr.", new Object[0]);
                    return;
                }
                al.c("Found background anr, resend sigquit later.", new Object[0]);
                long a12 = am.a(str, "manual_bugly_trace_", ".txt");
                ay.this.a(a12, ay.this.f42417e + "/" + str);
                al.c("Finish handling one anr, now resend sigquit.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
            }
        };
        this.f42422k = fileObserver;
        try {
            fileObserver.startWatching();
            al.a("startWatchingPrivateAnrDir! dumFilePath is %s", this.f42417e);
            this.f42416d.a(new Runnable() { // from class: com.tencent.bugly.proguard.ay.4
                @Override // java.lang.Runnable
                public final void run() {
                    ay.a(ay.this);
                }
            });
        } catch (Throwable th3) {
            this.f42422k = null;
            al.d("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (al.a(th3)) {
                return;
            }
            th3.printStackTrace();
        }
    }

    private synchronized void h() {
        if (!e()) {
            al.d("close when closed!", new Object[0]);
            return;
        }
        synchronized (this.f42421j) {
            try {
                bg bgVar = this.f42424m;
                if (bgVar != null) {
                    bgVar.a();
                    this.f42424m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        al.a("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f42422k.stopWatching();
            this.f42422k = null;
            al.d("close anr monitor!", new Object[0]);
        } catch (Throwable th3) {
            al.d("stop anr monitor failed!", new Object[0]);
            if (al.a(th3)) {
                return;
            }
            th3.printStackTrace();
        }
    }

    public final void b(boolean z11) {
        d(z11);
        boolean f11 = f();
        ac a11 = ac.a();
        if (a11 != null) {
            f11 = f11 && a11.c().f42084f;
        }
        if (f11 != e()) {
            al.a("anr changed to %b", Boolean.valueOf(f11));
            c(f11);
        }
    }

    public static synchronized ay a() {
        ay ayVar;
        synchronized (ay.class) {
            ayVar = f42412f;
        }
        return ayVar;
    }

    private CrashDetailBean a(ax axVar) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.C = ab.j();
            crashDetailBean.D = ab.f();
            crashDetailBean.E = ab.l();
            crashDetailBean.F = this.f42415c.k();
            crashDetailBean.G = this.f42415c.j();
            crashDetailBean.H = this.f42415c.l();
            crashDetailBean.I = ab.b(this.f42418g);
            crashDetailBean.J = ab.g();
            crashDetailBean.K = ab.h();
            crashDetailBean.f42104b = 3;
            crashDetailBean.f42107e = this.f42415c.g();
            aa aaVar = this.f42415c;
            crashDetailBean.f42108f = aaVar.f42198o;
            crashDetailBean.f42109g = aaVar.q();
            crashDetailBean.f42115m = this.f42415c.f();
            crashDetailBean.f42116n = "ANR_EXCEPTION";
            crashDetailBean.f42117o = axVar.f42410f;
            crashDetailBean.f42119q = axVar.f42411g;
            HashMap hashMap = new HashMap();
            crashDetailBean.T = hashMap;
            hashMap.put("BUGLY_CR_01", axVar.f42409e);
            String str = crashDetailBean.f42119q;
            int indexOf = str != null ? str.indexOf("\n") : -1;
            crashDetailBean.f42118p = indexOf > 0 ? crashDetailBean.f42119q.substring(0, indexOf) : "GET_FAIL";
            crashDetailBean.f42120r = axVar.f42407c;
            String str2 = crashDetailBean.f42119q;
            if (str2 != null) {
                crashDetailBean.f42123u = ap.c(str2.getBytes());
            }
            crashDetailBean.f42128z = axVar.f42406b;
            crashDetailBean.A = axVar.f42405a;
            crashDetailBean.B = "main(1)";
            crashDetailBean.L = this.f42415c.s();
            crashDetailBean.f42110h = this.f42415c.p();
            crashDetailBean.f42111i = this.f42415c.A();
            crashDetailBean.f42124v = axVar.f42408d;
            aa aaVar2 = this.f42415c;
            crashDetailBean.P = aaVar2.f42204u;
            crashDetailBean.Q = aaVar2.f42160a;
            crashDetailBean.R = aaVar2.a();
            crashDetailBean.U = this.f42415c.z();
            aa aaVar3 = this.f42415c;
            crashDetailBean.V = aaVar3.f42207x;
            crashDetailBean.W = aaVar3.t();
            crashDetailBean.X = this.f42415c.y();
            crashDetailBean.f42127y = ao.a();
            return crashDetailBean;
        } catch (Throwable th2) {
            if (!al.a(th2)) {
                th2.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    public final synchronized void b() {
        al.d("customer decides whether to open or close.", new Object[0]);
    }

    private synchronized void d(boolean z11) {
        if (this.f42423l != z11) {
            al.a("user change anr %b", Boolean.valueOf(z11));
            this.f42423l = z11;
        }
    }

    private synchronized void c(boolean z11) {
        if (z11) {
            g();
        } else {
            h();
        }
    }

    private static boolean a(String str, String str2, String str3) {
        Map<String, String[]> map;
        TraceFileHelper.a readTargetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        if (readTargetDumpInfo != null && (map = readTargetDumpInfo.f42137d) != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(1024);
            String[] strArr = readTargetDumpInfo.f42137d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb2.append("\"main\" tid=");
                sb2.append(strArr[2]);
                sb2.append(" :\n");
                sb2.append(strArr[0]);
                sb2.append("\n");
                sb2.append(strArr[1]);
                sb2.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : readTargetDumpInfo.f42137d.entrySet()) {
                if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                    sb2.append("\"");
                    sb2.append(entry.getKey());
                    sb2.append("\" tid=");
                    sb2.append(entry.getValue()[2]);
                    sb2.append(" :\n");
                    sb2.append(entry.getValue()[0]);
                    sb2.append("\n");
                    sb2.append(entry.getValue()[1]);
                    sb2.append("\n\n");
                }
            }
            return am.a(str2, sb2.toString(), sb2.length() * 2);
        }
        al.e("not found trace dump for %s", str3);
        return false;
    }

    private static String a(List<ba> list, long j11) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(4096);
            sb2.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n");
            sb2.append("\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i11 = 0; i11 < list.size(); i11++) {
                ba baVar = list.get(i11);
                sb2.append("Thread name:");
                sb2.append(baVar.f42433a);
                sb2.append("\n");
                long j12 = baVar.f42434b - j11;
                String str = j12 <= 0 ? "before " : "after ";
                sb2.append("Got ");
                sb2.append(str);
                sb2.append("anr:");
                sb2.append(Math.abs(j12));
                sb2.append("ms\n");
                sb2.append(baVar.f42435c);
                sb2.append("\n");
                if (sb2.length() * 2 >= 101376) {
                    break;
                }
            }
            sb2.append("\n<<<<< Thread Stack Traces Records End <<<<<\n");
            return sb2.toString();
        }
        return "main thread stack not enable";
    }

    public final boolean a(boolean z11) {
        boolean compareAndSet = this.f42413a.compareAndSet(!z11, z11);
        al.c("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z11), Boolean.valueOf(compareAndSet));
        return compareAndSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0007, B:4:0x0016, B:10:0x002c, B:12:0x004d, B:14:0x0053, B:18:0x0060, B:21:0x0070, B:23:0x0081, B:27:0x008c, B:29:0x00a9, B:30:0x00ad, B:33:0x00cb, B:35:0x00f0, B:38:0x00fd, B:40:0x0126, B:41:0x0154, B:42:0x0156, B:49:0x0168, B:50:0x0179, B:51:0x0189, B:53:0x019a, B:54:0x01a9, B:56:0x01cb, B:57:0x01d0, B:58:0x01d7, B:70:0x01f1, B:71:0x01a2, B:77:0x0181, B:78:0x013e, B:79:0x0182, B:80:0x00c7, B:82:0x0079, B:87:0x01f3, B:44:0x0157, B:46:0x015b, B:47:0x0165, B:6:0x0017, B:8:0x001b, B:9:0x002b, B:60:0x01d8, B:62:0x01dc, B:63:0x01eb), top: B:2:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0007, B:4:0x0016, B:10:0x002c, B:12:0x004d, B:14:0x0053, B:18:0x0060, B:21:0x0070, B:23:0x0081, B:27:0x008c, B:29:0x00a9, B:30:0x00ad, B:33:0x00cb, B:35:0x00f0, B:38:0x00fd, B:40:0x0126, B:41:0x0154, B:42:0x0156, B:49:0x0168, B:50:0x0179, B:51:0x0189, B:53:0x019a, B:54:0x01a9, B:56:0x01cb, B:57:0x01d0, B:58:0x01d7, B:70:0x01f1, B:71:0x01a2, B:77:0x0181, B:78:0x013e, B:79:0x0182, B:80:0x00c7, B:82:0x0079, B:87:0x01f3, B:44:0x0157, B:46:0x015b, B:47:0x0165, B:6:0x0017, B:8:0x001b, B:9:0x002b, B:60:0x01d8, B:62:0x01dc, B:63:0x01eb), top: B:2:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0007, B:4:0x0016, B:10:0x002c, B:12:0x004d, B:14:0x0053, B:18:0x0060, B:21:0x0070, B:23:0x0081, B:27:0x008c, B:29:0x00a9, B:30:0x00ad, B:33:0x00cb, B:35:0x00f0, B:38:0x00fd, B:40:0x0126, B:41:0x0154, B:42:0x0156, B:49:0x0168, B:50:0x0179, B:51:0x0189, B:53:0x019a, B:54:0x01a9, B:56:0x01cb, B:57:0x01d0, B:58:0x01d7, B:70:0x01f1, B:71:0x01a2, B:77:0x0181, B:78:0x013e, B:79:0x0182, B:80:0x00c7, B:82:0x0079, B:87:0x01f3, B:44:0x0157, B:46:0x015b, B:47:0x0165, B:6:0x0017, B:8:0x001b, B:9:0x002b, B:60:0x01d8, B:62:0x01dc, B:63:0x01eb), top: B:2:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0007, B:4:0x0016, B:10:0x002c, B:12:0x004d, B:14:0x0053, B:18:0x0060, B:21:0x0070, B:23:0x0081, B:27:0x008c, B:29:0x00a9, B:30:0x00ad, B:33:0x00cb, B:35:0x00f0, B:38:0x00fd, B:40:0x0126, B:41:0x0154, B:42:0x0156, B:49:0x0168, B:50:0x0179, B:51:0x0189, B:53:0x019a, B:54:0x01a9, B:56:0x01cb, B:57:0x01d0, B:58:0x01d7, B:70:0x01f1, B:71:0x01a2, B:77:0x0181, B:78:0x013e, B:79:0x0182, B:80:0x00c7, B:82:0x0079, B:87:0x01f3, B:44:0x0157, B:46:0x015b, B:47:0x0165, B:6:0x0017, B:8:0x001b, B:9:0x002b, B:60:0x01d8, B:62:0x01dc, B:63:0x01eb), top: B:2:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cb A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0007, B:4:0x0016, B:10:0x002c, B:12:0x004d, B:14:0x0053, B:18:0x0060, B:21:0x0070, B:23:0x0081, B:27:0x008c, B:29:0x00a9, B:30:0x00ad, B:33:0x00cb, B:35:0x00f0, B:38:0x00fd, B:40:0x0126, B:41:0x0154, B:42:0x0156, B:49:0x0168, B:50:0x0179, B:51:0x0189, B:53:0x019a, B:54:0x01a9, B:56:0x01cb, B:57:0x01d0, B:58:0x01d7, B:70:0x01f1, B:71:0x01a2, B:77:0x0181, B:78:0x013e, B:79:0x0182, B:80:0x00c7, B:82:0x0079, B:87:0x01f3, B:44:0x0157, B:46:0x015b, B:47:0x0165, B:6:0x0017, B:8:0x001b, B:9:0x002b, B:60:0x01d8, B:62:0x01dc, B:63:0x01eb), top: B:2:0x0007, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a2 A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:3:0x0007, B:4:0x0016, B:10:0x002c, B:12:0x004d, B:14:0x0053, B:18:0x0060, B:21:0x0070, B:23:0x0081, B:27:0x008c, B:29:0x00a9, B:30:0x00ad, B:33:0x00cb, B:35:0x00f0, B:38:0x00fd, B:40:0x0126, B:41:0x0154, B:42:0x0156, B:49:0x0168, B:50:0x0179, B:51:0x0189, B:53:0x019a, B:54:0x01a9, B:56:0x01cb, B:57:0x01d0, B:58:0x01d7, B:70:0x01f1, B:71:0x01a2, B:77:0x0181, B:78:0x013e, B:79:0x0182, B:80:0x00c7, B:82:0x0079, B:87:0x01f3, B:44:0x0157, B:46:0x015b, B:47:0x0165, B:6:0x0017, B:8:0x001b, B:9:0x002b, B:60:0x01d8, B:62:0x01dc, B:63:0x01eb), top: B:2:0x0007, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r22, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.ay.a(long, java.lang.String):void");
    }

    public final boolean a(long j11) {
        if (Math.abs(j11 - this.f42426o) < 10000) {
            al.d("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f42426o = j11;
        return false;
    }

    public static /* synthetic */ void a(ay ayVar) {
        long currentTimeMillis = (at.f42354j + System.currentTimeMillis()) - ap.b();
        am.a(ayVar.f42417e, "bugly_trace_", ".txt", currentTimeMillis);
        am.a(ayVar.f42417e, "manual_bugly_trace_", ".txt", currentTimeMillis);
        am.a(ayVar.f42417e, "main_stack_record_", ".txt", currentTimeMillis);
        am.a(ayVar.f42417e, "main_stack_record_", ".txt.merged", currentTimeMillis);
    }
}
