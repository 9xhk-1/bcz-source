package app.cash.sqldelight.db;

import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class OptimisticLockException extends IllegalStateException {
    public OptimisticLockException(@l String str, @l Throwable th2) {
        super(str, th2);
    }

    public /* synthetic */ OptimisticLockException(String str, Throwable th2, int i11, v vVar) {
        this(str, (i11 & 2) != 0 ? null : th2);
    }
}
