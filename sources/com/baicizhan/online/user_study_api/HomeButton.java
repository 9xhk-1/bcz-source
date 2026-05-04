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
public class HomeButton implements TBase<HomeButton, _Fields>, Serializable, Cloneable, Comparable<HomeButton> {
    private static final int __TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String link;
    public String msg;
    public int type;
    private static final TStruct STRUCT_DESC = new TStruct("HomeButton");
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 1);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 2);
    private static final TField MSG_FIELD_DESC = new TField("msg", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.HomeButton$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields = iArr;
            try {
                iArr[_Fields.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields[_Fields.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields[_Fields.MSG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HomeButtonStandardScheme extends StandardScheme<HomeButton> {
        private HomeButtonStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, HomeButton struct) throws TException {
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
                            struct.msg = iprot.readString();
                            struct.setMsgIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.link = iprot.readString();
                        struct.setLinkIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.type = iprot.readI32();
                    struct.setTypeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetType()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, HomeButton struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(HomeButton.STRUCT_DESC);
            oprot.writeFieldBegin(HomeButton.TYPE_FIELD_DESC);
            oprot.writeI32(struct.type);
            oprot.writeFieldEnd();
            if (struct.link != null) {
                oprot.writeFieldBegin(HomeButton.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.msg != null) {
                oprot.writeFieldBegin(HomeButton.MSG_FIELD_DESC);
                oprot.writeString(struct.msg);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HomeButtonStandardSchemeFactory implements SchemeFactory {
        private HomeButtonStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HomeButtonStandardScheme getScheme() {
            return new HomeButtonStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HomeButtonTupleScheme extends TupleScheme<HomeButton> {
        private HomeButtonTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, HomeButton struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.type = tTupleProtocol.readI32();
            struct.setTypeIsSet(true);
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
            struct.msg = tTupleProtocol.readString();
            struct.setMsgIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, HomeButton struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.type);
            tTupleProtocol.writeString(struct.link);
            tTupleProtocol.writeString(struct.msg);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HomeButtonTupleSchemeFactory implements SchemeFactory {
        private HomeButtonTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public HomeButtonTupleScheme getScheme() {
            return new HomeButtonTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TYPE(1, "type"),
        LINK(2, y9.b.f99687c),
        MSG(3, "msg");

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
                return TYPE;
            }
            if (fieldId == 2) {
                return LINK;
            }
            if (fieldId != 3) {
                return null;
            }
            return MSG;
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
        hashMap.put(StandardScheme.class, new HomeButtonStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new HomeButtonTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MSG, (_Fields) new FieldMetaData("msg", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(HomeButton.class, unmodifiableMap);
    }

    public HomeButton() {
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
        setTypeIsSet(false);
        this.type = 0;
        this.link = null;
        this.msg = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof HomeButton)) {
            return equals((HomeButton) that);
        }
        return false;
    }

    public String getLink() {
        return this.link;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public HomeButton setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public HomeButton setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public void setMsgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.msg = null;
    }

    public HomeButton setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("HomeButton(");
        sb2.append("type:");
        sb2.append(this.type);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("link:");
        String str = this.link;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("msg:");
        String str2 = this.msg;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.link == null) {
            throw new TProtocolException("Required field 'link' was not present! Struct: " + toString());
        }
        if (this.msg != null) {
            return;
        }
        throw new TProtocolException("Required field 'msg' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(HomeButton other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetType() && (compareTo3 = TBaseHelper.compareTo(this.type, other.type)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLink() && (compareTo2 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetMsg()).compareTo(Boolean.valueOf(other.isSetMsg()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetMsg() || (compareTo = TBaseHelper.compareTo(this.msg, other.msg)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<HomeButton, _Fields> deepCopy2() {
        return new HomeButton(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getType());
        }
        if (i11 == 2) {
            return getLink();
        }
        if (i11 == 3) {
            return getMsg();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetType();
        }
        if (i11 == 2) {
            return isSetLink();
        }
        if (i11 == 3) {
            return isSetMsg();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$HomeButton$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetType();
                return;
            } else {
                setType(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLink();
                return;
            } else {
                setLink((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetMsg();
        } else {
            setMsg((String) value);
        }
    }

    public HomeButton(int type, String link, String msg) {
        this();
        this.type = type;
        setTypeIsSet(true);
        this.link = link;
        this.msg = msg;
    }

    public boolean equals(HomeButton that) {
        if (that == null || this.type != that.type) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetMsg = isSetMsg();
        boolean isSetMsg2 = that.isSetMsg();
        if (isSetMsg || isSetMsg2) {
            return isSetMsg && isSetMsg2 && this.msg.equals(that.msg);
        }
        return true;
    }

    public HomeButton(HomeButton other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.type = other.type;
        if (other.isSetLink()) {
            this.link = other.link;
        }
        if (other.isSetMsg()) {
            this.msg = other.msg;
        }
    }
}
