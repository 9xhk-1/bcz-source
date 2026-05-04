package e40;

import c40.y1;
import c40.z3;
import com.bumptech.glide.load.engine.GlideException;
import e40.o;
import e40.q;
import h40.p0;
import h40.v0;
import h40.w0;
import h40.x0;
import ix.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n426#4,9:3194\n435#4,2:3211\n444#4,4:3213\n448#4,8:3314\n426#4,9:3405\n435#4,2:3495\n444#4,4:3713\n448#4,8:3784\n444#4,4:3844\n448#4,8:3915\n204#5:3203\n205#5:3206\n204#5:3207\n205#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
/* loaded from: classes8.dex */
public class m<E> implements e40.o<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f49062d = AtomicLongFieldUpdater.newUpdater(m.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f49063e = AtomicLongFieldUpdater.newUpdater(m.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f49064f = AtomicLongFieldUpdater.newUpdater(m.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f49065g = AtomicLongFieldUpdater.newUpdater(m.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49066h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49067i = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49068j = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49069k = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49070l = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f49071a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final x00.l<E, g2> f49072b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final x00.q<k40.n<?>, Object, Object, x00.q<Throwable, Object, kotlin.coroutines.d, g2>> f49073c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n444#3,4:3169\n448#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    public final class a implements q<E>, z3 {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Object f49074a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public c40.p<? super Boolean> f49075b;

        public a() {
            x0 x0Var;
            x0Var = e40.n.f49137x;
            this.f49074a = x0Var;
        }

        @Override // e40.q
        @m80.l
        public Object a(@m80.k j00.c<? super Boolean> cVar) {
            x0 x0Var;
            t<E> tVar;
            x0 x0Var2;
            x0 x0Var3;
            x0 x0Var4;
            Object obj = this.f49074a;
            x0Var = e40.n.f49137x;
            boolean z11 = true;
            if (obj == x0Var || this.f49074a == e40.n.z()) {
                m<E> mVar = m.this;
                t<E> tVar2 = (t) m.G0().get(mVar);
                while (!mVar.P()) {
                    long andIncrement = m.I0().getAndIncrement(mVar);
                    int i11 = e40.n.f49115b;
                    long j11 = andIncrement / i11;
                    int i12 = (int) (andIncrement % i11);
                    if (tVar2.f58276c != j11) {
                        tVar = mVar.m0(j11, tVar2);
                        if (tVar == null) {
                            continue;
                        }
                    } else {
                        tVar = tVar2;
                    }
                    Object r22 = mVar.r2(tVar, i12, andIncrement, null);
                    x0Var2 = e40.n.f49128o;
                    if (r22 == x0Var2) {
                        throw new IllegalStateException("unreachable");
                    }
                    x0Var3 = e40.n.f49130q;
                    if (r22 != x0Var3) {
                        x0Var4 = e40.n.f49129p;
                        if (r22 == x0Var4) {
                            return h(tVar, i12, andIncrement, cVar);
                        }
                        tVar.c();
                        this.f49074a = r22;
                        return l00.a.a(z11);
                    }
                    if (andIncrement < mVar.P0()) {
                        tVar.c();
                    }
                    tVar2 = tVar;
                }
                z11 = i();
            }
            return l00.a.a(z11);
        }

        @Override // c40.z3
        public void b(@m80.k h40.u0<?> u0Var, int i11) {
            c40.p<? super Boolean> pVar = this.f49075b;
            if (pVar != null) {
                pVar.b(u0Var, i11);
            }
        }

        @Override // e40.q
        @w00.j(name = l1.b.f62938h)
        @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object c(j00.c cVar) {
            return q.a.a(this, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        
            if (r12 != null) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object h(e40.t<E> r10, int r11, long r12, j00.c<? super java.lang.Boolean> r14) {
            /*
                r9 = this;
                e40.m<E> r0 = e40.m.this
                j00.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r14)
                c40.p r6 = c40.r.b(r1)
                f(r9, r6)     // Catch: java.lang.Throwable -> Ld6
                r5 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                java.lang.Object r10 = e40.m.U(r0, r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                h40.x0 r11 = e40.n.r()     // Catch: java.lang.Throwable -> L20
                if (r10 != r11) goto L24
                e40.m.C(r0, r9, r1, r2)     // Catch: java.lang.Throwable -> L20
                goto Lc8
            L20:
                r0 = move-exception
            L21:
                r10 = r0
                goto Lda
            L24:
                h40.x0 r11 = e40.n.h()     // Catch: java.lang.Throwable -> L20
                r12 = 1
                r13 = 0
                if (r10 != r11) goto Lb3
                long r10 = r0.P0()     // Catch: java.lang.Throwable -> L20
                int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r10 >= 0) goto L37
                r1.c()     // Catch: java.lang.Throwable -> L20
            L37:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = e40.m.p()     // Catch: java.lang.Throwable -> L20
                java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Throwable -> L20
                e40.t r10 = (e40.t) r10     // Catch: java.lang.Throwable -> L20
            L41:
                boolean r11 = r0.P()     // Catch: java.lang.Throwable -> L20
                if (r11 == 0) goto L4c
                e(r9)     // Catch: java.lang.Throwable -> L20
                goto Lc8
            L4c:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = e40.m.q()     // Catch: java.lang.Throwable -> L20
                long r3 = r11.getAndIncrement(r0)     // Catch: java.lang.Throwable -> L20
                int r11 = e40.n.f49115b     // Catch: java.lang.Throwable -> L20
                long r1 = (long) r11     // Catch: java.lang.Throwable -> L20
                long r1 = r3 / r1
                long r7 = (long) r11     // Catch: java.lang.Throwable -> L20
                long r7 = r3 % r7
                int r11 = (int) r7     // Catch: java.lang.Throwable -> L20
                long r7 = r10.f58276c     // Catch: java.lang.Throwable -> L20
                int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r7 == 0) goto L6c
                e40.t r1 = e40.m.k(r0, r1, r10)     // Catch: java.lang.Throwable -> L20
                if (r1 != 0) goto L6a
                goto L41
            L6a:
                r2 = r11
                goto L6e
            L6c:
                r1 = r10
                goto L6a
            L6e:
                java.lang.Object r10 = e40.m.U(r0, r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L20
                h40.x0 r11 = e40.n.r()     // Catch: java.lang.Throwable -> L20
                if (r10 != r11) goto L7c
                e40.m.C(r0, r9, r1, r2)     // Catch: java.lang.Throwable -> L20
                goto Lc8
            L7c:
                h40.x0 r11 = e40.n.h()     // Catch: java.lang.Throwable -> L20
                if (r10 != r11) goto L8f
                long r10 = r0.P0()     // Catch: java.lang.Throwable -> L20
                int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r10 >= 0) goto L8d
                r1.c()     // Catch: java.lang.Throwable -> L20
            L8d:
                r10 = r1
                goto L41
            L8f:
                h40.x0 r11 = e40.n.s()     // Catch: java.lang.Throwable -> L20
                if (r10 == r11) goto Lab
                r1.c()     // Catch: java.lang.Throwable -> L20
                g(r9, r10)     // Catch: java.lang.Throwable -> L20
                f(r9, r13)     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r11 = l00.a.a(r12)     // Catch: java.lang.Throwable -> L20
                x00.l<E, yz.g2> r12 = r0.f49072b     // Catch: java.lang.Throwable -> L20
                if (r12 == 0) goto Lc5
            La6:
                x00.q r13 = e40.m.i(r0, r12, r10)     // Catch: java.lang.Throwable -> L20
                goto Lc5
            Lab:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
                java.lang.String r11 = "unexpected"
                r10.<init>(r11)     // Catch: java.lang.Throwable -> L20
                throw r10     // Catch: java.lang.Throwable -> L20
            Lb3:
                r1.c()     // Catch: java.lang.Throwable -> L20
                g(r9, r10)     // Catch: java.lang.Throwable -> L20
                f(r9, r13)     // Catch: java.lang.Throwable -> L20
                java.lang.Boolean r11 = l00.a.a(r12)     // Catch: java.lang.Throwable -> L20
                x00.l<E, yz.g2> r12 = r0.f49072b     // Catch: java.lang.Throwable -> L20
                if (r12 == 0) goto Lc5
                goto La6
            Lc5:
                r6.A(r11, r13)     // Catch: java.lang.Throwable -> L20
            Lc8:
                java.lang.Object r10 = r6.F()
                java.lang.Object r11 = kotlin.coroutines.intrinsics.b.l()
                if (r10 != r11) goto Ld5
                l00.f.c(r14)
            Ld5:
                return r10
            Ld6:
                r0 = move-exception
                r5 = r9
                goto L21
            Lda:
                r6.X()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: e40.m.a.h(e40.t, int, long, j00.c):java.lang.Object");
        }

        public final boolean i() {
            this.f49074a = e40.n.z();
            Throwable u02 = m.this.u0();
            if (u02 == null) {
                return false;
            }
            throw w0.m(u02);
        }

        public final void j() {
            c40.p<? super Boolean> pVar = this.f49075b;
            kotlin.jvm.internal.g0.m(pVar);
            this.f49075b = null;
            this.f49074a = e40.n.z();
            Throwable u02 = m.this.u0();
            if (u02 == null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(u02)));
            }
        }

        public final boolean k(E e11) {
            boolean F;
            c40.p<? super Boolean> pVar = this.f49075b;
            kotlin.jvm.internal.g0.m(pVar);
            this.f49075b = null;
            this.f49074a = e11;
            Boolean bool = Boolean.TRUE;
            m<E> mVar = m.this;
            x00.l<E, g2> lVar = mVar.f49072b;
            F = e40.n.F(pVar, bool, lVar != null ? mVar.X(lVar, e11) : null);
            return F;
        }

        public final void l() {
            c40.p<? super Boolean> pVar = this.f49075b;
            kotlin.jvm.internal.g0.m(pVar);
            this.f49075b = null;
            this.f49074a = e40.n.z();
            Throwable u02 = m.this.u0();
            if (u02 == null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(Boolean.FALSE));
            } else {
                Result.a aVar2 = Result.Companion;
                pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(u02)));
            }
        }

        @Override // e40.q
        public E next() {
            x0 x0Var;
            x0 x0Var2;
            E e11 = (E) this.f49074a;
            x0Var = e40.n.f49137x;
            if (e11 == x0Var) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            x0Var2 = e40.n.f49137x;
            this.f49074a = x0Var2;
            if (e11 != e40.n.z()) {
                return e11;
            }
            throw w0.m(m.this.E0());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements z3 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.p<Boolean> f49077a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final c40.n<Boolean> f49078b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k c40.n<? super Boolean> nVar) {
            kotlin.jvm.internal.g0.n(nVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f49077a = (c40.p) nVar;
            this.f49078b = nVar;
        }

        @m80.k
        public final c40.n<Boolean> a() {
            return this.f49078b;
        }

        @Override // c40.z3
        public void b(@m80.k h40.u0<?> u0Var, int i11) {
            this.f49077a.b(u0Var, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements x00.q<Throwable, E, kotlin.coroutines.d, g2> {
        public c(Object obj) {
            super(3, obj, m.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, E e11, kotlin.coroutines.d dVar) {
            ((m) this.receiver).n1(th2, e11, dVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2, Object obj, kotlin.coroutines.d dVar) {
            a(th2, obj, dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class d extends FunctionReferenceImpl implements x00.q<Throwable, s<? extends E>, kotlin.coroutines.d, g2> {
        public d(Object obj) {
            super(3, obj, m.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, kotlin.coroutines.d dVar) {
            ((m) this.receiver).m1(th2, obj, dVar);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2, Object obj, kotlin.coroutines.d dVar) {
            a(th2, ((s) obj).o(), dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class e extends FunctionReferenceImpl implements x00.q<m<?>, k40.n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f49079a = new e();

        public e() {
            super(3, m.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(m<?> mVar, k40.n<?> nVar, Object obj) {
            mVar.M1(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(m<?> mVar, k40.n<?> nVar, Object obj) {
            a(mVar, nVar, obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class f extends FunctionReferenceImpl implements x00.q<m<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f49080a = new f();

        public f() {
            super(3, m.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m<?> mVar, Object obj, Object obj2) {
            return mVar.B1(obj, obj2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class g extends FunctionReferenceImpl implements x00.q<m<?>, k40.n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f49081a = new g();

        public g() {
            super(3, m.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(m<?> mVar, k40.n<?> nVar, Object obj) {
            mVar.M1(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(m<?> mVar, k40.n<?> nVar, Object obj) {
            a(mVar, nVar, obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class h extends FunctionReferenceImpl implements x00.q<m<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f49082a = new h();

        public h() {
            super(3, m.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m<?> mVar, Object obj, Object obj2) {
            return mVar.C1(obj, obj2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class i extends FunctionReferenceImpl implements x00.q<m<?>, k40.n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f49083a = new i();

        public i() {
            super(3, m.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(m<?> mVar, k40.n<?> nVar, Object obj) {
            mVar.M1(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(m<?> mVar, k40.n<?> nVar, Object obj) {
            a(mVar, nVar, obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class j extends FunctionReferenceImpl implements x00.q<m<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f49084a = new j();

        public j() {
            super(3, m.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m<?> mVar, Object obj, Object obj2) {
            return mVar.D1(obj, obj2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class k extends FunctionReferenceImpl implements x00.q<m<?>, k40.n<?>, Object, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f49085a = new k();

        public k() {
            super(3, m.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(m<?> mVar, k40.n<?> nVar, Object obj) {
            mVar.N1(nVar, obj);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(m<?> mVar, k40.n<?> nVar, Object obj) {
            a(mVar, nVar, obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class l extends FunctionReferenceImpl implements x00.q<m<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f49086a = new l();

        public l() {
            super(3, m.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m<?> mVar, Object obj, Object obj2) {
            return mVar.E1(obj, obj2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    /* renamed from: e40.m$m, reason: collision with other inner class name */
    public static final class C0591m<E> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f49087a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<E> f49088b;

        /* renamed from: c, reason: collision with root package name */
        public int f49089c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0591m(m<E> mVar, j00.c<? super C0591m> cVar) {
            super(cVar);
            this.f49088b = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49087a = obj;
            this.f49089c |= Integer.MIN_VALUE;
            Object G1 = m.G1(this.f49088b, this);
            return G1 == kotlin.coroutines.intrinsics.b.l() ? G1 : s.b(G1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", en.r.f50027a}, s = {"L$0", "L$1", "I$0", "J$0"})
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49090a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49091b;

        /* renamed from: c, reason: collision with root package name */
        public int f49092c;

        /* renamed from: d, reason: collision with root package name */
        public long f49093d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f49094e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m<E> f49095f;

        /* renamed from: g, reason: collision with root package name */
        public int f49096g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m<E> mVar, j00.c<? super n> cVar) {
            super(cVar);
            this.f49095f = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49094e = obj;
            this.f49096g |= Integer.MIN_VALUE;
            Object H1 = this.f49095f.H1(null, 0, 0L, this);
            return H1 == kotlin.coroutines.intrinsics.b.l() ? H1 : s.b(H1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements x00.q {

        /* renamed from: a, reason: collision with root package name */
        public static final o f49097a = new o();

        public final Void a(t<E> tVar, int i11, long j11) {
            throw new IllegalStateException("unexpected");
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((t) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p implements x00.r {

        /* renamed from: a, reason: collision with root package name */
        public static final p f49098a = new p();

        public final Void a(t<E> tVar, int i11, E e11, long j11) {
            throw new IllegalStateException("unexpected");
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((t) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(int i11, @m80.l x00.l<? super E, g2> lVar) {
        long E;
        x0 x0Var;
        this.f49071a = i11;
        this.f49072b = lVar;
        if (i11 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i11 + ", should be >=0").toString());
        }
        E = e40.n.E(i11);
        this.bufferEnd$volatile = E;
        this.completedExpandBuffersAndPauseFlag$volatile = r0();
        t tVar = new t(0L, null, this, 3);
        this.sendSegment$volatile = tVar;
        this.receiveSegment$volatile = tVar;
        if (e1()) {
            tVar = e40.n.f49114a;
            kotlin.jvm.internal.g0.n(tVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = tVar;
        this.f49073c = lVar != 0 ? new x00.q() { // from class: e40.k
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                x00.q x12;
                x12 = m.x1(m.this, (k40.n) obj, obj2, obj3);
                return x12;
            }
        } : null;
        x0Var = e40.n.A;
        this._closeCause$volatile = x0Var;
    }

    public static /* synthetic */ <E> Object F1(m<E> mVar, j00.c<? super E> cVar) {
        t<E> tVar;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        t<E> tVar2 = (t) G0().get(mVar);
        while (!mVar.P()) {
            long andIncrement = I0().getAndIncrement(mVar);
            int i11 = e40.n.f49115b;
            long j11 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (tVar2.f58276c != j11) {
                t<E> m02 = mVar.m0(j11, tVar2);
                if (m02 == null) {
                    continue;
                } else {
                    tVar = m02;
                }
            } else {
                tVar = tVar2;
            }
            m<E> mVar2 = mVar;
            Object r22 = mVar2.r2(tVar, i12, andIncrement, null);
            x0Var = e40.n.f49128o;
            if (r22 == x0Var) {
                throw new IllegalStateException("unexpected");
            }
            x0Var2 = e40.n.f49130q;
            if (r22 != x0Var2) {
                x0Var3 = e40.n.f49129p;
                if (r22 == x0Var3) {
                    return mVar2.L1(tVar, i12, andIncrement, cVar);
                }
                tVar.c();
                return r22;
            }
            if (andIncrement < mVar2.P0()) {
                tVar.c();
            }
            mVar = mVar2;
            tVar2 = tVar;
        }
        throw w0.m(mVar.E0());
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater G0() {
        return f49067i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r14v12, types: [e40.s$b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [e40.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <E> java.lang.Object G1(e40.m<E> r13, j00.c<? super e40.s<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof e40.m.C0591m
            if (r0 == 0) goto L14
            r0 = r14
            e40.m$m r0 = (e40.m.C0591m) r0
            int r1 = r0.f49089c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f49089c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            e40.m$m r0 = new e40.m$m
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f49087a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f49089c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r14)
            e40.s r14 = (e40.s) r14
            java.lang.Object r13 = r14.o()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.e.n(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = p()
            java.lang.Object r14 = r14.get(r13)
            e40.t r14 = (e40.t) r14
        L46:
            boolean r1 = r13.P()
            if (r1 == 0) goto L57
            e40.s$b r14 = e40.s.f49161b
            java.lang.Throwable r13 = r13.u0()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = q()
            long r4 = r1.getAndIncrement(r13)
            int r1 = e40.n.f49115b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f58276c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            e40.t r1 = k(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = U(r7, r8, r9, r10, r12)
            r1 = r7
            h40.x0 r14 = e40.n.r()
            if (r13 == r14) goto Lb6
            h40.x0 r14 = e40.n.h()
            if (r13 != r14) goto L9b
            long r13 = r1.P0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.c()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            h40.x0 r14 = e40.n.s()
            if (r13 != r14) goto Lac
            r6.f49089c = r2
            r2 = r8
            java.lang.Object r13 = r1.H1(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.c()
            e40.s$b r14 = e40.s.f49161b
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.G1(e40.m, j00.c):java.lang.Object");
    }

    public static final /* synthetic */ AtomicLongFieldUpdater I0() {
        return f49063e;
    }

    public static /* synthetic */ Object J1(m mVar, Object obj, x00.l lVar, x00.q qVar, x00.a aVar, x00.q qVar2, int i11, Object obj2) {
        t tVar;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i11 & 16) != 0) {
            qVar2 = o.f49097a;
        }
        t tVar2 = (t) G0().get(mVar);
        while (!mVar.P()) {
            long andIncrement = I0().getAndIncrement(mVar);
            int i12 = e40.n.f49115b;
            long j11 = andIncrement / i12;
            int i13 = (int) (andIncrement % i12);
            if (tVar2.f58276c != j11) {
                t m02 = mVar.m0(j11, tVar2);
                if (m02 == null) {
                    continue;
                } else {
                    tVar = m02;
                }
            } else {
                tVar = tVar2;
            }
            m mVar2 = mVar;
            Object obj3 = obj;
            Object r22 = mVar2.r2(tVar, i13, andIncrement, obj3);
            tVar2 = tVar;
            x0Var = e40.n.f49128o;
            if (r22 == x0Var) {
                z3 z3Var = obj3 instanceof z3 ? (z3) obj3 : null;
                if (z3Var != null) {
                    mVar2.z1(z3Var, tVar2, i13);
                }
                return qVar.invoke(tVar2, Integer.valueOf(i13), Long.valueOf(andIncrement));
            }
            x0Var2 = e40.n.f49130q;
            if (r22 != x0Var2) {
                x0Var3 = e40.n.f49129p;
                if (r22 == x0Var3) {
                    return qVar2.invoke(tVar2, Integer.valueOf(i13), Long.valueOf(andIncrement));
                }
                tVar2.c();
                return lVar.invoke(r22);
            }
            if (andIncrement < mVar2.P0()) {
                tVar2.c();
            }
            mVar = mVar2;
            obj = obj3;
        }
        return aVar.invoke();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater M0() {
        return f49066h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater O0() {
        return f49062d;
    }

    public static /* synthetic */ <E> Object S1(m<E> mVar, E e11, j00.c<? super g2> cVar) {
        t<E> tVar;
        t<E> tVar2 = (t) M0().get(mVar);
        while (true) {
            long andIncrement = O0().getAndIncrement(mVar);
            long j11 = andIncrement & e40.n.G;
            boolean b12 = mVar.b1(andIncrement);
            int i11 = e40.n.f49115b;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            if (tVar2.f58276c != j12) {
                t<E> n02 = mVar.n0(j12, tVar2);
                if (n02 != null) {
                    tVar = n02;
                } else if (b12) {
                    Object t12 = mVar.t1(e11, cVar);
                    if (t12 == kotlin.coroutines.intrinsics.b.l()) {
                        return t12;
                    }
                }
            } else {
                tVar = tVar2;
            }
            m<E> mVar2 = mVar;
            E e12 = e11;
            int t22 = mVar2.t2(tVar, i12, e12, j11, null, b12);
            if (t22 == 0) {
                tVar.c();
                break;
            }
            if (t22 == 1) {
                break;
            }
            if (t22 != 2) {
                if (t22 == 3) {
                    Object Y1 = mVar2.Y1(tVar, i12, e12, j11, cVar);
                    if (Y1 == kotlin.coroutines.intrinsics.b.l()) {
                        return Y1;
                    }
                } else if (t22 != 4) {
                    if (t22 == 5) {
                        tVar.c();
                    }
                    mVar = mVar2;
                    tVar2 = tVar;
                    e11 = e12;
                } else {
                    if (j11 < mVar2.J0()) {
                        tVar.c();
                    }
                    Object t13 = mVar2.t1(e12, cVar);
                    if (t13 == kotlin.coroutines.intrinsics.b.l()) {
                        return t13;
                    }
                }
            } else if (b12) {
                tVar.A();
                Object t14 = mVar2.t1(e12, cVar);
                if (t14 == kotlin.coroutines.intrinsics.b.l()) {
                    return t14;
                }
            }
        }
        return g2.f100423a;
    }

    public static /* synthetic */ void U0(m mVar, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i11 & 1) != 0) {
            j11 = 1;
        }
        mVar.T0(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        r13 = kotlin.Result.Companion;
        r0.resumeWith(kotlin.Result.m6308constructorimpl(l00.a.a(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <E> java.lang.Object U1(e40.m<E> r13, E r14, j00.c<? super java.lang.Boolean> r15) {
        /*
            c40.p r0 = new c40.p
            j00.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r15)
            r2 = 1
            r0.<init>(r1, r2)
            r0.y()
            x00.l<E, yz.g2> r1 = r13.f49072b
            if (r1 != 0) goto Lb9
            e40.m$b r9 = new e40.m$b
            r9.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = r()
            java.lang.Object r1 = r1.get(r13)
            e40.t r1 = (e40.t) r1
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = s()
            long r3 = r3.getAndIncrement(r13)
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r3 & r5
            boolean r10 = t(r13, r3)
            int r3 = e40.n.f49115b
            long r4 = (long) r3
            long r4 = r7 / r4
            long r11 = (long) r3
            long r11 = r7 % r11
            int r3 = (int) r11
            long r11 = r1.f58276c
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r11 = 0
            if (r6 == 0) goto L5d
            e40.t r4 = l(r13, r4, r1)
            if (r4 != 0) goto L59
            if (r10 == 0) goto L20
        L4b:
            kotlin.Result$a r13 = kotlin.Result.Companion
            java.lang.Boolean r13 = l00.a.a(r11)
            java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)
            r0.resumeWith(r13)
            goto Lab
        L59:
            r6 = r14
            r5 = r3
            r3 = r13
            goto L5f
        L5d:
            r4 = r1
            goto L59
        L5f:
            int r13 = V(r3, r4, r5, r6, r7, r9, r10)
            r1 = r4
            if (r13 == 0) goto La7
            if (r13 == r2) goto L99
            r14 = 2
            if (r13 == r14) goto L8f
            r14 = 3
            if (r13 == r14) goto L87
            r14 = 4
            if (r13 == r14) goto L7b
            r14 = 5
            if (r13 == r14) goto L75
            goto L78
        L75:
            r1.c()
        L78:
            r13 = r3
            r14 = r6
            goto L20
        L7b:
            long r13 = r3.J0()
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto L4b
            r1.c()
            goto L4b
        L87:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        L8f:
            if (r10 == 0) goto L95
            r1.A()
            goto L4b
        L95:
            D(r3, r9, r1, r5)
            goto Lab
        L99:
            kotlin.Result$a r13 = kotlin.Result.Companion
            java.lang.Boolean r13 = l00.a.a(r2)
            java.lang.Object r13 = kotlin.Result.m6308constructorimpl(r13)
            r0.resumeWith(r13)
            goto Lab
        La7:
            r1.c()
            goto L99
        Lab:
            java.lang.Object r13 = r0.F()
            java.lang.Object r14 = kotlin.coroutines.intrinsics.b.l()
            if (r13 != r14) goto Lb8
            l00.f.c(r15)
        Lb8:
            return r13
        Lb9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.U1(e40.m, java.lang.Object, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object W1(m mVar, Object obj, Object obj2, x00.a aVar, x00.p pVar, x00.a aVar2, x00.r rVar, int i11, Object obj3) {
        m mVar2;
        Object obj4;
        Object obj5;
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        x00.r rVar2 = (i11 & 32) != 0 ? p.f49098a : rVar;
        t tVar = (t) M0().get(mVar);
        while (true) {
            long andIncrement = O0().getAndIncrement(mVar);
            long j11 = e40.n.G & andIncrement;
            boolean b12 = mVar.b1(andIncrement);
            int i12 = e40.n.f49115b;
            long j12 = j11 / i12;
            int i13 = (int) (j11 % i12);
            if (tVar.f58276c != j12) {
                t n02 = mVar.n0(j12, tVar);
                if (n02 != null) {
                    tVar = n02;
                    mVar2 = mVar;
                    obj5 = obj2;
                    obj4 = obj;
                } else if (b12) {
                    return aVar2.invoke();
                }
            } else {
                mVar2 = mVar;
                obj4 = obj;
                obj5 = obj2;
            }
            int t22 = mVar2.t2(tVar, i13, obj4, j11, obj5, b12);
            if (t22 == 0) {
                tVar.c();
                return aVar.invoke();
            }
            if (t22 == 1) {
                return aVar.invoke();
            }
            if (t22 == 2) {
                if (b12) {
                    tVar.A();
                    return aVar2.invoke();
                }
                z3 z3Var = obj2 instanceof z3 ? (z3) obj2 : null;
                if (z3Var != null) {
                    mVar.A1(z3Var, tVar, i13);
                }
                return pVar.invoke(tVar, Integer.valueOf(i13));
            }
            if (t22 == 3) {
                return rVar2.invoke(tVar, Integer.valueOf(i13), obj, Long.valueOf(j11));
            }
            if (t22 == 4) {
                if (j11 < mVar.J0()) {
                    tVar.c();
                }
                return aVar2.invoke();
            }
            if (t22 == 5) {
                tVar.c();
            }
        }
    }

    public static final g2 Y(x00.l lVar, Object obj, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        p0.a(lVar, obj, dVar);
        return g2.f100423a;
    }

    private final /* synthetic */ void f1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, g2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public static final x00.q x1(final m mVar, final k40.n nVar, Object obj, final Object obj2) {
        return new x00.q() { // from class: e40.j
            @Override // x00.q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                g2 y12;
                y12 = m.y1(obj2, mVar, nVar, (Throwable) obj3, obj4, (kotlin.coroutines.d) obj5);
                return y12;
            }
        };
    }

    public static final g2 y1(Object obj, m mVar, k40.n nVar, Throwable th2, Object obj2, kotlin.coroutines.d dVar) {
        if (obj != e40.n.z()) {
            p0.a(mVar.f49072b, obj, nVar.getContext());
        }
        return g2.f100423a;
    }

    public final void A1(z3 z3Var, t<E> tVar, int i11) {
        z3Var.b(tVar, i11 + e40.n.f49115b);
    }

    public final Object B1(Object obj, Object obj2) {
        if (obj2 != e40.n.z()) {
            return obj2;
        }
        throw E0();
    }

    public final Object C1(Object obj, Object obj2) {
        return s.b(obj2 == e40.n.z() ? s.f49161b.a(u0()) : s.f49161b.c(obj2));
    }

    public final Object D1(Object obj, Object obj2) {
        if (obj2 != e40.n.z()) {
            return obj2;
        }
        if (u0() == null) {
            return null;
        }
        throw E0();
    }

    public final Throwable E0() {
        Throwable u02 = u0();
        return u02 == null ? new ClosedReceiveChannelException(u.f49167a) : u02;
    }

    public final Object E1(Object obj, Object obj2) {
        if (obj2 != e40.n.z()) {
            return this;
        }
        throw K0();
    }

    public final /* synthetic */ Object F0() {
        return this.receiveSegment$volatile;
    }

    @Override // e40.k0
    @m80.l
    public Object H(@m80.k j00.c<? super E> cVar) {
        return F1(this, cVar);
    }

    public final /* synthetic */ long H0() {
        return this.receivers$volatile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H1(e40.t<E> r11, int r12, long r13, j00.c<? super e40.s<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.H1(e40.t, int, long, j00.c):java.lang.Object");
    }

    public final <R> R I1(Object obj, x00.l<? super E, ? extends R> lVar, x00.q<? super t<E>, ? super Integer, ? super Long, ? extends R> qVar, x00.a<? extends R> aVar, x00.q<? super t<E>, ? super Integer, ? super Long, ? extends R> qVar2) {
        t tVar;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        t tVar2 = (t) G0().get(this);
        while (!P()) {
            long andIncrement = I0().getAndIncrement(this);
            int i11 = e40.n.f49115b;
            long j11 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (tVar2.f58276c != j11) {
                t m02 = m0(j11, tVar2);
                if (m02 == null) {
                    continue;
                } else {
                    tVar = m02;
                }
            } else {
                tVar = tVar2;
            }
            Object obj2 = obj;
            x0 x0Var4 = (Object) r2(tVar, i12, andIncrement, obj2);
            tVar2 = tVar;
            x0Var = e40.n.f49128o;
            if (x0Var4 == x0Var) {
                z3 z3Var = obj2 instanceof z3 ? (z3) obj2 : null;
                if (z3Var != null) {
                    z1(z3Var, tVar2, i12);
                }
                return qVar.invoke(tVar2, Integer.valueOf(i12), Long.valueOf(andIncrement));
            }
            x0Var2 = e40.n.f49130q;
            if (x0Var4 != x0Var2) {
                x0Var3 = e40.n.f49129p;
                if (x0Var4 == x0Var3) {
                    return qVar2.invoke(tVar2, Integer.valueOf(i12), Long.valueOf(andIncrement));
                }
                tVar2.c();
                return lVar.invoke(x0Var4);
            }
            if (andIncrement < P0()) {
                tVar2.c();
            }
            obj = obj2;
        }
        return aVar.invoke();
    }

    @Override // e40.k0
    @m80.l
    @o00.i
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @yz.w0(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object J(@m80.k j00.c<? super E> cVar) {
        return o.a.e(this, cVar);
    }

    public final long J0() {
        return f49063e.get(this);
    }

    @Override // e40.k0
    @m80.k
    public k40.h<s<E>> K() {
        g gVar = g.f49081a;
        kotlin.jvm.internal.g0.n(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        x00.q qVar = (x00.q) kotlin.jvm.internal.x0.q(gVar, 3);
        h hVar = h.f49082a;
        kotlin.jvm.internal.g0.n(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k40.i(this, qVar, (x00.q) kotlin.jvm.internal.x0.q(hVar, 3), this.f49073c);
    }

    @m80.k
    public final Throwable K0() {
        Throwable u02 = u0();
        return u02 == null ? new ClosedSendChannelException(u.f49167a) : u02;
    }

    public final void K1(t<E> tVar, int i11, long j11, z3 z3Var, x00.l<? super E, g2> lVar, x00.a<g2> aVar) {
        x0 x0Var;
        x0 x0Var2;
        t tVar2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6 = (Object) r2(tVar, i11, j11, z3Var);
        m<E> mVar = this;
        x0Var = e40.n.f49128o;
        if (x0Var6 == x0Var) {
            z1(z3Var, tVar, i11);
            return;
        }
        x0Var2 = e40.n.f49130q;
        if (x0Var6 != x0Var2) {
            tVar.c();
            lVar.invoke(x0Var6);
            return;
        }
        if (j11 < P0()) {
            tVar.c();
        }
        t tVar3 = (t) G0().get(this);
        while (!P()) {
            long andIncrement = I0().getAndIncrement(this);
            int i12 = e40.n.f49115b;
            long j12 = andIncrement / i12;
            int i13 = (int) (andIncrement % i12);
            if (tVar3.f58276c != j12) {
                t m02 = m0(j12, tVar3);
                if (m02 == null) {
                    continue;
                } else {
                    tVar2 = m02;
                }
            } else {
                tVar2 = tVar3;
            }
            m<E> mVar2 = mVar;
            x0 x0Var7 = (Object) mVar2.r2(tVar2, i13, andIncrement, z3Var);
            tVar3 = tVar2;
            x0Var3 = e40.n.f49128o;
            if (x0Var7 == x0Var3) {
                z3 z3Var2 = z3Var != null ? z3Var : null;
                if (z3Var2 != null) {
                    z1(z3Var2, tVar3, i13);
                }
                g2 g2Var = g2.f100423a;
                return;
            }
            x0Var4 = e40.n.f49130q;
            if (x0Var7 != x0Var4) {
                x0Var5 = e40.n.f49129p;
                if (x0Var7 == x0Var5) {
                    throw new IllegalStateException("unexpected");
                }
                tVar3.c();
                lVar.invoke(x0Var7);
                return;
            }
            if (andIncrement < P0()) {
                tVar3.c();
            }
            mVar = mVar2;
        }
        aVar.invoke();
    }

    public final /* synthetic */ Object L0() {
        return this.sendSegment$volatile;
    }

    public final Object L1(t<E> tVar, int i11, long j11, j00.c<? super E> cVar) {
        x0 x0Var;
        x0 x0Var2;
        t tVar2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        c40.p b11 = c40.r.b(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        try {
            Object r22 = r2(tVar, i11, j11, b11);
            x0Var = e40.n.f49128o;
            if (r22 == x0Var) {
                z1(b11, tVar, i11);
            } else {
                x0Var2 = e40.n.f49130q;
                h10.i iVar = null;
                iVar = null;
                if (r22 == x0Var2) {
                    if (j11 < P0()) {
                        tVar.c();
                    }
                    t tVar3 = (t) G0().get(this);
                    while (true) {
                        if (P()) {
                            q1(b11);
                            break;
                        }
                        long andIncrement = I0().getAndIncrement(this);
                        int i12 = e40.n.f49115b;
                        long j12 = andIncrement / i12;
                        int i13 = (int) (andIncrement % i12);
                        if (tVar3.f58276c != j12) {
                            t m02 = m0(j12, tVar3);
                            if (m02 != null) {
                                tVar2 = m02;
                            }
                        } else {
                            tVar2 = tVar3;
                        }
                        r22 = r2(tVar2, i13, andIncrement, b11);
                        t tVar4 = tVar2;
                        x0Var3 = e40.n.f49128o;
                        if (r22 == x0Var3) {
                            c40.p pVar = b11 != null ? b11 : null;
                            if (pVar != null) {
                                z1(pVar, tVar4, i13);
                            }
                        } else {
                            x0Var4 = e40.n.f49130q;
                            if (r22 == x0Var4) {
                                if (andIncrement < P0()) {
                                    tVar4.c();
                                }
                                tVar3 = tVar4;
                            } else {
                                x0Var5 = e40.n.f49129p;
                                if (r22 == x0Var5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                tVar4.c();
                                x00.l<E, g2> lVar = this.f49072b;
                                if (lVar != null) {
                                    iVar = W(lVar);
                                }
                            }
                        }
                    }
                } else {
                    tVar.c();
                    x00.l<E, g2> lVar2 = this.f49072b;
                    if (lVar2 != null) {
                        iVar = W(lVar2);
                    }
                }
                b11.A(r22, (x00.q) iVar);
            }
            Object F = b11.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(cVar);
            }
            return F;
        } catch (Throwable th2) {
            b11.X();
            throw th2;
        }
    }

    @Override // e40.k0
    @m80.k
    public k40.h<E> M() {
        i iVar = i.f49083a;
        kotlin.jvm.internal.g0.n(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        x00.q qVar = (x00.q) kotlin.jvm.internal.x0.q(iVar, 3);
        j jVar = j.f49084a;
        kotlin.jvm.internal.g0.n(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k40.i(this, qVar, (x00.q) kotlin.jvm.internal.x0.q(jVar, 3), this.f49073c);
    }

    public final void M1(k40.n<?> nVar, Object obj) {
        t tVar;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        t tVar2 = (t) G0().get(this);
        while (!P()) {
            long andIncrement = I0().getAndIncrement(this);
            int i11 = e40.n.f49115b;
            long j11 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (tVar2.f58276c != j11) {
                t m02 = m0(j11, tVar2);
                if (m02 == null) {
                    continue;
                } else {
                    tVar = m02;
                }
            } else {
                tVar = tVar2;
            }
            k40.n<?> nVar2 = nVar;
            Object r22 = r2(tVar, i12, andIncrement, nVar2);
            tVar2 = tVar;
            x0Var = e40.n.f49128o;
            if (r22 == x0Var) {
                z3 z3Var = nVar2 instanceof z3 ? (z3) nVar2 : null;
                if (z3Var != null) {
                    z1(z3Var, tVar2, i12);
                    return;
                }
                return;
            }
            x0Var2 = e40.n.f49130q;
            if (r22 != x0Var2) {
                x0Var3 = e40.n.f49129p;
                if (r22 == x0Var3) {
                    throw new IllegalStateException("unexpected");
                }
                tVar2.c();
                nVar2.e(r22);
                return;
            }
            if (andIncrement < P0()) {
                tVar2.c();
            }
            nVar = nVar2;
        }
        r1(nVar);
    }

    @Override // e40.k0
    @m80.l
    public Object N(@m80.k j00.c<? super s<? extends E>> cVar) {
        return G1(this, cVar);
    }

    public final /* synthetic */ long N0() {
        return this.sendersAndCloseStatus$volatile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N1(@m80.k k40.n<?> nVar, @m80.l Object obj) {
        t tVar;
        t tVar2 = (t) M0().get(this);
        while (true) {
            long andIncrement = O0().getAndIncrement(this);
            long j11 = andIncrement & e40.n.G;
            boolean b12 = b1(andIncrement);
            int i11 = e40.n.f49115b;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            if (tVar2.f58276c != j12) {
                t n02 = n0(j12, tVar2);
                if (n02 != null) {
                    tVar = n02;
                } else if (b12) {
                    s1(obj, nVar);
                    return;
                }
            } else {
                tVar = tVar2;
            }
            k40.n<?> nVar2 = nVar;
            Object obj2 = obj;
            int t22 = t2(tVar, i12, obj2, j11, nVar2, b12);
            tVar2 = tVar;
            if (t22 == 0) {
                tVar2.c();
                nVar2.e(g2.f100423a);
                return;
            }
            if (t22 == 1) {
                nVar2.e(g2.f100423a);
                return;
            }
            if (t22 == 2) {
                if (b12) {
                    tVar2.A();
                    s1(obj2, nVar2);
                    return;
                } else {
                    z3 z3Var = nVar2 instanceof z3 ? (z3) nVar2 : null;
                    if (z3Var != null) {
                        A1(z3Var, tVar2, i12);
                        return;
                    }
                    return;
                }
            }
            if (t22 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (t22 == 4) {
                if (j11 < J0()) {
                    tVar2.c();
                }
                s1(obj2, nVar2);
                return;
            } else {
                if (t22 == 5) {
                    tVar2.c();
                }
                obj = obj2;
                nVar = nVar2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e40.k0
    @m80.k
    public Object O() {
        Object obj;
        t tVar;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        long j11 = f49063e.get(this);
        long j12 = f49062d.get(this);
        if (Z0(j12)) {
            return s.f49161b.a(u0());
        }
        if (j11 >= (j12 & e40.n.G)) {
            return s.f49161b.b();
        }
        obj = e40.n.f49126m;
        t tVar2 = (t) G0().get(this);
        while (!P()) {
            long andIncrement = I0().getAndIncrement(this);
            int i11 = e40.n.f49115b;
            long j13 = andIncrement / i11;
            int i12 = (int) (andIncrement % i11);
            if (tVar2.f58276c != j13) {
                tVar = m0(j13, tVar2);
                if (tVar == null) {
                    continue;
                }
            } else {
                tVar = tVar2;
            }
            Object r22 = r2(tVar, i12, andIncrement, obj);
            x0Var = e40.n.f49128o;
            if (r22 == x0Var) {
                z3 z3Var = obj instanceof z3 ? (z3) obj : null;
                if (z3Var != null) {
                    z1(z3Var, tVar, i12);
                }
                x2(andIncrement);
                tVar.A();
                return s.f49161b.b();
            }
            x0Var2 = e40.n.f49130q;
            if (r22 != x0Var2) {
                x0Var3 = e40.n.f49129p;
                if (r22 == x0Var3) {
                    throw new IllegalStateException("unexpected");
                }
                tVar.c();
                return s.f49161b.c(r22);
            }
            if (andIncrement < P0()) {
                tVar.c();
            }
            tVar2 = tVar;
        }
        return s.f49161b.a(u0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (e40.t) r12.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O1(e40.t<E> r12) {
        /*
            r11 = this;
            x00.l<E, yz.g2> r0 = r11.f49072b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = h40.v.c(r1, r2, r1)
        L8:
            int r4 = e40.n.f49115b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f58276c
            int r8 = e40.n.f49115b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.J(r4)
            h40.x0 r9 = e40.n.f()
            if (r8 == r9) goto Lbb
            h40.x0 r9 = e40.n.f49119f
            if (r8 != r9) goto L48
            long r9 = r11.J0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            h40.x0 r9 = e40.n.z()
            boolean r8 = r12.D(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.I(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = h40.p0.b(r0, r5, r1)
        L40:
            r12.E(r4)
            r12.A()
            goto Laf
        L48:
            h40.x0 r9 = e40.n.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof c40.z3
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof e40.n0
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            h40.x0 r9 = e40.n.p()
            if (r8 == r9) goto Lbb
            h40.x0 r9 = e40.n.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            h40.x0 r9 = e40.n.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.J0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof e40.n0
            if (r9 == 0) goto L80
            r9 = r8
            e40.n0 r9 = (e40.n0) r9
            c40.z3 r9 = r9.f49141a
            goto L83
        L80:
            r9 = r8
            c40.z3 r9 = (c40.z3) r9
        L83:
            h40.x0 r10 = e40.n.z()
            boolean r8 = r12.D(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.I(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = h40.p0.b(r0, r5, r1)
        L97:
            java.lang.Object r3 = h40.v.h(r3, r9)
            r12.E(r4)
            r12.A()
            goto Laf
        La2:
            h40.x0 r9 = e40.n.z()
            boolean r8 = r12.D(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.A()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            h40.f r12 = r12.h()
            e40.t r12 = (e40.t) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            c40.z3 r3 = (c40.z3) r3
            r11.Q1(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.g0.n(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            c40.z3 r0 = (c40.z3) r0
            r11.Q1(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.O1(e40.t):void");
    }

    @Override // e40.k0
    public boolean P() {
        return Z0(f49062d.get(this));
    }

    public final long P0() {
        return f49062d.get(this) & e40.n.G;
    }

    public final void P1(z3 z3Var) {
        R1(z3Var, true);
    }

    @Override // e40.k0
    @m80.k
    public k40.h<E> Q() {
        e eVar = e.f49079a;
        kotlin.jvm.internal.g0.n(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        x00.q qVar = (x00.q) kotlin.jvm.internal.x0.q(eVar, 3);
        f fVar = f.f49080a;
        kotlin.jvm.internal.g0.n(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k40.i(this, qVar, (x00.q) kotlin.jvm.internal.x0.q(fVar, 3), this.f49073c);
    }

    public final /* synthetic */ Object Q0() {
        return this._closeCause$volatile;
    }

    public final void Q1(z3 z3Var) {
        R1(z3Var, false);
    }

    public final void R1(z3 z3Var, boolean z11) {
        if (z3Var instanceof b) {
            c40.n<Boolean> a11 = ((b) z3Var).a();
            Result.a aVar = Result.Companion;
            a11.resumeWith(Result.m6308constructorimpl(Boolean.FALSE));
            return;
        }
        if (z3Var instanceof c40.n) {
            j00.c cVar = (j00.c) z3Var;
            Result.a aVar2 = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(z11 ? E0() : K0())));
        } else if (z3Var instanceof j0) {
            c40.p<s<? extends E>> pVar = ((j0) z3Var).f49056a;
            Result.a aVar3 = Result.Companion;
            pVar.resumeWith(Result.m6308constructorimpl(s.b(s.f49161b.a(u0()))));
        } else if (z3Var instanceof a) {
            ((a) z3Var).l();
        } else {
            if (z3Var instanceof k40.n) {
                ((k40.n) z3Var).h(this, e40.n.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + z3Var).toString());
        }
    }

    public final boolean S0() {
        while (true) {
            t<E> tVar = (t) f49067i.get(this);
            long J0 = J0();
            if (P0() <= J0) {
                return false;
            }
            int i11 = e40.n.f49115b;
            long j11 = J0 / i11;
            if (tVar.f58276c == j11 || (tVar = m0(j11, tVar)) != null) {
                tVar.c();
                if (W0(tVar, (int) (J0 % i11), J0)) {
                    return true;
                }
                f49063e.compareAndSet(this, J0, 1 + J0);
            } else if (((t) f49067i.get(this)).f58276c < j11) {
                return false;
            }
        }
    }

    public final void T0(long j11) {
        if ((f49065g.addAndGet(this, j11) & 4611686018427387904L) != 0) {
            while ((f49065g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    @m80.l
    public Object T1(E e11, @m80.k j00.c<? super Boolean> cVar) {
        return U1(this, e11, cVar);
    }

    public final void V0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49070l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? e40.n.f49138y : e40.n.f49139z));
        if (obj == null) {
            return;
        }
        ((x00.l) obj).invoke(u0());
    }

    public final <R> R V1(E e11, Object obj, x00.a<? extends R> aVar, x00.p<? super t<E>, ? super Integer, ? extends R> pVar, x00.a<? extends R> aVar2, x00.r<? super t<E>, ? super Integer, ? super E, ? super Long, ? extends R> rVar) {
        m<E> mVar;
        E e12;
        Object obj2;
        t tVar = (t) M0().get(this);
        while (true) {
            long andIncrement = O0().getAndIncrement(this);
            long j11 = e40.n.G & andIncrement;
            boolean b12 = b1(andIncrement);
            int i11 = e40.n.f49115b;
            long j12 = j11 / i11;
            int i12 = (int) (j11 % i11);
            if (tVar.f58276c != j12) {
                t n02 = n0(j12, tVar);
                if (n02 != null) {
                    tVar = n02;
                    mVar = this;
                    obj2 = obj;
                    e12 = e11;
                } else if (b12) {
                    return aVar2.invoke();
                }
            } else {
                mVar = this;
                e12 = e11;
                obj2 = obj;
            }
            int t22 = mVar.t2(tVar, i12, e12, j11, obj2, b12);
            if (t22 == 0) {
                tVar.c();
                return aVar.invoke();
            }
            if (t22 == 1) {
                return aVar.invoke();
            }
            if (t22 == 2) {
                if (b12) {
                    tVar.A();
                    return aVar2.invoke();
                }
                z3 z3Var = obj instanceof z3 ? (z3) obj : null;
                if (z3Var != null) {
                    A1(z3Var, tVar, i12);
                }
                return pVar.invoke(tVar, Integer.valueOf(i12));
            }
            if (t22 == 3) {
                return rVar.invoke(tVar, Integer.valueOf(i12), e11, Long.valueOf(j11));
            }
            if (t22 == 4) {
                if (j11 < J0()) {
                    tVar.c();
                }
                return aVar2.invoke();
            }
            if (t22 == 5) {
                tVar.c();
            }
        }
    }

    public final h10.i<g2> W(x00.l<? super E, g2> lVar) {
        return new c(this);
    }

    public final boolean W0(t<E> tVar, int i11, long j11) {
        Object J;
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6;
        x0 x0Var7;
        do {
            J = tVar.J(i11);
            if (J != null) {
                x0Var2 = e40.n.f49120g;
                if (J != x0Var2) {
                    if (J == e40.n.f49119f) {
                        return true;
                    }
                    x0Var3 = e40.n.f49125l;
                    if (J == x0Var3 || J == e40.n.z()) {
                        return false;
                    }
                    x0Var4 = e40.n.f49124k;
                    if (J == x0Var4) {
                        return false;
                    }
                    x0Var5 = e40.n.f49123j;
                    if (J == x0Var5) {
                        return false;
                    }
                    x0Var6 = e40.n.f49122i;
                    if (J == x0Var6) {
                        return true;
                    }
                    x0Var7 = e40.n.f49121h;
                    return J != x0Var7 && j11 == J0();
                }
            }
            x0Var = e40.n.f49123j;
        } while (!tVar.D(i11, J, x0Var));
        k0();
        return false;
    }

    public final x00.q<Throwable, Object, kotlin.coroutines.d, g2> X(final x00.l<? super E, g2> lVar, final E e11) {
        return new x00.q() { // from class: e40.l
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                g2 Y;
                Y = m.Y(x00.l.this, e11, (Throwable) obj, obj2, (kotlin.coroutines.d) obj3);
                return Y;
            }
        };
    }

    public final boolean X0(long j11, boolean z11) {
        int i11 = (int) (j11 >> 60);
        if (i11 == 0 || i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            h0(j11 & e40.n.G);
            return (z11 && S0()) ? false : true;
        }
        if (i11 == 3) {
            g0(j11 & e40.n.G);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i11).toString());
    }

    public final void X1(t<E> tVar, int i11, E e11, long j11, z3 z3Var, x00.a<g2> aVar, x00.a<g2> aVar2) {
        m<E> mVar;
        E e12;
        z3 z3Var2;
        g2 g2Var;
        int t22 = t2(tVar, i11, e11, j11, z3Var, false);
        if (t22 == 0) {
            tVar.c();
            aVar.invoke();
            return;
        }
        if (t22 == 1) {
            aVar.invoke();
            return;
        }
        if (t22 == 2) {
            A1(z3Var, tVar, i11);
            return;
        }
        if (t22 == 4) {
            if (j11 < J0()) {
                tVar.c();
            }
            aVar2.invoke();
            return;
        }
        String str = "unexpected";
        if (t22 != 5) {
            throw new IllegalStateException("unexpected");
        }
        tVar.c();
        t tVar2 = (t) M0().get(this);
        while (true) {
            long andIncrement = O0().getAndIncrement(this);
            long j12 = e40.n.G & andIncrement;
            boolean b12 = b1(andIncrement);
            int i12 = e40.n.f49115b;
            long j13 = j12 / i12;
            int i13 = (int) (j12 % i12);
            String str2 = str;
            if (tVar2.f58276c != j13) {
                t n02 = n0(j13, tVar2);
                if (n02 != null) {
                    tVar2 = n02;
                    mVar = this;
                    z3Var2 = z3Var;
                    e12 = e11;
                } else {
                    if (b12) {
                        g2Var = aVar2.invoke();
                        break;
                    }
                    str = str2;
                }
            } else {
                mVar = this;
                e12 = e11;
                z3Var2 = z3Var;
            }
            int t23 = mVar.t2(tVar2, i13, e12, j12, z3Var2, b12);
            if (t23 == 0) {
                tVar2.c();
                g2Var = aVar.invoke();
                break;
            }
            if (t23 == 1) {
                g2Var = aVar.invoke();
                break;
            }
            if (t23 != 2) {
                if (t23 == 3) {
                    throw new IllegalStateException(str2);
                }
                if (t23 != 4) {
                    if (t23 == 5) {
                        tVar2.c();
                    }
                    str = str2;
                } else {
                    if (j12 < J0()) {
                        tVar2.c();
                    }
                    g2Var = aVar2.invoke();
                }
            } else if (b12) {
                tVar2.A();
                g2Var = aVar2.invoke();
            } else {
                z3 z3Var3 = z3Var2 != null ? z3Var2 : null;
                if (z3Var3 != null) {
                    A1(z3Var3, tVar2, i13);
                }
                g2Var = g2.f100423a;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y1(e40.t<E> r17, int r18, E r19, long r20, j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.Y1(e40.t, int, java.lang.Object, long, j00.c):java.lang.Object");
    }

    public final h10.i<g2> Z(x00.l<? super E, g2> lVar) {
        return new d(this);
    }

    public final boolean Z0(long j11) {
        return X0(j11, true);
    }

    public final /* synthetic */ void Z1(long j11) {
        this.bufferEnd$volatile = j11;
    }

    @Override // e40.k0
    public final boolean a(@m80.l Throwable th2) {
        return b0(th2);
    }

    public final boolean a0(long j11) {
        return j11 < r0() || j11 < J0() + ((long) this.f49071a);
    }

    public final /* synthetic */ void a2(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    @Override // e40.l0
    @m80.l
    public Object b(E e11, @m80.k j00.c<? super g2> cVar) {
        return S1(this, e11, cVar);
    }

    public boolean b0(@m80.l Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return f0(th2, true);
    }

    public final boolean b1(long j11) {
        return X0(j11, false);
    }

    public final /* synthetic */ void b2(Object obj) {
        this.closeHandler$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(t<E> tVar, long j11) {
        x0 x0Var;
        Object c11 = h40.v.c(null, 1, null);
        loop0: while (tVar != null) {
            for (int i11 = e40.n.f49115b - 1; -1 < i11; i11--) {
                if ((tVar.f58276c * e40.n.f49115b) + i11 < j11) {
                    break loop0;
                }
                while (true) {
                    Object J = tVar.J(i11);
                    if (J != null) {
                        x0Var = e40.n.f49120g;
                        if (J != x0Var) {
                            if (!(J instanceof n0)) {
                                if (!(J instanceof z3)) {
                                    break;
                                }
                                if (tVar.D(i11, J, e40.n.z())) {
                                    c11 = h40.v.h(c11, J);
                                    tVar.K(i11, true);
                                    break;
                                }
                            } else {
                                if (tVar.D(i11, J, e40.n.z())) {
                                    c11 = h40.v.h(c11, ((n0) J).f49141a);
                                    tVar.K(i11, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (tVar.D(i11, J, e40.n.z())) {
                        tVar.A();
                        break;
                    }
                }
            }
            tVar = (t) tVar.h();
        }
        if (c11 != null) {
            if (!(c11 instanceof ArrayList)) {
                P1((z3) c11);
                return;
            }
            kotlin.jvm.internal.g0.n(c11, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) c11;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                P1((z3) arrayList.get(size));
            }
        }
    }

    public boolean c1() {
        return false;
    }

    public final /* synthetic */ void c2(long j11) {
        this.completedExpandBuffersAndPauseFlag$volatile = j11;
    }

    @Override // e40.k0
    public final void cancel() {
        b0(null);
    }

    @Override // e40.l0
    @m80.k
    public k40.j<E, m<E>> d() {
        k kVar = k.f49085a;
        kotlin.jvm.internal.g0.n(kVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        x00.q qVar = (x00.q) kotlin.jvm.internal.x0.q(kVar, 3);
        l lVar = l.f49086a;
        kotlin.jvm.internal.g0.n(lVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new k40.k(this, qVar, (x00.q) kotlin.jvm.internal.x0.q(lVar, 3), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        t tVar;
        t tVar2;
        if (e1()) {
            Object obj = f49068j.get(this);
            tVar2 = e40.n.f49114a;
            if (obj != tVar2) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((t) f49067i.get(this)).f58276c > ((t) f49068j.get(this)).f58276c) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        List Q = a00.h0.Q(f49067i.get(this), f49066h.get(this), f49068j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : Q) {
            t tVar3 = (t) obj2;
            tVar = e40.n.f49114a;
            if (tVar3 != tVar) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((t) next).f58276c;
            do {
                Object next2 = it.next();
                long j12 = ((t) next2).f58276c;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        t tVar4 = (t) next;
        if (tVar4.h() != 0) {
            throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (tVar4.f() != 0) {
            S f11 = tVar4.f();
            kotlin.jvm.internal.g0.m(f11);
            if (((t) f11).h() != 0) {
                S f12 = tVar4.f();
                kotlin.jvm.internal.g0.m(f12);
                if (((t) f12).h() != tVar4) {
                    throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i11 = e40.n.f49115b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object J = tVar4.J(i13);
                if (!kotlin.jvm.internal.g0.g(J, e40.n.f49119f) && !(J instanceof z3)) {
                    x0Var = e40.n.f49126m;
                    if (!kotlin.jvm.internal.g0.g(J, x0Var)) {
                        x0Var2 = e40.n.f49125l;
                        if (!kotlin.jvm.internal.g0.g(J, x0Var2) && !kotlin.jvm.internal.g0.g(J, e40.n.z())) {
                            x0Var3 = e40.n.f49123j;
                            if (!kotlin.jvm.internal.g0.g(J, x0Var3)) {
                                x0Var4 = e40.n.f49124k;
                                if (!kotlin.jvm.internal.g0.g(J, x0Var4)) {
                                    throw new IllegalStateException(("Unexpected segment cell state: " + J + ".\nChannel state: " + this).toString());
                                }
                            }
                            if (tVar4.I(i13) != null) {
                                throw new IllegalStateException("Check failed.");
                            }
                        }
                    }
                    if (tVar4.I(i13) != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    i12++;
                }
            }
            if (i12 == e40.n.f49115b && tVar4 != f49067i.get(this) && tVar4 != f49066h.get(this) && tVar4 != f49068j.get(this)) {
                throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S f13 = tVar4.f();
            kotlin.jvm.internal.g0.m(f13);
            tVar4 = (t) f13;
        }
    }

    public final /* synthetic */ void d2(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    public final t<E> e0() {
        Object obj = f49068j.get(this);
        t tVar = (t) f49066h.get(this);
        if (tVar.f58276c > ((t) obj).f58276c) {
            obj = tVar;
        }
        t tVar2 = (t) f49067i.get(this);
        if (tVar2.f58276c > ((t) obj).f58276c) {
            obj = tVar2;
        }
        return (t) h40.e.e((h40.f) obj);
    }

    public final boolean e1() {
        long r02 = r0();
        return r02 == 0 || r02 == Long.MAX_VALUE;
    }

    public final /* synthetic */ void e2(long j11) {
        this.receivers$volatile = j11;
    }

    public boolean f0(@m80.l Throwable th2, boolean z11) {
        x0 x0Var;
        if (z11) {
            i1();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49069k;
        x0Var = e40.n.A;
        boolean a11 = androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, x0Var, th2);
        if (z11) {
            j1();
        } else {
            k1();
        }
        i0();
        o1();
        if (a11) {
            V0();
        }
        return a11;
    }

    public final /* synthetic */ void f2(Object obj) {
        this.sendSegment$volatile = obj;
    }

    public final void g0(long j11) {
        O1(h0(j11));
    }

    public final /* synthetic */ void g1(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, x00.l<? super Long, g2> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void g2(long j11) {
        this.sendersAndCloseStatus$volatile = j11;
    }

    public final t<E> h0(long j11) {
        t<E> e02 = e0();
        if (c1()) {
            long h12 = h1(e02);
            if (h12 != -1) {
                j0(h12);
            }
        }
        c0(e02, j11);
        return e02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (e40.t) r8.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h1(e40.t<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = e40.n.f49115b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f58276c
            int r5 = e40.n.f49115b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.J0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.J(r0)
            if (r1 == 0) goto L2c
            h40.x0 r2 = e40.n.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            h40.x0 r2 = e40.n.f49119f
            if (r1 != r2) goto L39
            return r3
        L2c:
            h40.x0 r2 = e40.n.z()
            boolean r1 = r8.D(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.A()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            h40.f r8 = r8.h()
            e40.t r8 = (e40.t) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.h1(e40.t):long");
    }

    public final /* synthetic */ void h2(Object obj) {
        this._closeCause$volatile = obj;
    }

    public final void i0() {
        o();
    }

    public final void i1() {
        long j11;
        long w11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f49062d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                return;
            } else {
                w11 = e40.n.w(e40.n.G & j11, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, w11));
    }

    public final boolean i2(long j11) {
        if (b1(j11)) {
            return false;
        }
        return !a0(j11 & e40.n.G);
    }

    @Override // e40.k0
    public boolean isEmpty() {
        if (P() || S0()) {
            return false;
        }
        return !P();
    }

    @Override // e40.k0
    @m80.k
    public q<E> iterator() {
        return new a();
    }

    public final void j0(long j11) {
        t<E> tVar;
        x0 x0Var;
        UndeliveredElementException c11;
        t<E> tVar2 = (t) f49067i.get(this);
        while (true) {
            long j12 = f49063e.get(this);
            if (j11 < Math.max(this.f49071a + j12, r0())) {
                return;
            }
            if (f49063e.compareAndSet(this, j12, 1 + j12)) {
                int i11 = e40.n.f49115b;
                long j13 = j12 / i11;
                int i12 = (int) (j12 % i11);
                if (tVar2.f58276c != j13) {
                    tVar = m0(j13, tVar2);
                    if (tVar == null) {
                        continue;
                    }
                } else {
                    tVar = tVar2;
                }
                Object r22 = r2(tVar, i12, j12, null);
                x0Var = e40.n.f49130q;
                if (r22 != x0Var) {
                    tVar.c();
                    x00.l<E, g2> lVar = this.f49072b;
                    if (lVar != null && (c11 = p0.c(lVar, r22, null, 2, null)) != null) {
                        throw c11;
                    }
                } else if (j12 < P0()) {
                    tVar.c();
                }
                tVar2 = tVar;
            }
        }
    }

    public final void j1() {
        long j11;
        long w11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f49062d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            w11 = e40.n.w(e40.n.G & j11, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, w11));
    }

    public boolean j2() {
        return i2(f49062d.get(this));
    }

    public final void k0() {
        if (e1()) {
            return;
        }
        t<E> tVar = (t) f49068j.get(this);
        while (true) {
            long andIncrement = f49064f.getAndIncrement(this);
            int i11 = e40.n.f49115b;
            long j11 = andIncrement / i11;
            if (P0() <= andIncrement) {
                if (tVar.f58276c < j11 && tVar.f() != 0) {
                    l1(j11, tVar);
                }
                U0(this, 0L, 1, null);
                return;
            }
            if (tVar.f58276c != j11) {
                t<E> l02 = l0(j11, tVar, andIncrement);
                if (l02 == null) {
                    continue;
                } else {
                    tVar = l02;
                }
            }
            if (p2(tVar, (int) (andIncrement % i11), andIncrement)) {
                U0(this, 0L, 1, null);
                return;
            }
            U0(this, 0L, 1, null);
        }
    }

    public final void k1() {
        long j11;
        long w11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f49062d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j11 >> 60);
            if (i11 == 0) {
                w11 = e40.n.w(e40.n.G & j11, 2);
            } else if (i11 != 1) {
                return;
            } else {
                w11 = e40.n.w(e40.n.G & j11, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j11, w11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public final String k2() {
        String valueOf;
        t tVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S=" + P0() + ",R=" + J0() + ",B=" + r0() + ",B'=" + f49065g.get(this) + ",C=" + ((int) (f49062d.get(this) >> 60)) + ',');
        int i11 = (int) (f49062d.get(this) >> 60);
        if (i11 == 1) {
            sb2.append("CANCELLATION_STARTED,");
        } else if (i11 == 2) {
            sb2.append("CLOSED,");
        } else if (i11 == 3) {
            sb2.append("CANCELLED,");
        }
        sb2.append("SEND_SEGM=" + c40.u0.b(f49066h.get(this)) + ",RCV_SEGM=" + c40.u0.b(f49067i.get(this)));
        if (!e1()) {
            sb2.append(",EB_SEGM=" + c40.u0.b(f49068j.get(this)));
        }
        sb2.append(GlideException.a.f28776d);
        List Q = a00.h0.Q(f49067i.get(this), f49066h.get(this), f49068j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : Q) {
            t tVar2 = (t) obj;
            tVar = e40.n.f49114a;
            if (tVar2 != tVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((t) next).f58276c;
            do {
                Object next2 = it.next();
                long j12 = ((t) next2).f58276c;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        t tVar3 = (t) next;
        do {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c40.u0.b(tVar3));
            sb3.append("=[");
            sb3.append(tVar3.m() ? "*" : "");
            sb3.append(tVar3.f58276c);
            sb3.append(",prev=");
            t tVar4 = (t) tVar3.h();
            sb3.append(tVar4 != null ? c40.u0.b(tVar4) : null);
            sb3.append(',');
            sb2.append(sb3.toString());
            int i12 = e40.n.f49115b;
            for (int i13 = 0; i13 < i12; i13++) {
                Object J = tVar3.J(i13);
                Object I = tVar3.I(i13);
                if (J instanceof c40.n) {
                    valueOf = "cont";
                } else if (J instanceof k40.n) {
                    valueOf = "select";
                } else if (J instanceof j0) {
                    valueOf = "receiveCatching";
                } else if (J instanceof b) {
                    valueOf = "send(broadcast)";
                } else if (J instanceof n0) {
                    valueOf = "EB(" + J + ')';
                } else {
                    valueOf = String.valueOf(J);
                }
                sb2.append('[' + i13 + "]=(" + valueOf + ',' + I + "),");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("next=");
            t tVar5 = (t) tVar3.f();
            sb4.append(tVar5 != null ? c40.u0.b(tVar5) : null);
            sb4.append("]  ");
            sb2.append(sb4.toString());
            tVar3 = (t) tVar3.f();
        } while (tVar3 != null);
        return sb2.toString();
    }

    public final t<E> l0(long j11, t<E> tVar, long j12) {
        Object i11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49068j;
        x00.p pVar = (x00.p) e40.n.y();
        loop0: while (true) {
            i11 = h40.e.i(tVar, j11, pVar);
            if (!v0.h(i11)) {
                h40.u0 f11 = v0.f(i11);
                while (true) {
                    h40.u0 u0Var = (h40.u0) atomicReferenceFieldUpdater.get(this);
                    if (u0Var.f58276c >= f11.f58276c) {
                        break loop0;
                    }
                    if (!f11.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, u0Var, f11)) {
                        if (u0Var.v()) {
                            u0Var.q();
                        }
                    } else if (f11.v()) {
                        f11.q();
                    }
                }
            } else {
                break;
            }
        }
        if (v0.h(i11)) {
            i0();
            l1(j11, tVar);
            U0(this, 0L, 1, null);
            return null;
        }
        t<E> tVar2 = (t) v0.f(i11);
        if (tVar2.f58276c <= j11) {
            return tVar2;
        }
        long j13 = tVar2.f58276c;
        int i12 = e40.n.f49115b;
        if (f49064f.compareAndSet(this, j12 + 1, j13 * i12)) {
            T0((tVar2.f58276c * i12) - j12);
        } else {
            U0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l1(long r5, e40.t<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f58276c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            h40.f r0 = r7.f()
            e40.t r0 = (e40.t) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.m()
            if (r5 == 0) goto L22
            h40.f r5 = r7.f()
            e40.t r5 = (e40.t) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = t0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            h40.u0 r6 = (h40.u0) r6
            long r0 = r6.f58276c
            long r2 = r7.f58276c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.C()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.a.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.v()
            if (r5 == 0) goto L4b
            r6.q()
        L4b:
            return
        L4c:
            boolean r6 = r7.v()
            if (r6 == 0) goto L26
            r7.q()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.l1(long, e40.t):void");
    }

    public final boolean l2(Object obj, E e11) {
        boolean F;
        boolean F2;
        if (obj instanceof k40.n) {
            return ((k40.n) obj).h(this, e11);
        }
        if (obj instanceof j0) {
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            c40.p<s<? extends E>> pVar = ((j0) obj).f49056a;
            s b11 = s.b(s.f49161b.c(e11));
            x00.l<E, g2> lVar = this.f49072b;
            F2 = e40.n.F(pVar, b11, (x00.q) (lVar != null ? Z(lVar) : null));
            return F2;
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).k(e11);
        }
        if (!(obj instanceof c40.n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        c40.n nVar = (c40.n) obj;
        x00.l<E, g2> lVar2 = this.f49072b;
        F = e40.n.F(nVar, e11, (x00.q) (lVar2 != null ? W(lVar2) : null));
        return F;
    }

    @Override // e40.l0
    @m80.k
    public Object m(E e11) {
        Object obj;
        E e12;
        int i11;
        t tVar;
        m<E> mVar;
        if (i2(f49062d.get(this))) {
            return s.f49161b.b();
        }
        obj = e40.n.f49125l;
        t tVar2 = (t) M0().get(this);
        while (true) {
            long andIncrement = O0().getAndIncrement(this);
            long j11 = andIncrement & e40.n.G;
            boolean b12 = b1(andIncrement);
            int i12 = e40.n.f49115b;
            long j12 = j11 / i12;
            int i13 = (int) (j11 % i12);
            if (tVar2.f58276c != j12) {
                t n02 = n0(j12, tVar2);
                if (n02 != null) {
                    i11 = i13;
                    tVar = n02;
                    mVar = this;
                    e12 = e11;
                } else if (b12) {
                    return s.f49161b.a(K0());
                }
            } else {
                e12 = e11;
                i11 = i13;
                tVar = tVar2;
                mVar = this;
            }
            int t22 = mVar.t2(tVar, i11, e12, j11, obj, b12);
            tVar2 = tVar;
            if (t22 == 0) {
                tVar2.c();
                return s.f49161b.c(g2.f100423a);
            }
            if (t22 == 1) {
                return s.f49161b.c(g2.f100423a);
            }
            if (t22 == 2) {
                if (b12) {
                    tVar2.A();
                    return s.f49161b.a(K0());
                }
                z3 z3Var = obj instanceof z3 ? (z3) obj : null;
                if (z3Var != null) {
                    A1(z3Var, tVar2, i11);
                }
                tVar2.A();
                return s.f49161b.b();
            }
            if (t22 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (t22 == 4) {
                if (j11 < J0()) {
                    tVar2.c();
                }
                return s.f49161b.a(K0());
            }
            if (t22 == 5) {
                tVar2.c();
            }
            e11 = e12;
        }
    }

    public final t<E> m0(long j11, t<E> tVar) {
        Object i11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49067i;
        x00.p pVar = (x00.p) e40.n.y();
        loop0: while (true) {
            i11 = h40.e.i(tVar, j11, pVar);
            if (!v0.h(i11)) {
                h40.u0 f11 = v0.f(i11);
                while (true) {
                    h40.u0 u0Var = (h40.u0) atomicReferenceFieldUpdater.get(this);
                    if (u0Var.f58276c >= f11.f58276c) {
                        break loop0;
                    }
                    if (!f11.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, u0Var, f11)) {
                        if (u0Var.v()) {
                            u0Var.q();
                        }
                    } else if (f11.v()) {
                        f11.q();
                    }
                }
            } else {
                break;
            }
        }
        if (v0.h(i11)) {
            i0();
            if (tVar.f58276c * e40.n.f49115b < P0()) {
                tVar.c();
            }
            return null;
        }
        t<E> tVar2 = (t) v0.f(i11);
        if (!e1() && j11 <= r0() / e40.n.f49115b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f49068j;
            while (true) {
                h40.u0 u0Var2 = (h40.u0) atomicReferenceFieldUpdater2.get(this);
                if (u0Var2.f58276c >= tVar2.f58276c || !tVar2.C()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, u0Var2, tVar2)) {
                    if (u0Var2.v()) {
                        u0Var2.q();
                    }
                } else if (tVar2.v()) {
                    tVar2.q();
                }
            }
        }
        long j12 = tVar2.f58276c;
        if (j12 <= j11) {
            return tVar2;
        }
        int i12 = e40.n.f49115b;
        v2(j12 * i12);
        if (tVar2.f58276c * i12 < P0()) {
            tVar2.c();
        }
        return null;
    }

    public final void m1(Throwable th2, Object obj, kotlin.coroutines.d dVar) {
        x00.l<E, g2> lVar = this.f49072b;
        kotlin.jvm.internal.g0.m(lVar);
        Object h11 = s.h(obj);
        kotlin.jvm.internal.g0.m(h11);
        p0.a(lVar, h11, dVar);
    }

    public final boolean m2(Object obj, t<E> tVar, int i11) {
        if (obj instanceof c40.n) {
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e40.n.G((c40.n) obj, g2.f100423a, null, 2, null);
        }
        if (obj instanceof k40.n) {
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult L = ((k40.m) obj).L(this, g2.f100423a);
            if (L == TrySelectDetailedResult.REREGISTER) {
                tVar.E(i11);
            }
            return L == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return e40.n.G(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final t<E> n0(long j11, t<E> tVar) {
        Object i11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49066h;
        x00.p pVar = (x00.p) e40.n.y();
        loop0: while (true) {
            i11 = h40.e.i(tVar, j11, pVar);
            if (!v0.h(i11)) {
                h40.u0 f11 = v0.f(i11);
                while (true) {
                    h40.u0 u0Var = (h40.u0) atomicReferenceFieldUpdater.get(this);
                    if (u0Var.f58276c >= f11.f58276c) {
                        break loop0;
                    }
                    if (!f11.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, u0Var, f11)) {
                        if (u0Var.v()) {
                            u0Var.q();
                        }
                    } else if (f11.v()) {
                        f11.q();
                    }
                }
            } else {
                break;
            }
        }
        if (v0.h(i11)) {
            i0();
            if (tVar.f58276c * e40.n.f49115b < J0()) {
                tVar.c();
            }
            return null;
        }
        t<E> tVar2 = (t) v0.f(i11);
        long j12 = tVar2.f58276c;
        if (j12 <= j11) {
            return tVar2;
        }
        int i12 = e40.n.f49115b;
        w2(j12 * i12);
        if (tVar2.f58276c * i12 < J0()) {
            tVar2.c();
        }
        return null;
    }

    public final void n1(Throwable th2, E e11, kotlin.coroutines.d dVar) {
        x00.l<E, g2> lVar = this.f49072b;
        kotlin.jvm.internal.g0.m(lVar);
        p0.a(lVar, e11, dVar);
    }

    @m80.k
    public final Object n2(E e11) {
        t tVar;
        int i11;
        m<E> mVar;
        Object obj = e40.n.f49119f;
        t tVar2 = (t) M0().get(this);
        while (true) {
            long andIncrement = O0().getAndIncrement(this);
            long j11 = andIncrement & e40.n.G;
            boolean b12 = b1(andIncrement);
            int i12 = e40.n.f49115b;
            long j12 = j11 / i12;
            int i13 = (int) (j11 % i12);
            if (tVar2.f58276c != j12) {
                tVar = n0(j12, tVar2);
                if (tVar != null) {
                    mVar = this;
                    i11 = i13;
                } else if (b12) {
                    return s.f49161b.a(K0());
                }
            } else {
                tVar = tVar2;
                i11 = i13;
                mVar = this;
            }
            E e12 = e11;
            int t22 = mVar.t2(tVar, i11, e12, j11, obj, b12);
            tVar2 = tVar;
            if (t22 == 0) {
                tVar2.c();
                return s.f49161b.c(g2.f100423a);
            }
            if (t22 == 1) {
                return s.f49161b.c(g2.f100423a);
            }
            if (t22 == 2) {
                if (b12) {
                    tVar2.A();
                    return s.f49161b.a(K0());
                }
                z3 z3Var = obj instanceof z3 ? (z3) obj : null;
                if (z3Var != null) {
                    A1(z3Var, tVar2, i11);
                }
                j0((tVar2.f58276c * i12) + i11);
                return s.f49161b.c(g2.f100423a);
            }
            if (t22 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (t22 == 4) {
                if (j11 < J0()) {
                    tVar2.c();
                }
                return s.f49161b.a(K0());
            }
            if (t22 == 5) {
                tVar2.c();
            }
            e11 = e12;
        }
    }

    @Override // e40.l0
    public boolean o() {
        return b1(f49062d.get(this));
    }

    public final /* synthetic */ Object o0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, x00.l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
        return obj2;
    }

    public final /* synthetic */ void o2(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, x00.l<? super Long, Long> lVar) {
        while (true) {
            long j11 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j11, lVar.invoke(Long.valueOf(j11)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    @Override // e40.l0
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @yz.w0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e11) {
        return o.a.c(this, e11);
    }

    public final /* synthetic */ long p0() {
        return this.bufferEnd$volatile;
    }

    public final void p1(c40.n<? super s<? extends E>> nVar) {
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m6308constructorimpl(s.b(s.f49161b.a(u0()))));
    }

    public final boolean p2(t<E> tVar, int i11, long j11) {
        x0 x0Var;
        x0 x0Var2;
        Object J = tVar.J(i11);
        if ((J instanceof z3) && j11 >= f49063e.get(this)) {
            x0Var = e40.n.f49122i;
            if (tVar.D(i11, J, x0Var)) {
                if (m2(J, tVar, i11)) {
                    tVar.N(i11, e40.n.f49119f);
                    return true;
                }
                x0Var2 = e40.n.f49125l;
                tVar.N(i11, x0Var2);
                tVar.K(i11, false);
                return false;
            }
        }
        return q2(tVar, i11, j11);
    }

    @Override // e40.k0
    @m80.l
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @yz.w0(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) o.a.d(this);
    }

    public final void q1(c40.n<? super E> nVar) {
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(E0())));
    }

    public final boolean q2(t<E> tVar, int i11, long j11) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6;
        x0 x0Var7;
        x0 x0Var8;
        while (true) {
            Object J = tVar.J(i11);
            if (!(J instanceof z3)) {
                x0Var3 = e40.n.f49125l;
                if (J != x0Var3) {
                    if (J != null) {
                        if (J != e40.n.f49119f) {
                            x0Var5 = e40.n.f49123j;
                            if (J == x0Var5) {
                                break;
                            }
                            x0Var6 = e40.n.f49124k;
                            if (J == x0Var6) {
                                break;
                            }
                            x0Var7 = e40.n.f49126m;
                            if (J == x0Var7 || J == e40.n.z()) {
                                return true;
                            }
                            x0Var8 = e40.n.f49121h;
                            if (J != x0Var8) {
                                throw new IllegalStateException(("Unexpected cell state: " + J).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        x0Var4 = e40.n.f49120g;
                        if (tVar.D(i11, J, x0Var4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j11 >= f49063e.get(this)) {
                x0Var = e40.n.f49122i;
                if (tVar.D(i11, J, x0Var)) {
                    if (m2(J, tVar, i11)) {
                        tVar.N(i11, e40.n.f49119f);
                        return true;
                    }
                    x0Var2 = e40.n.f49125l;
                    tVar.N(i11, x0Var2);
                    tVar.K(i11, false);
                    return false;
                }
            } else if (tVar.D(i11, J, new n0((z3) J))) {
                return true;
            }
        }
    }

    public final long r0() {
        return f49064f.get(this);
    }

    public final void r1(k40.n<?> nVar) {
        nVar.e(e40.n.z());
    }

    public final Object r2(t<E> tVar, int i11, long j11, Object obj) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        Object J = tVar.J(i11);
        if (J == null) {
            if (j11 >= (f49062d.get(this) & e40.n.G)) {
                if (obj == null) {
                    x0Var3 = e40.n.f49129p;
                    return x0Var3;
                }
                if (tVar.D(i11, J, obj)) {
                    k0();
                    x0Var2 = e40.n.f49128o;
                    return x0Var2;
                }
            }
        } else if (J == e40.n.f49119f) {
            x0Var = e40.n.f49124k;
            if (tVar.D(i11, J, x0Var)) {
                k0();
                return tVar.L(i11);
            }
        }
        return s2(tVar, i11, j11, obj);
    }

    public final /* synthetic */ Object s0() {
        return this.bufferEndSegment$volatile;
    }

    public final void s1(E e11, k40.n<?> nVar) {
        x00.l<E, g2> lVar = this.f49072b;
        if (lVar != null) {
            p0.a(lVar, e11, nVar.getContext());
        }
        nVar.e(e40.n.z());
    }

    public final Object s2(t<E> tVar, int i11, long j11, Object obj) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6;
        x0 x0Var7;
        x0 x0Var8;
        x0 x0Var9;
        x0 x0Var10;
        x0 x0Var11;
        x0 x0Var12;
        x0 x0Var13;
        x0 x0Var14;
        x0 x0Var15;
        x0 x0Var16;
        while (true) {
            Object J = tVar.J(i11);
            if (J != null) {
                x0Var5 = e40.n.f49120g;
                if (J != x0Var5) {
                    if (J == e40.n.f49119f) {
                        x0Var6 = e40.n.f49124k;
                        if (tVar.D(i11, J, x0Var6)) {
                            k0();
                            return tVar.L(i11);
                        }
                    } else {
                        x0Var7 = e40.n.f49125l;
                        if (J == x0Var7) {
                            x0Var8 = e40.n.f49130q;
                            return x0Var8;
                        }
                        x0Var9 = e40.n.f49123j;
                        if (J == x0Var9) {
                            x0Var10 = e40.n.f49130q;
                            return x0Var10;
                        }
                        if (J == e40.n.z()) {
                            k0();
                            x0Var11 = e40.n.f49130q;
                            return x0Var11;
                        }
                        x0Var12 = e40.n.f49122i;
                        if (J != x0Var12) {
                            x0Var13 = e40.n.f49121h;
                            if (tVar.D(i11, J, x0Var13)) {
                                boolean z11 = J instanceof n0;
                                if (z11) {
                                    J = ((n0) J).f49141a;
                                }
                                if (m2(J, tVar, i11)) {
                                    x0Var16 = e40.n.f49124k;
                                    tVar.N(i11, x0Var16);
                                    k0();
                                    return tVar.L(i11);
                                }
                                x0Var14 = e40.n.f49125l;
                                tVar.N(i11, x0Var14);
                                tVar.K(i11, false);
                                if (z11) {
                                    k0();
                                }
                                x0Var15 = e40.n.f49130q;
                                return x0Var15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j11 < (f49062d.get(this) & e40.n.G)) {
                x0Var = e40.n.f49123j;
                if (tVar.D(i11, J, x0Var)) {
                    k0();
                    x0Var2 = e40.n.f49130q;
                    return x0Var2;
                }
            } else {
                if (obj == null) {
                    x0Var3 = e40.n.f49129p;
                    return x0Var3;
                }
                if (tVar.D(i11, J, obj)) {
                    k0();
                    x0Var4 = e40.n.f49128o;
                    return x0Var4;
                }
            }
        }
    }

    public final Object t1(E e11, j00.c<? super g2> cVar) {
        UndeliveredElementException c11;
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        x00.l<E, g2> lVar = this.f49072b;
        if (lVar == null || (c11 = p0.c(lVar, e11, null, 2, null)) == null) {
            Throwable K0 = K0();
            Result.a aVar = Result.Companion;
            pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(K0)));
        } else {
            yz.r.a(c11, K0());
            Result.a aVar2 = Result.Companion;
            pVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(c11)));
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F == kotlin.coroutines.intrinsics.b.l() ? F : g2.f100423a;
    }

    public final int t2(t<E> tVar, int i11, E e11, long j11, Object obj, boolean z11) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        tVar.O(i11, e11);
        if (z11) {
            return u2(tVar, i11, e11, j11, obj, z11);
        }
        Object J = tVar.J(i11);
        if (J == null) {
            if (a0(j11)) {
                if (tVar.D(i11, null, e40.n.f49119f)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (tVar.D(i11, null, obj)) {
                    return 2;
                }
            }
        } else if (J instanceof z3) {
            tVar.E(i11);
            if (l2(J, e11)) {
                x0Var3 = e40.n.f49124k;
                tVar.N(i11, x0Var3);
                v1();
                return 0;
            }
            x0Var = e40.n.f49126m;
            Object F = tVar.F(i11, x0Var);
            x0Var2 = e40.n.f49126m;
            if (F == x0Var2) {
                return 5;
            }
            tVar.K(i11, true);
            return 5;
        }
        return u2(tVar, i11, e11, j11, obj, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        r16 = r7;
        r3 = (e40.t) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e8, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m.toString():java.lang.String");
    }

    @Override // e40.l0
    public void u(@m80.k x00.l<? super Throwable, g2> lVar) {
        x0 x0Var;
        x0 x0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var3;
        x0 x0Var4;
        if (androidx.concurrent.futures.a.a(f49070l, this, null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f49070l;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            x0Var = e40.n.f49138y;
            if (obj != x0Var) {
                x0Var2 = e40.n.f49139z;
                if (obj == x0Var2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f49070l;
            x0Var3 = e40.n.f49138y;
            x0Var4 = e40.n.f49139z;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, x0Var3, x0Var4));
        lVar.invoke(u0());
    }

    @m80.l
    public final Throwable u0() {
        return (Throwable) f49069k.get(this);
    }

    public final void u1(E e11, c40.n<? super g2> nVar) {
        x00.l<E, g2> lVar = this.f49072b;
        if (lVar != null) {
            p0.a(lVar, e11, nVar.getContext());
        }
        Throwable K0 = K0();
        Result.a aVar = Result.Companion;
        nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(K0)));
    }

    public final int u2(t<E> tVar, int i11, E e11, long j11, Object obj, boolean z11) {
        x0 x0Var;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        x0 x0Var5;
        x0 x0Var6;
        x0 x0Var7;
        while (true) {
            Object J = tVar.J(i11);
            if (J != null) {
                x0Var2 = e40.n.f49120g;
                if (J != x0Var2) {
                    x0Var3 = e40.n.f49126m;
                    if (J == x0Var3) {
                        tVar.E(i11);
                        return 5;
                    }
                    x0Var4 = e40.n.f49123j;
                    if (J == x0Var4) {
                        tVar.E(i11);
                        return 5;
                    }
                    if (J == e40.n.z()) {
                        tVar.E(i11);
                        i0();
                        return 4;
                    }
                    tVar.E(i11);
                    if (J instanceof n0) {
                        J = ((n0) J).f49141a;
                    }
                    if (l2(J, e11)) {
                        x0Var7 = e40.n.f49124k;
                        tVar.N(i11, x0Var7);
                        v1();
                        return 0;
                    }
                    x0Var5 = e40.n.f49126m;
                    Object F = tVar.F(i11, x0Var5);
                    x0Var6 = e40.n.f49126m;
                    if (F != x0Var6) {
                        tVar.K(i11, true);
                    }
                    return 5;
                }
                if (tVar.D(i11, J, e40.n.f49119f)) {
                    return 1;
                }
            } else if (!a0(j11) || z11) {
                if (z11) {
                    x0Var = e40.n.f49125l;
                    if (tVar.D(i11, null, x0Var)) {
                        tVar.K(i11, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (tVar.D(i11, null, obj)) {
                        return 2;
                    }
                }
            } else if (tVar.D(i11, null, e40.n.f49119f)) {
                return 1;
            }
        }
    }

    public final /* synthetic */ Object v0() {
        return this.closeHandler$volatile;
    }

    public final void v2(long j11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f49063e;
        while (true) {
            long j12 = atomicLongFieldUpdater.get(this);
            if (j12 >= j11) {
                return;
            }
            long j13 = j11;
            if (f49063e.compareAndSet(this, j12, j13)) {
                return;
            } else {
                j11 = j13;
            }
        }
    }

    public final void w2(long j11) {
        long j12;
        long w11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f49062d;
        do {
            j12 = atomicLongFieldUpdater.get(this);
            long j13 = e40.n.G & j12;
            if (j13 >= j11) {
                return;
            } else {
                w11 = e40.n.w(j13, (int) (j12 >> 60));
            }
        } while (!f49062d.compareAndSet(this, j12, w11));
    }

    public final /* synthetic */ long x0() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    public final void x2(long j11) {
        int i11;
        long v11;
        long v12;
        long v13;
        m<E> mVar = this;
        if (mVar.e1()) {
            return;
        }
        while (mVar.r0() <= j11) {
            mVar = this;
        }
        i11 = e40.n.f49116c;
        for (int i12 = 0; i12 < i11; i12++) {
            long r02 = mVar.r0();
            if (r02 == (4611686018427387903L & f49065g.get(mVar)) && r02 == mVar.r0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f49065g;
        while (true) {
            long j12 = atomicLongFieldUpdater.get(mVar);
            v11 = e40.n.v(j12 & 4611686018427387903L, true);
            if (atomicLongFieldUpdater.compareAndSet(mVar, j12, v11)) {
                break;
            } else {
                mVar = this;
            }
        }
        while (true) {
            long r03 = mVar.r0();
            long j13 = f49065g.get(mVar);
            long j14 = j13 & 4611686018427387903L;
            boolean z11 = (4611686018427387904L & j13) != 0;
            if (r03 == j14 && r03 == mVar.r0()) {
                break;
            }
            if (z11) {
                mVar = this;
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f49065g;
                v12 = e40.n.v(j14, true);
                mVar = this;
                atomicLongFieldUpdater2.compareAndSet(mVar, j13, v12);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f49065g;
        while (true) {
            long j15 = atomicLongFieldUpdater3.get(mVar);
            v13 = e40.n.v(j15 & 4611686018427387903L, false);
            boolean compareAndSet = atomicLongFieldUpdater3.compareAndSet(mVar, j15, v13);
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
            if (compareAndSet) {
                return;
            }
            atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
            mVar = this;
        }
    }

    @Override // e40.l0
    public boolean z(@m80.l Throwable th2) {
        return f0(th2, false);
    }

    public final void z1(z3 z3Var, t<E> tVar, int i11) {
        w1();
        z3Var.b(tVar, i11);
    }

    @Override // e40.k0
    public final void cancel(@m80.l CancellationException cancellationException) {
        b0(cancellationException);
    }

    public /* synthetic */ m(int i11, x00.l lVar, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, (i12 & 2) != 0 ? null : lVar);
    }

    public static /* synthetic */ void A0() {
    }

    public static /* synthetic */ void B0() {
    }

    public static /* synthetic */ void C0() {
    }

    public static /* synthetic */ void D0() {
    }

    @y1
    public static /* synthetic */ void Y0() {
    }

    @y1
    public static /* synthetic */ void a1() {
    }

    @y1
    public static /* synthetic */ void d1() {
    }

    public static /* synthetic */ void z0() {
    }

    public void o1() {
    }

    public void v1() {
    }

    public void w1() {
    }
}
