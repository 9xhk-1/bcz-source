package com.mob.apc.a;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.mob.MobACService;
import com.mob.apc.APCException;
import com.mob.apc.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadPoolExecutor f40061a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, d> f40062b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, byte[]> f40063c = new ConcurrentHashMap<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        f40061a = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            String packageName = componentName.getPackageName();
            f.a().b("[AIDLMessager][onServiceConnected] pkg: %s", packageName);
            this.f40062b.put(packageName, d.a(iBinder));
            byte[] remove = this.f40063c.remove(packageName);
            if (remove != null) {
                synchronized (remove) {
                    remove.notifyAll();
                }
            }
        } catch (Throwable th2) {
            f.a().b("[AIDLMessager][onServiceConnected] exception: %s", th2.getMessage());
            f.a().a(th2);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        try {
            String packageName = componentName.getPackageName();
            f.a().b("[AIDLMessager][onServiceDisconnected] pkg: %s", packageName);
            this.f40062b.remove(packageName);
        } catch (Throwable th2) {
            f.a().a(th2);
            f.a().b("[AIDLMessager][onServiceDisconnected] exception: %s", th2.getMessage());
        }
    }

    public com.mob.apc.a a(String str, String str2, com.mob.apc.a aVar, long j11) throws Throwable {
        e eVar;
        f.a().b("[sendAIDLMessage] pkg: %s, businessID: %s, apcMessage: %s, timeout: %s", str, str2, aVar, Long.valueOf(j11));
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        try {
            Runnable a11 = a(str, new e(aVar, str2, j11), j11, linkedBlockingQueue);
            if (j11 <= 0) {
                eVar = linkedBlockingQueue.take();
            } else {
                e poll = linkedBlockingQueue.poll(j11, TimeUnit.MILLISECONDS);
                if (poll == null) {
                    f40061a.remove(a11);
                }
                eVar = poll;
            }
            if (eVar != null) {
                com.mob.apc.a aVar2 = eVar.f40079a;
                if (aVar2 != null) {
                    return aVar2;
                }
                APCException aPCException = eVar.f40082d;
                if (aPCException != null) {
                    throw aPCException;
                }
            }
            throw new APCException("[sendAIDLMessage] callback is null or timeout.");
        } catch (Throwable th2) {
            f.a().b("[sendAIDLMessage] exception: %s", th2.getMessage());
            throw new APCException(th2);
        }
    }

    private Runnable a(final String str, final e eVar, final long j11, final BlockingQueue<e> blockingQueue) {
        Runnable runnable = new Runnable() { // from class: com.mob.apc.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        b.this.a(str, eVar);
                        blockingQueue.offer(b.this.a(str, eVar, j11));
                    } catch (Throwable th2) {
                        f.a().a(th2);
                    }
                } catch (Throwable th3) {
                    e eVar2 = null;
                    try {
                        e eVar3 = new e(null, eVar.f40080b, j11);
                        try {
                            if (th3 instanceof APCException) {
                                eVar3.f40082d = th3;
                            }
                            blockingQueue.offer(eVar3);
                        } catch (Throwable th4) {
                            th = th4;
                            eVar2 = eVar3;
                            blockingQueue.offer(eVar2);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        };
        f40061a.execute(runnable);
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e a(String str, e eVar, long j11) throws Throwable {
        boolean z11;
        boolean z12;
        f.a().b("[realSendAIDLMessage] pkg: %s, InnerMessage: %s, timeout: %s", str, eVar, Long.valueOf(j11));
        d dVar = this.f40062b.get(str);
        if (dVar != null) {
            try {
                if (dVar.isBinderAlive()) {
                    f.a().b("[realSendAIDLMessage] serverBinder %s is alive.", str);
                    return dVar.a(eVar);
                }
            } catch (RemoteException e11) {
                f.a().b("[realSendAIDLMessage] serverBinder send error: %s %s", str, e11.getMessage());
                f.a().a(e11);
            }
        }
        Intent intent = new Intent();
        intent.setClassName(str, MobACService.class.getName());
        try {
            f.a().a("check alive, pkg: " + str, new Object[0]);
            b.a c11 = c.a().c();
            if (c11 != null) {
                z11 = c11.a(str);
            } else {
                f.a().a("WARNING: mgsRequestListener null, can not check alive", new Object[0]);
                z11 = false;
            }
            f.a().a("is tgt alv: " + z11, new Object[0]);
            if (z11) {
                z12 = com.mob.apc.b.a().bindService(intent, this, 1);
            } else {
                f.a().a("can not rebnd acSvc, msg can not be send ", new Object[0]);
                z12 = false;
            }
            f.a().b("[realSendAIDLMessage] rebind service: %s %s", str, Boolean.valueOf(z12));
            if (z12) {
                try {
                    byte[] bArr = this.f40063c.get(str);
                    if (bArr == null) {
                        bArr = new byte[0];
                        this.f40063c.put(str, bArr);
                    }
                    synchronized (bArr) {
                        bArr.wait(j11);
                    }
                    d dVar2 = this.f40062b.get(str);
                    f.a().b("[realSendAIDLMessage] rebind service binder: %s %s", str, dVar2);
                    if (dVar2 != null) {
                        try {
                            return dVar2.a(eVar);
                        } catch (RemoteException e12) {
                            throw new APCException(1004, String.format("service binder %s send message RemoteException: %s", str, e12.getMessage()));
                        }
                    }
                    throw new APCException(1001, String.format("service binder %s is null or timeout", str));
                } catch (Throwable th2) {
                    f.a().b("[realSendAIDLMessage] service binder %s send exception: %s", str, th2.getMessage());
                    throw new APCException(th2);
                }
            }
            throw new APCException(1003, String.format("service %s bind failed", str));
        } catch (Throwable th3) {
            throw new APCException(1002, "service bind exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, e eVar) {
        com.mob.apc.a aVar;
        if (eVar == null || (aVar = eVar.f40079a) == null) {
            return;
        }
        b.a c11 = c.a().c();
        int i11 = aVar.f40051a;
        f.a().a("APCMessageType: " + i11, new Object[0]);
        if (i11 != 1 && i11 != 2) {
            if (i11 == 1001) {
                f.a().a("Need GD. busType: 1", new Object[0]);
                if (c11 != null) {
                    c11.a(1, str);
                    return;
                }
                return;
            }
            if (i11 != 1003) {
                if (i11 != 9004) {
                    return;
                }
                f.a().a("Need GD. busType: 2", new Object[0]);
                if (c11 != null) {
                    c11.a(2, str);
                    return;
                }
                return;
            }
        }
        f.a().a("No need to call GD.", new Object[0]);
    }
}
