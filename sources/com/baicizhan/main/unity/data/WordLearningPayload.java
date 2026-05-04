package com.baicizhan.main.unity.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class WordLearningPayload {
    public static final int $stable = 0;

    @k
    private final String param;
    private final int sceneId;

    public WordLearningPayload(int i11, @k String param) {
        g0.p(param, "param");
        this.sceneId = i11;
        this.param = param;
    }

    public static /* synthetic */ WordLearningPayload copy$default(WordLearningPayload wordLearningPayload, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = wordLearningPayload.sceneId;
        }
        if ((i12 & 2) != 0) {
            str = wordLearningPayload.param;
        }
        return wordLearningPayload.copy(i11, str);
    }

    public final int component1() {
        return this.sceneId;
    }

    @k
    public final String component2() {
        return this.param;
    }

    @k
    public final WordLearningPayload copy(int i11, @k String param) {
        g0.p(param, "param");
        return new WordLearningPayload(i11, param);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordLearningPayload)) {
            return false;
        }
        WordLearningPayload wordLearningPayload = (WordLearningPayload) obj;
        return this.sceneId == wordLearningPayload.sceneId && g0.g(this.param, wordLearningPayload.param);
    }

    @k
    public final String getParam() {
        return this.param;
    }

    public final int getSceneId() {
        return this.sceneId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sceneId) * 31) + this.param.hashCode();
    }

    @k
    public String toString() {
        return "WordLearningPayload(sceneId=" + this.sceneId + ", param=" + this.param + j.f81007d;
    }

    public /* synthetic */ WordLearningPayload(int i11, String str, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? "" : str);
    }
}
