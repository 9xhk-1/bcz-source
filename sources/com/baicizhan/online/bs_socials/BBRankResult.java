package com.baicizhan.online.bs_socials;

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
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBRankResult implements TBase<BBRankResult, _Fields>, Serializable, Cloneable, Comparable<BBRankResult> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<BBFriendRankInfo> current_week_rank;
    public List<BBFriendRankInfo> last_week_rank;
    private static final TStruct STRUCT_DESC = new TStruct("BBRankResult");
    private static final TField CURRENT_WEEK_RANK_FIELD_DESC = new TField("current_week_rank", (byte) 15, 1);
    private static final TField LAST_WEEK_RANK_FIELD_DESC = new TField("last_week_rank", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_socials.BBRankResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_socials$BBRankResult$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_socials$BBRankResult$_Fields = iArr;
            try {
                iArr[_Fields.CURRENT_WEEK_RANK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_socials$BBRankResult$_Fields[_Fields.LAST_WEEK_RANK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankResultStandardScheme extends StandardScheme<BBRankResult> {
        private BBRankResultStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBRankResult struct) throws TException {
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
                        TProtocolUtil.skip(iprot, b11);
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.last_week_rank = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            BBFriendRankInfo bBFriendRankInfo = new BBFriendRankInfo();
                            bBFriendRankInfo.read(iprot);
                            struct.last_week_rank.add(bBFriendRankInfo);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setLast_week_rankIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.current_week_rank = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        BBFriendRankInfo bBFriendRankInfo2 = new BBFriendRankInfo();
                        bBFriendRankInfo2.read(iprot);
                        struct.current_week_rank.add(bBFriendRankInfo2);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setCurrent_week_rankIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBRankResult struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBRankResult.STRUCT_DESC);
            if (struct.current_week_rank != null) {
                oprot.writeFieldBegin(BBRankResult.CURRENT_WEEK_RANK_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.current_week_rank.size()));
                Iterator<BBFriendRankInfo> it = struct.current_week_rank.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.last_week_rank != null) {
                oprot.writeFieldBegin(BBRankResult.LAST_WEEK_RANK_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.last_week_rank.size()));
                Iterator<BBFriendRankInfo> it2 = struct.last_week_rank.iterator();
                while (it2.hasNext()) {
                    it2.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankResultStandardSchemeFactory implements SchemeFactory {
        private BBRankResultStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBRankResultStandardScheme getScheme() {
            return new BBRankResultStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankResultTupleScheme extends TupleScheme<BBRankResult> {
        private BBRankResultTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBRankResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.current_week_rank = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BBFriendRankInfo bBFriendRankInfo = new BBFriendRankInfo();
                bBFriendRankInfo.read(tTupleProtocol);
                struct.current_week_rank.add(bBFriendRankInfo);
            }
            struct.setCurrent_week_rankIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.last_week_rank = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                BBFriendRankInfo bBFriendRankInfo2 = new BBFriendRankInfo();
                bBFriendRankInfo2.read(tTupleProtocol);
                struct.last_week_rank.add(bBFriendRankInfo2);
            }
            struct.setLast_week_rankIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBRankResult struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.current_week_rank.size());
            Iterator<BBFriendRankInfo> it = struct.current_week_rank.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.last_week_rank.size());
            Iterator<BBFriendRankInfo> it2 = struct.last_week_rank.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRankResultTupleSchemeFactory implements SchemeFactory {
        private BBRankResultTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBRankResultTupleScheme getScheme() {
            return new BBRankResultTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        CURRENT_WEEK_RANK(1, "current_week_rank"),
        LAST_WEEK_RANK(2, "last_week_rank");

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
                return CURRENT_WEEK_RANK;
            }
            if (fieldId != 2) {
                return null;
            }
            return LAST_WEEK_RANK;
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
        hashMap.put(StandardScheme.class, new BBRankResultStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBRankResultTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.CURRENT_WEEK_RANK, (_Fields) new FieldMetaData("current_week_rank", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBFriendRankInfo.class))));
        enumMap.put((EnumMap) _Fields.LAST_WEEK_RANK, (_Fields) new FieldMetaData("last_week_rank", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBFriendRankInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBRankResult.class, unmodifiableMap);
    }

    public BBRankResult() {
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

    public void addToCurrent_week_rank(BBFriendRankInfo elem) {
        if (this.current_week_rank == null) {
            this.current_week_rank = new ArrayList();
        }
        this.current_week_rank.add(elem);
    }

    public void addToLast_week_rank(BBFriendRankInfo elem) {
        if (this.last_week_rank == null) {
            this.last_week_rank = new ArrayList();
        }
        this.last_week_rank.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.current_week_rank = null;
        this.last_week_rank = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBRankResult)) {
            return equals((BBRankResult) that);
        }
        return false;
    }

    public List<BBFriendRankInfo> getCurrent_week_rank() {
        return this.current_week_rank;
    }

    public Iterator<BBFriendRankInfo> getCurrent_week_rankIterator() {
        List<BBFriendRankInfo> list = this.current_week_rank;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCurrent_week_rankSize() {
        List<BBFriendRankInfo> list = this.current_week_rank;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<BBFriendRankInfo> getLast_week_rank() {
        return this.last_week_rank;
    }

    public Iterator<BBFriendRankInfo> getLast_week_rankIterator() {
        List<BBFriendRankInfo> list = this.last_week_rank;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getLast_week_rankSize() {
        List<BBFriendRankInfo> list = this.last_week_rank;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCurrent_week_rank() {
        return this.current_week_rank != null;
    }

    public boolean isSetLast_week_rank() {
        return this.last_week_rank != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBRankResult setCurrent_week_rank(List<BBFriendRankInfo> current_week_rank) {
        this.current_week_rank = current_week_rank;
        return this;
    }

    public void setCurrent_week_rankIsSet(boolean value) {
        if (value) {
            return;
        }
        this.current_week_rank = null;
    }

    public BBRankResult setLast_week_rank(List<BBFriendRankInfo> last_week_rank) {
        this.last_week_rank = last_week_rank;
        return this;
    }

    public void setLast_week_rankIsSet(boolean value) {
        if (value) {
            return;
        }
        this.last_week_rank = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBRankResult(");
        sb2.append("current_week_rank:");
        List<BBFriendRankInfo> list = this.current_week_rank;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("last_week_rank:");
        List<BBFriendRankInfo> list2 = this.last_week_rank;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(j.f81007d);
        return sb2.toString();
    }

    public void unsetCurrent_week_rank() {
        this.current_week_rank = null;
    }

    public void unsetLast_week_rank() {
        this.last_week_rank = null;
    }

    public void validate() throws TException {
        if (this.current_week_rank == null) {
            throw new TProtocolException("Required field 'current_week_rank' was not present! Struct: " + toString());
        }
        if (this.last_week_rank != null) {
            return;
        }
        throw new TProtocolException("Required field 'last_week_rank' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BBRankResult(List<BBFriendRankInfo> current_week_rank, List<BBFriendRankInfo> last_week_rank) {
        this();
        this.current_week_rank = current_week_rank;
        this.last_week_rank = last_week_rank;
    }

    @Override // java.lang.Comparable
    public int compareTo(BBRankResult other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetCurrent_week_rank()).compareTo(Boolean.valueOf(other.isSetCurrent_week_rank()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetCurrent_week_rank() && (compareTo2 = TBaseHelper.compareTo((List) this.current_week_rank, (List) other.current_week_rank)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetLast_week_rank()).compareTo(Boolean.valueOf(other.isSetLast_week_rank()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetLast_week_rank() || (compareTo = TBaseHelper.compareTo((List) this.last_week_rank, (List) other.last_week_rank)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBRankResult, _Fields> deepCopy2() {
        return new BBRankResult(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBRankResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getCurrent_week_rank();
        }
        if (i11 == 2) {
            return getLast_week_rank();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBRankResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetCurrent_week_rank();
        }
        if (i11 == 2) {
            return isSetLast_week_rank();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_socials$BBRankResult$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetCurrent_week_rank();
                return;
            } else {
                setCurrent_week_rank((List) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetLast_week_rank();
        } else {
            setLast_week_rank((List) value);
        }
    }

    public boolean equals(BBRankResult that) {
        if (that == null) {
            return false;
        }
        boolean isSetCurrent_week_rank = isSetCurrent_week_rank();
        boolean isSetCurrent_week_rank2 = that.isSetCurrent_week_rank();
        if ((isSetCurrent_week_rank || isSetCurrent_week_rank2) && !(isSetCurrent_week_rank && isSetCurrent_week_rank2 && this.current_week_rank.equals(that.current_week_rank))) {
            return false;
        }
        boolean isSetLast_week_rank = isSetLast_week_rank();
        boolean isSetLast_week_rank2 = that.isSetLast_week_rank();
        if (isSetLast_week_rank || isSetLast_week_rank2) {
            return isSetLast_week_rank && isSetLast_week_rank2 && this.last_week_rank.equals(that.last_week_rank);
        }
        return true;
    }

    public BBRankResult(BBRankResult other) {
        if (other.isSetCurrent_week_rank()) {
            ArrayList arrayList = new ArrayList(other.current_week_rank.size());
            Iterator<BBFriendRankInfo> it = other.current_week_rank.iterator();
            while (it.hasNext()) {
                arrayList.add(new BBFriendRankInfo(it.next()));
            }
            this.current_week_rank = arrayList;
        }
        if (other.isSetLast_week_rank()) {
            ArrayList arrayList2 = new ArrayList(other.last_week_rank.size());
            Iterator<BBFriendRankInfo> it2 = other.last_week_rank.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new BBFriendRankInfo(it2.next()));
            }
            this.last_week_rank = arrayList2;
        }
    }
}
