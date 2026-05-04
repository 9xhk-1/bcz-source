package androidx.collection;

import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LongLongPair {
    private final long first;
    private final long second;

    public LongLongPair(long j11, long j12) {
        this.first = j11;
        this.second = j12;
    }

    public final long component1() {
        return getFirst();
    }

    public final long component2() {
        return getSecond();
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof LongLongPair)) {
            return false;
        }
        LongLongPair longLongPair = (LongLongPair) obj;
        return longLongPair.first == this.first && longLongPair.second == this.second;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getSecond() {
        return this.second;
    }

    public int hashCode() {
        return Long.hashCode(this.first) ^ Long.hashCode(this.second);
    }

    @k
    public String toString() {
        return '(' + this.first + j2.O + this.second + ')';
    }
}
