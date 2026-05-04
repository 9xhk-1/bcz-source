package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u0<V> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final V f10218a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f10219b;

    public u0(V v11) {
        this.f10218a = v11;
        this.f10219b = null;
    }

    @Nullable
    public Throwable a() {
        return this.f10219b;
    }

    @Nullable
    public V b() {
        return this.f10218a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (b() != null && b().equals(u0Var.b())) {
            return true;
        }
        if (a() == null || u0Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public u0(Throwable th2) {
        this.f10219b = th2;
        this.f10218a = null;
    }
}
