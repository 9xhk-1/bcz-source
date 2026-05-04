package ga0;

import ba0.c2;
import ba0.e4;
import java.net.URI;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m {
    public static URI a(URI uri) {
        c2.r(uri, "URI must not be null");
        if (e4.g(uri.getQuery())) {
            return uri;
        }
        String uri2 = uri.toString();
        return URI.create(uri2.substring(0, uri2.indexOf(63)));
    }
}
