package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Links {
    public static final int $stable = 8;

    @l
    private final Object next;

    @l
    private final Object previous;

    public Links(@l Object obj, @l Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }

    @l
    public final Object getNext() {
        return this.next;
    }

    @l
    public final Object getPrevious() {
        return this.previous;
    }

    @k
    public final Links withNext(@l Object obj) {
        return new Links(this.previous, obj);
    }

    @k
    public final Links withPrevious(@l Object obj) {
        return new Links(obj, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Links() {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links.<init>():void");
    }

    public Links(@l Object obj) {
        this(obj, EndOfChain.INSTANCE);
    }
}
