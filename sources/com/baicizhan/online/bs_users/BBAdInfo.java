package com.baicizhan.online.bs_users;

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
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBAdInfo implements TBase<BBAdInfo, _Fields>, Serializable, Cloneable, Comparable<BBAdInfo> {
    private static final int __AD_ID_ISSET_ID = 0;
    private static final int __BTN_H_ISSET_ID = 5;
    private static final int __BTN_W_ISSET_ID = 4;
    private static final int __BTN_X_ISSET_ID = 2;
    private static final int __BTN_Y_ISSET_ID = 3;
    private static final int __SHOW_TIME_ISSET_ID = 1;
    private static final int __TAOBAO_ITEM_ID_ISSET_ID = 6;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int ad_id;
    public String ad_name;
    public double btn_h;
    public double btn_w;
    public double btn_x;
    public double btn_y;
    public String click_url;
    public String image_url;
    private _Fields[] optionals;
    public int show_time;
    public long taobao_item_id;
    private static final TStruct STRUCT_DESC = new TStruct("BBAdInfo");
    private static final TField AD_ID_FIELD_DESC = new TField("ad_id", (byte) 8, 1);
    private static final TField AD_NAME_FIELD_DESC = new TField("ad_name", (byte) 11, 2);
    private static final TField IMAGE_URL_FIELD_DESC = new TField("image_url", (byte) 11, 3);
    private static final TField CLICK_URL_FIELD_DESC = new TField("click_url", (byte) 11, 4);
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 8, 5);
    private static final TField BTN_X_FIELD_DESC = new TField("btn_x", (byte) 4, 6);
    private static final TField BTN_Y_FIELD_DESC = new TField("btn_y", (byte) 4, 7);
    private static final TField BTN_W_FIELD_DESC = new TField("btn_w", (byte) 4, 8);
    private static final TField BTN_H_FIELD_DESC = new TField("btn_h", (byte) 4, 9);
    private static final TField TAOBAO_ITEM_ID_FIELD_DESC = new TField("taobao_item_id", (byte) 10, 10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_users.BBAdInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields = iArr;
            try {
                iArr[_Fields.AD_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.AD_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.IMAGE_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.CLICK_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.SHOW_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.BTN_X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.BTN_Y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.BTN_W.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.BTN_H.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[_Fields.TAOBAO_ITEM_ID.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAdInfoStandardScheme extends StandardScheme<BBAdInfo> {
        private BBAdInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBAdInfo struct) throws TException {
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.click_url = iprot.readString();
                            struct.setClick_urlIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.show_time = iprot.readI32();
                            struct.setShow_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_x = iprot.readDouble();
                            struct.setBtn_xIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_y = iprot.readDouble();
                            struct.setBtn_yIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_w = iprot.readDouble();
                            struct.setBtn_wIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 4) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.btn_h = iprot.readDouble();
                            struct.setBtn_hIsSet(true);
                            break;
                        }
                    case 10:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.taobao_item_id = iprot.readI64();
                            struct.setTaobao_item_idIsSet(true);
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
        public void write(TProtocol oprot, BBAdInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBAdInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BBAdInfo.AD_ID_FIELD_DESC);
            oprot.writeI32(struct.ad_id);
            oprot.writeFieldEnd();
            if (struct.ad_name != null) {
                oprot.writeFieldBegin(BBAdInfo.AD_NAME_FIELD_DESC);
                oprot.writeString(struct.ad_name);
                oprot.writeFieldEnd();
            }
            if (struct.image_url != null && struct.isSetImage_url()) {
                oprot.writeFieldBegin(BBAdInfo.IMAGE_URL_FIELD_DESC);
                oprot.writeString(struct.image_url);
                oprot.writeFieldEnd();
            }
            if (struct.click_url != null && struct.isSetClick_url()) {
                oprot.writeFieldBegin(BBAdInfo.CLICK_URL_FIELD_DESC);
                oprot.writeString(struct.click_url);
                oprot.writeFieldEnd();
            }
            if (struct.isSetShow_time()) {
                oprot.writeFieldBegin(BBAdInfo.SHOW_TIME_FIELD_DESC);
                oprot.writeI32(struct.show_time);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_x()) {
                oprot.writeFieldBegin(BBAdInfo.BTN_X_FIELD_DESC);
                oprot.writeDouble(struct.btn_x);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_y()) {
                oprot.writeFieldBegin(BBAdInfo.BTN_Y_FIELD_DESC);
                oprot.writeDouble(struct.btn_y);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_w()) {
                oprot.writeFieldBegin(BBAdInfo.BTN_W_FIELD_DESC);
                oprot.writeDouble(struct.btn_w);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_h()) {
                oprot.writeFieldBegin(BBAdInfo.BTN_H_FIELD_DESC);
                oprot.writeDouble(struct.btn_h);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTaobao_item_id()) {
                oprot.writeFieldBegin(BBAdInfo.TAOBAO_ITEM_ID_FIELD_DESC);
                oprot.writeI64(struct.taobao_item_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAdInfoStandardSchemeFactory implements SchemeFactory {
        private BBAdInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBAdInfoStandardScheme getScheme() {
            return new BBAdInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAdInfoTupleScheme extends TupleScheme<BBAdInfo> {
        private BBAdInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBAdInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.ad_id = tTupleProtocol.readI32();
            struct.setAd_idIsSet(true);
            struct.ad_name = tTupleProtocol.readString();
            struct.setAd_nameIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(8);
            if (readBitSet.get(0)) {
                struct.image_url = tTupleProtocol.readString();
                struct.setImage_urlIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.click_url = tTupleProtocol.readString();
                struct.setClick_urlIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.show_time = tTupleProtocol.readI32();
                struct.setShow_timeIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.btn_x = tTupleProtocol.readDouble();
                struct.setBtn_xIsSet(true);
            }
            if (readBitSet.get(4)) {
                struct.btn_y = tTupleProtocol.readDouble();
                struct.setBtn_yIsSet(true);
            }
            if (readBitSet.get(5)) {
                struct.btn_w = tTupleProtocol.readDouble();
                struct.setBtn_wIsSet(true);
            }
            if (readBitSet.get(6)) {
                struct.btn_h = tTupleProtocol.readDouble();
                struct.setBtn_hIsSet(true);
            }
            if (readBitSet.get(7)) {
                struct.taobao_item_id = tTupleProtocol.readI64();
                struct.setTaobao_item_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBAdInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.ad_id);
            tTupleProtocol.writeString(struct.ad_name);
            BitSet bitSet = new BitSet();
            if (struct.isSetImage_url()) {
                bitSet.set(0);
            }
            if (struct.isSetClick_url()) {
                bitSet.set(1);
            }
            if (struct.isSetShow_time()) {
                bitSet.set(2);
            }
            if (struct.isSetBtn_x()) {
                bitSet.set(3);
            }
            if (struct.isSetBtn_y()) {
                bitSet.set(4);
            }
            if (struct.isSetBtn_w()) {
                bitSet.set(5);
            }
            if (struct.isSetBtn_h()) {
                bitSet.set(6);
            }
            if (struct.isSetTaobao_item_id()) {
                bitSet.set(7);
            }
            tTupleProtocol.writeBitSet(bitSet, 8);
            if (struct.isSetImage_url()) {
                tTupleProtocol.writeString(struct.image_url);
            }
            if (struct.isSetClick_url()) {
                tTupleProtocol.writeString(struct.click_url);
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
            if (struct.isSetTaobao_item_id()) {
                tTupleProtocol.writeI64(struct.taobao_item_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBAdInfoTupleSchemeFactory implements SchemeFactory {
        private BBAdInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBAdInfoTupleScheme getScheme() {
            return new BBAdInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AD_ID(1, "ad_id"),
        AD_NAME(2, "ad_name"),
        IMAGE_URL(3, "image_url"),
        CLICK_URL(4, "click_url"),
        SHOW_TIME(5, "show_time"),
        BTN_X(6, "btn_x"),
        BTN_Y(7, "btn_y"),
        BTN_W(8, "btn_w"),
        BTN_H(9, "btn_h"),
        TAOBAO_ITEM_ID(10, "taobao_item_id");

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
                    return CLICK_URL;
                case 5:
                    return SHOW_TIME;
                case 6:
                    return BTN_X;
                case 7:
                    return BTN_Y;
                case 8:
                    return BTN_W;
                case 9:
                    return BTN_H;
                case 10:
                    return TAOBAO_ITEM_ID;
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
        hashMap.put(StandardScheme.class, new BBAdInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBAdInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AD_ID, (_Fields) new FieldMetaData("ad_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.AD_NAME, (_Fields) new FieldMetaData("ad_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_URL, (_Fields) new FieldMetaData("image_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.CLICK_URL, (_Fields) new FieldMetaData("click_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.BTN_X, (_Fields) new FieldMetaData("btn_x", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_Y, (_Fields) new FieldMetaData("btn_y", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_W, (_Fields) new FieldMetaData("btn_w", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_H, (_Fields) new FieldMetaData("btn_h", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.TAOBAO_ITEM_ID, (_Fields) new FieldMetaData("taobao_item_id", (byte) 2, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBAdInfo.class, unmodifiableMap);
    }

    public BBAdInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMAGE_URL, _Fields.CLICK_URL, _Fields.SHOW_TIME, _Fields.BTN_X, _Fields.BTN_Y, _Fields.BTN_W, _Fields.BTN_H, _Fields.TAOBAO_ITEM_ID};
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
        this.click_url = null;
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
        setTaobao_item_idIsSet(false);
        this.taobao_item_id = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBAdInfo)) {
            return equals((BBAdInfo) that);
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

    public String getClick_url() {
        return this.click_url;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public int getShow_time() {
        return this.show_time;
    }

    public long getTaobao_item_id() {
        return this.taobao_item_id;
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

    public boolean isSetClick_url() {
        return this.click_url != null;
    }

    public boolean isSetImage_url() {
        return this.image_url != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetTaobao_item_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 6);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBAdInfo setAd_id(int ad_id) {
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        return this;
    }

    public void setAd_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBAdInfo setAd_name(String ad_name) {
        this.ad_name = ad_name;
        return this;
    }

    public void setAd_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.ad_name = null;
    }

    public BBAdInfo setBtn_h(double btn_h) {
        this.btn_h = btn_h;
        setBtn_hIsSet(true);
        return this;
    }

    public void setBtn_hIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public BBAdInfo setBtn_w(double btn_w) {
        this.btn_w = btn_w;
        setBtn_wIsSet(true);
        return this;
    }

    public void setBtn_wIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public BBAdInfo setBtn_x(double btn_x) {
        this.btn_x = btn_x;
        setBtn_xIsSet(true);
        return this;
    }

    public void setBtn_xIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBAdInfo setBtn_y(double btn_y) {
        this.btn_y = btn_y;
        setBtn_yIsSet(true);
        return this;
    }

    public void setBtn_yIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public BBAdInfo setClick_url(String click_url) {
        this.click_url = click_url;
        return this;
    }

    public void setClick_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.click_url = null;
    }

    public BBAdInfo setImage_url(String image_url) {
        this.image_url = image_url;
        return this;
    }

    public void setImage_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image_url = null;
    }

    public BBAdInfo setShow_time(int show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BBAdInfo setTaobao_item_id(long taobao_item_id) {
        this.taobao_item_id = taobao_item_id;
        setTaobao_item_idIsSet(true);
        return this;
    }

    public void setTaobao_item_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 6, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBAdInfo(");
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
        if (isSetClick_url()) {
            sb2.append(j2.O);
            sb2.append("click_url:");
            String str3 = this.click_url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
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
        if (isSetTaobao_item_id()) {
            sb2.append(j2.O);
            sb2.append("taobao_item_id:");
            sb2.append(this.taobao_item_id);
        }
        sb2.append(j.f81007d);
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

    public void unsetClick_url() {
        this.click_url = null;
    }

    public void unsetImage_url() {
        this.image_url = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetTaobao_item_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 6);
    }

    public void validate() throws TException {
        if (this.ad_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'ad_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBAdInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        int compareTo9;
        int compareTo10;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo11 = Boolean.valueOf(isSetAd_id()).compareTo(Boolean.valueOf(other.isSetAd_id()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetAd_id() && (compareTo10 = TBaseHelper.compareTo(this.ad_id, other.ad_id)) != 0) {
            return compareTo10;
        }
        int compareTo12 = Boolean.valueOf(isSetAd_name()).compareTo(Boolean.valueOf(other.isSetAd_name()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetAd_name() && (compareTo9 = TBaseHelper.compareTo(this.ad_name, other.ad_name)) != 0) {
            return compareTo9;
        }
        int compareTo13 = Boolean.valueOf(isSetImage_url()).compareTo(Boolean.valueOf(other.isSetImage_url()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetImage_url() && (compareTo8 = TBaseHelper.compareTo(this.image_url, other.image_url)) != 0) {
            return compareTo8;
        }
        int compareTo14 = Boolean.valueOf(isSetClick_url()).compareTo(Boolean.valueOf(other.isSetClick_url()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetClick_url() && (compareTo7 = TBaseHelper.compareTo(this.click_url, other.click_url)) != 0) {
            return compareTo7;
        }
        int compareTo15 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetShow_time() && (compareTo6 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo6;
        }
        int compareTo16 = Boolean.valueOf(isSetBtn_x()).compareTo(Boolean.valueOf(other.isSetBtn_x()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetBtn_x() && (compareTo5 = TBaseHelper.compareTo(this.btn_x, other.btn_x)) != 0) {
            return compareTo5;
        }
        int compareTo17 = Boolean.valueOf(isSetBtn_y()).compareTo(Boolean.valueOf(other.isSetBtn_y()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetBtn_y() && (compareTo4 = TBaseHelper.compareTo(this.btn_y, other.btn_y)) != 0) {
            return compareTo4;
        }
        int compareTo18 = Boolean.valueOf(isSetBtn_w()).compareTo(Boolean.valueOf(other.isSetBtn_w()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (isSetBtn_w() && (compareTo3 = TBaseHelper.compareTo(this.btn_w, other.btn_w)) != 0) {
            return compareTo3;
        }
        int compareTo19 = Boolean.valueOf(isSetBtn_h()).compareTo(Boolean.valueOf(other.isSetBtn_h()));
        if (compareTo19 != 0) {
            return compareTo19;
        }
        if (isSetBtn_h() && (compareTo2 = TBaseHelper.compareTo(this.btn_h, other.btn_h)) != 0) {
            return compareTo2;
        }
        int compareTo20 = Boolean.valueOf(isSetTaobao_item_id()).compareTo(Boolean.valueOf(other.isSetTaobao_item_id()));
        if (compareTo20 != 0) {
            return compareTo20;
        }
        if (!isSetTaobao_item_id() || (compareTo = TBaseHelper.compareTo(this.taobao_item_id, other.taobao_item_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBAdInfo, _Fields> deepCopy2() {
        return new BBAdInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getAd_id());
            case 2:
                return getAd_name();
            case 3:
                return getImage_url();
            case 4:
                return getClick_url();
            case 5:
                return Integer.valueOf(getShow_time());
            case 6:
                return Double.valueOf(getBtn_x());
            case 7:
                return Double.valueOf(getBtn_y());
            case 8:
                return Double.valueOf(getBtn_w());
            case 9:
                return Double.valueOf(getBtn_h());
            case 10:
                return Long.valueOf(getTaobao_item_id());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetAd_id();
            case 2:
                return isSetAd_name();
            case 3:
                return isSetImage_url();
            case 4:
                return isSetClick_url();
            case 5:
                return isSetShow_time();
            case 6:
                return isSetBtn_x();
            case 7:
                return isSetBtn_y();
            case 8:
                return isSetBtn_w();
            case 9:
                return isSetBtn_h();
            case 10:
                return isSetTaobao_item_id();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_users$BBAdInfo$_Fields[field.ordinal()]) {
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
                    setClick_url((String) value);
                    break;
                } else {
                    unsetClick_url();
                    break;
                }
            case 5:
                if (value != null) {
                    setShow_time(((Integer) value).intValue());
                    break;
                } else {
                    unsetShow_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setBtn_x(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_x();
                    break;
                }
            case 7:
                if (value != null) {
                    setBtn_y(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_y();
                    break;
                }
            case 8:
                if (value != null) {
                    setBtn_w(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_w();
                    break;
                }
            case 9:
                if (value != null) {
                    setBtn_h(((Double) value).doubleValue());
                    break;
                } else {
                    unsetBtn_h();
                    break;
                }
            case 10:
                if (value != null) {
                    setTaobao_item_id(((Long) value).longValue());
                    break;
                } else {
                    unsetTaobao_item_id();
                    break;
                }
        }
    }

    public boolean equals(BBAdInfo that) {
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
        boolean isSetClick_url = isSetClick_url();
        boolean isSetClick_url2 = that.isSetClick_url();
        if ((isSetClick_url || isSetClick_url2) && !(isSetClick_url && isSetClick_url2 && this.click_url.equals(that.click_url))) {
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
        boolean isSetTaobao_item_id = isSetTaobao_item_id();
        boolean isSetTaobao_item_id2 = that.isSetTaobao_item_id();
        if (isSetTaobao_item_id || isSetTaobao_item_id2) {
            return isSetTaobao_item_id && isSetTaobao_item_id2 && this.taobao_item_id == that.taobao_item_id;
        }
        return true;
    }

    public BBAdInfo(int ad_id, String ad_name) {
        this();
        this.ad_id = ad_id;
        setAd_idIsSet(true);
        this.ad_name = ad_name;
    }

    public BBAdInfo(BBAdInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.IMAGE_URL, _Fields.CLICK_URL, _Fields.SHOW_TIME, _Fields.BTN_X, _Fields.BTN_Y, _Fields.BTN_W, _Fields.BTN_H, _Fields.TAOBAO_ITEM_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        this.ad_id = other.ad_id;
        if (other.isSetAd_name()) {
            this.ad_name = other.ad_name;
        }
        if (other.isSetImage_url()) {
            this.image_url = other.image_url;
        }
        if (other.isSetClick_url()) {
            this.click_url = other.click_url;
        }
        this.show_time = other.show_time;
        this.btn_x = other.btn_x;
        this.btn_y = other.btn_y;
        this.btn_w = other.btn_w;
        this.btn_h = other.btn_h;
        this.taobao_item_id = other.taobao_item_id;
    }
}
