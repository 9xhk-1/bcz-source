package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wikiv2.studyv2.data.t;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZSentence {
    public static final int $stable = 0;

    @k
    @c("audio")
    private final String audio;

    @l
    @c("image")
    private final String image;

    @l
    @c("origin")
    private final String origin;

    @l
    @c(t.f26100b)
    private final String phrase;

    @c("sId")
    private final long sId;

    @k
    @c("sentenceEn")
    private final String sentenceEn;

    @k
    @c("translate")
    private final String translate;

    public ZSentence(long j11, @k String sentenceEn, @k String translate, @k String audio, @l String str, @l String str2, @l String str3) {
        g0.p(sentenceEn, "sentenceEn");
        g0.p(translate, "translate");
        g0.p(audio, "audio");
        this.sId = j11;
        this.sentenceEn = sentenceEn;
        this.translate = translate;
        this.audio = audio;
        this.image = str;
        this.origin = str2;
        this.phrase = str3;
    }

    public static /* synthetic */ ZSentence copy$default(ZSentence zSentence, long j11, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zSentence.sId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = zSentence.sentenceEn;
        }
        String str7 = str;
        if ((i11 & 4) != 0) {
            str2 = zSentence.translate;
        }
        String str8 = str2;
        if ((i11 & 8) != 0) {
            str3 = zSentence.audio;
        }
        String str9 = str3;
        if ((i11 & 16) != 0) {
            str4 = zSentence.image;
        }
        return zSentence.copy(j12, str7, str8, str9, str4, (i11 & 32) != 0 ? zSentence.origin : str5, (i11 & 64) != 0 ? zSentence.phrase : str6);
    }

    public final long component1() {
        return this.sId;
    }

    @k
    public final String component2() {
        return this.sentenceEn;
    }

    @k
    public final String component3() {
        return this.translate;
    }

    @k
    public final String component4() {
        return this.audio;
    }

    @l
    public final String component5() {
        return this.image;
    }

    @l
    public final String component6() {
        return this.origin;
    }

    @l
    public final String component7() {
        return this.phrase;
    }

    @k
    public final ZSentence copy(long j11, @k String sentenceEn, @k String translate, @k String audio, @l String str, @l String str2, @l String str3) {
        g0.p(sentenceEn, "sentenceEn");
        g0.p(translate, "translate");
        g0.p(audio, "audio");
        return new ZSentence(j11, sentenceEn, translate, audio, str, str2, str3);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZSentence)) {
            return false;
        }
        ZSentence zSentence = (ZSentence) obj;
        return this.sId == zSentence.sId && g0.g(this.sentenceEn, zSentence.sentenceEn) && g0.g(this.translate, zSentence.translate) && g0.g(this.audio, zSentence.audio) && g0.g(this.image, zSentence.image) && g0.g(this.origin, zSentence.origin) && g0.g(this.phrase, zSentence.phrase);
    }

    @k
    public final String getAudio() {
        return this.audio;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getOrigin() {
        return this.origin;
    }

    @l
    public final String getPhrase() {
        return this.phrase;
    }

    public final long getSId() {
        return this.sId;
    }

    @k
    public final String getSentenceEn() {
        return this.sentenceEn;
    }

    @k
    public final String getTranslate() {
        return this.translate;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.sId) * 31) + this.sentenceEn.hashCode()) * 31) + this.translate.hashCode()) * 31) + this.audio.hashCode()) * 31;
        String str = this.image;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.origin;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phrase;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ZSentence(sId=" + this.sId + ", sentenceEn=" + this.sentenceEn + ", translate=" + this.translate + ", audio=" + this.audio + ", image=" + this.image + ", origin=" + this.origin + ", phrase=" + this.phrase + j.f81007d;
    }
}
