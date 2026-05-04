package io.ktor.network.tls;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CipherType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ CipherType[] $VALUES;
    public static final CipherType GCM = new CipherType(pr.b.f81166d, 0);
    public static final CipherType CBC = new CipherType(pr.a.f81159d, 1);

    private static final /* synthetic */ CipherType[] $values() {
        return new CipherType[]{GCM, CBC};
    }

    static {
        CipherType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private CipherType(String str, int i11) {
    }

    @k
    public static m00.a<CipherType> getEntries() {
        return $ENTRIES;
    }

    public static CipherType valueOf(String str) {
        return (CipherType) Enum.valueOf(CipherType.class, str);
    }

    public static CipherType[] values() {
        return (CipherType[]) $VALUES.clone();
    }
}
