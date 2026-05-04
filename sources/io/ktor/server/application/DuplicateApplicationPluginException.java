package io.ktor.server.application;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(level = DeprecationLevel.ERROR, message = "Please use DuplicatePluginException instead", replaceWith = @w0(expression = "DuplicatePluginException", imports = {}))
/* loaded from: classes8.dex */
public class DuplicateApplicationPluginException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuplicateApplicationPluginException(@k String message) {
        super(message);
        g0.p(message, "message");
    }
}
