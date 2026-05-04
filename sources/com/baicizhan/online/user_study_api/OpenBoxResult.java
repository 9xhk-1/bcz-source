package com.baicizhan.online.user_study_api;

import com.baicizhan.main.activity.OpenGoldBoxActivity;
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
/* loaded from: classes6.dex */
public class OpenBoxResult implements TBase<OpenBoxResult, _Fields>, Serializable, Cloneable, Comparable<OpenBoxResult> {
    private static final int __COIN_COUNT_ISSET_ID = 0;
    private static final int __LUCKY_STRIKE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int coin_count;
    public boolean lucky_strike;
    private static final TStruct STRUCT_DESC = new TStruct("OpenBoxResult");
    private static final TField COIN_COUNT_FIELD_DESC = new TField("coin_count", (byte) 8, 1);
    private static final TField LUCKY_STRIKE_FIELD_DESC = new TField(OpenGoldBoxActivity.f18134h, (byte) 2, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.OpenBoxResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$OpenBoxResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$OpenBoxResult$_Fields = iArr;
            try {
                iArr[_Fields.COIN_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$OpenBoxResult$_Fields[_Fields.LUCKY_STRIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OpenBoxResultStandardScheme extends StandardScheme<OpenBoxResult> {
        private OpenBoxResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, OpenBoxResult struct) throws TException {
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
                    } else if (b11 == 2) {
                        struct.lucky_strike = iprot.readBool();
                        struct.setLucky_strikeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.coin_count = iprot.readI32();
                    struct.setCoin_countIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetCoin_count()) {
                throw new TProtocolException("Required field 'coin_count' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetLucky_strike()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'lucky_strike' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, OpenBoxResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(OpenBoxResult.STRUCT_DESC);
            oprot.writeFieldBegin(OpenBoxResult.COIN_COUNT_FIELD_DESC);
            oprot.writeI32(struct.coin_count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(OpenBoxResult.LUCKY_STRIKE_FIELD_DESC);
            oprot.writeBool(struct.lucky_strike);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OpenBoxResultStandardSchemeFactory implements SchemeFactory {
        private OpenBoxResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public OpenBoxResultStandardScheme getScheme() {
            return new OpenBoxResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OpenBoxResultTupleScheme extends TupleScheme<OpenBoxResult> {
        private OpenBoxResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, OpenBoxResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.coin_count = tTupleProtocol.readI32();
            struct.setCoin_countIsSet(true);
            struct.lucky_strike = tTupleProtocol.readBool();
            struct.setLucky_strikeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, OpenBoxResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.coin_count);
            tTupleProtocol.writeBool(struct.lucky_strike);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OpenBoxResultTupleSchemeFactory implements SchemeFactory {
        private OpenBoxResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public OpenBoxResultTupleScheme getScheme() {
            return new OpenBoxResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        COIN_COUNT(1, "coin_count"),
        LUCKY_STRIKE(2, OpenGoldBoxActivity.f18134h);

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
                return COIN_COUNT;
            }
            if (fieldId != 2) {
                return null;
            }
            return LUCKY_STRIKE;
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
        hashMap.put(StandardScheme.class, new OpenBoxResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new OpenBoxResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.COIN_COUNT, (_Fields) new FieldMetaData("coin_count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LUCKY_STRIKE, (_Fields) new FieldMetaData(OpenGoldBoxActivity.f18134h, (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(OpenBoxResult.class, unmodifiableMap);
    }

    public OpenBoxResult() {
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
        setCoin_countIsSet(false);
        this.coin_count = 0;
        setLucky_strikeIsSet(false);
        this.lucky_strike = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof OpenBoxResult)) {
            return equals((OpenBoxResult) that);
        }
        return false;
    }

    public int getCoin_count() {
        return this.coin_count;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isLucky_strike() {
        return this.lucky_strike;
    }

    public boolean isSetCoin_count() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLucky_strike() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public OpenBoxResult setCoin_count(int coin_count) {
        this.coin_count = coin_count;
        setCoin_countIsSet(true);
        return this;
    }

    public void setCoin_countIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public OpenBoxResult setLucky_strike(boolean lucky_strike) {
        this.lucky_strike = lucky_strike;
        setLucky_strikeIsSet(true);
        return this;
    }

    public void setLucky_strikeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "OpenBoxResult(coin_count:" + this.coin_count + org.junit.jupiter.api.j2.O + "lucky_strike:" + this.lucky_strike + pn.j.f81007d;
    }

    public void unsetCoin_count() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLucky_strike() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(OpenBoxResult other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCoin_count()).compareTo(Boolean.valueOf(other.isSetCoin_count()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCoin_count() && (compareTo2 = TBaseHelper.compareTo(this.coin_count, other.coin_count)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetLucky_strike()).compareTo(Boolean.valueOf(other.isSetLucky_strike()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetLucky_strike() || (compareTo = TBaseHelper.compareTo(this.lucky_strike, other.lucky_strike)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<OpenBoxResult, _Fields> deepCopy2() {
        return new OpenBoxResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$OpenBoxResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getCoin_count());
        }
        if (i11 == 2) {
            return Boolean.valueOf(isLucky_strike());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$OpenBoxResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCoin_count();
        }
        if (i11 == 2) {
            return isSetLucky_strike();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$OpenBoxResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCoin_count();
                return;
            } else {
                setCoin_count(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetLucky_strike();
        } else {
            setLucky_strike(((Boolean) value).booleanValue());
        }
    }

    public OpenBoxResult(int coin_count, boolean lucky_strike) {
        this();
        this.coin_count = coin_count;
        setCoin_countIsSet(true);
        this.lucky_strike = lucky_strike;
        setLucky_strikeIsSet(true);
    }

    public boolean equals(OpenBoxResult that) {
        return that != null && this.coin_count == that.coin_count && this.lucky_strike == that.lucky_strike;
    }

    public OpenBoxResult(OpenBoxResult other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.coin_count = other.coin_count;
        this.lucky_strike = other.lucky_strike;
    }

    public void validate() throws TException {
    }
}
