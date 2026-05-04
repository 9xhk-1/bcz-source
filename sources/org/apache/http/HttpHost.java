package org.apache.http;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class HttpHost implements Cloneable, Serializable {
    public static final String DEFAULT_SCHEME_NAME = "http";
    private static final long serialVersionUID = -7529410654042457626L;
    protected final InetAddress address;
    protected final String hostname;
    protected final String lcHostname;
    protected final int port;
    protected final String schemeName;

    public HttpHost(String str, int i11, String str2) {
        this.hostname = (String) e80.a.d(str, "Host name");
        Locale locale = Locale.ROOT;
        this.lcHostname = str.toLowerCase(locale);
        if (str2 != null) {
            this.schemeName = str2.toLowerCase(locale);
        } else {
            this.schemeName = "http";
        }
        this.port = i11;
        this.address = null;
    }

    public static HttpHost create(String str) {
        String str2;
        int i11;
        e80.a.d(str, "HTTP Host");
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 3);
        } else {
            str2 = null;
        }
        int lastIndexOf = str.lastIndexOf(":");
        if (lastIndexOf > 0) {
            try {
                i11 = Integer.parseInt(str.substring(lastIndexOf + 1));
                str = str.substring(0, lastIndexOf);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Invalid HTTP host: " + str);
            }
        } else {
            i11 = -1;
        }
        return new HttpHost(str, i11, str2);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpHost) {
            HttpHost httpHost = (HttpHost) obj;
            if (this.lcHostname.equals(httpHost.lcHostname) && this.port == httpHost.port && this.schemeName.equals(httpHost.schemeName)) {
                InetAddress inetAddress = this.address;
                InetAddress inetAddress2 = httpHost.address;
                if (inetAddress != null ? inetAddress.equals(inetAddress2) : inetAddress2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public String getHostName() {
        return this.hostname;
    }

    public int getPort() {
        return this.port;
    }

    public String getSchemeName() {
        return this.schemeName;
    }

    public int hashCode() {
        int d11 = e80.g.d(e80.g.c(e80.g.d(17, this.lcHostname), this.port), this.schemeName);
        InetAddress inetAddress = this.address;
        return inetAddress != null ? e80.g.d(d11, inetAddress) : d11;
    }

    public String toHostString() {
        if (this.port == -1) {
            return this.hostname;
        }
        StringBuilder sb2 = new StringBuilder(this.hostname.length() + 6);
        sb2.append(this.hostname);
        sb2.append(":");
        sb2.append(Integer.toString(this.port));
        return sb2.toString();
    }

    public String toString() {
        return toURI();
    }

    public String toURI() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.schemeName);
        sb2.append("://");
        sb2.append(this.hostname);
        if (this.port != -1) {
            sb2.append(':');
            sb2.append(Integer.toString(this.port));
        }
        return sb2.toString();
    }

    public HttpHost(String str, int i11) {
        this(str, i11, (String) null);
    }

    public HttpHost(String str) {
        this(str, -1, (String) null);
    }

    public HttpHost(InetAddress inetAddress, int i11, String str) {
        this((InetAddress) e80.a.j(inetAddress, "Inet address"), inetAddress.getHostName(), i11, str);
    }

    public HttpHost(InetAddress inetAddress, String str, int i11, String str2) {
        this.address = (InetAddress) e80.a.j(inetAddress, "Inet address");
        String str3 = (String) e80.a.j(str, "Hostname");
        this.hostname = str3;
        Locale locale = Locale.ROOT;
        this.lcHostname = str3.toLowerCase(locale);
        if (str2 != null) {
            this.schemeName = str2.toLowerCase(locale);
        } else {
            this.schemeName = "http";
        }
        this.port = i11;
    }

    public HttpHost(InetAddress inetAddress, int i11) {
        this(inetAddress, i11, (String) null);
    }

    public HttpHost(InetAddress inetAddress) {
        this(inetAddress, -1, (String) null);
    }

    public HttpHost(HttpHost httpHost) {
        e80.a.j(httpHost, "HTTP host");
        this.hostname = httpHost.hostname;
        this.lcHostname = httpHost.lcHostname;
        this.schemeName = httpHost.schemeName;
        this.port = httpHost.port;
        this.address = httpHost.address;
    }
}
