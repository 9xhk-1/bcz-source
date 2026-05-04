package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ai {

    /* renamed from: b, reason: collision with root package name */
    private static ai f42241b;

    /* renamed from: a, reason: collision with root package name */
    public ah f42242a;

    /* renamed from: d, reason: collision with root package name */
    private final Context f42244d;

    /* renamed from: f, reason: collision with root package name */
    private long f42246f;

    /* renamed from: g, reason: collision with root package name */
    private long f42247g;

    /* renamed from: e, reason: collision with root package name */
    private Map<Integer, Long> f42245e = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f42248h = new LinkedBlockingQueue<>();

    /* renamed from: i, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f42249i = new LinkedBlockingQueue<>();

    /* renamed from: j, reason: collision with root package name */
    private final Object f42250j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private long f42251k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f42252l = 0;

    /* renamed from: c, reason: collision with root package name */
    private final w f42243c = w.a();

    private ai(Context context) {
        this.f42244d = context;
    }

    public static /* synthetic */ int b(ai aiVar) {
        int i11 = aiVar.f42252l - 1;
        aiVar.f42252l = i11;
        return i11;
    }

    public static synchronized ai a(Context context) {
        ai aiVar;
        synchronized (ai.class) {
            try {
                if (f42241b == null) {
                    f42241b = new ai(context);
                }
                aiVar = f42241b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aiVar;
    }

    public final boolean b(int i11) {
        if (p.f42621c) {
            al.c("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - a(i11);
        al.c("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(currentTimeMillis / 1000), Integer.valueOf(i11));
        if (currentTimeMillis >= 30000) {
            return true;
        }
        al.a("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    public static synchronized ai a() {
        ai aiVar;
        synchronized (ai.class) {
            aiVar = f42241b;
        }
        return aiVar;
    }

    public final void a(int i11, bq bqVar, String str, String str2, ah ahVar, long j11, boolean z11) {
        try {
            a(new aj(this.f42244d, i11, bqVar.f42520g, ae.a((Object) bqVar), str, str2, ahVar, z11), true, true, j11);
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private void b() {
        ak a11 = ak.a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        synchronized (this.f42250j) {
            try {
                al.c("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f42248h.size();
                final int size2 = this.f42249i.size();
                if (size == 0 && size2 == 0) {
                    al.c("[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (a11 == null || !a11.c()) {
                    size2 = 0;
                }
                a(this.f42248h, linkedBlockingQueue, size);
                a(this.f42249i, linkedBlockingQueue2, size2);
                a(size, linkedBlockingQueue);
                if (size2 > 0) {
                    al.c("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(size2), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                }
                ak a12 = ak.a();
                if (a12 != null) {
                    a12.a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable;
                            for (int i11 = 0; i11 < size2 && (runnable = (Runnable) linkedBlockingQueue2.poll()) != null; i11++) {
                                runnable.run();
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(int i11, int i12, byte[] bArr, String str, String str2, ah ahVar, boolean z11) {
        try {
            a(new aj(this.f42244d, i11, i12, bArr, str, str2, ahVar, 0, 0, false), z11, false, 0L);
        } catch (Throwable th2) {
            if (al.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public final void a(int i11, bq bqVar, String str, String str2, ah ahVar, boolean z11) {
        a(i11, bqVar.f42520g, ae.a((Object) bqVar), str, str2, ahVar, z11);
    }

    public final long a(boolean z11) {
        long j11;
        long b11 = ap.b();
        int i11 = z11 ? 5 : 3;
        List<y> a11 = this.f42243c.a(i11);
        if (a11 != null && a11.size() > 0) {
            j11 = 0;
            try {
                y yVar = a11.get(0);
                if (yVar.f42701e >= b11) {
                    j11 = ap.d(yVar.f42703g);
                    if (i11 == 3) {
                        this.f42246f = j11;
                    } else {
                        this.f42247g = j11;
                    }
                    a11.remove(yVar);
                }
            } catch (Throwable th2) {
                al.a(th2);
            }
            if (a11.size() > 0) {
                this.f42243c.a(a11);
            }
        } else {
            j11 = z11 ? this.f42247g : this.f42246f;
        }
        al.c("[UploadManager] Local network consume: %d KB", Long.valueOf(j11 / 1024));
        return j11;
    }

    public final synchronized void a(long j11, boolean z11) {
        int i11 = z11 ? 5 : 3;
        try {
            y yVar = new y();
            yVar.f42698b = i11;
            yVar.f42701e = ap.b();
            yVar.f42699c = "";
            yVar.f42700d = "";
            yVar.f42703g = ap.c(j11);
            this.f42243c.b(i11);
            this.f42243c.a(yVar);
            if (z11) {
                this.f42247g = j11;
            } else {
                this.f42246f = j11;
            }
            al.c("[UploadManager] Network total consume: %d KB", Long.valueOf(j11 / 1024));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(int i11, long j11) {
        if (i11 >= 0) {
            this.f42245e.put(Integer.valueOf(i11), Long.valueOf(j11));
            y yVar = new y();
            yVar.f42698b = i11;
            yVar.f42701e = j11;
            yVar.f42699c = "";
            yVar.f42700d = "";
            yVar.f42703g = new byte[0];
            this.f42243c.b(i11);
            this.f42243c.a(yVar);
            al.c("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i11), ap.a(j11));
            return;
        }
        al.e("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i11));
    }

    public final synchronized long a(int i11) {
        if (i11 >= 0) {
            Long l11 = this.f42245e.get(Integer.valueOf(i11));
            if (l11 != null) {
                return l11.longValue();
            }
        } else {
            al.e("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i11));
        }
        return 0L;
    }

    private static void a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            Runnable peek = linkedBlockingQueue.peek();
            if (peek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(peek);
                linkedBlockingQueue.poll();
            } catch (Throwable th2) {
                al.e("[UploadManager] Failed to add upload task to temp urgent queue: %s", th2.getMessage());
            }
        }
    }

    private void a(int i11, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        ak a11 = ak.a();
        if (i11 > 0) {
            al.c("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i11), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            final Runnable poll = linkedBlockingQueue.poll();
            if (poll == null) {
                return;
            }
            synchronized (this.f42250j) {
                try {
                    if (this.f42252l >= 2 && a11 != null) {
                        a11.a(poll);
                    } else {
                        al.a("[UploadManager] Create and start a new thread to execute a upload task: %s", "BUGLY_ASYNC_UPLOAD");
                        if (ap.a(new Runnable() { // from class: com.tencent.bugly.proguard.ai.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                poll.run();
                                synchronized (ai.this.f42250j) {
                                    ai.b(ai.this);
                                }
                            }
                        }, "BUGLY_ASYNC_UPLOAD") != null) {
                            synchronized (this.f42250j) {
                                this.f42252l++;
                            }
                        } else {
                            al.d("[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            a(poll, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    private boolean a(Runnable runnable, boolean z11) {
        if (runnable == null) {
            al.a("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            al.c("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f42250j) {
                try {
                    if (z11) {
                        this.f42248h.put(runnable);
                    } else {
                        this.f42249i.put(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } catch (Throwable th3) {
            al.e("[UploadManager] Failed to add upload task to queue: %s", th3.getMessage());
            return false;
        }
    }

    private void a(Runnable runnable, long j11) {
        if (runnable == null) {
            al.d("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        al.c("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread a11 = ap.a(runnable, "BUGLY_SYNC_UPLOAD");
        if (a11 == null) {
            al.e("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            a(runnable, true);
            return;
        }
        try {
            a11.join(j11);
        } catch (Throwable th2) {
            al.e("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th2.getMessage());
            a(runnable, true);
            b();
        }
    }

    private void a(Runnable runnable, boolean z11, boolean z12, long j11) {
        al.c("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z12) {
            a(runnable, j11);
        } else {
            a(runnable, z11);
            b();
        }
    }
}
