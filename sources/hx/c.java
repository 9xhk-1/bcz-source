package hx;

import c40.k1;
import io.ktor.util.internal.f;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import x00.l;
import yz.g2;
import yz.r;
import zy.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEvents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Events.kt\nio/ktor/events/Events\n+ 2 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListHead\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n785#2,6:90\n785#2,3:96\n788#2,3:100\n1#3:99\n*S KotlinDebug\n*F\n+ 1 Events.kt\nio/ktor/events/Events\n*L\n30#1:90,6\n43#1:96,3\n43#1:100,3\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g<hx.a<?>, io.ktor.util.internal.d> f59793a = new g<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends f implements k1 {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final l<?, g2> f59794d;

        public a(@k l<?, g2> handler) {
            g0.p(handler, "handler");
            this.f59794d = handler;
        }

        @k
        public final l<?, g2> I() {
            return this.f59794d;
        }

        @Override // c40.k1
        public void dispose() {
            B();
        }
    }

    public static final io.ktor.util.internal.d d(hx.a it) {
        g0.p(it, "it");
        return new io.ktor.util.internal.d();
    }

    public final <T> void b(@k hx.a<T> definition, T t11) {
        g0.p(definition, "definition");
        io.ktor.util.internal.d b11 = this.f59793a.b(definition);
        Throwable th2 = null;
        if (b11 != null) {
            Object s11 = b11.s();
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (f fVar = (f) s11; !g0.g(fVar, b11); fVar = fVar.t()) {
                if (fVar instanceof a) {
                    try {
                        l<?, g2> I = ((a) fVar).I();
                        g0.n(I, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>");
                        ((l) x0.q(I, 1)).invoke(t11);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            r.a(th2, th3);
                        } else {
                            th2 = th3;
                        }
                    }
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    @k
    public final <T> k1 c(@k hx.a<T> definition, @k l<? super T, g2> handler) {
        g0.p(definition, "definition");
        g0.p(handler, "handler");
        a aVar = new a(handler);
        this.f59793a.a(definition, new l() { // from class: hx.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                io.ktor.util.internal.d d11;
                d11 = c.d((a) obj);
                return d11;
            }
        }).f(aVar);
        return aVar;
    }

    public final <T> void e(@k hx.a<T> definition, @k l<? super T, g2> handler) {
        g0.p(definition, "definition");
        g0.p(handler, "handler");
        io.ktor.util.internal.d b11 = this.f59793a.b(definition);
        if (b11 != null) {
            Object s11 = b11.s();
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            for (f fVar = (f) s11; !g0.g(fVar, b11); fVar = fVar.t()) {
                if (fVar instanceof a) {
                    a aVar = (a) fVar;
                    if (g0.g(aVar.I(), handler)) {
                        aVar.B();
                    }
                }
            }
        }
    }
}
