package com.baicizhan.online.user_study_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SearchPageResource implements TBase<SearchPageResource, _Fields>, Serializable, Cloneable, Comparable<SearchPageResource> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String image;
    public String link;
    private _Fields[] optionals;
    public String sub_title;
    public String title;
    private static final TStruct STRUCT_DESC = new TStruct("SearchPageResource");
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 1);
    private static final TField SUB_TITLE_FIELD_DESC = new TField("sub_title", (byte) 11, 2);
    private static final TField IMAGE_FIELD_DESC = new TField("image", (byte) 11, 3);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.SearchPageResource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields = iArr;
            try {
                iArr[_Fields.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields[_Fields.SUB_TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields[_Fields.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields[_Fields.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourceStandardScheme extends StandardScheme<SearchPageResource> {
        private SearchPageResourceStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, SearchPageResource struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.link = iprot.readString();
                                struct.setLinkIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.image = iprot.readString();
                            struct.setImageIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.sub_title = iprot.readString();
                        struct.setSub_titleIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.title = iprot.readString();
                    struct.setTitleIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, SearchPageResource struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(SearchPageResource.STRUCT_DESC);
            if (struct.title != null) {
                oprot.writeFieldBegin(SearchPageResource.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.sub_title != null && struct.isSetSub_title()) {
                oprot.writeFieldBegin(SearchPageResource.SUB_TITLE_FIELD_DESC);
                oprot.writeString(struct.sub_title);
                oprot.writeFieldEnd();
            }
            if (struct.image != null && struct.isSetImage()) {
                oprot.writeFieldBegin(SearchPageResource.IMAGE_FIELD_DESC);
                oprot.writeString(struct.image);
                oprot.writeFieldEnd();
            }
            if (struct.link != null) {
                oprot.writeFieldBegin(SearchPageResource.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourceStandardSchemeFactory implements SchemeFactory {
        private SearchPageResourceStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchPageResourceStandardScheme getScheme() {
            return new SearchPageResourceStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourceTupleScheme extends TupleScheme<SearchPageResource> {
        private SearchPageResourceTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, SearchPageResource struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                struct.sub_title = tTupleProtocol.readString();
                struct.setSub_titleIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.image = tTupleProtocol.readString();
                struct.setImageIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, SearchPageResource struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.link);
            BitSet bitSet = new BitSet();
            if (struct.isSetSub_title()) {
                bitSet.set(0);
            }
            if (struct.isSetImage()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetSub_title()) {
                tTupleProtocol.writeString(struct.sub_title);
            }
            if (struct.isSetImage()) {
                tTupleProtocol.writeString(struct.image);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SearchPageResourceTupleSchemeFactory implements SchemeFactory {
        private SearchPageResourceTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public SearchPageResourceTupleScheme getScheme() {
            return new SearchPageResourceTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TITLE(1, "title"),
        SUB_TITLE(2, "sub_title"),
        IMAGE(3, "image"),
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
                return TITLE;
            }
            if (fieldId == 2) {
                return SUB_TITLE;
            }
            if (fieldId == 3) {
                return IMAGE;
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
        hashMap.put(StandardScheme.class, new SearchPageResourceStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new SearchPageResourceTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUB_TITLE, (_Fields) new FieldMetaData("sub_title", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.IMAGE, (_Fields) new FieldMetaData("image", (byte) 2, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(SearchPageResource.class, unmodifiableMap);
    }

    public SearchPageResource() {
        this.optionals = new _Fields[]{_Fields.SUB_TITLE, _Fields.IMAGE};
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
        this.title = null;
        this.sub_title = null;
        this.image = null;
        this.link = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof SearchPageResource)) {
            return equals((SearchPageResource) that);
        }
        return false;
    }

    public String getImage() {
        return this.image;
    }

    public String getLink() {
        return this.link;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetImage() {
        return this.image != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    public boolean isSetSub_title() {
        return this.sub_title != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public SearchPageResource setImage(String image) {
        this.image = image;
        return this;
    }

    public void setImageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.image = null;
    }

    public SearchPageResource setLink(String link) {
        this.link = link;
        return this;
    }

    public void setLinkIsSet(boolean value) {
        if (value) {
            return;
        }
        this.link = null;
    }

    public SearchPageResource setSub_title(String sub_title) {
        this.sub_title = sub_title;
        return this;
    }

    public void setSub_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sub_title = null;
    }

    public SearchPageResource setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchPageResource(");
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetSub_title()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("sub_title:");
            String str2 = this.sub_title;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (isSetImage()) {
            sb2.append(org.junit.jupiter.api.j2.O);
            sb2.append("image:");
            String str3 = this.image;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("link:");
        String str4 = this.link;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetImage() {
        this.image = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void unsetSub_title() {
        this.sub_title = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
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
    public int compareTo(SearchPageResource other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetTitle() && (compareTo4 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetSub_title()).compareTo(Boolean.valueOf(other.isSetSub_title()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetSub_title() && (compareTo3 = TBaseHelper.compareTo(this.sub_title, other.sub_title)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetImage()).compareTo(Boolean.valueOf(other.isSetImage()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetImage() && (compareTo2 = TBaseHelper.compareTo(this.image, other.image)) != 0) {
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
    public TBase<SearchPageResource, _Fields> deepCopy2() {
        return new SearchPageResource(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTitle();
        }
        if (i11 == 2) {
            return getSub_title();
        }
        if (i11 == 3) {
            return getImage();
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
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTitle();
        }
        if (i11 == 2) {
            return isSetSub_title();
        }
        if (i11 == 3) {
            return isSetImage();
        }
        if (i11 == 4) {
            return isSetLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$SearchPageResource$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetTitle();
                return;
            } else {
                setTitle((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetSub_title();
                return;
            } else {
                setSub_title((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetImage();
                return;
            } else {
                setImage((String) value);
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

    public SearchPageResource(String title, String link) {
        this();
        this.title = title;
        this.link = link;
    }

    public boolean equals(SearchPageResource that) {
        if (that == null) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetSub_title = isSetSub_title();
        boolean isSetSub_title2 = that.isSetSub_title();
        if ((isSetSub_title || isSetSub_title2) && !(isSetSub_title && isSetSub_title2 && this.sub_title.equals(that.sub_title))) {
            return false;
        }
        boolean isSetImage = isSetImage();
        boolean isSetImage2 = that.isSetImage();
        if ((isSetImage || isSetImage2) && !(isSetImage && isSetImage2 && this.image.equals(that.image))) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if (isSetLink || isSetLink2) {
            return isSetLink && isSetLink2 && this.link.equals(that.link);
        }
        return true;
    }

    public SearchPageResource(SearchPageResource other) {
        this.optionals = new _Fields[]{_Fields.SUB_TITLE, _Fields.IMAGE};
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetSub_title()) {
            this.sub_title = other.sub_title;
        }
        if (other.isSetImage()) {
            this.image = other.image;
        }
        if (other.isSetLink()) {
            this.link = other.link;
        }
    }
}
