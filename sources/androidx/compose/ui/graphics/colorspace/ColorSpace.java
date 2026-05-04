package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,717:1\n53#2,3:718\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n246#1:718,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class ColorSpace {

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;

    /* renamed from: id, reason: collision with root package name */
    private final int f4145id;
    private final long model;

    @m80.k
    private final String name;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ColorSpace(String str, long j11, int i11, kotlin.jvm.internal.v vVar) {
        this(str, j11, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f4145id == colorSpace.f4145id && g0.g(this.name, colorSpace.name)) {
            return ColorModel.m2916equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @Size(min = 3)
    @m80.k
    public final float[] fromXyz(float f11, float f12, float f13) {
        float[] fArr = new float[ColorModel.m2917getComponentCountimpl(this.model)];
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[2] = f13;
        return fromXyz(fArr);
    }

    @Size(min = 3)
    @m80.k
    public abstract float[] fromXyz(@Size(min = 3) @m80.k float[] fArr);

    @IntRange(from = 1, to = 4)
    public final int getComponentCount() {
        return ColorModel.m2917getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics_release() {
        return this.f4145id;
    }

    public abstract float getMaxValue(@IntRange(from = 0, to = 3) int i11);

    public abstract float getMinValue(@IntRange(from = 0, to = 3) int i11);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m2925getModelxdoWZVw() {
        return this.model;
    }

    @m80.k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m2918hashCodeimpl(this.model)) * 31) + this.f4145id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    @m80.k
    public String toString() {
        return this.name + " (id=" + this.f4145id + ", model=" + ((Object) ColorModel.m2919toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float f11, float f12, float f13) {
        float[] xyz = toXyz(f11, f12, f13);
        float f14 = xyz[0];
        float f15 = xyz[1];
        return (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
    }

    @Size(3)
    @m80.k
    public final float[] toXyz(float f11, float f12, float f13) {
        return toXyz(new float[]{f11, f12, f13});
    }

    @Size(min = 3)
    @m80.k
    public abstract float[] toXyz(@Size(min = 3) @m80.k float[] fArr);

    public float toZ$ui_graphics_release(float f11, float f12, float f13) {
        return toXyz(f11, f12, f13)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo2926xyzaToColorJlNiLsg$ui_graphics_release(float f11, float f12, float f13, float f14, @m80.k ColorSpace colorSpace) {
        float[] fromXyz = fromXyz(f11, f12, f13);
        return ColorKt.Color(fromXyz[0], fromXyz[1], fromXyz[2], f14, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j11, kotlin.jvm.internal.v vVar) {
        this(str, j11);
    }

    private ColorSpace(String str, long j11, int i11) {
        this.name = str;
        this.model = j11;
        this.f4145id = i11;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i11 < -1 || i11 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j11) {
        this(str, j11, -1, null);
    }
}
