package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SelectBookPlanInfo implements TBase<SelectBookPlanInfo, _Fields>, Serializable, Cloneable, Comparable<SelectBookPlanInfo> {
    private static final int __BOOK_GROUP_ISSET_ID = 6;
    private static final int __BOOK_ID_ISSET_ID = 0;
    private static final int __COUNT_PER_ROUND_ISSET_ID = 7;
    private static final int __DAILY_PLAN_COUNT_ISSET_ID = 3;
    private static final int __GROUP_ID_ISSET_ID = 2;
    private static final int __LEARNED_WORDS_COUNT_ISSET_ID = 1;
    private static final int __MASTERED_ISSET_ID = 5;
    private static final int __REVIEW_PLAN_COUNT_ISSET_ID = 4;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int book_group;
    public int book_id;
    public int count_per_round;
    public int daily_plan_count;
    public int group_id;
    public int learned_words_count;
    public int mastered;
    private _Fields[] optionals;
    public int review_plan_count;
    private static final TStruct STRUCT_DESC = new TStruct("SelectBookPlanInfo");
    private static final TField BOOK_ID_FIELD_DESC = new TField("book_id", (byte) 8, 1);
    private static final TField LEARNED_WORDS_COUNT_FIELD_DESC = new TField("learned_words_count", (byte) 8, 2);
    private static final TField GROUP_ID_FIELD_DESC = new TField("group_id", (byte) 8, 3);
    private static final TField DAILY_PLAN_COUNT_FIELD_DESC = new TField("daily_plan_count", (byte) 8, 4);
    private static final TField REVIEW_PLAN_COUNT_FIELD_DESC = new TField("review_plan_count", (byte) 8, 5);
    private static final TField MASTERED_FIELD_DESC = new TField("mastered", (byte) 8, 6);
    private static final TField BOOK_GROUP_FIELD_DESC = new TField("book_group", (byte) 8, 7);
    private static final TField COUNT_PER_ROUND_FIELD_DESC = new TField("count_per_round", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.SelectBookPlanInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.LEARNED_WORDS_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.GROUP_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.DAILY_PLAN_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.REVIEW_PLAN_COUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.MASTERED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.BOOK_GROUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[_Fields.COUNT_PER_ROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SelectBookPlanInfoStandardScheme extends StandardScheme<SelectBookPlanInfo> {
        private SelectBookPlanInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SelectBookPlanInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetBook_id()) {
                        throw new TProtocolException("Required field 'book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLearned_words_count()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'learned_words_count' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_id = iprot.readI32();
                            struct.setBook_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learned_words_count = iprot.readI32();
                            struct.setLearned_words_countIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.group_id = iprot.readI32();
                            struct.setGroup_idIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.daily_plan_count = iprot.readI32();
                            struct.setDaily_plan_countIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_plan_count = iprot.readI32();
                            struct.setReview_plan_countIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mastered = iprot.readI32();
                            struct.setMasteredIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.book_group = iprot.readI32();
                            struct.setBook_groupIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.count_per_round = iprot.readI32();
                            struct.setCount_per_roundIsSet(true);
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
        public void write(TProtocol oprot, SelectBookPlanInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SelectBookPlanInfo.STRUCT_DESC);
            oprot.writeFieldBegin(SelectBookPlanInfo.BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SelectBookPlanInfo.LEARNED_WORDS_COUNT_FIELD_DESC);
            oprot.writeI32(struct.learned_words_count);
            oprot.writeFieldEnd();
            if (struct.isSetGroup_id()) {
                oprot.writeFieldBegin(SelectBookPlanInfo.GROUP_ID_FIELD_DESC);
                oprot.writeI32(struct.group_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetDaily_plan_count()) {
                oprot.writeFieldBegin(SelectBookPlanInfo.DAILY_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.daily_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetReview_plan_count()) {
                oprot.writeFieldBegin(SelectBookPlanInfo.REVIEW_PLAN_COUNT_FIELD_DESC);
                oprot.writeI32(struct.review_plan_count);
                oprot.writeFieldEnd();
            }
            if (struct.isSetMastered()) {
                oprot.writeFieldBegin(SelectBookPlanInfo.MASTERED_FIELD_DESC);
                oprot.writeI32(struct.mastered);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBook_group()) {
                oprot.writeFieldBegin(SelectBookPlanInfo.BOOK_GROUP_FIELD_DESC);
                oprot.writeI32(struct.book_group);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCount_per_round()) {
                oprot.writeFieldBegin(SelectBookPlanInfo.COUNT_PER_ROUND_FIELD_DESC);
                oprot.writeI32(struct.count_per_round);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SelectBookPlanInfoStandardSchemeFactory implements SchemeFactory {
        private SelectBookPlanInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SelectBookPlanInfoStandardScheme getScheme() {
            return new SelectBookPlanInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SelectBookPlanInfoTupleScheme extends TupleScheme<SelectBookPlanInfo> {
        private SelectBookPlanInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SelectBookPlanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book_id = tTupleProtocol.readI32();
            struct.setBook_idIsSet(true);
            struct.learned_words_count = tTupleProtocol.readI32();
            struct.setLearned_words_countIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                struct.group_id = tTupleProtocol.readI32();
                struct.setGroup_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.daily_plan_count = tTupleProtocol.readI32();
                struct.setDaily_plan_countIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.review_plan_count = tTupleProtocol.readI32();
                struct.setReview_plan_countIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.mastered = tTupleProtocol.readI32();
                struct.setMasteredIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.book_group = tTupleProtocol.readI32();
                struct.setBook_groupIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.count_per_round = tTupleProtocol.readI32();
                struct.setCount_per_roundIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SelectBookPlanInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.book_id);
            tTupleProtocol.writeI32(struct.learned_words_count);
            BitSet bitSet = new BitSet();
            if (struct.isSetGroup_id()) {
                bitSet.set(0);
            }
            if (struct.isSetDaily_plan_count()) {
                bitSet.set(1);
            }
            if (struct.isSetReview_plan_count()) {
                bitSet.set(2);
            }
            if (struct.isSetMastered()) {
                bitSet.set(3);
            }
            if (struct.isSetBook_group()) {
                bitSet.set(4);
            }
            if (struct.isSetCount_per_round()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetGroup_id()) {
                tTupleProtocol.writeI32(struct.group_id);
            }
            if (struct.isSetDaily_plan_count()) {
                tTupleProtocol.writeI32(struct.daily_plan_count);
            }
            if (struct.isSetReview_plan_count()) {
                tTupleProtocol.writeI32(struct.review_plan_count);
            }
            if (struct.isSetMastered()) {
                tTupleProtocol.writeI32(struct.mastered);
            }
            if (struct.isSetBook_group()) {
                tTupleProtocol.writeI32(struct.book_group);
            }
            if (struct.isSetCount_per_round()) {
                tTupleProtocol.writeI32(struct.count_per_round);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SelectBookPlanInfoTupleSchemeFactory implements SchemeFactory {
        private SelectBookPlanInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SelectBookPlanInfoTupleScheme getScheme() {
            return new SelectBookPlanInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK_ID(1, "book_id"),
        LEARNED_WORDS_COUNT(2, "learned_words_count"),
        GROUP_ID(3, "group_id"),
        DAILY_PLAN_COUNT(4, "daily_plan_count"),
        REVIEW_PLAN_COUNT(5, "review_plan_count"),
        MASTERED(6, "mastered"),
        BOOK_GROUP(7, "book_group"),
        COUNT_PER_ROUND(8, "count_per_round");

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
                    return BOOK_ID;
                case 2:
                    return LEARNED_WORDS_COUNT;
                case 3:
                    return GROUP_ID;
                case 4:
                    return DAILY_PLAN_COUNT;
                case 5:
                    return REVIEW_PLAN_COUNT;
                case 6:
                    return MASTERED;
                case 7:
                    return BOOK_GROUP;
                case 8:
                    return COUNT_PER_ROUND;
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
        hashMap.put(StandardScheme.class, new SelectBookPlanInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SelectBookPlanInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK_ID, (_Fields) new FieldMetaData("book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEARNED_WORDS_COUNT, (_Fields) new FieldMetaData("learned_words_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.GROUP_ID, (_Fields) new FieldMetaData("group_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.DAILY_PLAN_COUNT, (_Fields) new FieldMetaData("daily_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEW_PLAN_COUNT, (_Fields) new FieldMetaData("review_plan_count", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MASTERED, (_Fields) new FieldMetaData("mastered", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BOOK_GROUP, (_Fields) new FieldMetaData("book_group", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COUNT_PER_ROUND, (_Fields) new FieldMetaData("count_per_round", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SelectBookPlanInfo.class, unmodifiableMap);
    }

    public SelectBookPlanInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.GROUP_ID, _Fields.DAILY_PLAN_COUNT, _Fields.REVIEW_PLAN_COUNT, _Fields.MASTERED, _Fields.BOOK_GROUP, _Fields.COUNT_PER_ROUND};
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
        setLearned_words_countIsSet(false);
        this.learned_words_count = 0;
        setGroup_idIsSet(false);
        this.group_id = 0;
        setDaily_plan_countIsSet(false);
        this.daily_plan_count = 0;
        setReview_plan_countIsSet(false);
        this.review_plan_count = 0;
        setMasteredIsSet(false);
        this.mastered = 0;
        setBook_groupIsSet(false);
        this.book_group = 0;
        setCount_per_roundIsSet(false);
        this.count_per_round = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SelectBookPlanInfo)) {
            return equals((SelectBookPlanInfo) that);
        }
        return false;
    }

    public int getBook_group() {
        return this.book_group;
    }

    public int getBook_id() {
        return this.book_id;
    }

    public int getCount_per_round() {
        return this.count_per_round;
    }

    public int getDaily_plan_count() {
        return this.daily_plan_count;
    }

    public int getGroup_id() {
        return this.group_id;
    }

    public int getLearned_words_count() {
        return this.learned_words_count;
    }

    public int getMastered() {
        return this.mastered;
    }

    public int getReview_plan_count() {
        return this.review_plan_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook_group() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetBook_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetCount_per_round() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetDaily_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetGroup_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLearned_words_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetMastered() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetReview_plan_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SelectBookPlanInfo setBook_group(int book_group) {
        this.book_group = book_group;
        setBook_groupIsSet(true);
        return this;
    }

    public void setBook_groupIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public SelectBookPlanInfo setBook_id(int book_id) {
        this.book_id = book_id;
        setBook_idIsSet(true);
        return this;
    }

    public void setBook_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SelectBookPlanInfo setCount_per_round(int count_per_round) {
        this.count_per_round = count_per_round;
        setCount_per_roundIsSet(true);
        return this;
    }

    public void setCount_per_roundIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public SelectBookPlanInfo setDaily_plan_count(int daily_plan_count) {
        this.daily_plan_count = daily_plan_count;
        setDaily_plan_countIsSet(true);
        return this;
    }

    public void setDaily_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public SelectBookPlanInfo setGroup_id(int group_id) {
        this.group_id = group_id;
        setGroup_idIsSet(true);
        return this;
    }

    public void setGroup_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public SelectBookPlanInfo setLearned_words_count(int learned_words_count) {
        this.learned_words_count = learned_words_count;
        setLearned_words_countIsSet(true);
        return this;
    }

    public void setLearned_words_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SelectBookPlanInfo setMastered(int mastered) {
        this.mastered = mastered;
        setMasteredIsSet(true);
        return this;
    }

    public void setMasteredIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public SelectBookPlanInfo setReview_plan_count(int review_plan_count) {
        this.review_plan_count = review_plan_count;
        setReview_plan_countIsSet(true);
        return this;
    }

    public void setReview_plan_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectBookPlanInfo(");
        sb2.append("book_id:");
        sb2.append(this.book_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("learned_words_count:");
        sb2.append(this.learned_words_count);
        if (isSetGroup_id()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("group_id:");
            sb2.append(this.group_id);
        }
        if (isSetDaily_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("daily_plan_count:");
            sb2.append(this.daily_plan_count);
        }
        if (isSetReview_plan_count()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("review_plan_count:");
            sb2.append(this.review_plan_count);
        }
        if (isSetMastered()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("mastered:");
            sb2.append(this.mastered);
        }
        if (isSetBook_group()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("book_group:");
            sb2.append(this.book_group);
        }
        if (isSetCount_per_round()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("count_per_round:");
            sb2.append(this.count_per_round);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook_group() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetBook_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetCount_per_round() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetDaily_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetGroup_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLearned_words_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetMastered() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetReview_plan_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SelectBookPlanInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetBook_id()).compareTo(Boolean.valueOf(other.isSetBook_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetBook_id() && (compareTo8 = TBaseHelper.compareTo(this.book_id, other.book_id)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetLearned_words_count()).compareTo(Boolean.valueOf(other.isSetLearned_words_count()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLearned_words_count() && (compareTo7 = TBaseHelper.compareTo(this.learned_words_count, other.learned_words_count)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetGroup_id()).compareTo(Boolean.valueOf(other.isSetGroup_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetGroup_id() && (compareTo6 = TBaseHelper.compareTo(this.group_id, other.group_id)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetDaily_plan_count()).compareTo(Boolean.valueOf(other.isSetDaily_plan_count()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetDaily_plan_count() && (compareTo5 = TBaseHelper.compareTo(this.daily_plan_count, other.daily_plan_count)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetReview_plan_count()).compareTo(Boolean.valueOf(other.isSetReview_plan_count()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetReview_plan_count() && (compareTo4 = TBaseHelper.compareTo(this.review_plan_count, other.review_plan_count)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetMastered()).compareTo(Boolean.valueOf(other.isSetMastered()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetMastered() && (compareTo3 = TBaseHelper.compareTo(this.mastered, other.mastered)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetBook_group()).compareTo(Boolean.valueOf(other.isSetBook_group()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetBook_group() && (compareTo2 = TBaseHelper.compareTo(this.book_group, other.book_group)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetCount_per_round()).compareTo(Boolean.valueOf(other.isSetCount_per_round()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetCount_per_round() || (compareTo = TBaseHelper.compareTo(this.count_per_round, other.count_per_round)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SelectBookPlanInfo, _Fields> deepCopy2() {
        return new SelectBookPlanInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getBook_id());
            case 2:
                return Integer.valueOf(getLearned_words_count());
            case 3:
                return Integer.valueOf(getGroup_id());
            case 4:
                return Integer.valueOf(getDaily_plan_count());
            case 5:
                return Integer.valueOf(getReview_plan_count());
            case 6:
                return Integer.valueOf(getMastered());
            case 7:
                return Integer.valueOf(getBook_group());
            case 8:
                return Integer.valueOf(getCount_per_round());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetBook_id();
            case 2:
                return isSetLearned_words_count();
            case 3:
                return isSetGroup_id();
            case 4:
                return isSetDaily_plan_count();
            case 5:
                return isSetReview_plan_count();
            case 6:
                return isSetMastered();
            case 7:
                return isSetBook_group();
            case 8:
                return isSetCount_per_round();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SelectBookPlanInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setBook_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setLearned_words_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearned_words_count();
                    break;
                }
            case 3:
                if (value != null) {
                    setGroup_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetGroup_id();
                    break;
                }
            case 4:
                if (value != null) {
                    setDaily_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetDaily_plan_count();
                    break;
                }
            case 5:
                if (value != null) {
                    setReview_plan_count(((Integer) value).intValue());
                    break;
                } else {
                    unsetReview_plan_count();
                    break;
                }
            case 6:
                if (value != null) {
                    setMastered(((Integer) value).intValue());
                    break;
                } else {
                    unsetMastered();
                    break;
                }
            case 7:
                if (value != null) {
                    setBook_group(((Integer) value).intValue());
                    break;
                } else {
                    unsetBook_group();
                    break;
                }
            case 8:
                if (value != null) {
                    setCount_per_round(((Integer) value).intValue());
                    break;
                } else {
                    unsetCount_per_round();
                    break;
                }
        }
    }

    public boolean equals(SelectBookPlanInfo that) {
        if (that == null || this.book_id != that.book_id || this.learned_words_count != that.learned_words_count) {
            return false;
        }
        boolean isSetGroup_id = isSetGroup_id();
        boolean isSetGroup_id2 = that.isSetGroup_id();
        if ((isSetGroup_id || isSetGroup_id2) && !(isSetGroup_id && isSetGroup_id2 && this.group_id == that.group_id)) {
            return false;
        }
        boolean isSetDaily_plan_count = isSetDaily_plan_count();
        boolean isSetDaily_plan_count2 = that.isSetDaily_plan_count();
        if ((isSetDaily_plan_count || isSetDaily_plan_count2) && !(isSetDaily_plan_count && isSetDaily_plan_count2 && this.daily_plan_count == that.daily_plan_count)) {
            return false;
        }
        boolean isSetReview_plan_count = isSetReview_plan_count();
        boolean isSetReview_plan_count2 = that.isSetReview_plan_count();
        if ((isSetReview_plan_count || isSetReview_plan_count2) && !(isSetReview_plan_count && isSetReview_plan_count2 && this.review_plan_count == that.review_plan_count)) {
            return false;
        }
        boolean isSetMastered = isSetMastered();
        boolean isSetMastered2 = that.isSetMastered();
        if ((isSetMastered || isSetMastered2) && !(isSetMastered && isSetMastered2 && this.mastered == that.mastered)) {
            return false;
        }
        boolean isSetBook_group = isSetBook_group();
        boolean isSetBook_group2 = that.isSetBook_group();
        if ((isSetBook_group || isSetBook_group2) && !(isSetBook_group && isSetBook_group2 && this.book_group == that.book_group)) {
            return false;
        }
        boolean isSetCount_per_round = isSetCount_per_round();
        boolean isSetCount_per_round2 = that.isSetCount_per_round();
        if (isSetCount_per_round || isSetCount_per_round2) {
            return isSetCount_per_round && isSetCount_per_round2 && this.count_per_round == that.count_per_round;
        }
        return true;
    }

    public SelectBookPlanInfo(int book_id, int learned_words_count) {
        this();
        this.book_id = book_id;
        setBook_idIsSet(true);
        this.learned_words_count = learned_words_count;
        setLearned_words_countIsSet(true);
    }

    public SelectBookPlanInfo(SelectBookPlanInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.GROUP_ID, _Fields.DAILY_PLAN_COUNT, _Fields.REVIEW_PLAN_COUNT, _Fields.MASTERED, _Fields.BOOK_GROUP, _Fields.COUNT_PER_ROUND};
        this.__isset_bitfield = other.__isset_bitfield;
        this.book_id = other.book_id;
        this.learned_words_count = other.learned_words_count;
        this.group_id = other.group_id;
        this.daily_plan_count = other.daily_plan_count;
        this.review_plan_count = other.review_plan_count;
        this.mastered = other.mastered;
        this.book_group = other.book_group;
        this.count_per_round = other.count_per_round;
    }

    public void validate() throws TException {
    }
}
