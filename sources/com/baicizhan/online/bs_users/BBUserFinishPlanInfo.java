package com.baicizhan.online.bs_users;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBUserFinishPlanInfo implements TBase<BBUserFinishPlanInfo, _Fields>, Serializable, Cloneable, Comparable<BBUserFinishPlanInfo> {
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __IS_BOOK_FINISHED_ISSET_ID = 3;
    private static final int __NEW_WORDS_COUNT_ISSET_ID = 2;
    private static final int __TOTAL_WORDS_COUNT_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public boolean is_book_finished;
    public int new_words_count;
    public int total_words_count;
    private static final TStruct STRUCT_DESC = new TStruct("BBUserFinishPlanInfo");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField TOTAL_WORDS_COUNT_FIELD_DESC = new TField("total_words_count", (byte) 8, 2);
    private static final TField NEW_WORDS_COUNT_FIELD_DESC = new TField("new_words_count", (byte) 8, 3);
    private static final TField IS_BOOK_FINISHED_FIELD_DESC = new TField("is_book_finished", (byte) 2, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_users.BBUserFinishPlanInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields[_Fields.TOTAL_WORDS_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields[_Fields.NEW_WORDS_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields[_Fields.IS_BOOK_FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserFinishPlanInfoStandardScheme extends StandardScheme<BBUserFinishPlanInfo> {
        private BBUserFinishPlanInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBUserFinishPlanInfo struct) throws TException {
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
                            } else if (b11 == 2) {
                                struct.is_book_finished = iprot.readBool();
                                struct.setIs_book_finishedIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.new_words_count = iprot.readI32();
                            struct.setNew_words_countIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.total_words_count = iprot.readI32();
                        struct.setTotal_words_countIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.book_id = iprot.readI32();
                    struct.setBook_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetBook_id()) {
                throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetTotal_words_count()) {
                throw new TProtocolException("Required field 'total_words_count' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetNew_words_count()) {
                throw new TProtocolException("Required field 'new_words_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetIs_book_finished()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'is_book_finished' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBUserFinishPlanInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBUserFinishPlanInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BBUserFinishPlanInfo.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBUserFinishPlanInfo.TOTAL_WORDS_COUNT_FIELD_DESC);
            oprot.writeI32(struct.total_words_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBUserFinishPlanInfo.NEW_WORDS_COUNT_FIELD_DESC);
            oprot.writeI32(struct.new_words_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBUserFinishPlanInfo.IS_BOOK_FINISHED_FIELD_DESC);
            oprot.writeBool(struct.is_book_finished);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserFinishPlanInfoStandardSchemeFactory implements SchemeFactory {
        private BBUserFinishPlanInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBUserFinishPlanInfoStandardScheme getScheme() {
            return new BBUserFinishPlanInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserFinishPlanInfoTupleScheme extends TupleScheme<BBUserFinishPlanInfo> {
        private BBUserFinishPlanInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBUserFinishPlanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.total_words_count = tTupleProtocol.readI32();
            struct.setTotal_words_countIsSet(true);
            struct.new_words_count = tTupleProtocol.readI32();
            struct.setNew_words_countIsSet(true);
            struct.is_book_finished = tTupleProtocol.readBool();
            struct.setIs_book_finishedIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBUserFinishPlanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.total_words_count);
            tTupleProtocol.writeI32(struct.new_words_count);
            tTupleProtocol.writeBool(struct.is_book_finished);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBUserFinishPlanInfoTupleSchemeFactory implements SchemeFactory {
        private BBUserFinishPlanInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBUserFinishPlanInfoTupleScheme getScheme() {
            return new BBUserFinishPlanInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        TOTAL_WORDS_COUNT(2, "total_words_count"),
        NEW_WORDS_COUNT(3, "new_words_count"),
        IS_BOOK_FINISHED(4, "is_book_finished");

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
                return BOOK_ID;
            }
            if (fieldId == 2) {
                return TOTAL_WORDS_COUNT;
            }
            if (fieldId == 3) {
                return NEW_WORDS_COUNT;
            }
            if (fieldId != 4) {
                return null;
            }
            return IS_BOOK_FINISHED;
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
        hashMap.put(StandardScheme.class, new BBUserFinishPlanInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBUserFinishPlanInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOTAL_WORDS_COUNT, (_Fields) new FieldMetaData("total_words_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NEW_WORDS_COUNT, (_Fields) new FieldMetaData("new_words_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_BOOK_FINISHED, (_Fields) new FieldMetaData("is_book_finished", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBUserFinishPlanInfo.class, unmodifiableMap);
    }

    public BBUserFinishPlanInfo() {
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
        setBook_idIsSet(false);
        this.book_id = 0;
        setTotal_words_countIsSet(false);
        this.total_words_count = 0;
        setNew_words_countIsSet(false);
        this.new_words_count = 0;
        setIs_book_finishedIsSet(false);
        this.is_book_finished = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBUserFinishPlanInfo)) {
            return equals((BBUserFinishPlanInfo) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getNew_words_count() {
        return this.new_words_count;
    }

    public int getTotal_words_count() {
        return this.total_words_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_book_finished() {
        return this.is_book_finished;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetIs_book_finished() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetNew_words_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTotal_words_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBUserFinishPlanInfo setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBUserFinishPlanInfo setIs_book_finished(boolean is_book_finished) {
        this.is_book_finished = is_book_finished;
        setIs_book_finishedIsSet(true);
        return this;
    }

    public void setIs_book_finishedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BBUserFinishPlanInfo setNew_words_count(int new_words_count) {
        this.new_words_count = new_words_count;
        setNew_words_countIsSet(true);
        return this;
    }

    public void setNew_words_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBUserFinishPlanInfo setTotal_words_count(int total_words_count) {
        this.total_words_count = total_words_count;
        setTotal_words_countIsSet(true);
        return this;
    }

    public void setTotal_words_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "BBUserFinishPlanInfo(book_id:" + this.book_id + j2.O + "total_words_count:" + this.total_words_count + j2.O + "new_words_count:" + this.new_words_count + j2.O + "is_book_finished:" + this.is_book_finished + j.f81007d;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetIs_book_finished() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetNew_words_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTotal_words_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBUserFinishPlanInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetBook_id() && (compareTo4 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetTotal_words_count()).compareTo(Boolean.valueOf(other.isSetTotal_words_count()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetTotal_words_count() && (compareTo3 = TBaseHelper.compareTo(this.total_words_count, other.total_words_count)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetNew_words_count()).compareTo(Boolean.valueOf(other.isSetNew_words_count()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetNew_words_count() && (compareTo2 = TBaseHelper.compareTo(this.new_words_count, other.new_words_count)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetIs_book_finished()).compareTo(Boolean.valueOf(other.isSetIs_book_finished()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetIs_book_finished() || (compareTo = TBaseHelper.compareTo(this.is_book_finished, other.is_book_finished)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBUserFinishPlanInfo, _Fields> deepCopy2() {
        return new BBUserFinishPlanInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getBook_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getTotal_words_count());
        }
        if (i11 == 3) {
            return Integer.valueOf(getNew_words_count());
        }
        if (i11 == 4) {
            return Boolean.valueOf(isIs_book_finished());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook_id();
        }
        if (i11 == 2) {
            return isSetTotal_words_count();
        }
        if (i11 == 3) {
            return isSetNew_words_count();
        }
        if (i11 == 4) {
            return isSetIs_book_finished();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBUserFinishPlanInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook_id();
                return;
            } else {
                setBook_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTotal_words_count();
                return;
            } else {
                setTotal_words_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetNew_words_count();
                return;
            } else {
                setNew_words_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetIs_book_finished();
        } else {
            setIs_book_finished(((Boolean) value).booleanValue());
        }
    }

    public BBUserFinishPlanInfo(int book_id, int total_words_count, int new_words_count, boolean is_book_finished) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.total_words_count = total_words_count;
        setTotal_words_countIsSet(true);
        this.new_words_count = new_words_count;
        setNew_words_countIsSet(true);
        this.is_book_finished = is_book_finished;
        setIs_book_finishedIsSet(true);
    }

    public boolean equals(BBUserFinishPlanInfo that) {
        return that != null && this.book_id == that.book_id && this.total_words_count == that.total_words_count && this.new_words_count == that.new_words_count && this.is_book_finished == that.is_book_finished;
    }

    public BBUserFinishPlanInfo(BBUserFinishPlanInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        this.total_words_count = other.total_words_count;
        this.new_words_count = other.new_words_count;
        this.is_book_finished = other.is_book_finished;
    }

    public void validate() throws TException {
    }
}
