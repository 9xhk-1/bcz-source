package androidx.compose.foundation.text.selection;

import m80.k;
import org.apache.http.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DownResolution {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ DownResolution[] $VALUES;
    public static final DownResolution Up = new DownResolution("Up", 0);
    public static final DownResolution Drag = new DownResolution("Drag", 1);
    public static final DownResolution Timeout = new DownResolution(m.U, 2);
    public static final DownResolution Cancel = new DownResolution("Cancel", 3);

    private static final /* synthetic */ DownResolution[] $values() {
        return new DownResolution[]{Up, Drag, Timeout, Cancel};
    }

    static {
        DownResolution[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private DownResolution(String str, int i11) {
    }

    @k
    public static m00.a<DownResolution> getEntries() {
        return $ENTRIES;
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) $VALUES.clone();
    }
}
