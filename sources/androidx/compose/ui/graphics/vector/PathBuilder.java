package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PathBuilder {

    @k
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    @k
    public final PathBuilder arcTo(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        this._nodes.add(new PathNode.ArcTo(f11, f12, f13, z11, z12, f14, f15));
        return this;
    }

    @k
    public final PathBuilder arcToRelative(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        this._nodes.add(new PathNode.RelativeArcTo(f11, f12, f13, z11, z12, f14, f15));
        return this;
    }

    @k
    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    @k
    public final PathBuilder curveTo(float f11, float f12, float f13, float f14, float f15, float f16) {
        this._nodes.add(new PathNode.CurveTo(f11, f12, f13, f14, f15, f16));
        return this;
    }

    @k
    public final PathBuilder curveToRelative(float f11, float f12, float f13, float f14, float f15, float f16) {
        this._nodes.add(new PathNode.RelativeCurveTo(f11, f12, f13, f14, f15, f16));
        return this;
    }

    @k
    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    @k
    public final PathBuilder horizontalLineTo(float f11) {
        this._nodes.add(new PathNode.HorizontalTo(f11));
        return this;
    }

    @k
    public final PathBuilder horizontalLineToRelative(float f11) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(f11));
        return this;
    }

    @k
    public final PathBuilder lineTo(float f11, float f12) {
        this._nodes.add(new PathNode.LineTo(f11, f12));
        return this;
    }

    @k
    public final PathBuilder lineToRelative(float f11, float f12) {
        this._nodes.add(new PathNode.RelativeLineTo(f11, f12));
        return this;
    }

    @k
    public final PathBuilder moveTo(float f11, float f12) {
        this._nodes.add(new PathNode.MoveTo(f11, f12));
        return this;
    }

    @k
    public final PathBuilder moveToRelative(float f11, float f12) {
        this._nodes.add(new PathNode.RelativeMoveTo(f11, f12));
        return this;
    }

    @k
    public final PathBuilder quadTo(float f11, float f12, float f13, float f14) {
        this._nodes.add(new PathNode.QuadTo(f11, f12, f13, f14));
        return this;
    }

    @k
    public final PathBuilder quadToRelative(float f11, float f12, float f13, float f14) {
        this._nodes.add(new PathNode.RelativeQuadTo(f11, f12, f13, f14));
        return this;
    }

    @k
    public final PathBuilder reflectiveCurveTo(float f11, float f12, float f13, float f14) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(f11, f12, f13, f14));
        return this;
    }

    @k
    public final PathBuilder reflectiveCurveToRelative(float f11, float f12, float f13, float f14) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(f11, f12, f13, f14));
        return this;
    }

    @k
    public final PathBuilder reflectiveQuadTo(float f11, float f12) {
        this._nodes.add(new PathNode.ReflectiveQuadTo(f11, f12));
        return this;
    }

    @k
    public final PathBuilder reflectiveQuadToRelative(float f11, float f12) {
        this._nodes.add(new PathNode.RelativeReflectiveQuadTo(f11, f12));
        return this;
    }

    @k
    public final PathBuilder verticalLineTo(float f11) {
        this._nodes.add(new PathNode.VerticalTo(f11));
        return this;
    }

    @k
    public final PathBuilder verticalLineToRelative(float f11) {
        this._nodes.add(new PathNode.RelativeVerticalTo(f11));
        return this;
    }
}
