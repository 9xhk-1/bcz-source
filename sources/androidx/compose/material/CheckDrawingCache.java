package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class CheckDrawingCache {

    @k
    private final Path checkPath;

    @k
    private final PathMeasure pathMeasure;

    @k
    private final Path pathToDraw;

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }

    @k
    public final Path getCheckPath() {
        return this.checkPath;
    }

    @k
    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    @k
    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public CheckDrawingCache(@k Path path, @k PathMeasure pathMeasure, @k Path path2) {
        this.checkPath = path;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = path2;
    }

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i11, v vVar) {
        this((i11 & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i11 & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i11 & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
