package kotlinx.coroutines.flow.internal;

import h40.g1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f68291a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object f68292b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.p<T, j00.c<? super g2>, Object> f68293c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68294a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68295b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<T> f68296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.j<? super T> jVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68296c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68296c, cVar);
            aVar.f68295b = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t11, j00.c<? super g2> cVar) {
            return ((a) create(t11, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68294a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Object obj2 = this.f68295b;
                kotlinx.coroutines.flow.j<T> jVar = this.f68296c;
                this.f68294a = 1;
                if (jVar.emit(obj2, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, j00.c<? super g2> cVar) {
            return invoke2((a) obj, cVar);
        }
    }

    public z(@m80.k kotlinx.coroutines.flow.j<? super T> jVar, @m80.k kotlin.coroutines.d dVar) {
        this.f68291a = dVar;
        this.f68292b = g1.g(dVar);
        this.f68293c = new a(jVar, null);
    }

    @Override // kotlinx.coroutines.flow.j
    @m80.l
    public Object emit(T t11, @m80.k j00.c<? super g2> cVar) {
        Object c11 = e.c(this.f68291a, t11, this.f68292b, this.f68293c, cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }
}
