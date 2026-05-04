package androidx.compose.material;

import a00.r0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/MapDraggableAnchors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
/* loaded from: classes.dex */
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    @k
    private final Map<T, Float> anchors;

    public MapDraggableAnchors(@k Map<T, Float> map) {
        this.anchors = map;
    }

    @Override // androidx.compose.material.DraggableAnchors
    @l
    public T closestAnchor(float f11) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f11 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float abs2 = Math.abs(f11 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDraggableAnchors) {
            return g0.g(this.anchors, ((MapDraggableAnchors) obj).anchors);
        }
        return false;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public int getSize() {
        return this.anchors.size();
    }

    @Override // androidx.compose.material.DraggableAnchors
    public boolean hasAnchorFor(T t11) {
        return this.anchors.containsKey(t11);
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float maxAnchor() {
        Float W3 = r0.W3(this.anchors.values());
        if (W3 != null) {
            return W3.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float minAnchor() {
        Float o42 = r0.o4(this.anchors.values());
        if (o42 != null) {
            return o42.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.material.DraggableAnchors
    public float positionOf(T t11) {
        Float f11 = this.anchors.get(t11);
        if (f11 != null) {
            return f11.floatValue();
        }
        return Float.NaN;
    }

    @k
    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    @Override // androidx.compose.material.DraggableAnchors
    @l
    public T closestAnchor(float f11, boolean z11) {
        T next;
        Iterator<T> it = this.anchors.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f12 = z11 ? floatValue - f11 : f11 - floatValue;
                if (f12 < 0.0f) {
                    f12 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f13 = z11 ? floatValue2 - f11 : f11 - floatValue2;
                    if (f13 < 0.0f) {
                        f13 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f12, f13) > 0) {
                        next = next2;
                        f12 = f13;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }
}
