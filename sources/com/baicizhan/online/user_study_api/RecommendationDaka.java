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
public class RecommendationDaka implements TBase<RecommendationDaka, _Fields>, Serializable, Cloneable, Comparable<RecommendationDaka> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String banner_url;
    public String jump_url;
    public String user_type;
    private static final TStruct STRUCT_DESC = new TStruct("RecommendationDaka");
    private static final TField BANNER_URL_FIELD_DESC = new TField("banner_url", (byte) 11, 1);
    private static final TField JUMP_URL_FIELD_DESC = new TField(md.j.f73126f, (byte) 11, 2);
    private static final TField USER_TYPE_FIELD_DESC = new TField(ma.b.f72954w, (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.RecommendationDaka$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields = iArr;
            try {
                iArr[_Fields.BANNER_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields[_Fields.JUMP_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields[_Fields.USER_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationDakaStandardScheme extends StandardScheme<RecommendationDaka> {
        private RecommendationDakaStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, RecommendationDaka struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.user_type = iprot.readString();
                            struct.setUser_typeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.jump_url = iprot.readString();
                        struct.setJump_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.banner_url = iprot.readString();
                    struct.setBanner_urlIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, RecommendationDaka struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(RecommendationDaka.STRUCT_DESC);
            if (struct.banner_url != null) {
                oprot.writeFieldBegin(RecommendationDaka.BANNER_URL_FIELD_DESC);
                oprot.writeString(struct.banner_url);
                oprot.writeFieldEnd();
            }
            if (struct.jump_url != null) {
                oprot.writeFieldBegin(RecommendationDaka.JUMP_URL_FIELD_DESC);
                oprot.writeString(struct.jump_url);
                oprot.writeFieldEnd();
            }
            if (struct.user_type != null) {
                oprot.writeFieldBegin(RecommendationDaka.USER_TYPE_FIELD_DESC);
                oprot.writeString(struct.user_type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationDakaStandardSchemeFactory implements SchemeFactory {
        private RecommendationDakaStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RecommendationDakaStandardScheme getScheme() {
            return new RecommendationDakaStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationDakaTupleScheme extends TupleScheme<RecommendationDaka> {
        private RecommendationDakaTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, RecommendationDaka struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.banner_url = tTupleProtocol.readString();
            struct.setBanner_urlIsSet(true);
            struct.jump_url = tTupleProtocol.readString();
            struct.setJump_urlIsSet(true);
            struct.user_type = tTupleProtocol.readString();
            struct.setUser_typeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, RecommendationDaka struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.banner_url);
            tTupleProtocol.writeString(struct.jump_url);
            tTupleProtocol.writeString(struct.user_type);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RecommendationDakaTupleSchemeFactory implements SchemeFactory {
        private RecommendationDakaTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public RecommendationDakaTupleScheme getScheme() {
            return new RecommendationDakaTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BANNER_URL(1, "banner_url"),
        JUMP_URL(2, md.j.f73126f),
        USER_TYPE(3, ma.b.f72954w);

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
                return BANNER_URL;
            }
            if (fieldId == 2) {
                return JUMP_URL;
            }
            if (fieldId != 3) {
                return null;
            }
            return USER_TYPE;
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
        hashMap.put(StandardScheme.class, new RecommendationDakaStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new RecommendationDakaTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BANNER_URL, (_Fields) new FieldMetaData("banner_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.JUMP_URL, (_Fields) new FieldMetaData(md.j.f73126f, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.USER_TYPE, (_Fields) new FieldMetaData(ma.b.f72954w, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(RecommendationDaka.class, unmodifiableMap);
    }

    public RecommendationDaka() {
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
        this.banner_url = null;
        this.jump_url = null;
        this.user_type = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof RecommendationDaka)) {
            return equals((RecommendationDaka) that);
        }
        return false;
    }

    public String getBanner_url() {
        return this.banner_url;
    }

    public String getJump_url() {
        return this.jump_url;
    }

    public String getUser_type() {
        return this.user_type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBanner_url() {
        return this.banner_url != null;
    }

    public boolean isSetJump_url() {
        return this.jump_url != null;
    }

    public boolean isSetUser_type() {
        return this.user_type != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public RecommendationDaka setBanner_url(String banner_url) {
        this.banner_url = banner_url;
        return this;
    }

    public void setBanner_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.banner_url = null;
    }

    public RecommendationDaka setJump_url(String jump_url) {
        this.jump_url = jump_url;
        return this;
    }

    public void setJump_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jump_url = null;
    }

    public RecommendationDaka setUser_type(String user_type) {
        this.user_type = user_type;
        return this;
    }

    public void setUser_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_type = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RecommendationDaka(");
        sb2.append("banner_url:");
        String str = this.banner_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("jump_url:");
        String str2 = this.jump_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("user_type:");
        String str3 = this.user_type;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBanner_url() {
        this.banner_url = null;
    }

    public void unsetJump_url() {
        this.jump_url = null;
    }

    public void unsetUser_type() {
        this.user_type = null;
    }

    public void validate() throws TException {
        if (this.banner_url == null) {
            throw new TProtocolException("Required field 'banner_url' was not present! Struct: " + toString());
        }
        if (this.jump_url == null) {
            throw new TProtocolException("Required field 'jump_url' was not present! Struct: " + toString());
        }
        if (this.user_type != null) {
            return;
        }
        throw new TProtocolException("Required field 'user_type' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public RecommendationDaka(String banner_url, String jump_url, String user_type) {
        this();
        this.banner_url = banner_url;
        this.jump_url = jump_url;
        this.user_type = user_type;
    }

    @Override // java.lang.Comparable
    public int compareTo(RecommendationDaka other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetBanner_url()).compareTo(Boolean.valueOf(other.isSetBanner_url()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetBanner_url() && (compareTo3 = TBaseHelper.compareTo(this.banner_url, other.banner_url)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetJump_url()).compareTo(Boolean.valueOf(other.isSetJump_url()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetJump_url() && (compareTo2 = TBaseHelper.compareTo(this.jump_url, other.jump_url)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetUser_type()).compareTo(Boolean.valueOf(other.isSetUser_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetUser_type() || (compareTo = TBaseHelper.compareTo(this.user_type, other.user_type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<RecommendationDaka, _Fields> deepCopy2() {
        return new RecommendationDaka(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBanner_url();
        }
        if (i11 == 2) {
            return getJump_url();
        }
        if (i11 == 3) {
            return getUser_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBanner_url();
        }
        if (i11 == 2) {
            return isSetJump_url();
        }
        if (i11 == 3) {
            return isSetUser_type();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$RecommendationDaka$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBanner_url();
                return;
            } else {
                setBanner_url((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetJump_url();
                return;
            } else {
                setJump_url((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetUser_type();
        } else {
            setUser_type((String) value);
        }
    }

    public boolean equals(RecommendationDaka that) {
        if (that == null) {
            return false;
        }
        boolean isSetBanner_url = isSetBanner_url();
        boolean isSetBanner_url2 = that.isSetBanner_url();
        if ((isSetBanner_url || isSetBanner_url2) && !(isSetBanner_url && isSetBanner_url2 && this.banner_url.equals(that.banner_url))) {
            return false;
        }
        boolean isSetJump_url = isSetJump_url();
        boolean isSetJump_url2 = that.isSetJump_url();
        if ((isSetJump_url || isSetJump_url2) && !(isSetJump_url && isSetJump_url2 && this.jump_url.equals(that.jump_url))) {
            return false;
        }
        boolean isSetUser_type = isSetUser_type();
        boolean isSetUser_type2 = that.isSetUser_type();
        if (isSetUser_type || isSetUser_type2) {
            return isSetUser_type && isSetUser_type2 && this.user_type.equals(that.user_type);
        }
        return true;
    }

    public RecommendationDaka(RecommendationDaka other) {
        if (other.isSetBanner_url()) {
            this.banner_url = other.banner_url;
        }
        if (other.isSetJump_url()) {
            this.jump_url = other.jump_url;
        }
        if (other.isSetUser_type()) {
            this.user_type = other.user_type;
        }
    }
}
