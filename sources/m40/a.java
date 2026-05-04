package m40;

import j00.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.i;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a<T> implements i<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f72335b = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed$volatile");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Stream<T> f72336a;
    private volatile /* synthetic */ int consumed$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    /* renamed from: m40.a$a, reason: collision with other inner class name */
    public static final class C0870a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72337a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72338b;

        /* renamed from: c, reason: collision with root package name */
        public Object f72339c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f72340d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ a<T> f72341e;

        /* renamed from: f, reason: collision with root package name */
        public int f72342f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0870a(a<T> aVar, c<? super C0870a> cVar) {
            super(cVar);
            this.f72341e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f72340d = obj;
            this.f72342f |= Integer.MIN_VALUE;
            return this.f72341e.collect(null, this);
        }
    }

    public a(@k Stream<T> stream) {
        this.f72336a = stream;
    }

    private final /* synthetic */ int g() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void i(int i11) {
        this.consumed$volatile = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0031, B:14:0x0058, B:16:0x005e), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.i
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(@m80.k kotlinx.coroutines.flow.j<? super T> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m40.a.C0870a
            if (r0 == 0) goto L13
            r0 = r7
            m40.a$a r0 = (m40.a.C0870a) r0
            int r1 = r0.f72342f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72342f = r1
            goto L18
        L13:
            m40.a$a r0 = new m40.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f72340d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f72342f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f72339c
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.f72338b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r4 = r0.f72337a
            m40.a r4 = (m40.a) r4
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L36
            r7 = r2
            goto L58
        L36:
            r6 = move-exception
            goto L7b
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.e.n(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = h()
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto L81
            java.util.stream.Stream<T> r7 = r5.f72336a     // Catch: java.lang.Throwable -> L79
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L79
            r4 = r7
            r7 = r6
            r6 = r4
            r4 = r5
        L58:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L71
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L36
            r0.f72337a = r4     // Catch: java.lang.Throwable -> L36
            r0.f72338b = r7     // Catch: java.lang.Throwable -> L36
            r0.f72339c = r6     // Catch: java.lang.Throwable -> L36
            r0.f72342f = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r7.emit(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L58
            return r1
        L71:
            java.util.stream.Stream<T> r6 = r4.f72336a
            r6.close()
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L79:
            r6 = move-exception
            r4 = r5
        L7b:
            java.util.stream.Stream<T> r7 = r4.f72336a
            r7.close()
            throw r6
        L81:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Stream.consumeAsFlow can be collected only once"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m40.a.collect(kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }
}
