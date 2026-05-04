package kotlin.time;

import kotlin.time.n;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public final class l implements n.c {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final l f67790b = new l();

    /* renamed from: c, reason: collision with root package name */
    public static final long f67791c = System.nanoTime();

    private final long f() {
        return System.nanoTime() - f67791c;
    }

    @Override // kotlin.time.n.c, kotlin.time.n
    public /* bridge */ /* synthetic */ d a() {
        return n.b.a.d(e());
    }

    public final long b(long j11, long j12) {
        return n.b.a.g(j.d(j11, DurationUnit.NANOSECONDS, j12));
    }

    public final long c(long j11, long j12) {
        return j.h(j11, j12, DurationUnit.NANOSECONDS);
    }

    public final long d(long j11) {
        return j.f(f(), j11, DurationUnit.NANOSECONDS);
    }

    public long e() {
        return n.b.a.g(f());
    }

    @m80.k
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.n
    public /* bridge */ /* synthetic */ m a() {
        return n.b.a.d(e());
    }
}
