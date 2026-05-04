package coil.transform;

import c0.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a
/* loaded from: classes3.dex */
public final class PixelOpacity {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ PixelOpacity[] $VALUES;
    public static final PixelOpacity UNCHANGED = new PixelOpacity("UNCHANGED", 0);
    public static final PixelOpacity TRANSLUCENT = new PixelOpacity("TRANSLUCENT", 1);
    public static final PixelOpacity OPAQUE = new PixelOpacity("OPAQUE", 2);

    private static final /* synthetic */ PixelOpacity[] $values() {
        return new PixelOpacity[]{UNCHANGED, TRANSLUCENT, OPAQUE};
    }

    static {
        PixelOpacity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private PixelOpacity(String str, int i11) {
    }

    @k
    public static m00.a<PixelOpacity> getEntries() {
        return $ENTRIES;
    }

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) $VALUES.clone();
    }
}
