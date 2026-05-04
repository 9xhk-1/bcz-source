package com.baicizhan.online.thrift.basic;

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
import org.apache.thrift.meta_data.EnumMetaData;
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
public class AdvertiseRedirectInfo implements TBase<AdvertiseRedirectInfo, _Fields>, Serializable, Cloneable, Comparable<AdvertiseRedirectInfo> {
    private static final int __SYS_NOTIFY_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String mall_url;
    private _Fields[] optionals;
    public AdvertiseRedirectType redirect_type;
    public String redirect_url;
    public int sys_notify_id;
    public String taobao_item_id;
    private static final TStruct STRUCT_DESC = new TStruct("AdvertiseRedirectInfo");
    private static final TField REDIRECT_TYPE_FIELD_DESC = new TField("redirect_type", (byte) 8, 1);
    private static final TField REDIRECT_URL_FIELD_DESC = new TField("redirect_url", (byte) 11, 2);
    private static final TField TAOBAO_ITEM_ID_FIELD_DESC = new TField("taobao_item_id", (byte) 11, 3);
    private static final TField SYS_NOTIFY_ID_FIELD_DESC = new TField("sys_notify_id", (byte) 8, 4);
    private static final TField MALL_URL_FIELD_DESC = new TField("mall_url", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.thrift.basic.AdvertiseRedirectInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields = iArr;
            try {
                iArr[_Fields.REDIRECT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[_Fields.REDIRECT_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[_Fields.TAOBAO_ITEM_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[_Fields.SYS_NOTIFY_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[_Fields.MALL_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseRedirectInfoStandardScheme extends StandardScheme<AdvertiseRedirectInfo> {
        private AdvertiseRedirectInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdvertiseRedirectInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                short s11 = readFieldBegin.f77768id;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.mall_url = iprot.readString();
                                    struct.setMall_urlIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.sys_notify_id = iprot.readI32();
                                struct.setSys_notify_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.taobao_item_id = iprot.readString();
                            struct.setTaobao_item_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.redirect_url = iprot.readString();
                        struct.setRedirect_urlIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.redirect_type = AdvertiseRedirectType.findByValue(iprot.readI32());
                    struct.setRedirect_typeIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdvertiseRedirectInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdvertiseRedirectInfo.STRUCT_DESC);
            if (struct.redirect_type != null) {
                oprot.writeFieldBegin(AdvertiseRedirectInfo.REDIRECT_TYPE_FIELD_DESC);
                oprot.writeI32(struct.redirect_type.getValue());
                oprot.writeFieldEnd();
            }
            if (struct.redirect_url != null) {
                oprot.writeFieldBegin(AdvertiseRedirectInfo.REDIRECT_URL_FIELD_DESC);
                oprot.writeString(struct.redirect_url);
                oprot.writeFieldEnd();
            }
            if (struct.taobao_item_id != null && struct.isSetTaobao_item_id()) {
                oprot.writeFieldBegin(AdvertiseRedirectInfo.TAOBAO_ITEM_ID_FIELD_DESC);
                oprot.writeString(struct.taobao_item_id);
                oprot.writeFieldEnd();
            }
            if (struct.isSetSys_notify_id()) {
                oprot.writeFieldBegin(AdvertiseRedirectInfo.SYS_NOTIFY_ID_FIELD_DESC);
                oprot.writeI32(struct.sys_notify_id);
                oprot.writeFieldEnd();
            }
            if (struct.mall_url != null && struct.isSetMall_url()) {
                oprot.writeFieldBegin(AdvertiseRedirectInfo.MALL_URL_FIELD_DESC);
                oprot.writeString(struct.mall_url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseRedirectInfoStandardSchemeFactory implements SchemeFactory {
        private AdvertiseRedirectInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertiseRedirectInfoStandardScheme getScheme() {
            return new AdvertiseRedirectInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseRedirectInfoTupleScheme extends TupleScheme<AdvertiseRedirectInfo> {
        private AdvertiseRedirectInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdvertiseRedirectInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.redirect_type = AdvertiseRedirectType.findByValue(tTupleProtocol.readI32());
            struct.setRedirect_typeIsSet(true);
            struct.redirect_url = tTupleProtocol.readString();
            struct.setRedirect_urlIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.taobao_item_id = tTupleProtocol.readString();
                struct.setTaobao_item_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.sys_notify_id = tTupleProtocol.readI32();
                struct.setSys_notify_idIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.mall_url = tTupleProtocol.readString();
                struct.setMall_urlIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdvertiseRedirectInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.redirect_type.getValue());
            tTupleProtocol.writeString(struct.redirect_url);
            BitSet bitSet = new BitSet();
            if (struct.isSetTaobao_item_id()) {
                bitSet.set(0);
            }
            if (struct.isSetSys_notify_id()) {
                bitSet.set(1);
            }
            if (struct.isSetMall_url()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetTaobao_item_id()) {
                tTupleProtocol.writeString(struct.taobao_item_id);
            }
            if (struct.isSetSys_notify_id()) {
                tTupleProtocol.writeI32(struct.sys_notify_id);
            }
            if (struct.isSetMall_url()) {
                tTupleProtocol.writeString(struct.mall_url);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvertiseRedirectInfoTupleSchemeFactory implements SchemeFactory {
        private AdvertiseRedirectInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvertiseRedirectInfoTupleScheme getScheme() {
            return new AdvertiseRedirectInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        REDIRECT_TYPE(1, "redirect_type"),
        REDIRECT_URL(2, "redirect_url"),
        TAOBAO_ITEM_ID(3, "taobao_item_id"),
        SYS_NOTIFY_ID(4, "sys_notify_id"),
        MALL_URL(5, "mall_url");

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
                return REDIRECT_TYPE;
            }
            if (fieldId == 2) {
                return REDIRECT_URL;
            }
            if (fieldId == 3) {
                return TAOBAO_ITEM_ID;
            }
            if (fieldId == 4) {
                return SYS_NOTIFY_ID;
            }
            if (fieldId != 5) {
                return null;
            }
            return MALL_URL;
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
        hashMap.put(StandardScheme.class, new AdvertiseRedirectInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdvertiseRedirectInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.REDIRECT_TYPE, (_Fields) new FieldMetaData("redirect_type", (byte) 1, new EnumMetaData((byte) 16, AdvertiseRedirectType.class)));
        enumMap.put((EnumMap) _Fields.REDIRECT_URL, (_Fields) new FieldMetaData("redirect_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TAOBAO_ITEM_ID, (_Fields) new FieldMetaData("taobao_item_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SYS_NOTIFY_ID, (_Fields) new FieldMetaData("sys_notify_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MALL_URL, (_Fields) new FieldMetaData("mall_url", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdvertiseRedirectInfo.class, unmodifiableMap);
    }

    public AdvertiseRedirectInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAOBAO_ITEM_ID, _Fields.SYS_NOTIFY_ID, _Fields.MALL_URL};
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
        this.redirect_type = null;
        this.redirect_url = null;
        this.taobao_item_id = null;
        setSys_notify_idIsSet(false);
        this.sys_notify_id = 0;
        this.mall_url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdvertiseRedirectInfo)) {
            return equals((AdvertiseRedirectInfo) that);
        }
        return false;
    }

    public String getMall_url() {
        return this.mall_url;
    }

    public AdvertiseRedirectType getRedirect_type() {
        return this.redirect_type;
    }

    public String getRedirect_url() {
        return this.redirect_url;
    }

    public int getSys_notify_id() {
        return this.sys_notify_id;
    }

    public String getTaobao_item_id() {
        return this.taobao_item_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMall_url() {
        return this.mall_url != null;
    }

    public boolean isSetRedirect_type() {
        return this.redirect_type != null;
    }

    public boolean isSetRedirect_url() {
        return this.redirect_url != null;
    }

    public boolean isSetSys_notify_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTaobao_item_id() {
        return this.taobao_item_id != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdvertiseRedirectInfo setMall_url(String mall_url) {
        this.mall_url = mall_url;
        return this;
    }

    public void setMall_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mall_url = null;
    }

    public AdvertiseRedirectInfo setRedirect_type(AdvertiseRedirectType redirect_type) {
        this.redirect_type = redirect_type;
        return this;
    }

    public void setRedirect_typeIsSet(boolean value) {
        if (value) {
            return;
        }
        this.redirect_type = null;
    }

    public AdvertiseRedirectInfo setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
        return this;
    }

    public void setRedirect_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.redirect_url = null;
    }

    public AdvertiseRedirectInfo setSys_notify_id(int sys_notify_id) {
        this.sys_notify_id = sys_notify_id;
        setSys_notify_idIsSet(true);
        return this;
    }

    public void setSys_notify_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AdvertiseRedirectInfo setTaobao_item_id(String taobao_item_id) {
        this.taobao_item_id = taobao_item_id;
        return this;
    }

    public void setTaobao_item_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.taobao_item_id = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertiseRedirectInfo(");
        sb2.append("redirect_type:");
        AdvertiseRedirectType advertiseRedirectType = this.redirect_type;
        if (advertiseRedirectType == null) {
            sb2.append("null");
        } else {
            sb2.append(advertiseRedirectType);
        }
        sb2.append(j2.O);
        sb2.append("redirect_url:");
        String str = this.redirect_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetTaobao_item_id()) {
            sb2.append(j2.O);
            sb2.append("taobao_item_id:");
            String str2 = this.taobao_item_id;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetSys_notify_id()) {
            sb2.append(j2.O);
            sb2.append("sys_notify_id:");
            sb2.append(this.sys_notify_id);
        }
        if (isSetMall_url()) {
            sb2.append(j2.O);
            sb2.append("mall_url:");
            String str3 = this.mall_url;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetMall_url() {
        this.mall_url = null;
    }

    public void unsetRedirect_type() {
        this.redirect_type = null;
    }

    public void unsetRedirect_url() {
        this.redirect_url = null;
    }

    public void unsetSys_notify_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTaobao_item_id() {
        this.taobao_item_id = null;
    }

    public void validate() throws TException {
        if (this.redirect_type == null) {
            throw new TProtocolException("Required field 'redirect_type' was not present! Struct: " + toString());
        }
        if (this.redirect_url != null) {
            return;
        }
        throw new TProtocolException("Required field 'redirect_url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdvertiseRedirectInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetRedirect_type()).compareTo(Boolean.valueOf(other.isSetRedirect_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetRedirect_type() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.redirect_type, (Comparable) other.redirect_type)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetRedirect_url()).compareTo(Boolean.valueOf(other.isSetRedirect_url()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetRedirect_url() && (compareTo4 = TBaseHelper.compareTo(this.redirect_url, other.redirect_url)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetTaobao_item_id()).compareTo(Boolean.valueOf(other.isSetTaobao_item_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTaobao_item_id() && (compareTo3 = TBaseHelper.compareTo(this.taobao_item_id, other.taobao_item_id)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetSys_notify_id()).compareTo(Boolean.valueOf(other.isSetSys_notify_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetSys_notify_id() && (compareTo2 = TBaseHelper.compareTo(this.sys_notify_id, other.sys_notify_id)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetMall_url()).compareTo(Boolean.valueOf(other.isSetMall_url()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetMall_url() || (compareTo = TBaseHelper.compareTo(this.mall_url, other.mall_url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdvertiseRedirectInfo, _Fields> deepCopy2() {
        return new AdvertiseRedirectInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getRedirect_type();
        }
        if (i11 == 2) {
            return getRedirect_url();
        }
        if (i11 == 3) {
            return getTaobao_item_id();
        }
        if (i11 == 4) {
            return Integer.valueOf(getSys_notify_id());
        }
        if (i11 == 5) {
            return getMall_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRedirect_type();
        }
        if (i11 == 2) {
            return isSetRedirect_url();
        }
        if (i11 == 3) {
            return isSetTaobao_item_id();
        }
        if (i11 == 4) {
            return isSetSys_notify_id();
        }
        if (i11 == 5) {
            return isSetMall_url();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$thrift$basic$AdvertiseRedirectInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRedirect_type();
                return;
            } else {
                setRedirect_type((AdvertiseRedirectType) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetRedirect_url();
                return;
            } else {
                setRedirect_url((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetTaobao_item_id();
                return;
            } else {
                setTaobao_item_id((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetSys_notify_id();
                return;
            } else {
                setSys_notify_id(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetMall_url();
        } else {
            setMall_url((String) value);
        }
    }

    public boolean equals(AdvertiseRedirectInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetRedirect_type = isSetRedirect_type();
        boolean isSetRedirect_type2 = that.isSetRedirect_type();
        if ((isSetRedirect_type || isSetRedirect_type2) && !(isSetRedirect_type && isSetRedirect_type2 && this.redirect_type.equals(that.redirect_type))) {
            return false;
        }
        boolean isSetRedirect_url = isSetRedirect_url();
        boolean isSetRedirect_url2 = that.isSetRedirect_url();
        if ((isSetRedirect_url || isSetRedirect_url2) && !(isSetRedirect_url && isSetRedirect_url2 && this.redirect_url.equals(that.redirect_url))) {
            return false;
        }
        boolean isSetTaobao_item_id = isSetTaobao_item_id();
        boolean isSetTaobao_item_id2 = that.isSetTaobao_item_id();
        if ((isSetTaobao_item_id || isSetTaobao_item_id2) && !(isSetTaobao_item_id && isSetTaobao_item_id2 && this.taobao_item_id.equals(that.taobao_item_id))) {
            return false;
        }
        boolean isSetSys_notify_id = isSetSys_notify_id();
        boolean isSetSys_notify_id2 = that.isSetSys_notify_id();
        if ((isSetSys_notify_id || isSetSys_notify_id2) && !(isSetSys_notify_id && isSetSys_notify_id2 && this.sys_notify_id == that.sys_notify_id)) {
            return false;
        }
        boolean isSetMall_url = isSetMall_url();
        boolean isSetMall_url2 = that.isSetMall_url();
        if (isSetMall_url || isSetMall_url2) {
            return isSetMall_url && isSetMall_url2 && this.mall_url.equals(that.mall_url);
        }
        return true;
    }

    public AdvertiseRedirectInfo(AdvertiseRedirectType redirect_type, String redirect_url) {
        this();
        this.redirect_type = redirect_type;
        this.redirect_url = redirect_url;
    }

    public AdvertiseRedirectInfo(AdvertiseRedirectInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAOBAO_ITEM_ID, _Fields.SYS_NOTIFY_ID, _Fields.MALL_URL};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetRedirect_type()) {
            this.redirect_type = other.redirect_type;
        }
        if (other.isSetRedirect_url()) {
            this.redirect_url = other.redirect_url;
        }
        if (other.isSetTaobao_item_id()) {
            this.taobao_item_id = other.taobao_item_id;
        }
        this.sys_notify_id = other.sys_notify_id;
        if (other.isSetMall_url()) {
            this.mall_url = other.mall_url;
        }
    }
}
