package com.baicizhan.client.business.dataset.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.online.resource_api.WordMedia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordMediaRecord implements Parcelable {
    public static final Map<String, String> COLUMN_MAP;
    public static final Parcelable.Creator<WordMediaRecord> CREATOR;
    public static final Map<String, String> OLD_COLUMN_MAP;
    private String cnmean;
    private String example;
    private String fmpath;
    private long fmupdate;
    private String highfmpath;
    private int tapId;
    private String tvSnapshotPath;
    private String tvpath;
    private long tvupdate;
    private String word;
    private String wordid;
    private String wordtype;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        HashMap hashMap2 = new HashMap();
        OLD_COLUMN_MAP = hashMap2;
        hashMap.put("wordid", "topic_id");
        hashMap.put("word", "topic_word");
        hashMap.put("wordtype", a.v.C0263a.f16317c);
        hashMap.put(a.r.C0259a.f16293f, a.v.C0263a.f16318d);
        hashMap.put(a.r.C0259a.f16295h, a.v.C0263a.f16319e);
        hashMap.put("fmpath", a.v.C0263a.f16321g);
        hashMap.put("highfmpath", a.v.C0263a.f16320f);
        hashMap.put("tvpath", a.v.C0263a.f16322h);
        hashMap.put("tvSnapshotPath", a.v.C0263a.f16323i);
        hashMap.put("fmupdate", "fm_updated_at");
        hashMap.put("tvupdate", "tv_updated_at");
        hashMap2.put("tapId", "ws_id");
        hashMap2.put("word", a.o.C0256a.f16271c);
        hashMap2.put("wordtype", a.o.C0256a.f16272d);
        hashMap2.put(a.r.C0259a.f16293f, a.o.C0256a.f16273e);
        hashMap2.put(a.r.C0259a.f16295h, a.o.C0256a.f16274f);
        hashMap2.put("fmpath", "ws_audio");
        hashMap2.put("highfmpath", a.o.C0256a.f16277i);
        hashMap2.put("tvpath", a.o.C0256a.f16279k);
        hashMap2.put("fmupdate", "ws_update_time");
        CREATOR = new Parcelable.Creator<WordMediaRecord>() { // from class: com.baicizhan.client.business.dataset.models.WordMediaRecord.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WordMediaRecord createFromParcel(Parcel in2) {
                return new WordMediaRecord(in2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public WordMediaRecord[] newArray(int size) {
                return new WordMediaRecord[size];
            }
        };
    }

    public WordMediaRecord() {
    }

    public static List<WordMediaRecord> fromList(List<WordMedia> froms) {
        if (froms == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(froms.size());
        for (WordMedia wordMedia : froms) {
            WordMediaRecord wordMediaRecord = new WordMediaRecord();
            wordMediaRecord.setWordid(wordMedia.topic_id + "");
            wordMediaRecord.setWord(wordMedia.word);
            wordMediaRecord.setWordtype(wordMedia.word_type);
            wordMediaRecord.setCnmean(wordMedia.word_mean_cn);
            wordMediaRecord.setExample(wordMedia.word_sentence);
            wordMediaRecord.setFmpath(wordMedia.amr_audio_path);
            wordMediaRecord.setHighfmpath(wordMedia.m4a_audio_path);
            wordMediaRecord.setTvpath(wordMedia.tv_path);
            wordMediaRecord.setTvSnapshotPath(wordMedia.tv_snapshot_path);
            wordMediaRecord.setFmupdate(wordMedia.fm_updated_at);
            wordMediaRecord.setTvupdate(wordMedia.tv_updated_at);
            arrayList.add(wordMediaRecord);
        }
        return arrayList;
    }

    public static WordMediaRecord fromWordMedia(WordMedia media) {
        WordMediaRecord wordMediaRecord = new WordMediaRecord();
        wordMediaRecord.setCnmean(media.getWord_mean_cn());
        wordMediaRecord.setWordid(Integer.toString(media.getTopic_id()));
        wordMediaRecord.setWord(media.getWord());
        wordMediaRecord.setWordtype(media.getWord_type());
        wordMediaRecord.setExample(media.getWord_sentence());
        wordMediaRecord.setFmpath(media.getAmr_audio_path());
        wordMediaRecord.setHighfmpath(media.getM4a_audio_path());
        wordMediaRecord.setTvpath(media.getTv_path());
        wordMediaRecord.setTvSnapshotPath(media.getTv_snapshot_path());
        wordMediaRecord.setFmupdate(media.getFm_updated_at());
        wordMediaRecord.setTvupdate(media.getTv_updated_at());
        return wordMediaRecord;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCnmean() {
        return this.cnmean;
    }

    public String getExample() {
        return this.example;
    }

    public String getFmpath() {
        return this.fmpath;
    }

    public long getFmupdate() {
        return this.fmupdate;
    }

    public String getHighfmpath() {
        return this.highfmpath;
    }

    public int getTapId() {
        return this.tapId;
    }

    public String getTvSnapshotPath() {
        return this.tvSnapshotPath;
    }

    public String getTvpath() {
        return this.tvpath;
    }

    public long getTvupdate() {
        return this.tvupdate;
    }

    public String getWord() {
        return this.word;
    }

    public String getWordid() {
        return this.wordid;
    }

    public String getWordtype() {
        return this.wordtype;
    }

    public void setCnmean(String cnmean) {
        this.cnmean = cnmean;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setFmpath(String fmpath) {
        this.fmpath = fmpath;
    }

    public void setFmupdate(long fmupdate) {
        this.fmupdate = fmupdate;
    }

    public void setHighfmpath(String highfmpath) {
        this.highfmpath = highfmpath;
    }

    public void setTapId(int tapId) {
        this.tapId = tapId;
    }

    public void setTvSnapshotPath(String tvSnapshotPath) {
        this.tvSnapshotPath = tvSnapshotPath;
    }

    public void setTvpath(String tvpath) {
        this.tvpath = tvpath;
    }

    public void setTvupdate(long tvupdate) {
        this.tvupdate = tvupdate;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWordid(String wordid) {
        this.wordid = wordid;
    }

    public void setWordtype(String wordtype) {
        this.wordtype = wordtype;
    }

    public String toString() {
        return "WordMediaRecord {cnmean:" + this.cnmean + ", wordid:" + this.wordid + ", word:" + this.word + ", wordtype:" + this.wordtype + ", example:" + this.example + ", fmpath:" + this.fmpath + ", highfmpath:" + this.highfmpath + ", tvpath:" + this.tvpath + ", tvSnapshotPath:" + this.tvSnapshotPath + ", fmupdate:" + this.fmupdate + ", tvupdate:" + this.tvupdate + ", tapId:" + this.tapId + i.f11099d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.wordid);
        dest.writeString(this.word);
        dest.writeString(this.wordtype);
        dest.writeString(this.cnmean);
        dest.writeString(this.example);
        dest.writeString(this.fmpath);
        dest.writeString(this.highfmpath);
        dest.writeString(this.tvpath);
        dest.writeString(this.tvSnapshotPath);
        dest.writeLong(this.fmupdate);
        dest.writeLong(this.tvupdate);
        dest.writeInt(this.tapId);
    }

    public WordMediaRecord(Parcel in2) {
        this.wordid = in2.readString();
        this.word = in2.readString();
        this.wordtype = in2.readString();
        this.cnmean = in2.readString();
        this.example = in2.readString();
        this.fmpath = in2.readString();
        this.highfmpath = in2.readString();
        this.tvpath = in2.readString();
        this.tvSnapshotPath = in2.readString();
        this.fmupdate = in2.readLong();
        this.tvupdate = in2.readLong();
        this.tapId = in2.readInt();
    }
}
