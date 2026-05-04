package coil.request;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class CachePolicy {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ CachePolicy[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final CachePolicy ENABLED = new CachePolicy("ENABLED", 0, true, true);
    public static final CachePolicy READ_ONLY = new CachePolicy("READ_ONLY", 1, true, false);
    public static final CachePolicy WRITE_ONLY = new CachePolicy("WRITE_ONLY", 2, false, true);
    public static final CachePolicy DISABLED = new CachePolicy("DISABLED", 3, false, false);

    private static final /* synthetic */ CachePolicy[] $values() {
        return new CachePolicy[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    static {
        CachePolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private CachePolicy(String str, int i11, boolean z11, boolean z12) {
        this.readEnabled = z11;
        this.writeEnabled = z12;
    }

    @k
    public static m00.a<CachePolicy> getEntries() {
        return $ENTRIES;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) $VALUES.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
