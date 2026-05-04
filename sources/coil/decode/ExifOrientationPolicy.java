package coil.decode;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ExifOrientationPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ExifOrientationPolicy[] $VALUES;
    public static final ExifOrientationPolicy IGNORE = new ExifOrientationPolicy("IGNORE", 0);
    public static final ExifOrientationPolicy RESPECT_PERFORMANCE = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
    public static final ExifOrientationPolicy RESPECT_ALL = new ExifOrientationPolicy("RESPECT_ALL", 2);

    private static final /* synthetic */ ExifOrientationPolicy[] $values() {
        return new ExifOrientationPolicy[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    static {
        ExifOrientationPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ExifOrientationPolicy(String str, int i11) {
    }

    @k
    public static a<ExifOrientationPolicy> getEntries() {
        return $ENTRIES;
    }

    public static ExifOrientationPolicy valueOf(String str) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, str);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) $VALUES.clone();
    }
}
