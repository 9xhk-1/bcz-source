package kotlin.random;

import e10.e;
import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes8.dex */
public final class XorWowRandom extends Random implements Serializable {

    @k
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* renamed from: v, reason: collision with root package name */
    private int f67070v;

    /* renamed from: w, reason: collision with root package name */
    private int f67071w;

    /* renamed from: x, reason: collision with root package name */
    private int f67072x;

    /* renamed from: y, reason: collision with root package name */
    private int f67073y;

    /* renamed from: z, reason: collision with root package name */
    private int f67074z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public XorWowRandom(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f67072x = i11;
        this.f67073y = i12;
        this.f67074z = i13;
        this.f67071w = i14;
        this.f67070v = i15;
        this.addend = i16;
        checkInvariants();
        for (int i17 = 0; i17 < 64; i17++) {
            nextInt();
        }
    }

    private final void checkInvariants() {
        if ((this.f67072x | this.f67073y | this.f67074z | this.f67071w | this.f67070v) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }

    private final Object readResolve() {
        try {
            checkInvariants();
            return this;
        } catch (Throwable th2) {
            Throwable initCause = new InvalidObjectException(th2.getMessage()).initCause(th2);
            g0.o(initCause, "initCause(...)");
            throw initCause;
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int i11) {
        return e.j(nextInt(), i11);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i11 = this.f67072x;
        int i12 = i11 ^ (i11 >>> 2);
        this.f67072x = this.f67073y;
        this.f67073y = this.f67074z;
        this.f67074z = this.f67071w;
        int i13 = this.f67070v;
        this.f67071w = i13;
        int i14 = ((i12 ^ (i12 << 1)) ^ i13) ^ (i13 << 4);
        this.f67070v = i14;
        int i15 = this.addend + 362437;
        this.addend = i15;
        return i14 + i15;
    }

    public XorWowRandom(int i11, int i12) {
        this(i11, i12, 0, 0, ~i11, (i11 << 10) ^ (i12 >>> 4));
    }
}
