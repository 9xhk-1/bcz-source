package com.baicizhan.online.strategy_api;

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
public class UserEntitlementInfos implements TBase<UserEntitlementInfos, _Fields>, Serializable, Cloneable, Comparable<UserEntitlementInfos> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public UserEntitlement member_info;
    private _Fields[] optionals;
    public UserEntitlement sentence_energy_info;
    public UserEntitlement word_energy_info;
    private static final TStruct STRUCT_DESC = new TStruct("UserEntitlementInfos");
    private static final TField MEMBER_INFO_FIELD_DESC = new TField("member_info", (byte) 12, 1);
    private static final TField WORD_ENERGY_INFO_FIELD_DESC = new TField("word_energy_info", (byte) 12, 2);
    private static final TField SENTENCE_ENERGY_INFO_FIELD_DESC = new TField("sentence_energy_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.strategy_api.UserEntitlementInfos$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields = iArr;
            try {
                iArr[_Fields.MEMBER_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields[_Fields.WORD_ENERGY_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields[_Fields.SENTENCE_ENERGY_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementInfosStandardScheme extends StandardScheme<UserEntitlementInfos> {
        private UserEntitlementInfosStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserEntitlementInfos struct) throws TException {
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
                        } else if (b11 == 12) {
                            UserEntitlement userEntitlement = new UserEntitlement();
                            struct.sentence_energy_info = userEntitlement;
                            userEntitlement.read(iprot);
                            struct.setSentence_energy_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        UserEntitlement userEntitlement2 = new UserEntitlement();
                        struct.word_energy_info = userEntitlement2;
                        userEntitlement2.read(iprot);
                        struct.setWord_energy_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    UserEntitlement userEntitlement3 = new UserEntitlement();
                    struct.member_info = userEntitlement3;
                    userEntitlement3.read(iprot);
                    struct.setMember_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserEntitlementInfos struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserEntitlementInfos.STRUCT_DESC);
            if (struct.member_info != null && struct.isSetMember_info()) {
                oprot.writeFieldBegin(UserEntitlementInfos.MEMBER_INFO_FIELD_DESC);
                struct.member_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.word_energy_info != null && struct.isSetWord_energy_info()) {
                oprot.writeFieldBegin(UserEntitlementInfos.WORD_ENERGY_INFO_FIELD_DESC);
                struct.word_energy_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.sentence_energy_info != null && struct.isSetSentence_energy_info()) {
                oprot.writeFieldBegin(UserEntitlementInfos.SENTENCE_ENERGY_INFO_FIELD_DESC);
                struct.sentence_energy_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementInfosStandardSchemeFactory implements SchemeFactory {
        private UserEntitlementInfosStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserEntitlementInfosStandardScheme getScheme() {
            return new UserEntitlementInfosStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementInfosTupleScheme extends TupleScheme<UserEntitlementInfos> {
        private UserEntitlementInfosTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserEntitlementInfos struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                UserEntitlement userEntitlement = new UserEntitlement();
                struct.member_info = userEntitlement;
                userEntitlement.read(tTupleProtocol);
                struct.setMember_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                UserEntitlement userEntitlement2 = new UserEntitlement();
                struct.word_energy_info = userEntitlement2;
                userEntitlement2.read(tTupleProtocol);
                struct.setWord_energy_infoIsSet(true);
            }
            if (readBitSet.get(2)) {
                UserEntitlement userEntitlement3 = new UserEntitlement();
                struct.sentence_energy_info = userEntitlement3;
                userEntitlement3.read(tTupleProtocol);
                struct.setSentence_energy_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserEntitlementInfos struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetMember_info()) {
                bitSet.set(0);
            }
            if (struct.isSetWord_energy_info()) {
                bitSet.set(1);
            }
            if (struct.isSetSentence_energy_info()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetMember_info()) {
                struct.member_info.write(tTupleProtocol);
            }
            if (struct.isSetWord_energy_info()) {
                struct.word_energy_info.write(tTupleProtocol);
            }
            if (struct.isSetSentence_energy_info()) {
                struct.sentence_energy_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserEntitlementInfosTupleSchemeFactory implements SchemeFactory {
        private UserEntitlementInfosTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserEntitlementInfosTupleScheme getScheme() {
            return new UserEntitlementInfosTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MEMBER_INFO(1, "member_info"),
        WORD_ENERGY_INFO(2, "word_energy_info"),
        SENTENCE_ENERGY_INFO(3, "sentence_energy_info");

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
                return MEMBER_INFO;
            }
            if (fieldId == 2) {
                return WORD_ENERGY_INFO;
            }
            if (fieldId != 3) {
                return null;
            }
            return SENTENCE_ENERGY_INFO;
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
        hashMap.put(StandardScheme.class, new UserEntitlementInfosStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserEntitlementInfosTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MEMBER_INFO, (_Fields) new FieldMetaData("member_info", (byte) 2, new StructMetaData((byte) 12, UserEntitlement.class)));
        enumMap.put((EnumMap) _Fields.WORD_ENERGY_INFO, (_Fields) new FieldMetaData("word_energy_info", (byte) 2, new StructMetaData((byte) 12, UserEntitlement.class)));
        enumMap.put((EnumMap) _Fields.SENTENCE_ENERGY_INFO, (_Fields) new FieldMetaData("sentence_energy_info", (byte) 2, new StructMetaData((byte) 12, UserEntitlement.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserEntitlementInfos.class, unmodifiableMap);
    }

    public UserEntitlementInfos() {
        this.optionals = new _Fields[]{_Fields.MEMBER_INFO, _Fields.WORD_ENERGY_INFO, _Fields.SENTENCE_ENERGY_INFO};
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
        this.member_info = null;
        this.word_energy_info = null;
        this.sentence_energy_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserEntitlementInfos)) {
            return equals((UserEntitlementInfos) that);
        }
        return false;
    }

    public UserEntitlement getMember_info() {
        return this.member_info;
    }

    public UserEntitlement getSentence_energy_info() {
        return this.sentence_energy_info;
    }

    public UserEntitlement getWord_energy_info() {
        return this.word_energy_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetMember_info() {
        return this.member_info != null;
    }

    public boolean isSetSentence_energy_info() {
        return this.sentence_energy_info != null;
    }

    public boolean isSetWord_energy_info() {
        return this.word_energy_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserEntitlementInfos setMember_info(UserEntitlement member_info) {
        this.member_info = member_info;
        return this;
    }

    public void setMember_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.member_info = null;
    }

    public UserEntitlementInfos setSentence_energy_info(UserEntitlement sentence_energy_info) {
        this.sentence_energy_info = sentence_energy_info;
        return this;
    }

    public void setSentence_energy_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sentence_energy_info = null;
    }

    public UserEntitlementInfos setWord_energy_info(UserEntitlement word_energy_info) {
        this.word_energy_info = word_energy_info;
        return this;
    }

    public void setWord_energy_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.word_energy_info = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("UserEntitlementInfos(");
        boolean z12 = false;
        if (isSetMember_info()) {
            sb2.append("member_info:");
            UserEntitlement userEntitlement = this.member_info;
            if (userEntitlement == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetWord_energy_info()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("word_energy_info:");
            UserEntitlement userEntitlement2 = this.word_energy_info;
            if (userEntitlement2 == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement2);
            }
        } else {
            z12 = z11;
        }
        if (isSetSentence_energy_info()) {
            if (!z12) {
                sb2.append(j2.O);
            }
            sb2.append("sentence_energy_info:");
            UserEntitlement userEntitlement3 = this.sentence_energy_info;
            if (userEntitlement3 == null) {
                sb2.append("null");
            } else {
                sb2.append(userEntitlement3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetMember_info() {
        this.member_info = null;
    }

    public void unsetSentence_energy_info() {
        this.sentence_energy_info = null;
    }

    public void unsetWord_energy_info() {
        this.word_energy_info = null;
    }

    public void validate() throws TException {
        UserEntitlement userEntitlement = this.member_info;
        if (userEntitlement != null) {
            userEntitlement.validate();
        }
        UserEntitlement userEntitlement2 = this.word_energy_info;
        if (userEntitlement2 != null) {
            userEntitlement2.validate();
        }
        UserEntitlement userEntitlement3 = this.sentence_energy_info;
        if (userEntitlement3 != null) {
            userEntitlement3.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserEntitlementInfos other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetMember_info()).compareTo(Boolean.valueOf(other.isSetMember_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetMember_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.member_info, (Comparable) other.member_info)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetWord_energy_info()).compareTo(Boolean.valueOf(other.isSetWord_energy_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetWord_energy_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.word_energy_info, (Comparable) other.word_energy_info)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetSentence_energy_info()).compareTo(Boolean.valueOf(other.isSetSentence_energy_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetSentence_energy_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.sentence_energy_info, (Comparable) other.sentence_energy_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserEntitlementInfos, _Fields> deepCopy2() {
        return new UserEntitlementInfos(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getMember_info();
        }
        if (i11 == 2) {
            return getWord_energy_info();
        }
        if (i11 == 3) {
            return getSentence_energy_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMember_info();
        }
        if (i11 == 2) {
            return isSetWord_energy_info();
        }
        if (i11 == 3) {
            return isSetSentence_energy_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$strategy_api$UserEntitlementInfos$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMember_info();
                return;
            } else {
                setMember_info((UserEntitlement) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetWord_energy_info();
                return;
            } else {
                setWord_energy_info((UserEntitlement) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetSentence_energy_info();
        } else {
            setSentence_energy_info((UserEntitlement) value);
        }
    }

    public UserEntitlementInfos(UserEntitlementInfos other) {
        this.optionals = new _Fields[]{_Fields.MEMBER_INFO, _Fields.WORD_ENERGY_INFO, _Fields.SENTENCE_ENERGY_INFO};
        if (other.isSetMember_info()) {
            this.member_info = new UserEntitlement(other.member_info);
        }
        if (other.isSetWord_energy_info()) {
            this.word_energy_info = new UserEntitlement(other.word_energy_info);
        }
        if (other.isSetSentence_energy_info()) {
            this.sentence_energy_info = new UserEntitlement(other.sentence_energy_info);
        }
    }

    public boolean equals(UserEntitlementInfos that) {
        if (that == null) {
            return false;
        }
        boolean isSetMember_info = isSetMember_info();
        boolean isSetMember_info2 = that.isSetMember_info();
        if ((isSetMember_info || isSetMember_info2) && !(isSetMember_info && isSetMember_info2 && this.member_info.equals(that.member_info))) {
            return false;
        }
        boolean isSetWord_energy_info = isSetWord_energy_info();
        boolean isSetWord_energy_info2 = that.isSetWord_energy_info();
        if ((isSetWord_energy_info || isSetWord_energy_info2) && !(isSetWord_energy_info && isSetWord_energy_info2 && this.word_energy_info.equals(that.word_energy_info))) {
            return false;
        }
        boolean isSetSentence_energy_info = isSetSentence_energy_info();
        boolean isSetSentence_energy_info2 = that.isSetSentence_energy_info();
        if (isSetSentence_energy_info || isSetSentence_energy_info2) {
            return isSetSentence_energy_info && isSetSentence_energy_info2 && this.sentence_energy_info.equals(that.sentence_energy_info);
        }
        return true;
    }
}
