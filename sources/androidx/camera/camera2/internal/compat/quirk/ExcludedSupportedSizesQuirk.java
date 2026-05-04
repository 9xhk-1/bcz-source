package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import com.badlogic.gdx.graphics.f;
import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements Quirk {
    private static final String TAG = "ExcludedSupportedSizesQuirk";
    private static final int UNKNOWN_IMAGE_FORMAT = -1;

    @NonNull
    private List<Size> getHuaweiP20LiteExcludedSizes(@NonNull String str, int i11, @Nullable Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    @NonNull
    private List<Size> getOnePlus6ExcludedSizes(@NonNull String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    @NonNull
    private List<Size> getOnePlus6TExcludedSizes(@NonNull String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    @NonNull
    private List<Size> getRedmiNote9ProExcludedSizes(@NonNull String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    @NonNull
    private List<Size> getSamsungJ7Api27AboveExcludedSizes(@NonNull String str, int i11, @Nullable Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i11 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(f.Q0, f.Q0));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, pd.a.f80340j));
                return arrayList;
            }
            if (i11 == 35) {
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, pd.a.f80340j));
                return arrayList;
            }
        } else if (str.equals("1") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, pd.a.f80340j));
        }
        return arrayList;
    }

    @NonNull
    private List<Size> getSamsungJ7PrimeApi27AboveExcludedSizes(@NonNull String str, int i11, @Nullable Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i11 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(f.Q0, f.Q0));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, pd.a.f80340j));
                return arrayList;
            }
            if (i11 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(f.Q0, f.Q0));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, pd.a.f80340j));
                return arrayList;
            }
        } else if (str.equals("1") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, pd.a.f80340j));
        }
        return arrayList;
    }

    private static boolean isHuaweiP20Lite() {
        return SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOnePlus6() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOnePlus6T() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isRedmiNote9Pro() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isSamsungJ7Api27Above() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean load() {
        return isOnePlus6() || isOnePlus6T() || isHuaweiP20Lite() || isSamsungJ7PrimeApi27Above() || isSamsungJ7Api27Above() || isRedmiNote9Pro();
    }

    @NonNull
    public List<Size> getExcludedSizes(@NonNull String str, int i11) {
        if (isOnePlus6()) {
            return getOnePlus6ExcludedSizes(str, i11);
        }
        if (isOnePlus6T()) {
            return getOnePlus6TExcludedSizes(str, i11);
        }
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, i11, null);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, i11, null);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, i11, null);
        }
        if (isRedmiNote9Pro()) {
            return getRedmiNote9ProExcludedSizes(str, i11);
        }
        Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    @NonNull
    public List<Size> getExcludedSizes(@NonNull String str, @NonNull Class<?> cls) {
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, -1, cls);
        }
        Logger.w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }
}
