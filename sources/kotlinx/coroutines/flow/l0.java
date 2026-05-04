package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSharingStarted.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharingStarted.kt\nkotlinx/coroutines/flow/StartedWhileSubscribed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f68312b;

    /* renamed from: c, reason: collision with root package name */
    public final long f68313c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements x00.q<j<? super SharingCommand>, Integer, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68314a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68315b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ int f68316c;

        public a(j00.c<? super a> cVar) {
            super(3, cVar);
        }

        public final Object i(j<? super SharingCommand> jVar, int i11, j00.c<? super g2> cVar) {
            a aVar = l0.this.new a(cVar);
            aVar.f68315b = jVar;
            aVar.f68316c = i11;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(j<? super SharingCommand> jVar, Integer num, j00.c<? super g2> cVar) {
            return i(jVar, num.intValue(), cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
        
            if (r1.emit(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
        
            if (c40.a1.b(r4, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        
            if (c40.a1.b(r6, r9) == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.f68314a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f68315b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f68315b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f68315b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.e.n(r10)
                goto L64
            L38:
                kotlin.e.n(r10)
                goto L9c
            L3c:
                kotlin.e.n(r10)
                java.lang.Object r10 = r9.f68315b
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                int r10 = r9.f68316c
                if (r10 <= 0) goto L53
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r9.f68314a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                goto L9b
            L53:
                kotlinx.coroutines.flow.l0 r10 = kotlinx.coroutines.flow.l0.this
                long r6 = kotlinx.coroutines.flow.l0.c(r10)
                r9.f68315b = r1
                r9.f68314a = r5
                java.lang.Object r10 = c40.a1.b(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                kotlinx.coroutines.flow.l0 r10 = kotlinx.coroutines.flow.l0.this
                long r5 = kotlinx.coroutines.flow.l0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r9.f68315b = r1
                r9.f68314a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                kotlinx.coroutines.flow.l0 r10 = kotlinx.coroutines.flow.l0.this
                long r4 = kotlinx.coroutines.flow.l0.b(r10)
                r9.f68315b = r1
                r9.f68314a = r3
                java.lang.Object r10 = c40.a1.b(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f68315b = r3
                r9.f68314a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
            L9b:
                return r0
            L9c:
                yz.g2 r10 = yz.g2.f100423a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<SharingCommand, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68318a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68319b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(cVar);
            bVar.f68319b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SharingCommand sharingCommand, j00.c<? super Boolean> cVar) {
            return ((b) create(sharingCommand, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f68318a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(((SharingCommand) this.f68319b) != SharingCommand.START);
        }
    }

    public l0(long j11, long j12) {
        this.f68312b = j11;
        this.f68313c = j12;
        if (j11 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j11 + " ms) cannot be negative").toString());
        }
        if (j12 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j12 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.h0
    @m80.k
    public i<SharingCommand> a(@m80.k m0<Integer> m0Var) {
        return k.i0(k.m0(k.f2(m0Var, new a(null)), new b(null)));
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f68312b == l0Var.f68312b && this.f68313c == l0Var.f68313c;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f68312b) * 31) + Long.hashCode(this.f68313c);
    }

    @m80.k
    public String toString() {
        List k11 = a00.g0.k(2);
        if (this.f68312b > 0) {
            k11.add("stopTimeout=" + this.f68312b + "ms");
        }
        if (this.f68313c < Long.MAX_VALUE) {
            k11.add("replayExpiration=" + this.f68313c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + a00.r0.r3(a00.g0.b(k11), null, null, null, 0, null, null, 63, null) + ')';
    }
}
