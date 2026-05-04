package wf;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import ij.z;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class u implements wf.a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f96248d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ij.q f96249a;

    /* renamed from: b, reason: collision with root package name */
    public final long f96250b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f96251c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.collectreview.model.WordBookLoader$load$1$1", f = "WordBookLoader.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends List<? extends z>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f96252a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ij.q f96253b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f96254c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ij.q qVar, u uVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f96253b = qVar;
            this.f96254c = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f96253b, this.f96254c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Result<? extends List<z>>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object k02;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f96252a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q qVar = this.f96253b;
                long j11 = this.f96254c.f96250b;
                this.f96252a = 1;
                k02 = qVar.k0(j11, false, this);
                if (k02 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                k02 = ((Result) obj).m6317unboximpl();
            }
            return Result.m6307boximpl(k02);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends List<? extends z>>> cVar) {
            return invoke2(r0Var, (j00.c<? super Result<? extends List<z>>>) cVar);
        }
    }

    public u(@m80.k ij.q manager, long j11) {
        g0.p(manager, "manager");
        this.f96249a = manager;
        this.f96250b = j11;
        this.f96251c = e0.c(new x00.a() { // from class: wf.t
            @Override // x00.a
            public final Object invoke() {
                rx.c p11;
                p11 = u.p(u.this);
                return p11;
            }
        });
    }

    public static final List j(u uVar, ij.q qVar) {
        Object b11;
        b11 = c40.j.b(null, new a(qVar, uVar, null), 1, null);
        Object m6317unboximpl = ((Result) b11).m6317unboximpl();
        kotlin.e.n(m6317unboximpl);
        return (List) m6317unboximpl;
    }

    public static final List k(x00.l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    public static final rx.c l(List list) {
        return rx.c.u2(list);
    }

    public static final rx.c m(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final m n(z zVar) {
        m b11;
        g0.m(zVar);
        b11 = v.b(zVar);
        return b11;
    }

    public static final m o(x00.l lVar, Object obj) {
        return (m) lVar.invoke(obj);
    }

    public static final rx.c p(u uVar) {
        return rx.c.M2(uVar.f96249a);
    }

    public final rx.c<ij.q> i() {
        return (rx.c) this.f96251c.getValue();
    }

    @Override // wf.a
    @m80.k
    public rx.c<List<m>> load() {
        rx.c<ij.q> i11 = i();
        final x00.l lVar = new x00.l() { // from class: wf.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                List j11;
                j11 = u.j(u.this, (ij.q) obj);
                return j11;
            }
        };
        rx.c I3 = i11.c3(new wb0.p() { // from class: wf.o
            @Override // wb0.p
            public final Object call(Object obj) {
                List k11;
                k11 = u.k(x00.l.this, obj);
                return k11;
            }
        }).I3(bc0.c.e());
        final x00.l lVar2 = new x00.l() { // from class: wf.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c l11;
                l11 = u.l((List) obj);
                return l11;
            }
        };
        rx.c b22 = I3.b2(new wb0.p() { // from class: wf.q
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c m11;
                m11 = u.m(x00.l.this, obj);
                return m11;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: wf.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                m n11;
                n11 = u.n((z) obj);
                return n11;
            }
        };
        rx.c<List<m>> w52 = b22.c3(new wb0.p() { // from class: wf.s
            @Override // wb0.p
            public final Object call(Object obj) {
                m o11;
                o11 = u.o(x00.l.this, obj);
                return o11;
            }
        }).v6().w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }
}
