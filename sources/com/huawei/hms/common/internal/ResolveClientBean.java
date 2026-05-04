package com.huawei.hms.common.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ResolveClientBean {

    /* renamed from: a, reason: collision with root package name */
    private final int f35584a;

    /* renamed from: b, reason: collision with root package name */
    private final AnyClient f35585b;

    /* renamed from: c, reason: collision with root package name */
    private int f35586c;

    public ResolveClientBean(AnyClient anyClient, int i11) {
        this.f35585b = anyClient;
        this.f35584a = Objects.hashCode(anyClient);
        this.f35586c = i11;
    }

    public void clientReconnect() {
        this.f35585b.connect(this.f35586c, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ResolveClientBean)) {
            return false;
        }
        return this.f35585b.equals(((ResolveClientBean) obj).f35585b);
    }

    public AnyClient getClient() {
        return this.f35585b;
    }

    public int hashCode() {
        return this.f35584a;
    }
}
