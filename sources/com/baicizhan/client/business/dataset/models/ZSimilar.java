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
public final class ZSimilar {
    public static final int $stable = 0;

    @c("sId")
    private final long sId;

    @k
    @c("word")
    private final String word;

    public ZSimilar(long j11, @k String word) {
        g0.p(word, "word");
        this.sId = j11;
        this.word = word;
    }

    public static /* synthetic */ ZSimilar copy$default(ZSimilar zSimilar, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zSimilar.sId;
        }
        if ((i11 & 2) != 0) {
            str = zSimilar.word;
        }
        return zSimilar.copy(j11, str);
    }

    public final long component1() {
        return this.sId;
    }

    @k
    public final String component2() {
        return this.word;
    }

    @k
    public final ZSimilar copy(long j11, @k String word) {
        g0.p(word, "word");
        return new ZSimilar(j11, word);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZSimilar)) {
            return false;
        }
        ZSimilar zSimilar = (ZSimilar) obj;
        return this.sId == zSimilar.sId && g0.g(this.word, zSimilar.word);
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
        return "ZSimilar(sId=" + this.sId + ", word=" + this.word + j.f81007d;
    }
}
