package com.baicizhan.online.advertise_api;

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
public class ShoppingImgInfo implements TBase<ShoppingImgInfo, _Fields>, Serializable, Cloneable, Comparable<ShoppingImgInfo> {
    private static final int __END_TIME_ISSET_ID = 1;
    private static final int __ISTAOBAO_ISSET_ID = 2;
    private static final int __START_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long end_time;
    public String icon_default;
    public String icon_press;
    public boolean isTaobao;
    public String jump_url;
    public long start_time;
    private static final TStruct STRUCT_DESC = new TStruct("ShoppingImgInfo");
    private static final TField JUMP_URL_FIELD_DESC = new TField(md.j.f73126f, (byte) 11, 1);
    private static final TField ICON_DEFAULT_FIELD_DESC = new TField("icon_default", (byte) 11, 2);
    private static final TField ICON_PRESS_FIELD_DESC = new TField("icon_press", (byte) 11, 3);
    private static final TField START_TIME_FIELD_DESC = new TField("start_time", (byte) 10, 4);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 5);
    private static final TField IS_TAOBAO_FIELD_DESC = new TField("isTaobao", (byte) 2, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.ShoppingImgInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields = iArr;
            try {
                iArr[_Fields.JUMP_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[_Fields.ICON_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[_Fields.ICON_PRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[_Fields.START_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[_Fields.END_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[_Fields.IS_TAOBAO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingImgInfoStandardScheme extends StandardScheme<ShoppingImgInfo> {
        private ShoppingImgInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ShoppingImgInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetStart_time()) {
                        throw new TProtocolException("Required field 'start_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetEnd_time()) {
                        throw new TProtocolException("Required field 'end_time' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetIsTaobao()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'isTaobao' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.jump_url = iprot.readString();
                            struct.setJump_urlIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.icon_default = iprot.readString();
                            struct.setIcon_defaultIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.icon_press = iprot.readString();
                            struct.setIcon_pressIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.start_time = iprot.readI64();
                            struct.setStart_timeIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.end_time = iprot.readI64();
                            struct.setEnd_timeIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.isTaobao = iprot.readBool();
                            struct.setIsTaobaoIsSet(true);
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
        public void write(TProtocol oprot, ShoppingImgInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ShoppingImgInfo.STRUCT_DESC);
            if (struct.jump_url != null) {
                oprot.writeFieldBegin(ShoppingImgInfo.JUMP_URL_FIELD_DESC);
                oprot.writeString(struct.jump_url);
                oprot.writeFieldEnd();
            }
            if (struct.icon_default != null) {
                oprot.writeFieldBegin(ShoppingImgInfo.ICON_DEFAULT_FIELD_DESC);
                oprot.writeString(struct.icon_default);
                oprot.writeFieldEnd();
            }
            if (struct.icon_press != null) {
                oprot.writeFieldBegin(ShoppingImgInfo.ICON_PRESS_FIELD_DESC);
                oprot.writeString(struct.icon_press);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ShoppingImgInfo.START_TIME_FIELD_DESC);
            oprot.writeI64(struct.start_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ShoppingImgInfo.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(ShoppingImgInfo.IS_TAOBAO_FIELD_DESC);
            oprot.writeBool(struct.isTaobao);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingImgInfoStandardSchemeFactory implements SchemeFactory {
        private ShoppingImgInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShoppingImgInfoStandardScheme getScheme() {
            return new ShoppingImgInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingImgInfoTupleScheme extends TupleScheme<ShoppingImgInfo> {
        private ShoppingImgInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ShoppingImgInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.jump_url = tTupleProtocol.readString();
            struct.setJump_urlIsSet(true);
            struct.icon_default = tTupleProtocol.readString();
            struct.setIcon_defaultIsSet(true);
            struct.icon_press = tTupleProtocol.readString();
            struct.setIcon_pressIsSet(true);
            struct.start_time = tTupleProtocol.readI64();
            struct.setStart_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            struct.isTaobao = tTupleProtocol.readBool();
            struct.setIsTaobaoIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ShoppingImgInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.jump_url);
            tTupleProtocol.writeString(struct.icon_default);
            tTupleProtocol.writeString(struct.icon_press);
            tTupleProtocol.writeI64(struct.start_time);
            tTupleProtocol.writeI64(struct.end_time);
            tTupleProtocol.writeBool(struct.isTaobao);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShoppingImgInfoTupleSchemeFactory implements SchemeFactory {
        private ShoppingImgInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ShoppingImgInfoTupleScheme getScheme() {
            return new ShoppingImgInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        JUMP_URL(1, md.j.f73126f),
        ICON_DEFAULT(2, "icon_default"),
        ICON_PRESS(3, "icon_press"),
        START_TIME(4, "start_time"),
        END_TIME(5, "end_time"),
        IS_TAOBAO(6, "isTaobao");

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
                    return JUMP_URL;
                case 2:
                    return ICON_DEFAULT;
                case 3:
                    return ICON_PRESS;
                case 4:
                    return START_TIME;
                case 5:
                    return END_TIME;
                case 6:
                    return IS_TAOBAO;
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
        hashMap.put(StandardScheme.class, new ShoppingImgInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ShoppingImgInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.JUMP_URL, (_Fields) new FieldMetaData(md.j.f73126f, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON_DEFAULT, (_Fields) new FieldMetaData("icon_default", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON_PRESS, (_Fields) new FieldMetaData("icon_press", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.START_TIME, (_Fields) new FieldMetaData("start_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.IS_TAOBAO, (_Fields) new FieldMetaData("isTaobao", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ShoppingImgInfo.class, unmodifiableMap);
    }

    public ShoppingImgInfo() {
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
        this.jump_url = null;
        this.icon_default = null;
        this.icon_press = null;
        setStart_timeIsSet(false);
        this.start_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        setIsTaobaoIsSet(false);
        this.isTaobao = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ShoppingImgInfo)) {
            return equals((ShoppingImgInfo) that);
        }
        return false;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getIcon_default() {
        return this.icon_default;
    }

    public String getIcon_press() {
        return this.icon_press;
    }

    public String getJump_url() {
        return this.jump_url;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isIsTaobao() {
        return this.isTaobao;
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIcon_default() {
        return this.icon_default != null;
    }

    public boolean isSetIcon_press() {
        return this.icon_press != null;
    }

    public boolean isSetIsTaobao() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetJump_url() {
        return this.jump_url != null;
    }

    public boolean isSetStart_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ShoppingImgInfo setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ShoppingImgInfo setIcon_default(String icon_default) {
        this.icon_default = icon_default;
        return this;
    }

    public void setIcon_defaultIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon_default = null;
    }

    public ShoppingImgInfo setIcon_press(String icon_press) {
        this.icon_press = icon_press;
        return this;
    }

    public void setIcon_pressIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon_press = null;
    }

    public ShoppingImgInfo setIsTaobao(boolean isTaobao) {
        this.isTaobao = isTaobao;
        setIsTaobaoIsSet(true);
        return this;
    }

    public void setIsTaobaoIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ShoppingImgInfo setJump_url(String jump_url) {
        this.jump_url = jump_url;
        return this;
    }

    public void setJump_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jump_url = null;
    }

    public ShoppingImgInfo setStart_time(long start_time) {
        this.start_time = start_time;
        setStart_timeIsSet(true);
        return this;
    }

    public void setStart_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShoppingImgInfo(");
        sb2.append("jump_url:");
        String str = this.jump_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("icon_default:");
        String str2 = this.icon_default;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("icon_press:");
        String str3 = this.icon_press;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("start_time:");
        sb2.append(this.start_time);
        sb2.append(j2.O);
        sb2.append("end_time:");
        sb2.append(this.end_time);
        sb2.append(j2.O);
        sb2.append("isTaobao:");
        sb2.append(this.isTaobao);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIcon_default() {
        this.icon_default = null;
    }

    public void unsetIcon_press() {
        this.icon_press = null;
    }

    public void unsetIsTaobao() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetJump_url() {
        this.jump_url = null;
    }

    public void unsetStart_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.jump_url == null) {
            throw new TProtocolException("Required field 'jump_url' was not present! Struct: " + toString());
        }
        if (this.icon_default == null) {
            throw new TProtocolException("Required field 'icon_default' was not present! Struct: " + toString());
        }
        if (this.icon_press != null) {
            return;
        }
        throw new TProtocolException("Required field 'icon_press' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ShoppingImgInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetJump_url()).compareTo(Boolean.valueOf(other.isSetJump_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetJump_url() && (compareTo6 = TBaseHelper.compareTo(this.jump_url, other.jump_url)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetIcon_default()).compareTo(Boolean.valueOf(other.isSetIcon_default()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetIcon_default() && (compareTo5 = TBaseHelper.compareTo(this.icon_default, other.icon_default)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetIcon_press()).compareTo(Boolean.valueOf(other.isSetIcon_press()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetIcon_press() && (compareTo4 = TBaseHelper.compareTo(this.icon_press, other.icon_press)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetStart_time()).compareTo(Boolean.valueOf(other.isSetStart_time()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetStart_time() && (compareTo3 = TBaseHelper.compareTo(this.start_time, other.start_time)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetEnd_time()).compareTo(Boolean.valueOf(other.isSetEnd_time()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetEnd_time() && (compareTo2 = TBaseHelper.compareTo(this.end_time, other.end_time)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetIsTaobao()).compareTo(Boolean.valueOf(other.isSetIsTaobao()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetIsTaobao() || (compareTo = TBaseHelper.compareTo(this.isTaobao, other.isTaobao)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ShoppingImgInfo, _Fields> deepCopy2() {
        return new ShoppingImgInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[field.ordinal()]) {
            case 1:
                return getJump_url();
            case 2:
                return getIcon_default();
            case 3:
                return getIcon_press();
            case 4:
                return Long.valueOf(getStart_time());
            case 5:
                return Long.valueOf(getEnd_time());
            case 6:
                return Boolean.valueOf(isIsTaobao());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetJump_url();
            case 2:
                return isSetIcon_default();
            case 3:
                return isSetIcon_press();
            case 4:
                return isSetStart_time();
            case 5:
                return isSetEnd_time();
            case 6:
                return isSetIsTaobao();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ShoppingImgInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setJump_url((String) value);
                    break;
                } else {
                    unsetJump_url();
                    break;
                }
            case 2:
                if (value != null) {
                    setIcon_default((String) value);
                    break;
                } else {
                    unsetIcon_default();
                    break;
                }
            case 3:
                if (value != null) {
                    setIcon_press((String) value);
                    break;
                } else {
                    unsetIcon_press();
                    break;
                }
            case 4:
                if (value != null) {
                    setStart_time(((Long) value).longValue());
                    break;
                } else {
                    unsetStart_time();
                    break;
                }
            case 5:
                if (value != null) {
                    setEnd_time(((Long) value).longValue());
                    break;
                } else {
                    unsetEnd_time();
                    break;
                }
            case 6:
                if (value != null) {
                    setIsTaobao(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetIsTaobao();
                    break;
                }
        }
    }

    public ShoppingImgInfo(String jump_url, String icon_default, String icon_press, long start_time, long end_time, boolean isTaobao) {
        this();
        this.jump_url = jump_url;
        this.icon_default = icon_default;
        this.icon_press = icon_press;
        this.start_time = start_time;
        setStart_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        this.isTaobao = isTaobao;
        setIsTaobaoIsSet(true);
    }

    public boolean equals(ShoppingImgInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetJump_url = isSetJump_url();
        boolean isSetJump_url2 = that.isSetJump_url();
        if ((isSetJump_url || isSetJump_url2) && !(isSetJump_url && isSetJump_url2 && this.jump_url.equals(that.jump_url))) {
            return false;
        }
        boolean isSetIcon_default = isSetIcon_default();
        boolean isSetIcon_default2 = that.isSetIcon_default();
        if ((isSetIcon_default || isSetIcon_default2) && !(isSetIcon_default && isSetIcon_default2 && this.icon_default.equals(that.icon_default))) {
            return false;
        }
        boolean isSetIcon_press = isSetIcon_press();
        boolean isSetIcon_press2 = that.isSetIcon_press();
        return (!(isSetIcon_press || isSetIcon_press2) || (isSetIcon_press && isSetIcon_press2 && this.icon_press.equals(that.icon_press))) && this.start_time == that.start_time && this.end_time == that.end_time && this.isTaobao == that.isTaobao;
    }

    public ShoppingImgInfo(ShoppingImgInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetJump_url()) {
            this.jump_url = other.jump_url;
        }
        if (other.isSetIcon_default()) {
            this.icon_default = other.icon_default;
        }
        if (other.isSetIcon_press()) {
            this.icon_press = other.icon_press;
        }
        this.start_time = other.start_time;
        this.end_time = other.end_time;
        this.isTaobao = other.isTaobao;
    }
}
