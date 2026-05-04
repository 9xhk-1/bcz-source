package io.ktor.client.engine.apache;

import java.net.ConnectException;
import kotlin.jvm.internal.g0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {
    public static final boolean a(@m80.k ConnectException connectException) {
        g0.p(connectException, "<this>");
        String message = connectException.getMessage();
        if (message != null) {
            return k0.n3(message, "Timeout connecting", false, 2, null);
        }
        return false;
    }
}
