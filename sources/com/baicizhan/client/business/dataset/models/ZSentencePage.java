package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ZSentencePage {
    public static final int $stable = 8;

    @c("meanId")
    private final long meanId;

    @k
    @c("sentenceIds")
    private final List<Long> sentenceIds;

    public ZSentencePage(long j11, @k List<Long> sentenceIds) {
        g0.p(sentenceIds, "sentenceIds");
        this.meanId = j11;
        this.sentenceIds = sentenceIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZSentencePage copy$default(ZSentencePage zSentencePage, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zSentencePage.meanId;
        }
        if ((i11 & 2) != 0) {
            list = zSentencePage.sentenceIds;
        }
        return zSentencePage.copy(j11, list);
    }

    public final long component1() {
        return this.meanId;
    }

    @k
    public final List<Long> component2() {
        return this.sentenceIds;
    }

    @k
    public final ZSentencePage copy(long j11, @k List<Long> sentenceIds) {
        g0.p(sentenceIds, "sentenceIds");
        return new ZSentencePage(j11, sentenceIds);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZSentencePage)) {
            return false;
        }
        ZSentencePage zSentencePage = (ZSentencePage) obj;
        return this.meanId == zSentencePage.meanId && g0.g(this.sentenceIds, zSentencePage.sentenceIds);
    }

    public final long getMeanId() {
        return this.meanId;
    }

    @k
    public final List<Long> getSentenceIds() {
        return this.sentenceIds;
    }

    public int hashCode() {
        return (Long.hashCode(this.meanId) * 31) + this.sentenceIds.hashCode();
    }

    @k
    public String toString() {
        return "ZSentencePage(meanId=" + this.meanId + ", sentenceIds=" + this.sentenceIds + j.f81007d;
    }
}
