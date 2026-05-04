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
public class BBSimilarWordVote implements TBase<BBSimilarWordVote, _Fields>, Serializable, Cloneable, Comparable<BBSimilarWordVote> {
    private static final int __BOOK_ID_ISSET_ID = 1;
    private static final int __IS_SIMILAR_ISSET_ID = 3;
    private static final int __SIMILAR_WORD_ID_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_id;
    public boolean is_similar;
    public int similar_word_id;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBSimilarWordVote");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 2);
    private static final TField SIMILAR_WORD_ID_FIELD_DESC = new TField("similar_word_id", (byte) 8, 3);
    private static final TField IS_SIMILAR_FIELD_DESC = new TField("is_similar", (byte) 2, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBSimilarWordVote$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields[_Fields.BOOK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields[_Fields.SIMILAR_WORD_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields[_Fields.IS_SIMILAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordVoteStandardScheme extends StandardScheme<BBSimilarWordVote> {
        private BBSimilarWordVoteStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBSimilarWordVote struct) throws TException {
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
                                struct.is_similar = iprot.readBool();
                                struct.setIs_similarIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.similar_word_id = iprot.readI32();
                            struct.setSimilar_word_idIsSet(true);
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
            if (!struct.isSetBook_id()) {
                throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetSimilar_word_id()) {
                throw new TProtocolException("Required field 'similar_word_id' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetIs_similar()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'is_similar' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBSimilarWordVote struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBSimilarWordVote.STRUCT_DESC);
            oprot.writeFieldBegin(BBSimilarWordVote.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBSimilarWordVote.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBSimilarWordVote.SIMILAR_WORD_ID_FIELD_DESC);
            oprot.writeI32(struct.similar_word_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBSimilarWordVote.IS_SIMILAR_FIELD_DESC);
            oprot.writeBool(struct.is_similar);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordVoteStandardSchemeFactory implements SchemeFactory {
        private BBSimilarWordVoteStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSimilarWordVoteStandardScheme getScheme() {
            return new BBSimilarWordVoteStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordVoteTupleScheme extends TupleScheme<BBSimilarWordVote> {
        private BBSimilarWordVoteTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBSimilarWordVote struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.similar_word_id = tTupleProtocol.readI32();
            struct.setSimilar_word_idIsSet(true);
            struct.is_similar = tTupleProtocol.readBool();
            struct.setIs_similarIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBSimilarWordVote struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.similar_word_id);
            tTupleProtocol.writeBool(struct.is_similar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSimilarWordVoteTupleSchemeFactory implements SchemeFactory {
        private BBSimilarWordVoteTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSimilarWordVoteTupleScheme getScheme() {
            return new BBSimilarWordVoteTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        BOOK_ID(2, "book_id"),
        SIMILAR_WORD_ID(3, "similar_word_id"),
        IS_SIMILAR(4, "is_similar");

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
            if (fieldId == 3) {
                return SIMILAR_WORD_ID;
            }
            if (fieldId != 4) {
                return null;
            }
            return IS_SIMILAR;
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
        hashMap.put(StandardScheme.class, new BBSimilarWordVoteStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBSimilarWordVoteTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SIMILAR_WORD_ID, (_Fields) new FieldMetaData("similar_word_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_SIMILAR, (_Fields) new FieldMetaData("is_similar", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBSimilarWordVote.class, unmodifiableMap);
    }

    public BBSimilarWordVote() {
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
        setSimilar_word_idIsSet(false);
        this.similar_word_id = 0;
        setIs_similarIsSet(false);
        this.is_similar = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBSimilarWordVote)) {
            return equals((BBSimilarWordVote) that);
        }
        return false;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getSimilar_word_id() {
        return this.similar_word_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIs_similar() {
        return this.is_similar;
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIs_similar() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetSimilar_word_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBSimilarWordVote setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBSimilarWordVote setIs_similar(boolean is_similar) {
        this.is_similar = is_similar;
        setIs_similarIsSet(true);
        return this;
    }

    public void setIs_similarIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BBSimilarWordVote setSimilar_word_id(int similar_word_id) {
        this.similar_word_id = similar_word_id;
        setSimilar_word_idIsSet(true);
        return this;
    }

    public void setSimilar_word_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBSimilarWordVote setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "BBSimilarWordVote(topic_id:" + this.topic_id + j2.O + "book_id:" + this.book_id + j2.O + "similar_word_id:" + this.similar_word_id + j2.O + "is_similar:" + this.is_similar + pn.j.f81007d;
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIs_similar() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetSimilar_word_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBSimilarWordVote other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTopic_id() && (compareTo4 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetBook_id() && (compareTo3 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetSimilar_word_id()).compareTo(Boolean.valueOf(other.isSetSimilar_word_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetSimilar_word_id() && (compareTo2 = TBaseHelper.compareTo(this.similar_word_id, other.similar_word_id)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetIs_similar()).compareTo(Boolean.valueOf(other.isSetIs_similar()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetIs_similar() || (compareTo = TBaseHelper.compareTo(this.is_similar, other.is_similar)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBSimilarWordVote, _Fields> deepCopy2() {
        return new BBSimilarWordVote(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTopic_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getBook_id());
        }
        if (i11 == 3) {
            return Integer.valueOf(getSimilar_word_id());
        }
        if (i11 == 4) {
            return Boolean.valueOf(isIs_similar());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_id();
        }
        if (i11 == 2) {
            return isSetBook_id();
        }
        if (i11 == 3) {
            return isSetSimilar_word_id();
        }
        if (i11 == 4) {
            return isSetIs_similar();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBSimilarWordVote$_Fields[field.ordinal()];
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
        if (i11 == 3) {
            if (value == null) {
                unsetSimilar_word_id();
                return;
            } else {
                setSimilar_word_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetIs_similar();
        } else {
            setIs_similar(((Boolean) value).booleanValue());
        }
    }

    public BBSimilarWordVote(int topic_id, int book_id, int similar_word_id, boolean is_similar) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.similar_word_id = similar_word_id;
        setSimilar_word_idIsSet(true);
        this.is_similar = is_similar;
        setIs_similarIsSet(true);
    }

    public boolean equals(BBSimilarWordVote that) {
        return that != null && this.topic_id == that.topic_id && this.book_id == that.book_id && this.similar_word_id == that.similar_word_id && this.is_similar == that.is_similar;
    }

    public BBSimilarWordVote(BBSimilarWordVote other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.book_id = other.book_id;
        this.similar_word_id = other.similar_word_id;
        this.is_similar = other.is_similar;
    }

    public void validate() throws TException {
    }
}
