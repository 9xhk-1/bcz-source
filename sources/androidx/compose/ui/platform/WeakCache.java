package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1101#2:77\n1083#2,2:78\n641#3,2:80\n519#3:82\n44#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n48#1:82\n49#1:83\n*E\n"})
/* loaded from: classes2.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;

    @m80.k
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);

    @m80.k
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
            }
        } while (poll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    @m80.l
    public final T pop() {
        clearWeakReferences();
        while (this.values.getSize() != 0) {
            T t11 = this.values.removeAt(r0.getSize() - 1).get();
            if (t11 != null) {
                return t11;
            }
        }
        return null;
    }

    public final void push(T t11) {
        clearWeakReferences();
        this.values.add(new WeakReference(t11, this.referenceQueue));
    }
}
