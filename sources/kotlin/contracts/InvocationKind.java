package kotlin.contracts;

import i00.f;
import m00.a;
import m00.c;
import m80.k;
import o00.b;
import yz.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@f
@b
/* loaded from: classes8.dex */
public final class InvocationKind {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InvocationKind[] $VALUES;

    @b
    public static final InvocationKind AT_MOST_ONCE = new InvocationKind("AT_MOST_ONCE", 0);

    @b
    public static final InvocationKind AT_LEAST_ONCE = new InvocationKind("AT_LEAST_ONCE", 1);

    @b
    public static final InvocationKind EXACTLY_ONCE = new InvocationKind("EXACTLY_ONCE", 2);

    @b
    public static final InvocationKind UNKNOWN = new InvocationKind("UNKNOWN", 3);

    private static final /* synthetic */ InvocationKind[] $values() {
        return new InvocationKind[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    static {
        InvocationKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private InvocationKind(String str, int i11) {
    }

    @k
    public static a<InvocationKind> getEntries() {
        return $ENTRIES;
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) $VALUES.clone();
    }
}
