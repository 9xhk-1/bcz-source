package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.jvm.internal.g0;
import m80.k;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class OkioStorageKt {
    @k
    public static final InterProcessCoordinator createSingleProcessCoordinator(@k f path) {
        g0.p(path, "path");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(path.s().toString());
    }
}
