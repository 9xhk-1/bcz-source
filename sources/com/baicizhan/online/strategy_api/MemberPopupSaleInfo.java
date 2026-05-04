package com.baicizhan.online.strategy_api;

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
public class MemberPopupSaleInfo implements TBase<MemberPopupSaleInfo, _Fields>, Serializable, Cloneable, Comparable<MemberPopupSaleInfo> {
    private static final int __MEMBER_SALE_STAGE_ISSET_ID = 0;
    private static final int __STAGE_END_TIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public MemberSaleInfo member_sale_info;
    public int member_sale_stage;
    private _Fields[] optionals;
    public long stage_end_time;
    private static final TStruct STRUCT_DESC = new TStruct("MemberPopupSaleInfo");
    private static final TField MEMBER_SALE_STAGE_FIELD_DESC = new TField("member_sale_stage", (byte) 8, 1);
    private static final TField STAGE_END_TIME_FIELD_DESC = new TField("stage_end_time", (byte) 10, 2);
    private static final TField MEMBER_SALE_INFO_FIELD_DESC = new TField("member_sale_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.MemberPopupSaleInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields = iArr;
            try {
                iArr[_Fields.MEMBER_SALE_STAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields[_Fields.STAGE_END_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields[_Fields.MEMBER_SALE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberPopupSaleInfoStandardScheme extends StandardScheme<MemberPopupSaleInfo> {
        private MemberPopupSaleInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MemberPopupSaleInfo struct) throws TException {
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
                        } else if (b11 == 12) {
                            MemberSaleInfo memberSaleInfo = new MemberSaleInfo();
                            struct.member_sale_info = memberSaleInfo;
                            memberSaleInfo.read(iprot);
                            struct.setMember_sale_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 10) {
                        struct.stage_end_time = iprot.readI64();
                        struct.setStage_end_timeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.member_sale_stage = iprot.readI32();
                    struct.setMember_sale_stageIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetMember_sale_stage()) {
                throw new TProtocolException("Required field 'member_sale_stage' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetStage_end_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'stage_end_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MemberPopupSaleInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MemberPopupSaleInfo.STRUCT_DESC);
            oprot.writeFieldBegin(MemberPopupSaleInfo.MEMBER_SALE_STAGE_FIELD_DESC);
            oprot.writeI32(struct.member_sale_stage);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MemberPopupSaleInfo.STAGE_END_TIME_FIELD_DESC);
            oprot.writeI64(struct.stage_end_time);
            oprot.writeFieldEnd();
            if (struct.member_sale_info != null && struct.isSetMember_sale_info()) {
                oprot.writeFieldBegin(MemberPopupSaleInfo.MEMBER_SALE_INFO_FIELD_DESC);
                struct.member_sale_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberPopupSaleInfoStandardSchemeFactory implements SchemeFactory {
        private MemberPopupSaleInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MemberPopupSaleInfoStandardScheme getScheme() {
            return new MemberPopupSaleInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberPopupSaleInfoTupleScheme extends TupleScheme<MemberPopupSaleInfo> {
        private MemberPopupSaleInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MemberPopupSaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.member_sale_stage = tTupleProtocol.readI32();
            struct.setMember_sale_stageIsSet(true);
            struct.stage_end_time = tTupleProtocol.readI64();
            struct.setStage_end_timeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                MemberSaleInfo memberSaleInfo = new MemberSaleInfo();
                struct.member_sale_info = memberSaleInfo;
                memberSaleInfo.read(tTupleProtocol);
                struct.setMember_sale_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MemberPopupSaleInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.member_sale_stage);
            tTupleProtocol.writeI64(struct.stage_end_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetMember_sale_info()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMember_sale_info()) {
                struct.member_sale_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MemberPopupSaleInfoTupleSchemeFactory implements SchemeFactory {
        private MemberPopupSaleInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MemberPopupSaleInfoTupleScheme getScheme() {
            return new MemberPopupSaleInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MEMBER_SALE_STAGE(1, "member_sale_stage"),
        STAGE_END_TIME(2, "stage_end_time"),
        MEMBER_SALE_INFO(3, "member_sale_info");

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
                return MEMBER_SALE_STAGE;
            }
            if (fieldId == 2) {
                return STAGE_END_TIME;
            }
            if (fieldId != 3) {
                return null;
            }
            return MEMBER_SALE_INFO;
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
        hashMap.put(StandardScheme.class, new MemberPopupSaleInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MemberPopupSaleInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MEMBER_SALE_STAGE, (_Fields) new FieldMetaData("member_sale_stage", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STAGE_END_TIME, (_Fields) new FieldMetaData("stage_end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.MEMBER_SALE_INFO, (_Fields) new FieldMetaData("member_sale_info", (byte) 2, new StructMetaData((byte) 12, MemberSaleInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MemberPopupSaleInfo.class, unmodifiableMap);
    }

    public MemberPopupSaleInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MEMBER_SALE_INFO};
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
        setMember_sale_stageIsSet(false);
        this.member_sale_stage = 0;
        setStage_end_timeIsSet(false);
        this.stage_end_time = 0L;
        this.member_sale_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MemberPopupSaleInfo)) {
            return equals((MemberPopupSaleInfo) that);
        }
        return false;
    }

    public MemberSaleInfo getMember_sale_info() {
        return this.member_sale_info;
    }

    public int getMember_sale_stage() {
        return this.member_sale_stage;
    }

    public long getStage_end_time() {
        return this.stage_end_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMember_sale_info() {
        return this.member_sale_info != null;
    }

    public boolean isSetMember_sale_stage() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetStage_end_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MemberPopupSaleInfo setMember_sale_info(MemberSaleInfo member_sale_info) {
        this.member_sale_info = member_sale_info;
        return this;
    }

    public void setMember_sale_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.member_sale_info = null;
    }

    public MemberPopupSaleInfo setMember_sale_stage(int member_sale_stage) {
        this.member_sale_stage = member_sale_stage;
        setMember_sale_stageIsSet(true);
        return this;
    }

    public void setMember_sale_stageIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MemberPopupSaleInfo setStage_end_time(long stage_end_time) {
        this.stage_end_time = stage_end_time;
        setStage_end_timeIsSet(true);
        return this;
    }

    public void setStage_end_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MemberPopupSaleInfo(");
        sb2.append("member_sale_stage:");
        sb2.append(this.member_sale_stage);
        sb2.append(j2.O);
        sb2.append("stage_end_time:");
        sb2.append(this.stage_end_time);
        if (isSetMember_sale_info()) {
            sb2.append(j2.O);
            sb2.append("member_sale_info:");
            MemberSaleInfo memberSaleInfo = this.member_sale_info;
            if (memberSaleInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(memberSaleInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMember_sale_info() {
        this.member_sale_info = null;
    }

    public void unsetMember_sale_stage() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetStage_end_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        MemberSaleInfo memberSaleInfo = this.member_sale_info;
        if (memberSaleInfo != null) {
            memberSaleInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MemberPopupSaleInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetMember_sale_stage()).compareTo(Boolean.valueOf(other.isSetMember_sale_stage()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetMember_sale_stage() && (compareTo3 = TBaseHelper.compareTo(this.member_sale_stage, other.member_sale_stage)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetStage_end_time()).compareTo(Boolean.valueOf(other.isSetStage_end_time()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetStage_end_time() && (compareTo2 = TBaseHelper.compareTo(this.stage_end_time, other.stage_end_time)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetMember_sale_info()).compareTo(Boolean.valueOf(other.isSetMember_sale_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetMember_sale_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.member_sale_info, (Comparable) other.member_sale_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MemberPopupSaleInfo, _Fields> deepCopy2() {
        return new MemberPopupSaleInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMember_sale_stage());
        }
        if (i11 == 2) {
            return Long.valueOf(getStage_end_time());
        }
        if (i11 == 3) {
            return getMember_sale_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMember_sale_stage();
        }
        if (i11 == 2) {
            return isSetStage_end_time();
        }
        if (i11 == 3) {
            return isSetMember_sale_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$MemberPopupSaleInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMember_sale_stage();
                return;
            } else {
                setMember_sale_stage(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetStage_end_time();
                return;
            } else {
                setStage_end_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetMember_sale_info();
        } else {
            setMember_sale_info((MemberSaleInfo) value);
        }
    }

    public boolean equals(MemberPopupSaleInfo that) {
        if (that == null || this.member_sale_stage != that.member_sale_stage || this.stage_end_time != that.stage_end_time) {
            return false;
        }
        boolean isSetMember_sale_info = isSetMember_sale_info();
        boolean isSetMember_sale_info2 = that.isSetMember_sale_info();
        if (isSetMember_sale_info || isSetMember_sale_info2) {
            return isSetMember_sale_info && isSetMember_sale_info2 && this.member_sale_info.equals(that.member_sale_info);
        }
        return true;
    }

    public MemberPopupSaleInfo(int member_sale_stage, long stage_end_time) {
        this();
        this.member_sale_stage = member_sale_stage;
        setMember_sale_stageIsSet(true);
        this.stage_end_time = stage_end_time;
        setStage_end_timeIsSet(true);
    }

    public MemberPopupSaleInfo(MemberPopupSaleInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MEMBER_SALE_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.member_sale_stage = other.member_sale_stage;
        this.stage_end_time = other.stage_end_time;
        if (other.isSetMember_sale_info()) {
            this.member_sale_info = new MemberSaleInfo(other.member_sale_info);
        }
    }
}
