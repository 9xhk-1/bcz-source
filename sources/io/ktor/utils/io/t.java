package io.ktor.utils.io;

import c40.t1;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Throwable f62298a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(@m80.l Throwable th2) {
        Throwable iOException;
        if (th2 == 0) {
            iOException = null;
        } else if (th2 instanceof CancellationException) {
            if (th2 instanceof c40.g0) {
                iOException = ((c40.g0) th2).createCopy();
            } else {
                String message = ((CancellationException) th2).getMessage();
                iOException = t1.a(message == null ? "Channel was cancelled" : message, th2);
            }
        } else if ((th2 instanceof IOException) && (th2 instanceof c40.g0)) {
            iOException = ((c40.g0) th2).createCopy();
        } else {
            String message2 = th2.getMessage();
            iOException = new IOException(message2 == null ? e40.u.f49167a : message2, th2);
        }
        this.f62298a = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public final Throwable a() {
        Throwable th2 = this.f62298a;
        if (th2 == 0) {
            return null;
        }
        if (th2 instanceof IOException) {
            return th2 instanceof c40.g0 ? ((c40.g0) th2).createCopy() : new IOException(((IOException) this.f62298a).getMessage(), this.f62298a);
        }
        if (!(th2 instanceof c40.g0)) {
            return t1.a(th2.getMessage(), this.f62298a);
        }
        Throwable createCopy = ((c40.g0) th2).createCopy();
        return createCopy == null ? t1.a(this.f62298a.getMessage(), this.f62298a) : createCopy;
    }
}
