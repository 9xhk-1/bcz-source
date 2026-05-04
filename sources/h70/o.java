package h70;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import org.apache.http.impl.nio.reactor.SSLMode;
import org.apache.http.params.HttpParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public class o extends y70.e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58814a;

        static {
            int[] iArr = new int[SSLMode.values().length];
            f58814a = iArr;
            try {
                iArr[SSLMode.CLIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58814a[SSLMode.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(x70.f fVar, SSLContext sSLContext, r rVar) {
        super(fVar, org.apache.http.nio.reactor.ssl.SSLMode.CLIENT, sSLContext, rVar != null ? new s(rVar) : null);
    }

    public synchronized void L(SSLMode sSLMode, HttpParams httpParams) throws SSLException {
        try {
            y70.f v11 = v();
            if (v11 instanceof q) {
                ((q) v11).c(httpParams);
            } else if (v11 instanceof s) {
                ((s) v11).c(httpParams);
            }
            z(M(sSLMode));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final org.apache.http.nio.reactor.ssl.SSLMode M(SSLMode sSLMode) {
        int i11 = a.f58814a[sSLMode.ordinal()];
        if (i11 == 1) {
            return org.apache.http.nio.reactor.ssl.SSLMode.CLIENT;
        }
        if (i11 != 2) {
            return null;
        }
        return org.apache.http.nio.reactor.ssl.SSLMode.SERVER;
    }

    public o(x70.f fVar, SSLContext sSLContext, p pVar) {
        super(fVar, org.apache.http.nio.reactor.ssl.SSLMode.CLIENT, sSLContext, pVar != null ? new q(pVar) : null);
    }
}
