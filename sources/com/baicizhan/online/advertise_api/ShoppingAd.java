package com.baicizhan.online.advertise_api;

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
public class ShoppingAd implements TBase<ShoppingAd, _Fields>, Serializable, Cloneable, Comparable<ShoppingAd> {
    private static final int __CLICK_TYPE_ISSET_ID = 0;
    private static final int __IS_NEW_MALL_ISSET_ID = 2;
    private static final int __TIMESTAMP_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String ad_url;
    public int click_type;
    public String color;
    public int is_new_mall;
    public String left_menu_ad_url;
    private _Fields[] optionals;
    public String text;
    public int timestamp;
    private static final TStruct STRUCT_DESC = new TStruct("ShoppingAd");
    private static final TField AD_URL_FIELD_DESC = new TField("ad_url", (byte) 11, 1);
    private static final TField CLICK_TYPE_FIELD_DESC = new TField("click_type", (byte) 8, 2);
    private static final TField TEXT_FIELD_DESC = new TField("text", (byte) 11, 3);
    private static final TField COLOR_FIELD_DESC = new TField("color", (byte) 11, 4);
    private static final TField LEFT_MENU_AD_URL_FIELD_DESC = new TField("left_menu_ad_url", (byte) 11, 5);
    private static final TField TIMESTAMP_FIELD_DESC = new TField(com.alipay.sdk.m.t.a.f11034k, (byte) 8, 6);
    private static final TField IS_NEW_MALL_FIELD_DESC = new TField("is_new_mall", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.ShoppingAd$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields = iArr;
            try {
                iArr[_Fields.AD_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[_Fields.CLICK_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[_Fields.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[_Fields.COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[_Fields.LEFT_MENU_AD_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[_Fields.TIMESTAMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[_Fields.IS_NEW_MALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingAdStandardScheme extends StandardScheme<ShoppingAd> {
        private ShoppingAdStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ShoppingAd struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetClick_type()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'click_type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ad_url = iprot.readString();
                            struct.setAd_urlIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.click_type = iprot.readI32();
                            struct.setClick_typeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.text = iprot.readString();
                            struct.setTextIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.color = iprot.readString();
                            struct.setColorIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.left_menu_ad_url = iprot.readString();
                            struct.setLeft_menu_ad_urlIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.timestamp = iprot.readI32();
                            struct.setTimestampIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.is_new_mall = iprot.readI32();
                            struct.setIs_new_mallIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ShoppingAd struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ShoppingAd.STRUCT_DESC);
            if (struct.ad_url != null) {
                oprot.writeFieldBegin(ShoppingAd.AD_URL_FIELD_DESC);
                oprot.writeString(struct.ad_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ShoppingAd.CLICK_TYPE_FIELD_DESC);
            oprot.writeI32(struct.click_type);
            oprot.writeFieldEnd();
            if (struct.text != null) {
                oprot.writeFieldBegin(ShoppingAd.TEXT_FIELD_DESC);
                oprot.writeString(struct.text);
                oprot.writeFieldEnd();
            }
            if (struct.color != null) {
                oprot.writeFieldBegin(ShoppingAd.COLOR_FIELD_DESC);
                oprot.writeString(struct.color);
                oprot.writeFieldEnd();
            }
            if (struct.left_menu_ad_url != null && struct.isSetLeft_menu_ad_url()) {
                oprot.writeFieldBegin(ShoppingAd.LEFT_MENU_AD_URL_FIELD_DESC);
                oprot.writeString(struct.left_menu_ad_url);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTimestamp()) {
                oprot.writeFieldBegin(ShoppingAd.TIMESTAMP_FIELD_DESC);
                oprot.writeI32(struct.timestamp);
                oprot.writeFieldEnd();
            }
            if (struct.isSetIs_new_mall()) {
                oprot.writeFieldBegin(ShoppingAd.IS_NEW_MALL_FIELD_DESC);
                oprot.writeI32(struct.is_new_mall);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingAdStandardSchemeFactory implements SchemeFactory {
        private ShoppingAdStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShoppingAdStandardScheme getScheme() {
            return new ShoppingAdStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingAdTupleScheme extends TupleScheme<ShoppingAd> {
        private ShoppingAdTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ShoppingAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ad_url = tTupleProtocol.readString();
            struct.setAd_urlIsSet(true);
            struct.click_type = tTupleProtocol.readI32();
            struct.setClick_typeIsSet(true);
            struct.text = tTupleProtocol.readString();
            struct.setTextIsSet(true);
            struct.color = tTupleProtocol.readString();
            struct.setColorIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.left_menu_ad_url = tTupleProtocol.readString();
                struct.setLeft_menu_ad_urlIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.timestamp = tTupleProtocol.readI32();
                struct.setTimestampIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.is_new_mall = tTupleProtocol.readI32();
                struct.setIs_new_mallIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ShoppingAd struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.ad_url);
            tTupleProtocol.writeI32(struct.click_type);
            tTupleProtocol.writeString(struct.text);
            tTupleProtocol.writeString(struct.color);
            BitSet bitSet = new BitSet();
            if (struct.isSetLeft_menu_ad_url()) {
                bitSet.set(0);
            }
            if (struct.isSetTimestamp()) {
                bitSet.set(1);
            }
            if (struct.isSetIs_new_mall()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetLeft_menu_ad_url()) {
                tTupleProtocol.writeString(struct.left_menu_ad_url);
            }
            if (struct.isSetTimestamp()) {
                tTupleProtocol.writeI32(struct.timestamp);
            }
            if (struct.isSetIs_new_mall()) {
                tTupleProtocol.writeI32(struct.is_new_mall);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingAdTupleSchemeFactory implements SchemeFactory {
        private ShoppingAdTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShoppingAdTupleScheme getScheme() {
            return new ShoppingAdTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AD_URL(1, "ad_url"),
        CLICK_TYPE(2, "click_type"),
        TEXT(3, "text"),
        COLOR(4, "color"),
        LEFT_MENU_AD_URL(5, "left_menu_ad_url"),
        TIMESTAMP(6, com.alipay.sdk.m.t.a.f11034k),
        IS_NEW_MALL(7, "is_new_mall");

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
            switch (fieldId) {
                case 1:
                    return AD_URL;
                case 2:
                    return CLICK_TYPE;
                case 3:
                    return TEXT;
                case 4:
                    return COLOR;
                case 5:
                    return LEFT_MENU_AD_URL;
                case 6:
                    return TIMESTAMP;
                case 7:
                    return IS_NEW_MALL;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new ShoppingAdStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ShoppingAdTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AD_URL, (_Fields) new FieldMetaData("ad_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CLICK_TYPE, (_Fields) new FieldMetaData("click_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TEXT, (_Fields) new FieldMetaData("text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.COLOR, (_Fields) new FieldMetaData("color", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LEFT_MENU_AD_URL, (_Fields) new FieldMetaData("left_menu_ad_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TIMESTAMP, (_Fields) new FieldMetaData(com.alipay.sdk.m.t.a.f11034k, (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.IS_NEW_MALL, (_Fields) new FieldMetaData("is_new_mall", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ShoppingAd.class, unmodifiableMap);
    }

    public ShoppingAd() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LEFT_MENU_AD_URL, _Fields.TIMESTAMP, _Fields.IS_NEW_MALL};
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
        this.ad_url = null;
        setClick_typeIsSet(false);
        this.click_type = 0;
        this.text = null;
        this.color = null;
        this.left_menu_ad_url = null;
        setTimestampIsSet(false);
        this.timestamp = 0;
        setIs_new_mallIsSet(false);
        this.is_new_mall = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ShoppingAd)) {
            return equals((ShoppingAd) that);
        }
        return false;
    }

    public String getAd_url() {
        return this.ad_url;
    }

    public int getClick_type() {
        return this.click_type;
    }

    public String getColor() {
        return this.color;
    }

    public int getIs_new_mall() {
        return this.is_new_mall;
    }

    public String getLeft_menu_ad_url() {
        return this.left_menu_ad_url;
    }

    public String getText() {
        return this.text;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_url() {
        return this.ad_url != null;
    }

    public boolean isSetClick_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetColor() {
        return this.color != null;
    }

    public boolean isSetIs_new_mall() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLeft_menu_ad_url() {
        return this.left_menu_ad_url != null;
    }

    public boolean isSetText() {
        return this.text != null;
    }

    public boolean isSetTimestamp() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ShoppingAd setAd_url(String ad_url) {
        this.ad_url = ad_url;
        return this;
    }

    public void setAd_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_url = null;
    }

    public ShoppingAd setClick_type(int click_type) {
        this.click_type = click_type;
        setClick_typeIsSet(true);
        return this;
    }

    public void setClick_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ShoppingAd setColor(String color) {
        this.color = color;
        return this;
    }

    public void setColorIsSet(boolean value) {
        if (value) {
            return;
        }
        this.color = null;
    }

    public ShoppingAd setIs_new_mall(int is_new_mall) {
        this.is_new_mall = is_new_mall;
        setIs_new_mallIsSet(true);
        return this;
    }

    public void setIs_new_mallIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ShoppingAd setLeft_menu_ad_url(String left_menu_ad_url) {
        this.left_menu_ad_url = left_menu_ad_url;
        return this;
    }

    public void setLeft_menu_ad_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.left_menu_ad_url = null;
    }

    public ShoppingAd setText(String text) {
        this.text = text;
        return this;
    }

    public void setTextIsSet(boolean value) {
        if (value) {
            return;
        }
        this.text = null;
    }

    public ShoppingAd setTimestamp(int timestamp) {
        this.timestamp = timestamp;
        setTimestampIsSet(true);
        return this;
    }

    public void setTimestampIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShoppingAd(");
        sb2.append("ad_url:");
        String str = this.ad_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("click_type:");
        sb2.append(this.click_type);
        sb2.append(j2.O);
        sb2.append("text:");
        String str2 = this.text;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("color:");
        String str3 = this.color;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        if (isSetLeft_menu_ad_url()) {
            sb2.append(j2.O);
            sb2.append("left_menu_ad_url:");
            String str4 = this.left_menu_ad_url;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetTimestamp()) {
            sb2.append(j2.O);
            sb2.append("timestamp:");
            sb2.append(this.timestamp);
        }
        if (isSetIs_new_mall()) {
            sb2.append(j2.O);
            sb2.append("is_new_mall:");
            sb2.append(this.is_new_mall);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_url() {
        this.ad_url = null;
    }

    public void unsetClick_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetColor() {
        this.color = null;
    }

    public void unsetIs_new_mall() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLeft_menu_ad_url() {
        this.left_menu_ad_url = null;
    }

    public void unsetText() {
        this.text = null;
    }

    public void unsetTimestamp() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.ad_url == null) {
            throw new TProtocolException("Required field 'ad_url' was not present! Struct: " + toString());
        }
        if (this.text == null) {
            throw new TProtocolException("Required field 'text' was not present! Struct: " + toString());
        }
        if (this.color != null) {
            return;
        }
        throw new TProtocolException("Required field 'color' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ShoppingAd other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetAd_url()).compareTo(Boolean.valueOf(other.isSetAd_url()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetAd_url() && (compareTo7 = TBaseHelper.compareTo(this.ad_url, other.ad_url)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetClick_type()).compareTo(Boolean.valueOf(other.isSetClick_type()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetClick_type() && (compareTo6 = TBaseHelper.compareTo(this.click_type, other.click_type)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetText()).compareTo(Boolean.valueOf(other.isSetText()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetText() && (compareTo5 = TBaseHelper.compareTo(this.text, other.text)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetColor()).compareTo(Boolean.valueOf(other.isSetColor()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetColor() && (compareTo4 = TBaseHelper.compareTo(this.color, other.color)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetLeft_menu_ad_url()).compareTo(Boolean.valueOf(other.isSetLeft_menu_ad_url()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetLeft_menu_ad_url() && (compareTo3 = TBaseHelper.compareTo(this.left_menu_ad_url, other.left_menu_ad_url)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetTimestamp()).compareTo(Boolean.valueOf(other.isSetTimestamp()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetTimestamp() && (compareTo2 = TBaseHelper.compareTo(this.timestamp, other.timestamp)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetIs_new_mall()).compareTo(Boolean.valueOf(other.isSetIs_new_mall()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetIs_new_mall() || (compareTo = TBaseHelper.compareTo(this.is_new_mall, other.is_new_mall)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ShoppingAd, _Fields> deepCopy2() {
        return new ShoppingAd(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[field.ordinal()]) {
            case 1:
                return getAd_url();
            case 2:
                return Integer.valueOf(getClick_type());
            case 3:
                return getText();
            case 4:
                return getColor();
            case 5:
                return getLeft_menu_ad_url();
            case 6:
                return Integer.valueOf(getTimestamp());
            case 7:
                return Integer.valueOf(getIs_new_mall());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[field.ordinal()]) {
            case 1:
                return isSetAd_url();
            case 2:
                return isSetClick_type();
            case 3:
                return isSetText();
            case 4:
                return isSetColor();
            case 5:
                return isSetLeft_menu_ad_url();
            case 6:
                return isSetTimestamp();
            case 7:
                return isSetIs_new_mall();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ShoppingAd$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAd_url((String) value);
                    break;
                } else {
                    unsetAd_url();
                    break;
                }
            case 2:
                if (value != null) {
                    setClick_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetClick_type();
                    break;
                }
            case 3:
                if (value != null) {
                    setText((String) value);
                    break;
                } else {
                    unsetText();
                    break;
                }
            case 4:
                if (value != null) {
                    setColor((String) value);
                    break;
                } else {
                    unsetColor();
                    break;
                }
            case 5:
                if (value != null) {
                    setLeft_menu_ad_url((String) value);
                    break;
                } else {
                    unsetLeft_menu_ad_url();
                    break;
                }
            case 6:
                if (value != null) {
                    setTimestamp(((Integer) value).intValue());
                    break;
                } else {
                    unsetTimestamp();
                    break;
                }
            case 7:
                if (value != null) {
                    setIs_new_mall(((Integer) value).intValue());
                    break;
                } else {
                    unsetIs_new_mall();
                    break;
                }
        }
    }

    public boolean equals(ShoppingAd that) {
        if (that == null) {
            return false;
        }
        boolean isSetAd_url = isSetAd_url();
        boolean isSetAd_url2 = that.isSetAd_url();
        if (((isSetAd_url || isSetAd_url2) && !(isSetAd_url && isSetAd_url2 && this.ad_url.equals(that.ad_url))) || this.click_type != that.click_type) {
            return false;
        }
        boolean isSetText = isSetText();
        boolean isSetText2 = that.isSetText();
        if ((isSetText || isSetText2) && !(isSetText && isSetText2 && this.text.equals(that.text))) {
            return false;
        }
        boolean isSetColor = isSetColor();
        boolean isSetColor2 = that.isSetColor();
        if ((isSetColor || isSetColor2) && !(isSetColor && isSetColor2 && this.color.equals(that.color))) {
            return false;
        }
        boolean isSetLeft_menu_ad_url = isSetLeft_menu_ad_url();
        boolean isSetLeft_menu_ad_url2 = that.isSetLeft_menu_ad_url();
        if ((isSetLeft_menu_ad_url || isSetLeft_menu_ad_url2) && !(isSetLeft_menu_ad_url && isSetLeft_menu_ad_url2 && this.left_menu_ad_url.equals(that.left_menu_ad_url))) {
            return false;
        }
        boolean isSetTimestamp = isSetTimestamp();
        boolean isSetTimestamp2 = that.isSetTimestamp();
        if ((isSetTimestamp || isSetTimestamp2) && !(isSetTimestamp && isSetTimestamp2 && this.timestamp == that.timestamp)) {
            return false;
        }
        boolean isSetIs_new_mall = isSetIs_new_mall();
        boolean isSetIs_new_mall2 = that.isSetIs_new_mall();
        if (isSetIs_new_mall || isSetIs_new_mall2) {
            return isSetIs_new_mall && isSetIs_new_mall2 && this.is_new_mall == that.is_new_mall;
        }
        return true;
    }

    public ShoppingAd(String ad_url, int click_type, String text, String color) {
        this();
        this.ad_url = ad_url;
        this.click_type = click_type;
        setClick_typeIsSet(true);
        this.text = text;
        this.color = color;
    }

    public ShoppingAd(ShoppingAd other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LEFT_MENU_AD_URL, _Fields.TIMESTAMP, _Fields.IS_NEW_MALL};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAd_url()) {
            this.ad_url = other.ad_url;
        }
        this.click_type = other.click_type;
        if (other.isSetText()) {
            this.text = other.text;
        }
        if (other.isSetColor()) {
            this.color = other.color;
        }
        if (other.isSetLeft_menu_ad_url()) {
            this.left_menu_ad_url = other.left_menu_ad_url;
        }
        this.timestamp = other.timestamp;
        this.is_new_mall = other.is_new_mall;
    }
}
