package com.bun.miitmdid;

import android.content.Context;

/* loaded from: classes6.dex */
public class f0 extends n {

    /* renamed from: g, reason: collision with root package name */
    public Context f28919g;

    public f0(Context context) {
        this.f28919g = context;
    }

    @Override // com.bun.miitmdid.n
    public native g a();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();
}
