package com.baicizhan.client.fm.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmData implements Parcelable {
    public static final Parcelable.Creator<FmData> CREATOR = new Parcelable.Creator<FmData>() { // from class: com.baicizhan.client.fm.data.FmData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FmData createFromParcel(Parcel in2) {
            return new FmData(in2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FmData[] newArray(int size) {
            return new FmData[size];
        }
    };
    String accent;
    String cnmean;
    String example;
    String hdpath;
    private FmData initedOne;
    String path;
    int skipped;
    int viewed;
    String word;
    String wordid;
    String wordtype;

    public FmData() {
    }

    public void accumViewed() {
        this.viewed++;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccent() {
        return this.accent;
    }

    public String getCnmean() {
        return this.cnmean;
    }

    public String getExample() {
        return this.example;
    }

    public String getHdpath() {
        return this.hdpath;
    }

    public FmData getInitedOne() {
        return this.initedOne;
    }

    public String getPath() {
        return this.path;
    }

    public int getSkipValue() {
        return this.skipped;
    }

    public int getViewedCount() {
        return this.viewed;
    }

    public String getWord() {
        return this.word;
    }

    public String getWordType() {
        return this.wordtype;
    }

    public String getWordid() {
        return this.wordid;
    }

    public boolean isSkipped() {
        return TopicLearnRecord.isFmSkipped(this.skipped);
    }

    public void setInitedOne(FmData initedOne) {
        if (initedOne == null) {
            this.initedOne = null;
            return;
        }
        FmData fmData = new FmData();
        this.initedOne = fmData;
        fmData.wordid = initedOne.wordid;
        fmData.word = initedOne.word;
        fmData.wordtype = initedOne.wordtype;
        fmData.accent = initedOne.accent;
        fmData.cnmean = initedOne.cnmean;
        fmData.example = initedOne.example;
        fmData.path = initedOne.path;
        fmData.hdpath = initedOne.hdpath;
        fmData.viewed = initedOne.viewed;
        fmData.skipped = initedOne.skipped;
    }

    public void setSkipped(boolean skipped) {
        this.skipped = TopicLearnRecord.mergeFmSkipValue(skipped, this.skipped);
    }

    public String toString() {
        return "FmData {wordid:" + this.wordid + ", word:" + this.word + ", accent:" + this.accent + ", cnmean:" + this.cnmean + ", example:" + this.example + ", path:" + this.path + ", hdpath:" + this.hdpath + i.f11099d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.wordid);
        dest.writeString(this.word);
        dest.writeString(this.wordtype);
        dest.writeString(this.accent);
        dest.writeString(this.cnmean);
        dest.writeString(this.example);
        dest.writeString(this.path);
        dest.writeString(this.hdpath);
        dest.writeInt(this.viewed);
        dest.writeInt(this.skipped);
        dest.writeParcelable(this.initedOne, flags);
    }

    public FmData(Parcel in2) {
        this.wordid = in2.readString();
        this.word = in2.readString();
        this.wordtype = in2.readString();
        this.accent = in2.readString();
        this.cnmean = in2.readString();
        this.example = in2.readString();
        this.path = in2.readString();
        this.hdpath = in2.readString();
        this.viewed = in2.readInt();
        this.skipped = in2.readInt();
        this.initedOne = (FmData) in2.readParcelable(FmData.class.getClassLoader());
    }
}
