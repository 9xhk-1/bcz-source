package ky;

import a00.h0;
import androidx.core.app.NotificationCompat;
import cy.h;
import h10.t;
import hy.g;
import io.ktor.http.content.VersionCheckResult;
import ix.q0;
import ix.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import ky.c;
import m80.k;
import m80.l;
import mx.e0;
import mx.v;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;
import zx.b0;
import zx.r0;
import zx.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConditionalHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConditionalHeaders.kt\nio/ktor/server/plugins/conditionalheaders/ConditionalHeadersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,132:1\n1368#2:133\n1454#2,5:134\n1628#2,3:139\n1628#2,3:142\n58#3,16:145\n*S KotlinDebug\n*F\n+ 1 ConditionalHeaders.kt\nio/ktor/server/plugins/conditionalheaders/ConditionalHeadersKt\n*L\n49#1:133\n49#1:134,5\n125#1:139,3\n128#1:142,3\n42#1:145,16\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final xy.a<List<q<zx.b, v, j00.c<? super List<? extends e0>>, Object>>> f69085a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final r0<ky.a> f69086b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<ky.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f69087a = new a();

        public a() {
            super(0, ky.a.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ky.a invoke() {
            return new ky.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.conditionalheaders.ConditionalHeadersKt$ConditionalHeaders$2$1", f = "ConditionalHeaders.kt", i = {0, 0}, l = {95}, m = "invokeSuspend", n = {"$this$on", NotificationCompat.CATEGORY_CALL}, s = {"L$0", "L$1"})
    @u0({"SMAP\nConditionalHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConditionalHeaders.kt\nio/ktor/server/plugins/conditionalheaders/ConditionalHeadersKt$ConditionalHeaders$2$1\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n23#2:133\n1863#3,2:134\n1863#3,2:136\n*S KotlinDebug\n*F\n+ 1 ConditionalHeaders.kt\nio/ktor/server/plugins/conditionalheaders/ConditionalHeadersKt$ConditionalHeaders$2$1\n*L\n98#1:133\n99#1:134,2\n105#1:136,2\n*E\n"})
    public static final class b extends SuspendLambda implements r<h.a, zx.b, v, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f69088a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f69089b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f69090c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f69091d;

        public b(j00.c<? super b> cVar) {
            super(4, cVar);
        }

        public static final g2 k(qy.q qVar, String str, List list) {
            if (!qVar.d(str)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qy.q.c(qVar, str, (String) it.next(), false, 4, null);
                }
            }
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            h.a aVar;
            zx.b bVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f69088a;
            if (i11 == 0) {
                e.n(obj);
                aVar = (h.a) this.f69089b;
                zx.b bVar2 = (zx.b) this.f69090c;
                v vVar = (v) this.f69091d;
                this.f69089b = aVar;
                this.f69090c = bVar2;
                this.f69088a = 1;
                Object h11 = c.h(bVar2, vVar, this);
                if (h11 == l11) {
                    return l11;
                }
                bVar = bVar2;
                obj = h11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (zx.b) this.f69090c;
                aVar = (h.a) this.f69089b;
                e.n(obj);
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                q0.a aVar2 = q0.f62976a;
                ix.r0 r0Var = new ix.r0(0, 1, null);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).b(r0Var);
                }
                q0 build = r0Var.build();
                final qy.q a11 = bVar.k().a();
                build.d(new p() { // from class: ky.d
                    @Override // x00.p
                    public final Object invoke(Object obj2, Object obj3) {
                        g2 k11;
                        k11 = c.b.k(qy.q.this, (String) obj2, (List) obj3);
                        return k11;
                    }
                });
            }
            VersionCheckResult c11 = c.c(bVar, list);
            if (c11 != VersionCheckResult.OK) {
                aVar.a(new g(c11.getStatusCode()));
            }
            return g2.f100423a;
        }

        @Override // x00.r
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h.a aVar, zx.b bVar, v vVar, j00.c<? super g2> cVar) {
            b bVar2 = new b(cVar);
            bVar2.f69089b = aVar;
            bVar2.f69090c = bVar;
            bVar2.f69091d = vVar;
            return bVar2.invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.conditionalheaders.ConditionalHeadersKt", f = "ConditionalHeaders.kt", i = {0, 0, 0}, l = {49}, m = "versionsFor", n = {"$this$versionsFor", "content", "destination$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: ky.c$c, reason: collision with other inner class name */
    public static final class C0831c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f69092a;

        /* renamed from: b, reason: collision with root package name */
        public Object f69093b;

        /* renamed from: c, reason: collision with root package name */
        public Object f69094c;

        /* renamed from: d, reason: collision with root package name */
        public Object f69095d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f69096e;

        /* renamed from: f, reason: collision with root package name */
        public int f69097f;

        public C0831c(j00.c<? super C0831c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f69096e = obj;
            this.f69097f |= Integer.MIN_VALUE;
            return c.h(null, null, this);
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = o0.d(List.class);
        try {
            rVar = o0.C(List.class, t.f57954c.c());
        } catch (Throwable unused) {
            rVar = null;
        }
        f69085a = new xy.a<>("ConditionalHeadersKey", new gz.a(d11, rVar));
        f69086b = b0.o("ConditionalHeaders", a.f69087a, new x00.l() { // from class: ky.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b11;
                b11 = c.b((s0) obj);
                return b11;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final g2 b(s0 createRouteScopedPlugin) {
        g0.p(createRouteScopedPlugin, "$this$createRouteScopedPlugin");
        createRouteScopedPlugin.c().getAttributes().e(f69085a, ((ky.a) createRouteScopedPlugin.l()).a());
        createRouteScopedPlugin.n(h.f46970a, new b(null));
        return g2.f100423a;
    }

    public static final VersionCheckResult c(zx.b bVar, List<? extends e0> list) {
        Iterator<? extends e0> it = list.iterator();
        while (it.hasNext()) {
            VersionCheckResult a11 = it.next().a(bVar.f().a());
            if (a11 != VersionCheckResult.OK) {
                return a11;
            }
        }
        return VersionCheckResult.OK;
    }

    @k
    public static final r0<ky.a> e() {
        return f69086b;
    }

    @k
    public static final xy.a<List<q<zx.b, v, j00.c<? super List<? extends e0>>, Object>>> f() {
        return f69085a;
    }

    @k
    public static final List<e0> g(@k q0 q0Var) {
        g0.p(q0Var, "<this>");
        y0 y0Var = y0.f63006a;
        List<String> a11 = q0Var.a(y0Var.X());
        if (a11 == null) {
            a11 = h0.J();
        }
        List<String> a12 = q0Var.a(y0Var.J());
        if (a12 == null) {
            a12 = h0.J();
        }
        ArrayList arrayList = new ArrayList(a11.size() + a12.size());
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(new mx.q(ix.e0.b((String) it.next())));
        }
        Iterator<T> it2 = a12.iterator();
        while (it2.hasNext()) {
            arrayList.add(mx.g0.a((String) it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:10:0x0089). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(@m80.k zx.b r6, @m80.k mx.v r7, @m80.k j00.c<? super java.util.List<? extends mx.e0>> r8) {
        /*
            boolean r0 = r8 instanceof ky.c.C0831c
            if (r0 == 0) goto L13
            r0 = r8
            ky.c$c r0 = (ky.c.C0831c) r0
            int r1 = r0.f69097f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69097f = r1
            goto L18
        L13:
            ky.c$c r0 = new ky.c$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f69096e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f69097f
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r6 = r0.f69095d
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.f69094c
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Object r2 = r0.f69093b
            mx.v r2 = (mx.v) r2
            java.lang.Object r4 = r0.f69092a
            zx.b r4 = (zx.b) r4
            kotlin.e.n(r8)
            r5 = r4
            r4 = r7
            r7 = r5
            goto L89
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            kotlin.e.n(r8)
            zx.a r8 = r6.w0()
            xy.b r8 = r8.getAttributes()
            xy.a<java.util.List<x00.q<zx.b, mx.v, j00.c<? super java.util.List<? extends mx.e0>>, java.lang.Object>>> r2 = ky.c.f69085a
            java.lang.Object r8 = r8.a(r2)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L97
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L68:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r6.next()
            x00.q r4 = (x00.q) r4
            r0.f69092a = r7
            r0.f69093b = r8
            r0.f69094c = r2
            r0.f69095d = r6
            r0.f69097f = r3
            java.lang.Object r4 = r4.invoke(r7, r8, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            r5 = r2
            r2 = r8
            r8 = r4
            r4 = r5
        L89:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            a00.m0.s0(r4, r8)
            r8 = r2
            r2 = r4
            goto L68
        L91:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L96
            goto L97
        L96:
            return r2
        L97:
            java.util.List r6 = a00.h0.J()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ky.c.h(zx.b, mx.v, j00.c):java.lang.Object");
    }
}
