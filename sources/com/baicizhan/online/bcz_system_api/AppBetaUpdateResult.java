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
public class AppBetaUpdateResult implements TBase<AppBetaUpdateResult, _Fields>, Serializable, Cloneable, Comparable<AppBetaUpdateResult> {
    private static final int __ACTION_TYPE_ISSET_ID = 1;
    private static final int __IMAGE_INDEX_ISSET_ID = 2;
    private static final int __TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int action_type;
    public int image_index;
    public String link;
    public String new_version;
    private _Fields[] optionals;
    public int type;
    public String version_apk_md5;
    public String version_description;
    public String version_url;
    private static final TStruct STRUCT_DESC = new TStruct("AppBetaUpdateResult");
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 1);
    private static final TField VERSION_DESCRIPTION_FIELD_DESC = new TField("version_description", (byte) 11, 2);
    private static final TField VERSION_URL_FIELD_DESC = new TField("version_url", (byte) 11, 3);
    private static final TField VERSION_APK_MD5_FIELD_DESC = new TField("version_apk_md5", (byte) 11, 4);
    private static final TField NEW_VERSION_FIELD_DESC = new TField("new_version", (byte) 11, 5);
    private static final TField ACTION_TYPE_FIELD_DESC = new TField("action_type", (byte) 8, 6);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 7);
    private static final TField IMAGE_INDEX_FIELD_DESC = new TField("image_index", (byte) 8, 8);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.AppBetaUpdateResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields = iArr;
            try {
                iArr[_Fields.TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.VERSION_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.VERSION_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.VERSION_APK_MD5.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.NEW_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.ACTION_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.LINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[_Fields.IMAGE_INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateResultStandardScheme extends StandardScheme<AppBetaUpdateResult> {
        private AppBetaUpdateResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AppBetaUpdateResult struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (struct.isSetType()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.type = iprot.readI32();
                            struct.setTypeIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.version_description = iprot.readString();
                            struct.setVersion_descriptionIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.version_url = iprot.readString();
                            struct.setVersion_urlIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.version_apk_md5 = iprot.readString();
                            struct.setVersion_apk_md5IsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.new_version = iprot.readString();
                            struct.setNew_versionIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.action_type = iprot.readI32();
                            struct.setAction_typeIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.link = iprot.readString();
                            struct.setLinkIsSet(true);
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.image_index = iprot.readI32();
                            struct.setImage_indexIsSet(true);
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
        public void write(TProtocol oprot, AppBetaUpdateResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AppBetaUpdateResult.STRUCT_DESC);
            oprot.writeFieldBegin(AppBetaUpdateResult.TYPE_FIELD_DESC);
            oprot.writeI32(struct.type);
            oprot.writeFieldEnd();
            if (struct.version_description != null) {
                oprot.writeFieldBegin(AppBetaUpdateResult.VERSION_DESCRIPTION_FIELD_DESC);
                oprot.writeString(struct.version_description);
                oprot.writeFieldEnd();
            }
            if (struct.version_url != null) {
                oprot.writeFieldBegin(AppBetaUpdateResult.VERSION_URL_FIELD_DESC);
                oprot.writeString(struct.version_url);
                oprot.writeFieldEnd();
            }
            if (struct.version_apk_md5 != null) {
                oprot.writeFieldBegin(AppBetaUpdateResult.VERSION_APK_MD5_FIELD_DESC);
                oprot.writeString(struct.version_apk_md5);
                oprot.writeFieldEnd();
            }
            if (struct.new_version != null) {
                oprot.writeFieldBegin(AppBetaUpdateResult.NEW_VERSION_FIELD_DESC);
                oprot.writeString(struct.new_version);
                oprot.writeFieldEnd();
            }
            if (struct.isSetAction_type()) {
                oprot.writeFieldBegin(AppBetaUpdateResult.ACTION_TYPE_FIELD_DESC);
                oprot.writeI32(struct.action_type);
                oprot.writeFieldEnd();
            }
            if (struct.link != null && struct.isSetLink()) {
                oprot.writeFieldBegin(AppBetaUpdateResult.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.isSetImage_index()) {
                oprot.writeFieldBegin(AppBetaUpdateResult.IMAGE_INDEX_FIELD_DESC);
                oprot.writeI32(struct.image_index);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateResultStandardSchemeFactory implements SchemeFactory {
        private AppBetaUpdateResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppBetaUpdateResultStandardScheme getScheme() {
            return new AppBetaUpdateResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateResultTupleScheme extends TupleScheme<AppBetaUpdateResult> {
        private AppBetaUpdateResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AppBetaUpdateResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.type = tTupleProtocol.readI32();
            struct.setTypeIsSet(true);
            struct.version_description = tTupleProtocol.readString();
            struct.setVersion_descriptionIsSet(true);
            struct.version_url = tTupleProtocol.readString();
            struct.setVersion_urlIsSet(true);
            struct.version_apk_md5 = tTupleProtocol.readString();
            struct.setVersion_apk_md5IsSet(true);
            struct.new_version = tTupleProtocol.readString();
            struct.setNew_versionIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.action_type = tTupleProtocol.readI32();
                struct.setAction_typeIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.link = tTupleProtocol.readString();
                struct.setLinkIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.image_index = tTupleProtocol.readI32();
                struct.setImage_indexIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AppBetaUpdateResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.type);
            tTupleProtocol.writeString(struct.version_description);
            tTupleProtocol.writeString(struct.version_url);
            tTupleProtocol.writeString(struct.version_apk_md5);
            tTupleProtocol.writeString(struct.new_version);
            BitSet bitSet = new BitSet();
            if (struct.isSetAction_type()) {
                bitSet.set(0);
            }
            if (struct.isSetLink()) {
                bitSet.set(1);
            }
            if (struct.isSetImage_index()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetAction_type()) {
                tTupleProtocol.writeI32(struct.action_type);
            }
            if (struct.isSetLink()) {
                tTupleProtocol.writeString(struct.link);
            }
            if (struct.isSetImage_index()) {
                tTupleProtocol.writeI32(struct.image_index);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AppBetaUpdateResultTupleSchemeFactory implements SchemeFactory {
        private AppBetaUpdateResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AppBetaUpdateResultTupleScheme getScheme() {
            return new AppBetaUpdateResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TYPE(1, "type"),
        VERSION_DESCRIPTION(2, "version_description"),
        VERSION_URL(3, "version_url"),
        VERSION_APK_MD5(4, "version_apk_md5"),
        NEW_VERSION(5, "new_version"),
        ACTION_TYPE(6, "action_type"),
        LINK(7, y9.b.f99687c),
        IMAGE_INDEX(8, "image_index");

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
                    return TYPE;
                case 2:
                    return VERSION_DESCRIPTION;
                case 3:
                    return VERSION_URL;
                case 4:
                    return VERSION_APK_MD5;
                case 5:
                    return NEW_VERSION;
                case 6:
                    return ACTION_TYPE;
                case 7:
                    return LINK;
                case 8:
                    return IMAGE_INDEX;
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
        hashMap.put(StandardScheme.class, new AppBetaUpdateResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AppBetaUpdateResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.VERSION_DESCRIPTION, (_Fields) new FieldMetaData("version_description", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERSION_URL, (_Fields) new FieldMetaData("version_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.VERSION_APK_MD5, (_Fields) new FieldMetaData("version_apk_md5", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.NEW_VERSION, (_Fields) new FieldMetaData("new_version", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION_TYPE, (_Fields) new FieldMetaData("action_type", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE_INDEX, (_Fields) new FieldMetaData("image_index", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AppBetaUpdateResult.class, unmodifiableMap);
    }

    public AppBetaUpdateResult() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACTION_TYPE, _Fields.LINK, _Fields.IMAGE_INDEX};
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
        setTypeIsSet(false);
        this.type = 0;
        this.version_description = null;
        this.version_url = null;
        this.version_apk_md5 = null;
        this.new_version = null;
        setAction_typeIsSet(false);
        this.action_type = 0;
        this.link = null;
        setImage_indexIsSet(false);
        this.image_index = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AppBetaUpdateResult)) {
            return equals((AppBetaUpdateResult) that);
        }
        return false;
    }

    public int getAction_type() {
        return this.action_type;
    }

    public int getImage_index() {
        return this.image_index;
    }

    public String getLink() {
        return this.link;
    }

    public String getNew_version() {
        return this.new_version;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion_apk_md5() {
        return this.version_apk_md5;
    }

    public String getVersion_description() {
        return this.version_description;
    }

    public String getVersion_url() {
        return this.version_url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetImage_index() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetNew_version() {
        return this.new_version != null;
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetVersion_apk_md5() {
        return this.version_apk_md5 != null;
    }

    public boolean isSetVersion_description() {
        return this.version_description != null;
    }

    public boolean isSetVersion_url() {
        return this.version_url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AppBetaUpdateResult setAction_type(int action_type) {
        this.action_type = action_type;
        setAction_typeIsSet(true);
        return this;
    }

    public void setAction_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public AppBetaUpdateResult setImage_index(int image_index) {
        this.image_index = image_index;
        setImage_indexIsSet(true);
        return this;
    }

    public void setImage_indexIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public AppBetaUpdateResult setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public AppBetaUpdateResult setNew_version(String new_version) {
        this.new_version = new_version;
        return this;
    }

    public void setNew_versionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.new_version = null;
    }

    public AppBetaUpdateResult setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AppBetaUpdateResult setVersion_apk_md5(String version_apk_md5) {
        this.version_apk_md5 = version_apk_md5;
        return this;
    }

    public void setVersion_apk_md5IsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_apk_md5 = null;
    }

    public AppBetaUpdateResult setVersion_description(String version_description) {
        this.version_description = version_description;
        return this;
    }

    public void setVersion_descriptionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_description = null;
    }

    public AppBetaUpdateResult setVersion_url(String version_url) {
        this.version_url = version_url;
        return this;
    }

    public void setVersion_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.version_url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppBetaUpdateResult(");
        sb2.append("type:");
        sb2.append(this.type);
        sb2.append(j2.O);
        sb2.append("version_description:");
        String str = this.version_description;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("version_url:");
        String str2 = this.version_url;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("version_apk_md5:");
        String str3 = this.version_apk_md5;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("new_version:");
        String str4 = this.new_version;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        if (isSetAction_type()) {
            sb2.append(j2.O);
            sb2.append("action_type:");
            sb2.append(this.action_type);
        }
        if (isSetLink()) {
            sb2.append(j2.O);
            sb2.append("link:");
            String str5 = this.link;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (isSetImage_index()) {
            sb2.append(j2.O);
            sb2.append("image_index:");
            sb2.append(this.image_index);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetImage_index() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetNew_version() {
        this.new_version = null;
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetVersion_apk_md5() {
        this.version_apk_md5 = null;
    }

    public void unsetVersion_description() {
        this.version_description = null;
    }

    public void unsetVersion_url() {
        this.version_url = null;
    }

    public void validate() throws TException {
        if (this.version_description == null) {
            throw new TProtocolException("Required field 'version_description' was not present! Struct: " + toString());
        }
        if (this.version_url == null) {
            throw new TProtocolException("Required field 'version_url' was not present! Struct: " + toString());
        }
        if (this.version_apk_md5 == null) {
            throw new TProtocolException("Required field 'version_apk_md5' was not present! Struct: " + toString());
        }
        if (this.new_version != null) {
            return;
        }
        throw new TProtocolException("Required field 'new_version' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppBetaUpdateResult other) {
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
        int compareTo9 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetType() && (compareTo8 = TBaseHelper.compareTo(this.type, other.type)) != 0) {
            return compareTo8;
        }
        int compareTo10 = Boolean.valueOf(isSetVersion_description()).compareTo(Boolean.valueOf(other.isSetVersion_description()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetVersion_description() && (compareTo7 = TBaseHelper.compareTo(this.version_description, other.version_description)) != 0) {
            return compareTo7;
        }
        int compareTo11 = Boolean.valueOf(isSetVersion_url()).compareTo(Boolean.valueOf(other.isSetVersion_url()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetVersion_url() && (compareTo6 = TBaseHelper.compareTo(this.version_url, other.version_url)) != 0) {
            return compareTo6;
        }
        int compareTo12 = Boolean.valueOf(isSetVersion_apk_md5()).compareTo(Boolean.valueOf(other.isSetVersion_apk_md5()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetVersion_apk_md5() && (compareTo5 = TBaseHelper.compareTo(this.version_apk_md5, other.version_apk_md5)) != 0) {
            return compareTo5;
        }
        int compareTo13 = Boolean.valueOf(isSetNew_version()).compareTo(Boolean.valueOf(other.isSetNew_version()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetNew_version() && (compareTo4 = TBaseHelper.compareTo(this.new_version, other.new_version)) != 0) {
            return compareTo4;
        }
        int compareTo14 = Boolean.valueOf(isSetAction_type()).compareTo(Boolean.valueOf(other.isSetAction_type()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (isSetAction_type() && (compareTo3 = TBaseHelper.compareTo(this.action_type, other.action_type)) != 0) {
            return compareTo3;
        }
        int compareTo15 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (isSetLink() && (compareTo2 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo2;
        }
        int compareTo16 = Boolean.valueOf(isSetImage_index()).compareTo(Boolean.valueOf(other.isSetImage_index()));
        if (compareTo16 != 0) {
            return compareTo16;
        }
        if (!isSetImage_index() || (compareTo = TBaseHelper.compareTo(this.image_index, other.image_index)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AppBetaUpdateResult, _Fields> deepCopy2() {
        return new AppBetaUpdateResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getType());
            case 2:
                return getVersion_description();
            case 3:
                return getVersion_url();
            case 4:
                return getVersion_apk_md5();
            case 5:
                return getNew_version();
            case 6:
                return Integer.valueOf(getAction_type());
            case 7:
                return getLink();
            case 8:
                return Integer.valueOf(getImage_index());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[field.ordinal()]) {
            case 1:
                return isSetType();
            case 2:
                return isSetVersion_description();
            case 3:
                return isSetVersion_url();
            case 4:
                return isSetVersion_apk_md5();
            case 5:
                return isSetNew_version();
            case 6:
                return isSetAction_type();
            case 7:
                return isSetLink();
            case 8:
                return isSetImage_index();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$AppBetaUpdateResult$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setType(((Integer) value).intValue());
                    break;
                } else {
                    unsetType();
                    break;
                }
            case 2:
                if (value != null) {
                    setVersion_description((String) value);
                    break;
                } else {
                    unsetVersion_description();
                    break;
                }
            case 3:
                if (value != null) {
                    setVersion_url((String) value);
                    break;
                } else {
                    unsetVersion_url();
                    break;
                }
            case 4:
                if (value != null) {
                    setVersion_apk_md5((String) value);
                    break;
                } else {
                    unsetVersion_apk_md5();
                    break;
                }
            case 5:
                if (value != null) {
                    setNew_version((String) value);
                    break;
                } else {
                    unsetNew_version();
                    break;
                }
            case 6:
                if (value != null) {
                    setAction_type(((Integer) value).intValue());
                    break;
                } else {
                    unsetAction_type();
                    break;
                }
            case 7:
                if (value != null) {
                    setLink((String) value);
                    break;
                } else {
                    unsetLink();
                    break;
                }
            case 8:
                if (value != null) {
                    setImage_index(((Integer) value).intValue());
                    break;
                } else {
                    unsetImage_index();
                    break;
                }
        }
    }

    public boolean equals(AppBetaUpdateResult that) {
        if (that == null || this.type != that.type) {
            return false;
        }
        boolean isSetVersion_description = isSetVersion_description();
        boolean isSetVersion_description2 = that.isSetVersion_description();
        if ((isSetVersion_description || isSetVersion_description2) && !(isSetVersion_description && isSetVersion_description2 && this.version_description.equals(that.version_description))) {
            return false;
        }
        boolean isSetVersion_url = isSetVersion_url();
        boolean isSetVersion_url2 = that.isSetVersion_url();
        if ((isSetVersion_url || isSetVersion_url2) && !(isSetVersion_url && isSetVersion_url2 && this.version_url.equals(that.version_url))) {
            return false;
        }
        boolean isSetVersion_apk_md5 = isSetVersion_apk_md5();
        boolean isSetVersion_apk_md52 = that.isSetVersion_apk_md5();
        if ((isSetVersion_apk_md5 || isSetVersion_apk_md52) && !(isSetVersion_apk_md5 && isSetVersion_apk_md52 && this.version_apk_md5.equals(that.version_apk_md5))) {
            return false;
        }
        boolean isSetNew_version = isSetNew_version();
        boolean isSetNew_version2 = that.isSetNew_version();
        if ((isSetNew_version || isSetNew_version2) && !(isSetNew_version && isSetNew_version2 && this.new_version.equals(that.new_version))) {
            return false;
        }
        boolean isSetAction_type = isSetAction_type();
        boolean isSetAction_type2 = that.isSetAction_type();
        if ((isSetAction_type || isSetAction_type2) && !(isSetAction_type && isSetAction_type2 && this.action_type == that.action_type)) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetImage_index = isSetImage_index();
        boolean isSetImage_index2 = that.isSetImage_index();
        if (isSetImage_index || isSetImage_index2) {
            return isSetImage_index && isSetImage_index2 && this.image_index == that.image_index;
        }
        return true;
    }

    public AppBetaUpdateResult(int type, String version_description, String version_url, String version_apk_md5, String new_version) {
        this();
        this.type = type;
        setTypeIsSet(true);
        this.version_description = version_description;
        this.version_url = version_url;
        this.version_apk_md5 = version_apk_md5;
        this.new_version = new_version;
    }

    public AppBetaUpdateResult(AppBetaUpdateResult other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.ACTION_TYPE, _Fields.LINK, _Fields.IMAGE_INDEX};
        this.__isset_bitfield = other.__isset_bitfield;
        this.type = other.type;
        if (other.isSetVersion_description()) {
            this.version_description = other.version_description;
        }
        if (other.isSetVersion_url()) {
            this.version_url = other.version_url;
        }
        if (other.isSetVersion_apk_md5()) {
            this.version_apk_md5 = other.version_apk_md5;
        }
        if (other.isSetNew_version()) {
            this.new_version = other.new_version;
        }
        this.action_type = other.action_type;
        if (other.isSetLink()) {
            this.link = other.link;
        }
        this.image_index = other.image_index;
    }
}
