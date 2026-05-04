package com.baicizhan.online.course_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class DiscountCoupon implements TBase<DiscountCoupon, _Fields>, Serializable, Cloneable, Comparable<DiscountCoupon> {
    private static final int __SHOW_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String big_close_url;
    public String big_open_url;
    public int show_time;
    public String small_url;
    private static final TStruct STRUCT_DESC = new TStruct("DiscountCoupon");
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 8, 1);
    private static final TField BIG_CLOSE_URL_FIELD_DESC = new TField("big_close_url", (byte) 11, 2);
    private static final TField BIG_OPEN_URL_FIELD_DESC = new TField("big_open_url", (byte) 11, 3);
    private static final TField SMALL_URL_FIELD_DESC = new TField("small_url", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.DiscountCoupon$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields = iArr;
            try {
                iArr[_Fields.SHOW_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields[_Fields.BIG_CLOSE_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields[_Fields.BIG_OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields[_Fields.SMALL_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DiscountCouponStandardScheme extends StandardScheme<DiscountCoupon> {
        private DiscountCouponStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DiscountCoupon struct) throws TException {
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
                            } else if (b11 == 11) {
                                struct.small_url = iprot.readString();
                                struct.setSmall_urlIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.big_open_url = iprot.readString();
                            struct.setBig_open_urlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.big_close_url = iprot.readString();
                        struct.setBig_close_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.show_time = iprot.readI32();
                    struct.setShow_timeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetShow_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'show_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DiscountCoupon struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DiscountCoupon.STRUCT_DESC);
            oprot.writeFieldBegin(DiscountCoupon.SHOW_TIME_FIELD_DESC);
            oprot.writeI32(struct.show_time);
            oprot.writeFieldEnd();
            if (struct.big_close_url != null) {
                oprot.writeFieldBegin(DiscountCoupon.BIG_CLOSE_URL_FIELD_DESC);
                oprot.writeString(struct.big_close_url);
                oprot.writeFieldEnd();
            }
            if (struct.big_open_url != null) {
                oprot.writeFieldBegin(DiscountCoupon.BIG_OPEN_URL_FIELD_DESC);
                oprot.writeString(struct.big_open_url);
                oprot.writeFieldEnd();
            }
            if (struct.small_url != null) {
                oprot.writeFieldBegin(DiscountCoupon.SMALL_URL_FIELD_DESC);
                oprot.writeString(struct.small_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DiscountCouponStandardSchemeFactory implements SchemeFactory {
        private DiscountCouponStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DiscountCouponStandardScheme getScheme() {
            return new DiscountCouponStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DiscountCouponTupleScheme extends TupleScheme<DiscountCoupon> {
        private DiscountCouponTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DiscountCoupon struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.show_time = tTupleProtocol.readI32();
            struct.setShow_timeIsSet(true);
            struct.big_close_url = tTupleProtocol.readString();
            struct.setBig_close_urlIsSet(true);
            struct.big_open_url = tTupleProtocol.readString();
            struct.setBig_open_urlIsSet(true);
            struct.small_url = tTupleProtocol.readString();
            struct.setSmall_urlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DiscountCoupon struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.show_time);
            tTupleProtocol.writeString(struct.big_close_url);
            tTupleProtocol.writeString(struct.big_open_url);
            tTupleProtocol.writeString(struct.small_url);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DiscountCouponTupleSchemeFactory implements SchemeFactory {
        private DiscountCouponTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DiscountCouponTupleScheme getScheme() {
            return new DiscountCouponTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SHOW_TIME(1, "show_time"),
        BIG_CLOSE_URL(2, "big_close_url"),
        BIG_OPEN_URL(3, "big_open_url"),
        SMALL_URL(4, "small_url");

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
                return SHOW_TIME;
            }
            if (fieldId == 2) {
                return BIG_CLOSE_URL;
            }
            if (fieldId == 3) {
                return BIG_OPEN_URL;
            }
            if (fieldId != 4) {
                return null;
            }
            return SMALL_URL;
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
        hashMap.put(StandardScheme.class, new DiscountCouponStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DiscountCouponTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BIG_CLOSE_URL, (_Fields) new FieldMetaData("big_close_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.BIG_OPEN_URL, (_Fields) new FieldMetaData("big_open_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SMALL_URL, (_Fields) new FieldMetaData("small_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DiscountCoupon.class, unmodifiableMap);
    }

    public DiscountCoupon() {
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
        setShow_timeIsSet(false);
        this.show_time = 0;
        this.big_close_url = null;
        this.big_open_url = null;
        this.small_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DiscountCoupon)) {
            return equals((DiscountCoupon) that);
        }
        return false;
    }

    public String getBig_close_url() {
        return this.big_close_url;
    }

    public String getBig_open_url() {
        return this.big_open_url;
    }

    public int getShow_time() {
        return this.show_time;
    }

    public String getSmall_url() {
        return this.small_url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBig_close_url() {
        return this.big_close_url != null;
    }

    public boolean isSetBig_open_url() {
        return this.big_open_url != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetSmall_url() {
        return this.small_url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DiscountCoupon setBig_close_url(String big_close_url) {
        this.big_close_url = big_close_url;
        return this;
    }

    public void setBig_close_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.big_close_url = null;
    }

    public DiscountCoupon setBig_open_url(String big_open_url) {
        this.big_open_url = big_open_url;
        return this;
    }

    public void setBig_open_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.big_open_url = null;
    }

    public DiscountCoupon setShow_time(int show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public DiscountCoupon setSmall_url(String small_url) {
        this.small_url = small_url;
        return this;
    }

    public void setSmall_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.small_url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DiscountCoupon(");
        sb2.append("show_time:");
        sb2.append(this.show_time);
        sb2.append(j2.O);
        sb2.append("big_close_url:");
        String str = this.big_close_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("big_open_url:");
        String str2 = this.big_open_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("small_url:");
        String str3 = this.small_url;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBig_close_url() {
        this.big_close_url = null;
    }

    public void unsetBig_open_url() {
        this.big_open_url = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetSmall_url() {
        this.small_url = null;
    }

    public void validate() throws TException {
        if (this.big_close_url == null) {
            throw new TProtocolException("Required field 'big_close_url' was not present! Struct: " + toString());
        }
        if (this.big_open_url == null) {
            throw new TProtocolException("Required field 'big_open_url' was not present! Struct: " + toString());
        }
        if (this.small_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'small_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DiscountCoupon other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetShow_time() && (compareTo4 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetBig_close_url()).compareTo(Boolean.valueOf(other.isSetBig_close_url()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetBig_close_url() && (compareTo3 = TBaseHelper.compareTo(this.big_close_url, other.big_close_url)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetBig_open_url()).compareTo(Boolean.valueOf(other.isSetBig_open_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetBig_open_url() && (compareTo2 = TBaseHelper.compareTo(this.big_open_url, other.big_open_url)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetSmall_url()).compareTo(Boolean.valueOf(other.isSetSmall_url()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetSmall_url() || (compareTo = TBaseHelper.compareTo(this.small_url, other.small_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DiscountCoupon, _Fields> deepCopy2() {
        return new DiscountCoupon(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getShow_time());
        }
        if (i11 == 2) {
            return getBig_close_url();
        }
        if (i11 == 3) {
            return getBig_open_url();
        }
        if (i11 == 4) {
            return getSmall_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetShow_time();
        }
        if (i11 == 2) {
            return isSetBig_close_url();
        }
        if (i11 == 3) {
            return isSetBig_open_url();
        }
        if (i11 == 4) {
            return isSetSmall_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$DiscountCoupon$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetShow_time();
                return;
            } else {
                setShow_time(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetBig_close_url();
                return;
            } else {
                setBig_close_url((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetBig_open_url();
                return;
            } else {
                setBig_open_url((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetSmall_url();
        } else {
            setSmall_url((String) value);
        }
    }

    public DiscountCoupon(int show_time, String big_close_url, String big_open_url, String small_url) {
        this();
        this.show_time = show_time;
        setShow_timeIsSet(true);
        this.big_close_url = big_close_url;
        this.big_open_url = big_open_url;
        this.small_url = small_url;
    }

    public boolean equals(DiscountCoupon that) {
        if (that == null || this.show_time != that.show_time) {
            return false;
        }
        boolean isSetBig_close_url = isSetBig_close_url();
        boolean isSetBig_close_url2 = that.isSetBig_close_url();
        if ((isSetBig_close_url || isSetBig_close_url2) && !(isSetBig_close_url && isSetBig_close_url2 && this.big_close_url.equals(that.big_close_url))) {
            return false;
        }
        boolean isSetBig_open_url = isSetBig_open_url();
        boolean isSetBig_open_url2 = that.isSetBig_open_url();
        if ((isSetBig_open_url || isSetBig_open_url2) && !(isSetBig_open_url && isSetBig_open_url2 && this.big_open_url.equals(that.big_open_url))) {
            return false;
        }
        boolean isSetSmall_url = isSetSmall_url();
        boolean isSetSmall_url2 = that.isSetSmall_url();
        if (isSetSmall_url || isSetSmall_url2) {
            return isSetSmall_url && isSetSmall_url2 && this.small_url.equals(that.small_url);
        }
        return true;
    }

    public DiscountCoupon(DiscountCoupon other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.show_time = other.show_time;
        if (other.isSetBig_close_url()) {
            this.big_close_url = other.big_close_url;
        }
        if (other.isSetBig_open_url()) {
            this.big_open_url = other.big_open_url;
        }
        if (other.isSetSmall_url()) {
            this.small_url = other.small_url;
        }
    }
}
