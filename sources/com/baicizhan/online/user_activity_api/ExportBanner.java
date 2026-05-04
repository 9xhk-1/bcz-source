package com.baicizhan.online.user_activity_api;

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
import md.j;
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
public class ExportBanner implements TBase<ExportBanner, _Fields>, Serializable, Cloneable, Comparable<ExportBanner> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String img_url;
    public String jump_url;
    private static final TStruct STRUCT_DESC = new TStruct("ExportBanner");
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 1);
    private static final TField JUMP_URL_FIELD_DESC = new TField(j.f73126f, (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_activity_api.ExportBanner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_activity_api$ExportBanner$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_activity_api$ExportBanner$_Fields = iArr;
            try {
                iArr[_Fields.IMG_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_activity_api$ExportBanner$_Fields[_Fields.JUMP_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportBannerStandardScheme extends StandardScheme<ExportBanner> {
        private ExportBannerStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExportBanner struct) throws TException {
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
                        struct.jump_url = iprot.readString();
                        struct.setJump_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.img_url = iprot.readString();
                    struct.setImg_urlIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExportBanner struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExportBanner.STRUCT_DESC);
            if (struct.img_url != null) {
                oprot.writeFieldBegin(ExportBanner.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.jump_url != null) {
                oprot.writeFieldBegin(ExportBanner.JUMP_URL_FIELD_DESC);
                oprot.writeString(struct.jump_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportBannerStandardSchemeFactory implements SchemeFactory {
        private ExportBannerStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportBannerStandardScheme getScheme() {
            return new ExportBannerStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportBannerTupleScheme extends TupleScheme<ExportBanner> {
        private ExportBannerTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExportBanner struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            struct.jump_url = tTupleProtocol.readString();
            struct.setJump_urlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExportBanner struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.img_url);
            tTupleProtocol.writeString(struct.jump_url);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExportBannerTupleSchemeFactory implements SchemeFactory {
        private ExportBannerTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExportBannerTupleScheme getScheme() {
            return new ExportBannerTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        IMG_URL(1, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        JUMP_URL(2, j.f73126f);

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
                return IMG_URL;
            }
            if (fieldId != 2) {
                return null;
            }
            return JUMP_URL;
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
        hashMap.put(StandardScheme.class, new ExportBannerStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExportBannerTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.JUMP_URL, (_Fields) new FieldMetaData(j.f73126f, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExportBanner.class, unmodifiableMap);
    }

    public ExportBanner() {
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
        this.img_url = null;
        this.jump_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExportBanner)) {
            return equals((ExportBanner) that);
        }
        return false;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getJump_url() {
        return this.jump_url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetJump_url() {
        return this.jump_url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExportBanner setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public ExportBanner setJump_url(String jump_url) {
        this.jump_url = jump_url;
        return this;
    }

    public void setJump_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jump_url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExportBanner(");
        sb2.append("img_url:");
        String str = this.img_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("jump_url:");
        String str2 = this.jump_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetJump_url() {
        this.jump_url = null;
    }

    public void validate() throws TException {
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        if (this.jump_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'jump_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public ExportBanner(String img_url, String jump_url) {
        this();
        this.img_url = img_url;
        this.jump_url = jump_url;
    }

    @Override // java.lang.Comparable
    public int compareTo(ExportBanner other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetImg_url() && (compareTo2 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetJump_url()).compareTo(Boolean.valueOf(other.isSetJump_url()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetJump_url() || (compareTo = TBaseHelper.compareTo(this.jump_url, other.jump_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExportBanner, _Fields> deepCopy2() {
        return new ExportBanner(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportBanner$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getImg_url();
        }
        if (i11 == 2) {
            return getJump_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportBanner$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetImg_url();
        }
        if (i11 == 2) {
            return isSetJump_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_activity_api$ExportBanner$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetImg_url();
                return;
            } else {
                setImg_url((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetJump_url();
        } else {
            setJump_url((String) value);
        }
    }

    public boolean equals(ExportBanner that) {
        if (that == null) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetJump_url = isSetJump_url();
        boolean isSetJump_url2 = that.isSetJump_url();
        if (isSetJump_url || isSetJump_url2) {
            return isSetJump_url && isSetJump_url2 && this.jump_url.equals(that.jump_url);
        }
        return true;
    }

    public ExportBanner(ExportBanner other) {
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetJump_url()) {
            this.jump_url = other.jump_url;
        }
    }
}
