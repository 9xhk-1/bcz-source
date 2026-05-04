package r00;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m extends l {
    @m80.k
    public static final h O(@m80.k File file, @m80.k FileWalkDirection direction) {
        g0.p(file, "<this>");
        g0.p(direction, "direction");
        return new h(file, direction);
    }

    public static /* synthetic */ h P(File file, FileWalkDirection fileWalkDirection, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return O(file, fileWalkDirection);
    }

    @m80.k
    public static final h Q(@m80.k File file) {
        g0.p(file, "<this>");
        return O(file, FileWalkDirection.BOTTOM_UP);
    }

    @m80.k
    public static final h R(@m80.k File file) {
        g0.p(file, "<this>");
        return O(file, FileWalkDirection.TOP_DOWN);
    }
}
