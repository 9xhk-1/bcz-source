package com.baicizhan.online.bs_fights;

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
public class BBRandomMatchInfo implements TBase<BBRandomMatchInfo, _Fields>, Serializable, Cloneable, Comparable<BBRandomMatchInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public BBAnswer answer;
    public String fight_id;
    public BBCandidateInfo matched;
    public List<BBProblem> problems;
    private static final TStruct STRUCT_DESC = new TStruct("BBRandomMatchInfo");
    private static final TField MATCHED_FIELD_DESC = new TField("matched", (byte) 12, 1);
    private static final TField PROBLEMS_FIELD_DESC = new TField("problems", (byte) 15, 2);
    private static final TField ANSWER_FIELD_DESC = new TField("answer", (byte) 12, 3);
    private static final TField FIGHT_ID_FIELD_DESC = new TField("fight_id", (byte) 11, 4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.bs_fights.BBRandomMatchInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields = iArr;
            try {
                iArr[_Fields.MATCHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields[_Fields.PROBLEMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields[_Fields.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields[_Fields.FIGHT_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRandomMatchInfoStandardScheme extends StandardScheme<BBRandomMatchInfo> {
        private BBRandomMatchInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BBRandomMatchInfo struct) throws TException {
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
                            if (s11 != 4) {
                                TProtocolUtil.skip(iprot, b11);
                            } else if (b11 == 11) {
                                struct.fight_id = iprot.readString();
                                struct.setFight_idIsSet(true);
                            } else {
                                TProtocolUtil.skip(iprot, b11);
                            }
                        } else if (b11 == 12) {
                            BBAnswer bBAnswer = new BBAnswer();
                            struct.answer = bBAnswer;
                            bBAnswer.read(iprot);
                            struct.setAnswerIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 15) {
                        TList readListBegin = iprot.readListBegin();
                        struct.problems = new ArrayList(readListBegin.size);
                        for (int i11 = 0; i11 < readListBegin.size; i11++) {
                            BBProblem bBProblem = new BBProblem();
                            bBProblem.read(iprot);
                            struct.problems.add(bBProblem);
                        }
                        iprot.readListEnd();
                        struct.setProblemsIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BBCandidateInfo bBCandidateInfo = new BBCandidateInfo();
                    struct.matched = bBCandidateInfo;
                    bBCandidateInfo.read(iprot);
                    struct.setMatchedIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BBRandomMatchInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BBRandomMatchInfo.STRUCT_DESC);
            if (struct.matched != null) {
                oprot.writeFieldBegin(BBRandomMatchInfo.MATCHED_FIELD_DESC);
                struct.matched.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.problems != null) {
                oprot.writeFieldBegin(BBRandomMatchInfo.PROBLEMS_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.problems.size()));
                Iterator<BBProblem> it = struct.problems.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.answer != null) {
                oprot.writeFieldBegin(BBRandomMatchInfo.ANSWER_FIELD_DESC);
                struct.answer.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.fight_id != null) {
                oprot.writeFieldBegin(BBRandomMatchInfo.FIGHT_ID_FIELD_DESC);
                oprot.writeString(struct.fight_id);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRandomMatchInfoStandardSchemeFactory implements SchemeFactory {
        private BBRandomMatchInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBRandomMatchInfoStandardScheme getScheme() {
            return new BBRandomMatchInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRandomMatchInfoTupleScheme extends TupleScheme<BBRandomMatchInfo> {
        private BBRandomMatchInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BBRandomMatchInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BBCandidateInfo bBCandidateInfo = new BBCandidateInfo();
            struct.matched = bBCandidateInfo;
            bBCandidateInfo.read(tTupleProtocol);
            struct.setMatchedIsSet(true);
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.problems = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BBProblem bBProblem = new BBProblem();
                bBProblem.read(tTupleProtocol);
                struct.problems.add(bBProblem);
            }
            struct.setProblemsIsSet(true);
            BBAnswer bBAnswer = new BBAnswer();
            struct.answer = bBAnswer;
            bBAnswer.read(tTupleProtocol);
            struct.setAnswerIsSet(true);
            struct.fight_id = tTupleProtocol.readString();
            struct.setFight_idIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BBRandomMatchInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.matched.write(tTupleProtocol);
            tTupleProtocol.writeI32(struct.problems.size());
            Iterator<BBProblem> it = struct.problems.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            struct.answer.write(tTupleProtocol);
            tTupleProtocol.writeString(struct.fight_id);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BBRandomMatchInfoTupleSchemeFactory implements SchemeFactory {
        private BBRandomMatchInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BBRandomMatchInfoTupleScheme getScheme() {
            return new BBRandomMatchInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        MATCHED(1, "matched"),
        PROBLEMS(2, "problems"),
        ANSWER(3, "answer"),
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
                return PROBLEMS;
            }
            if (fieldId == 3) {
                return ANSWER;
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
        hashMap.put(StandardScheme.class, new BBRandomMatchInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BBRandomMatchInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.MATCHED, (_Fields) new FieldMetaData("matched", (byte) 1, new StructMetaData((byte) 12, BBCandidateInfo.class)));
        enumMap.put((EnumMap) _Fields.PROBLEMS, (_Fields) new FieldMetaData("problems", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BBProblem.class))));
        enumMap.put((EnumMap) _Fields.ANSWER, (_Fields) new FieldMetaData("answer", (byte) 1, new StructMetaData((byte) 12, BBAnswer.class)));
        enumMap.put((EnumMap) _Fields.FIGHT_ID, (_Fields) new FieldMetaData("fight_id", (byte) 1, new FieldValueMetaData((byte) 11)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BBRandomMatchInfo.class, unmodifiableMap);
    }

    public BBRandomMatchInfo() {
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

    public void addToProblems(BBProblem elem) {
        if (this.problems == null) {
            this.problems = new ArrayList();
        }
        this.problems.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.matched = null;
        this.problems = null;
        this.answer = null;
        this.fight_id = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BBRandomMatchInfo)) {
            return equals((BBRandomMatchInfo) that);
        }
        return false;
    }

    public BBAnswer getAnswer() {
        return this.answer;
    }

    public String getFight_id() {
        return this.fight_id;
    }

    public BBCandidateInfo getMatched() {
        return this.matched;
    }

    public List<BBProblem> getProblems() {
        return this.problems;
    }

    public Iterator<BBProblem> getProblemsIterator() {
        List<BBProblem> list = this.problems;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getProblemsSize() {
        List<BBProblem> list = this.problems;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetAnswer() {
        return this.answer != null;
    }

    public boolean isSetFight_id() {
        return this.fight_id != null;
    }

    public boolean isSetMatched() {
        return this.matched != null;
    }

    public boolean isSetProblems() {
        return this.problems != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BBRandomMatchInfo setAnswer(BBAnswer answer) {
        this.answer = answer;
        return this;
    }

    public void setAnswerIsSet(boolean value) {
        if (value) {
            return;
        }
        this.answer = null;
    }

    public BBRandomMatchInfo setFight_id(String fight_id) {
        this.fight_id = fight_id;
        return this;
    }

    public void setFight_idIsSet(boolean value) {
        if (value) {
            return;
        }
        this.fight_id = null;
    }

    public BBRandomMatchInfo setMatched(BBCandidateInfo matched) {
        this.matched = matched;
        return this;
    }

    public void setMatchedIsSet(boolean value) {
        if (value) {
            return;
        }
        this.matched = null;
    }

    public BBRandomMatchInfo setProblems(List<BBProblem> problems) {
        this.problems = problems;
        return this;
    }

    public void setProblemsIsSet(boolean value) {
        if (value) {
            return;
        }
        this.problems = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BBRandomMatchInfo(");
        sb2.append("matched:");
        BBCandidateInfo bBCandidateInfo = this.matched;
        if (bBCandidateInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bBCandidateInfo);
        }
        sb2.append(j2.O);
        sb2.append("problems:");
        List<BBProblem> list = this.problems;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("answer:");
        BBAnswer bBAnswer = this.answer;
        if (bBAnswer == null) {
            sb2.append("null");
        } else {
            sb2.append(bBAnswer);
        }
        sb2.append(j2.O);
        sb2.append("fight_id:");
        String str = this.fight_id;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetAnswer() {
        this.answer = null;
    }

    public void unsetFight_id() {
        this.fight_id = null;
    }

    public void unsetMatched() {
        this.matched = null;
    }

    public void unsetProblems() {
        this.problems = null;
    }

    public void validate() throws TException {
        BBCandidateInfo bBCandidateInfo = this.matched;
        if (bBCandidateInfo == null) {
            throw new TProtocolException("Required field 'matched' was not present! Struct: " + toString());
        }
        if (this.problems == null) {
            throw new TProtocolException("Required field 'problems' was not present! Struct: " + toString());
        }
        if (this.answer == null) {
            throw new TProtocolException("Required field 'answer' was not present! Struct: " + toString());
        }
        if (this.fight_id == null) {
            throw new TProtocolException("Required field 'fight_id' was not present! Struct: " + toString());
        }
        if (bBCandidateInfo != null) {
            bBCandidateInfo.validate();
        }
        BBAnswer bBAnswer = this.answer;
        if (bBAnswer != null) {
            bBAnswer.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BBRandomMatchInfo(BBCandidateInfo matched, List<BBProblem> problems, BBAnswer answer, String fight_id) {
        this();
        this.matched = matched;
        this.problems = problems;
        this.answer = answer;
        this.fight_id = fight_id;
    }

    @Override // java.lang.Comparable
    public int compareTo(BBRandomMatchInfo other) {
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
        int compareTo6 = Boolean.valueOf(isSetProblems()).compareTo(Boolean.valueOf(other.isSetProblems()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (isSetProblems() && (compareTo3 = TBaseHelper.compareTo((List) this.problems, (List) other.problems)) != 0) {
            return compareTo3;
        }
        int compareTo7 = Boolean.valueOf(isSetAnswer()).compareTo(Boolean.valueOf(other.isSetAnswer()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetAnswer() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.answer, (Comparable) other.answer)) != 0) {
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
    public TBase<BBRandomMatchInfo, _Fields> deepCopy2() {
        return new BBRandomMatchInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getMatched();
        }
        if (i11 == 2) {
            return getProblems();
        }
        if (i11 == 3) {
            return getAnswer();
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
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetMatched();
        }
        if (i11 == 2) {
            return isSetProblems();
        }
        if (i11 == 3) {
            return isSetAnswer();
        }
        if (i11 == 4) {
            return isSetFight_id();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$bs_fights$BBRandomMatchInfo$_Fields[field.ordinal()];
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
                unsetProblems();
                return;
            } else {
                setProblems((List) value);
                return;
            }
        }
        if (i11 == 3) {
            if (value == null) {
                unsetAnswer();
                return;
            } else {
                setAnswer((BBAnswer) value);
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

    public boolean equals(BBRandomMatchInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetMatched = isSetMatched();
        boolean isSetMatched2 = that.isSetMatched();
        if ((isSetMatched || isSetMatched2) && !(isSetMatched && isSetMatched2 && this.matched.equals(that.matched))) {
            return false;
        }
        boolean isSetProblems = isSetProblems();
        boolean isSetProblems2 = that.isSetProblems();
        if ((isSetProblems || isSetProblems2) && !(isSetProblems && isSetProblems2 && this.problems.equals(that.problems))) {
            return false;
        }
        boolean isSetAnswer = isSetAnswer();
        boolean isSetAnswer2 = that.isSetAnswer();
        if ((isSetAnswer || isSetAnswer2) && !(isSetAnswer && isSetAnswer2 && this.answer.equals(that.answer))) {
            return false;
        }
        boolean isSetFight_id = isSetFight_id();
        boolean isSetFight_id2 = that.isSetFight_id();
        if (isSetFight_id || isSetFight_id2) {
            return isSetFight_id && isSetFight_id2 && this.fight_id.equals(that.fight_id);
        }
        return true;
    }

    public BBRandomMatchInfo(BBRandomMatchInfo other) {
        if (other.isSetMatched()) {
            this.matched = new BBCandidateInfo(other.matched);
        }
        if (other.isSetProblems()) {
            ArrayList arrayList = new ArrayList(other.problems.size());
            Iterator<BBProblem> it = other.problems.iterator();
            while (it.hasNext()) {
                arrayList.add(new BBProblem(it.next()));
            }
            this.problems = arrayList;
        }
        if (other.isSetAnswer()) {
            this.answer = new BBAnswer(other.answer);
        }
        if (other.isSetFight_id()) {
            this.fight_id = other.fight_id;
        }
    }
}
