package com.mob.commons.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected Context f40184a;

    /* renamed from: b, reason: collision with root package name */
    protected String f40185b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f40186c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f40187d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f40188e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f40189f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f40190g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f40191h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f40192i = 0;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final char[] f40193a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        /* JADX INFO: Access modifiers changed from: private */
        public static String b(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(com.mob.commons.o.a("003Rghfihe"));
                messageDigest.update(str.getBytes("UTF-8"));
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b11 : digest) {
                    char[] cArr = f40193a;
                    sb2.append(cArr[(b11 & 240) >> 4]);
                    sb2.append(cArr[b11 & 15]);
                }
                return sb2.toString();
            } catch (Throwable th2) {
                com.mob.commons.b.c.a().a(th2);
                return str;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f40197a;

        /* renamed from: b, reason: collision with root package name */
        String f40198b;

        /* renamed from: c, reason: collision with root package name */
        String f40199c;

        /* renamed from: d, reason: collision with root package name */
        String f40200d;

        /* renamed from: e, reason: collision with root package name */
        String f40201e;
    }

    public g(Context context) {
        this.f40184a = context;
        this.f40185b = context.getPackageName();
    }

    private synchronized void j() {
        try {
            if (this.f40186c) {
                return;
            }
            if (a(a())) {
                this.f40186c = true;
            } else if (this.f40192i >= 3) {
                this.f40186c = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Intent a() {
        return null;
    }

    public synchronized void b(String str) {
        this.f40189f = str;
    }

    public c c() {
        return null;
    }

    public long d() {
        return 2500L;
    }

    public synchronized String e() {
        j();
        return this.f40188e;
    }

    public synchronized String f() {
        j();
        return this.f40190g;
    }

    public synchronized String g() {
        j();
        return this.f40191h;
    }

    public synchronized boolean h() {
        j();
        return this.f40187d;
    }

    public String i() {
        if (TextUtils.isEmpty(this.f40185b)) {
            return "";
        }
        return a.b(com.mob.commons.o.a("009_fedlgkfefegiiegkgk") + this.f40185b + com.mob.commons.o.a("011Xfedl+hGflfh.h-fdNi1defddc"));
    }

    public c a(IBinder iBinder) {
        return null;
    }

    public synchronized void c(String str) {
        this.f40191h = str;
    }

    public synchronized void a(String str) {
        this.f40188e = str;
    }

    public synchronized String b() {
        j();
        return this.f40189f;
    }

    private synchronized boolean a(Intent intent) {
        boolean z11;
        boolean z12 = true;
        this.f40192i++;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        z11 = false;
        try {
            c c11 = c();
            if (c11 == null) {
                c11 = a(this.f40184a, intent);
            }
            if (c11 != null) {
                this.f40187d = c11.f40197a;
                this.f40188e = c11.f40198b;
                this.f40189f = c11.f40199c;
                this.f40190g = c11.f40200d;
                this.f40191h = c11.f40201e;
            } else {
                z12 = false;
            }
            z11 = z12;
        } catch (Throwable th2) {
            com.mob.commons.b.c.a().a(th2);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        com.mob.commons.b.c.a().a("oa use time: " + elapsedRealtime2);
        return z11;
    }

    public String a(String str, IBinder iBinder, String str2, int i11, String... strArr) {
        Parcel parcel;
        Parcel parcel2;
        try {
            parcel = Parcel.obtain();
            try {
                parcel2 = Parcel.obtain();
            } catch (Throwable th2) {
                th = th2;
                parcel2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            parcel = null;
            parcel2 = null;
        }
        try {
            parcel.writeInterfaceToken(str2);
            if (strArr != null && strArr.length > 0) {
                for (String str3 : strArr) {
                    parcel.writeString(str3);
                }
            }
            iBinder.transact(i11, parcel, parcel2, 0);
            parcel2.readException();
            String readString = parcel2.readString();
            try {
                parcel2.recycle();
                parcel.recycle();
            } catch (Throwable unused) {
            }
            return readString;
        } catch (Throwable th4) {
            th = th4;
            try {
                com.mob.commons.b.c.a().a("getStringValue: " + str + " failed! " + th.getMessage());
                if (parcel2 != null) {
                    try {
                        parcel2.recycle();
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
                return null;
            } finally {
                if (parcel2 != null) {
                    try {
                        parcel2.recycle();
                    } catch (Throwable unused3) {
                    }
                }
                if (parcel != null) {
                    parcel.recycle();
                }
            }
        }
    }

    public class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f40194a;

        /* renamed from: c, reason: collision with root package name */
        private final BlockingQueue<IBinder> f40196c;

        private b() {
            this.f40194a = false;
            this.f40196c = new LinkedBlockingQueue();
        }

        public IBinder a(long j11) throws InterruptedException {
            if (this.f40194a) {
                throw new IllegalStateException();
            }
            this.f40194a = true;
            BlockingQueue<IBinder> blockingQueue = this.f40196c;
            if (j11 <= 0) {
                j11 = 1500;
            }
            return blockingQueue.poll(j11, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f40196c.put(iBinder);
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:34:0x0054, B:29:0x0059), top: B:33:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.lang.String r4, android.os.IBinder r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L23 android.os.RemoteException -> L26
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r2.writeInterfaceToken(r6)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r5.transact(r7, r2, r1, r0)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r1.readException()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L20
            r1.recycle()     // Catch: java.lang.Throwable -> L1d
            r2.recycle()     // Catch: java.lang.Throwable -> L1d
        L1d:
            return r4
        L1e:
            r4 = move-exception
            goto L52
        L20:
            r5 = r1
            r1 = r2
            goto L27
        L23:
            r4 = move-exception
            r2 = r1
            goto L52
        L26:
            r5 = r1
        L27:
            com.mob.commons.b.c r6 = com.mob.commons.b.c.a()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r7.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "getIntValue: "
            r7.append(r2)     // Catch: java.lang.Throwable -> L4f
            r7.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = " failed! (remoteException)"
            r7.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L4f
            r6.a(r4)     // Catch: java.lang.Throwable -> L4f
            if (r5 == 0) goto L49
            r5.recycle()     // Catch: java.lang.Throwable -> L4e
        L49:
            if (r1 == 0) goto L4e
            r1.recycle()     // Catch: java.lang.Throwable -> L4e
        L4e:
            return r0
        L4f:
            r4 = move-exception
            r2 = r1
            r1 = r5
        L52:
            if (r1 == 0) goto L57
            r1.recycle()     // Catch: java.lang.Throwable -> L5c
        L57:
            if (r2 == 0) goto L5c
            r2.recycle()     // Catch: java.lang.Throwable -> L5c
        L5c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.b.g.a(java.lang.String, android.os.IBinder, java.lang.String, int):int");
    }

    private c a(Context context, Intent intent) throws Throwable {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            b bVar = new b();
            if (intent != null) {
                try {
                    if (context.bindService(intent, bVar, 1)) {
                        IBinder a11 = bVar.a(d());
                        if (a11 == null) {
                            throw new Throwable("get binder " + intent.getComponent() + " failed!");
                        }
                        c a12 = a(a11);
                        try {
                            return a12;
                        } catch (Throwable th2) {
                            return a12;
                        }
                    }
                } finally {
                    try {
                        context.unbindService(bVar);
                    } catch (Throwable th22) {
                        com.mob.commons.b.c.a().a(th22);
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bind service ");
            sb2.append(intent == null ? "null" : intent.getComponent());
            sb2.append(" failed!");
            throw new Throwable(sb2.toString());
        }
        throw new Throwable("unable to invoke in main thread!");
    }
}
