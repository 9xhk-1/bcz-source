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
public final class ZPhrase {
    public static final int $stable = 0;

    @l
    @c(t.f26099a)
    private final String mean;

    @c("pId")
    private final long pId;

    @k
    @c(t.f26100b)
    private final String phrase;

    public ZPhrase(long j11, @k String phrase, @l String str) {
        g0.p(phrase, "phrase");
        this.pId = j11;
        this.phrase = phrase;
        this.mean = str;
    }

    public static /* synthetic */ ZPhrase copy$default(ZPhrase zPhrase, long j11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zPhrase.pId;
        }
        if ((i11 & 2) != 0) {
            str = zPhrase.phrase;
        }
        if ((i11 & 4) != 0) {
            str2 = zPhrase.mean;
        }
        return zPhrase.copy(j11, str, str2);
    }

    public final long component1() {
        return this.pId;
    }

    @k
    public final String component2() {
        return this.phrase;
    }

    @l
    public final String component3() {
        return this.mean;
    }

    @k
    public final ZPhrase copy(long j11, @k String phrase, @l String str) {
        g0.p(phrase, "phrase");
        return new ZPhrase(j11, phrase, str);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZPhrase)) {
            return false;
        }
        ZPhrase zPhrase = (ZPhrase) obj;
        return this.pId == zPhrase.pId && g0.g(this.phrase, zPhrase.phrase) && g0.g(this.mean, zPhrase.mean);
    }

    @l
    public final String getMean() {
        return this.mean;
    }

    public final long getPId() {
        return this.pId;
    }

    @k
    public final String getPhrase() {
        return this.phrase;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.pId) * 31) + this.phrase.hashCode()) * 31;
        String str = this.mean;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        return "ZPhrase(pId=" + this.pId + ", phrase=" + this.phrase + ", mean=" + this.mean + j.f81007d;
    }
}
