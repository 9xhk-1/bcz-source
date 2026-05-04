package com.bun.miitmdid;

/* loaded from: classes6.dex */
public abstract class n extends o {

    /* renamed from: b, reason: collision with root package name */
    public String f28959b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f28960c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f28961d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f28962e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28963f = false;

    /* renamed from: a, reason: collision with root package name */
    public g f28958a = a();

    public abstract g a();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getAAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getOAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native String getVAID();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isLimited();

    @Override // com.bun.miitmdid.interfaces.IdSupplier
    public native boolean isSupported();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}
