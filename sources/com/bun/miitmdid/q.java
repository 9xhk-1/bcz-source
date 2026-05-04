package com.bun.miitmdid;

import android.content.Context;
import com.hihonor.ads.identifier.AdvertisingIdClient;

/* loaded from: classes6.dex */
public class q extends n {

    /* renamed from: g, reason: collision with root package name */
    public Context f28972g;

    /* renamed from: h, reason: collision with root package name */
    public AdvertisingIdClient.Info f28973h;

    public q(Context context) {
        this.f28972g = checkContext(context);
        i0.c("HonorProvider", "enter into HonorProvider");
    }

    @Override // com.bun.miitmdid.n
    public native g a();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native String getAAID();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native String getOAID();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native String getVAID();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isLimited();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isSupported();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
