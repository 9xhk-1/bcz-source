package org.apache.thrift.protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TField {

    /* renamed from: id, reason: collision with root package name */
    public final short f77768id;
    public final String name;
    public final byte type;

    public TField() {
        this("", (byte) 0, (short) 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TField tField = (TField) obj;
        return this.type == tField.type && this.f77768id == tField.f77768id;
    }

    public int hashCode() {
        int i11 = (this.f77768id + 31) * 31;
        String str = this.name;
        return ((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.type;
    }

    public String toString() {
        return "<TField name:'" + this.name + "' type:" + ((int) this.type) + " field-id:" + ((int) this.f77768id) + ">";
    }

    public TField(String str, byte b11, short s11) {
        this.name = str;
        this.type = b11;
        this.f77768id = s11;
    }
}
