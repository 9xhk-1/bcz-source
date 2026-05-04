package com.baicizhan.online.bcz_system_api;

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
public class BczTabInfo implements TBase<BczTabInfo, _Fields>, Serializable, Cloneable, Comparable<BczTabInfo> {
    private static final int __DISAPPEAR_TIME_ISSET_ID = 1;
    private static final int __SHOW_TIME_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public long disappear_time;
    public String icon;
    public long show_time;
    public String tab;
    private static final TStruct STRUCT_DESC = new TStruct("BczTabInfo");
    private static final TField TAB_FIELD_DESC = new TField("tab", (byte) 11, 1);
    private static final TField ICON_FIELD_DESC = new TField("icon", (byte) 11, 2);
    private static final TField SHOW_TIME_FIELD_DESC = new TField("show_time", (byte) 10, 3);
    private static final TField DISAPPEAR_TIME_FIELD_DESC = new TField("disappear_time", (byte) 10, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczTabInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields = iArr;
            try {
                iArr[_Fields.TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields[_Fields.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields[_Fields.SHOW_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields[_Fields.DISAPPEAR_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczTabInfoStandardScheme extends StandardScheme<BczTabInfo> {
        private BczTabInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczTabInfo struct) throws TException {
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
                                struct.disappear_time = iprot.readI64();
                                struct.setDisappear_timeIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 10) {
                            struct.show_time = iprot.readI64();
                            struct.setShow_timeIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.icon = iprot.readString();
                        struct.setIconIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.tab = iprot.readString();
                    struct.setTabIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetShow_time()) {
                throw new TProtocolException("Required field 'show_time' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetDisappear_time()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'disappear_time' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczTabInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczTabInfo.STRUCT_DESC);
            if (struct.tab != null) {
                oprot.writeFieldBegin(BczTabInfo.TAB_FIELD_DESC);
                oprot.writeString(struct.tab);
                oprot.writeFieldEnd();
            }
            if (struct.icon != null) {
                oprot.writeFieldBegin(BczTabInfo.ICON_FIELD_DESC);
                oprot.writeString(struct.icon);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BczTabInfo.SHOW_TIME_FIELD_DESC);
            oprot.writeI64(struct.show_time);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BczTabInfo.DISAPPEAR_TIME_FIELD_DESC);
            oprot.writeI64(struct.disappear_time);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczTabInfoStandardSchemeFactory implements SchemeFactory {
        private BczTabInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczTabInfoStandardScheme getScheme() {
            return new BczTabInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczTabInfoTupleScheme extends TupleScheme<BczTabInfo> {
        private BczTabInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczTabInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.tab = tTupleProtocol.readString();
            struct.setTabIsSet(true);
            struct.icon = tTupleProtocol.readString();
            struct.setIconIsSet(true);
            struct.show_time = tTupleProtocol.readI64();
            struct.setShow_timeIsSet(true);
            struct.disappear_time = tTupleProtocol.readI64();
            struct.setDisappear_timeIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczTabInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.tab);
            tTupleProtocol.writeString(struct.icon);
            tTupleProtocol.writeI64(struct.show_time);
            tTupleProtocol.writeI64(struct.disappear_time);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczTabInfoTupleSchemeFactory implements SchemeFactory {
        private BczTabInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczTabInfoTupleScheme getScheme() {
            return new BczTabInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TAB(1, "tab"),
        ICON(2, "icon"),
        SHOW_TIME(3, "show_time"),
        DISAPPEAR_TIME(4, "disappear_time");

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
                return TAB;
            }
            if (fieldId == 2) {
                return ICON;
            }
            if (fieldId == 3) {
                return SHOW_TIME;
            }
            if (fieldId != 4) {
                return null;
            }
            return DISAPPEAR_TIME;
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
        hashMap.put(StandardScheme.class, new BczTabInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczTabInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TAB, (_Fields) new FieldMetaData("tab", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON, (_Fields) new FieldMetaData("icon", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOW_TIME, (_Fields) new FieldMetaData("show_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.DISAPPEAR_TIME, (_Fields) new FieldMetaData("disappear_time", (byte) 1, new FieldValueMetaData((byte) 10)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczTabInfo.class, unmodifiableMap);
    }

    public BczTabInfo() {
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
        this.tab = null;
        this.icon = null;
        setShow_timeIsSet(false);
        this.show_time = 0L;
        setDisappear_timeIsSet(false);
        this.disappear_time = 0L;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczTabInfo)) {
            return equals((BczTabInfo) that);
        }
        return false;
    }

    public long getDisappear_time() {
        return this.disappear_time;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getShow_time() {
        return this.show_time;
    }

    public String getTab() {
        return this.tab;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDisappear_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetIcon() {
        return this.icon != null;
    }

    public boolean isSetShow_time() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTab() {
        return this.tab != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczTabInfo setDisappear_time(long disappear_time) {
        this.disappear_time = disappear_time;
        setDisappear_timeIsSet(true);
        return this;
    }

    public void setDisappear_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BczTabInfo setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIconIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon = null;
    }

    public BczTabInfo setShow_time(long show_time) {
        this.show_time = show_time;
        setShow_timeIsSet(true);
        return this;
    }

    public void setShow_timeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BczTabInfo setTab(String tab) {
        this.tab = tab;
        return this;
    }

    public void setTabIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tab = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczTabInfo(");
        sb2.append("tab:");
        String str = this.tab;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("icon:");
        String str2 = this.icon;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("show_time:");
        sb2.append(this.show_time);
        sb2.append(j2.O);
        sb2.append("disappear_time:");
        sb2.append(this.disappear_time);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDisappear_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetIcon() {
        this.icon = null;
    }

    public void unsetShow_time() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTab() {
        this.tab = null;
    }

    public void validate() throws TException {
        if (this.tab == null) {
            throw new TProtocolException("Required field 'tab' was not present! Struct: " + toString());
        }
        if (this.icon != null) {
            return;
        }
        throw new TProtocolException("Required field 'icon' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczTabInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTab()).compareTo(Boolean.valueOf(other.isSetTab()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTab() && (compareTo4 = TBaseHelper.compareTo(this.tab, other.tab)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetIcon()).compareTo(Boolean.valueOf(other.isSetIcon()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetIcon() && (compareTo3 = TBaseHelper.compareTo(this.icon, other.icon)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetShow_time()).compareTo(Boolean.valueOf(other.isSetShow_time()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetShow_time() && (compareTo2 = TBaseHelper.compareTo(this.show_time, other.show_time)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetDisappear_time()).compareTo(Boolean.valueOf(other.isSetDisappear_time()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetDisappear_time() || (compareTo = TBaseHelper.compareTo(this.disappear_time, other.disappear_time)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczTabInfo, _Fields> deepCopy2() {
        return new BczTabInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTab();
        }
        if (i11 == 2) {
            return getIcon();
        }
        if (i11 == 3) {
            return Long.valueOf(getShow_time());
        }
        if (i11 == 4) {
            return Long.valueOf(getDisappear_time());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTab();
        }
        if (i11 == 2) {
            return isSetIcon();
        }
        if (i11 == 3) {
            return isSetShow_time();
        }
        if (i11 == 4) {
            return isSetDisappear_time();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczTabInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTab();
                return;
            } else {
                setTab((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetIcon();
                return;
            } else {
                setIcon((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetShow_time();
                return;
            } else {
                setShow_time(((Long) value).longValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetDisappear_time();
        } else {
            setDisappear_time(((Long) value).longValue());
        }
    }

    public BczTabInfo(String tab, String icon, long show_time, long disappear_time) {
        this();
        this.tab = tab;
        this.icon = icon;
        this.show_time = show_time;
        setShow_timeIsSet(true);
        this.disappear_time = disappear_time;
        setDisappear_timeIsSet(true);
    }

    public boolean equals(BczTabInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetTab = isSetTab();
        boolean isSetTab2 = that.isSetTab();
        if ((isSetTab || isSetTab2) && !(isSetTab && isSetTab2 && this.tab.equals(that.tab))) {
            return false;
        }
        boolean isSetIcon = isSetIcon();
        boolean isSetIcon2 = that.isSetIcon();
        return (!(isSetIcon || isSetIcon2) || (isSetIcon && isSetIcon2 && this.icon.equals(that.icon))) && this.show_time == that.show_time && this.disappear_time == that.disappear_time;
    }

    public BczTabInfo(BczTabInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetTab()) {
            this.tab = other.tab;
        }
        if (other.isSetIcon()) {
            this.icon = other.icon;
        }
        this.show_time = other.show_time;
        this.disappear_time = other.disappear_time;
    }
}
