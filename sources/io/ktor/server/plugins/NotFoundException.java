package io.ktor.server.plugins;

import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class NotFoundException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public NotFoundException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public NotFoundException(@l String str) {
        super(str);
    }

    public /* synthetic */ NotFoundException(String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? "Resource not found" : str);
    }
}
