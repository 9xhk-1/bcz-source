package androidx.graphics.path;

import android.graphics.PointF;
import androidx.graphics.path.PathSegment;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "PathSegmentUtilities")
@u0({"SMAP\nPathSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n26#2:140\n*S KotlinDebug\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n*L\n130#1:139\n137#1:140\n*E\n"})
/* loaded from: classes2.dex */
public final class PathSegmentUtilities {

    @k
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);

    @k
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);

    @k
    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    @k
    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
