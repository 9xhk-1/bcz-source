package com.baicizhan.online.user_study_api;

import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TList;
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
public class ModeDetail implements TBase<ModeDetail, _Fields>, Serializable, Cloneable, Comparable<ModeDetail> {
    private static final int __ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public List<ModeDesc> desc;
    public String iconUrl;

    /* renamed from: id, reason: collision with root package name */
    public int f28166id;
    public String name;
    public String shorDesc;
    private static final TStruct STRUCT_DESC = new TStruct("ModeDetail");
    private static final TField ID_FIELD_DESC = new TField("id", (byte) 8, 1);
    private static final TField NAME_FIELD_DESC = new TField("name", (byte) 11, 2);
    private static final TField ICON_URL_FIELD_DESC = new TField("iconUrl", (byte) 11, 3);
    private static final TField SHOR_DESC_FIELD_DESC = new TField("shorDesc", (byte) 11, 4);
    private static final TField DESC_FIELD_DESC = new TField(SocialConstants.PARAM_APP_DESC, (byte) 15, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ModeDetail$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields = iArr;
            try {
                iArr[_Fields.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[_Fields.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[_Fields.ICON_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[_Fields.SHOR_DESC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[_Fields.DESC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ModeDetailStandardScheme extends StandardScheme<ModeDetail> {
        private ModeDetailStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ModeDetail struct) throws TException {
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
                                } else if (b11 == 15) {
                                    TList readListBegin = iprot.readListBegin();
                                    struct.desc = new ArrayList(readListBegin.size);
                                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                                        ModeDesc modeDesc = new ModeDesc();
                                        modeDesc.read(iprot);
                                        struct.desc.add(modeDesc);
                                    }
                                    iprot.readListEnd();
                                    struct.setDescIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 11) {
                                struct.shorDesc = iprot.readString();
                                struct.setShorDescIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 11) {
                            struct.iconUrl = iprot.readString();
                            struct.setIconUrlIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.name = iprot.readString();
                        struct.setNameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.f28166id = iprot.readI32();
                    struct.setIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (struct.isSetId()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ModeDetail struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ModeDetail.STRUCT_DESC);
            oprot.writeFieldBegin(ModeDetail.ID_FIELD_DESC);
            oprot.writeI32(struct.f28166id);
            oprot.writeFieldEnd();
            if (struct.name != null) {
                oprot.writeFieldBegin(ModeDetail.NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.iconUrl != null) {
                oprot.writeFieldBegin(ModeDetail.ICON_URL_FIELD_DESC);
                oprot.writeString(struct.iconUrl);
                oprot.writeFieldEnd();
            }
            if (struct.shorDesc != null) {
                oprot.writeFieldBegin(ModeDetail.SHOR_DESC_FIELD_DESC);
                oprot.writeString(struct.shorDesc);
                oprot.writeFieldEnd();
            }
            if (struct.desc != null) {
                oprot.writeFieldBegin(ModeDetail.DESC_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.desc.size()));
                Iterator<ModeDesc> it = struct.desc.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ModeDetailStandardSchemeFactory implements SchemeFactory {
        private ModeDetailStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ModeDetailStandardScheme getScheme() {
            return new ModeDetailStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ModeDetailTupleScheme extends TupleScheme<ModeDetail> {
        private ModeDetailTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ModeDetail struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28166id = tTupleProtocol.readI32();
            struct.setIdIsSet(true);
            struct.name = tTupleProtocol.readString();
            struct.setNameIsSet(true);
            struct.iconUrl = tTupleProtocol.readString();
            struct.setIconUrlIsSet(true);
            struct.shorDesc = tTupleProtocol.readString();
            struct.setShorDescIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.desc = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                ModeDesc modeDesc = new ModeDesc();
                modeDesc.read(tTupleProtocol);
                struct.desc.add(modeDesc);
            }
            struct.setDescIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ModeDetail struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.f28166id);
            tTupleProtocol.writeString(struct.name);
            tTupleProtocol.writeString(struct.iconUrl);
            tTupleProtocol.writeString(struct.shorDesc);
            tTupleProtocol.writeI32(struct.desc.size());
            Iterator<ModeDesc> it = struct.desc.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ModeDetailTupleSchemeFactory implements SchemeFactory {
        private ModeDetailTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ModeDetailTupleScheme getScheme() {
            return new ModeDetailTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        ID(1, "id"),
        NAME(2, "name"),
        ICON_URL(3, "iconUrl"),
        SHOR_DESC(4, "shorDesc"),
        DESC(5, SocialConstants.PARAM_APP_DESC);

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
                return NAME;
            }
            if (fieldId == 3) {
                return ICON_URL;
            }
            if (fieldId == 4) {
                return SHOR_DESC;
            }
            if (fieldId != 5) {
                return null;
            }
            return DESC;
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
        hashMap.put(StandardScheme.class, new ModeDetailStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ModeDetailTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.ID, (_Fields) new FieldMetaData("id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NAME, (_Fields) new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.ICON_URL, (_Fields) new FieldMetaData("iconUrl", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.SHOR_DESC, (_Fields) new FieldMetaData("shorDesc", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.DESC, (_Fields) new FieldMetaData(SocialConstants.PARAM_APP_DESC, (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ModeDesc.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ModeDetail.class, unmodifiableMap);
    }

    public ModeDetail() {
        this.__isset_bitfield = (byte) 0;
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

    public void addToDesc(ModeDesc elem) {
        if (this.desc == null) {
            this.desc = new ArrayList();
        }
        this.desc.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        setIdIsSet(false);
        this.f28166id = 0;
        this.name = null;
        this.iconUrl = null;
        this.shorDesc = null;
        this.desc = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ModeDetail)) {
            return equals((ModeDetail) that);
        }
        return false;
    }

    public List<ModeDesc> getDesc() {
        return this.desc;
    }

    public Iterator<ModeDesc> getDescIterator() {
        List<ModeDesc> list = this.desc;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getDescSize() {
        List<ModeDesc> list = this.desc;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getId() {
        return this.f28166id;
    }

    public String getName() {
        return this.name;
    }

    public String getShorDesc() {
        return this.shorDesc;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetDesc() {
        return this.desc != null;
    }

    public boolean isSetIconUrl() {
        return this.iconUrl != null;
    }

    public boolean isSetId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetName() {
        return this.name != null;
    }

    public boolean isSetShorDesc() {
        return this.shorDesc != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ModeDetail setDesc(List<ModeDesc> desc) {
        this.desc = desc;
        return this;
    }

    public void setDescIsSet(boolean value) {
        if (value) {
            return;
        }
        this.desc = null;
    }

    public ModeDetail setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public void setIconUrlIsSet(boolean value) {
        if (value) {
            return;
        }
        this.iconUrl = null;
    }

    public ModeDetail setId(int id2) {
        this.f28166id = id2;
        setIdIsSet(true);
        return this;
    }

    public void setIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ModeDetail setName(String name) {
        this.name = name;
        return this;
    }

    public void setNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.name = null;
    }

    public ModeDetail setShorDesc(String shorDesc) {
        this.shorDesc = shorDesc;
        return this;
    }

    public void setShorDescIsSet(boolean value) {
        if (value) {
            return;
        }
        this.shorDesc = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModeDetail(");
        sb2.append("id:");
        sb2.append(this.f28166id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("name:");
        String str = this.name;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("iconUrl:");
        String str2 = this.iconUrl;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("shorDesc:");
        String str3 = this.shorDesc;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("desc:");
        List<ModeDesc> list = this.desc;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetDesc() {
        this.desc = null;
    }

    public void unsetIconUrl() {
        this.iconUrl = null;
    }

    public void unsetId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetName() {
        this.name = null;
    }

    public void unsetShorDesc() {
        this.shorDesc = null;
    }

    public void validate() throws TException {
        if (this.name == null) {
            throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (this.iconUrl == null) {
            throw new TProtocolException("Required field 'iconUrl' was not present! Struct: " + toString());
        }
        if (this.shorDesc == null) {
            throw new TProtocolException("Required field 'shorDesc' was not present! Struct: " + toString());
        }
        if (this.desc != null) {
            return;
        }
        throw new TProtocolException("Required field 'desc' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ModeDetail other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(other.isSetId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetId() && (compareTo5 = TBaseHelper.compareTo(this.f28166id, other.f28166id)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetName()).compareTo(Boolean.valueOf(other.isSetName()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetName() && (compareTo4 = TBaseHelper.compareTo(this.name, other.name)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetIconUrl()).compareTo(Boolean.valueOf(other.isSetIconUrl()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetIconUrl() && (compareTo3 = TBaseHelper.compareTo(this.iconUrl, other.iconUrl)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetShorDesc()).compareTo(Boolean.valueOf(other.isSetShorDesc()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetShorDesc() && (compareTo2 = TBaseHelper.compareTo(this.shorDesc, other.shorDesc)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetDesc()).compareTo(Boolean.valueOf(other.isSetDesc()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetDesc() || (compareTo = TBaseHelper.compareTo((List) this.desc, (List) other.desc)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ModeDetail, _Fields> deepCopy2() {
        return new ModeDetail(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getId());
        }
        if (i11 == 2) {
            return getName();
        }
        if (i11 == 3) {
            return getIconUrl();
        }
        if (i11 == 4) {
            return getShorDesc();
        }
        if (i11 == 5) {
            return getDesc();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetId();
        }
        if (i11 == 2) {
            return isSetName();
        }
        if (i11 == 3) {
            return isSetIconUrl();
        }
        if (i11 == 4) {
            return isSetShorDesc();
        }
        if (i11 == 5) {
            return isSetDesc();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ModeDetail$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetId();
                return;
            } else {
                setId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetName();
                return;
            } else {
                setName((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetIconUrl();
                return;
            } else {
                setIconUrl((String) value);
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetShorDesc();
                return;
            } else {
                setShorDesc((String) value);
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetDesc();
        } else {
            setDesc((List) value);
        }
    }

    public ModeDetail(int id2, String name, String iconUrl, String shorDesc, List<ModeDesc> desc) {
        this();
        this.f28166id = id2;
        setIdIsSet(true);
        this.name = name;
        this.iconUrl = iconUrl;
        this.shorDesc = shorDesc;
        this.desc = desc;
    }

    public boolean equals(ModeDetail that) {
        if (that == null || this.f28166id != that.f28166id) {
            return false;
        }
        boolean isSetName = isSetName();
        boolean isSetName2 = that.isSetName();
        if ((isSetName || isSetName2) && !(isSetName && isSetName2 && this.name.equals(that.name))) {
            return false;
        }
        boolean isSetIconUrl = isSetIconUrl();
        boolean isSetIconUrl2 = that.isSetIconUrl();
        if ((isSetIconUrl || isSetIconUrl2) && !(isSetIconUrl && isSetIconUrl2 && this.iconUrl.equals(that.iconUrl))) {
            return false;
        }
        boolean isSetShorDesc = isSetShorDesc();
        boolean isSetShorDesc2 = that.isSetShorDesc();
        if ((isSetShorDesc || isSetShorDesc2) && !(isSetShorDesc && isSetShorDesc2 && this.shorDesc.equals(that.shorDesc))) {
            return false;
        }
        boolean isSetDesc = isSetDesc();
        boolean isSetDesc2 = that.isSetDesc();
        if (isSetDesc || isSetDesc2) {
            return isSetDesc && isSetDesc2 && this.desc.equals(that.desc);
        }
        return true;
    }

    public ModeDetail(ModeDetail other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.f28166id = other.f28166id;
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetIconUrl()) {
            this.iconUrl = other.iconUrl;
        }
        if (other.isSetShorDesc()) {
            this.shorDesc = other.shorDesc;
        }
        if (other.isSetDesc()) {
            ArrayList arrayList = new ArrayList(other.desc.size());
            Iterator<ModeDesc> it = other.desc.iterator();
            while (it.hasNext()) {
                arrayList.add(new ModeDesc(it.next()));
            }
            this.desc = arrayList;
        }
    }
}
