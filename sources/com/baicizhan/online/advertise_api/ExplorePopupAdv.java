package com.baicizhan.online.advertise_api;

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
public class ExplorePopupAdv implements TBase<ExplorePopupAdv, _Fields>, Serializable, Cloneable, Comparable<ExplorePopupAdv> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;

    /* renamed from: id, reason: collision with root package name */
    public String f28139id;
    public String img;
    public String link;
    private _Fields[] optionals;
    private static final TStruct STRUCT_DESC = new TStruct("ExplorePopupAdv");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 11, 1);
    private static final TField IMG_FIELD_DESC = new TField(SocialConstants.PARAM_IMG_URL, (byte) 11, 2);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.ExplorePopupAdv$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields[_Fields.IMG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields[_Fields.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorePopupAdvStandardScheme extends StandardScheme<ExplorePopupAdv> {
        private ExplorePopupAdvStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExplorePopupAdv struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 11) {
                            struct.link = iprot.readString();
                            struct.setLinkIsSet(true);
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
                    struct.f28139id = iprot.readString();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExplorePopupAdv struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExplorePopupAdv.STRUCT_DESC);
            if (struct.f28139id != null) {
                oprot.writeFieldBegin(ExplorePopupAdv.ID_FIELD_DESC);
                oprot.writeString(struct.f28139id);
                oprot.writeFieldEnd();
            }
            if (struct.img != null) {
                oprot.writeFieldBegin(ExplorePopupAdv.IMG_FIELD_DESC);
                oprot.writeString(struct.img);
                oprot.writeFieldEnd();
            }
            if (struct.link != null && struct.isSetLink()) {
                oprot.writeFieldBegin(ExplorePopupAdv.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorePopupAdvStandardSchemeFactory implements SchemeFactory {
        private ExplorePopupAdvStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExplorePopupAdvStandardScheme getScheme() {
            return new ExplorePopupAdvStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorePopupAdvTupleScheme extends TupleScheme<ExplorePopupAdv> {
        private ExplorePopupAdvTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExplorePopupAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28139id = tTupleProtocol.readString();
            struct.setIdIsSet(true);
            struct.img = tTupleProtocol.readString();
            struct.setImgIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                struct.link = tTupleProtocol.readString();
                struct.setLinkIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExplorePopupAdv struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.f28139id);
            tTupleProtocol.writeString(struct.img);
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
    public static class ExplorePopupAdvTupleSchemeFactory implements SchemeFactory {
        private ExplorePopupAdvTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExplorePopupAdvTupleScheme getScheme() {
            return new ExplorePopupAdvTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        IMG(2, SocialConstants.PARAM_IMG_URL),
        LINK(3, y9.b.f99687c);

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
                return ID;
            }
            if (fieldId == 2) {
                return IMG;
            }
            if (fieldId != 3) {
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
        hashMap.put(StandardScheme.class, new ExplorePopupAdvStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExplorePopupAdvTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMG, (_Fields) new FieldMetaData(SocialConstants.PARAM_IMG_URL, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExplorePopupAdv.class, unmodifiableMap);
    }

    public ExplorePopupAdv() {
        this.optionals = new _Fields[]{_Fields.LINK};
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
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
        this.f28139id = null;
        this.img = null;
        this.link = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExplorePopupAdv)) {
            return equals((ExplorePopupAdv) that);
        }
        return false;
    }

    public String getId() {
        return this.f28139id;
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

    public boolean isSetId() {
        return this.f28139id != null;
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

    public ExplorePopupAdv setId(String id2) {
        this.f28139id = id2;
        return this;
    }

    public void setIdIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28139id = null;
    }

    public ExplorePopupAdv setImg(String img) {
        this.img = img;
        return this;
    }

    public void setImgIsSet(boolean value) {
        if (value) {
            return;
        }
        this.img = null;
    }

    public ExplorePopupAdv setLink(String link) {
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
        StringBuilder sb2 = new StringBuilder("ExplorePopupAdv(");
        sb2.append("id:");
        String str = this.f28139id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("img:");
        String str2 = this.img;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (isSetLink()) {
            sb2.append(j2.O);
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

    public void unsetId() {
        this.f28139id = null;
    }

    public void unsetImg() {
        this.img = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void validate() throws TException {
        if (this.f28139id == null) {
            throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
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
    public int compareTo(ExplorePopupAdv other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetId() && (compareTo3 = TBaseHelper.compareTo(this.f28139id, other.f28139id)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetImg()).compareTo(Boolean.valueOf(other.isSetImg()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetImg() && (compareTo2 = TBaseHelper.compareTo(this.img, other.img)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetLink() || (compareTo = TBaseHelper.compareTo(this.link, other.link)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExplorePopupAdv, _Fields> deepCopy2() {
        return new ExplorePopupAdv(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getId();
        }
        if (i11 == 2) {
            return getImg();
        }
        if (i11 == 3) {
            return getLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetImg();
        }
        if (i11 == 3) {
            return isSetLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$ExplorePopupAdv$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId((String) value);
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
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetLink();
        } else {
            setLink((String) value);
        }
    }

    public ExplorePopupAdv(String id2, String img) {
        this();
        this.f28139id = id2;
        this.img = img;
    }

    public boolean equals(ExplorePopupAdv that) {
        if (that == null) {
            return false;
        }
        boolean isSetId = isSetId();
        boolean isSetId2 = that.isSetId();
        if ((isSetId || isSetId2) && !(isSetId && isSetId2 && this.f28139id.equals(that.f28139id))) {
            return false;
        }
        boolean isSetImg = isSetImg();
        boolean isSetImg2 = that.isSetImg();
        if ((isSetImg || isSetImg2) && !(isSetImg && isSetImg2 && this.img.equals(that.img))) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if (isSetLink || isSetLink2) {
            return isSetLink && isSetLink2 && this.link.equals(that.link);
        }
        return true;
    }

    public ExplorePopupAdv(ExplorePopupAdv other) {
        this.optionals = new _Fields[]{_Fields.LINK};
        if (other.isSetId()) {
            this.f28139id = other.f28139id;
        }
        if (other.isSetImg()) {
            this.img = other.img;
        }
        if (other.isSetLink()) {
            this.link = other.link;
        }
    }
}
