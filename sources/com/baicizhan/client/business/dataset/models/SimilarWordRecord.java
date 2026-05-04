package com.baicizhan.client.business.dataset.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.baicizhan.online.bs_words.BBSimilarWordInfo;
import com.baicizhan.online.resource_api.SimilarWord;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SimilarWordRecord implements Parcelable {
    public static final Parcelable.Creator<SimilarWordRecord> CREATOR = new Parcelable.Creator<SimilarWordRecord>() { // from class: com.baicizhan.client.business.dataset.models.SimilarWordRecord.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SimilarWordRecord createFromParcel(Parcel in2) {
            return new SimilarWordRecord(in2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SimilarWordRecord[] newArray(int size) {
            return new SimilarWordRecord[size];
        }
    };
    public int similar_word_book_id;
    public int similar_word_id;
    public String tips;
    public int topic_id;
    public String word;

    public SimilarWordRecord() {
    }

    public static SimilarWordRecord fromBBSimilarWordInfo(BBSimilarWordInfo info) {
        SimilarWordRecord similarWordRecord = new SimilarWordRecord();
        similarWordRecord.topic_id = info.getTopic_id();
        similarWordRecord.similar_word_book_id = info.getSimilar_word_book_id();
        similarWordRecord.similar_word_id = info.getSimilar_word_id();
        similarWordRecord.tips = info.getTips();
        similarWordRecord.word = info.getWord();
        return similarWordRecord;
    }

    public static SimilarWordRecord fromSimilarWord(SimilarWord info, int topic_id) {
        SimilarWordRecord similarWordRecord = new SimilarWordRecord();
        similarWordRecord.topic_id = topic_id;
        similarWordRecord.similar_word_book_id = info.getWord_level_id();
        similarWordRecord.similar_word_id = info.getTopic_id();
        similarWordRecord.tips = "";
        similarWordRecord.word = info.getWord();
        return similarWordRecord;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "TopicSimilarInfoRecord{similar_word_book_id=" + this.similar_word_book_id + ", topic_id=" + this.topic_id + ", similar_word_id=" + this.similar_word_id + ", tips='" + this.tips + "', word='" + this.word + '\'' + b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.topic_id);
        parcel.writeInt(this.similar_word_id);
        parcel.writeInt(this.similar_word_book_id);
        parcel.writeString(this.tips);
        parcel.writeString(this.word);
    }

    public SimilarWordRecord(Parcel in2) {
        this.topic_id = in2.readInt();
        this.similar_word_id = in2.readInt();
        this.similar_word_book_id = in2.readInt();
        this.tips = in2.readString();
        this.word = in2.readString();
    }
}
