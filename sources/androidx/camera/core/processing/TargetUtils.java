package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(@NonNull Collection<Integer> collection, int i11) {
        Preconditions.checkArgument(collection.contains(Integer.valueOf(i11)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", getHumanReadableName(i11), getHumanReadableNames(collection)));
    }

    @NonNull
    public static String getHumanReadableName(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i11 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return androidx.camera.core.impl.u.a(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, arrayList);
    }

    @NonNull
    private static String getHumanReadableNames(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        return "[" + androidx.camera.core.impl.u.a(j2.O, arrayList) + "]";
    }

    public static int getNumberOfTargets(int i11) {
        int i12 = 0;
        while (i11 != 0) {
            i12 += i11 & 1;
            i11 >>= 1;
        }
        return i12;
    }

    public static boolean isSuperset(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
