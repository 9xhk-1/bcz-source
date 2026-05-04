package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wikiv2.studyv2.data.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ZDerivation {
    public static final int $stable = 0;

    @c("dId")
    private final long dId;

    @l
    @c(t.f26099a)
    private final String mean;

    @k
    @c("word")
    private final String word;

    public ZDerivation(long j11, @k String word, @l String str) {
        g0.p(word, "word");
        this.dId = j11;
        this.word = word;
        this.mean = str;
    }

    public static /* synthetic */ ZDerivation copy$default(ZDerivation zDerivation, long j11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zDerivation.dId;
        }
        if ((i11 & 2) != 0) {
            str = zDerivation.word;
        }
        if ((i11 & 4) != 0) {
            str2 = zDerivation.mean;
        }
        return zDerivation.copy(j11, str, str2);
    }

    public final long component1() {
        return this.dId;
    }

    @k
    public final String component2() {
        return this.word;
    }

    @l
    public final String component3() {
        return this.mean;
    }

    @k
    public final ZDerivation copy(long j11, @k String word, @l String str) {
        g0.p(word, "word");
        return new ZDerivation(j11, word, str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZDerivation)) {
            return false;
        }
        ZDerivation zDerivation = (ZDerivation) obj;
        return this.dId == zDerivation.dId && g0.g(this.word, zDerivation.word) && g0.g(this.mean, zDerivation.mean);
    }

    public final long getDId() {
        return this.dId;
    }

    @l
    public final String getMean() {
        return this.mean;
    }

    @k
    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.dId) * 31) + this.word.hashCode()) * 31;
        String str = this.mean;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        return "ZDerivation(dId=" + this.dId + ", word=" + this.word + ", mean=" + this.mean + j.f81007d;
    }

    public /* synthetic */ ZDerivation(long j11, String str, String str2, int i11, v vVar) {
        this(j11, str, (i11 & 4) != 0 ? null : str2);
    }
}
