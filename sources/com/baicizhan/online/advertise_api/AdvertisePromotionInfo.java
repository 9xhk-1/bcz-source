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
public class AdvertisePromotionInfo implements TBase<AdvertisePromotionInfo, _Fields>, Serializable, Cloneable, Comparable<AdvertisePromotionInfo> {
    private static final int __BTN_H_ISSET_ID = 5;
    private static final int __BTN_W_ISSET_ID = 4;
    private static final int __BTN_X_ISSET_ID = 2;
    private static final int __BTN_Y_ISSET_ID = 3;
    private static final int __END_TIME_ISSET_ID = 1;
    private static final int __START_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public double btn_h;
    public double btn_w;
    public double btn_x;
    public double btn_y;
    public long end_time;
    public String img_url;
    private _Fields[] optionals;
    public AdvertiseRedirectInfo redirect_info;
    public long start_time;
    private static final TStruct STRUCT_DESC = new TStruct("AdvertisePromotionInfo");
    private static final TField START_TIME_FIELD_DESC = new TField("start_time", (byte) 10, 1);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 2);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 3);
    private static final TField REDIRECT_INFO_FIELD_DESC = new TField("redirect_info", (byte) 12, 4);
    private static final TField BTN_X_FIELD_DESC = new TField("btn_x", (byte) 4, 5);
    private static final TField BTN_Y_FIELD_DESC = new TField("btn_y", (byte) 4, 6);
    private static final TField BTN_W_FIELD_DESC = new TField("btn_w", (byte) 4, 7);
    private static final TField BTN_H_FIELD_DESC = new TField("btn_h", (byte) 4, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.AdvertisePromotionInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields = iArr;
            try {
                iArr[_Fields.START_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.END_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.IMG_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.REDIRECT_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.BTN_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.BTN_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.BTN_W.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[_Fields.BTN_H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertisePromotionInfoStandardScheme extends StandardScheme<AdvertisePromotionInfo> {
        private AdvertisePromotionInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdvertisePromotionInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetStart_time()) {
                        throw new TProtocolException("Required field 'start_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetEnd_time()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.start_time = iprot.readI64();
                            struct.setStart_timeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.end_time = iprot.readI64();
                            struct.setEnd_timeIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_url = iprot.readString();
                            struct.setImg_urlIsSet(true);
                            break;
                        }
                    case 4:
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
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdvertisePromotionInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdvertisePromotionInfo.STRUCT_DESC);
            oprot.writeFieldBegin(AdvertisePromotionInfo.START_TIME_FIELD_DESC);
            oprot.writeI64(struct.start_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(AdvertisePromotionInfo.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            if (struct.img_url != null) {
                oprot.writeFieldBegin(AdvertisePromotionInfo.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.redirect_info != null) {
                oprot.writeFieldBegin(AdvertisePromotionInfo.REDIRECT_INFO_FIELD_DESC);
                struct.redirect_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_x()) {
                oprot.writeFieldBegin(AdvertisePromotionInfo.BTN_X_FIELD_DESC);
                oprot.writeDouble(struct.btn_x);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_y()) {
                oprot.writeFieldBegin(AdvertisePromotionInfo.BTN_Y_FIELD_DESC);
                oprot.writeDouble(struct.btn_y);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_w()) {
                oprot.writeFieldBegin(AdvertisePromotionInfo.BTN_W_FIELD_DESC);
                oprot.writeDouble(struct.btn_w);
                oprot.writeFieldEnd();
            }
            if (struct.isSetBtn_h()) {
                oprot.writeFieldBegin(AdvertisePromotionInfo.BTN_H_FIELD_DESC);
                oprot.writeDouble(struct.btn_h);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertisePromotionInfoStandardSchemeFactory implements SchemeFactory {
        private AdvertisePromotionInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertisePromotionInfoStandardScheme getScheme() {
            return new AdvertisePromotionInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertisePromotionInfoTupleScheme extends TupleScheme<AdvertisePromotionInfo> {
        private AdvertisePromotionInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdvertisePromotionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.start_time = tTupleProtocol.readI64();
            struct.setStart_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            AdvertiseRedirectInfo advertiseRedirectInfo = new AdvertiseRedirectInfo();
            struct.redirect_info = advertiseRedirectInfo;
            advertiseRedirectInfo.read(tTupleProtocol);
            struct.setRedirect_infoIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                struct.btn_x = tTupleProtocol.readDouble();
                struct.setBtn_xIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.btn_y = tTupleProtocol.readDouble();
                struct.setBtn_yIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.btn_w = tTupleProtocol.readDouble();
                struct.setBtn_wIsSet(true);
            }
            if (readBitSet.get(3)) {
                struct.btn_h = tTupleProtocol.readDouble();
                struct.setBtn_hIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdvertisePromotionInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI64(struct.start_time);
            tTupleProtocol.writeI64(struct.end_time);
            tTupleProtocol.writeString(struct.img_url);
            struct.redirect_info.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetBtn_x()) {
                bitSet.set(0);
            }
            if (struct.isSetBtn_y()) {
                bitSet.set(1);
            }
            if (struct.isSetBtn_w()) {
                bitSet.set(2);
            }
            if (struct.isSetBtn_h()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
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
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertisePromotionInfoTupleSchemeFactory implements SchemeFactory {
        private AdvertisePromotionInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertisePromotionInfoTupleScheme getScheme() {
            return new AdvertisePromotionInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        START_TIME(1, "start_time"),
        END_TIME(2, "end_time"),
        IMG_URL(3, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        REDIRECT_INFO(4, "redirect_info"),
        BTN_X(5, "btn_x"),
        BTN_Y(6, "btn_y"),
        BTN_W(7, "btn_w"),
        BTN_H(8, "btn_h");

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
                    return START_TIME;
                case 2:
                    return END_TIME;
                case 3:
                    return IMG_URL;
                case 4:
                    return REDIRECT_INFO;
                case 5:
                    return BTN_X;
                case 6:
                    return BTN_Y;
                case 7:
                    return BTN_W;
                case 8:
                    return BTN_H;
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
        hashMap.put(StandardScheme.class, new AdvertisePromotionInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdvertisePromotionInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.START_TIME, (_Fields) new FieldMetaData("start_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.REDIRECT_INFO, (_Fields) new FieldMetaData("redirect_info", (byte) 1, new StructMetaData((byte) 12, AdvertiseRedirectInfo.class)));
        enumMap.put((EnumMap) _Fields.BTN_X, (_Fields) new FieldMetaData("btn_x", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_Y, (_Fields) new FieldMetaData("btn_y", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_W, (_Fields) new FieldMetaData("btn_w", (byte) 2, new FieldValueMetaData((byte) 4)));
        enumMap.put((EnumMap) _Fields.BTN_H, (_Fields) new FieldMetaData("btn_h", (byte) 2, new FieldValueMetaData((byte) 4)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdvertisePromotionInfo.class, unmodifiableMap);
    }

    public AdvertisePromotionInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BTN_X, _Fields.BTN_Y, _Fields.BTN_W, _Fields.BTN_H};
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
        setStart_timeIsSet(false);
        this.start_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        this.img_url = null;
        this.redirect_info = null;
        setBtn_xIsSet(false);
        this.btn_x = 0.0d;
        setBtn_yIsSet(false);
        this.btn_y = 0.0d;
        setBtn_wIsSet(false);
        this.btn_w = 0.0d;
        setBtn_hIsSet(false);
        this.btn_h = 0.0d;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdvertisePromotionInfo)) {
            return equals((AdvertisePromotionInfo) that);
        }
        return false;
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

    public long getEnd_time() {
        return this.end_time;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public AdvertiseRedirectInfo getRedirect_info() {
        return this.redirect_info;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return 0;
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

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetRedirect_info() {
        return this.redirect_info != null;
    }

    public boolean isSetStart_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdvertisePromotionInfo setBtn_h(double btn_h) {
        this.btn_h = btn_h;
        setBtn_hIsSet(true);
        return this;
    }

    public void setBtn_hIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 5, value);
    }

    public AdvertisePromotionInfo setBtn_w(double btn_w) {
        this.btn_w = btn_w;
        setBtn_wIsSet(true);
        return this;
    }

    public void setBtn_wIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 4, value);
    }

    public AdvertisePromotionInfo setBtn_x(double btn_x) {
        this.btn_x = btn_x;
        setBtn_xIsSet(true);
        return this;
    }

    public void setBtn_xIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public AdvertisePromotionInfo setBtn_y(double btn_y) {
        this.btn_y = btn_y;
        setBtn_yIsSet(true);
        return this;
    }

    public void setBtn_yIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public AdvertisePromotionInfo setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AdvertisePromotionInfo setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public AdvertisePromotionInfo setRedirect_info(AdvertiseRedirectInfo redirect_info) {
        this.redirect_info = redirect_info;
        return this;
    }

    public void setRedirect_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.redirect_info = null;
    }

    public AdvertisePromotionInfo setStart_time(long start_time) {
        this.start_time = start_time;
        setStart_timeIsSet(true);
        return this;
    }

    public void setStart_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertisePromotionInfo(");
        sb2.append("start_time:");
        sb2.append(this.start_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(j2.O);
        sb2.append("img_url:");
        String str = this.img_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("redirect_info:");
        AdvertiseRedirectInfo advertiseRedirectInfo = this.redirect_info;
        if (advertiseRedirectInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(advertiseRedirectInfo);
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
        sb2.append(pn.j.f81007d);
        return sb2.toString();
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

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetRedirect_info() {
        this.redirect_info = null;
    }

    public void unsetStart_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        AdvertiseRedirectInfo advertiseRedirectInfo = this.redirect_info;
        if (advertiseRedirectInfo != null) {
            if (advertiseRedirectInfo != null) {
                advertiseRedirectInfo.validate();
            }
        } else {
            throw new TProtocolException("Required field 'redirect_info' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdvertisePromotionInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        int compareTo8;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo9 = Boolean.valueOf(isSetStart_time()).compareTo(Boolean.valueOf(other.isSetStart_time()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetStart_time() && (compareTo8 = TBaseHelper.compareTo(this.start_time, other.start_time)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetEnd_time() && (compareTo7 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetImg_url() && (compareTo6 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetRedirect_info()).compareTo(Boolean.valueOf(other.isSetRedirect_info()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetRedirect_info() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.redirect_info, (Comparable) other.redirect_info)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetBtn_x()).compareTo(Boolean.valueOf(other.isSetBtn_x()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetBtn_x() && (compareTo4 = TBaseHelper.compareTo(this.btn_x, other.btn_x)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetBtn_y()).compareTo(Boolean.valueOf(other.isSetBtn_y()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetBtn_y() && (compareTo3 = TBaseHelper.compareTo(this.btn_y, other.btn_y)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetBtn_w()).compareTo(Boolean.valueOf(other.isSetBtn_w()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetBtn_w() && (compareTo2 = TBaseHelper.compareTo(this.btn_w, other.btn_w)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetBtn_h()).compareTo(Boolean.valueOf(other.isSetBtn_h()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetBtn_h() || (compareTo = TBaseHelper.compareTo(this.btn_h, other.btn_h)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdvertisePromotionInfo, _Fields> deepCopy2() {
        return new AdvertisePromotionInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[field.ordinal()]) {
            case 1:
                return Long.valueOf(getStart_time());
            case 2:
                return Long.valueOf(getEnd_time());
            case 3:
                return getImg_url();
            case 4:
                return getRedirect_info();
            case 5:
                return Double.valueOf(getBtn_x());
            case 6:
                return Double.valueOf(getBtn_y());
            case 7:
                return Double.valueOf(getBtn_w());
            case 8:
                return Double.valueOf(getBtn_h());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetStart_time();
            case 2:
                return isSetEnd_time();
            case 3:
                return isSetImg_url();
            case 4:
                return isSetRedirect_info();
            case 5:
                return isSetBtn_x();
            case 6:
                return isSetBtn_y();
            case 7:
                return isSetBtn_w();
            case 8:
                return isSetBtn_h();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdvertisePromotionInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setStart_time(((Long) value).longValue());
                    break;
                } else {
                    unsetStart_time();
                    break;
                }
            case 2:
                if (value != null) {
                    setEnd_time(((Long) value).longValue());
                    break;
                } else {
                    unsetEnd_time();
                    break;
                }
            case 3:
                if (value != null) {
                    setImg_url((String) value);
                    break;
                } else {
                    unsetImg_url();
                    break;
                }
            case 4:
                if (value != null) {
                    setRedirect_info((AdvertiseRedirectInfo) value);
                    break;
                } else {
                    unsetRedirect_info();
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
        }
    }

    public boolean equals(AdvertisePromotionInfo that) {
        if (that == null || this.start_time != that.start_time || this.end_time != that.end_time) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetRedirect_info = isSetRedirect_info();
        boolean isSetRedirect_info2 = that.isSetRedirect_info();
        if ((isSetRedirect_info || isSetRedirect_info2) && !(isSetRedirect_info && isSetRedirect_info2 && this.redirect_info.equals(that.redirect_info))) {
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
        if (isSetBtn_h || isSetBtn_h2) {
            return isSetBtn_h && isSetBtn_h2 && this.btn_h == that.btn_h;
        }
        return true;
    }

    public AdvertisePromotionInfo(long start_time, long end_time, String img_url, AdvertiseRedirectInfo redirect_info) {
        this();
        this.start_time = start_time;
        setStart_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        this.img_url = img_url;
        this.redirect_info = redirect_info;
    }

    public AdvertisePromotionInfo(AdvertisePromotionInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.BTN_X, _Fields.BTN_Y, _Fields.BTN_W, _Fields.BTN_H};
        this.__isset_bitfield = other.__isset_bitfield;
        this.start_time = other.start_time;
        this.end_time = other.end_time;
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetRedirect_info()) {
            this.redirect_info = new AdvertiseRedirectInfo(other.redirect_info);
        }
        this.btn_x = other.btn_x;
        this.btn_y = other.btn_y;
        this.btn_w = other.btn_w;
        this.btn_h = other.btn_h;
    }
}
