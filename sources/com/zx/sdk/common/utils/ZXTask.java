package com.zx.sdk.common.utils;

import com.igexin.sdk.PushConsts;
import com.zx.a.I8b7.e2;
import com.zx.a.I8b7.g3;
import com.zx.a.I8b7.r3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ZXTask implements Runnable {
    private a errorCallback;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f46768r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
    }

    public ZXTask(Runnable runnable, a aVar) {
        this.f46768r = runnable;
        this.errorCallback = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Runnable runnable = this.f46768r;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable th2) {
            a aVar = this.errorCallback;
            if (aVar != null) {
                ((r3) aVar).f46681a.f46704c.onMessage("MESSAGE_ON_ZXID_RECEIVED", e2.a(PushConsts.GET_SDKSERVICEPID, th2.getMessage()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ZXCore start failed: ");
                g3.a(th2, sb2);
            }
        }
    }
}
