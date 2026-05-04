package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;
import za.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZWordInfo {
    public static final int $stable = 0;

    @l
    @c("accentUk")
    private final String accentUk;

    @k
    @c("accentUs")
    private final String accentUs;

    @l
    @c("audioUk")
    private final String audioUk;

    @k
    @c("audioUs")
    private final String audioUs;

    @l
    @c(a.f102443k)
    private final ZExamInfo exam;

    @c("topicId")
    private final int topicId;

    @k
    @c("word")
    private final String word;

    @l
    @c("wordSplit")
    private final String wordSplit;

    public ZWordInfo(int i11, @k String word, @l String str, @k String accentUs, @l String str2, @k String audioUs, @l String str3, @l ZExamInfo zExamInfo) {
        g0.p(word, "word");
        g0.p(accentUs, "accentUs");
        g0.p(audioUs, "audioUs");
        this.topicId = i11;
        this.word = word;
        this.wordSplit = str;
        this.accentUs = accentUs;
        this.accentUk = str2;
        this.audioUs = audioUs;
        this.audioUk = str3;
        this.exam = zExamInfo;
    }

    public static /* synthetic */ ZWordInfo copy$default(ZWordInfo zWordInfo, int i11, String str, String str2, String str3, String str4, String str5, String str6, ZExamInfo zExamInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = zWordInfo.topicId;
        }
        if ((i12 & 2) != 0) {
            str = zWordInfo.word;
        }
        if ((i12 & 4) != 0) {
            str2 = zWordInfo.wordSplit;
        }
        if ((i12 & 8) != 0) {
            str3 = zWordInfo.accentUs;
        }
        if ((i12 & 16) != 0) {
            str4 = zWordInfo.accentUk;
        }
        if ((i12 & 32) != 0) {
            str5 = zWordInfo.audioUs;
        }
        if ((i12 & 64) != 0) {
            str6 = zWordInfo.audioUk;
        }
        if ((i12 & 128) != 0) {
            zExamInfo = zWordInfo.exam;
        }
        String str7 = str6;
        ZExamInfo zExamInfo2 = zExamInfo;
        String str8 = str4;
        String str9 = str5;
        return zWordInfo.copy(i11, str, str2, str3, str8, str9, str7, zExamInfo2);
    }

    public final int component1() {
        return this.topicId;
    }

    @k
    public final String component2() {
        return this.word;
    }

    @l
    public final String component3() {
        return this.wordSplit;
    }

    @k
    public final String component4() {
        return this.accentUs;
    }

    @l
    public final String component5() {
        return this.accentUk;
    }

    @k
    public final String component6() {
        return this.audioUs;
    }

    @l
    public final String component7() {
        return this.audioUk;
    }

    @l
    public final ZExamInfo component8() {
        return this.exam;
    }

    @k
    public final ZWordInfo copy(int i11, @k String word, @l String str, @k String accentUs, @l String str2, @k String audioUs, @l String str3, @l ZExamInfo zExamInfo) {
        g0.p(word, "word");
        g0.p(accentUs, "accentUs");
        g0.p(audioUs, "audioUs");
        return new ZWordInfo(i11, word, str, accentUs, str2, audioUs, str3, zExamInfo);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZWordInfo)) {
            return false;
        }
        ZWordInfo zWordInfo = (ZWordInfo) obj;
        return this.topicId == zWordInfo.topicId && g0.g(this.word, zWordInfo.word) && g0.g(this.wordSplit, zWordInfo.wordSplit) && g0.g(this.accentUs, zWordInfo.accentUs) && g0.g(this.accentUk, zWordInfo.accentUk) && g0.g(this.audioUs, zWordInfo.audioUs) && g0.g(this.audioUk, zWordInfo.audioUk) && g0.g(this.exam, zWordInfo.exam);
    }

    @l
    public final String getAccentUk() {
        return this.accentUk;
    }

    @k
    public final String getAccentUs() {
        return this.accentUs;
    }

    @l
    public final String getAudioUk() {
        return this.audioUk;
    }

    @k
    public final String getAudioUs() {
        return this.audioUs;
    }

    @l
    public final ZExamInfo getExam() {
        return this.exam;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    @k
    public final String getWord() {
        return this.word;
    }

    @l
    public final String getWordSplit() {
        return this.wordSplit;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.topicId) * 31) + this.word.hashCode()) * 31;
        String str = this.wordSplit;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accentUs.hashCode()) * 31;
        String str2 = this.accentUk;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.audioUs.hashCode()) * 31;
        String str3 = this.audioUk;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ZExamInfo zExamInfo = this.exam;
        return hashCode4 + (zExamInfo != null ? zExamInfo.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ZWordInfo(topicId=" + this.topicId + ", word=" + this.word + ", wordSplit=" + this.wordSplit + ", accentUs=" + this.accentUs + ", accentUk=" + this.accentUk + ", audioUs=" + this.audioUs + ", audioUk=" + this.audioUk + ", exam=" + this.exam + j.f81007d;
    }
}
