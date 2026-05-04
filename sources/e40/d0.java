package e40;

import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.x0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0<E> extends e40.a<E> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public j00.c<? super g2> f49021e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.q<d0<?>, k40.n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49022a = new a();

        public a() {
            super(3, d0.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(d0<?> d0Var, k40.n<?> nVar, Object obj) {
            d0Var.h2(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(d0<?> d0Var, k40.n<?> nVar, Object obj) {
            a(d0Var, nVar, obj);
            return g2.f100423a;
        }
    }

    public d0(@m80.k kotlin.coroutines.d dVar, @m80.k o<E> oVar, @m80.k x00.p<? super c<E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        super(dVar, oVar, false);
        this.f49021e = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    @Override // c40.r2
    public void G1() {
        i40.a.c(this.f49021e, this);
    }

    @Override // e40.p, e40.l0
    @m80.l
    public Object b(E e11, @m80.k j00.c<? super g2> cVar) {
        start();
        Object b11 = super.b(e11, cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // e40.p, e40.l0
    @m80.k
    public k40.j<E, l0<E>> d() {
        a aVar = a.f49022a;
        kotlin.jvm.internal.g0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new k40.k(this, (x00.q) x0.q(aVar, 3), super.d().b(), null, 8, null);
    }

    public final void h2(k40.n<?> nVar, Object obj) {
        G1();
        super.d().c().invoke(this, nVar, obj);
    }

    @Override // e40.p, e40.l0
    @m80.k
    public Object m(E e11) {
        start();
        return super.m(e11);
    }

    @Override // e40.p, e40.l0
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @w0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e11) {
        start();
        return super.offer(e11);
    }

    @Override // e40.p, e40.l0
    public boolean z(@m80.l Throwable th2) {
        boolean z11 = super.z(th2);
        start();
        return z11;
    }

    public static /* synthetic */ void g2() {
    }
}
