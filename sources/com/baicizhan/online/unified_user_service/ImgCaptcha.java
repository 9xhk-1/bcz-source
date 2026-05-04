package com.baicizhan.online.unified_user_service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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
public class ImgCaptcha implements TBase<ImgCaptcha, _Fields>, Serializable, Cloneable, Comparable<ImgCaptcha> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String captcha;
    public ByteBuffer image;
    public String trace_id;
    private static final TStruct STRUCT_DESC = new TStruct("ImgCaptcha");
    private static final TField IMAGE_FIELD_DESC = new TField("image", (byte) 11, 1);
    private static final TField TRACE_ID_FIELD_DESC = new TField("trace_id", (byte) 11, 2);
    private static final TField CAPTCHA_FIELD_DESC = new TField("captcha", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.ImgCaptcha$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields = iArr;
            try {
                iArr[_Fields.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields[_Fields.TRACE_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields[_Fields.CAPTCHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImgCaptchaStandardScheme extends StandardScheme<ImgCaptcha> {
        private ImgCaptchaStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ImgCaptcha struct) throws TException {
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
                            struct.captcha = iprot.readString();
                            struct.setCaptchaIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.trace_id = iprot.readString();
                        struct.setTrace_idIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.image = iprot.readBinary();
                    struct.setImageIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ImgCaptcha struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ImgCaptcha.STRUCT_DESC);
            if (struct.image != null) {
                oprot.writeFieldBegin(ImgCaptcha.IMAGE_FIELD_DESC);
                oprot.writeBinary(struct.image);
                oprot.writeFieldEnd();
            }
            if (struct.trace_id != null) {
                oprot.writeFieldBegin(ImgCaptcha.TRACE_ID_FIELD_DESC);
                oprot.writeString(struct.trace_id);
                oprot.writeFieldEnd();
            }
            if (struct.captcha != null) {
                oprot.writeFieldBegin(ImgCaptcha.CAPTCHA_FIELD_DESC);
                oprot.writeString(struct.captcha);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImgCaptchaStandardSchemeFactory implements SchemeFactory {
        private ImgCaptchaStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ImgCaptchaStandardScheme getScheme() {
            return new ImgCaptchaStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImgCaptchaTupleScheme extends TupleScheme<ImgCaptcha> {
        private ImgCaptchaTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ImgCaptcha struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.image = tTupleProtocol.readBinary();
            struct.setImageIsSet(true);
            struct.trace_id = tTupleProtocol.readString();
            struct.setTrace_idIsSet(true);
            struct.captcha = tTupleProtocol.readString();
            struct.setCaptchaIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ImgCaptcha struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeBinary(struct.image);
            tTupleProtocol.writeString(struct.trace_id);
            tTupleProtocol.writeString(struct.captcha);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ImgCaptchaTupleSchemeFactory implements SchemeFactory {
        private ImgCaptchaTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ImgCaptchaTupleScheme getScheme() {
            return new ImgCaptchaTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        IMAGE(1, "image"),
        TRACE_ID(2, "trace_id"),
        CAPTCHA(3, "captcha");

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
                return IMAGE;
            }
            if (fieldId == 2) {
                return TRACE_ID;
            }
            if (fieldId != 3) {
                return null;
            }
            return CAPTCHA;
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
        hashMap.put(StandardScheme.class, new ImgCaptchaStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ImgCaptchaTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.IMAGE, (_Fields) new FieldMetaData("image", (byte) 1, new FieldValueMetaData((byte) 11, true)));
        enumMap.put((EnumMap) _Fields.TRACE_ID, (_Fields) new FieldMetaData("trace_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CAPTCHA, (_Fields) new FieldMetaData("captcha", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ImgCaptcha.class, unmodifiableMap);
    }

    public ImgCaptcha() {
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

    public ByteBuffer bufferForImage() {
        return this.image;
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.image = null;
        this.trace_id = null;
        this.captcha = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ImgCaptcha)) {
            return equals((ImgCaptcha) that);
        }
        return false;
    }

    public String getCaptcha() {
        return this.captcha;
    }

    public byte[] getImage() {
        setImage(TBaseHelper.rightSize(this.image));
        ByteBuffer byteBuffer = this.image;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String getTrace_id() {
        return this.trace_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCaptcha() {
        return this.captcha != null;
    }

    public boolean isSetImage() {
        return this.image != null;
    }

    public boolean isSetTrace_id() {
        return this.trace_id != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ImgCaptcha setCaptcha(String captcha) {
        this.captcha = captcha;
        return this;
    }

    public void setCaptchaIsSet(boolean value) {
        if (value) {
            return;
        }
        this.captcha = null;
    }

    public ImgCaptcha setImage(byte[] image) {
        setImage(image == null ? null : ByteBuffer.wrap(image));
        return this;
    }

    public void setImageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image = null;
    }

    public ImgCaptcha setTrace_id(String trace_id) {
        this.trace_id = trace_id;
        return this;
    }

    public void setTrace_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.trace_id = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImgCaptcha(");
        sb2.append("image:");
        ByteBuffer byteBuffer = this.image;
        if (byteBuffer == null) {
            sb2.append("null");
        } else {
            TBaseHelper.toString(byteBuffer, sb2);
        }
        sb2.append(j2.O);
        sb2.append("trace_id:");
        String str = this.trace_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("captcha:");
        String str2 = this.captcha;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCaptcha() {
        this.captcha = null;
    }

    public void unsetImage() {
        this.image = null;
    }

    public void unsetTrace_id() {
        this.trace_id = null;
    }

    public void validate() throws TException {
        if (this.image == null) {
            throw new TProtocolException("Required field 'image' was not present! Struct: " + toString());
        }
        if (this.trace_id == null) {
            throw new TProtocolException("Required field 'trace_id' was not present! Struct: " + toString());
        }
        if (this.captcha != null) {
            return;
        }
        throw new TProtocolException("Required field 'captcha' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public ImgCaptcha(ByteBuffer image, String trace_id, String captcha) {
        this();
        this.image = image;
        this.trace_id = trace_id;
        this.captcha = captcha;
    }

    @Override // java.lang.Comparable
    public int compareTo(ImgCaptcha other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetImage()).compareTo(Boolean.valueOf(other.isSetImage()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetImage() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.image, (Comparable) other.image)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetTrace_id()).compareTo(Boolean.valueOf(other.isSetTrace_id()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTrace_id() && (compareTo2 = TBaseHelper.compareTo(this.trace_id, other.trace_id)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetCaptcha()).compareTo(Boolean.valueOf(other.isSetCaptcha()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetCaptcha() || (compareTo = TBaseHelper.compareTo(this.captcha, other.captcha)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ImgCaptcha, _Fields> deepCopy2() {
        return new ImgCaptcha(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getImage();
        }
        if (i11 == 2) {
            return getTrace_id();
        }
        if (i11 == 3) {
            return getCaptcha();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetImage();
        }
        if (i11 == 2) {
            return isSetTrace_id();
        }
        if (i11 == 3) {
            return isSetCaptcha();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$ImgCaptcha$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetImage();
                return;
            } else {
                setImage((ByteBuffer) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTrace_id();
                return;
            } else {
                setTrace_id((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetCaptcha();
        } else {
            setCaptcha((String) value);
        }
    }

    public ImgCaptcha setImage(ByteBuffer image) {
        this.image = image;
        return this;
    }

    public boolean equals(ImgCaptcha that) {
        if (that == null) {
            return false;
        }
        boolean isSetImage = isSetImage();
        boolean isSetImage2 = that.isSetImage();
        if ((isSetImage || isSetImage2) && !(isSetImage && isSetImage2 && this.image.equals(that.image))) {
            return false;
        }
        boolean isSetTrace_id = isSetTrace_id();
        boolean isSetTrace_id2 = that.isSetTrace_id();
        if ((isSetTrace_id || isSetTrace_id2) && !(isSetTrace_id && isSetTrace_id2 && this.trace_id.equals(that.trace_id))) {
            return false;
        }
        boolean isSetCaptcha = isSetCaptcha();
        boolean isSetCaptcha2 = that.isSetCaptcha();
        if (isSetCaptcha || isSetCaptcha2) {
            return isSetCaptcha && isSetCaptcha2 && this.captcha.equals(that.captcha);
        }
        return true;
    }

    public ImgCaptcha(ImgCaptcha other) {
        if (other.isSetImage()) {
            this.image = TBaseHelper.copyBinary(other.image);
        }
        if (other.isSetTrace_id()) {
            this.trace_id = other.trace_id;
        }
        if (other.isSetCaptcha()) {
            this.captcha = other.captcha;
        }
    }
}
