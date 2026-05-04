package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b0
/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f63361e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final long[] f63362f = new long[0];

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h50.f f63363a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<h50.f, Integer, Boolean> f63364b;

    /* renamed from: c, reason: collision with root package name */
    public long f63365c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final long[] f63366d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@m80.k h50.f descriptor, @m80.k x00.p<? super h50.f, ? super Integer, Boolean> readIfAbsent) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(readIfAbsent, "readIfAbsent");
        this.f63363a = descriptor;
        this.f63364b = readIfAbsent;
        int h11 = descriptor.h();
        if (h11 <= 64) {
            this.f63365c = h11 != 64 ? (-1) << h11 : 0L;
            this.f63366d = f63362f;
        } else {
            this.f63365c = 0L;
            this.f63366d = e(h11);
        }
    }

    public final void a(int i11) {
        if (i11 < 64) {
            this.f63365c |= 1 << i11;
        } else {
            b(i11);
        }
    }

    public final void b(int i11) {
        int i12 = (i11 >>> 6) - 1;
        long[] jArr = this.f63366d;
        jArr[i12] = jArr[i12] | (1 << (i11 & 63));
    }

    public final int c() {
        int length = this.f63366d.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            int i13 = i12 * 64;
            long j11 = this.f63366d[i11];
            while (j11 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
                j11 |= 1 << numberOfTrailingZeros;
                int i14 = numberOfTrailingZeros + i13;
                if (this.f63364b.invoke(this.f63363a, Integer.valueOf(i14)).booleanValue()) {
                    this.f63366d[i11] = j11;
                    return i14;
                }
            }
            this.f63366d[i11] = j11;
            i11 = i12;
        }
        return -1;
    }

    public final int d() {
        int numberOfTrailingZeros;
        int h11 = this.f63363a.h();
        do {
            long j11 = this.f63365c;
            if (j11 == -1) {
                if (h11 > 64) {
                    return c();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j11);
            this.f63365c |= 1 << numberOfTrailingZeros;
        } while (!this.f63364b.invoke(this.f63363a, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }

    public final long[] e(int i11) {
        long[] jArr = new long[(i11 - 1) >>> 6];
        if ((i11 & 63) != 0) {
            jArr[a00.a0.Ne(jArr)] = (-1) << i11;
        }
        return jArr;
    }
}
