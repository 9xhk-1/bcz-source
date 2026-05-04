package com.baicizhan.online.hero_api;

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
import org.apache.thrift.meta_data.EnumMetaData;
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
public class UserInfo implements TBase<UserInfo, _Fields>, Serializable, Cloneable, Comparable<UserInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public RevivalCard revival_card;
    public UserStatus status;
    private static final TStruct STRUCT_DESC = new TStruct("UserInfo");
    private static final TField REVIVAL_CARD_FIELD_DESC = new TField("revival_card", (byte) 12, 1);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.UserInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$UserInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$UserInfo$_Fields = iArr;
            try {
                iArr[_Fields.REVIVAL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$UserInfo$_Fields[_Fields.STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserInfoStandardScheme extends StandardScheme<UserInfo> {
        private UserInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserInfo struct) throws TException {
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
                    } else if (b11 == 8) {
                        struct.status = UserStatus.findByValue(iprot.readI32());
                        struct.setStatusIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    RevivalCard revivalCard = new RevivalCard();
                    struct.revival_card = revivalCard;
                    revivalCard.read(iprot);
                    struct.setRevival_cardIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserInfo.STRUCT_DESC);
            if (struct.revival_card != null) {
                oprot.writeFieldBegin(UserInfo.REVIVAL_CARD_FIELD_DESC);
                struct.revival_card.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.status != null) {
                oprot.writeFieldBegin(UserInfo.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserInfoStandardSchemeFactory implements SchemeFactory {
        private UserInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserInfoStandardScheme getScheme() {
            return new UserInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserInfoTupleScheme extends TupleScheme<UserInfo> {
        private UserInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            RevivalCard revivalCard = new RevivalCard();
            struct.revival_card = revivalCard;
            revivalCard.read(tTupleProtocol);
            struct.setRevival_cardIsSet(true);
            struct.status = UserStatus.findByValue(tTupleProtocol.readI32());
            struct.setStatusIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.revival_card.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.status.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserInfoTupleSchemeFactory implements SchemeFactory {
        private UserInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserInfoTupleScheme getScheme() {
            return new UserInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        REVIVAL_CARD(1, "revival_card"),
        STATUS(2, "status");

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
                return REVIVAL_CARD;
            }
            if (fieldId != 2) {
                return null;
            }
            return STATUS;
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
        hashMap.put(StandardScheme.class, new UserInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.REVIVAL_CARD, (_Fields) new FieldMetaData("revival_card", (byte) 1, new StructMetaData((byte) 12, RevivalCard.class)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new EnumMetaData((byte) 16, UserStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserInfo.class, unmodifiableMap);
    }

    public UserInfo() {
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
        this.revival_card = null;
        this.status = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserInfo)) {
            return equals((UserInfo) that);
        }
        return false;
    }

    public RevivalCard getRevival_card() {
        return this.revival_card;
    }

    public UserStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetRevival_card() {
        return this.revival_card != null;
    }

    public boolean isSetStatus() {
        return this.status != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserInfo setRevival_card(RevivalCard revival_card) {
        this.revival_card = revival_card;
        return this;
    }

    public void setRevival_cardIsSet(boolean value) {
        if (value) {
            return;
        }
        this.revival_card = null;
    }

    public UserInfo setStatus(UserStatus status) {
        this.status = status;
        return this;
    }

    public void setStatusIsSet(boolean value) {
        if (value) {
            return;
        }
        this.status = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserInfo(");
        sb2.append("revival_card:");
        RevivalCard revivalCard = this.revival_card;
        if (revivalCard == null) {
            sb2.append("null");
        } else {
            sb2.append(revivalCard);
        }
        sb2.append(j2.O);
        sb2.append("status:");
        UserStatus userStatus = this.status;
        if (userStatus == null) {
            sb2.append("null");
        } else {
            sb2.append(userStatus);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetRevival_card() {
        this.revival_card = null;
    }

    public void unsetStatus() {
        this.status = null;
    }

    public void validate() throws TException {
        RevivalCard revivalCard = this.revival_card;
        if (revivalCard == null) {
            throw new TProtocolException("Required field 'revival_card' was not present! Struct: " + toString());
        }
        if (this.status != null) {
            if (revivalCard != null) {
                revivalCard.validate();
            }
        } else {
            throw new TProtocolException("Required field 'status' was not present! Struct: " + toString());
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserInfo(RevivalCard revival_card, UserStatus status) {
        this();
        this.revival_card = revival_card;
        this.status = status;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetRevival_card()).compareTo(Boolean.valueOf(other.isSetRevival_card()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetRevival_card() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.revival_card, (Comparable) other.revival_card)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetStatus() || (compareTo = TBaseHelper.compareTo((Comparable) this.status, (Comparable) other.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserInfo, _Fields> deepCopy2() {
        return new UserInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$UserInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getRevival_card();
        }
        if (i11 == 2) {
            return getStatus();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$UserInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetRevival_card();
        }
        if (i11 == 2) {
            return isSetStatus();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$UserInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetRevival_card();
                return;
            } else {
                setRevival_card((RevivalCard) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetStatus();
        } else {
            setStatus((UserStatus) value);
        }
    }

    public boolean equals(UserInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetRevival_card = isSetRevival_card();
        boolean isSetRevival_card2 = that.isSetRevival_card();
        if ((isSetRevival_card || isSetRevival_card2) && !(isSetRevival_card && isSetRevival_card2 && this.revival_card.equals(that.revival_card))) {
            return false;
        }
        boolean isSetStatus = isSetStatus();
        boolean isSetStatus2 = that.isSetStatus();
        if (isSetStatus || isSetStatus2) {
            return isSetStatus && isSetStatus2 && this.status.equals(that.status);
        }
        return true;
    }

    public UserInfo(UserInfo other) {
        if (other.isSetRevival_card()) {
            this.revival_card = new RevivalCard(other.revival_card);
        }
        if (other.isSetStatus()) {
            this.status = other.status;
        }
    }
}
