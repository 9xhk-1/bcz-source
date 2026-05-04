package io.ktor.network.tls.certificates;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class KeyType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KeyType[] $VALUES;
    public static final KeyType CA = new KeyType("CA", 0);
    public static final KeyType Server = new KeyType("Server", 1);
    public static final KeyType Client = new KeyType("Client", 2);

    private static final /* synthetic */ KeyType[] $values() {
        return new KeyType[]{CA, Server, Client};
    }

    static {
        KeyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private KeyType(String str, int i11) {
    }

    @k
    public static a<KeyType> getEntries() {
        return $ENTRIES;
    }

    public static KeyType valueOf(String str) {
        return (KeyType) Enum.valueOf(KeyType.class, str);
    }

    public static KeyType[] values() {
        return (KeyType[]) $VALUES.clone();
    }
}
