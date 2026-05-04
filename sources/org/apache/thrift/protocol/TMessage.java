package org.apache.thrift.protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TMessage {
    public final String name;
    public final int seqid;
    public final byte type;

    public TMessage() {
        this("", (byte) 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TMessage.class != obj.getClass()) {
            return false;
        }
        TMessage tMessage = (TMessage) obj;
        String str = this.name;
        if (str == null) {
            if (tMessage.name != null) {
                return false;
            }
        } else if (!str.equals(tMessage.name)) {
            return false;
        }
        return this.seqid == tMessage.seqid && this.type == tMessage.type;
    }

    public int hashCode() {
        String str = this.name;
        return (((((str == null ? 0 : str.hashCode()) + 31) * 31) + this.seqid) * 31) + this.type;
    }

    public String toString() {
        return "<TMessage name:'" + this.name + "' type: " + ((int) this.type) + " seqid:" + this.seqid + ">";
    }

    public TMessage(String str, byte b11, int i11) {
        this.name = str;
        this.type = b11;
        this.seqid = i11;
    }
}
