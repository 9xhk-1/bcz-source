package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.collection.FloatFloatPair;
import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1010:1\n154#1:1011\n472#1:1012\n473#1:1023\n472#1:1024\n473#1:1035\n472#1:1036\n473#1:1047\n472#1:1048\n473#1:1059\n472#1:1060\n473#1:1071\n454#1:1072\n454#1:1073\n454#1:1074\n472#1:1075\n473#1:1086\n472#1:1087\n473#1:1098\n472#1:1099\n473#1:1110\n472#1:1121\n473#1:1132\n472#1:1133\n473#1:1144\n472#1:1145\n473#1:1156\n472#1:1157\n473#1:1168\n472#1:1169\n473#1:1180\n472#1:1181\n473#1:1192\n273#1:1193\n273#1:1194\n984#1:1195\n984#1:1196\n998#1:1197\n998#1:1198\n273#1:1199\n472#1:1210\n473#1:1221\n456#1:1222\n456#1:1225\n65#2,10:1013\n65#2,10:1025\n65#2,10:1037\n65#2,10:1049\n65#2,10:1061\n65#2,10:1076\n65#2,10:1088\n65#2,10:1100\n83#2,10:1111\n65#2,10:1122\n65#2,10:1134\n65#2,10:1146\n65#2,10:1158\n65#2,10:1170\n65#2,10:1182\n65#2,10:1200\n65#2,10:1211\n46#2:1223\n56#2:1224\n65#2,10:1226\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n131#1:1011\n131#1:1012\n131#1:1023\n154#1:1024\n154#1:1035\n174#1:1036\n174#1:1047\n177#1:1048\n177#1:1059\n179#1:1060\n179#1:1071\n208#1:1072\n210#1:1073\n212#1:1074\n215#1:1075\n215#1:1086\n220#1:1087\n220#1:1098\n223#1:1099\n223#1:1110\n244#1:1121\n244#1:1132\n247#1:1133\n247#1:1144\n250#1:1145\n250#1:1156\n254#1:1157\n254#1:1168\n257#1:1169\n257#1:1180\n264#1:1181\n264#1:1192\n347#1:1193\n362#1:1194\n381#1:1195\n382#1:1196\n406#1:1197\n407#1:1198\n439#1:1199\n483#1:1210\n483#1:1221\n618#1:1222\n805#1:1225\n131#1:1013,10\n154#1:1025,10\n174#1:1037,10\n177#1:1049,10\n179#1:1061,10\n215#1:1076,10\n220#1:1088,10\n223#1:1100,10\n240#1:1111,10\n244#1:1122,10\n247#1:1134,10\n250#1:1146,10\n254#1:1158,10\n257#1:1170,10\n264#1:1182,10\n472#1:1200,10\n483#1:1211,10\n783#1:1223\n786#1:1224\n845#1:1226,10\n*E\n"})
/* loaded from: classes.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final float clampValidRootInUnitRange(float f11) {
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (Math.abs(f12 - f11) > FloatEpsilon) {
            return Float.NaN;
        }
        return f12;
    }

    public static final boolean closeTo(double d11, double d12) {
        return Math.abs(d11 - d12) < Epsilon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeCubicVerticalBounds(float f11, float f12, float f13, float f14, @m80.k float[] fArr, int i11) {
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        float f17 = (f14 - f13) * 3.0f;
        int findQuadraticRoots = findQuadraticRoots(f15, f16, f17, fArr, i11);
        float f18 = (f16 - f15) * 2.0f;
        int writeValidRootInUnitRange = findQuadraticRoots + writeValidRootInUnitRange((-f18) / (((f17 - f16) * 2.0f) - f18), fArr, i11 + findQuadraticRoots);
        float min = Math.min(f11, f14);
        float max = Math.max(f11, f14);
        for (int i12 = 0; i12 < writeValidRootInUnitRange; i12++) {
            float evaluateCubic = evaluateCubic(f11, f12, f13, f14, fArr[i12]);
            min = Math.min(min, evaluateCubic);
            max = Math.max(max, evaluateCubic);
        }
        return FloatFloatPair.m5constructorimpl(min, max);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f11, float f12, float f13, float f14, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = 0;
        }
        return computeCubicVerticalBounds(f11, f12, f13, f14, fArr, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeHorizontalBounds(@m80.k PathSegment pathSegment, @m80.k float[] fArr, int i11) {
        int findDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i11);
        float min = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float max = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i12 = 0; i12 < findDerivativeRoots; i12++) {
            float evaluateX = evaluateX(pathSegment, fArr[i12]);
            min = Math.min(min, evaluateX);
            max = Math.max(max, evaluateX);
        }
        return FloatFloatPair.m5constructorimpl(min, max);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i11);
    }

    public static final long computeVerticalBounds(@m80.k PathSegment pathSegment, @m80.k float[] fArr, int i11) {
        int findDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i11);
        float min = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float max = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i12 = 0; i12 < findDerivativeRoots; i12++) {
            float evaluateY = evaluateY(pathSegment, fArr[i12]);
            min = Math.min(min, evaluateY);
            max = Math.max(max, evaluateY);
        }
        return FloatFloatPair.m5constructorimpl(min, max);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i11);
    }

    public static final float cubicArea(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return ((((((((f18 - f12) * (f13 + f15)) - ((f17 - f11) * (f14 + f16))) + (f14 * (f11 - f15))) - (f13 * (f12 - f16))) + (f18 * (f15 + (f11 / 3.0f)))) - (f17 * (f16 + (f12 / 3.0f)))) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int findCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i11 = 0;
        if (findCubicExtremaY == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            a00.q.y0(fArr, fArr2, 0, 0, 8);
            return findCubicExtremaY;
        }
        int i12 = 0;
        float f11 = 0.0f;
        while (i11 < findCubicExtremaY) {
            float f12 = (fArr3[i11] - f11) / (1.0f - f11);
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            f11 = f12 > 1.0f ? 1.0f : f12;
            splitCubicAt(fArr, i12, fArr2, i12, f11);
            i12 += 6;
            i11++;
            fArr = fArr2;
        }
        return findCubicExtremaY;
    }

    public static final int cubicWinding(@m80.k float[] fArr, float f11, float f12, @m80.k float[] fArr2, @m80.k float[] fArr3) {
        int cubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int i11 = 0;
        if (cubicToMonotonicCubics >= 0) {
            int i12 = 0;
            while (true) {
                i11 += monotonicCubicWinding(fArr2, i12 * 6, f11, f12);
                if (i12 == cubicToMonotonicCubics) {
                    break;
                }
                i12++;
            }
        }
        return i11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateCubic(float f11, float f12, float f13) {
        return ((((((f11 - f12) + 0.33333334f) * f13) + (f12 - (2.0f * f11))) * f13) + f11) * 3.0f * f13;
    }

    private static final float evaluateLine(float f11, float f12, float f13) {
        return ((f12 - f11) * f13) + f11;
    }

    private static final float evaluateQuadratic(float f11, float f12, float f13, float f14) {
        return (((((f13 - (f12 * 2.0f)) + f11) * f14) + ((f12 - f11) * 2.0f)) * f14) + f11;
    }

    private static final float evaluateX(PathSegment pathSegment, float f11) {
        float[] points = pathSegment.getPoints();
        int i11 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i11 == 1) {
            return points[0];
        }
        if (i11 == 2) {
            return evaluateLine(points[0], points[2], f11);
        }
        if (i11 == 3) {
            return evaluateQuadratic(points[0], points[2], points[4], f11);
        }
        if (i11 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[0], points[2], points[4], points[6], f11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateY(@m80.k PathSegment pathSegment, float f11) {
        float[] points = pathSegment.getPoints();
        int i11 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i11 == 1) {
            return points[1];
        }
        if (i11 == 2) {
            return evaluateLine(points[1], points[3], f11);
        }
        if (i11 == 3) {
            return evaluateQuadratic(points[1], points[3], points[5], f11);
        }
        if (i11 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[1], points[3], points[5], points[7], f11);
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[5];
        return findQuadraticRoots((fArr[7] - f11) + ((f12 - f13) * 3.0f), (((f11 - f12) - f12) - f13) * 2.0f, f12 - f11, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z11, float[] fArr, int i11) {
        int i12 = !z11 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        int i13 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i13 == 3) {
            float f11 = 2;
            float f12 = points[i12 + 2];
            float f13 = (f12 - points[i12]) * f11;
            return writeValidRootInUnitRange((-f13) / ((f11 * (points[i12 + 4] - f12)) - f13), fArr, i11);
        }
        if (i13 != 4) {
            return 0;
        }
        float f14 = points[i12 + 2];
        float f15 = (f14 - points[i12]) * 3.0f;
        float f16 = points[i12 + 4];
        float f17 = (f16 - f14) * 3.0f;
        float f18 = (points[i12 + 6] - f16) * 3.0f;
        int findQuadraticRoots = findQuadraticRoots(f15, f17, f18, fArr, i11);
        float f19 = (f17 - f15) * 2.0f;
        return findQuadraticRoots + writeValidRootInUnitRange((-f19) / (((f18 - f17) * 2.0f) - f19), fArr, i11 + findQuadraticRoots);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstCubicRoot(float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        double d11 = f11;
        double d12 = ((d11 - (f12 * 2.0d)) + f13) * 3.0d;
        double d13 = (f12 - f11) * 3.0d;
        double d14 = (-f11) + ((f12 - f13) * 3.0d) + f14;
        if (Math.abs(d14 - 0.0d) < Epsilon) {
            if (Math.abs(d12 - 0.0d) < Epsilon) {
                if (Math.abs(d13 - 0.0d) < Epsilon) {
                    return Float.NaN;
                }
                float f17 = (float) ((-d11) / d13);
                f15 = f17 >= 0.0f ? f17 : 0.0f;
                f16 = f15 <= 1.0f ? f15 : 1.0f;
                if (Math.abs(f16 - f17) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f16;
            }
            double sqrt = Math.sqrt((d13 * d13) - ((4.0d * d12) * d11));
            double d15 = d12 * 2.0d;
            float f18 = (float) ((sqrt - d13) / d15);
            float f19 = f18 < 0.0f ? 0.0f : f18;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            if (Math.abs(f19 - f18) > FloatEpsilon) {
                f19 = Float.NaN;
            }
            if (!Float.isNaN(f19)) {
                return f19;
            }
            float f21 = (float) (((-d13) - sqrt) / d15);
            f15 = f21 >= 0.0f ? f21 : 0.0f;
            f16 = f15 <= 1.0f ? f15 : 1.0f;
            if (Math.abs(f16 - f21) > FloatEpsilon) {
                return Float.NaN;
            }
            return f16;
        }
        double d16 = d12 / d14;
        double d17 = d13 / d14;
        double d18 = d11 / d14;
        double d19 = ((d17 * 3.0d) - (d16 * d16)) / 9.0d;
        double d21 = (((((2.0d * d16) * d16) * d16) - ((9.0d * d16) * d17)) + (d18 * 27.0d)) / 54.0d;
        double d22 = d19 * d19 * d19;
        double d23 = (d21 * d21) + d22;
        double d24 = d16 / 3.0d;
        if (d23 >= 0.0d) {
            if (d23 != 0.0d) {
                double sqrt2 = Math.sqrt(d23);
                float fastCbrt = (float) ((MathHelpersKt.fastCbrt((float) ((-d21) + sqrt2)) - MathHelpersKt.fastCbrt((float) (d21 + sqrt2))) - d24);
                f15 = fastCbrt >= 0.0f ? fastCbrt : 0.0f;
                f16 = f15 <= 1.0f ? f15 : 1.0f;
                if (Math.abs(f16 - fastCbrt) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f16;
            }
            float f22 = -MathHelpersKt.fastCbrt((float) d21);
            float f23 = (float) d24;
            float f24 = (2.0f * f22) - f23;
            float f25 = f24 < 0.0f ? 0.0f : f24;
            if (f25 > 1.0f) {
                f25 = 1.0f;
            }
            if (Math.abs(f25 - f24) > FloatEpsilon) {
                f25 = Float.NaN;
            }
            if (!Float.isNaN(f25)) {
                return f25;
            }
            float f26 = (-f22) - f23;
            f15 = f26 >= 0.0f ? f26 : 0.0f;
            f16 = f15 <= 1.0f ? f15 : 1.0f;
            if (Math.abs(f16 - f26) > FloatEpsilon) {
                return Float.NaN;
            }
            return f16;
        }
        double sqrt3 = Math.sqrt(-d22);
        double d25 = (-d21) / sqrt3;
        if (d25 < -1.0d) {
            d25 = -1.0d;
        }
        if (d25 > 1.0d) {
            d25 = 1.0d;
        }
        double acos = Math.acos(d25);
        double fastCbrt2 = MathHelpersKt.fastCbrt((float) sqrt3) * 2.0f;
        float cos = (float) ((Math.cos(acos / 3.0d) * fastCbrt2) - d24);
        float f27 = cos < 0.0f ? 0.0f : cos;
        if (f27 > 1.0f) {
            f27 = 1.0f;
        }
        if (Math.abs(f27 - cos) > FloatEpsilon) {
            f27 = Float.NaN;
        }
        if (!Float.isNaN(f27)) {
            return f27;
        }
        float cos2 = (float) ((Math.cos((Tau + acos) / 3.0d) * fastCbrt2) - d24);
        float f28 = cos2 < 0.0f ? 0.0f : cos2;
        if (f28 > 1.0f) {
            f28 = 1.0f;
        }
        if (Math.abs(f28 - cos2) > FloatEpsilon) {
            f28 = Float.NaN;
        }
        if (!Float.isNaN(f28)) {
            return f28;
        }
        float cos3 = (float) ((fastCbrt2 * Math.cos((acos + 12.566370614359172d) / 3.0d)) - d24);
        f15 = cos3 >= 0.0f ? cos3 : 0.0f;
        f16 = f15 <= 1.0f ? f15 : 1.0f;
        if (Math.abs(f16 - cos3) > FloatEpsilon) {
            return Float.NaN;
        }
        return f16;
    }

    private static final float findFirstLineRoot(float f11, float f12) {
        float f13 = (-f11) / (f12 - f11);
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        if (Math.abs(f14 - f13) > FloatEpsilon) {
            return Float.NaN;
        }
        return f14;
    }

    private static final float findFirstQuadraticRoot(float f11, float f12, float f13) {
        float f14;
        float f15;
        double d11 = f11;
        double d12 = f12;
        double d13 = f13;
        double d14 = d12 * 2.0d;
        double d15 = (d11 - d14) + d13;
        if (d15 == 0.0d) {
            if (d12 == d13) {
                return Float.NaN;
            }
            float f16 = (float) ((d14 - d13) / (d14 - (d13 * 2.0d)));
            f14 = f16 >= 0.0f ? f16 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f16) > FloatEpsilon) {
                return Float.NaN;
            }
            return f15;
        }
        double d16 = -Math.sqrt((d12 * d12) - (d13 * d11));
        double d17 = (-d11) + d12;
        float f17 = (float) ((-(d16 + d17)) / d15);
        float f18 = f17 < 0.0f ? 0.0f : f17;
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (Math.abs(f18 - f17) > FloatEpsilon) {
            f18 = Float.NaN;
        }
        if (!Float.isNaN(f18)) {
            return f18;
        }
        float f19 = (float) ((d16 - d17) / d15);
        f14 = f19 >= 0.0f ? f19 : 0.0f;
        f15 = f14 <= 1.0f ? f14 : 1.0f;
        if (Math.abs(f15 - f19) > FloatEpsilon) {
            return Float.NaN;
        }
        return f15;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstRoot(@m80.k PathSegment pathSegment, float f11) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f12 = points[0] - f11;
                float f13 = (-f12) / ((points[2] - f11) - f12);
                float f14 = f13 >= 0.0f ? f13 : 0.0f;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f14;
            case 3:
                return findFirstQuadraticRoot(points[0] - f11, points[2] - f11, points[4] - f11);
            case 4:
                return findFirstCubicRoot(points[0] - f11, points[2] - f11, points[4] - f11, points[6] - f11);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findLineRoot(float f11, float f12, float[] fArr, int i11) {
        return writeValidRootInUnitRange((-f11) / (f12 - f11), fArr, i11);
    }

    public static /* synthetic */ int findLineRoot$default(float f11, float f12, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return writeValidRootInUnitRange((-f11) / (f12 - f11), fArr, i11);
    }

    private static final int findQuadraticRoots(float f11, float f12, float f13, float[] fArr, int i11) {
        double d11 = f11;
        double d12 = f12;
        double d13 = f13;
        double d14 = d12 * 2.0d;
        double d15 = (d11 - d14) + d13;
        if (d15 == 0.0d) {
            if (d12 == d13) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d14 - d13) / (d14 - (d13 * 2.0d))), fArr, i11);
        }
        double d16 = -Math.sqrt((d12 * d12) - (d13 * d11));
        double d17 = (-d11) + d12;
        int writeValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d16 + d17)) / d15), fArr, i11);
        int writeValidRootInUnitRange2 = writeValidRootInUnitRange + writeValidRootInUnitRange((float) ((d16 - d17) / d15), fArr, i11 + writeValidRootInUnitRange);
        if (writeValidRootInUnitRange2 <= 1) {
            return writeValidRootInUnitRange2;
        }
        float f14 = fArr[i11];
        int i12 = i11 + 1;
        float f15 = fArr[i12];
        if (f14 <= f15) {
            return f14 == f15 ? writeValidRootInUnitRange2 - 1 : writeValidRootInUnitRange2;
        }
        fArr[i11] = f15;
        fArr[i12] = f14;
        return writeValidRootInUnitRange2;
    }

    public static /* synthetic */ int findQuadraticRoots$default(float f11, float f12, float f13, float[] fArr, int i11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        return findQuadraticRoots(f11, f12, f13, fArr, i11);
    }

    private static final float getEndX(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        int i11 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        char c11 = 2;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    c11 = 6;
                } else if (i11 != 5) {
                    c11 = 0;
                }
            }
            c11 = 4;
        }
        return points[c11];
    }

    private static final float getEndY(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        int i11 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        char c11 = 3;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    c11 = 7;
                } else if (i11 != 5) {
                    c11 = 0;
                }
            }
            c11 = 5;
        }
        return points[c11];
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f11, float f12, float f13) {
        return !(Math.signum(f11 - f12) + Math.signum(f12 - f13) == 0.0f);
    }

    public static final int lineWinding(@m80.k float[] fArr, float f11, float f12) {
        int i11;
        float f13;
        if (fArr.length < 4) {
            return 0;
        }
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[2];
        float f17 = fArr[3];
        float f18 = f17 - f15;
        if (f15 > f17) {
            i11 = -1;
            f13 = f15;
        } else {
            i11 = 1;
            f13 = f17;
            f17 = f15;
        }
        if (f12 < f17 || f12 >= f13) {
            return 0;
        }
        float f19 = ((f16 - f14) * (f12 - f15)) - (f18 * (f11 - f14));
        if (f19 == 0.0f || ((int) Math.signum(f19)) == i11) {
            return 0;
        }
        return i11;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i11, float f11, float f12) {
        int i12;
        int i13 = i11 + 1;
        float f13 = fArr[i13];
        int i14 = i11 + 7;
        float f14 = fArr[i14];
        if (f13 > f14) {
            i12 = -1;
            f14 = f13;
            f13 = f14;
        } else {
            i12 = 1;
        }
        if (f12 >= f13 && f12 < f14) {
            float f15 = fArr[i11];
            float f16 = fArr[i11 + 2];
            float f17 = fArr[i11 + 4];
            float f18 = fArr[i11 + 6];
            if (f11 < Math.min(f15, Math.min(f16, Math.min(f17, f18)))) {
                return 0;
            }
            if (f11 <= Math.max(f15, Math.max(f16, Math.max(f17, f18)))) {
                float f19 = fArr[i13];
                float f21 = fArr[i11 + 3];
                float f22 = fArr[i11 + 5];
                float f23 = fArr[i14];
                float findFirstCubicRoot = findFirstCubicRoot(f19 - f12, f21 - f12, f22 - f12, f23 - f12);
                if (Float.isNaN(findFirstCubicRoot)) {
                    return 0;
                }
                float evaluateCubic = evaluateCubic(f15, f16, f17, f18, findFirstCubicRoot);
                if ((Math.abs(evaluateCubic - f11) >= FloatEpsilon || (f11 == f18 && f12 == f23)) && evaluateCubic < f11) {
                }
            }
            return i12;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i11, float f11, float f12, float[] fArr2) {
        int i12;
        float f13;
        float f14;
        float f15 = fArr[i11 + 1];
        float f16 = fArr[i11 + 5];
        if (f15 > f16) {
            i12 = -1;
            f14 = f15;
            f13 = f16;
        } else {
            i12 = 1;
            f13 = f15;
            f14 = f16;
        }
        if (f12 >= f13 && f12 < f14) {
            float f17 = fArr[i11 + 3];
            float evaluateQuadratic = findQuadraticRoots$default((f15 - (f17 * 2.0f)) + f16, (f17 - f15) * 2.0f, f15 - f12, fArr2, 0, 16, null) == 0 ? fArr[(1 - i12) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(evaluateQuadratic - f11) >= FloatEpsilon || (f11 == fArr[4] && f12 == f16)) && evaluateQuadratic < f11) {
                return i12;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        if (fArr.length < 6 || fArr2.length < 6) {
            return 0;
        }
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[5];
        if (!isQuadraticMonotonic(f11, f12, f13)) {
            float f14 = f11 - f12;
            float unitDivide = unitDivide(f14, (f14 - f12) + f13);
            if (!Float.isNaN(unitDivide)) {
                splitQuadraticAt(fArr, fArr2, unitDivide);
                return 1;
            }
            if (Math.abs(f14) >= Math.abs(f12 - f13)) {
                f11 = f13;
            }
            f12 = f11;
        }
        a00.q.y0(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f12;
        return 0;
    }

    public static final int quadraticWinding(@m80.k float[] fArr, float f11, float f12, @m80.k float[] fArr2, @m80.k float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f11, f12, fArr3);
        }
        int quadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int monotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f11, f12, fArr3);
        return quadraticToMonotonicQuadratics > 0 ? monotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f11, f12, fArr3) : monotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i11, float[] fArr2, int i12, float f11) {
        if (fArr.length >= i11 + 8 && fArr2.length >= i12 + 14) {
            if (f11 >= 1.0f) {
                a00.q.y0(fArr, fArr2, i12, i11, 8);
                float f12 = fArr[i11 + 6];
                float f13 = fArr[i11 + 7];
                fArr2[i12 + 8] = f12;
                fArr2[i12 + 9] = f13;
                fArr2[i12 + 10] = f12;
                fArr2[i12 + 11] = f13;
                fArr2[i12 + 12] = f12;
                fArr2[i12 + 13] = f13;
                return;
            }
            float f14 = fArr[i11];
            float f15 = fArr[i11 + 1];
            fArr2[i12] = f14;
            fArr2[i12 + 1] = f15;
            float f16 = fArr[i11 + 2];
            float f17 = fArr[i11 + 3];
            float lerp = MathHelpersKt.lerp(f14, f16, f11);
            float lerp2 = MathHelpersKt.lerp(f15, f17, f11);
            fArr2[i12 + 2] = lerp;
            fArr2[i12 + 3] = lerp2;
            float f18 = fArr[i11 + 4];
            float f19 = fArr[i11 + 5];
            float lerp3 = MathHelpersKt.lerp(f16, f18, f11);
            float lerp4 = MathHelpersKt.lerp(f17, f19, f11);
            float lerp5 = MathHelpersKt.lerp(lerp, lerp3, f11);
            float lerp6 = MathHelpersKt.lerp(lerp2, lerp4, f11);
            fArr2[i12 + 4] = lerp5;
            fArr2[i12 + 5] = lerp6;
            float f21 = fArr[i11 + 6];
            float f22 = fArr[i11 + 7];
            float lerp7 = MathHelpersKt.lerp(f18, f21, f11);
            float lerp8 = MathHelpersKt.lerp(f19, f22, f11);
            float lerp9 = MathHelpersKt.lerp(lerp3, lerp7, f11);
            float lerp10 = MathHelpersKt.lerp(lerp4, lerp8, f11);
            float lerp11 = MathHelpersKt.lerp(lerp5, lerp9, f11);
            float lerp12 = MathHelpersKt.lerp(lerp6, lerp10, f11);
            fArr2[i12 + 6] = lerp11;
            fArr2[i12 + 7] = lerp12;
            fArr2[i12 + 8] = lerp9;
            fArr2[i12 + 9] = lerp10;
            fArr2[i12 + 10] = lerp7;
            fArr2[i12 + 11] = lerp8;
            fArr2[i12 + 12] = f21;
            fArr2[i12 + 13] = f22;
        }
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f11) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            float lerp = MathHelpersKt.lerp(f12, f14, f11);
            float lerp2 = MathHelpersKt.lerp(f13, f15, f11);
            fArr2[0] = f12;
            fArr2[1] = f13;
            fArr2[2] = lerp;
            fArr2[3] = lerp2;
            float lerp3 = MathHelpersKt.lerp(f14, f16, f11);
            float lerp4 = MathHelpersKt.lerp(f15, f17, f11);
            float lerp5 = MathHelpersKt.lerp(lerp, lerp3, f11);
            float lerp6 = MathHelpersKt.lerp(lerp2, lerp4, f11);
            fArr2[4] = lerp5;
            fArr2[5] = lerp6;
            fArr2[6] = lerp3;
            fArr2[7] = lerp4;
            fArr2[8] = f16;
            fArr2[9] = f17;
        }
    }

    private static final float unitDivide(float f11, float f12) {
        if (f11 < 0.0f) {
            f11 = -f11;
            f12 = -f12;
        }
        if (f12 == 0.0f || f11 == 0.0f || f11 >= f12) {
            return Float.NaN;
        }
        float f13 = f11 / f12;
        if (f13 == 0.0f) {
            return Float.NaN;
        }
        return f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f11, float[] fArr, int i11) {
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        if (f12 > 1.0f) {
            f12 = 1.0f;
        }
        if (Math.abs(f12 - f11) > FloatEpsilon) {
            f12 = Float.NaN;
        }
        fArr[i11] = f12;
        return !Float.isNaN(f12) ? 1 : 0;
    }

    public static final boolean closeTo(float f11, float f12) {
        return Math.abs(f11 - f12) < FloatEpsilon;
    }

    private static final float evaluateCubic(float f11, float f12, float f13, float f14, float f15) {
        float f16 = (f14 + ((f12 - f13) * 3.0f)) - f11;
        return (((((f16 * f15) + (((f13 - (2.0f * f12)) + f11) * 3.0f)) * f15) + ((f12 - f11) * 3.0f)) * f15) + f11;
    }
}
