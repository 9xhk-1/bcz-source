package org.junit.jupiter.api;

import java.time.Duration;
import java.util.function.Supplier;
import org.junit.jupiter.api.m0;
import org.opentest4j.AssertionFailedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final /* synthetic */ class d0 implements m0.a {
    @Override // org.junit.jupiter.api.m0.a
    public final Throwable a(Duration duration, Supplier supplier, Throwable th2) {
        AssertionFailedError m11;
        m11 = h0.m(duration, supplier, th2);
        return m11;
    }
}
