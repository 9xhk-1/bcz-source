package androidx.compose.runtime;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class InvalidationResult {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ InvalidationResult[] $VALUES;
    public static final InvalidationResult IGNORED = new InvalidationResult("IGNORED", 0);
    public static final InvalidationResult SCHEDULED = new InvalidationResult("SCHEDULED", 1);
    public static final InvalidationResult DEFERRED = new InvalidationResult("DEFERRED", 2);
    public static final InvalidationResult IMMINENT = new InvalidationResult("IMMINENT", 3);

    private static final /* synthetic */ InvalidationResult[] $values() {
        return new InvalidationResult[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    static {
        InvalidationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private InvalidationResult(String str, int i11) {
    }

    @k
    public static m00.a<InvalidationResult> getEntries() {
        return $ENTRIES;
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) $VALUES.clone();
    }
}
