package com.baicizhan.online.game_api;

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
public class AwardBox implements TBase<AwardBox, _Fields>, Serializable, Cloneable, Comparable<AwardBox> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<AwardItem> awards;
    private static final TStruct STRUCT_DESC = new TStruct("AwardBox");
    private static final TField AWARDS_FIELD_DESC = new TField("awards", (byte) 15, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.AwardBox$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$AwardBox$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$AwardBox$_Fields = iArr;
            try {
                iArr[_Fields.AWARDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardBoxStandardScheme extends StandardScheme<AwardBox> {
        private AwardBoxStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, AwardBox struct) throws TException {
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
                    struct.awards = new ArrayList(readListBegin.size);
                    for (int i11 = 0; i11 < readListBegin.size; i11++) {
                        AwardItem awardItem = new AwardItem();
                        awardItem.read(iprot);
                        struct.awards.add(awardItem);
                    }
                    iprot.readListEnd();
                    struct.setAwardsIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, AwardBox struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(AwardBox.STRUCT_DESC);
            if (struct.awards != null) {
                oprot.writeFieldBegin(AwardBox.AWARDS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.awards.size()));
                Iterator<AwardItem> it = struct.awards.iterator();
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
    public static class AwardBoxStandardSchemeFactory implements SchemeFactory {
        private AwardBoxStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AwardBoxStandardScheme getScheme() {
            return new AwardBoxStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardBoxTupleScheme extends TupleScheme<AwardBox> {
        private AwardBoxTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, AwardBox struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.awards = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                AwardItem awardItem = new AwardItem();
                awardItem.read(tTupleProtocol);
                struct.awards.add(awardItem);
            }
            struct.setAwardsIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, AwardBox struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.awards.size());
            Iterator<AwardItem> it = struct.awards.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AwardBoxTupleSchemeFactory implements SchemeFactory {
        private AwardBoxTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public AwardBoxTupleScheme getScheme() {
            return new AwardBoxTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        AWARDS(1, "awards");

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
            return AWARDS;
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
        hashMap.put(StandardScheme.class, new AwardBoxStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new AwardBoxTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.AWARDS, (_Fields) new FieldMetaData("awards", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, AwardItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(AwardBox.class, unmodifiableMap);
    }

    public AwardBox() {
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

    public void addToAwards(AwardItem elem) {
        if (this.awards == null) {
            this.awards = new ArrayList();
        }
        this.awards.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.awards = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof AwardBox)) {
            return equals((AwardBox) that);
        }
        return false;
    }

    public List<AwardItem> getAwards() {
        return this.awards;
    }

    public Iterator<AwardItem> getAwardsIterator() {
        List<AwardItem> list = this.awards;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getAwardsSize() {
        List<AwardItem> list = this.awards;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAwards() {
        return this.awards != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public AwardBox setAwards(List<AwardItem> awards) {
        this.awards = awards;
        return this;
    }

    public void setAwardsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.awards = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AwardBox(");
        sb2.append("awards:");
        List<AwardItem> list = this.awards;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAwards() {
        this.awards = null;
    }

    public void validate() throws TException {
        if (this.awards != null) {
            return;
        }
        throw new TProtocolException("Required field 'awards' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public AwardBox(List<AwardItem> awards) {
        this();
        this.awards = awards;
    }

    @Override // java.lang.Comparable
    public int compareTo(AwardBox other) {
        int compareTo;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(isSetAwards()).compareTo(Boolean.valueOf(other.isSetAwards()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!isSetAwards() || (compareTo = TBaseHelper.compareTo((List) this.awards, (List) other.awards)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<AwardBox, _Fields> deepCopy2() {
        return new AwardBox(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardBox$_Fields[field.ordinal()] == 1) {
            return getAwards();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardBox$_Fields[field.ordinal()] == 1) {
            return isSetAwards();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        if (AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$AwardBox$_Fields[field.ordinal()] != 1) {
            return;
        }
        if (value == null) {
            unsetAwards();
        } else {
            setAwards((List) value);
        }
    }

    public boolean equals(AwardBox that) {
        if (that == null) {
            return false;
        }
        boolean isSetAwards = isSetAwards();
        boolean isSetAwards2 = that.isSetAwards();
        if (isSetAwards || isSetAwards2) {
            return isSetAwards && isSetAwards2 && this.awards.equals(that.awards);
        }
        return true;
    }

    public AwardBox(AwardBox other) {
        if (other.isSetAwards()) {
            ArrayList arrayList = new ArrayList(other.awards.size());
            Iterator<AwardItem> it = other.awards.iterator();
            while (it.hasNext()) {
                arrayList.add(new AwardItem(it.next()));
            }
            this.awards = arrayList;
        }
    }
}
