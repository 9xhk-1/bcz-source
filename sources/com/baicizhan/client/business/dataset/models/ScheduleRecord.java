package com.baicizhan.client.business.dataset.models;

import com.baicizhan.client.business.dataset.provider.a;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ScheduleRecord {
    public static Map<String, String> COLUMN_MAP;
    public int bookId;
    public String bookName;
    public transient boolean completeReviewMode;
    public int dailyCount;
    public int dakaDays;
    public String desc;
    public String descImage;
    public int finishedCount;
    public int isCurrentSelect;
    public long lastDakaTime;
    public long localSyncVer;
    public transient long remoteSyncVer;
    public int reviewCount;
    public transient int todayMaxCombo;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("bookId", "book_id");
        COLUMN_MAP.put("isCurrentSelect", a.y.C0266a.f16337c);
        COLUMN_MAP.put("finishCount", a.y.C0266a.f16336b);
        COLUMN_MAP.put("localSyncVer", "sync_state");
        COLUMN_MAP.put("dakaDays", a.y.C0266a.f16339e);
        COLUMN_MAP.put("lastDakaTime", a.y.C0266a.f16340f);
        COLUMN_MAP.put("bookName", "book_name");
        COLUMN_MAP.put("dailyCount", "daily_count");
        COLUMN_MAP.put("reviewCount", "review_count");
        COLUMN_MAP.put(SocialConstants.PARAM_APP_DESC, "book_desc");
        COLUMN_MAP.put("descImage", "book_desc_img");
    }

    public String toString() {
        return "ScheduleRecord{bookId=" + this.bookId + ", isCurrentSelect=" + this.isCurrentSelect + ", finishedCount=" + this.finishedCount + ", localSyncVer=" + this.localSyncVer + ", lastDakaTime=" + this.lastDakaTime + ", dakaDays=" + this.dakaDays + ", bookName=" + this.bookName + ", dailyCount=" + this.dailyCount + ", reviewCount=" + this.reviewCount + ", todayMaxCombo=" + this.todayMaxCombo + ", remoteSyncVer=" + this.remoteSyncVer + ", completeReviewMode=" + this.completeReviewMode + ", desc=" + this.desc + ", descImage=" + this.descImage + b.f69928j;
    }
}
