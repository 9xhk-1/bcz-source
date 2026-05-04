package t40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 math.kt\nkotlinx/datetime/internal/DecimalFraction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements Comparable<c> {

    /* renamed from: a, reason: collision with root package name */
    public final int f89496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89497b;

    public c(int i11, int i12) {
        this.f89496a = i11;
        this.f89497b = i12;
        if (i12 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Digits must be non-negative, but was " + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@k c other) {
        g0.p(other, "other");
        int max = Math.max(this.f89497b, other.f89497b);
        return g0.t(b(max), other.b(max));
    }

    public final int b(int i11) {
        int i12 = this.f89497b;
        return i11 == i12 ? this.f89496a : i11 > i12 ? this.f89496a * f.c()[i11 - this.f89497b] : this.f89496a / f.c()[this.f89497b - i11];
    }

    public final int c() {
        return this.f89497b;
    }

    public final int d() {
        return this.f89496a;
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f.c()[this.f89497b];
        sb2.append(this.f89496a / i11);
        sb2.append('.');
        sb2.append(k0.x4(String.valueOf(i11 + (this.f89496a % i11)), "1"));
        return sb2.toString();
    }
}
