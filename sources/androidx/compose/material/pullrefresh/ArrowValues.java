package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.Immutable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class ArrowValues {
    private final float endAngle;
    private final float rotation;
    private final float scale;
    private final float startAngle;

    public ArrowValues(float f11, float f12, float f13, float f14) {
        this.rotation = f11;
        this.startAngle = f12;
        this.endAngle = f13;
        this.scale = f14;
    }

    public final float getEndAngle() {
        return this.endAngle;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getStartAngle() {
        return this.startAngle;
    }
}
