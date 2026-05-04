package org.apache.thrift.meta_data;

import org.apache.thrift.TEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EnumMetaData extends FieldValueMetaData {
    public final Class<? extends TEnum> enumClass;

    public EnumMetaData(byte b11, Class<? extends TEnum> cls) {
        super(b11);
        this.enumClass = cls;
    }
}
