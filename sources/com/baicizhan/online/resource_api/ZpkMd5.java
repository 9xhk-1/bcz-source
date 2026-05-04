package com.baicizhan.online.resource_api;

import com.baicizhan.client.business.dataset.provider.a;
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
import org.apache.thrift.meta_data.StructMetaData;
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
public class ZpkMd5 implements TBase<ZpkMd5, _Fields>, Serializable, Cloneable, Comparable<ZpkMd5> {
    private static final int __FORCE_UPDATE_ISSET_ID = 0;
    private static final int __FORCE_UPDATE_ZPK_VERSION_ISSET_ID = 2;
    private static final int __ZPK_VERSION_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int force_update;
    public int force_update_zpk_version;
    private _Fields[] optionals;
    public TopicKey topic_key;
    public String zpk_md5;
    public int zpk_version;
    private static final TStruct STRUCT_DESC = new TStruct("ZpkMd5");
    private static final TField TOPIC_KEY_FIELD_DESC = new TField("topic_key", (byte) 12, 1);
    private static final TField ZPK_MD5_FIELD_DESC = new TField("zpk_md5", (byte) 11, 2);
    private static final TField FORCE_UPDATE_FIELD_DESC = new TField("force_update", (byte) 8, 3);
    private static final TField ZPK_VERSION_FIELD_DESC = new TField(a.i.C0250a.f16203e, (byte) 8, 4);
    private static final TField FORCE_UPDATE_ZPK_VERSION_FIELD_DESC = new TField("force_update_zpk_version", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.resource_api.ZpkMd5$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[_Fields.ZPK_MD5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[_Fields.FORCE_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[_Fields.ZPK_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[_Fields.FORCE_UPDATE_ZPK_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ZpkMd5StandardScheme extends StandardScheme<ZpkMd5> {
        private ZpkMd5StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ZpkMd5 struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 8) {
                                    struct.force_update_zpk_version = iprot.readI32();
                                    struct.setForce_update_zpk_versionIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.zpk_version = iprot.readI32();
                                struct.setZpk_versionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.force_update = iprot.readI32();
                            struct.setForce_updateIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.zpk_md5 = iprot.readString();
                        struct.setZpk_md5IsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    TopicKey topicKey = new TopicKey();
                    struct.topic_key = topicKey;
                    topicKey.read(iprot);
                    struct.setTopic_keyIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetZpk_version()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'zpk_version' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ZpkMd5 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ZpkMd5.STRUCT_DESC);
            if (struct.topic_key != null) {
                oprot.writeFieldBegin(ZpkMd5.TOPIC_KEY_FIELD_DESC);
                struct.topic_key.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.zpk_md5 != null) {
                oprot.writeFieldBegin(ZpkMd5.ZPK_MD5_FIELD_DESC);
                oprot.writeString(struct.zpk_md5);
                oprot.writeFieldEnd();
            }
            if (struct.isSetForce_update()) {
                oprot.writeFieldBegin(ZpkMd5.FORCE_UPDATE_FIELD_DESC);
                oprot.writeI32(struct.force_update);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ZpkMd5.ZPK_VERSION_FIELD_DESC);
            oprot.writeI32(struct.zpk_version);
            oprot.writeFieldEnd();
            if (struct.isSetForce_update_zpk_version()) {
                oprot.writeFieldBegin(ZpkMd5.FORCE_UPDATE_ZPK_VERSION_FIELD_DESC);
                oprot.writeI32(struct.force_update_zpk_version);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ZpkMd5StandardSchemeFactory implements SchemeFactory {
        private ZpkMd5StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ZpkMd5StandardScheme getScheme() {
            return new ZpkMd5StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ZpkMd5TupleScheme extends TupleScheme<ZpkMd5> {
        private ZpkMd5TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ZpkMd5 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TopicKey topicKey = new TopicKey();
            struct.topic_key = topicKey;
            topicKey.read(tTupleProtocol);
            struct.setTopic_keyIsSet(true);
            struct.zpk_md5 = tTupleProtocol.readString();
            struct.setZpk_md5IsSet(true);
            struct.zpk_version = tTupleProtocol.readI32();
            struct.setZpk_versionIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.force_update = tTupleProtocol.readI32();
                struct.setForce_updateIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.force_update_zpk_version = tTupleProtocol.readI32();
                struct.setForce_update_zpk_versionIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ZpkMd5 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_key.write(tTupleProtocol);
            tTupleProtocol.writeString(struct.zpk_md5);
            tTupleProtocol.writeI32(struct.zpk_version);
            BitSet bitSet = new BitSet();
            if (struct.isSetForce_update()) {
                bitSet.set(0);
            }
            if (struct.isSetForce_update_zpk_version()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetForce_update()) {
                tTupleProtocol.writeI32(struct.force_update);
            }
            if (struct.isSetForce_update_zpk_version()) {
                tTupleProtocol.writeI32(struct.force_update_zpk_version);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ZpkMd5TupleSchemeFactory implements SchemeFactory {
        private ZpkMd5TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ZpkMd5TupleScheme getScheme() {
            return new ZpkMd5TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_KEY(1, "topic_key"),
        ZPK_MD5(2, "zpk_md5"),
        FORCE_UPDATE(3, "force_update"),
        ZPK_VERSION(4, a.i.C0250a.f16203e),
        FORCE_UPDATE_ZPK_VERSION(5, "force_update_zpk_version");

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
                return TOPIC_KEY;
            }
            if (fieldId == 2) {
                return ZPK_MD5;
            }
            if (fieldId == 3) {
                return FORCE_UPDATE;
            }
            if (fieldId == 4) {
                return ZPK_VERSION;
            }
            if (fieldId != 5) {
                return null;
            }
            return FORCE_UPDATE_ZPK_VERSION;
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
        hashMap.put(StandardScheme.class, new ZpkMd5StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ZpkMd5TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_KEY, (_Fields) new FieldMetaData("topic_key", (byte) 1, new StructMetaData((byte) 12, TopicKey.class)));
        enumMap.put((EnumMap) _Fields.ZPK_MD5, (_Fields) new FieldMetaData("zpk_md5", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FORCE_UPDATE, (_Fields) new FieldMetaData("force_update", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ZPK_VERSION, (_Fields) new FieldMetaData(a.i.C0250a.f16203e, (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.FORCE_UPDATE_ZPK_VERSION, (_Fields) new FieldMetaData("force_update_zpk_version", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ZpkMd5.class, unmodifiableMap);
    }

    public ZpkMd5() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.FORCE_UPDATE, _Fields.FORCE_UPDATE_ZPK_VERSION};
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
        this.topic_key = null;
        this.zpk_md5 = null;
        setForce_updateIsSet(false);
        this.force_update = 0;
        setZpk_versionIsSet(false);
        this.zpk_version = 0;
        setForce_update_zpk_versionIsSet(false);
        this.force_update_zpk_version = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ZpkMd5)) {
            return equals((ZpkMd5) that);
        }
        return false;
    }

    public int getForce_update() {
        return this.force_update;
    }

    public int getForce_update_zpk_version() {
        return this.force_update_zpk_version;
    }

    public TopicKey getTopic_key() {
        return this.topic_key;
    }

    public String getZpk_md5() {
        return this.zpk_md5;
    }

    public int getZpk_version() {
        return this.zpk_version;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetForce_update() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetForce_update_zpk_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_key() {
        return this.topic_key != null;
    }

    public boolean isSetZpk_md5() {
        return this.zpk_md5 != null;
    }

    public boolean isSetZpk_version() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ZpkMd5 setForce_update(int force_update) {
        this.force_update = force_update;
        setForce_updateIsSet(true);
        return this;
    }

    public void setForce_updateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ZpkMd5 setForce_update_zpk_version(int force_update_zpk_version) {
        this.force_update_zpk_version = force_update_zpk_version;
        setForce_update_zpk_versionIsSet(true);
        return this;
    }

    public void setForce_update_zpk_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public ZpkMd5 setTopic_key(TopicKey topic_key) {
        this.topic_key = topic_key;
        return this;
    }

    public void setTopic_keyIsSet(boolean value) {
        if (value) {
            return;
        }
        this.topic_key = null;
    }

    public ZpkMd5 setZpk_md5(String zpk_md5) {
        this.zpk_md5 = zpk_md5;
        return this;
    }

    public void setZpk_md5IsSet(boolean value) {
        if (value) {
            return;
        }
        this.zpk_md5 = null;
    }

    public ZpkMd5 setZpk_version(int zpk_version) {
        this.zpk_version = zpk_version;
        setZpk_versionIsSet(true);
        return this;
    }

    public void setZpk_versionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ZpkMd5(");
        sb2.append("topic_key:");
        TopicKey topicKey = this.topic_key;
        if (topicKey == null) {
            sb2.append("null");
        } else {
            sb2.append(topicKey);
        }
        sb2.append(j2.O);
        sb2.append("zpk_md5:");
        String str = this.zpk_md5;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetForce_update()) {
            sb2.append(j2.O);
            sb2.append("force_update:");
            sb2.append(this.force_update);
        }
        sb2.append(j2.O);
        sb2.append("zpk_version:");
        sb2.append(this.zpk_version);
        if (isSetForce_update_zpk_version()) {
            sb2.append(j2.O);
            sb2.append("force_update_zpk_version:");
            sb2.append(this.force_update_zpk_version);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetForce_update() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetForce_update_zpk_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_key() {
        this.topic_key = null;
    }

    public void unsetZpk_md5() {
        this.zpk_md5 = null;
    }

    public void unsetZpk_version() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        TopicKey topicKey = this.topic_key;
        if (topicKey == null) {
            throw new TProtocolException("Required field 'topic_key' was not present! Struct: " + toString());
        }
        if (this.zpk_md5 != null) {
            if (topicKey != null) {
                topicKey.validate();
            }
        } else {
            throw new TProtocolException("Required field 'zpk_md5' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ZpkMd5 other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetTopic_key()).compareTo(Boolean.valueOf(other.isSetTopic_key()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetTopic_key() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.topic_key, (Comparable) other.topic_key)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetZpk_md5()).compareTo(Boolean.valueOf(other.isSetZpk_md5()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetZpk_md5() && (compareTo4 = TBaseHelper.compareTo(this.zpk_md5, other.zpk_md5)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetForce_update()).compareTo(Boolean.valueOf(other.isSetForce_update()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetForce_update() && (compareTo3 = TBaseHelper.compareTo(this.force_update, other.force_update)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetZpk_version()).compareTo(Boolean.valueOf(other.isSetZpk_version()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetZpk_version() && (compareTo2 = TBaseHelper.compareTo(this.zpk_version, other.zpk_version)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetForce_update_zpk_version()).compareTo(Boolean.valueOf(other.isSetForce_update_zpk_version()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetForce_update_zpk_version() || (compareTo = TBaseHelper.compareTo(this.force_update_zpk_version, other.force_update_zpk_version)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ZpkMd5, _Fields> deepCopy2() {
        return new ZpkMd5(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTopic_key();
        }
        if (i11 == 2) {
            return getZpk_md5();
        }
        if (i11 == 3) {
            return Integer.valueOf(getForce_update());
        }
        if (i11 == 4) {
            return Integer.valueOf(getZpk_version());
        }
        if (i11 == 5) {
            return Integer.valueOf(getForce_update_zpk_version());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTopic_key();
        }
        if (i11 == 2) {
            return isSetZpk_md5();
        }
        if (i11 == 3) {
            return isSetForce_update();
        }
        if (i11 == 4) {
            return isSetZpk_version();
        }
        if (i11 == 5) {
            return isSetForce_update_zpk_version();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$resource_api$ZpkMd5$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTopic_key();
                return;
            } else {
                setTopic_key((TopicKey) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetZpk_md5();
                return;
            } else {
                setZpk_md5((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetForce_update();
                return;
            } else {
                setForce_update(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetZpk_version();
                return;
            } else {
                setZpk_version(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetForce_update_zpk_version();
        } else {
            setForce_update_zpk_version(((Integer) value).intValue());
        }
    }

    public boolean equals(ZpkMd5 that) {
        if (that == null) {
            return false;
        }
        boolean isSetTopic_key = isSetTopic_key();
        boolean isSetTopic_key2 = that.isSetTopic_key();
        if ((isSetTopic_key || isSetTopic_key2) && !(isSetTopic_key && isSetTopic_key2 && this.topic_key.equals(that.topic_key))) {
            return false;
        }
        boolean isSetZpk_md5 = isSetZpk_md5();
        boolean isSetZpk_md52 = that.isSetZpk_md5();
        if ((isSetZpk_md5 || isSetZpk_md52) && !(isSetZpk_md5 && isSetZpk_md52 && this.zpk_md5.equals(that.zpk_md5))) {
            return false;
        }
        boolean isSetForce_update = isSetForce_update();
        boolean isSetForce_update2 = that.isSetForce_update();
        if (((isSetForce_update || isSetForce_update2) && !(isSetForce_update && isSetForce_update2 && this.force_update == that.force_update)) || this.zpk_version != that.zpk_version) {
            return false;
        }
        boolean isSetForce_update_zpk_version = isSetForce_update_zpk_version();
        boolean isSetForce_update_zpk_version2 = that.isSetForce_update_zpk_version();
        if (isSetForce_update_zpk_version || isSetForce_update_zpk_version2) {
            return isSetForce_update_zpk_version && isSetForce_update_zpk_version2 && this.force_update_zpk_version == that.force_update_zpk_version;
        }
        return true;
    }

    public ZpkMd5(TopicKey topic_key, String zpk_md5, int zpk_version) {
        this();
        this.topic_key = topic_key;
        this.zpk_md5 = zpk_md5;
        this.zpk_version = zpk_version;
        setZpk_versionIsSet(true);
    }

    public ZpkMd5(ZpkMd5 other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.FORCE_UPDATE, _Fields.FORCE_UPDATE_ZPK_VERSION};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetTopic_key()) {
            this.topic_key = new TopicKey(other.topic_key);
        }
        if (other.isSetZpk_md5()) {
            this.zpk_md5 = other.zpk_md5;
        }
        this.force_update = other.force_update;
        this.zpk_version = other.zpk_version;
        this.force_update_zpk_version = other.force_update_zpk_version;
    }
}
