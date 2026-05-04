package io.ktor.util.pipeline;

import java.util.List;
import kotlin.jvm.internal.g0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final <TSubject, TContext> d<TSubject, TContext> a(@m80.k TContext context, @m80.k List<? extends q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object>> interceptors, @m80.k TSubject subject, @m80.k kotlin.coroutines.d coroutineContext, boolean z11) {
        g0.p(context, "context");
        g0.p(interceptors, "interceptors");
        g0.p(subject, "subject");
        g0.p(coroutineContext, "coroutineContext");
        return (f.a() || z11) ? new a(context, interceptors, subject, coroutineContext) : new n(subject, context, interceptors);
    }

    public static /* synthetic */ d b(Object obj, List list, Object obj2, kotlin.coroutines.d dVar, boolean z11, int i11, Object obj3) {
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return a(obj, list, obj2, dVar, z11);
    }
}
