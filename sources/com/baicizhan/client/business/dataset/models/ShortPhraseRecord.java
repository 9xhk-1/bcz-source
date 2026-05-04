package com.baicizhan.client.business.dataset.models;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ShortPhraseRecord {
    public static final Map<String, String> COLUMN_MAP;
    public String examInfo;
    public String explain;
    public String explainAudio;

    /* renamed from: id, reason: collision with root package name */
    public long f16071id;
    public String imagePath;
    public String sentence;
    public String sentence2;
    public String sentenceAudio;
    public String sentenceAudio2;
    public String sentenceTrans;
    public String sentenceTrans2;
    public String sentenceWordHighLight;
    public String sentenceWordHighLight2;
    public String similarHighLight;
    public String word;
    public String wordAudio;
    public String wordMean;
    public String wordVariants;

    static {
        HashMap hashMap = new HashMap();
        COLUMN_MAP = hashMap;
        hashMap.put("id", a.c0.C0244a.f16141a);
        hashMap.put("word", a.c0.C0244a.f16142b);
        hashMap.put("sentence", a.c0.C0244a.f16143c);
        hashMap.put("sentence2", a.c0.C0244a.f16150j);
        hashMap.put("wordAudio", a.c0.C0244a.f16144d);
        hashMap.put("sentenceAudio", a.c0.C0244a.f16145e);
        hashMap.put("sentenceAudio2", a.c0.C0244a.f16153m);
        hashMap.put("imagePath", a.c0.C0244a.f16146f);
        hashMap.put("wordMean", a.c0.C0244a.f16147g);
        hashMap.put("sentenceTrans", a.c0.C0244a.f16151k);
        hashMap.put("sentenceTrans2", a.c0.C0244a.f16152l);
        hashMap.put("wordVariants", a.c0.C0244a.f16148h);
        hashMap.put("similarHighLight", a.c0.C0244a.f16149i);
        hashMap.put("explainAudio", a.c0.C0244a.f16154n);
        hashMap.put("explain", a.c0.C0244a.f16155o);
        hashMap.put("sentenceWordHighLight", a.c0.C0244a.f16156p);
        hashMap.put("sentenceWordHighLight2", a.c0.C0244a.f16157q);
        hashMap.put("examInfo", a.c0.C0244a.f16158r);
    }

    public String toString() {
        return "ShortPhraseRecord [id=" + this.f16071id + ", word=" + this.word + ", sentence=" + this.sentence + ", sentence2=" + this.sentence2 + ", wordAudio=" + this.wordAudio + ", sentenceAudio=" + this.sentenceAudio + ", sentenceAudio2=" + this.sentenceAudio2 + ", imagePath=" + this.imagePath + ", wordMean=" + this.wordMean + ", sentenceTrans=" + this.sentenceTrans + ", sentenceTrans2=" + this.sentenceTrans2 + ", wordVariants=" + this.wordVariants + ", similarHighLight=" + this.similarHighLight + ", explainAudio=" + this.explainAudio + ", explain=" + this.explain + ", sentenceWordHighLight=" + this.sentenceWordHighLight + ", sentenceWordHighLight2=" + this.sentenceWordHighLight2 + ", examInfo=" + this.examInfo + "]";
    }
}
