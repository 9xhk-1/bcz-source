package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@h
/* loaded from: classes.dex */
public final class BlurredEdgeTreatment {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Shape Rectangle = m2119constructorimpl(RectangleShapeKt.getRectangleShape());

    @k
    private static final Shape Unbounded = m2119constructorimpl(null);

    @l
    private final Shape shape;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        /* renamed from: getRectangle---Goahg, reason: not valid java name */
        public final Shape m2125getRectangleGoahg() {
            return BlurredEdgeTreatment.Rectangle;
        }

        @k
        /* renamed from: getUnbounded---Goahg, reason: not valid java name */
        public final Shape m2126getUnboundedGoahg() {
            return BlurredEdgeTreatment.Unbounded;
        }

        private Companion() {
        }
    }

    private /* synthetic */ BlurredEdgeTreatment(Shape shape) {
        this.shape = shape;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlurredEdgeTreatment m2118boximpl(Shape shape) {
        return new BlurredEdgeTreatment(shape);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2120equalsimpl(Shape shape, Object obj) {
        return (obj instanceof BlurredEdgeTreatment) && g0.g(shape, ((BlurredEdgeTreatment) obj).m2124unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2121equalsimpl0(Shape shape, Shape shape2) {
        return g0.g(shape, shape2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2122hashCodeimpl(Shape shape) {
        if (shape == null) {
            return 0;
        }
        return shape.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2123toStringimpl(Shape shape) {
        return "BlurredEdgeTreatment(shape=" + shape + ')';
    }

    public boolean equals(Object obj) {
        return m2120equalsimpl(this.shape, obj);
    }

    @l
    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return m2122hashCodeimpl(this.shape);
    }

    public String toString() {
        return m2123toStringimpl(this.shape);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Shape m2124unboximpl() {
        return this.shape;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Shape m2119constructorimpl(@l Shape shape) {
        return shape;
    }
}
