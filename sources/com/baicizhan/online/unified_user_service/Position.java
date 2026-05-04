package com.baicizhan.online.unified_user_service;

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
/* loaded from: classes6.dex */
public class Position implements TBase<Position, _Fields>, Serializable, Cloneable, Comparable<Position> {
    private static final int __POSITION_CODE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String display_name;
    public String name;
    public int position_code;
    private static final TStruct STRUCT_DESC = new TStruct(ma.b.W1);
    private static final TField POSITION_CODE_FIELD_DESC = new TField("position_code", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField DISPLAY_NAME_FIELD_DESC = new TField("display_name", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.Position$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields = iArr;
            try {
                iArr[_Fields.POSITION_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields[_Fields.DISPLAY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PositionStandardScheme extends StandardScheme<Position> {
        private PositionStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, Position struct) throws TException {
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
                            struct.display_name = iprot.readString();
                            struct.setDisplay_nameIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.name = iprot.readString();
                        struct.setNameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.position_code = iprot.readI32();
                    struct.setPosition_codeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetPosition_code()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'position_code' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, Position struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(Position.STRUCT_DESC);
            oprot.writeFieldBegin(Position.POSITION_CODE_FIELD_DESC);
            oprot.writeI32(struct.position_code);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(Position.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.display_name != null) {
                oprot.writeFieldBegin(Position.DISPLAY_NAME_FIELD_DESC);
                oprot.writeString(struct.display_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PositionStandardSchemeFactory implements SchemeFactory {
        private PositionStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PositionStandardScheme getScheme() {
            return new PositionStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PositionTupleScheme extends TupleScheme<Position> {
        private PositionTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, Position struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.position_code = tTupleProtocol.readI32();
            struct.setPosition_codeIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.display_name = tTupleProtocol.readString();
            struct.setDisplay_nameIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, Position struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.position_code);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeString(struct.display_name);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PositionTupleSchemeFactory implements SchemeFactory {
        private PositionTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PositionTupleScheme getScheme() {
            return new PositionTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        POSITION_CODE(1, "position_code"),
        NAME(2, "name"),
        DISPLAY_NAME(3, "display_name");

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
                return POSITION_CODE;
            }
            if (fieldId == 2) {
                return NAME;
            }
            if (fieldId != 3) {
                return null;
            }
            return DISPLAY_NAME;
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
        hashMap.put(StandardScheme.class, new PositionStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PositionTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.POSITION_CODE, (_Fields) new FieldMetaData("position_code", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DISPLAY_NAME, (_Fields) new FieldMetaData("display_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(Position.class, unmodifiableMap);
    }

    public Position() {
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
        setPosition_codeIsSet(false);
        this.position_code = 0;
        this.name = null;
        this.display_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof Position)) {
            return equals((Position) that);
        }
        return false;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition_code() {
        return this.position_code;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDisplay_name() {
        return this.display_name != null;
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetPosition_code() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public Position setDisplay_name(String display_name) {
        this.display_name = display_name;
        return this;
    }

    public void setDisplay_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.display_name = null;
    }

    public Position setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public Position setPosition_code(int position_code) {
        this.position_code = position_code;
        setPosition_codeIsSet(true);
        return this;
    }

    public void setPosition_codeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Position(");
        sb2.append("position_code:");
        sb2.append(this.position_code);
        sb2.append(j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("display_name:");
        String str2 = this.display_name;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDisplay_name() {
        this.display_name = null;
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetPosition_code() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.name == null) {
            throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.display_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'display_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(Position other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetPosition_code()).compareTo(Boolean.valueOf(other.isSetPosition_code()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetPosition_code() && (compareTo3 = TBaseHelper.compareTo(this.position_code, other.position_code)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetName() && (compareTo2 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetDisplay_name()).compareTo(Boolean.valueOf(other.isSetDisplay_name()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetDisplay_name() || (compareTo = TBaseHelper.compareTo(this.display_name, other.display_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<Position, _Fields> deepCopy2() {
        return new Position(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getPosition_code());
        }
        if (i11 == 2) {
            return getName();
        }
        if (i11 == 3) {
            return getDisplay_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetPosition_code();
        }
        if (i11 == 2) {
            return isSetName();
        }
        if (i11 == 3) {
            return isSetDisplay_name();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$Position$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetPosition_code();
                return;
            } else {
                setPosition_code(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetName();
                return;
            } else {
                setName((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetDisplay_name();
        } else {
            setDisplay_name((String) value);
        }
    }

    public Position(int position_code, String name, String display_name) {
        this();
        this.position_code = position_code;
        setPosition_codeIsSet(true);
        this.name = name;
        this.display_name = display_name;
    }

    public boolean equals(Position that) {
        if (that == null || this.position_code != that.position_code) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetDisplay_name = isSetDisplay_name();
        boolean isSetDisplay_name2 = that.isSetDisplay_name();
        if (isSetDisplay_name || isSetDisplay_name2) {
            return isSetDisplay_name && isSetDisplay_name2 && this.display_name.equals(that.display_name);
        }
        return true;
    }

    public Position(Position other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.position_code = other.position_code;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetDisplay_name()) {
            this.display_name = other.display_name;
        }
    }
}
