package m0;

import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import o0.j;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResourceUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,34:1\n1#2:35\n29#3:36\n*S KotlinDebug\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n*L\n25#1:36\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements d<Uri, Uri> {
    private final boolean b(Uri uri) {
        String authority;
        return g0.g(uri.getScheme(), "android.resource") && (authority = uri.getAuthority()) != null && !k0.O3(authority) && uri.getPathSegments().size() == 2;
    }

    @Override // m0.d
    @l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(@k Uri uri, @k j jVar) {
        if (!b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = jVar.g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        return Uri.parse("android.resource://" + authority + '/' + identifier);
    }
}
