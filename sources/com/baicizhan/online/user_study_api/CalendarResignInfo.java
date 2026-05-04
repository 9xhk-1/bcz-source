package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CalendarResignInfo implements TBase<CalendarResignInfo, _Fields>, Serializable, Cloneable, Comparable<CalendarResignInfo> {
    private static final int __COPPER_COST_ISSET_ID = 1;
    private static final int __COPPER_HOLD_ISSET_ID = 2;
    private static final int __COUNT_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int copper_cost;
    public int copper_hold;
    public int count;
    public String icon;
    public String jump_url;
    public String title;
    private static final TStruct STRUCT_DESC = new TStruct("CalendarResignInfo");
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 1);
    private static final TField ICON_FIELD_DESC = new TField("icon", (byte) 11, 2);
    private static final TField COUNT_FIELD_DESC = new TField("count", (byte) 8, 3);
    private static final TField COPPER_COST_FIELD_DESC = new TField("copper_cost", (byte) 8, 4);
    private static final TField COPPER_HOLD_FIELD_DESC = new TField("copper_hold", (byte) 8, 5);
    private static final TField JUMP_URL_FIELD_DESC = new TField(md.j.f73126f, (byte) 11, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.CalendarResignInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields = iArr;
            try {
                iArr[_Fields.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[_Fields.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[_Fields.COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[_Fields.COPPER_COST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[_Fields.COPPER_HOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[_Fields.JUMP_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarResignInfoStandardScheme extends StandardScheme<CalendarResignInfo> {
        private CalendarResignInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, CalendarResignInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetCount()) {
                        throw new TProtocolException("Required field 'count' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetCopper_cost()) {
                        throw new TProtocolException("Required field 'copper_cost' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetCopper_hold()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'copper_hold' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.icon = iprot.readString();
                            struct.setIconIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.count = iprot.readI32();
                            struct.setCountIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.copper_cost = iprot.readI32();
                            struct.setCopper_costIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.copper_hold = iprot.readI32();
                            struct.setCopper_holdIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.jump_url = iprot.readString();
                            struct.setJump_urlIsSet(true);
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
        public void write(TProtocol oprot, CalendarResignInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(CalendarResignInfo.STRUCT_DESC);
            if (struct.title != null) {
                oprot.writeFieldBegin(CalendarResignInfo.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.icon != null) {
                oprot.writeFieldBegin(CalendarResignInfo.ICON_FIELD_DESC);
                oprot.writeString(struct.icon);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(CalendarResignInfo.COUNT_FIELD_DESC);
            oprot.writeI32(struct.count);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(CalendarResignInfo.COPPER_COST_FIELD_DESC);
            oprot.writeI32(struct.copper_cost);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(CalendarResignInfo.COPPER_HOLD_FIELD_DESC);
            oprot.writeI32(struct.copper_hold);
            oprot.writeFieldEnd();
            if (struct.jump_url != null) {
                oprot.writeFieldBegin(CalendarResignInfo.JUMP_URL_FIELD_DESC);
                oprot.writeString(struct.jump_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarResignInfoStandardSchemeFactory implements SchemeFactory {
        private CalendarResignInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CalendarResignInfoStandardScheme getScheme() {
            return new CalendarResignInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarResignInfoTupleScheme extends TupleScheme<CalendarResignInfo> {
        private CalendarResignInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, CalendarResignInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.icon = tTupleProtocol.readString();
            struct.setIconIsSet(true);
            struct.count = tTupleProtocol.readI32();
            struct.setCountIsSet(true);
            struct.copper_cost = tTupleProtocol.readI32();
            struct.setCopper_costIsSet(true);
            struct.copper_hold = tTupleProtocol.readI32();
            struct.setCopper_holdIsSet(true);
            struct.jump_url = tTupleProtocol.readString();
            struct.setJump_urlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, CalendarResignInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.icon);
            tTupleProtocol.writeI32(struct.count);
            tTupleProtocol.writeI32(struct.copper_cost);
            tTupleProtocol.writeI32(struct.copper_hold);
            tTupleProtocol.writeString(struct.jump_url);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CalendarResignInfoTupleSchemeFactory implements SchemeFactory {
        private CalendarResignInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public CalendarResignInfoTupleScheme getScheme() {
            return new CalendarResignInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TITLE(1, "title"),
        ICON(2, "icon"),
        COUNT(3, "count"),
        COPPER_COST(4, "copper_cost"),
        COPPER_HOLD(5, "copper_hold"),
        JUMP_URL(6, md.j.f73126f);

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
                    return TITLE;
                case 2:
                    return ICON;
                case 3:
                    return COUNT;
                case 4:
                    return COPPER_COST;
                case 5:
                    return COPPER_HOLD;
                case 6:
                    return JUMP_URL;
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
        hashMap.put(StandardScheme.class, new CalendarResignInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new CalendarResignInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON, (_Fields) new FieldMetaData("icon", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.COUNT, (_Fields) new FieldMetaData("count", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COPPER_COST, (_Fields) new FieldMetaData("copper_cost", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.COPPER_HOLD, (_Fields) new FieldMetaData("copper_hold", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.JUMP_URL, (_Fields) new FieldMetaData(md.j.f73126f, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(CalendarResignInfo.class, unmodifiableMap);
    }

    public CalendarResignInfo() {
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
        this.title = null;
        this.icon = null;
        setCountIsSet(false);
        this.count = 0;
        setCopper_costIsSet(false);
        this.copper_cost = 0;
        setCopper_holdIsSet(false);
        this.copper_hold = 0;
        this.jump_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof CalendarResignInfo)) {
            return equals((CalendarResignInfo) that);
        }
        return false;
    }

    public int getCopper_cost() {
        return this.copper_cost;
    }

    public int getCopper_hold() {
        return this.copper_hold;
    }

    public int getCount() {
        return this.count;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getJump_url() {
        return this.jump_url;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCopper_cost() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetCopper_hold() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetCount() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetIcon() {
        return this.icon != null;
    }

    public boolean isSetJump_url() {
        return this.jump_url != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public CalendarResignInfo setCopper_cost(int copper_cost) {
        this.copper_cost = copper_cost;
        setCopper_costIsSet(true);
        return this;
    }

    public void setCopper_costIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public CalendarResignInfo setCopper_hold(int copper_hold) {
        this.copper_hold = copper_hold;
        setCopper_holdIsSet(true);
        return this;
    }

    public void setCopper_holdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public CalendarResignInfo setCount(int count) {
        this.count = count;
        setCountIsSet(true);
        return this;
    }

    public void setCountIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public CalendarResignInfo setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIconIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon = null;
    }

    public CalendarResignInfo setJump_url(String jump_url) {
        this.jump_url = jump_url;
        return this;
    }

    public void setJump_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jump_url = null;
    }

    public CalendarResignInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarResignInfo(");
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("icon:");
        String str2 = this.icon;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("count:");
        sb2.append(this.count);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("copper_cost:");
        sb2.append(this.copper_cost);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("copper_hold:");
        sb2.append(this.copper_hold);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("jump_url:");
        String str3 = this.jump_url;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCopper_cost() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetCopper_hold() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetCount() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetIcon() {
        this.icon = null;
    }

    public void unsetJump_url() {
        this.jump_url = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.icon == null) {
            throw new TProtocolException("Required field 'icon' was not present! Struct: " + toString());
        }
        if (this.jump_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'jump_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(CalendarResignInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTitle() && (compareTo6 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetIcon()).compareTo(Boolean.valueOf(other.isSetIcon()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetIcon() && (compareTo5 = TBaseHelper.compareTo(this.icon, other.icon)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetCount()).compareTo(Boolean.valueOf(other.isSetCount()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetCount() && (compareTo4 = TBaseHelper.compareTo(this.count, other.count)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetCopper_cost()).compareTo(Boolean.valueOf(other.isSetCopper_cost()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetCopper_cost() && (compareTo3 = TBaseHelper.compareTo(this.copper_cost, other.copper_cost)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetCopper_hold()).compareTo(Boolean.valueOf(other.isSetCopper_hold()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetCopper_hold() && (compareTo2 = TBaseHelper.compareTo(this.copper_hold, other.copper_hold)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetJump_url()).compareTo(Boolean.valueOf(other.isSetJump_url()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetJump_url() || (compareTo = TBaseHelper.compareTo(this.jump_url, other.jump_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<CalendarResignInfo, _Fields> deepCopy2() {
        return new CalendarResignInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[field.ordinal()]) {
            case 1:
                return getTitle();
            case 2:
                return getIcon();
            case 3:
                return Integer.valueOf(getCount());
            case 4:
                return Integer.valueOf(getCopper_cost());
            case 5:
                return Integer.valueOf(getCopper_hold());
            case 6:
                return getJump_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetTitle();
            case 2:
                return isSetIcon();
            case 3:
                return isSetCount();
            case 4:
                return isSetCopper_cost();
            case 5:
                return isSetCopper_hold();
            case 6:
                return isSetJump_url();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$CalendarResignInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTitle((String) value);
                    break;
                } else {
                    unsetTitle();
                    break;
                }
            case 2:
                if (value != null) {
                    setIcon((String) value);
                    break;
                } else {
                    unsetIcon();
                    break;
                }
            case 3:
                if (value != null) {
                    setCount(((Integer) value).intValue());
                    break;
                } else {
                    unsetCount();
                    break;
                }
            case 4:
                if (value != null) {
                    setCopper_cost(((Integer) value).intValue());
                    break;
                } else {
                    unsetCopper_cost();
                    break;
                }
            case 5:
                if (value != null) {
                    setCopper_hold(((Integer) value).intValue());
                    break;
                } else {
                    unsetCopper_hold();
                    break;
                }
            case 6:
                if (value != null) {
                    setJump_url((String) value);
                    break;
                } else {
                    unsetJump_url();
                    break;
                }
        }
    }

    public CalendarResignInfo(String title, String icon, int count, int copper_cost, int copper_hold, String jump_url) {
        this();
        this.title = title;
        this.icon = icon;
        this.count = count;
        setCountIsSet(true);
        this.copper_cost = copper_cost;
        setCopper_costIsSet(true);
        this.copper_hold = copper_hold;
        setCopper_holdIsSet(true);
        this.jump_url = jump_url;
    }

    public boolean equals(CalendarResignInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetIcon = isSetIcon();
        boolean isSetIcon2 = that.isSetIcon();
        if (((isSetIcon || isSetIcon2) && (!isSetIcon || !isSetIcon2 || !this.icon.equals(that.icon))) || this.count != that.count || this.copper_cost != that.copper_cost || this.copper_hold != that.copper_hold) {
            return false;
        }
        boolean isSetJump_url = isSetJump_url();
        boolean isSetJump_url2 = that.isSetJump_url();
        if (isSetJump_url || isSetJump_url2) {
            return isSetJump_url && isSetJump_url2 && this.jump_url.equals(that.jump_url);
        }
        return true;
    }

    public CalendarResignInfo(CalendarResignInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetIcon()) {
            this.icon = other.icon;
        }
        this.count = other.count;
        this.copper_cost = other.copper_cost;
        this.copper_hold = other.copper_hold;
        if (other.isSetJump_url()) {
            this.jump_url = other.jump_url;
        }
    }
}
