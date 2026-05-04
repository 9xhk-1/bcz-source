package io.ktor.server.testing;

import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.l2;
import c40.n2;
import io.ktor.server.testing.TestApplicationEngine;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTestApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplication.kt\nio/ktor/server/testing/TestApplication\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1863#2,2:400\n1863#2,2:402\n*S KotlinDebug\n*F\n+ 1 TestApplication.kt\nio/ktor/server/testing/TestApplication\n*L\n77#1:400,2\n94#1:402,2\n*E\n"})
/* loaded from: classes8.dex */
public final class TestApplication implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f61772e = AtomicReferenceFieldUpdater.newUpdater(TestApplication.class, Object.class, "state");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f f61773a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61774b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61775c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61776d;

    @m80.k
    private volatile /* synthetic */ Object state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class State {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Created = new State("Created", 0);
        public static final State Starting = new State("Starting", 1);
        public static final State Started = new State("Started", 2);
        public static final State Stopped = new State("Stopped", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{Created, Starting, Started, Stopped};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private State(String str, int i11) {
        }

        @m80.k
        public static m00.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplication", f = "TestApplication.kt", i = {0}, l = {77, 84}, m = TtmlNode.START, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61777a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61778b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f61779c;

        /* renamed from: e, reason: collision with root package name */
        public int f61781e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61779c = obj;
            this.f61781e |= Integer.MIN_VALUE;
            return TestApplication.this.l(this);
        }
    }

    public TestApplication(@m80.k f builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        this.f61773a = builder;
        this.state = State.Created;
        this.f61774b = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.n
            @Override // x00.a
            public final Object invoke() {
                Map g11;
                g11 = TestApplication.g(TestApplication.this);
                return g11;
            }
        });
        this.f61775c = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.o
            @Override // x00.a
            public final Object invoke() {
                io.ktor.server.engine.b1 k11;
                k11 = TestApplication.k(TestApplication.this);
                return k11;
            }
        });
        this.f61776d = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.p
            @Override // x00.a
            public final Object invoke() {
                c40.a0 f11;
                f11 = TestApplication.f(TestApplication.this);
                return f11;
            }
        });
    }

    public static final c40.a0 f(TestApplication testApplication) {
        return n2.a((l2) testApplication.j().p().getCoroutineContext().get(l2.f7886e0));
    }

    public static final Map g(TestApplication testApplication) {
        return testApplication.f61773a.I().e();
    }

    public static final io.ktor.server.engine.b1 k(TestApplication testApplication) {
        return testApplication.f61773a.E();
    }

    @Override // io.ktor.server.testing.g
    @io.ktor.utils.io.c0
    @m80.k
    public lw.c a(@m80.k x00.l<? super lw.j<? extends ow.j>, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return this.f61773a.a(block);
    }

    @Override // io.ktor.server.testing.g
    @m80.k
    public lw.c b() {
        return this.f61773a.b();
    }

    public final c40.a0 h() {
        return (c40.a0) this.f61776d.getValue();
    }

    @m80.k
    public final Map<String, TestApplication> i() {
        return (Map) this.f61774b.getValue();
    }

    @m80.k
    public final io.ktor.server.engine.b1<TestApplicationEngine, TestApplicationEngine.b> j() {
        return (io.ktor.server.engine.b1) this.f61775c.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r8.K0(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:18:0x003e, B:20:0x0073, B:22:0x0079), top: B:17:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@m80.k j00.c<? super yz.g2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof io.ktor.server.testing.TestApplication.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.testing.TestApplication$a r0 = (io.ktor.server.testing.TestApplication.a) r0
            int r1 = r0.f61781e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61781e = r1
            goto L18
        L13:
            io.ktor.server.testing.TestApplication$a r0 = new io.ktor.server.testing.TestApplication$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61779c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61781e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            kotlin.e.n(r8)
            goto Lbe
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.f61778b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r6 = r0.f61777a
            io.ktor.server.testing.TestApplication r6 = (io.ktor.server.testing.TestApplication) r6
            kotlin.e.n(r8)     // Catch: java.lang.Throwable -> L42
            goto L73
        L42:
            r8 = move-exception
            goto L9a
        L44:
            kotlin.e.n(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = io.ktor.server.testing.TestApplication.f61772e
            io.ktor.server.testing.TestApplication$State r2 = io.ktor.server.testing.TestApplication.State.Created
            io.ktor.server.testing.TestApplication$State r6 = io.ktor.server.testing.TestApplication.State.Starting
            boolean r8 = androidx.concurrent.futures.a.a(r8, r7, r2, r6)
            if (r8 == 0) goto La6
            io.ktor.server.testing.f r8 = r7.f61773a     // Catch: java.lang.Throwable -> L98
            io.ktor.server.engine.b1 r8 = r8.E()     // Catch: java.lang.Throwable -> L98
            r2 = 0
            io.ktor.server.engine.b1.B(r8, r2, r5, r4)     // Catch: java.lang.Throwable -> L98
            io.ktor.server.testing.f r8 = r7.f61773a     // Catch: java.lang.Throwable -> L98
            io.ktor.server.testing.k r8 = r8.I()     // Catch: java.lang.Throwable -> L98
            java.util.Map r8 = r8.e()     // Catch: java.lang.Throwable -> L98
            java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> L98
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L98
            r6 = r7
            r2 = r8
        L73:
            boolean r8 = r2.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto L8c
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L42
            io.ktor.server.testing.TestApplication r8 = (io.ktor.server.testing.TestApplication) r8     // Catch: java.lang.Throwable -> L42
            r0.f61777a = r6     // Catch: java.lang.Throwable -> L42
            r0.f61778b = r2     // Catch: java.lang.Throwable -> L42
            r0.f61781e = r5     // Catch: java.lang.Throwable -> L42
            java.lang.Object r8 = r8.l(r0)     // Catch: java.lang.Throwable -> L42
            if (r8 != r1) goto L73
            goto Lbd
        L8c:
            io.ktor.server.testing.TestApplication$State r8 = io.ktor.server.testing.TestApplication.State.Started
            r6.state = r8
            c40.a0 r8 = r6.h()
            r8.complete()
            goto La7
        L98:
            r8 = move-exception
            r6 = r7
        L9a:
            io.ktor.server.testing.TestApplication$State r0 = io.ktor.server.testing.TestApplication.State.Started
            r6.state = r0
            c40.a0 r0 = r6.h()
            r0.complete()
            throw r8
        La6:
            r6 = r7
        La7:
            java.lang.Object r8 = r6.state
            io.ktor.server.testing.TestApplication$State r2 = io.ktor.server.testing.TestApplication.State.Starting
            if (r8 != r2) goto Lc1
            c40.a0 r8 = r6.h()
            r0.f61777a = r4
            r0.f61778b = r4
            r0.f61781e = r3
            java.lang.Object r8 = r8.K0(r0)
            if (r8 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        Lc1:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplication.l(j00.c):java.lang.Object");
    }

    public final void m() {
        this.state = State.Stopped;
        io.ktor.server.engine.b1.F(this.f61773a.E(), 0L, 0L, 3, null);
        Iterator<T> it = this.f61773a.I().e().values().iterator();
        while (it.hasNext()) {
            ((TestApplication) it.next()).m();
        }
        b().close();
    }
}
