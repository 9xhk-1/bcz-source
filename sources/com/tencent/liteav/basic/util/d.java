package com.tencent.liteav.basic.util;

import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f43435a;

    /* renamed from: b, reason: collision with root package name */
    public int f43436b;

    public d() {
        this(0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f43435a == this.f43435a && dVar.f43436b == this.f43436b;
    }

    public int hashCode() {
        return (this.f43435a * 32713) + this.f43436b;
    }

    public String toString() {
        return "Size(" + this.f43435a + j2.O + this.f43436b + pn.j.f81007d;
    }

    public d(int i11, int i12) {
        this.f43435a = i11;
        this.f43436b = i12;
    }
}
