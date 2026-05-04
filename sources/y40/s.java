package y40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSegmentPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentPool.kt\nkotlinx/io/RefCountingCopyTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
/* loaded from: classes8.dex */
public final class s extends u {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f99315b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater<s> f99316c = AtomicIntegerFieldUpdater.newUpdater(s.class, "a");

    /* renamed from: a, reason: collision with root package name */
    public volatile int f99317a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }

        @w00.o
        public static /* synthetic */ void a() {
        }
    }

    @Override // y40.u
    public void a() {
        f99316c.incrementAndGet(this);
    }

    @Override // y40.u
    public boolean b() {
        return this.f99317a > 0;
    }

    @Override // y40.u
    public boolean c() {
        if (this.f99317a == 0) {
            return false;
        }
        int decrementAndGet = f99316c.decrementAndGet(this);
        if (decrementAndGet >= 0) {
            return true;
        }
        if (decrementAndGet == -1) {
            this.f99317a = 0;
            return false;
        }
        throw new IllegalStateException(("Shared copies count is negative: " + (decrementAndGet + 1)).toString());
    }
}
