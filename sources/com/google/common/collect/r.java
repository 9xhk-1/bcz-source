package com.google.common.collect;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b(serializable = true)
/* loaded from: classes7.dex */
public final class r extends s7<Object> implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final r f33808c = new r();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f33808c;
    }

    @Override // com.google.common.collect.s7
    public <E> List<E> G(Iterable<E> iterable) {
        return q6.r(iterable);
    }

    @Override // com.google.common.collect.s7, java.util.Comparator
    public int compare(@CheckForNull Object left, @CheckForNull Object right) {
        return 0;
    }

    @Override // com.google.common.collect.s7
    public <E> ImmutableList<E> l(Iterable<E> iterable) {
        return ImmutableList.copyOf(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }

    @Override // com.google.common.collect.s7
    public <S> s7<S> F() {
        return this;
    }
}
