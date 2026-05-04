package jk;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresExtension;
import en.r;
import ix.l1;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f64277a = 17;

    /* renamed from: b, reason: collision with root package name */
    public static final int f64278b = 512;

    /* renamed from: c, reason: collision with root package name */
    public static final int f64279c = 384;

    public static boolean a(Uri uri) {
        return d(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean b(Uri uri) {
        return d(uri) && !g(uri);
    }

    @ChecksSdkIntAtLeast(api = 17, extension = 30)
    public static boolean c() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        return extensionVersion >= 17;
    }

    public static boolean d(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && l1.a.f62928f.equals(uri.getAuthority());
    }

    public static boolean e(Uri uri) {
        return d(uri) && g(uri);
    }

    public static boolean f(int i11, int i12) {
        return i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && i11 <= 512 && i12 <= 384;
    }

    public static boolean g(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    @RequiresExtension(extension = 30, version = 17)
    public static AssetFileDescriptor h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return MediaStore.openAssetFileDescriptor(contentResolver, uri, r.f50027a, null);
    }
}
