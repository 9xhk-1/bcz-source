package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/* loaded from: classes2.dex */
public final class UriKt {
    @k
    public static final File toFile(@k Uri uri) {
        if (!g0.g(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @k
    public static final Uri toUri(@k String str) {
        return Uri.parse(str);
    }

    @k
    public static final Uri toUri(@k File file) {
        return Uri.fromFile(file);
    }
}
