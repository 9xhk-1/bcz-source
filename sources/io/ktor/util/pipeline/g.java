package io.ktor.util.pipeline;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @m80.l
    public static final <TSubject, TContext> Object a(@m80.k q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> interceptor, @m80.k d<TSubject, TContext> context, @m80.k TSubject subject, @m80.k j00.c<? super g2> continuation) {
        g0.p(interceptor, "interceptor");
        g0.p(context, "context");
        g0.p(subject, "subject");
        g0.p(continuation, "continuation");
        return ((q) x0.q(interceptor, 3)).invoke(context, subject, continuation);
    }
}
