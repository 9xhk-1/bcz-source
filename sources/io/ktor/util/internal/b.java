package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class b<T> extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62009a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");

    @k
    private volatile /* synthetic */ Object _consensus;

    public b() {
        Object obj;
        obj = e.f62017h;
        this._consensus = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.internal.g
    @l
    public final Object a(@l Object obj) {
        Object obj2;
        Object obj3 = this._consensus;
        obj2 = e.f62017h;
        if (obj3 == obj2) {
            obj3 = c(e(obj));
        }
        b(obj, obj3);
        return obj3;
    }

    public abstract void b(T t11, @l Object obj);

    public final Object c(Object obj) {
        return f(obj) ? obj : this._consensus;
    }

    public final boolean d() {
        Object obj;
        Object obj2 = this._consensus;
        obj = e.f62017h;
        return obj2 != obj;
    }

    @l
    public abstract Object e(T t11);

    public final boolean f(@l Object obj) {
        Object obj2;
        Object obj3;
        obj2 = e.f62017h;
        if (obj == obj2) {
            throw new IllegalStateException("Check failed.");
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62009a;
        obj3 = e.f62017h;
        return androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, obj);
    }
}
