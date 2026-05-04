package com.baicizhan.client.business.dataset.models;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class OfflineStateRecord {
    public static final Map<String, String> COLUMN_MAP;
    public int bookId;
    public int comboCount;
    public int maxComboCount;
    public long runTime;
    public int wantMoreCount;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("bookId", "book_id");
        hashMap.put("runTime", a.l.C0253a.f16236b);
        hashMap.put("wantMoreCount", a.l.C0253a.f16237c);
        hashMap.put("comboCount", a.l.C0253a.f16238d);
        hashMap.put("maxComboCount", a.l.C0253a.f16239e);
    }

    public String toString() {
        return "OfflineStateRecord [bookId=" + this.bookId + ", runTime=" + this.runTime + ", wantMoreCount=" + this.wantMoreCount + ", comboCount=" + this.comboCount + ", maxComboCount=" + this.maxComboCount + "]";
    }
}
