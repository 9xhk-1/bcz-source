package com.igexin.push.c;

import android.annotation.SuppressLint;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.c.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    private static final String f37469e = "DT_DetectRunTask";

    /* renamed from: f, reason: collision with root package name */
    private static final long f37470f = 60;

    /* renamed from: a, reason: collision with root package name */
    Future<d> f37471a;

    /* renamed from: b, reason: collision with root package name */
    d f37472b;

    /* renamed from: c, reason: collision with root package name */
    i f37473c;

    /* renamed from: d, reason: collision with root package name */
    boolean f37474d;

    /* renamed from: com.igexin.push.c.e$1, reason: invalid class name */
    public class AnonymousClass1 implements Callable<d> {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        @SuppressLint({"NewApi"})
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d call() {
            Socket socket;
            Thread.currentThread().hashCode();
            com.igexin.b.a.a().f37028a.getActiveCount();
            if (!Thread.currentThread().isInterrupted()) {
                Socket socket2 = null;
                try {
                    try {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            socket = socket2;
                            Throwable th3 = th;
                            if (socket != null && !socket.isClosed()) {
                                try {
                                    socket.close();
                                } catch (Exception e11) {
                                    com.igexin.c.a.c.a.a(e11);
                                }
                            }
                            Thread.currentThread().hashCode();
                            com.igexin.b.a.a().f37028a.getActiveCount();
                            throw th3;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Exception e13) {
                    com.igexin.c.a.c.a.a(e13);
                }
                if (Thread.currentThread().isInterrupted()) {
                    com.igexin.c.a.c.a.a(e.f37469e, Thread.currentThread().getName() + " is interrupted ######");
                    Thread.currentThread().hashCode();
                    com.igexin.b.a.a().f37028a.getActiveCount();
                    return null;
                }
                synchronized (i.class) {
                }
                long currentTimeMillis = System.currentTimeMillis();
                String[] a11 = com.igexin.c.a.b.g.a(e.this.f37472b.a());
                socket = new Socket();
                try {
                    socket.connect(new InetSocketAddress(a11[1], e.this.f37472b.f37461b), 2500);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String a12 = e.a(socket.getInetAddress());
                    e.this.f37472b.a("socket://" + a12 + ":" + e.this.f37472b.f37461b, currentTimeMillis2 - currentTimeMillis, currentTimeMillis2);
                    e.this.c();
                    com.igexin.c.a.c.a.a("DT_DetectRunTask|detect " + e.this.c() + "|time = " + e.this.f37472b.c(), new Object[0]);
                } catch (Exception e14) {
                    e = e14;
                    socket2 = socket;
                    com.igexin.c.a.c.a.b(e.f37469e, "|detect " + e.this.c() + "thread -->" + e.getMessage());
                    synchronized (i.class) {
                        try {
                            e eVar = e.this;
                            if (eVar.f37473c != null) {
                                eVar.f37472b.b();
                                e eVar2 = e.this;
                                eVar2.f37473c.a(b.a.f37451c, eVar2.f37472b);
                            }
                            if (socket2 != null && !socket2.isClosed()) {
                                socket2.close();
                            }
                            Thread.currentThread().hashCode();
                            com.igexin.b.a.a().f37028a.getActiveCount();
                            return e.this.f37472b;
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th32 = th;
                    if (socket != null) {
                        socket.close();
                    }
                    Thread.currentThread().hashCode();
                    com.igexin.b.a.a().f37028a.getActiveCount();
                    throw th32;
                }
                synchronized (i.class) {
                    try {
                        if (e.this.f37473c != null && !Thread.currentThread().isInterrupted()) {
                            e eVar3 = e.this;
                            eVar3.f37473c.a(b.a.f37449a, eVar3.f37472b);
                        }
                        if (!socket.isClosed()) {
                            socket.close();
                        }
                        Thread.currentThread().hashCode();
                        com.igexin.b.a.a().f37028a.getActiveCount();
                    } finally {
                    }
                }
                Thread.currentThread().hashCode();
                com.igexin.b.a.a().f37028a.getActiveCount();
            }
            return e.this.f37472b;
        }
    }

    public static String a(InetAddress inetAddress) throws NoSuchMethodException {
        try {
            Method declaredMethod = Class.forName("java.net.InetAddress").getDeclaredMethod("holder", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(inetAddress, null);
            Field declaredField = invoke.getClass().getDeclaredField("address");
            declaredField.setAccessible(true);
            int intValue = ((Integer) declaredField.get(invoke)).intValue();
            String str = ((intValue >>> 24) & 255) + "." + ((intValue >>> 16) & 255) + "." + ((intValue >>> 8) & 255) + "." + (intValue & 255);
            com.igexin.c.a.c.a.b(f37469e, "i new Str: ".concat(String.valueOf(str)));
            return str;
        } catch (Throwable unused) {
            if (!com.igexin.push.config.d.f37576ah) {
                throw new NoSuchMethodException("can't get ad by new method");
            }
            com.igexin.c.a.c.a.b(f37469e, "get ad by original method");
            return inetAddress.getHostAddress();
        }
    }

    private d d() {
        return this.f37472b;
    }

    private void e() {
        synchronized (i.class) {
            try {
                if (this.f37473c != null) {
                    this.f37471a = com.igexin.b.a.a().f37028a.submit(new AnonymousClass1());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f() {
        this.f37471a = com.igexin.b.a.a().f37028a.submit(new AnonymousClass1());
    }

    private void g() {
        try {
            Future<d> future = this.f37471a;
            if (future == null || future.isCancelled() || this.f37471a.isDone()) {
                return;
            }
            this.f37471a.cancel(true);
            this.f37471a = null;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
    }

    public final void a() {
        c();
        com.igexin.c.a.c.a.a("DT_DetectRunTask|stop " + c() + " task", new Object[0]);
        g();
    }

    public final void b() {
        a((i) null);
        g();
    }

    public final String c() {
        return this.f37472b.a() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.f37472b.f37460a;
    }

    private void a(d dVar) {
        this.f37472b = dVar;
    }

    public final void a(i iVar) {
        synchronized (i.class) {
            this.f37473c = iVar;
        }
    }

    private void a(boolean z11) {
        this.f37474d = z11;
    }
}
