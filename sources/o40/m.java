package o40;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c40.b4;
import c40.l2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.test.UncompletedCoroutinesError;
import o40.m;
import org.junit.jupiter.api.j2;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,615:1\n54#2,5:616\n1#3:621\n1863#4,2:622\n1863#4,2:624\n1863#4,2:626\n*S KotlinDebug\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt\n*L\n506#1:616,5\n564#1:622,2\n570#1:624,2\n575#1:626,2\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Object f75772a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<String, kotlin.time.e> {
        public a(Object obj) {
            super(1, obj, e.a.class, "parse", "parse-UwyO8pc(Ljava/lang/String;)J", 0);
        }

        public final long a(String str) {
            return ((e.a) this.receiver).U(str);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ kotlin.time.e invoke(String str) {
            return kotlin.time.e.f(a(str));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.l<l2, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f75773a = new b();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(l2 l2Var) {
            return Boolean.valueOf(l2Var.isActive());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1", f = "TestBuilders.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {338, 362, 367}, m = "invokeSuspend", n = {"timeoutError", "cancellationException", "workRunner", "timeoutError", "cancellationException", "workRunner", "timeoutError"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f75774a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75775b;

        /* renamed from: c, reason: collision with root package name */
        public int f75776c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f75777d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q0 f75778e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f75779f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ n0 f75780g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.p<n0, j00.c<? super g2>, Object> f75781h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1", f = "TestBuilders.kt", i = {0}, l = {315, TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend", n = {"$this$start"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements x00.p<q0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f75782a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f75783b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.p<n0, j00.c<? super g2>, Object> f75784c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o40.a f75785d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar, o40.a aVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f75784c = pVar;
                this.f75785d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f75784c, this.f75785d, cVar);
                aVar.f75783b = obj;
                return aVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(q0 q0Var, j00.c<? super g2> cVar) {
                return ((a) create(q0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            
                if (r6.invoke(r1, r5) == r0) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
            
                if (c40.b4.a(r5) == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r5.f75782a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L12
                    goto L45
                L12:
                    r6 = move-exception
                    goto L4d
                L14:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1c:
                    java.lang.Object r1 = r5.f75783b
                    o40.q0 r1 = (o40.q0) r1
                    kotlin.e.n(r6)
                    goto L37
                L24:
                    kotlin.e.n(r6)
                    java.lang.Object r6 = r5.f75783b
                    r1 = r6
                    o40.q0 r1 = (o40.q0) r1
                    r5.f75783b = r1
                    r5.f75782a = r3
                    java.lang.Object r6 = c40.b4.a(r5)
                    if (r6 != r0) goto L37
                    goto L44
                L37:
                    x00.p<o40.n0, j00.c<? super yz.g2>, java.lang.Object> r6 = r5.f75784c     // Catch: java.lang.Throwable -> L12
                    r4 = 0
                    r5.f75783b = r4     // Catch: java.lang.Throwable -> L12
                    r5.f75782a = r2     // Catch: java.lang.Throwable -> L12
                    java.lang.Object r6 = r6.invoke(r1, r5)     // Catch: java.lang.Throwable -> L12
                    if (r6 != r0) goto L45
                L44:
                    return r0
                L45:
                    o40.a r6 = r5.f75785d
                    r6.e(r3)
                    yz.g2 r6 = yz.g2.f100423a
                    return r6
                L4d:
                    o40.a r0 = r5.f75785d
                    r0.e(r3)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o40.m.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2", f = "TestBuilders.kt", i = {}, l = {358, 359}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f75786a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f75787b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ q0 f75788c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ l2 f75789d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f75790e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ o40.a f75791f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<Throwable> f75792g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<CancellationException> f75793h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q0 q0Var, l2 l2Var, long j11, o40.a aVar, Ref.ObjectRef<Throwable> objectRef, Ref.ObjectRef<CancellationException> objectRef2, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f75788c = q0Var;
                this.f75789d = l2Var;
                this.f75790e = j11;
                this.f75791f = aVar;
                this.f75792g = objectRef;
                this.f75793h = objectRef2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v9, types: [T, java.util.concurrent.CancellationException] */
            /* JADX WARN: Type inference failed for: r4v0, types: [T, kotlinx.coroutines.test.UncompletedCoroutinesError] */
            public static final g2 j(q0 q0Var, long j11, o40.a aVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Throwable th2) {
                String str;
                if (th2 instanceof TimeoutCancellationException) {
                    o40.h.c();
                    List I3 = q30.k0.I3(q30.k0.P0(q0Var.C(), new PropertyReference1Impl() { // from class: o40.m.c.b.a
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, h10.p
                        public Object get(Object obj) {
                            return Boolean.valueOf(((l2) obj).isActive());
                        }
                    }));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("After waiting for ");
                    sb2.append((Object) kotlin.time.e.f0(j11));
                    sb2.append(j2.O);
                    if (!aVar.c() || I3.isEmpty()) {
                        str = aVar.c() ? "the test completed, but only after the timeout" : "the test body did not run to completion";
                    } else {
                        str = "there were active child jobs: " + I3 + ". Use `TestScope.backgroundScope` to launch the coroutines that need to be cancelled when the test body finishes";
                    }
                    sb2.append(str);
                    objectRef.element = new UncompletedCoroutinesError(sb2.toString());
                    objectRef2.element = new CancellationException("The test timed out");
                    kotlin.jvm.internal.g0.n(q0Var, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                    T t11 = objectRef2.element;
                    kotlin.jvm.internal.g0.m(t11);
                    q0Var.cancel((CancellationException) t11);
                }
                return g2.f100423a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                b bVar = new b(this.f75788c, this.f75789d, this.f75790e, this.f75791f, this.f75792g, this.f75793h, cVar);
                bVar.f75787b = obj;
                return bVar;
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
            
                if (c40.n2.l(r13, r12) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                if (r13.K0(r12) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r12.f75786a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r13)
                    goto L5a
                L12:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1a:
                    kotlin.e.n(r13)
                    goto L4f
                L1e:
                    kotlin.e.n(r13)
                    java.lang.Object r13 = r12.f75787b
                    c40.r0 r13 = (c40.r0) r13
                    kotlin.coroutines.d r13 = r13.getCoroutineContext()
                    c40.l2 r4 = c40.n2.A(r13)
                    o40.q0 r6 = r12.f75788c
                    long r7 = r12.f75790e
                    o40.a r9 = r12.f75791f
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r10 = r12.f75792g
                    kotlin.jvm.internal.Ref$ObjectRef<java.util.concurrent.CancellationException> r11 = r12.f75793h
                    o40.o r5 = new o40.o
                    r5.<init>()
                    r8 = 2
                    r9 = 0
                    r7 = r5
                    r5 = 1
                    r6 = 0
                    c40.l2.a.g(r4, r5, r6, r7, r8, r9)
                    o40.q0 r13 = r12.f75788c
                    r12.f75786a = r3
                    java.lang.Object r13 = r13.K0(r12)
                    if (r13 != r0) goto L4f
                    goto L59
                L4f:
                    c40.l2 r13 = r12.f75789d
                    r12.f75786a = r2
                    java.lang.Object r13 = c40.n2.l(r13, r12)
                    if (r13 != r0) goto L5a
                L59:
                    return r0
                L5a:
                    yz.g2 r13 = yz.g2.f100423a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: o40.m.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$workRunner$1", f = "TestBuilders.kt", i = {0, 1}, l = {330, 333}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
        /* renamed from: o40.m$c$c, reason: collision with other inner class name */
        public static final class C0925c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f75795a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f75796b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n0 f75797c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0925c(n0 n0Var, j00.c<? super C0925c> cVar) {
                super(2, cVar);
                this.f75797c = n0Var;
            }

            public static final boolean j(c40.r0 r0Var) {
                return !c40.s0.k(r0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C0925c c0925c = new C0925c(this.f75797c, cVar);
                c0925c.f75796b = obj;
                return c0925c;
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0925c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                final c40.r0 r0Var;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f75795a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    r0Var = (c40.r0) this.f75796b;
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0Var = (c40.r0) this.f75796b;
                    kotlin.e.n(obj);
                }
                while (true) {
                    if (this.f75797c.I().a1(new x00.a() { // from class: o40.p
                        @Override // x00.a
                        public final Object invoke() {
                            boolean j11;
                            j11 = m.c.C0925c.j(c40.r0.this);
                            return Boolean.valueOf(j11);
                        }
                    })) {
                        this.f75796b = r0Var;
                        this.f75795a = 1;
                        if (b4.a(this) == l11) {
                            break;
                        }
                    } else {
                        b0 I = this.f75797c.I();
                        this.f75796b = r0Var;
                        this.f75795a = 2;
                        if (I.L0(this) == l11) {
                            break;
                        }
                    }
                }
                return l11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q0 q0Var, long j11, n0 n0Var, x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f75778e = q0Var;
            this.f75779f = j11;
            this.f75780g = n0Var;
            this.f75781h = pVar;
        }

        public static final boolean j() {
            return false;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f75778e, this.f75779f, this.f75780g, this.f75781h, cVar);
            cVar2.f75777d = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0138, code lost:
        
            if (r2 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00d8, code lost:
        
            o40.i.u(r2, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x013d, code lost:
        
            return yz.g2.f100423a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
        
            r2 = r17.f75778e.v0();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0114, code lost:
        
            if (c40.n2.l(r10, r17) != r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
        
            if (r2 == null) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v32 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o40.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$3$1", f = "TestBuilders.kt", i = {}, l = {400}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75798a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75799b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q0 f75800c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f75801d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.p<n0, j00.c<? super g2>, Object> f75802e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n0 f75803f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<q0, Throwable> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f75804a = new a();

            public a() {
                super(1, q0.class, "tryGetCompletionCause", "tryGetCompletionCause()Ljava/lang/Throwable;", 0);
            }

            @Override // x00.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Throwable invoke(q0 q0Var) {
                return q0Var.m2();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(q0 q0Var, long j11, x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar, n0 n0Var, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f75800c = q0Var;
            this.f75801d = j11;
            this.f75802e = pVar;
            this.f75803f = n0Var;
        }

        public static final List k(n0 n0Var, q0 q0Var) {
            c40.s0.f(n0Var.f0(), null, 1, null);
            n0Var.I().d0(new x00.a() { // from class: o40.r
                @Override // x00.a
                public final Object invoke() {
                    boolean m11;
                    m11 = m.d.m();
                    return Boolean.valueOf(m11);
                }
            });
            return q0Var.j2();
        }

        public static final boolean m() {
            return false;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f75800c, this.f75801d, this.f75802e, this.f75803f, cVar);
            dVar.f75799b = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75798a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.r0 r0Var = (c40.r0) this.f75799b;
                q0 q0Var = this.f75800c;
                e.a aVar = kotlin.time.e.f67757b;
                long x11 = kotlin.time.f.x(this.f75801d, DurationUnit.MILLISECONDS);
                a aVar2 = a.f75804a;
                x00.p<n0, j00.c<? super g2>, Object> pVar = this.f75802e;
                final n0 n0Var = this.f75803f;
                final q0 q0Var2 = this.f75800c;
                x00.a aVar3 = new x00.a() { // from class: o40.q
                    @Override // x00.a
                    public final Object invoke() {
                        List k11;
                        k11 = m.d.k(n0.this, q0Var2);
                        return k11;
                    }
                };
                this.f75798a = 1;
                if (o40.i.r(r0Var, q0Var, x11, aVar2, pVar, aVar3, this) == l11) {
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
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt", f = "TestBuilders.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {620, com.badlogic.gdx.graphics.f.f11620l2, com.badlogic.gdx.graphics.f.f11620l2}, m = "runTestCoroutineLegacy-SYHnMyU", n = {"$this$runTestCoroutineLegacy_u2dSYHnMyU", "coroutine", "tryGetCompletionCause", "cleanup", "scheduler", com.squareup.picasso.h0.A, "backgroundWorkRunner", "dispatchTimeout", "$this$runTestCoroutineLegacy_u2dSYHnMyU", "coroutine", "tryGetCompletionCause", "cleanup", "scheduler", com.squareup.picasso.h0.A, "dispatchTimeout"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0"})
    public static final class e<T extends c40.a<? super g2>> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75805a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75806b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75807c;

        /* renamed from: d, reason: collision with root package name */
        public Object f75808d;

        /* renamed from: e, reason: collision with root package name */
        public Object f75809e;

        /* renamed from: f, reason: collision with root package name */
        public Object f75810f;

        /* renamed from: g, reason: collision with root package name */
        public Object f75811g;

        /* renamed from: h, reason: collision with root package name */
        public long f75812h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f75813i;

        /* renamed from: j, reason: collision with root package name */
        public int f75814j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f75813i = obj;
            this.f75814j |= Integer.MIN_VALUE;
            return o40.i.r(null, null, 0L, null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$2", f = "TestBuilders.kt", i = {}, l = {457}, m = "invokeSuspend", n = {}, s = {})
    public static final class f<T> extends SuspendLambda implements x00.p<T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75815a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75816b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<T, j00.c<? super g2>, Object> f75817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f75817c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = new f(this.f75817c, cVar);
            fVar.f75816b = obj;
            return fVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lj00/c<-Lyz/g2;>;)Ljava/lang/Object; */
        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c40.a aVar, j00.c cVar) {
            return ((f) create(aVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75815a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.a aVar = (c40.a) this.f75816b;
                x00.p<T, j00.c<? super g2>, Object> pVar = this.f75817c;
                this.f75815a = 1;
                if (pVar.invoke(aVar, this) == l11) {
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
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$1", f = "TestBuilders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75818a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f75819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Ref.BooleanRef booleanRef, j00.c<? super g> cVar) {
            super(1, cVar);
            this.f75819b = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new g(this.f75819b, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((g) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f75818a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f75819b.element = true;
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$2", f = "TestBuilders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements x00.p<g2, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75820a;

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new h(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f75820a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(g2 g2Var, j00.c<? super g2> cVar) {
            return ((h) create(g2Var, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3", f = "TestBuilders.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nTestBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3\n+ 2 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,615:1\n543#2,21:616\n564#2:638\n565#2:641\n1#3:637\n1863#4,2:639\n*S KotlinDebug\n*F\n+ 1 TestBuilders.kt\nkotlinx/coroutines/test/TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$3$3\n*L\n515#1:616,21\n515#1:638\n515#1:641\n515#1:637\n515#1:639,2\n*E\n"})
    public static final class i extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75821a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c40.a f75822b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f75823c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, Throwable> f75824d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.a<List<Throwable>> f75825e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TT;JLx00/l<-TT;+Ljava/lang/Throwable;>;Lx00/a<+Ljava/util/List<+Ljava/lang/Throwable;>;>;Lj00/c<-Lo40/m$i;>;)V */
        public i(c40.a aVar, long j11, x00.l lVar, x00.a aVar2, j00.c cVar) {
            super(1, cVar);
            this.f75822b = aVar;
            this.f75823c = j11;
            this.f75824d = lVar;
            this.f75825e = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new i(this.f75822b, this.f75823c, this.f75824d, this.f75825e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((i) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Throwable> J;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f75821a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            c40.a aVar = this.f75822b;
            long j11 = this.f75823c;
            x00.l<T, Throwable> lVar = this.f75824d;
            try {
                J = this.f75825e.invoke();
            } catch (UncompletedCoroutinesError unused) {
                J = a00.h0.J();
            }
            List I3 = q30.k0.I3(q30.k0.P0(aVar.C(), b.f75773a));
            Throwable invoke = aVar.isCancelled() ? lVar.invoke(aVar) : null;
            String str = "After waiting for " + ((Object) kotlin.time.e.f0(j11));
            if (invoke == null) {
                str = str + ", the test coroutine is not completing";
            }
            if (!I3.isEmpty()) {
                str = str + ", there were active child jobs: " + I3;
            }
            if (invoke != null && I3.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(aVar.e() ? ", the test coroutine completed" : ", the test coroutine was not completed");
                str = sb2.toString();
            }
            UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
            if (invoke != null) {
                yz.r.a(uncompletedCoroutinesError, invoke);
            }
            Iterator<T> it = J.iterator();
            while (it.hasNext()) {
                yz.r.a(uncompletedCoroutinesError, (Throwable) it.next());
            }
            throw uncompletedCoroutinesError;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTestCoroutineLegacy$backgroundWorkRunner$1", f = "TestBuilders.kt", i = {0, 1}, l = {497, 501}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75826a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75827b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f75828c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(b0 b0Var, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f75828c = b0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean j(c40.r0 r0Var) {
            return !c40.s0.k(r0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            j jVar = new j(this.f75828c, cVar);
            jVar.f75827b = obj;
            return jVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final c40.r0 r0Var;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f75826a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                r0Var = (c40.r0) this.f75827b;
            } else {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0Var = (c40.r0) this.f75827b;
                kotlin.e.n(obj);
            }
            while (true) {
                if (this.f75828c.a1(new x00.a() { // from class: o40.s
                    @Override // x00.a
                    public final Object invoke() {
                        boolean j11;
                        j11 = m.j.j(c40.r0.this);
                        return Boolean.valueOf(j11);
                    }
                })) {
                    this.f75827b = r0Var;
                    this.f75826a = 1;
                    if (b4.a(this) == l11) {
                        break;
                    }
                } else {
                    b0 b0Var = this.f75828c;
                    this.f75827b = r0Var;
                    this.f75826a = 2;
                    if (b0Var.L0(this) == l11) {
                        break;
                    }
                }
            }
            return l11;
        }
    }

    static {
        Object m6308constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.time.e.f(((kotlin.time.e) k("kotlinx.coroutines.test.default_timeout", new a(kotlin.time.e.f67757b), kotlin.time.e.f(kotlin.time.f.w(60, DurationUnit.SECONDS)))).k0()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        f75772a = m6308constructorimpl;
    }

    public static final <T extends c40.a<? super g2>> AssertionError a(T t11, long j11, x00.l<? super T, ? extends Throwable> lVar, x00.a<? extends List<? extends Throwable>> aVar) {
        List<? extends Throwable> J;
        try {
            J = aVar.invoke();
        } catch (UncompletedCoroutinesError unused) {
            J = a00.h0.J();
        }
        List I3 = q30.k0.I3(q30.k0.P0(t11.C(), b.f75773a));
        Throwable invoke = t11.isCancelled() ? lVar.invoke(t11) : null;
        String str = "After waiting for " + ((Object) kotlin.time.e.f0(j11));
        if (invoke == null) {
            str = str + ", the test coroutine is not completing";
        }
        if (!I3.isEmpty()) {
            str = str + ", there were active child jobs: " + I3;
        }
        if (invoke != null && I3.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(t11.e() ? ", the test coroutine completed" : ", the test coroutine was not completed");
            str = sb2.toString();
        }
        UncompletedCoroutinesError uncompletedCoroutinesError = new UncompletedCoroutinesError(str);
        if (invoke != null) {
            yz.r.a(uncompletedCoroutinesError, invoke);
        }
        Iterator it = J.iterator();
        while (it.hasNext()) {
            yz.r.a(uncompletedCoroutinesError, (Throwable) it.next());
        }
        return uncompletedCoroutinesError;
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Define a total timeout for the whole test instead of using dispatchTimeoutMs. Warning: the proposed replacement is not identical as it uses 'dispatchTimeoutMs' as the timeout for the whole test!", replaceWith = @w0(expression = "runTest(context, timeout = dispatchTimeoutMs.milliseconds, testBody)", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static final void b(@m80.k kotlin.coroutines.d dVar, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        o40.d dVar2 = o40.d.f75734a;
        if (dVar.get(dVar2) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        o40.i.j(r0.a(dVar.plus(dVar2)), j11, pVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Define a total timeout for the whole test instead of using dispatchTimeoutMs. Warning: the proposed replacement is not identical as it uses 'dispatchTimeoutMs' as the timeout for the whole test!", replaceWith = @w0(expression = "this.runTest(timeout = dispatchTimeoutMs.milliseconds, testBody)", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    public static final void c(@m80.k n0 n0Var, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        q0 f11 = r0.f(n0Var);
        f11.h2();
        o40.h.b(new d(f11, j11, pVar, n0Var, null));
    }

    public static /* synthetic */ void d(kotlin.coroutines.d dVar, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        o40.i.h(dVar, j11, pVar);
    }

    @w00.j(name = "runTest$default")
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This is for binary compatibility with the `runTest` overload that existed at some point")
    public static final /* synthetic */ void e(n0 n0Var, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) == 0) {
            j11 = 60000;
        }
        o40.i.j(n0Var, j11, pVar);
    }

    public static final void f(@m80.k kotlin.coroutines.d dVar, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        o40.d dVar2 = o40.d.f75734a;
        if (dVar.get(dVar2) != null) {
            throw new IllegalStateException("Calls to `runTest` can't be nested. Please read the docs on `TestResult` for details.");
        }
        o40.i.o(r0.a(dVar.plus(dVar2)), j11, pVar);
    }

    public static final void g(@m80.k n0 n0Var, long j11, @m80.k x00.p<? super n0, ? super j00.c<? super g2>, ? extends Object> pVar) {
        q0 f11 = r0.f(n0Var);
        f11.h2();
        o40.h.b(new c(f11, j11, n0Var, pVar, null));
    }

    public static /* synthetic */ void h(kotlin.coroutines.d dVar, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            Object obj2 = f75772a;
            kotlin.e.n(obj2);
            j11 = ((kotlin.time.e) obj2).k0();
        }
        o40.i.n(dVar, j11, pVar);
    }

    public static /* synthetic */ void i(n0 n0Var, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            Object obj2 = f75772a;
            kotlin.e.n(obj2);
            j11 = ((kotlin.time.e) obj2).k0();
        }
        o40.i.o(n0Var, j11, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r13v9, types: [c40.a] */
    /* JADX WARN: Type inference failed for: r14v9, types: [c40.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0171 -> B:17:0x017c). Please report as a decompilation issue!!! */
    @m80.l
    @yz.n(message = "Used for support of legacy behavior")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends c40.a<? super yz.g2>> java.lang.Object j(@m80.k c40.r0 r22, @m80.k T r23, long r24, @m80.k x00.l<? super T, ? extends java.lang.Throwable> r26, @m80.k x00.p<? super T, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r27, @m80.k x00.a<? extends java.util.List<? extends java.lang.Throwable>> r28, @m80.k j00.c<? super yz.g2> r29) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o40.m.j(c40.r0, c40.a, long, x00.l, x00.p, x00.a, j00.c):java.lang.Object");
    }

    public static final <T> T k(String str, x00.l<? super String, ? extends T> lVar, T t11) {
        String d11 = o40.h.d(str);
        return d11 == null ? t11 : lVar.invoke(d11);
    }

    public static final void l(@m80.l Throwable th2, @m80.k List<? extends Throwable> list) {
        if (th2 != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                yz.r.a(th2, (Throwable) it.next());
            }
            throw th2;
        }
        Throwable th3 = (Throwable) a00.r0.L2(list);
        if (th3 != null) {
            Iterator it2 = a00.r0.g2(list, 1).iterator();
            while (it2.hasNext()) {
                yz.r.a(th3, (Throwable) it2.next());
            }
            throw th3;
        }
    }
}
