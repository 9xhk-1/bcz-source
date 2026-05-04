package com.baicizhan.online.game_api;

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
/* loaded from: classes5.dex */
public class TodayLearnInfo implements TBase<TodayLearnInfo, _Fields>, Serializable, Cloneable, Comparable<TodayLearnInfo> {
    private static final int __FINISH_GROUP_ISSET_ID = 7;
    private static final int __FIRST_LEARN_TIP_ISSET_ID = 2;
    private static final int __GROUP_PLAN_ISSET_ID = 6;
    private static final int __LEARNED_ISSET_ID = 0;
    private static final int __LEARN_MORE_TIP_ISSET_ID = 3;
    private static final int __REVIEWED_ISSET_ID = 1;
    private static final int __REVIEW_MORE_TIP_ISSET_ID = 4;
    private static final int __REVIEW_NO_TIP_ISSET_ID = 5;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int finish_group;
    public boolean first_learn_tip;
    public int group_plan;
    public boolean learn_more_tip;
    public int learned;
    private _Fields[] optionals;
    public boolean review_more_tip;
    public boolean review_no_tip;
    public int reviewed;
    private static final TStruct STRUCT_DESC = new TStruct("TodayLearnInfo");
    private static final TField LEARNED_FIELD_DESC = new TField("learned", (byte) 8, 1);
    private static final TField REVIEWED_FIELD_DESC = new TField("reviewed", (byte) 8, 2);
    private static final TField FIRST_LEARN_TIP_FIELD_DESC = new TField("first_learn_tip", (byte) 2, 3);
    private static final TField LEARN_MORE_TIP_FIELD_DESC = new TField("learn_more_tip", (byte) 2, 4);
    private static final TField REVIEW_MORE_TIP_FIELD_DESC = new TField("review_more_tip", (byte) 2, 5);
    private static final TField REVIEW_NO_TIP_FIELD_DESC = new TField("review_no_tip", (byte) 2, 6);
    private static final TField GROUP_PLAN_FIELD_DESC = new TField("group_plan", (byte) 8, 7);
    private static final TField FINISH_GROUP_FIELD_DESC = new TField("finish_group", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.TodayLearnInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields = iArr;
            try {
                iArr[_Fields.LEARNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.REVIEWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.FIRST_LEARN_TIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.LEARN_MORE_TIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.REVIEW_MORE_TIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.REVIEW_NO_TIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.GROUP_PLAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[_Fields.FINISH_GROUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TodayLearnInfoStandardScheme extends StandardScheme<TodayLearnInfo> {
        private TodayLearnInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TodayLearnInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLearned()) {
                        throw new TProtocolException("Required field 'learned' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetReviewed()) {
                        throw new TProtocolException("Required field 'reviewed' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetFirst_learn_tip()) {
                        throw new TProtocolException("Required field 'first_learn_tip' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLearn_more_tip()) {
                        throw new TProtocolException("Required field 'learn_more_tip' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetReview_more_tip()) {
                        throw new TProtocolException("Required field 'review_more_tip' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetReview_no_tip()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'review_no_tip' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learned = iprot.readI32();
                            struct.setLearnedIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.reviewed = iprot.readI32();
                            struct.setReviewedIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.first_learn_tip = iprot.readBool();
                            struct.setFirst_learn_tipIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.learn_more_tip = iprot.readBool();
                            struct.setLearn_more_tipIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_more_tip = iprot.readBool();
                            struct.setReview_more_tipIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.review_no_tip = iprot.readBool();
                            struct.setReview_no_tipIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.group_plan = iprot.readI32();
                            struct.setGroup_planIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.finish_group = iprot.readI32();
                            struct.setFinish_groupIsSet(true);
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
        public void write(TProtocol oprot, TodayLearnInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TodayLearnInfo.STRUCT_DESC);
            oprot.writeFieldBegin(TodayLearnInfo.LEARNED_FIELD_DESC);
            oprot.writeI32(struct.learned);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TodayLearnInfo.REVIEWED_FIELD_DESC);
            oprot.writeI32(struct.reviewed);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TodayLearnInfo.FIRST_LEARN_TIP_FIELD_DESC);
            oprot.writeBool(struct.first_learn_tip);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TodayLearnInfo.LEARN_MORE_TIP_FIELD_DESC);
            oprot.writeBool(struct.learn_more_tip);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TodayLearnInfo.REVIEW_MORE_TIP_FIELD_DESC);
            oprot.writeBool(struct.review_more_tip);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TodayLearnInfo.REVIEW_NO_TIP_FIELD_DESC);
            oprot.writeBool(struct.review_no_tip);
            oprot.writeFieldEnd();
            if (struct.isSetGroup_plan()) {
                oprot.writeFieldBegin(TodayLearnInfo.GROUP_PLAN_FIELD_DESC);
                oprot.writeI32(struct.group_plan);
                oprot.writeFieldEnd();
            }
            if (struct.isSetFinish_group()) {
                oprot.writeFieldBegin(TodayLearnInfo.FINISH_GROUP_FIELD_DESC);
                oprot.writeI32(struct.finish_group);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TodayLearnInfoStandardSchemeFactory implements SchemeFactory {
        private TodayLearnInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TodayLearnInfoStandardScheme getScheme() {
            return new TodayLearnInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TodayLearnInfoTupleScheme extends TupleScheme<TodayLearnInfo> {
        private TodayLearnInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TodayLearnInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.learned = tTupleProtocol.readI32();
            struct.setLearnedIsSet(true);
            struct.reviewed = tTupleProtocol.readI32();
            struct.setReviewedIsSet(true);
            struct.first_learn_tip = tTupleProtocol.readBool();
            struct.setFirst_learn_tipIsSet(true);
            struct.learn_more_tip = tTupleProtocol.readBool();
            struct.setLearn_more_tipIsSet(true);
            struct.review_more_tip = tTupleProtocol.readBool();
            struct.setReview_more_tipIsSet(true);
            struct.review_no_tip = tTupleProtocol.readBool();
            struct.setReview_no_tipIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.group_plan = tTupleProtocol.readI32();
                struct.setGroup_planIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.finish_group = tTupleProtocol.readI32();
                struct.setFinish_groupIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TodayLearnInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.learned);
            tTupleProtocol.writeI32(struct.reviewed);
            tTupleProtocol.writeBool(struct.first_learn_tip);
            tTupleProtocol.writeBool(struct.learn_more_tip);
            tTupleProtocol.writeBool(struct.review_more_tip);
            tTupleProtocol.writeBool(struct.review_no_tip);
            BitSet bitSet = new BitSet();
            if (struct.isSetGroup_plan()) {
                bitSet.set(0);
            }
            if (struct.isSetFinish_group()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetGroup_plan()) {
                tTupleProtocol.writeI32(struct.group_plan);
            }
            if (struct.isSetFinish_group()) {
                tTupleProtocol.writeI32(struct.finish_group);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TodayLearnInfoTupleSchemeFactory implements SchemeFactory {
        private TodayLearnInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TodayLearnInfoTupleScheme getScheme() {
            return new TodayLearnInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LEARNED(1, "learned"),
        REVIEWED(2, "reviewed"),
        FIRST_LEARN_TIP(3, "first_learn_tip"),
        LEARN_MORE_TIP(4, "learn_more_tip"),
        REVIEW_MORE_TIP(5, "review_more_tip"),
        REVIEW_NO_TIP(6, "review_no_tip"),
        GROUP_PLAN(7, "group_plan"),
        FINISH_GROUP(8, "finish_group");

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
                    return LEARNED;
                case 2:
                    return REVIEWED;
                case 3:
                    return FIRST_LEARN_TIP;
                case 4:
                    return LEARN_MORE_TIP;
                case 5:
                    return REVIEW_MORE_TIP;
                case 6:
                    return REVIEW_NO_TIP;
                case 7:
                    return GROUP_PLAN;
                case 8:
                    return FINISH_GROUP;
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
        hashMap.put(StandardScheme.class, new TodayLearnInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TodayLearnInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LEARNED, (_Fields) new FieldMetaData("learned", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.REVIEWED, (_Fields) new FieldMetaData("reviewed", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FIRST_LEARN_TIP, (_Fields) new FieldMetaData("first_learn_tip", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.LEARN_MORE_TIP, (_Fields) new FieldMetaData("learn_more_tip", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.REVIEW_MORE_TIP, (_Fields) new FieldMetaData("review_more_tip", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.REVIEW_NO_TIP, (_Fields) new FieldMetaData("review_no_tip", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.GROUP_PLAN, (_Fields) new FieldMetaData("group_plan", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FINISH_GROUP, (_Fields) new FieldMetaData("finish_group", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TodayLearnInfo.class, unmodifiableMap);
    }

    public TodayLearnInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.GROUP_PLAN, _Fields.FINISH_GROUP};
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
        setLearnedIsSet(false);
        this.learned = 0;
        setReviewedIsSet(false);
        this.reviewed = 0;
        setFirst_learn_tipIsSet(false);
        this.first_learn_tip = false;
        setLearn_more_tipIsSet(false);
        this.learn_more_tip = false;
        setReview_more_tipIsSet(false);
        this.review_more_tip = false;
        setReview_no_tipIsSet(false);
        this.review_no_tip = false;
        setGroup_planIsSet(false);
        this.group_plan = 0;
        setFinish_groupIsSet(false);
        this.finish_group = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TodayLearnInfo)) {
            return equals((TodayLearnInfo) that);
        }
        return false;
    }

    public int getFinish_group() {
        return this.finish_group;
    }

    public int getGroup_plan() {
        return this.group_plan;
    }

    public int getLearned() {
        return this.learned;
    }

    public int getReviewed() {
        return this.reviewed;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isFirst_learn_tip() {
        return this.first_learn_tip;
    }

    public boolean isLearn_more_tip() {
        return this.learn_more_tip;
    }

    public boolean isReview_more_tip() {
        return this.review_more_tip;
    }

    public boolean isReview_no_tip() {
        return this.review_no_tip;
    }

    public boolean isSetFinish_group() {
        return EncodingUtils.testBit(this.__isset_bitfield, 7);
    }

    public boolean isSetFirst_learn_tip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetGroup_plan() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    public boolean isSetLearn_more_tip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLearned() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetReview_more_tip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetReview_no_tip() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetReviewed() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TodayLearnInfo setFinish_group(int finish_group) {
        this.finish_group = finish_group;
        setFinish_groupIsSet(true);
        return this;
    }

    public void setFinish_groupIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 7, value);
    }

    public TodayLearnInfo setFirst_learn_tip(boolean first_learn_tip) {
        this.first_learn_tip = first_learn_tip;
        setFirst_learn_tipIsSet(true);
        return this;
    }

    public void setFirst_learn_tipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public TodayLearnInfo setGroup_plan(int group_plan) {
        this.group_plan = group_plan;
        setGroup_planIsSet(true);
        return this;
    }

    public void setGroup_planIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public TodayLearnInfo setLearn_more_tip(boolean learn_more_tip) {
        this.learn_more_tip = learn_more_tip;
        setLearn_more_tipIsSet(true);
        return this;
    }

    public void setLearn_more_tipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public TodayLearnInfo setLearned(int learned) {
        this.learned = learned;
        setLearnedIsSet(true);
        return this;
    }

    public void setLearnedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TodayLearnInfo setReview_more_tip(boolean review_more_tip) {
        this.review_more_tip = review_more_tip;
        setReview_more_tipIsSet(true);
        return this;
    }

    public void setReview_more_tipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public TodayLearnInfo setReview_no_tip(boolean review_no_tip) {
        this.review_no_tip = review_no_tip;
        setReview_no_tipIsSet(true);
        return this;
    }

    public void setReview_no_tipIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public TodayLearnInfo setReviewed(int reviewed) {
        this.reviewed = reviewed;
        setReviewedIsSet(true);
        return this;
    }

    public void setReviewedIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TodayLearnInfo(");
        sb2.append("learned:");
        sb2.append(this.learned);
        sb2.append(j2.O);
        sb2.append("reviewed:");
        sb2.append(this.reviewed);
        sb2.append(j2.O);
        sb2.append("first_learn_tip:");
        sb2.append(this.first_learn_tip);
        sb2.append(j2.O);
        sb2.append("learn_more_tip:");
        sb2.append(this.learn_more_tip);
        sb2.append(j2.O);
        sb2.append("review_more_tip:");
        sb2.append(this.review_more_tip);
        sb2.append(j2.O);
        sb2.append("review_no_tip:");
        sb2.append(this.review_no_tip);
        if (isSetGroup_plan()) {
            sb2.append(j2.O);
            sb2.append("group_plan:");
            sb2.append(this.group_plan);
        }
        if (isSetFinish_group()) {
            sb2.append(j2.O);
            sb2.append("finish_group:");
            sb2.append(this.finish_group);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetFinish_group() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 7);
    }

    public void unsetFirst_learn_tip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetGroup_plan() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void unsetLearn_more_tip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLearned() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetReview_more_tip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetReview_no_tip() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetReviewed() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TodayLearnInfo other) {
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
        int compareTo9 = Boolean.valueOf(isSetLearned()).compareTo(Boolean.valueOf(other.isSetLearned()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLearned() && (compareTo8 = TBaseHelper.compareTo(this.learned, other.learned)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetReviewed()).compareTo(Boolean.valueOf(other.isSetReviewed()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetReviewed() && (compareTo7 = TBaseHelper.compareTo(this.reviewed, other.reviewed)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetFirst_learn_tip()).compareTo(Boolean.valueOf(other.isSetFirst_learn_tip()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetFirst_learn_tip() && (compareTo6 = TBaseHelper.compareTo(this.first_learn_tip, other.first_learn_tip)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetLearn_more_tip()).compareTo(Boolean.valueOf(other.isSetLearn_more_tip()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetLearn_more_tip() && (compareTo5 = TBaseHelper.compareTo(this.learn_more_tip, other.learn_more_tip)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetReview_more_tip()).compareTo(Boolean.valueOf(other.isSetReview_more_tip()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetReview_more_tip() && (compareTo4 = TBaseHelper.compareTo(this.review_more_tip, other.review_more_tip)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetReview_no_tip()).compareTo(Boolean.valueOf(other.isSetReview_no_tip()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetReview_no_tip() && (compareTo3 = TBaseHelper.compareTo(this.review_no_tip, other.review_no_tip)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetGroup_plan()).compareTo(Boolean.valueOf(other.isSetGroup_plan()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetGroup_plan() && (compareTo2 = TBaseHelper.compareTo(this.group_plan, other.group_plan)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetFinish_group()).compareTo(Boolean.valueOf(other.isSetFinish_group()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetFinish_group() || (compareTo = TBaseHelper.compareTo(this.finish_group, other.finish_group)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TodayLearnInfo, _Fields> deepCopy2() {
        return new TodayLearnInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getLearned());
            case 2:
                return Integer.valueOf(getReviewed());
            case 3:
                return Boolean.valueOf(isFirst_learn_tip());
            case 4:
                return Boolean.valueOf(isLearn_more_tip());
            case 5:
                return Boolean.valueOf(isReview_more_tip());
            case 6:
                return Boolean.valueOf(isReview_no_tip());
            case 7:
                return Integer.valueOf(getGroup_plan());
            case 8:
                return Integer.valueOf(getFinish_group());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetLearned();
            case 2:
                return isSetReviewed();
            case 3:
                return isSetFirst_learn_tip();
            case 4:
                return isSetLearn_more_tip();
            case 5:
                return isSetReview_more_tip();
            case 6:
                return isSetReview_no_tip();
            case 7:
                return isSetGroup_plan();
            case 8:
                return isSetFinish_group();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$TodayLearnInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setLearned(((Integer) value).intValue());
                    break;
                } else {
                    unsetLearned();
                    break;
                }
            case 2:
                if (value != null) {
                    setReviewed(((Integer) value).intValue());
                    break;
                } else {
                    unsetReviewed();
                    break;
                }
            case 3:
                if (value != null) {
                    setFirst_learn_tip(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetFirst_learn_tip();
                    break;
                }
            case 4:
                if (value != null) {
                    setLearn_more_tip(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetLearn_more_tip();
                    break;
                }
            case 5:
                if (value != null) {
                    setReview_more_tip(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetReview_more_tip();
                    break;
                }
            case 6:
                if (value != null) {
                    setReview_no_tip(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetReview_no_tip();
                    break;
                }
            case 7:
                if (value != null) {
                    setGroup_plan(((Integer) value).intValue());
                    break;
                } else {
                    unsetGroup_plan();
                    break;
                }
            case 8:
                if (value != null) {
                    setFinish_group(((Integer) value).intValue());
                    break;
                } else {
                    unsetFinish_group();
                    break;
                }
        }
    }

    public boolean equals(TodayLearnInfo that) {
        if (that == null || this.learned != that.learned || this.reviewed != that.reviewed || this.first_learn_tip != that.first_learn_tip || this.learn_more_tip != that.learn_more_tip || this.review_more_tip != that.review_more_tip || this.review_no_tip != that.review_no_tip) {
            return false;
        }
        boolean isSetGroup_plan = isSetGroup_plan();
        boolean isSetGroup_plan2 = that.isSetGroup_plan();
        if ((isSetGroup_plan || isSetGroup_plan2) && !(isSetGroup_plan && isSetGroup_plan2 && this.group_plan == that.group_plan)) {
            return false;
        }
        boolean isSetFinish_group = isSetFinish_group();
        boolean isSetFinish_group2 = that.isSetFinish_group();
        if (isSetFinish_group || isSetFinish_group2) {
            return isSetFinish_group && isSetFinish_group2 && this.finish_group == that.finish_group;
        }
        return true;
    }

    public TodayLearnInfo(int learned, int reviewed, boolean first_learn_tip, boolean learn_more_tip, boolean review_more_tip, boolean review_no_tip) {
        this();
        this.learned = learned;
        setLearnedIsSet(true);
        this.reviewed = reviewed;
        setReviewedIsSet(true);
        this.first_learn_tip = first_learn_tip;
        setFirst_learn_tipIsSet(true);
        this.learn_more_tip = learn_more_tip;
        setLearn_more_tipIsSet(true);
        this.review_more_tip = review_more_tip;
        setReview_more_tipIsSet(true);
        this.review_no_tip = review_no_tip;
        setReview_no_tipIsSet(true);
    }

    public TodayLearnInfo(TodayLearnInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.GROUP_PLAN, _Fields.FINISH_GROUP};
        this.__isset_bitfield = other.__isset_bitfield;
        this.learned = other.learned;
        this.reviewed = other.reviewed;
        this.first_learn_tip = other.first_learn_tip;
        this.learn_more_tip = other.learn_more_tip;
        this.review_more_tip = other.review_more_tip;
        this.review_no_tip = other.review_no_tip;
        this.group_plan = other.group_plan;
        this.finish_group = other.finish_group;
    }

    public void validate() throws TException {
    }
}
