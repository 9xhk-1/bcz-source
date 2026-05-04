package com.baicizhan.online.bs_fights;

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
/* loaded from: classes5.dex */
public class BBFightUserBasicInfo implements TBase<BBFightUserBasicInfo, _Fields>, Serializable, Cloneable, Comparable<BBFightUserBasicInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String image;
    public String local_name;
    public String nick_name;
    public String token;
    private static final TStruct STRUCT_DESC = new TStruct("BBFightUserBasicInfo");
    private static final TField TOKEN_FIELD_DESC = new TField("token", (byte) 11, 1);
    private static final TField LOCAL_NAME_FIELD_DESC = new TField("local_name", (byte) 11, 2);
    private static final TField NICK_NAME_FIELD_DESC = new TField("nick_name", (byte) 11, 3);
    private static final TField IMAGE_FIELD_DESC = new TField("image", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBFightUserBasicInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields = iArr;
            try {
                iArr[_Fields.TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields[_Fields.LOCAL_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields[_Fields.NICK_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields[_Fields.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightUserBasicInfoStandardScheme extends StandardScheme<BBFightUserBasicInfo> {
        private BBFightUserBasicInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBFightUserBasicInfo struct) throws TException {
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
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.image = iprot.readString();
                                struct.setImageIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.nick_name = iprot.readString();
                            struct.setNick_nameIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.local_name = iprot.readString();
                        struct.setLocal_nameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.token = iprot.readString();
                    struct.setTokenIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBFightUserBasicInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBFightUserBasicInfo.STRUCT_DESC);
            if (struct.token != null) {
                oprot.writeFieldBegin(BBFightUserBasicInfo.TOKEN_FIELD_DESC);
                oprot.writeString(struct.token);
                oprot.writeFieldEnd();
            }
            if (struct.local_name != null) {
                oprot.writeFieldBegin(BBFightUserBasicInfo.LOCAL_NAME_FIELD_DESC);
                oprot.writeString(struct.local_name);
                oprot.writeFieldEnd();
            }
            if (struct.nick_name != null) {
                oprot.writeFieldBegin(BBFightUserBasicInfo.NICK_NAME_FIELD_DESC);
                oprot.writeString(struct.nick_name);
                oprot.writeFieldEnd();
            }
            if (struct.image != null) {
                oprot.writeFieldBegin(BBFightUserBasicInfo.IMAGE_FIELD_DESC);
                oprot.writeString(struct.image);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightUserBasicInfoStandardSchemeFactory implements SchemeFactory {
        private BBFightUserBasicInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFightUserBasicInfoStandardScheme getScheme() {
            return new BBFightUserBasicInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightUserBasicInfoTupleScheme extends TupleScheme<BBFightUserBasicInfo> {
        private BBFightUserBasicInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBFightUserBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.token = tTupleProtocol.readString();
            struct.setTokenIsSet(true);
            struct.local_name = tTupleProtocol.readString();
            struct.setLocal_nameIsSet(true);
            struct.nick_name = tTupleProtocol.readString();
            struct.setNick_nameIsSet(true);
            struct.image = tTupleProtocol.readString();
            struct.setImageIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBFightUserBasicInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.token);
            tTupleProtocol.writeString(struct.local_name);
            tTupleProtocol.writeString(struct.nick_name);
            tTupleProtocol.writeString(struct.image);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFightUserBasicInfoTupleSchemeFactory implements SchemeFactory {
        private BBFightUserBasicInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFightUserBasicInfoTupleScheme getScheme() {
            return new BBFightUserBasicInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOKEN(1, "token"),
        LOCAL_NAME(2, "local_name"),
        NICK_NAME(3, "nick_name"),
        IMAGE(4, "image");

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
                return TOKEN;
            }
            if (fieldId == 2) {
                return LOCAL_NAME;
            }
            if (fieldId == 3) {
                return NICK_NAME;
            }
            if (fieldId != 4) {
                return null;
            }
            return IMAGE;
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
        hashMap.put(StandardScheme.class, new BBFightUserBasicInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBFightUserBasicInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOKEN, (_Fields) new FieldMetaData("token", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LOCAL_NAME, (_Fields) new FieldMetaData("local_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NICK_NAME, (_Fields) new FieldMetaData("nick_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE, (_Fields) new FieldMetaData("image", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBFightUserBasicInfo.class, unmodifiableMap);
    }

    public BBFightUserBasicInfo() {
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
        this.token = null;
        this.local_name = null;
        this.nick_name = null;
        this.image = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBFightUserBasicInfo)) {
            return equals((BBFightUserBasicInfo) that);
        }
        return false;
    }

    public String getImage() {
        return this.image;
    }

    public String getLocal_name() {
        return this.local_name;
    }

    public String getNick_name() {
        return this.nick_name;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetImage() {
        return this.image != null;
    }

    public boolean isSetLocal_name() {
        return this.local_name != null;
    }

    public boolean isSetNick_name() {
        return this.nick_name != null;
    }

    public boolean isSetToken() {
        return this.token != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBFightUserBasicInfo setImage(String image) {
        this.image = image;
        return this;
    }

    public void setImageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image = null;
    }

    public BBFightUserBasicInfo setLocal_name(String local_name) {
        this.local_name = local_name;
        return this;
    }

    public void setLocal_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.local_name = null;
    }

    public BBFightUserBasicInfo setNick_name(String nick_name) {
        this.nick_name = nick_name;
        return this;
    }

    public void setNick_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.nick_name = null;
    }

    public BBFightUserBasicInfo setToken(String token) {
        this.token = token;
        return this;
    }

    public void setTokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.token = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBFightUserBasicInfo(");
        sb2.append("token:");
        String str = this.token;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("local_name:");
        String str2 = this.local_name;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("nick_name:");
        String str3 = this.nick_name;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("image:");
        String str4 = this.image;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetImage() {
        this.image = null;
    }

    public void unsetLocal_name() {
        this.local_name = null;
    }

    public void unsetNick_name() {
        this.nick_name = null;
    }

    public void unsetToken() {
        this.token = null;
    }

    public void validate() throws TException {
        if (this.token == null) {
            throw new TProtocolException("Required field 'token' was not present! Struct: " + toString());
        }
        if (this.local_name == null) {
            throw new TProtocolException("Required field 'local_name' was not present! Struct: " + toString());
        }
        if (this.nick_name == null) {
            throw new TProtocolException("Required field 'nick_name' was not present! Struct: " + toString());
        }
        if (this.image != null) {
            return;
        }
        throw new TProtocolException("Required field 'image' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BBFightUserBasicInfo(String token, String local_name, String nick_name, String image) {
        this();
        this.token = token;
        this.local_name = local_name;
        this.nick_name = nick_name;
        this.image = image;
    }

    @Override // java.lang.Comparable
    public int compareTo(BBFightUserBasicInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetToken()).compareTo(Boolean.valueOf(other.isSetToken()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetToken() && (compareTo4 = TBaseHelper.compareTo(this.token, other.token)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetLocal_name()).compareTo(Boolean.valueOf(other.isSetLocal_name()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetLocal_name() && (compareTo3 = TBaseHelper.compareTo(this.local_name, other.local_name)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetNick_name()).compareTo(Boolean.valueOf(other.isSetNick_name()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetNick_name() && (compareTo2 = TBaseHelper.compareTo(this.nick_name, other.nick_name)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetImage()).compareTo(Boolean.valueOf(other.isSetImage()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetImage() || (compareTo = TBaseHelper.compareTo(this.image, other.image)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBFightUserBasicInfo, _Fields> deepCopy2() {
        return new BBFightUserBasicInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getToken();
        }
        if (i11 == 2) {
            return getLocal_name();
        }
        if (i11 == 3) {
            return getNick_name();
        }
        if (i11 == 4) {
            return getImage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetToken();
        }
        if (i11 == 2) {
            return isSetLocal_name();
        }
        if (i11 == 3) {
            return isSetNick_name();
        }
        if (i11 == 4) {
            return isSetImage();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBFightUserBasicInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetToken();
                return;
            } else {
                setToken((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLocal_name();
                return;
            } else {
                setLocal_name((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetNick_name();
                return;
            } else {
                setNick_name((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetImage();
        } else {
            setImage((String) value);
        }
    }

    public boolean equals(BBFightUserBasicInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetToken = isSetToken();
        boolean isSetToken2 = that.isSetToken();
        if ((isSetToken || isSetToken2) && !(isSetToken && isSetToken2 && this.token.equals(that.token))) {
            return false;
        }
        boolean isSetLocal_name = isSetLocal_name();
        boolean isSetLocal_name2 = that.isSetLocal_name();
        if ((isSetLocal_name || isSetLocal_name2) && !(isSetLocal_name && isSetLocal_name2 && this.local_name.equals(that.local_name))) {
            return false;
        }
        boolean isSetNick_name = isSetNick_name();
        boolean isSetNick_name2 = that.isSetNick_name();
        if ((isSetNick_name || isSetNick_name2) && !(isSetNick_name && isSetNick_name2 && this.nick_name.equals(that.nick_name))) {
            return false;
        }
        boolean isSetImage = isSetImage();
        boolean isSetImage2 = that.isSetImage();
        if (isSetImage || isSetImage2) {
            return isSetImage && isSetImage2 && this.image.equals(that.image);
        }
        return true;
    }

    public BBFightUserBasicInfo(BBFightUserBasicInfo other) {
        if (other.isSetToken()) {
            this.token = other.token;
        }
        if (other.isSetLocal_name()) {
            this.local_name = other.local_name;
        }
        if (other.isSetNick_name()) {
            this.nick_name = other.nick_name;
        }
        if (other.isSetImage()) {
            this.image = other.image;
        }
    }
}
