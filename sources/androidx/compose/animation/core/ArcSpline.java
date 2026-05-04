package androidx.compose.animation.core;

import a00.q;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n+ 2 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,393:1\n222#2:394\n225#2:395\n273#2:396\n277#2:397\n273#2:398\n277#2:399\n222#2:410\n225#2:411\n65#3,10:400\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline\n*L\n115#1:394\n116#1:395\n119#1:396\n120#1:397\n145#1:398\n146#1:399\n174#1:410\n175#1:411\n162#1:400,10\n*E\n"})
/* loaded from: classes.dex */
public final class ArcSpline {
    public static final int $stable = 8;

    @k
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nArcSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n+ 2 ArcSpline.jvm.kt\nandroidx/compose/animation/core/ArcSpline_jvmKt\n*L\n1#1,393:1\n268#1,2:394\n21#2:396\n26#2:397\n*S KotlinDebug\n*F\n+ 1 ArcSpline.kt\nandroidx/compose/animation/core/ArcSpline$Arc\n*L\n262#1:394,2\n334#1:396\n353#1:397\n*E\n"})
    public static final class Arc {
        public static final int $stable = 8;
        private float arcDistance;
        private final float arcVelocity;

        @w00.g
        public final float ellipseA;

        @w00.g
        public final float ellipseB;

        @w00.g
        public final float ellipseCenterX;

        @w00.g
        public final float ellipseCenterY;

        @w00.g
        public final boolean isLinear;

        @k
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;

        /* renamed from: x1, reason: collision with root package name */
        private final float f4089x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f4090x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f4091y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f4092y2;

        public Arc(int i11, float f11, float f12, float f13, float f14, float f15, float f16) {
            this.time1 = f11;
            this.time2 = f12;
            this.f4089x1 = f13;
            this.f4091y1 = f14;
            this.f4090x2 = f15;
            this.f4092y2 = f16;
            float f17 = f15 - f13;
            float f18 = f16 - f14;
            boolean z11 = true;
            boolean z12 = i11 == 1 || (i11 == 4 ? f18 > 0.0f : !(i11 != 5 || f18 >= 0.0f));
            float f19 = z12 ? -1.0f : 1.0f;
            this.vertical = f19;
            float f21 = 1 / (f12 - f11);
            this.oneOverDeltaTime = f21;
            this.lut = new float[101];
            boolean z13 = i11 == 3;
            if (z13 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
                float hypot = (float) Math.hypot(f18, f17);
                this.arcDistance = hypot;
                this.arcVelocity = hypot * f21;
                this.ellipseCenterX = f17 * f21;
                this.ellipseCenterY = f18 * f21;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.ellipseA = f17 * f19;
                this.ellipseB = f18 * (-f19);
                this.ellipseCenterX = z12 ? f15 : f13;
                this.ellipseCenterY = z12 ? f14 : f16;
                buildTable$animation_core_release(f13, f14, f15, f16);
                this.arcVelocity = this.arcDistance * f21;
                z11 = z13;
            }
            this.isLinear = z11;
        }

        private final float calcAngle(float f11) {
            return lookup((this.vertical == -1.0f ? this.time2 - f11 : f11 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
        }

        private final float lookup(float f11) {
            if (f11 <= 0.0f) {
                return 0.0f;
            }
            if (f11 >= 1.0f) {
                return 1.0f;
            }
            float f12 = f11 * 100;
            int i11 = (int) f12;
            float f13 = f12 - i11;
            float[] fArr = this.lut;
            float f14 = fArr[i11];
            return f14 + (f13 * (fArr[i11 + 1] - f14));
        }

        public final void buildTable$animation_core_release(float f11, float f12, float f13, float f14) {
            float[] fArr;
            float f15;
            float f16;
            float f17;
            float f18 = f13 - f11;
            float f19 = f12 - f14;
            fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            float f21 = length;
            float[] fArr2 = this.lut;
            if (1 <= length) {
                float f22 = f19;
                int i11 = 1;
                f17 = 0.0f;
                float f23 = 0.0f;
                while (true) {
                    f16 = 0.0f;
                    double radians = (float) Math.toRadians((i11 * 90.0d) / length);
                    float sin = ((float) Math.sin(radians)) * f18;
                    float cos = ((float) Math.cos(radians)) * f19;
                    f15 = f21;
                    f17 += (float) Math.hypot(sin - f23, cos - f22);
                    fArr[i11] = f17;
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    f22 = cos;
                    f21 = f15;
                    f23 = sin;
                }
            } else {
                f15 = f21;
                f16 = 0.0f;
                f17 = 0.0f;
            }
            this.arcDistance = f17;
            if (1 <= length) {
                int i12 = 1;
                while (true) {
                    fArr[i12] = fArr[i12] / f17;
                    if (i12 == length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            int length2 = fArr2.length;
            for (int i13 = 0; i13 < length2; i13++) {
                float f24 = i13 / 100.0f;
                int I = q.I(fArr, f24, 0, 0, 6, null);
                if (I >= 0) {
                    fArr2[i13] = I / f15;
                } else if (I == -1) {
                    fArr2[i13] = f16;
                } else {
                    int i14 = -I;
                    int i15 = i14 - 2;
                    float f25 = i15;
                    float f26 = fArr[i15];
                    fArr2[i13] = (f25 + ((f24 - f26) / (fArr[i14 - 1] - f26))) / f15;
                }
            }
        }

        public final float calcDX() {
            float f11 = this.ellipseA * this.tmpCosAngle;
            return f11 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f11, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float calcDY() {
            float f11 = this.ellipseA * this.tmpCosAngle;
            float f12 = (-this.ellipseB) * this.tmpSinAngle;
            return f12 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f11, f12)));
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        public final float getLinearDX$animation_core_release() {
            return this.ellipseCenterX;
        }

        public final float getLinearDY$animation_core_release() {
            return this.ellipseCenterY;
        }

        public final float getLinearX(float f11) {
            float f12 = (f11 - this.time1) * this.oneOverDeltaTime;
            float f13 = this.f4089x1;
            return f13 + (f12 * (this.f4090x2 - f13));
        }

        public final float getLinearY(float f11) {
            float f12 = (f11 - this.time1) * this.oneOverDeltaTime;
            float f13 = this.f4091y1;
            return f13 + (f12 * (this.f4092y2 - f13));
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final void setPoint(float f11) {
            double lookup = lookup((this.vertical == -1.0f ? this.time2 - f11 : f11 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(lookup);
            this.tmpCosAngle = (float) Math.cos(lookup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r7 == r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:1: B:14:0x0045->B:15:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcSpline(@m80.k int[] r22, @m80.k float[] r23, @m80.k float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r0.<init>()
            r2 = 1
            r0.isExtrapolate = r2
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.compose.animation.core.ArcSpline$Arc[][] r4 = new androidx.compose.animation.core.ArcSpline.Arc[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L69
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L28
            if (r9 == r2) goto L31
            if (r9 == r11) goto L2f
            if (r9 == r10) goto L2a
            r10 = 4
            if (r9 == r10) goto L28
            r10 = 5
            if (r9 == r10) goto L28
            r13 = r8
            goto L33
        L28:
            r13 = r10
            goto L33
        L2a:
            if (r7 != r2) goto L31
            goto L2f
        L2d:
            r13 = r7
            goto L33
        L2f:
            r7 = r11
            goto L2d
        L31:
            r7 = r2
            goto L2d
        L33:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r2 = r8.length
            int r2 = r2 % r11
            int r2 = r2 + r12
            androidx.compose.animation.core.ArcSpline$Arc[] r11 = new androidx.compose.animation.core.ArcSpline.Arc[r2]
            r12 = r5
        L45:
            if (r12 >= r2) goto L63
            int r16 = r12 * 2
            r17 = r12
            androidx.compose.animation.core.ArcSpline$Arc r12 = new androidx.compose.animation.core.ArcSpline$Arc
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L45
        L63:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r2 = 1
            goto L12
        L69:
            r0.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }

    public final void getPos(float f11, @k float[] fArr) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i11 = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        int length2 = fArr.length;
        if (!this.isExtrapolate) {
            f11 = Math.min(Math.max(f11, time1), time2);
        } else if (f11 < time1 || f11 > time2) {
            if (f11 > time2) {
                time1 = time2;
            } else {
                length = 0;
            }
            float f12 = f11 - time1;
            int i12 = 0;
            while (i11 < length2 - 1) {
                Arc arc = arcArr[length][i12];
                if (arc.isLinear) {
                    fArr[i11] = arc.getLinearX(time1) + (arc.ellipseCenterX * f12);
                    fArr[i11 + 1] = arc.getLinearY(time1) + (arc.ellipseCenterY * f12);
                } else {
                    arc.setPoint(time1);
                    fArr[i11] = arc.ellipseCenterX + (arc.ellipseA * arc.tmpSinAngle) + (arc.calcDX() * f12);
                    fArr[i11 + 1] = arc.ellipseCenterY + (arc.ellipseB * arc.tmpCosAngle) + (arc.calcDY() * f12);
                }
                i11 += 2;
                i12++;
            }
            return;
        }
        boolean z11 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < length2 - 1) {
                Arc arc2 = arcArr2[i14];
                if (f11 <= arc2.getTime2()) {
                    if (arc2.isLinear) {
                        fArr[i13] = arc2.getLinearX(f11);
                        fArr[i13 + 1] = arc2.getLinearY(f11);
                    } else {
                        arc2.setPoint(f11);
                        fArr[i13] = arc2.ellipseCenterX + (arc2.ellipseA * arc2.tmpSinAngle);
                        fArr[i13 + 1] = arc2.ellipseCenterY + (arc2.ellipseB * arc2.tmpCosAngle);
                    }
                    z11 = true;
                }
                i13 += 2;
                i14++;
            }
            if (z11) {
                return;
            }
        }
    }

    public final void getSlope(float f11, @k float[] fArr) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (f11 < time1) {
            f11 = time1;
        }
        if (f11 <= time2) {
            time2 = f11;
        }
        int length = fArr.length;
        boolean z11 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < length - 1) {
                Arc arc = arcArr2[i12];
                if (time2 <= arc.getTime2()) {
                    if (arc.isLinear) {
                        fArr[i11] = arc.ellipseCenterX;
                        fArr[i11 + 1] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        fArr[i11] = arc.calcDX();
                        fArr[i11 + 1] = arc.calcDY();
                    }
                    z11 = true;
                }
                i11 += 2;
                i12++;
            }
            if (z11) {
                return;
            }
        }
    }
}
