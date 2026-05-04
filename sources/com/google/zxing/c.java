package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f35056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35057b;

    public c(int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException();
        }
        this.f35056a = i11;
        this.f35057b = i12;
    }

    public int a() {
        return this.f35057b;
    }

    public int b() {
        return this.f35056a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f35056a == cVar.f35056a && this.f35057b == cVar.f35057b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f35056a * 32713) + this.f35057b;
    }

    public String toString() {
        return this.f35056a + "x" + this.f35057b;
    }
}
