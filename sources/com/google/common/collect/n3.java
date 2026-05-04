package com.google.common.collect;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public final class n3 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public int f33684a;

    public n3(int value) {
        this.f33684a = value;
    }

    public void a(int delta) {
        this.f33684a += delta;
    }

    public int b(int delta) {
        int i11 = this.f33684a + delta;
        this.f33684a = i11;
        return i11;
    }

    public int c() {
        return this.f33684a;
    }

    public int d(int newValue) {
        int i11 = this.f33684a;
        this.f33684a = newValue;
        return i11;
    }

    public void e(int newValue) {
        this.f33684a = newValue;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof n3) && ((n3) obj).f33684a == this.f33684a;
    }

    public int hashCode() {
        return this.f33684a;
    }

    public String toString() {
        return Integer.toString(this.f33684a);
    }
}
