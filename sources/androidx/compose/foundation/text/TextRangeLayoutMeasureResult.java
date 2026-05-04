package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;

    @k
    private final x00.a<IntOffset> place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i11, int i12, @k x00.a<IntOffset> aVar) {
        this.width = i11;
        this.height = i12;
        this.place = aVar;
    }

    public final int getHeight() {
        return this.height;
    }

    @k
    public final x00.a<IntOffset> getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
