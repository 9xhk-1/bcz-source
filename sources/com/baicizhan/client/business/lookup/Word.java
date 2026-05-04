package com.baicizhan.client.business.lookup;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.client.business.util.NoProguard;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Word implements NoProguard, Parcelable {
    public static final Map<String, String> COLUMN_MAP;
    public static final Parcelable.Creator<Word> CREATOR;
    private static final int FLAG_BASE = 1;
    private static final int FLAG_FROM_CACHE = 2;
    private static final int FLAG_SEARCH = 4;
    private String accent;
    private String audio;
    private int bookId;
    private String cnexample;
    private String cnmean;
    private String enmean;
    private String example;
    private int flag;
    private transient boolean fromNetwork;

    /* renamed from: id, reason: collision with root package name */
    private String f16366id;
    private String image;
    private String root;
    private String variants;
    private String vivid;
    private String word;
    private String zpkPath;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends bp.a<Word> {
        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Parcelable.Creator<Word> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Word createFromParcel(Parcel in2) {
            return new Word(in2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Word[] newArray(int size) {
            return new Word[size];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("bookId", "book_id");
        hashMap.put("id", "topic_id");
        hashMap.put("word", "word");
        hashMap.put("accent", "accent");
        hashMap.put(a.r.C0259a.f16293f, a.r.C0259a.f16293f);
        hashMap.put("audio", "audio");
        hashMap.put(a.r.C0259a.f16295h, a.r.C0259a.f16295h);
        hashMap.put(a.r.C0259a.f16296i, a.r.C0259a.f16296i);
        hashMap.put("image", "image");
        hashMap.put(a.r.C0259a.f16298k, a.r.C0259a.f16298k);
        hashMap.put(a.r.C0259a.f16299l, a.r.C0259a.f16299l);
        hashMap.put(a.r.C0259a.f16300m, a.r.C0259a.f16300m);
        hashMap.put("zpkName", "zpk_path");
        hashMap.put(a.r.C0259a.f16302o, a.r.C0259a.f16302o);
        CREATOR = new b();
    }

    public Word() {
        this.flag = 0;
    }

    public static Word defaultPosterWord() {
        Word word = new Word();
        word.f16366id = "17742";
        word.word = "dare";
        word.accent = "[der]";
        word.cnmean = "v.敢，胆敢n.挑战，挑逗";
        word.enmean = "to tell (someone) to do something especially as a way of showing courage";
        word.example = "I dare you to stay on that wild horse for ten seconds!";
        word.cnexample = "我打赌你不敢呆在那匹野马背上十秒！";
        return word;
    }

    public static Word fromTopicRecord(TopicRecord topicRecord) {
        if (topicRecord == null) {
            return null;
        }
        Word word = new Word();
        word.bookId = topicRecord.bookId;
        word.f16366id = String.valueOf(topicRecord.topicId);
        word.word = topicRecord.word;
        word.accent = topicRecord.phonetic;
        word.cnmean = topicRecord.wordMean;
        word.enmean = topicRecord.wordMeanEn;
        word.example = topicRecord.sentence;
        word.audio = topicRecord.wordAudio;
        word.image = topicRecord.imagePath;
        word.vivid = topicRecord.deformationImagePath;
        word.root = topicRecord.wordEtyma;
        return word;
    }

    public static Set<String> splitVariants(String variants) {
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(variants)) {
            return Collections.EMPTY_SET;
        }
        for (String str : TextUtils.split(variants, ",")) {
            String trim = str.trim();
            if (trim.length() > 0) {
                hashSet.add(trim);
            }
        }
        return hashSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccent() {
        return this.accent;
    }

    public String getAudio() {
        return this.audio;
    }

    public int getBookId() {
        return this.bookId;
    }

    public String getCnexample() {
        return this.cnexample;
    }

    public String getCnmean() {
        return this.cnmean;
    }

    public String getEnmean() {
        return this.enmean;
    }

    public String getExample() {
        return this.example;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getId() {
        return this.f16366id;
    }

    public String getImage() {
        return this.image;
    }

    public String getRoot() {
        return this.root;
    }

    public String getVariants() {
        return this.variants;
    }

    public String getVivid() {
        return this.vivid;
    }

    public String getWord() {
        return this.word;
    }

    public String getZpkPath() {
        return this.zpkPath;
    }

    public boolean isBase() {
        return (this.flag & 1) == 1;
    }

    public boolean isFromCache() {
        return (this.flag & 2) == 2;
    }

    public boolean isFromNetwork() {
        return this.fromNetwork;
    }

    public boolean isSearch() {
        return (this.flag & 4) == 4;
    }

    public void replace(Word from) {
        this.bookId = from.bookId;
        this.f16366id = from.f16366id;
        this.word = from.word;
        this.accent = from.accent;
        this.cnmean = from.cnmean;
        this.audio = from.audio;
        this.example = from.example;
        this.cnexample = from.cnexample;
        this.image = from.image;
        this.vivid = from.vivid;
        this.enmean = from.enmean;
        this.root = from.root;
        this.zpkPath = from.zpkPath;
        this.variants = from.variants;
        this.flag = from.flag;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public void setBase(boolean base) {
        if (base) {
            this.flag |= 1;
        } else {
            this.flag &= -2;
        }
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setCnexample(String cnexample) {
        this.cnexample = cnexample;
    }

    public void setCnmean(String cnmean) {
        this.cnmean = cnmean;
    }

    public void setEnmean(String enmean) {
        this.enmean = enmean;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setFromCache(boolean fromCache) {
        if (fromCache) {
            this.flag |= 2;
        } else {
            this.flag &= -3;
        }
    }

    public void setFromNetwork(boolean fromNetwork) {
        this.fromNetwork = fromNetwork;
    }

    public void setId(String id2) {
        this.f16366id = id2;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setSearch(boolean search) {
        if (search) {
            this.flag |= 4;
        } else {
            this.flag &= -5;
        }
    }

    public void setVariants(String variants) {
        this.variants = variants;
    }

    public void setVivid(String vivid) {
        this.vivid = vivid;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setZpkPath(String zpkPath) {
        this.zpkPath = zpkPath;
    }

    public String toString() {
        return new JsonSerializer(new a().getType()).writeToJson(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flag) {
        dest.writeInt(this.bookId);
        dest.writeString(this.f16366id);
        dest.writeString(this.word);
        dest.writeString(this.accent);
        dest.writeString(this.cnmean);
        dest.writeString(this.audio);
        dest.writeString(this.example);
        dest.writeString(this.cnexample);
        dest.writeString(this.image);
        dest.writeString(this.vivid);
        dest.writeString(this.enmean);
        dest.writeString(this.root);
        dest.writeString(this.zpkPath);
        dest.writeString(this.variants);
        dest.writeInt(flag);
    }

    public Word(Parcel in2) {
        this.flag = 0;
        this.bookId = in2.readInt();
        this.f16366id = in2.readString();
        this.word = in2.readString();
        this.accent = in2.readString();
        this.cnmean = in2.readString();
        this.audio = in2.readString();
        this.example = in2.readString();
        this.cnexample = in2.readString();
        this.image = in2.readString();
        this.vivid = in2.readString();
        this.enmean = in2.readString();
        this.root = in2.readString();
        this.zpkPath = in2.readString();
        this.variants = in2.readString();
        this.flag = in2.readInt();
    }
}
