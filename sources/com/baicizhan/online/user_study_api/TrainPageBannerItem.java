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
public class TrainPageBannerItem implements TBase<TrainPageBannerItem, _Fields>, Serializable, Cloneable, Comparable<TrainPageBannerItem> {
    private static final int __ACTION_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int action;
    public String aid;
    public String img;
    public String link;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("TrainPageBannerItem");
    private static final TField AID_FIELD_DESC = new TField("aid", (byte) 11, 1);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 2);
    private static final TField ACTION_FIELD_DESC = new TField("action", (byte) 8, 3);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.TrainPageBannerItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields = iArr;
            try {
                iArr[_Fields.AID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields[_Fields.IMG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields[_Fields.ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields[_Fields.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageBannerItemStandardScheme extends StandardScheme<TrainPageBannerItem> {
        private TrainPageBannerItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, TrainPageBannerItem struct) throws TException {
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
                    struct.aid = iprot.readString();
                    struct.setAidIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetAction()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'action' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, TrainPageBannerItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(TrainPageBannerItem.STRUCT_DESC);
            if (struct.aid != null) {
                oprot.writeFieldBegin(TrainPageBannerItem.AID_FIELD_DESC);
                oprot.writeString(struct.aid);
                oprot.writeFieldEnd();
            }
            if (struct.img != null) {
                oprot.writeFieldBegin(TrainPageBannerItem.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(TrainPageBannerItem.ACTION_FIELD_DESC);
            oprot.writeI32(struct.action);
            oprot.writeFieldEnd();
            if (struct.link != null && struct.isSetLink()) {
                oprot.writeFieldBegin(TrainPageBannerItem.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageBannerItemStandardSchemeFactory implements SchemeFactory {
        private TrainPageBannerItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TrainPageBannerItemStandardScheme getScheme() {
            return new TrainPageBannerItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageBannerItemTupleScheme extends TupleScheme<TrainPageBannerItem> {
        private TrainPageBannerItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, TrainPageBannerItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.aid = tTupleProtocol.readString();
            struct.setAidIsSet(true);
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
            struct.action = tTupleProtocol.readI32();
            struct.setActionIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.link = tTupleProtocol.readString();
                struct.setLinkIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, TrainPageBannerItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.aid);
            tTupleProtocol.writeString(struct.img);
            tTupleProtocol.writeI32(struct.action);
            BitSet bitSet = new BitSet();
            if (struct.isSetLink()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetLink()) {
                tTupleProtocol.writeString(struct.link);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TrainPageBannerItemTupleSchemeFactory implements SchemeFactory {
        private TrainPageBannerItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public TrainPageBannerItemTupleScheme getScheme() {
            return new TrainPageBannerItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AID(1, "aid"),
        IMG(2, SocialConstants.PARAM_IMG_URL),
        ACTION(3, "action"),
        LINK(4, y9.b.f99687c);

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
                return IMG;
            }
            if (fieldId == 3) {
                return ACTION;
            }
            if (fieldId != 4) {
                return null;
            }
            return LINK;
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
        hashMap.put(StandardScheme.class, new TrainPageBannerItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new TrainPageBannerItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AID, (_Fields) new FieldMetaData("aid", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ACTION, (_Fields) new FieldMetaData("action", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(TrainPageBannerItem.class, unmodifiableMap);
    }

    public TrainPageBannerItem() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK};
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
        this.aid = null;
        this.img = null;
        setActionIsSet(false);
        this.action = 0;
        this.link = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof TrainPageBannerItem)) {
            return equals((TrainPageBannerItem) that);
        }
        return false;
    }

    public int getAction() {
        return this.action;
    }

    public String getAid() {
        return this.aid;
    }

    public String getImg() {
        return this.img;
    }

    public String getLink() {
        return this.link;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAction() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetAid() {
        return this.aid != null;
    }

    public boolean isSetImg() {
        return this.img != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public TrainPageBannerItem setAction(int action) {
        this.action = action;
        setActionIsSet(true);
        return this;
    }

    public void setActionIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public TrainPageBannerItem setAid(String aid) {
        this.aid = aid;
        return this;
    }

    public void setAidIsSet(boolean value) {
        if (value) {
            return;
        }
        this.aid = null;
    }

    public TrainPageBannerItem setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public TrainPageBannerItem setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrainPageBannerItem(");
        sb2.append("aid:");
        String str = this.aid;
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
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAction() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetAid() {
        this.aid = null;
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void validate() throws TException {
        if (this.aid == null) {
            throw new TProtocolException("Required field 'aid' was not present! Struct: " + toString());
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
    public int compareTo(TrainPageBannerItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetAid()).compareTo(Boolean.valueOf(other.isSetAid()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetAid() && (compareTo4 = TBaseHelper.compareTo(this.aid, other.aid)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetImg() && (compareTo3 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetAction()).compareTo(Boolean.valueOf(other.isSetAction()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAction() && (compareTo2 = TBaseHelper.compareTo(this.action, other.action)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetLink() || (compareTo = TBaseHelper.compareTo(this.link, other.link)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<TrainPageBannerItem, _Fields> deepCopy2() {
        return new TrainPageBannerItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getAid();
        }
        if (i11 == 2) {
            return getImg();
        }
        if (i11 == 3) {
            return Integer.valueOf(getAction());
        }
        if (i11 == 4) {
            return getLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetAid();
        }
        if (i11 == 2) {
            return isSetImg();
        }
        if (i11 == 3) {
            return isSetAction();
        }
        if (i11 == 4) {
            return isSetLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$TrainPageBannerItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetAid();
                return;
            } else {
                setAid((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetImg();
                return;
            } else {
                setImg((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetAction();
                return;
            } else {
                setAction(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetLink();
        } else {
            setLink((String) value);
        }
    }

    public boolean equals(TrainPageBannerItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetAid = isSetAid();
        boolean isSetAid2 = that.isSetAid();
        if ((isSetAid || isSetAid2) && !(isSetAid && isSetAid2 && this.aid.equals(that.aid))) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if (((isSetImg || isSetImg2) && !(isSetImg && isSetImg2 && this.img.equals(that.img))) || this.action != that.action) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if (isSetLink || isSetLink2) {
            return isSetLink && isSetLink2 && this.link.equals(that.link);
        }
        return true;
    }

    public TrainPageBannerItem(String aid, String img, int action) {
        this();
        this.aid = aid;
        this.img = img;
        this.action = action;
        setActionIsSet(true);
    }

    public TrainPageBannerItem(TrainPageBannerItem other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.LINK};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetAid()) {
            this.aid = other.aid;
        }
        if (other.isSetImg()) {
            this.img = other.img;
        }
        this.action = other.action;
        if (other.isSetLink()) {
            this.link = other.link;
        }
    }
}
