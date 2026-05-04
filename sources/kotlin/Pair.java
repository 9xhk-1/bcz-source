package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a11, B b11) {
        this.first = a11;
        this.second = b11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = pair.first;
        }
        if ((i11 & 2) != 0) {
            obj2 = pair.second;
        }
        return pair.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    @k
    public final Pair<A, B> copy(A a11, B b11) {
        return new Pair<>(a11, b11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return g0.g(this.first, pair.first) && g0.g(this.second, pair.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a11 = this.first;
        int hashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.second;
        return hashCode + (b11 != null ? b11.hashCode() : 0);
    }

    @k
    public String toString() {
        return '(' + this.first + j2.O + this.second + ')';
    }
}
