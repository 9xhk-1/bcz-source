package gw;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public File f57831a;

    public e(Context context, Uri uri) {
        if (b(context, uri)) {
            return;
        }
        throw new IllegalArgumentException("uri should start with " + a(context) + ". current is " + uri.toString());
    }

    public static String a(Context context) {
        return "content://" + context.getPackageName() + ".fileprovider";
    }

    public final boolean b(Context context, Uri uri) {
        String uri2 = uri.toString();
        String a11 = a(context);
        if (uri2.startsWith(a11 + "/share_files/")) {
            this.f57831a = new File(context.getExternalFilesDir(null), uri2.substring((a11 + "/share_files/").length()));
            return true;
        }
        if (!uri2.startsWith(a11 + "/share_cache_files/")) {
            return false;
        }
        this.f57831a = new File(context.getExternalCacheDir(), uri2.substring((a11 + "/share_cache_files/").length()));
        return true;
    }
}
