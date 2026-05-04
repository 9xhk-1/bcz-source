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
/* loaded from: classes6.dex */
public class AddSingleWordRsp implements TBase<AddSingleWordRsp, _Fields>, Serializable, Cloneable, Comparable<AddSingleWordRsp> {
    private static final TStruct STRUCT_DESC = new TStruct("AddSingleWordRsp");
    private static final TField UPDATED_AT_FIELD_DESC = new TField("updated_at", (byte) 10, 1);
    private static final TField WORD_FIELD_DESC = new TField("word", (byte) 12, 2);
    private static final int __UPDATED_AT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    private _Fields[] optionals;
    public long updated_at;
    public UserBookWordDetail word;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.AddSingleWordRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$AddSingleWordRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$AddSingleWordRsp$_Fields = iArr;
            try {
                iArr[_Fields.UPDATED_AT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$AddSingleWordRsp$_Fields[_Fields.WORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddSingleWordRspStandardScheme extends StandardScheme<AddSingleWordRsp> {
        private AddSingleWordRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AddSingleWordRsp struct) throws TException {
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
                    } else if (b11 == 12) {
                        UserBookWordDetail userBookWordDetail = new UserBookWordDetail();
                        struct.word = userBookWordDetail;
                        userBookWordDetail.read(iprot);
                        struct.setWordIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.updated_at = iprot.readI64();
                    struct.setUpdated_atIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetUpdated_at()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'updated_at' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AddSingleWordRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AddSingleWordRsp.STRUCT_DESC);
            oprot.writeFieldBegin(AddSingleWordRsp.UPDATED_AT_FIELD_DESC);
            oprot.writeI64(struct.updated_at);
            oprot.writeFieldEnd();
            if (struct.word != null && struct.isSetWord()) {
                oprot.writeFieldBegin(AddSingleWordRsp.WORD_FIELD_DESC);
                struct.word.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddSingleWordRspStandardSchemeFactory implements SchemeFactory {
        private AddSingleWordRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddSingleWordRspStandardScheme getScheme() {
            return new AddSingleWordRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddSingleWordRspTupleScheme extends TupleScheme<AddSingleWordRsp> {
        private AddSingleWordRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AddSingleWordRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.updated_at = tTupleProtocol.readI64();
            struct.setUpdated_atIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                UserBookWordDetail userBookWordDetail = new UserBookWordDetail();
                struct.word = userBookWordDetail;
                userBookWordDetail.read(tTupleProtocol);
                struct.setWordIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AddSingleWordRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.updated_at);
            BitSet bitSet = new BitSet();
            if (struct.isSetWord()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetWord()) {
                struct.word.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AddSingleWordRspTupleSchemeFactory implements SchemeFactory {
        private AddSingleWordRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AddSingleWordRspTupleScheme getScheme() {
            return new AddSingleWordRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        UPDATED_AT(1, "updated_at"),
        WORD(2, "word");

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
                return UPDATED_AT;
            }
            if (fieldId != 2) {
                return null;
            }
            return WORD;
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
        hashMap.put(StandardScheme.class, new AddSingleWordRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AddSingleWordRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.UPDATED_AT, (_Fields) new FieldMetaData("updated_at", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.WORD, (_Fields) new FieldMetaData("word", (byte) 2, new StructMetaData((byte) 12, UserBookWordDetail.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AddSingleWordRsp.class, unmodifiableMap);
    }

    public AddSingleWordRsp() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD};
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
        setUpdated_atIsSet(false);
        this.updated_at = 0L;
        this.word = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AddSingleWordRsp)) {
            return equals((AddSingleWordRsp) that);
        }
        return false;
    }

    public long getUpdated_at() {
        return this.updated_at;
    }

    public UserBookWordDetail getWord() {
        return this.word;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetUpdated_at() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetWord() {
        return this.word != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AddSingleWordRsp setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
        setUpdated_atIsSet(true);
        return this;
    }

    public void setUpdated_atIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AddSingleWordRsp setWord(UserBookWordDetail word) {
        this.word = word;
        return this;
    }

    public void setWordIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddSingleWordRsp(");
        sb2.append("updated_at:");
        sb2.append(this.updated_at);
        if (isSetWord()) {
            sb2.append(j2.O);
            sb2.append("word:");
            UserBookWordDetail userBookWordDetail = this.word;
            if (userBookWordDetail == null) {
                sb2.append("null");
            } else {
                sb2.append(userBookWordDetail);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetUpdated_at() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetWord() {
        this.word = null;
    }

    public void validate() throws TException {
        UserBookWordDetail userBookWordDetail = this.word;
        if (userBookWordDetail != null) {
            userBookWordDetail.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AddSingleWordRsp other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetUpdated_at()).compareTo(Boolean.valueOf(other.isSetUpdated_at()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetUpdated_at() && (compareTo2 = TBaseHelper.compareTo(this.updated_at, other.updated_at)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetWord()).compareTo(Boolean.valueOf(other.isSetWord()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetWord() || (compareTo = TBaseHelper.compareTo((Comparable) this.word, (Comparable) other.word)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AddSingleWordRsp, _Fields> deepCopy2() {
        return new AddSingleWordRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddSingleWordRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getUpdated_at());
        }
        if (i11 == 2) {
            return getWord();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddSingleWordRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUpdated_at();
        }
        if (i11 == 2) {
            return isSetWord();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$AddSingleWordRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUpdated_at();
                return;
            } else {
                setUpdated_at(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetWord();
        } else {
            setWord((UserBookWordDetail) value);
        }
    }

    public boolean equals(AddSingleWordRsp that) {
        if (that == null || this.updated_at != that.updated_at) {
            return false;
        }
        boolean isSetWord = isSetWord();
        boolean isSetWord2 = that.isSetWord();
        if (isSetWord || isSetWord2) {
            return isSetWord && isSetWord2 && this.word.equals(that.word);
        }
        return true;
    }

    public AddSingleWordRsp(long updated_at) {
        this();
        this.updated_at = updated_at;
        setUpdated_atIsSet(true);
    }

    public AddSingleWordRsp(AddSingleWordRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD};
        this.__isset_bitfield = other.__isset_bitfield;
        this.updated_at = other.updated_at;
        if (other.isSetWord()) {
            this.word = new UserBookWordDetail(other.word);
        }
    }
}
