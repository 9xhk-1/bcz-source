package com.baicizhan.client.business.dataset.models;

import bp.a;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class CheckInfoRecord {
    public List<String> data_dns;
    public Map<String, List<String>> other_dns;
    public List<String> res_dns;

    public static CheckInfoRecord fromBBCheckInfo(final BczSystemInfos src) {
        if (src == null) {
            return null;
        }
        CheckInfoRecord checkInfoRecord = new CheckInfoRecord();
        checkInfoRecord.res_dns = src.res_dns;
        checkInfoRecord.data_dns = src.data_dns;
        checkInfoRecord.other_dns = src.other_dns;
        return checkInfoRecord;
    }

    public static BczSystemInfos fromLocal(final CheckInfoRecord src) {
        if (src == null) {
            return null;
        }
        BczSystemInfos bczSystemInfos = new BczSystemInfos();
        bczSystemInfos.res_dns = src.res_dns;
        bczSystemInfos.data_dns = src.data_dns;
        bczSystemInfos.other_dns = src.other_dns;
        return bczSystemInfos;
    }

    public String toString() {
        return new JsonSerializer(new a<CheckInfoRecord>() { // from class: com.baicizhan.client.business.dataset.models.CheckInfoRecord.1
        }.getType()).writeToJson(this);
    }
}
