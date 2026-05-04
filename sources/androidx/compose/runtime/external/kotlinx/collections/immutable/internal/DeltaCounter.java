package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DeltaCounter {
    public static final int $stable = 8;
    private int count;

    public DeltaCounter() {
        this(0, 1, null);
    }

    public static /* synthetic */ DeltaCounter copy$default(DeltaCounter deltaCounter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = deltaCounter.count;
        }
        return deltaCounter.copy(i11);
    }

    public final int component1() {
        return this.count;
    }

    @k
    public final DeltaCounter copy(int i11) {
        return new DeltaCounter(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i11) {
        this.count += i11;
    }

    public final void setCount(int i11) {
        this.count = i11;
    }

    @k
    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public DeltaCounter(int i11) {
        this.count = i11;
    }

    public /* synthetic */ DeltaCounter(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
