package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private static final long f43442a = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: b, reason: collision with root package name */
    private final Handler f43443b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f43444c;

    public f(Looper looper) {
        super(looper);
        this.f43443b = new Handler(Looper.getMainLooper());
        this.f43444c = new Runnable() { // from class: com.tencent.liteav.basic.util.f.1
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.e("TXCHandler", "quit looper failed. " + f.this.getLooper());
            }
        };
    }
}
