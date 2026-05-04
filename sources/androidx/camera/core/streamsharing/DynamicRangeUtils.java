package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DynamicRangeUtils {
    private DynamicRangeUtils() {
    }

    @Nullable
    private static DynamicRange intersectDynamicRange(@NonNull List<DynamicRange> list) {
        if (list.isEmpty()) {
            return null;
        }
        DynamicRange dynamicRange = list.get(0);
        Integer valueOf = Integer.valueOf(dynamicRange.getEncoding());
        Integer valueOf2 = Integer.valueOf(dynamicRange.getBitDepth());
        for (int i11 = 1; i11 < list.size(); i11++) {
            DynamicRange dynamicRange2 = list.get(i11);
            valueOf = intersectDynamicRangeEncoding(valueOf, Integer.valueOf(dynamicRange2.getEncoding()));
            valueOf2 = intersectDynamicRangeBitDepth(valueOf2, Integer.valueOf(dynamicRange2.getBitDepth()));
            if (valueOf == null || valueOf2 == null) {
                return null;
            }
        }
        return new DynamicRange(valueOf.intValue(), valueOf2.intValue());
    }

    @Nullable
    private static Integer intersectDynamicRangeBitDepth(@NonNull Integer num, @NonNull Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    @Nullable
    private static Integer intersectDynamicRangeEncoding(@NonNull Integer num, @NonNull Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    @Nullable
    public static DynamicRange resolveDynamicRange(@NonNull Set<UseCaseConfig<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getDynamicRange());
        }
        return intersectDynamicRange(arrayList);
    }
}
