package com.baicizhan.online.game_api;

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
import org.apache.thrift.meta_data.StructMetaData;
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
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class StudyHomeInfo implements TBase<StudyHomeInfo, _Fields>, Serializable, Cloneable, Comparable<StudyHomeInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public BookInfo book;
    public TodayLearnInfo learn_info;
    public MascotInfo mascot;
    private static final TStruct STRUCT_DESC = new TStruct("StudyHomeInfo");
    private static final TField BOOK_FIELD_DESC = new TField("book", (byte) 12, 1);
    private static final TField LEARN_INFO_FIELD_DESC = new TField("learn_info", (byte) 12, 2);
    private static final TField MASCOT_FIELD_DESC = new TField("mascot", (byte) 12, 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.game_api.StudyHomeInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields = iArr;
            try {
                iArr[_Fields.BOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields[_Fields.LEARN_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields[_Fields.MASCOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeInfoStandardScheme extends StandardScheme<StudyHomeInfo> {
        private StudyHomeInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, StudyHomeInfo struct) throws TException {
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
                            TProtocolUtil.skip(iprot, b11);
                        } else if (b11 == 12) {
                            MascotInfo mascotInfo = new MascotInfo();
                            struct.mascot = mascotInfo;
                            mascotInfo.read(iprot);
                            struct.setMascotIsSet(true);
                        } else {
                            TProtocolUtil.skip(iprot, b11);
                        }
                    } else if (b11 == 12) {
                        TodayLearnInfo todayLearnInfo = new TodayLearnInfo();
                        struct.learn_info = todayLearnInfo;
                        todayLearnInfo.read(iprot);
                        struct.setLearn_infoIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 12) {
                    BookInfo bookInfo = new BookInfo();
                    struct.book = bookInfo;
                    bookInfo.read(iprot);
                    struct.setBookIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, StudyHomeInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(StudyHomeInfo.STRUCT_DESC);
            if (struct.book != null) {
                oprot.writeFieldBegin(StudyHomeInfo.BOOK_FIELD_DESC);
                struct.book.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.learn_info != null) {
                oprot.writeFieldBegin(StudyHomeInfo.LEARN_INFO_FIELD_DESC);
                struct.learn_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.mascot != null) {
                oprot.writeFieldBegin(StudyHomeInfo.MASCOT_FIELD_DESC);
                struct.mascot.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeInfoStandardSchemeFactory implements SchemeFactory {
        private StudyHomeInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeInfoStandardScheme getScheme() {
            return new StudyHomeInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeInfoTupleScheme extends TupleScheme<StudyHomeInfo> {
        private StudyHomeInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, StudyHomeInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            BookInfo bookInfo = new BookInfo();
            struct.book = bookInfo;
            bookInfo.read(tTupleProtocol);
            struct.setBookIsSet(true);
            TodayLearnInfo todayLearnInfo = new TodayLearnInfo();
            struct.learn_info = todayLearnInfo;
            todayLearnInfo.read(tTupleProtocol);
            struct.setLearn_infoIsSet(true);
            MascotInfo mascotInfo = new MascotInfo();
            struct.mascot = mascotInfo;
            mascotInfo.read(tTupleProtocol);
            struct.setMascotIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, StudyHomeInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.book.write(tTupleProtocol);
            struct.learn_info.write(tTupleProtocol);
            struct.mascot.write(tTupleProtocol);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StudyHomeInfoTupleSchemeFactory implements SchemeFactory {
        private StudyHomeInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public StudyHomeInfoTupleScheme getScheme() {
            return new StudyHomeInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        BOOK(1, "book"),
        LEARN_INFO(2, "learn_info"),
        MASCOT(3, "mascot");

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
                return BOOK;
            }
            if (fieldId == 2) {
                return LEARN_INFO;
            }
            if (fieldId != 3) {
                return null;
            }
            return MASCOT;
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
        hashMap.put(StandardScheme.class, new StudyHomeInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new StudyHomeInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.BOOK, (_Fields) new FieldMetaData("book", (byte) 1, new StructMetaData((byte) 12, BookInfo.class)));
        enumMap.put((EnumMap) _Fields.LEARN_INFO, (_Fields) new FieldMetaData("learn_info", (byte) 1, new StructMetaData((byte) 12, TodayLearnInfo.class)));
        enumMap.put((EnumMap) _Fields.MASCOT, (_Fields) new FieldMetaData("mascot", (byte) 1, new StructMetaData((byte) 12, MascotInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(StudyHomeInfo.class, unmodifiableMap);
    }

    public StudyHomeInfo() {
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
        this.book = null;
        this.learn_info = null;
        this.mascot = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof StudyHomeInfo)) {
            return equals((StudyHomeInfo) that);
        }
        return false;
    }

    public BookInfo getBook() {
        return this.book;
    }

    public TodayLearnInfo getLearn_info() {
        return this.learn_info;
    }

    public MascotInfo getMascot() {
        return this.mascot;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetBook() {
        return this.book != null;
    }

    public boolean isSetLearn_info() {
        return this.learn_info != null;
    }

    public boolean isSetMascot() {
        return this.mascot != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public StudyHomeInfo setBook(BookInfo book) {
        this.book = book;
        return this;
    }

    public void setBookIsSet(boolean value) {
        if (value) {
            return;
        }
        this.book = null;
    }

    public StudyHomeInfo setLearn_info(TodayLearnInfo learn_info) {
        this.learn_info = learn_info;
        return this;
    }

    public void setLearn_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.learn_info = null;
    }

    public StudyHomeInfo setMascot(MascotInfo mascot) {
        this.mascot = mascot;
        return this;
    }

    public void setMascotIsSet(boolean value) {
        if (value) {
            return;
        }
        this.mascot = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StudyHomeInfo(");
        sb2.append("book:");
        BookInfo bookInfo = this.book;
        if (bookInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(bookInfo);
        }
        sb2.append(j2.O);
        sb2.append("learn_info:");
        TodayLearnInfo todayLearnInfo = this.learn_info;
        if (todayLearnInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(todayLearnInfo);
        }
        sb2.append(j2.O);
        sb2.append("mascot:");
        MascotInfo mascotInfo = this.mascot;
        if (mascotInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(mascotInfo);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetBook() {
        this.book = null;
    }

    public void unsetLearn_info() {
        this.learn_info = null;
    }

    public void unsetMascot() {
        this.mascot = null;
    }

    public void validate() throws TException {
        BookInfo bookInfo = this.book;
        if (bookInfo == null) {
            throw new TProtocolException("Required field 'book' was not present! Struct: " + toString());
        }
        if (this.learn_info == null) {
            throw new TProtocolException("Required field 'learn_info' was not present! Struct: " + toString());
        }
        if (this.mascot == null) {
            throw new TProtocolException("Required field 'mascot' was not present! Struct: " + toString());
        }
        if (bookInfo != null) {
            bookInfo.validate();
        }
        TodayLearnInfo todayLearnInfo = this.learn_info;
        if (todayLearnInfo != null) {
            todayLearnInfo.validate();
        }
        MascotInfo mascotInfo = this.mascot;
        if (mascotInfo != null) {
            mascotInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public StudyHomeInfo(BookInfo book, TodayLearnInfo learn_info, MascotInfo mascot) {
        this();
        this.book = book;
        this.learn_info = learn_info;
        this.mascot = mascot;
    }

    @Override // java.lang.Comparable
    public int compareTo(StudyHomeInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo4 = Boolean.valueOf(isSetBook()).compareTo(Boolean.valueOf(other.isSetBook()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (isSetBook() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.book, (Comparable) other.book)) != 0) {
            return compareTo3;
        }
        int compareTo5 = Boolean.valueOf(isSetLearn_info()).compareTo(Boolean.valueOf(other.isSetLearn_info()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (isSetLearn_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.learn_info, (Comparable) other.learn_info)) != 0) {
            return compareTo2;
        }
        int compareTo6 = Boolean.valueOf(isSetMascot()).compareTo(Boolean.valueOf(other.isSetMascot()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!isSetMascot() || (compareTo = TBaseHelper.compareTo((Comparable) this.mascot, (Comparable) other.mascot)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<StudyHomeInfo, _Fields> deepCopy2() {
        return new StudyHomeInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getBook();
        }
        if (i11 == 2) {
            return getLearn_info();
        }
        if (i11 == 3) {
            return getMascot();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetBook();
        }
        if (i11 == 2) {
            return isSetLearn_info();
        }
        if (i11 == 3) {
            return isSetMascot();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$game_api$StudyHomeInfo$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetBook();
                return;
            } else {
                setBook((BookInfo) value);
                return;
            }
        }
        if (i11 == 2) {
            if (value == null) {
                unsetLearn_info();
                return;
            } else {
                setLearn_info((TodayLearnInfo) value);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        if (value == null) {
            unsetMascot();
        } else {
            setMascot((MascotInfo) value);
        }
    }

    public boolean equals(StudyHomeInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetBook = isSetBook();
        boolean isSetBook2 = that.isSetBook();
        if ((isSetBook || isSetBook2) && !(isSetBook && isSetBook2 && this.book.equals(that.book))) {
            return false;
        }
        boolean isSetLearn_info = isSetLearn_info();
        boolean isSetLearn_info2 = that.isSetLearn_info();
        if ((isSetLearn_info || isSetLearn_info2) && !(isSetLearn_info && isSetLearn_info2 && this.learn_info.equals(that.learn_info))) {
            return false;
        }
        boolean isSetMascot = isSetMascot();
        boolean isSetMascot2 = that.isSetMascot();
        if (isSetMascot || isSetMascot2) {
            return isSetMascot && isSetMascot2 && this.mascot.equals(that.mascot);
        }
        return true;
    }

    public StudyHomeInfo(StudyHomeInfo other) {
        if (other.isSetBook()) {
            this.book = new BookInfo(other.book);
        }
        if (other.isSetLearn_info()) {
            this.learn_info = new TodayLearnInfo(other.learn_info);
        }
        if (other.isSetMascot()) {
            this.mascot = new MascotInfo(other.mascot);
        }
    }
}
