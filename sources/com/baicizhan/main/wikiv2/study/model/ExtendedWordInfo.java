package com.baicizhan.main.wikiv2.study.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.databinding.BaseObservable;
import com.baicizhan.client.business.dataset.models.CollectWordRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.WordMeanUtils;
import com.baicizhan.online.resource_api.MeanInfo;
import com.baicizhan.online.resource_api.SentenceInfo;
import com.baicizhan.online.resource_api.ShortPhraseInfo;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.VariantInfo;
import com.baicizhan.online.resource_api.WordBasicInfo;
import com.baicizhan.online.resource_api.WordDictV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ExtendedWordInfo extends BaseObservable implements Parcelable, NoProguard {
    public static final Parcelable.Creator<ExtendedWordInfo> CREATOR = new a();
    public static final int FAIL = 1;
    public static final int SUCCESS = 0;
    public String accent;
    public String accentUK;
    public List<String> antonyms;
    public int bookId;
    public List<Enmean> enmeans;
    public List<String> exams;
    public String mean;
    public List<Phrase> phrases;
    public List<Sentence> sentences;
    public int success;
    public List<String> synonyms;
    public int topicId;
    public String word;
    public String wordAudioUrl;
    public String wordAudioUrlUK;
    public List<WordDeform> wordDeforms;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Enmean extends BaseObservable implements Parcelable {
        public static final Parcelable.Creator<Enmean> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f25853a;

        /* renamed from: b, reason: collision with root package name */
        public String f25854b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<Enmean> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Enmean createFromParcel(Parcel in2) {
                return new Enmean(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Enmean[] newArray(int size) {
                return new Enmean[size];
            }
        }

        public Enmean() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.f25853a);
            dest.writeString(this.f25854b);
        }

        public Enmean(Parcel in2) {
            this.f25853a = in2.readString();
            this.f25854b = in2.readString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Phrase extends BaseObservable implements Parcelable {
        public static final Parcelable.Creator<Phrase> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f25855a;

        /* renamed from: b, reason: collision with root package name */
        public String f25856b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<Phrase> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Phrase createFromParcel(Parcel in2) {
                return new Phrase(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Phrase[] newArray(int size) {
                return new Phrase[size];
            }
        }

        public Phrase() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.f25855a);
            dest.writeString(this.f25856b);
        }

        public Phrase(Parcel in2) {
            this.f25855a = in2.readString();
            this.f25856b = in2.readString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordDeform extends BaseObservable implements Parcelable {
        public static final Parcelable.Creator<WordDeform> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f25861c = "复数";

        /* renamed from: d, reason: collision with root package name */
        public static final String f25862d = "第三人称单数";

        /* renamed from: e, reason: collision with root package name */
        public static final String f25863e = "现在分词";

        /* renamed from: f, reason: collision with root package name */
        public static final String f25864f = "过去式";

        /* renamed from: g, reason: collision with root package name */
        public static final String f25865g = "过去分词";

        /* renamed from: h, reason: collision with root package name */
        public static final String f25866h = "比较级";

        /* renamed from: i, reason: collision with root package name */
        public static final String f25867i = "最高级";

        /* renamed from: j, reason: collision with root package name */
        public static final String f25868j = "动词";

        /* renamed from: k, reason: collision with root package name */
        public static final String f25869k = "名词";

        /* renamed from: l, reason: collision with root package name */
        public static final String f25870l = "形容词";

        /* renamed from: m, reason: collision with root package name */
        public static final String f25871m = "副词";

        /* renamed from: n, reason: collision with root package name */
        public static final String f25872n = "介词";

        /* renamed from: o, reason: collision with root package name */
        public static final String f25873o = "连词";

        /* renamed from: a, reason: collision with root package name */
        public String f25874a;

        /* renamed from: b, reason: collision with root package name */
        public String f25875b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<WordDeform> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public WordDeform createFromParcel(Parcel in2) {
                return new WordDeform(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public WordDeform[] newArray(int size) {
                return new WordDeform[size];
            }
        }

        public WordDeform() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.f25874a);
            dest.writeString(this.f25875b);
        }

        public WordDeform(Parcel in2) {
            this.f25874a = in2.readString();
            this.f25875b = in2.readString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Parcelable.Creator<ExtendedWordInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExtendedWordInfo createFromParcel(Parcel in2) {
            return new ExtendedWordInfo(in2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExtendedWordInfo[] newArray(int size) {
            return new ExtendedWordInfo[size];
        }
    }

    public ExtendedWordInfo() {
        this.success = 1;
    }

    private static List<WordDeform> fillWordDeform(List<WordDeform> deforms, String deform, String type) {
        if (TextUtils.isEmpty(deform)) {
            return deforms;
        }
        if (deforms == null) {
            deforms = new ArrayList<>();
        }
        WordDeform wordDeform = new WordDeform();
        wordDeform.f25874a = type;
        wordDeform.f25875b = deform;
        deforms.add(wordDeform);
        return deforms;
    }

    public static ExtendedWordInfo fromTopicResV2(final TopicResourceV2 resourceV2) {
        if (resourceV2 == null || resourceV2.getDict_wiki() == null || resourceV2.getDict_wiki().getDict() == null) {
            return null;
        }
        WordDictV2 dict = resourceV2.getDict_wiki().getDict();
        WordBasicInfo word_basic_info = resourceV2.getDict_wiki().getDict().getWord_basic_info();
        ExtendedWordInfo extendedWordInfo = new ExtendedWordInfo();
        extendedWordInfo.bookId = x.r().l();
        extendedWordInfo.topicId = word_basic_info.topic_id;
        extendedWordInfo.success = 0;
        extendedWordInfo.word = word_basic_info.word;
        extendedWordInfo.mean = WordMeanUtils.assembleCnMean(dict.getChn_means());
        extendedWordInfo.accent = word_basic_info.getAccent_usa();
        extendedWordInfo.wordAudioUrl = word_basic_info.getAccent_usa_audio_uri();
        extendedWordInfo.exams = dict.exams;
        extendedWordInfo.accentUK = word_basic_info.accent_uk;
        extendedWordInfo.wordAudioUrlUK = word_basic_info.getAccent_uk_audio_uri();
        VariantInfo variantInfo = dict.variant_info;
        if (variantInfo != null) {
            List<WordDeform> fillWordDeform = fillWordDeform(extendedWordInfo.wordDeforms, variantInfo.f28163pl, WordDeform.f25861c);
            extendedWordInfo.wordDeforms = fillWordDeform;
            List<WordDeform> fillWordDeform2 = fillWordDeform(fillWordDeform, dict.variant_info.third, WordDeform.f25862d);
            extendedWordInfo.wordDeforms = fillWordDeform2;
            List<WordDeform> fillWordDeform3 = fillWordDeform(fillWordDeform2, dict.variant_info.ing, WordDeform.f25863e);
            extendedWordInfo.wordDeforms = fillWordDeform3;
            List<WordDeform> fillWordDeform4 = fillWordDeform(fillWordDeform3, dict.variant_info.past, WordDeform.f25864f);
            extendedWordInfo.wordDeforms = fillWordDeform4;
            List<WordDeform> fillWordDeform5 = fillWordDeform(fillWordDeform4, dict.variant_info.done, WordDeform.f25865g);
            extendedWordInfo.wordDeforms = fillWordDeform5;
            List<WordDeform> fillWordDeform6 = fillWordDeform(fillWordDeform5, dict.variant_info.f28162er, WordDeform.f25866h);
            extendedWordInfo.wordDeforms = fillWordDeform6;
            List<WordDeform> fillWordDeform7 = fillWordDeform(fillWordDeform6, dict.variant_info.est, WordDeform.f25867i);
            extendedWordInfo.wordDeforms = fillWordDeform7;
            if (fillWordDeform7 != null && (!TextUtils.isEmpty(dict.variant_info.verb) || !TextUtils.isEmpty(dict.variant_info.noun) || !TextUtils.isEmpty(dict.variant_info.adj) || !TextUtils.isEmpty(dict.variant_info.adv) || !TextUtils.isEmpty(dict.variant_info.prep) || !TextUtils.isEmpty(dict.variant_info.conn))) {
                WordDeform wordDeform = new WordDeform();
                wordDeform.f25874a = " ";
                wordDeform.f25875b = " ";
                extendedWordInfo.wordDeforms.add(wordDeform);
            }
            List<WordDeform> fillWordDeform8 = fillWordDeform(extendedWordInfo.wordDeforms, dict.variant_info.verb, WordDeform.f25868j);
            extendedWordInfo.wordDeforms = fillWordDeform8;
            List<WordDeform> fillWordDeform9 = fillWordDeform(fillWordDeform8, dict.variant_info.noun, WordDeform.f25869k);
            extendedWordInfo.wordDeforms = fillWordDeform9;
            List<WordDeform> fillWordDeform10 = fillWordDeform(fillWordDeform9, dict.variant_info.adj, WordDeform.f25870l);
            extendedWordInfo.wordDeforms = fillWordDeform10;
            List<WordDeform> fillWordDeform11 = fillWordDeform(fillWordDeform10, dict.variant_info.adv, WordDeform.f25871m);
            extendedWordInfo.wordDeforms = fillWordDeform11;
            List<WordDeform> fillWordDeform12 = fillWordDeform(fillWordDeform11, dict.variant_info.prep, WordDeform.f25872n);
            extendedWordInfo.wordDeforms = fillWordDeform12;
            extendedWordInfo.wordDeforms = fillWordDeform(fillWordDeform12, dict.variant_info.conn, WordDeform.f25873o);
        }
        if (!xb.e.h(dict.sentences)) {
            extendedWordInfo.sentences = new ArrayList(dict.sentences.size());
            Iterator<SentenceInfo> it = dict.sentences.iterator();
            while (it.hasNext()) {
                extendedWordInfo.sentences.add(Sentence.b(it.next()));
            }
        }
        if (!xb.e.h(dict.getShort_phrases())) {
            extendedWordInfo.phrases = new ArrayList(dict.getShort_phrases().size());
            for (ShortPhraseInfo shortPhraseInfo : dict.getShort_phrases()) {
                Phrase phrase = new Phrase();
                phrase.f25855a = shortPhraseInfo.getShort_phrase();
                phrase.f25856b = shortPhraseInfo.getShort_phrase_trans();
                extendedWordInfo.phrases.add(phrase);
            }
        }
        if (!xb.e.h(dict.getEn_means())) {
            extendedWordInfo.enmeans = new ArrayList(dict.getEn_means().size());
            for (MeanInfo meanInfo : dict.getEn_means()) {
                Enmean enmean = new Enmean();
                enmean.f25853a = meanInfo.mean_type;
                enmean.f25854b = meanInfo.getMean();
                extendedWordInfo.enmeans.add(enmean);
            }
        }
        return extendedWordInfo;
    }

    public static ExtendedWordInfo fromWordDictV2(final WordDictV2 wordDict) {
        if (wordDict == null) {
            return null;
        }
        WordBasicInfo word_basic_info = wordDict.getWord_basic_info();
        ExtendedWordInfo extendedWordInfo = new ExtendedWordInfo();
        extendedWordInfo.bookId = x.r().l();
        extendedWordInfo.topicId = word_basic_info.topic_id;
        extendedWordInfo.success = 0;
        extendedWordInfo.word = word_basic_info.word;
        extendedWordInfo.mean = WordMeanUtils.assembleCnMean(wordDict.getChn_means());
        extendedWordInfo.accent = word_basic_info.getAccent_usa();
        extendedWordInfo.wordAudioUrl = word_basic_info.getAccent_usa_audio_uri();
        extendedWordInfo.exams = wordDict.exams;
        extendedWordInfo.accentUK = word_basic_info.accent_uk;
        extendedWordInfo.wordAudioUrlUK = word_basic_info.getAccent_uk_audio_uri();
        VariantInfo variantInfo = wordDict.variant_info;
        if (variantInfo != null) {
            List<WordDeform> fillWordDeform = fillWordDeform(extendedWordInfo.wordDeforms, variantInfo.f28163pl, WordDeform.f25861c);
            extendedWordInfo.wordDeforms = fillWordDeform;
            List<WordDeform> fillWordDeform2 = fillWordDeform(fillWordDeform, wordDict.variant_info.third, WordDeform.f25862d);
            extendedWordInfo.wordDeforms = fillWordDeform2;
            List<WordDeform> fillWordDeform3 = fillWordDeform(fillWordDeform2, wordDict.variant_info.ing, WordDeform.f25863e);
            extendedWordInfo.wordDeforms = fillWordDeform3;
            List<WordDeform> fillWordDeform4 = fillWordDeform(fillWordDeform3, wordDict.variant_info.past, WordDeform.f25864f);
            extendedWordInfo.wordDeforms = fillWordDeform4;
            List<WordDeform> fillWordDeform5 = fillWordDeform(fillWordDeform4, wordDict.variant_info.done, WordDeform.f25865g);
            extendedWordInfo.wordDeforms = fillWordDeform5;
            List<WordDeform> fillWordDeform6 = fillWordDeform(fillWordDeform5, wordDict.variant_info.f28162er, WordDeform.f25866h);
            extendedWordInfo.wordDeforms = fillWordDeform6;
            List<WordDeform> fillWordDeform7 = fillWordDeform(fillWordDeform6, wordDict.variant_info.est, WordDeform.f25867i);
            extendedWordInfo.wordDeforms = fillWordDeform7;
            if (fillWordDeform7 != null && (!TextUtils.isEmpty(wordDict.variant_info.verb) || !TextUtils.isEmpty(wordDict.variant_info.noun) || !TextUtils.isEmpty(wordDict.variant_info.adj) || !TextUtils.isEmpty(wordDict.variant_info.adv) || !TextUtils.isEmpty(wordDict.variant_info.prep) || !TextUtils.isEmpty(wordDict.variant_info.conn))) {
                WordDeform wordDeform = new WordDeform();
                wordDeform.f25874a = " ";
                wordDeform.f25875b = " ";
                extendedWordInfo.wordDeforms.add(wordDeform);
            }
            List<WordDeform> fillWordDeform8 = fillWordDeform(extendedWordInfo.wordDeforms, wordDict.variant_info.verb, WordDeform.f25868j);
            extendedWordInfo.wordDeforms = fillWordDeform8;
            List<WordDeform> fillWordDeform9 = fillWordDeform(fillWordDeform8, wordDict.variant_info.noun, WordDeform.f25869k);
            extendedWordInfo.wordDeforms = fillWordDeform9;
            List<WordDeform> fillWordDeform10 = fillWordDeform(fillWordDeform9, wordDict.variant_info.adj, WordDeform.f25870l);
            extendedWordInfo.wordDeforms = fillWordDeform10;
            List<WordDeform> fillWordDeform11 = fillWordDeform(fillWordDeform10, wordDict.variant_info.adv, WordDeform.f25871m);
            extendedWordInfo.wordDeforms = fillWordDeform11;
            List<WordDeform> fillWordDeform12 = fillWordDeform(fillWordDeform11, wordDict.variant_info.prep, WordDeform.f25872n);
            extendedWordInfo.wordDeforms = fillWordDeform12;
            extendedWordInfo.wordDeforms = fillWordDeform(fillWordDeform12, wordDict.variant_info.conn, WordDeform.f25873o);
        }
        if (!xb.e.h(wordDict.sentences)) {
            extendedWordInfo.sentences = new ArrayList(wordDict.sentences.size());
            Iterator<SentenceInfo> it = wordDict.sentences.iterator();
            while (it.hasNext()) {
                extendedWordInfo.sentences.add(Sentence.b(it.next()));
            }
        }
        if (!xb.e.h(wordDict.getShort_phrases())) {
            extendedWordInfo.phrases = new ArrayList(wordDict.getShort_phrases().size());
            for (ShortPhraseInfo shortPhraseInfo : wordDict.getShort_phrases()) {
                Phrase phrase = new Phrase();
                phrase.f25855a = shortPhraseInfo.getShort_phrase();
                phrase.f25856b = shortPhraseInfo.getShort_phrase_trans();
                extendedWordInfo.phrases.add(phrase);
            }
        }
        if (!xb.e.h(wordDict.getEn_means())) {
            extendedWordInfo.enmeans = new ArrayList(wordDict.getEn_means().size());
            for (MeanInfo meanInfo : wordDict.getEn_means()) {
                Enmean enmean = new Enmean();
                enmean.f25853a = meanInfo.mean_type;
                enmean.f25854b = meanInfo.getMean();
                extendedWordInfo.enmeans.add(enmean);
            }
        }
        return extendedWordInfo;
    }

    public static CollectWordRecord toCollectWord(int bookId, int topicId, ExtendedWordInfo info) {
        CollectWordRecord collectWordRecord = new CollectWordRecord();
        collectWordRecord.universeTopicId = UniverseTopicId.make(bookId, topicId);
        if (info != null) {
            collectWordRecord.word = info.word;
            collectWordRecord.meanCn = info.mean;
            collectWordRecord.accent = info.accent;
        }
        return collectWordRecord;
    }

    public static Word toWord(int bookId, int topicId, ExtendedWordInfo info) {
        Word word = new Word();
        word.setBookId(bookId);
        word.setId(String.valueOf(topicId));
        word.setWord(info.word);
        word.setAccent(info.accent);
        word.setCnmean(info.mean);
        return word;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ExtendedWordInfo tryFillBy(Word dict) {
        if (dict != null && TextUtils.equals(dict.getWord(), this.word)) {
            if (TextUtils.isEmpty(this.mean)) {
                this.mean = dict.getCnmean();
            }
            if (TextUtils.isEmpty(this.accent)) {
                this.accent = dict.getAccent();
            }
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.bookId);
        dest.writeInt(this.topicId);
        dest.writeString(this.word);
        dest.writeString(this.mean);
        dest.writeString(this.accent);
        dest.writeString(this.wordAudioUrl);
        dest.writeStringList(this.exams);
        dest.writeTypedList(this.wordDeforms);
        dest.writeTypedList(this.sentences);
        dest.writeTypedList(this.phrases);
        dest.writeStringList(this.synonyms);
        dest.writeStringList(this.antonyms);
        dest.writeTypedList(this.enmeans);
        dest.writeString(this.accentUK);
        dest.writeString(this.wordAudioUrlUK);
        dest.writeInt(this.success);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Sentence extends BaseObservable implements Parcelable {
        public static final Parcelable.Creator<Sentence> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public String f25857a;

        /* renamed from: b, reason: collision with root package name */
        public String f25858b;

        /* renamed from: c, reason: collision with root package name */
        public String f25859c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f25860d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<Sentence> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Sentence createFromParcel(Parcel in2) {
                return new Sentence(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Sentence[] newArray(int size) {
                return new Sentence[size];
            }
        }

        public Sentence() {
            this.f25860d = false;
        }

        public static Sentence b(SentenceInfo sentenceInfo) {
            Sentence sentence = new Sentence();
            sentence.f25857a = sentenceInfo.sentence;
            sentence.f25858b = sentenceInfo.sentence_trans;
            sentence.f25859c = sentenceInfo.audio_uri;
            return sentence;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f25857a);
            parcel.writeString(this.f25858b);
            parcel.writeString(this.f25859c);
            parcel.writeInt(!this.f25860d ? 1 : 0);
        }

        public Sentence(Parcel in2) {
            this.f25860d = false;
            this.f25857a = in2.readString();
            this.f25858b = in2.readString();
            this.f25859c = in2.readString();
            this.f25860d = in2.readInt() == 0;
        }
    }

    public ExtendedWordInfo(Parcel in2) {
        this.success = 1;
        this.bookId = in2.readInt();
        this.topicId = in2.readInt();
        this.word = in2.readString();
        this.mean = in2.readString();
        this.accent = in2.readString();
        this.wordAudioUrl = in2.readString();
        this.exams = in2.createStringArrayList();
        this.wordDeforms = in2.createTypedArrayList(WordDeform.CREATOR);
        this.sentences = in2.createTypedArrayList(Sentence.CREATOR);
        this.phrases = in2.createTypedArrayList(Phrase.CREATOR);
        this.synonyms = in2.createStringArrayList();
        this.antonyms = in2.createStringArrayList();
        this.enmeans = in2.createTypedArrayList(Enmean.CREATOR);
        this.accentUK = in2.readString();
        this.wordAudioUrlUK = in2.readString();
        this.success = in2.readInt();
    }
}
