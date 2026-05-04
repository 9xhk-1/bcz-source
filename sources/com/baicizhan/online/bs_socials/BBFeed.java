package com.baicizhan.online.bs_socials;

import com.tencent.open.SocialConstants;
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
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBFeed implements TBase<BBFeed, _Fields>, Serializable, Cloneable, Comparable<BBFeed> {
    private static final int __MARK_COLOR_ISSET_ID = 1;
    private static final int __TIMESTAMP_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String content;
    public String img;
    public long mark_color;
    public long timestamp;
    private static final TStruct STRUCT_DESC = new TStruct("BBFeed");
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 1);
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 2);
    private static final TField TIMESTAMP_FIELD_DESC = new TField(com.alipay.sdk.m.t.a.f11034k, (byte) 10, 3);
    private static final TField MARK_COLOR_FIELD_DESC = new TField("mark_color", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BBFeed$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields = iArr;
            try {
                iArr[_Fields.IMG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields[_Fields.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields[_Fields.TIMESTAMP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields[_Fields.MARK_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFeedStandardScheme extends StandardScheme<BBFeed> {
        private BBFeedStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBFeed struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 10) {
                                struct.mark_color = iprot.readI64();
                                struct.setMark_colorIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 10) {
                            struct.timestamp = iprot.readI64();
                            struct.setTimestampIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.content = iprot.readString();
                        struct.setContentIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.img = iprot.readString();
                    struct.setImgIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetTimestamp()) {
                throw new TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetMark_color()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'mark_color' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBFeed struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBFeed.STRUCT_DESC);
            if (struct.img != null) {
                oprot.writeFieldBegin(BBFeed.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            if (struct.content != null) {
                oprot.writeFieldBegin(BBFeed.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBFeed.TIMESTAMP_FIELD_DESC);
            oprot.writeI64(struct.timestamp);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BBFeed.MARK_COLOR_FIELD_DESC);
            oprot.writeI64(struct.mark_color);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFeedStandardSchemeFactory implements SchemeFactory {
        private BBFeedStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFeedStandardScheme getScheme() {
            return new BBFeedStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFeedTupleScheme extends TupleScheme<BBFeed> {
        private BBFeedTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBFeed struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            struct.timestamp = tTupleProtocol.readI64();
            struct.setTimestampIsSet(true);
            struct.mark_color = tTupleProtocol.readI64();
            struct.setMark_colorIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBFeed struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.img);
            tTupleProtocol.writeString(struct.content);
            tTupleProtocol.writeI64(struct.timestamp);
            tTupleProtocol.writeI64(struct.mark_color);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBFeedTupleSchemeFactory implements SchemeFactory {
        private BBFeedTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBFeedTupleScheme getScheme() {
            return new BBFeedTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        IMG(1, SocialConstants.PARAM_IMG_URL),
        CONTENT(2, "content"),
        TIMESTAMP(3, com.alipay.sdk.m.t.a.f11034k),
        MARK_COLOR(4, "mark_color");

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
                return IMG;
            }
            if (fieldId == 2) {
                return CONTENT;
            }
            if (fieldId == 3) {
                return TIMESTAMP;
            }
            if (fieldId != 4) {
                return null;
            }
            return MARK_COLOR;
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
        hashMap.put(StandardScheme.class, new BBFeedStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBFeedTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TIMESTAMP, (_Fields) new FieldMetaData(com.alipay.sdk.m.t.a.f11034k, (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.MARK_COLOR, (_Fields) new FieldMetaData("mark_color", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBFeed.class, unmodifiableMap);
    }

    public BBFeed() {
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
        this.img = null;
        this.content = null;
        setTimestampIsSet(false);
        this.timestamp = 0L;
        setMark_colorIsSet(false);
        this.mark_color = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBFeed)) {
            return equals((BBFeed) that);
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public String getImg() {
        return this.img;
    }

    public long getMark_color() {
        return this.mark_color;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetMark_color() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTimestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBFeed setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public BBFeed setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public BBFeed setMark_color(long mark_color) {
        this.mark_color = mark_color;
        setMark_colorIsSet(true);
        return this;
    }

    public void setMark_colorIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBFeed setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        setTimestampIsSet(true);
        return this;
    }

    public void setTimestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBFeed(");
        sb2.append("img:");
        String str = this.img;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("content:");
        String str2 = this.content;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("timestamp:");
        sb2.append(this.timestamp);
        sb2.append(j2.O);
        sb2.append("mark_color:");
        sb2.append(this.mark_color);
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetMark_color() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTimestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.img == null) {
            throw new TProtocolException("Required field 'img' was not present! Struct: " + toString());
        }
        if (this.content != null) {
            return;
        }
        throw new TProtocolException("Required field 'content' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBFeed other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetImg() && (compareTo4 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetContent() && (compareTo3 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetTimestamp()).compareTo(Boolean.valueOf(other.isSetTimestamp()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTimestamp() && (compareTo2 = TBaseHelper.compareTo(this.timestamp, other.timestamp)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetMark_color()).compareTo(Boolean.valueOf(other.isSetMark_color()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetMark_color() || (compareTo = TBaseHelper.compareTo(this.mark_color, other.mark_color)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBFeed, _Fields> deepCopy2() {
        return new BBFeed(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getImg();
        }
        if (i11 == 2) {
            return getContent();
        }
        if (i11 == 3) {
            return Long.valueOf(getTimestamp());
        }
        if (i11 == 4) {
            return Long.valueOf(getMark_color());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetImg();
        }
        if (i11 == 2) {
            return isSetContent();
        }
        if (i11 == 3) {
            return isSetTimestamp();
        }
        if (i11 == 4) {
            return isSetMark_color();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBFeed$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetImg();
                return;
            } else {
                setImg((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetContent();
                return;
            } else {
                setContent((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetTimestamp();
                return;
            } else {
                setTimestamp(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetMark_color();
        } else {
            setMark_color(((Long) value).longValue());
        }
    }

    public BBFeed(String img, String content, long timestamp, long mark_color) {
        this();
        this.img = img;
        this.content = content;
        this.timestamp = timestamp;
        setTimestampIsSet(true);
        this.mark_color = mark_color;
        setMark_colorIsSet(true);
    }

    public boolean equals(BBFeed that) {
        if (that == null) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if ((isSetImg || isSetImg2) && !(isSetImg && isSetImg2 && this.img.equals(that.img))) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        return (!(isSetContent || isSetContent2) || (isSetContent && isSetContent2 && this.content.equals(that.content))) && this.timestamp == that.timestamp && this.mark_color == that.mark_color;
    }

    public BBFeed(BBFeed other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetImg()) {
            this.img = other.img;
        }
        if (other.isSetContent()) {
            this.content = other.content;
        }
        this.timestamp = other.timestamp;
        this.mark_color = other.mark_color;
    }
}
