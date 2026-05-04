package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class d0<T extends i> implements b0<T> {

    /* renamed from: a, reason: collision with root package name */
    public Object f78087a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f78088b = true;

    public final Object b() {
        return this.f78087a;
    }

    public final boolean c() {
        return this.f78088b;
    }

    public final void d() {
        this.f78088b = false;
    }

    public final void e() {
        this.f78088b = true;
        this.f78087a = null;
    }

    public final void f(Object obj) {
        this.f78087a = obj;
        d();
    }
}
