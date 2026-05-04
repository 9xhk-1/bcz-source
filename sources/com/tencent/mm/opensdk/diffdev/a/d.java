package com.tencent.mm.opensdk.diffdev.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);


    /* renamed from: a, reason: collision with root package name */
    private int f44373a;

    d(int i11) {
        this.f44373a = i11;
    }

    public int a() {
        return this.f44373a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f44373a;
    }
}
