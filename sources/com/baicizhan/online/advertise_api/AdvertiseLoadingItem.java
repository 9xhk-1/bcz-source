package com.baicizhan.online.advertise_api;

import com.baicizhan.online.thrift.basic.AdvertiseRedirectInfo;
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
public class AdvertiseLoadingItem implements TBase<AdvertiseLoadingItem, _Fields>, Serializable, Cloneable, Comparable<AdvertiseLoadingItem> {
    private static final int __AD_ID_ISSET_ID = 0;
    private static final int __BTN_H_ISSET_ID = 5;
    private static final int __BTN_W_ISSET_ID = 4;
    private static final int __BTN_X_ISSET_ID = 2;
    private static final int __BTN_Y_ISSET_ID = 3;
    private static final int __SHOW_TIME_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int ad_id;
    public String ad_name;
    public double btn_h;
    public double btn_w;
    public double btn_x;
    public double btn_y;
    public String image_url;
    private _Fields[] optionals;
    public AdvertiseRedirectInfo redirect_info;
    public int show_time;
    private static final TStruct STRUCT_DESC = new TStruct("AdvertiseLoadingItem");
    private static final TField AD_ID_FIELD_DESC = new TField("ad_id", (byte) 8, 1);
    private static final TField AD_NAME_FIELD_DESC = new TField("ad_name", (byte) 11, 2);
    private static final TField IMAGE_URL_FIELD_DESC = new TField("image_url", (byte) 11, 3);
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 8, 4);
    private static final TField BTN_X_FIELD_DESC = new TField("btn_x", (byte) 4, 5);
    private static final TField BTN_Y_FIELD_DESC = new TField("btn_y", (byte) 4, 6);
    private static final TField BTN_W_FIELD_DESC = new TField("btn_w", (byte) 4, 7);
    private static final TField BTN_H_FIELD_DESC = new TField("btn_h", (byte) 4, 8);
    private static final TField REDIRECT_INFO_FIELD_DESC = new TField("redirect_info", (byte) 12, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.AdvertiseLoadingItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields = iArr;
            try {
                iArr[_Fields.AD_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.AD_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.IMAGE_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.SHOW_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.BTN_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.BTN_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.BTN_W.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.BTN_H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[_Fields.REDIRECT_INFO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingItemStandardScheme extends StandardScheme<AdvertiseLoadingItem> {
        private AdvertiseLoadingItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdvertiseLoadingItem struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetAd_id()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'ad_id' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ad_id = iprot.readI32();
                            struct.setAd_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.ad_name = iprot.readString();
                            struct.setAd_nameIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.image_url = iprot.readString();
                            struct.setImage_urlIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_time = iprot.readI32();
                            struct.setShow_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_x = iprot.readDouble();
                            struct.setBtn_xIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_y = iprot.readDouble();
                            struct.setBtn_yIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_w = iprot.readDouble();
                            struct.setBtn_wIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_h = iprot.readDouble();
                            struct.setBtn_hIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            AdvertiseRedirectInfo advertiseRedirectInfo = new AdvertiseRedirectInfo();
                            struct.redirect_info = advertiseRedirectInfo;
                            advertiseRedirectInfo.read(iprot);
                            struct.setRedirect_infoIsSet(true);
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
        public void write(TProtocol oprot, AdvertiseLoadingItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdvertiseLoadingItem.STRUCT_DESC);
            oprot.writeFieldBegin(AdvertiseLoadingItem.AD_ID_FIELD_DESC);
            oprot.writeI32(struct.ad_id);
            oprot.writeFieldEnd();
            if (struct.ad_name != null) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.AD_NAME_FIELD_DESC);
                oprot.writeString(struct.ad_name);
                oprot.writeFieldEnd();
            }
            if (struct.image_url != null && struct.isSetImage_url()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.IMAGE_URL_FIELD_DESC);
                oprot.writeString(struct.image_url);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_time()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.SHOW_TIME_FIELD_DESC);
                oprot.writeI32(struct.show_time);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_x()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.BTN_X_FIELD_DESC);
                oprot.writeDouble(struct.btn_x);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_y()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.BTN_Y_FIELD_DESC);
                oprot.writeDouble(struct.btn_y);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_w()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.BTN_W_FIELD_DESC);
                oprot.writeDouble(struct.btn_w);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_h()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.BTN_H_FIELD_DESC);
                oprot.writeDouble(struct.btn_h);
                oprot.writeFieldEnd();
            }
            if (struct.redirect_info != null && struct.isSetRedirect_info()) {
                oprot.writeFieldBegin(AdvertiseLoadingItem.REDIRECT_INFO_FIELD_DESC);
                struct.redirect_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingItemStandardSchemeFactory implements SchemeFactory {
        private AdvertiseLoadingItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertiseLoadingItemStandardScheme getScheme() {
            return new AdvertiseLoadingItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingItemTupleScheme extends TupleScheme<AdvertiseLoadingItem> {
        private AdvertiseLoadingItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdvertiseLoadingItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ad_id = tTupleProtocol.readI32();
            struct.setAd_idIsSet(true);
            struct.ad_name = tTupleProtocol.readString();
            struct.setAd_nameIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(7);
            if (readBitSet.get(0)) {
                struct.image_url = tTupleProtocol.readString();
                struct.setImage_urlIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.show_time = tTupleProtocol.readI32();
                struct.setShow_timeIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.btn_x = tTupleProtocol.readDouble();
                struct.setBtn_xIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.btn_y = tTupleProtocol.readDouble();
                struct.setBtn_yIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.btn_w = tTupleProtocol.readDouble();
                struct.setBtn_wIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.btn_h = tTupleProtocol.readDouble();
                struct.setBtn_hIsSet(true);
            }
            if (readBitSet.get(6)) {
                AdvertiseRedirectInfo advertiseRedirectInfo = new AdvertiseRedirectInfo();
                struct.redirect_info = advertiseRedirectInfo;
                advertiseRedirectInfo.read(tTupleProtocol);
                struct.setRedirect_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdvertiseLoadingItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ad_id);
            tTupleProtocol.writeString(struct.ad_name);
            BitSet bitSet = new BitSet();
            if (struct.isSetImage_url()) {
                bitSet.set(0);
            }
            if (struct.isSetShow_time()) {
                bitSet.set(1);
            }
            if (struct.isSetBtn_x()) {
                bitSet.set(2);
            }
            if (struct.isSetBtn_y()) {
                bitSet.set(3);
            }
            if (struct.isSetBtn_w()) {
                bitSet.set(4);
            }
            if (struct.isSetBtn_h()) {
                bitSet.set(5);
            }
            if (struct.isSetRedirect_info()) {
                bitSet.set(6);
            }
            tTupleProtocol.writeBitSet(bitSet, 7);
            if (struct.isSetImage_url()) {
                tTupleProtocol.writeString(struct.image_url);
            }
            if (struct.isSetShow_time()) {
                tTupleProtocol.writeI32(struct.show_time);
            }
            if (struct.isSetBtn_x()) {
                tTupleProtocol.writeDouble(struct.btn_x);
            }
            if (struct.isSetBtn_y()) {
                tTupleProtocol.writeDouble(struct.btn_y);
            }
            if (struct.isSetBtn_w()) {
                tTupleProtocol.writeDouble(struct.btn_w);
            }
            if (struct.isSetBtn_h()) {
                tTupleProtocol.writeDouble(struct.btn_h);
            }
            if (struct.isSetRedirect_info()) {
                struct.redirect_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseLoadingItemTupleSchemeFactory implements SchemeFactory {
        private AdvertiseLoadingItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertiseLoadingItemTupleScheme getScheme() {
            return new AdvertiseLoadingItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AD_ID(1, "ad_id"),
        AD_NAME(2, "ad_name"),
        IMAGE_URL(3, "image_url"),
        SHOW_TIME(4, "show_time"),
        BTN_X(5, "btn_x"),
        BTN_Y(6, "btn_y"),
        BTN_W(7, "btn_w"),
        BTN_H(8, "btn_h"),
        REDIRECT_INFO(9, "redirect_info");

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
                    return AD_ID;
                case 2:
                    return AD_NAME;
                case 3:
                    return IMAGE_URL;
                case 4:
                    return SHOW_TIME;
                case 5:
                    return BTN_X;
                case 6:
                    return BTN_Y;
                case 7:
                    return BTN_W;
                case 8:
                    return BTN_H;
                case 9:
                    return REDIRECT_INFO;
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
        hashMap.put(StandardScheme.class, new AdvertiseLoadingItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdvertiseLoadingItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AD_ID, (_Fields) new FieldMetaData("ad_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AD_NAME, (_Fields) new FieldMetaData("ad_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_URL, (_Fields) new FieldMetaData("image_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BTN_X, (_Fields) new FieldMetaData("btn_x", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_Y, (_Fields) new FieldMetaData("btn_y", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_W, (_Fields) new FieldMetaData("btn_w", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_H, (_Fields) new FieldMetaData("btn_h", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.REDIRECT_INFO, (_Fields) new FieldMetaData("redirect_info", (byte) 2, new StructMetaData((byte) 12, AdvertiseRedirectInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdvertiseLoadingItem.class, unmodifiableMap);
    }

    public AdvertiseLoadingItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMAGE_URL, _Fields.SHOW_TIME, _Fields.BTN_X, _Fields.BTN_Y, _Fields.BTN_W, _Fields.BTN_H, _Fields.REDIRECT_INFO};
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
        setAd_idIsSet(false);
        this.ad_id = 0;
        this.ad_name = null;
        this.image_url = null;
        setShow_timeIsSet(false);
        this.show_time = 0;
        setBtn_xIsSet(false);
        this.btn_x = 0.0d;
        setBtn_yIsSet(false);
        this.btn_y = 0.0d;
        setBtn_wIsSet(false);
        this.btn_w = 0.0d;
        setBtn_hIsSet(false);
        this.btn_h = 0.0d;
        this.redirect_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdvertiseLoadingItem)) {
            return equals((AdvertiseLoadingItem) that);
        }
        return false;
    }

    public int getAd_id() {
        return this.ad_id;
    }

    public String getAd_name() {
        return this.ad_name;
    }

    public double getBtn_h() {
        return this.btn_h;
    }

    public double getBtn_w() {
        return this.btn_w;
    }

    public double getBtn_x() {
        return this.btn_x;
    }

    public double getBtn_y() {
        return this.btn_y;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public AdvertiseRedirectInfo getRedirect_info() {
        return this.redirect_info;
    }

    public int getShow_time() {
        return this.show_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAd_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetAd_name() {
        return this.ad_name != null;
    }

    public boolean isSetBtn_h() {
        return EncodingUtils.testBit(this.__isset_bitfield, 5);
    }

    public boolean isSetBtn_w() {
        return EncodingUtils.testBit(this.__isset_bitfield, 4);
    }

    public boolean isSetBtn_x() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetBtn_y() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetImage_url() {
        return this.image_url != null;
    }

    public boolean isSetRedirect_info() {
        return this.redirect_info != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdvertiseLoadingItem setAd_id(int ad_id) {
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        return this;
    }

    public void setAd_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AdvertiseLoadingItem setAd_name(String ad_name) {
        this.ad_name = ad_name;
        return this;
    }

    public void setAd_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_name = null;
    }

    public AdvertiseLoadingItem setBtn_h(double btn_h) {
        this.btn_h = btn_h;
        setBtn_hIsSet(true);
        return this;
    }

    public void setBtn_hIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public AdvertiseLoadingItem setBtn_w(double btn_w) {
        this.btn_w = btn_w;
        setBtn_wIsSet(true);
        return this;
    }

    public void setBtn_wIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public AdvertiseLoadingItem setBtn_x(double btn_x) {
        this.btn_x = btn_x;
        setBtn_xIsSet(true);
        return this;
    }

    public void setBtn_xIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public AdvertiseLoadingItem setBtn_y(double btn_y) {
        this.btn_y = btn_y;
        setBtn_yIsSet(true);
        return this;
    }

    public void setBtn_yIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public AdvertiseLoadingItem setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public void setImage_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_url = null;
    }

    public AdvertiseLoadingItem setRedirect_info(AdvertiseRedirectInfo redirect_info) {
        this.redirect_info = redirect_info;
        return this;
    }

    public void setRedirect_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.redirect_info = null;
    }

    public AdvertiseLoadingItem setShow_time(int show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertiseLoadingItem(");
        sb2.append("ad_id:");
        sb2.append(this.ad_id);
        sb2.append(j2.O);
        sb2.append("ad_name:");
        String str = this.ad_name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetImage_url()) {
            sb2.append(j2.O);
            sb2.append("image_url:");
            String str2 = this.image_url;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetShow_time()) {
            sb2.append(j2.O);
            sb2.append("show_time:");
            sb2.append(this.show_time);
        }
        if (isSetBtn_x()) {
            sb2.append(j2.O);
            sb2.append("btn_x:");
            sb2.append(this.btn_x);
        }
        if (isSetBtn_y()) {
            sb2.append(j2.O);
            sb2.append("btn_y:");
            sb2.append(this.btn_y);
        }
        if (isSetBtn_w()) {
            sb2.append(j2.O);
            sb2.append("btn_w:");
            sb2.append(this.btn_w);
        }
        if (isSetBtn_h()) {
            sb2.append(j2.O);
            sb2.append("btn_h:");
            sb2.append(this.btn_h);
        }
        if (isSetRedirect_info()) {
            sb2.append(j2.O);
            sb2.append("redirect_info:");
            AdvertiseRedirectInfo advertiseRedirectInfo = this.redirect_info;
            if (advertiseRedirectInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(advertiseRedirectInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAd_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetAd_name() {
        this.ad_name = null;
    }

    public void unsetBtn_h() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 5);
    }

    public void unsetBtn_w() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 4);
    }

    public void unsetBtn_x() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetBtn_y() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetImage_url() {
        this.image_url = null;
    }

    public void unsetRedirect_info() {
        this.redirect_info = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.ad_name == null) {
            throw new TProtocolException("Required field 'ad_name' was not present! Struct: " + toString());
        }
        AdvertiseRedirectInfo advertiseRedirectInfo = this.redirect_info;
        if (advertiseRedirectInfo != null) {
            advertiseRedirectInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdvertiseLoadingItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo10 = Boolean.valueOf(isSetAd_id()).compareTo(Boolean.valueOf(other.isSetAd_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetAd_id() && (compareTo9 = TBaseHelper.compareTo(this.ad_id, other.ad_id)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetAd_name()).compareTo(Boolean.valueOf(other.isSetAd_name()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetAd_name() && (compareTo8 = TBaseHelper.compareTo(this.ad_name, other.ad_name)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetImage_url()).compareTo(Boolean.valueOf(other.isSetImage_url()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetImage_url() && (compareTo7 = TBaseHelper.compareTo(this.image_url, other.image_url)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetShow_time() && (compareTo6 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetBtn_x()).compareTo(Boolean.valueOf(other.isSetBtn_x()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetBtn_x() && (compareTo5 = TBaseHelper.compareTo(this.btn_x, other.btn_x)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetBtn_y()).compareTo(Boolean.valueOf(other.isSetBtn_y()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetBtn_y() && (compareTo4 = TBaseHelper.compareTo(this.btn_y, other.btn_y)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetBtn_w()).compareTo(Boolean.valueOf(other.isSetBtn_w()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetBtn_w() && (compareTo3 = TBaseHelper.compareTo(this.btn_w, other.btn_w)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetBtn_h()).compareTo(Boolean.valueOf(other.isSetBtn_h()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetBtn_h() && (compareTo2 = TBaseHelper.compareTo(this.btn_h, other.btn_h)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetRedirect_info()).compareTo(Boolean.valueOf(other.isSetRedirect_info()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetRedirect_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.redirect_info, (Comparable) other.redirect_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdvertiseLoadingItem, _Fields> deepCopy2() {
        return new AdvertiseLoadingItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getAd_id());
            case 2:
                return getAd_name();
            case 3:
                return getImage_url();
            case 4:
                return Integer.valueOf(getShow_time());
            case 5:
                return Double.valueOf(getBtn_x());
            case 6:
                return Double.valueOf(getBtn_y());
            case 7:
                return Double.valueOf(getBtn_w());
            case 8:
                return Double.valueOf(getBtn_h());
            case 9:
                return getRedirect_info();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetAd_id();
            case 2:
                return isSetAd_name();
            case 3:
                return isSetImage_url();
            case 4:
                return isSetShow_time();
            case 5:
                return isSetBtn_x();
            case 6:
                return isSetBtn_y();
            case 7:
                return isSetBtn_w();
            case 8:
                return isSetBtn_h();
            case 9:
                return isSetRedirect_info();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertiseLoadingItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAd_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetAd_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setAd_name((String) value);
                    break;
                } else {
                    unsetAd_name();
                    break;
                }
            case 3:
                if (value != null) {
                    setImage_url((String) value);
                    break;
                } else {
                    unsetImage_url();
                    break;
                }
            case 4:
                if (value != null) {
                    setShow_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setBtn_x(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_x();
                    break;
                }
            case 6:
                if (value != null) {
                    setBtn_y(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_y();
                    break;
                }
            case 7:
                if (value != null) {
                    setBtn_w(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_w();
                    break;
                }
            case 8:
                if (value != null) {
                    setBtn_h(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_h();
                    break;
                }
            case 9:
                if (value != null) {
                    setRedirect_info((AdvertiseRedirectInfo) value);
                    break;
                } else {
                    unsetRedirect_info();
                    break;
                }
        }
    }

    public boolean equals(AdvertiseLoadingItem that) {
        if (that == null || this.ad_id != that.ad_id) {
            return false;
        }
        boolean isSetAd_name = isSetAd_name();
        boolean isSetAd_name2 = that.isSetAd_name();
        if ((isSetAd_name || isSetAd_name2) && !(isSetAd_name && isSetAd_name2 && this.ad_name.equals(that.ad_name))) {
            return false;
        }
        boolean isSetImage_url = isSetImage_url();
        boolean isSetImage_url2 = that.isSetImage_url();
        if ((isSetImage_url || isSetImage_url2) && !(isSetImage_url && isSetImage_url2 && this.image_url.equals(that.image_url))) {
            return false;
        }
        boolean isSetShow_time = isSetShow_time();
        boolean isSetShow_time2 = that.isSetShow_time();
        if ((isSetShow_time || isSetShow_time2) && !(isSetShow_time && isSetShow_time2 && this.show_time == that.show_time)) {
            return false;
        }
        boolean isSetBtn_x = isSetBtn_x();
        boolean isSetBtn_x2 = that.isSetBtn_x();
        if ((isSetBtn_x || isSetBtn_x2) && !(isSetBtn_x && isSetBtn_x2 && this.btn_x == that.btn_x)) {
            return false;
        }
        boolean isSetBtn_y = isSetBtn_y();
        boolean isSetBtn_y2 = that.isSetBtn_y();
        if ((isSetBtn_y || isSetBtn_y2) && !(isSetBtn_y && isSetBtn_y2 && this.btn_y == that.btn_y)) {
            return false;
        }
        boolean isSetBtn_w = isSetBtn_w();
        boolean isSetBtn_w2 = that.isSetBtn_w();
        if ((isSetBtn_w || isSetBtn_w2) && !(isSetBtn_w && isSetBtn_w2 && this.btn_w == that.btn_w)) {
            return false;
        }
        boolean isSetBtn_h = isSetBtn_h();
        boolean isSetBtn_h2 = that.isSetBtn_h();
        if ((isSetBtn_h || isSetBtn_h2) && !(isSetBtn_h && isSetBtn_h2 && this.btn_h == that.btn_h)) {
            return false;
        }
        boolean isSetRedirect_info = isSetRedirect_info();
        boolean isSetRedirect_info2 = that.isSetRedirect_info();
        if (isSetRedirect_info || isSetRedirect_info2) {
            return isSetRedirect_info && isSetRedirect_info2 && this.redirect_info.equals(that.redirect_info);
        }
        return true;
    }

    public AdvertiseLoadingItem(int ad_id, String ad_name) {
        this();
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        this.ad_name = ad_name;
    }

    public AdvertiseLoadingItem(AdvertiseLoadingItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMAGE_URL, _Fields.SHOW_TIME, _Fields.BTN_X, _Fields.BTN_Y, _Fields.BTN_W, _Fields.BTN_H, _Fields.REDIRECT_INFO};
        this.__isset_bitfield = other.__isset_bitfield;
        this.ad_id = other.ad_id;
        if (other.isSetAd_name()) {
            this.ad_name = other.ad_name;
        }
        if (other.isSetImage_url()) {
            this.image_url = other.image_url;
        }
        this.show_time = other.show_time;
        this.btn_x = other.btn_x;
        this.btn_y = other.btn_y;
        this.btn_w = other.btn_w;
        this.btn_h = other.btn_h;
        if (other.isSetRedirect_info()) {
            this.redirect_info = new AdvertiseRedirectInfo(other.redirect_info);
        }
    }
}
