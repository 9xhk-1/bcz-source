package com.tencent.liteav.network.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f43721a = new d(a.NO_NETWORK, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final d f43722b = new d(a.WIFI, 0);

    /* renamed from: c, reason: collision with root package name */
    public final int f43723c;

    /* renamed from: d, reason: collision with root package name */
    public final a f43724d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public d(a aVar, int i11) {
        this.f43724d = aVar;
        this.f43723c = i11;
    }
}
