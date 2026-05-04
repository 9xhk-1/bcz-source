package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public abstract class x0<V> extends w0<V> implements p1<V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<V> extends x0<V> {

        /* renamed from: a, reason: collision with root package name */
        public final p1<V> f34909a;

        public a(p1<V> delegate) {
            this.f34909a = (p1) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.util.concurrent.x0, com.google.common.util.concurrent.w0
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public final p1<V> delegate() {
            return this.f34909a;
        }
    }

    @Override // com.google.common.util.concurrent.p1
    public void addListener(Runnable listener, Executor exec) {
        delegate().addListener(listener, exec);
    }

    @Override // com.google.common.util.concurrent.w0
    /* renamed from: x */
    public abstract p1<? extends V> delegate();
}
