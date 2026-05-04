package io.ktor.network.tls.extensions;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class PointFormat {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ PointFormat[] $VALUES;
    private final byte code;
    public static final PointFormat UNCOMPRESSED = new PointFormat("UNCOMPRESSED", 0, (byte) 0);
    public static final PointFormat ANSIX962_COMPRESSED_PRIME = new PointFormat("ANSIX962_COMPRESSED_PRIME", 1, (byte) 1);
    public static final PointFormat ANSIX962_COMPRESSED_CHAR2 = new PointFormat("ANSIX962_COMPRESSED_CHAR2", 2, (byte) 2);

    private static final /* synthetic */ PointFormat[] $values() {
        return new PointFormat[]{UNCOMPRESSED, ANSIX962_COMPRESSED_PRIME, ANSIX962_COMPRESSED_CHAR2};
    }

    static {
        PointFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private PointFormat(String str, int i11, byte b11) {
        this.code = b11;
    }

    @k
    public static m00.a<PointFormat> getEntries() {
        return $ENTRIES;
    }

    public static PointFormat valueOf(String str) {
        return (PointFormat) Enum.valueOf(PointFormat.class, str);
    }

    public static PointFormat[] values() {
        return (PointFormat[]) $VALUES.clone();
    }

    public final byte getCode() {
        return this.code;
    }
}
