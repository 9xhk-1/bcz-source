package com.baicizhan.online.user_study_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
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
public class ExperienceRankDetail implements TBase<ExperienceRankDetail, _Fields>, Serializable, Cloneable, Comparable<ExperienceRankDetail> {
    private static final int __RANKID_ISSET_ID = 1;
    private static final int __STATUS_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    private _Fields[] optionals;
    public int rankId;
    public int status;
    public List<ExperienceRankUser> users;
    private static final TStruct STRUCT_DESC = new TStruct("ExperienceRankDetail");
    private static final TField USERS_FIELD_DESC = new TField("users", (byte) 15, 1);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 2);
    private static final TField RANK_ID_FIELD_DESC = new TField("rankId", (byte) 8, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.ExperienceRankDetail$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields = iArr;
            try {
                iArr[_Fields.USERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields[_Fields.STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields[_Fields.RANK_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankDetailStandardScheme extends StandardScheme<ExperienceRankDetail> {
        private ExperienceRankDetailStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, ExperienceRankDetail struct) throws TException {
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
                        } else if (b11 == 8) {
                            struct.rankId = iprot.readI32();
                            struct.setRankIdIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 8) {
                        struct.status = iprot.readI32();
                        struct.setStatusIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.users = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        ExperienceRankUser experienceRankUser = new ExperienceRankUser();
                        experienceRankUser.read(iprot);
                        struct.users.add(experienceRankUser);
                    }
                    iprot.readListEnd();
                    struct.setUsersIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, ExperienceRankDetail struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(ExperienceRankDetail.STRUCT_DESC);
            if (struct.users != null && struct.isSetUsers()) {
                oprot.writeFieldBegin(ExperienceRankDetail.USERS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.users.size()));
                Iterator<ExperienceRankUser> it = struct.users.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.isSetStatus()) {
                oprot.writeFieldBegin(ExperienceRankDetail.STATUS_FIELD_DESC);
                oprot.writeI32(struct.status);
                oprot.writeFieldEnd();
            }
            if (struct.isSetRankId()) {
                oprot.writeFieldBegin(ExperienceRankDetail.RANK_ID_FIELD_DESC);
                oprot.writeI32(struct.rankId);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankDetailStandardSchemeFactory implements SchemeFactory {
        private ExperienceRankDetailStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExperienceRankDetailStandardScheme getScheme() {
            return new ExperienceRankDetailStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankDetailTupleScheme extends TupleScheme<ExperienceRankDetail> {
        private ExperienceRankDetailTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, ExperienceRankDetail struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet readBitSet = tTupleProtocol.readBitSet(3);
            if (readBitSet.get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.users = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    ExperienceRankUser experienceRankUser = new ExperienceRankUser();
                    experienceRankUser.read(tTupleProtocol);
                    struct.users.add(experienceRankUser);
                }
                struct.setUsersIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.status = tTupleProtocol.readI32();
                struct.setStatusIsSet(true);
            }
            if (readBitSet.get(2)) {
                struct.rankId = tTupleProtocol.readI32();
                struct.setRankIdIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, ExperienceRankDetail struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetUsers()) {
                bitSet.set(0);
            }
            if (struct.isSetStatus()) {
                bitSet.set(1);
            }
            if (struct.isSetRankId()) {
                bitSet.set(2);
            }
            tTupleProtocol.writeBitSet(bitSet, 3);
            if (struct.isSetUsers()) {
                tTupleProtocol.writeI32(struct.users.size());
                Iterator<ExperienceRankUser> it = struct.users.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
            if (struct.isSetStatus()) {
                tTupleProtocol.writeI32(struct.status);
            }
            if (struct.isSetRankId()) {
                tTupleProtocol.writeI32(struct.rankId);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ExperienceRankDetailTupleSchemeFactory implements SchemeFactory {
        private ExperienceRankDetailTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public ExperienceRankDetailTupleScheme getScheme() {
            return new ExperienceRankDetailTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USERS(1, "users"),
        STATUS(2, "status"),
        RANK_ID(3, "rankId");

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
                return USERS;
            }
            if (fieldId == 2) {
                return STATUS;
            }
            if (fieldId != 3) {
                return null;
            }
            return RANK_ID;
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
        hashMap.put(StandardScheme.class, new ExperienceRankDetailStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new ExperienceRankDetailTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USERS, (_Fields) new FieldMetaData("users", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, ExperienceRankUser.class))));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 2, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.RANK_ID, (_Fields) new FieldMetaData("rankId", (byte) 2, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(ExperienceRankDetail.class, unmodifiableMap);
    }

    public ExperienceRankDetail() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.USERS, _Fields.STATUS, _Fields.RANK_ID};
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

    public void addToUsers(ExperienceRankUser elem) {
        if (this.users == null) {
            this.users = new ArrayList();
        }
        this.users.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.users = null;
        setStatusIsSet(false);
        this.status = 0;
        setRankIdIsSet(false);
        this.rankId = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof ExperienceRankDetail)) {
            return equals((ExperienceRankDetail) that);
        }
        return false;
    }

    public int getRankId() {
        return this.rankId;
    }

    public int getStatus() {
        return this.status;
    }

    public List<ExperienceRankUser> getUsers() {
        return this.users;
    }

    public Iterator<ExperienceRankUser> getUsersIterator() {
        List<ExperienceRankUser> list = this.users;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUsersSize() {
        List<ExperienceRankUser> list = this.users;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetRankId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    public boolean isSetUsers() {
        return this.users != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public ExperienceRankDetail setRankId(int rankId) {
        this.rankId = rankId;
        setRankIdIsSet(true);
        return this;
    }

    public void setRankIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public ExperienceRankDetail setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public ExperienceRankDetail setUsers(List<ExperienceRankUser> users) {
        this.users = users;
        return this;
    }

    public void setUsersIsSet(boolean value) {
        if (value) {
            return;
        }
        this.users = null;
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("ExperienceRankDetail(");
        boolean z12 = false;
        if (isSetUsers()) {
            sb2.append("users:");
            List<ExperienceRankUser> list = this.users;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (isSetStatus()) {
            if (!z11) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("status:");
            sb2.append(this.status);
        } else {
            z12 = z11;
        }
        if (isSetRankId()) {
            if (!z12) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
            sb2.append("rankId:");
            sb2.append(this.rankId);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetRankId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void unsetUsers() {
        this.users = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(ExperienceRankDetail other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetUsers()).compareTo(Boolean.valueOf(other.isSetUsers()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetUsers() && (compareTo3 = TBaseHelper.compareTo((List) this.users, (List) other.users)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetStatus() && (compareTo2 = TBaseHelper.compareTo(this.status, other.status)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetRankId()).compareTo(Boolean.valueOf(other.isSetRankId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetRankId() || (compareTo = TBaseHelper.compareTo(this.rankId, other.rankId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<ExperienceRankDetail, _Fields> deepCopy2() {
        return new ExperienceRankDetail(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getUsers();
        }
        if (i11 == 2) {
            return Integer.valueOf(getStatus());
        }
        if (i11 == 3) {
            return Integer.valueOf(getRankId());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUsers();
        }
        if (i11 == 2) {
            return isSetStatus();
        }
        if (i11 == 3) {
            return isSetRankId();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$ExperienceRankDetail$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUsers();
                return;
            } else {
                setUsers((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetStatus();
                return;
            } else {
                setStatus(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetRankId();
        } else {
            setRankId(((Integer) value).intValue());
        }
    }

    public boolean equals(ExperienceRankDetail that) {
        if (that == null) {
            return false;
        }
        boolean isSetUsers = isSetUsers();
        boolean isSetUsers2 = that.isSetUsers();
        if ((isSetUsers || isSetUsers2) && !(isSetUsers && isSetUsers2 && this.users.equals(that.users))) {
            return false;
        }
        boolean isSetStatus = isSetStatus();
        boolean isSetStatus2 = that.isSetStatus();
        if ((isSetStatus || isSetStatus2) && !(isSetStatus && isSetStatus2 && this.status == that.status)) {
            return false;
        }
        boolean isSetRankId = isSetRankId();
        boolean isSetRankId2 = that.isSetRankId();
        if (isSetRankId || isSetRankId2) {
            return isSetRankId && isSetRankId2 && this.rankId == that.rankId;
        }
        return true;
    }

    public ExperienceRankDetail(ExperienceRankDetail other) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new _Fields[]{_Fields.USERS, _Fields.STATUS, _Fields.RANK_ID};
        this.__isset_bitfield = other.__isset_bitfield;
        if (other.isSetUsers()) {
            ArrayList arrayList = new ArrayList(other.users.size());
            Iterator<ExperienceRankUser> it = other.users.iterator();
            while (it.hasNext()) {
                arrayList.add(new ExperienceRankUser(it.next()));
            }
            this.users = arrayList;
        }
        this.status = other.status;
        this.rankId = other.rankId;
    }

    public void validate() throws TException {
    }
}
