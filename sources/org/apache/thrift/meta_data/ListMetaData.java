package org.apache.thrift.meta_data;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ListMetaData extends FieldValueMetaData {
    public final FieldValueMetaData elemMetaData;

    public ListMetaData(byte b11, FieldValueMetaData fieldValueMetaData) {
        super(b11);
        this.elemMetaData = fieldValueMetaData;
    }
}
