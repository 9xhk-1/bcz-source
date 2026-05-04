package com.huawei.hms.api;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ProtocolNegotiate {
    private static final int MAX_VERSION = 2;
    private static ProtocolNegotiate instance = new ProtocolNegotiate();
    private int version = 1;

    public static ProtocolNegotiate getInstance() {
        return instance;
    }

    public int getVersion() {
        return this.version;
    }

    public int negotiate(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.version = 1;
            return 1;
        }
        if (list.contains(2)) {
            this.version = 2;
        } else {
            this.version = list.get(list.size() - 1).intValue();
        }
        return this.version;
    }
}
