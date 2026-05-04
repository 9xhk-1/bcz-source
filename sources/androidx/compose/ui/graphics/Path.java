package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathIterator;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/compose/ui/graphics/Path\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
/* loaded from: classes.dex */
public interface Path {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @m80.k
        /* renamed from: combine-xh6zSI8, reason: not valid java name */
        public final Path m2780combinexh6zSI8(int i11, @m80.k Path path, @m80.k Path path2) {
            Path Path = AndroidPath_androidKt.Path();
            if (Path.mo2401opN5in7k0(path, path2, i11)) {
                return Path;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        @m80.k
        public static Path and(@m80.k Path path, @m80.k Path path2) {
            return Path.super.and(path2);
        }

        @Deprecated
        public static void arcToRad(@m80.k Path path, @m80.k Rect rect, float f11, float f12, boolean z11) {
            Path.super.arcToRad(rect, f11, f12, z11);
        }

        @Deprecated
        @m80.k
        public static PathIterator iterator(@m80.k Path path) {
            return Path.super.iterator();
        }

        @Deprecated
        @m80.k
        public static Path minus(@m80.k Path path, @m80.k Path path2) {
            return Path.super.minus(path2);
        }

        @Deprecated
        @m80.k
        public static Path or(@m80.k Path path, @m80.k Path path2) {
            return Path.super.or(path2);
        }

        @Deprecated
        @m80.k
        public static Path plus(@m80.k Path path, @m80.k Path path2) {
            return Path.super.plus(path2);
        }

        @Deprecated
        public static void quadraticTo(@m80.k Path path, float f11, float f12, float f13, float f14) {
            Path.super.quadraticTo(f11, f12, f13, f14);
        }

        @Deprecated
        public static void relativeQuadraticTo(@m80.k Path path, float f11, float f12, float f13, float f14) {
            Path.super.relativeQuadraticTo(f11, f12, f13, f14);
        }

        @Deprecated
        public static void rewind(@m80.k Path path) {
            Path.super.rewind();
        }

        @Deprecated
        /* renamed from: transform-58bKbWc, reason: not valid java name */
        public static void m2782transform58bKbWc(@m80.k Path path, @m80.k float[] fArr) {
            Path.super.mo2403transform58bKbWc(fArr);
        }

        @Deprecated
        @m80.k
        public static Path xor(@m80.k Path path, @m80.k Path path2) {
            return Path.super.xor(path2);
        }

        @Deprecated
        @m80.k
        public static PathIterator iterator(@m80.k Path path, @m80.k PathIterator.ConicEvaluation conicEvaluation, float f11) {
            return Path.super.iterator(conicEvaluation, f11);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Direction {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction CounterClockwise = new Direction("CounterClockwise", 0);
        public static final Direction Clockwise = new Direction("Clockwise", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{CounterClockwise, Clockwise};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Direction(String str, int i11) {
        }

        @m80.k
        public static m00.a<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    static /* synthetic */ void addOval$default(Path path, Rect rect, Direction direction, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i11 & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addOval(rect, direction);
    }

    /* renamed from: addPath-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m2779addPathUv8p0NA$default(Path path, Path path2, long j11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i11 & 2) != 0) {
            j11 = Offset.Companion.m2284getZeroF1C5BW0();
        }
        path.mo2399addPathUv8p0NA(path2, j11);
    }

    static /* synthetic */ void addRect$default(Path path, Rect rect, Direction direction, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i11 & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRect(rect, direction);
    }

    static /* synthetic */ void addRoundRect$default(Path path, RoundRect roundRect, Direction direction, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i11 & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.addRoundRect(roundRect, direction);
    }

    static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i11 & 2) != 0) {
            f11 = 0.25f;
        }
        return path.iterator(conicEvaluation, f11);
    }

    void addArc(@m80.k Rect rect, float f11, float f12);

    void addArcRad(@m80.k Rect rect, float f11, float f12);

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @yz.w0(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void addOval(Rect rect);

    void addOval(@m80.k Rect rect, @m80.k Direction direction);

    /* renamed from: addPath-Uv8p0NA */
    void mo2399addPathUv8p0NA(@m80.k Path path, long j11);

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @yz.w0(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void addRect(Rect rect);

    void addRect(@m80.k Rect rect, @m80.k Direction direction);

    @yz.n(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @yz.w0(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void addRoundRect(RoundRect roundRect);

    void addRoundRect(@m80.k RoundRect roundRect, @m80.k Direction direction);

    @m80.k
    default Path and(@m80.k Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo2401opN5in7k0(this, path, PathOperation.Companion.m2802getIntersectb3I0S0c());
        return Path;
    }

    void arcTo(@m80.k Rect rect, float f11, float f12, boolean z11);

    default void arcToRad(@m80.k Rect rect, float f11, float f12, boolean z11) {
        arcTo(rect, DegreesKt.degrees(f11), DegreesKt.degrees(f12), z11);
    }

    void close();

    void cubicTo(float f11, float f12, float f13, float f14, float f15, float f16);

    @m80.k
    Rect getBounds();

    /* renamed from: getFillType-Rg-k1Os */
    int mo2400getFillTypeRgk1Os();

    boolean isConvex();

    boolean isEmpty();

    @m80.k
    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    void lineTo(float f11, float f12);

    @m80.k
    default Path minus(@m80.k Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo2401opN5in7k0(this, path, PathOperation.Companion.m2801getDifferenceb3I0S0c());
        return Path;
    }

    void moveTo(float f11, float f12);

    /* renamed from: op-N5in7k0 */
    boolean mo2401opN5in7k0(@m80.k Path path, @m80.k Path path2, int i11);

    @m80.k
    default Path or(@m80.k Path path) {
        return plus(path);
    }

    @m80.k
    default Path plus(@m80.k Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo2401opN5in7k0(this, path, PathOperation.Companion.m2804getUnionb3I0S0c());
        return Path;
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @yz.w0(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float f11, float f12, float f13, float f14);

    default void quadraticTo(float f11, float f12, float f13, float f14) {
        quadraticBezierTo(f11, f12, f13, f14);
    }

    void relativeCubicTo(float f11, float f12, float f13, float f14, float f15, float f16);

    void relativeLineTo(float f11, float f12);

    void relativeMoveTo(float f11, float f12);

    @yz.n(level = DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @yz.w0(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float f11, float f12, float f13, float f14);

    default void relativeQuadraticTo(float f11, float f12, float f13, float f14) {
        relativeQuadraticBezierTo(f11, f12, f13, f14);
    }

    void reset();

    default void rewind() {
        reset();
    }

    /* renamed from: setFillType-oQ8Xj4U */
    void mo2402setFillTypeoQ8Xj4U(int i11);

    /* renamed from: translate-k-4lQ0M */
    void mo2404translatek4lQ0M(long j11);

    @m80.k
    default Path xor(@m80.k Path path) {
        Path Path = AndroidPath_androidKt.Path();
        Path.mo2401opN5in7k0(this, path, PathOperation.Companion.m2805getXorb3I0S0c());
        return Path;
    }

    @m80.k
    default PathIterator iterator(@m80.k PathIterator.ConicEvaluation conicEvaluation, float f11) {
        return AndroidPathIterator_androidKt.PathIterator(this, conicEvaluation, f11);
    }

    /* renamed from: transform-58bKbWc */
    default void mo2403transform58bKbWc(@m80.k float[] fArr) {
    }
}
