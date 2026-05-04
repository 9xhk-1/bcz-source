package com.baicizhan.client.business.dataset.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import c1.g;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.WordMeanUtils;
import com.baicizhan.online.resource_api.SentenceInfo;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordDictV2;
import com.bumptech.glide.load.engine.GlideException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k9.b;
import q9.x;
import wo.c;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TopicRecord implements Parcelable {
    public static final Map<String, String> COLUMN_MAP;
    public static final int COVERAGE_CLOZE = 1;
    public static final Parcelable.Creator<TopicRecord> CREATOR;
    public int bookId;

    @c("bpg_file")
    public String bpgFile;

    @c(a.q.C0258a.f16285b)
    public TopicExtra clozeData;
    public int coverage;

    @c("deformation_desc")
    public String deformationDesc;

    @c("deformation_img")
    public String deformationImagePath;

    @c("image_file")
    public String imagePath;

    @c("accent")
    public String phonetic;

    @c("sentence")
    public String sentence;

    @c("sentence_audio")
    public String sentenceAudio;

    @c("sentence_phrase")
    public String sentencePhrase;

    @c("sentence_trans")
    public String sentenceTrans;

    @c("short_phrase")
    public String shortPhrase;

    @c("topic_id")
    public int topicId;
    public String updateFlagMD5;

    @c("word")
    public String word;

    @c("word_audio")
    public String wordAudio;

    @c("word_etyma")
    public String wordEtyma;

    @c(a.e.C0246a.f16184d)
    public String wordMean;

    @c("mean_en")
    public String wordMeanEn;

    @c("word_variants")
    public String wordVariants;
    public String zpkName;
    public int zpkVersion;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TopicExtra implements b {
        public String cloze;
        public List<String> options;
        public String syllable;
        public List<List<String>> tips;

        public String toString() {
            return "TopicExtra{syllable='" + this.syllable + "', cloze='" + this.cloze + "', options=" + this.options + ", tips=" + this.tips + l50.b.f69928j;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("topicId", "topic");
        hashMap.put("zpkName", "zpk_path");
        hashMap.put("updateFlagMD5", a.i.C0250a.f16201c);
        hashMap.put(a.i.C0250a.f16202d, a.i.C0250a.f16202d);
        hashMap.put("zpkVersion", a.i.C0250a.f16203e);
        CREATOR = new Parcelable.Creator<TopicRecord>() { // from class: com.baicizhan.client.business.dataset.models.TopicRecord.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TopicRecord createFromParcel(Parcel in2) {
                return new TopicRecord(in2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public TopicRecord[] newArray(int size) {
                return new TopicRecord[size];
            }
        };
    }

    public TopicRecord() {
    }

    public static String convertToStandardCnmean(String cnmean) {
        if (cnmean == null || !cnmean.contains("\n")) {
            return cnmean;
        }
        String[] split = TextUtils.split(cnmean, "\n");
        if (split.length > 0) {
            String str = "";
            for (String str2 : split) {
                String trim = str2.replace(g.f7467d, "").trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = str + trim + "   ";
                }
            }
            cnmean = str;
        }
        return cnmean.trim();
    }

    public static String convertToViewableCnmean(String cnmean) {
        if (cnmean == null) {
            return null;
        }
        return cnmean.replaceAll(GlideException.a.f28776d, "\n");
    }

    public static TopicRecord fromTopicResV2(int bookId, TopicResourceV2 res) {
        TopicRecord topicRecord = new TopicRecord();
        WordDictV2 dict = res.getDict();
        if (dict != null) {
            topicRecord.topicId = dict.getWord_basic_info().getTopic_id();
            topicRecord.word = dict.getWord_basic_info().getWord();
            topicRecord.wordMean = WordMeanUtils.assembleCnMean(dict.getChn_means());
            topicRecord.phonetic = dict.getWord_basic_info().getAccent_usa();
            topicRecord.wordAudio = dict.getWord_basic_info().getAccent_usa_audio_uri();
            if (e.h(dict.getSentences())) {
                topicRecord.sentence = "";
                topicRecord.sentenceAudio = "";
                topicRecord.imagePath = "";
                topicRecord.sentenceTrans = "";
            } else {
                SentenceInfo sentenceInfo = dict.getSentences().get(0);
                topicRecord.sentence = sentenceInfo.getSentence();
                topicRecord.sentenceAudio = sentenceInfo.getAudio_uri();
                topicRecord.imagePath = sentenceInfo.getImg_uri();
                topicRecord.sentenceTrans = sentenceInfo.getSentence_trans();
            }
            topicRecord.wordEtyma = dict.getWord_basic_info().getEtyma();
            topicRecord.deformationImagePath = dict.getWord_basic_info().getDeformation_img_uri();
            if (res.getZpk_info() != null) {
                topicRecord.fillMetaProperties(bookId, res.getZpk_info().getZpk_uri(), res.getZpk_info().getZpk_md5(), res.getZpk_info().getZpk_version());
            }
        }
        return topicRecord;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void fillMetaProperties(int bookId, String zpkName, String updateFlagMD5, int zpkVersion) {
        this.bookId = bookId;
        this.zpkName = zpkName;
        this.updateFlagMD5 = updateFlagMD5;
        this.zpkVersion = zpkVersion;
        generateCoverage();
    }

    public void generateCoverage() {
        x r11;
        int i11 = 1;
        if (this.clozeData == null && ((r11 = x.r()) == null || r11.I().get(Integer.valueOf(this.topicId)) == null)) {
            i11 = 0;
        }
        this.coverage = i11;
    }

    public long getUniverseTopicId() {
        return UniverseTopicId.make(this.bookId, this.topicId);
    }

    public String toString() {
        return "TopicRecord{bookId=" + this.bookId + ", zpkName='" + this.zpkName + "', updateFlagMD5='" + this.updateFlagMD5 + "', zpkVersion='" + this.zpkVersion + "', coverage=" + this.coverage + ", topicId=" + this.topicId + ", word='" + this.word + "', wordMean='" + this.wordMean + "', wordVariants='" + this.wordVariants + "', phonetic='" + this.phonetic + "', sentence='" + this.sentence + "', wordAudio='" + this.wordAudio + "', sentenceAudio='" + this.sentenceAudio + "', imagePath='" + this.imagePath + "', wordMeanEn='" + this.wordMeanEn + "', shortPhrase='" + this.shortPhrase + "', wordEtyma='" + this.wordEtyma + "', deformationImagePath='" + this.deformationImagePath + "', deformationDesc='" + this.deformationDesc + "', sentenceTrans='" + this.sentenceTrans + "', sentencePhrase='" + this.sentencePhrase + "', clozeData=" + this.clozeData + ", bpgFile='" + this.bpgFile + '\'' + l50.b.f69928j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.bookId);
        dest.writeInt(this.topicId);
        dest.writeString(this.word);
        dest.writeString(this.wordMean);
        dest.writeString(this.wordVariants);
        dest.writeString(this.phonetic);
        dest.writeString(this.sentence);
        dest.writeString(this.wordAudio);
        dest.writeString(this.sentenceAudio);
        dest.writeString(this.imagePath);
        dest.writeString(this.wordMeanEn);
        dest.writeString(this.shortPhrase);
        dest.writeString(this.wordEtyma);
        dest.writeString(this.deformationImagePath);
        dest.writeString(this.deformationDesc);
        dest.writeString(this.sentenceTrans);
        dest.writeString(this.zpkName);
        dest.writeString(this.updateFlagMD5);
        dest.writeInt(this.zpkVersion);
        dest.writeString(this.sentencePhrase);
        dest.writeString(this.bpgFile);
    }

    public TopicRecord(@NonNull Word src) {
        this.bookId = src.getBookId();
        this.zpkName = src.getZpkPath();
        this.topicId = Integer.valueOf(src.getId()).intValue();
        this.word = src.getWord();
        this.wordMean = src.getCnmean();
        this.wordEtyma = src.getRoot();
        this.phonetic = src.getAccent();
        this.sentence = src.getExample();
        this.wordAudio = src.getAudio();
        this.imagePath = src.getImage();
        this.wordMeanEn = src.getEnmean();
        this.deformationImagePath = src.getVivid();
    }

    public TopicRecord(Parcel in2) {
        this.bookId = in2.readInt();
        this.topicId = in2.readInt();
        this.word = in2.readString();
        this.wordMean = in2.readString();
        this.wordVariants = in2.readString();
        this.phonetic = in2.readString();
        this.sentence = in2.readString();
        this.wordAudio = in2.readString();
        this.sentenceAudio = in2.readString();
        this.imagePath = in2.readString();
        this.wordMeanEn = in2.readString();
        this.shortPhrase = in2.readString();
        this.wordEtyma = in2.readString();
        this.deformationImagePath = in2.readString();
        this.deformationDesc = in2.readString();
        this.sentenceTrans = in2.readString();
        this.zpkName = in2.readString();
        this.updateFlagMD5 = in2.readString();
        this.zpkVersion = in2.readInt();
        this.sentencePhrase = in2.readString();
        this.bpgFile = in2.readString();
    }
}
