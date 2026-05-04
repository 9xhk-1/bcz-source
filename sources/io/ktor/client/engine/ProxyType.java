package io.ktor.client.engine;

import m00.a;
import m00.c;
import m80.k;
import org.apache.http.HttpVersion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ProxyType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProxyType[] $VALUES;
    public static final ProxyType SOCKS = new ProxyType("SOCKS", 0);
    public static final ProxyType HTTP = new ProxyType(HttpVersion.HTTP, 1);
    public static final ProxyType UNKNOWN = new ProxyType("UNKNOWN", 2);

    private static final /* synthetic */ ProxyType[] $values() {
        return new ProxyType[]{SOCKS, HTTP, UNKNOWN};
    }

    static {
        ProxyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ProxyType(String str, int i11) {
    }

    @k
    public static a<ProxyType> getEntries() {
        return $ENTRIES;
    }

    public static ProxyType valueOf(String str) {
        return (ProxyType) Enum.valueOf(ProxyType.class, str);
    }

    public static ProxyType[] values() {
        return (ProxyType[]) $VALUES.clone();
    }
}
