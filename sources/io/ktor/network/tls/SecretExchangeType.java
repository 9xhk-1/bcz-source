package io.ktor.network.tls;

import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class SecretExchangeType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ SecretExchangeType[] $VALUES;
    public static final SecretExchangeType ECDHE = new SecretExchangeType("ECDHE", 0, "ECDHE_ECDSA");
    public static final SecretExchangeType RSA = new SecretExchangeType("RSA", 1, "RSA");

    @k
    private final String jvmName;

    private static final /* synthetic */ SecretExchangeType[] $values() {
        return new SecretExchangeType[]{ECDHE, RSA};
    }

    static {
        SecretExchangeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private SecretExchangeType(String str, int i11, String str2) {
        this.jvmName = str2;
    }

    @k
    public static m00.a<SecretExchangeType> getEntries() {
        return $ENTRIES;
    }

    public static SecretExchangeType valueOf(String str) {
        return (SecretExchangeType) Enum.valueOf(SecretExchangeType.class, str);
    }

    public static SecretExchangeType[] values() {
        return (SecretExchangeType[]) $VALUES.clone();
    }

    @k
    public final String getJvmName() {
        return this.jvmName;
    }
}
