package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ao {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f42287a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f42288b = true;

    /* renamed from: c, reason: collision with root package name */
    private static SimpleDateFormat f42289c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f42290d = 30720;

    /* renamed from: e, reason: collision with root package name */
    private static StringBuilder f42291e = null;

    /* renamed from: f, reason: collision with root package name */
    private static StringBuilder f42292f = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f42293g = false;

    /* renamed from: h, reason: collision with root package name */
    private static a f42294h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f42295i = null;

    /* renamed from: j, reason: collision with root package name */
    private static String f42296j = null;

    /* renamed from: k, reason: collision with root package name */
    private static Context f42297k = null;

    /* renamed from: l, reason: collision with root package name */
    private static String f42298l = null;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f42299m = false;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f42300n = false;

    /* renamed from: o, reason: collision with root package name */
    private static ExecutorService f42301o;

    /* renamed from: p, reason: collision with root package name */
    private static int f42302p;

    /* renamed from: q, reason: collision with root package name */
    private static final Object f42303q = new Object();

    static {
        try {
            f42289c = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th2) {
            al.b(th2.getCause());
        }
    }

    public static synchronized void a(Context context) {
        synchronized (ao.class) {
            if (f42299m || context == null || !f42288b) {
                return;
            }
            try {
                f42301o = Executors.newSingleThreadExecutor();
                f42292f = new StringBuilder(0);
                f42291e = new StringBuilder(0);
                f42297k = context;
                f42295i = aa.a(context).f42187d;
                f42296j = "";
                f42298l = f42297k.getFilesDir().getPath() + "/buglylog_" + f42295i + "_" + f42296j + ".txt";
                f42302p = Process.myPid();
            } catch (Throwable unused) {
            }
            f42299m = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(String str, String str2, String str3) {
        q qVar;
        try {
            aa b11 = aa.b();
            if (b11 == null || (qVar = b11.N) == null) {
                return false;
            }
            return qVar.appendLogToNative(str, str2, str3);
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e(String str, String str2, String str3) {
        synchronized (ao.class) {
            if (f42287a) {
                f(str, str2, str3);
            } else {
                g(str, str2, str3);
            }
        }
    }

    private static synchronized void f(String str, String str2, String str3) {
        synchronized (ao.class) {
            String a11 = a(str, str2, str3, Process.myTid());
            synchronized (f42303q) {
                try {
                    f42292f.append(a11);
                    if (f42292f.length() >= f42290d) {
                        StringBuilder sb2 = f42292f;
                        f42292f = sb2.delete(0, sb2.indexOf("\u0001\r\n") + 1);
                    }
                } finally {
                    try {
                    } catch (Throwable th2) {
                    }
                }
            }
        }
    }

    private static synchronized void g(String str, String str2, String str3) {
        synchronized (ao.class) {
            String a11 = a(str, str2, str3, Process.myTid());
            synchronized (f42303q) {
                try {
                    f42292f.append(a11);
                } catch (Throwable unused) {
                }
                if (f42292f.length() <= f42290d) {
                    return;
                }
                if (f42293g) {
                    return;
                }
                f42293g = true;
                a aVar = f42294h;
                if (aVar == null) {
                    f42294h = new a(f42298l);
                } else {
                    File file = aVar.f42311b;
                    if (file == null || file.length() + f42292f.length() > f42294h.f42312c) {
                        f42294h.a();
                    }
                }
                if (f42294h.a(f42292f.toString())) {
                    f42292f.setLength(0);
                    f42293g = false;
                }
            }
        }
    }

    private static String b() {
        q qVar;
        try {
            aa b11 = aa.b();
            if (b11 == null || (qVar = b11.N) == null) {
                return null;
            }
            return qVar.getLogFromNative();
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    private static byte[] c() {
        File file;
        if (!f42288b) {
            return null;
        }
        if (f42300n) {
            al.a("[LogUtil] Get user log from native.", new Object[0]);
            String b11 = b();
            if (b11 != null) {
                al.a("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(b11.length()));
                return ap.a(b11, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        synchronized (f42303q) {
            try {
                a aVar = f42294h;
                if (aVar != null && aVar.f42310a && (file = aVar.f42311b) != null && file.length() > 0) {
                    sb2.append(ap.a(f42294h.f42311b, 30720, true));
                }
                StringBuilder sb3 = f42292f;
                if (sb3 != null && sb3.length() > 0) {
                    sb2.append(f42292f.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ap.a(sb2.toString(), "BuglyLog.txt");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f42310a;

        /* renamed from: b, reason: collision with root package name */
        File f42311b;

        /* renamed from: c, reason: collision with root package name */
        long f42312c = 30720;

        /* renamed from: d, reason: collision with root package name */
        private String f42313d;

        /* renamed from: e, reason: collision with root package name */
        private long f42314e;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f42313d = str;
            this.f42310a = a();
        }

        public final boolean a() {
            try {
                File file = new File(this.f42313d);
                this.f42311b = file;
                if (file.exists() && !this.f42311b.delete()) {
                    this.f42310a = false;
                    return false;
                }
                if (this.f42311b.createNewFile()) {
                    return true;
                }
                this.f42310a = false;
                return false;
            } catch (Throwable th2) {
                al.a(th2);
                this.f42310a = false;
                return false;
            }
        }

        public final boolean a(String str) {
            if (!this.f42310a) {
                return false;
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(this.f42311b, true);
                try {
                    fileOutputStream2.write(str.getBytes("UTF-8"));
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    this.f42314e += r10.length;
                    this.f42310a = true;
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        al.a(th);
                        this.f42310a = false;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void a(int i11) {
        synchronized (f42303q) {
            try {
                f42290d = i11;
                if (i11 < 0) {
                    f42290d = 0;
                } else if (i11 > 30720) {
                    f42290d = 30720;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(String str, String str2, Throwable th2) {
        if (th2 == null) {
            return;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        a(str, str2, message + '\n' + ap.b(th2));
    }

    public static synchronized void a(final String str, final String str2, final String str3) {
        synchronized (ao.class) {
            if (f42299m && f42288b) {
                try {
                    if (f42300n) {
                        f42301o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ao.d(str, str2, str3);
                            }
                        });
                    } else {
                        f42301o.execute(new Runnable() { // from class: com.tencent.bugly.proguard.ao.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                ao.e(str, str2, str3);
                            }
                        });
                    }
                } catch (Exception e11) {
                    al.b(e11);
                }
            }
        }
    }

    private static String a(String str, String str2, String str3, long j11) {
        String date;
        f42291e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat = f42289c;
        if (simpleDateFormat != null) {
            date = simpleDateFormat.format(date2);
        } else {
            date = date2.toString();
        }
        StringBuilder sb2 = f42291e;
        sb2.append(date);
        sb2.append(" ");
        sb2.append(f42302p);
        sb2.append(" ");
        sb2.append(j11);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str3);
        sb2.append("\u0001\r\n");
        return f42291e.toString();
    }

    public static byte[] a() {
        if (f42287a) {
            if (f42288b) {
                return ap.a(f42292f.toString(), "BuglyLog.txt");
            }
            return null;
        }
        return c();
    }
}
