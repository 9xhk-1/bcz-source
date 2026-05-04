package androidx.compose.foundation.gestures;

import a00.a0;
import a00.r0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n+ 2 AnchoredDraggable.jvm.kt\nandroidx/compose/foundation/gestures/AnchoredDraggable_jvmKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1753:1\n31#2,2:1754\n13424#3,3:1756\n13424#3,3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n*L\n1572#1:1754,2\n1588#1:1756,3\n1601#1:1759,3\n*E\n"})
/* loaded from: classes.dex */
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {

    @k
    private final float[] anchors;

    @k
    private final List<T> keys;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableAnchors(@k List<? extends T> list, @k float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        list.size();
        int length = fArr.length;
        this.size = fArr.length;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @l
    public T anchorAt(int i11) {
        return (T) r0.b3(this.keys, i11);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @l
    public T closestAnchor(float f11) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i11 = -1;
        float f12 = Float.POSITIVE_INFINITY;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = i13 + 1;
            float abs = Math.abs(f11 - fArr[i12]);
            if (abs <= f12) {
                i11 = i13;
                f12 = abs;
            }
            i12++;
            i13 = i14;
        }
        return this.keys.get(i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        return g0.g(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasPositionFor(T t11) {
        return this.keys.indexOf(t11) != -1;
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxPosition() {
        Float fl2 = a0.fl(this.anchors);
        if (fl2 != null) {
            return fl2.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        Float Dn = a0.Dn(this.anchors);
        if (Dn != null) {
            return Dn.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int i11) {
        x00.l lVar;
        float[] fArr = this.anchors;
        lVar = AnchoredDraggableKt.GetOrNan;
        return (i11 < 0 || i11 > a0.Le(fArr)) ? ((Number) lVar.invoke(Integer.valueOf(i11))).floatValue() : fArr[i11];
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t11) {
        x00.l lVar;
        int indexOf = this.keys.indexOf(t11);
        float[] fArr = this.anchors;
        lVar = AnchoredDraggableKt.GetOrNan;
        return (indexOf < 0 || indexOf > a0.Le(fArr)) ? ((Number) lVar.invoke(Integer.valueOf(indexOf))).floatValue() : fArr[indexOf];
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(anchorAt(i11));
            sb3.append('=');
            sb3.append(positionAt(i11));
            sb2.append(sb3.toString());
            if (i11 < getSize() - 1) {
                sb2.append(j2.O);
            }
        }
        sb2.append("})");
        String sb4 = sb2.toString();
        g0.o(sb4, "toString(...)");
        return sb4;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @l
    public T closestAnchor(float f11, boolean z11) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i11 = -1;
        int i12 = 0;
        float f12 = Float.POSITIVE_INFINITY;
        int i13 = 0;
        while (i12 < length) {
            float f13 = fArr[i12];
            int i14 = i13 + 1;
            float f14 = z11 ? f13 - f11 : f11 - f13;
            if (f14 < 0.0f) {
                f14 = Float.POSITIVE_INFINITY;
            }
            if (f14 <= f12) {
                i11 = i13;
                f12 = f14;
            }
            i12++;
            i13 = i14;
        }
        return this.keys.get(i11);
    }
}
