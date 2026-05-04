package qo;

import com.google.common.base.Preconditions;
import com.google.common.net.HostAndPort;
import java.net.InetAddress;
import java.text.ParseException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@a
@go.c
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82371a;

    public b(String canonicalForm) {
        this.f82371a = canonicalForm;
    }

    @uo.a
    public static b a(String specifier) throws ParseException {
        try {
            return b(specifier);
        } catch (IllegalArgumentException e11) {
            ParseException parseException = new ParseException("Invalid host specifier: " + specifier, 0);
            parseException.initCause(e11);
            throw parseException;
        }
    }

    public static b b(String specifier) {
        InetAddress inetAddress;
        HostAndPort fromString = HostAndPort.fromString(specifier);
        Preconditions.checkArgument(!fromString.hasPort());
        String host = fromString.getHost();
        try {
            inetAddress = d.g(host);
        } catch (IllegalArgumentException unused) {
            inetAddress = null;
        }
        if (inetAddress != null) {
            return new b(d.P(inetAddress));
        }
        e d11 = e.d(host);
        if (d11.f()) {
            return new b(d11.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + host);
    }

    public static boolean c(String specifier) {
        try {
            b(specifier);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(@CheckForNull Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof b) {
            return this.f82371a.equals(((b) other).f82371a);
        }
        return false;
    }

    public int hashCode() {
        return this.f82371a.hashCode();
    }

    public String toString() {
        return this.f82371a;
    }
}
