package androidx.compose.ui.layout;

import m00.a;
import m80.k;
import qo.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class IntrinsicWidthHeight {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES;
    public static final IntrinsicWidthHeight Width = new IntrinsicWidthHeight(c.f82447v1, 0);
    public static final IntrinsicWidthHeight Height = new IntrinsicWidthHeight("Height", 1);

    private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
        return new IntrinsicWidthHeight[]{Width, Height};
    }

    static {
        IntrinsicWidthHeight[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private IntrinsicWidthHeight(String str, int i11) {
    }

    @k
    public static a<IntrinsicWidthHeight> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) $VALUES.clone();
    }
}
