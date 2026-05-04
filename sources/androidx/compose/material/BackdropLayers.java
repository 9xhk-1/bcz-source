package androidx.compose.material;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BackdropLayers {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BackdropLayers[] $VALUES;
    public static final BackdropLayers Back = new BackdropLayers("Back", 0);
    public static final BackdropLayers Front = new BackdropLayers("Front", 1);

    private static final /* synthetic */ BackdropLayers[] $values() {
        return new BackdropLayers[]{Back, Front};
    }

    static {
        BackdropLayers[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private BackdropLayers(String str, int i11) {
    }

    @k
    public static a<BackdropLayers> getEntries() {
        return $ENTRIES;
    }

    public static BackdropLayers valueOf(String str) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, str);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) $VALUES.clone();
    }
}
