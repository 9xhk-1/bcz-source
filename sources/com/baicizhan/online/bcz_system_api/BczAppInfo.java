package com.baicizhan.online.bcz_system_api;

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
public class BczAppInfo implements TBase<BczAppInfo, _Fields>, Serializable, Cloneable, Comparable<BczAppInfo> {
    private static final int __ACTION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int action;
    public String app_channel;
    public String app_name;
    public String device_id;
    public String device_manufacturer;
    public String device_model;
    private _Fields[] optionals;
    public String os_name;
    public String os_sdk;
    public String user_position;
    private static final TStruct STRUCT_DESC = new TStruct("BczAppInfo");
    private static final TField DEVICE_ID_FIELD_DESC = new TField("device_id", (byte) 11, 1);
    private static final TField DEVICE_MANUFACTURER_FIELD_DESC = new TField("device_manufacturer", (byte) 11, 2);
    private static final TField DEVICE_MODEL_FIELD_DESC = new TField("device_model", (byte) 11, 3);
    private static final TField OS_NAME_FIELD_DESC = new TField("os_name", (byte) 11, 4);
    private static final TField OS_SDK_FIELD_DESC = new TField("os_sdk", (byte) 11, 5);
    private static final TField APP_NAME_FIELD_DESC = new TField("app_name", (byte) 11, 6);
    private static final TField APP_CHANNEL_FIELD_DESC = new TField("app_channel", (byte) 11, 7);
    private static final TField USER_POSITION_FIELD_DESC = new TField("user_position", (byte) 11, 8);
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 8, 9);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczAppInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields = iArr;
            try {
                iArr[_Fields.DEVICE_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.DEVICE_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.DEVICE_MODEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.OS_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.OS_SDK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.APP_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.APP_CHANNEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.USER_POSITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[_Fields.ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppInfoStandardScheme extends StandardScheme<BczAppInfo> {
        private BczAppInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczAppInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
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
                            struct.app_name = iprot.readString();
                            struct.setApp_nameIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.app_channel = iprot.readString();
                            struct.setApp_channelIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.user_position = iprot.readString();
                            struct.setUser_positionIsSet(true);
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action = iprot.readI32();
                            struct.setActionIsSet(true);
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
        public void write(TProtocol oprot, BczAppInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczAppInfo.STRUCT_DESC);
            if (struct.device_id != null) {
                oprot.writeFieldBegin(BczAppInfo.DEVICE_ID_FIELD_DESC);
                oprot.writeString(struct.device_id);
                oprot.writeFieldEnd();
            }
            if (struct.device_manufacturer != null) {
                oprot.writeFieldBegin(BczAppInfo.DEVICE_MANUFACTURER_FIELD_DESC);
                oprot.writeString(struct.device_manufacturer);
                oprot.writeFieldEnd();
            }
            if (struct.device_model != null) {
                oprot.writeFieldBegin(BczAppInfo.DEVICE_MODEL_FIELD_DESC);
                oprot.writeString(struct.device_model);
                oprot.writeFieldEnd();
            }
            if (struct.os_name != null) {
                oprot.writeFieldBegin(BczAppInfo.OS_NAME_FIELD_DESC);
                oprot.writeString(struct.os_name);
                oprot.writeFieldEnd();
            }
            if (struct.os_sdk != null) {
                oprot.writeFieldBegin(BczAppInfo.OS_SDK_FIELD_DESC);
                oprot.writeString(struct.os_sdk);
                oprot.writeFieldEnd();
            }
            if (struct.app_name != null) {
                oprot.writeFieldBegin(BczAppInfo.APP_NAME_FIELD_DESC);
                oprot.writeString(struct.app_name);
                oprot.writeFieldEnd();
            }
            if (struct.app_channel != null) {
                oprot.writeFieldBegin(BczAppInfo.APP_CHANNEL_FIELD_DESC);
                oprot.writeString(struct.app_channel);
                oprot.writeFieldEnd();
            }
            if (struct.user_position != null) {
                oprot.writeFieldBegin(BczAppInfo.USER_POSITION_FIELD_DESC);
                oprot.writeString(struct.user_position);
                oprot.writeFieldEnd();
            }
            if (struct.isSetAction()) {
                oprot.writeFieldBegin(BczAppInfo.ACTION_FIELD_DESC);
                oprot.writeI32(struct.action);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppInfoStandardSchemeFactory implements SchemeFactory {
        private BczAppInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczAppInfoStandardScheme getScheme() {
            return new BczAppInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppInfoTupleScheme extends TupleScheme<BczAppInfo> {
        private BczAppInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczAppInfo struct) throws TException {
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
            struct.app_name = tTupleProtocol.readString();
            struct.setApp_nameIsSet(true);
            struct.app_channel = tTupleProtocol.readString();
            struct.setApp_channelIsSet(true);
            struct.user_position = tTupleProtocol.readString();
            struct.setUser_positionIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.action = tTupleProtocol.readI32();
                struct.setActionIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczAppInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.device_id);
            tTupleProtocol.writeString(struct.device_manufacturer);
            tTupleProtocol.writeString(struct.device_model);
            tTupleProtocol.writeString(struct.os_name);
            tTupleProtocol.writeString(struct.os_sdk);
            tTupleProtocol.writeString(struct.app_name);
            tTupleProtocol.writeString(struct.app_channel);
            tTupleProtocol.writeString(struct.user_position);
            BitSet bitSet = new BitSet();
            if (struct.isSetAction()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetAction()) {
                tTupleProtocol.writeI32(struct.action);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczAppInfoTupleSchemeFactory implements SchemeFactory {
        private BczAppInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczAppInfoTupleScheme getScheme() {
            return new BczAppInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        DEVICE_ID(1, "device_id"),
        DEVICE_MANUFACTURER(2, "device_manufacturer"),
        DEVICE_MODEL(3, "device_model"),
        OS_NAME(4, "os_name"),
        OS_SDK(5, "os_sdk"),
        APP_NAME(6, "app_name"),
        APP_CHANNEL(7, "app_channel"),
        USER_POSITION(8, "user_position"),
        ACTION(9, "action");

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
                    return APP_NAME;
                case 7:
                    return APP_CHANNEL;
                case 8:
                    return USER_POSITION;
                case 9:
                    return ACTION;
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
        hashMap.put(StandardScheme.class, new BczAppInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczAppInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.DEVICE_ID, (_Fields) new FieldMetaData("device_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE_MANUFACTURER, (_Fields) new FieldMetaData("device_manufacturer", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DEVICE_MODEL, (_Fields) new FieldMetaData("device_model", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OS_NAME, (_Fields) new FieldMetaData("os_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OS_SDK, (_Fields) new FieldMetaData("os_sdk", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.APP_NAME, (_Fields) new FieldMetaData("app_name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.APP_CHANNEL, (_Fields) new FieldMetaData("app_channel", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.USER_POSITION, (_Fields) new FieldMetaData("user_position", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczAppInfo.class, unmodifiableMap);
    }

    public BczAppInfo() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACTION};
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
        this.app_name = null;
        this.app_channel = null;
        this.user_position = null;
        setActionIsSet(false);
        this.action = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczAppInfo)) {
            return equals((BczAppInfo) that);
        }
        return false;
    }

    public int getAction() {
        return this.action;
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

    public String getOs_name() {
        return this.os_name;
    }

    public String getOs_sdk() {
        return this.os_sdk;
    }

    public String getUser_position() {
        return this.user_position;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
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

    public boolean isSetOs_name() {
        return this.os_name != null;
    }

    public boolean isSetOs_sdk() {
        return this.os_sdk != null;
    }

    public boolean isSetUser_position() {
        return this.user_position != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczAppInfo setAction(int action) {
        this.action = action;
        setActionIsSet(true);
        return this;
    }

    public void setActionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BczAppInfo setApp_channel(String app_channel) {
        this.app_channel = app_channel;
        return this;
    }

    public void setApp_channelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.app_channel = null;
    }

    public BczAppInfo setApp_name(String app_name) {
        this.app_name = app_name;
        return this;
    }

    public void setApp_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.app_name = null;
    }

    public BczAppInfo setDevice_id(String device_id) {
        this.device_id = device_id;
        return this;
    }

    public void setDevice_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_id = null;
    }

    public BczAppInfo setDevice_manufacturer(String device_manufacturer) {
        this.device_manufacturer = device_manufacturer;
        return this;
    }

    public void setDevice_manufacturerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_manufacturer = null;
    }

    public BczAppInfo setDevice_model(String device_model) {
        this.device_model = device_model;
        return this;
    }

    public void setDevice_modelIsSet(boolean value) {
        if (value) {
            return;
        }
        this.device_model = null;
    }

    public BczAppInfo setOs_name(String os_name) {
        this.os_name = os_name;
        return this;
    }

    public void setOs_nameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.os_name = null;
    }

    public BczAppInfo setOs_sdk(String os_sdk) {
        this.os_sdk = os_sdk;
        return this;
    }

    public void setOs_sdkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.os_sdk = null;
    }

    public BczAppInfo setUser_position(String user_position) {
        this.user_position = user_position;
        return this;
    }

    public void setUser_positionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_position = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczAppInfo(");
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
        sb2.append("app_name:");
        String str6 = this.app_name;
        if (str6 == null) {
            sb2.append("null");
        } else {
            sb2.append(str6);
        }
        sb2.append(j2.O);
        sb2.append("app_channel:");
        String str7 = this.app_channel;
        if (str7 == null) {
            sb2.append("null");
        } else {
            sb2.append(str7);
        }
        sb2.append(j2.O);
        sb2.append("user_position:");
        String str8 = this.user_position;
        if (str8 == null) {
            sb2.append("null");
        } else {
            sb2.append(str8);
        }
        if (isSetAction()) {
            sb2.append(j2.O);
            sb2.append("action:");
            sb2.append(this.action);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
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

    public void unsetOs_name() {
        this.os_name = null;
    }

    public void unsetOs_sdk() {
        this.os_sdk = null;
    }

    public void unsetUser_position() {
        this.user_position = null;
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
        if (this.app_name == null) {
            throw new TProtocolException("Required field 'app_name' was not present! Struct: " + toString());
        }
        if (this.app_channel == null) {
            throw new TProtocolException("Required field 'app_channel' was not present! Struct: " + toString());
        }
        if (this.user_position != null) {
            return;
        }
        throw new TProtocolException("Required field 'user_position' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BczAppInfo other) {
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
        int compareTo15 = Boolean.valueOf(isSetApp_name()).compareTo(Boolean.valueOf(other.isSetApp_name()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetApp_name() && (compareTo4 = TBaseHelper.compareTo(this.app_name, other.app_name)) != 0) {
            return compareTo4;
        }
        int compareTo16 = Boolean.valueOf(isSetApp_channel()).compareTo(Boolean.valueOf(other.isSetApp_channel()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (isSetApp_channel() && (compareTo3 = TBaseHelper.compareTo(this.app_channel, other.app_channel)) != 0) {
            return compareTo3;
        }
        int compareTo17 = Boolean.valueOf(isSetUser_position()).compareTo(Boolean.valueOf(other.isSetUser_position()));
        if (compareTo17 != 0) {
            return compareTo17;
        }
        if (isSetUser_position() && (compareTo2 = TBaseHelper.compareTo(this.user_position, other.user_position)) != 0) {
            return compareTo2;
        }
        int compareTo18 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo18 != 0) {
            return compareTo18;
        }
        if (!isSetAction() || (compareTo = TBaseHelper.compareTo(this.action, other.action)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczAppInfo, _Fields> deepCopy2() {
        return new BczAppInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[field.ordinal()]) {
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
                return getApp_name();
            case 7:
                return getApp_channel();
            case 8:
                return getUser_position();
            case 9:
                return Integer.valueOf(getAction());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[field.ordinal()]) {
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
                return isSetApp_name();
            case 7:
                return isSetApp_channel();
            case 8:
                return isSetUser_position();
            case 9:
                return isSetAction();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczAppInfo$_Fields[field.ordinal()]) {
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
                    setApp_name((String) value);
                    break;
                } else {
                    unsetApp_name();
                    break;
                }
            case 7:
                if (value != null) {
                    setApp_channel((String) value);
                    break;
                } else {
                    unsetApp_channel();
                    break;
                }
            case 8:
                if (value != null) {
                    setUser_position((String) value);
                    break;
                } else {
                    unsetUser_position();
                    break;
                }
            case 9:
                if (value != null) {
                    setAction(((Integer) value).intValue());
                    break;
                } else {
                    unsetAction();
                    break;
                }
        }
    }

    public boolean equals(BczAppInfo that) {
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
        boolean isSetApp_name = isSetApp_name();
        boolean isSetApp_name2 = that.isSetApp_name();
        if ((isSetApp_name || isSetApp_name2) && !(isSetApp_name && isSetApp_name2 && this.app_name.equals(that.app_name))) {
            return false;
        }
        boolean isSetApp_channel = isSetApp_channel();
        boolean isSetApp_channel2 = that.isSetApp_channel();
        if ((isSetApp_channel || isSetApp_channel2) && !(isSetApp_channel && isSetApp_channel2 && this.app_channel.equals(that.app_channel))) {
            return false;
        }
        boolean isSetUser_position = isSetUser_position();
        boolean isSetUser_position2 = that.isSetUser_position();
        if ((isSetUser_position || isSetUser_position2) && !(isSetUser_position && isSetUser_position2 && this.user_position.equals(that.user_position))) {
            return false;
        }
        boolean isSetAction = isSetAction();
        boolean isSetAction2 = that.isSetAction();
        if (isSetAction || isSetAction2) {
            return isSetAction && isSetAction2 && this.action == that.action;
        }
        return true;
    }

    public BczAppInfo(String device_id, String device_manufacturer, String device_model, String os_name, String os_sdk, String app_name, String app_channel, String user_position) {
        this();
        this.device_id = device_id;
        this.device_manufacturer = device_manufacturer;
        this.device_model = device_model;
        this.os_name = os_name;
        this.os_sdk = os_sdk;
        this.app_name = app_name;
        this.app_channel = app_channel;
        this.user_position = user_position;
    }

    public BczAppInfo(BczAppInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACTION};
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
        if (other.isSetApp_name()) {
            this.app_name = other.app_name;
        }
        if (other.isSetApp_channel()) {
            this.app_channel = other.app_channel;
        }
        if (other.isSetUser_position()) {
            this.user_position = other.user_position;
        }
        this.action = other.action;
    }
}
