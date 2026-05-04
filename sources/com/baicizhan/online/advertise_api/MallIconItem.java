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
public class MallIconItem implements TBase<MallIconItem, _Fields>, Serializable, Cloneable, Comparable<MallIconItem> {
    private static final int __END_TIME_ISSET_ID = 1;
    private static final int __START_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String aid;
    public long end_time;
    public String icon_normal;
    public String icon_press;
    public String mall_name;
    private _Fields[] optionals;
    public long start_time;
    private static final TStruct STRUCT_DESC = new TStruct("MallIconItem");
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 1);
    private static final TField ICON_NORMAL_FIELD_DESC = new TField("icon_normal", (byte) 11, 2);
    private static final TField ICON_PRESS_FIELD_DESC = new TField("icon_press", (byte) 11, 3);
    private static final TField START_TIME_FIELD_DESC = new TField("start_time", (byte) 10, 4);
    private static final TField END_TIME_FIELD_DESC = new TField("end_time", (byte) 10, 5);
    private static final TField MALL_NAME_FIELD_DESC = new TField("mall_name", (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.MallIconItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields = iArr;
            try {
                iArr[_Fields.AID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[_Fields.ICON_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[_Fields.ICON_PRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[_Fields.START_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[_Fields.END_TIME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[_Fields.MALL_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallIconItemStandardScheme extends StandardScheme<MallIconItem> {
        private MallIconItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, MallIconItem struct) throws TException {
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.aid = iprot.readString();
                            struct.setAidIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.icon_normal = iprot.readString();
                            struct.setIcon_normalIsSet(true);
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
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.mall_name = iprot.readString();
                            struct.setMall_nameIsSet(true);
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
        public void write(TProtocol oprot, MallIconItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(MallIconItem.STRUCT_DESC);
            if (struct.aid != null) {
                oprot.writeFieldBegin(MallIconItem.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            if (struct.icon_normal != null) {
                oprot.writeFieldBegin(MallIconItem.ICON_NORMAL_FIELD_DESC);
                oprot.writeString(struct.icon_normal);
                oprot.writeFieldEnd();
            }
            if (struct.icon_press != null) {
                oprot.writeFieldBegin(MallIconItem.ICON_PRESS_FIELD_DESC);
                oprot.writeString(struct.icon_press);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(MallIconItem.START_TIME_FIELD_DESC);
            oprot.writeI64(struct.start_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(MallIconItem.END_TIME_FIELD_DESC);
            oprot.writeI64(struct.end_time);
            oprot.writeFieldEnd();
            if (struct.mall_name != null && struct.isSetMall_name()) {
                oprot.writeFieldBegin(MallIconItem.MALL_NAME_FIELD_DESC);
                oprot.writeString(struct.mall_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallIconItemStandardSchemeFactory implements SchemeFactory {
        private MallIconItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MallIconItemStandardScheme getScheme() {
            return new MallIconItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallIconItemTupleScheme extends TupleScheme<MallIconItem> {
        private MallIconItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, MallIconItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.aid = tTupleProtocol.readString();
            struct.setAidIsSet(true);
            struct.icon_normal = tTupleProtocol.readString();
            struct.setIcon_normalIsSet(true);
            struct.icon_press = tTupleProtocol.readString();
            struct.setIcon_pressIsSet(true);
            struct.start_time = tTupleProtocol.readI64();
            struct.setStart_timeIsSet(true);
            struct.end_time = tTupleProtocol.readI64();
            struct.setEnd_timeIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.mall_name = tTupleProtocol.readString();
                struct.setMall_nameIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, MallIconItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.aid);
            tTupleProtocol.writeString(struct.icon_normal);
            tTupleProtocol.writeString(struct.icon_press);
            tTupleProtocol.writeI64(struct.start_time);
            tTupleProtocol.writeI64(struct.end_time);
            BitSet bitSet = new BitSet();
            if (struct.isSetMall_name()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetMall_name()) {
                tTupleProtocol.writeString(struct.mall_name);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MallIconItemTupleSchemeFactory implements SchemeFactory {
        private MallIconItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public MallIconItemTupleScheme getScheme() {
            return new MallIconItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AID(1, "aid"),
        ICON_NORMAL(2, "icon_normal"),
        ICON_PRESS(3, "icon_press"),
        START_TIME(4, "start_time"),
        END_TIME(5, "end_time"),
        MALL_NAME(6, "mall_name");

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
                    return AID;
                case 2:
                    return ICON_NORMAL;
                case 3:
                    return ICON_PRESS;
                case 4:
                    return START_TIME;
                case 5:
                    return END_TIME;
                case 6:
                    return MALL_NAME;
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
        hashMap.put(StandardScheme.class, new MallIconItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new MallIconItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON_NORMAL, (_Fields) new FieldMetaData("icon_normal", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON_PRESS, (_Fields) new FieldMetaData("icon_press", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.START_TIME, (_Fields) new FieldMetaData("start_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.END_TIME, (_Fields) new FieldMetaData("end_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.MALL_NAME, (_Fields) new FieldMetaData("mall_name", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(MallIconItem.class, unmodifiableMap);
    }

    public MallIconItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_NAME};
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
        this.aid = null;
        this.icon_normal = null;
        this.icon_press = null;
        setStart_timeIsSet(false);
        this.start_time = 0L;
        setEnd_timeIsSet(false);
        this.end_time = 0L;
        this.mall_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof MallIconItem)) {
            return equals((MallIconItem) that);
        }
        return false;
    }

    public String getAid() {
        return this.aid;
    }

    public long getEnd_time() {
        return this.end_time;
    }

    public String getIcon_normal() {
        return this.icon_normal;
    }

    public String getIcon_press() {
        return this.icon_press;
    }

    public String getMall_name() {
        return this.mall_name;
    }

    public long getStart_time() {
        return this.start_time;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAid() {
        return this.aid != null;
    }

    public boolean isSetEnd_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIcon_normal() {
        return this.icon_normal != null;
    }

    public boolean isSetIcon_press() {
        return this.icon_press != null;
    }

    public boolean isSetMall_name() {
        return this.mall_name != null;
    }

    public boolean isSetStart_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public MallIconItem setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public MallIconItem setEnd_time(long end_time) {
        this.end_time = end_time;
        setEnd_timeIsSet(true);
        return this;
    }

    public void setEnd_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public MallIconItem setIcon_normal(String icon_normal) {
        this.icon_normal = icon_normal;
        return this;
    }

    public void setIcon_normalIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon_normal = null;
    }

    public MallIconItem setIcon_press(String icon_press) {
        this.icon_press = icon_press;
        return this;
    }

    public void setIcon_pressIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon_press = null;
    }

    public MallIconItem setMall_name(String mall_name) {
        this.mall_name = mall_name;
        return this;
    }

    public void setMall_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mall_name = null;
    }

    public MallIconItem setStart_time(long start_time) {
        this.start_time = start_time;
        setStart_timeIsSet(true);
        return this;
    }

    public void setStart_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MallIconItem(");
        sb2.append("aid:");
        String str = this.aid;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("icon_normal:");
        String str2 = this.icon_normal;
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
        if (isSetMall_name()) {
            sb2.append(j2.O);
            sb2.append("mall_name:");
            String str4 = this.mall_name;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetEnd_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIcon_normal() {
        this.icon_normal = null;
    }

    public void unsetIcon_press() {
        this.icon_press = null;
    }

    public void unsetMall_name() {
        this.mall_name = null;
    }

    public void unsetStart_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.aid == null) {
            throw new TProtocolException("Required field 'aid' was not present! Struct: " + toString());
        }
        if (this.icon_normal == null) {
            throw new TProtocolException("Required field 'icon_normal' was not present! Struct: " + toString());
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
    public int compareTo(MallIconItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAid() && (compareTo6 = TBaseHelper.compareTo(this.aid, other.aid)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetIcon_normal()).compareTo(Boolean.valueOf(other.isSetIcon_normal()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetIcon_normal() && (compareTo5 = TBaseHelper.compareTo(this.icon_normal, other.icon_normal)) != 0) {
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
        int compareTo12 = Boolean.valueOf(isSetMall_name()).compareTo(Boolean.valueOf(other.isSetMall_name()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetMall_name() || (compareTo = TBaseHelper.compareTo(this.mall_name, other.mall_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<MallIconItem, _Fields> deepCopy2() {
        return new MallIconItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[field.ordinal()]) {
            case 1:
                return getAid();
            case 2:
                return getIcon_normal();
            case 3:
                return getIcon_press();
            case 4:
                return Long.valueOf(getStart_time());
            case 5:
                return Long.valueOf(getEnd_time());
            case 6:
                return getMall_name();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetAid();
            case 2:
                return isSetIcon_normal();
            case 3:
                return isSetIcon_press();
            case 4:
                return isSetStart_time();
            case 5:
                return isSetEnd_time();
            case 6:
                return isSetMall_name();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$MallIconItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAid((String) value);
                    break;
                } else {
                    unsetAid();
                    break;
                }
            case 2:
                if (value != null) {
                    setIcon_normal((String) value);
                    break;
                } else {
                    unsetIcon_normal();
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
                    setMall_name((String) value);
                    break;
                } else {
                    unsetMall_name();
                    break;
                }
        }
    }

    public boolean equals(MallIconItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetAid = isSetAid();
        boolean isSetAid2 = that.isSetAid();
        if ((isSetAid || isSetAid2) && !(isSetAid && isSetAid2 && this.aid.equals(that.aid))) {
            return false;
        }
        boolean isSetIcon_normal = isSetIcon_normal();
        boolean isSetIcon_normal2 = that.isSetIcon_normal();
        if ((isSetIcon_normal || isSetIcon_normal2) && !(isSetIcon_normal && isSetIcon_normal2 && this.icon_normal.equals(that.icon_normal))) {
            return false;
        }
        boolean isSetIcon_press = isSetIcon_press();
        boolean isSetIcon_press2 = that.isSetIcon_press();
        if (((isSetIcon_press || isSetIcon_press2) && (!isSetIcon_press || !isSetIcon_press2 || !this.icon_press.equals(that.icon_press))) || this.start_time != that.start_time || this.end_time != that.end_time) {
            return false;
        }
        boolean isSetMall_name = isSetMall_name();
        boolean isSetMall_name2 = that.isSetMall_name();
        if (isSetMall_name || isSetMall_name2) {
            return isSetMall_name && isSetMall_name2 && this.mall_name.equals(that.mall_name);
        }
        return true;
    }

    public MallIconItem(String aid, String icon_normal, String icon_press, long start_time, long end_time) {
        this();
        this.aid = aid;
        this.icon_normal = icon_normal;
        this.icon_press = icon_press;
        this.start_time = start_time;
        setStart_timeIsSet(true);
        this.end_time = end_time;
        setEnd_timeIsSet(true);
    }

    public MallIconItem(MallIconItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MALL_NAME};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
        if (other.isSetIcon_normal()) {
            this.icon_normal = other.icon_normal;
        }
        if (other.isSetIcon_press()) {
            this.icon_press = other.icon_press;
        }
        this.start_time = other.start_time;
        this.end_time = other.end_time;
        if (other.isSetMall_name()) {
            this.mall_name = other.mall_name;
        }
    }
}
