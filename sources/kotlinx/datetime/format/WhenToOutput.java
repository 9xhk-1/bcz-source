package kotlinx.datetime.format;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class WhenToOutput {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WhenToOutput[] $VALUES;
    public static final WhenToOutput NEVER = new WhenToOutput("NEVER", 0);
    public static final WhenToOutput IF_NONZERO = new WhenToOutput("IF_NONZERO", 1);
    public static final WhenToOutput ALWAYS = new WhenToOutput("ALWAYS", 2);

    private static final /* synthetic */ WhenToOutput[] $values() {
        return new WhenToOutput[]{NEVER, IF_NONZERO, ALWAYS};
    }

    static {
        WhenToOutput[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private WhenToOutput(String str, int i11) {
    }

    @k
    public static a<WhenToOutput> getEntries() {
        return $ENTRIES;
    }

    public static WhenToOutput valueOf(String str) {
        return (WhenToOutput) Enum.valueOf(WhenToOutput.class, str);
    }

    public static WhenToOutput[] values() {
        return (WhenToOutput[]) $VALUES.clone();
    }
}
