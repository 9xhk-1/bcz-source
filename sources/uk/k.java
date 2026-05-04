package uk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fl.m;
import java.util.List;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k implements ik.f<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final ik.d<Resources.Theme> f92271b = ik.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: c, reason: collision with root package name */
    public static final String f92272c = "android";

    /* renamed from: d, reason: collision with root package name */
    public static final int f92273d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f92274e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f92275f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f92276g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f92277h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f92278i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f92279a;

    public k(Context context) {
        this.f92279a = context.getApplicationContext();
    }

    @Override // ik.f
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<Drawable> a(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d11 = d(uri, authority);
            int g11 = g(d11, uri);
            Resources.Theme theme = ((String) m.e(authority)).equals(this.f92279a.getPackageName()) ? (Resources.Theme) eVar.c(f92271b) : null;
            return j.c(theme == null ? g.b(this.f92279a, d11, g11) : g.a(this.f92279a, g11, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @NonNull
    public final Context d(Uri uri, @NonNull String str) {
        if (str.equals(this.f92279a.getPackageName())) {
            return this.f92279a;
        }
        try {
            return this.f92279a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            if (str.contains(this.f92279a.getPackageName())) {
                return this.f92279a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e11);
        }
    }

    @DrawableRes
    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
        }
    }

    @DrawableRes
    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // ik.f
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull ik.e eVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
