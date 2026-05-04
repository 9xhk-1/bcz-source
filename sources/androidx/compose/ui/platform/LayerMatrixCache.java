package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nLayerMatrixCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerMatrixCache.android.kt\nandroidx/compose/ui/platform/LayerMatrixCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;

    @m80.l
    private Matrix androidMatrixCache;

    @m80.k
    private final x00.p<T, Matrix, g2> getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;

    @m80.k
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.m2739constructorimpl$default(null, 1, null);

    @m80.k
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m2739constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(@m80.k x00.p<? super T, ? super Matrix, g2> pVar) {
        this.getMatrix = pVar;
    }

    @m80.l
    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m4269calculateInverseMatrixbWbORWo(T t11) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m4267invertToJiSxe2E(m4270calculateMatrixGrdbGEg(t11), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    @m80.k
    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m4270calculateMatrixGrdbGEg(T t11) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(t11, matrix);
        AndroidMatrixConversions_androidKt.m2380setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m2764isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T t11, @m80.k MutableRect mutableRect) {
        float[] m4270calculateMatrixGrdbGEg = m4270calculateMatrixGrdbGEg(t11);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m2747mapimpl(m4270calculateMatrixGrdbGEg, mutableRect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m4271mapR5De75A(T t11, long j11) {
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m2745mapMKHz9U(m4270calculateMatrixGrdbGEg(t11), j11) : j11;
    }

    public final void mapInverse(T t11, @m80.k MutableRect mutableRect) {
        float[] m4269calculateInverseMatrixbWbORWo = m4269calculateInverseMatrixbWbORWo(t11);
        if (m4269calculateInverseMatrixbWbORWo == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.m2747mapimpl(m4269calculateInverseMatrixbWbORWo, mutableRect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m4272mapInverseR5De75A(T t11, long j11) {
        float[] m4269calculateInverseMatrixbWbORWo = m4269calculateInverseMatrixbWbORWo(t11);
        return m4269calculateInverseMatrixbWbORWo == null ? Offset.Companion.m2282getInfiniteF1C5BW0() : !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m2745mapMKHz9U(m4269calculateInverseMatrixbWbORWo, j11) : j11;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m2748resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m2748resetimpl(this.inverseMatrixCache);
    }
}
