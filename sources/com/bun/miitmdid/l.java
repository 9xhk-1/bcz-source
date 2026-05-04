package com.bun.miitmdid;

import android.content.Context;
import com.android.msasdk.FreemeIdsSupplier;
import com.android.msasdk.IConnect;

/* loaded from: classes6.dex */
public class l extends m implements IConnect {

    /* renamed from: a, reason: collision with root package name */
    public Context f28953a;

    /* renamed from: b, reason: collision with root package name */
    public String f28954b;

    /* renamed from: c, reason: collision with root package name */
    public FreemeIdsSupplier f28955c;

    public l(Context context) {
        this.f28953a = context;
    }

    @Override // com.android.msasdk.IConnect
    public native void connectSuccess(boolean z11);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
