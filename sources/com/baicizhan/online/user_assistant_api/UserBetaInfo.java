package com.baicizhan.online.user_assistant_api;

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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserBetaInfo implements TBase<UserBetaInfo, _Fields>, Serializable, Cloneable, Comparable<UserBetaInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<Integer> beta_types;
    public List<Integer> daka_poster_book_ids;
    public List<Integer> high_level_book_ids;
    private static final TStruct STRUCT_DESC = new TStruct("UserBetaInfo");
    private static final TField BETA_TYPES_FIELD_DESC = new TField("beta_types", (byte) 15, 1);
    private static final TField HIGH_LEVEL_BOOK_IDS_FIELD_DESC = new TField("high_level_book_ids", (byte) 15, 2);
    private static final TField DAKA_POSTER_BOOK_IDS_FIELD_DESC = new TField("daka_poster_book_ids", (byte) 15, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_assistant_api.UserBetaInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields = iArr;
            try {
                iArr[_Fields.BETA_TYPES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields[_Fields.HIGH_LEVEL_BOOK_IDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields[_Fields.DAKA_POSTER_BOOK_IDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBetaInfoStandardScheme extends StandardScheme<UserBetaInfo> {
        private UserBetaInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserBetaInfo struct) throws TException {
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
                int i11 = 0;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.daka_poster_book_ids = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.daka_poster_book_ids.add(Integer.valueOf(iprot.readI32()));
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setDaka_poster_book_idsIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.high_level_book_ids = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            struct.high_level_book_ids.add(Integer.valueOf(iprot.readI32()));
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setHigh_level_book_idsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin3 = iprot.readListBegin();
                    struct.beta_types = new ArrayList(readListBegin3.size);
                    while (i11 < readListBegin3.size) {
                        struct.beta_types.add(Integer.valueOf(iprot.readI32()));
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setBeta_typesIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserBetaInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserBetaInfo.STRUCT_DESC);
            if (struct.beta_types != null) {
                oprot.writeFieldBegin(UserBetaInfo.BETA_TYPES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.beta_types.size()));
                Iterator<Integer> it = struct.beta_types.iterator();
                while (it.hasNext()) {
                    oprot.writeI32(it.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.high_level_book_ids != null) {
                oprot.writeFieldBegin(UserBetaInfo.HIGH_LEVEL_BOOK_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.high_level_book_ids.size()));
                Iterator<Integer> it2 = struct.high_level_book_ids.iterator();
                while (it2.hasNext()) {
                    oprot.writeI32(it2.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.daka_poster_book_ids != null) {
                oprot.writeFieldBegin(UserBetaInfo.DAKA_POSTER_BOOK_IDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 8, struct.daka_poster_book_ids.size()));
                Iterator<Integer> it3 = struct.daka_poster_book_ids.iterator();
                while (it3.hasNext()) {
                    oprot.writeI32(it3.next().intValue());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBetaInfoStandardSchemeFactory implements SchemeFactory {
        private UserBetaInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBetaInfoStandardScheme getScheme() {
            return new UserBetaInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBetaInfoTupleScheme extends TupleScheme<UserBetaInfo> {
        private UserBetaInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserBetaInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 8, tTupleProtocol.readI32());
            struct.beta_types = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.beta_types.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setBeta_typesIsSet(true);
            TList tList2 = new TList((byte) 8, tTupleProtocol.readI32());
            struct.high_level_book_ids = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.high_level_book_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setHigh_level_book_idsIsSet(true);
            TList tList3 = new TList((byte) 8, tTupleProtocol.readI32());
            struct.daka_poster_book_ids = new ArrayList(tList3.size);
            for (int i13 = 0; i13 < tList3.size; i13++) {
                struct.daka_poster_book_ids.add(Integer.valueOf(tTupleProtocol.readI32()));
            }
            struct.setDaka_poster_book_idsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserBetaInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.beta_types.size());
            Iterator<Integer> it = struct.beta_types.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeI32(it.next().intValue());
            }
            tTupleProtocol.writeI32(struct.high_level_book_ids.size());
            Iterator<Integer> it2 = struct.high_level_book_ids.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeI32(it2.next().intValue());
            }
            tTupleProtocol.writeI32(struct.daka_poster_book_ids.size());
            Iterator<Integer> it3 = struct.daka_poster_book_ids.iterator();
            while (it3.hasNext()) {
                tTupleProtocol.writeI32(it3.next().intValue());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserBetaInfoTupleSchemeFactory implements SchemeFactory {
        private UserBetaInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserBetaInfoTupleScheme getScheme() {
            return new UserBetaInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BETA_TYPES(1, "beta_types"),
        HIGH_LEVEL_BOOK_IDS(2, "high_level_book_ids"),
        DAKA_POSTER_BOOK_IDS(3, "daka_poster_book_ids");

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
                return BETA_TYPES;
            }
            if (fieldId == 2) {
                return HIGH_LEVEL_BOOK_IDS;
            }
            if (fieldId != 3) {
                return null;
            }
            return DAKA_POSTER_BOOK_IDS;
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
        hashMap.put(StandardScheme.class, new UserBetaInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserBetaInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BETA_TYPES, (_Fields) new FieldMetaData("beta_types", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.HIGH_LEVEL_BOOK_IDS, (_Fields) new FieldMetaData("high_level_book_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        enumMap.put((EnumMap) _Fields.DAKA_POSTER_BOOK_IDS, (_Fields) new FieldMetaData("daka_poster_book_ids", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 8))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserBetaInfo.class, unmodifiableMap);
    }

    public UserBetaInfo() {
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

    public void addToBeta_types(int elem) {
        if (this.beta_types == null) {
            this.beta_types = new ArrayList();
        }
        this.beta_types.add(Integer.valueOf(elem));
    }

    public void addToDaka_poster_book_ids(int elem) {
        if (this.daka_poster_book_ids == null) {
            this.daka_poster_book_ids = new ArrayList();
        }
        this.daka_poster_book_ids.add(Integer.valueOf(elem));
    }

    public void addToHigh_level_book_ids(int elem) {
        if (this.high_level_book_ids == null) {
            this.high_level_book_ids = new ArrayList();
        }
        this.high_level_book_ids.add(Integer.valueOf(elem));
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.beta_types = null;
        this.high_level_book_ids = null;
        this.daka_poster_book_ids = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserBetaInfo)) {
            return equals((UserBetaInfo) that);
        }
        return false;
    }

    public List<Integer> getBeta_types() {
        return this.beta_types;
    }

    public Iterator<Integer> getBeta_typesIterator() {
        List<Integer> list = this.beta_types;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getBeta_typesSize() {
        List<Integer> list = this.beta_types;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Integer> getDaka_poster_book_ids() {
        return this.daka_poster_book_ids;
    }

    public Iterator<Integer> getDaka_poster_book_idsIterator() {
        List<Integer> list = this.daka_poster_book_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getDaka_poster_book_idsSize() {
        List<Integer> list = this.daka_poster_book_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Integer> getHigh_level_book_ids() {
        return this.high_level_book_ids;
    }

    public Iterator<Integer> getHigh_level_book_idsIterator() {
        List<Integer> list = this.high_level_book_ids;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getHigh_level_book_idsSize() {
        List<Integer> list = this.high_level_book_ids;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBeta_types() {
        return this.beta_types != null;
    }

    public boolean isSetDaka_poster_book_ids() {
        return this.daka_poster_book_ids != null;
    }

    public boolean isSetHigh_level_book_ids() {
        return this.high_level_book_ids != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserBetaInfo setBeta_types(List<Integer> beta_types) {
        this.beta_types = beta_types;
        return this;
    }

    public void setBeta_typesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.beta_types = null;
    }

    public UserBetaInfo setDaka_poster_book_ids(List<Integer> daka_poster_book_ids) {
        this.daka_poster_book_ids = daka_poster_book_ids;
        return this;
    }

    public void setDaka_poster_book_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.daka_poster_book_ids = null;
    }

    public UserBetaInfo setHigh_level_book_ids(List<Integer> high_level_book_ids) {
        this.high_level_book_ids = high_level_book_ids;
        return this;
    }

    public void setHigh_level_book_idsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.high_level_book_ids = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserBetaInfo(");
        sb2.append("beta_types:");
        List<Integer> list = this.beta_types;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("high_level_book_ids:");
        List<Integer> list2 = this.high_level_book_ids;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j2.O);
        sb2.append("daka_poster_book_ids:");
        List<Integer> list3 = this.daka_poster_book_ids;
        if (list3 == null) {
            sb2.append("null");
        } else {
            sb2.append(list3);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetBeta_types() {
        this.beta_types = null;
    }

    public void unsetDaka_poster_book_ids() {
        this.daka_poster_book_ids = null;
    }

    public void unsetHigh_level_book_ids() {
        this.high_level_book_ids = null;
    }

    public void validate() throws TException {
        if (this.beta_types == null) {
            throw new TProtocolException("Required field 'beta_types' was not present! Struct: " + toString());
        }
        if (this.high_level_book_ids == null) {
            throw new TProtocolException("Required field 'high_level_book_ids' was not present! Struct: " + toString());
        }
        if (this.daka_poster_book_ids != null) {
            return;
        }
        throw new TProtocolException("Required field 'daka_poster_book_ids' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserBetaInfo(List<Integer> beta_types, List<Integer> high_level_book_ids, List<Integer> daka_poster_book_ids) {
        this();
        this.beta_types = beta_types;
        this.high_level_book_ids = high_level_book_ids;
        this.daka_poster_book_ids = daka_poster_book_ids;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserBetaInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetBeta_types()).compareTo(Boolean.valueOf(other.isSetBeta_types()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetBeta_types() && (compareTo3 = TBaseHelper.compareTo((List) this.beta_types, (List) other.beta_types)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetHigh_level_book_ids()).compareTo(Boolean.valueOf(other.isSetHigh_level_book_ids()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetHigh_level_book_ids() && (compareTo2 = TBaseHelper.compareTo((List) this.high_level_book_ids, (List) other.high_level_book_ids)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetDaka_poster_book_ids()).compareTo(Boolean.valueOf(other.isSetDaka_poster_book_ids()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetDaka_poster_book_ids() || (compareTo = TBaseHelper.compareTo((List) this.daka_poster_book_ids, (List) other.daka_poster_book_ids)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserBetaInfo, _Fields> deepCopy2() {
        return new UserBetaInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBeta_types();
        }
        if (i11 == 2) {
            return getHigh_level_book_ids();
        }
        if (i11 == 3) {
            return getDaka_poster_book_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBeta_types();
        }
        if (i11 == 2) {
            return isSetHigh_level_book_ids();
        }
        if (i11 == 3) {
            return isSetDaka_poster_book_ids();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_assistant_api$UserBetaInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBeta_types();
                return;
            } else {
                setBeta_types((List) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetHigh_level_book_ids();
                return;
            } else {
                setHigh_level_book_ids((List) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetDaka_poster_book_ids();
        } else {
            setDaka_poster_book_ids((List) value);
        }
    }

    public boolean equals(UserBetaInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBeta_types = isSetBeta_types();
        boolean isSetBeta_types2 = that.isSetBeta_types();
        if ((isSetBeta_types || isSetBeta_types2) && !(isSetBeta_types && isSetBeta_types2 && this.beta_types.equals(that.beta_types))) {
            return false;
        }
        boolean isSetHigh_level_book_ids = isSetHigh_level_book_ids();
        boolean isSetHigh_level_book_ids2 = that.isSetHigh_level_book_ids();
        if ((isSetHigh_level_book_ids || isSetHigh_level_book_ids2) && !(isSetHigh_level_book_ids && isSetHigh_level_book_ids2 && this.high_level_book_ids.equals(that.high_level_book_ids))) {
            return false;
        }
        boolean isSetDaka_poster_book_ids = isSetDaka_poster_book_ids();
        boolean isSetDaka_poster_book_ids2 = that.isSetDaka_poster_book_ids();
        if (isSetDaka_poster_book_ids || isSetDaka_poster_book_ids2) {
            return isSetDaka_poster_book_ids && isSetDaka_poster_book_ids2 && this.daka_poster_book_ids.equals(that.daka_poster_book_ids);
        }
        return true;
    }

    public UserBetaInfo(UserBetaInfo other) {
        if (other.isSetBeta_types()) {
            this.beta_types = new ArrayList(other.beta_types);
        }
        if (other.isSetHigh_level_book_ids()) {
            this.high_level_book_ids = new ArrayList(other.high_level_book_ids);
        }
        if (other.isSetDaka_poster_book_ids()) {
            this.daka_poster_book_ids = new ArrayList(other.daka_poster_book_ids);
        }
    }
}
