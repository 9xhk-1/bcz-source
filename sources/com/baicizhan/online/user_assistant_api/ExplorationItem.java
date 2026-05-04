package com.baicizhan.online.user_assistant_api;

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
import md.j;
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
/* loaded from: classes6.dex */
public class ExplorationItem implements TBase<ExplorationItem, _Fields>, Serializable, Cloneable, Comparable<ExplorationItem> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String icon_url;
    public String item_tag;
    public String jump_url;
    public String subtitle;
    public String title;
    private static final TStruct STRUCT_DESC = new TStruct("ExplorationItem");
    private static final TField ICON_URL_FIELD_DESC = new TField("icon_url", (byte) 11, 1);
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 2);
    private static final TField SUBTITLE_FIELD_DESC = new TField("subtitle", (byte) 11, 3);
    private static final TField JUMP_URL_FIELD_DESC = new TField(j.f73126f, (byte) 11, 4);
    private static final TField ITEM_TAG_FIELD_DESC = new TField("item_tag", (byte) 11, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.ExplorationItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields = iArr;
            try {
                iArr[_Fields.ICON_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[_Fields.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[_Fields.SUBTITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[_Fields.JUMP_URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[_Fields.ITEM_TAG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorationItemStandardScheme extends StandardScheme<ExplorationItem> {
        private ExplorationItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExplorationItem struct) throws TException {
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
                                if (s11 != 5) {
                                    TProtocolUtil.skip(iprot, b11);
                                } else if (b11 == 11) {
                                    struct.item_tag = iprot.readString();
                                    struct.setItem_tagIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.jump_url = iprot.readString();
                                struct.setJump_urlIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.subtitle = iprot.readString();
                            struct.setSubtitleIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.title = iprot.readString();
                        struct.setTitleIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.icon_url = iprot.readString();
                    struct.setIcon_urlIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExplorationItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExplorationItem.STRUCT_DESC);
            if (struct.icon_url != null) {
                oprot.writeFieldBegin(ExplorationItem.ICON_URL_FIELD_DESC);
                oprot.writeString(struct.icon_url);
                oprot.writeFieldEnd();
            }
            if (struct.title != null) {
                oprot.writeFieldBegin(ExplorationItem.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.subtitle != null) {
                oprot.writeFieldBegin(ExplorationItem.SUBTITLE_FIELD_DESC);
                oprot.writeString(struct.subtitle);
                oprot.writeFieldEnd();
            }
            if (struct.jump_url != null) {
                oprot.writeFieldBegin(ExplorationItem.JUMP_URL_FIELD_DESC);
                oprot.writeString(struct.jump_url);
                oprot.writeFieldEnd();
            }
            if (struct.item_tag != null) {
                oprot.writeFieldBegin(ExplorationItem.ITEM_TAG_FIELD_DESC);
                oprot.writeString(struct.item_tag);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorationItemStandardSchemeFactory implements SchemeFactory {
        private ExplorationItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExplorationItemStandardScheme getScheme() {
            return new ExplorationItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorationItemTupleScheme extends TupleScheme<ExplorationItem> {
        private ExplorationItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExplorationItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.icon_url = tTupleProtocol.readString();
            struct.setIcon_urlIsSet(true);
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.subtitle = tTupleProtocol.readString();
            struct.setSubtitleIsSet(true);
            struct.jump_url = tTupleProtocol.readString();
            struct.setJump_urlIsSet(true);
            struct.item_tag = tTupleProtocol.readString();
            struct.setItem_tagIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExplorationItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.icon_url);
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.subtitle);
            tTupleProtocol.writeString(struct.jump_url);
            tTupleProtocol.writeString(struct.item_tag);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExplorationItemTupleSchemeFactory implements SchemeFactory {
        private ExplorationItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExplorationItemTupleScheme getScheme() {
            return new ExplorationItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ICON_URL(1, "icon_url"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        JUMP_URL(4, j.f73126f),
        ITEM_TAG(5, "item_tag");

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
                return ICON_URL;
            }
            if (fieldId == 2) {
                return TITLE;
            }
            if (fieldId == 3) {
                return SUBTITLE;
            }
            if (fieldId == 4) {
                return JUMP_URL;
            }
            if (fieldId != 5) {
                return null;
            }
            return ITEM_TAG;
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
        hashMap.put(StandardScheme.class, new ExplorationItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExplorationItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ICON_URL, (_Fields) new FieldMetaData("icon_url", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SUBTITLE, (_Fields) new FieldMetaData("subtitle", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.JUMP_URL, (_Fields) new FieldMetaData(j.f73126f, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ITEM_TAG, (_Fields) new FieldMetaData("item_tag", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExplorationItem.class, unmodifiableMap);
    }

    public ExplorationItem() {
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
        this.icon_url = null;
        this.title = null;
        this.subtitle = null;
        this.jump_url = null;
        this.item_tag = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExplorationItem)) {
            return equals((ExplorationItem) that);
        }
        return false;
    }

    public String getIcon_url() {
        return this.icon_url;
    }

    public String getItem_tag() {
        return this.item_tag;
    }

    public String getJump_url() {
        return this.jump_url;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIcon_url() {
        return this.icon_url != null;
    }

    public boolean isSetItem_tag() {
        return this.item_tag != null;
    }

    public boolean isSetJump_url() {
        return this.jump_url != null;
    }

    public boolean isSetSubtitle() {
        return this.subtitle != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExplorationItem setIcon_url(String icon_url) {
        this.icon_url = icon_url;
        return this;
    }

    public void setIcon_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon_url = null;
    }

    public ExplorationItem setItem_tag(String item_tag) {
        this.item_tag = item_tag;
        return this;
    }

    public void setItem_tagIsSet(boolean value) {
        if (value) {
            return;
        }
        this.item_tag = null;
    }

    public ExplorationItem setJump_url(String jump_url) {
        this.jump_url = jump_url;
        return this;
    }

    public void setJump_urlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.jump_url = null;
    }

    public ExplorationItem setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public void setSubtitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.subtitle = null;
    }

    public ExplorationItem setTitle(String title) {
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
        StringBuilder sb2 = new StringBuilder("ExplorationItem(");
        sb2.append("icon_url:");
        String str = this.icon_url;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("subtitle:");
        String str3 = this.subtitle;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(j2.O);
        sb2.append("jump_url:");
        String str4 = this.jump_url;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(j2.O);
        sb2.append("item_tag:");
        String str5 = this.item_tag;
        if (str5 == null) {
            sb2.append("null");
        } else {
            sb2.append(str5);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIcon_url() {
        this.icon_url = null;
    }

    public void unsetItem_tag() {
        this.item_tag = null;
    }

    public void unsetJump_url() {
        this.jump_url = null;
    }

    public void unsetSubtitle() {
        this.subtitle = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void validate() throws TException {
        if (this.icon_url == null) {
            throw new TProtocolException("Required field 'icon_url' was not present! Struct: " + toString());
        }
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.subtitle == null) {
            throw new TProtocolException("Required field 'subtitle' was not present! Struct: " + toString());
        }
        if (this.jump_url == null) {
            throw new TProtocolException("Required field 'jump_url' was not present! Struct: " + toString());
        }
        if (this.item_tag != null) {
            return;
        }
        throw new TProtocolException("Required field 'item_tag' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public ExplorationItem(String icon_url, String title, String subtitle, String jump_url, String item_tag) {
        this();
        this.icon_url = icon_url;
        this.title = title;
        this.subtitle = subtitle;
        this.jump_url = jump_url;
        this.item_tag = item_tag;
    }

    @Override // java.lang.Comparable
    public int compareTo(ExplorationItem other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetIcon_url()).compareTo(Boolean.valueOf(other.isSetIcon_url()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetIcon_url() && (compareTo5 = TBaseHelper.compareTo(this.icon_url, other.icon_url)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTitle() && (compareTo4 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetSubtitle()).compareTo(Boolean.valueOf(other.isSetSubtitle()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetSubtitle() && (compareTo3 = TBaseHelper.compareTo(this.subtitle, other.subtitle)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetJump_url()).compareTo(Boolean.valueOf(other.isSetJump_url()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetJump_url() && (compareTo2 = TBaseHelper.compareTo(this.jump_url, other.jump_url)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetItem_tag()).compareTo(Boolean.valueOf(other.isSetItem_tag()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetItem_tag() || (compareTo = TBaseHelper.compareTo(this.item_tag, other.item_tag)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExplorationItem, _Fields> deepCopy2() {
        return new ExplorationItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getIcon_url();
        }
        if (i11 == 2) {
            return getTitle();
        }
        if (i11 == 3) {
            return getSubtitle();
        }
        if (i11 == 4) {
            return getJump_url();
        }
        if (i11 == 5) {
            return getItem_tag();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetIcon_url();
        }
        if (i11 == 2) {
            return isSetTitle();
        }
        if (i11 == 3) {
            return isSetSubtitle();
        }
        if (i11 == 4) {
            return isSetJump_url();
        }
        if (i11 == 5) {
            return isSetItem_tag();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$ExplorationItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetIcon_url();
                return;
            } else {
                setIcon_url((String) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTitle();
                return;
            } else {
                setTitle((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetSubtitle();
                return;
            } else {
                setSubtitle((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetJump_url();
                return;
            } else {
                setJump_url((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetItem_tag();
        } else {
            setItem_tag((String) value);
        }
    }

    public boolean equals(ExplorationItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetIcon_url = isSetIcon_url();
        boolean isSetIcon_url2 = that.isSetIcon_url();
        if ((isSetIcon_url || isSetIcon_url2) && !(isSetIcon_url && isSetIcon_url2 && this.icon_url.equals(that.icon_url))) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetSubtitle = isSetSubtitle();
        boolean isSetSubtitle2 = that.isSetSubtitle();
        if ((isSetSubtitle || isSetSubtitle2) && !(isSetSubtitle && isSetSubtitle2 && this.subtitle.equals(that.subtitle))) {
            return false;
        }
        boolean isSetJump_url = isSetJump_url();
        boolean isSetJump_url2 = that.isSetJump_url();
        if ((isSetJump_url || isSetJump_url2) && !(isSetJump_url && isSetJump_url2 && this.jump_url.equals(that.jump_url))) {
            return false;
        }
        boolean isSetItem_tag = isSetItem_tag();
        boolean isSetItem_tag2 = that.isSetItem_tag();
        if (isSetItem_tag || isSetItem_tag2) {
            return isSetItem_tag && isSetItem_tag2 && this.item_tag.equals(that.item_tag);
        }
        return true;
    }

    public ExplorationItem(ExplorationItem other) {
        if (other.isSetIcon_url()) {
            this.icon_url = other.icon_url;
        }
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetSubtitle()) {
            this.subtitle = other.subtitle;
        }
        if (other.isSetJump_url()) {
            this.jump_url = other.jump_url;
        }
        if (other.isSetItem_tag()) {
            this.item_tag = other.item_tag;
        }
    }
}
