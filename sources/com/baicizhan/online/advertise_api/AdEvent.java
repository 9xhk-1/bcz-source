package com.baicizhan.online.advertise_api;

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
public class AdEvent implements TBase<AdEvent, _Fields>, Serializable, Cloneable, Comparable<AdEvent> {
    private static final int __AD_ID_ISSET_ID = 0;
    private static final int __EVENT_TYPE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int ad_id;
    public int event_type;
    public String ext_ad_id;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("AdEvent");
    private static final TField AD_ID_FIELD_DESC = new TField("ad_id", (byte) 8, 1);
    private static final TField EVENT_TYPE_FIELD_DESC = new TField("event_type", (byte) 8, 2);
    private static final TField EXT_AD_ID_FIELD_DESC = new TField("ext_ad_id", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.AdEvent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields = iArr;
            try {
                iArr[_Fields.AD_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields[_Fields.EVENT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields[_Fields.EXT_AD_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdEventStandardScheme extends StandardScheme<AdEvent> {
        private AdEventStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdEvent struct) throws TException {
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
                        } else if (b11 == 11) {
                            struct.ext_ad_id = iprot.readString();
                            struct.setExt_ad_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.event_type = iprot.readI32();
                        struct.setEvent_typeIsSet(true);
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
            if (struct.isSetEvent_type()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'event_type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdEvent struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdEvent.STRUCT_DESC);
            oprot.writeFieldBegin(AdEvent.AD_ID_FIELD_DESC);
            oprot.writeI32(struct.ad_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AdEvent.EVENT_TYPE_FIELD_DESC);
            oprot.writeI32(struct.event_type);
            oprot.writeFieldEnd();
            if (struct.ext_ad_id != null && struct.isSetExt_ad_id()) {
                oprot.writeFieldBegin(AdEvent.EXT_AD_ID_FIELD_DESC);
                oprot.writeString(struct.ext_ad_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdEventStandardSchemeFactory implements SchemeFactory {
        private AdEventStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdEventStandardScheme getScheme() {
            return new AdEventStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdEventTupleScheme extends TupleScheme<AdEvent> {
        private AdEventTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdEvent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ad_id = tTupleProtocol.readI32();
            struct.setAd_idIsSet(true);
            struct.event_type = tTupleProtocol.readI32();
            struct.setEvent_typeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.ext_ad_id = tTupleProtocol.readString();
                struct.setExt_ad_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdEvent struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ad_id);
            tTupleProtocol.writeI32(struct.event_type);
            BitSet bitSet = new BitSet();
            if (struct.isSetExt_ad_id()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetExt_ad_id()) {
                tTupleProtocol.writeString(struct.ext_ad_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdEventTupleSchemeFactory implements SchemeFactory {
        private AdEventTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdEventTupleScheme getScheme() {
            return new AdEventTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AD_ID(1, "ad_id"),
        EVENT_TYPE(2, "event_type"),
        EXT_AD_ID(3, "ext_ad_id");

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
                return EVENT_TYPE;
            }
            if (fieldId != 3) {
                return null;
            }
            return EXT_AD_ID;
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
        hashMap.put(StandardScheme.class, new AdEventStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdEventTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AD_ID, (_Fields) new FieldMetaData("ad_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EVENT_TYPE, (_Fields) new FieldMetaData("event_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.EXT_AD_ID, (_Fields) new FieldMetaData("ext_ad_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdEvent.class, unmodifiableMap);
    }

    public AdEvent() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.EXT_AD_ID};
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
        setEvent_typeIsSet(false);
        this.event_type = 0;
        this.ext_ad_id = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdEvent)) {
            return equals((AdEvent) that);
        }
        return false;
    }

    public int getAd_id() {
        return this.ad_id;
    }

    public int getEvent_type() {
        return this.event_type;
    }

    public String getExt_ad_id() {
        return this.ext_ad_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetEvent_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetExt_ad_id() {
        return this.ext_ad_id != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdEvent setAd_id(int ad_id) {
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        return this;
    }

    public void setAd_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AdEvent setEvent_type(int event_type) {
        this.event_type = event_type;
        setEvent_typeIsSet(true);
        return this;
    }

    public void setEvent_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AdEvent setExt_ad_id(String ext_ad_id) {
        this.ext_ad_id = ext_ad_id;
        return this;
    }

    public void setExt_ad_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ext_ad_id = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdEvent(");
        sb2.append("ad_id:");
        sb2.append(this.ad_id);
        sb2.append(j2.O);
        sb2.append("event_type:");
        sb2.append(this.event_type);
        if (isSetExt_ad_id()) {
            sb2.append(j2.O);
            sb2.append("ext_ad_id:");
            String str = this.ext_ad_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetEvent_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetExt_ad_id() {
        this.ext_ad_id = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdEvent other) {
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
        int compareTo5 = Boolean.valueOf(isSetEvent_type()).compareTo(Boolean.valueOf(other.isSetEvent_type()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetEvent_type() && (compareTo2 = TBaseHelper.compareTo(this.event_type, other.event_type)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetExt_ad_id()).compareTo(Boolean.valueOf(other.isSetExt_ad_id()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetExt_ad_id() || (compareTo = TBaseHelper.compareTo(this.ext_ad_id, other.ext_ad_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdEvent, _Fields> deepCopy2() {
        return new AdEvent(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getAd_id());
        }
        if (i11 == 2) {
            return Integer.valueOf(getEvent_type());
        }
        if (i11 == 3) {
            return getExt_ad_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAd_id();
        }
        if (i11 == 2) {
            return isSetEvent_type();
        }
        if (i11 == 3) {
            return isSetExt_ad_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdEvent$_Fields[field.ordinal()];
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
                unsetEvent_type();
                return;
            } else {
                setEvent_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetExt_ad_id();
        } else {
            setExt_ad_id((String) value);
        }
    }

    public boolean equals(AdEvent that) {
        if (that == null || this.ad_id != that.ad_id || this.event_type != that.event_type) {
            return false;
        }
        boolean isSetExt_ad_id = isSetExt_ad_id();
        boolean isSetExt_ad_id2 = that.isSetExt_ad_id();
        if (isSetExt_ad_id || isSetExt_ad_id2) {
            return isSetExt_ad_id && isSetExt_ad_id2 && this.ext_ad_id.equals(that.ext_ad_id);
        }
        return true;
    }

    public AdEvent(int ad_id, int event_type) {
        this();
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        this.event_type = event_type;
        setEvent_typeIsSet(true);
    }

    public AdEvent(AdEvent other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.EXT_AD_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.ad_id = other.ad_id;
        this.event_type = other.event_type;
        if (other.isSetExt_ad_id()) {
            this.ext_ad_id = other.ext_ad_id;
        }
    }

    public void validate() throws TException {
    }
}
