package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZSynonym {
    public static final int $stable = 0;

    @c("sId")
    private final long sId;

    @k
    @c("word")
    private final String word;

    public ZSynonym(long j11, @k String word) {
        g0.p(word, "word");
        this.sId = j11;
        this.word = word;
    }

    public static /* synthetic */ ZSynonym copy$default(ZSynonym zSynonym, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zSynonym.sId;
        }
        if ((i11 & 2) != 0) {
            str = zSynonym.word;
        }
        return zSynonym.copy(j11, str);
    }

    public final long component1() {
        return this.sId;
    }

    @k
    public final String component2() {
        return this.word;
    }

    @k
    public final ZSynonym copy(long j11, @k String word) {
        g0.p(word, "word");
        return new ZSynonym(j11, word);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZSynonym)) {
            return false;
        }
        ZSynonym zSynonym = (ZSynonym) obj;
        return this.sId == zSynonym.sId && g0.g(this.word, zSynonym.word);
    }

    public final long getSId() {
        return this.sId;
    }

    @k
    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return (Long.hashCode(this.sId) * 31) + this.word.hashCode();
    }

    @k
    public String toString() {
        return "ZSynonym(sId=" + this.sId + ", word=" + this.word + j.f81007d;
    }
}
