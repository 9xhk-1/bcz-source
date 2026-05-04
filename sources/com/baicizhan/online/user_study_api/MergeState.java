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
public class MergeState implements TBase<MergeState, _Fields>, Serializable, Cloneable, Comparable<MergeState> {
    private static final int __PERCENTAGE_ISSET_ID = 1;
    private static final int __STATE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;

    /* renamed from: id, reason: collision with root package name */
    public String f28165id;
    public int percentage;
    public int state;
    private static final TStruct STRUCT_DESC = new TStruct("MergeState");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 11, 1);
    private static final TField STATE_FIELD_DESC = new TField("state", (byte) 8, 2);
    private static final TField PERCENTAGE_FIELD_DESC = new TField("percentage", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.MergeState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields[_Fields.STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields[_Fields.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MergeStateStandardScheme extends StandardScheme<MergeState> {
        private MergeStateStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MergeState struct) throws TException {
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
                            struct.percentage = iprot.readI32();
                            struct.setPercentageIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.state = iprot.readI32();
                        struct.setStateIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.f28165id = iprot.readString();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetState()) {
                throw new TProtocolException("Required field 'state' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetPercentage()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'percentage' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MergeState struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MergeState.STRUCT_DESC);
            if (struct.f28165id != null) {
                oprot.writeFieldBegin(MergeState.ID_FIELD_DESC);
                oprot.writeString(struct.f28165id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(MergeState.STATE_FIELD_DESC);
            oprot.writeI32(struct.state);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MergeState.PERCENTAGE_FIELD_DESC);
            oprot.writeI32(struct.percentage);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MergeStateStandardSchemeFactory implements SchemeFactory {
        private MergeStateStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MergeStateStandardScheme getScheme() {
            return new MergeStateStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MergeStateTupleScheme extends TupleScheme<MergeState> {
        private MergeStateTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MergeState struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28165id = tTupleProtocol.readString();
            struct.setIdIsSet(true);
            struct.state = tTupleProtocol.readI32();
            struct.setStateIsSet(true);
            struct.percentage = tTupleProtocol.readI32();
            struct.setPercentageIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MergeState struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.f28165id);
            tTupleProtocol.writeI32(struct.state);
            tTupleProtocol.writeI32(struct.percentage);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MergeStateTupleSchemeFactory implements SchemeFactory {
        private MergeStateTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MergeStateTupleScheme getScheme() {
            return new MergeStateTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        STATE(2, "state"),
        PERCENTAGE(3, "percentage");

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
                return ID;
            }
            if (fieldId == 2) {
                return STATE;
            }
            if (fieldId != 3) {
                return null;
            }
            return PERCENTAGE;
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
        hashMap.put(StandardScheme.class, new MergeStateStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MergeStateTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.STATE, (_Fields) new FieldMetaData("state", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PERCENTAGE, (_Fields) new FieldMetaData("percentage", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MergeState.class, unmodifiableMap);
    }

    public MergeState() {
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
        this.f28165id = null;
        setStateIsSet(false);
        this.state = 0;
        setPercentageIsSet(false);
        this.percentage = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MergeState)) {
            return equals((MergeState) that);
        }
        return false;
    }

    public String getId() {
        return this.f28165id;
    }

    public int getPercentage() {
        return this.percentage;
    }

    public int getState() {
        return this.state;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetId() {
        return this.f28165id != null;
    }

    public boolean isSetPercentage() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetState() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MergeState setId(String id2) {
        this.f28165id = id2;
        return this;
    }

    public void setIdIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28165id = null;
    }

    public MergeState setPercentage(int percentage) {
        this.percentage = percentage;
        setPercentageIsSet(true);
        return this;
    }

    public void setPercentageIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public MergeState setState(int state) {
        this.state = state;
        setStateIsSet(true);
        return this;
    }

    public void setStateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MergeState(");
        sb2.append("id:");
        String str = this.f28165id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("state:");
        sb2.append(this.state);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("percentage:");
        sb2.append(this.percentage);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetId() {
        this.f28165id = null;
    }

    public void unsetPercentage() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetState() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.f28165id != null) {
            return;
        }
        throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MergeState other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetId() && (compareTo3 = TBaseHelper.compareTo(this.f28165id, other.f28165id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetState()).compareTo(Boolean.valueOf(other.isSetState()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetState() && (compareTo2 = TBaseHelper.compareTo(this.state, other.state)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetPercentage()).compareTo(Boolean.valueOf(other.isSetPercentage()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetPercentage() || (compareTo = TBaseHelper.compareTo(this.percentage, other.percentage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MergeState, _Fields> deepCopy2() {
        return new MergeState(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getId();
        }
        if (i11 == 2) {
            return Integer.valueOf(getState());
        }
        if (i11 == 3) {
            return Integer.valueOf(getPercentage());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetState();
        }
        if (i11 == 3) {
            return isSetPercentage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$MergeState$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetState();
                return;
            } else {
                setState(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetPercentage();
        } else {
            setPercentage(((Integer) value).intValue());
        }
    }

    public MergeState(String id2, int state, int percentage) {
        this();
        this.f28165id = id2;
        this.state = state;
        setStateIsSet(true);
        this.percentage = percentage;
        setPercentageIsSet(true);
    }

    public boolean equals(MergeState that) {
        if (that == null) {
            return false;
        }
        boolean isSetId = isSetId();
        boolean isSetId2 = that.isSetId();
        return (!(isSetId || isSetId2) || (isSetId && isSetId2 && this.f28165id.equals(that.f28165id))) && this.state == that.state && this.percentage == that.percentage;
    }

    public MergeState(MergeState other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetId()) {
            this.f28165id = other.f28165id;
        }
        this.state = other.state;
        this.percentage = other.percentage;
    }
}
