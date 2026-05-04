package com.baicizhan.online.game_api;

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
public class AdvItem implements TBase<AdvItem, _Fields>, Serializable, Cloneable, Comparable<AdvItem> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String icon;
    public String link;
    private static final TStruct STRUCT_DESC = new TStruct("AdvItem");
    private static final TField ICON_FIELD_DESC = new TField("icon", (byte) 11, 1);
    private static final TField LINK_FIELD_DESC = new TField(y9.b.f99687c, (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.AdvItem$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$AdvItem$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$AdvItem$_Fields = iArr;
            try {
                iArr[_Fields.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$AdvItem$_Fields[_Fields.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvItemStandardScheme extends StandardScheme<AdvItem> {
        private AdvItemStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AdvItem struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 11) {
                        struct.link = iprot.readString();
                        struct.setLinkIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.icon = iprot.readString();
                    struct.setIconIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AdvItem struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AdvItem.STRUCT_DESC);
            if (struct.icon != null) {
                oprot.writeFieldBegin(AdvItem.ICON_FIELD_DESC);
                oprot.writeString(struct.icon);
                oprot.writeFieldEnd();
            }
            if (struct.link != null) {
                oprot.writeFieldBegin(AdvItem.LINK_FIELD_DESC);
                oprot.writeString(struct.link);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvItemStandardSchemeFactory implements SchemeFactory {
        private AdvItemStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvItemStandardScheme getScheme() {
            return new AdvItemStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvItemTupleScheme extends TupleScheme<AdvItem> {
        private AdvItemTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AdvItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.icon = tTupleProtocol.readString();
            struct.setIconIsSet(true);
            struct.link = tTupleProtocol.readString();
            struct.setLinkIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AdvItem struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.icon);
            tTupleProtocol.writeString(struct.link);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AdvItemTupleSchemeFactory implements SchemeFactory {
        private AdvItemTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AdvItemTupleScheme getScheme() {
            return new AdvItemTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ICON(1, "icon"),
        LINK(2, y9.b.f99687c);

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
                return ICON;
            }
            if (fieldId != 2) {
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
        hashMap.put(StandardScheme.class, new AdvItemStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AdvItemTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ICON, (_Fields) new FieldMetaData("icon", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.LINK, (_Fields) new FieldMetaData(y9.b.f99687c, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AdvItem.class, unmodifiableMap);
    }

    public AdvItem() {
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
        this.icon = null;
        this.link = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AdvItem)) {
            return equals((AdvItem) that);
        }
        return false;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getLink() {
        return this.link;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetIcon() {
        return this.icon != null;
    }

    public boolean isSetLink() {
        return this.link != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AdvItem setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public void setIconIsSet(boolean value) {
        if (value) {
            return;
        }
        this.icon = null;
    }

    public AdvItem setLink(String link) {
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
        StringBuilder sb2 = new StringBuilder("AdvItem(");
        sb2.append("icon:");
        String str = this.icon;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j2.O);
        sb2.append("link:");
        String str2 = this.link;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetIcon() {
        this.icon = null;
    }

    public void unsetLink() {
        this.link = null;
    }

    public void validate() throws TException {
        if (this.icon == null) {
            throw new TProtocolException("Required field 'icon' was not present! Struct: " + toString());
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

    public AdvItem(String icon, String link) {
        this();
        this.icon = icon;
        this.link = link;
    }

    @Override // java.lang.Comparable
    public int compareTo(AdvItem other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetIcon()).compareTo(Boolean.valueOf(other.isSetIcon()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetIcon() && (compareTo2 = TBaseHelper.compareTo(this.icon, other.icon)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetLink()).compareTo(Boolean.valueOf(other.isSetLink()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetLink() || (compareTo = TBaseHelper.compareTo(this.link, other.link)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AdvItem, _Fields> deepCopy2() {
        return new AdvItem(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AdvItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getIcon();
        }
        if (i11 == 2) {
            return getLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AdvItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetIcon();
        }
        if (i11 == 2) {
            return isSetLink();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AdvItem$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetIcon();
                return;
            } else {
                setIcon((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetLink();
        } else {
            setLink((String) value);
        }
    }

    public boolean equals(AdvItem that) {
        if (that == null) {
            return false;
        }
        boolean isSetIcon = isSetIcon();
        boolean isSetIcon2 = that.isSetIcon();
        if ((isSetIcon || isSetIcon2) && !(isSetIcon && isSetIcon2 && this.icon.equals(that.icon))) {
            return false;
        }
        boolean isSetLink = isSetLink();
        boolean isSetLink2 = that.isSetLink();
        if (isSetLink || isSetLink2) {
            return isSetLink && isSetLink2 && this.link.equals(that.link);
        }
        return true;
    }

    public AdvItem(AdvItem other) {
        if (other.isSetIcon()) {
            this.icon = other.icon;
        }
        if (other.isSetLink()) {
            this.link = other.link;
        }
    }
}
