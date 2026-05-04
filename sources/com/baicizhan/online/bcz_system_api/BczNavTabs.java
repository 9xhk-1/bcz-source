package com.baicizhan.online.bcz_system_api;

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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BczNavTabs implements TBase<BczNavTabs, _Fields>, Serializable, Cloneable, Comparable<BczNavTabs> {
    private static final TStruct STRUCT_DESC = new TStruct("BczNavTabs");
    private static final TField TABS_FIELD_DESC = new TField("tabs", (byte) 15, 1);
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<BczTabInfo> tabs;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bcz_system_api.BczNavTabs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bcz_system_api$BczNavTabs$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bcz_system_api$BczNavTabs$_Fields = iArr;
            try {
                iArr[_Fields.TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczNavTabsStandardScheme extends StandardScheme<BczNavTabs> {
        private BczNavTabsStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BczNavTabs struct) throws TException {
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
                    struct.tabs = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        BczTabInfo bczTabInfo = new BczTabInfo();
                        bczTabInfo.read(iprot);
                        struct.tabs.add(bczTabInfo);
                    }
                    iprot.readListEnd();
                    struct.setTabsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BczNavTabs struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BczNavTabs.STRUCT_DESC);
            if (struct.tabs != null) {
                oprot.writeFieldBegin(BczNavTabs.TABS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.tabs.size()));
                Iterator<BczTabInfo> it = struct.tabs.iterator();
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
    public static class BczNavTabsStandardSchemeFactory implements SchemeFactory {
        private BczNavTabsStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczNavTabsStandardScheme getScheme() {
            return new BczNavTabsStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczNavTabsTupleScheme extends TupleScheme<BczNavTabs> {
        private BczNavTabsTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BczNavTabs struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.tabs = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BczTabInfo bczTabInfo = new BczTabInfo();
                bczTabInfo.read(tTupleProtocol);
                struct.tabs.add(bczTabInfo);
            }
            struct.setTabsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BczNavTabs struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.tabs.size());
            Iterator<BczTabInfo> it = struct.tabs.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BczNavTabsTupleSchemeFactory implements SchemeFactory {
        private BczNavTabsTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BczNavTabsTupleScheme getScheme() {
            return new BczNavTabsTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        TABS(1, "tabs");

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
            return TABS;
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
        hashMap.put(StandardScheme.class, new BczNavTabsStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BczNavTabsTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.TABS, (_Fields) new FieldMetaData("tabs", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BczTabInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BczNavTabs.class, unmodifiableMap);
    }

    public BczNavTabs() {
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

    public void addToTabs(BczTabInfo elem) {
        if (this.tabs == null) {
            this.tabs = new ArrayList();
        }
        this.tabs.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.tabs = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BczNavTabs)) {
            return equals((BczNavTabs) that);
        }
        return false;
    }

    public List<BczTabInfo> getTabs() {
        return this.tabs;
    }

    public Iterator<BczTabInfo> getTabsIterator() {
        List<BczTabInfo> list = this.tabs;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getTabsSize() {
        List<BczTabInfo> list = this.tabs;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetTabs() {
        return this.tabs != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BczNavTabs setTabs(List<BczTabInfo> tabs) {
        this.tabs = tabs;
        return this;
    }

    public void setTabsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.tabs = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BczNavTabs(");
        sb2.append("tabs:");
        List<BczTabInfo> list = this.tabs;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetTabs() {
        this.tabs = null;
    }

    public void validate() throws TException {
        if (this.tabs != null) {
            return;
        }
        throw new TProtocolException("Required field 'tabs' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BczNavTabs(List<BczTabInfo> tabs) {
        this();
        this.tabs = tabs;
    }

    @Override // java.lang.Comparable
    public int compareTo(BczNavTabs other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetTabs()).compareTo(Boolean.valueOf(other.isSetTabs()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetTabs() || (compareTo = TBaseHelper.compareTo((List) this.tabs, (List) other.tabs)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BczNavTabs, _Fields> deepCopy2() {
        return new BczNavTabs(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczNavTabs$_Fields[field.ordinal()] == 1) {
            return getTabs();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczNavTabs$_Fields[field.ordinal()] == 1) {
            return isSetTabs();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$bcz_system_api$BczNavTabs$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetTabs();
        } else {
            setTabs((List) value);
        }
    }

    public boolean equals(BczNavTabs that) {
        if (that == null) {
            return false;
        }
        boolean isSetTabs = isSetTabs();
        boolean isSetTabs2 = that.isSetTabs();
        if (isSetTabs || isSetTabs2) {
            return isSetTabs && isSetTabs2 && this.tabs.equals(that.tabs);
        }
        return true;
    }

    public BczNavTabs(BczNavTabs other) {
        if (other.isSetTabs()) {
            ArrayList arrayList = new ArrayList(other.tabs.size());
            Iterator<BczTabInfo> it = other.tabs.iterator();
            while (it.hasNext()) {
                arrayList.add(new BczTabInfo(it.next()));
            }
            this.tabs = arrayList;
        }
    }
}
