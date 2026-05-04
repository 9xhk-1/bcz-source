package com.baicizhan.main.activity.lookup;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Candidate implements Serializable {
    public static final int $stable = 0;

    @k
    private final String key;

    @k
    private final String url;

    public Candidate(@k String key, @k String url) {
        g0.p(key, "key");
        g0.p(url, "url");
        this.key = key;
        this.url = url;
    }

    public static /* synthetic */ Candidate copy$default(Candidate candidate, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = candidate.key;
        }
        if ((i11 & 2) != 0) {
            str2 = candidate.url;
        }
        return candidate.copy(str, str2);
    }

    @k
    public final String component1() {
        return this.key;
    }

    @k
    public final String component2() {
        return this.url;
    }

    @k
    public final Candidate copy(@k String key, @k String url) {
        g0.p(key, "key");
        g0.p(url, "url");
        return new Candidate(key, url);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Candidate)) {
            return false;
        }
        Candidate candidate = (Candidate) obj;
        return g0.g(this.key, candidate.key) && g0.g(this.url, candidate.url);
    }

    @k
    public final String getKey() {
        return this.key;
    }

    @k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.url.hashCode();
    }

    @k
    public String toString() {
        return "Candidate(key=" + this.key + ", url=" + this.url + j.f81007d;
    }
}
