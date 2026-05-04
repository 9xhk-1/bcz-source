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
public class GameHomeInfo implements TBase<GameHomeInfo, _Fields>, Serializable, Cloneable, Comparable<GameHomeInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public GameUserBasicInfo basic_info;
    public UserPlanInfo plan_info;
    public UserDataInfo user_data_info;
    private static final TStruct STRUCT_DESC = new TStruct("GameHomeInfo");
    private static final TField USER_DATA_INFO_FIELD_DESC = new TField("user_data_info", (byte) 12, 1);
    private static final TField PLAN_INFO_FIELD_DESC = new TField("plan_info", (byte) 12, 2);
    private static final TField BASIC_INFO_FIELD_DESC = new TField("basic_info", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.GameHomeInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields = iArr;
            try {
                iArr[_Fields.USER_DATA_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields[_Fields.PLAN_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields[_Fields.BASIC_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameHomeInfoStandardScheme extends StandardScheme<GameHomeInfo> {
        private GameHomeInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, GameHomeInfo struct) throws TException {
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
                            GameUserBasicInfo gameUserBasicInfo = new GameUserBasicInfo();
                            struct.basic_info = gameUserBasicInfo;
                            gameUserBasicInfo.read(iprot);
                            struct.setBasic_infoIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        UserPlanInfo userPlanInfo = new UserPlanInfo();
                        struct.plan_info = userPlanInfo;
                        userPlanInfo.read(iprot);
                        struct.setPlan_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    UserDataInfo userDataInfo = new UserDataInfo();
                    struct.user_data_info = userDataInfo;
                    userDataInfo.read(iprot);
                    struct.setUser_data_infoIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, GameHomeInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(GameHomeInfo.STRUCT_DESC);
            if (struct.user_data_info != null) {
                oprot.writeFieldBegin(GameHomeInfo.USER_DATA_INFO_FIELD_DESC);
                struct.user_data_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.plan_info != null) {
                oprot.writeFieldBegin(GameHomeInfo.PLAN_INFO_FIELD_DESC);
                struct.plan_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.basic_info != null) {
                oprot.writeFieldBegin(GameHomeInfo.BASIC_INFO_FIELD_DESC);
                struct.basic_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameHomeInfoStandardSchemeFactory implements SchemeFactory {
        private GameHomeInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameHomeInfoStandardScheme getScheme() {
            return new GameHomeInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameHomeInfoTupleScheme extends TupleScheme<GameHomeInfo> {
        private GameHomeInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, GameHomeInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            UserDataInfo userDataInfo = new UserDataInfo();
            struct.user_data_info = userDataInfo;
            userDataInfo.read(tTupleProtocol);
            struct.setUser_data_infoIsSet(true);
            UserPlanInfo userPlanInfo = new UserPlanInfo();
            struct.plan_info = userPlanInfo;
            userPlanInfo.read(tTupleProtocol);
            struct.setPlan_infoIsSet(true);
            GameUserBasicInfo gameUserBasicInfo = new GameUserBasicInfo();
            struct.basic_info = gameUserBasicInfo;
            gameUserBasicInfo.read(tTupleProtocol);
            struct.setBasic_infoIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, GameHomeInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.user_data_info.write(tTupleProtocol);
            struct.plan_info.write(tTupleProtocol);
            struct.basic_info.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GameHomeInfoTupleSchemeFactory implements SchemeFactory {
        private GameHomeInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public GameHomeInfoTupleScheme getScheme() {
            return new GameHomeInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_DATA_INFO(1, "user_data_info"),
        PLAN_INFO(2, "plan_info"),
        BASIC_INFO(3, "basic_info");

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
                return USER_DATA_INFO;
            }
            if (fieldId == 2) {
                return PLAN_INFO;
            }
            if (fieldId != 3) {
                return null;
            }
            return BASIC_INFO;
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
        hashMap.put(StandardScheme.class, new GameHomeInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new GameHomeInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_DATA_INFO, (_Fields) new FieldMetaData("user_data_info", (byte) 1, new StructMetaData((byte) 12, UserDataInfo.class)));
        enumMap.put((EnumMap) _Fields.PLAN_INFO, (_Fields) new FieldMetaData("plan_info", (byte) 1, new StructMetaData((byte) 12, UserPlanInfo.class)));
        enumMap.put((EnumMap) _Fields.BASIC_INFO, (_Fields) new FieldMetaData("basic_info", (byte) 1, new StructMetaData((byte) 12, GameUserBasicInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(GameHomeInfo.class, unmodifiableMap);
    }

    public GameHomeInfo() {
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
        this.user_data_info = null;
        this.plan_info = null;
        this.basic_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof GameHomeInfo)) {
            return equals((GameHomeInfo) that);
        }
        return false;
    }

    public GameUserBasicInfo getBasic_info() {
        return this.basic_info;
    }

    public UserPlanInfo getPlan_info() {
        return this.plan_info;
    }

    public UserDataInfo getUser_data_info() {
        return this.user_data_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBasic_info() {
        return this.basic_info != null;
    }

    public boolean isSetPlan_info() {
        return this.plan_info != null;
    }

    public boolean isSetUser_data_info() {
        return this.user_data_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public GameHomeInfo setBasic_info(GameUserBasicInfo basic_info) {
        this.basic_info = basic_info;
        return this;
    }

    public void setBasic_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.basic_info = null;
    }

    public GameHomeInfo setPlan_info(UserPlanInfo plan_info) {
        this.plan_info = plan_info;
        return this;
    }

    public void setPlan_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.plan_info = null;
    }

    public GameHomeInfo setUser_data_info(UserDataInfo user_data_info) {
        this.user_data_info = user_data_info;
        return this;
    }

    public void setUser_data_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_data_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GameHomeInfo(");
        sb2.append("user_data_info:");
        UserDataInfo userDataInfo = this.user_data_info;
        if (userDataInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userDataInfo);
        }
        sb2.append(j2.O);
        sb2.append("plan_info:");
        UserPlanInfo userPlanInfo = this.plan_info;
        if (userPlanInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userPlanInfo);
        }
        sb2.append(j2.O);
        sb2.append("basic_info:");
        GameUserBasicInfo gameUserBasicInfo = this.basic_info;
        if (gameUserBasicInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(gameUserBasicInfo);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBasic_info() {
        this.basic_info = null;
    }

    public void unsetPlan_info() {
        this.plan_info = null;
    }

    public void unsetUser_data_info() {
        this.user_data_info = null;
    }

    public void validate() throws TException {
        UserDataInfo userDataInfo = this.user_data_info;
        if (userDataInfo == null) {
            throw new TProtocolException("Required field 'user_data_info' was not present! Struct: " + toString());
        }
        if (this.plan_info == null) {
            throw new TProtocolException("Required field 'plan_info' was not present! Struct: " + toString());
        }
        if (this.basic_info == null) {
            throw new TProtocolException("Required field 'basic_info' was not present! Struct: " + toString());
        }
        if (userDataInfo != null) {
            userDataInfo.validate();
        }
        UserPlanInfo userPlanInfo = this.plan_info;
        if (userPlanInfo != null) {
            userPlanInfo.validate();
        }
        GameUserBasicInfo gameUserBasicInfo = this.basic_info;
        if (gameUserBasicInfo != null) {
            gameUserBasicInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public GameHomeInfo(UserDataInfo user_data_info, UserPlanInfo plan_info, GameUserBasicInfo basic_info) {
        this();
        this.user_data_info = user_data_info;
        this.plan_info = plan_info;
        this.basic_info = basic_info;
    }

    @Override // java.lang.Comparable
    public int compareTo(GameHomeInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetUser_data_info()).compareTo(Boolean.valueOf(other.isSetUser_data_info()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetUser_data_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.user_data_info, (Comparable) other.user_data_info)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetPlan_info()).compareTo(Boolean.valueOf(other.isSetPlan_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetPlan_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.plan_info, (Comparable) other.plan_info)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetBasic_info()).compareTo(Boolean.valueOf(other.isSetBasic_info()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetBasic_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.basic_info, (Comparable) other.basic_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<GameHomeInfo, _Fields> deepCopy2() {
        return new GameHomeInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getUser_data_info();
        }
        if (i11 == 2) {
            return getPlan_info();
        }
        if (i11 == 3) {
            return getBasic_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUser_data_info();
        }
        if (i11 == 2) {
            return isSetPlan_info();
        }
        if (i11 == 3) {
            return isSetBasic_info();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$GameHomeInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUser_data_info();
                return;
            } else {
                setUser_data_info((UserDataInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetPlan_info();
                return;
            } else {
                setPlan_info((UserPlanInfo) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetBasic_info();
        } else {
            setBasic_info((GameUserBasicInfo) value);
        }
    }

    public boolean equals(GameHomeInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetUser_data_info = isSetUser_data_info();
        boolean isSetUser_data_info2 = that.isSetUser_data_info();
        if ((isSetUser_data_info || isSetUser_data_info2) && !(isSetUser_data_info && isSetUser_data_info2 && this.user_data_info.equals(that.user_data_info))) {
            return false;
        }
        boolean isSetPlan_info = isSetPlan_info();
        boolean isSetPlan_info2 = that.isSetPlan_info();
        if ((isSetPlan_info || isSetPlan_info2) && !(isSetPlan_info && isSetPlan_info2 && this.plan_info.equals(that.plan_info))) {
            return false;
        }
        boolean isSetBasic_info = isSetBasic_info();
        boolean isSetBasic_info2 = that.isSetBasic_info();
        if (isSetBasic_info || isSetBasic_info2) {
            return isSetBasic_info && isSetBasic_info2 && this.basic_info.equals(that.basic_info);
        }
        return true;
    }

    public GameHomeInfo(GameHomeInfo other) {
        if (other.isSetUser_data_info()) {
            this.user_data_info = new UserDataInfo(other.user_data_info);
        }
        if (other.isSetPlan_info()) {
            this.plan_info = new UserPlanInfo(other.plan_info);
        }
        if (other.isSetBasic_info()) {
            this.basic_info = new GameUserBasicInfo(other.basic_info);
        }
    }
}
