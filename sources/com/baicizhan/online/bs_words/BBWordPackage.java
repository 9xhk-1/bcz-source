package com.baicizhan.online.bs_words;

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
public class BBWordPackage implements TBase<BBWordPackage, _Fields>, Serializable, Cloneable, Comparable<BBWordPackage> {
    private static final int __TAG_ID_ISSET_ID = 2;
    private static final int __TOPIC_ID_ISSET_ID = 0;
    private static final int __ZPK_SIZE_ISSET_ID = 1;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    private _Fields[] optionals;
    public int tag_id;
    public int topic_id;
    public String tv_path;
    public String tv_snapshot_path;
    public String zpk_md5;
    public String zpk_path;
    public long zpk_size;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordPackage");
    private static final TField TOPIC_ID_FIELD_DESC = new TField("topic_id", (byte) 8, 1);
    private static final TField ZPK_PATH_FIELD_DESC = new TField("zpk_path", (byte) 11, 2);
    private static final TField ZPK_SIZE_FIELD_DESC = new TField("zpk_size", (byte) 10, 3);
    private static final TField ZPK_MD5_FIELD_DESC = new TField("zpk_md5", (byte) 11, 4);
    private static final TField TAG_ID_FIELD_DESC = new TField("tag_id", (byte) 8, 5);
    private static final TField TV_PATH_FIELD_DESC = new TField(a.v.C0263a.f16322h, (byte) 11, 6);
    private static final TField TV_SNAPSHOT_PATH_FIELD_DESC = new TField(a.v.C0263a.f16323i, (byte) 11, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordPackage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields = iArr;
            try {
                iArr[_Fields.TOPIC_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[_Fields.ZPK_PATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[_Fields.ZPK_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[_Fields.ZPK_MD5.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[_Fields.TAG_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[_Fields.TV_PATH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[_Fields.TV_SNAPSHOT_PATH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordPackageStandardScheme extends StandardScheme<BBWordPackage> {
        private BBWordPackageStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordPackage struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetTopic_id()) {
                        throw new TProtocolException("Required field 'topic_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetZpk_size()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'zpk_size' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.topic_id = iprot.readI32();
                            struct.setTopic_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.zpk_path = iprot.readString();
                            struct.setZpk_pathIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.zpk_size = iprot.readI64();
                            struct.setZpk_sizeIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.zpk_md5 = iprot.readString();
                            struct.setZpk_md5IsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tag_id = iprot.readI32();
                            struct.setTag_idIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_path = iprot.readString();
                            struct.setTv_pathIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.tv_snapshot_path = iprot.readString();
                            struct.setTv_snapshot_pathIsSet(true);
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
        public void write(TProtocol oprot, BBWordPackage struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordPackage.STRUCT_DESC);
            oprot.writeFieldBegin(BBWordPackage.TOPIC_ID_FIELD_DESC);
            oprot.writeI32(struct.topic_id);
            oprot.writeFieldEnd();
            if (struct.zpk_path != null) {
                oprot.writeFieldBegin(BBWordPackage.ZPK_PATH_FIELD_DESC);
                oprot.writeString(struct.zpk_path);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BBWordPackage.ZPK_SIZE_FIELD_DESC);
            oprot.writeI64(struct.zpk_size);
            oprot.writeFieldEnd();
            if (struct.zpk_md5 != null) {
                oprot.writeFieldBegin(BBWordPackage.ZPK_MD5_FIELD_DESC);
                oprot.writeString(struct.zpk_md5);
                oprot.writeFieldEnd();
            }
            if (struct.isSetTag_id()) {
                oprot.writeFieldBegin(BBWordPackage.TAG_ID_FIELD_DESC);
                oprot.writeI32(struct.tag_id);
                oprot.writeFieldEnd();
            }
            if (struct.tv_path != null && struct.isSetTv_path()) {
                oprot.writeFieldBegin(BBWordPackage.TV_PATH_FIELD_DESC);
                oprot.writeString(struct.tv_path);
                oprot.writeFieldEnd();
            }
            if (struct.tv_snapshot_path != null && struct.isSetTv_snapshot_path()) {
                oprot.writeFieldBegin(BBWordPackage.TV_SNAPSHOT_PATH_FIELD_DESC);
                oprot.writeString(struct.tv_snapshot_path);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordPackageStandardSchemeFactory implements SchemeFactory {
        private BBWordPackageStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordPackageStandardScheme getScheme() {
            return new BBWordPackageStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordPackageTupleScheme extends TupleScheme<BBWordPackage> {
        private BBWordPackageTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordPackage struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.topic_id = tTupleProtocol.readI32();
            struct.setTopic_idIsSet(true);
            struct.zpk_path = tTupleProtocol.readString();
            struct.setZpk_pathIsSet(true);
            struct.zpk_size = tTupleProtocol.readI64();
            struct.setZpk_sizeIsSet(true);
            struct.zpk_md5 = tTupleProtocol.readString();
            struct.setZpk_md5IsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                struct.tag_id = tTupleProtocol.readI32();
                struct.setTag_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.tv_path = tTupleProtocol.readString();
                struct.setTv_pathIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.tv_snapshot_path = tTupleProtocol.readString();
                struct.setTv_snapshot_pathIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordPackage struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.topic_id);
            tTupleProtocol.writeString(struct.zpk_path);
            tTupleProtocol.writeI64(struct.zpk_size);
            tTupleProtocol.writeString(struct.zpk_md5);
            BitSet bitSet = new BitSet();
            if (struct.isSetTag_id()) {
                bitSet.set(0);
            }
            if (struct.isSetTv_path()) {
                bitSet.set(1);
            }
            if (struct.isSetTv_snapshot_path()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetTag_id()) {
                tTupleProtocol.writeI32(struct.tag_id);
            }
            if (struct.isSetTv_path()) {
                tTupleProtocol.writeString(struct.tv_path);
            }
            if (struct.isSetTv_snapshot_path()) {
                tTupleProtocol.writeString(struct.tv_snapshot_path);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordPackageTupleSchemeFactory implements SchemeFactory {
        private BBWordPackageTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordPackageTupleScheme getScheme() {
            return new BBWordPackageTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOPIC_ID(1, "topic_id"),
        ZPK_PATH(2, "zpk_path"),
        ZPK_SIZE(3, "zpk_size"),
        ZPK_MD5(4, "zpk_md5"),
        TAG_ID(5, "tag_id"),
        TV_PATH(6, a.v.C0263a.f16322h),
        TV_SNAPSHOT_PATH(7, a.v.C0263a.f16323i);

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
                    return TOPIC_ID;
                case 2:
                    return ZPK_PATH;
                case 3:
                    return ZPK_SIZE;
                case 4:
                    return ZPK_MD5;
                case 5:
                    return TAG_ID;
                case 6:
                    return TV_PATH;
                case 7:
                    return TV_SNAPSHOT_PATH;
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
        hashMap.put(StandardScheme.class, new BBWordPackageStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordPackageTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOPIC_ID, (_Fields) new FieldMetaData("topic_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ZPK_PATH, (_Fields) new FieldMetaData("zpk_path", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ZPK_SIZE, (_Fields) new FieldMetaData("zpk_size", (byte) 1, new FieldValueMetaData((byte) 10)));
        enumMap.put((EnumMap) _Fields.ZPK_MD5, (_Fields) new FieldMetaData("zpk_md5", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TAG_ID, (_Fields) new FieldMetaData("tag_id", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TV_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16322h, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TV_SNAPSHOT_PATH, (_Fields) new FieldMetaData(a.v.C0263a.f16323i, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordPackage.class, unmodifiableMap);
    }

    public BBWordPackage() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAG_ID, _Fields.TV_PATH, _Fields.TV_SNAPSHOT_PATH};
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
        setTopic_idIsSet(false);
        this.topic_id = 0;
        this.zpk_path = null;
        setZpk_sizeIsSet(false);
        this.zpk_size = 0L;
        this.zpk_md5 = null;
        setTag_idIsSet(false);
        this.tag_id = 0;
        this.tv_path = null;
        this.tv_snapshot_path = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordPackage)) {
            return equals((BBWordPackage) that);
        }
        return false;
    }

    public int getTag_id() {
        return this.tag_id;
    }

    public int getTopic_id() {
        return this.topic_id;
    }

    public String getTv_path() {
        return this.tv_path;
    }

    public String getTv_snapshot_path() {
        return this.tv_snapshot_path;
    }

    public String getZpk_md5() {
        return this.zpk_md5;
    }

    public String getZpk_path() {
        return this.zpk_path;
    }

    public long getZpk_size() {
        return this.zpk_size;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTag_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetTopic_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetTv_path() {
        return this.tv_path != null;
    }

    public boolean isSetTv_snapshot_path() {
        return this.tv_snapshot_path != null;
    }

    public boolean isSetZpk_md5() {
        return this.zpk_md5 != null;
    }

    public boolean isSetZpk_path() {
        return this.zpk_path != null;
    }

    public boolean isSetZpk_size() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordPackage setTag_id(int tag_id) {
        this.tag_id = tag_id;
        setTag_idIsSet(true);
        return this;
    }

    public void setTag_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BBWordPackage setTopic_id(int topic_id) {
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        return this;
    }

    public void setTopic_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public BBWordPackage setTv_path(String tv_path) {
        this.tv_path = tv_path;
        return this;
    }

    public void setTv_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tv_path = null;
    }

    public BBWordPackage setTv_snapshot_path(String tv_snapshot_path) {
        this.tv_snapshot_path = tv_snapshot_path;
        return this;
    }

    public void setTv_snapshot_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tv_snapshot_path = null;
    }

    public BBWordPackage setZpk_md5(String zpk_md5) {
        this.zpk_md5 = zpk_md5;
        return this;
    }

    public void setZpk_md5IsSet(boolean value) {
        if (value) {
            return;
        }
        this.zpk_md5 = null;
    }

    public BBWordPackage setZpk_path(String zpk_path) {
        this.zpk_path = zpk_path;
        return this;
    }

    public void setZpk_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.zpk_path = null;
    }

    public BBWordPackage setZpk_size(long zpk_size) {
        this.zpk_size = zpk_size;
        setZpk_sizeIsSet(true);
        return this;
    }

    public void setZpk_sizeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordPackage(");
        sb2.append("topic_id:");
        sb2.append(this.topic_id);
        sb2.append(j2.O);
        sb2.append("zpk_path:");
        String str = this.zpk_path;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("zpk_size:");
        sb2.append(this.zpk_size);
        sb2.append(j2.O);
        sb2.append("zpk_md5:");
        String str2 = this.zpk_md5;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetTag_id()) {
            sb2.append(j2.O);
            sb2.append("tag_id:");
            sb2.append(this.tag_id);
        }
        if (isSetTv_path()) {
            sb2.append(j2.O);
            sb2.append("tv_path:");
            String str3 = this.tv_path;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetTv_snapshot_path()) {
            sb2.append(j2.O);
            sb2.append("tv_snapshot_path:");
            String str4 = this.tv_snapshot_path;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetTag_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetTopic_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetTv_path() {
        this.tv_path = null;
    }

    public void unsetTv_snapshot_path() {
        this.tv_snapshot_path = null;
    }

    public void unsetZpk_md5() {
        this.zpk_md5 = null;
    }

    public void unsetZpk_path() {
        this.zpk_path = null;
    }

    public void unsetZpk_size() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void validate() throws TException {
        if (this.zpk_path == null) {
            throw new TProtocolException("Required field 'zpk_path' was not present! Struct: " + toString());
        }
        if (this.zpk_md5 != null) {
            return;
        }
        throw new TProtocolException("Required field 'zpk_md5' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordPackage other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetTopic_id()).compareTo(Boolean.valueOf(other.isSetTopic_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTopic_id() && (compareTo7 = TBaseHelper.compareTo(this.topic_id, other.topic_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetZpk_path()).compareTo(Boolean.valueOf(other.isSetZpk_path()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetZpk_path() && (compareTo6 = TBaseHelper.compareTo(this.zpk_path, other.zpk_path)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetZpk_size()).compareTo(Boolean.valueOf(other.isSetZpk_size()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetZpk_size() && (compareTo5 = TBaseHelper.compareTo(this.zpk_size, other.zpk_size)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetZpk_md5()).compareTo(Boolean.valueOf(other.isSetZpk_md5()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetZpk_md5() && (compareTo4 = TBaseHelper.compareTo(this.zpk_md5, other.zpk_md5)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetTag_id()).compareTo(Boolean.valueOf(other.isSetTag_id()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetTag_id() && (compareTo3 = TBaseHelper.compareTo(this.tag_id, other.tag_id)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetTv_path()).compareTo(Boolean.valueOf(other.isSetTv_path()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetTv_path() && (compareTo2 = TBaseHelper.compareTo(this.tv_path, other.tv_path)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetTv_snapshot_path()).compareTo(Boolean.valueOf(other.isSetTv_snapshot_path()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetTv_snapshot_path() || (compareTo = TBaseHelper.compareTo(this.tv_snapshot_path, other.tv_snapshot_path)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordPackage, _Fields> deepCopy2() {
        return new BBWordPackage(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getTopic_id());
            case 2:
                return getZpk_path();
            case 3:
                return Long.valueOf(getZpk_size());
            case 4:
                return getZpk_md5();
            case 5:
                return Integer.valueOf(getTag_id());
            case 6:
                return getTv_path();
            case 7:
                return getTv_snapshot_path();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[field.ordinal()]) {
            case 1:
                return isSetTopic_id();
            case 2:
                return isSetZpk_path();
            case 3:
                return isSetZpk_size();
            case 4:
                return isSetZpk_md5();
            case 5:
                return isSetTag_id();
            case 6:
                return isSetTv_path();
            case 7:
                return isSetTv_snapshot_path();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordPackage$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setTopic_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTopic_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setZpk_path((String) value);
                    break;
                } else {
                    unsetZpk_path();
                    break;
                }
            case 3:
                if (value != null) {
                    setZpk_size(((Long) value).longValue());
                    break;
                } else {
                    unsetZpk_size();
                    break;
                }
            case 4:
                if (value != null) {
                    setZpk_md5((String) value);
                    break;
                } else {
                    unsetZpk_md5();
                    break;
                }
            case 5:
                if (value != null) {
                    setTag_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetTag_id();
                    break;
                }
            case 6:
                if (value != null) {
                    setTv_path((String) value);
                    break;
                } else {
                    unsetTv_path();
                    break;
                }
            case 7:
                if (value != null) {
                    setTv_snapshot_path((String) value);
                    break;
                } else {
                    unsetTv_snapshot_path();
                    break;
                }
        }
    }

    public boolean equals(BBWordPackage that) {
        if (that == null || this.topic_id != that.topic_id) {
            return false;
        }
        boolean isSetZpk_path = isSetZpk_path();
        boolean isSetZpk_path2 = that.isSetZpk_path();
        if (((isSetZpk_path || isSetZpk_path2) && !(isSetZpk_path && isSetZpk_path2 && this.zpk_path.equals(that.zpk_path))) || this.zpk_size != that.zpk_size) {
            return false;
        }
        boolean isSetZpk_md5 = isSetZpk_md5();
        boolean isSetZpk_md52 = that.isSetZpk_md5();
        if ((isSetZpk_md5 || isSetZpk_md52) && !(isSetZpk_md5 && isSetZpk_md52 && this.zpk_md5.equals(that.zpk_md5))) {
            return false;
        }
        boolean isSetTag_id = isSetTag_id();
        boolean isSetTag_id2 = that.isSetTag_id();
        if ((isSetTag_id || isSetTag_id2) && !(isSetTag_id && isSetTag_id2 && this.tag_id == that.tag_id)) {
            return false;
        }
        boolean isSetTv_path = isSetTv_path();
        boolean isSetTv_path2 = that.isSetTv_path();
        if ((isSetTv_path || isSetTv_path2) && !(isSetTv_path && isSetTv_path2 && this.tv_path.equals(that.tv_path))) {
            return false;
        }
        boolean isSetTv_snapshot_path = isSetTv_snapshot_path();
        boolean isSetTv_snapshot_path2 = that.isSetTv_snapshot_path();
        if (isSetTv_snapshot_path || isSetTv_snapshot_path2) {
            return isSetTv_snapshot_path && isSetTv_snapshot_path2 && this.tv_snapshot_path.equals(that.tv_snapshot_path);
        }
        return true;
    }

    public BBWordPackage(int topic_id, String zpk_path, long zpk_size, String zpk_md5) {
        this();
        this.topic_id = topic_id;
        setTopic_idIsSet(true);
        this.zpk_path = zpk_path;
        this.zpk_size = zpk_size;
        setZpk_sizeIsSet(true);
        this.zpk_md5 = zpk_md5;
    }

    public BBWordPackage(BBWordPackage other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.TAG_ID, _Fields.TV_PATH, _Fields.TV_SNAPSHOT_PATH};
        this.__isset_bitfield = other.__isset_bitfield;
        this.topic_id = other.topic_id;
        if (other.isSetZpk_path()) {
            this.zpk_path = other.zpk_path;
        }
        this.zpk_size = other.zpk_size;
        if (other.isSetZpk_md5()) {
            this.zpk_md5 = other.zpk_md5;
        }
        this.tag_id = other.tag_id;
        if (other.isSetTv_path()) {
            this.tv_path = other.tv_path;
        }
        if (other.isSetTv_snapshot_path()) {
            this.tv_snapshot_path = other.tv_snapshot_path;
        }
    }
}
