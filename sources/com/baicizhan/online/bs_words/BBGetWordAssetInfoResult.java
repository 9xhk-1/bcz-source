package com.baicizhan.online.bs_words;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.transport.TIOStreamTransport;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBGetWordAssetInfoResult implements TBase<BBGetWordAssetInfoResult, _Fields>, Serializable, Cloneable, Comparable<BBGetWordAssetInfoResult> {
    private static final int __BOOK_ID_ISSET_ID = 1;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public BBTopicAssetV2 asset_info;
    public int book_id;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBGetWordAssetInfoResult");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 2);
    private static final TField ASSET_INFO_FIELD_DESC = new TField("asset_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBGetWordAssetInfoResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields[_Fields.BOOK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields[_Fields.ASSET_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBGetWordAssetInfoResultStandardScheme extends StandardScheme<BBGetWordAssetInfoResult> {
        private BBGetWordAssetInfoResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBGetWordAssetInfoResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            BBTopicAssetV2 bBTopicAssetV2 = new BBTopicAssetV2();
                            struct.asset_info = bBTopicAssetV2;
                            bBTopicAssetV2.read(iprot);
                            struct.setAsset_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.book_id = iprot.readI32();
                        struct.setBook_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.topic_id = iprot.readI32();
                    struct.setTopic_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTopic_id()) {
                throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetBook_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBGetWordAssetInfoResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBGetWordAssetInfoResult.STRUCT_DESC);
            oprot.writeFieldBegin(BBGetWordAssetInfoResult.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBGetWordAssetInfoResult.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            if (struct.asset_info != null) {
                oprot.writeFieldBegin(BBGetWordAssetInfoResult.ASSET_INFO_FIELD_DESC);
                struct.asset_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBGetWordAssetInfoResultStandardSchemeFactory implements SchemeFactory {
        private BBGetWordAssetInfoResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBGetWordAssetInfoResultStandardScheme getScheme() {
            return new BBGetWordAssetInfoResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBGetWordAssetInfoResultTupleScheme extends TupleScheme<BBGetWordAssetInfoResult> {
        private BBGetWordAssetInfoResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBGetWordAssetInfoResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            BBTopicAssetV2 bBTopicAssetV2 = new BBTopicAssetV2();
            struct.asset_info = bBTopicAssetV2;
            bBTopicAssetV2.read(tTupleProtocol);
            struct.setAsset_infoIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBGetWordAssetInfoResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.book_id);
            struct.asset_info.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBGetWordAssetInfoResultTupleSchemeFactory implements SchemeFactory {
        private BBGetWordAssetInfoResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBGetWordAssetInfoResultTupleScheme getScheme() {
            return new BBGetWordAssetInfoResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        BOOK_ID(2, "book_id"),
        ASSET_INFO(3, "asset_info");

        private static final Map<String, _Fields> byName = new HashMap();
        private final String _fieldName;
        private final short _thriftId;

        static {
            Iterator it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        _Fields(short thriftId, String fieldName) {
            this._thriftId = thriftId;
            this._fieldName = fieldName;
        }

        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public static _Fields findByThriftId(int fieldId) {
            if (fieldId == 1) {
                return TOPIC_ID;
            }
            if (fieldId == 2) {
                return BOOK_ID;
            }
            if (fieldId != 3) {
                return null;
            }
            return ASSET_INFO;
        }

        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields findByThriftId = findByThriftId(fieldId);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public String getFieldName() {
            return this._fieldName;
        }

        @Override // org.apache.thrift.TFieldIdEnum
        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(StandardScheme.class, new BBGetWordAssetInfoResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBGetWordAssetInfoResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ASSET_INFO, (_Fields) new FieldMetaData("asset_info", (byte) 1, new StructMetaData((byte) 12, BBTopicAssetV2.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBGetWordAssetInfoResult.class, unmodifiableMap);
    }

    public BBGetWordAssetInfoResult() {
        this.__isset_bitfield = (byte) 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new TCompactProtocol(new TIOStreamTransport(in2)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport(out)));
        } catch (TException e11) {
            throw new IOException(e11);
        }
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTopic_idIsSet(false);
        this.topic_id = 0;
        setBook_idIsSet(false);
        this.book_id = 0;
        this.asset_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBGetWordAssetInfoResult)) {
            return equals((BBGetWordAssetInfoResult) that);
        }
        return false;
    }

    public BBTopicAssetV2 getAsset_info() {
        return this.asset_info;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAsset_info() {
        return this.asset_info != null;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBGetWordAssetInfoResult setAsset_info(BBTopicAssetV2 asset_info) {
        this.asset_info = asset_info;
        return this;
    }

    public void setAsset_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.asset_info = null;
    }

    public BBGetWordAssetInfoResult setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBGetWordAssetInfoResult setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBGetWordAssetInfoResult(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(j2.O);
        sb2.append("asset_info:");
        BBTopicAssetV2 bBTopicAssetV2 = this.asset_info;
        if (bBTopicAssetV2 == null) {
            sb2.append("null");
        } else {
            sb2.append(bBTopicAssetV2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAsset_info() {
        this.asset_info = null;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        BBTopicAssetV2 bBTopicAssetV2 = this.asset_info;
        if (bBTopicAssetV2 != null) {
            if (bBTopicAssetV2 != null) {
                bBTopicAssetV2.validate();
            }
        } else {
            throw new TProtocolException("Required field 'asset_info' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBGetWordAssetInfoResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTopic_id() && (compareTo3 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBook_id() && (compareTo2 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetAsset_info()).compareTo(Boolean.valueOf(other.isSetAsset_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetAsset_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.asset_info, (Comparable) other.asset_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBGetWordAssetInfoResult, _Fields> deepCopy2() {
        return new BBGetWordAssetInfoResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getBook_id());
        }
        if (i11 == 3) {
            return getAsset_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetBook_id();
        }
        if (i11 == 3) {
            return isSetAsset_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBGetWordAssetInfoResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_id();
                return;
            } else {
                setTopic_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBook_id();
                return;
            } else {
                setBook_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetAsset_info();
        } else {
            setAsset_info((BBTopicAssetV2) value);
        }
    }

    public BBGetWordAssetInfoResult(int topic_id, int book_id, BBTopicAssetV2 asset_info) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.asset_info = asset_info;
    }

    public boolean equals(BBGetWordAssetInfoResult that) {
        if (that == null || this.topic_id != that.topic_id || this.book_id != that.book_id) {
            return false;
        }
        boolean isSetAsset_info = isSetAsset_info();
        boolean isSetAsset_info2 = that.isSetAsset_info();
        if (isSetAsset_info || isSetAsset_info2) {
            return isSetAsset_info && isSetAsset_info2 && this.asset_info.equals(that.asset_info);
        }
        return true;
    }

    public BBGetWordAssetInfoResult(BBGetWordAssetInfoResult other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.book_id = other.book_id;
        if (other.isSetAsset_info()) {
            this.asset_info = new BBTopicAssetV2(other.asset_info);
        }
    }
}
