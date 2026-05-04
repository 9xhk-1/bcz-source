package com.baicizhan.client.business.dataset.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;
import k9.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TopicLearnRecord implements Parcelable {
    public static final Parcelable.Creator<TopicLearnRecord> CREATOR;
    public static final int SCORE_DEFUALT_KILLED = -1;
    public static final int SCORE_UNTOUCH = -1024;
    public static final int SKIPPED_FM = 1;
    public static final int SKIPPED_TV = 2;
    public static final int SYNCED = 1;
    public static final int UNSYNC = 0;
    public long createAt;
    public int doNum;
    public int errNum;
    public Extra extra = new Extra();
    public int isTodayNew;
    public long lastDoTime;
    public int radioPostState;
    public int radioSkipState;
    public int radioState;
    public int radioTVState;
    public int reviewRound;
    public long syncState;
    public int tagId;
    public int topicDay;
    public int topicId;
    public int topicScore;
    public long totalTime;
    public int zijianState;
    public static Map<String, String> TOTAL_TABLE_COLUMN_MAP = new HashMap();
    public static Map<String, String> SYNCING_TABLE_COLUMN_MAP = new HashMap();
    public static Map<String, String> MEDIA_SYNC_COLUMN_MAP = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Extra implements b {

        /* renamed from: ls, reason: collision with root package name */
        public int f16072ls;

        /* renamed from: ms, reason: collision with root package name */
        public int f16073ms;
        public boolean reviewedMore = false;

        /* renamed from: ss, reason: collision with root package name */
        public int f16074ss;

        public String toString() {
            return "Extra{ls=" + this.f16072ls + ", ss=" + this.f16074ss + ", ms=" + this.f16073ms + ", reviewedMore=" + this.reviewedMore + l50.b.f69928j;
        }
    }

    static {
        TOTAL_TABLE_COLUMN_MAP.put("topicId", "topic_id");
        TOTAL_TABLE_COLUMN_MAP.put("topicScore", "topic_obn");
        TOTAL_TABLE_COLUMN_MAP.put("topicDay", "topic_day");
        TOTAL_TABLE_COLUMN_MAP.put("totalTime", "total_time");
        TOTAL_TABLE_COLUMN_MAP.put("doNum", "do_num");
        TOTAL_TABLE_COLUMN_MAP.put("errNum", "err_num");
        TOTAL_TABLE_COLUMN_MAP.put("syncState", "sync_state");
        TOTAL_TABLE_COLUMN_MAP.put("lastDoTime", "last_do_time");
        TOTAL_TABLE_COLUMN_MAP.put("isTodayNew", "is_today_new");
        TOTAL_TABLE_COLUMN_MAP.put("createAt", "create_at");
        TOTAL_TABLE_COLUMN_MAP.put("extra", "extra");
        TOTAL_TABLE_COLUMN_MAP.put("reviewRound", "review_round");
        SYNCING_TABLE_COLUMN_MAP.put("topicId", "topic_id");
        SYNCING_TABLE_COLUMN_MAP.put("topicScore", "topic_obn");
        SYNCING_TABLE_COLUMN_MAP.put("topicDay", "topic_day");
        SYNCING_TABLE_COLUMN_MAP.put("totalTime", "total_time");
        SYNCING_TABLE_COLUMN_MAP.put("doNum", "do_num");
        SYNCING_TABLE_COLUMN_MAP.put("errNum", "err_num");
        SYNCING_TABLE_COLUMN_MAP.put("syncState", "sync_state");
        SYNCING_TABLE_COLUMN_MAP.put("lastDoTime", "last_do_time");
        SYNCING_TABLE_COLUMN_MAP.put("isTodayNew", "is_today_new");
        SYNCING_TABLE_COLUMN_MAP.put("tagId", "tag_id");
        SYNCING_TABLE_COLUMN_MAP.put("reviewRound", "review_round");
        MEDIA_SYNC_COLUMN_MAP.put("topicId", "topic_id");
        MEDIA_SYNC_COLUMN_MAP.put("radioState", a.j.C0251a.f16214j);
        MEDIA_SYNC_COLUMN_MAP.put("radioPostState", a.j.C0251a.f16215k);
        MEDIA_SYNC_COLUMN_MAP.put("radioTVState", a.j.C0251a.f16217m);
        MEDIA_SYNC_COLUMN_MAP.put("radioSkipState", a.j.C0251a.f16216l);
        CREATOR = new Parcelable.Creator<TopicLearnRecord>() { // from class: com.baicizhan.client.business.dataset.models.TopicLearnRecord.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TopicLearnRecord createFromParcel(Parcel source) {
                TopicLearnRecord topicLearnRecord = new TopicLearnRecord();
                topicLearnRecord.readFromParcel(source);
                return topicLearnRecord;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TopicLearnRecord[] newArray(int size) {
                return new TopicLearnRecord[size];
            }
        };
    }

    public static boolean isFmSkipped(int skipvalue) {
        return (skipvalue & 1) == 1;
    }

    public static boolean isKilled(int score) {
        return score < 0 && score != -1024;
    }

    public static boolean isTVSkipped(int skipvalue) {
        return (skipvalue & 2) == 2;
    }

    public static int mergeFmSkipValue(boolean z11, int i11) {
        return (z11 ? 1 : 0) | i11;
    }

    public static int mergeTVSkipVlaue(boolean skipped, int skipvalue) {
        return (skipped ? 2 : 0) | skipvalue;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel in2) {
        this.topicId = in2.readInt();
        this.topicScore = in2.readInt();
        this.topicDay = in2.readInt();
        this.totalTime = in2.readLong();
        this.doNum = in2.readInt();
        this.errNum = in2.readInt();
        this.syncState = in2.readLong();
        this.lastDoTime = in2.readLong();
        this.isTodayNew = in2.readInt();
        this.zijianState = in2.readInt();
        this.radioState = in2.readInt();
        this.radioPostState = in2.readInt();
        this.radioTVState = in2.readInt();
        this.radioSkipState = in2.readInt();
        this.createAt = in2.readLong();
        this.reviewRound = in2.readInt();
    }

    public String toString() {
        return "TopicLearnRecord{topicId=" + this.topicId + ", topicScore=" + this.topicScore + ", topicDay=" + this.topicDay + ", totalTime=" + this.totalTime + ", doNum=" + this.doNum + ", errNum=" + this.errNum + ", syncState=" + this.syncState + ", lastDoTime=" + this.lastDoTime + ", isTodayNew=" + this.isTodayNew + ", zijianState=" + this.zijianState + ", radioState=" + this.radioState + ", radioPostState=" + this.radioPostState + ", radioTVState=" + this.radioTVState + ", radioSkipState=" + this.radioSkipState + ", createAt=" + this.createAt + ", tagId=" + this.tagId + ", reviewRound=" + this.reviewRound + ", extra=" + this.extra + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(this.topicId);
        out.writeInt(this.topicScore);
        out.writeInt(this.topicDay);
        out.writeLong(this.totalTime);
        out.writeInt(this.doNum);
        out.writeInt(this.errNum);
        out.writeLong(this.syncState);
        out.writeLong(this.lastDoTime);
        out.writeInt(this.isTodayNew);
        out.writeInt(this.zijianState);
        out.writeInt(this.radioState);
        out.writeInt(this.radioPostState);
        out.writeInt(this.radioTVState);
        out.writeInt(this.radioSkipState);
        out.writeLong(this.createAt);
        out.writeInt(this.reviewRound);
    }

    public boolean isKilled() {
        return isKilled(this.topicScore);
    }
}
