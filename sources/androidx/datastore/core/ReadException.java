package androidx.datastore.core;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ReadException<T> extends State<T> {

    @k
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(@k Throwable readException, int i11) {
        super(i11, null);
        g0.p(readException, "readException");
        this.readException = readException;
    }

    @k
    public final Throwable getReadException() {
        return this.readException;
    }
}
