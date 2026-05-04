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
public class LifeReq implements TBase<LifeReq, _Fields>, Serializable, Cloneable, Comparable<LifeReq> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String round_id;
    private static final TStruct STRUCT_DESC = new TStruct("LifeReq");
    private static final TField ROUND_ID_FIELD_DESC = new TField("round_id", (byte) 11, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.LifeReq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$LifeReq$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$LifeReq$_Fields = iArr;
            try {
                iArr[_Fields.ROUND_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LifeReqStandardScheme extends StandardScheme<LifeReq> {
        private LifeReqStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, LifeReq struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 11) {
                    struct.round_id = iprot.readString();
                    struct.setRound_idIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, LifeReq struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(LifeReq.STRUCT_DESC);
            if (struct.round_id != null) {
                oprot.writeFieldBegin(LifeReq.ROUND_ID_FIELD_DESC);
                oprot.writeString(struct.round_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LifeReqStandardSchemeFactory implements SchemeFactory {
        private LifeReqStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LifeReqStandardScheme getScheme() {
            return new LifeReqStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LifeReqTupleScheme extends TupleScheme<LifeReq> {
        private LifeReqTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, LifeReq struct) throws TException {
            struct.round_id = ((TTupleProtocol) prot).readString();
            struct.setRound_idIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, LifeReq struct) throws TException {
            ((TTupleProtocol) prot).writeString(struct.round_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class LifeReqTupleSchemeFactory implements SchemeFactory {
        private LifeReqTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public LifeReqTupleScheme getScheme() {
            return new LifeReqTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ROUND_ID(1, "round_id");

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
            return ROUND_ID;
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
        hashMap.put(StandardScheme.class, new LifeReqStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new LifeReqTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ROUND_ID, (_Fields) new FieldMetaData("round_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(LifeReq.class, unmodifiableMap);
    }

    public LifeReq() {
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.round_id = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof LifeReq)) {
            return equals((LifeReq) that);
        }
        return false;
    }

    public String getRound_id() {
        return this.round_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetRound_id() {
        return this.round_id != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public LifeReq setRound_id(String round_id) {
        this.round_id = round_id;
        return this;
    }

    public void setRound_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.round_id = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LifeReq(");
        sb2.append("round_id:");
        String str = this.round_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetRound_id() {
        this.round_id = null;
    }

    public void validate() throws TException {
        if (this.round_id != null) {
            return;
        }
        throw new TProtocolException("Required field 'round_id' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public LifeReq(String round_id) {
        this();
        this.round_id = round_id;
    }

    @Override // java.lang.Comparable
    public int compareTo(LifeReq other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetRound_id()).compareTo(Boolean.valueOf(other.isSetRound_id()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetRound_id() || (compareTo = TBaseHelper.compareTo(this.round_id, other.round_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<LifeReq, _Fields> deepCopy2() {
        return new LifeReq(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$LifeReq$_Fields[field.ordinal()] == 1) {
            return getRound_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$LifeReq$_Fields[field.ordinal()] == 1) {
            return isSetRound_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$LifeReq$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetRound_id();
        } else {
            setRound_id((String) value);
        }
    }

    public boolean equals(LifeReq that) {
        if (that == null) {
            return false;
        }
        boolean isSetRound_id = isSetRound_id();
        boolean isSetRound_id2 = that.isSetRound_id();
        if (isSetRound_id || isSetRound_id2) {
            return isSetRound_id && isSetRound_id2 && this.round_id.equals(that.round_id);
        }
        return true;
    }

    public LifeReq(LifeReq other) {
        if (other.isSetRound_id()) {
            this.round_id = other.round_id;
        }
    }
}
