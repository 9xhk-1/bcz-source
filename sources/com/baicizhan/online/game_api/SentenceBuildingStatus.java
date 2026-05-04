package com.baicizhan.online.game_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
public class SentenceBuildingStatus implements TBase<SentenceBuildingStatus, _Fields>, Serializable, Cloneable, Comparable<SentenceBuildingStatus> {
    private static final int __SPENTCOIN_ISSET_ID = 1;
    private static final int __TOTALCOIN_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int spentCoin;
    public int totalCoin;
    public List<SentenceUserBuildingLevels> userBuildingLevels;
    private static final TStruct STRUCT_DESC = new TStruct("SentenceBuildingStatus");
    private static final TField TOTAL_COIN_FIELD_DESC = new TField("totalCoin", (byte) 8, 1);
    private static final TField SPENT_COIN_FIELD_DESC = new TField("spentCoin", (byte) 8, 2);
    private static final TField USER_BUILDING_LEVELS_FIELD_DESC = new TField("userBuildingLevels", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.SentenceBuildingStatus$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields = iArr;
            try {
                iArr[_Fields.TOTAL_COIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields[_Fields.SPENT_COIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields[_Fields.USER_BUILDING_LEVELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingStatusStandardScheme extends StandardScheme<SentenceBuildingStatus> {
        private SentenceBuildingStatusStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SentenceBuildingStatus struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.userBuildingLevels = new ArrayList(readListBegin.size);
                            for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                SentenceUserBuildingLevels sentenceUserBuildingLevels = new SentenceUserBuildingLevels();
                                sentenceUserBuildingLevels.read(iprot);
                                struct.userBuildingLevels.add(sentenceUserBuildingLevels);
                            }
                            iprot.readListEnd();
                            struct.setUserBuildingLevelsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.spentCoin = iprot.readI32();
                        struct.setSpentCoinIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.totalCoin = iprot.readI32();
                    struct.setTotalCoinIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTotalCoin()) {
                throw new TProtocolException("Required field 'totalCoin' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetSpentCoin()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'spentCoin' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SentenceBuildingStatus struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SentenceBuildingStatus.STRUCT_DESC);
            oprot.writeFieldBegin(SentenceBuildingStatus.TOTAL_COIN_FIELD_DESC);
            oprot.writeI32(struct.totalCoin);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(SentenceBuildingStatus.SPENT_COIN_FIELD_DESC);
            oprot.writeI32(struct.spentCoin);
            oprot.writeFieldEnd();
            if (struct.userBuildingLevels != null) {
                oprot.writeFieldBegin(SentenceBuildingStatus.USER_BUILDING_LEVELS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.userBuildingLevels.size()));
                Iterator<SentenceUserBuildingLevels> it = struct.userBuildingLevels.iterator();
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
    public static class SentenceBuildingStatusStandardSchemeFactory implements SchemeFactory {
        private SentenceBuildingStatusStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceBuildingStatusStandardScheme getScheme() {
            return new SentenceBuildingStatusStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingStatusTupleScheme extends TupleScheme<SentenceBuildingStatus> {
        private SentenceBuildingStatusTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SentenceBuildingStatus struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.totalCoin = tTupleProtocol.readI32();
            struct.setTotalCoinIsSet(true);
            struct.spentCoin = tTupleProtocol.readI32();
            struct.setSpentCoinIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.userBuildingLevels = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                SentenceUserBuildingLevels sentenceUserBuildingLevels = new SentenceUserBuildingLevels();
                sentenceUserBuildingLevels.read(tTupleProtocol);
                struct.userBuildingLevels.add(sentenceUserBuildingLevels);
            }
            struct.setUserBuildingLevelsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SentenceBuildingStatus struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.totalCoin);
            tTupleProtocol.writeI32(struct.spentCoin);
            tTupleProtocol.writeI32(struct.userBuildingLevels.size());
            Iterator<SentenceUserBuildingLevels> it = struct.userBuildingLevels.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SentenceBuildingStatusTupleSchemeFactory implements SchemeFactory {
        private SentenceBuildingStatusTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SentenceBuildingStatusTupleScheme getScheme() {
            return new SentenceBuildingStatusTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOTAL_COIN(1, "totalCoin"),
        SPENT_COIN(2, "spentCoin"),
        USER_BUILDING_LEVELS(3, "userBuildingLevels");

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
                return TOTAL_COIN;
            }
            if (fieldId == 2) {
                return SPENT_COIN;
            }
            if (fieldId != 3) {
                return null;
            }
            return USER_BUILDING_LEVELS;
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
        hashMap.put(StandardScheme.class, new SentenceBuildingStatusStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SentenceBuildingStatusTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOTAL_COIN, (_Fields) new FieldMetaData("totalCoin", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SPENT_COIN, (_Fields) new FieldMetaData("spentCoin", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.USER_BUILDING_LEVELS, (_Fields) new FieldMetaData("userBuildingLevels", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, SentenceUserBuildingLevels.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SentenceBuildingStatus.class, unmodifiableMap);
    }

    public SentenceBuildingStatus() {
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

    public void addToUserBuildingLevels(SentenceUserBuildingLevels elem) {
        if (this.userBuildingLevels == null) {
            this.userBuildingLevels = new ArrayList();
        }
        this.userBuildingLevels.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setTotalCoinIsSet(false);
        this.totalCoin = 0;
        setSpentCoinIsSet(false);
        this.spentCoin = 0;
        this.userBuildingLevels = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SentenceBuildingStatus)) {
            return equals((SentenceBuildingStatus) that);
        }
        return false;
    }

    public int getSpentCoin() {
        return this.spentCoin;
    }

    public int getTotalCoin() {
        return this.totalCoin;
    }

    public List<SentenceUserBuildingLevels> getUserBuildingLevels() {
        return this.userBuildingLevels;
    }

    public Iterator<SentenceUserBuildingLevels> getUserBuildingLevelsIterator() {
        List<SentenceUserBuildingLevels> list = this.userBuildingLevels;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUserBuildingLevelsSize() {
        List<SentenceUserBuildingLevels> list = this.userBuildingLevels;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetSpentCoin() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTotalCoin() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUserBuildingLevels() {
        return this.userBuildingLevels != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SentenceBuildingStatus setSpentCoin(int spentCoin) {
        this.spentCoin = spentCoin;
        setSpentCoinIsSet(true);
        return this;
    }

    public void setSpentCoinIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public SentenceBuildingStatus setTotalCoin(int totalCoin) {
        this.totalCoin = totalCoin;
        setTotalCoinIsSet(true);
        return this;
    }

    public void setTotalCoinIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public SentenceBuildingStatus setUserBuildingLevels(List<SentenceUserBuildingLevels> userBuildingLevels) {
        this.userBuildingLevels = userBuildingLevels;
        return this;
    }

    public void setUserBuildingLevelsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.userBuildingLevels = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SentenceBuildingStatus(");
        sb2.append("totalCoin:");
        sb2.append(this.totalCoin);
        sb2.append(j2.O);
        sb2.append("spentCoin:");
        sb2.append(this.spentCoin);
        sb2.append(j2.O);
        sb2.append("userBuildingLevels:");
        List<SentenceUserBuildingLevels> list = this.userBuildingLevels;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetSpentCoin() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTotalCoin() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUserBuildingLevels() {
        this.userBuildingLevels = null;
    }

    public void validate() throws TException {
        if (this.userBuildingLevels != null) {
            return;
        }
        throw new TProtocolException("Required field 'userBuildingLevels' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(SentenceBuildingStatus other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTotalCoin()).compareTo(Boolean.valueOf(other.isSetTotalCoin()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTotalCoin() && (compareTo3 = TBaseHelper.compareTo(this.totalCoin, other.totalCoin)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetSpentCoin()).compareTo(Boolean.valueOf(other.isSetSpentCoin()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetSpentCoin() && (compareTo2 = TBaseHelper.compareTo(this.spentCoin, other.spentCoin)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetUserBuildingLevels()).compareTo(Boolean.valueOf(other.isSetUserBuildingLevels()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetUserBuildingLevels() || (compareTo = TBaseHelper.compareTo((List) this.userBuildingLevels, (List) other.userBuildingLevels)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<SentenceBuildingStatus, _Fields> deepCopy2() {
        return new SentenceBuildingStatus(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getTotalCoin());
        }
        if (i11 == 2) {
            return Integer.valueOf(getSpentCoin());
        }
        if (i11 == 3) {
            return getUserBuildingLevels();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTotalCoin();
        }
        if (i11 == 2) {
            return isSetSpentCoin();
        }
        if (i11 == 3) {
            return isSetUserBuildingLevels();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$SentenceBuildingStatus$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTotalCoin();
                return;
            } else {
                setTotalCoin(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSpentCoin();
                return;
            } else {
                setSpentCoin(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetUserBuildingLevels();
        } else {
            setUserBuildingLevels((List) value);
        }
    }

    public SentenceBuildingStatus(int totalCoin, int spentCoin, List<SentenceUserBuildingLevels> userBuildingLevels) {
        this();
        this.totalCoin = totalCoin;
        setTotalCoinIsSet(true);
        this.spentCoin = spentCoin;
        setSpentCoinIsSet(true);
        this.userBuildingLevels = userBuildingLevels;
    }

    public boolean equals(SentenceBuildingStatus that) {
        if (that == null || this.totalCoin != that.totalCoin || this.spentCoin != that.spentCoin) {
            return false;
        }
        boolean isSetUserBuildingLevels = isSetUserBuildingLevels();
        boolean isSetUserBuildingLevels2 = that.isSetUserBuildingLevels();
        if (isSetUserBuildingLevels || isSetUserBuildingLevels2) {
            return isSetUserBuildingLevels && isSetUserBuildingLevels2 && this.userBuildingLevels.equals(that.userBuildingLevels);
        }
        return true;
    }

    public SentenceBuildingStatus(SentenceBuildingStatus other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.totalCoin = other.totalCoin;
        this.spentCoin = other.spentCoin;
        if (other.isSetUserBuildingLevels()) {
            ArrayList arrayList = new ArrayList(other.userBuildingLevels.size());
            Iterator<SentenceUserBuildingLevels> it = other.userBuildingLevels.iterator();
            while (it.hasNext()) {
                arrayList.add(new SentenceUserBuildingLevels(it.next()));
            }
            this.userBuildingLevels = arrayList;
        }
    }
}
