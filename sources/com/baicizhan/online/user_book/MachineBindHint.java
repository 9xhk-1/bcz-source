package com.baicizhan.online.user_book;

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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class MachineBindHint implements TBase<MachineBindHint, _Fields>, Serializable, Cloneable, Comparable<MachineBindHint> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String pic;
    public String text;
    private static final TStruct STRUCT_DESC = new TStruct("MachineBindHint");
    private static final TField TEXT_FIELD_DESC = new TField("text", (byte) 11, 1);
    private static final TField PIC_FIELD_DESC = new TField("pic", (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_book.MachineBindHint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_book$MachineBindHint$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_book$MachineBindHint$_Fields = iArr;
            try {
                iArr[_Fields.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_book$MachineBindHint$_Fields[_Fields.PIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MachineBindHintStandardScheme extends StandardScheme<MachineBindHint> {
        private MachineBindHintStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MachineBindHint struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.pic = iprot.readString();
                        struct.setPicIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.text = iprot.readString();
                    struct.setTextIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, MachineBindHint struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MachineBindHint.STRUCT_DESC);
            if (struct.text != null) {
                oprot.writeFieldBegin(MachineBindHint.TEXT_FIELD_DESC);
                oprot.writeString(struct.text);
                oprot.writeFieldEnd();
            }
            if (struct.pic != null) {
                oprot.writeFieldBegin(MachineBindHint.PIC_FIELD_DESC);
                oprot.writeString(struct.pic);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MachineBindHintStandardSchemeFactory implements SchemeFactory {
        private MachineBindHintStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MachineBindHintStandardScheme getScheme() {
            return new MachineBindHintStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MachineBindHintTupleScheme extends TupleScheme<MachineBindHint> {
        private MachineBindHintTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MachineBindHint struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.text = tTupleProtocol.readString();
            struct.setTextIsSet(true);
            struct.pic = tTupleProtocol.readString();
            struct.setPicIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MachineBindHint struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.text);
            tTupleProtocol.writeString(struct.pic);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MachineBindHintTupleSchemeFactory implements SchemeFactory {
        private MachineBindHintTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MachineBindHintTupleScheme getScheme() {
            return new MachineBindHintTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TEXT(1, "text"),
        PIC(2, "pic");

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
                return TEXT;
            }
            if (fieldId != 2) {
                return null;
            }
            return PIC;
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
        hashMap.put(StandardScheme.class, new MachineBindHintStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MachineBindHintTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TEXT, (_Fields) new FieldMetaData("text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PIC, (_Fields) new FieldMetaData("pic", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MachineBindHint.class, unmodifiableMap);
    }

    public MachineBindHint() {
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
        this.text = null;
        this.pic = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MachineBindHint)) {
            return equals((MachineBindHint) that);
        }
        return false;
    }

    public String getPic() {
        return this.pic;
    }

    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetPic() {
        return this.pic != null;
    }

    public boolean isSetText() {
        return this.text != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MachineBindHint setPic(String pic) {
        this.pic = pic;
        return this;
    }

    public void setPicIsSet(boolean value) {
        if (value) {
            return;
        }
        this.pic = null;
    }

    public MachineBindHint setText(String text) {
        this.text = text;
        return this;
    }

    public void setTextIsSet(boolean value) {
        if (value) {
            return;
        }
        this.text = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MachineBindHint(");
        sb2.append("text:");
        String str = this.text;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("pic:");
        String str2 = this.pic;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetPic() {
        this.pic = null;
    }

    public void unsetText() {
        this.text = null;
    }

    public void validate() throws TException {
        if (this.text == null) {
            throw new TProtocolException("Required field 'text' was not present! Struct: " + toString());
        }
        if (this.pic != null) {
            return;
        }
        throw new TProtocolException("Required field 'pic' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public MachineBindHint(String text, String pic) {
        this();
        this.text = text;
        this.pic = pic;
    }

    @Override // java.lang.Comparable
    public int compareTo(MachineBindHint other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetText()).compareTo(Boolean.valueOf(other.isSetText()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetText() && (compareTo2 = TBaseHelper.compareTo(this.text, other.text)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetPic()).compareTo(Boolean.valueOf(other.isSetPic()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetPic() || (compareTo = TBaseHelper.compareTo(this.pic, other.pic)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MachineBindHint, _Fields> deepCopy2() {
        return new MachineBindHint(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$MachineBindHint$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getText();
        }
        if (i11 == 2) {
            return getPic();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$MachineBindHint$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetText();
        }
        if (i11 == 2) {
            return isSetPic();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_book$MachineBindHint$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetText();
                return;
            } else {
                setText((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetPic();
        } else {
            setPic((String) value);
        }
    }

    public boolean equals(MachineBindHint that) {
        if (that == null) {
            return false;
        }
        boolean isSetText = isSetText();
        boolean isSetText2 = that.isSetText();
        if ((isSetText || isSetText2) && !(isSetText && isSetText2 && this.text.equals(that.text))) {
            return false;
        }
        boolean isSetPic = isSetPic();
        boolean isSetPic2 = that.isSetPic();
        if (isSetPic || isSetPic2) {
            return isSetPic && isSetPic2 && this.pic.equals(that.pic);
        }
        return true;
    }

    public MachineBindHint(MachineBindHint other) {
        if (other.isSetText()) {
            this.text = other.text;
        }
        if (other.isSetPic()) {
            this.pic = other.pic;
        }
    }
}
