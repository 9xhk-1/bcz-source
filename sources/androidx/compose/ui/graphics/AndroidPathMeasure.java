package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,81:1\n36#2,5:82\n36#2,5:87\n30#3:92\n30#3:96\n53#4,3:93\n53#4,3:97\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n42#1:82,5\n48#1:87,5\n60#1:92\n75#1:96\n60#1:93,3\n75#1:97,3\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPathMeasure implements PathMeasure {

    @m80.k
    private final android.graphics.PathMeasure internalPathMeasure;

    @m80.l
    private float[] positionArray;

    @m80.l
    private float[] tangentArray;

    public AndroidPathMeasure(@m80.k android.graphics.PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getPosition-tuRUvjQ, reason: not valid java name */
    public long mo2407getPositiontuRUvjQ(float f11) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f11, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.positionArray;
        kotlin.jvm.internal.g0.m(fArr);
        float f12 = fArr[0];
        float[] fArr2 = this.positionArray;
        kotlin.jvm.internal.g0.m(fArr2);
        float f13 = fArr2[1];
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f11, float f12, @m80.k Path path, boolean z11) {
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path instanceof AndroidPath) {
            return pathMeasure.getSegment(f11, f12, ((AndroidPath) path).getInternalPath(), z11);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    /* renamed from: getTangent-tuRUvjQ, reason: not valid java name */
    public long mo2408getTangenttuRUvjQ(float f11) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(f11, this.positionArray, this.tangentArray)) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        float[] fArr = this.tangentArray;
        kotlin.jvm.internal.g0.m(fArr);
        float f12 = fArr[0];
        float[] fArr2 = this.tangentArray;
        kotlin.jvm.internal.g0.m(fArr2);
        float f13 = fArr2[1];
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.PathMeasure
    public void setPath(@m80.l Path path, boolean z11) {
        android.graphics.Path path2;
        android.graphics.PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path2 = ((AndroidPath) path).getInternalPath();
        }
        pathMeasure.setPath(path2, z11);
    }
}
