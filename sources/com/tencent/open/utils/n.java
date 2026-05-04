package com.tencent.open.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class n implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private long f44618a;

    public n(long j11) {
        this.f44618a = j11;
    }

    public byte[] a() {
        long j11 = this.f44618a;
        return new byte[]{(byte) (255 & j11), (byte) ((65280 & j11) >> 8), (byte) ((16711680 & j11) >> 16), (byte) ((j11 & 4278190080L) >> 24)};
    }

    public long b() {
        return this.f44618a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof n) && this.f44618a == ((n) obj).b();
    }

    public int hashCode() {
        return (int) this.f44618a;
    }
}
