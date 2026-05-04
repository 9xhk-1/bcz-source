package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class WordListItem implements TBase<WordListItem, _Fields>, Serializable, Cloneable, Comparable<WordListItem> {
    private static final int __CUT_ISSET_ID = 3;
    private static final int __MASTERED_ISSET_ID = 1;
    private static final int __MODIFY_TIME_ISSET_ID = 2;
    private static final int __NEXT_REVIEW_DAY_ISSET_ID = 4;
    private static final int __STATUS_ISSET_ID = 5;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean cut;
    public int mastered;
    public long modify_time;
    public int next_review_day;
    public int status;
    public int topic_id;
    private static final TStruct STRUCT_DESC = new TStruct("WordListItem");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField MASTERED_FIELD_DESC = new TField("mastered", (byte) 8, 2);
    private static final TField MODIFY_TIME_FIELD_DESC = new TField("modify_time", (byte) 10, 3);
    private static final TField CUT_FIELD_DESC = new TField("cut", (byte) 2, 4);
    private static final TField NEXT_REVIEW_DAY_FIELD_DESC = new TField("next_review_day", (byte) 8, 5);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.WordListItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[_Fields.MASTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[_Fields.MODIFY_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[_Fields.CUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[_Fields.NEXT_REVIEW_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[_Fields.STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListItemStandardScheme extends StandardScheme<WordListItem> {
        private WordListItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, WordListItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetMastered()) {
                        throw new TProtocolException("Required field 'mastered' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetModify_time()) {
                        throw new TProtocolException("Required field 'modify_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCut()) {
                        throw new TProtocolException("Required field 'cut' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetNext_review_day()) {
                        throw new TProtocolException("Required field 'next_review_day' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetStatus()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mastered = iprot.readI32();
                            struct.setMasteredIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.modify_time = iprot.readI64();
                            struct.setModify_timeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.cut = iprot.readBool();
                            struct.setCutIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.next_review_day = iprot.readI32();
                            struct.setNext_review_dayIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.status = iprot.readI32();
                            struct.setStatusIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, WordListItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(WordListItem.STRUCT_DESC);
            oprot.writeFieldBegin(WordListItem.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordListItem.MASTERED_FIELD_DESC);
            oprot.writeI32(struct.mastered);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordListItem.MODIFY_TIME_FIELD_DESC);
            oprot.writeI64(struct.modify_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordListItem.CUT_FIELD_DESC);
            oprot.writeBool(struct.cut);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordListItem.NEXT_REVIEW_DAY_FIELD_DESC);
            oprot.writeI32(struct.next_review_day);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(WordListItem.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListItemStandardSchemeFactory implements SchemeFactory {
        private WordListItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordListItemStandardScheme getScheme() {
            return new WordListItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListItemTupleScheme extends TupleScheme<WordListItem> {
        private WordListItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, WordListItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.mastered = tTupleProtocol.readI32();
            struct.setMasteredIsSet(true);
            struct.modify_time = tTupleProtocol.readI64();
            struct.setModify_timeIsSet(true);
            struct.cut = tTupleProtocol.readBool();
            struct.setCutIsSet(true);
            struct.next_review_day = tTupleProtocol.readI32();
            struct.setNext_review_dayIsSet(true);
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, WordListItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeI32(struct.mastered);
            tTupleProtocol.writeI64(struct.modify_time);
            tTupleProtocol.writeBool(struct.cut);
            tTupleProtocol.writeI32(struct.next_review_day);
            tTupleProtocol.writeI32(struct.status);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WordListItemTupleSchemeFactory implements SchemeFactory {
        private WordListItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public WordListItemTupleScheme getScheme() {
            return new WordListItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        MASTERED(2, "mastered"),
        MODIFY_TIME(3, "modify_time"),
        CUT(4, "cut"),
        NEXT_REVIEW_DAY(5, "next_review_day"),
        STATUS(6, "status");

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
            switch (fieldId) {
                case 1:
                    return TOPIC_ID;
                case 2:
                    return MASTERED;
                case 3:
                    return MODIFY_TIME;
                case 4:
                    return CUT;
                case 5:
                    return NEXT_REVIEW_DAY;
                case 6:
                    return STATUS;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new WordListItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new WordListItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MASTERED, (_Fields) new FieldMetaData("mastered", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MODIFY_TIME, (_Fields) new FieldMetaData("modify_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.CUT, (_Fields) new FieldMetaData("cut", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.NEXT_REVIEW_DAY, (_Fields) new FieldMetaData("next_review_day", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(WordListItem.class, unmodifiableMap);
    }

    public WordListItem() {
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
        setMasteredIsSet(false);
        this.mastered = 0;
        setModify_timeIsSet(false);
        this.modify_time = 0L;
        setCutIsSet(false);
        this.cut = false;
        setNext_review_dayIsSet(false);
        this.next_review_day = 0;
        setStatusIsSet(false);
        this.status = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof WordListItem)) {
            return equals((WordListItem) that);
        }
        return false;
    }

    public int getMastered() {
        return this.mastered;
    }

    public long getModify_time() {
        return this.modify_time;
    }

    public int getNext_review_day() {
        return this.next_review_day;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isCut() {
        return this.cut;
    }

    public boolean isSetCut() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetMastered() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetModify_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetNext_review_day() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public WordListItem setCut(boolean cut) {
        this.cut = cut;
        setCutIsSet(true);
        return this;
    }

    public void setCutIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public WordListItem setMastered(int mastered) {
        this.mastered = mastered;
        setMasteredIsSet(true);
        return this;
    }

    public void setMasteredIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public WordListItem setModify_time(long modify_time) {
        this.modify_time = modify_time;
        setModify_timeIsSet(true);
        return this;
    }

    public void setModify_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public WordListItem setNext_review_day(int next_review_day) {
        this.next_review_day = next_review_day;
        setNext_review_dayIsSet(true);
        return this;
    }

    public void setNext_review_dayIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public WordListItem setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public WordListItem setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "WordListItem(topic_id:" + this.topic_id + org.junit.jupiter.api.j2.O + "mastered:" + this.mastered + org.junit.jupiter.api.j2.O + "modify_time:" + this.modify_time + org.junit.jupiter.api.j2.O + "cut:" + this.cut + org.junit.jupiter.api.j2.O + "next_review_day:" + this.next_review_day + org.junit.jupiter.api.j2.O + "status:" + this.status + pn.j.f81007d;
    }

    public void unsetCut() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetMastered() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetModify_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetNext_review_day() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(WordListItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTopic_id() && (compareTo6 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetMastered()).compareTo(Boolean.valueOf(other.isSetMastered()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetMastered() && (compareTo5 = TBaseHelper.compareTo(this.mastered, other.mastered)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetModify_time()).compareTo(Boolean.valueOf(other.isSetModify_time()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetModify_time() && (compareTo4 = TBaseHelper.compareTo(this.modify_time, other.modify_time)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetCut()).compareTo(Boolean.valueOf(other.isSetCut()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetCut() && (compareTo3 = TBaseHelper.compareTo(this.cut, other.cut)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetNext_review_day()).compareTo(Boolean.valueOf(other.isSetNext_review_day()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetNext_review_day() && (compareTo2 = TBaseHelper.compareTo(this.next_review_day, other.next_review_day)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetStatus() || (compareTo = TBaseHelper.compareTo(this.status, other.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<WordListItem, _Fields> deepCopy2() {
        return new WordListItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return Integer.valueOf(getMastered());
            case 3:
                return Long.valueOf(getModify_time());
            case 4:
                return Boolean.valueOf(isCut());
            case 5:
                return Integer.valueOf(getNext_review_day());
            case 6:
                return Integer.valueOf(getStatus());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetMastered();
            case 3:
                return isSetModify_time();
            case 4:
                return isSetCut();
            case 5:
                return isSetNext_review_day();
            case 6:
                return isSetStatus();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$WordListItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setMastered(((Integer) value).intValue());
                    break;
                } else {
                    unsetMastered();
                    break;
                }
            case 3:
                if (value != null) {
                    setModify_time(((Long) value).longValue());
                    break;
                } else {
                    unsetModify_time();
                    break;
                }
            case 4:
                if (value != null) {
                    setCut(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetCut();
                    break;
                }
            case 5:
                if (value != null) {
                    setNext_review_day(((Integer) value).intValue());
                    break;
                } else {
                    unsetNext_review_day();
                    break;
                }
            case 6:
                if (value != null) {
                    setStatus(((Integer) value).intValue());
                    break;
                } else {
                    unsetStatus();
                    break;
                }
        }
    }

    public WordListItem(int topic_id, int mastered, long modify_time, boolean cut, int next_review_day, int status) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.mastered = mastered;
        setMasteredIsSet(true);
        this.modify_time = modify_time;
        setModify_timeIsSet(true);
        this.cut = cut;
        setCutIsSet(true);
        this.next_review_day = next_review_day;
        setNext_review_dayIsSet(true);
        this.status = status;
        setStatusIsSet(true);
    }

    public boolean equals(WordListItem that) {
        return that != null && this.topic_id == that.topic_id && this.mastered == that.mastered && this.modify_time == that.modify_time && this.cut == that.cut && this.next_review_day == that.next_review_day && this.status == that.status;
    }

    public WordListItem(WordListItem other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        this.mastered = other.mastered;
        this.modify_time = other.modify_time;
        this.cut = other.cut;
        this.next_review_day = other.next_review_day;
        this.status = other.status;
    }

    public void validate() throws TException {
    }
}
