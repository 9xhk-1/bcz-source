package com.baicizhan.online.notify;

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
/* loaded from: classes5.dex */
public class Feedback implements TBase<Feedback, _Fields>, Serializable, Cloneable, Comparable<Feedback> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<String> selection;
    public String toast;
    private static final TStruct STRUCT_DESC = new TStruct("Feedback");
    private static final TField SELECTION_FIELD_DESC = new TField("selection", (byte) 15, 1);
    private static final TField TOAST_FIELD_DESC = new TField(com.baicizhan.main.home.plan.module.exam.b.f22504c, (byte) 11, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.notify.Feedback$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$notify$Feedback$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$notify$Feedback$_Fields = iArr;
            try {
                iArr[_Fields.SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$notify$Feedback$_Fields[_Fields.TOAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedbackStandardScheme extends StandardScheme<Feedback> {
        private FeedbackStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, Feedback struct) throws TException {
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
                    } else if (b11 == 11) {
                        struct.toast = iprot.readString();
                        struct.setToastIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin = iprot.readListBegin();
                    struct.selection = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        struct.selection.add(iprot.readString());
                    }
                    iprot.readListEnd();
                    struct.setSelectionIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, Feedback struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(Feedback.STRUCT_DESC);
            if (struct.selection != null) {
                oprot.writeFieldBegin(Feedback.SELECTION_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.selection.size()));
                Iterator<String> it = struct.selection.iterator();
                while (it.hasNext()) {
                    oprot.writeString(it.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.toast != null) {
                oprot.writeFieldBegin(Feedback.TOAST_FIELD_DESC);
                oprot.writeString(struct.toast);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedbackStandardSchemeFactory implements SchemeFactory {
        private FeedbackStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FeedbackStandardScheme getScheme() {
            return new FeedbackStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedbackTupleScheme extends TupleScheme<Feedback> {
        private FeedbackTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, Feedback struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 11, tTupleProtocol.readI32());
            struct.selection = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                struct.selection.add(tTupleProtocol.readString());
            }
            struct.setSelectionIsSet(true);
            struct.toast = tTupleProtocol.readString();
            struct.setToastIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, Feedback struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.selection.size());
            Iterator<String> it = struct.selection.iterator();
            while (it.hasNext()) {
                tTupleProtocol.writeString(it.next());
            }
            tTupleProtocol.writeString(struct.toast);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FeedbackTupleSchemeFactory implements SchemeFactory {
        private FeedbackTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public FeedbackTupleScheme getScheme() {
            return new FeedbackTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SELECTION(1, "selection"),
        TOAST(2, com.baicizhan.main.home.plan.module.exam.b.f22504c);

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
                return SELECTION;
            }
            if (fieldId != 2) {
                return null;
            }
            return TOAST;
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
        hashMap.put(StandardScheme.class, new FeedbackStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new FeedbackTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SELECTION, (_Fields) new FieldMetaData("selection", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.TOAST, (_Fields) new FieldMetaData(com.baicizhan.main.home.plan.module.exam.b.f22504c, (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(Feedback.class, unmodifiableMap);
    }

    public Feedback() {
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

    public void addToSelection(String elem) {
        if (this.selection == null) {
            this.selection = new ArrayList();
        }
        this.selection.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.selection = null;
        this.toast = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof Feedback)) {
            return equals((Feedback) that);
        }
        return false;
    }

    public List<String> getSelection() {
        return this.selection;
    }

    public Iterator<String> getSelectionIterator() {
        List<String> list = this.selection;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSelectionSize() {
        List<String> list = this.selection;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getToast() {
        return this.toast;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetSelection() {
        return this.selection != null;
    }

    public boolean isSetToast() {
        return this.toast != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public Feedback setSelection(List<String> selection) {
        this.selection = selection;
        return this;
    }

    public void setSelectionIsSet(boolean value) {
        if (value) {
            return;
        }
        this.selection = null;
    }

    public Feedback setToast(String toast) {
        this.toast = toast;
        return this;
    }

    public void setToastIsSet(boolean value) {
        if (value) {
            return;
        }
        this.toast = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Feedback(");
        sb2.append("selection:");
        List<String> list = this.selection;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("toast:");
        String str = this.toast;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetSelection() {
        this.selection = null;
    }

    public void unsetToast() {
        this.toast = null;
    }

    public void validate() throws TException {
        if (this.selection == null) {
            throw new TProtocolException("Required field 'selection' was not present! Struct: " + toString());
        }
        if (this.toast != null) {
            return;
        }
        throw new TProtocolException("Required field 'toast' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public Feedback(List<String> selection, String toast) {
        this();
        this.selection = selection;
        this.toast = toast;
    }

    @Override // java.lang.Comparable
    public int compareTo(Feedback other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetSelection()).compareTo(Boolean.valueOf(other.isSetSelection()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetSelection() && (compareTo2 = TBaseHelper.compareTo((List) this.selection, (List) other.selection)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetToast()).compareTo(Boolean.valueOf(other.isSetToast()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetToast() || (compareTo = TBaseHelper.compareTo(this.toast, other.toast)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<Feedback, _Fields> deepCopy2() {
        return new Feedback(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$Feedback$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getSelection();
        }
        if (i11 == 2) {
            return getToast();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$Feedback$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetSelection();
        }
        if (i11 == 2) {
            return isSetToast();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$notify$Feedback$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetSelection();
                return;
            } else {
                setSelection((List) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetToast();
        } else {
            setToast((String) value);
        }
    }

    public boolean equals(Feedback that) {
        if (that == null) {
            return false;
        }
        boolean isSetSelection = isSetSelection();
        boolean isSetSelection2 = that.isSetSelection();
        if ((isSetSelection || isSetSelection2) && !(isSetSelection && isSetSelection2 && this.selection.equals(that.selection))) {
            return false;
        }
        boolean isSetToast = isSetToast();
        boolean isSetToast2 = that.isSetToast();
        if (isSetToast || isSetToast2) {
            return isSetToast && isSetToast2 && this.toast.equals(that.toast);
        }
        return true;
    }

    public Feedback(Feedback other) {
        if (other.isSetSelection()) {
            this.selection = new ArrayList(other.selection);
        }
        if (other.isSetToast()) {
            this.toast = other.toast;
        }
    }
}
