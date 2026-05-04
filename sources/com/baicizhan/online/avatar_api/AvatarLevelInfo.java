package com.baicizhan.online.avatar_api;

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
/* loaded from: classes5.dex */
public class AvatarLevelInfo implements TBase<AvatarLevelInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarLevelInfo> {
    private static final int __LEVEL_COOKIE_COST_ISSET_ID = 2;
    private static final int __LEVEL_GIFT_PROB_ISSET_ID = 4;
    private static final int __LEVEL_ISSET_ID = 0;
    private static final int __LEVEL_TRAVEL_TIME_ISSET_ID = 3;
    private static final int __LEVEL_UP_EXP_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int level;
    public int level_cookie_cost;
    public int level_gift_prob;
    public int level_travel_time;
    public int level_up_exp;
    private _Fields[] optionals;
    public List<AvatarActionInfo> unlock_action_list;
    public List<AvatarAreaInfo> unlock_area_list;
    public List<AvatarSkillInfo> unlock_skill_list;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarLevelInfo");
    private static final TField LEVEL_FIELD_DESC = new TField("level", (byte) 8, 1);
    private static final TField LEVEL_UP_EXP_FIELD_DESC = new TField("level_up_exp", (byte) 8, 2);
    private static final TField LEVEL_COOKIE_COST_FIELD_DESC = new TField("level_cookie_cost", (byte) 8, 3);
    private static final TField LEVEL_TRAVEL_TIME_FIELD_DESC = new TField("level_travel_time", (byte) 8, 4);
    private static final TField LEVEL_GIFT_PROB_FIELD_DESC = new TField("level_gift_prob", (byte) 8, 5);
    private static final TField UNLOCK_SKILL_LIST_FIELD_DESC = new TField("unlock_skill_list", (byte) 15, 6);
    private static final TField UNLOCK_AREA_LIST_FIELD_DESC = new TField("unlock_area_list", (byte) 15, 7);
    private static final TField UNLOCK_ACTION_LIST_FIELD_DESC = new TField("unlock_action_list", (byte) 15, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarLevelInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields = iArr;
            try {
                iArr[_Fields.LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.LEVEL_UP_EXP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.LEVEL_COOKIE_COST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.LEVEL_TRAVEL_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.LEVEL_GIFT_PROB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.UNLOCK_SKILL_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.UNLOCK_AREA_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[_Fields.UNLOCK_ACTION_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarLevelInfoStandardScheme extends StandardScheme<AvatarLevelInfo> {
        private AvatarLevelInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarLevelInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetLevel()) {
                        throw new TProtocolException("Required field 'level' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLevel_up_exp()) {
                        throw new TProtocolException("Required field 'level_up_exp' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLevel_cookie_cost()) {
                        throw new TProtocolException("Required field 'level_cookie_cost' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetLevel_travel_time()) {
                        throw new TProtocolException("Required field 'level_travel_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetLevel_gift_prob()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'level_gift_prob' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.level = iprot.readI32();
                            struct.setLevelIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.level_up_exp = iprot.readI32();
                            struct.setLevel_up_expIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.level_cookie_cost = iprot.readI32();
                            struct.setLevel_cookie_costIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.level_travel_time = iprot.readI32();
                            struct.setLevel_travel_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.level_gift_prob = iprot.readI32();
                            struct.setLevel_gift_probIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin = iprot.readListBegin();
                            struct.unlock_skill_list = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                AvatarSkillInfo avatarSkillInfo = new AvatarSkillInfo();
                                avatarSkillInfo.read(iprot);
                                struct.unlock_skill_list.add(avatarSkillInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setUnlock_skill_listIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.unlock_area_list = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                AvatarAreaInfo avatarAreaInfo = new AvatarAreaInfo();
                                avatarAreaInfo.read(iprot);
                                struct.unlock_area_list.add(avatarAreaInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setUnlock_area_listIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin3 = iprot.readListBegin();
                            struct.unlock_action_list = new ArrayList(readListBegin3.size);
                            while (i11 < readListBegin3.size) {
                                AvatarActionInfo avatarActionInfo = new AvatarActionInfo();
                                avatarActionInfo.read(iprot);
                                struct.unlock_action_list.add(avatarActionInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setUnlock_action_listIsSet(true);
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
        public void write(TProtocol oprot, AvatarLevelInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarLevelInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AvatarLevelInfo.LEVEL_FIELD_DESC);
            oprot.writeI32(struct.level);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AvatarLevelInfo.LEVEL_UP_EXP_FIELD_DESC);
            oprot.writeI32(struct.level_up_exp);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AvatarLevelInfo.LEVEL_COOKIE_COST_FIELD_DESC);
            oprot.writeI32(struct.level_cookie_cost);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AvatarLevelInfo.LEVEL_TRAVEL_TIME_FIELD_DESC);
            oprot.writeI32(struct.level_travel_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AvatarLevelInfo.LEVEL_GIFT_PROB_FIELD_DESC);
            oprot.writeI32(struct.level_gift_prob);
            oprot.writeFieldEnd();
            if (struct.unlock_skill_list != null && struct.isSetUnlock_skill_list()) {
                oprot.writeFieldBegin(AvatarLevelInfo.UNLOCK_SKILL_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.unlock_skill_list.size()));
                Iterator<AvatarSkillInfo> it = struct.unlock_skill_list.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.unlock_area_list != null && struct.isSetUnlock_area_list()) {
                oprot.writeFieldBegin(AvatarLevelInfo.UNLOCK_AREA_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.unlock_area_list.size()));
                Iterator<AvatarAreaInfo> it2 = struct.unlock_area_list.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.unlock_action_list != null && struct.isSetUnlock_action_list()) {
                oprot.writeFieldBegin(AvatarLevelInfo.UNLOCK_ACTION_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.unlock_action_list.size()));
                Iterator<AvatarActionInfo> it3 = struct.unlock_action_list.iterator();
                while (it3.hasNext()) {
                    it3.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarLevelInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarLevelInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarLevelInfoStandardScheme getScheme() {
            return new AvatarLevelInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarLevelInfoTupleScheme extends TupleScheme<AvatarLevelInfo> {
        private AvatarLevelInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarLevelInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.level = tTupleProtocol.readI32();
            struct.setLevelIsSet(true);
            struct.level_up_exp = tTupleProtocol.readI32();
            struct.setLevel_up_expIsSet(true);
            struct.level_cookie_cost = tTupleProtocol.readI32();
            struct.setLevel_cookie_costIsSet(true);
            struct.level_travel_time = tTupleProtocol.readI32();
            struct.setLevel_travel_timeIsSet(true);
            struct.level_gift_prob = tTupleProtocol.readI32();
            struct.setLevel_gift_probIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.unlock_skill_list = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    AvatarSkillInfo avatarSkillInfo = new AvatarSkillInfo();
                    avatarSkillInfo.read(tTupleProtocol);
                    struct.unlock_skill_list.add(avatarSkillInfo);
                }
                struct.setUnlock_skill_listIsSet(true);
            }
            if (readBitSet.get(1)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.unlock_area_list = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    AvatarAreaInfo avatarAreaInfo = new AvatarAreaInfo();
                    avatarAreaInfo.read(tTupleProtocol);
                    struct.unlock_area_list.add(avatarAreaInfo);
                }
                struct.setUnlock_area_listIsSet(true);
            }
            if (readBitSet.get(2)) {
                TList tList3 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.unlock_action_list = new ArrayList(tList3.size);
                for (int i13 = 0; i13 < tList3.size; i13++) {
                    AvatarActionInfo avatarActionInfo = new AvatarActionInfo();
                    avatarActionInfo.read(tTupleProtocol);
                    struct.unlock_action_list.add(avatarActionInfo);
                }
                struct.setUnlock_action_listIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarLevelInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.level);
            tTupleProtocol.writeI32(struct.level_up_exp);
            tTupleProtocol.writeI32(struct.level_cookie_cost);
            tTupleProtocol.writeI32(struct.level_travel_time);
            tTupleProtocol.writeI32(struct.level_gift_prob);
            BitSet bitSet = new BitSet();
            if (struct.isSetUnlock_skill_list()) {
                bitSet.set(0);
            }
            if (struct.isSetUnlock_area_list()) {
                bitSet.set(1);
            }
            if (struct.isSetUnlock_action_list()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetUnlock_skill_list()) {
                tTupleProtocol.writeI32(struct.unlock_skill_list.size());
                Iterator<AvatarSkillInfo> it = struct.unlock_skill_list.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetUnlock_area_list()) {
                tTupleProtocol.writeI32(struct.unlock_area_list.size());
                Iterator<AvatarAreaInfo> it2 = struct.unlock_area_list.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetUnlock_action_list()) {
                tTupleProtocol.writeI32(struct.unlock_action_list.size());
                Iterator<AvatarActionInfo> it3 = struct.unlock_action_list.iterator();
                while (it3.hasNext()) {
                    it3.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarLevelInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarLevelInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarLevelInfoTupleScheme getScheme() {
            return new AvatarLevelInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LEVEL(1, "level"),
        LEVEL_UP_EXP(2, "level_up_exp"),
        LEVEL_COOKIE_COST(3, "level_cookie_cost"),
        LEVEL_TRAVEL_TIME(4, "level_travel_time"),
        LEVEL_GIFT_PROB(5, "level_gift_prob"),
        UNLOCK_SKILL_LIST(6, "unlock_skill_list"),
        UNLOCK_AREA_LIST(7, "unlock_area_list"),
        UNLOCK_ACTION_LIST(8, "unlock_action_list");

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
                    return LEVEL;
                case 2:
                    return LEVEL_UP_EXP;
                case 3:
                    return LEVEL_COOKIE_COST;
                case 4:
                    return LEVEL_TRAVEL_TIME;
                case 5:
                    return LEVEL_GIFT_PROB;
                case 6:
                    return UNLOCK_SKILL_LIST;
                case 7:
                    return UNLOCK_AREA_LIST;
                case 8:
                    return UNLOCK_ACTION_LIST;
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
        hashMap.put(StandardScheme.class, new AvatarLevelInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarLevelInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LEVEL, (_Fields) new FieldMetaData("level", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEVEL_UP_EXP, (_Fields) new FieldMetaData("level_up_exp", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEVEL_COOKIE_COST, (_Fields) new FieldMetaData("level_cookie_cost", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEVEL_TRAVEL_TIME, (_Fields) new FieldMetaData("level_travel_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEVEL_GIFT_PROB, (_Fields) new FieldMetaData("level_gift_prob", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.UNLOCK_SKILL_LIST, (_Fields) new FieldMetaData("unlock_skill_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AvatarSkillInfo.class))));
        enumMap.put((EnumMap) _Fields.UNLOCK_AREA_LIST, (_Fields) new FieldMetaData("unlock_area_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AvatarAreaInfo.class))));
        enumMap.put((EnumMap) _Fields.UNLOCK_ACTION_LIST, (_Fields) new FieldMetaData("unlock_action_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AvatarActionInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarLevelInfo.class, unmodifiableMap);
    }

    public AvatarLevelInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.UNLOCK_SKILL_LIST, _Fields.UNLOCK_AREA_LIST, _Fields.UNLOCK_ACTION_LIST};
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

    public void addToUnlock_action_list(AvatarActionInfo elem) {
        if (this.unlock_action_list == null) {
            this.unlock_action_list = new ArrayList();
        }
        this.unlock_action_list.add(elem);
    }

    public void addToUnlock_area_list(AvatarAreaInfo elem) {
        if (this.unlock_area_list == null) {
            this.unlock_area_list = new ArrayList();
        }
        this.unlock_area_list.add(elem);
    }

    public void addToUnlock_skill_list(AvatarSkillInfo elem) {
        if (this.unlock_skill_list == null) {
            this.unlock_skill_list = new ArrayList();
        }
        this.unlock_skill_list.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setLevelIsSet(false);
        this.level = 0;
        setLevel_up_expIsSet(false);
        this.level_up_exp = 0;
        setLevel_cookie_costIsSet(false);
        this.level_cookie_cost = 0;
        setLevel_travel_timeIsSet(false);
        this.level_travel_time = 0;
        setLevel_gift_probIsSet(false);
        this.level_gift_prob = 0;
        this.unlock_skill_list = null;
        this.unlock_area_list = null;
        this.unlock_action_list = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarLevelInfo)) {
            return equals((AvatarLevelInfo) that);
        }
        return false;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLevel_cookie_cost() {
        return this.level_cookie_cost;
    }

    public int getLevel_gift_prob() {
        return this.level_gift_prob;
    }

    public int getLevel_travel_time() {
        return this.level_travel_time;
    }

    public int getLevel_up_exp() {
        return this.level_up_exp;
    }

    public List<AvatarActionInfo> getUnlock_action_list() {
        return this.unlock_action_list;
    }

    public Iterator<AvatarActionInfo> getUnlock_action_listIterator() {
        List<AvatarActionInfo> list = this.unlock_action_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUnlock_action_listSize() {
        List<AvatarActionInfo> list = this.unlock_action_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<AvatarAreaInfo> getUnlock_area_list() {
        return this.unlock_area_list;
    }

    public Iterator<AvatarAreaInfo> getUnlock_area_listIterator() {
        List<AvatarAreaInfo> list = this.unlock_area_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUnlock_area_listSize() {
        List<AvatarAreaInfo> list = this.unlock_area_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<AvatarSkillInfo> getUnlock_skill_list() {
        return this.unlock_skill_list;
    }

    public Iterator<AvatarSkillInfo> getUnlock_skill_listIterator() {
        List<AvatarSkillInfo> list = this.unlock_skill_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUnlock_skill_listSize() {
        List<AvatarSkillInfo> list = this.unlock_skill_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLevel() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLevel_cookie_cost() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLevel_gift_prob() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetLevel_travel_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetLevel_up_exp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetUnlock_action_list() {
        return this.unlock_action_list != null;
    }

    public boolean isSetUnlock_area_list() {
        return this.unlock_area_list != null;
    }

    public boolean isSetUnlock_skill_list() {
        return this.unlock_skill_list != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarLevelInfo setLevel(int level) {
        this.level = level;
        setLevelIsSet(true);
        return this;
    }

    public void setLevelIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AvatarLevelInfo setLevel_cookie_cost(int level_cookie_cost) {
        this.level_cookie_cost = level_cookie_cost;
        setLevel_cookie_costIsSet(true);
        return this;
    }

    public void setLevel_cookie_costIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public AvatarLevelInfo setLevel_gift_prob(int level_gift_prob) {
        this.level_gift_prob = level_gift_prob;
        setLevel_gift_probIsSet(true);
        return this;
    }

    public void setLevel_gift_probIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public AvatarLevelInfo setLevel_travel_time(int level_travel_time) {
        this.level_travel_time = level_travel_time;
        setLevel_travel_timeIsSet(true);
        return this;
    }

    public void setLevel_travel_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public AvatarLevelInfo setLevel_up_exp(int level_up_exp) {
        this.level_up_exp = level_up_exp;
        setLevel_up_expIsSet(true);
        return this;
    }

    public void setLevel_up_expIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AvatarLevelInfo setUnlock_action_list(List<AvatarActionInfo> unlock_action_list) {
        this.unlock_action_list = unlock_action_list;
        return this;
    }

    public void setUnlock_action_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.unlock_action_list = null;
    }

    public AvatarLevelInfo setUnlock_area_list(List<AvatarAreaInfo> unlock_area_list) {
        this.unlock_area_list = unlock_area_list;
        return this;
    }

    public void setUnlock_area_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.unlock_area_list = null;
    }

    public AvatarLevelInfo setUnlock_skill_list(List<AvatarSkillInfo> unlock_skill_list) {
        this.unlock_skill_list = unlock_skill_list;
        return this;
    }

    public void setUnlock_skill_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.unlock_skill_list = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarLevelInfo(");
        sb2.append("level:");
        sb2.append(this.level);
        sb2.append(j2.O);
        sb2.append("level_up_exp:");
        sb2.append(this.level_up_exp);
        sb2.append(j2.O);
        sb2.append("level_cookie_cost:");
        sb2.append(this.level_cookie_cost);
        sb2.append(j2.O);
        sb2.append("level_travel_time:");
        sb2.append(this.level_travel_time);
        sb2.append(j2.O);
        sb2.append("level_gift_prob:");
        sb2.append(this.level_gift_prob);
        if (isSetUnlock_skill_list()) {
            sb2.append(j2.O);
            sb2.append("unlock_skill_list:");
            List<AvatarSkillInfo> list = this.unlock_skill_list;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        if (isSetUnlock_area_list()) {
            sb2.append(j2.O);
            sb2.append("unlock_area_list:");
            List<AvatarAreaInfo> list2 = this.unlock_area_list;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        if (isSetUnlock_action_list()) {
            sb2.append(j2.O);
            sb2.append("unlock_action_list:");
            List<AvatarActionInfo> list3 = this.unlock_action_list;
            if (list3 == null) {
                sb2.append("null");
            } else {
                sb2.append(list3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLevel() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLevel_cookie_cost() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLevel_gift_prob() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetLevel_travel_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetLevel_up_exp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetUnlock_action_list() {
        this.unlock_action_list = null;
    }

    public void unsetUnlock_area_list() {
        this.unlock_area_list = null;
    }

    public void unsetUnlock_skill_list() {
        this.unlock_skill_list = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarLevelInfo other) {
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
        int compareTo9 = Boolean.valueOf(isSetLevel()).compareTo(Boolean.valueOf(other.isSetLevel()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetLevel() && (compareTo8 = TBaseHelper.compareTo(this.level, other.level)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetLevel_up_exp()).compareTo(Boolean.valueOf(other.isSetLevel_up_exp()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetLevel_up_exp() && (compareTo7 = TBaseHelper.compareTo(this.level_up_exp, other.level_up_exp)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetLevel_cookie_cost()).compareTo(Boolean.valueOf(other.isSetLevel_cookie_cost()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetLevel_cookie_cost() && (compareTo6 = TBaseHelper.compareTo(this.level_cookie_cost, other.level_cookie_cost)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetLevel_travel_time()).compareTo(Boolean.valueOf(other.isSetLevel_travel_time()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetLevel_travel_time() && (compareTo5 = TBaseHelper.compareTo(this.level_travel_time, other.level_travel_time)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetLevel_gift_prob()).compareTo(Boolean.valueOf(other.isSetLevel_gift_prob()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetLevel_gift_prob() && (compareTo4 = TBaseHelper.compareTo(this.level_gift_prob, other.level_gift_prob)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetUnlock_skill_list()).compareTo(Boolean.valueOf(other.isSetUnlock_skill_list()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetUnlock_skill_list() && (compareTo3 = TBaseHelper.compareTo((List) this.unlock_skill_list, (List) other.unlock_skill_list)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetUnlock_area_list()).compareTo(Boolean.valueOf(other.isSetUnlock_area_list()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetUnlock_area_list() && (compareTo2 = TBaseHelper.compareTo((List) this.unlock_area_list, (List) other.unlock_area_list)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetUnlock_action_list()).compareTo(Boolean.valueOf(other.isSetUnlock_action_list()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetUnlock_action_list() || (compareTo = TBaseHelper.compareTo((List) this.unlock_action_list, (List) other.unlock_action_list)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarLevelInfo, _Fields> deepCopy2() {
        return new AvatarLevelInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getLevel());
            case 2:
                return Integer.valueOf(getLevel_up_exp());
            case 3:
                return Integer.valueOf(getLevel_cookie_cost());
            case 4:
                return Integer.valueOf(getLevel_travel_time());
            case 5:
                return Integer.valueOf(getLevel_gift_prob());
            case 6:
                return getUnlock_skill_list();
            case 7:
                return getUnlock_area_list();
            case 8:
                return getUnlock_action_list();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetLevel();
            case 2:
                return isSetLevel_up_exp();
            case 3:
                return isSetLevel_cookie_cost();
            case 4:
                return isSetLevel_travel_time();
            case 5:
                return isSetLevel_gift_prob();
            case 6:
                return isSetUnlock_skill_list();
            case 7:
                return isSetUnlock_area_list();
            case 8:
                return isSetUnlock_action_list();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarLevelInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setLevel(((Integer) value).intValue());
                    break;
                } else {
                    unsetLevel();
                    break;
                }
            case 2:
                if (value != null) {
                    setLevel_up_exp(((Integer) value).intValue());
                    break;
                } else {
                    unsetLevel_up_exp();
                    break;
                }
            case 3:
                if (value != null) {
                    setLevel_cookie_cost(((Integer) value).intValue());
                    break;
                } else {
                    unsetLevel_cookie_cost();
                    break;
                }
            case 4:
                if (value != null) {
                    setLevel_travel_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetLevel_travel_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setLevel_gift_prob(((Integer) value).intValue());
                    break;
                } else {
                    unsetLevel_gift_prob();
                    break;
                }
            case 6:
                if (value != null) {
                    setUnlock_skill_list((List) value);
                    break;
                } else {
                    unsetUnlock_skill_list();
                    break;
                }
            case 7:
                if (value != null) {
                    setUnlock_area_list((List) value);
                    break;
                } else {
                    unsetUnlock_area_list();
                    break;
                }
            case 8:
                if (value != null) {
                    setUnlock_action_list((List) value);
                    break;
                } else {
                    unsetUnlock_action_list();
                    break;
                }
        }
    }

    public boolean equals(AvatarLevelInfo that) {
        if (that == null || this.level != that.level || this.level_up_exp != that.level_up_exp || this.level_cookie_cost != that.level_cookie_cost || this.level_travel_time != that.level_travel_time || this.level_gift_prob != that.level_gift_prob) {
            return false;
        }
        boolean isSetUnlock_skill_list = isSetUnlock_skill_list();
        boolean isSetUnlock_skill_list2 = that.isSetUnlock_skill_list();
        if ((isSetUnlock_skill_list || isSetUnlock_skill_list2) && !(isSetUnlock_skill_list && isSetUnlock_skill_list2 && this.unlock_skill_list.equals(that.unlock_skill_list))) {
            return false;
        }
        boolean isSetUnlock_area_list = isSetUnlock_area_list();
        boolean isSetUnlock_area_list2 = that.isSetUnlock_area_list();
        if ((isSetUnlock_area_list || isSetUnlock_area_list2) && !(isSetUnlock_area_list && isSetUnlock_area_list2 && this.unlock_area_list.equals(that.unlock_area_list))) {
            return false;
        }
        boolean isSetUnlock_action_list = isSetUnlock_action_list();
        boolean isSetUnlock_action_list2 = that.isSetUnlock_action_list();
        if (isSetUnlock_action_list || isSetUnlock_action_list2) {
            return isSetUnlock_action_list && isSetUnlock_action_list2 && this.unlock_action_list.equals(that.unlock_action_list);
        }
        return true;
    }

    public AvatarLevelInfo(int level, int level_up_exp, int level_cookie_cost, int level_travel_time, int level_gift_prob) {
        this();
        this.level = level;
        setLevelIsSet(true);
        this.level_up_exp = level_up_exp;
        setLevel_up_expIsSet(true);
        this.level_cookie_cost = level_cookie_cost;
        setLevel_cookie_costIsSet(true);
        this.level_travel_time = level_travel_time;
        setLevel_travel_timeIsSet(true);
        this.level_gift_prob = level_gift_prob;
        setLevel_gift_probIsSet(true);
    }

    public AvatarLevelInfo(AvatarLevelInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.UNLOCK_SKILL_LIST, _Fields.UNLOCK_AREA_LIST, _Fields.UNLOCK_ACTION_LIST};
        this.__isset_bitfield = other.__isset_bitfield;
        this.level = other.level;
        this.level_up_exp = other.level_up_exp;
        this.level_cookie_cost = other.level_cookie_cost;
        this.level_travel_time = other.level_travel_time;
        this.level_gift_prob = other.level_gift_prob;
        if (other.isSetUnlock_skill_list()) {
            ArrayList arrayList = new ArrayList(other.unlock_skill_list.size());
            Iterator<AvatarSkillInfo> it = other.unlock_skill_list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AvatarSkillInfo(it.next()));
            }
            this.unlock_skill_list = arrayList;
        }
        if (other.isSetUnlock_area_list()) {
            ArrayList arrayList2 = new ArrayList(other.unlock_area_list.size());
            Iterator<AvatarAreaInfo> it2 = other.unlock_area_list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new AvatarAreaInfo(it2.next()));
            }
            this.unlock_area_list = arrayList2;
        }
        if (other.isSetUnlock_action_list()) {
            ArrayList arrayList3 = new ArrayList(other.unlock_action_list.size());
            Iterator<AvatarActionInfo> it3 = other.unlock_action_list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new AvatarActionInfo(it3.next()));
            }
            this.unlock_action_list = arrayList3;
        }
    }

    public void validate() throws TException {
    }
}
