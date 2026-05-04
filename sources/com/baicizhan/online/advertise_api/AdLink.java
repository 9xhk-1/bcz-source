package com.baicizhan.online.advertise_api;

import com.tencent.connect.share.QQShare;
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
public class AdLink implements TBase<AdLink, _Fields>, Serializable, Cloneable, Comparable<AdLink> {
    private static final int __JUMP_TYPE_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int jump_type;
    public String link;
    public String mini_program_id;
    public String mini_program_path;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("AdLink");
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 1);
    private static final TField JUMP_TYPE_FIELD_DESC = new TField("jump_type", (byte) 8, 2);
    private static final TField MINI_PROGRAM_ID_FIELD_DESC = new TField("mini_program_id", (byte) 11, 3);
    private static final TField MINI_PROGRAM_PATH_FIELD_DESC = new TField(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.AdLink$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields = iArr;
            try {
                iArr[_Fields.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields[_Fields.JUMP_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields[_Fields.MINI_PROGRAM_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields[_Fields.MINI_PROGRAM_PATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLinkStandardScheme extends StandardScheme<AdLink> {
        private AdLinkStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdLink struct) throws TException {
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
                            } else if (b11 == 11) {
                                struct.mini_program_path = iprot.readString();
                                struct.setMini_program_pathIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.mini_program_id = iprot.readString();
                            struct.setMini_program_idIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.jump_type = iprot.readI32();
                        struct.setJump_typeIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.link = iprot.readString();
                    struct.setLinkIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetJump_type()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'jump_type' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdLink struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdLink.STRUCT_DESC);
            if (struct.link != null) {
                oprot.writeFieldBegin(AdLink.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(AdLink.JUMP_TYPE_FIELD_DESC);
            oprot.writeI32(struct.jump_type);
            oprot.writeFieldEnd();
            if (struct.mini_program_id != null && struct.isSetMini_program_id()) {
                oprot.writeFieldBegin(AdLink.MINI_PROGRAM_ID_FIELD_DESC);
                oprot.writeString(struct.mini_program_id);
                oprot.writeFieldEnd();
            }
            if (struct.mini_program_path != null && struct.isSetMini_program_path()) {
                oprot.writeFieldBegin(AdLink.MINI_PROGRAM_PATH_FIELD_DESC);
                oprot.writeString(struct.mini_program_path);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLinkStandardSchemeFactory implements SchemeFactory {
        private AdLinkStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdLinkStandardScheme getScheme() {
            return new AdLinkStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLinkTupleScheme extends TupleScheme<AdLink> {
        private AdLinkTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdLink struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
            struct.jump_type = tTupleProtocol.readI32();
            struct.setJump_typeIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.mini_program_id = tTupleProtocol.readString();
                struct.setMini_program_idIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.mini_program_path = tTupleProtocol.readString();
                struct.setMini_program_pathIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdLink struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.link);
            tTupleProtocol.writeI32(struct.jump_type);
            BitSet bitSet = new BitSet();
            if (struct.isSetMini_program_id()) {
                bitSet.set(0);
            }
            if (struct.isSetMini_program_path()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetMini_program_id()) {
                tTupleProtocol.writeString(struct.mini_program_id);
            }
            if (struct.isSetMini_program_path()) {
                tTupleProtocol.writeString(struct.mini_program_path);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdLinkTupleSchemeFactory implements SchemeFactory {
        private AdLinkTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdLinkTupleScheme getScheme() {
            return new AdLinkTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        LINK(1, y9.b.f99687c),
        JUMP_TYPE(2, "jump_type"),
        MINI_PROGRAM_ID(3, "mini_program_id"),
        MINI_PROGRAM_PATH(4, QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);

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
                return LINK;
            }
            if (fieldId == 2) {
                return JUMP_TYPE;
            }
            if (fieldId == 3) {
                return MINI_PROGRAM_ID;
            }
            if (fieldId != 4) {
                return null;
            }
            return MINI_PROGRAM_PATH;
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
        hashMap.put(StandardScheme.class, new AdLinkStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdLinkTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.JUMP_TYPE, (_Fields) new FieldMetaData("jump_type", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MINI_PROGRAM_ID, (_Fields) new FieldMetaData("mini_program_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MINI_PROGRAM_PATH, (_Fields) new FieldMetaData(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdLink.class, unmodifiableMap);
    }

    public AdLink() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MINI_PROGRAM_ID, _Fields.MINI_PROGRAM_PATH};
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
        this.link = null;
        setJump_typeIsSet(false);
        this.jump_type = 0;
        this.mini_program_id = null;
        this.mini_program_path = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdLink)) {
            return equals((AdLink) that);
        }
        return false;
    }

    public int getJump_type() {
        return this.jump_type;
    }

    public String getLink() {
        return this.link;
    }

    public String getMini_program_id() {
        return this.mini_program_id;
    }

    public String getMini_program_path() {
        return this.mini_program_path;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetJump_type() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetMini_program_id() {
        return this.mini_program_id != null;
    }

    public boolean isSetMini_program_path() {
        return this.mini_program_path != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdLink setJump_type(int jump_type) {
        this.jump_type = jump_type;
        setJump_typeIsSet(true);
        return this;
    }

    public void setJump_typeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public AdLink setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public AdLink setMini_program_id(String mini_program_id) {
        this.mini_program_id = mini_program_id;
        return this;
    }

    public void setMini_program_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mini_program_id = null;
    }

    public AdLink setMini_program_path(String mini_program_path) {
        this.mini_program_path = mini_program_path;
        return this;
    }

    public void setMini_program_pathIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mini_program_path = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdLink(");
        sb2.append("link:");
        String str = this.link;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("jump_type:");
        sb2.append(this.jump_type);
        if (isSetMini_program_id()) {
            sb2.append(j2.O);
            sb2.append("mini_program_id:");
            String str2 = this.mini_program_id;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetMini_program_path()) {
            sb2.append(j2.O);
            sb2.append("mini_program_path:");
            String str3 = this.mini_program_path;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetJump_type() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetMini_program_id() {
        this.mini_program_id = null;
    }

    public void unsetMini_program_path() {
        this.mini_program_path = null;
    }

    public void validate() throws TException {
        if (this.link != null) {
            return;
        }
        throw new TProtocolException("Required field 'link' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(AdLink other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLink() && (compareTo4 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetJump_type()).compareTo(Boolean.valueOf(other.isSetJump_type()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetJump_type() && (compareTo3 = TBaseHelper.compareTo(this.jump_type, other.jump_type)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetMini_program_id()).compareTo(Boolean.valueOf(other.isSetMini_program_id()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetMini_program_id() && (compareTo2 = TBaseHelper.compareTo(this.mini_program_id, other.mini_program_id)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetMini_program_path()).compareTo(Boolean.valueOf(other.isSetMini_program_path()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetMini_program_path() || (compareTo = TBaseHelper.compareTo(this.mini_program_path, other.mini_program_path)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdLink, _Fields> deepCopy2() {
        return new AdLink(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getLink();
        }
        if (i11 == 2) {
            return Integer.valueOf(getJump_type());
        }
        if (i11 == 3) {
            return getMini_program_id();
        }
        if (i11 == 4) {
            return getMini_program_path();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetLink();
        }
        if (i11 == 2) {
            return isSetJump_type();
        }
        if (i11 == 3) {
            return isSetMini_program_id();
        }
        if (i11 == 4) {
            return isSetMini_program_path();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$AdLink$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetLink();
                return;
            } else {
                setLink((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetJump_type();
                return;
            } else {
                setJump_type(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetMini_program_id();
                return;
            } else {
                setMini_program_id((String) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetMini_program_path();
        } else {
            setMini_program_path((String) value);
        }
    }

    public boolean equals(AdLink that) {
        if (that == null) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if (((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) || this.jump_type != that.jump_type) {
            return false;
        }
        boolean isSetMini_program_id = isSetMini_program_id();
        boolean isSetMini_program_id2 = that.isSetMini_program_id();
        if ((isSetMini_program_id || isSetMini_program_id2) && !(isSetMini_program_id && isSetMini_program_id2 && this.mini_program_id.equals(that.mini_program_id))) {
            return false;
        }
        boolean isSetMini_program_path = isSetMini_program_path();
        boolean isSetMini_program_path2 = that.isSetMini_program_path();
        if (isSetMini_program_path || isSetMini_program_path2) {
            return isSetMini_program_path && isSetMini_program_path2 && this.mini_program_path.equals(that.mini_program_path);
        }
        return true;
    }

    public AdLink(String link, int jump_type) {
        this();
        this.link = link;
        this.jump_type = jump_type;
        setJump_typeIsSet(true);
    }

    public AdLink(AdLink other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.MINI_PROGRAM_ID, _Fields.MINI_PROGRAM_PATH};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetLink()) {
            this.link = other.link;
        }
        this.jump_type = other.jump_type;
        if (other.isSetMini_program_id()) {
            this.mini_program_id = other.mini_program_id;
        }
        if (other.isSetMini_program_path()) {
            this.mini_program_path = other.mini_program_path;
        }
    }
}
