package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A a11, B b11, C c11) {
        this.first = a11;
        this.second = b11;
        this.third = c11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple copy$default(Triple triple, Object obj, Object obj2, Object obj3, int i11, Object obj4) {
        if ((i11 & 1) != 0) {
            obj = triple.first;
        }
        if ((i11 & 2) != 0) {
            obj2 = triple.second;
        }
        if ((i11 & 4) != 0) {
            obj3 = triple.third;
        }
        return triple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    @k
    public final Triple<A, B, C> copy(A a11, B b11, C c11) {
        return new Triple<>(a11, b11, c11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return g0.g(this.first, triple.first) && g0.g(this.second, triple.second) && g0.g(this.third, triple.third);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a11 = this.first;
        int hashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.second;
        int hashCode2 = (hashCode + (b11 == null ? 0 : b11.hashCode())) * 31;
        C c11 = this.third;
        return hashCode2 + (c11 != null ? c11.hashCode() : 0);
    }

    @k
    public String toString() {
        return '(' + this.first + j2.O + this.second + j2.O + this.third + ')';
    }
}
