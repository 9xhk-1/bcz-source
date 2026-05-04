package org.apache.http;

import java.io.Serializable;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class ProtocolVersion implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    protected final int major;
    protected final int minor;
    protected final String protocol;

    public ProtocolVersion(String str, int i11, int i12) {
        this.protocol = (String) e80.a.j(str, "Protocol name");
        this.major = e80.a.h(i11, "Protocol major version");
        this.minor = e80.a.h(i12, "Protocol minor version");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int compareToVersion(ProtocolVersion protocolVersion) {
        e80.a.j(protocolVersion, "Protocol version");
        e80.a.c(this.protocol.equals(protocolVersion.protocol), "Versions for different protocols cannot be compared: %s %s", this, protocolVersion);
        int major = getMajor() - protocolVersion.getMajor();
        return major == 0 ? getMinor() - protocolVersion.getMinor() : major;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) obj;
        return this.protocol.equals(protocolVersion.protocol) && this.major == protocolVersion.major && this.minor == protocolVersion.minor;
    }

    public ProtocolVersion forVersion(int i11, int i12) {
        return (i11 == this.major && i12 == this.minor) ? this : new ProtocolVersion(this.protocol, i11, i12);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final boolean greaterEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) >= 0;
    }

    public final int hashCode() {
        return (this.protocol.hashCode() ^ (this.major * 100000)) ^ this.minor;
    }

    public boolean isComparable(ProtocolVersion protocolVersion) {
        return protocolVersion != null && this.protocol.equals(protocolVersion.protocol);
    }

    public final boolean lessEquals(ProtocolVersion protocolVersion) {
        return isComparable(protocolVersion) && compareToVersion(protocolVersion) <= 0;
    }

    public String toString() {
        return this.protocol + '/' + Integer.toString(this.major) + '.' + Integer.toString(this.minor);
    }
}
