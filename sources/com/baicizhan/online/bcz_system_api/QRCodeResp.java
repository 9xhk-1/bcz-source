package com.baicizhan.online.bcz_system_api;

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
import org.apache.thrift.meta_data.StructMetaData;
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
public class QRCodeResp implements TBase<QRCodeResp, _Fields>, Serializable, Cloneable, Comparable<QRCodeResp> {
    private static final int __ACTION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int action;
    public String message;
    private _Fields[] optionals;
    public QRCodeRedirect redirect_info;
    private static final TStruct STRUCT_DESC = new TStruct("QRCodeResp");
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 8, 1);
    private static final TField MESSAGE_FIELD_DESC = new TField("message", (byte) 11, 2);
    private static final TField REDIRECT_INFO_FIELD_DESC = new TField("redirect_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.QRCodeResp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields = iArr;
            try {
                iArr[_Fields.ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields[_Fields.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields[_Fields.REDIRECT_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRespStandardScheme extends StandardScheme<QRCodeResp> {
        private QRCodeRespStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, QRCodeResp struct) throws TException {
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
                        } else if (b11 == 12) {
                            QRCodeRedirect qRCodeRedirect = new QRCodeRedirect();
                            struct.redirect_info = qRCodeRedirect;
                            qRCodeRedirect.read(iprot);
                            struct.setRedirect_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.message = iprot.readString();
                        struct.setMessageIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.action = iprot.readI32();
                    struct.setActionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetAction()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'action' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, QRCodeResp struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(QRCodeResp.STRUCT_DESC);
            oprot.writeFieldBegin(QRCodeResp.ACTION_FIELD_DESC);
            oprot.writeI32(struct.action);
            oprot.writeFieldEnd();
            if (struct.message != null && struct.isSetMessage()) {
                oprot.writeFieldBegin(QRCodeResp.MESSAGE_FIELD_DESC);
                oprot.writeString(struct.message);
                oprot.writeFieldEnd();
            }
            if (struct.redirect_info != null && struct.isSetRedirect_info()) {
                oprot.writeFieldBegin(QRCodeResp.REDIRECT_INFO_FIELD_DESC);
                struct.redirect_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRespStandardSchemeFactory implements SchemeFactory {
        private QRCodeRespStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QRCodeRespStandardScheme getScheme() {
            return new QRCodeRespStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRespTupleScheme extends TupleScheme<QRCodeResp> {
        private QRCodeRespTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, QRCodeResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.action = tTupleProtocol.readI32();
            struct.setActionIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.message = tTupleProtocol.readString();
                struct.setMessageIsSet(true);
            }
            if (readBitSet.get(1)) {
                QRCodeRedirect qRCodeRedirect = new QRCodeRedirect();
                struct.redirect_info = qRCodeRedirect;
                qRCodeRedirect.read(tTupleProtocol);
                struct.setRedirect_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, QRCodeResp struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.action);
            BitSet bitSet = new BitSet();
            if (struct.isSetMessage()) {
                bitSet.set(0);
            }
            if (struct.isSetRedirect_info()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetMessage()) {
                tTupleProtocol.writeString(struct.message);
            }
            if (struct.isSetRedirect_info()) {
                struct.redirect_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QRCodeRespTupleSchemeFactory implements SchemeFactory {
        private QRCodeRespTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QRCodeRespTupleScheme getScheme() {
            return new QRCodeRespTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ACTION(1, "action"),
        MESSAGE(2, "message"),
        REDIRECT_INFO(3, "redirect_info");

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
                return ACTION;
            }
            if (fieldId == 2) {
                return MESSAGE;
            }
            if (fieldId != 3) {
                return null;
            }
            return REDIRECT_INFO;
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
        hashMap.put(StandardScheme.class, new QRCodeRespStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new QRCodeRespTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MESSAGE, (_Fields) new FieldMetaData("message", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.REDIRECT_INFO, (_Fields) new FieldMetaData("redirect_info", (byte) 2, new StructMetaData((byte) 12, QRCodeRedirect.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(QRCodeResp.class, unmodifiableMap);
    }

    public QRCodeResp() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MESSAGE, _Fields.REDIRECT_INFO};
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
        setActionIsSet(false);
        this.action = 0;
        this.message = null;
        this.redirect_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof QRCodeResp)) {
            return equals((QRCodeResp) that);
        }
        return false;
    }

    public int getAction() {
        return this.action;
    }

    public String getMessage() {
        return this.message;
    }

    public QRCodeRedirect getRedirect_info() {
        return this.redirect_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetMessage() {
        return this.message != null;
    }

    public boolean isSetRedirect_info() {
        return this.redirect_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public QRCodeResp setAction(int action) {
        this.action = action;
        setActionIsSet(true);
        return this;
    }

    public void setActionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public QRCodeResp setMessage(String message) {
        this.message = message;
        return this;
    }

    public void setMessageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.message = null;
    }

    public QRCodeResp setRedirect_info(QRCodeRedirect redirect_info) {
        this.redirect_info = redirect_info;
        return this;
    }

    public void setRedirect_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.redirect_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QRCodeResp(");
        sb2.append("action:");
        sb2.append(this.action);
        if (isSetMessage()) {
            sb2.append(j2.O);
            sb2.append("message:");
            String str = this.message;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetRedirect_info()) {
            sb2.append(j2.O);
            sb2.append("redirect_info:");
            QRCodeRedirect qRCodeRedirect = this.redirect_info;
            if (qRCodeRedirect == null) {
                sb2.append("null");
            } else {
                sb2.append(qRCodeRedirect);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetMessage() {
        this.message = null;
    }

    public void unsetRedirect_info() {
        this.redirect_info = null;
    }

    public void validate() throws TException {
        QRCodeRedirect qRCodeRedirect = this.redirect_info;
        if (qRCodeRedirect != null) {
            qRCodeRedirect.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(QRCodeResp other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetAction() && (compareTo3 = TBaseHelper.compareTo(this.action, other.action)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetMessage()).compareTo(Boolean.valueOf(other.isSetMessage()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetMessage() && (compareTo2 = TBaseHelper.compareTo(this.message, other.message)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetRedirect_info()).compareTo(Boolean.valueOf(other.isSetRedirect_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetRedirect_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.redirect_info, (Comparable) other.redirect_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<QRCodeResp, _Fields> deepCopy2() {
        return new QRCodeResp(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getAction());
        }
        if (i11 == 2) {
            return getMessage();
        }
        if (i11 == 3) {
            return getRedirect_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAction();
        }
        if (i11 == 2) {
            return isSetMessage();
        }
        if (i11 == 3) {
            return isSetRedirect_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$QRCodeResp$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAction();
                return;
            } else {
                setAction(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetMessage();
                return;
            } else {
                setMessage((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetRedirect_info();
        } else {
            setRedirect_info((QRCodeRedirect) value);
        }
    }

    public boolean equals(QRCodeResp that) {
        if (that == null || this.action != that.action) {
            return false;
        }
        boolean isSetMessage = isSetMessage();
        boolean isSetMessage2 = that.isSetMessage();
        if ((isSetMessage || isSetMessage2) && !(isSetMessage && isSetMessage2 && this.message.equals(that.message))) {
            return false;
        }
        boolean isSetRedirect_info = isSetRedirect_info();
        boolean isSetRedirect_info2 = that.isSetRedirect_info();
        if (isSetRedirect_info || isSetRedirect_info2) {
            return isSetRedirect_info && isSetRedirect_info2 && this.redirect_info.equals(that.redirect_info);
        }
        return true;
    }

    public QRCodeResp(int action) {
        this();
        this.action = action;
        setActionIsSet(true);
    }

    public QRCodeResp(QRCodeResp other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MESSAGE, _Fields.REDIRECT_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.action = other.action;
        if (other.isSetMessage()) {
            this.message = other.message;
        }
        if (other.isSetRedirect_info()) {
            this.redirect_info = new QRCodeRedirect(other.redirect_info);
        }
    }
}
