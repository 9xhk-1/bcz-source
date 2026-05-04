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
public class MainViewTopBannerAdv implements TBase<MainViewTopBannerAdv, _Fields>, Serializable, Cloneable, Comparable<MainViewTopBannerAdv> {
    private static final int __END_TIME_ISSET_ID = 3;
    private static final int __IMG_TYPE_ISSET_ID = 1;
    private static final int __ISDARK_ISSET_ID = 0;
    private static final int __START_TIME_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String aid;
    public long end_time;

    /* renamed from: id, reason: collision with root package name */
    public String f28142id;
    public String img_gradient_color;
    public int img_type;
    public String img_url;
    public boolean isDark;
    public String link;
    private _Fields[] optionals;
    public long start_time;
    private static final TStruct STRUCT_DESC = new TStruct("MainViewTopBannerAdv");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 11, 1);
    private static final TField IS_DARK_FIELD_DESC = new TField("isDark", (byte) 2, 2);
    private static final TField IMG_URL_FIELD_DESC = new TField(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 11, 3);
    private static final TField IMG_GRADIENT_COLOR_FIELD_DESC = new TField("img_gradient_color", (byte) 11, 4);
    private static final TField IMG_TYPE_FIELD_DESC = new TField("img_type", (byte) 8, 5);
    private static final TField START_TIME_FIELD_DESC = new TField("start_time", (byte) 10, 6);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 7);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 8);
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.MainViewTopBannerAdv$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.IS_DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.IMG_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.IMG_GRADIENT_COLOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.IMG_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.START_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.END_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[_Fields.AID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewTopBannerAdvStandardScheme extends StandardScheme<MainViewTopBannerAdv> {
        private MainViewTopBannerAdvStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MainViewTopBannerAdv struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetIsDark()) {
                        throw new TProtocolException("Required field 'isDark' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetImg_type()) {
                        throw new TProtocolException("Required field 'img_type' was not found in serialized data! Struct: " + toString());
                    }
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.f28142id = iprot.readString();
                            struct.setIdIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.isDark = iprot.readBool();
                            struct.setIsDarkIsSet(true);
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_gradient_color = iprot.readString();
                            struct.setImg_gradient_colorIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.img_type = iprot.readI32();
                            struct.setImg_typeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.start_time = iprot.readI64();
                            struct.setStart_timeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.end_time = iprot.readI64();
                            struct.setEnd_timeIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.link = iprot.readString();
                            struct.setLinkIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.aid = iprot.readString();
                            struct.setAidIsSet(true);
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
        public void write(TProtocol oprot, MainViewTopBannerAdv struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MainViewTopBannerAdv.STRUCT_DESC);
            if (struct.f28142id != null) {
                oprot.writeFieldBegin(MainViewTopBannerAdv.ID_FIELD_DESC);
                oprot.writeString(struct.f28142id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(MainViewTopBannerAdv.IS_DARK_FIELD_DESC);
            oprot.writeBool(struct.isDark);
            oprot.writeFieldEnd();
            if (struct.img_url != null) {
                oprot.writeFieldBegin(MainViewTopBannerAdv.IMG_URL_FIELD_DESC);
                oprot.writeString(struct.img_url);
                oprot.writeFieldEnd();
            }
            if (struct.img_gradient_color != null) {
                oprot.writeFieldBegin(MainViewTopBannerAdv.IMG_GRADIENT_COLOR_FIELD_DESC);
                oprot.writeString(struct.img_gradient_color);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(MainViewTopBannerAdv.IMG_TYPE_FIELD_DESC);
            oprot.writeI32(struct.img_type);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MainViewTopBannerAdv.START_TIME_FIELD_DESC);
            oprot.writeI64(struct.start_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MainViewTopBannerAdv.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            if (struct.link != null && struct.isSetLink()) {
                oprot.writeFieldBegin(MainViewTopBannerAdv.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.aid != null && struct.isSetAid()) {
                oprot.writeFieldBegin(MainViewTopBannerAdv.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewTopBannerAdvStandardSchemeFactory implements SchemeFactory {
        private MainViewTopBannerAdvStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainViewTopBannerAdvStandardScheme getScheme() {
            return new MainViewTopBannerAdvStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewTopBannerAdvTupleScheme extends TupleScheme<MainViewTopBannerAdv> {
        private MainViewTopBannerAdvTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MainViewTopBannerAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28142id = tTupleProtocol.readString();
            struct.setIdIsSet(true);
            struct.isDark = tTupleProtocol.readBool();
            struct.setIsDarkIsSet(true);
            struct.img_url = tTupleProtocol.readString();
            struct.setImg_urlIsSet(true);
            struct.img_gradient_color = tTupleProtocol.readString();
            struct.setImg_gradient_colorIsSet(true);
            struct.img_type = tTupleProtocol.readI32();
            struct.setImg_typeIsSet(true);
            struct.start_time = tTupleProtocol.readI64();
            struct.setStart_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.link = tTupleProtocol.readString();
                struct.setLinkIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.aid = tTupleProtocol.readString();
                struct.setAidIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MainViewTopBannerAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.f28142id);
            tTupleProtocol.writeBool(struct.isDark);
            tTupleProtocol.writeString(struct.img_url);
            tTupleProtocol.writeString(struct.img_gradient_color);
            tTupleProtocol.writeI32(struct.img_type);
            tTupleProtocol.writeI64(struct.start_time);
            tTupleProtocol.writeI64(struct.end_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetLink()) {
                bitSet.set(0);
            }
            if (struct.isSetAid()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetLink()) {
                tTupleProtocol.writeString(struct.link);
            }
            if (struct.isSetAid()) {
                tTupleProtocol.writeString(struct.aid);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MainViewTopBannerAdvTupleSchemeFactory implements SchemeFactory {
        private MainViewTopBannerAdvTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MainViewTopBannerAdvTupleScheme getScheme() {
            return new MainViewTopBannerAdvTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        IS_DARK(2, "isDark"),
        IMG_URL(3, com.baicizhan.main.activity.schedule_v2.e.f19255e),
        IMG_GRADIENT_COLOR(4, "img_gradient_color"),
        IMG_TYPE(5, "img_type"),
        START_TIME(6, "start_time"),
        END_TIME(7, "end_time"),
        LINK(8, y9.b.f99687c),
        AID(9, "aid");

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
                    return ID;
                case 2:
                    return IS_DARK;
                case 3:
                    return IMG_URL;
                case 4:
                    return IMG_GRADIENT_COLOR;
                case 5:
                    return IMG_TYPE;
                case 6:
                    return START_TIME;
                case 7:
                    return END_TIME;
                case 8:
                    return LINK;
                case 9:
                    return AID;
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
        hashMap.put(StandardScheme.class, new MainViewTopBannerAdvStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MainViewTopBannerAdvTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IS_DARK, (_Fields) new FieldMetaData("isDark", (byte) 1, new FieldValueMetaData((byte) 2)));
        enumMap.put((EnumMap) _Fields.IMG_URL, (_Fields) new FieldMetaData(com.baicizhan.main.activity.schedule_v2.e.f19255e, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_GRADIENT_COLOR, (_Fields) new FieldMetaData("img_gradient_color", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG_TYPE, (_Fields) new FieldMetaData("img_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.START_TIME, (_Fields) new FieldMetaData("start_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MainViewTopBannerAdv.class, unmodifiableMap);
    }

    public MainViewTopBannerAdv() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK, _Fields.AID};
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
        this.f28142id = null;
        setIsDarkIsSet(false);
        this.isDark = false;
        this.img_url = null;
        this.img_gradient_color = null;
        setImg_typeIsSet(false);
        this.img_type = 0;
        setStart_timeIsSet(false);
        this.start_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        this.link = null;
        this.aid = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MainViewTopBannerAdv)) {
            return equals((MainViewTopBannerAdv) that);
        }
        return false;
    }

    public String getAid() {
        return this.aid;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getId() {
        return this.f28142id;
    }

    public String getImg_gradient_color() {
        return this.img_gradient_color;
    }

    public int getImg_type() {
        return this.img_type;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getLink() {
        return this.link;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIsDark() {
        return this.isDark;
    }

    public boolean isSetAid() {
        return this.aid != null;
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetId() {
        return this.f28142id != null;
    }

    public boolean isSetImg_gradient_color() {
        return this.img_gradient_color != null;
    }

    public boolean isSetImg_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetImg_url() {
        return this.img_url != null;
    }

    public boolean isSetIsDark() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetStart_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MainViewTopBannerAdv setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public MainViewTopBannerAdv setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public MainViewTopBannerAdv setId(String id2) {
        this.f28142id = id2;
        return this;
    }

    public void setIdIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28142id = null;
    }

    public MainViewTopBannerAdv setImg_gradient_color(String img_gradient_color) {
        this.img_gradient_color = img_gradient_color;
        return this;
    }

    public void setImg_gradient_colorIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_gradient_color = null;
    }

    public MainViewTopBannerAdv setImg_type(int img_type) {
        this.img_type = img_type;
        setImg_typeIsSet(true);
        return this;
    }

    public void setImg_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public MainViewTopBannerAdv setImg_url(String img_url) {
        this.img_url = img_url;
        return this;
    }

    public void setImg_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img_url = null;
    }

    public MainViewTopBannerAdv setIsDark(boolean isDark) {
        this.isDark = isDark;
        setIsDarkIsSet(true);
        return this;
    }

    public void setIsDarkIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public MainViewTopBannerAdv setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public MainViewTopBannerAdv setStart_time(long start_time) {
        this.start_time = start_time;
        setStart_timeIsSet(true);
        return this;
    }

    public void setStart_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MainViewTopBannerAdv(");
        sb2.append("id:");
        String str = this.f28142id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("isDark:");
        sb2.append(this.isDark);
        sb2.append(j2.O);
        sb2.append("img_url:");
        String str2 = this.img_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("img_gradient_color:");
        String str3 = this.img_gradient_color;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("img_type:");
        sb2.append(this.img_type);
        sb2.append(j2.O);
        sb2.append("start_time:");
        sb2.append(this.start_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        if (isSetLink()) {
            sb2.append(j2.O);
            sb2.append("link:");
            String str4 = this.link;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (isSetAid()) {
            sb2.append(j2.O);
            sb2.append("aid:");
            String str5 = this.aid;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetId() {
        this.f28142id = null;
    }

    public void unsetImg_gradient_color() {
        this.img_gradient_color = null;
    }

    public void unsetImg_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetImg_url() {
        this.img_url = null;
    }

    public void unsetIsDark() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetStart_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.f28142id == null) {
            throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
        }
        if (this.img_url == null) {
            throw new TProtocolException("Required field 'img_url' was not present! Struct: " + toString());
        }
        if (this.img_gradient_color != null) {
            return;
        }
        throw new TProtocolException("Required field 'img_gradient_color' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(MainViewTopBannerAdv other) {
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
        int compareTo10 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetId() && (compareTo9 = TBaseHelper.compareTo(this.f28142id, other.f28142id)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetIsDark()).compareTo(Boolean.valueOf(other.isSetIsDark()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetIsDark() && (compareTo8 = TBaseHelper.compareTo(this.isDark, other.isDark)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetImg_url()).compareTo(Boolean.valueOf(other.isSetImg_url()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetImg_url() && (compareTo7 = TBaseHelper.compareTo(this.img_url, other.img_url)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetImg_gradient_color()).compareTo(Boolean.valueOf(other.isSetImg_gradient_color()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetImg_gradient_color() && (compareTo6 = TBaseHelper.compareTo(this.img_gradient_color, other.img_gradient_color)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetImg_type()).compareTo(Boolean.valueOf(other.isSetImg_type()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetImg_type() && (compareTo5 = TBaseHelper.compareTo(this.img_type, other.img_type)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetStart_time()).compareTo(Boolean.valueOf(other.isSetStart_time()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetStart_time() && (compareTo4 = TBaseHelper.compareTo(this.start_time, other.start_time)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetEnd_time() && (compareTo3 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetLink() && (compareTo2 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetAid() || (compareTo = TBaseHelper.compareTo(this.aid, other.aid)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MainViewTopBannerAdv, _Fields> deepCopy2() {
        return new MainViewTopBannerAdv(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[field.ordinal()]) {
            case 1:
                return getId();
            case 2:
                return Boolean.valueOf(isIsDark());
            case 3:
                return getImg_url();
            case 4:
                return getImg_gradient_color();
            case 5:
                return Integer.valueOf(getImg_type());
            case 6:
                return Long.valueOf(getStart_time());
            case 7:
                return Long.valueOf(getEnd_time());
            case 8:
                return getLink();
            case 9:
                return getAid();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[field.ordinal()]) {
            case 1:
                return isSetId();
            case 2:
                return isSetIsDark();
            case 3:
                return isSetImg_url();
            case 4:
                return isSetImg_gradient_color();
            case 5:
                return isSetImg_type();
            case 6:
                return isSetStart_time();
            case 7:
                return isSetEnd_time();
            case 8:
                return isSetLink();
            case 9:
                return isSetAid();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MainViewTopBannerAdv$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setId((String) value);
                    break;
                } else {
                    unsetId();
                    break;
                }
            case 2:
                if (value != null) {
                    setIsDark(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIsDark();
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
                    setImg_gradient_color((String) value);
                    break;
                } else {
                    unsetImg_gradient_color();
                    break;
                }
            case 5:
                if (value != null) {
                    setImg_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetImg_type();
                    break;
                }
            case 6:
                if (value != null) {
                    setStart_time(((Long) value).longValue());
                    break;
                } else {
                    unsetStart_time();
                    break;
                }
            case 7:
                if (value != null) {
                    setEnd_time(((Long) value).longValue());
                    break;
                } else {
                    unsetEnd_time();
                    break;
                }
            case 8:
                if (value != null) {
                    setLink((String) value);
                    break;
                } else {
                    unsetLink();
                    break;
                }
            case 9:
                if (value != null) {
                    setAid((String) value);
                    break;
                } else {
                    unsetAid();
                    break;
                }
        }
    }

    public boolean equals(MainViewTopBannerAdv that) {
        if (that == null) {
            return false;
        }
        boolean isSetId = isSetId();
        boolean isSetId2 = that.isSetId();
        if (((isSetId || isSetId2) && !(isSetId && isSetId2 && this.f28142id.equals(that.f28142id))) || this.isDark != that.isDark) {
            return false;
        }
        boolean isSetImg_url = isSetImg_url();
        boolean isSetImg_url2 = that.isSetImg_url();
        if ((isSetImg_url || isSetImg_url2) && !(isSetImg_url && isSetImg_url2 && this.img_url.equals(that.img_url))) {
            return false;
        }
        boolean isSetImg_gradient_color = isSetImg_gradient_color();
        boolean isSetImg_gradient_color2 = that.isSetImg_gradient_color();
        if (((isSetImg_gradient_color || isSetImg_gradient_color2) && (!isSetImg_gradient_color || !isSetImg_gradient_color2 || !this.img_gradient_color.equals(that.img_gradient_color))) || this.img_type != that.img_type || this.start_time != that.start_time || this.end_time != that.end_time) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetAid = isSetAid();
        boolean isSetAid2 = that.isSetAid();
        if (isSetAid || isSetAid2) {
            return isSetAid && isSetAid2 && this.aid.equals(that.aid);
        }
        return true;
    }

    public MainViewTopBannerAdv(String id2, boolean isDark, String img_url, String img_gradient_color, int img_type, long start_time, long end_time) {
        this();
        this.f28142id = id2;
        this.isDark = isDark;
        setIsDarkIsSet(true);
        this.img_url = img_url;
        this.img_gradient_color = img_gradient_color;
        this.img_type = img_type;
        setImg_typeIsSet(true);
        this.start_time = start_time;
        setStart_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
    }

    public MainViewTopBannerAdv(MainViewTopBannerAdv other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK, _Fields.AID};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetId()) {
            this.f28142id = other.f28142id;
        }
        this.isDark = other.isDark;
        if (other.isSetImg_url()) {
            this.img_url = other.img_url;
        }
        if (other.isSetImg_gradient_color()) {
            this.img_gradient_color = other.img_gradient_color;
        }
        this.img_type = other.img_type;
        this.start_time = other.start_time;
        this.end_time = other.end_time;
        if (other.isSetLink()) {
            this.link = other.link;
        }
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
    }
}
