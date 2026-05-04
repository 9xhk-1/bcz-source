package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PathSegment {

    @k
    private final PointF[] points;

    @k
    private final Type type;
    private final float weight;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        Move,
        Line,
        Quadratic,
        Conic,
        Cubic,
        Close,
        Done
    }

    public PathSegment(@k Type type, @k PointF[] points, float f11) {
        g0.p(type, "type");
        g0.p(points, "points");
        this.type = type;
        this.points = points;
        this.weight = f11;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(PathSegment.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.type == pathSegment.type && Arrays.equals(this.points, pathSegment.points) && this.weight == pathSegment.weight;
    }

    @k
    public final PointF[] getPoints() {
        return this.points;
    }

    @k
    public final Type getType() {
        return this.type;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Arrays.hashCode(this.points)) * 31) + Float.hashCode(this.weight);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PathSegment(type=");
        sb2.append(this.type);
        sb2.append(", points=");
        String arrays = Arrays.toString(this.points);
        g0.o(arrays, "toString(this)");
        sb2.append(arrays);
        sb2.append(", weight=");
        sb2.append(this.weight);
        sb2.append(')');
        return sb2.toString();
    }
}
