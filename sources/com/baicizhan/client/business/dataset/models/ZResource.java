package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wikiv2.studyv2.data.t;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ZResource {
    public static final int $stable = 8;

    @l
    @c("antonyms")
    private final List<ZAntonym> antonyms;

    @k
    @c("cnMean")
    private final List<ZMean> cnMean;

    @l
    @c("derivations")
    private final List<ZDerivation> derivations;

    @l
    @c("enMean")
    private final List<ZMean> enMean;

    @l
    @c("mnemonic")
    private final ZMnemonic mnemonic;

    @l
    @c("phrases")
    private final List<ZPhrase> phrases;

    @k
    @c("sentences")
    private final List<ZSentence> sentences;

    @l
    @c("similars")
    private final List<ZSimilar> similars;

    @l
    @c("synonyms")
    private final List<ZSynonym> synonyms;

    @l
    @c("tvInfo")
    private final ZTvInfo tvInfo;

    @l
    @c(t.f26103e)
    private final List<ZVariant> variant;

    @k
    @c("word")
    private final ZWordInfo word;

    public ZResource(@k ZWordInfo word, @l ZMnemonic zMnemonic, @k List<ZMean> cnMean, @l List<ZMean> list, @k List<ZSentence> sentences, @l List<ZPhrase> list2, @l List<ZVariant> list3, @l List<ZDerivation> list4, @l ZTvInfo zTvInfo, @l List<ZSynonym> list5, @l List<ZAntonym> list6, @l List<ZSimilar> list7) {
        g0.p(word, "word");
        g0.p(cnMean, "cnMean");
        g0.p(sentences, "sentences");
        this.word = word;
        this.mnemonic = zMnemonic;
        this.cnMean = cnMean;
        this.enMean = list;
        this.sentences = sentences;
        this.phrases = list2;
        this.variant = list3;
        this.derivations = list4;
        this.tvInfo = zTvInfo;
        this.synonyms = list5;
        this.antonyms = list6;
        this.similars = list7;
    }

    public static /* synthetic */ ZResource copy$default(ZResource zResource, ZWordInfo zWordInfo, ZMnemonic zMnemonic, List list, List list2, List list3, List list4, List list5, List list6, ZTvInfo zTvInfo, List list7, List list8, List list9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zWordInfo = zResource.word;
        }
        if ((i11 & 2) != 0) {
            zMnemonic = zResource.mnemonic;
        }
        if ((i11 & 4) != 0) {
            list = zResource.cnMean;
        }
        if ((i11 & 8) != 0) {
            list2 = zResource.enMean;
        }
        if ((i11 & 16) != 0) {
            list3 = zResource.sentences;
        }
        if ((i11 & 32) != 0) {
            list4 = zResource.phrases;
        }
        if ((i11 & 64) != 0) {
            list5 = zResource.variant;
        }
        if ((i11 & 128) != 0) {
            list6 = zResource.derivations;
        }
        if ((i11 & 256) != 0) {
            zTvInfo = zResource.tvInfo;
        }
        if ((i11 & 512) != 0) {
            list7 = zResource.synonyms;
        }
        if ((i11 & 1024) != 0) {
            list8 = zResource.antonyms;
        }
        if ((i11 & 2048) != 0) {
            list9 = zResource.similars;
        }
        List list10 = list8;
        List list11 = list9;
        ZTvInfo zTvInfo2 = zTvInfo;
        List list12 = list7;
        List list13 = list5;
        List list14 = list6;
        List list15 = list3;
        List list16 = list4;
        return zResource.copy(zWordInfo, zMnemonic, list, list2, list15, list16, list13, list14, zTvInfo2, list12, list10, list11);
    }

    @k
    public final ZWordInfo component1() {
        return this.word;
    }

    @l
    public final List<ZSynonym> component10() {
        return this.synonyms;
    }

    @l
    public final List<ZAntonym> component11() {
        return this.antonyms;
    }

    @l
    public final List<ZSimilar> component12() {
        return this.similars;
    }

    @l
    public final ZMnemonic component2() {
        return this.mnemonic;
    }

    @k
    public final List<ZMean> component3() {
        return this.cnMean;
    }

    @l
    public final List<ZMean> component4() {
        return this.enMean;
    }

    @k
    public final List<ZSentence> component5() {
        return this.sentences;
    }

    @l
    public final List<ZPhrase> component6() {
        return this.phrases;
    }

    @l
    public final List<ZVariant> component7() {
        return this.variant;
    }

    @l
    public final List<ZDerivation> component8() {
        return this.derivations;
    }

    @l
    public final ZTvInfo component9() {
        return this.tvInfo;
    }

    @k
    public final ZResource copy(@k ZWordInfo word, @l ZMnemonic zMnemonic, @k List<ZMean> cnMean, @l List<ZMean> list, @k List<ZSentence> sentences, @l List<ZPhrase> list2, @l List<ZVariant> list3, @l List<ZDerivation> list4, @l ZTvInfo zTvInfo, @l List<ZSynonym> list5, @l List<ZAntonym> list6, @l List<ZSimilar> list7) {
        g0.p(word, "word");
        g0.p(cnMean, "cnMean");
        g0.p(sentences, "sentences");
        return new ZResource(word, zMnemonic, cnMean, list, sentences, list2, list3, list4, zTvInfo, list5, list6, list7);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZResource)) {
            return false;
        }
        ZResource zResource = (ZResource) obj;
        return g0.g(this.word, zResource.word) && g0.g(this.mnemonic, zResource.mnemonic) && g0.g(this.cnMean, zResource.cnMean) && g0.g(this.enMean, zResource.enMean) && g0.g(this.sentences, zResource.sentences) && g0.g(this.phrases, zResource.phrases) && g0.g(this.variant, zResource.variant) && g0.g(this.derivations, zResource.derivations) && g0.g(this.tvInfo, zResource.tvInfo) && g0.g(this.synonyms, zResource.synonyms) && g0.g(this.antonyms, zResource.antonyms) && g0.g(this.similars, zResource.similars);
    }

    @l
    public final List<ZAntonym> getAntonyms() {
        return this.antonyms;
    }

    @k
    public final List<ZMean> getCnMean() {
        return this.cnMean;
    }

    @l
    public final List<ZDerivation> getDerivations() {
        return this.derivations;
    }

    @l
    public final List<ZMean> getEnMean() {
        return this.enMean;
    }

    @l
    public final ZMnemonic getMnemonic() {
        return this.mnemonic;
    }

    @l
    public final List<ZPhrase> getPhrases() {
        return this.phrases;
    }

    @k
    public final List<ZSentence> getSentences() {
        return this.sentences;
    }

    @l
    public final List<ZSimilar> getSimilars() {
        return this.similars;
    }

    @l
    public final List<ZSynonym> getSynonyms() {
        return this.synonyms;
    }

    @l
    public final ZTvInfo getTvInfo() {
        return this.tvInfo;
    }

    @l
    public final List<ZVariant> getVariant() {
        return this.variant;
    }

    @k
    public final ZWordInfo getWord() {
        return this.word;
    }

    public int hashCode() {
        int hashCode = this.word.hashCode() * 31;
        ZMnemonic zMnemonic = this.mnemonic;
        int hashCode2 = (((hashCode + (zMnemonic == null ? 0 : zMnemonic.hashCode())) * 31) + this.cnMean.hashCode()) * 31;
        List<ZMean> list = this.enMean;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.sentences.hashCode()) * 31;
        List<ZPhrase> list2 = this.phrases;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ZVariant> list3 = this.variant;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ZDerivation> list4 = this.derivations;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ZTvInfo zTvInfo = this.tvInfo;
        int hashCode7 = (hashCode6 + (zTvInfo == null ? 0 : zTvInfo.hashCode())) * 31;
        List<ZSynonym> list5 = this.synonyms;
        int hashCode8 = (hashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ZAntonym> list6 = this.antonyms;
        int hashCode9 = (hashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ZSimilar> list7 = this.similars;
        return hashCode9 + (list7 != null ? list7.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ZResource(word=" + this.word + ", mnemonic=" + this.mnemonic + ", cnMean=" + this.cnMean + ", enMean=" + this.enMean + ", sentences=" + this.sentences + ", phrases=" + this.phrases + ", variant=" + this.variant + ", derivations=" + this.derivations + ", tvInfo=" + this.tvInfo + ", synonyms=" + this.synonyms + ", antonyms=" + this.antonyms + ", similars=" + this.similars + j.f81007d;
    }
}
