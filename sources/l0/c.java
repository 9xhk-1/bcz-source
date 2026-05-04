package l0;

import android.net.Uri;
import kotlin.jvm.internal.g0;
import m80.k;
import o0.j;
import u0.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c implements b<Uri> {
    @Override // l0.b
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@k Uri uri, @k j jVar) {
        if (!g0.g(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(l.s(jVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
