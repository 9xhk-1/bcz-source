package pz;

import kotlin.jvm.internal.g0;
import m80.k;
import pz.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class g<T> implements h<T> {
    @Override // pz.h
    public void b4(@k T instance) {
        g0.p(instance, "instance");
    }

    @Override // pz.h, java.lang.AutoCloseable
    public void close() {
        h.a.a(this);
    }

    @Override // pz.h
    public int getCapacity() {
        return 0;
    }

    @Override // pz.h
    public void dispose() {
    }
}
