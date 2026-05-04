package androidx.datastore.core;

import java.io.File;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "MultiProcessCoordinatorKt")
/* loaded from: classes2.dex */
public final class MultiProcessCoordinatorKt {
    @k
    public static final InterProcessCoordinator createMultiProcessCoordinator(@k d context, @k File file) {
        g0.p(context, "context");
        g0.p(file, "file");
        return new MultiProcessCoordinator(context, file);
    }
}
