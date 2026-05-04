package l60;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d1 f70393a = new d1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f70394b = 65536;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c1 f70395c = new c1(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f70396d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final AtomicReference<c1>[] f70397e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f70396d = highestOneBit;
        AtomicReference<c1>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i11 = 0; i11 < highestOneBit; i11++) {
            atomicReferenceArr[i11] = new AtomicReference<>();
        }
        f70397e = atomicReferenceArr;
    }

    @w00.o
    public static final void d(@m80.k c1 segment) {
        AtomicReference<c1> a11;
        c1 c1Var;
        c1 andSet;
        kotlin.jvm.internal.g0.p(segment, "segment");
        if (segment.f70388f != null || segment.f70389g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f70386d || (andSet = (a11 = f70393a.a()).getAndSet((c1Var = f70395c))) == c1Var) {
            return;
        }
        int i11 = andSet != null ? andSet.f70385c : 0;
        if (i11 >= f70394b) {
            a11.set(andSet);
            return;
        }
        segment.f70388f = andSet;
        segment.f70384b = 0;
        segment.f70385c = i11 + 8192;
        a11.set(segment);
    }

    @w00.o
    @m80.k
    public static final c1 e() {
        AtomicReference<c1> a11 = f70393a.a();
        c1 c1Var = f70395c;
        c1 andSet = a11.getAndSet(c1Var);
        if (andSet == c1Var) {
            return new c1();
        }
        if (andSet == null) {
            a11.set(null);
            return new c1();
        }
        a11.set(andSet.f70388f);
        andSet.f70388f = null;
        andSet.f70385c = 0;
        return andSet;
    }

    public final AtomicReference<c1> a() {
        return f70397e[(int) (Thread.currentThread().getId() & (f70396d - 1))];
    }

    public final int b() {
        c1 c1Var = a().get();
        if (c1Var == null) {
            return 0;
        }
        return c1Var.f70385c;
    }

    public final int c() {
        return f70394b;
    }
}
