package kotlin.io.path;

import m00.a;
import m00.c;
import m80.k;
import t00.n;
import yz.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.8")
@n
/* loaded from: classes8.dex */
public final class OnErrorResult {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OnErrorResult[] $VALUES;
    public static final OnErrorResult SKIP_SUBTREE = new OnErrorResult("SKIP_SUBTREE", 0);
    public static final OnErrorResult TERMINATE = new OnErrorResult("TERMINATE", 1);

    private static final /* synthetic */ OnErrorResult[] $values() {
        return new OnErrorResult[]{SKIP_SUBTREE, TERMINATE};
    }

    static {
        OnErrorResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private OnErrorResult(String str, int i11) {
    }

    @k
    public static a<OnErrorResult> getEntries() {
        return $ENTRIES;
    }

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) $VALUES.clone();
    }
}
