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
public class BBCollectWordPair implements TBase<BBCollectWordPair, _Fields>, Serializable, Cloneable, Comparable<BBCollectWordPair> {
    private static final int __TOPIC_ID_ISSET_ID = 1;
    private static final int __WORD_LEVEL_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int topic_id;
    public int word_level_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBCollectWordPair");
    private static final TField WORD_LEVEL_ID_FIELD_DESC = new TField(ma.b.f72894c, (byte) 8, 1);
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBCollectWordPair$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBCollectWordPair$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBCollectWordPair$_Fields = iArr;
            try {
                iArr[_Fields.WORD_LEVEL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBCollectWordPair$_Fields[_Fields.TOPIC_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCollectWordPairStandardScheme extends StandardScheme<BBCollectWordPair> {
        private BBCollectWordPairStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBCollectWordPair struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.topic_id = iprot.readI32();
                        struct.setTopic_idIsSet(true);
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
            iprot.readStructEnd();
            if (!struct.isSetWord_level_id()) {
                throw new TProtocolException("Required field 'word_level_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetTopic_id()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBCollectWordPair struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBCollectWordPair.STRUCT_DESC);
            oprot.writeFieldBegin(BBCollectWordPair.WORD_LEVEL_ID_FIELD_DESC);
            oprot.writeI32(struct.word_level_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBCollectWordPair.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCollectWordPairStandardSchemeFactory implements SchemeFactory {
        private BBCollectWordPairStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBCollectWordPairStandardScheme getScheme() {
            return new BBCollectWordPairStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCollectWordPairTupleScheme extends TupleScheme<BBCollectWordPair> {
        private BBCollectWordPairTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBCollectWordPair struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.word_level_id = tTupleProtocol.readI32();
            struct.setWord_level_idIsSet(true);
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBCollectWordPair struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.word_level_id);
            tTupleProtocol.writeI32(struct.topic_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBCollectWordPairTupleSchemeFactory implements SchemeFactory {
        private BBCollectWordPairTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBCollectWordPairTupleScheme getScheme() {
            return new BBCollectWordPairTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        WORD_LEVEL_ID(1, ma.b.f72894c),
        TOPIC_ID(2, "topic_id");

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
            if (fieldId != 2) {
                return null;
            }
            return TOPIC_ID;
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
        hashMap.put(StandardScheme.class, new BBCollectWordPairStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBCollectWordPairTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.WORD_LEVEL_ID, (_Fields) new FieldMetaData(ma.b.f72894c, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBCollectWordPair.class, unmodifiableMap);
    }

    public BBCollectWordPair() {
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
        setWord_level_idIsSet(false);
        this.word_level_id = 0;
        setTopic_idIsSet(false);
        this.topic_id = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBCollectWordPair)) {
            return equals((BBCollectWordPair) that);
        }
        return false;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int getWord_level_id() {
        return this.word_level_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetWord_level_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBCollectWordPair setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBCollectWordPair setWord_level_id(int word_level_id) {
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        return this;
    }

    public void setWord_level_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "BBCollectWordPair(word_level_id:" + this.word_level_id + j2.O + "topic_id:" + this.topic_id + pn.j.f81007d;
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetWord_level_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBCollectWordPair other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetWord_level_id()).compareTo(Boolean.valueOf(other.isSetWord_level_id()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetWord_level_id() && (compareTo2 = TBaseHelper.compareTo(this.word_level_id, other.word_level_id)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetTopic_id() || (compareTo = TBaseHelper.compareTo(this.topic_id, other.topic_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBCollectWordPair, _Fields> deepCopy2() {
        return new BBCollectWordPair(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBCollectWordPair$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getWord_level_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getTopic_id());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBCollectWordPair$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetWord_level_id();
        }
        if (i11 == 2) {
            return isSetTopic_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBCollectWordPair$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetWord_level_id();
                return;
            } else {
                setWord_level_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetTopic_id();
        } else {
            setTopic_id(((Integer) value).intValue());
        }
    }

    public BBCollectWordPair(int word_level_id, int topic_id) {
        this();
        this.word_level_id = word_level_id;
        setWord_level_idIsSet(true);
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
    }

    public boolean equals(BBCollectWordPair that) {
        return that != null && this.word_level_id == that.word_level_id && this.topic_id == that.topic_id;
    }

    public BBCollectWordPair(BBCollectWordPair other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.word_level_id = other.word_level_id;
        this.topic_id = other.topic_id;
    }

    public void validate() throws TException {
    }
}
