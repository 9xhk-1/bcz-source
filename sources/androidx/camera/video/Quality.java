package androidx.camera.video;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class Quality {
    public static final Quality FHD;
    public static final Quality HD;
    public static final Quality HIGHEST;
    public static final Quality LOWEST;
    static final Quality NONE;
    private static final Set<Quality> QUALITIES;
    private static final List<Quality> QUALITIES_ORDER_BY_SIZE;
    public static final Quality SD;
    public static final Quality UHD;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @eo.c
    public static abstract class ConstantQuality extends Quality {
        public ConstantQuality() {
            super();
        }

        @NonNull
        public static ConstantQuality of(int i11, @NonNull String str, @NonNull List<Size> list) {
            return new AutoValue_Quality_ConstantQuality(i11, str, list);
        }

        @NonNull
        public abstract String getName();

        @NonNull
        public abstract List<Size> getTypicalSizes();

        public abstract int getValue();
    }

    static {
        ConstantQuality of2 = ConstantQuality.of(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        SD = of2;
        ConstantQuality of3 = ConstantQuality.of(5, "HD", Collections.singletonList(new Size(1280, 720)));
        HD = of3;
        ConstantQuality of4 = ConstantQuality.of(6, "FHD", Collections.singletonList(new Size(1920, pd.a.f80340j)));
        FHD = of4;
        ConstantQuality of5 = ConstantQuality.of(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        UHD = of5;
        List list = Collections.EMPTY_LIST;
        ConstantQuality of6 = ConstantQuality.of(0, "LOWEST", list);
        LOWEST = of6;
        ConstantQuality of7 = ConstantQuality.of(1, "HIGHEST", list);
        HIGHEST = of7;
        NONE = ConstantQuality.of(-1, "NONE", list);
        QUALITIES = new HashSet(Arrays.asList(of6, of7, of2, of3, of4, of5));
        QUALITIES_ORDER_BY_SIZE = Arrays.asList(of5, of4, of3, of2);
    }

    public static boolean containsQuality(@NonNull Quality quality) {
        return QUALITIES.contains(quality);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static List<Quality> getSortedQualities() {
        return new ArrayList(QUALITIES_ORDER_BY_SIZE);
    }

    private Quality() {
    }
}
