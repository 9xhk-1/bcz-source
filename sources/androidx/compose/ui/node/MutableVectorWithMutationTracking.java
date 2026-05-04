package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,52:1\n1#2:53\n423#3,9:54\n472#3:63\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n46#1:54,9\n50#1:63\n*E\n"})
/* loaded from: classes2.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;

    @k
    private final x00.a<g2> onVectorMutated;

    @k
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(@k MutableVector<T> mutableVector, @k x00.a<g2> aVar) {
        this.vector = mutableVector;
        this.onVectorMutated = aVar;
    }

    public final void add(int i11, T t11) {
        this.vector.add(i11, t11);
        this.onVectorMutated.invoke();
    }

    @k
    public final List<T> asList() {
        return getVector().asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(@k l<? super T, g2> lVar) {
        MutableVector<T> vector = getVector();
        T[] tArr = vector.content;
        int size = vector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(tArr[i11]);
        }
    }

    public final T get(int i11) {
        return getVector().content[i11];
    }

    @k
    public final x00.a<g2> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    @k
    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i11) {
        T removeAt = this.vector.removeAt(i11);
        this.onVectorMutated.invoke();
        return removeAt;
    }
}
