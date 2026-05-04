package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ConnectResp implements IMessageEntity {

    @Packed
    public List<Integer> protocolVersion = Arrays.asList(1, 2);

    @Packed
    public String sessionId;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("protocol version:");
        Iterator<Integer> it = this.protocolVersion.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(',');
        }
        return sb2.toString();
    }
}
