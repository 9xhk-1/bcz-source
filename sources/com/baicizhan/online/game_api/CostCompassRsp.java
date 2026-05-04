package com.baicizhan.online.game_api;

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
public class CostCompassRsp implements TBase<CostCompassRsp, _Fields>, Serializable, Cloneable, Comparable<CostCompassRsp> {
    private static final int __PLAN_VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public CompassInfo compass_info;
    public long plan_version;
    private static final TStruct STRUCT_DESC = new TStruct("CostCompassRsp");
    private static final TField PLAN_VERSION_FIELD_DESC = new TField("plan_version", (byte) 10, 1);
    private static final TField COMPASS_INFO_FIELD_DESC = new TField("compass_info", (byte) 12, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.CostCompassRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$CostCompassRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$CostCompassRsp$_Fields = iArr;
            try {
                iArr[_Fields.PLAN_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$CostCompassRsp$_Fields[_Fields.COMPASS_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CostCompassRspStandardScheme extends StandardScheme<CostCompassRsp> {
        private CostCompassRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CostCompassRsp struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 12) {
                        CompassInfo compassInfo = new CompassInfo();
                        struct.compass_info = compassInfo;
                        compassInfo.read(iprot);
                        struct.setCompass_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.plan_version = iprot.readI64();
                    struct.setPlan_versionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetPlan_version()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'plan_version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, CostCompassRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CostCompassRsp.STRUCT_DESC);
            oprot.writeFieldBegin(CostCompassRsp.PLAN_VERSION_FIELD_DESC);
            oprot.writeI64(struct.plan_version);
            oprot.writeFieldEnd();
            if (struct.compass_info != null) {
                oprot.writeFieldBegin(CostCompassRsp.COMPASS_INFO_FIELD_DESC);
                struct.compass_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CostCompassRspStandardSchemeFactory implements SchemeFactory {
        private CostCompassRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CostCompassRspStandardScheme getScheme() {
            return new CostCompassRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CostCompassRspTupleScheme extends TupleScheme<CostCompassRsp> {
        private CostCompassRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CostCompassRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.plan_version = tTupleProtocol.readI64();
            struct.setPlan_versionIsSet(true);
            CompassInfo compassInfo = new CompassInfo();
            struct.compass_info = compassInfo;
            compassInfo.read(tTupleProtocol);
            struct.setCompass_infoIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CostCompassRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.plan_version);
            struct.compass_info.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CostCompassRspTupleSchemeFactory implements SchemeFactory {
        private CostCompassRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CostCompassRspTupleScheme getScheme() {
            return new CostCompassRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        PLAN_VERSION(1, "plan_version"),
        COMPASS_INFO(2, "compass_info");

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
                return PLAN_VERSION;
            }
            if (fieldId != 2) {
                return null;
            }
            return COMPASS_INFO;
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
        hashMap.put(StandardScheme.class, new CostCompassRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CostCompassRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.PLAN_VERSION, (_Fields) new FieldMetaData("plan_version", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.COMPASS_INFO, (_Fields) new FieldMetaData("compass_info", (byte) 1, new StructMetaData((byte) 12, CompassInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CostCompassRsp.class, unmodifiableMap);
    }

    public CostCompassRsp() {
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
        setPlan_versionIsSet(false);
        this.plan_version = 0L;
        this.compass_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CostCompassRsp)) {
            return equals((CostCompassRsp) that);
        }
        return false;
    }

    public CompassInfo getCompass_info() {
        return this.compass_info;
    }

    public long getPlan_version() {
        return this.plan_version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCompass_info() {
        return this.compass_info != null;
    }

    public boolean isSetPlan_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CostCompassRsp setCompass_info(CompassInfo compass_info) {
        this.compass_info = compass_info;
        return this;
    }

    public void setCompass_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.compass_info = null;
    }

    public CostCompassRsp setPlan_version(long plan_version) {
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        return this;
    }

    public void setPlan_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CostCompassRsp(");
        sb2.append("plan_version:");
        sb2.append(this.plan_version);
        sb2.append(j2.O);
        sb2.append("compass_info:");
        CompassInfo compassInfo = this.compass_info;
        if (compassInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(compassInfo);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCompass_info() {
        this.compass_info = null;
    }

    public void unsetPlan_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        CompassInfo compassInfo = this.compass_info;
        if (compassInfo != null) {
            if (compassInfo != null) {
                compassInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'compass_info' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CostCompassRsp other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetPlan_version()).compareTo(Boolean.valueOf(other.isSetPlan_version()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetPlan_version() && (compareTo2 = TBaseHelper.compareTo(this.plan_version, other.plan_version)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCompass_info()).compareTo(Boolean.valueOf(other.isSetCompass_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCompass_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.compass_info, (Comparable) other.compass_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CostCompassRsp, _Fields> deepCopy2() {
        return new CostCompassRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CostCompassRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getPlan_version());
        }
        if (i11 == 2) {
            return getCompass_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CostCompassRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetPlan_version();
        }
        if (i11 == 2) {
            return isSetCompass_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$CostCompassRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetPlan_version();
                return;
            } else {
                setPlan_version(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCompass_info();
        } else {
            setCompass_info((CompassInfo) value);
        }
    }

    public CostCompassRsp(long plan_version, CompassInfo compass_info) {
        this();
        this.plan_version = plan_version;
        setPlan_versionIsSet(true);
        this.compass_info = compass_info;
    }

    public boolean equals(CostCompassRsp that) {
        if (that == null || this.plan_version != that.plan_version) {
            return false;
        }
        boolean isSetCompass_info = isSetCompass_info();
        boolean isSetCompass_info2 = that.isSetCompass_info();
        if (isSetCompass_info || isSetCompass_info2) {
            return isSetCompass_info && isSetCompass_info2 && this.compass_info.equals(that.compass_info);
        }
        return true;
    }

    public CostCompassRsp(CostCompassRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.plan_version = other.plan_version;
        if (other.isSetCompass_info()) {
            this.compass_info = new CompassInfo(other.compass_info);
        }
    }
}
