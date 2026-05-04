package a40;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q extends m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1936c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Object[] f1937d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final AtomicInteger f1938e;

    public q(int i11, @m80.k n format) {
        g0.p(format, "format");
        this.f1934a = format;
        if (i11 < 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int highestOneBit = Integer.highestOneBit((i11 << 1) - 1);
        this.f1935b = highestOneBit;
        this.f1936c = highestOneBit - 1;
        this.f1937d = new Object[highestOneBit];
        this.f1938e = new AtomicInteger(0);
    }

    @Override // a40.m
    public void a(@m80.k Object event) {
        g0.p(event, "event");
        this.f1937d[this.f1938e.getAndIncrement() & this.f1936c] = event;
    }

    @Override // a40.m
    public void b(@m80.k Object event1, @m80.k Object event2) {
        g0.p(event1, "event1");
        g0.p(event2, "event2");
        int andAdd = this.f1938e.getAndAdd(2);
        Object[] objArr = this.f1937d;
        int i11 = this.f1936c;
        objArr[andAdd & i11] = event1;
        objArr[(andAdd + 1) & i11] = event2;
    }

    @Override // a40.m
    public void c(@m80.k Object event1, @m80.k Object event2, @m80.k Object event3) {
        g0.p(event1, "event1");
        g0.p(event2, "event2");
        g0.p(event3, "event3");
        int andAdd = this.f1938e.getAndAdd(3);
        Object[] objArr = this.f1937d;
        int i11 = this.f1936c;
        objArr[andAdd & i11] = event1;
        objArr[(andAdd + 1) & i11] = event2;
        objArr[(andAdd + 2) & i11] = event3;
    }

    @Override // a40.m
    public void d(@m80.k Object event1, @m80.k Object event2, @m80.k Object event3, @m80.k Object event4) {
        g0.p(event1, "event1");
        g0.p(event2, "event2");
        g0.p(event3, "event3");
        g0.p(event4, "event4");
        int andAdd = this.f1938e.getAndAdd(4);
        Object[] objArr = this.f1937d;
        int i11 = this.f1936c;
        objArr[andAdd & i11] = event1;
        objArr[(andAdd + 1) & i11] = event2;
        objArr[(andAdd + 2) & i11] = event3;
        objArr[(andAdd + 3) & i11] = event4;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f1938e.get();
        int i12 = this.f1936c & i11;
        int i13 = this.f1935b;
        int i14 = 0;
        int i15 = i11 > i13 ? i11 - i13 : 0;
        int i16 = i12;
        do {
            Object obj = this.f1937d[i16];
            if (obj != null) {
                int i17 = i14 + 1;
                if (i14 > 0) {
                    sb2.append('\n');
                }
                sb2.append(this.f1934a.a(i15, obj));
                i15++;
                i14 = i17;
            }
            i16 = (i16 + 1) & this.f1936c;
        } while (i16 != i12);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
