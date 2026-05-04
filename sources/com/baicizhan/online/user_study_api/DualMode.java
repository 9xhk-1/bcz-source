package com.baicizhan.online.user_study_api;

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
public class DualMode implements TBase<DualMode, _Fields>, Serializable, Cloneable, Comparable<DualMode> {
    private static final int __CURRENT_MODE_ISSET_ID = 1;
    private static final int __USERTYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int current_mode;
    public int userType;
    private static final TStruct STRUCT_DESC = new TStruct("DualMode");
    private static final TField USER_TYPE_FIELD_DESC = new TField("userType", (byte) 8, 1);
    private static final TField CURRENT_MODE_FIELD_DESC = new TField("current_mode", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.DualMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$DualMode$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$DualMode$_Fields = iArr;
            try {
                iArr[_Fields.USER_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$DualMode$_Fields[_Fields.CURRENT_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DualModeStandardScheme extends StandardScheme<DualMode> {
        private DualModeStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DualMode struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.current_mode = iprot.readI32();
                        struct.setCurrent_modeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.userType = iprot.readI32();
                    struct.setUserTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetUserType()) {
                throw new TProtocolException("Required field 'userType' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetCurrent_mode()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'current_mode' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DualMode struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DualMode.STRUCT_DESC);
            oprot.writeFieldBegin(DualMode.USER_TYPE_FIELD_DESC);
            oprot.writeI32(struct.userType);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(DualMode.CURRENT_MODE_FIELD_DESC);
            oprot.writeI32(struct.current_mode);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DualModeStandardSchemeFactory implements SchemeFactory {
        private DualModeStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DualModeStandardScheme getScheme() {
            return new DualModeStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DualModeTupleScheme extends TupleScheme<DualMode> {
        private DualModeTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DualMode struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.userType = tTupleProtocol.readI32();
            struct.setUserTypeIsSet(true);
            struct.current_mode = tTupleProtocol.readI32();
            struct.setCurrent_modeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DualMode struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.userType);
            tTupleProtocol.writeI32(struct.current_mode);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DualModeTupleSchemeFactory implements SchemeFactory {
        private DualModeTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DualModeTupleScheme getScheme() {
            return new DualModeTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_TYPE(1, "userType"),
        CURRENT_MODE(2, "current_mode");

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
                return USER_TYPE;
            }
            if (fieldId != 2) {
                return null;
            }
            return CURRENT_MODE;
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
        hashMap.put(StandardScheme.class, new DualModeStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DualModeTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_TYPE, (_Fields) new FieldMetaData("userType", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.CURRENT_MODE, (_Fields) new FieldMetaData("current_mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DualMode.class, unmodifiableMap);
    }

    public DualMode() {
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
        setUserTypeIsSet(false);
        this.userType = 0;
        setCurrent_modeIsSet(false);
        this.current_mode = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DualMode)) {
            return equals((DualMode) that);
        }
        return false;
    }

    public int getCurrent_mode() {
        return this.current_mode;
    }

    public int getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCurrent_mode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetUserType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DualMode setCurrent_mode(int current_mode) {
        this.current_mode = current_mode;
        setCurrent_modeIsSet(true);
        return this;
    }

    public void setCurrent_modeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public DualMode setUserType(int userType) {
        this.userType = userType;
        setUserTypeIsSet(true);
        return this;
    }

    public void setUserTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        return "DualMode(userType:" + this.userType + org.junit.jupiter.api.j2.O + "current_mode:" + this.current_mode + pn.j.f81007d;
    }

    public void unsetCurrent_mode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetUserType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DualMode other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetUserType()).compareTo(Boolean.valueOf(other.isSetUserType()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetUserType() && (compareTo2 = TBaseHelper.compareTo(this.userType, other.userType)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetCurrent_mode()).compareTo(Boolean.valueOf(other.isSetCurrent_mode()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetCurrent_mode() || (compareTo = TBaseHelper.compareTo(this.current_mode, other.current_mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DualMode, _Fields> deepCopy2() {
        return new DualMode(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DualMode$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getUserType());
        }
        if (i11 == 2) {
            return Integer.valueOf(getCurrent_mode());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DualMode$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUserType();
        }
        if (i11 == 2) {
            return isSetCurrent_mode();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DualMode$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUserType();
                return;
            } else {
                setUserType(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetCurrent_mode();
        } else {
            setCurrent_mode(((Integer) value).intValue());
        }
    }

    public DualMode(int userType, int current_mode) {
        this();
        this.userType = userType;
        setUserTypeIsSet(true);
        this.current_mode = current_mode;
        setCurrent_modeIsSet(true);
    }

    public boolean equals(DualMode that) {
        return that != null && this.userType == that.userType && this.current_mode == that.current_mode;
    }

    public DualMode(DualMode other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.userType = other.userType;
        this.current_mode = other.current_mode;
    }

    public void validate() throws TException {
    }
}
