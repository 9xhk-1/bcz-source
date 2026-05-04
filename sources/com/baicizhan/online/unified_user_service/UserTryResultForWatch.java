package com.baicizhan.online.unified_user_service;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class UserTryResultForWatch implements TBase<UserTryResultForWatch, _Fields>, Serializable, Cloneable, Comparable<UserTryResultForWatch> {
    private static final TStruct STRUCT_DESC = new TStruct("UserTryResultForWatch");
    private static final TField TOKEN_FIELD_DESC = new TField("token", (byte) 11, 1);
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public String token;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.unified_user_service.UserTryResultForWatch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$unified_user_service$UserTryResultForWatch$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$unified_user_service$UserTryResultForWatch$_Fields = iArr;
            try {
                iArr[_Fields.TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultForWatchStandardScheme extends StandardScheme<UserTryResultForWatch> {
        private UserTryResultForWatchStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserTryResultForWatch struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                if (readFieldBegin.f77768id != 1) {
                    TProtocolUtil.skip(iprot, b11);
                } else if (b11 == 11) {
                    struct.token = iprot.readString();
                    struct.setTokenIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserTryResultForWatch struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserTryResultForWatch.STRUCT_DESC);
            if (struct.token != null) {
                oprot.writeFieldBegin(UserTryResultForWatch.TOKEN_FIELD_DESC);
                oprot.writeString(struct.token);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultForWatchStandardSchemeFactory implements SchemeFactory {
        private UserTryResultForWatchStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserTryResultForWatchStandardScheme getScheme() {
            return new UserTryResultForWatchStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultForWatchTupleScheme extends TupleScheme<UserTryResultForWatch> {
        private UserTryResultForWatchTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserTryResultForWatch struct) throws TException {
            struct.token = ((TTupleProtocol) prot).readString();
            struct.setTokenIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserTryResultForWatch struct) throws TException {
            ((TTupleProtocol) prot).writeString(struct.token);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTryResultForWatchTupleSchemeFactory implements SchemeFactory {
        private UserTryResultForWatchTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserTryResultForWatchTupleScheme getScheme() {
            return new UserTryResultForWatchTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TOKEN(1, "token");

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
            if (fieldId != 1) {
                return null;
            }
            return TOKEN;
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
        hashMap.put(StandardScheme.class, new UserTryResultForWatchStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserTryResultForWatchTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TOKEN, (_Fields) new FieldMetaData("token", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserTryResultForWatch.class, unmodifiableMap);
    }

    public UserTryResultForWatch() {
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
        this.token = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserTryResultForWatch)) {
            return equals((UserTryResultForWatch) that);
        }
        return false;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetToken() {
        return this.token != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserTryResultForWatch setToken(String token) {
        this.token = token;
        return this;
    }

    public void setTokenIsSet(boolean value) {
        if (value) {
            return;
        }
        this.token = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserTryResultForWatch(");
        sb2.append("token:");
        String str = this.token;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetToken() {
        this.token = null;
    }

    public void validate() throws TException {
        if (this.token != null) {
            return;
        }
        throw new TProtocolException("Required field 'token' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public UserTryResultForWatch(String token) {
        this();
        this.token = token;
    }

    @Override // java.lang.Comparable
    public int compareTo(UserTryResultForWatch other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetToken()).compareTo(Boolean.valueOf(other.isSetToken()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetToken() || (compareTo = TBaseHelper.compareTo(this.token, other.token)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserTryResultForWatch, _Fields> deepCopy2() {
        return new UserTryResultForWatch(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserTryResultForWatch$_Fields[field.ordinal()] == 1) {
            return getToken();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserTryResultForWatch$_Fields[field.ordinal()] == 1) {
            return isSetToken();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$unified_user_service$UserTryResultForWatch$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetToken();
        } else {
            setToken((String) value);
        }
    }

    public boolean equals(UserTryResultForWatch that) {
        if (that == null) {
            return false;
        }
        boolean isSetToken = isSetToken();
        boolean isSetToken2 = that.isSetToken();
        if (isSetToken || isSetToken2) {
            return isSetToken && isSetToken2 && this.token.equals(that.token);
        }
        return true;
    }

    public UserTryResultForWatch(UserTryResultForWatch other) {
        if (other.isSetToken()) {
            this.token = other.token;
        }
    }
}
