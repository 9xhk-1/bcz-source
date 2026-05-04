package io.ktor.http;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class RangeUnits {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RangeUnits[] $VALUES;
    public static final RangeUnits Bytes = new RangeUnits("Bytes", 0, "bytes");
    public static final RangeUnits None = new RangeUnits("None", 1, "none");

    @k
    private final String unitToken;

    private static final /* synthetic */ RangeUnits[] $values() {
        return new RangeUnits[]{Bytes, None};
    }

    static {
        RangeUnits[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private RangeUnits(String str, int i11, String str2) {
        this.unitToken = str2;
    }

    @k
    public static a<RangeUnits> getEntries() {
        return $ENTRIES;
    }

    public static RangeUnits valueOf(String str) {
        return (RangeUnits) Enum.valueOf(RangeUnits.class, str);
    }

    public static RangeUnits[] values() {
        return (RangeUnits[]) $VALUES.clone();
    }

    @k
    public final String getUnitToken() {
        return this.unitToken;
    }
}
