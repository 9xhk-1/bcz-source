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
public final class ZAntonym {
    public static final int $stable = 0;

    @c("aId")
    private final long aId;

    @k
    @c("word")
    private final String word;

    public ZAntonym(long j11, @k String word) {
        g0.p(word, "word");
        this.aId = j11;
        this.word = word;
    }

    public static /* synthetic */ ZAntonym copy$default(ZAntonym zAntonym, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zAntonym.aId;
        }
        if ((i11 & 2) != 0) {
            str = zAntonym.word;
        }
        return zAntonym.copy(j11, str);
    }

    public final long component1() {
        return this.aId;
    }

    @k
    public final String component2() {
        return this.word;
    }

    @k
    public final ZAntonym copy(long j11, @k String word) {
        g0.p(word, "word");
        return new ZAntonym(j11, word);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZAntonym)) {
            return false;
        }
        ZAntonym zAntonym = (ZAntonym) obj;
        return this.aId == zAntonym.aId && g0.g(this.word, zAntonym.word);
    }

    public final long getAId() {
        return this.aId;
    }

    @k
    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return (Long.hashCode(this.aId) * 31) + this.word.hashCode();
    }

    @k
    public String toString() {
        return "ZAntonym(aId=" + this.aId + ", word=" + this.word + j.f81007d;
    }
}
