package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(@k File file, @k File toFile) {
        g0.p(file, "<this>");
        g0.p(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.INSTANCE.move(file, toFile) : file.renameTo(toFile);
    }
}
