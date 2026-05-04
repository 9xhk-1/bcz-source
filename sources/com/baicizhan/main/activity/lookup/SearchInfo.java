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
public final class SearchInfo implements Serializable {
    public static final int $stable = 0;
    private final float aspectRatio;

    @l
    private final Candidate candidate;
    private final int candidateIndex;

    public SearchInfo(@l Candidate candidate, int i11, float f11) {
        this.candidate = candidate;
        this.candidateIndex = i11;
        this.aspectRatio = f11;
    }

    public static /* synthetic */ SearchInfo copy$default(SearchInfo searchInfo, Candidate candidate, int i11, float f11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            candidate = searchInfo.candidate;
        }
        if ((i12 & 2) != 0) {
            i11 = searchInfo.candidateIndex;
        }
        if ((i12 & 4) != 0) {
            f11 = searchInfo.aspectRatio;
        }
        return searchInfo.copy(candidate, i11, f11);
    }

    @l
    public final Candidate component1() {
        return this.candidate;
    }

    public final int component2() {
        return this.candidateIndex;
    }

    public final float component3() {
        return this.aspectRatio;
    }

    @k
    public final SearchInfo copy(@l Candidate candidate, int i11, float f11) {
        return new SearchInfo(candidate, i11, f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchInfo)) {
            return false;
        }
        SearchInfo searchInfo = (SearchInfo) obj;
        return g0.g(this.candidate, searchInfo.candidate) && this.candidateIndex == searchInfo.candidateIndex && Float.compare(this.aspectRatio, searchInfo.aspectRatio) == 0;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @l
    public final Candidate getCandidate() {
        return this.candidate;
    }

    public final int getCandidateIndex() {
        return this.candidateIndex;
    }

    public int hashCode() {
        Candidate candidate = this.candidate;
        return ((((candidate == null ? 0 : candidate.hashCode()) * 31) + Integer.hashCode(this.candidateIndex)) * 31) + Float.hashCode(this.aspectRatio);
    }

    @k
    public String toString() {
        return "SearchInfo(candidate=" + this.candidate + ", candidateIndex=" + this.candidateIndex + ", aspectRatio=" + this.aspectRatio + j.f81007d;
    }
}
