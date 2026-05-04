package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.atomic.LinkedQueueNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@rx.internal.util.n
/* loaded from: classes9.dex */
public abstract class a<E> extends b<E> {
    public long I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public long V;
    public long W;
    public long X;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return g() == b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        LinkedQueueNode<E> lvNext;
        LinkedQueueNode<E> g11 = g();
        LinkedQueueNode<E> b11 = b();
        int i11 = 0;
        while (g11 != b11 && i11 < Integer.MAX_VALUE) {
            do {
                lvNext = g11.lvNext();
            } while (lvNext == null);
            i11++;
            g11 = lvNext;
        }
        return i11;
    }
}
