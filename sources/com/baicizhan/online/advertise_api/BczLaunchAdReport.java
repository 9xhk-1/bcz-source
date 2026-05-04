package com.baicizhan.online.advertise_api;

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
public class BczLaunchAdReport implements TBase<BczLaunchAdReport, _Fields>, Serializable, Cloneable, Comparable<BczLaunchAdReport> {
    private static final int __AD_ID_ISSET_ID = 0;
    private static final int __RP_TYPE_ISSET_ID = 1;
    private static final int __SHOW_COUNT_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int ad_id;
    public int rp_type;
    public int show_count;
    private static final TStruct STRUCT_DESC = new TStruct("BczLaunchAdReport");
    private static final TField AD_ID_FIELD_DESC = new TField("ad_id", (byte) 8, 1);
    private static final TField RP_TYPE_FIELD_DESC = new TField("rp_type", (byte) 8, 2);
    private static final TField SHOW_COUNT_FIELD_DESC = new TField("show_count", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BczLaunchAdReport$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields = iArr;
            try {
                iArr[_Fields.AD_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields[_Fields.RP_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields[_Fields.SHOW_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdReportStandardScheme extends StandardScheme<BczLaunchAdReport> {
        private BczLaunchAdReportStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczLaunchAdReport struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.show_count = iprot.readI32();
                            struct.setShow_countIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.rp_type = iprot.readI32();
                        struct.setRp_typeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.ad_id = iprot.readI32();
                    struct.setAd_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetAd_id()) {
                throw new TProtocolException("Required field 'ad_id' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetRp_type()) {
                throw new TProtocolException("Required field 'rp_type' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetShow_count()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'show_count' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczLaunchAdReport struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczLaunchAdReport.STRUCT_DESC);
            oprot.writeFieldBegin(BczLaunchAdReport.AD_ID_FIELD_DESC);
            oprot.writeI32(struct.ad_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczLaunchAdReport.RP_TYPE_FIELD_DESC);
            oprot.writeI32(struct.rp_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczLaunchAdReport.SHOW_COUNT_FIELD_DESC);
            oprot.writeI32(struct.show_count);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdReportStandardSchemeFactory implements SchemeFactory {
        private BczLaunchAdReportStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLaunchAdReportStandardScheme getScheme() {
            return new BczLaunchAdReportStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdReportTupleScheme extends TupleScheme<BczLaunchAdReport> {
        private BczLaunchAdReportTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczLaunchAdReport struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ad_id = tTupleProtocol.readI32();
            struct.setAd_idIsSet(true);
            struct.rp_type = tTupleProtocol.readI32();
            struct.setRp_typeIsSet(true);
            struct.show_count = tTupleProtocol.readI32();
            struct.setShow_countIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczLaunchAdReport struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ad_id);
            tTupleProtocol.writeI32(struct.rp_type);
            tTupleProtocol.writeI32(struct.show_count);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczLaunchAdReportTupleSchemeFactory implements SchemeFactory {
        private BczLaunchAdReportTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczLaunchAdReportTupleScheme getScheme() {
            return new BczLaunchAdReportTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AD_ID(1, "ad_id"),
        RP_TYPE(2, "rp_type"),
        SHOW_COUNT(3, "show_count");

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
                return AD_ID;
            }
            if (fieldId == 2) {
                return RP_TYPE;
            }
            if (fieldId != 3) {
                return null;
            }
            return SHOW_COUNT;
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
        hashMap.put(StandardScheme.class, new BczLaunchAdReportStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczLaunchAdReportTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AD_ID, (_Fields) new FieldMetaData("ad_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RP_TYPE, (_Fields) new FieldMetaData("rp_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_COUNT, (_Fields) new FieldMetaData("show_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczLaunchAdReport.class, unmodifiableMap);
    }

    public BczLaunchAdReport() {
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
        setAd_idIsSet(false);
        this.ad_id = 0;
        setRp_typeIsSet(false);
        this.rp_type = 0;
        setShow_countIsSet(false);
        this.show_count = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczLaunchAdReport)) {
            return equals((BczLaunchAdReport) that);
        }
        return false;
    }

    public int getAd_id() {
        return this.ad_id;
    }

    public int getRp_type() {
        return this.rp_type;
    }

    public int getShow_count() {
        return this.show_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetRp_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetShow_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczLaunchAdReport setAd_id(int ad_id) {
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        return this;
    }

    public void setAd_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BczLaunchAdReport setRp_type(int rp_type) {
        this.rp_type = rp_type;
        setRp_typeIsSet(true);
        return this;
    }

    public void setRp_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BczLaunchAdReport setShow_count(int show_count) {
        this.show_count = show_count;
        setShow_countIsSet(true);
        return this;
    }

    public void setShow_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        return "BczLaunchAdReport(ad_id:" + this.ad_id + j2.O + "rp_type:" + this.rp_type + j2.O + "show_count:" + this.show_count + pn.j.f81007d;
    }

    public void unsetAd_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetRp_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetShow_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczLaunchAdReport other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetAd_id()).compareTo(Boolean.valueOf(other.isSetAd_id()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetAd_id() && (compareTo3 = TBaseHelper.compareTo(this.ad_id, other.ad_id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetRp_type()).compareTo(Boolean.valueOf(other.isSetRp_type()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetRp_type() && (compareTo2 = TBaseHelper.compareTo(this.rp_type, other.rp_type)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetShow_count()).compareTo(Boolean.valueOf(other.isSetShow_count()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetShow_count() || (compareTo = TBaseHelper.compareTo(this.show_count, other.show_count)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczLaunchAdReport, _Fields> deepCopy2() {
        return new BczLaunchAdReport(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getAd_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getRp_type());
        }
        if (i11 == 3) {
            return Integer.valueOf(getShow_count());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAd_id();
        }
        if (i11 == 2) {
            return isSetRp_type();
        }
        if (i11 == 3) {
            return isSetShow_count();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BczLaunchAdReport$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAd_id();
                return;
            } else {
                setAd_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetRp_type();
                return;
            } else {
                setRp_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetShow_count();
        } else {
            setShow_count(((Integer) value).intValue());
        }
    }

    public BczLaunchAdReport(int ad_id, int rp_type, int show_count) {
        this();
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        this.rp_type = rp_type;
        setRp_typeIsSet(true);
        this.show_count = show_count;
        setShow_countIsSet(true);
    }

    public boolean equals(BczLaunchAdReport that) {
        return that != null && this.ad_id == that.ad_id && this.rp_type == that.rp_type && this.show_count == that.show_count;
    }

    public BczLaunchAdReport(BczLaunchAdReport other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.ad_id = other.ad_id;
        this.rp_type = other.rp_type;
        this.show_count = other.show_count;
    }

    public void validate() throws TException {
    }
}
