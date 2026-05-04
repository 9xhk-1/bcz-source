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
public class PurchaseRsp implements TBase<PurchaseRsp, _Fields>, Serializable, Cloneable, Comparable<PurchaseRsp> {
    private static final int __COPPER_AFTER_ISSET_ID = 1;
    private static final int __COPPER_BEFORE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long copper_after;
    public long copper_before;
    private static final TStruct STRUCT_DESC = new TStruct("PurchaseRsp");
    private static final TField COPPER_BEFORE_FIELD_DESC = new TField("copper_before", (byte) 10, 1);
    private static final TField COPPER_AFTER_FIELD_DESC = new TField("copper_after", (byte) 10, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.PurchaseRsp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$PurchaseRsp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$PurchaseRsp$_Fields = iArr;
            try {
                iArr[_Fields.COPPER_BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$PurchaseRsp$_Fields[_Fields.COPPER_AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseRspStandardScheme extends StandardScheme<PurchaseRsp> {
        private PurchaseRspStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PurchaseRsp struct) throws TException {
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
                    } else if (b11 == 10) {
                        struct.copper_after = iprot.readI64();
                        struct.setCopper_afterIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 10) {
                    struct.copper_before = iprot.readI64();
                    struct.setCopper_beforeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCopper_before()) {
                throw new TProtocolException("Required field 'copper_before' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCopper_after()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'copper_after' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PurchaseRsp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PurchaseRsp.STRUCT_DESC);
            oprot.writeFieldBegin(PurchaseRsp.COPPER_BEFORE_FIELD_DESC);
            oprot.writeI64(struct.copper_before);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(PurchaseRsp.COPPER_AFTER_FIELD_DESC);
            oprot.writeI64(struct.copper_after);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseRspStandardSchemeFactory implements SchemeFactory {
        private PurchaseRspStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PurchaseRspStandardScheme getScheme() {
            return new PurchaseRspStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseRspTupleScheme extends TupleScheme<PurchaseRsp> {
        private PurchaseRspTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PurchaseRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.copper_before = tTupleProtocol.readI64();
            struct.setCopper_beforeIsSet(true);
            struct.copper_after = tTupleProtocol.readI64();
            struct.setCopper_afterIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PurchaseRsp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.copper_before);
            tTupleProtocol.writeI64(struct.copper_after);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PurchaseRspTupleSchemeFactory implements SchemeFactory {
        private PurchaseRspTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PurchaseRspTupleScheme getScheme() {
            return new PurchaseRspTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COPPER_BEFORE(1, "copper_before"),
        COPPER_AFTER(2, "copper_after");

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
                return COPPER_BEFORE;
            }
            if (fieldId != 2) {
                return null;
            }
            return COPPER_AFTER;
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
        hashMap.put(StandardScheme.class, new PurchaseRspStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PurchaseRspTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COPPER_BEFORE, (_Fields) new FieldMetaData("copper_before", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.COPPER_AFTER, (_Fields) new FieldMetaData("copper_after", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PurchaseRsp.class, unmodifiableMap);
    }

    public PurchaseRsp() {
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
        setCopper_beforeIsSet(false);
        this.copper_before = 0L;
        setCopper_afterIsSet(false);
        this.copper_after = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PurchaseRsp)) {
            return equals((PurchaseRsp) that);
        }
        return false;
    }

    public long getCopper_after() {
        return this.copper_after;
    }

    public long getCopper_before() {
        return this.copper_before;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCopper_after() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetCopper_before() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PurchaseRsp setCopper_after(long copper_after) {
        this.copper_after = copper_after;
        setCopper_afterIsSet(true);
        return this;
    }

    public void setCopper_afterIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public PurchaseRsp setCopper_before(long copper_before) {
        this.copper_before = copper_before;
        setCopper_beforeIsSet(true);
        return this;
    }

    public void setCopper_beforeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "PurchaseRsp(copper_before:" + this.copper_before + j2.O + "copper_after:" + this.copper_after + pn.j.f81007d;
    }

    public void unsetCopper_after() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetCopper_before() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PurchaseRsp other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCopper_before()).compareTo(Boolean.valueOf(other.isSetCopper_before()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCopper_before() && (compareTo2 = TBaseHelper.compareTo(this.copper_before, other.copper_before)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCopper_after()).compareTo(Boolean.valueOf(other.isSetCopper_after()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCopper_after() || (compareTo = TBaseHelper.compareTo(this.copper_after, other.copper_after)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PurchaseRsp, _Fields> deepCopy2() {
        return new PurchaseRsp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PurchaseRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Long.valueOf(getCopper_before());
        }
        if (i11 == 2) {
            return Long.valueOf(getCopper_after());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PurchaseRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCopper_before();
        }
        if (i11 == 2) {
            return isSetCopper_after();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$PurchaseRsp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCopper_before();
                return;
            } else {
                setCopper_before(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCopper_after();
        } else {
            setCopper_after(((Long) value).longValue());
        }
    }

    public PurchaseRsp(long copper_before, long copper_after) {
        this();
        this.copper_before = copper_before;
        setCopper_beforeIsSet(true);
        this.copper_after = copper_after;
        setCopper_afterIsSet(true);
    }

    public boolean equals(PurchaseRsp that) {
        return that != null && this.copper_before == that.copper_before && this.copper_after == that.copper_after;
    }

    public PurchaseRsp(PurchaseRsp other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.copper_before = other.copper_before;
        this.copper_after = other.copper_after;
    }

    public void validate() throws TException {
    }
}
