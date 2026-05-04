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
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
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
public class DailyTask implements TBase<DailyTask, _Fields>, Serializable, Cloneable, Comparable<DailyTask> {
    private static final TStruct STRUCT_DESC = new TStruct("DailyTask");
    private static final TField USER_TASKS_FIELD_DESC = new TField("userTasks", (byte) 15, 1);
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public List<UserTask> userTasks;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.DailyTask$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$DailyTask$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$DailyTask$_Fields = iArr;
            try {
                iArr[_Fields.USER_TASKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DailyTaskStandardScheme extends StandardScheme<DailyTask> {
        private DailyTaskStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, DailyTask struct) throws TException {
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
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.userTasks = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        UserTask userTask = new UserTask();
                        userTask.read(iprot);
                        struct.userTasks.add(userTask);
                    }
                    iprot.readListEnd();
                    struct.setUserTasksIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, DailyTask struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(DailyTask.STRUCT_DESC);
            if (struct.userTasks != null && struct.isSetUserTasks()) {
                oprot.writeFieldBegin(DailyTask.USER_TASKS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.userTasks.size()));
                Iterator<UserTask> it = struct.userTasks.iterator();
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
    public static class DailyTaskStandardSchemeFactory implements SchemeFactory {
        private DailyTaskStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DailyTaskStandardScheme getScheme() {
            return new DailyTaskStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DailyTaskTupleScheme extends TupleScheme<DailyTask> {
        private DailyTaskTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, DailyTask struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TList tList = new TList((byte) 12, tTupleProtocol.readI32());
                struct.userTasks = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    UserTask userTask = new UserTask();
                    userTask.read(tTupleProtocol);
                    struct.userTasks.add(userTask);
                }
                struct.setUserTasksIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, DailyTask struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BitSet bitSet = new BitSet();
            if (struct.isSetUserTasks()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetUserTasks()) {
                tTupleProtocol.writeI32(struct.userTasks.size());
                Iterator<UserTask> it = struct.userTasks.iterator();
                while (it.hasNext()) {
                    it.next().write(tTupleProtocol);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DailyTaskTupleSchemeFactory implements SchemeFactory {
        private DailyTaskTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public DailyTaskTupleScheme getScheme() {
            return new DailyTaskTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        USER_TASKS(1, "userTasks");

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
            return USER_TASKS;
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
        hashMap.put(StandardScheme.class, new DailyTaskStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new DailyTaskTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.USER_TASKS, (_Fields) new FieldMetaData("userTasks", (byte) 2, new ListMetaData((byte) 15, new StructMetaData((byte) 12, UserTask.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(DailyTask.class, unmodifiableMap);
    }

    public DailyTask() {
        this.optionals = new _Fields[]{_Fields.USER_TASKS};
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

    public void addToUserTasks(UserTask elem) {
        if (this.userTasks == null) {
            this.userTasks = new ArrayList();
        }
        this.userTasks.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.userTasks = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof DailyTask)) {
            return equals((DailyTask) that);
        }
        return false;
    }

    public List<UserTask> getUserTasks() {
        return this.userTasks;
    }

    public Iterator<UserTask> getUserTasksIterator() {
        List<UserTask> list = this.userTasks;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getUserTasksSize() {
        List<UserTask> list = this.userTasks;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetUserTasks() {
        return this.userTasks != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public DailyTask setUserTasks(List<UserTask> userTasks) {
        this.userTasks = userTasks;
        return this;
    }

    public void setUserTasksIsSet(boolean value) {
        if (value) {
            return;
        }
        this.userTasks = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DailyTask(");
        if (isSetUserTasks()) {
            sb2.append("userTasks:");
            List<UserTask> list = this.userTasks;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetUserTasks() {
        this.userTasks = null;
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DailyTask other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetUserTasks()).compareTo(Boolean.valueOf(other.isSetUserTasks()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetUserTasks() || (compareTo = TBaseHelper.compareTo((List) this.userTasks, (List) other.userTasks)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<DailyTask, _Fields> deepCopy2() {
        return new DailyTask(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DailyTask$_Fields[field.ordinal()] == 1) {
            return getUserTasks();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DailyTask$_Fields[field.ordinal()] == 1) {
            return isSetUserTasks();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$DailyTask$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetUserTasks();
        } else {
            setUserTasks((List) value);
        }
    }

    public DailyTask(DailyTask other) {
        this.optionals = new _Fields[]{_Fields.USER_TASKS};
        if (other.isSetUserTasks()) {
            ArrayList arrayList = new ArrayList(other.userTasks.size());
            Iterator<UserTask> it = other.userTasks.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserTask(it.next()));
            }
            this.userTasks = arrayList;
        }
    }

    public boolean equals(DailyTask that) {
        if (that == null) {
            return false;
        }
        boolean isSetUserTasks = isSetUserTasks();
        boolean isSetUserTasks2 = that.isSetUserTasks();
        if (isSetUserTasks || isSetUserTasks2) {
            return isSetUserTasks && isSetUserTasks2 && this.userTasks.equals(that.userTasks);
        }
        return true;
    }

    public void validate() throws TException {
    }
}
