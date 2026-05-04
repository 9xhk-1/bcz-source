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
public class BBWordAssetPackInfo implements TBase<BBWordAssetPackInfo, _Fields>, Serializable, Cloneable, Comparable<BBWordAssetPackInfo> {
    private static final int __MAX_ID_ISSET_ID = 1;
    private static final int __MIN_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String asset_zpack_path;
    public int max_id;
    public int min_id;
    public String word_info_gz_path;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordAssetPackInfo");
    private static final TField MIN_ID_FIELD_DESC = new TField("min_id", (byte) 8, 1);
    private static final TField MAX_ID_FIELD_DESC = new TField("max_id", (byte) 8, 2);
    private static final TField WORD_INFO_GZ_PATH_FIELD_DESC = new TField("word_info_gz_path", (byte) 11, 3);
    private static final TField ASSET_ZPACK_PATH_FIELD_DESC = new TField("asset_zpack_path", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordAssetPackInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields = iArr;
            try {
                iArr[_Fields.MIN_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields[_Fields.MAX_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields[_Fields.WORD_INFO_GZ_PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields[_Fields.ASSET_ZPACK_PATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordAssetPackInfoStandardScheme extends StandardScheme<BBWordAssetPackInfo> {
        private BBWordAssetPackInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordAssetPackInfo struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.asset_zpack_path = iprot.readString();
                                struct.setAsset_zpack_pathIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.word_info_gz_path = iprot.readString();
                            struct.setWord_info_gz_pathIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.max_id = iprot.readI32();
                        struct.setMax_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.min_id = iprot.readI32();
                    struct.setMin_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetMin_id()) {
                throw new TProtocolException("Required field 'min_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetMax_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'max_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBWordAssetPackInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordAssetPackInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BBWordAssetPackInfo.MIN_ID_FIELD_DESC);
            oprot.writeI32(struct.min_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBWordAssetPackInfo.MAX_ID_FIELD_DESC);
            oprot.writeI32(struct.max_id);
            oprot.writeFieldEnd();
            if (struct.word_info_gz_path != null) {
                oprot.writeFieldBegin(BBWordAssetPackInfo.WORD_INFO_GZ_PATH_FIELD_DESC);
                oprot.writeString(struct.word_info_gz_path);
                oprot.writeFieldEnd();
            }
            if (struct.asset_zpack_path != null) {
                oprot.writeFieldBegin(BBWordAssetPackInfo.ASSET_ZPACK_PATH_FIELD_DESC);
                oprot.writeString(struct.asset_zpack_path);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordAssetPackInfoStandardSchemeFactory implements SchemeFactory {
        private BBWordAssetPackInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordAssetPackInfoStandardScheme getScheme() {
            return new BBWordAssetPackInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordAssetPackInfoTupleScheme extends TupleScheme<BBWordAssetPackInfo> {
        private BBWordAssetPackInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordAssetPackInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.min_id = tTupleProtocol.readI32();
            struct.setMin_idIsSet(true);
            struct.max_id = tTupleProtocol.readI32();
            struct.setMax_idIsSet(true);
            struct.word_info_gz_path = tTupleProtocol.readString();
            struct.setWord_info_gz_pathIsSet(true);
            struct.asset_zpack_path = tTupleProtocol.readString();
            struct.setAsset_zpack_pathIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordAssetPackInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.min_id);
            tTupleProtocol.writeI32(struct.max_id);
            tTupleProtocol.writeString(struct.word_info_gz_path);
            tTupleProtocol.writeString(struct.asset_zpack_path);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordAssetPackInfoTupleSchemeFactory implements SchemeFactory {
        private BBWordAssetPackInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordAssetPackInfoTupleScheme getScheme() {
            return new BBWordAssetPackInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MIN_ID(1, "min_id"),
        MAX_ID(2, "max_id"),
        WORD_INFO_GZ_PATH(3, "word_info_gz_path"),
        ASSET_ZPACK_PATH(4, "asset_zpack_path");

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
                return MIN_ID;
            }
            if (fieldId == 2) {
                return MAX_ID;
            }
            if (fieldId == 3) {
                return WORD_INFO_GZ_PATH;
            }
            if (fieldId != 4) {
                return null;
            }
            return ASSET_ZPACK_PATH;
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
        hashMap.put(StandardScheme.class, new BBWordAssetPackInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordAssetPackInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MIN_ID, (_Fields) new FieldMetaData("min_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MAX_ID, (_Fields) new FieldMetaData("max_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.WORD_INFO_GZ_PATH, (_Fields) new FieldMetaData("word_info_gz_path", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ASSET_ZPACK_PATH, (_Fields) new FieldMetaData("asset_zpack_path", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordAssetPackInfo.class, unmodifiableMap);
    }

    public BBWordAssetPackInfo() {
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
        setMin_idIsSet(false);
        this.min_id = 0;
        setMax_idIsSet(false);
        this.max_id = 0;
        this.word_info_gz_path = null;
        this.asset_zpack_path = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordAssetPackInfo)) {
            return equals((BBWordAssetPackInfo) that);
        }
        return false;
    }

    public String getAsset_zpack_path() {
        return this.asset_zpack_path;
    }

    public int getMax_id() {
        return this.max_id;
    }

    public int getMin_id() {
        return this.min_id;
    }

    public String getWord_info_gz_path() {
        return this.word_info_gz_path;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAsset_zpack_path() {
        return this.asset_zpack_path != null;
    }

    public boolean isSetMax_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMin_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord_info_gz_path() {
        return this.word_info_gz_path != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordAssetPackInfo setAsset_zpack_path(String asset_zpack_path) {
        this.asset_zpack_path = asset_zpack_path;
        return this;
    }

    public void setAsset_zpack_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.asset_zpack_path = null;
    }

    public BBWordAssetPackInfo setMax_id(int max_id) {
        this.max_id = max_id;
        setMax_idIsSet(true);
        return this;
    }

    public void setMax_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBWordAssetPackInfo setMin_id(int min_id) {
        this.min_id = min_id;
        setMin_idIsSet(true);
        return this;
    }

    public void setMin_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBWordAssetPackInfo setWord_info_gz_path(String word_info_gz_path) {
        this.word_info_gz_path = word_info_gz_path;
        return this;
    }

    public void setWord_info_gz_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_info_gz_path = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordAssetPackInfo(");
        sb2.append("min_id:");
        sb2.append(this.min_id);
        sb2.append(j2.O);
        sb2.append("max_id:");
        sb2.append(this.max_id);
        sb2.append(j2.O);
        sb2.append("word_info_gz_path:");
        String str = this.word_info_gz_path;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("asset_zpack_path:");
        String str2 = this.asset_zpack_path;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAsset_zpack_path() {
        this.asset_zpack_path = null;
    }

    public void unsetMax_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMin_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord_info_gz_path() {
        this.word_info_gz_path = null;
    }

    public void validate() throws TException {
        if (this.word_info_gz_path == null) {
            throw new TProtocolException("Required field 'word_info_gz_path' was not present! Struct: " + toString());
        }
        if (this.asset_zpack_path != null) {
            return;
        }
        throw new TProtocolException("Required field 'asset_zpack_path' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordAssetPackInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetMin_id()).compareTo(Boolean.valueOf(other.isSetMin_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetMin_id() && (compareTo4 = TBaseHelper.compareTo(this.min_id, other.min_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetMax_id()).compareTo(Boolean.valueOf(other.isSetMax_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetMax_id() && (compareTo3 = TBaseHelper.compareTo(this.max_id, other.max_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetWord_info_gz_path()).compareTo(Boolean.valueOf(other.isSetWord_info_gz_path()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetWord_info_gz_path() && (compareTo2 = TBaseHelper.compareTo(this.word_info_gz_path, other.word_info_gz_path)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetAsset_zpack_path()).compareTo(Boolean.valueOf(other.isSetAsset_zpack_path()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetAsset_zpack_path() || (compareTo = TBaseHelper.compareTo(this.asset_zpack_path, other.asset_zpack_path)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordAssetPackInfo, _Fields> deepCopy2() {
        return new BBWordAssetPackInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMin_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getMax_id());
        }
        if (i11 == 3) {
            return getWord_info_gz_path();
        }
        if (i11 == 4) {
            return getAsset_zpack_path();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMin_id();
        }
        if (i11 == 2) {
            return isSetMax_id();
        }
        if (i11 == 3) {
            return isSetWord_info_gz_path();
        }
        if (i11 == 4) {
            return isSetAsset_zpack_path();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordAssetPackInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMin_id();
                return;
            } else {
                setMin_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetMax_id();
                return;
            } else {
                setMax_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetWord_info_gz_path();
                return;
            } else {
                setWord_info_gz_path((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetAsset_zpack_path();
        } else {
            setAsset_zpack_path((String) value);
        }
    }

    public BBWordAssetPackInfo(int min_id, int max_id, String word_info_gz_path, String asset_zpack_path) {
        this();
        this.min_id = min_id;
        setMin_idIsSet(true);
        this.max_id = max_id;
        setMax_idIsSet(true);
        this.word_info_gz_path = word_info_gz_path;
        this.asset_zpack_path = asset_zpack_path;
    }

    public boolean equals(BBWordAssetPackInfo that) {
        if (that == null || this.min_id != that.min_id || this.max_id != that.max_id) {
            return false;
        }
        boolean isSetWord_info_gz_path = isSetWord_info_gz_path();
        boolean isSetWord_info_gz_path2 = that.isSetWord_info_gz_path();
        if ((isSetWord_info_gz_path || isSetWord_info_gz_path2) && !(isSetWord_info_gz_path && isSetWord_info_gz_path2 && this.word_info_gz_path.equals(that.word_info_gz_path))) {
            return false;
        }
        boolean isSetAsset_zpack_path = isSetAsset_zpack_path();
        boolean isSetAsset_zpack_path2 = that.isSetAsset_zpack_path();
        if (isSetAsset_zpack_path || isSetAsset_zpack_path2) {
            return isSetAsset_zpack_path && isSetAsset_zpack_path2 && this.asset_zpack_path.equals(that.asset_zpack_path);
        }
        return true;
    }

    public BBWordAssetPackInfo(BBWordAssetPackInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.min_id = other.min_id;
        this.max_id = other.max_id;
        if (other.isSetWord_info_gz_path()) {
            this.word_info_gz_path = other.word_info_gz_path;
        }
        if (other.isSetAsset_zpack_path()) {
            this.asset_zpack_path = other.asset_zpack_path;
        }
    }
}
