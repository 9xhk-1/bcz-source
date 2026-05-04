package com.baicizhan.client.video.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baicizhan.online.bs_words.BBWordMediaV3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l50.b;
import m9.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordTVInfo implements Parcelable {
    public static final Parcelable.Creator<WordTVInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f17777a;

    /* renamed from: b, reason: collision with root package name */
    public String f17778b;

    /* renamed from: c, reason: collision with root package name */
    public String f17779c;

    /* renamed from: d, reason: collision with root package name */
    public String f17780d;

    /* renamed from: e, reason: collision with root package name */
    public String f17781e;

    /* renamed from: f, reason: collision with root package name */
    public String f17782f;

    /* renamed from: g, reason: collision with root package name */
    public String f17783g;

    /* renamed from: h, reason: collision with root package name */
    public String f17784h;

    /* renamed from: i, reason: collision with root package name */
    public String f17785i;

    /* renamed from: j, reason: collision with root package name */
    public long f17786j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<WordTVInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WordTVInfo createFromParcel(Parcel in2) {
            WordTVInfo wordTVInfo = new WordTVInfo();
            wordTVInfo.x(in2.readInt());
            wordTVInfo.z(in2.readString());
            wordTVInfo.r(in2.readString());
            wordTVInfo.s(in2.readString());
            wordTVInfo.t(in2.readString());
            wordTVInfo.u(in2.readString());
            wordTVInfo.v(in2.readString());
            wordTVInfo.o(in2.readString());
            wordTVInfo.y(in2.readString());
            wordTVInfo.p(in2.readLong());
            return wordTVInfo;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WordTVInfo[] newArray(int size) {
            return new WordTVInfo[size];
        }
    }

    public static List<WordTVInfo> a(List<BBWordMediaV3> mediaList) {
        ArrayList arrayList = new ArrayList();
        Iterator<BBWordMediaV3> it = mediaList.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return arrayList;
    }

    public static WordTVInfo b(BBWordMediaV3 wordMediaV3) {
        WordTVInfo wordTVInfo = new WordTVInfo();
        wordTVInfo.x(wordMediaV3.getTopic_id());
        wordTVInfo.z(wordMediaV3.getWord());
        wordTVInfo.r(wordMediaV3.getMean_cn());
        wordTVInfo.s(wordMediaV3.getAccent());
        wordTVInfo.t(wordMediaV3.getSentence());
        wordTVInfo.u(wordMediaV3.getSentence_trans());
        wordTVInfo.y(c.d(wordMediaV3.getTv_path()));
        wordTVInfo.o(c.d(wordMediaV3.getWord_audio_path()));
        if (TextUtils.isEmpty(wordMediaV3.getTv_snapshot_path())) {
            wordTVInfo.v(null);
            qb.c.b("tv", "snapshot null " + wordMediaV3.toString(), new Object[0]);
        } else {
            wordTVInfo.v(c.d(wordMediaV3.getTv_snapshot_path()));
        }
        wordTVInfo.p(TimeUnit.MILLISECONDS.convert(wordMediaV3.getCreated_at(), TimeUnit.SECONDS));
        return wordTVInfo;
    }

    public static WordTVInfo c() {
        WordTVInfo wordTVInfo = new WordTVInfo();
        wordTVInfo.x(6350);
        wordTVInfo.z("electric");
        wordTVInfo.r("在平坦的道路上曲折前行");
        wordTVInfo.s("[ɪˈlektrɪk]");
        wordTVInfo.t("To save time, I always shave with an electric razor.");
        wordTVInfo.u("为了节省时间，我总是用电动剃须刀。");
        wordTVInfo.y("http://assets.baicizhan.com/word_tv/real_suspect.mp4");
        wordTVInfo.o("http://baicizhan.qiniucdn.com/word_audios/electric.mp3");
        wordTVInfo.v("http://assets.baicizhan.com/word_tv_snapshot/leng_measure.jpg");
        return wordTVInfo;
    }

    public String d() {
        return this.f17784h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f17786j;
    }

    public String g() {
        return this.f17779c;
    }

    public String h() {
        return this.f17780d;
    }

    public String i() {
        return this.f17781e;
    }

    public String j() {
        return this.f17782f;
    }

    public String k() {
        return this.f17783g;
    }

    public int l() {
        return this.f17777a;
    }

    public String m() {
        return this.f17785i;
    }

    public String n() {
        return this.f17778b;
    }

    public void o(String audioUrl) {
        this.f17784h = audioUrl;
    }

    public void p(long createAt) {
        this.f17786j = createAt;
    }

    public void r(String meanCn) {
        this.f17779c = meanCn;
    }

    public void s(String phonetic) {
        this.f17780d = phonetic;
    }

    public void t(String sentence) {
        this.f17781e = sentence;
    }

    public String toString() {
        return "WordTVInfo{audioUrl='" + this.f17784h + "', topicId=" + this.f17777a + ", word='" + this.f17778b + "', meanCn='" + this.f17779c + "', phonetic='" + this.f17780d + "', sentence='" + this.f17781e + "', sentenceTrans='" + this.f17782f + "', snapshotUrl='" + this.f17783g + "', videoUrl='" + this.f17785i + "', createAt=" + this.f17786j + b.f69928j;
    }

    public void u(String sentenceTrans) {
        this.f17782f = sentenceTrans;
    }

    public void v(String snapshotUrl) {
        this.f17783g = snapshotUrl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f17777a);
        dest.writeString(this.f17778b);
        dest.writeString(this.f17779c);
        dest.writeString(this.f17780d);
        dest.writeString(this.f17781e);
        dest.writeString(this.f17782f);
        dest.writeString(this.f17783g);
        dest.writeString(this.f17784h);
        dest.writeString(this.f17785i);
        dest.writeLong(this.f17786j);
    }

    public void x(int topicId) {
        this.f17777a = topicId;
    }

    public void y(String videoUrl) {
        this.f17785i = videoUrl;
    }

    public void z(String word) {
        this.f17778b = word;
    }
}
