package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x00.q<kotlinx.coroutines.flow.j<Object>, Object, j00.c<? super g2>, Object> f68285a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.q<kotlinx.coroutines.flow.j<? super Object>, Object, j00.c<? super g2>, Object>, l00.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f68286a = new a();

        public a() {
            super(3, kotlinx.coroutines.flow.j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<Object> jVar, Object obj, j00.c<? super g2> cVar) {
            return jVar.emit(obj, cVar);
        }
    }

    static {
        a aVar = a.f68286a;
        g0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f68285a = (x00.q) x0.q(aVar, 3);
    }

    public static /* synthetic */ void b() {
    }
}
