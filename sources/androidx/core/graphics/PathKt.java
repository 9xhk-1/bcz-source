package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClassVerificationFailure"})
@u0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,80:1\n43#1,3:81\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n60#1:81,3\n*E\n"})
/* loaded from: classes2.dex */
public final class PathKt {
    @m80.k
    public static final Path and(@m80.k Path path, @m80.k Path path2) {
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @RequiresApi(26)
    @m80.k
    public static final Iterable<PathSegment> flatten(@m80.k Path path, float f11) {
        return PathUtils.flatten(path, f11);
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.5f;
        }
        return flatten(path, f11);
    }

    @m80.k
    public static final Path minus(@m80.k Path path, @m80.k Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @m80.k
    public static final Path or(@m80.k Path path, @m80.k Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @m80.k
    public static final Path plus(@m80.k Path path, @m80.k Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @m80.k
    public static final Path xor(@m80.k Path path, @m80.k Path path2) {
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
