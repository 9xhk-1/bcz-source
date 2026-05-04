package com.huawei.hms.ads.identifier;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f35331a = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());

    /* renamed from: b, reason: collision with root package name */
    public boolean f35332b = false;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedBlockingQueue<IBinder> f35333c = new LinkedBlockingQueue<>(1);

    /* renamed from: com.huawei.hms.ads.identifier.a$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IBinder f35334a;

        public AnonymousClass1(IBinder iBinder) {
            this.f35334a = iBinder;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    public native IBinder a();

    @Override // android.content.ServiceConnection
    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    @Override // android.content.ServiceConnection
    public native void onServiceDisconnected(ComponentName componentName);
}
