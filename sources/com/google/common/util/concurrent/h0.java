package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.q6;
import com.google.common.util.concurrent.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class h0<V, C> extends u<V, C> {

    /* renamed from: q, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public List<b<V>> f34662q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<V> extends h0<V, List<V>> {
        public a(ImmutableCollection<? extends p1<? extends V>> futures, boolean allMustSucceed) {
            super(futures, allMustSucceed);
            U();
        }

        @Override // com.google.common.util.concurrent.h0
        /* renamed from: a0, reason: merged with bridge method [inline-methods] */
        public List<V> Z(List<b<V>> values) {
            ArrayList u11 = q6.u(values.size());
            Iterator<b<V>> it = values.iterator();
            while (it.hasNext()) {
                b<V> next = it.next();
                u11.add(next != null ? next.f34663a : null);
            }
            return Collections.unmodifiableList(u11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<V> {

        /* renamed from: a, reason: collision with root package name */
        @z1
        public final V f34663a;

        public b(@z1 V value) {
            this.f34663a = value;
        }
    }

    public h0(ImmutableCollection<? extends p1<? extends V>> futures, boolean allMustSucceed) {
        super(futures, allMustSucceed, true);
        List<b<V>> u11 = futures.isEmpty() ? Collections.EMPTY_LIST : q6.u(futures.size());
        for (int i11 = 0; i11 < futures.size(); i11++) {
            u11.add(null);
        }
        this.f34662q = u11;
    }

    @Override // com.google.common.util.concurrent.u
    public final void P(int index, @z1 V returnValue) {
        List<b<V>> list = this.f34662q;
        if (list != null) {
            list.set(index, new b<>(returnValue));
        }
    }

    @Override // com.google.common.util.concurrent.u
    public final void S() {
        List<b<V>> list = this.f34662q;
        if (list != null) {
            B(Z(list));
        }
    }

    @Override // com.google.common.util.concurrent.u
    public void Y(u.a reason) {
        super.Y(reason);
        this.f34662q = null;
    }

    public abstract C Z(List<b<V>> values);
}
