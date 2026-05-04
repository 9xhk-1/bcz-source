package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LinkedValue<V> {
    public static final int $stable = 8;

    @l
    private final Object next;

    @l
    private final Object previous;
    private final V value;

    public LinkedValue(V v11, @l Object obj, @l Object obj2) {
        this.value = v11;
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

    public final V getValue() {
        return this.value;
    }

    @k
    public final LinkedValue<V> withNext(@l Object obj) {
        return new LinkedValue<>(this.value, this.previous, obj);
    }

    @k
    public final LinkedValue<V> withPrevious(@l Object obj) {
        return new LinkedValue<>(this.value, obj, this.next);
    }

    @k
    public final LinkedValue<V> withValue(V v11) {
        return new LinkedValue<>(v11, this.previous, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkedValue(V r2) {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue.<init>(java.lang.Object):void");
    }

    public LinkedValue(V v11, @l Object obj) {
        this(v11, obj, EndOfChain.INSTANCE);
    }
}
