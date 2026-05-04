package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PathSegmentKt {

    @m80.k
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new float[0], 0.0f);

    @m80.k
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new float[0], 0.0f);

    @m80.k
    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    @m80.k
    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
