package androidx.datastore.core;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th2, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(@k String message, @l Throwable th2) {
        super(message, th2);
        g0.p(message, "message");
    }
}
