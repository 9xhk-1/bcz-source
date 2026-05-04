package io.ktor.utils.io;

import java.io.IOException;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<j00.c<? super g2>, Object>, l00.l {
        public a(Object obj) {
            super(1, obj, m.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((m) this.receiver).j(cVar);
        }
    }

    public static final void a(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        bVar.a(new IOException("Channel was cancelled"));
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Cancel without reason is deprecated. Please provide a cause for cancellation.", replaceWith = @w0(expression = "cancel(IOException())", imports = {"kotlinx.coroutines.cancel"}))
    public static final void b(@m80.k m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        mVar.a(new IOException("Channel was cancelled"));
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Async close is deprecated. Please consider replacing it with flushAndClose or cancel ", replaceWith = @w0(expression = "flushAndClose()", imports = {}))
    public static final void c(@m80.k m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        q.f(new a(mVar));
    }

    @m80.l
    @b0
    public static final Object d(@m80.k m mVar, @m80.k j00.c<? super g2> cVar) {
        j.W(mVar);
        b bVar = mVar instanceof b ? (b) mVar : null;
        if ((bVar == null || !bVar.n()) && jz.h.f(mVar.i()) < 1048576) {
            return g2.f100423a;
        }
        Object g11 = mVar.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
