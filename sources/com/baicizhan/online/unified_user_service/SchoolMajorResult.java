package com.baicizhan.online.unified_user_service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class SchoolMajorResult implements TBase<SchoolMajorResult, _Fields>, Serializable, Cloneable, Comparable<SchoolMajorResult> {
    private static final int __HAS_NEXT_ISSET_ID = 0;
    private static final int __NUMBER_ISSET_ID = 3;
    private static final int __PAGE_NUM_ISSET_ID = 1;
    private static final int __PAGE_SIZE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean has_next;
    public List<SchoolMajorItem> majors;
    public int number;
    private _Fields[] optionals;
    public int page_num;
    public int page_size;
    private static final TStruct STRUCT_DESC = new TStruct("SchoolMajorResult");
    private static final TField HAS_NEXT_FIELD_DESC = new TField("has_next", (byte) 2, 1);
    private static final TField PAGE_NUM_FIELD_DESC = new TField("page_num", (byte) 8, 2);
    private static final TField PAGE_SIZE_FIELD_DESC = new TField("page_size", (byte) 8, 3);
    private static final TField NUMBER_FIELD_DESC = new TField("number", (byte) 8, 4);
    private static final TField MAJORS_FIELD_DESC = new TField("majors", (byte) 15, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.SchoolMajorResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields = iArr;
            try {
                iArr[_Fields.HAS_NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[_Fields.PAGE_NUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[_Fields.PAGE_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[_Fields.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[_Fields.MAJORS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorResultStandardScheme extends StandardScheme<SchoolMajorResult> {
        private SchoolMajorResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SchoolMajorResult struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 15) {
                                    TList readListBegin = iprot.readListBegin();
                                    struct.majors = new ArrayList(readListBegin.size);
                                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                        SchoolMajorItem schoolMajorItem = new SchoolMajorItem();
                                        schoolMajorItem.read(iprot);
                                        struct.majors.add(schoolMajorItem);
                                    }
                                    iprot.readListEnd();
                                    struct.setMajorsIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.number = iprot.readI32();
                                struct.setNumberIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.page_size = iprot.readI32();
                            struct.setPage_sizeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.page_num = iprot.readI32();
                        struct.setPage_numIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 2) {
                    struct.has_next = iprot.readBool();
                    struct.setHas_nextIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetHas_next()) {
                throw new TProtocolException("Required field 'has_next' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetPage_num()) {
                throw new TProtocolException("Required field 'page_num' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetPage_size()) {
                throw new TProtocolException("Required field 'page_size' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetNumber()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'number' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SchoolMajorResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SchoolMajorResult.STRUCT_DESC);
            oprot.writeFieldBegin(SchoolMajorResult.HAS_NEXT_FIELD_DESC);
            oprot.writeBool(struct.has_next);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SchoolMajorResult.PAGE_NUM_FIELD_DESC);
            oprot.writeI32(struct.page_num);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SchoolMajorResult.PAGE_SIZE_FIELD_DESC);
            oprot.writeI32(struct.page_size);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SchoolMajorResult.NUMBER_FIELD_DESC);
            oprot.writeI32(struct.number);
            oprot.writeFieldEnd();
            if (struct.majors != null && struct.isSetMajors()) {
                oprot.writeFieldBegin(SchoolMajorResult.MAJORS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.majors.size()));
                Iterator<SchoolMajorItem> it = struct.majors.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorResultStandardSchemeFactory implements SchemeFactory {
        private SchoolMajorResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolMajorResultStandardScheme getScheme() {
            return new SchoolMajorResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorResultTupleScheme extends TupleScheme<SchoolMajorResult> {
        private SchoolMajorResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SchoolMajorResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.has_next = tTupleProtocol.readBool();
            struct.setHas_nextIsSet(true);
            struct.page_num = tTupleProtocol.readI32();
            struct.setPage_numIsSet(true);
            struct.page_size = tTupleProtocol.readI32();
            struct.setPage_sizeIsSet(true);
            struct.number = tTupleProtocol.readI32();
            struct.setNumberIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.majors = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    SchoolMajorItem schoolMajorItem = new SchoolMajorItem();
                    schoolMajorItem.read(tTupleProtocol);
                    struct.majors.add(schoolMajorItem);
                }
                struct.setMajorsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SchoolMajorResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.has_next);
            tTupleProtocol.writeI32(struct.page_num);
            tTupleProtocol.writeI32(struct.page_size);
            tTupleProtocol.writeI32(struct.number);
            BitSet bitSet = new BitSet();
            if (struct.isSetMajors()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMajors()) {
                tTupleProtocol.writeI32(struct.majors.size());
                Iterator<SchoolMajorItem> it = struct.majors.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SchoolMajorResultTupleSchemeFactory implements SchemeFactory {
        private SchoolMajorResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SchoolMajorResultTupleScheme getScheme() {
            return new SchoolMajorResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        HAS_NEXT(1, "has_next"),
        PAGE_NUM(2, "page_num"),
        PAGE_SIZE(3, "page_size"),
        NUMBER(4, "number"),
        MAJORS(5, "majors");

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
                return HAS_NEXT;
            }
            if (fieldId == 2) {
                return PAGE_NUM;
            }
            if (fieldId == 3) {
                return PAGE_SIZE;
            }
            if (fieldId == 4) {
                return NUMBER;
            }
            if (fieldId != 5) {
                return null;
            }
            return MAJORS;
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
        hashMap.put(StandardScheme.class, new SchoolMajorResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SchoolMajorResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.HAS_NEXT, (_Fields) new FieldMetaData("has_next", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.PAGE_NUM, (_Fields) new FieldMetaData("page_num", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PAGE_SIZE, (_Fields) new FieldMetaData("page_size", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NUMBER, (_Fields) new FieldMetaData("number", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MAJORS, (_Fields) new FieldMetaData("majors", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SchoolMajorItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SchoolMajorResult.class, unmodifiableMap);
    }

    public SchoolMajorResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MAJORS};
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

    public void addToMajors(SchoolMajorItem elem) {
        if (this.majors == null) {
            this.majors = new ArrayList();
        }
        this.majors.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setHas_nextIsSet(false);
        this.has_next = false;
        setPage_numIsSet(false);
        this.page_num = 0;
        setPage_sizeIsSet(false);
        this.page_size = 0;
        setNumberIsSet(false);
        this.number = 0;
        this.majors = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SchoolMajorResult)) {
            return equals((SchoolMajorResult) that);
        }
        return false;
    }

    public List<SchoolMajorItem> getMajors() {
        return this.majors;
    }

    public Iterator<SchoolMajorItem> getMajorsIterator() {
        List<SchoolMajorItem> list = this.majors;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getMajorsSize() {
        List<SchoolMajorItem> list = this.majors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getNumber() {
        return this.number;
    }

    public int getPage_num() {
        return this.page_num;
    }

    public int getPage_size() {
        return this.page_size;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isHas_next() {
        return this.has_next;
    }

    public boolean isSetHas_next() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMajors() {
        return this.majors != null;
    }

    public boolean isSetNumber() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetPage_num() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetPage_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SchoolMajorResult setHas_next(boolean has_next) {
        this.has_next = has_next;
        setHas_nextIsSet(true);
        return this;
    }

    public void setHas_nextIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SchoolMajorResult setMajors(List<SchoolMajorItem> majors) {
        this.majors = majors;
        return this;
    }

    public void setMajorsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.majors = null;
    }

    public SchoolMajorResult setNumber(int number) {
        this.number = number;
        setNumberIsSet(true);
        return this;
    }

    public void setNumberIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SchoolMajorResult setPage_num(int page_num) {
        this.page_num = page_num;
        setPage_numIsSet(true);
        return this;
    }

    public void setPage_numIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SchoolMajorResult setPage_size(int page_size) {
        this.page_size = page_size;
        setPage_sizeIsSet(true);
        return this;
    }

    public void setPage_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SchoolMajorResult(");
        sb2.append("has_next:");
        sb2.append(this.has_next);
        sb2.append(j2.O);
        sb2.append("page_num:");
        sb2.append(this.page_num);
        sb2.append(j2.O);
        sb2.append("page_size:");
        sb2.append(this.page_size);
        sb2.append(j2.O);
        sb2.append("number:");
        sb2.append(this.number);
        if (isSetMajors()) {
            sb2.append(j2.O);
            sb2.append("majors:");
            List<SchoolMajorItem> list = this.majors;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetHas_next() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMajors() {
        this.majors = null;
    }

    public void unsetNumber() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetPage_num() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetPage_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SchoolMajorResult other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetHas_next()).compareTo(Boolean.valueOf(other.isSetHas_next()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetHas_next() && (compareTo5 = TBaseHelper.compareTo(this.has_next, other.has_next)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetPage_num()).compareTo(Boolean.valueOf(other.isSetPage_num()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetPage_num() && (compareTo4 = TBaseHelper.compareTo(this.page_num, other.page_num)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetPage_size()).compareTo(Boolean.valueOf(other.isSetPage_size()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetPage_size() && (compareTo3 = TBaseHelper.compareTo(this.page_size, other.page_size)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetNumber()).compareTo(Boolean.valueOf(other.isSetNumber()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetNumber() && (compareTo2 = TBaseHelper.compareTo(this.number, other.number)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetMajors()).compareTo(Boolean.valueOf(other.isSetMajors()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetMajors() || (compareTo = TBaseHelper.compareTo((List) this.majors, (List) other.majors)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SchoolMajorResult, _Fields> deepCopy2() {
        return new SchoolMajorResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(isHas_next());
        }
        if (i11 == 2) {
            return Integer.valueOf(getPage_num());
        }
        if (i11 == 3) {
            return Integer.valueOf(getPage_size());
        }
        if (i11 == 4) {
            return Integer.valueOf(getNumber());
        }
        if (i11 == 5) {
            return getMajors();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetHas_next();
        }
        if (i11 == 2) {
            return isSetPage_num();
        }
        if (i11 == 3) {
            return isSetPage_size();
        }
        if (i11 == 4) {
            return isSetNumber();
        }
        if (i11 == 5) {
            return isSetMajors();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$SchoolMajorResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetHas_next();
                return;
            } else {
                setHas_next(((Boolean) value).booleanValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPage_num();
                return;
            } else {
                setPage_num(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetPage_size();
                return;
            } else {
                setPage_size(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetNumber();
                return;
            } else {
                setNumber(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetMajors();
        } else {
            setMajors((List) value);
        }
    }

    public boolean equals(SchoolMajorResult that) {
        if (that == null || this.has_next != that.has_next || this.page_num != that.page_num || this.page_size != that.page_size || this.number != that.number) {
            return false;
        }
        boolean isSetMajors = isSetMajors();
        boolean isSetMajors2 = that.isSetMajors();
        if (isSetMajors || isSetMajors2) {
            return isSetMajors && isSetMajors2 && this.majors.equals(that.majors);
        }
        return true;
    }

    public SchoolMajorResult(boolean has_next, int page_num, int page_size, int number) {
        this();
        this.has_next = has_next;
        setHas_nextIsSet(true);
        this.page_num = page_num;
        setPage_numIsSet(true);
        this.page_size = page_size;
        setPage_sizeIsSet(true);
        this.number = number;
        setNumberIsSet(true);
    }

    public SchoolMajorResult(SchoolMajorResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MAJORS};
        this.__isset_bitfield = other.__isset_bitfield;
        this.has_next = other.has_next;
        this.page_num = other.page_num;
        this.page_size = other.page_size;
        this.number = other.number;
        if (other.isSetMajors()) {
            ArrayList arrayList = new ArrayList(other.majors.size());
            Iterator<SchoolMajorItem> it = other.majors.iterator();
            while (it.hasNext()) {
                arrayList.add(new SchoolMajorItem(it.next()));
            }
            this.majors = arrayList;
        }
    }

    public void validate() throws TException {
    }
}
