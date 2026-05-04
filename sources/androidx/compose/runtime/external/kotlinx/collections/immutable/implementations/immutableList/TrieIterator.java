package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 8;
    private int height;
    private boolean isInRightEdge;

    @k
    private Object[] path;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(@k Object[] objArr, int i11, int i12, int i13) {
        super(i11, i12);
        this.height = i13;
        Object[] objArr2 = new Object[i13];
        this.path = objArr2;
        ?? r52 = i11 == i12 ? 1 : 0;
        this.isInRightEdge = r52;
        objArr2[0] = objArr;
        fillPath(i11 - r52, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        g0.n(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    private final void fillPath(int i11, int i12) {
        int i13 = (this.height - i12) * 5;
        while (i12 < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[i12 - 1];
            g0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i12] = ((Object[]) obj)[UtilsKt.indexSegment(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    private final void fillPathIfNeeded(int i11) {
        int i12 = 0;
        while (UtilsKt.indexSegment(getIndex(), i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i12 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E elementAtCurrentIndex = elementAtCurrentIndex();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return elementAtCurrentIndex;
        }
        fillPathIfNeeded(0);
        return elementAtCurrentIndex;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return elementAtCurrentIndex();
        }
        fillPathIfNeeded(31);
        return elementAtCurrentIndex();
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime_release(@k Object[] objArr, int i11, int i12, int i13) {
        setIndex(i11);
        setSize(i12);
        this.height = i13;
        if (this.path.length < i13) {
            this.path = new Object[i13];
        }
        this.path[0] = objArr;
        ?? r02 = i11 == i12 ? 1 : 0;
        this.isInRightEdge = r02;
        fillPath(i11 - r02, 1);
    }
}
