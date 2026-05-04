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
/* loaded from: classes5.dex */
public class FinishRoundRsp implements TBase<FinishRoundRsp, _Fields>, Serializable, Cloneable, Comparable<FinishRoundRsp> {
    private static final int __PLAN_VERSION_ISSET_ID = 1;
    private static final int __STUDY_RECORD_VERSIN_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public RoundAwardInfo award;
    public AwardBox award_box;
    public LavaQuest lava_quest;
    private _Fields[] optionals;
    public UserPlanInfo plan_info;
    public long plan_version;
    public long study_record_versin;
    public UserDataInfo user_data_info;
    private static final TStruct STRUCT_DESC = new TStruct("FinishRoundRsp");
    private static final TField AWARD_FIELD_DESC = new TField(ma.b.D1, (byte) 12, 1);
    private static final TField AWARD_BOX_FIELD_DESC = new TField("award_box", (byte) 12, 2);
    private static final TField STUDY_RECORD_VERSIN_FIELD_DESC = new TField("study_record_versin", (byte) 10, 3);
    private static final TField PLAN_VERSION_FIELD_DESC = new TField("plan_version", (byte) 10, 4);
    private static final TField USER_DATA_INFO_FIELD_DESC = new TField("user_data_info", (byte) 12, 5);
    private static final TField PLAN_INFO_FIELD_DESC = new TField("plan_info", (byte) 12, 6);
    private static final TField LAVA_QUEST_FIELD_DESC = new TField("lava_quest", (byte) 12, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.FinishRoundRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields = iArr;
            try {
                iArr[_Fields.AWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[_Fields.AWARD_BOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[_Fields.STUDY_RECORD_VERSIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[_Fields.PLAN_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[_Fields.USER_DATA_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[_Fields.PLAN_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[_Fields.LAVA_QUEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundRspStandardScheme extends StandardScheme<FinishRoundRsp> {
        private FinishRoundRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, FinishRoundRsp struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetStudy_record_versin()) {
                        throw new TProtocolException("Required field 'study_record_versin' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetPlan_version()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'plan_version' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            RoundAwardInfo roundAwardInfo = new RoundAwardInfo();
                            struct.award = roundAwardInfo;
                            roundAwardInfo.read(iprot);
                            struct.setAwardIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AwardBox awardBox = new AwardBox();
                            struct.award_box = awardBox;
                            awardBox.read(iprot);
                            struct.setAward_boxIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.study_record_versin = iprot.readI64();
                            struct.setStudy_record_versinIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.plan_version = iprot.readI64();
                            struct.setPlan_versionIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserDataInfo userDataInfo = new UserDataInfo();
                            struct.user_data_info = userDataInfo;
                            userDataInfo.read(iprot);
                            struct.setUser_data_infoIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserPlanInfo userPlanInfo = new UserPlanInfo();
                            struct.plan_info = userPlanInfo;
                            userPlanInfo.read(iprot);
                            struct.setPlan_infoIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            LavaQuest lavaQuest = new LavaQuest();
                            struct.lava_quest = lavaQuest;
                            lavaQuest.read(iprot);
                            struct.setLava_questIsSet(true);
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
        public void write(TProtocol oprot, FinishRoundRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(FinishRoundRsp.STRUCT_DESC);
            if (struct.award != null) {
                oprot.writeFieldBegin(FinishRoundRsp.AWARD_FIELD_DESC);
                struct.award.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.award_box != null) {
                oprot.writeFieldBegin(FinishRoundRsp.AWARD_BOX_FIELD_DESC);
                struct.award_box.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(FinishRoundRsp.STUDY_RECORD_VERSIN_FIELD_DESC);
            oprot.writeI64(struct.study_record_versin);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(FinishRoundRsp.PLAN_VERSION_FIELD_DESC);
            oprot.writeI64(struct.plan_version);
            oprot.writeFieldEnd();
            if (struct.user_data_info != null && struct.isSetUser_data_info()) {
                oprot.writeFieldBegin(FinishRoundRsp.USER_DATA_INFO_FIELD_DESC);
                struct.user_data_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.plan_info != null && struct.isSetPlan_info()) {
                oprot.writeFieldBegin(FinishRoundRsp.PLAN_INFO_FIELD_DESC);
                struct.plan_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.lava_quest != null && struct.isSetLava_quest()) {
                oprot.writeFieldBegin(FinishRoundRsp.LAVA_QUEST_FIELD_DESC);
                struct.lava_quest.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundRspStandardSchemeFactory implements SchemeFactory {
        private FinishRoundRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FinishRoundRspStandardScheme getScheme() {
            return new FinishRoundRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundRspTupleScheme extends TupleScheme<FinishRoundRsp> {
        private FinishRoundRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, FinishRoundRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            RoundAwardInfo roundAwardInfo = new RoundAwardInfo();
            struct.award = roundAwardInfo;
            roundAwardInfo.read(tTupleProtocol);
            struct.setAwardIsSet(true);
            AwardBox awardBox = new AwardBox();
            struct.award_box = awardBox;
            awardBox.read(tTupleProtocol);
            struct.setAward_boxIsSet(true);
            struct.study_record_versin = tTupleProtocol.readI64();
            struct.setStudy_record_versinIsSet(true);
            struct.plan_version = tTupleProtocol.readI64();
            struct.setPlan_versionIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                UserDataInfo userDataInfo = new UserDataInfo();
                struct.user_data_info = userDataInfo;
                userDataInfo.read(tTupleProtocol);
                struct.setUser_data_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                UserPlanInfo userPlanInfo = new UserPlanInfo();
                struct.plan_info = userPlanInfo;
                userPlanInfo.read(tTupleProtocol);
                struct.setPlan_infoIsSet(true);
            }
            if (readBitSet.get(2)) {
                LavaQuest lavaQuest = new LavaQuest();
                struct.lava_quest = lavaQuest;
                lavaQuest.read(tTupleProtocol);
                struct.setLava_questIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, FinishRoundRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.award.write(tTupleProtocol);
            struct.award_box.write(tTupleProtocol);
            tTupleProtocol.writeI64(struct.study_record_versin);
            tTupleProtocol.writeI64(struct.plan_version);
            BitSet bitSet = new BitSet();
            if (struct.isSetUser_data_info()) {
                bitSet.set(0);
            }
            if (struct.isSetPlan_info()) {
                bitSet.set(1);
            }
            if (struct.isSetLava_quest()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetUser_data_info()) {
                struct.user_data_info.write(tTupleProtocol);
            }
            if (struct.isSetPlan_info()) {
                struct.plan_info.write(tTupleProtocol);
            }
            if (struct.isSetLava_quest()) {
                struct.lava_quest.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FinishRoundRspTupleSchemeFactory implements SchemeFactory {
        private FinishRoundRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FinishRoundRspTupleScheme getScheme() {
            return new FinishRoundRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AWARD(1, ma.b.D1),
        AWARD_BOX(2, "award_box"),
        STUDY_RECORD_VERSIN(3, "study_record_versin"),
        PLAN_VERSION(4, "plan_version"),
        USER_DATA_INFO(5, "user_data_info"),
        PLAN_INFO(6, "plan_info"),
        LAVA_QUEST(7, "lava_quest");

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
                    return AWARD;
                case 2:
                    return AWARD_BOX;
                case 3:
                    return STUDY_RECORD_VERSIN;
                case 4:
                    return PLAN_VERSION;
                case 5:
                    return USER_DATA_INFO;
                case 6:
                    return PLAN_INFO;
                case 7:
                    return LAVA_QUEST;
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
        hashMap.put(StandardScheme.class, new FinishRoundRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new FinishRoundRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AWARD, (_Fields) new FieldMetaData(ma.b.D1, (byte) 1, new StructMetaData((byte) 12, RoundAwardInfo.class)));
        enumMap.put((EnumMap) _Fields.AWARD_BOX, (_Fields) new FieldMetaData("award_box", (byte) 1, new StructMetaData((byte) 12, AwardBox.class)));
        enumMap.put((EnumMap) _Fields.STUDY_RECORD_VERSIN, (_Fields) new FieldMetaData("study_record_versin", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.PLAN_VERSION, (_Fields) new FieldMetaData("plan_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.USER_DATA_INFO, (_Fields) new FieldMetaData("user_data_info", (byte) 2, new StructMetaData((byte) 12, UserDataInfo.class)));
        enumMap.put((EnumMap) _Fields.PLAN_INFO, (_Fields) new FieldMetaData("plan_info", (byte) 2, new StructMetaData((byte) 12, UserPlanInfo.class)));
        enumMap.put((EnumMap) _Fields.LAVA_QUEST, (_Fields) new FieldMetaData("lava_quest", (byte) 2, new StructMetaData((byte) 12, LavaQuest.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(FinishRoundRsp.class, unmodifiableMap);
    }

    public FinishRoundRsp() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.USER_DATA_INFO, _Fields.PLAN_INFO, _Fields.LAVA_QUEST};
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
        this.award = null;
        this.award_box = null;
        setStudy_record_versinIsSet(false);
        this.study_record_versin = 0L;
        setPlan_versionIsSet(false);
        this.plan_version = 0L;
        this.user_data_info = null;
        this.plan_info = null;
        this.lava_quest = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof FinishRoundRsp)) {
            return equals((FinishRoundRsp) that);
        }
        return false;
    }

    public RoundAwardInfo getAward() {
        return this.award;
    }

    public AwardBox getAward_box() {
        return this.award_box;
    }

    public LavaQuest getLava_quest() {
        return this.lava_quest;
    }

    public UserPlanInfo getPlan_info() {
        return this.plan_info;
    }

    public long getPlan_version() {
        return this.plan_version;
    }

    public long getStudy_record_versin() {
        return this.study_record_versin;
    }

    public UserDataInfo getUser_data_info() {
        return this.user_data_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAward() {
        return this.award != null;
    }

    public boolean isSetAward_box() {
        return this.award_box != null;
    }

    public boolean isSetLava_quest() {
        return this.lava_quest != null;
    }

    public boolean isSetPlan_info() {
        return this.plan_info != null;
    }

    public boolean isSetPlan_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetStudy_record_versin() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUser_data_info() {
        return this.user_data_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public FinishRoundRsp setAward(RoundAwardInfo award) {
        this.award = award;
        return this;
    }

    public void setAwardIsSet(boolean value) {
        if (value) {
            return;
        }
        this.award = null;
    }

    public FinishRoundRsp setAward_box(AwardBox award_box) {
        this.award_box = award_box;
        return this;
    }

    public void setAward_boxIsSet(boolean value) {
        if (value) {
            return;
        }
        this.award_box = null;
    }

    public FinishRoundRsp setLava_quest(LavaQuest lava_quest) {
        this.lava_quest = lava_quest;
        return this;
    }

    public void setLava_questIsSet(boolean value) {
        if (value) {
            return;
        }
        this.lava_quest = null;
    }

    public FinishRoundRsp setPlan_info(UserPlanInfo plan_info) {
        this.plan_info = plan_info;
        return this;
    }

    public void setPlan_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.plan_info = null;
    }

    public FinishRoundRsp setPlan_version(long plan_version) {
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        return this;
    }

    public void setPlan_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public FinishRoundRsp setStudy_record_versin(long study_record_versin) {
        this.study_record_versin = study_record_versin;
        setStudy_record_versinIsSet(true);
        return this;
    }

    public void setStudy_record_versinIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public FinishRoundRsp setUser_data_info(UserDataInfo user_data_info) {
        this.user_data_info = user_data_info;
        return this;
    }

    public void setUser_data_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_data_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FinishRoundRsp(");
        sb2.append("award:");
        RoundAwardInfo roundAwardInfo = this.award;
        if (roundAwardInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(roundAwardInfo);
        }
        sb2.append(j2.O);
        sb2.append("award_box:");
        AwardBox awardBox = this.award_box;
        if (awardBox == null) {
            sb2.append("null");
        } else {
            sb2.append(awardBox);
        }
        sb2.append(j2.O);
        sb2.append("study_record_versin:");
        sb2.append(this.study_record_versin);
        sb2.append(j2.O);
        sb2.append("plan_version:");
        sb2.append(this.plan_version);
        if (isSetUser_data_info()) {
            sb2.append(j2.O);
            sb2.append("user_data_info:");
            UserDataInfo userDataInfo = this.user_data_info;
            if (userDataInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userDataInfo);
            }
        }
        if (isSetPlan_info()) {
            sb2.append(j2.O);
            sb2.append("plan_info:");
            UserPlanInfo userPlanInfo = this.plan_info;
            if (userPlanInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userPlanInfo);
            }
        }
        if (isSetLava_quest()) {
            sb2.append(j2.O);
            sb2.append("lava_quest:");
            LavaQuest lavaQuest = this.lava_quest;
            if (lavaQuest == null) {
                sb2.append("null");
            } else {
                sb2.append(lavaQuest);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAward() {
        this.award = null;
    }

    public void unsetAward_box() {
        this.award_box = null;
    }

    public void unsetLava_quest() {
        this.lava_quest = null;
    }

    public void unsetPlan_info() {
        this.plan_info = null;
    }

    public void unsetPlan_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetStudy_record_versin() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUser_data_info() {
        this.user_data_info = null;
    }

    public void validate() throws TException {
        RoundAwardInfo roundAwardInfo = this.award;
        if (roundAwardInfo == null) {
            throw new TProtocolException("Required field 'award' was not present! Struct: " + toString());
        }
        if (this.award_box == null) {
            throw new TProtocolException("Required field 'award_box' was not present! Struct: " + toString());
        }
        if (roundAwardInfo != null) {
            roundAwardInfo.validate();
        }
        AwardBox awardBox = this.award_box;
        if (awardBox != null) {
            awardBox.validate();
        }
        UserDataInfo userDataInfo = this.user_data_info;
        if (userDataInfo != null) {
            userDataInfo.validate();
        }
        UserPlanInfo userPlanInfo = this.plan_info;
        if (userPlanInfo != null) {
            userPlanInfo.validate();
        }
        LavaQuest lavaQuest = this.lava_quest;
        if (lavaQuest != null) {
            lavaQuest.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(FinishRoundRsp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetAward()).compareTo(Boolean.valueOf(other.isSetAward()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetAward() && (compareTo7 = TBaseHelper.compareTo((Comparable) this.award, (Comparable) other.award)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetAward_box()).compareTo(Boolean.valueOf(other.isSetAward_box()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetAward_box() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.award_box, (Comparable) other.award_box)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetStudy_record_versin()).compareTo(Boolean.valueOf(other.isSetStudy_record_versin()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetStudy_record_versin() && (compareTo5 = TBaseHelper.compareTo(this.study_record_versin, other.study_record_versin)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetPlan_version()).compareTo(Boolean.valueOf(other.isSetPlan_version()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetPlan_version() && (compareTo4 = TBaseHelper.compareTo(this.plan_version, other.plan_version)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetUser_data_info()).compareTo(Boolean.valueOf(other.isSetUser_data_info()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetUser_data_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.user_data_info, (Comparable) other.user_data_info)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetPlan_info()).compareTo(Boolean.valueOf(other.isSetPlan_info()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetPlan_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.plan_info, (Comparable) other.plan_info)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetLava_quest()).compareTo(Boolean.valueOf(other.isSetLava_quest()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetLava_quest() || (compareTo = TBaseHelper.compareTo((Comparable) this.lava_quest, (Comparable) other.lava_quest)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<FinishRoundRsp, _Fields> deepCopy2() {
        return new FinishRoundRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[field.ordinal()]) {
            case 1:
                return getAward();
            case 2:
                return getAward_box();
            case 3:
                return Long.valueOf(getStudy_record_versin());
            case 4:
                return Long.valueOf(getPlan_version());
            case 5:
                return getUser_data_info();
            case 6:
                return getPlan_info();
            case 7:
                return getLava_quest();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[field.ordinal()]) {
            case 1:
                return isSetAward();
            case 2:
                return isSetAward_box();
            case 3:
                return isSetStudy_record_versin();
            case 4:
                return isSetPlan_version();
            case 5:
                return isSetUser_data_info();
            case 6:
                return isSetPlan_info();
            case 7:
                return isSetLava_quest();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$FinishRoundRsp$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAward((RoundAwardInfo) value);
                    break;
                } else {
                    unsetAward();
                    break;
                }
            case 2:
                if (value != null) {
                    setAward_box((AwardBox) value);
                    break;
                } else {
                    unsetAward_box();
                    break;
                }
            case 3:
                if (value != null) {
                    setStudy_record_versin(((Long) value).longValue());
                    break;
                } else {
                    unsetStudy_record_versin();
                    break;
                }
            case 4:
                if (value != null) {
                    setPlan_version(((Long) value).longValue());
                    break;
                } else {
                    unsetPlan_version();
                    break;
                }
            case 5:
                if (value != null) {
                    setUser_data_info((UserDataInfo) value);
                    break;
                } else {
                    unsetUser_data_info();
                    break;
                }
            case 6:
                if (value != null) {
                    setPlan_info((UserPlanInfo) value);
                    break;
                } else {
                    unsetPlan_info();
                    break;
                }
            case 7:
                if (value != null) {
                    setLava_quest((LavaQuest) value);
                    break;
                } else {
                    unsetLava_quest();
                    break;
                }
        }
    }

    public boolean equals(FinishRoundRsp that) {
        if (that == null) {
            return false;
        }
        boolean isSetAward = isSetAward();
        boolean isSetAward2 = that.isSetAward();
        if ((isSetAward || isSetAward2) && !(isSetAward && isSetAward2 && this.award.equals(that.award))) {
            return false;
        }
        boolean isSetAward_box = isSetAward_box();
        boolean isSetAward_box2 = that.isSetAward_box();
        if (((isSetAward_box || isSetAward_box2) && (!isSetAward_box || !isSetAward_box2 || !this.award_box.equals(that.award_box))) || this.study_record_versin != that.study_record_versin || this.plan_version != that.plan_version) {
            return false;
        }
        boolean isSetUser_data_info = isSetUser_data_info();
        boolean isSetUser_data_info2 = that.isSetUser_data_info();
        if ((isSetUser_data_info || isSetUser_data_info2) && !(isSetUser_data_info && isSetUser_data_info2 && this.user_data_info.equals(that.user_data_info))) {
            return false;
        }
        boolean isSetPlan_info = isSetPlan_info();
        boolean isSetPlan_info2 = that.isSetPlan_info();
        if ((isSetPlan_info || isSetPlan_info2) && !(isSetPlan_info && isSetPlan_info2 && this.plan_info.equals(that.plan_info))) {
            return false;
        }
        boolean isSetLava_quest = isSetLava_quest();
        boolean isSetLava_quest2 = that.isSetLava_quest();
        if (isSetLava_quest || isSetLava_quest2) {
            return isSetLava_quest && isSetLava_quest2 && this.lava_quest.equals(that.lava_quest);
        }
        return true;
    }

    public FinishRoundRsp(RoundAwardInfo award, AwardBox award_box, long study_record_versin, long plan_version) {
        this();
        this.award = award;
        this.award_box = award_box;
        this.study_record_versin = study_record_versin;
        setStudy_record_versinIsSet(true);
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
    }

    public FinishRoundRsp(FinishRoundRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.USER_DATA_INFO, _Fields.PLAN_INFO, _Fields.LAVA_QUEST};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAward()) {
            this.award = new RoundAwardInfo(other.award);
        }
        if (other.isSetAward_box()) {
            this.award_box = new AwardBox(other.award_box);
        }
        this.study_record_versin = other.study_record_versin;
        this.plan_version = other.plan_version;
        if (other.isSetUser_data_info()) {
            this.user_data_info = new UserDataInfo(other.user_data_info);
        }
        if (other.isSetPlan_info()) {
            this.plan_info = new UserPlanInfo(other.plan_info);
        }
        if (other.isSetLava_quest()) {
            this.lava_quest = new LavaQuest(other.lava_quest);
        }
    }
}
