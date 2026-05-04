package com.baicizhan.online.bs_fights;

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
import org.apache.thrift.meta_data.StructMetaData;
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
public class BBSelectInfo implements TBase<BBSelectInfo, _Fields>, Serializable, Cloneable, Comparable<BBSelectInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public BBFightUserBasicInfo selected;
    public BBUserInfo user_info;
    private static final TStruct STRUCT_DESC = new TStruct("BBSelectInfo");
    private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 1);
    private static final TField SELECTED_FIELD_DESC = new TField("selected", (byte) 12, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBSelectInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBSelectInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBSelectInfo$_Fields = iArr;
            try {
                iArr[_Fields.USER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBSelectInfo$_Fields[_Fields.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSelectInfoStandardScheme extends StandardScheme<BBSelectInfo> {
        private BBSelectInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBSelectInfo struct) throws TException {
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
                    } else if (b11 == 12) {
                        BBFightUserBasicInfo bBFightUserBasicInfo = new BBFightUserBasicInfo();
                        struct.selected = bBFightUserBasicInfo;
                        bBFightUserBasicInfo.read(iprot);
                        struct.setSelectedIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BBUserInfo bBUserInfo = new BBUserInfo();
                    struct.user_info = bBUserInfo;
                    bBUserInfo.read(iprot);
                    struct.setUser_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBSelectInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBSelectInfo.STRUCT_DESC);
            if (struct.user_info != null) {
                oprot.writeFieldBegin(BBSelectInfo.USER_INFO_FIELD_DESC);
                struct.user_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.selected != null && struct.isSetSelected()) {
                oprot.writeFieldBegin(BBSelectInfo.SELECTED_FIELD_DESC);
                struct.selected.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSelectInfoStandardSchemeFactory implements SchemeFactory {
        private BBSelectInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSelectInfoStandardScheme getScheme() {
            return new BBSelectInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSelectInfoTupleScheme extends TupleScheme<BBSelectInfo> {
        private BBSelectInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBSelectInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BBUserInfo bBUserInfo = new BBUserInfo();
            struct.user_info = bBUserInfo;
            bBUserInfo.read(tTupleProtocol);
            struct.setUser_infoIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                BBFightUserBasicInfo bBFightUserBasicInfo = new BBFightUserBasicInfo();
                struct.selected = bBFightUserBasicInfo;
                bBFightUserBasicInfo.read(tTupleProtocol);
                struct.setSelectedIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBSelectInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_info.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetSelected()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetSelected()) {
                struct.selected.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBSelectInfoTupleSchemeFactory implements SchemeFactory {
        private BBSelectInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBSelectInfoTupleScheme getScheme() {
            return new BBSelectInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_INFO(1, i9.m.f60424b),
        SELECTED(2, "selected");

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
                return USER_INFO;
            }
            if (fieldId != 2) {
                return null;
            }
            return SELECTED;
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
        hashMap.put(StandardScheme.class, new BBSelectInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBSelectInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, BBUserInfo.class)));
        enumMap.put((EnumMap) _Fields.SELECTED, (_Fields) new FieldMetaData("selected", (byte) 2, new StructMetaData((byte) 12, BBFightUserBasicInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBSelectInfo.class, unmodifiableMap);
    }

    public BBSelectInfo() {
        this.optionals = new _Fields[]{_Fields.SELECTED};
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
        this.user_info = null;
        this.selected = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBSelectInfo)) {
            return equals((BBSelectInfo) that);
        }
        return false;
    }

    public BBFightUserBasicInfo getSelected() {
        return this.selected;
    }

    public BBUserInfo getUser_info() {
        return this.user_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetSelected() {
        return this.selected != null;
    }

    public boolean isSetUser_info() {
        return this.user_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBSelectInfo setSelected(BBFightUserBasicInfo selected) {
        this.selected = selected;
        return this;
    }

    public void setSelectedIsSet(boolean value) {
        if (value) {
            return;
        }
        this.selected = null;
    }

    public BBSelectInfo setUser_info(BBUserInfo user_info) {
        this.user_info = user_info;
        return this;
    }

    public void setUser_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBSelectInfo(");
        sb2.append("user_info:");
        BBUserInfo bBUserInfo = this.user_info;
        if (bBUserInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBUserInfo);
        }
        if (isSetSelected()) {
            sb2.append(j2.O);
            sb2.append("selected:");
            BBFightUserBasicInfo bBFightUserBasicInfo = this.selected;
            if (bBFightUserBasicInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBFightUserBasicInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetSelected() {
        this.selected = null;
    }

    public void unsetUser_info() {
        this.user_info = null;
    }

    public void validate() throws TException {
        BBUserInfo bBUserInfo = this.user_info;
        if (bBUserInfo == null) {
            throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
        }
        if (bBUserInfo != null) {
            bBUserInfo.validate();
        }
        BBFightUserBasicInfo bBFightUserBasicInfo = this.selected;
        if (bBFightUserBasicInfo != null) {
            bBFightUserBasicInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBSelectInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetUser_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetSelected()).compareTo(Boolean.valueOf(other.isSetSelected()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetSelected() || (compareTo = TBaseHelper.compareTo((Comparable) this.selected, (Comparable) other.selected)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBSelectInfo, _Fields> deepCopy2() {
        return new BBSelectInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBSelectInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getUser_info();
        }
        if (i11 == 2) {
            return getSelected();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBSelectInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUser_info();
        }
        if (i11 == 2) {
            return isSetSelected();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBSelectInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUser_info();
                return;
            } else {
                setUser_info((BBUserInfo) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetSelected();
        } else {
            setSelected((BBFightUserBasicInfo) value);
        }
    }

    public BBSelectInfo(BBUserInfo user_info) {
        this();
        this.user_info = user_info;
    }

    public boolean equals(BBSelectInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetUser_info = isSetUser_info();
        boolean isSetUser_info2 = that.isSetUser_info();
        if ((isSetUser_info || isSetUser_info2) && !(isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info))) {
            return false;
        }
        boolean isSetSelected = isSetSelected();
        boolean isSetSelected2 = that.isSetSelected();
        if (isSetSelected || isSetSelected2) {
            return isSetSelected && isSetSelected2 && this.selected.equals(that.selected);
        }
        return true;
    }

    public BBSelectInfo(BBSelectInfo other) {
        this.optionals = new _Fields[]{_Fields.SELECTED};
        if (other.isSetUser_info()) {
            this.user_info = new BBUserInfo(other.user_info);
        }
        if (other.isSetSelected()) {
            this.selected = new BBFightUserBasicInfo(other.selected);
        }
    }
}
