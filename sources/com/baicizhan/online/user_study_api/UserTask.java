package com.baicizhan.online.user_study_api;

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
import org.apache.thrift.EncodingUtils;
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
public class UserTask implements TBase<UserTask, _Fields>, Serializable, Cloneable, Comparable<UserTask> {
    private static final int __ACTIONCNT_ISSET_ID = 2;
    private static final int __PROGRESS_ISSET_ID = 1;
    private static final int __STATUS_ISSET_ID = 3;
    private static final int __USERTASKID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public int actionCnt;
    public int progress;
    public int status;
    public String taskName;
    public int userTaskId;
    private static final TStruct STRUCT_DESC = new TStruct("UserTask");
    private static final TField USER_TASK_ID_FIELD_DESC = new TField("userTaskId", (byte) 8, 1);
    private static final TField TASK_NAME_FIELD_DESC = new TField("taskName", (byte) 11, 2);
    private static final TField PROGRESS_FIELD_DESC = new TField("progress", (byte) 8, 3);
    private static final TField ACTION_CNT_FIELD_DESC = new TField("actionCnt", (byte) 8, 4);
    private static final TField STATUS_FIELD_DESC = new TField("status", (byte) 8, 5);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.UserTask$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields = iArr;
            try {
                iArr[_Fields.USER_TASK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[_Fields.TASK_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[_Fields.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[_Fields.ACTION_CNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[_Fields.STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTaskStandardScheme extends StandardScheme<UserTask> {
        private UserTaskStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, UserTask struct) throws TException {
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
                                } else if (b11 == 8) {
                                    struct.status = iprot.readI32();
                                    struct.setStatusIsSet(true);
                                } else {
                                    TProtocolUtil.skip(iprot, b11);
                                }
                            } else if (b11 == 8) {
                                struct.actionCnt = iprot.readI32();
                                struct.setActionCntIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 8) {
                            struct.progress = iprot.readI32();
                            struct.setProgressIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 11) {
                        struct.taskName = iprot.readString();
                        struct.setTaskNameIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 8) {
                    struct.userTaskId = iprot.readI32();
                    struct.setUserTaskIdIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            if (!struct.isSetUserTaskId()) {
                throw new TProtocolException("Required field 'userTaskId' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetProgress()) {
                throw new TProtocolException("Required field 'progress' was not found in serialized data! Struct: " + toString());
            }
            if (!struct.isSetActionCnt()) {
                throw new TProtocolException("Required field 'actionCnt' was not found in serialized data! Struct: " + toString());
            }
            if (struct.isSetStatus()) {
                struct.validate();
                return;
            }
            throw new TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, UserTask struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(UserTask.STRUCT_DESC);
            oprot.writeFieldBegin(UserTask.USER_TASK_ID_FIELD_DESC);
            oprot.writeI32(struct.userTaskId);
            oprot.writeFieldEnd();
            if (struct.taskName != null) {
                oprot.writeFieldBegin(UserTask.TASK_NAME_FIELD_DESC);
                oprot.writeString(struct.taskName);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(UserTask.PROGRESS_FIELD_DESC);
            oprot.writeI32(struct.progress);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserTask.ACTION_CNT_FIELD_DESC);
            oprot.writeI32(struct.actionCnt);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(UserTask.STATUS_FIELD_DESC);
            oprot.writeI32(struct.status);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTaskStandardSchemeFactory implements SchemeFactory {
        private UserTaskStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserTaskStandardScheme getScheme() {
            return new UserTaskStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTaskTupleScheme extends TupleScheme<UserTask> {
        private UserTaskTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, UserTask struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.userTaskId = tTupleProtocol.readI32();
            struct.setUserTaskIdIsSet(true);
            struct.taskName = tTupleProtocol.readString();
            struct.setTaskNameIsSet(true);
            struct.progress = tTupleProtocol.readI32();
            struct.setProgressIsSet(true);
            struct.actionCnt = tTupleProtocol.readI32();
            struct.setActionCntIsSet(true);
            struct.status = tTupleProtocol.readI32();
            struct.setStatusIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, UserTask struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.userTaskId);
            tTupleProtocol.writeString(struct.taskName);
            tTupleProtocol.writeI32(struct.progress);
            tTupleProtocol.writeI32(struct.actionCnt);
            tTupleProtocol.writeI32(struct.status);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UserTaskTupleSchemeFactory implements SchemeFactory {
        private UserTaskTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public UserTaskTupleScheme getScheme() {
            return new UserTaskTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_TASK_ID(1, "userTaskId"),
        TASK_NAME(2, "taskName"),
        PROGRESS(3, "progress"),
        ACTION_CNT(4, "actionCnt"),
        STATUS(5, "status");

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
                return USER_TASK_ID;
            }
            if (fieldId == 2) {
                return TASK_NAME;
            }
            if (fieldId == 3) {
                return PROGRESS;
            }
            if (fieldId == 4) {
                return ACTION_CNT;
            }
            if (fieldId != 5) {
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
        hashMap.put(StandardScheme.class, new UserTaskStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new UserTaskTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_TASK_ID, (_Fields) new FieldMetaData("userTaskId", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.TASK_NAME, (_Fields) new FieldMetaData("taskName", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.PROGRESS, (_Fields) new FieldMetaData("progress", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.ACTION_CNT, (_Fields) new FieldMetaData("actionCnt", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.STATUS, (_Fields) new FieldMetaData("status", (byte) 1, new FieldValueMetaData((byte) 8)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(UserTask.class, unmodifiableMap);
    }

    public UserTask() {
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

    @Override // org.apache.thrift.TBase
    public void clear() {
        setUserTaskIdIsSet(false);
        this.userTaskId = 0;
        this.taskName = null;
        setProgressIsSet(false);
        this.progress = 0;
        setActionCntIsSet(false);
        this.actionCnt = 0;
        setStatusIsSet(false);
        this.status = 0;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof UserTask)) {
            return equals((UserTask) that);
        }
        return false;
    }

    public int getActionCnt() {
        return this.actionCnt;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public int getUserTaskId() {
        return this.userTaskId;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetActionCnt() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetProgress() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetStatus() {
        return EncodingUtils.testBit(this.__isset_bitfield, 3);
    }

    public boolean isSetTaskName() {
        return this.taskName != null;
    }

    public boolean isSetUserTaskId() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public UserTask setActionCnt(int actionCnt) {
        this.actionCnt = actionCnt;
        setActionCntIsSet(true);
        return this;
    }

    public void setActionCntIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public UserTask setProgress(int progress) {
        this.progress = progress;
        setProgressIsSet(true);
        return this;
    }

    public void setProgressIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public UserTask setStatus(int status) {
        this.status = status;
        setStatusIsSet(true);
        return this;
    }

    public void setStatusIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 3, value);
    }

    public UserTask setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    public void setTaskNameIsSet(boolean value) {
        if (value) {
            return;
        }
        this.taskName = null;
    }

    public UserTask setUserTaskId(int userTaskId) {
        this.userTaskId = userTaskId;
        setUserTaskIdIsSet(true);
        return this;
    }

    public void setUserTaskIdIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserTask(");
        sb2.append("userTaskId:");
        sb2.append(this.userTaskId);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("taskName:");
        String str = this.taskName;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("progress:");
        sb2.append(this.progress);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("actionCnt:");
        sb2.append(this.actionCnt);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("status:");
        sb2.append(this.status);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetActionCnt() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetProgress() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetStatus() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 3);
    }

    public void unsetTaskName() {
        this.taskName = null;
    }

    public void unsetUserTaskId() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.taskName != null) {
            return;
        }
        throw new TProtocolException("Required field 'taskName' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(UserTask other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo6 = Boolean.valueOf(isSetUserTaskId()).compareTo(Boolean.valueOf(other.isSetUserTaskId()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetUserTaskId() && (compareTo5 = TBaseHelper.compareTo(this.userTaskId, other.userTaskId)) != 0) {
            return compareTo5;
        }
        int compareTo7 = Boolean.valueOf(isSetTaskName()).compareTo(Boolean.valueOf(other.isSetTaskName()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetTaskName() && (compareTo4 = TBaseHelper.compareTo(this.taskName, other.taskName)) != 0) {
            return compareTo4;
        }
        int compareTo8 = Boolean.valueOf(isSetProgress()).compareTo(Boolean.valueOf(other.isSetProgress()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetProgress() && (compareTo3 = TBaseHelper.compareTo(this.progress, other.progress)) != 0) {
            return compareTo3;
        }
        int compareTo9 = Boolean.valueOf(isSetActionCnt()).compareTo(Boolean.valueOf(other.isSetActionCnt()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetActionCnt() && (compareTo2 = TBaseHelper.compareTo(this.actionCnt, other.actionCnt)) != 0) {
            return compareTo2;
        }
        int compareTo10 = Boolean.valueOf(isSetStatus()).compareTo(Boolean.valueOf(other.isSetStatus()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (!isSetStatus() || (compareTo = TBaseHelper.compareTo(this.status, other.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<UserTask, _Fields> deepCopy2() {
        return new UserTask(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[field.ordinal()];
        if (i11 == 1) {
            return Integer.valueOf(getUserTaskId());
        }
        if (i11 == 2) {
            return getTaskName();
        }
        if (i11 == 3) {
            return Integer.valueOf(getProgress());
        }
        if (i11 == 4) {
            return Integer.valueOf(getActionCnt());
        }
        if (i11 == 5) {
            return Integer.valueOf(getStatus());
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetUserTaskId();
        }
        if (i11 == 2) {
            return isSetTaskName();
        }
        if (i11 == 3) {
            return isSetProgress();
        }
        if (i11 == 4) {
            return isSetActionCnt();
        }
        if (i11 == 5) {
            return isSetStatus();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$UserTask$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetUserTaskId();
                return;
            } else {
                setUserTaskId(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetTaskName();
                return;
            } else {
                setTaskName((String) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetProgress();
                return;
            } else {
                setProgress(((Integer) value).intValue());
                return;
            }
        }
        if (i11 == 4) {
            if (value == null) {
                unsetActionCnt();
                return;
            } else {
                setActionCnt(((Integer) value).intValue());
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        if (value == null) {
            unsetStatus();
        } else {
            setStatus(((Integer) value).intValue());
        }
    }

    public UserTask(int userTaskId, String taskName, int progress, int actionCnt, int status) {
        this();
        this.userTaskId = userTaskId;
        setUserTaskIdIsSet(true);
        this.taskName = taskName;
        this.progress = progress;
        setProgressIsSet(true);
        this.actionCnt = actionCnt;
        setActionCntIsSet(true);
        this.status = status;
        setStatusIsSet(true);
    }

    public boolean equals(UserTask that) {
        if (that == null || this.userTaskId != that.userTaskId) {
            return false;
        }
        boolean isSetTaskName = isSetTaskName();
        boolean isSetTaskName2 = that.isSetTaskName();
        return (!(isSetTaskName || isSetTaskName2) || (isSetTaskName && isSetTaskName2 && this.taskName.equals(that.taskName))) && this.progress == that.progress && this.actionCnt == that.actionCnt && this.status == that.status;
    }

    public UserTask(UserTask other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.userTaskId = other.userTaskId;
        if (other.isSetTaskName()) {
            this.taskName = other.taskName;
        }
        this.progress = other.progress;
        this.actionCnt = other.actionCnt;
        this.status = other.status;
    }
}
