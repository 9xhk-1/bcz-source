package org.apache.thrift.meta_data;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FieldValueMetaData implements Serializable {
    private final boolean isBinary;
    private final boolean isTypedefType;
    public final byte type;
    private final String typedefName;

    public FieldValueMetaData(byte b11, boolean z11) {
        this.type = b11;
        this.isTypedefType = false;
        this.typedefName = null;
        this.isBinary = z11;
    }

    public String getTypedefName() {
        return this.typedefName;
    }

    public boolean isBinary() {
        return this.isBinary;
    }

    public boolean isContainer() {
        byte b11 = this.type;
        return b11 == 15 || b11 == 13 || b11 == 14;
    }

    public boolean isStruct() {
        return this.type == 12;
    }

    public boolean isTypedef() {
        return this.isTypedefType;
    }

    public FieldValueMetaData(byte b11) {
        this(b11, false);
    }

    public FieldValueMetaData(byte b11, String str) {
        this.type = b11;
        this.isTypedefType = true;
        this.typedefName = str;
        this.isBinary = false;
    }
}
