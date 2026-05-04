package com.baicizhan.main.vld.bonding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class BTStatus {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ BTStatus[] $VALUES;
    public static final BTStatus NONE = new BTStatus("NONE", 0);
    public static final BTStatus CONNECTING = new BTStatus("CONNECTING", 1);
    public static final BTStatus CONNECT_FAILED = new BTStatus("CONNECT_FAILED", 2);
    public static final BTStatus CONNECT_TIMEOUT = new BTStatus("CONNECT_TIMEOUT", 3);
    public static final BTStatus FORBIDDEN = new BTStatus("FORBIDDEN", 4);
    public static final BTStatus CONNECT_SUCCEEDED = new BTStatus("CONNECT_SUCCEEDED", 5);
    public static final BTStatus CONFIGURING = new BTStatus("CONFIGURING", 6);
    public static final BTStatus CONFIGURED = new BTStatus("CONFIGURED", 7);
    public static final BTStatus CONFIGURE_FAILED = new BTStatus("CONFIGURE_FAILED", 8);
    public static final BTStatus CONFIGURE_SUCCEEDED = new BTStatus("CONFIGURE_SUCCEEDED", 9);
    public static final BTStatus CONFIGURE_TIMEOUT = new BTStatus("CONFIGURE_TIMEOUT", 10);
    public static final BTStatus ERROR = new BTStatus("ERROR", 11);
    public static final BTStatus DONE = new BTStatus("DONE", 12);

    private static final /* synthetic */ BTStatus[] $values() {
        return new BTStatus[]{NONE, CONNECTING, CONNECT_FAILED, CONNECT_TIMEOUT, FORBIDDEN, CONNECT_SUCCEEDED, CONFIGURING, CONFIGURED, CONFIGURE_FAILED, CONFIGURE_SUCCEEDED, CONFIGURE_TIMEOUT, ERROR, DONE};
    }

    static {
        BTStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private BTStatus(String str, int i11) {
    }

    @m80.k
    public static m00.a<BTStatus> getEntries() {
        return $ENTRIES;
    }

    public static BTStatus valueOf(String str) {
        return (BTStatus) Enum.valueOf(BTStatus.class, str);
    }

    public static BTStatus[] values() {
        return (BTStatus[]) $VALUES.clone();
    }
}
