package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.g;
import w00.o;
import yz.n;
import yz.w0;
import zz.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BuildCompat {

    @ChecksSdkIntAtLeast(extension = 1000000)
    @g
    public static final int AD_SERVICES_EXTENSION_INT;

    @k
    public static final BuildCompat INSTANCE = new BuildCompat();

    @ChecksSdkIntAtLeast(extension = 30)
    @g
    public static final int R_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 31)
    @g
    public static final int S_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 33)
    @g
    public static final int T_EXTENSION_INT;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static final class Api30Impl {

        @k
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final int getExtensionVersion(int i11) {
            return SdkExtensions.getExtensionVersion(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c(AnnotationRetention.BINARY)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i11 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = i11 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = i11 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = i11 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(1000000) : 0;
    }

    private BuildCompat() {
    }

    @ChecksSdkIntAtLeast(api = 24)
    @o
    @n(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    public static final boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @o
    @n(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @o
    @n(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @o
    @n(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @o
    @n(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static final boolean isAtLeastPreReleaseCodename(@k String codename, @k String buildCodename) {
        g0.p(codename, "codename");
        g0.p(buildCodename, "buildCodename");
        if (g0.g("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        g0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        g0.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @o
    @n(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @o
    @n(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = ExifInterface.LATITUDE_SOUTH)
    @o
    @n(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    public static final boolean isAtLeastS() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            return true;
        }
        if (i11 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        g0.o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @o
    @n(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    public static final boolean isAtLeastSv2() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 32) {
            return true;
        }
        if (i11 < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        g0.o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Sv2", CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @o
    @n(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    public static final boolean isAtLeastT() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return true;
        }
        if (i11 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        g0.o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Tiramisu", CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    @o
    @n(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @w0(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    public static final boolean isAtLeastU() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            return true;
        }
        if (i11 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        g0.o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME);
    }

    @ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    @o
    @PrereleaseSdkCheck
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        g0.o(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME);
    }
}
