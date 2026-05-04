package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class b2 {
    public static boolean a(@CheckForNull Throwable t11, Class<? extends Throwable> expectedClass) {
        return expectedClass.isInstance(t11);
    }

    public static void b(Throwable t11) {
        Preconditions.checkNotNull(t11);
        if (t11 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
