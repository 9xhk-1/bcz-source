package k40;

import c40.a1;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.x0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f65811a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.q<b, n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f65812a = new a();

        public a() {
            super(3, b.class, MiPushClient.COMMAND_REGISTER, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(b bVar, n<?> nVar, Object obj) {
            bVar.e(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(b bVar, n<?> nVar, Object obj) {
            a(bVar, nVar, obj);
            return g2.f100423a;
        }
    }

    public b(long j11) {
        this.f65811a = j11;
    }

    public static final void f(n nVar, b bVar) {
        nVar.h(bVar, g2.f100423a);
    }

    @m80.k
    public final f c() {
        a aVar = a.f65812a;
        g0.n(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new g(this, (x00.q) x0.q(aVar, 3), null, 4, null);
    }

    public final void e(final n<?> nVar, Object obj) {
        if (this.f65811a <= 0) {
            nVar.e(g2.f100423a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: k40.a
            @Override // java.lang.Runnable
            public final void run() {
                b.f(n.this, this);
            }
        };
        g0.n(nVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        m mVar = (m) nVar;
        kotlin.coroutines.d context = mVar.getContext();
        mVar.g(a1.d(context).f(this.f65811a, runnable, context));
    }

    public static /* synthetic */ void d() {
    }
}
