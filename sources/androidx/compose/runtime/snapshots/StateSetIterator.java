package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import y00.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n258#1,2:269\n1#2:271\n1#2:272\n*S KotlinDebug\n*F\n+ 1 SnapshotStateSet.kt\nandroidx/compose/runtime/snapshots/StateSetIterator\n*L\n241#1:269,2\n241#1:271\n*E\n"})
/* loaded from: classes.dex */
final class StateSetIterator<T> implements Iterator<T>, d {

    @l
    private T current;

    @k
    private final Iterator<T> iterator;
    private int modification;

    @l
    private T next;

    @k
    private final SnapshotStateSet<T> set;

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(@k SnapshotStateSet<T> snapshotStateSet, @k Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = snapshotStateSet.getModification$runtime_release();
        advance();
    }

    private final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    private final <T> T modify(x00.a<? extends T> aVar) {
        validateModification();
        T invoke = aVar.invoke();
        this.modification = this.set.getModification$runtime_release();
        return invoke;
    }

    private final void validateModification() {
        if (this.set.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @l
    public final T getCurrent() {
        return this.current;
    }

    @k
    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getModification() {
        return this.modification;
    }

    @l
    public final T getNext() {
        return this.next;
    }

    @k
    public final SnapshotStateSet<T> getSet() {
        return this.set;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public T next() {
        validateModification();
        advance();
        T t11 = this.current;
        if (t11 != null) {
            return t11;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        validateModification();
        T t11 = this.current;
        if (t11 == null) {
            throw new IllegalStateException();
        }
        this.set.remove(t11);
        this.current = null;
        g2 g2Var = g2.f100423a;
        this.modification = this.set.getModification$runtime_release();
    }

    public final void setCurrent(@l T t11) {
        this.current = t11;
    }

    public final void setModification(int i11) {
        this.modification = i11;
    }

    public final void setNext(@l T t11) {
        this.next = t11;
    }

    public static /* synthetic */ void getNext$annotations() {
    }
}
