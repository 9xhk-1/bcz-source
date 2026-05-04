package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n360#1,4:417\n1#2:421\n1#2:422\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n*L\n341#1:417,4\n341#1:421\n*E\n"})
/* loaded from: classes.dex */
abstract class StateMapMutableIterator<K, V> {

    @l
    private Map.Entry<? extends K, ? extends V> current;

    @k
    private final Iterator<Map.Entry<K, V>> iterator;

    @k
    private final SnapshotStateMap<K, V> map;
    private int modification;

    @l
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(@k SnapshotStateMap<K, V> snapshotStateMap, @k Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime_release();
        advance();
    }

    public final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    @l
    public final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    @k
    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @k
    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public final int getModification() {
        return this.modification;
    }

    @l
    public final Map.Entry<K, V> getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    public final <T> T modify(@k x00.a<? extends T> aVar) {
        if (getMap().getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
        T invoke = aVar.invoke();
        this.modification = getMap().getModification$runtime_release();
        return invoke;
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.current;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.map.remove(entry.getKey());
        this.current = null;
        g2 g2Var = g2.f100423a;
        this.modification = getMap().getModification$runtime_release();
    }

    public final void setCurrent(@l Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    public final void setModification(int i11) {
        this.modification = i11;
    }

    public final void setNext(@l Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }
}
