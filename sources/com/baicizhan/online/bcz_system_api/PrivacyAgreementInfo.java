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
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TMap;
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
public class PrivacyAgreementInfo implements TBase<PrivacyAgreementInfo, _Fields>, Serializable, Cloneable, Comparable<PrivacyAgreementInfo> {
    private static final int __PRIVACY_VERSION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public String content;
    public Map<String, String> privacy_urls;
    public int privacy_version;
    private static final TStruct STRUCT_DESC = new TStruct("PrivacyAgreementInfo");
    private static final TField CONTENT_FIELD_DESC = new TField("content", (byte) 11, 1);
    private static final TField PRIVACY_VERSION_FIELD_DESC = new TField("privacy_version", (byte) 8, 2);
    private static final TField PRIVACY_URLS_FIELD_DESC = new TField("privacy_urls", (byte) 13, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.PrivacyAgreementInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields = iArr;
            try {
                iArr[_Fields.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields[_Fields.PRIVACY_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields[_Fields.PRIVACY_URLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrivacyAgreementInfoStandardScheme extends StandardScheme<PrivacyAgreementInfo> {
        private PrivacyAgreementInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, PrivacyAgreementInfo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 13) {
                            TMap readMapBegin = iprot.readMapBegin();
                            struct.privacy_urls = new HashMap(readMapBegin.size * 2);
                            for (int i11 = 0; i11 < readMapBegin.size; i11++) {
                                struct.privacy_urls.put(iprot.readString(), iprot.readString());
                            }
                            iprot.readMapEnd();
                            struct.setPrivacy_urlsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.privacy_version = iprot.readI32();
                        struct.setPrivacy_versionIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.content = iprot.readString();
                    struct.setContentIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetPrivacy_version()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'privacy_version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, PrivacyAgreementInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(PrivacyAgreementInfo.STRUCT_DESC);
            if (struct.content != null) {
                oprot.writeFieldBegin(PrivacyAgreementInfo.CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(PrivacyAgreementInfo.PRIVACY_VERSION_FIELD_DESC);
            oprot.writeI32(struct.privacy_version);
            oprot.writeFieldEnd();
            if (struct.privacy_urls != null) {
                oprot.writeFieldBegin(PrivacyAgreementInfo.PRIVACY_URLS_FIELD_DESC);
                oprot.writeMapBegin(new TMap((byte) 11, (byte) 11, struct.privacy_urls.size()));
                for (Map.Entry<String, String> entry : struct.privacy_urls.entrySet()) {
                    oprot.writeString(entry.getKey());
                    oprot.writeString(entry.getValue());
                }
                oprot.writeMapEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrivacyAgreementInfoStandardSchemeFactory implements SchemeFactory {
        private PrivacyAgreementInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PrivacyAgreementInfoStandardScheme getScheme() {
            return new PrivacyAgreementInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrivacyAgreementInfoTupleScheme extends TupleScheme<PrivacyAgreementInfo> {
        private PrivacyAgreementInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, PrivacyAgreementInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.content = tTupleProtocol.readString();
            struct.setContentIsSet(true);
            struct.privacy_version = tTupleProtocol.readI32();
            struct.setPrivacy_versionIsSet(true);
            TMap tMap = new TMap((byte) 11, (byte) 11, tTupleProtocol.readI32());
            struct.privacy_urls = new HashMap(tMap.size * 2);
            for (int i11 = 0; i11 < tMap.size; i11++) {
                struct.privacy_urls.put(tTupleProtocol.readString(), tTupleProtocol.readString());
            }
            struct.setPrivacy_urlsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, PrivacyAgreementInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.content);
            tTupleProtocol.writeI32(struct.privacy_version);
            tTupleProtocol.writeI32(struct.privacy_urls.size());
            for (Map.Entry<String, String> entry : struct.privacy_urls.entrySet()) {
                tTupleProtocol.writeString(entry.getKey());
                tTupleProtocol.writeString(entry.getValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PrivacyAgreementInfoTupleSchemeFactory implements SchemeFactory {
        private PrivacyAgreementInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public PrivacyAgreementInfoTupleScheme getScheme() {
            return new PrivacyAgreementInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CONTENT(1, "content"),
        PRIVACY_VERSION(2, "privacy_version"),
        PRIVACY_URLS(3, "privacy_urls");

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
                return CONTENT;
            }
            if (fieldId == 2) {
                return PRIVACY_VERSION;
            }
            if (fieldId != 3) {
                return null;
            }
            return PRIVACY_URLS;
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
        hashMap.put(StandardScheme.class, new PrivacyAgreementInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new PrivacyAgreementInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CONTENT, (_Fields) new FieldMetaData("content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PRIVACY_VERSION, (_Fields) new FieldMetaData("privacy_version", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.PRIVACY_URLS, (_Fields) new FieldMetaData("privacy_urls", (byte) 1, new MapMetaData((byte) 13, new FieldValueMetaData((byte) 11), new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(PrivacyAgreementInfo.class, unmodifiableMap);
    }

    public PrivacyAgreementInfo() {
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
        this.content = null;
        setPrivacy_versionIsSet(false);
        this.privacy_version = 0;
        this.privacy_urls = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof PrivacyAgreementInfo)) {
            return equals((PrivacyAgreementInfo) that);
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public Map<String, String> getPrivacy_urls() {
        return this.privacy_urls;
    }

    public int getPrivacy_urlsSize() {
        Map<String, String> map = this.privacy_urls;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public int getPrivacy_version() {
        return this.privacy_version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetContent() {
        return this.content != null;
    }

    public boolean isSetPrivacy_urls() {
        return this.privacy_urls != null;
    }

    public boolean isSetPrivacy_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public void putToPrivacy_urls(String key, String val) {
        if (this.privacy_urls == null) {
            this.privacy_urls = new HashMap();
        }
        this.privacy_urls.put(key, val);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public PrivacyAgreementInfo setContent(String content) {
        this.content = content;
        return this;
    }

    public void setContentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.content = null;
    }

    public PrivacyAgreementInfo setPrivacy_urls(Map<String, String> privacy_urls) {
        this.privacy_urls = privacy_urls;
        return this;
    }

    public void setPrivacy_urlsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.privacy_urls = null;
    }

    public PrivacyAgreementInfo setPrivacy_version(int privacy_version) {
        this.privacy_version = privacy_version;
        setPrivacy_versionIsSet(true);
        return this;
    }

    public void setPrivacy_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PrivacyAgreementInfo(");
        sb2.append("content:");
        String str = this.content;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("privacy_version:");
        sb2.append(this.privacy_version);
        sb2.append(j2.O);
        sb2.append("privacy_urls:");
        Map<String, String> map = this.privacy_urls;
        if (map == null) {
            sb2.append("null");
        } else {
            sb2.append(map);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetContent() {
        this.content = null;
    }

    public void unsetPrivacy_urls() {
        this.privacy_urls = null;
    }

    public void unsetPrivacy_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.content == null) {
            throw new TProtocolException("Required field 'content' was not present! Struct: " + toString());
        }
        if (this.privacy_urls != null) {
            return;
        }
        throw new TProtocolException("Required field 'privacy_urls' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(PrivacyAgreementInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetContent()).compareTo(Boolean.valueOf(other.isSetContent()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetContent() && (compareTo3 = TBaseHelper.compareTo(this.content, other.content)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPrivacy_version()).compareTo(Boolean.valueOf(other.isSetPrivacy_version()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPrivacy_version() && (compareTo2 = TBaseHelper.compareTo(this.privacy_version, other.privacy_version)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetPrivacy_urls()).compareTo(Boolean.valueOf(other.isSetPrivacy_urls()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetPrivacy_urls() || (compareTo = TBaseHelper.compareTo((Map) this.privacy_urls, (Map) other.privacy_urls)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<PrivacyAgreementInfo, _Fields> deepCopy2() {
        return new PrivacyAgreementInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getContent();
        }
        if (i11 == 2) {
            return Integer.valueOf(getPrivacy_version());
        }
        if (i11 == 3) {
            return getPrivacy_urls();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetContent();
        }
        if (i11 == 2) {
            return isSetPrivacy_version();
        }
        if (i11 == 3) {
            return isSetPrivacy_urls();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$PrivacyAgreementInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetContent();
                return;
            } else {
                setContent((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPrivacy_version();
                return;
            } else {
                setPrivacy_version(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetPrivacy_urls();
        } else {
            setPrivacy_urls((Map) value);
        }
    }

    public PrivacyAgreementInfo(String content, int privacy_version, Map<String, String> privacy_urls) {
        this();
        this.content = content;
        this.privacy_version = privacy_version;
        setPrivacy_versionIsSet(true);
        this.privacy_urls = privacy_urls;
    }

    public boolean equals(PrivacyAgreementInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetContent = isSetContent();
        boolean isSetContent2 = that.isSetContent();
        if (((isSetContent || isSetContent2) && !(isSetContent && isSetContent2 && this.content.equals(that.content))) || this.privacy_version != that.privacy_version) {
            return false;
        }
        boolean isSetPrivacy_urls = isSetPrivacy_urls();
        boolean isSetPrivacy_urls2 = that.isSetPrivacy_urls();
        if (isSetPrivacy_urls || isSetPrivacy_urls2) {
            return isSetPrivacy_urls && isSetPrivacy_urls2 && this.privacy_urls.equals(that.privacy_urls);
        }
        return true;
    }

    public PrivacyAgreementInfo(PrivacyAgreementInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetContent()) {
            this.content = other.content;
        }
        this.privacy_version = other.privacy_version;
        if (other.isSetPrivacy_urls()) {
            this.privacy_urls = new HashMap(other.privacy_urls);
        }
    }
}
