package com.baicizhan.online.bs_fights;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BBMatchInfo implements TBase<BBMatchInfo, _Fields>, Serializable, Cloneable, Comparable<BBMatchInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<BBCandidateInfo> candidates;
    public String fight_id;
    public BBCandidateInfo matched;
    private _Fields[] optionals;
    public List<String> selected_me;
    private static final TStruct STRUCT_DESC = new TStruct("BBMatchInfo");
    private static final TField MATCHED_FIELD_DESC = new TField("matched", (byte) 12, 1);
    private static final TField CANDIDATES_FIELD_DESC = new TField("candidates", (byte) 15, 2);
    private static final TField SELECTED_ME_FIELD_DESC = new TField("selected_me", (byte) 15, 3);
    private static final TField FIGHT_ID_FIELD_DESC = new TField("fight_id", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBMatchInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields = iArr;
            try {
                iArr[_Fields.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields[_Fields.CANDIDATES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields[_Fields.SELECTED_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields[_Fields.FIGHT_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBMatchInfoStandardScheme extends StandardScheme<BBMatchInfo> {
        private BBMatchInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBMatchInfo struct) throws TException {
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
                    int i11 = 0;
                    if (s11 != 2) {
                        if (s11 != 3) {
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.fight_id = iprot.readString();
                                struct.setFight_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 15) {
                            TList readListBegin = iprot.readListBegin();
                            struct.selected_me = new ArrayList(readListBegin.size);
                            while (i11 < readListBegin.size) {
                                struct.selected_me.add(iprot.readString());
                                i11++;
                            }
                            iprot.readListEnd();
                            struct.setSelected_meIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin2 = iprot.readListBegin();
                        struct.candidates = new ArrayList(readListBegin2.size);
                        while (i11 < readListBegin2.size) {
                            BBCandidateInfo bBCandidateInfo = new BBCandidateInfo();
                            bBCandidateInfo.read(iprot);
                            struct.candidates.add(bBCandidateInfo);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setCandidatesIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BBCandidateInfo bBCandidateInfo2 = new BBCandidateInfo();
                    struct.matched = bBCandidateInfo2;
                    bBCandidateInfo2.read(iprot);
                    struct.setMatchedIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBMatchInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBMatchInfo.STRUCT_DESC);
            if (struct.matched != null && struct.isSetMatched()) {
                oprot.writeFieldBegin(BBMatchInfo.MATCHED_FIELD_DESC);
                struct.matched.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.candidates != null) {
                oprot.writeFieldBegin(BBMatchInfo.CANDIDATES_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.candidates.size()));
                Iterator<BBCandidateInfo> it = struct.candidates.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.selected_me != null) {
                oprot.writeFieldBegin(BBMatchInfo.SELECTED_ME_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 11, struct.selected_me.size()));
                Iterator<String> it2 = struct.selected_me.iterator();
                while (it2.hasNext()) {
                    oprot.writeString(it2.next());
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.fight_id != null && struct.isSetFight_id()) {
                oprot.writeFieldBegin(BBMatchInfo.FIGHT_ID_FIELD_DESC);
                oprot.writeString(struct.fight_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBMatchInfoStandardSchemeFactory implements SchemeFactory {
        private BBMatchInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBMatchInfoStandardScheme getScheme() {
            return new BBMatchInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBMatchInfoTupleScheme extends TupleScheme<BBMatchInfo> {
        private BBMatchInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBMatchInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.candidates = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BBCandidateInfo bBCandidateInfo = new BBCandidateInfo();
                bBCandidateInfo.read(tTupleProtocol);
                struct.candidates.add(bBCandidateInfo);
            }
            struct.setCandidatesIsSet(true);
            TList tList2 = new TList((byte) 11, tTupleProtocol.readI32());
            struct.selected_me = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                struct.selected_me.add(tTupleProtocol.readString());
            }
            struct.setSelected_meIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(2);
            if (readBitSet.get(0)) {
                BBCandidateInfo bBCandidateInfo2 = new BBCandidateInfo();
                struct.matched = bBCandidateInfo2;
                bBCandidateInfo2.read(tTupleProtocol);
                struct.setMatchedIsSet(true);
            }
            if (readBitSet.get(1)) {
                struct.fight_id = tTupleProtocol.readString();
                struct.setFight_idIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBMatchInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.candidates.size());
            Iterator<BBCandidateInfo> it = struct.candidates.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.selected_me.size());
            Iterator<String> it2 = struct.selected_me.iterator();
            while (it2.hasNext()) {
                tTupleProtocol.writeString(it2.next());
            }
            BitSet bitSet = new BitSet();
            if (struct.isSetMatched()) {
                bitSet.set(0);
            }
            if (struct.isSetFight_id()) {
                bitSet.set(1);
            }
            tTupleProtocol.writeBitSet(bitSet, 2);
            if (struct.isSetMatched()) {
                struct.matched.write(tTupleProtocol);
            }
            if (struct.isSetFight_id()) {
                tTupleProtocol.writeString(struct.fight_id);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBMatchInfoTupleSchemeFactory implements SchemeFactory {
        private BBMatchInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBMatchInfoTupleScheme getScheme() {
            return new BBMatchInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MATCHED(1, "matched"),
        CANDIDATES(2, "candidates"),
        SELECTED_ME(3, "selected_me"),
        FIGHT_ID(4, "fight_id");

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
                return MATCHED;
            }
            if (fieldId == 2) {
                return CANDIDATES;
            }
            if (fieldId == 3) {
                return SELECTED_ME;
            }
            if (fieldId != 4) {
                return null;
            }
            return FIGHT_ID;
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
        hashMap.put(StandardScheme.class, new BBMatchInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBMatchInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MATCHED, (_Fields) new FieldMetaData("matched", (byte) 2, new StructMetaData((byte) 12, BBCandidateInfo.class)));
        enumMap.put((EnumMap) _Fields.CANDIDATES, (_Fields) new FieldMetaData("candidates", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBCandidateInfo.class))));
        enumMap.put((EnumMap) _Fields.SELECTED_ME, (_Fields) new FieldMetaData("selected_me", (byte) 1, new ListMetaData((byte) 15, new FieldValueMetaData((byte) 11))));
        enumMap.put((EnumMap) _Fields.FIGHT_ID, (_Fields) new FieldMetaData("fight_id", (byte) 2, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBMatchInfo.class, unmodifiableMap);
    }

    public BBMatchInfo() {
        this.optionals = new _Fields[]{_Fields.MATCHED, _Fields.FIGHT_ID};
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

    public void addToCandidates(BBCandidateInfo elem) {
        if (this.candidates == null) {
            this.candidates = new ArrayList();
        }
        this.candidates.add(elem);
    }

    public void addToSelected_me(String elem) {
        if (this.selected_me == null) {
            this.selected_me = new ArrayList();
        }
        this.selected_me.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.matched = null;
        this.candidates = null;
        this.selected_me = null;
        this.fight_id = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBMatchInfo)) {
            return equals((BBMatchInfo) that);
        }
        return false;
    }

    public List<BBCandidateInfo> getCandidates() {
        return this.candidates;
    }

    public Iterator<BBCandidateInfo> getCandidatesIterator() {
        List<BBCandidateInfo> list = this.candidates;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getCandidatesSize() {
        List<BBCandidateInfo> list = this.candidates;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getFight_id() {
        return this.fight_id;
    }

    public BBCandidateInfo getMatched() {
        return this.matched;
    }

    public List<String> getSelected_me() {
        return this.selected_me;
    }

    public Iterator<String> getSelected_meIterator() {
        List<String> list = this.selected_me;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getSelected_meSize() {
        List<String> list = this.selected_me;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetCandidates() {
        return this.candidates != null;
    }

    public boolean isSetFight_id() {
        return this.fight_id != null;
    }

    public boolean isSetMatched() {
        return this.matched != null;
    }

    public boolean isSetSelected_me() {
        return this.selected_me != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBMatchInfo setCandidates(List<BBCandidateInfo> candidates) {
        this.candidates = candidates;
        return this;
    }

    public void setCandidatesIsSet(boolean value) {
        if (value) {
            return;
        }
        this.candidates = null;
    }

    public BBMatchInfo setFight_id(String fight_id) {
        this.fight_id = fight_id;
        return this;
    }

    public void setFight_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.fight_id = null;
    }

    public BBMatchInfo setMatched(BBCandidateInfo matched) {
        this.matched = matched;
        return this;
    }

    public void setMatchedIsSet(boolean value) {
        if (value) {
            return;
        }
        this.matched = null;
    }

    public BBMatchInfo setSelected_me(List<String> selected_me) {
        this.selected_me = selected_me;
        return this;
    }

    public void setSelected_meIsSet(boolean value) {
        if (value) {
            return;
        }
        this.selected_me = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBMatchInfo(");
        if (isSetMatched()) {
            sb2.append("matched:");
            BBCandidateInfo bBCandidateInfo = this.matched;
            if (bBCandidateInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(bBCandidateInfo);
            }
            sb2.append(j2.O);
        }
        sb2.append("candidates:");
        List<BBCandidateInfo> list = this.candidates;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("selected_me:");
        List<String> list2 = this.selected_me;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        if (isSetFight_id()) {
            sb2.append(j2.O);
            sb2.append("fight_id:");
            String str = this.fight_id;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetCandidates() {
        this.candidates = null;
    }

    public void unsetFight_id() {
        this.fight_id = null;
    }

    public void unsetMatched() {
        this.matched = null;
    }

    public void unsetSelected_me() {
        this.selected_me = null;
    }

    public void validate() throws TException {
        if (this.candidates == null) {
            throw new TProtocolException("Required field 'candidates' was not present! Struct: " + toString());
        }
        if (this.selected_me == null) {
            throw new TProtocolException("Required field 'selected_me' was not present! Struct: " + toString());
        }
        BBCandidateInfo bBCandidateInfo = this.matched;
        if (bBCandidateInfo != null) {
            bBCandidateInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BBMatchInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo5 = Boolean.valueOf(isSetMatched()).compareTo(Boolean.valueOf(other.isSetMatched()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetMatched() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.matched, (Comparable) other.matched)) != 0) {
            return compareTo4;
        }
        int compareTo6 = Boolean.valueOf(isSetCandidates()).compareTo(Boolean.valueOf(other.isSetCandidates()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetCandidates() && (compareTo3 = TBaseHelper.compareTo((List) this.candidates, (List) other.candidates)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetSelected_me()).compareTo(Boolean.valueOf(other.isSetSelected_me()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetSelected_me() && (compareTo2 = TBaseHelper.compareTo((List) this.selected_me, (List) other.selected_me)) != 0) {
            return compareTo2;
        }
        int compareTo8 = Boolean.valueOf(isSetFight_id()).compareTo(Boolean.valueOf(other.isSetFight_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!isSetFight_id() || (compareTo = TBaseHelper.compareTo(this.fight_id, other.fight_id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BBMatchInfo, _Fields> deepCopy2() {
        return new BBMatchInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getMatched();
        }
        if (i11 == 2) {
            return getCandidates();
        }
        if (i11 == 3) {
            return getSelected_me();
        }
        if (i11 == 4) {
            return getFight_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMatched();
        }
        if (i11 == 2) {
            return isSetCandidates();
        }
        if (i11 == 3) {
            return isSetSelected_me();
        }
        if (i11 == 4) {
            return isSetFight_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBMatchInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetMatched();
                return;
            } else {
                setMatched((BBCandidateInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetCandidates();
                return;
            } else {
                setCandidates((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetSelected_me();
                return;
            } else {
                setSelected_me((List) value);
                return;
            }
        }
        if (i11 != 4) {
            return;
        }
        if (value == null) {
            unsetFight_id();
        } else {
            setFight_id((String) value);
        }
    }

    public BBMatchInfo(List<BBCandidateInfo> candidates, List<String> selected_me) {
        this();
        this.candidates = candidates;
        this.selected_me = selected_me;
    }

    public boolean equals(BBMatchInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetMatched = isSetMatched();
        boolean isSetMatched2 = that.isSetMatched();
        if ((isSetMatched || isSetMatched2) && !(isSetMatched && isSetMatched2 && this.matched.equals(that.matched))) {
            return false;
        }
        boolean isSetCandidates = isSetCandidates();
        boolean isSetCandidates2 = that.isSetCandidates();
        if ((isSetCandidates || isSetCandidates2) && !(isSetCandidates && isSetCandidates2 && this.candidates.equals(that.candidates))) {
            return false;
        }
        boolean isSetSelected_me = isSetSelected_me();
        boolean isSetSelected_me2 = that.isSetSelected_me();
        if ((isSetSelected_me || isSetSelected_me2) && !(isSetSelected_me && isSetSelected_me2 && this.selected_me.equals(that.selected_me))) {
            return false;
        }
        boolean isSetFight_id = isSetFight_id();
        boolean isSetFight_id2 = that.isSetFight_id();
        if (isSetFight_id || isSetFight_id2) {
            return isSetFight_id && isSetFight_id2 && this.fight_id.equals(that.fight_id);
        }
        return true;
    }

    public BBMatchInfo(BBMatchInfo other) {
        this.optionals = new _Fields[]{_Fields.MATCHED, _Fields.FIGHT_ID};
        if (other.isSetMatched()) {
            this.matched = new BBCandidateInfo(other.matched);
        }
        if (other.isSetCandidates()) {
            ArrayList arrayList = new ArrayList(other.candidates.size());
            Iterator<BBCandidateInfo> it = other.candidates.iterator();
            while (it.hasNext()) {
                arrayList.add(new BBCandidateInfo(it.next()));
            }
            this.candidates = arrayList;
        }
        if (other.isSetSelected_me()) {
            this.selected_me = new ArrayList(other.selected_me);
        }
        if (other.isSetFight_id()) {
            this.fight_id = other.fight_id;
        }
    }
}
