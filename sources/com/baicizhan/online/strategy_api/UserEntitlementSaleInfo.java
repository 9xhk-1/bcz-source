package com.baicizhan.online.strategy_api;

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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class UserEntitlementSaleInfo implements TBase<UserEntitlementSaleInfo, _Fields>, Serializable, Cloneable, Comparable<UserEntitlementSaleInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public MemberSaleInfo member_sale_info;
    public List<MemberSaleInfo> member_sale_info_list;
    private _Fields[] optionals;
    public RedHeartSaleInfo red_heart_sale_info;
    public EnergyAdInfo sentence_energy_ad_info;
    public EnergySaleInfo sentence_energy_sale_info;
    public EnergyAdInfo word_energy_ad_info;
    public EnergySaleInfo word_energy_sale_info;
    private static final TStruct STRUCT_DESC = new TStruct("UserEntitlementSaleInfo");
    private static final TField MEMBER_SALE_INFO_FIELD_DESC = new TField("member_sale_info", (byte) 12, 1);
    private static final TField WORD_ENERGY_SALE_INFO_FIELD_DESC = new TField("word_energy_sale_info", (byte) 12, 2);
    private static final TField WORD_ENERGY_AD_INFO_FIELD_DESC = new TField("word_energy_ad_info", (byte) 12, 3);
    private static final TField RED_HEART_SALE_INFO_FIELD_DESC = new TField("red_heart_sale_info", (byte) 12, 4);
    private static final TField SENTENCE_ENERGY_SALE_INFO_FIELD_DESC = new TField("sentence_energy_sale_info", (byte) 12, 5);
    private static final TField SENTENCE_ENERGY_AD_INFO_FIELD_DESC = new TField("sentence_energy_ad_info", (byte) 12, 6);
    private static final TField MEMBER_SALE_INFO_LIST_FIELD_DESC = new TField("member_sale_info_list", (byte) 15, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.UserEntitlementSaleInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields = iArr;
            try {
                iArr[_Fields.MEMBER_SALE_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[_Fields.WORD_ENERGY_SALE_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[_Fields.WORD_ENERGY_AD_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[_Fields.RED_HEART_SALE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[_Fields.SENTENCE_ENERGY_SALE_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[_Fields.SENTENCE_ENERGY_AD_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[_Fields.MEMBER_SALE_INFO_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementSaleInfoStandardScheme extends StandardScheme<UserEntitlementSaleInfo> {
        private UserEntitlementSaleInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserEntitlementSaleInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 == 12) {
                            MemberSaleInfo memberSaleInfo = new MemberSaleInfo();
                            struct.member_sale_info = memberSaleInfo;
                            memberSaleInfo.read(iprot);
                            struct.setMember_sale_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 12) {
                            EnergySaleInfo energySaleInfo = new EnergySaleInfo();
                            struct.word_energy_sale_info = energySaleInfo;
                            energySaleInfo.read(iprot);
                            struct.setWord_energy_sale_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 12) {
                            EnergyAdInfo energyAdInfo = new EnergyAdInfo();
                            struct.word_energy_ad_info = energyAdInfo;
                            energyAdInfo.read(iprot);
                            struct.setWord_energy_ad_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 12) {
                            RedHeartSaleInfo redHeartSaleInfo = new RedHeartSaleInfo();
                            struct.red_heart_sale_info = redHeartSaleInfo;
                            redHeartSaleInfo.read(iprot);
                            struct.setRed_heart_sale_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 12) {
                            EnergySaleInfo energySaleInfo2 = new EnergySaleInfo();
                            struct.sentence_energy_sale_info = energySaleInfo2;
                            energySaleInfo2.read(iprot);
                            struct.setSentence_energy_sale_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 12) {
                            EnergyAdInfo energyAdInfo2 = new EnergyAdInfo();
                            struct.sentence_energy_ad_info = energyAdInfo2;
                            energyAdInfo2.read(iprot);
                            struct.setSentence_energy_ad_infoIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        }
                    case 7:
                        if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.member_sale_info_list = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                MemberSaleInfo memberSaleInfo2 = new MemberSaleInfo();
                                memberSaleInfo2.read(iprot);
                                struct.member_sale_info_list.add(memberSaleInfo2);
                            }
                            iprot.readListEnd();
                            struct.setMember_sale_info_listIsSet(true);
                            break;
                        } else {
                            TProtocolUtil.skip(iprot, b11);
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
        public void write(TProtocol oprot, UserEntitlementSaleInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserEntitlementSaleInfo.STRUCT_DESC);
            if (struct.member_sale_info != null && struct.isSetMember_sale_info()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.MEMBER_SALE_INFO_FIELD_DESC);
                struct.member_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.word_energy_sale_info != null && struct.isSetWord_energy_sale_info()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.WORD_ENERGY_SALE_INFO_FIELD_DESC);
                struct.word_energy_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.word_energy_ad_info != null && struct.isSetWord_energy_ad_info()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.WORD_ENERGY_AD_INFO_FIELD_DESC);
                struct.word_energy_ad_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.red_heart_sale_info != null && struct.isSetRed_heart_sale_info()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.RED_HEART_SALE_INFO_FIELD_DESC);
                struct.red_heart_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_energy_sale_info != null && struct.isSetSentence_energy_sale_info()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.SENTENCE_ENERGY_SALE_INFO_FIELD_DESC);
                struct.sentence_energy_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_energy_ad_info != null && struct.isSetSentence_energy_ad_info()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.SENTENCE_ENERGY_AD_INFO_FIELD_DESC);
                struct.sentence_energy_ad_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.member_sale_info_list != null && struct.isSetMember_sale_info_list()) {
                oprot.writeFieldBegin(UserEntitlementSaleInfo.MEMBER_SALE_INFO_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.member_sale_info_list.size()));
                Iterator<MemberSaleInfo> it = struct.member_sale_info_list.iterator();
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
    public static class UserEntitlementSaleInfoStandardSchemeFactory implements SchemeFactory {
        private UserEntitlementSaleInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserEntitlementSaleInfoStandardScheme getScheme() {
            return new UserEntitlementSaleInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementSaleInfoTupleScheme extends TupleScheme<UserEntitlementSaleInfo> {
        private UserEntitlementSaleInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserEntitlementSaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(7);
            if (readBitSet.get(0)) {
                MemberSaleInfo memberSaleInfo = new MemberSaleInfo();
                struct.member_sale_info = memberSaleInfo;
                memberSaleInfo.read(tTupleProtocol);
                struct.setMember_sale_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                EnergySaleInfo energySaleInfo = new EnergySaleInfo();
                struct.word_energy_sale_info = energySaleInfo;
                energySaleInfo.read(tTupleProtocol);
                struct.setWord_energy_sale_infoIsSet(true);
            }
            if (readBitSet.get(2)) {
                EnergyAdInfo energyAdInfo = new EnergyAdInfo();
                struct.word_energy_ad_info = energyAdInfo;
                energyAdInfo.read(tTupleProtocol);
                struct.setWord_energy_ad_infoIsSet(true);
            }
            if (readBitSet.get(3)) {
                RedHeartSaleInfo redHeartSaleInfo = new RedHeartSaleInfo();
                struct.red_heart_sale_info = redHeartSaleInfo;
                redHeartSaleInfo.read(tTupleProtocol);
                struct.setRed_heart_sale_infoIsSet(true);
            }
            if (readBitSet.get(4)) {
                EnergySaleInfo energySaleInfo2 = new EnergySaleInfo();
                struct.sentence_energy_sale_info = energySaleInfo2;
                energySaleInfo2.read(tTupleProtocol);
                struct.setSentence_energy_sale_infoIsSet(true);
            }
            if (readBitSet.get(5)) {
                EnergyAdInfo energyAdInfo2 = new EnergyAdInfo();
                struct.sentence_energy_ad_info = energyAdInfo2;
                energyAdInfo2.read(tTupleProtocol);
                struct.setSentence_energy_ad_infoIsSet(true);
            }
            if (readBitSet.get(6)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.member_sale_info_list = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    MemberSaleInfo memberSaleInfo2 = new MemberSaleInfo();
                    memberSaleInfo2.read(tTupleProtocol);
                    struct.member_sale_info_list.add(memberSaleInfo2);
                }
                struct.setMember_sale_info_listIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserEntitlementSaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetMember_sale_info()) {
                bitSet.set(0);
            }
            if (struct.isSetWord_energy_sale_info()) {
                bitSet.set(1);
            }
            if (struct.isSetWord_energy_ad_info()) {
                bitSet.set(2);
            }
            if (struct.isSetRed_heart_sale_info()) {
                bitSet.set(3);
            }
            if (struct.isSetSentence_energy_sale_info()) {
                bitSet.set(4);
            }
            if (struct.isSetSentence_energy_ad_info()) {
                bitSet.set(5);
            }
            if (struct.isSetMember_sale_info_list()) {
                bitSet.set(6);
            }
            tTupleProtocol.writeBitSet(bitSet, 7);
            if (struct.isSetMember_sale_info()) {
                struct.member_sale_info.write(tTupleProtocol);
            }
            if (struct.isSetWord_energy_sale_info()) {
                struct.word_energy_sale_info.write(tTupleProtocol);
            }
            if (struct.isSetWord_energy_ad_info()) {
                struct.word_energy_ad_info.write(tTupleProtocol);
            }
            if (struct.isSetRed_heart_sale_info()) {
                struct.red_heart_sale_info.write(tTupleProtocol);
            }
            if (struct.isSetSentence_energy_sale_info()) {
                struct.sentence_energy_sale_info.write(tTupleProtocol);
            }
            if (struct.isSetSentence_energy_ad_info()) {
                struct.sentence_energy_ad_info.write(tTupleProtocol);
            }
            if (struct.isSetMember_sale_info_list()) {
                tTupleProtocol.writeI32(struct.member_sale_info_list.size());
                Iterator<MemberSaleInfo> it = struct.member_sale_info_list.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementSaleInfoTupleSchemeFactory implements SchemeFactory {
        private UserEntitlementSaleInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserEntitlementSaleInfoTupleScheme getScheme() {
            return new UserEntitlementSaleInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MEMBER_SALE_INFO(1, "member_sale_info"),
        WORD_ENERGY_SALE_INFO(2, "word_energy_sale_info"),
        WORD_ENERGY_AD_INFO(3, "word_energy_ad_info"),
        RED_HEART_SALE_INFO(4, "red_heart_sale_info"),
        SENTENCE_ENERGY_SALE_INFO(5, "sentence_energy_sale_info"),
        SENTENCE_ENERGY_AD_INFO(6, "sentence_energy_ad_info"),
        MEMBER_SALE_INFO_LIST(7, "member_sale_info_list");

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
                    return MEMBER_SALE_INFO;
                case 2:
                    return WORD_ENERGY_SALE_INFO;
                case 3:
                    return WORD_ENERGY_AD_INFO;
                case 4:
                    return RED_HEART_SALE_INFO;
                case 5:
                    return SENTENCE_ENERGY_SALE_INFO;
                case 6:
                    return SENTENCE_ENERGY_AD_INFO;
                case 7:
                    return MEMBER_SALE_INFO_LIST;
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
        hashMap.put(StandardScheme.class, new UserEntitlementSaleInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserEntitlementSaleInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MEMBER_SALE_INFO, (_Fields) new FieldMetaData("member_sale_info", (byte) 2, new StructMetaData((byte) 12, MemberSaleInfo.class)));
        enumMap.put((EnumMap) _Fields.WORD_ENERGY_SALE_INFO, (_Fields) new FieldMetaData("word_energy_sale_info", (byte) 2, new StructMetaData((byte) 12, EnergySaleInfo.class)));
        enumMap.put((EnumMap) _Fields.WORD_ENERGY_AD_INFO, (_Fields) new FieldMetaData("word_energy_ad_info", (byte) 2, new StructMetaData((byte) 12, EnergyAdInfo.class)));
        enumMap.put((EnumMap) _Fields.RED_HEART_SALE_INFO, (_Fields) new FieldMetaData("red_heart_sale_info", (byte) 2, new StructMetaData((byte) 12, RedHeartSaleInfo.class)));
        enumMap.put((EnumMap) _Fields.SENTENCE_ENERGY_SALE_INFO, (_Fields) new FieldMetaData("sentence_energy_sale_info", (byte) 2, new StructMetaData((byte) 12, EnergySaleInfo.class)));
        enumMap.put((EnumMap) _Fields.SENTENCE_ENERGY_AD_INFO, (_Fields) new FieldMetaData("sentence_energy_ad_info", (byte) 2, new StructMetaData((byte) 12, EnergyAdInfo.class)));
        enumMap.put((EnumMap) _Fields.MEMBER_SALE_INFO_LIST, (_Fields) new FieldMetaData("member_sale_info_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, MemberSaleInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserEntitlementSaleInfo.class, unmodifiableMap);
    }

    public UserEntitlementSaleInfo() {
        this.optionals = new _Fields[]{_Fields.MEMBER_SALE_INFO, _Fields.WORD_ENERGY_SALE_INFO, _Fields.WORD_ENERGY_AD_INFO, _Fields.RED_HEART_SALE_INFO, _Fields.SENTENCE_ENERGY_SALE_INFO, _Fields.SENTENCE_ENERGY_AD_INFO, _Fields.MEMBER_SALE_INFO_LIST};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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

    public void addToMember_sale_info_list(MemberSaleInfo elem) {
        if (this.member_sale_info_list == null) {
            this.member_sale_info_list = new ArrayList();
        }
        this.member_sale_info_list.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.member_sale_info = null;
        this.word_energy_sale_info = null;
        this.word_energy_ad_info = null;
        this.red_heart_sale_info = null;
        this.sentence_energy_sale_info = null;
        this.sentence_energy_ad_info = null;
        this.member_sale_info_list = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserEntitlementSaleInfo)) {
            return equals((UserEntitlementSaleInfo) that);
        }
        return false;
    }

    public MemberSaleInfo getMember_sale_info() {
        return this.member_sale_info;
    }

    public List<MemberSaleInfo> getMember_sale_info_list() {
        return this.member_sale_info_list;
    }

    public Iterator<MemberSaleInfo> getMember_sale_info_listIterator() {
        List<MemberSaleInfo> list = this.member_sale_info_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getMember_sale_info_listSize() {
        List<MemberSaleInfo> list = this.member_sale_info_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public RedHeartSaleInfo getRed_heart_sale_info() {
        return this.red_heart_sale_info;
    }

    public EnergyAdInfo getSentence_energy_ad_info() {
        return this.sentence_energy_ad_info;
    }

    public EnergySaleInfo getSentence_energy_sale_info() {
        return this.sentence_energy_sale_info;
    }

    public EnergyAdInfo getWord_energy_ad_info() {
        return this.word_energy_ad_info;
    }

    public EnergySaleInfo getWord_energy_sale_info() {
        return this.word_energy_sale_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMember_sale_info() {
        return this.member_sale_info != null;
    }

    public boolean isSetMember_sale_info_list() {
        return this.member_sale_info_list != null;
    }

    public boolean isSetRed_heart_sale_info() {
        return this.red_heart_sale_info != null;
    }

    public boolean isSetSentence_energy_ad_info() {
        return this.sentence_energy_ad_info != null;
    }

    public boolean isSetSentence_energy_sale_info() {
        return this.sentence_energy_sale_info != null;
    }

    public boolean isSetWord_energy_ad_info() {
        return this.word_energy_ad_info != null;
    }

    public boolean isSetWord_energy_sale_info() {
        return this.word_energy_sale_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserEntitlementSaleInfo setMember_sale_info(MemberSaleInfo member_sale_info) {
        this.member_sale_info = member_sale_info;
        return this;
    }

    public void setMember_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.member_sale_info = null;
    }

    public UserEntitlementSaleInfo setMember_sale_info_list(List<MemberSaleInfo> member_sale_info_list) {
        this.member_sale_info_list = member_sale_info_list;
        return this;
    }

    public void setMember_sale_info_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.member_sale_info_list = null;
    }

    public UserEntitlementSaleInfo setRed_heart_sale_info(RedHeartSaleInfo red_heart_sale_info) {
        this.red_heart_sale_info = red_heart_sale_info;
        return this;
    }

    public void setRed_heart_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.red_heart_sale_info = null;
    }

    public UserEntitlementSaleInfo setSentence_energy_ad_info(EnergyAdInfo sentence_energy_ad_info) {
        this.sentence_energy_ad_info = sentence_energy_ad_info;
        return this;
    }

    public void setSentence_energy_ad_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_energy_ad_info = null;
    }

    public UserEntitlementSaleInfo setSentence_energy_sale_info(EnergySaleInfo sentence_energy_sale_info) {
        this.sentence_energy_sale_info = sentence_energy_sale_info;
        return this;
    }

    public void setSentence_energy_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_energy_sale_info = null;
    }

    public UserEntitlementSaleInfo setWord_energy_ad_info(EnergyAdInfo word_energy_ad_info) {
        this.word_energy_ad_info = word_energy_ad_info;
        return this;
    }

    public void setWord_energy_ad_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_energy_ad_info = null;
    }

    public UserEntitlementSaleInfo setWord_energy_sale_info(EnergySaleInfo word_energy_sale_info) {
        this.word_energy_sale_info = word_energy_sale_info;
        return this;
    }

    public void setWord_energy_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_energy_sale_info = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("UserEntitlementSaleInfo(");
        boolean z12 = false;
        if (isSetMember_sale_info()) {
            sb2.append("member_sale_info:");
            MemberSaleInfo memberSaleInfo = this.member_sale_info;
            if (memberSaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(memberSaleInfo);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetWord_energy_sale_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("word_energy_sale_info:");
            EnergySaleInfo energySaleInfo = this.word_energy_sale_info;
            if (energySaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(energySaleInfo);
            }
            z11 = false;
        }
        if (isSetWord_energy_ad_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("word_energy_ad_info:");
            EnergyAdInfo energyAdInfo = this.word_energy_ad_info;
            if (energyAdInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(energyAdInfo);
            }
            z11 = false;
        }
        if (isSetRed_heart_sale_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("red_heart_sale_info:");
            RedHeartSaleInfo redHeartSaleInfo = this.red_heart_sale_info;
            if (redHeartSaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(redHeartSaleInfo);
            }
            z11 = false;
        }
        if (isSetSentence_energy_sale_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("sentence_energy_sale_info:");
            EnergySaleInfo energySaleInfo2 = this.sentence_energy_sale_info;
            if (energySaleInfo2 == null) {
                sb2.append("null");
            } else {
                sb2.append(energySaleInfo2);
            }
            z11 = false;
        }
        if (isSetSentence_energy_ad_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("sentence_energy_ad_info:");
            EnergyAdInfo energyAdInfo2 = this.sentence_energy_ad_info;
            if (energyAdInfo2 == null) {
                sb2.append("null");
            } else {
                sb2.append(energyAdInfo2);
            }
        } else {
            z12 = z11;
        }
        if (isSetMember_sale_info_list()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("member_sale_info_list:");
            List<MemberSaleInfo> list = this.member_sale_info_list;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMember_sale_info() {
        this.member_sale_info = null;
    }

    public void unsetMember_sale_info_list() {
        this.member_sale_info_list = null;
    }

    public void unsetRed_heart_sale_info() {
        this.red_heart_sale_info = null;
    }

    public void unsetSentence_energy_ad_info() {
        this.sentence_energy_ad_info = null;
    }

    public void unsetSentence_energy_sale_info() {
        this.sentence_energy_sale_info = null;
    }

    public void unsetWord_energy_ad_info() {
        this.word_energy_ad_info = null;
    }

    public void unsetWord_energy_sale_info() {
        this.word_energy_sale_info = null;
    }

    public void validate() throws TException {
        MemberSaleInfo memberSaleInfo = this.member_sale_info;
        if (memberSaleInfo != null) {
            memberSaleInfo.validate();
        }
        EnergySaleInfo energySaleInfo = this.word_energy_sale_info;
        if (energySaleInfo != null) {
            energySaleInfo.validate();
        }
        EnergyAdInfo energyAdInfo = this.word_energy_ad_info;
        if (energyAdInfo != null) {
            energyAdInfo.validate();
        }
        RedHeartSaleInfo redHeartSaleInfo = this.red_heart_sale_info;
        if (redHeartSaleInfo != null) {
            redHeartSaleInfo.validate();
        }
        EnergySaleInfo energySaleInfo2 = this.sentence_energy_sale_info;
        if (energySaleInfo2 != null) {
            energySaleInfo2.validate();
        }
        EnergyAdInfo energyAdInfo2 = this.sentence_energy_ad_info;
        if (energyAdInfo2 != null) {
            energyAdInfo2.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserEntitlementSaleInfo other) {
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
        int compareTo8 = Boolean.valueOf(isSetMember_sale_info()).compareTo(Boolean.valueOf(other.isSetMember_sale_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetMember_sale_info() && (compareTo7 = TBaseHelper.compareTo((Comparable) this.member_sale_info, (Comparable) other.member_sale_info)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetWord_energy_sale_info()).compareTo(Boolean.valueOf(other.isSetWord_energy_sale_info()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetWord_energy_sale_info() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.word_energy_sale_info, (Comparable) other.word_energy_sale_info)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetWord_energy_ad_info()).compareTo(Boolean.valueOf(other.isSetWord_energy_ad_info()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetWord_energy_ad_info() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.word_energy_ad_info, (Comparable) other.word_energy_ad_info)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetRed_heart_sale_info()).compareTo(Boolean.valueOf(other.isSetRed_heart_sale_info()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetRed_heart_sale_info() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.red_heart_sale_info, (Comparable) other.red_heart_sale_info)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetSentence_energy_sale_info()).compareTo(Boolean.valueOf(other.isSetSentence_energy_sale_info()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetSentence_energy_sale_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.sentence_energy_sale_info, (Comparable) other.sentence_energy_sale_info)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetSentence_energy_ad_info()).compareTo(Boolean.valueOf(other.isSetSentence_energy_ad_info()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetSentence_energy_ad_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.sentence_energy_ad_info, (Comparable) other.sentence_energy_ad_info)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetMember_sale_info_list()).compareTo(Boolean.valueOf(other.isSetMember_sale_info_list()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetMember_sale_info_list() || (compareTo = TBaseHelper.compareTo((List) this.member_sale_info_list, (List) other.member_sale_info_list)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserEntitlementSaleInfo, _Fields> deepCopy2() {
        return new UserEntitlementSaleInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[field.ordinal()]) {
            case 1:
                return getMember_sale_info();
            case 2:
                return getWord_energy_sale_info();
            case 3:
                return getWord_energy_ad_info();
            case 4:
                return getRed_heart_sale_info();
            case 5:
                return getSentence_energy_sale_info();
            case 6:
                return getSentence_energy_ad_info();
            case 7:
                return getMember_sale_info_list();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetMember_sale_info();
            case 2:
                return isSetWord_energy_sale_info();
            case 3:
                return isSetWord_energy_ad_info();
            case 4:
                return isSetRed_heart_sale_info();
            case 5:
                return isSetSentence_energy_sale_info();
            case 6:
                return isSetSentence_energy_ad_info();
            case 7:
                return isSetMember_sale_info_list();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementSaleInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setMember_sale_info((MemberSaleInfo) value);
                    break;
                } else {
                    unsetMember_sale_info();
                    break;
                }
            case 2:
                if (value != null) {
                    setWord_energy_sale_info((EnergySaleInfo) value);
                    break;
                } else {
                    unsetWord_energy_sale_info();
                    break;
                }
            case 3:
                if (value != null) {
                    setWord_energy_ad_info((EnergyAdInfo) value);
                    break;
                } else {
                    unsetWord_energy_ad_info();
                    break;
                }
            case 4:
                if (value != null) {
                    setRed_heart_sale_info((RedHeartSaleInfo) value);
                    break;
                } else {
                    unsetRed_heart_sale_info();
                    break;
                }
            case 5:
                if (value != null) {
                    setSentence_energy_sale_info((EnergySaleInfo) value);
                    break;
                } else {
                    unsetSentence_energy_sale_info();
                    break;
                }
            case 6:
                if (value != null) {
                    setSentence_energy_ad_info((EnergyAdInfo) value);
                    break;
                } else {
                    unsetSentence_energy_ad_info();
                    break;
                }
            case 7:
                if (value != null) {
                    setMember_sale_info_list((List) value);
                    break;
                } else {
                    unsetMember_sale_info_list();
                    break;
                }
        }
    }

    public UserEntitlementSaleInfo(UserEntitlementSaleInfo other) {
        this.optionals = new _Fields[]{_Fields.MEMBER_SALE_INFO, _Fields.WORD_ENERGY_SALE_INFO, _Fields.WORD_ENERGY_AD_INFO, _Fields.RED_HEART_SALE_INFO, _Fields.SENTENCE_ENERGY_SALE_INFO, _Fields.SENTENCE_ENERGY_AD_INFO, _Fields.MEMBER_SALE_INFO_LIST};
        if (other.isSetMember_sale_info()) {
            this.member_sale_info = new MemberSaleInfo(other.member_sale_info);
        }
        if (other.isSetWord_energy_sale_info()) {
            this.word_energy_sale_info = new EnergySaleInfo(other.word_energy_sale_info);
        }
        if (other.isSetWord_energy_ad_info()) {
            this.word_energy_ad_info = new EnergyAdInfo(other.word_energy_ad_info);
        }
        if (other.isSetRed_heart_sale_info()) {
            this.red_heart_sale_info = new RedHeartSaleInfo(other.red_heart_sale_info);
        }
        if (other.isSetSentence_energy_sale_info()) {
            this.sentence_energy_sale_info = new EnergySaleInfo(other.sentence_energy_sale_info);
        }
        if (other.isSetSentence_energy_ad_info()) {
            this.sentence_energy_ad_info = new EnergyAdInfo(other.sentence_energy_ad_info);
        }
        if (other.isSetMember_sale_info_list()) {
            ArrayList arrayList = new ArrayList(other.member_sale_info_list.size());
            Iterator<MemberSaleInfo> it = other.member_sale_info_list.iterator();
            while (it.hasNext()) {
                arrayList.add(new MemberSaleInfo(it.next()));
            }
            this.member_sale_info_list = arrayList;
        }
    }

    public boolean equals(UserEntitlementSaleInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetMember_sale_info = isSetMember_sale_info();
        boolean isSetMember_sale_info2 = that.isSetMember_sale_info();
        if ((isSetMember_sale_info || isSetMember_sale_info2) && !(isSetMember_sale_info && isSetMember_sale_info2 && this.member_sale_info.equals(that.member_sale_info))) {
            return false;
        }
        boolean isSetWord_energy_sale_info = isSetWord_energy_sale_info();
        boolean isSetWord_energy_sale_info2 = that.isSetWord_energy_sale_info();
        if ((isSetWord_energy_sale_info || isSetWord_energy_sale_info2) && !(isSetWord_energy_sale_info && isSetWord_energy_sale_info2 && this.word_energy_sale_info.equals(that.word_energy_sale_info))) {
            return false;
        }
        boolean isSetWord_energy_ad_info = isSetWord_energy_ad_info();
        boolean isSetWord_energy_ad_info2 = that.isSetWord_energy_ad_info();
        if ((isSetWord_energy_ad_info || isSetWord_energy_ad_info2) && !(isSetWord_energy_ad_info && isSetWord_energy_ad_info2 && this.word_energy_ad_info.equals(that.word_energy_ad_info))) {
            return false;
        }
        boolean isSetRed_heart_sale_info = isSetRed_heart_sale_info();
        boolean isSetRed_heart_sale_info2 = that.isSetRed_heart_sale_info();
        if ((isSetRed_heart_sale_info || isSetRed_heart_sale_info2) && !(isSetRed_heart_sale_info && isSetRed_heart_sale_info2 && this.red_heart_sale_info.equals(that.red_heart_sale_info))) {
            return false;
        }
        boolean isSetSentence_energy_sale_info = isSetSentence_energy_sale_info();
        boolean isSetSentence_energy_sale_info2 = that.isSetSentence_energy_sale_info();
        if ((isSetSentence_energy_sale_info || isSetSentence_energy_sale_info2) && !(isSetSentence_energy_sale_info && isSetSentence_energy_sale_info2 && this.sentence_energy_sale_info.equals(that.sentence_energy_sale_info))) {
            return false;
        }
        boolean isSetSentence_energy_ad_info = isSetSentence_energy_ad_info();
        boolean isSetSentence_energy_ad_info2 = that.isSetSentence_energy_ad_info();
        if ((isSetSentence_energy_ad_info || isSetSentence_energy_ad_info2) && !(isSetSentence_energy_ad_info && isSetSentence_energy_ad_info2 && this.sentence_energy_ad_info.equals(that.sentence_energy_ad_info))) {
            return false;
        }
        boolean isSetMember_sale_info_list = isSetMember_sale_info_list();
        boolean isSetMember_sale_info_list2 = that.isSetMember_sale_info_list();
        if (isSetMember_sale_info_list || isSetMember_sale_info_list2) {
            return isSetMember_sale_info_list && isSetMember_sale_info_list2 && this.member_sale_info_list.equals(that.member_sale_info_list);
        }
        return true;
    }
}
