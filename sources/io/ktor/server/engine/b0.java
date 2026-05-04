package io.ktor.server.engine;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.server.plugins.BadRequestException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mx.b0;
import org.slf4j.Logger;
import py.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f61302a = ez.a.a("io.ktor.server.engine.DefaultTransform");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$1", f = "DefaultTransform.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.u0({"SMAP\nDefaultTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt$installDefaultTransformations$1\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n*L\n1#1,127:1\n79#2:128\n*S KotlinDebug\n*F\n+ 1 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt$installDefaultTransformations$1\n*L\n28#1:128\n*E\n"})
    public static final class a extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, zx.k0>, Object, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61303a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61304b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61305c;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, zx.k0> dVar, Object obj, j00.c<? super yz.g2> cVar) {
            a aVar = new a(cVar);
            aVar.f61304b = dVar;
            aVar.f61305c = obj;
            return aVar.invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61303a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.util.pipeline.d dVar = (io.ktor.util.pipeline.d) this.f61304b;
                mx.v a11 = hy.d.a((zx.k0) dVar.d(), this.f61305c);
                if (a11 != null) {
                    this.f61304b = null;
                    this.f61303a = 1;
                    if (dVar.i(a11, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2", f = "DefaultTransform.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {42, 47, 53, 69, 73}, m = "invokeSuspend", n = {"$this$intercept", TtmlNode.TAG_BODY, "$this$intercept", TtmlNode.TAG_BODY, "$this$intercept", TtmlNode.TAG_BODY, "$this$intercept", TtmlNode.TAG_BODY}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    @kotlin.jvm.internal.u0({"SMAP\nDefaultTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt$installDefaultTransformations$2\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt\n+ 4 Parameters.kt\nio/ktor/http/Parameters$Companion\n*L\n1#1,127:1\n79#2:128\n79#2:129\n79#2:138\n79#2:140\n79#2:141\n79#2:142\n98#3,8:130\n24#4:139\n*S KotlinDebug\n*F\n+ 1 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt$installDefaultTransformations$2\n*L\n40#1:128\n44#1:129\n47#1:138\n72#1:140\n76#1:141\n77#1:142\n44#1:130,8\n52#1:139\n*E\n"})
    public static final class b extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, zx.k0>, Object, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f61306a;

        /* renamed from: b, reason: collision with root package name */
        public int f61307b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61308c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61309d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2$transformed$1$1", f = "DefaultTransform.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<mx.b0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61310a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f61311b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ix.q1 f61312c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ix.q1 q1Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f61312c = q1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f61312c, cVar);
                aVar.f61311b = obj;
                return aVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mx.b0 b0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(b0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String i11;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f61310a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                mx.b0 b0Var = (mx.b0) this.f61311b;
                if ((b0Var instanceof b0.d) && (i11 = b0Var.i()) != null) {
                    this.f61312c.k(i11, ((b0.d) b0Var).j());
                }
                b0Var.g().invoke();
                return yz.g2.f100423a;
            }
        }

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, zx.k0> dVar, Object obj, j00.c<? super yz.g2> cVar) {
            b bVar = new b(cVar);
            bVar.f61308c = dVar;
            bVar.f61309d = obj;
            return bVar.invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x01c4, code lost:
        
            if (r5.i(r4, r16) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
        
            if (r4 == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x016d, code lost:
        
            r5 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x016a, code lost:
        
            if (r4 == r0) goto L62;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x01c7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$3", f = "DefaultTransform.kt", i = {0}, l = {87, 88}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    @kotlin.jvm.internal.u0({"SMAP\nDefaultTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt$installDefaultTransformations$3\n+ 2 ApplicationCallPipeline.kt\nio/ktor/server/application/ApplicationCallPipelineKt\n+ 3 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt\n*L\n1#1,127:1\n79#2:128\n79#2:129\n98#3,8:130\n*S KotlinDebug\n*F\n+ 1 DefaultTransform.kt\nio/ktor/server/engine/DefaultTransformKt$installDefaultTransformations$3\n*L\n85#1:128\n86#1:129\n86#1:130,8\n*E\n"})
    public static final class c extends SuspendLambda implements x00.q<io.ktor.util.pipeline.d<Object, zx.k0>, Object, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61313a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61314b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61315c;

        public c(j00.c<? super c> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        public final Object invoke(io.ktor.util.pipeline.d<Object, zx.k0> dVar, Object obj, j00.c<? super yz.g2> cVar) {
            c cVar2 = new c(cVar);
            cVar2.f61314b = dVar;
            cVar2.f61315c = obj;
            return cVar2.invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
        
            if (r1.i((java.lang.String) r8, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        
            if (r8 == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f61313a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.e.n(r8)
                goto L88
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r1 = r7.f61314b
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                kotlin.e.n(r8)
                goto L7b
            L24:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f61314b
                r1 = r8
                io.ktor.util.pipeline.d r1 = (io.ktor.util.pipeline.d) r1
                java.lang.Object r8 = r7.f61315c
                boolean r5 = r8 instanceof io.ktor.utils.io.g
                if (r5 == 0) goto L35
                io.ktor.utils.io.g r8 = (io.ktor.utils.io.g) r8
                goto L36
            L35:
                r8 = r2
            L36:
                if (r8 != 0) goto L3b
                yz.g2 r8 = yz.g2.f100423a
                return r8
            L3b:
                java.lang.Object r5 = r1.d()
                zx.k0 r5 = (zx.k0) r5
                gz.a r5 = zx.l0.b(r5)
                h10.d r5 = r5.b()
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                h10.d r6 = kotlin.jvm.internal.o0.d(r6)
                boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
                if (r5 != 0) goto L58
                yz.g2 r8 = yz.g2.f100423a
                return r8
            L58:
                java.lang.Object r5 = r1.d()
                zx.k0 r5 = (zx.k0) r5
                java.lang.Object r6 = r1.d()     // Catch: io.ktor.http.BadContentTypeFormatException -> L8b
                zx.k0 r6 = (zx.k0) r6     // Catch: io.ktor.http.BadContentTypeFormatException -> L8b
                py.g r6 = r6.f()     // Catch: io.ktor.http.BadContentTypeFormatException -> L8b
                java.nio.charset.Charset r5 = py.e.k(r6)     // Catch: io.ktor.http.BadContentTypeFormatException -> L8b
                if (r5 != 0) goto L70
                java.nio.charset.Charset r5 = u30.d.f91599b
            L70:
                r7.f61314b = r1
                r7.f61313a = r4
                java.lang.Object r8 = io.ktor.server.engine.b0.d(r8, r5, r7)
                if (r8 != r0) goto L7b
                goto L87
            L7b:
                java.lang.String r8 = (java.lang.String) r8
                r7.f61314b = r2
                r7.f61313a = r3
                java.lang.Object r8 = r1.i(r8, r7)
                if (r8 != r0) goto L88
            L87:
                return r0
            L88:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            L8b:
                r8 = move-exception
                io.ktor.server.plugins.BadRequestException r0 = new io.ktor.server.plugins.BadRequestException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Illegal Content-Type header format: "
                r1.append(r2)
                py.g r2 = r5.f()
                ix.q0 r2 = r2.a()
                ix.y0 r3 = ix.y0.f63006a
                java.lang.String r3 = r3.C()
                java.lang.String r2 = r2.get(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1, r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.b0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.DefaultTransformKt", f = "DefaultTransform.kt", i = {0}, l = {110}, m = "readText", n = {"charset"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61316a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61317b;

        /* renamed from: c, reason: collision with root package name */
        public int f61318c;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61317b = obj;
            this.f61318c |= Integer.MIN_VALUE;
            return b0.d(null, null, this);
        }
    }

    @m80.k
    public static final Logger a() {
        return f61302a;
    }

    public static final void b(@m80.k py.c cVar) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        c.a aVar = py.c.f81324h;
        cVar.C(aVar.c(), new b(null));
        io.ktor.util.pipeline.h hVar = new io.ktor.util.pipeline.h("AfterTransform");
        cVar.z(aVar.c(), hVar);
        cVar.C(hVar, new c(null));
    }

    public static final void c(@m80.k qy.m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        mVar.C(qy.m.f82742h.e(), new a(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k io.ktor.utils.io.g r4, @m80.k java.nio.charset.Charset r5, @m80.k j00.c<? super java.lang.String> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.server.engine.b0.d
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.server.engine.b0$d r0 = (io.ktor.server.engine.b0.d) r0
            int r1 = r0.f61318c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61318c = r1
            goto L18
        L13:
            io.ktor.server.engine.b0$d r0 = new io.ktor.server.engine.b0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f61317b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61318c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f61316a
            r5 = r4
            java.nio.charset.Charset r5 = (java.nio.charset.Charset) r5
            kotlin.e.n(r6)
            goto L49
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.e.n(r6)
            r0.f61316a = r5
            r0.f61318c = r3
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r6 = io.ktor.utils.io.j.F(r4, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            y40.c0 r6 = (y40.c0) r6
            boolean r4 = r6.J()
            if (r4 == 0) goto L54
            java.lang.String r4 = ""
            return r4
        L54:
            java.nio.charset.Charset r4 = u30.d.f91599b     // Catch: java.lang.Throwable -> L6a
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L6c
            java.nio.charset.Charset r4 = u30.d.f91604g     // Catch: java.lang.Throwable -> L6a
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L65
            goto L6c
        L65:
            java.lang.String r4 = io.ktor.server.engine.a0.c(r6, r5)     // Catch: java.lang.Throwable -> L6a
            goto L70
        L6a:
            r4 = move-exception
            goto L74
        L6c:
            java.lang.String r4 = io.ktor.utils.io.z.a(r6)     // Catch: java.lang.Throwable -> L6a
        L70:
            r6.close()
            return r4
        L74:
            r6.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.b0.d(io.ktor.utils.io.g, java.nio.charset.Charset, j00.c):java.lang.Object");
    }

    public static final <R> R e(@m80.k zx.k0 call, @m80.k x00.a<? extends R> block) {
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(block, "block");
        try {
            return block.invoke();
        } catch (BadContentTypeFormatException e11) {
            throw new BadRequestException("Illegal Content-Type header format: " + call.f().a().get(ix.y0.f63006a.C()), e11);
        }
    }
}
