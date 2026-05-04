package com.huawei.hms.framework.network.grs.g.j;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f35721a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35722b = SystemClock.elapsedRealtime();

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.f35721a = future;
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f35721a;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f35722b <= 300000;
    }
}
