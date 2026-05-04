package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] sOurPercent = new double[91];
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        boolean mLinear;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public Arc(int i11, double d11, double d12, double d13, double d14, double d15, double d16) {
            this.mLinear = false;
            double d17 = d15 - d13;
            double d18 = d16 - d14;
            if (i11 == 1) {
                this.mVertical = true;
            } else if (i11 == 4) {
                this.mVertical = d18 > 0.0d;
            } else if (i11 != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d18 < 0.0d;
            }
            this.mTime1 = d11;
            this.mTime2 = d12;
            this.mOneOverDeltaTime = 1.0d / (d12 - d11);
            if (3 == i11) {
                this.mLinear = true;
            }
            if (!this.mLinear && Math.abs(d17) >= 0.001d && Math.abs(d18) >= 0.001d) {
                this.mLut = new double[101];
                boolean z11 = this.mVertical;
                this.mEllipseA = d17 * (z11 ? -1 : 1);
                this.mEllipseB = d18 * (z11 ? 1 : -1);
                this.mEllipseCenterX = z11 ? d15 : d13;
                this.mEllipseCenterY = z11 ? d14 : d16;
                buildTable(d13, d14, d15, d16);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.mLinear = true;
            this.mX1 = d13;
            this.mX2 = d15;
            this.mY1 = d14;
            this.mY2 = d16;
            double hypot = Math.hypot(d18, d17);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d19 = this.mTime2;
            double d21 = this.mTime1;
            this.mEllipseCenterX = d17 / (d19 - d21);
            this.mEllipseCenterY = d18 / (d19 - d21);
        }

        private void buildTable(double d11, double d12, double d13, double d14) {
            double d15 = d13 - d11;
            double d16 = d12 - d14;
            int i11 = 0;
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            while (true) {
                if (i11 >= sOurPercent.length) {
                    break;
                }
                int i12 = i11;
                double radians = Math.toRadians((i11 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d15;
                double cos = Math.cos(radians) * d16;
                if (i12 > 0) {
                    d17 += Math.hypot(sin - d18, cos - d19);
                    sOurPercent[i12] = d17;
                }
                i11 = i12 + 1;
                d18 = sin;
                d19 = cos;
            }
            this.mArcDistance = d17;
            int i13 = 0;
            while (true) {
                double[] dArr = sOurPercent;
                if (i13 >= dArr.length) {
                    break;
                }
                dArr[i13] = dArr[i13] / d17;
                i13++;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= this.mLut.length) {
                    return;
                }
                double length = i14 / (r1.length - 1);
                int binarySearch = Arrays.binarySearch(sOurPercent, length);
                if (binarySearch >= 0) {
                    this.mLut[i14] = binarySearch / (sOurPercent.length - 1);
                } else if (binarySearch == -1) {
                    this.mLut[i14] = 0.0d;
                } else {
                    int i15 = -binarySearch;
                    int i16 = i15 - 2;
                    double[] dArr2 = sOurPercent;
                    double d21 = dArr2[i16];
                    this.mLut[i14] = (i16 + ((length - d21) / (dArr2[i15 - 1] - d21))) / (dArr2.length - 1);
                }
                i14++;
            }
        }

        public double getDX() {
            double d11 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d11, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d11) * hypot : d11 * hypot;
        }

        public double getDY() {
            double d11 = this.mEllipseA * this.mTmpCosAngle;
            double d12 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d11, d12);
            return this.mVertical ? (-d12) * hypot : d12 * hypot;
        }

        public double getLinearDX(double d11) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d11) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d11) {
            double d12 = (d11 - this.mTime1) * this.mOneOverDeltaTime;
            double d13 = this.mX1;
            return d13 + (d12 * (this.mX2 - d13));
        }

        public double getLinearY(double d11) {
            double d12 = (d11 - this.mTime1) * this.mOneOverDeltaTime;
            double d13 = this.mY1;
            return d13 + (d12 * (this.mY2 - d13));
        }

        public double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        public double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        public double lookup(double d11) {
            if (d11 <= 0.0d) {
                return 0.0d;
            }
            if (d11 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d11 * (dArr.length - 1);
            int i11 = (int) length;
            double d12 = length - i11;
            double d13 = dArr[i11];
            return d13 + (d12 * (dArr[i11 + 1] - d13));
        }

        public void setPoint(double d11) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d11 : d11 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r5 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r24, double[] r25, double[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L5b
            r8 = r24[r4]
            r9 = 3
            if (r8 == 0) goto L38
            if (r8 == r2) goto L36
            r10 = 2
            if (r8 == r10) goto L34
            if (r8 == r9) goto L2f
            r9 = 4
            if (r8 == r9) goto L38
            r9 = 5
            if (r8 == r9) goto L38
            r9 = r6
            goto L38
        L2f:
            if (r5 != r2) goto L36
            goto L34
        L32:
            r9 = r5
            goto L38
        L34:
            r5 = r10
            goto L32
        L36:
            r5 = r2
            goto L32
        L38:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r8 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r26[r4]
            r15 = r14[r3]
            r17 = r14[r2]
            r14 = r26[r6]
            r19 = r14[r3]
            r21 = r14[r2]
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r21
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L16
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d12 = arc.mTime1;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearX(d12) + (this.mArcs[0].getLinearDX(d12) * d13);
                    dArr[1] = this.mArcs[0].getLinearY(d12) + (d13 * this.mArcs[0].getLinearDY(d12));
                    return;
                } else {
                    arc.setPoint(d12);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d13);
                    dArr[1] = this.mArcs[0].getY() + (d13 * this.mArcs[0].getDY());
                    return;
                }
            }
            if (d11 > arcArr[arcArr.length - 1].mTime2) {
                double d14 = arcArr[arcArr.length - 1].mTime2;
                double d15 = d11 - d14;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = arc2.getLinearX(d14) + (this.mArcs[length].getLinearDX(d14) * d15);
                    dArr[1] = this.mArcs[length].getLinearY(d14) + (d15 * this.mArcs[length].getLinearDY(d14));
                    return;
                } else {
                    arc2.setPoint(d11);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d15);
                    dArr[1] = this.mArcs[length].getY() + (d15 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d16 = arcArr2[0].mTime1;
            if (d11 < d16) {
                d11 = d16;
            }
            if (d11 > arcArr2[arcArr2.length - 1].mTime2) {
                d11 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i11 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i11 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i11];
            if (d11 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d11);
                    dArr[1] = this.mArcs[i11].getLinearY(d11);
                    return;
                } else {
                    arc3.setPoint(d11);
                    dArr[0] = this.mArcs[i11].getX();
                    dArr[1] = this.mArcs[i11].getY();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d11, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d12 = arcArr[0].mTime1;
        if (d11 < d12) {
            d11 = d12;
        } else if (d11 > arcArr[arcArr.length - 1].mTime2) {
            d11 = arcArr[arcArr.length - 1].mTime2;
        }
        int i11 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i11 >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i11];
            if (d11 <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d11);
                    dArr[1] = this.mArcs[i11].getLinearDY(d11);
                    return;
                } else {
                    arc.setPoint(d11);
                    dArr[0] = this.mArcs[i11].getDX();
                    dArr[1] = this.mArcs[i11].getDY();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d11, int i11) {
        Arc[] arcArr = this.mArcs;
        int i12 = 0;
        double d12 = arcArr[0].mTime1;
        if (d11 < d12) {
            d11 = d12;
        }
        if (d11 > arcArr[arcArr.length - 1].mTime2) {
            d11 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i12 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i12];
            if (d11 <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i11 == 0) {
                        return arc.getLinearDX(d11);
                    }
                    return arc.getLinearDY(d11);
                }
                arc.setPoint(d11);
                if (i11 == 0) {
                    return this.mArcs[i12].getDX();
                }
                return this.mArcs[i12].getDY();
            }
            i12++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d11, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d12 = arc.mTime1;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (arc.mLinear) {
                    fArr[0] = (float) (arc.getLinearX(d12) + (this.mArcs[0].getLinearDX(d12) * d13));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d12) + (d13 * this.mArcs[0].getLinearDY(d12)));
                    return;
                } else {
                    arc.setPoint(d12);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d13));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d13 * this.mArcs[0].getDY()));
                    return;
                }
            }
            if (d11 > arcArr[arcArr.length - 1].mTime2) {
                double d14 = arcArr[arcArr.length - 1].mTime2;
                double d15 = d11 - d14;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) (arc2.getLinearX(d14) + (this.mArcs[length].getLinearDX(d14) * d15));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d14) + (d15 * this.mArcs[length].getLinearDY(d14)));
                    return;
                } else {
                    arc2.setPoint(d11);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d16 = arcArr2[0].mTime1;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > arcArr2[arcArr2.length - 1].mTime2) {
                d11 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i11 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i11 >= arcArr3.length) {
                return;
            }
            Arc arc3 = arcArr3[i11];
            if (d11 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d11);
                    fArr[1] = (float) this.mArcs[i11].getLinearY(d11);
                    return;
                } else {
                    arc3.setPoint(d11);
                    fArr[0] = (float) this.mArcs[i11].getX();
                    fArr[1] = (float) this.mArcs[i11].getY();
                    return;
                }
            }
            i11++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d11, int i11) {
        double linearY;
        double linearDY;
        double y11;
        double dy2;
        double linearY2;
        double linearDY2;
        int i12 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            Arc arc = arcArr[0];
            double d12 = arc.mTime1;
            if (d11 < d12) {
                double d13 = d11 - d12;
                if (arc.mLinear) {
                    if (i11 == 0) {
                        linearY2 = arc.getLinearX(d12);
                        linearDY2 = this.mArcs[0].getLinearDX(d12);
                    } else {
                        linearY2 = arc.getLinearY(d12);
                        linearDY2 = this.mArcs[0].getLinearDY(d12);
                    }
                    return linearY2 + (d13 * linearDY2);
                }
                arc.setPoint(d12);
                if (i11 == 0) {
                    y11 = this.mArcs[0].getX();
                    dy2 = this.mArcs[0].getDX();
                } else {
                    y11 = this.mArcs[0].getY();
                    dy2 = this.mArcs[0].getDY();
                }
                return y11 + (d13 * dy2);
            }
            if (d11 > arcArr[arcArr.length - 1].mTime2) {
                double d14 = arcArr[arcArr.length - 1].mTime2;
                double d15 = d11 - d14;
                int length = arcArr.length - 1;
                if (i11 == 0) {
                    linearY = arcArr[length].getLinearX(d14);
                    linearDY = this.mArcs[length].getLinearDX(d14);
                } else {
                    linearY = arcArr[length].getLinearY(d14);
                    linearDY = this.mArcs[length].getLinearDY(d14);
                }
                return linearY + (d15 * linearDY);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            double d16 = arcArr2[0].mTime1;
            if (d11 < d16) {
                d11 = d16;
            } else if (d11 > arcArr2[arcArr2.length - 1].mTime2) {
                d11 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i12 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i12];
            if (d11 <= arc2.mTime2) {
                if (arc2.mLinear) {
                    if (i11 == 0) {
                        return arc2.getLinearX(d11);
                    }
                    return arc2.getLinearY(d11);
                }
                arc2.setPoint(d11);
                if (i11 == 0) {
                    return this.mArcs[i12].getX();
                }
                return this.mArcs[i12].getY();
            }
            i12++;
        }
    }
}
