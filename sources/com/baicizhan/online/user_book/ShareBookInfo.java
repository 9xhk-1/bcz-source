package com.baicizhan.online.user_book;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
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
/* loaded from: classes6.dex */
public class ShareBookInfo implements TBase<ShareBookInfo, _Fields>, Serializable, Cloneable, Comparable<ShareBookInfo> {
    private static final int __VALID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String book_name;
    private _Fields[] optionals;
    public boolean valid;
    private static final TStruct STRUCT_DESC = new TStruct("ShareBookInfo");
    private static final TField VALID_FIELD_DESC = new TField("valid", (byte) 2, 1);
    private static final TField BOOK_NAME_FIELD_DESC = new TField("book_name", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.ShareBookInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$ShareBookInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$ShareBookInfo$_Fields = iArr;
            try {
                iArr[_Fields.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$ShareBookInfo$_Fields[_Fields.BOOK_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareBookInfoStandardScheme extends StandardScheme<ShareBookInfo> {
        private ShareBookInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ShareBookInfo struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.book_name = iprot.readString();
                        struct.setBook_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 2) {
                    struct.valid = iprot.readBool();
                    struct.setValidIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetValid()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'valid' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ShareBookInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ShareBookInfo.STRUCT_DESC);
            oprot.writeFieldBegin(ShareBookInfo.VALID_FIELD_DESC);
            oprot.writeBool(struct.valid);
            oprot.writeFieldEnd();
            if (struct.book_name != null && struct.isSetBook_name()) {
                oprot.writeFieldBegin(ShareBookInfo.BOOK_NAME_FIELD_DESC);
                oprot.writeString(struct.book_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareBookInfoStandardSchemeFactory implements SchemeFactory {
        private ShareBookInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShareBookInfoStandardScheme getScheme() {
            return new ShareBookInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareBookInfoTupleScheme extends TupleScheme<ShareBookInfo> {
        private ShareBookInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ShareBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.valid = tTupleProtocol.readBool();
            struct.setValidIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.book_name = tTupleProtocol.readString();
                struct.setBook_nameIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ShareBookInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.valid);
            BitSet bitSet = new BitSet();
            if (struct.isSetBook_name()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetBook_name()) {
                tTupleProtocol.writeString(struct.book_name);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareBookInfoTupleSchemeFactory implements SchemeFactory {
        private ShareBookInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShareBookInfoTupleScheme getScheme() {
            return new ShareBookInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        VALID(1, "valid"),
        BOOK_NAME(2, "book_name");

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
                return VALID;
            }
            if (fieldId != 2) {
                return null;
            }
            return BOOK_NAME;
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
        hashMap.put(StandardScheme.class, new ShareBookInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ShareBookInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.VALID, (_Fields) new FieldMetaData("valid", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.BOOK_NAME, (_Fields) new FieldMetaData("book_name", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ShareBookInfo.class, unmodifiableMap);
    }

    public ShareBookInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BOOK_NAME};
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
        setValidIsSet(false);
        this.valid = false;
        this.book_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ShareBookInfo)) {
            return equals((ShareBookInfo) that);
        }
        return false;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_name() {
        return this.book_name != null;
    }

    public boolean isSetValid() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isValid() {
        return this.valid;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ShareBookInfo setBook_name(String book_name) {
        this.book_name = book_name;
        return this;
    }

    public void setBook_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book_name = null;
    }

    public ShareBookInfo setValid(boolean valid) {
        this.valid = valid;
        setValidIsSet(true);
        return this;
    }

    public void setValidIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShareBookInfo(");
        sb2.append("valid:");
        sb2.append(this.valid);
        if (isSetBook_name()) {
            sb2.append(j2.O);
            sb2.append("book_name:");
            String str = this.book_name;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_name() {
        this.book_name = null;
    }

    public void unsetValid() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ShareBookInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetValid()).compareTo(Boolean.valueOf(other.isSetValid()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetValid() && (compareTo2 = TBaseHelper.compareTo(this.valid, other.valid)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetBook_name()).compareTo(Boolean.valueOf(other.isSetBook_name()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetBook_name() || (compareTo = TBaseHelper.compareTo(this.book_name, other.book_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ShareBookInfo, _Fields> deepCopy2() {
        return new ShareBookInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$ShareBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(isValid());
        }
        if (i11 == 2) {
            return getBook_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$ShareBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetValid();
        }
        if (i11 == 2) {
            return isSetBook_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$ShareBookInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetValid();
                return;
            } else {
                setValid(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetBook_name();
        } else {
            setBook_name((String) value);
        }
    }

    public boolean equals(ShareBookInfo that) {
        if (that == null || this.valid != that.valid) {
            return false;
        }
        boolean isSetBook_name = isSetBook_name();
        boolean isSetBook_name2 = that.isSetBook_name();
        if (isSetBook_name || isSetBook_name2) {
            return isSetBook_name && isSetBook_name2 && this.book_name.equals(that.book_name);
        }
        return true;
    }

    public ShareBookInfo(boolean valid) {
        this();
        this.valid = valid;
        setValidIsSet(true);
    }

    public ShareBookInfo(ShareBookInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BOOK_NAME};
        this.__isset_bitfield = other.__isset_bitfield;
        this.valid = other.valid;
        if (other.isSetBook_name()) {
            this.book_name = other.book_name;
        }
    }

    public void validate() throws TException {
    }
}
