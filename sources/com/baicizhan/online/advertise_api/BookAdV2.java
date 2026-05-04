package com.baicizhan.online.advertise_api;

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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class BookAdV2 implements TBase<BookAdV2, _Fields>, Serializable, Cloneable, Comparable<BookAdV2> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public List<BookAd> homepage;
    public List<BookAd> wordlist;
    private static final TStruct STRUCT_DESC = new TStruct("BookAdV2");
    private static final TField HOMEPAGE_FIELD_DESC = new TField("homepage", (byte) 15, 1);
    private static final TField WORDLIST_FIELD_DESC = new TField("wordlist", (byte) 15, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.advertise_api.BookAdV2$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$advertise_api$BookAdV2$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$advertise_api$BookAdV2$_Fields = iArr;
            try {
                iArr[_Fields.HOMEPAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$advertise_api$BookAdV2$_Fields[_Fields.WORDLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdV2StandardScheme extends StandardScheme<BookAdV2> {
        private BookAdV2StandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BookAdV2 struct) throws TException {
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
                        struct.wordlist = new ArrayList(readListBegin.size);
                        while (i11 < readListBegin.size) {
                            BookAd bookAd = new BookAd();
                            bookAd.read(iprot);
                            struct.wordlist.add(bookAd);
                            i11++;
                        }
                        iprot.readListEnd();
                        struct.setWordlistIsSet(true);
                    } else {
                        TProtocolUtil.skip(iprot, b11);
                    }
                } else if (b11 == 15) {
                    TList readListBegin2 = iprot.readListBegin();
                    struct.homepage = new ArrayList(readListBegin2.size);
                    while (i11 < readListBegin2.size) {
                        BookAd bookAd2 = new BookAd();
                        bookAd2.read(iprot);
                        struct.homepage.add(bookAd2);
                        i11++;
                    }
                    iprot.readListEnd();
                    struct.setHomepageIsSet(true);
                } else {
                    TProtocolUtil.skip(iprot, b11);
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BookAdV2 struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BookAdV2.STRUCT_DESC);
            if (struct.homepage != null) {
                oprot.writeFieldBegin(BookAdV2.HOMEPAGE_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.homepage.size()));
                Iterator<BookAd> it = struct.homepage.iterator();
                while (it.hasNext()) {
                    it.next().write(oprot);
                }
                oprot.writeListEnd();
                oprot.writeFieldEnd();
            }
            if (struct.wordlist != null) {
                oprot.writeFieldBegin(BookAdV2.WORDLIST_FIELD_DESC);
                oprot.writeListBegin(new TList((byte) 12, struct.wordlist.size()));
                Iterator<BookAd> it2 = struct.wordlist.iterator();
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
    public static class BookAdV2StandardSchemeFactory implements SchemeFactory {
        private BookAdV2StandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookAdV2StandardScheme getScheme() {
            return new BookAdV2StandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdV2TupleScheme extends TupleScheme<BookAdV2> {
        private BookAdV2TupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BookAdV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            TList tList = new TList((byte) 12, tTupleProtocol.readI32());
            struct.homepage = new ArrayList(tList.size);
            for (int i11 = 0; i11 < tList.size; i11++) {
                BookAd bookAd = new BookAd();
                bookAd.read(tTupleProtocol);
                struct.homepage.add(bookAd);
            }
            struct.setHomepageIsSet(true);
            TList tList2 = new TList((byte) 12, tTupleProtocol.readI32());
            struct.wordlist = new ArrayList(tList2.size);
            for (int i12 = 0; i12 < tList2.size; i12++) {
                BookAd bookAd2 = new BookAd();
                bookAd2.read(tTupleProtocol);
                struct.wordlist.add(bookAd2);
            }
            struct.setWordlistIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BookAdV2 struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.homepage.size());
            Iterator<BookAd> it = struct.homepage.iterator();
            while (it.hasNext()) {
                it.next().write(tTupleProtocol);
            }
            tTupleProtocol.writeI32(struct.wordlist.size());
            Iterator<BookAd> it2 = struct.wordlist.iterator();
            while (it2.hasNext()) {
                it2.next().write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookAdV2TupleSchemeFactory implements SchemeFactory {
        private BookAdV2TupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookAdV2TupleScheme getScheme() {
            return new BookAdV2TupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        HOMEPAGE(1, "homepage"),
        WORDLIST(2, "wordlist");

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
                return HOMEPAGE;
            }
            if (fieldId != 2) {
                return null;
            }
            return WORDLIST;
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
        hashMap.put(StandardScheme.class, new BookAdV2StandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BookAdV2TupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.HOMEPAGE, (_Fields) new FieldMetaData("homepage", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BookAd.class))));
        enumMap.put((EnumMap) _Fields.WORDLIST, (_Fields) new FieldMetaData("wordlist", (byte) 1, new ListMetaData((byte) 15, new StructMetaData((byte) 12, BookAd.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BookAdV2.class, unmodifiableMap);
    }

    public BookAdV2() {
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

    public void addToHomepage(BookAd elem) {
        if (this.homepage == null) {
            this.homepage = new ArrayList();
        }
        this.homepage.add(elem);
    }

    public void addToWordlist(BookAd elem) {
        if (this.wordlist == null) {
            this.wordlist = new ArrayList();
        }
        this.wordlist.add(elem);
    }

    @Override // org.apache.thrift.TBase
    public void clear() {
        this.homepage = null;
        this.wordlist = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BookAdV2)) {
            return equals((BookAdV2) that);
        }
        return false;
    }

    public List<BookAd> getHomepage() {
        return this.homepage;
    }

    public Iterator<BookAd> getHomepageIterator() {
        List<BookAd> list = this.homepage;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getHomepageSize() {
        List<BookAd> list = this.homepage;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<BookAd> getWordlist() {
        return this.wordlist;
    }

    public Iterator<BookAd> getWordlistIterator() {
        List<BookAd> list = this.wordlist;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public int getWordlistSize() {
        List<BookAd> list = this.wordlist;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetHomepage() {
        return this.homepage != null;
    }

    public boolean isSetWordlist() {
        return this.wordlist != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BookAdV2 setHomepage(List<BookAd> homepage) {
        this.homepage = homepage;
        return this;
    }

    public void setHomepageIsSet(boolean value) {
        if (value) {
            return;
        }
        this.homepage = null;
    }

    public BookAdV2 setWordlist(List<BookAd> wordlist) {
        this.wordlist = wordlist;
        return this;
    }

    public void setWordlistIsSet(boolean value) {
        if (value) {
            return;
        }
        this.wordlist = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BookAdV2(");
        sb2.append("homepage:");
        List<BookAd> list = this.homepage;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(j2.O);
        sb2.append("wordlist:");
        List<BookAd> list2 = this.wordlist;
        if (list2 == null) {
            sb2.append("null");
        } else {
            sb2.append(list2);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetHomepage() {
        this.homepage = null;
    }

    public void unsetWordlist() {
        this.wordlist = null;
    }

    public void validate() throws TException {
        if (this.homepage == null) {
            throw new TProtocolException("Required field 'homepage' was not present! Struct: " + toString());
        }
        if (this.wordlist != null) {
            return;
        }
        throw new TProtocolException("Required field 'wordlist' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    public BookAdV2(List<BookAd> homepage, List<BookAd> wordlist) {
        this();
        this.homepage = homepage;
        this.wordlist = wordlist;
    }

    @Override // java.lang.Comparable
    public int compareTo(BookAdV2 other) {
        int compareTo;
        int compareTo2;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo3 = Boolean.valueOf(isSetHomepage()).compareTo(Boolean.valueOf(other.isSetHomepage()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (isSetHomepage() && (compareTo2 = TBaseHelper.compareTo((List) this.homepage, (List) other.homepage)) != 0) {
            return compareTo2;
        }
        int compareTo4 = Boolean.valueOf(isSetWordlist()).compareTo(Boolean.valueOf(other.isSetWordlist()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (!isSetWordlist() || (compareTo = TBaseHelper.compareTo((List) this.wordlist, (List) other.wordlist)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BookAdV2, _Fields> deepCopy2() {
        return new BookAdV2(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BookAdV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return getHomepage();
        }
        if (i11 == 2) {
            return getWordlist();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BookAdV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            return isSetHomepage();
        }
        if (i11 == 2) {
            return isSetWordlist();
        }
        throw new IllegalStateException();
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        int i11 = AnonymousClass1.$SwitchMap$com$baicizhan$online$advertise_api$BookAdV2$_Fields[field.ordinal()];
        if (i11 == 1) {
            if (value == null) {
                unsetHomepage();
                return;
            } else {
                setHomepage((List) value);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        if (value == null) {
            unsetWordlist();
        } else {
            setWordlist((List) value);
        }
    }

    public boolean equals(BookAdV2 that) {
        if (that == null) {
            return false;
        }
        boolean isSetHomepage = isSetHomepage();
        boolean isSetHomepage2 = that.isSetHomepage();
        if ((isSetHomepage || isSetHomepage2) && !(isSetHomepage && isSetHomepage2 && this.homepage.equals(that.homepage))) {
            return false;
        }
        boolean isSetWordlist = isSetWordlist();
        boolean isSetWordlist2 = that.isSetWordlist();
        if (isSetWordlist || isSetWordlist2) {
            return isSetWordlist && isSetWordlist2 && this.wordlist.equals(that.wordlist);
        }
        return true;
    }

    public BookAdV2(BookAdV2 other) {
        if (other.isSetHomepage()) {
            ArrayList arrayList = new ArrayList(other.homepage.size());
            Iterator<BookAd> it = other.homepage.iterator();
            while (it.hasNext()) {
                arrayList.add(new BookAd(it.next()));
            }
            this.homepage = arrayList;
        }
        if (other.isSetWordlist()) {
            ArrayList arrayList2 = new ArrayList(other.wordlist.size());
            Iterator<BookAd> it2 = other.wordlist.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new BookAd(it2.next()));
            }
            this.wordlist = arrayList2;
        }
    }
}
