package com.baicizhan.online.user_study_api;

import com.tencent.open.SocialConstants;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class ResourceItem implements TBase<ResourceItem, _Fields>, Serializable, Cloneable, Comparable<ResourceItem> {
    private static final int __ACTION_ISSET_ID = 1;
    private static final int __AID_ISSET_ID = 0;
    private static final int __TYPE_ISSET_ID = 2;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int action;
    public int aid;
    public String img;
    public String link;
    private _Fields[] optionals;
    public String title;
    public int type;
    private static final TStruct STRUCT_DESC = new TStruct("ResourceItem");
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 8, 1);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 2);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 3);
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 8, 4);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 6);
    private static final TField TYPE_FIELD_DESC = new TField("type", (byte) 8, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ResourceItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields = iArr;
            try {
                iArr[_Fields.AID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[_Fields.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[_Fields.IMG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[_Fields.ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[_Fields.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[_Fields.TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ResourceItemStandardScheme extends StandardScheme<ResourceItem> {
        private ResourceItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ResourceItem struct) throws TException {
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
                                if (s11 != 6) {
                                    if (s11 != 7) {
                                        TProtocolUtil.skip(iprot, b11);
                                    } else if (b11 == 8) {
                                        struct.type = iprot.readI32();
                                        struct.setTypeIsSet(true);
                                    } else {
                                        TProtocolUtil.skip(iprot, b11);
                                    }
                                } else if (b11 == 11) {
                                    struct.link = iprot.readString();
                                    struct.setLinkIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.action = iprot.readI32();
                                struct.setActionIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.img = iprot.readString();
                            struct.setImgIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.title = iprot.readString();
                        struct.setTitleIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.aid = iprot.readI32();
                    struct.setAidIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetAid()) {
                throw new TProtocolException("Required field 'aid' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetAction()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'action' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ResourceItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ResourceItem.STRUCT_DESC);
            oprot.writeFieldBegin(ResourceItem.AID_FIELD_DESC);
            oprot.writeI32(struct.aid);
            oprot.writeFieldEnd();
            if (struct.title != null) {
                oprot.writeFieldBegin(ResourceItem.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.img != null) {
                oprot.writeFieldBegin(ResourceItem.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(ResourceItem.ACTION_FIELD_DESC);
            oprot.writeI32(struct.action);
            oprot.writeFieldEnd();
            if (struct.link != null && struct.isSetLink()) {
                oprot.writeFieldBegin(ResourceItem.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            if (struct.isSetType()) {
                oprot.writeFieldBegin(ResourceItem.TYPE_FIELD_DESC);
                oprot.writeI32(struct.type);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ResourceItemStandardSchemeFactory implements SchemeFactory {
        private ResourceItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ResourceItemStandardScheme getScheme() {
            return new ResourceItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ResourceItemTupleScheme extends TupleScheme<ResourceItem> {
        private ResourceItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ResourceItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.aid = tTupleProtocol.readI32();
            struct.setAidIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
            struct.action = tTupleProtocol.readI32();
            struct.setActionIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.link = tTupleProtocol.readString();
                struct.setLinkIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.type = tTupleProtocol.readI32();
                struct.setTypeIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ResourceItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.aid);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.img);
            tTupleProtocol.writeI32(struct.action);
            BitSet bitSet = new BitSet();
            if (struct.isSetLink()) {
                bitSet.set(0);
            }
            if (struct.isSetType()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetLink()) {
                tTupleProtocol.writeString(struct.link);
            }
            if (struct.isSetType()) {
                tTupleProtocol.writeI32(struct.type);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ResourceItemTupleSchemeFactory implements SchemeFactory {
        private ResourceItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ResourceItemTupleScheme getScheme() {
            return new ResourceItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AID(1, "aid"),
        TITLE(2, "title"),
        IMG(3, SocialConstants.PARAM_IMG_URL),
        ACTION(4, "action"),
        LINK(6, y9.b.f99687c),
        TYPE(7, "type");

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
                return AID;
            }
            if (fieldId == 2) {
                return TITLE;
            }
            if (fieldId == 3) {
                return IMG;
            }
            if (fieldId == 4) {
                return ACTION;
            }
            if (fieldId == 6) {
                return LINK;
            }
            if (fieldId != 7) {
                return null;
            }
            return TYPE;
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
        hashMap.put(StandardScheme.class, new ResourceItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ResourceItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TYPE, (_Fields) new FieldMetaData("type", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ResourceItem.class, unmodifiableMap);
    }

    public ResourceItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK, _Fields.TYPE};
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
        setAidIsSet(false);
        this.aid = 0;
        this.title = null;
        this.img = null;
        setActionIsSet(false);
        this.action = 0;
        this.link = null;
        setTypeIsSet(false);
        this.type = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ResourceItem)) {
            return equals((ResourceItem) that);
        }
        return false;
    }

    public int getAction() {
        return this.action;
    }

    public int getAid() {
        return this.aid;
    }

    public String getImg() {
        return this.img;
    }

    public String getLink() {
        return this.link;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetAid() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    public boolean isSetType() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ResourceItem setAction(int action) {
        this.action = action;
        setActionIsSet(true);
        return this;
    }

    public void setActionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ResourceItem setAid(int aid) {
        this.aid = aid;
        setAidIsSet(true);
        return this;
    }

    public void setAidIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ResourceItem setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public ResourceItem setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public ResourceItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public ResourceItem setType(int type) {
        this.type = type;
        setTypeIsSet(true);
        return this;
    }

    public void setTypeIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceItem(");
        sb2.append("aid:");
        sb2.append(this.aid);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("img:");
        String str2 = this.img;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("action:");
        sb2.append(this.action);
        if (isSetLink()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("link:");
            String str3 = this.link;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (isSetType()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("type:");
            sb2.append(this.type);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetAid() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void unsetType() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.img != null) {
            return;
        }
        throw new TProtocolException("Required field 'img' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ResourceItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAid() && (compareTo6 = TBaseHelper.compareTo(this.aid, other.aid)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetTitle() && (compareTo5 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetImg() && (compareTo4 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetAction() && (compareTo3 = TBaseHelper.compareTo(this.action, other.action)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetLink() && (compareTo2 = TBaseHelper.compareTo(this.link, other.link)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetType()).compareTo(Boolean.valueOf(other.isSetType()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetType() || (compareTo = TBaseHelper.compareTo(this.type, other.type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ResourceItem, _Fields> deepCopy2() {
        return new ResourceItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getAid());
            case 2:
                return getTitle();
            case 3:
                return getImg();
            case 4:
                return Integer.valueOf(getAction());
            case 5:
                return getLink();
            case 6:
                return Integer.valueOf(getType());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[field.ordinal()]) {
            case 1:
                return isSetAid();
            case 2:
                return isSetTitle();
            case 3:
                return isSetImg();
            case 4:
                return isSetAction();
            case 5:
                return isSetLink();
            case 6:
                return isSetType();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ResourceItem$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setAid(((Integer) value).intValue());
                    break;
                } else {
                    unsetAid();
                    break;
                }
            case 2:
                if (value != null) {
                    setTitle((String) value);
                    break;
                } else {
                    unsetTitle();
                    break;
                }
            case 3:
                if (value != null) {
                    setImg((String) value);
                    break;
                } else {
                    unsetImg();
                    break;
                }
            case 4:
                if (value != null) {
                    setAction(((Integer) value).intValue());
                    break;
                } else {
                    unsetAction();
                    break;
                }
            case 5:
                if (value != null) {
                    setLink((String) value);
                    break;
                } else {
                    unsetLink();
                    break;
                }
            case 6:
                if (value != null) {
                    setType(((Integer) value).intValue());
                    break;
                } else {
                    unsetType();
                    break;
                }
        }
    }

    public boolean equals(ResourceItem that) {
        if (that == null || this.aid != that.aid) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if (((isSetImg || isSetImg2) && !(isSetImg && isSetImg2 && this.img.equals(that.img))) || this.action != that.action) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if ((isSetLink || isSetLink2) && !(isSetLink && isSetLink2 && this.link.equals(that.link))) {
            return false;
        }
        boolean isSetType = isSetType();
        boolean isSetType2 = that.isSetType();
        if (isSetType || isSetType2) {
            return isSetType && isSetType2 && this.type == that.type;
        }
        return true;
    }

    public ResourceItem(int aid, String title, String img, int action) {
        this();
        this.aid = aid;
        setAidIsSet(true);
        this.title = title;
        this.img = img;
        this.action = action;
        setActionIsSet(true);
    }

    public ResourceItem(ResourceItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK, _Fields.TYPE};
        this.__isset_bitfield = other.__isset_bitfield;
        this.aid = other.aid;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetImg()) {
            this.img = other.img;
        }
        this.action = other.action;
        if (other.isSetLink()) {
            this.link = other.link;
        }
        this.type = other.type;
    }
}
