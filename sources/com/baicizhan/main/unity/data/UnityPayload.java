package com.baicizhan.main.unity.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public final class UnityPayload {
    public static final int $stable = 8;
    private final boolean clearUnity;

    @l
    private final Object param;
    private final int sceneType;

    public UnityPayload(int i11, boolean z11, @l Object obj) {
        this.sceneType = i11;
        this.clearUnity = z11;
        this.param = obj;
    }

    public static /* synthetic */ UnityPayload copy$default(UnityPayload unityPayload, int i11, boolean z11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = unityPayload.sceneType;
        }
        if ((i12 & 2) != 0) {
            z11 = unityPayload.clearUnity;
        }
        if ((i12 & 4) != 0) {
            obj = unityPayload.param;
        }
        return unityPayload.copy(i11, z11, obj);
    }

    public final int component1() {
        return this.sceneType;
    }

    public final boolean component2() {
        return this.clearUnity;
    }

    @l
    public final Object component3() {
        return this.param;
    }

    @k
    public final UnityPayload copy(int i11, boolean z11, @l Object obj) {
        return new UnityPayload(i11, z11, obj);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnityPayload)) {
            return false;
        }
        UnityPayload unityPayload = (UnityPayload) obj;
        return this.sceneType == unityPayload.sceneType && this.clearUnity == unityPayload.clearUnity && g0.g(this.param, unityPayload.param);
    }

    public final boolean getClearUnity() {
        return this.clearUnity;
    }

    @l
    public final Object getParam() {
        return this.param;
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.sceneType) * 31) + Boolean.hashCode(this.clearUnity)) * 31;
        Object obj = this.param;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @k
    public String toString() {
        return "UnityPayload(sceneType=" + this.sceneType + ", clearUnity=" + this.clearUnity + ", param=" + this.param + j.f81007d;
    }

    public /* synthetic */ UnityPayload(int i11, boolean z11, Object obj, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? null : obj);
    }
}
