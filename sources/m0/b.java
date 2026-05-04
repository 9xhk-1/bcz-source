package m0;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import o0.j;
import u0.l;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFileUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUriMapper.kt\ncoil/map/FileUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements d<Uri, File> {
    public final boolean b(Uri uri) {
        String scheme;
        if (!l.z(uri) && ((scheme = uri.getScheme()) == null || g0.g(scheme, "file"))) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            if (k0.A5(path, '/', false, 2, null) && l.n(uri) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // m0.d
    @m80.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(@k Uri uri, @k j jVar) {
        if (!b(uri)) {
            return null;
        }
        if (!g0.g(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
