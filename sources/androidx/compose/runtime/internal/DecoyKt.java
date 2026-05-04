package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DecoyKt {
    @ComposeCompilerApi
    @k
    public static final Void illegalDecoyCallException(@k String str) {
        throw new IllegalStateException("Function " + str + " should have been replaced by compiler.");
    }
}
