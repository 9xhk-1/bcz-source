package com.baicizhan.main.unity.bridge;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import ci.d;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes4.dex */
public final class UnityBridge {
    public static final int $stable = 0;

    @Keep
    public final void receiveMessage(@k String message) {
        g0.p(message, "message");
        d.b().invoke(message);
    }
}
