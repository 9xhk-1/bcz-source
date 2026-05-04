package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public abstract class PathNode {
    private final boolean isCurve;
    private final boolean isQuad;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartX = r9
                r3.arcStartY = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.ArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ ArcTo copy$default(ArcTo arcTo, float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = arcTo.horizontalEllipseRadius;
            }
            if ((i11 & 2) != 0) {
                f12 = arcTo.verticalEllipseRadius;
            }
            if ((i11 & 4) != 0) {
                f13 = arcTo.theta;
            }
            if ((i11 & 8) != 0) {
                z11 = arcTo.isMoreThanHalf;
            }
            if ((i11 & 16) != 0) {
                z12 = arcTo.isPositiveArc;
            }
            if ((i11 & 32) != 0) {
                f14 = arcTo.arcStartX;
            }
            if ((i11 & 64) != 0) {
                f15 = arcTo.arcStartY;
            }
            float f16 = f14;
            float f17 = f15;
            boolean z13 = z12;
            float f18 = f13;
            return arcTo.copy(f11, f12, f18, z11, z13, f16, f17);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        @k
        public final ArcTo copy(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            return new ArcTo(f11, f12, f13, z11, z12, f14, f15);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcTo)) {
                return false;
            }
            ArcTo arcTo = (ArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, arcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, arcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, arcTo.theta) == 0 && this.isMoreThanHalf == arcTo.isMoreThanHalf && this.isPositiveArc == arcTo.isPositiveArc && Float.compare(this.arcStartX, arcTo.arcStartX) == 0 && Float.compare(this.arcStartY, arcTo.arcStartY) == 0;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartX)) * 31) + Float.hashCode(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @k
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class Close extends PathNode {

        @k
        public static final Close INSTANCE = new Close();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Close() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.Close.<init>():void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class CurveTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f4177x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f4178x2;

        /* renamed from: x3, reason: collision with root package name */
        private final float f4179x3;

        /* renamed from: y1, reason: collision with root package name */
        private final float f4180y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f4181y2;

        /* renamed from: y3, reason: collision with root package name */
        private final float f4182y3;

        public CurveTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.f4177x1 = f11;
            this.f4180y1 = f12;
            this.f4178x2 = f13;
            this.f4181y2 = f14;
            this.f4179x3 = f15;
            this.f4182y3 = f16;
        }

        public static /* synthetic */ CurveTo copy$default(CurveTo curveTo, float f11, float f12, float f13, float f14, float f15, float f16, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = curveTo.f4177x1;
            }
            if ((i11 & 2) != 0) {
                f12 = curveTo.f4180y1;
            }
            if ((i11 & 4) != 0) {
                f13 = curveTo.f4178x2;
            }
            if ((i11 & 8) != 0) {
                f14 = curveTo.f4181y2;
            }
            if ((i11 & 16) != 0) {
                f15 = curveTo.f4179x3;
            }
            if ((i11 & 32) != 0) {
                f16 = curveTo.f4182y3;
            }
            float f17 = f15;
            float f18 = f16;
            return curveTo.copy(f11, f12, f13, f14, f17, f18);
        }

        public final float component1() {
            return this.f4177x1;
        }

        public final float component2() {
            return this.f4180y1;
        }

        public final float component3() {
            return this.f4178x2;
        }

        public final float component4() {
            return this.f4181y2;
        }

        public final float component5() {
            return this.f4179x3;
        }

        public final float component6() {
            return this.f4182y3;
        }

        @k
        public final CurveTo copy(float f11, float f12, float f13, float f14, float f15, float f16) {
            return new CurveTo(f11, f12, f13, f14, f15, f16);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurveTo)) {
                return false;
            }
            CurveTo curveTo = (CurveTo) obj;
            return Float.compare(this.f4177x1, curveTo.f4177x1) == 0 && Float.compare(this.f4180y1, curveTo.f4180y1) == 0 && Float.compare(this.f4178x2, curveTo.f4178x2) == 0 && Float.compare(this.f4181y2, curveTo.f4181y2) == 0 && Float.compare(this.f4179x3, curveTo.f4179x3) == 0 && Float.compare(this.f4182y3, curveTo.f4182y3) == 0;
        }

        public final float getX1() {
            return this.f4177x1;
        }

        public final float getX2() {
            return this.f4178x2;
        }

        public final float getX3() {
            return this.f4179x3;
        }

        public final float getY1() {
            return this.f4180y1;
        }

        public final float getY2() {
            return this.f4181y2;
        }

        public final float getY3() {
            return this.f4182y3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f4177x1) * 31) + Float.hashCode(this.f4180y1)) * 31) + Float.hashCode(this.f4178x2)) * 31) + Float.hashCode(this.f4181y2)) * 31) + Float.hashCode(this.f4179x3)) * 31) + Float.hashCode(this.f4182y3);
        }

        @k
        public String toString() {
            return "CurveTo(x1=" + this.f4177x1 + ", y1=" + this.f4180y1 + ", x2=" + this.f4178x2 + ", y2=" + this.f4181y2 + ", x3=" + this.f4179x3 + ", y3=" + this.f4182y3 + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class HorizontalTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f4183x;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4183x = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.HorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ HorizontalTo copy$default(HorizontalTo horizontalTo, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = horizontalTo.f4183x;
            }
            return horizontalTo.copy(f11);
        }

        public final float component1() {
            return this.f4183x;
        }

        @k
        public final HorizontalTo copy(float f11) {
            return new HorizontalTo(f11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HorizontalTo) && Float.compare(this.f4183x, ((HorizontalTo) obj).f4183x) == 0;
        }

        public final float getX() {
            return this.f4183x;
        }

        public int hashCode() {
            return Float.hashCode(this.f4183x);
        }

        @k
        public String toString() {
            return "HorizontalTo(x=" + this.f4183x + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class LineTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f4184x;

        /* renamed from: y, reason: collision with root package name */
        private final float f4185y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4184x = r4
                r3.f4185y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.LineTo.<init>(float, float):void");
        }

        public static /* synthetic */ LineTo copy$default(LineTo lineTo, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = lineTo.f4184x;
            }
            if ((i11 & 2) != 0) {
                f12 = lineTo.f4185y;
            }
            return lineTo.copy(f11, f12);
        }

        public final float component1() {
            return this.f4184x;
        }

        public final float component2() {
            return this.f4185y;
        }

        @k
        public final LineTo copy(float f11, float f12) {
            return new LineTo(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineTo)) {
                return false;
            }
            LineTo lineTo = (LineTo) obj;
            return Float.compare(this.f4184x, lineTo.f4184x) == 0 && Float.compare(this.f4185y, lineTo.f4185y) == 0;
        }

        public final float getX() {
            return this.f4184x;
        }

        public final float getY() {
            return this.f4185y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f4184x) * 31) + Float.hashCode(this.f4185y);
        }

        @k
        public String toString() {
            return "LineTo(x=" + this.f4184x + ", y=" + this.f4185y + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class MoveTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f4186x;

        /* renamed from: y, reason: collision with root package name */
        private final float f4187y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4186x = r4
                r3.f4187y = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.MoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ MoveTo copy$default(MoveTo moveTo, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = moveTo.f4186x;
            }
            if ((i11 & 2) != 0) {
                f12 = moveTo.f4187y;
            }
            return moveTo.copy(f11, f12);
        }

        public final float component1() {
            return this.f4186x;
        }

        public final float component2() {
            return this.f4187y;
        }

        @k
        public final MoveTo copy(float f11, float f12) {
            return new MoveTo(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveTo)) {
                return false;
            }
            MoveTo moveTo = (MoveTo) obj;
            return Float.compare(this.f4186x, moveTo.f4186x) == 0 && Float.compare(this.f4187y, moveTo.f4187y) == 0;
        }

        public final float getX() {
            return this.f4186x;
        }

        public final float getY() {
            return this.f4187y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f4186x) * 31) + Float.hashCode(this.f4187y);
        }

        @k
        public String toString() {
            return "MoveTo(x=" + this.f4186x + ", y=" + this.f4187y + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class QuadTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f4188x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f4189x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f4190y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f4191y2;

        public QuadTo(float f11, float f12, float f13, float f14) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f4188x1 = f11;
            this.f4190y1 = f12;
            this.f4189x2 = f13;
            this.f4191y2 = f14;
        }

        public static /* synthetic */ QuadTo copy$default(QuadTo quadTo, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = quadTo.f4188x1;
            }
            if ((i11 & 2) != 0) {
                f12 = quadTo.f4190y1;
            }
            if ((i11 & 4) != 0) {
                f13 = quadTo.f4189x2;
            }
            if ((i11 & 8) != 0) {
                f14 = quadTo.f4191y2;
            }
            return quadTo.copy(f11, f12, f13, f14);
        }

        public final float component1() {
            return this.f4188x1;
        }

        public final float component2() {
            return this.f4190y1;
        }

        public final float component3() {
            return this.f4189x2;
        }

        public final float component4() {
            return this.f4191y2;
        }

        @k
        public final QuadTo copy(float f11, float f12, float f13, float f14) {
            return new QuadTo(f11, f12, f13, f14);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuadTo)) {
                return false;
            }
            QuadTo quadTo = (QuadTo) obj;
            return Float.compare(this.f4188x1, quadTo.f4188x1) == 0 && Float.compare(this.f4190y1, quadTo.f4190y1) == 0 && Float.compare(this.f4189x2, quadTo.f4189x2) == 0 && Float.compare(this.f4191y2, quadTo.f4191y2) == 0;
        }

        public final float getX1() {
            return this.f4188x1;
        }

        public final float getX2() {
            return this.f4189x2;
        }

        public final float getY1() {
            return this.f4190y1;
        }

        public final float getY2() {
            return this.f4191y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f4188x1) * 31) + Float.hashCode(this.f4190y1)) * 31) + Float.hashCode(this.f4189x2)) * 31) + Float.hashCode(this.f4191y2);
        }

        @k
        public String toString() {
            return "QuadTo(x1=" + this.f4188x1 + ", y1=" + this.f4190y1 + ", x2=" + this.f4189x2 + ", y2=" + this.f4191y2 + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class ReflectiveCurveTo extends PathNode {

        /* renamed from: x1, reason: collision with root package name */
        private final float f4192x1;

        /* renamed from: x2, reason: collision with root package name */
        private final float f4193x2;

        /* renamed from: y1, reason: collision with root package name */
        private final float f4194y1;

        /* renamed from: y2, reason: collision with root package name */
        private final float f4195y2;

        public ReflectiveCurveTo(float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.f4192x1 = f11;
            this.f4194y1 = f12;
            this.f4193x2 = f13;
            this.f4195y2 = f14;
        }

        public static /* synthetic */ ReflectiveCurveTo copy$default(ReflectiveCurveTo reflectiveCurveTo, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = reflectiveCurveTo.f4192x1;
            }
            if ((i11 & 2) != 0) {
                f12 = reflectiveCurveTo.f4194y1;
            }
            if ((i11 & 4) != 0) {
                f13 = reflectiveCurveTo.f4193x2;
            }
            if ((i11 & 8) != 0) {
                f14 = reflectiveCurveTo.f4195y2;
            }
            return reflectiveCurveTo.copy(f11, f12, f13, f14);
        }

        public final float component1() {
            return this.f4192x1;
        }

        public final float component2() {
            return this.f4194y1;
        }

        public final float component3() {
            return this.f4193x2;
        }

        public final float component4() {
            return this.f4195y2;
        }

        @k
        public final ReflectiveCurveTo copy(float f11, float f12, float f13, float f14) {
            return new ReflectiveCurveTo(f11, f12, f13, f14);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveCurveTo)) {
                return false;
            }
            ReflectiveCurveTo reflectiveCurveTo = (ReflectiveCurveTo) obj;
            return Float.compare(this.f4192x1, reflectiveCurveTo.f4192x1) == 0 && Float.compare(this.f4194y1, reflectiveCurveTo.f4194y1) == 0 && Float.compare(this.f4193x2, reflectiveCurveTo.f4193x2) == 0 && Float.compare(this.f4195y2, reflectiveCurveTo.f4195y2) == 0;
        }

        public final float getX1() {
            return this.f4192x1;
        }

        public final float getX2() {
            return this.f4193x2;
        }

        public final float getY1() {
            return this.f4194y1;
        }

        public final float getY2() {
            return this.f4195y2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f4192x1) * 31) + Float.hashCode(this.f4194y1)) * 31) + Float.hashCode(this.f4193x2)) * 31) + Float.hashCode(this.f4195y2);
        }

        @k
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f4192x1 + ", y1=" + this.f4194y1 + ", x2=" + this.f4193x2 + ", y2=" + this.f4195y2 + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class ReflectiveQuadTo extends PathNode {

        /* renamed from: x, reason: collision with root package name */
        private final float f4196x;

        /* renamed from: y, reason: collision with root package name */
        private final float f4197y;

        public ReflectiveQuadTo(float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f4196x = f11;
            this.f4197y = f12;
        }

        public static /* synthetic */ ReflectiveQuadTo copy$default(ReflectiveQuadTo reflectiveQuadTo, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = reflectiveQuadTo.f4196x;
            }
            if ((i11 & 2) != 0) {
                f12 = reflectiveQuadTo.f4197y;
            }
            return reflectiveQuadTo.copy(f11, f12);
        }

        public final float component1() {
            return this.f4196x;
        }

        public final float component2() {
            return this.f4197y;
        }

        @k
        public final ReflectiveQuadTo copy(float f11, float f12) {
            return new ReflectiveQuadTo(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReflectiveQuadTo)) {
                return false;
            }
            ReflectiveQuadTo reflectiveQuadTo = (ReflectiveQuadTo) obj;
            return Float.compare(this.f4196x, reflectiveQuadTo.f4196x) == 0 && Float.compare(this.f4197y, reflectiveQuadTo.f4197y) == 0;
        }

        public final float getX() {
            return this.f4196x;
        }

        public final float getY() {
            return this.f4197y;
        }

        public int hashCode() {
            return (Float.hashCode(this.f4196x) * 31) + Float.hashCode(this.f4197y);
        }

        @k
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f4196x + ", y=" + this.f4197y + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeArcTo(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.horizontalEllipseRadius = r4
                r3.verticalEllipseRadius = r5
                r3.theta = r6
                r3.isMoreThanHalf = r7
                r3.isPositiveArc = r8
                r3.arcStartDx = r9
                r3.arcStartDy = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public static /* synthetic */ RelativeArcTo copy$default(RelativeArcTo relativeArcTo, float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeArcTo.horizontalEllipseRadius;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeArcTo.verticalEllipseRadius;
            }
            if ((i11 & 4) != 0) {
                f13 = relativeArcTo.theta;
            }
            if ((i11 & 8) != 0) {
                z11 = relativeArcTo.isMoreThanHalf;
            }
            if ((i11 & 16) != 0) {
                z12 = relativeArcTo.isPositiveArc;
            }
            if ((i11 & 32) != 0) {
                f14 = relativeArcTo.arcStartDx;
            }
            if ((i11 & 64) != 0) {
                f15 = relativeArcTo.arcStartDy;
            }
            float f16 = f14;
            float f17 = f15;
            boolean z13 = z12;
            float f18 = f13;
            return relativeArcTo.copy(f11, f12, f18, z11, z13, f16, f17);
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        @k
        public final RelativeArcTo copy(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
            return new RelativeArcTo(f11, f12, f13, z11, z12, f14, f15);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeArcTo)) {
                return false;
            }
            RelativeArcTo relativeArcTo = (RelativeArcTo) obj;
            return Float.compare(this.horizontalEllipseRadius, relativeArcTo.horizontalEllipseRadius) == 0 && Float.compare(this.verticalEllipseRadius, relativeArcTo.verticalEllipseRadius) == 0 && Float.compare(this.theta, relativeArcTo.theta) == 0 && this.isMoreThanHalf == relativeArcTo.isMoreThanHalf && this.isPositiveArc == relativeArcTo.isPositiveArc && Float.compare(this.arcStartDx, relativeArcTo.arcStartDx) == 0 && Float.compare(this.arcStartDy, relativeArcTo.arcStartDy) == 0;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.horizontalEllipseRadius) * 31) + Float.hashCode(this.verticalEllipseRadius)) * 31) + Float.hashCode(this.theta)) * 31) + Boolean.hashCode(this.isMoreThanHalf)) * 31) + Boolean.hashCode(this.isPositiveArc)) * 31) + Float.hashCode(this.arcStartDx)) * 31) + Float.hashCode(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @k
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f11, float f12, float f13, float f14, float f15, float f16) {
            super(true, false, 2, null);
            this.dx1 = f11;
            this.dy1 = f12;
            this.dx2 = f13;
            this.dy2 = f14;
            this.dx3 = f15;
            this.dy3 = f16;
        }

        public static /* synthetic */ RelativeCurveTo copy$default(RelativeCurveTo relativeCurveTo, float f11, float f12, float f13, float f14, float f15, float f16, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeCurveTo.dx1;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeCurveTo.dy1;
            }
            if ((i11 & 4) != 0) {
                f13 = relativeCurveTo.dx2;
            }
            if ((i11 & 8) != 0) {
                f14 = relativeCurveTo.dy2;
            }
            if ((i11 & 16) != 0) {
                f15 = relativeCurveTo.dx3;
            }
            if ((i11 & 32) != 0) {
                f16 = relativeCurveTo.dy3;
            }
            float f17 = f15;
            float f18 = f16;
            return relativeCurveTo.copy(f11, f12, f13, f14, f17, f18);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        @k
        public final RelativeCurveTo copy(float f11, float f12, float f13, float f14, float f15, float f16) {
            return new RelativeCurveTo(f11, f12, f13, f14, f15, f16);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeCurveTo)) {
                return false;
            }
            RelativeCurveTo relativeCurveTo = (RelativeCurveTo) obj;
            return Float.compare(this.dx1, relativeCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeCurveTo.dy2) == 0 && Float.compare(this.dx3, relativeCurveTo.dx3) == 0 && Float.compare(this.dy3, relativeCurveTo.dy3) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2)) * 31) + Float.hashCode(this.dx3)) * 31) + Float.hashCode(this.dy3);
        }

        @k
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeHorizontalTo extends PathNode {

        /* renamed from: dx, reason: collision with root package name */
        private final float f4198dx;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeHorizontalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4198dx = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeHorizontalTo copy$default(RelativeHorizontalTo relativeHorizontalTo, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeHorizontalTo.f4198dx;
            }
            return relativeHorizontalTo.copy(f11);
        }

        public final float component1() {
            return this.f4198dx;
        }

        @k
        public final RelativeHorizontalTo copy(float f11) {
            return new RelativeHorizontalTo(f11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeHorizontalTo) && Float.compare(this.f4198dx, ((RelativeHorizontalTo) obj).f4198dx) == 0;
        }

        public final float getDx() {
            return this.f4198dx;
        }

        public int hashCode() {
            return Float.hashCode(this.f4198dx);
        }

        @k
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f4198dx + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeLineTo extends PathNode {

        /* renamed from: dx, reason: collision with root package name */
        private final float f4199dx;

        /* renamed from: dy, reason: collision with root package name */
        private final float f4200dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeLineTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4199dx = r4
                r3.f4200dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeLineTo copy$default(RelativeLineTo relativeLineTo, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeLineTo.f4199dx;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeLineTo.f4200dy;
            }
            return relativeLineTo.copy(f11, f12);
        }

        public final float component1() {
            return this.f4199dx;
        }

        public final float component2() {
            return this.f4200dy;
        }

        @k
        public final RelativeLineTo copy(float f11, float f12) {
            return new RelativeLineTo(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeLineTo)) {
                return false;
            }
            RelativeLineTo relativeLineTo = (RelativeLineTo) obj;
            return Float.compare(this.f4199dx, relativeLineTo.f4199dx) == 0 && Float.compare(this.f4200dy, relativeLineTo.f4200dy) == 0;
        }

        public final float getDx() {
            return this.f4199dx;
        }

        public final float getDy() {
            return this.f4200dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f4199dx) * 31) + Float.hashCode(this.f4200dy);
        }

        @k
        public String toString() {
            return "RelativeLineTo(dx=" + this.f4199dx + ", dy=" + this.f4200dy + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeMoveTo extends PathNode {

        /* renamed from: dx, reason: collision with root package name */
        private final float f4201dx;

        /* renamed from: dy, reason: collision with root package name */
        private final float f4202dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeMoveTo(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4201dx = r4
                r3.f4202dy = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo.<init>(float, float):void");
        }

        public static /* synthetic */ RelativeMoveTo copy$default(RelativeMoveTo relativeMoveTo, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeMoveTo.f4201dx;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeMoveTo.f4202dy;
            }
            return relativeMoveTo.copy(f11, f12);
        }

        public final float component1() {
            return this.f4201dx;
        }

        public final float component2() {
            return this.f4202dy;
        }

        @k
        public final RelativeMoveTo copy(float f11, float f12) {
            return new RelativeMoveTo(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeMoveTo)) {
                return false;
            }
            RelativeMoveTo relativeMoveTo = (RelativeMoveTo) obj;
            return Float.compare(this.f4201dx, relativeMoveTo.f4201dx) == 0 && Float.compare(this.f4202dy, relativeMoveTo.f4202dy) == 0;
        }

        public final float getDx() {
            return this.f4201dx;
        }

        public final float getDy() {
            return this.f4202dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f4201dx) * 31) + Float.hashCode(this.f4202dy);
        }

        @k
        public String toString() {
            return "RelativeMoveTo(dx=" + this.f4201dx + ", dy=" + this.f4202dy + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f11, float f12, float f13, float f14) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.dx1 = f11;
            this.dy1 = f12;
            this.dx2 = f13;
            this.dy2 = f14;
        }

        public static /* synthetic */ RelativeQuadTo copy$default(RelativeQuadTo relativeQuadTo, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeQuadTo.dx1;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeQuadTo.dy1;
            }
            if ((i11 & 4) != 0) {
                f13 = relativeQuadTo.dx2;
            }
            if ((i11 & 8) != 0) {
                f14 = relativeQuadTo.dy2;
            }
            return relativeQuadTo.copy(f11, f12, f13, f14);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        @k
        public final RelativeQuadTo copy(float f11, float f12, float f13, float f14) {
            return new RelativeQuadTo(f11, f12, f13, f14);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeQuadTo)) {
                return false;
            }
            RelativeQuadTo relativeQuadTo = (RelativeQuadTo) obj;
            return Float.compare(this.dx1, relativeQuadTo.dx1) == 0 && Float.compare(this.dy1, relativeQuadTo.dy1) == 0 && Float.compare(this.dx2, relativeQuadTo.dx2) == 0 && Float.compare(this.dy2, relativeQuadTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        @k
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f11, float f12, float f13, float f14) {
            super(true, false, 2, null);
            this.dx1 = f11;
            this.dy1 = f12;
            this.dx2 = f13;
            this.dy2 = f14;
        }

        public static /* synthetic */ RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo relativeReflectiveCurveTo, float f11, float f12, float f13, float f14, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeReflectiveCurveTo.dx1;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeReflectiveCurveTo.dy1;
            }
            if ((i11 & 4) != 0) {
                f13 = relativeReflectiveCurveTo.dx2;
            }
            if ((i11 & 8) != 0) {
                f14 = relativeReflectiveCurveTo.dy2;
            }
            return relativeReflectiveCurveTo.copy(f11, f12, f13, f14);
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        @k
        public final RelativeReflectiveCurveTo copy(float f11, float f12, float f13, float f14) {
            return new RelativeReflectiveCurveTo(f11, f12, f13, f14);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            RelativeReflectiveCurveTo relativeReflectiveCurveTo = (RelativeReflectiveCurveTo) obj;
            return Float.compare(this.dx1, relativeReflectiveCurveTo.dx1) == 0 && Float.compare(this.dy1, relativeReflectiveCurveTo.dy1) == 0 && Float.compare(this.dx2, relativeReflectiveCurveTo.dx2) == 0 && Float.compare(this.dy2, relativeReflectiveCurveTo.dy2) == 0;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.dx1) * 31) + Float.hashCode(this.dy1)) * 31) + Float.hashCode(this.dx2)) * 31) + Float.hashCode(this.dy2);
        }

        @k
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeReflectiveQuadTo extends PathNode {

        /* renamed from: dx, reason: collision with root package name */
        private final float f4203dx;

        /* renamed from: dy, reason: collision with root package name */
        private final float f4204dy;

        public RelativeReflectiveQuadTo(float f11, float f12) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f4203dx = f11;
            this.f4204dy = f12;
        }

        public static /* synthetic */ RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo relativeReflectiveQuadTo, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeReflectiveQuadTo.f4203dx;
            }
            if ((i11 & 2) != 0) {
                f12 = relativeReflectiveQuadTo.f4204dy;
            }
            return relativeReflectiveQuadTo.copy(f11, f12);
        }

        public final float component1() {
            return this.f4203dx;
        }

        public final float component2() {
            return this.f4204dy;
        }

        @k
        public final RelativeReflectiveQuadTo copy(float f11, float f12) {
            return new RelativeReflectiveQuadTo(f11, f12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            RelativeReflectiveQuadTo relativeReflectiveQuadTo = (RelativeReflectiveQuadTo) obj;
            return Float.compare(this.f4203dx, relativeReflectiveQuadTo.f4203dx) == 0 && Float.compare(this.f4204dy, relativeReflectiveQuadTo.f4204dy) == 0;
        }

        public final float getDx() {
            return this.f4203dx;
        }

        public final float getDy() {
            return this.f4204dy;
        }

        public int hashCode() {
            return (Float.hashCode(this.f4203dx) * 31) + Float.hashCode(this.f4204dy);
        }

        @k
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f4203dx + ", dy=" + this.f4204dy + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class RelativeVerticalTo extends PathNode {

        /* renamed from: dy, reason: collision with root package name */
        private final float f4205dy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RelativeVerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4205dy = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo.<init>(float):void");
        }

        public static /* synthetic */ RelativeVerticalTo copy$default(RelativeVerticalTo relativeVerticalTo, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = relativeVerticalTo.f4205dy;
            }
            return relativeVerticalTo.copy(f11);
        }

        public final float component1() {
            return this.f4205dy;
        }

        @k
        public final RelativeVerticalTo copy(float f11) {
            return new RelativeVerticalTo(f11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RelativeVerticalTo) && Float.compare(this.f4205dy, ((RelativeVerticalTo) obj).f4205dy) == 0;
        }

        public final float getDy() {
            return this.f4205dy;
        }

        public int hashCode() {
            return Float.hashCode(this.f4205dy);
        }

        @k
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f4205dy + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Immutable
    public static final class VerticalTo extends PathNode {

        /* renamed from: y, reason: collision with root package name */
        private final float f4206y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public VerticalTo(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f4206y = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.PathNode.VerticalTo.<init>(float):void");
        }

        public static /* synthetic */ VerticalTo copy$default(VerticalTo verticalTo, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = verticalTo.f4206y;
            }
            return verticalTo.copy(f11);
        }

        public final float component1() {
            return this.f4206y;
        }

        @k
        public final VerticalTo copy(float f11) {
            return new VerticalTo(f11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerticalTo) && Float.compare(this.f4206y, ((VerticalTo) obj).f4206y) == 0;
        }

        public final float getY() {
            return this.f4206y;
        }

        public int hashCode() {
            return Float.hashCode(this.f4206y);
        }

        @k
        public String toString() {
            return "VerticalTo(y=" + this.f4206y + ')';
        }
    }

    public /* synthetic */ PathNode(boolean z11, boolean z12, v vVar) {
        this(z11, z12);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }

    private PathNode(boolean z11, boolean z12) {
        this.isCurve = z11;
        this.isQuad = z12;
    }

    public /* synthetic */ PathNode(boolean z11, boolean z12, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, null);
    }
}
