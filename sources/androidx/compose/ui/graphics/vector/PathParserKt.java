package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n545#1:553\n34#2,6:547\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:553\n207#1:547,6\n*E\n"})
/* loaded from: classes.dex */
public final class PathParserKt {

    @k
    private static final float[] EmptyArray = new float[0];

    private static final void arcToBezier(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        double d21 = 4;
        int ceil = (int) Math.ceil(Math.abs((d19 * d21) / 3.141592653589793d));
        double cos = Math.cos(d17);
        double sin = Math.sin(d17);
        double cos2 = Math.cos(d18);
        double sin2 = Math.sin(d18);
        double d22 = -d13;
        double d23 = d22 * cos;
        double d24 = d14 * sin;
        double d25 = (d23 * sin2) - (d24 * cos2);
        double d26 = d22 * sin;
        double d27 = d14 * cos;
        double d28 = (sin2 * d26) + (cos2 * d27);
        double d29 = d19 / ceil;
        double d31 = d28;
        double d32 = d25;
        int i11 = 0;
        double d33 = d15;
        double d34 = d16;
        double d35 = d18;
        while (i11 < ceil) {
            double d36 = d35 + d29;
            double sin3 = Math.sin(d36);
            double cos3 = Math.cos(d36);
            int i12 = i11;
            double d37 = (d11 + ((d13 * cos) * cos3)) - (d24 * sin3);
            double d38 = d21;
            double d39 = d12 + (d13 * sin * cos3) + (d27 * sin3);
            double d41 = (d23 * sin3) - (d24 * cos3);
            double d42 = (sin3 * d26) + (cos3 * d27);
            double d43 = d36 - d35;
            int i13 = ceil;
            double tan = Math.tan(d43 / 2);
            double sin4 = (Math.sin(d43) * (Math.sqrt(d38 + ((3.0d * tan) * tan)) - 1)) / 3;
            path.cubicTo((float) (d33 + (d32 * sin4)), (float) (d34 + (d31 * sin4)), (float) (d37 - (sin4 * d41)), (float) (d39 - (sin4 * d42)), (float) d37, (float) d39);
            sin = sin;
            d29 = d29;
            d33 = d37;
            d34 = d39;
            i11 = i12 + 1;
            d35 = d36;
            d31 = d42;
            ceil = i13;
            d32 = d41;
            cos = cos;
            d21 = d38;
        }
    }

    private static final void drawArc(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z11, boolean z12) {
        double d18;
        double d19;
        double d21 = (d17 / 180) * 3.141592653589793d;
        double cos = Math.cos(d21);
        double sin = Math.sin(d21);
        double d22 = ((d11 * cos) + (d12 * sin)) / d15;
        double d23 = (((-d11) * sin) + (d12 * cos)) / d16;
        double d24 = ((d13 * cos) + (d14 * sin)) / d15;
        double d25 = (((-d13) * sin) + (d14 * cos)) / d16;
        double d26 = d22 - d24;
        double d27 = d23 - d25;
        double d28 = 2;
        double d29 = (d22 + d24) / d28;
        double d31 = (d23 + d25) / d28;
        double d32 = (d26 * d26) + (d27 * d27);
        if (d32 == 0.0d) {
            return;
        }
        double d33 = (1.0d / d32) - 0.25d;
        if (d33 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d32) / 1.99999d);
            drawArc(path, d11, d12, d13, d14, d15 * sqrt, d16 * sqrt, d17, z11, z12);
            return;
        }
        double sqrt2 = Math.sqrt(d33);
        double d34 = d26 * sqrt2;
        double d35 = sqrt2 * d27;
        if (z11 == z12) {
            d18 = d29 - d35;
            d19 = d31 + d34;
        } else {
            d18 = d29 + d35;
            d19 = d31 - d34;
        }
        double atan2 = Math.atan2(d23 - d19, d22 - d18);
        double atan22 = Math.atan2(d25 - d19, d24 - d18) - atan2;
        if (z12 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d36 = d18 * d15;
        double d37 = d19 * d16;
        arcToBezier(path, (d36 * cos) - (d37 * sin), (d36 * sin) + (d37 * cos), d15, d16, d11, d12, d21, atan2, atan22);
    }

    @k
    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    @k
    public static final Path toPath(@k List<? extends PathNode> list, @k Path path) {
        int i11;
        float f11;
        int i12;
        PathNode pathNode;
        float f12;
        float f13;
        float f14;
        float x22;
        float y22;
        float dy2;
        float f15;
        float f16;
        float dx1;
        float dy1;
        float dy22;
        List<? extends PathNode> list2 = list;
        Path path2 = path;
        int mo2400getFillTypeRgk1Os = path2.mo2400getFillTypeRgk1Os();
        path2.rewind();
        path2.mo2402setFillTypeoQ8Xj4U(mo2400getFillTypeRgk1Os);
        PathNode pathNode2 = list2.isEmpty() ? PathNode.Close.INSTANCE : list2.get(0);
        int size = list2.size();
        float f17 = 0.0f;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        while (i13 < size) {
            PathNode pathNode3 = list2.get(i13);
            if (pathNode3 instanceof PathNode.Close) {
                path2.close();
                i11 = size;
                f11 = f17;
                i12 = i13;
                pathNode = pathNode3;
                f18 = f23;
                f21 = f18;
                f19 = f24;
            } else {
                if (pathNode3 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode3;
                    f21 += relativeMoveTo.getDx();
                    f22 += relativeMoveTo.getDy();
                    path2.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    i11 = size;
                    f11 = f17;
                    i12 = i13;
                    f23 = f21;
                    f24 = f22;
                } else {
                    if (pathNode3 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode3;
                        float x11 = moveTo.getX();
                        float y11 = moveTo.getY();
                        path2.moveTo(moveTo.getX(), moveTo.getY());
                        f21 = x11;
                        f23 = f21;
                        f22 = y11;
                        f24 = f22;
                    } else {
                        if (pathNode3 instanceof PathNode.RelativeLineTo) {
                            PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode3;
                            path2.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                            f21 += relativeLineTo.getDx();
                            dy2 = relativeLineTo.getDy();
                        } else {
                            if (pathNode3 instanceof PathNode.LineTo) {
                                PathNode.LineTo lineTo = (PathNode.LineTo) pathNode3;
                                path2.lineTo(lineTo.getX(), lineTo.getY());
                                x22 = lineTo.getX();
                                y22 = lineTo.getY();
                            } else if (pathNode3 instanceof PathNode.RelativeHorizontalTo) {
                                PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode3;
                                path2.relativeLineTo(relativeHorizontalTo.getDx(), f17);
                                f21 += relativeHorizontalTo.getDx();
                            } else if (pathNode3 instanceof PathNode.HorizontalTo) {
                                PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode3;
                                path2.lineTo(horizontalTo.getX(), f22);
                                f21 = horizontalTo.getX();
                            } else if (pathNode3 instanceof PathNode.RelativeVerticalTo) {
                                PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode3;
                                path2.relativeLineTo(f17, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (pathNode3 instanceof PathNode.VerticalTo) {
                                PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode3;
                                path2.lineTo(f21, verticalTo.getY());
                                f22 = verticalTo.getY();
                            } else {
                                if (pathNode3 instanceof PathNode.RelativeCurveTo) {
                                    PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode3;
                                    path2.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    dx1 = relativeCurveTo.getDx2() + f21;
                                    dy1 = relativeCurveTo.getDy2() + f22;
                                    f21 += relativeCurveTo.getDx3();
                                    dy22 = relativeCurveTo.getDy3();
                                } else {
                                    if (pathNode3 instanceof PathNode.CurveTo) {
                                        PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode3;
                                        path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        float x23 = curveTo.getX2();
                                        float y23 = curveTo.getY2();
                                        float x32 = curveTo.getX3();
                                        float y32 = curveTo.getY3();
                                        f21 = x32;
                                        f22 = y32;
                                        i11 = size;
                                        f11 = f17;
                                        i12 = i13;
                                        pathNode = pathNode3;
                                        f18 = x23;
                                        f19 = y23;
                                    } else if (pathNode3 instanceof PathNode.RelativeReflectiveCurveTo) {
                                        if (pathNode2.isCurve()) {
                                            float f25 = f21 - f18;
                                            f16 = f22 - f19;
                                            f15 = f25;
                                        } else {
                                            f15 = f17;
                                            f16 = f15;
                                        }
                                        PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode3;
                                        path.relativeCubicTo(f15, f16, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        dx1 = relativeReflectiveCurveTo.getDx1() + f21;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + f22;
                                        f21 += relativeReflectiveCurveTo.getDx2();
                                        dy22 = relativeReflectiveCurveTo.getDy2();
                                    } else {
                                        if (pathNode3 instanceof PathNode.ReflectiveCurveTo) {
                                            if (pathNode2.isCurve()) {
                                                float f26 = 2;
                                                f21 = (f21 * f26) - f18;
                                                f22 = (f26 * f22) - f19;
                                            }
                                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode3;
                                            path.cubicTo(f21, f22, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                            f14 = reflectiveCurveTo.getX1();
                                            float y12 = reflectiveCurveTo.getY1();
                                            float x24 = reflectiveCurveTo.getX2();
                                            float y24 = reflectiveCurveTo.getY2();
                                            f21 = x24;
                                            f22 = y24;
                                            i11 = size;
                                            f11 = f17;
                                            i12 = i13;
                                            pathNode = pathNode3;
                                            f19 = y12;
                                        } else if (pathNode3 instanceof PathNode.RelativeQuadTo) {
                                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode3;
                                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                            f18 = relativeQuadTo.getDx1() + f21;
                                            f19 = relativeQuadTo.getDy1() + f22;
                                            f21 += relativeQuadTo.getDx2();
                                            dy2 = relativeQuadTo.getDy2();
                                        } else if (pathNode3 instanceof PathNode.QuadTo) {
                                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode3;
                                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                            f18 = quadTo.getX1();
                                            f19 = quadTo.getY1();
                                            x22 = quadTo.getX2();
                                            y22 = quadTo.getY2();
                                        } else if (pathNode3 instanceof PathNode.RelativeReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                f12 = f21 - f18;
                                                f13 = f22 - f19;
                                            } else {
                                                f12 = f17;
                                                f13 = f12;
                                            }
                                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode3;
                                            path.relativeQuadraticTo(f12, f13, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                            f14 = f12 + f21;
                                            float f27 = f13 + f22;
                                            f21 += relativeReflectiveQuadTo.getDx();
                                            f22 += relativeReflectiveQuadTo.getDy();
                                            f19 = f27;
                                            i11 = size;
                                            f11 = f17;
                                            i12 = i13;
                                            pathNode = pathNode3;
                                        } else if (pathNode3 instanceof PathNode.ReflectiveQuadTo) {
                                            if (pathNode2.isQuad()) {
                                                float f28 = 2;
                                                f21 = (f21 * f28) - f18;
                                                f22 = (f28 * f22) - f19;
                                            }
                                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode3;
                                            path.quadraticTo(f21, f22, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                            float f29 = f21;
                                            f21 = reflectiveQuadTo.getX();
                                            f18 = f29;
                                            i11 = size;
                                            f11 = f17;
                                            i12 = i13;
                                            f19 = f22;
                                            pathNode = pathNode3;
                                            f22 = reflectiveQuadTo.getY();
                                        } else if (pathNode3 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode3;
                                            float arcStartDx = relativeArcTo.getArcStartDx() + f21;
                                            float arcStartDy = relativeArcTo.getArcStartDy() + f22;
                                            f11 = f17;
                                            pathNode = pathNode3;
                                            i11 = size;
                                            i12 = i13;
                                            drawArc(path, f21, f22, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                                            f18 = arcStartDx;
                                            f21 = f18;
                                            f19 = arcStartDy;
                                        } else {
                                            i11 = size;
                                            f11 = f17;
                                            i12 = i13;
                                            pathNode = pathNode3;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                drawArc(path, f21, f22, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                                                f18 = arcTo.getArcStartX();
                                                f21 = f18;
                                                f19 = arcTo.getArcStartY();
                                            }
                                        }
                                        f18 = f14;
                                    }
                                    i13 = i12 + 1;
                                    path2 = path;
                                    pathNode2 = pathNode;
                                    size = i11;
                                    f17 = f11;
                                    list2 = list;
                                }
                                f22 += dy22;
                                f18 = dx1;
                                f19 = dy1;
                            }
                            f22 = y22;
                            f21 = x22;
                        }
                        f22 += dy2;
                    }
                    i11 = size;
                    f11 = f17;
                    i12 = i13;
                }
                pathNode = pathNode3;
                i13 = i12 + 1;
                path2 = path;
                pathNode2 = pathNode;
                size = i11;
                f17 = f11;
                list2 = list;
            }
            f22 = f19;
            i13 = i12 + 1;
            path2 = path;
            pathNode2 = pathNode;
            size = i11;
            f17 = f11;
            list2 = list;
        }
        return path;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    private static final double toRadians(double d11) {
        return (d11 / 180) * 3.141592653589793d;
    }
}
