package androidx.compose.ui.input.pointer;

import com.squareup.picasso.h0;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PointerEventPass {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ PointerEventPass[] $VALUES;
    public static final PointerEventPass Initial = new PointerEventPass("Initial", 0);
    public static final PointerEventPass Main = new PointerEventPass(h0.f41868j, 1);
    public static final PointerEventPass Final = new PointerEventPass("Final", 2);

    private static final /* synthetic */ PointerEventPass[] $values() {
        return new PointerEventPass[]{Initial, Main, Final};
    }

    static {
        PointerEventPass[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private PointerEventPass(String str, int i11) {
    }

    @k
    public static m00.a<PointerEventPass> getEntries() {
        return $ENTRIES;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }
}
