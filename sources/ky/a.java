package ky;

import io.ktor.utils.io.c0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import m80.k;
import mx.e0;
import mx.g0;
import mx.v;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<q<zx.b, v, j00.c<? super List<? extends e0>>, Object>> f69079a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.conditionalheaders.ConditionalHeadersConfig$1", f = "ConditionalHeaders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ky.a$a, reason: collision with other inner class name */
    public static final class C0830a extends SuspendLambda implements q<zx.b, v, j00.c<? super List<? extends e0>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f69080a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f69081b;

        public C0830a(j00.c<? super C0830a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, v vVar, j00.c<? super List<? extends e0>> cVar) {
            C0830a c0830a = new C0830a(cVar);
            c0830a.f69081b = vVar;
            return c0830a.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f69080a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return g0.c((v) this.f69081b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.conditionalheaders.ConditionalHeadersConfig$2", f = "ConditionalHeaders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nConditionalHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConditionalHeaders.kt\nio/ktor/server/plugins/conditionalheaders/ConditionalHeadersConfig$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    public static final class b extends SuspendLambda implements q<zx.b, v, j00.c<? super List<? extends e0>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f69082a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f69083b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f69084c;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, v vVar, j00.c<? super List<? extends e0>> cVar) {
            b bVar2 = new b(cVar);
            bVar2.f69083b = bVar;
            bVar2.f69084c = vVar;
            return bVar2.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f69082a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            zx.b bVar = (zx.b) this.f69083b;
            List<e0> g11 = c.g(((v) this.f69084c).d());
            if (g11.isEmpty()) {
                g11 = null;
            }
            return g11 == null ? c.g(bVar.k().a().a()) : g11;
        }
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.f69079a = arrayList;
        arrayList.add(new C0830a(null));
        arrayList.add(new b(null));
    }

    @k
    public final List<q<zx.b, v, j00.c<? super List<? extends e0>>, Object>> a() {
        return this.f69079a;
    }

    public final void b(@k q<? super zx.b, ? super v, ? super j00.c<? super List<? extends e0>>, ? extends Object> provider) {
        kotlin.jvm.internal.g0.p(provider, "provider");
        this.f69079a.add(provider);
    }
}
