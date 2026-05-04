package androidx.graphics.path;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ConicConverter {
    private int currentQuadratic;
    private int quadraticCount;

    @k
    private float[] quadraticData = new float[130];

    public static /* synthetic */ void convert$default(ConicConverter conicConverter, float[] fArr, float f11, float f12, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        conicConverter.convert(fArr, f11, f12, i11);
    }

    private final native int internalConicToQuadratics(float[] fArr, int i11, float[] fArr2, float f11, float f12);

    public static /* synthetic */ boolean nextQuadratic$default(ConicConverter conicConverter, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return conicConverter.nextQuadratic(fArr, i11);
    }

    public final void convert(@k float[] points, float f11, float f12, int i11) {
        g0.p(points, "points");
        int internalConicToQuadratics = internalConicToQuadratics(points, i11, this.quadraticData, f11, f12);
        this.quadraticCount = internalConicToQuadratics;
        int i12 = (internalConicToQuadratics * 4) + 2;
        if (i12 > this.quadraticData.length) {
            float[] fArr = new float[i12];
            this.quadraticData = fArr;
            this.quadraticCount = internalConicToQuadratics(points, i11, fArr, f11, f12);
        }
        this.currentQuadratic = 0;
    }

    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    public final int getQuadraticCount() {
        return this.quadraticCount;
    }

    public final boolean nextQuadratic(@k float[] points, int i11) {
        g0.p(points, "points");
        int i12 = this.currentQuadratic;
        if (i12 >= this.quadraticCount) {
            return false;
        }
        int i13 = i12 * 4;
        float[] fArr = this.quadraticData;
        points[i11] = fArr[i13];
        points[i11 + 1] = fArr[i13 + 1];
        points[i11 + 2] = fArr[i13 + 2];
        points[i11 + 3] = fArr[i13 + 3];
        points[i11 + 4] = fArr[i13 + 4];
        points[i11 + 5] = fArr[i13 + 5];
        this.currentQuadratic = i12 + 1;
        return true;
    }

    public final void setCurrentQuadratic(int i11) {
        this.currentQuadratic = i11;
    }
}
