package com.baicizhan.client.business.dataset.models;

import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.online.resource_api.BookResourceUpdateInfo;
import com.baicizhan.online.user_study_api.SelectBookPlanInfo;
import com.baicizhan.online.user_study_api.UserSelectedBookInfo;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import l50.b;
import q9.x;
import x3.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BookRecord implements Serializable {
    public static Map<String, String> COLUMN_MAP = null;
    public static final int DEFAULT_REVIEW_WORD_COUNT = 0;
    public static final int DEFAULT_WORD_COUNT_PER_DAY = 10;
    public static final int DEFAULT_WORD_COUNT_PER_DAY_EXPERIENCE = 5;
    public static final int DEFAULT_WORD_COUNT_PER_DAY_PRIMARY = 5;
    public static final int ID_GaoKaoCiHui = 16;
    public static final int ID_GaoKaoCiHuiNew = 409;
    public static final int ID_GaoKaoGaoFen = 31;
    public static final int ID_INVALID = -1;
    public static final int WORDS_PLAN_THRESHOLD = 20;
    private static final long serialVersionUID = -8226546627562812675L;
    public int bookFlag;
    public int bookId;
    public String bookName;
    public int dailyCount;
    public String desc;
    public String descImage = o.f97379b;
    public String description;

    @Deprecated
    private long dueTime;
    public transient int finishCount;
    public long localBookResVer;
    public long localPosterResVer;
    public long localRadioResVer;
    public long localRoadmapVer;
    public transient int masteredCount;
    public transient long remoteBookResVer;
    public transient long remotePosterResVer;
    public transient long remoteRadioResVer;
    public transient long remoteRoadmapVer;
    public int reviewCount;
    public long updateTime;
    public int wordCount;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("bookId", "book_id");
        COLUMN_MAP.put("bookName", a.z.C0267a.f16356g);
        COLUMN_MAP.put("description", "description");
        COLUMN_MAP.put("updateTime", a.z.C0267a.f16351b);
        COLUMN_MAP.put("wordCount", a.z.C0267a.f16355f);
        COLUMN_MAP.put("dueTime", a.z.C0267a.f16352c);
        COLUMN_MAP.put("dailyCount", "daily_count");
        COLUMN_MAP.put("reviewCount", "review_count");
        COLUMN_MAP.put("localBookResVer", a.z.C0267a.f16357h);
        COLUMN_MAP.put("localRoadmapVer", a.z.C0267a.f16360k);
        COLUMN_MAP.put("localRadioResVer", a.z.C0267a.f16359j);
        COLUMN_MAP.put("localPosterResVer", a.z.C0267a.f16361l);
        COLUMN_MAP.put(SocialConstants.PARAM_APP_DESC, "book_desc");
        COLUMN_MAP.put("descImage", "book_desc_img");
        COLUMN_MAP.put("bookFlag", a.z.C0267a.f16364o);
    }

    private void adjustReviewCount() {
        int i11 = this.reviewCount;
        int i12 = this.wordCount;
        if (i11 > i12) {
            i11 = i12;
        }
        this.reviewCount = i11;
    }

    public static int computeDaysByWords(int totalCount, int wordCount) {
        return ((totalCount + wordCount) - 1) / wordCount;
    }

    public void clearSelectedInfo() {
        this.dailyCount = 0;
        this.dueTime = 0L;
        this.finishCount = 0;
    }

    public void dailyCountFix() {
        if (this.dailyCount <= 0 && this.dueTime > 0) {
            this.dailyCount = 15;
        }
        adjustReviewCount();
    }

    public boolean equals(Object o11) {
        return o11 != null && (o11 instanceof BookRecord) && this.bookId == ((BookRecord) o11).bookId;
    }

    public int getRemainCount() {
        LearnRecordManager A = LearnRecordManager.A();
        x r11 = x.r();
        return (this.bookId == A.z() && this.bookId == r11.l() && r11.A() > 0) ? A.F() : this.wordCount - this.finishCount;
    }

    public int getRemainCountNotIncludeToday() {
        LearnRecordManager A = LearnRecordManager.A();
        x r11 = x.r();
        return (this.bookId == A.z() && this.bookId == r11.l() && r11.A() > 0) ? A.E() : this.wordCount - this.finishCount;
    }

    public boolean isFinished() {
        LearnRecordManager A = LearnRecordManager.A();
        x r11 = x.r();
        return this.wordCount > 0 && ((this.bookId != A.z() || this.bookId != r11.l() || r11.A() <= 0) ? this.wordCount - this.finishCount : A.E()) <= 0;
    }

    public boolean isSelected() {
        if (this.wordCount > 0) {
            return this.dailyCount > 0 || isFinished();
        }
        return false;
    }

    public String toString() {
        return "BookRecord{bookId=" + this.bookId + ", bookName='" + this.bookName + "', description='" + this.description + "', updateTime=" + this.updateTime + ", wordCount=" + this.wordCount + ", dueTime=" + this.dueTime + ", dailyCount=" + this.dailyCount + ", reviewCount=" + this.reviewCount + ", localBookResVer=" + this.localBookResVer + ", localRoadmapVer=" + this.localRoadmapVer + ", localRadioResVer=" + this.localRadioResVer + ", localPosterResVer=" + this.localPosterResVer + ", finishCount=" + this.finishCount + ", remoteBookResVer=" + this.remoteBookResVer + ", remoteRoadmapVer=" + this.remoteRoadmapVer + ", remoteRadioResVer=" + this.remoteRadioResVer + ", desc=" + this.desc + ", descImage=" + this.descImage + ", bookFlag=" + this.bookFlag + b.f69928j;
    }

    public void updateCurrentBookInfo(ScheduleRecord learninfo) {
        this.bookId = learninfo.bookId;
        this.bookName = learninfo.bookName;
        this.dailyCount = learninfo.dailyCount;
        this.reviewCount = learninfo.reviewCount;
        this.finishCount = learninfo.finishedCount;
    }

    public void updateRemoteInfo(BookRecord exist) {
        this.remoteRoadmapVer = exist.remoteRoadmapVer;
        this.remoteRadioResVer = exist.remoteRadioResVer;
        this.remotePosterResVer = exist.remotePosterResVer;
        this.remoteBookResVer = exist.remoteBookResVer;
    }

    public void updateSelectedInfo(UserSelectedBookInfo info) {
        this.dailyCount = info.getDaily_plan_count();
        this.finishCount = info.getLearned_words_count();
        this.remoteRoadmapVer = info.getRoadmap_version();
        this.remoteRadioResVer = info.getWord_fm_updated_at();
        this.remotePosterResVer = info.getPoster_updated_at();
        this.reviewCount = info.getReview_plan_count();
        this.dueTime = info.getSelected_end_time();
        dailyCountFix();
    }

    public void updateSelectedInfo(SelectBookPlanInfo info) {
        this.dailyCount = info.getDaily_plan_count();
        this.finishCount = info.getLearned_words_count();
        this.reviewCount = info.getReview_plan_count();
        this.masteredCount = info.getMastered();
        dailyCountFix();
    }

    public void updateSelectedInfo(BookResourceUpdateInfo info) {
        this.remoteRoadmapVer = info.roadmap_version;
        this.remoteRadioResVer = info.word_fm_updated_at;
        this.remotePosterResVer = info.poster_updated_at;
        this.remoteBookResVer = info.zpk_updated_at;
    }
}
