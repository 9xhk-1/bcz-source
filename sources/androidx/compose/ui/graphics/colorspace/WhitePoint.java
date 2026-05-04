package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class WhitePoint {

    /* renamed from: x, reason: collision with root package name */
    private final float f4152x;

    /* renamed from: y, reason: collision with root package name */
    private final float f4153y;

    public WhitePoint(float f11, float f12) {
        this.f4152x = f11;
        this.f4153y = f12;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = whitePoint.f4152x;
        }
        if ((i11 & 2) != 0) {
            f12 = whitePoint.f4153y;
        }
        return whitePoint.copy(f11, f12);
    }

    public final float component1() {
        return this.f4152x;
    }

    public final float component2() {
        return this.f4153y;
    }

    @m80.k
    public final WhitePoint copy(float f11, float f12) {
        return new WhitePoint(f11, f12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f4152x, whitePoint.f4152x) == 0 && Float.compare(this.f4153y, whitePoint.f4153y) == 0;
    }

    public final float getX() {
        return this.f4152x;
    }

    public final float getY() {
        return this.f4153y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f4152x) * 31) + Float.hashCode(this.f4153y);
    }

    @m80.k
    public String toString() {
        return "WhitePoint(x=" + this.f4152x + ", y=" + this.f4153y + ')';
    }

    @Size(3)
    @m80.k
    public final float[] toXyz$ui_graphics_release() {
        float f11 = this.f4152x;
        float f12 = this.f4153y;
        return new float[]{f11 / f12, 1.0f, ((1.0f - f11) - f12) / f12};
    }

    public WhitePoint(float f11, float f12, float f13) {
        this(f11, f12, f13, f11 + f12 + f13);
    }

    private WhitePoint(float f11, float f12, float f13, float f14) {
        this(f11 / f14, f12 / f14);
    }
}
