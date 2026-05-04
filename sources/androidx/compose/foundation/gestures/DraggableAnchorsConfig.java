package androidx.compose.foundation.gestures;

import a00.q;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;

    @k
    private final List<T> keys = new ArrayList();

    @k
    private float[] positions;

    public DraggableAnchorsConfig() {
        float[] fArr = new float[5];
        for (int i11 = 0; i11 < 5; i11++) {
            fArr[i11] = Float.NaN;
        }
        this.positions = fArr;
    }

    private final void expandPositions() {
        float[] copyOf = Arrays.copyOf(this.positions, this.keys.size() + 2);
        g0.o(copyOf, "copyOf(...)");
        this.positions = copyOf;
    }

    public final void at(T t11, float f11) {
        this.keys.add(t11);
        if (this.positions.length < this.keys.size()) {
            expandPositions();
        }
        this.positions[this.keys.size() - 1] = f11;
    }

    @k
    public final List<T> buildKeys$foundation_release() {
        return this.keys;
    }

    @k
    public final float[] buildPositions$foundation_release() {
        return q.i1(this.positions, 0, this.keys.size());
    }

    @k
    public final List<T> getKeys$foundation_release() {
        return this.keys;
    }

    @k
    public final float[] getPositions$foundation_release() {
        return this.positions;
    }

    public final void setPositions$foundation_release(@k float[] fArr) {
        this.positions = fArr;
    }
}
