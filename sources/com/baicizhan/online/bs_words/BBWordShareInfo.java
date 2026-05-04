package com.baicizhan.online.bs_words;

import com.tencent.open.SocialConstants;
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
public class BBWordShareInfo implements TBase<BBWordShareInfo, _Fields>, Serializable, Cloneable, Comparable<BBWordShareInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String desc;
    public String title;
    public String url;
    private static final TStruct STRUCT_DESC = new TStruct("BBWordShareInfo");
    private static final TField TITLE_FIELD_DESC = new TField("title", (byte) 11, 1);
    private static final TField DESC_FIELD_DESC = new TField(SocialConstants.PARAM_APP_DESC, (byte) 11, 2);
    private static final TField URL_FIELD_DESC = new TField("url", (byte) 11, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_words.BBWordShareInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields = iArr;
            try {
                iArr[_Fields.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields[_Fields.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields[_Fields.URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordShareInfoStandardScheme extends StandardScheme<BBWordShareInfo> {
        private BBWordShareInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBWordShareInfo struct) throws TException {
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
                            struct.url = iprot.readString();
                            struct.setUrlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.desc = iprot.readString();
                        struct.setDescIsSet(true);
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
        public void write(TProtocol oprot, BBWordShareInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBWordShareInfo.STRUCT_DESC);
            if (struct.title != null) {
                oprot.writeFieldBegin(BBWordShareInfo.TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.desc != null) {
                oprot.writeFieldBegin(BBWordShareInfo.DESC_FIELD_DESC);
                oprot.writeString(struct.desc);
                oprot.writeFieldEnd();
            }
            if (struct.url != null) {
                oprot.writeFieldBegin(BBWordShareInfo.URL_FIELD_DESC);
                oprot.writeString(struct.url);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordShareInfoStandardSchemeFactory implements SchemeFactory {
        private BBWordShareInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordShareInfoStandardScheme getScheme() {
            return new BBWordShareInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordShareInfoTupleScheme extends TupleScheme<BBWordShareInfo> {
        private BBWordShareInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBWordShareInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.title = tTupleProtocol.readString();
            struct.setTitleIsSet(true);
            struct.desc = tTupleProtocol.readString();
            struct.setDescIsSet(true);
            struct.url = tTupleProtocol.readString();
            struct.setUrlIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBWordShareInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.title);
            tTupleProtocol.writeString(struct.desc);
            tTupleProtocol.writeString(struct.url);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBWordShareInfoTupleSchemeFactory implements SchemeFactory {
        private BBWordShareInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBWordShareInfoTupleScheme getScheme() {
            return new BBWordShareInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TITLE(1, "title"),
        DESC(2, SocialConstants.PARAM_APP_DESC),
        URL(3, "url");

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
                return DESC;
            }
            if (fieldId != 3) {
                return null;
            }
            return URL;
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
        hashMap.put(StandardScheme.class, new BBWordShareInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBWordShareInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TITLE, (_Fields) new FieldMetaData("title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DESC, (_Fields) new FieldMetaData(SocialConstants.PARAM_APP_DESC, (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.URL, (_Fields) new FieldMetaData("url", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBWordShareInfo.class, unmodifiableMap);
    }

    public BBWordShareInfo() {
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
        this.desc = null;
        this.url = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBWordShareInfo)) {
            return equals((BBWordShareInfo) that);
        }
        return false;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDesc() {
        return this.desc != null;
    }

    public boolean isSetTitle() {
        return this.title != null;
    }

    public boolean isSetUrl() {
        return this.url != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBWordShareInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public void setDescIsSet(boolean value) {
        if (value) {
            return;
        }
        this.desc = null;
    }

    public BBWordShareInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    public void setTitleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.title = null;
    }

    public BBWordShareInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public void setUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.url = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBWordShareInfo(");
        sb2.append("title:");
        String str = this.title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("desc:");
        String str2 = this.desc;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(j2.O);
        sb2.append("url:");
        String str3 = this.url;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDesc() {
        this.desc = null;
    }

    public void unsetTitle() {
        this.title = null;
    }

    public void unsetUrl() {
        this.url = null;
    }

    public void validate() throws TException {
        if (this.title == null) {
            throw new TProtocolException("Required field 'title' was not present! Struct: " + toString());
        }
        if (this.desc == null) {
            throw new TProtocolException("Required field 'desc' was not present! Struct: " + toString());
        }
        if (this.url != null) {
            return;
        }
        throw new TProtocolException("Required field 'url' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BBWordShareInfo(String title, String desc, String url) {
        this();
        this.title = title;
        this.desc = desc;
        this.url = url;
    }

    @Override // java.lang.Comparable
    public int compareTo(BBWordShareInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetTitle()).compareTo(Boolean.valueOf(other.isSetTitle()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetTitle() && (compareTo3 = TBaseHelper.compareTo(this.title, other.title)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetDesc()).compareTo(Boolean.valueOf(other.isSetDesc()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetDesc() && (compareTo2 = TBaseHelper.compareTo(this.desc, other.desc)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetUrl()).compareTo(Boolean.valueOf(other.isSetUrl()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetUrl() || (compareTo = TBaseHelper.compareTo(this.url, other.url)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBWordShareInfo, _Fields> deepCopy2() {
        return new BBWordShareInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getTitle();
        }
        if (i11 == 2) {
            return getDesc();
        }
        if (i11 == 3) {
            return getUrl();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetTitle();
        }
        if (i11 == 2) {
            return isSetDesc();
        }
        if (i11 == 3) {
            return isSetUrl();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_words$BBWordShareInfo$_Fields[field.ordinal()];
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
                unsetDesc();
                return;
            } else {
                setDesc((String) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetUrl();
        } else {
            setUrl((String) value);
        }
    }

    public boolean equals(BBWordShareInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetTitle = isSetTitle();
        boolean isSetTitle2 = that.isSetTitle();
        if ((isSetTitle || isSetTitle2) && !(isSetTitle && isSetTitle2 && this.title.equals(that.title))) {
            return false;
        }
        boolean isSetDesc = isSetDesc();
        boolean isSetDesc2 = that.isSetDesc();
        if ((isSetDesc || isSetDesc2) && !(isSetDesc && isSetDesc2 && this.desc.equals(that.desc))) {
            return false;
        }
        boolean isSetUrl = isSetUrl();
        boolean isSetUrl2 = that.isSetUrl();
        if (isSetUrl || isSetUrl2) {
            return isSetUrl && isSetUrl2 && this.url.equals(that.url);
        }
        return true;
    }

    public BBWordShareInfo(BBWordShareInfo other) {
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetDesc()) {
            this.desc = other.desc;
        }
        if (other.isSetUrl()) {
            this.url = other.url;
        }
    }
}
