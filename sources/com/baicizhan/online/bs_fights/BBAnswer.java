package com.baicizhan.online.bs_fights;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
/* loaded from: classes5.dex */
public class BBAnswer implements TBase<BBAnswer, _Fields>, Serializable, Cloneable, Comparable<BBAnswer> {
    private static final int __CORRECT_COUNT_ISSET_ID = 0;
    private static final int __USE_TIME_SECOND_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int correct_count;
    public List<BBAnswerDetail> detail;
    public int use_time_second;
    private static final TStruct STRUCT_DESC = new TStruct("BBAnswer");
    private static final TField CORRECT_COUNT_FIELD_DESC = new TField("correct_count", (byte) 8, 1);
    private static final TField USE_TIME_SECOND_FIELD_DESC = new TField("use_time_second", (byte) 8, 2);
    private static final TField DETAIL_FIELD_DESC = new TField("detail", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBAnswer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields = iArr;
            try {
                iArr[_Fields.CORRECT_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields[_Fields.USE_TIME_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields[_Fields.DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAnswerStandardScheme extends StandardScheme<BBAnswer> {
        private BBAnswerStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBAnswer struct) throws TException {
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
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.detail = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                BBAnswerDetail bBAnswerDetail = new BBAnswerDetail();
                                bBAnswerDetail.read(iprot);
                                struct.detail.add(bBAnswerDetail);
                            }
                            iprot.readListEnd();
                            struct.setDetailIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.use_time_second = iprot.readI32();
                        struct.setUse_time_secondIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.correct_count = iprot.readI32();
                    struct.setCorrect_countIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCorrect_count()) {
                throw new TProtocolException("Required field 'correct_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetUse_time_second()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'use_time_second' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBAnswer struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBAnswer.STRUCT_DESC);
            oprot.writeFieldBegin(BBAnswer.CORRECT_COUNT_FIELD_DESC);
            oprot.writeI32(struct.correct_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBAnswer.USE_TIME_SECOND_FIELD_DESC);
            oprot.writeI32(struct.use_time_second);
            oprot.writeFieldEnd();
            if (struct.detail != null) {
                oprot.writeFieldBegin(BBAnswer.DETAIL_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.detail.size()));
                Iterator<BBAnswerDetail> it = struct.detail.iterator();
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
    public static class BBAnswerStandardSchemeFactory implements SchemeFactory {
        private BBAnswerStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBAnswerStandardScheme getScheme() {
            return new BBAnswerStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAnswerTupleScheme extends TupleScheme<BBAnswer> {
        private BBAnswerTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBAnswer struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.correct_count = tTupleProtocol.readI32();
            struct.setCorrect_countIsSet(true);
            struct.use_time_second = tTupleProtocol.readI32();
            struct.setUse_time_secondIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.detail = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BBAnswerDetail bBAnswerDetail = new BBAnswerDetail();
                bBAnswerDetail.read(tTupleProtocol);
                struct.detail.add(bBAnswerDetail);
            }
            struct.setDetailIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBAnswer struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.correct_count);
            tTupleProtocol.writeI32(struct.use_time_second);
            tTupleProtocol.writeI32(struct.detail.size());
            Iterator<BBAnswerDetail> it = struct.detail.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAnswerTupleSchemeFactory implements SchemeFactory {
        private BBAnswerTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBAnswerTupleScheme getScheme() {
            return new BBAnswerTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CORRECT_COUNT(1, "correct_count"),
        USE_TIME_SECOND(2, "use_time_second"),
        DETAIL(3, "detail");

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
                return CORRECT_COUNT;
            }
            if (fieldId == 2) {
                return USE_TIME_SECOND;
            }
            if (fieldId != 3) {
                return null;
            }
            return DETAIL;
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
        hashMap.put(StandardScheme.class, new BBAnswerStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBAnswerTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CORRECT_COUNT, (_Fields) new FieldMetaData("correct_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USE_TIME_SECOND, (_Fields) new FieldMetaData("use_time_second", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DETAIL, (_Fields) new FieldMetaData("detail", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBAnswerDetail.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBAnswer.class, unmodifiableMap);
    }

    public BBAnswer() {
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

    public void addToDetail(BBAnswerDetail elem) {
        if (this.detail == null) {
            this.detail = new ArrayList();
        }
        this.detail.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setCorrect_countIsSet(false);
        this.correct_count = 0;
        setUse_time_secondIsSet(false);
        this.use_time_second = 0;
        this.detail = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBAnswer)) {
            return equals((BBAnswer) that);
        }
        return false;
    }

    public int getCorrect_count() {
        return this.correct_count;
    }

    public List<BBAnswerDetail> getDetail() {
        return this.detail;
    }

    public Iterator<BBAnswerDetail> getDetailIterator() {
        List<BBAnswerDetail> list = this.detail;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getDetailSize() {
        List<BBAnswerDetail> list = this.detail;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getUse_time_second() {
        return this.use_time_second;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCorrect_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetDetail() {
        return this.detail != null;
    }

    public boolean isSetUse_time_second() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBAnswer setCorrect_count(int correct_count) {
        this.correct_count = correct_count;
        setCorrect_countIsSet(true);
        return this;
    }

    public void setCorrect_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBAnswer setDetail(List<BBAnswerDetail> detail) {
        this.detail = detail;
        return this;
    }

    public void setDetailIsSet(boolean value) {
        if (value) {
            return;
        }
        this.detail = null;
    }

    public BBAnswer setUse_time_second(int use_time_second) {
        this.use_time_second = use_time_second;
        setUse_time_secondIsSet(true);
        return this;
    }

    public void setUse_time_secondIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBAnswer(");
        sb2.append("correct_count:");
        sb2.append(this.correct_count);
        sb2.append(j2.O);
        sb2.append("use_time_second:");
        sb2.append(this.use_time_second);
        sb2.append(j2.O);
        sb2.append("detail:");
        List<BBAnswerDetail> list = this.detail;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCorrect_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetDetail() {
        this.detail = null;
    }

    public void unsetUse_time_second() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.detail != null) {
            return;
        }
        throw new TProtocolException("Required field 'detail' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBAnswer other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetCorrect_count()).compareTo(Boolean.valueOf(other.isSetCorrect_count()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetCorrect_count() && (compareTo3 = TBaseHelper.compareTo(this.correct_count, other.correct_count)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetUse_time_second()).compareTo(Boolean.valueOf(other.isSetUse_time_second()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetUse_time_second() && (compareTo2 = TBaseHelper.compareTo(this.use_time_second, other.use_time_second)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetDetail()).compareTo(Boolean.valueOf(other.isSetDetail()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetDetail() || (compareTo = TBaseHelper.compareTo((List) this.detail, (List) other.detail)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBAnswer, _Fields> deepCopy2() {
        return new BBAnswer(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCorrect_count());
        }
        if (i11 == 2) {
            return Integer.valueOf(getUse_time_second());
        }
        if (i11 == 3) {
            return getDetail();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCorrect_count();
        }
        if (i11 == 2) {
            return isSetUse_time_second();
        }
        if (i11 == 3) {
            return isSetDetail();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBAnswer$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCorrect_count();
                return;
            } else {
                setCorrect_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetUse_time_second();
                return;
            } else {
                setUse_time_second(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetDetail();
        } else {
            setDetail((List) value);
        }
    }

    public BBAnswer(int correct_count, int use_time_second, List<BBAnswerDetail> detail) {
        this();
        this.correct_count = correct_count;
        setCorrect_countIsSet(true);
        this.use_time_second = use_time_second;
        setUse_time_secondIsSet(true);
        this.detail = detail;
    }

    public boolean equals(BBAnswer that) {
        if (that == null || this.correct_count != that.correct_count || this.use_time_second != that.use_time_second) {
            return false;
        }
        boolean isSetDetail = isSetDetail();
        boolean isSetDetail2 = that.isSetDetail();
        if (isSetDetail || isSetDetail2) {
            return isSetDetail && isSetDetail2 && this.detail.equals(that.detail);
        }
        return true;
    }

    public BBAnswer(BBAnswer other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.correct_count = other.correct_count;
        this.use_time_second = other.use_time_second;
        if (other.isSetDetail()) {
            ArrayList arrayList = new ArrayList(other.detail.size());
            Iterator<BBAnswerDetail> it = other.detail.iterator();
            while (it.hasNext()) {
                arrayList.add(new BBAnswerDetail(it.next()));
            }
            this.detail = arrayList;
        }
    }
}
