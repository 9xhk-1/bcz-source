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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class ThirdAd implements TBase<ThirdAd, _Fields>, Serializable, Cloneable, Comparable<ThirdAd> {
    private static final int __SHOWTIMES_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int showTimes;
    private static final TStruct STRUCT_DESC = new TStruct("ThirdAd");
    private static final TField SHOW_TIMES_FIELD_DESC = new TField("showTimes", (byte) 8, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.ThirdAd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$ThirdAd$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$ThirdAd$_Fields = iArr;
            try {
                iArr[_Fields.SHOW_TIMES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdAdStandardScheme extends StandardScheme<ThirdAd> {
        private ThirdAdStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ThirdAd struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    break;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 8) {
                    struct.showTimes = iprot.readI32();
                    struct.setShowTimesIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetShowTimes()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'showTimes' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ThirdAd struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ThirdAd.STRUCT_DESC);
            oprot.writeFieldBegin(ThirdAd.SHOW_TIMES_FIELD_DESC);
            oprot.writeI32(struct.showTimes);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdAdStandardSchemeFactory implements SchemeFactory {
        private ThirdAdStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ThirdAdStandardScheme getScheme() {
            return new ThirdAdStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdAdTupleScheme extends TupleScheme<ThirdAd> {
        private ThirdAdTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ThirdAd struct) throws TException {
            struct.showTimes = ((TTupleProtocol) prot).readI32();
            struct.setShowTimesIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ThirdAd struct) throws TException {
            ((TTupleProtocol) prot).writeI32(struct.showTimes);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ThirdAdTupleSchemeFactory implements SchemeFactory {
        private ThirdAdTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ThirdAdTupleScheme getScheme() {
            return new ThirdAdTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHOW_TIMES(1, "showTimes");

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
            if (fieldId != 1) {
                return null;
            }
            return SHOW_TIMES;
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
        hashMap.put(StandardScheme.class, new ThirdAdStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ThirdAdTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHOW_TIMES, (_Fields) new FieldMetaData("showTimes", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ThirdAd.class, unmodifiableMap);
    }

    public ThirdAd() {
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
        setShowTimesIsSet(false);
        this.showTimes = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ThirdAd)) {
            return equals((ThirdAd) that);
        }
        return false;
    }

    public int getShowTimes() {
        return this.showTimes;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetShowTimes() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ThirdAd setShowTimes(int showTimes) {
        this.showTimes = showTimes;
        setShowTimesIsSet(true);
        return this;
    }

    public void setShowTimesIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "ThirdAd(showTimes:" + this.showTimes + pn.j.f81007d;
    }

    public void unsetShowTimes() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ThirdAd other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetShowTimes()).compareTo(Boolean.valueOf(other.isSetShowTimes()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetShowTimes() || (compareTo = TBaseHelper.compareTo(this.showTimes, other.showTimes)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ThirdAd, _Fields> deepCopy2() {
        return new ThirdAd(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ThirdAd$_Fields[field.ordinal()] == 1) {
            return Integer.valueOf(getShowTimes());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ThirdAd$_Fields[field.ordinal()] == 1) {
            return isSetShowTimes();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ThirdAd$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetShowTimes();
        } else {
            setShowTimes(((Integer) value).intValue());
        }
    }

    public ThirdAd(int showTimes) {
        this();
        this.showTimes = showTimes;
        setShowTimesIsSet(true);
    }

    public boolean equals(ThirdAd that) {
        return that != null && this.showTimes == that.showTimes;
    }

    public ThirdAd(ThirdAd other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.showTimes = other.showTimes;
    }

    public void validate() throws TException {
    }
}
