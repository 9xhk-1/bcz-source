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
public class AppBetaUpdateRequest implements TBase<AppBetaUpdateRequest, _Fields>, Serializable, Cloneable, Comparable<AppBetaUpdateRequest> {
    private static final int __LONG_VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String app_channel;
    public String app_name;
    public String device_id;
    public String device_manufacturer;
    public String device_model;
    public int long_version;
    public String os_name;
    public String os_sdk;
    public String short_version;
    private static final TStruct STRUCT_DESC = new TStruct("AppBetaUpdateRequest");
    private static final TField DEVICE_ID_FIELD_DESC = new TField("device_id", (byte) 11, 1);
    private static final TField DEVICE_MANUFACTURER_FIELD_DESC = new TField("device_manufacturer", (byte) 11, 2);
    private static final TField DEVICE_MODEL_FIELD_DESC = new TField("device_model", (byte) 11, 3);
    private static final TField OS_NAME_FIELD_DESC = new TField("os_name", (byte) 11, 4);
    private static final TField OS_SDK_FIELD_DESC = new TField("os_sdk", (byte) 11, 5);
    private static final TField SHORT_VERSION_FIELD_DESC = new TField("short_version", (byte) 11, 6);
    private static final TField LONG_VERSION_FIELD_DESC = new TField("long_version", (byte) 8, 7);
    private static final TField APP_CHANNEL_FIELD_DESC = new TField("app_channel", (byte) 11, 8);
    private static final TField APP_NAME_FIELD_DESC = new TField("app_name", (byte) 11, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.AppBetaUpdateRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields = iArr;
            try {
                iArr[_Fields.DEVICE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.DEVICE_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.DEVICE_MODEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.OS_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.OS_SDK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.SHORT_VERSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.LONG_VERSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.APP_CHANNEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[_Fields.APP_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateRequestStandardScheme extends StandardScheme<AppBetaUpdateRequest> {
        private AppBetaUpdateRequestStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AppBetaUpdateRequest struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetLong_version()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'long_version' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device_id = iprot.readString();
                            struct.setDevice_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device_manufacturer = iprot.readString();
                            struct.setDevice_manufacturerIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.device_model = iprot.readString();
                            struct.setDevice_modelIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.os_name = iprot.readString();
                            struct.setOs_nameIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.os_sdk = iprot.readString();
                            struct.setOs_sdkIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.short_version = iprot.readString();
                            struct.setShort_versionIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.long_version = iprot.readI32();
                            struct.setLong_versionIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.app_channel = iprot.readString();
                            struct.setApp_channelIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.app_name = iprot.readString();
                            struct.setApp_nameIsSet(true);
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
        public void write(TProtocol oprot, AppBetaUpdateRequest struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AppBetaUpdateRequest.STRUCT_DESC);
            if (struct.device_id != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.DEVICE_ID_FIELD_DESC);
                oprot.writeString(struct.device_id);
                oprot.writeFieldEnd();
            }
            if (struct.device_manufacturer != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.DEVICE_MANUFACTURER_FIELD_DESC);
                oprot.writeString(struct.device_manufacturer);
                oprot.writeFieldEnd();
            }
            if (struct.device_model != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.DEVICE_MODEL_FIELD_DESC);
                oprot.writeString(struct.device_model);
                oprot.writeFieldEnd();
            }
            if (struct.os_name != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.OS_NAME_FIELD_DESC);
                oprot.writeString(struct.os_name);
                oprot.writeFieldEnd();
            }
            if (struct.os_sdk != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.OS_SDK_FIELD_DESC);
                oprot.writeString(struct.os_sdk);
                oprot.writeFieldEnd();
            }
            if (struct.short_version != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.SHORT_VERSION_FIELD_DESC);
                oprot.writeString(struct.short_version);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(AppBetaUpdateRequest.LONG_VERSION_FIELD_DESC);
            oprot.writeI32(struct.long_version);
            oprot.writeFieldEnd();
            if (struct.app_channel != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.APP_CHANNEL_FIELD_DESC);
                oprot.writeString(struct.app_channel);
                oprot.writeFieldEnd();
            }
            if (struct.app_name != null) {
                oprot.writeFieldBegin(AppBetaUpdateRequest.APP_NAME_FIELD_DESC);
                oprot.writeString(struct.app_name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateRequestStandardSchemeFactory implements SchemeFactory {
        private AppBetaUpdateRequestStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppBetaUpdateRequestStandardScheme getScheme() {
            return new AppBetaUpdateRequestStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateRequestTupleScheme extends TupleScheme<AppBetaUpdateRequest> {
        private AppBetaUpdateRequestTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AppBetaUpdateRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.device_id = tTupleProtocol.readString();
            struct.setDevice_idIsSet(true);
            struct.device_manufacturer = tTupleProtocol.readString();
            struct.setDevice_manufacturerIsSet(true);
            struct.device_model = tTupleProtocol.readString();
            struct.setDevice_modelIsSet(true);
            struct.os_name = tTupleProtocol.readString();
            struct.setOs_nameIsSet(true);
            struct.os_sdk = tTupleProtocol.readString();
            struct.setOs_sdkIsSet(true);
            struct.short_version = tTupleProtocol.readString();
            struct.setShort_versionIsSet(true);
            struct.long_version = tTupleProtocol.readI32();
            struct.setLong_versionIsSet(true);
            struct.app_channel = tTupleProtocol.readString();
            struct.setApp_channelIsSet(true);
            struct.app_name = tTupleProtocol.readString();
            struct.setApp_nameIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AppBetaUpdateRequest struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.device_id);
            tTupleProtocol.writeString(struct.device_manufacturer);
            tTupleProtocol.writeString(struct.device_model);
            tTupleProtocol.writeString(struct.os_name);
            tTupleProtocol.writeString(struct.os_sdk);
            tTupleProtocol.writeString(struct.short_version);
            tTupleProtocol.writeI32(struct.long_version);
            tTupleProtocol.writeString(struct.app_channel);
            tTupleProtocol.writeString(struct.app_name);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateRequestTupleSchemeFactory implements SchemeFactory {
        private AppBetaUpdateRequestTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppBetaUpdateRequestTupleScheme getScheme() {
            return new AppBetaUpdateRequestTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DEVICE_ID(1, "device_id"),
        DEVICE_MANUFACTURER(2, "device_manufacturer"),
        DEVICE_MODEL(3, "device_model"),
        OS_NAME(4, "os_name"),
        OS_SDK(5, "os_sdk"),
        SHORT_VERSION(6, "short_version"),
        LONG_VERSION(7, "long_version"),
        APP_CHANNEL(8, "app_channel"),
        APP_NAME(9, "app_name");

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
                    return DEVICE_ID;
                case 2:
                    return DEVICE_MANUFACTURER;
                case 3:
                    return DEVICE_MODEL;
                case 4:
                    return OS_NAME;
                case 5:
                    return OS_SDK;
                case 6:
                    return SHORT_VERSION;
                case 7:
                    return LONG_VERSION;
                case 8:
                    return APP_CHANNEL;
                case 9:
                    return APP_NAME;
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
        hashMap.put(StandardScheme.class, new AppBetaUpdateRequestStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AppBetaUpdateRequestTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DEVICE_ID, (_Fields) new FieldMetaData("device_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE_MANUFACTURER, (_Fields) new FieldMetaData("device_manufacturer", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE_MODEL, (_Fields) new FieldMetaData("device_model", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OS_NAME, (_Fields) new FieldMetaData("os_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OS_SDK, (_Fields) new FieldMetaData("os_sdk", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHORT_VERSION, (_Fields) new FieldMetaData("short_version", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LONG_VERSION, (_Fields) new FieldMetaData("long_version", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.APP_CHANNEL, (_Fields) new FieldMetaData("app_channel", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.APP_NAME, (_Fields) new FieldMetaData("app_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AppBetaUpdateRequest.class, unmodifiableMap);
    }

    public AppBetaUpdateRequest() {
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
        this.device_id = null;
        this.device_manufacturer = null;
        this.device_model = null;
        this.os_name = null;
        this.os_sdk = null;
        this.short_version = null;
        setLong_versionIsSet(false);
        this.long_version = 0;
        this.app_channel = null;
        this.app_name = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AppBetaUpdateRequest)) {
            return equals((AppBetaUpdateRequest) that);
        }
        return false;
    }

    public String getApp_channel() {
        return this.app_channel;
    }

    public String getApp_name() {
        return this.app_name;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getDevice_manufacturer() {
        return this.device_manufacturer;
    }

    public String getDevice_model() {
        return this.device_model;
    }

    public int getLong_version() {
        return this.long_version;
    }

    public String getOs_name() {
        return this.os_name;
    }

    public String getOs_sdk() {
        return this.os_sdk;
    }

    public String getShort_version() {
        return this.short_version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetApp_channel() {
        return this.app_channel != null;
    }

    public boolean isSetApp_name() {
        return this.app_name != null;
    }

    public boolean isSetDevice_id() {
        return this.device_id != null;
    }

    public boolean isSetDevice_manufacturer() {
        return this.device_manufacturer != null;
    }

    public boolean isSetDevice_model() {
        return this.device_model != null;
    }

    public boolean isSetLong_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetOs_name() {
        return this.os_name != null;
    }

    public boolean isSetOs_sdk() {
        return this.os_sdk != null;
    }

    public boolean isSetShort_version() {
        return this.short_version != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AppBetaUpdateRequest setApp_channel(String app_channel) {
        this.app_channel = app_channel;
        return this;
    }

    public void setApp_channelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.app_channel = null;
    }

    public AppBetaUpdateRequest setApp_name(String app_name) {
        this.app_name = app_name;
        return this;
    }

    public void setApp_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.app_name = null;
    }

    public AppBetaUpdateRequest setDevice_id(String device_id) {
        this.device_id = device_id;
        return this;
    }

    public void setDevice_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_id = null;
    }

    public AppBetaUpdateRequest setDevice_manufacturer(String device_manufacturer) {
        this.device_manufacturer = device_manufacturer;
        return this;
    }

    public void setDevice_manufacturerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_manufacturer = null;
    }

    public AppBetaUpdateRequest setDevice_model(String device_model) {
        this.device_model = device_model;
        return this;
    }

    public void setDevice_modelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_model = null;
    }

    public AppBetaUpdateRequest setLong_version(int long_version) {
        this.long_version = long_version;
        setLong_versionIsSet(true);
        return this;
    }

    public void setLong_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AppBetaUpdateRequest setOs_name(String os_name) {
        this.os_name = os_name;
        return this;
    }

    public void setOs_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.os_name = null;
    }

    public AppBetaUpdateRequest setOs_sdk(String os_sdk) {
        this.os_sdk = os_sdk;
        return this;
    }

    public void setOs_sdkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.os_sdk = null;
    }

    public AppBetaUpdateRequest setShort_version(String short_version) {
        this.short_version = short_version;
        return this;
    }

    public void setShort_versionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.short_version = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppBetaUpdateRequest(");
        sb2.append("device_id:");
        String str = this.device_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("device_manufacturer:");
        String str2 = this.device_manufacturer;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("device_model:");
        String str3 = this.device_model;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("os_name:");
        String str4 = this.os_name;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("os_sdk:");
        String str5 = this.os_sdk;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(j2.O);
        sb2.append("short_version:");
        String str6 = this.short_version;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        sb2.append(j2.O);
        sb2.append("long_version:");
        sb2.append(this.long_version);
        sb2.append(j2.O);
        sb2.append("app_channel:");
        String str7 = this.app_channel;
        if (str7 == null) {
            sb2.append("null");
        } else {
            sb2.append(str7);
        }
        sb2.append(j2.O);
        sb2.append("app_name:");
        String str8 = this.app_name;
        if (str8 == null) {
            sb2.append("null");
        } else {
            sb2.append(str8);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetApp_channel() {
        this.app_channel = null;
    }

    public void unsetApp_name() {
        this.app_name = null;
    }

    public void unsetDevice_id() {
        this.device_id = null;
    }

    public void unsetDevice_manufacturer() {
        this.device_manufacturer = null;
    }

    public void unsetDevice_model() {
        this.device_model = null;
    }

    public void unsetLong_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetOs_name() {
        this.os_name = null;
    }

    public void unsetOs_sdk() {
        this.os_sdk = null;
    }

    public void unsetShort_version() {
        this.short_version = null;
    }

    public void validate() throws TException {
        if (this.device_id == null) {
            throw new TProtocolException("Required field 'device_id' was not present! Struct: " + toString());
        }
        if (this.device_manufacturer == null) {
            throw new TProtocolException("Required field 'device_manufacturer' was not present! Struct: " + toString());
        }
        if (this.device_model == null) {
            throw new TProtocolException("Required field 'device_model' was not present! Struct: " + toString());
        }
        if (this.os_name == null) {
            throw new TProtocolException("Required field 'os_name' was not present! Struct: " + toString());
        }
        if (this.os_sdk == null) {
            throw new TProtocolException("Required field 'os_sdk' was not present! Struct: " + toString());
        }
        if (this.short_version == null) {
            throw new TProtocolException("Required field 'short_version' was not present! Struct: " + toString());
        }
        if (this.app_channel == null) {
            throw new TProtocolException("Required field 'app_channel' was not present! Struct: " + toString());
        }
        if (this.app_name != null) {
            return;
        }
        throw new TProtocolException("Required field 'app_name' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppBetaUpdateRequest other) {
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
        int compareTo10 = Boolean.valueOf(isSetDevice_id()).compareTo(Boolean.valueOf(other.isSetDevice_id()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetDevice_id() && (compareTo9 = TBaseHelper.compareTo(this.device_id, other.device_id)) != 0) {
            return compareTo9;
        }
        int compareTo11 = Boolean.valueOf(isSetDevice_manufacturer()).compareTo(Boolean.valueOf(other.isSetDevice_manufacturer()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetDevice_manufacturer() && (compareTo8 = TBaseHelper.compareTo(this.device_manufacturer, other.device_manufacturer)) != 0) {
            return compareTo8;
        }
        int compareTo12 = Boolean.valueOf(isSetDevice_model()).compareTo(Boolean.valueOf(other.isSetDevice_model()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetDevice_model() && (compareTo7 = TBaseHelper.compareTo(this.device_model, other.device_model)) != 0) {
            return compareTo7;
        }
        int compareTo13 = Boolean.valueOf(isSetOs_name()).compareTo(Boolean.valueOf(other.isSetOs_name()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetOs_name() && (compareTo6 = TBaseHelper.compareTo(this.os_name, other.os_name)) != 0) {
            return compareTo6;
        }
        int compareTo14 = Boolean.valueOf(isSetOs_sdk()).compareTo(Boolean.valueOf(other.isSetOs_sdk()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetOs_sdk() && (compareTo5 = TBaseHelper.compareTo(this.os_sdk, other.os_sdk)) != 0) {
            return compareTo5;
        }
        int compareTo15 = Boolean.valueOf(isSetShort_version()).compareTo(Boolean.valueOf(other.isSetShort_version()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetShort_version() && (compareTo4 = TBaseHelper.compareTo(this.short_version, other.short_version)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetLong_version()).compareTo(Boolean.valueOf(other.isSetLong_version()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetLong_version() && (compareTo3 = TBaseHelper.compareTo(this.long_version, other.long_version)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetApp_channel()).compareTo(Boolean.valueOf(other.isSetApp_channel()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetApp_channel() && (compareTo2 = TBaseHelper.compareTo(this.app_channel, other.app_channel)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetApp_name()).compareTo(Boolean.valueOf(other.isSetApp_name()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetApp_name() || (compareTo = TBaseHelper.compareTo(this.app_name, other.app_name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AppBetaUpdateRequest, _Fields> deepCopy2() {
        return new AppBetaUpdateRequest(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[field.ordinal()]) {
            case 1:
                return getDevice_id();
            case 2:
                return getDevice_manufacturer();
            case 3:
                return getDevice_model();
            case 4:
                return getOs_name();
            case 5:
                return getOs_sdk();
            case 6:
                return getShort_version();
            case 7:
                return Integer.valueOf(getLong_version());
            case 8:
                return getApp_channel();
            case 9:
                return getApp_name();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[field.ordinal()]) {
            case 1:
                return isSetDevice_id();
            case 2:
                return isSetDevice_manufacturer();
            case 3:
                return isSetDevice_model();
            case 4:
                return isSetOs_name();
            case 5:
                return isSetOs_sdk();
            case 6:
                return isSetShort_version();
            case 7:
                return isSetLong_version();
            case 8:
                return isSetApp_channel();
            case 9:
                return isSetApp_name();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateRequest$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setDevice_id((String) value);
                    break;
                } else {
                    unsetDevice_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setDevice_manufacturer((String) value);
                    break;
                } else {
                    unsetDevice_manufacturer();
                    break;
                }
            case 3:
                if (value != null) {
                    setDevice_model((String) value);
                    break;
                } else {
                    unsetDevice_model();
                    break;
                }
            case 4:
                if (value != null) {
                    setOs_name((String) value);
                    break;
                } else {
                    unsetOs_name();
                    break;
                }
            case 5:
                if (value != null) {
                    setOs_sdk((String) value);
                    break;
                } else {
                    unsetOs_sdk();
                    break;
                }
            case 6:
                if (value != null) {
                    setShort_version((String) value);
                    break;
                } else {
                    unsetShort_version();
                    break;
                }
            case 7:
                if (value != null) {
                    setLong_version(((Integer) value).intValue());
                    break;
                } else {
                    unsetLong_version();
                    break;
                }
            case 8:
                if (value != null) {
                    setApp_channel((String) value);
                    break;
                } else {
                    unsetApp_channel();
                    break;
                }
            case 9:
                if (value != null) {
                    setApp_name((String) value);
                    break;
                } else {
                    unsetApp_name();
                    break;
                }
        }
    }

    public AppBetaUpdateRequest(String device_id, String device_manufacturer, String device_model, String os_name, String os_sdk, String short_version, int long_version, String app_channel, String app_name) {
        this();
        this.device_id = device_id;
        this.device_manufacturer = device_manufacturer;
        this.device_model = device_model;
        this.os_name = os_name;
        this.os_sdk = os_sdk;
        this.short_version = short_version;
        this.long_version = long_version;
        setLong_versionIsSet(true);
        this.app_channel = app_channel;
        this.app_name = app_name;
    }

    public boolean equals(AppBetaUpdateRequest that) {
        if (that == null) {
            return false;
        }
        boolean isSetDevice_id = isSetDevice_id();
        boolean isSetDevice_id2 = that.isSetDevice_id();
        if ((isSetDevice_id || isSetDevice_id2) && !(isSetDevice_id && isSetDevice_id2 && this.device_id.equals(that.device_id))) {
            return false;
        }
        boolean isSetDevice_manufacturer = isSetDevice_manufacturer();
        boolean isSetDevice_manufacturer2 = that.isSetDevice_manufacturer();
        if ((isSetDevice_manufacturer || isSetDevice_manufacturer2) && !(isSetDevice_manufacturer && isSetDevice_manufacturer2 && this.device_manufacturer.equals(that.device_manufacturer))) {
            return false;
        }
        boolean isSetDevice_model = isSetDevice_model();
        boolean isSetDevice_model2 = that.isSetDevice_model();
        if ((isSetDevice_model || isSetDevice_model2) && !(isSetDevice_model && isSetDevice_model2 && this.device_model.equals(that.device_model))) {
            return false;
        }
        boolean isSetOs_name = isSetOs_name();
        boolean isSetOs_name2 = that.isSetOs_name();
        if ((isSetOs_name || isSetOs_name2) && !(isSetOs_name && isSetOs_name2 && this.os_name.equals(that.os_name))) {
            return false;
        }
        boolean isSetOs_sdk = isSetOs_sdk();
        boolean isSetOs_sdk2 = that.isSetOs_sdk();
        if ((isSetOs_sdk || isSetOs_sdk2) && !(isSetOs_sdk && isSetOs_sdk2 && this.os_sdk.equals(that.os_sdk))) {
            return false;
        }
        boolean isSetShort_version = isSetShort_version();
        boolean isSetShort_version2 = that.isSetShort_version();
        if (((isSetShort_version || isSetShort_version2) && !(isSetShort_version && isSetShort_version2 && this.short_version.equals(that.short_version))) || this.long_version != that.long_version) {
            return false;
        }
        boolean isSetApp_channel = isSetApp_channel();
        boolean isSetApp_channel2 = that.isSetApp_channel();
        if ((isSetApp_channel || isSetApp_channel2) && !(isSetApp_channel && isSetApp_channel2 && this.app_channel.equals(that.app_channel))) {
            return false;
        }
        boolean isSetApp_name = isSetApp_name();
        boolean isSetApp_name2 = that.isSetApp_name();
        if (isSetApp_name || isSetApp_name2) {
            return isSetApp_name && isSetApp_name2 && this.app_name.equals(that.app_name);
        }
        return true;
    }

    public AppBetaUpdateRequest(AppBetaUpdateRequest other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetDevice_id()) {
            this.device_id = other.device_id;
        }
        if (other.isSetDevice_manufacturer()) {
            this.device_manufacturer = other.device_manufacturer;
        }
        if (other.isSetDevice_model()) {
            this.device_model = other.device_model;
        }
        if (other.isSetOs_name()) {
            this.os_name = other.os_name;
        }
        if (other.isSetOs_sdk()) {
            this.os_sdk = other.os_sdk;
        }
        if (other.isSetShort_version()) {
            this.short_version = other.short_version;
        }
        this.long_version = other.long_version;
        if (other.isSetApp_channel()) {
            this.app_channel = other.app_channel;
        }
        if (other.isSetApp_name()) {
            this.app_name = other.app_name;
        }
    }
}
