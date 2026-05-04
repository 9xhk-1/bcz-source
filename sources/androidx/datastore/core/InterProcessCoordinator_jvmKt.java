package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InterProcessCoordinator_jvmKt {
    @k
    public static final InterProcessCoordinator createSingleProcessCoordinator(@k File file) {
        g0.p(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        g0.o(absolutePath, "file.canonicalFile.absolutePath");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
