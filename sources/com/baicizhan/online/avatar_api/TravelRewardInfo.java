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
public class TravelRewardInfo implements TBase<TravelRewardInfo, _Fields>, Serializable, Cloneable, Comparable<TravelRewardInfo> {
    private static final int __CREDIT_ISSET_ID = 1;
    private static final int __EXP_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int credit;
    public int exp;
    public List<AvatarGiftInfo> gift_list;
    public AvatarLevelInfo level_info;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("TravelRewardInfo");
    private static final TField GIFT_LIST_FIELD_DESC = new TField("gift_list", (byte) 15, 1);
    private static final TField EXP_FIELD_DESC = new TField(w9.i.f96007a, (byte) 8, 2);
    private static final TField CREDIT_FIELD_DESC = new TField("credit", (byte) 8, 3);
    private static final TField LEVEL_INFO_FIELD_DESC = new TField("level_info", (byte) 12, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.avatar_api.TravelRewardInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields = iArr;
            try {
                iArr[_Fields.GIFT_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields[_Fields.EXP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields[_Fields.CREDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields[_Fields.LEVEL_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TravelRewardInfoStandardScheme extends StandardScheme<TravelRewardInfo> {
        private TravelRewardInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TravelRewardInfo struct) throws TException {
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
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 12) {
                                AvatarLevelInfo avatarLevelInfo = new AvatarLevelInfo();
                                struct.level_info = avatarLevelInfo;
                                avatarLevelInfo.read(iprot);
                                struct.setLevel_infoIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.credit = iprot.readI32();
                            struct.setCreditIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.exp = iprot.readI32();
                        struct.setExpIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.gift_list = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        AvatarGiftInfo avatarGiftInfo = new AvatarGiftInfo();
                        avatarGiftInfo.read(iprot);
                        struct.gift_list.add(avatarGiftInfo);
                    }
                    iprot.readListEnd();
                    struct.setGift_listIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TravelRewardInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TravelRewardInfo.STRUCT_DESC);
            if (struct.gift_list != null && struct.isSetGift_list()) {
                oprot.writeFieldBegin(TravelRewardInfo.GIFT_LIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.gift_list.size()));
                Iterator<AvatarGiftInfo> it = struct.gift_list.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetExp()) {
                oprot.writeFieldBegin(TravelRewardInfo.EXP_FIELD_DESC);
                oprot.writeI32(struct.exp);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCredit()) {
                oprot.writeFieldBegin(TravelRewardInfo.CREDIT_FIELD_DESC);
                oprot.writeI32(struct.credit);
                oprot.writeFieldEnd();
            }
            if (struct.level_info != null && struct.isSetLevel_info()) {
                oprot.writeFieldBegin(TravelRewardInfo.LEVEL_INFO_FIELD_DESC);
                struct.level_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TravelRewardInfoStandardSchemeFactory implements SchemeFactory {
        private TravelRewardInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TravelRewardInfoStandardScheme getScheme() {
            return new TravelRewardInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TravelRewardInfoTupleScheme extends TupleScheme<TravelRewardInfo> {
        private TravelRewardInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TravelRewardInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.gift_list = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    AvatarGiftInfo avatarGiftInfo = new AvatarGiftInfo();
                    avatarGiftInfo.read(tTupleProtocol);
                    struct.gift_list.add(avatarGiftInfo);
                }
                struct.setGift_listIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.exp = tTupleProtocol.readI32();
                struct.setExpIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.credit = tTupleProtocol.readI32();
                struct.setCreditIsSet(true);
            }
            if (readBitSet.get(3)) {
                AvatarLevelInfo avatarLevelInfo = new AvatarLevelInfo();
                struct.level_info = avatarLevelInfo;
                avatarLevelInfo.read(tTupleProtocol);
                struct.setLevel_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TravelRewardInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetGift_list()) {
                bitSet.set(0);
            }
            if (struct.isSetExp()) {
                bitSet.set(1);
            }
            if (struct.isSetCredit()) {
                bitSet.set(2);
            }
            if (struct.isSetLevel_info()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetGift_list()) {
                tTupleProtocol.writeI32(struct.gift_list.size());
                Iterator<AvatarGiftInfo> it = struct.gift_list.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetExp()) {
                tTupleProtocol.writeI32(struct.exp);
            }
            if (struct.isSetCredit()) {
                tTupleProtocol.writeI32(struct.credit);
            }
            if (struct.isSetLevel_info()) {
                struct.level_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TravelRewardInfoTupleSchemeFactory implements SchemeFactory {
        private TravelRewardInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TravelRewardInfoTupleScheme getScheme() {
            return new TravelRewardInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        GIFT_LIST(1, "gift_list"),
        EXP(2, w9.i.f96007a),
        CREDIT(3, "credit"),
        LEVEL_INFO(4, "level_info");

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
                return GIFT_LIST;
            }
            if (fieldId == 2) {
                return EXP;
            }
            if (fieldId == 3) {
                return CREDIT;
            }
            if (fieldId != 4) {
                return null;
            }
            return LEVEL_INFO;
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
        hashMap.put(StandardScheme.class, new TravelRewardInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TravelRewardInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.GIFT_LIST, (_Fields) new FieldMetaData("gift_list", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AvatarGiftInfo.class))));
        enumMap.put((EnumMap) _Fields.EXP, (_Fields) new FieldMetaData(w9.i.f96007a, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CREDIT, (_Fields) new FieldMetaData("credit", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LEVEL_INFO, (_Fields) new FieldMetaData("level_info", (byte) 2, new StructMetaData((byte) 12, AvatarLevelInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TravelRewardInfo.class, unmodifiableMap);
    }

    public TravelRewardInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.GIFT_LIST, _Fields.EXP, _Fields.CREDIT, _Fields.LEVEL_INFO};
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

    public void addToGift_list(AvatarGiftInfo elem) {
        if (this.gift_list == null) {
            this.gift_list = new ArrayList();
        }
        this.gift_list.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.gift_list = null;
        setExpIsSet(false);
        this.exp = 0;
        setCreditIsSet(false);
        this.credit = 0;
        this.level_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TravelRewardInfo)) {
            return equals((TravelRewardInfo) that);
        }
        return false;
    }

    public int getCredit() {
        return this.credit;
    }

    public int getExp() {
        return this.exp;
    }

    public List<AvatarGiftInfo> getGift_list() {
        return this.gift_list;
    }

    public Iterator<AvatarGiftInfo> getGift_listIterator() {
        List<AvatarGiftInfo> list = this.gift_list;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getGift_listSize() {
        List<AvatarGiftInfo> list = this.gift_list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AvatarLevelInfo getLevel_info() {
        return this.level_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCredit() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetExp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetGift_list() {
        return this.gift_list != null;
    }

    public boolean isSetLevel_info() {
        return this.level_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TravelRewardInfo setCredit(int credit) {
        this.credit = credit;
        setCreditIsSet(true);
        return this;
    }

    public void setCreditIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public TravelRewardInfo setExp(int exp) {
        this.exp = exp;
        setExpIsSet(true);
        return this;
    }

    public void setExpIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TravelRewardInfo setGift_list(List<AvatarGiftInfo> gift_list) {
        this.gift_list = gift_list;
        return this;
    }

    public void setGift_listIsSet(boolean value) {
        if (value) {
            return;
        }
        this.gift_list = null;
    }

    public TravelRewardInfo setLevel_info(AvatarLevelInfo level_info) {
        this.level_info = level_info;
        return this;
    }

    public void setLevel_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.level_info = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("TravelRewardInfo(");
        boolean z12 = false;
        if (isSetGift_list()) {
            sb2.append("gift_list:");
            List<AvatarGiftInfo> list = this.gift_list;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetExp()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("exp:");
            sb2.append(this.exp);
            z11 = false;
        }
        if (isSetCredit()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("credit:");
            sb2.append(this.credit);
        } else {
            z12 = z11;
        }
        if (isSetLevel_info()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("level_info:");
            AvatarLevelInfo avatarLevelInfo = this.level_info;
            if (avatarLevelInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(avatarLevelInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCredit() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetExp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetGift_list() {
        this.gift_list = null;
    }

    public void unsetLevel_info() {
        this.level_info = null;
    }

    public void validate() throws TException {
        AvatarLevelInfo avatarLevelInfo = this.level_info;
        if (avatarLevelInfo != null) {
            avatarLevelInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(TravelRewardInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetGift_list()).compareTo(Boolean.valueOf(other.isSetGift_list()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetGift_list() && (compareTo4 = TBaseHelper.compareTo((List) this.gift_list, (List) other.gift_list)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetExp()).compareTo(Boolean.valueOf(other.isSetExp()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetExp() && (compareTo3 = TBaseHelper.compareTo(this.exp, other.exp)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetCredit()).compareTo(Boolean.valueOf(other.isSetCredit()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetCredit() && (compareTo2 = TBaseHelper.compareTo(this.credit, other.credit)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetLevel_info()).compareTo(Boolean.valueOf(other.isSetLevel_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetLevel_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.level_info, (Comparable) other.level_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TravelRewardInfo, _Fields> deepCopy2() {
        return new TravelRewardInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getGift_list();
        }
        if (i11 == 2) {
            return Integer.valueOf(getExp());
        }
        if (i11 == 3) {
            return Integer.valueOf(getCredit());
        }
        if (i11 == 4) {
            return getLevel_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetGift_list();
        }
        if (i11 == 2) {
            return isSetExp();
        }
        if (i11 == 3) {
            return isSetCredit();
        }
        if (i11 == 4) {
            return isSetLevel_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$avatar_api$TravelRewardInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetGift_list();
                return;
            } else {
                setGift_list((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetExp();
                return;
            } else {
                setExp(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetCredit();
                return;
            } else {
                setCredit(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetLevel_info();
        } else {
            setLevel_info((AvatarLevelInfo) value);
        }
    }

    public boolean equals(TravelRewardInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetGift_list = isSetGift_list();
        boolean isSetGift_list2 = that.isSetGift_list();
        if ((isSetGift_list || isSetGift_list2) && !(isSetGift_list && isSetGift_list2 && this.gift_list.equals(that.gift_list))) {
            return false;
        }
        boolean isSetExp = isSetExp();
        boolean isSetExp2 = that.isSetExp();
        if ((isSetExp || isSetExp2) && !(isSetExp && isSetExp2 && this.exp == that.exp)) {
            return false;
        }
        boolean isSetCredit = isSetCredit();
        boolean isSetCredit2 = that.isSetCredit();
        if ((isSetCredit || isSetCredit2) && !(isSetCredit && isSetCredit2 && this.credit == that.credit)) {
            return false;
        }
        boolean isSetLevel_info = isSetLevel_info();
        boolean isSetLevel_info2 = that.isSetLevel_info();
        if (isSetLevel_info || isSetLevel_info2) {
            return isSetLevel_info && isSetLevel_info2 && this.level_info.equals(that.level_info);
        }
        return true;
    }

    public TravelRewardInfo(TravelRewardInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.GIFT_LIST, _Fields.EXP, _Fields.CREDIT, _Fields.LEVEL_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetGift_list()) {
            ArrayList arrayList = new ArrayList(other.gift_list.size());
            Iterator<AvatarGiftInfo> it = other.gift_list.iterator();
            while (it.hasNext()) {
                arrayList.add(new AvatarGiftInfo(it.next()));
            }
            this.gift_list = arrayList;
        }
        this.exp = other.exp;
        this.credit = other.credit;
        if (other.isSetLevel_info()) {
            this.level_info = new AvatarLevelInfo(other.level_info);
        }
    }
}
