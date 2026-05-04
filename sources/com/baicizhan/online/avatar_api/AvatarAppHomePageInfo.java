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
public class AvatarAppHomePageInfo implements TBase<AvatarAppHomePageInfo, _Fields>, Serializable, Cloneable, Comparable<AvatarAppHomePageInfo> {
    private static final int __IP_HAS_ISSET_ID = 1;
    private static final int __TRAVEL_IS_MAX_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public UserCurrentAvatarInfo cur_ip_info;
    public AvatarAreaInfo cur_travel_area_info;
    public boolean ip_has;
    public UserAvatarRecordInfo ip_record_info;
    private _Fields[] optionals;
    public boolean travel_is_max;
    public List<AvatarActionInfo> unlock_action_list;
    public List<AvatarSkillInfo> unlock_skill_list;
    private static final TStruct STRUCT_DESC = new TStruct("AvatarAppHomePageInfo");
    private static final TField CUR_IP_INFO_FIELD_DESC = new TField("cur_ip_info", (byte) 12, 1);
    private static final TField IP_RECORD_INFO_FIELD_DESC = new TField("ip_record_info", (byte) 12, 2);
    private static final TField TRAVEL_IS_MAX_FIELD_DESC = new TField("travel_is_max", (byte) 2, 3);
    private static final TField IP_HAS_FIELD_DESC = new TField("ip_has", (byte) 2, 4);
    private static final TField UNLOCK_SKILL_LIST_FIELD_DESC = new TField("unlock_skill_list", (byte) 15, 5);
    private static final TField UNLOCK_ACTION_LIST_FIELD_DESC = new TField("unlock_action_list", (byte) 15, 6);
    private static final TField CUR_TRAVEL_AREA_INFO_FIELD_DESC = new TField("cur_travel_area_info", (byte) 12, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.AvatarAppHomePageInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields = iArr;
            try {
                iArr[_Fields.CUR_IP_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[_Fields.IP_RECORD_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[_Fields.TRAVEL_IS_MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[_Fields.IP_HAS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[_Fields.UNLOCK_SKILL_LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[_Fields.UNLOCK_ACTION_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[_Fields.CUR_TRAVEL_AREA_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAppHomePageInfoStandardScheme extends StandardScheme<AvatarAppHomePageInfo> {
        private AvatarAppHomePageInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AvatarAppHomePageInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetIp_has()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'ip_has' was not found in serialized data! Struct: " + toString());
                }
                int i11 = 0;
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserCurrentAvatarInfo userCurrentAvatarInfo = new UserCurrentAvatarInfo();
                            struct.cur_ip_info = userCurrentAvatarInfo;
                            userCurrentAvatarInfo.read(iprot);
                            struct.setCur_ip_infoIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserAvatarRecordInfo userAvatarRecordInfo = new UserAvatarRecordInfo();
                            struct.ip_record_info = userAvatarRecordInfo;
                            userAvatarRecordInfo.read(iprot);
                            struct.setIp_record_infoIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.travel_is_max = iprot.readBool();
                            struct.setTravel_is_maxIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ip_has = iprot.readBool();
                            struct.setIp_hasIsSet(true);
                            break;
                        }
                    case 5:
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
                    case 6:
                        if (b11 != 15) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TList readListBegin2 = iprot.readListBegin();
                            struct.unlock_action_list = new ArrayList(readListBegin2.size);
                            while (i11 < readListBegin2.size) {
                                AvatarActionInfo avatarActionInfo = new AvatarActionInfo();
                                avatarActionInfo.read(iprot);
                                struct.unlock_action_list.add(avatarActionInfo);
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setUnlock_action_listIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AvatarAreaInfo avatarAreaInfo = new AvatarAreaInfo();
                            struct.cur_travel_area_info = avatarAreaInfo;
                            avatarAreaInfo.read(iprot);
                            struct.setCur_travel_area_infoIsSet(true);
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
        public void write(TProtocol oprot, AvatarAppHomePageInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AvatarAppHomePageInfo.STRUCT_DESC);
            if (struct.cur_ip_info != null && struct.isSetCur_ip_info()) {
                oprot.writeFieldBegin(AvatarAppHomePageInfo.CUR_IP_INFO_FIELD_DESC);
                struct.cur_ip_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.ip_record_info != null && struct.isSetIp_record_info()) {
                oprot.writeFieldBegin(AvatarAppHomePageInfo.IP_RECORD_INFO_FIELD_DESC);
                struct.ip_record_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTravel_is_max()) {
                oprot.writeFieldBegin(AvatarAppHomePageInfo.TRAVEL_IS_MAX_FIELD_DESC);
                oprot.writeBool(struct.travel_is_max);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(AvatarAppHomePageInfo.IP_HAS_FIELD_DESC);
            oprot.writeBool(struct.ip_has);
            oprot.writeFieldEnd();
            if (struct.unlock_skill_list != null && struct.isSetUnlock_skill_list()) {
                oprot.writeFieldBegin(AvatarAppHomePageInfo.UNLOCK_SKILL_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.unlock_skill_list.size()));
                Iterator<AvatarSkillInfo> it = struct.unlock_skill_list.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.unlock_action_list != null && struct.isSetUnlock_action_list()) {
                oprot.writeFieldBegin(AvatarAppHomePageInfo.UNLOCK_ACTION_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.unlock_action_list.size()));
                Iterator<AvatarActionInfo> it2 = struct.unlock_action_list.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.cur_travel_area_info != null && struct.isSetCur_travel_area_info()) {
                oprot.writeFieldBegin(AvatarAppHomePageInfo.CUR_TRAVEL_AREA_INFO_FIELD_DESC);
                struct.cur_travel_area_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAppHomePageInfoStandardSchemeFactory implements SchemeFactory {
        private AvatarAppHomePageInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarAppHomePageInfoStandardScheme getScheme() {
            return new AvatarAppHomePageInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAppHomePageInfoTupleScheme extends TupleScheme<AvatarAppHomePageInfo> {
        private AvatarAppHomePageInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AvatarAppHomePageInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ip_has = tTupleProtocol.readBool();
            struct.setIp_hasIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(6);
            if (readBitSet.get(0)) {
                UserCurrentAvatarInfo userCurrentAvatarInfo = new UserCurrentAvatarInfo();
                struct.cur_ip_info = userCurrentAvatarInfo;
                userCurrentAvatarInfo.read(tTupleProtocol);
                struct.setCur_ip_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                UserAvatarRecordInfo userAvatarRecordInfo = new UserAvatarRecordInfo();
                struct.ip_record_info = userAvatarRecordInfo;
                userAvatarRecordInfo.read(tTupleProtocol);
                struct.setIp_record_infoIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.travel_is_max = tTupleProtocol.readBool();
                struct.setTravel_is_maxIsSet(true);
            }
            if (readBitSet.get(3)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.unlock_skill_list = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    AvatarSkillInfo avatarSkillInfo = new AvatarSkillInfo();
                    avatarSkillInfo.read(tTupleProtocol);
                    struct.unlock_skill_list.add(avatarSkillInfo);
                }
                struct.setUnlock_skill_listIsSet(true);
            }
            if (readBitSet.get(4)) {
                TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
                struct.unlock_action_list = new ArrayList(tList2.size);
                for (int i12 = 0; i12 < tList2.size; i12++) {
                    AvatarActionInfo avatarActionInfo = new AvatarActionInfo();
                    avatarActionInfo.read(tTupleProtocol);
                    struct.unlock_action_list.add(avatarActionInfo);
                }
                struct.setUnlock_action_listIsSet(true);
            }
            if (readBitSet.get(5)) {
                AvatarAreaInfo avatarAreaInfo = new AvatarAreaInfo();
                struct.cur_travel_area_info = avatarAreaInfo;
                avatarAreaInfo.read(tTupleProtocol);
                struct.setCur_travel_area_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AvatarAppHomePageInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBool(struct.ip_has);
            BitSet bitSet = new BitSet();
            if (struct.isSetCur_ip_info()) {
                bitSet.set(0);
            }
            if (struct.isSetIp_record_info()) {
                bitSet.set(1);
            }
            if (struct.isSetTravel_is_max()) {
                bitSet.set(2);
            }
            if (struct.isSetUnlock_skill_list()) {
                bitSet.set(3);
            }
            if (struct.isSetUnlock_action_list()) {
                bitSet.set(4);
            }
            if (struct.isSetCur_travel_area_info()) {
                bitSet.set(5);
            }
            tTupleProtocol.writeBitSet(bitSet, 6);
            if (struct.isSetCur_ip_info()) {
                struct.cur_ip_info.write(tTupleProtocol);
            }
            if (struct.isSetIp_record_info()) {
                struct.ip_record_info.write(tTupleProtocol);
            }
            if (struct.isSetTravel_is_max()) {
                tTupleProtocol.writeBool(struct.travel_is_max);
            }
            if (struct.isSetUnlock_skill_list()) {
                tTupleProtocol.writeI32(struct.unlock_skill_list.size());
                Iterator<AvatarSkillInfo> it = struct.unlock_skill_list.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetUnlock_action_list()) {
                tTupleProtocol.writeI32(struct.unlock_action_list.size());
                Iterator<AvatarActionInfo> it2 = struct.unlock_action_list.iterator();
                while (it2.hasNext()) {
                    it2.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetCur_travel_area_info()) {
                struct.cur_travel_area_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AvatarAppHomePageInfoTupleSchemeFactory implements SchemeFactory {
        private AvatarAppHomePageInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AvatarAppHomePageInfoTupleScheme getScheme() {
            return new AvatarAppHomePageInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CUR_IP_INFO(1, "cur_ip_info"),
        IP_RECORD_INFO(2, "ip_record_info"),
        TRAVEL_IS_MAX(3, "travel_is_max"),
        IP_HAS(4, "ip_has"),
        UNLOCK_SKILL_LIST(5, "unlock_skill_list"),
        UNLOCK_ACTION_LIST(6, "unlock_action_list"),
        CUR_TRAVEL_AREA_INFO(7, "cur_travel_area_info");

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
                    return CUR_IP_INFO;
                case 2:
                    return IP_RECORD_INFO;
                case 3:
                    return TRAVEL_IS_MAX;
                case 4:
                    return IP_HAS;
                case 5:
                    return UNLOCK_SKILL_LIST;
                case 6:
                    return UNLOCK_ACTION_LIST;
                case 7:
                    return CUR_TRAVEL_AREA_INFO;
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
        hashMap.put(StandardScheme.class, new AvatarAppHomePageInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AvatarAppHomePageInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CUR_IP_INFO, (_Fields) new FieldMetaData("cur_ip_info", (byte) 2, new StructMetaData((byte) 12, UserCurrentAvatarInfo.class)));
        enumMap.put((EnumMap) _Fields.IP_RECORD_INFO, (_Fields) new FieldMetaData("ip_record_info", (byte) 2, new StructMetaData((byte) 12, UserAvatarRecordInfo.class)));
        enumMap.put((EnumMap) _Fields.TRAVEL_IS_MAX, (_Fields) new FieldMetaData("travel_is_max", (byte) 2, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.IP_HAS, (_Fields) new FieldMetaData("ip_has", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.UNLOCK_SKILL_LIST, (_Fields) new FieldMetaData("unlock_skill_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AvatarSkillInfo.class))));
        enumMap.put((EnumMap) _Fields.UNLOCK_ACTION_LIST, (_Fields) new FieldMetaData("unlock_action_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AvatarActionInfo.class))));
        enumMap.put((EnumMap) _Fields.CUR_TRAVEL_AREA_INFO, (_Fields) new FieldMetaData("cur_travel_area_info", (byte) 2, new StructMetaData((byte) 12, AvatarAreaInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AvatarAppHomePageInfo.class, unmodifiableMap);
    }

    public AvatarAppHomePageInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CUR_IP_INFO, _Fields.IP_RECORD_INFO, _Fields.TRAVEL_IS_MAX, _Fields.UNLOCK_SKILL_LIST, _Fields.UNLOCK_ACTION_LIST, _Fields.CUR_TRAVEL_AREA_INFO};
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

    public void addToUnlock_skill_list(AvatarSkillInfo elem) {
        if (this.unlock_skill_list == null) {
            this.unlock_skill_list = new ArrayList();
        }
        this.unlock_skill_list.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.cur_ip_info = null;
        this.ip_record_info = null;
        setTravel_is_maxIsSet(false);
        this.travel_is_max = false;
        setIp_hasIsSet(false);
        this.ip_has = false;
        this.unlock_skill_list = null;
        this.unlock_action_list = null;
        this.cur_travel_area_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AvatarAppHomePageInfo)) {
            return equals((AvatarAppHomePageInfo) that);
        }
        return false;
    }

    public UserCurrentAvatarInfo getCur_ip_info() {
        return this.cur_ip_info;
    }

    public AvatarAreaInfo getCur_travel_area_info() {
        return this.cur_travel_area_info;
    }

    public UserAvatarRecordInfo getIp_record_info() {
        return this.ip_record_info;
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

    public boolean isIp_has() {
        return this.ip_has;
    }

    public boolean isSetCur_ip_info() {
        return this.cur_ip_info != null;
    }

    public boolean isSetCur_travel_area_info() {
        return this.cur_travel_area_info != null;
    }

    public boolean isSetIp_has() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIp_record_info() {
        return this.ip_record_info != null;
    }

    public boolean isSetTravel_is_max() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUnlock_action_list() {
        return this.unlock_action_list != null;
    }

    public boolean isSetUnlock_skill_list() {
        return this.unlock_skill_list != null;
    }

    public boolean isTravel_is_max() {
        return this.travel_is_max;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AvatarAppHomePageInfo setCur_ip_info(UserCurrentAvatarInfo cur_ip_info) {
        this.cur_ip_info = cur_ip_info;
        return this;
    }

    public void setCur_ip_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cur_ip_info = null;
    }

    public AvatarAppHomePageInfo setCur_travel_area_info(AvatarAreaInfo cur_travel_area_info) {
        this.cur_travel_area_info = cur_travel_area_info;
        return this;
    }

    public void setCur_travel_area_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.cur_travel_area_info = null;
    }

    public AvatarAppHomePageInfo setIp_has(boolean ip_has) {
        this.ip_has = ip_has;
        setIp_hasIsSet(true);
        return this;
    }

    public void setIp_hasIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AvatarAppHomePageInfo setIp_record_info(UserAvatarRecordInfo ip_record_info) {
        this.ip_record_info = ip_record_info;
        return this;
    }

    public void setIp_record_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ip_record_info = null;
    }

    public AvatarAppHomePageInfo setTravel_is_max(boolean travel_is_max) {
        this.travel_is_max = travel_is_max;
        setTravel_is_maxIsSet(true);
        return this;
    }

    public void setTravel_is_maxIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AvatarAppHomePageInfo setUnlock_action_list(List<AvatarActionInfo> unlock_action_list) {
        this.unlock_action_list = unlock_action_list;
        return this;
    }

    public void setUnlock_action_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.unlock_action_list = null;
    }

    public AvatarAppHomePageInfo setUnlock_skill_list(List<AvatarSkillInfo> unlock_skill_list) {
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
        boolean z11;
        StringBuilder sb2 = new StringBuilder("AvatarAppHomePageInfo(");
        boolean z12 = false;
        if (isSetCur_ip_info()) {
            sb2.append("cur_ip_info:");
            UserCurrentAvatarInfo userCurrentAvatarInfo = this.cur_ip_info;
            if (userCurrentAvatarInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userCurrentAvatarInfo);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetIp_record_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("ip_record_info:");
            UserAvatarRecordInfo userAvatarRecordInfo = this.ip_record_info;
            if (userAvatarRecordInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(userAvatarRecordInfo);
            }
            z11 = false;
        }
        if (isSetTravel_is_max()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("travel_is_max:");
            sb2.append(this.travel_is_max);
        } else {
            z12 = z11;
        }
        if (!z12) {
            sb2.append(j2.O);
        }
        sb2.append("ip_has:");
        sb2.append(this.ip_has);
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
        if (isSetUnlock_action_list()) {
            sb2.append(j2.O);
            sb2.append("unlock_action_list:");
            List<AvatarActionInfo> list2 = this.unlock_action_list;
            if (list2 == null) {
                sb2.append("null");
            } else {
                sb2.append(list2);
            }
        }
        if (isSetCur_travel_area_info()) {
            sb2.append(j2.O);
            sb2.append("cur_travel_area_info:");
            AvatarAreaInfo avatarAreaInfo = this.cur_travel_area_info;
            if (avatarAreaInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(avatarAreaInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCur_ip_info() {
        this.cur_ip_info = null;
    }

    public void unsetCur_travel_area_info() {
        this.cur_travel_area_info = null;
    }

    public void unsetIp_has() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIp_record_info() {
        this.ip_record_info = null;
    }

    public void unsetTravel_is_max() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUnlock_action_list() {
        this.unlock_action_list = null;
    }

    public void unsetUnlock_skill_list() {
        this.unlock_skill_list = null;
    }

    public void validate() throws TException {
        UserCurrentAvatarInfo userCurrentAvatarInfo = this.cur_ip_info;
        if (userCurrentAvatarInfo != null) {
            userCurrentAvatarInfo.validate();
        }
        UserAvatarRecordInfo userAvatarRecordInfo = this.ip_record_info;
        if (userAvatarRecordInfo != null) {
            userAvatarRecordInfo.validate();
        }
        AvatarAreaInfo avatarAreaInfo = this.cur_travel_area_info;
        if (avatarAreaInfo != null) {
            avatarAreaInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AvatarAppHomePageInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetCur_ip_info()).compareTo(Boolean.valueOf(other.isSetCur_ip_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetCur_ip_info() && (compareTo7 = TBaseHelper.compareTo((Comparable) this.cur_ip_info, (Comparable) other.cur_ip_info)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetIp_record_info()).compareTo(Boolean.valueOf(other.isSetIp_record_info()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetIp_record_info() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.ip_record_info, (Comparable) other.ip_record_info)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetTravel_is_max()).compareTo(Boolean.valueOf(other.isSetTravel_is_max()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetTravel_is_max() && (compareTo5 = TBaseHelper.compareTo(this.travel_is_max, other.travel_is_max)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetIp_has()).compareTo(Boolean.valueOf(other.isSetIp_has()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetIp_has() && (compareTo4 = TBaseHelper.compareTo(this.ip_has, other.ip_has)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetUnlock_skill_list()).compareTo(Boolean.valueOf(other.isSetUnlock_skill_list()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetUnlock_skill_list() && (compareTo3 = TBaseHelper.compareTo((List) this.unlock_skill_list, (List) other.unlock_skill_list)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetUnlock_action_list()).compareTo(Boolean.valueOf(other.isSetUnlock_action_list()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetUnlock_action_list() && (compareTo2 = TBaseHelper.compareTo((List) this.unlock_action_list, (List) other.unlock_action_list)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetCur_travel_area_info()).compareTo(Boolean.valueOf(other.isSetCur_travel_area_info()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetCur_travel_area_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.cur_travel_area_info, (Comparable) other.cur_travel_area_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AvatarAppHomePageInfo, _Fields> deepCopy2() {
        return new AvatarAppHomePageInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[field.ordinal()]) {
            case 1:
                return getCur_ip_info();
            case 2:
                return getIp_record_info();
            case 3:
                return Boolean.valueOf(isTravel_is_max());
            case 4:
                return Boolean.valueOf(isIp_has());
            case 5:
                return getUnlock_skill_list();
            case 6:
                return getUnlock_action_list();
            case 7:
                return getCur_travel_area_info();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetCur_ip_info();
            case 2:
                return isSetIp_record_info();
            case 3:
                return isSetTravel_is_max();
            case 4:
                return isSetIp_has();
            case 5:
                return isSetUnlock_skill_list();
            case 6:
                return isSetUnlock_action_list();
            case 7:
                return isSetCur_travel_area_info();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$AvatarAppHomePageInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setCur_ip_info((UserCurrentAvatarInfo) value);
                    break;
                } else {
                    unsetCur_ip_info();
                    break;
                }
            case 2:
                if (value != null) {
                    setIp_record_info((UserAvatarRecordInfo) value);
                    break;
                } else {
                    unsetIp_record_info();
                    break;
                }
            case 3:
                if (value != null) {
                    setTravel_is_max(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetTravel_is_max();
                    break;
                }
            case 4:
                if (value != null) {
                    setIp_has(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIp_has();
                    break;
                }
            case 5:
                if (value != null) {
                    setUnlock_skill_list((List) value);
                    break;
                } else {
                    unsetUnlock_skill_list();
                    break;
                }
            case 6:
                if (value != null) {
                    setUnlock_action_list((List) value);
                    break;
                } else {
                    unsetUnlock_action_list();
                    break;
                }
            case 7:
                if (value != null) {
                    setCur_travel_area_info((AvatarAreaInfo) value);
                    break;
                } else {
                    unsetCur_travel_area_info();
                    break;
                }
        }
    }

    public boolean equals(AvatarAppHomePageInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetCur_ip_info = isSetCur_ip_info();
        boolean isSetCur_ip_info2 = that.isSetCur_ip_info();
        if ((isSetCur_ip_info || isSetCur_ip_info2) && !(isSetCur_ip_info && isSetCur_ip_info2 && this.cur_ip_info.equals(that.cur_ip_info))) {
            return false;
        }
        boolean isSetIp_record_info = isSetIp_record_info();
        boolean isSetIp_record_info2 = that.isSetIp_record_info();
        if ((isSetIp_record_info || isSetIp_record_info2) && !(isSetIp_record_info && isSetIp_record_info2 && this.ip_record_info.equals(that.ip_record_info))) {
            return false;
        }
        boolean isSetTravel_is_max = isSetTravel_is_max();
        boolean isSetTravel_is_max2 = that.isSetTravel_is_max();
        if (((isSetTravel_is_max || isSetTravel_is_max2) && !(isSetTravel_is_max && isSetTravel_is_max2 && this.travel_is_max == that.travel_is_max)) || this.ip_has != that.ip_has) {
            return false;
        }
        boolean isSetUnlock_skill_list = isSetUnlock_skill_list();
        boolean isSetUnlock_skill_list2 = that.isSetUnlock_skill_list();
        if ((isSetUnlock_skill_list || isSetUnlock_skill_list2) && !(isSetUnlock_skill_list && isSetUnlock_skill_list2 && this.unlock_skill_list.equals(that.unlock_skill_list))) {
            return false;
        }
        boolean isSetUnlock_action_list = isSetUnlock_action_list();
        boolean isSetUnlock_action_list2 = that.isSetUnlock_action_list();
        if ((isSetUnlock_action_list || isSetUnlock_action_list2) && !(isSetUnlock_action_list && isSetUnlock_action_list2 && this.unlock_action_list.equals(that.unlock_action_list))) {
            return false;
        }
        boolean isSetCur_travel_area_info = isSetCur_travel_area_info();
        boolean isSetCur_travel_area_info2 = that.isSetCur_travel_area_info();
        if (isSetCur_travel_area_info || isSetCur_travel_area_info2) {
            return isSetCur_travel_area_info && isSetCur_travel_area_info2 && this.cur_travel_area_info.equals(that.cur_travel_area_info);
        }
        return true;
    }

    public AvatarAppHomePageInfo(boolean ip_has) {
        this();
        this.ip_has = ip_has;
        setIp_hasIsSet(true);
    }

    public AvatarAppHomePageInfo(AvatarAppHomePageInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.CUR_IP_INFO, _Fields.IP_RECORD_INFO, _Fields.TRAVEL_IS_MAX, _Fields.UNLOCK_SKILL_LIST, _Fields.UNLOCK_ACTION_LIST, _Fields.CUR_TRAVEL_AREA_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetCur_ip_info()) {
            this.cur_ip_info = new UserCurrentAvatarInfo(other.cur_ip_info);
        }
        if (other.isSetIp_record_info()) {
            this.ip_record_info = new UserAvatarRecordInfo(other.ip_record_info);
        }
        this.travel_is_max = other.travel_is_max;
        this.ip_has = other.ip_has;
        if (other.isSetUnlock_skill_list()) {
            ArrayList arrayList = new ArrayList(other.unlock_skill_list.size());
            Iterator<AvatarSkillInfo> it = other.unlock_skill_list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AvatarSkillInfo(it.next()));
            }
            this.unlock_skill_list = arrayList;
        }
        if (other.isSetUnlock_action_list()) {
            ArrayList arrayList2 = new ArrayList(other.unlock_action_list.size());
            Iterator<AvatarActionInfo> it2 = other.unlock_action_list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new AvatarActionInfo(it2.next()));
            }
            this.unlock_action_list = arrayList2;
        }
        if (other.isSetCur_travel_area_info()) {
            this.cur_travel_area_info = new AvatarAreaInfo(other.cur_travel_area_info);
        }
    }
}
