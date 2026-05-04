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
public class GameMode implements TBase<GameMode, _Fields>, Serializable, Cloneable, Comparable<GameMode> {
    private static final int __MODE_ISSET_ID = 0;
    private static final int __SHOW_SWITCH_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int mode;
    public int show_switch;
    private static final TStruct STRUCT_DESC = new TStruct("GameMode");
    private static final TField MODE_FIELD_DESC = new TField("mode", (byte) 8, 1);
    private static final TField SHOW_SWITCH_FIELD_DESC = new TField("show_switch", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.GameMode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$GameMode$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$GameMode$_Fields = iArr;
            try {
                iArr[_Fields.MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$GameMode$_Fields[_Fields.SHOW_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameModeStandardScheme extends StandardScheme<GameMode> {
        private GameModeStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, GameMode struct) throws TException {
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
                        struct.show_switch = iprot.readI32();
                        struct.setShow_switchIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.mode = iprot.readI32();
                    struct.setModeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetMode()) {
                throw new TProtocolException("Required field 'mode' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetShow_switch()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'show_switch' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, GameMode struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(GameMode.STRUCT_DESC);
            oprot.writeFieldBegin(GameMode.MODE_FIELD_DESC);
            oprot.writeI32(struct.mode);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(GameMode.SHOW_SWITCH_FIELD_DESC);
            oprot.writeI32(struct.show_switch);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameModeStandardSchemeFactory implements SchemeFactory {
        private GameModeStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameModeStandardScheme getScheme() {
            return new GameModeStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameModeTupleScheme extends TupleScheme<GameMode> {
        private GameModeTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, GameMode struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.mode = tTupleProtocol.readI32();
            struct.setModeIsSet(true);
            struct.show_switch = tTupleProtocol.readI32();
            struct.setShow_switchIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, GameMode struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.mode);
            tTupleProtocol.writeI32(struct.show_switch);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameModeTupleSchemeFactory implements SchemeFactory {
        private GameModeTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameModeTupleScheme getScheme() {
            return new GameModeTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MODE(1, "mode"),
        SHOW_SWITCH(2, "show_switch");

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
                return MODE;
            }
            if (fieldId != 2) {
                return null;
            }
            return SHOW_SWITCH;
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
        hashMap.put(StandardScheme.class, new GameModeStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new GameModeTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MODE, (_Fields) new FieldMetaData("mode", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.SHOW_SWITCH, (_Fields) new FieldMetaData("show_switch", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(GameMode.class, unmodifiableMap);
    }

    public GameMode() {
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
        setModeIsSet(false);
        this.mode = 0;
        setShow_switchIsSet(false);
        this.show_switch = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof GameMode)) {
            return equals((GameMode) that);
        }
        return false;
    }

    public int getMode() {
        return this.mode;
    }

    public int getShow_switch() {
        return this.show_switch;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMode() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetShow_switch() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public GameMode setMode(int mode) {
        this.mode = mode;
        setModeIsSet(true);
        return this;
    }

    public void setModeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public GameMode setShow_switch(int show_switch) {
        this.show_switch = show_switch;
        setShow_switchIsSet(true);
        return this;
    }

    public void setShow_switchIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        return "GameMode(mode:" + this.mode + org.junit.jupiter.api.j2.O + "show_switch:" + this.show_switch + pn.j.f81007d;
    }

    public void unsetMode() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetShow_switch() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(GameMode other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetMode()).compareTo(Boolean.valueOf(other.isSetMode()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetMode() && (compareTo2 = TBaseHelper.compareTo(this.mode, other.mode)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetShow_switch()).compareTo(Boolean.valueOf(other.isSetShow_switch()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetShow_switch() || (compareTo = TBaseHelper.compareTo(this.show_switch, other.show_switch)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<GameMode, _Fields> deepCopy2() {
        return new GameMode(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$GameMode$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getMode());
        }
        if (i11 == 2) {
            return Integer.valueOf(getShow_switch());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$GameMode$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMode();
        }
        if (i11 == 2) {
            return isSetShow_switch();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$GameMode$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMode();
                return;
            } else {
                setMode(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetShow_switch();
        } else {
            setShow_switch(((Integer) value).intValue());
        }
    }

    public GameMode(int mode, int show_switch) {
        this();
        this.mode = mode;
        setModeIsSet(true);
        this.show_switch = show_switch;
        setShow_switchIsSet(true);
    }

    public boolean equals(GameMode that) {
        return that != null && this.mode == that.mode && this.show_switch == that.show_switch;
    }

    public GameMode(GameMode other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.mode = other.mode;
        this.show_switch = other.show_switch;
    }

    public void validate() throws TException {
    }
}
