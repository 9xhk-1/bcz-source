package com.baicizhan.online.course_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class QsInfo implements TBase<QsInfo, _Fields>, Serializable, Cloneable, Comparable<QsInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private _Fields[] optionals;
    public List<String> options;

    /* renamed from: qs, reason: collision with root package name */
    public String f28150qs;
    private static final TStruct STRUCT_DESC = new TStruct("QsInfo");
    private static final TField QS_FIELD_DESC = new TField("qs", (byte) 11, 1);
    private static final TField OPTIONS_FIELD_DESC = new TField("options", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.course_api.QsInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$course_api$QsInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$course_api$QsInfo$_Fields = iArr;
            try {
                iArr[_Fields.QS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$course_api$QsInfo$_Fields[_Fields.OPTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QsInfoStandardScheme extends StandardScheme<QsInfo> {
        private QsInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, QsInfo struct) throws TException {
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
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.options = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            struct.options.add(iprot.readString());
                        }
                        iprot.readListEnd();
                        struct.setOptionsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 11) {
                    struct.f28150qs = iprot.readString();
                    struct.setQsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, QsInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(QsInfo.STRUCT_DESC);
            if (struct.f28150qs != null) {
                oprot.writeFieldBegin(QsInfo.QS_FIELD_DESC);
                oprot.writeString(struct.f28150qs);
                oprot.writeFieldEnd();
            }
            if (struct.options != null && struct.isSetOptions()) {
                oprot.writeFieldBegin(QsInfo.OPTIONS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.options.size()));
                Iterator<String> it = struct.options.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QsInfoStandardSchemeFactory implements SchemeFactory {
        private QsInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QsInfoStandardScheme getScheme() {
            return new QsInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QsInfoTupleScheme extends TupleScheme<QsInfo> {
        private QsInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, QsInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.f28150qs = tTupleProtocol.readString();
            struct.setQsIsSet(true);
            if (tTupleProtocol.readBitSet(1).get(0)) {
                TList tList = new TList((byte) 11, tTupleProtocol.readI32());
                struct.options = new ArrayList(tList.size);
                for (int i11 = 0; i11 < tList.size; i11++) {
                    struct.options.add(tTupleProtocol.readString());
                }
                struct.setOptionsIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, QsInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeString(struct.f28150qs);
            BitSet bitSet = new BitSet();
            if (struct.isSetOptions()) {
                bitSet.set(0);
            }
            tTupleProtocol.writeBitSet(bitSet, 1);
            if (struct.isSetOptions()) {
                tTupleProtocol.writeI32(struct.options.size());
                Iterator<String> it = struct.options.iterator();
                while (it.hasNext()) {
                    tTupleProtocol.writeString(it.next());
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class QsInfoTupleSchemeFactory implements SchemeFactory {
        private QsInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public QsInfoTupleScheme getScheme() {
            return new QsInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        QS(1, "qs"),
        OPTIONS(2, "options");

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
                return QS;
            }
            if (fieldId != 2) {
                return null;
            }
            return OPTIONS;
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
        hashMap.put(StandardScheme.class, new QsInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new QsInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.QS, (_Fields) new FieldMetaData("qs", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.OPTIONS, (_Fields) new FieldMetaData("options", (byte) 2, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(QsInfo.class, unmodifiableMap);
    }

    public QsInfo() {
        this.optionals = new _Fields[]{_Fields.OPTIONS};
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

    public void addToOptions(String elem) {
        if (this.options == null) {
            this.options = new ArrayList();
        }
        this.options.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.f28150qs = null;
        this.options = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof QsInfo)) {
            return equals((QsInfo) that);
        }
        return false;
    }

    public List<String> getOptions() {
        return this.options;
    }

    public Iterator<String> getOptionsIterator() {
        List<String> list = this.options;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getOptionsSize() {
        List<String> list = this.options;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getQs() {
        return this.f28150qs;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetOptions() {
        return this.options != null;
    }

    public boolean isSetQs() {
        return this.f28150qs != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public QsInfo setOptions(List<String> options) {
        this.options = options;
        return this;
    }

    public void setOptionsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.options = null;
    }

    public QsInfo setQs(String qs2) {
        this.f28150qs = qs2;
        return this;
    }

    public void setQsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.f28150qs = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("QsInfo(");
        sb2.append("qs:");
        String str = this.f28150qs;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        if (isSetOptions()) {
            sb2.append(j2.O);
            sb2.append("options:");
            List<String> list = this.options;
            if (list == null) {
                sb2.append("null");
            } else {
                sb2.append(list);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetOptions() {
        this.options = null;
    }

    public void unsetQs() {
        this.f28150qs = null;
    }

    public void validate() throws TException {
        if (this.f28150qs != null) {
            return;
        }
        throw new TProtocolException("Required field 'qs' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(QsInfo other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetQs()).compareTo(Boolean.valueOf(other.isSetQs()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetQs() && (compareTo2 = TBaseHelper.compareTo(this.f28150qs, other.f28150qs)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetOptions()).compareTo(Boolean.valueOf(other.isSetOptions()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetOptions() || (compareTo = TBaseHelper.compareTo((List) this.options, (List) other.options)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<QsInfo, _Fields> deepCopy2() {
        return new QsInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$QsInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getQs();
        }
        if (i11 == 2) {
            return getOptions();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$QsInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetQs();
        }
        if (i11 == 2) {
            return isSetOptions();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$course_api$QsInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetQs();
                return;
            } else {
                setQs((String) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetOptions();
        } else {
            setOptions((List) value);
        }
    }

    public QsInfo(String qs2) {
        this();
        this.f28150qs = qs2;
    }

    public boolean equals(QsInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetQs = isSetQs();
        boolean isSetQs2 = that.isSetQs();
        if ((isSetQs || isSetQs2) && !(isSetQs && isSetQs2 && this.f28150qs.equals(that.f28150qs))) {
            return false;
        }
        boolean isSetOptions = isSetOptions();
        boolean isSetOptions2 = that.isSetOptions();
        if (isSetOptions || isSetOptions2) {
            return isSetOptions && isSetOptions2 && this.options.equals(that.options);
        }
        return true;
    }

    public QsInfo(QsInfo other) {
        this.optionals = new _Fields[]{_Fields.OPTIONS};
        if (other.isSetQs()) {
            this.f28150qs = other.f28150qs;
        }
        if (other.isSetOptions()) {
            this.options = new ArrayList(other.options);
        }
    }
}
