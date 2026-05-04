package com.baicizhan.online.bcz_system_api;

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
public class QRCodeRedirect implements TBase<QRCodeRedirect, _Fields>, Serializable, Cloneable, Comparable<QRCodeRedirect> {
    private static final int __EXAM_CATEGORY_ID_ISSET_ID = 2;
    private static final int __EXAM_ID_ISSET_ID = 1;
    private static final int __READING_PLAN_ID_ISSET_ID = 3;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int exam_category_id;
    public int exam_id;
    private _Fields[] optionals;
    public int reading_plan_id;
    public String url;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("QRCodeRedirect");
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 1);
    private static final TField EXAM_ID_FIELD_DESC = new TField("exam_id", (byte) 8, 2);
    private static final TField EXAM_CATEGORY_ID_FIELD_DESC = new TField("exam_category_id", (byte) 8, 3);
    private static final TField URL_FIELD_DESC = new TField("url", (byte) 11, 4);
    private static final TField READING_PLAN_ID_FIELD_DESC = new TField("reading_plan_id", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.QRCodeRedirect$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields = iArr;
            try {
                iArr[_Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[_Fields.EXAM_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[_Fields.EXAM_CATEGORY_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[_Fields.URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[_Fields.READING_PLAN_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRedirectStandardScheme extends StandardScheme<QRCodeRedirect> {
        private QRCodeRedirectStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, QRCodeRedirect struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 8) {
                                    struct.reading_plan_id = iprot.readI32();
                                    struct.setReading_plan_idIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.url = iprot.readString();
                                struct.setUrlIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.exam_category_id = iprot.readI32();
                            struct.setExam_category_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.exam_id = iprot.readI32();
                        struct.setExam_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.word_level_id = iprot.readI32();
                    struct.setWord_level_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, QRCodeRedirect struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(QRCodeRedirect.STRUCT_DESC);
            if (struct.isSetWord_level_id()) {
                oprot.writeFieldBegin(QRCodeRedirect.WORD_LEVEL_ID_FIELD_DESC);
                oprot.writeI32(struct.word_level_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetExam_id()) {
                oprot.writeFieldBegin(QRCodeRedirect.EXAM_ID_FIELD_DESC);
                oprot.writeI32(struct.exam_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetExam_category_id()) {
                oprot.writeFieldBegin(QRCodeRedirect.EXAM_CATEGORY_ID_FIELD_DESC);
                oprot.writeI32(struct.exam_category_id);
                oprot.writeFieldEnd();
            }
            if (struct.url != null && struct.isSetUrl()) {
                oprot.writeFieldBegin(QRCodeRedirect.URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReading_plan_id()) {
                oprot.writeFieldBegin(QRCodeRedirect.READING_PLAN_ID_FIELD_DESC);
                oprot.writeI32(struct.reading_plan_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRedirectStandardSchemeFactory implements SchemeFactory {
        private QRCodeRedirectStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QRCodeRedirectStandardScheme getScheme() {
            return new QRCodeRedirectStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRedirectTupleScheme extends TupleScheme<QRCodeRedirect> {
        private QRCodeRedirectTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, QRCodeRedirect struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(5);
            if (readBitSet.get(0)) {
                struct.word_level_id = tTupleProtocol.readI32();
                struct.setWord_level_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.exam_id = tTupleProtocol.readI32();
                struct.setExam_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.exam_category_id = tTupleProtocol.readI32();
                struct.setExam_category_idIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.url = tTupleProtocol.readString();
                struct.setUrlIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.reading_plan_id = tTupleProtocol.readI32();
                struct.setReading_plan_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, QRCodeRedirect struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetWord_level_id()) {
                bitSet.set(0);
            }
            if (struct.isSetExam_id()) {
                bitSet.set(1);
            }
            if (struct.isSetExam_category_id()) {
                bitSet.set(2);
            }
            if (struct.isSetUrl()) {
                bitSet.set(3);
            }
            if (struct.isSetReading_plan_id()) {
                bitSet.set(4);
            }
            tTupleProtocol.writeBitSet(bitSet, 5);
            if (struct.isSetWord_level_id()) {
                tTupleProtocol.writeI32(struct.word_level_id);
            }
            if (struct.isSetExam_id()) {
                tTupleProtocol.writeI32(struct.exam_id);
            }
            if (struct.isSetExam_category_id()) {
                tTupleProtocol.writeI32(struct.exam_category_id);
            }
            if (struct.isSetUrl()) {
                tTupleProtocol.writeString(struct.url);
            }
            if (struct.isSetReading_plan_id()) {
                tTupleProtocol.writeI32(struct.reading_plan_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRedirectTupleSchemeFactory implements SchemeFactory {
        private QRCodeRedirectTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QRCodeRedirectTupleScheme getScheme() {
            return new QRCodeRedirectTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_LEVEL_ID(1, ma.b.f72894c),
        EXAM_ID(2, "exam_id"),
        EXAM_CATEGORY_ID(3, "exam_category_id"),
        URL(4, "url"),
        READING_PLAN_ID(5, "reading_plan_id");

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
                return WORD_LEVEL_ID;
            }
            if (fieldId == 2) {
                return EXAM_ID;
            }
            if (fieldId == 3) {
                return EXAM_CATEGORY_ID;
            }
            if (fieldId == 4) {
                return URL;
            }
            if (fieldId != 5) {
                return null;
            }
            return READING_PLAN_ID;
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
        hashMap.put(StandardScheme.class, new QRCodeRedirectStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new QRCodeRedirectTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EXAM_ID, (_Fields) new FieldMetaData("exam_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EXAM_CATEGORY_ID, (_Fields) new FieldMetaData("exam_category_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.URL, (_Fields) new FieldMetaData("url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.READING_PLAN_ID, (_Fields) new FieldMetaData("reading_plan_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(QRCodeRedirect.class, unmodifiableMap);
    }

    public QRCodeRedirect() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD_LEVEL_ID, _Fields.EXAM_ID, _Fields.EXAM_CATEGORY_ID, _Fields.URL, _Fields.READING_PLAN_ID};
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
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
        setExam_idIsSet(false);
        this.exam_id = 0;
        setExam_category_idIsSet(false);
        this.exam_category_id = 0;
        this.url = null;
        setReading_plan_idIsSet(false);
        this.reading_plan_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof QRCodeRedirect)) {
            return equals((QRCodeRedirect) that);
        }
        return false;
    }

    public int getExam_category_id() {
        return this.exam_category_id;
    }

    public int getExam_id() {
        return this.exam_id;
    }

    public int getReading_plan_id() {
        return this.reading_plan_id;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetExam_category_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetExam_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetReading_plan_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetUrl() {
        return this.url != null;
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public QRCodeRedirect setExam_category_id(int exam_category_id) {
        this.exam_category_id = exam_category_id;
        setExam_category_idIsSet(true);
        return this;
    }

    public void setExam_category_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public QRCodeRedirect setExam_id(int exam_id) {
        this.exam_id = exam_id;
        setExam_idIsSet(true);
        return this;
    }

    public void setExam_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public QRCodeRedirect setReading_plan_id(int reading_plan_id) {
        this.reading_plan_id = reading_plan_id;
        setReading_plan_idIsSet(true);
        return this;
    }

    public void setReading_plan_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public QRCodeRedirect setUrl(String url) {
        this.url = url;
        return this;
    }

    public void setUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.url = null;
    }

    public QRCodeRedirect setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("QRCodeRedirect(");
        boolean z12 = false;
        if (isSetWord_level_id()) {
            sb2.append("word_level_id:");
            sb2.append(this.word_level_id);
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetExam_id()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("exam_id:");
            sb2.append(this.exam_id);
            z11 = false;
        }
        if (isSetExam_category_id()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("exam_category_id:");
            sb2.append(this.exam_category_id);
            z11 = false;
        }
        if (isSetUrl()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("url:");
            String str = this.url;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        } else {
            z12 = z11;
        }
        if (isSetReading_plan_id()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("reading_plan_id:");
            sb2.append(this.reading_plan_id);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetExam_category_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetExam_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetReading_plan_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetUrl() {
        this.url = null;
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(QRCodeRedirect other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetWord_level_id() && (compareTo5 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetExam_id()).compareTo(Boolean.valueOf(other.isSetExam_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetExam_id() && (compareTo4 = TBaseHelper.compareTo(this.exam_id, other.exam_id)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetExam_category_id()).compareTo(Boolean.valueOf(other.isSetExam_category_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetExam_category_id() && (compareTo3 = TBaseHelper.compareTo(this.exam_category_id, other.exam_category_id)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetUrl()).compareTo(Boolean.valueOf(other.isSetUrl()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetUrl() && (compareTo2 = TBaseHelper.compareTo(this.url, other.url)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetReading_plan_id()).compareTo(Boolean.valueOf(other.isSetReading_plan_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetReading_plan_id() || (compareTo = TBaseHelper.compareTo(this.reading_plan_id, other.reading_plan_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<QRCodeRedirect, _Fields> deepCopy2() {
        return new QRCodeRedirect(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getWord_level_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getExam_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getExam_category_id());
        }
        if (i11 == 4) {
            return getUrl();
        }
        if (i11 == 5) {
            return Integer.valueOf(getReading_plan_id());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWord_level_id();
        }
        if (i11 == 2) {
            return isSetExam_id();
        }
        if (i11 == 3) {
            return isSetExam_category_id();
        }
        if (i11 == 4) {
            return isSetUrl();
        }
        if (i11 == 5) {
            return isSetReading_plan_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeRedirect$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWord_level_id();
                return;
            } else {
                setWord_level_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetExam_id();
                return;
            } else {
                setExam_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetExam_category_id();
                return;
            } else {
                setExam_category_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetUrl();
                return;
            } else {
                setUrl((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetReading_plan_id();
        } else {
            setReading_plan_id(((Integer) value).intValue());
        }
    }

    public boolean equals(QRCodeRedirect that) {
        if (that == null) {
            return false;
        }
        boolean isSetWord_level_id = isSetWord_level_id();
        boolean isSetWord_level_id2 = that.isSetWord_level_id();
        if ((isSetWord_level_id || isSetWord_level_id2) && !(isSetWord_level_id && isSetWord_level_id2 && this.word_level_id == that.word_level_id)) {
            return false;
        }
        boolean isSetExam_id = isSetExam_id();
        boolean isSetExam_id2 = that.isSetExam_id();
        if ((isSetExam_id || isSetExam_id2) && !(isSetExam_id && isSetExam_id2 && this.exam_id == that.exam_id)) {
            return false;
        }
        boolean isSetExam_category_id = isSetExam_category_id();
        boolean isSetExam_category_id2 = that.isSetExam_category_id();
        if ((isSetExam_category_id || isSetExam_category_id2) && !(isSetExam_category_id && isSetExam_category_id2 && this.exam_category_id == that.exam_category_id)) {
            return false;
        }
        boolean isSetUrl = isSetUrl();
        boolean isSetUrl2 = that.isSetUrl();
        if ((isSetUrl || isSetUrl2) && !(isSetUrl && isSetUrl2 && this.url.equals(that.url))) {
            return false;
        }
        boolean isSetReading_plan_id = isSetReading_plan_id();
        boolean isSetReading_plan_id2 = that.isSetReading_plan_id();
        if (isSetReading_plan_id || isSetReading_plan_id2) {
            return isSetReading_plan_id && isSetReading_plan_id2 && this.reading_plan_id == that.reading_plan_id;
        }
        return true;
    }

    public QRCodeRedirect(QRCodeRedirect other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.WORD_LEVEL_ID, _Fields.EXAM_ID, _Fields.EXAM_CATEGORY_ID, _Fields.URL, _Fields.READING_PLAN_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.word_level_id = other.word_level_id;
        this.exam_id = other.exam_id;
        this.exam_category_id = other.exam_category_id;
        if (other.isSetUrl()) {
            this.url = other.url;
        }
        this.reading_plan_id = other.reading_plan_id;
    }

    public void validate() throws TException {
    }
}
