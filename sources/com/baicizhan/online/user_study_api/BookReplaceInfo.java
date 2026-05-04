package com.baicizhan.online.user_study_api;

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
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class BookReplaceInfo implements TBase<BookReplaceInfo, _Fields>, Serializable, Cloneable, Comparable<BookReplaceInfo> {
    private static final int __FORCE_UPDATE_ISSET_ID = 2;
    private static final int __NEW_BOOK_ID_ISSET_ID = 1;
    private static final int __OLD_BOOK_ID_ISSET_ID = 0;
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    private byte __isset_bitfield;
    public boolean force_update;
    public String main_page_popup_cancel_text;
    public String main_page_popup_content;
    public String main_page_popup_ok_text;
    public String main_page_popup_title;
    public int new_book_id;
    public int old_book_id;
    private static final TStruct STRUCT_DESC = new TStruct("BookReplaceInfo");
    private static final TField OLD_BOOK_ID_FIELD_DESC = new TField("old_book_id", (byte) 8, 1);
    private static final TField NEW_BOOK_ID_FIELD_DESC = new TField("new_book_id", (byte) 8, 2);
    private static final TField MAIN_PAGE_POPUP_TITLE_FIELD_DESC = new TField("main_page_popup_title", (byte) 11, 3);
    private static final TField MAIN_PAGE_POPUP_CONTENT_FIELD_DESC = new TField("main_page_popup_content", (byte) 11, 4);
    private static final TField MAIN_PAGE_POPUP_OK_TEXT_FIELD_DESC = new TField("main_page_popup_ok_text", (byte) 11, 5);
    private static final TField MAIN_PAGE_POPUP_CANCEL_TEXT_FIELD_DESC = new TField("main_page_popup_cancel_text", (byte) 11, 6);
    private static final TField FORCE_UPDATE_FIELD_DESC = new TField("force_update", (byte) 2, 7);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.user_study_api.BookReplaceInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields = iArr;
            try {
                iArr[_Fields.OLD_BOOK_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[_Fields.NEW_BOOK_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[_Fields.MAIN_PAGE_POPUP_TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[_Fields.MAIN_PAGE_POPUP_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[_Fields.MAIN_PAGE_POPUP_OK_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[_Fields.MAIN_PAGE_POPUP_CANCEL_TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[_Fields.FORCE_UPDATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookReplaceInfoStandardScheme extends StandardScheme<BookReplaceInfo> {
        private BookReplaceInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, BookReplaceInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    if (!struct.isSetOld_book_id()) {
                        throw new TProtocolException("Required field 'old_book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (!struct.isSetNew_book_id()) {
                        throw new TProtocolException("Required field 'new_book_id' was not found in serialized data! Struct: " + toString());
                    }
                    if (struct.isSetForce_update()) {
                        struct.validate();
                        return;
                    }
                    throw new TProtocolException("Required field 'force_update' was not found in serialized data! Struct: " + toString());
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.old_book_id = iprot.readI32();
                            struct.setOld_book_idIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.new_book_id = iprot.readI32();
                            struct.setNew_book_idIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.main_page_popup_title = iprot.readString();
                            struct.setMain_page_popup_titleIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.main_page_popup_content = iprot.readString();
                            struct.setMain_page_popup_contentIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.main_page_popup_ok_text = iprot.readString();
                            struct.setMain_page_popup_ok_textIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.main_page_popup_cancel_text = iprot.readString();
                            struct.setMain_page_popup_cancel_textIsSet(true);
                            break;
                        }
                    case 7:
                        if (b11 != 2) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            struct.force_update = iprot.readBool();
                            struct.setForce_updateIsSet(true);
                            break;
                        }
                    default:
                        TProtocolUtil.skip(iprot, b11);
                        break;
                }
                iprot.readFieldEnd();
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol oprot, BookReplaceInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(BookReplaceInfo.STRUCT_DESC);
            oprot.writeFieldBegin(BookReplaceInfo.OLD_BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.old_book_id);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(BookReplaceInfo.NEW_BOOK_ID_FIELD_DESC);
            oprot.writeI32(struct.new_book_id);
            oprot.writeFieldEnd();
            if (struct.main_page_popup_title != null) {
                oprot.writeFieldBegin(BookReplaceInfo.MAIN_PAGE_POPUP_TITLE_FIELD_DESC);
                oprot.writeString(struct.main_page_popup_title);
                oprot.writeFieldEnd();
            }
            if (struct.main_page_popup_content != null) {
                oprot.writeFieldBegin(BookReplaceInfo.MAIN_PAGE_POPUP_CONTENT_FIELD_DESC);
                oprot.writeString(struct.main_page_popup_content);
                oprot.writeFieldEnd();
            }
            if (struct.main_page_popup_ok_text != null) {
                oprot.writeFieldBegin(BookReplaceInfo.MAIN_PAGE_POPUP_OK_TEXT_FIELD_DESC);
                oprot.writeString(struct.main_page_popup_ok_text);
                oprot.writeFieldEnd();
            }
            if (struct.main_page_popup_cancel_text != null) {
                oprot.writeFieldBegin(BookReplaceInfo.MAIN_PAGE_POPUP_CANCEL_TEXT_FIELD_DESC);
                oprot.writeString(struct.main_page_popup_cancel_text);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(BookReplaceInfo.FORCE_UPDATE_FIELD_DESC);
            oprot.writeBool(struct.force_update);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookReplaceInfoStandardSchemeFactory implements SchemeFactory {
        private BookReplaceInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookReplaceInfoStandardScheme getScheme() {
            return new BookReplaceInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookReplaceInfoTupleScheme extends TupleScheme<BookReplaceInfo> {
        private BookReplaceInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, BookReplaceInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.old_book_id = tTupleProtocol.readI32();
            struct.setOld_book_idIsSet(true);
            struct.new_book_id = tTupleProtocol.readI32();
            struct.setNew_book_idIsSet(true);
            struct.main_page_popup_title = tTupleProtocol.readString();
            struct.setMain_page_popup_titleIsSet(true);
            struct.main_page_popup_content = tTupleProtocol.readString();
            struct.setMain_page_popup_contentIsSet(true);
            struct.main_page_popup_ok_text = tTupleProtocol.readString();
            struct.setMain_page_popup_ok_textIsSet(true);
            struct.main_page_popup_cancel_text = tTupleProtocol.readString();
            struct.setMain_page_popup_cancel_textIsSet(true);
            struct.force_update = tTupleProtocol.readBool();
            struct.setForce_updateIsSet(true);
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, BookReplaceInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            tTupleProtocol.writeI32(struct.old_book_id);
            tTupleProtocol.writeI32(struct.new_book_id);
            tTupleProtocol.writeString(struct.main_page_popup_title);
            tTupleProtocol.writeString(struct.main_page_popup_content);
            tTupleProtocol.writeString(struct.main_page_popup_ok_text);
            tTupleProtocol.writeString(struct.main_page_popup_cancel_text);
            tTupleProtocol.writeBool(struct.force_update);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class BookReplaceInfoTupleSchemeFactory implements SchemeFactory {
        private BookReplaceInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public BookReplaceInfoTupleScheme getScheme() {
            return new BookReplaceInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        OLD_BOOK_ID(1, "old_book_id"),
        NEW_BOOK_ID(2, "new_book_id"),
        MAIN_PAGE_POPUP_TITLE(3, "main_page_popup_title"),
        MAIN_PAGE_POPUP_CONTENT(4, "main_page_popup_content"),
        MAIN_PAGE_POPUP_OK_TEXT(5, "main_page_popup_ok_text"),
        MAIN_PAGE_POPUP_CANCEL_TEXT(6, "main_page_popup_cancel_text"),
        FORCE_UPDATE(7, "force_update");

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
            switch (fieldId) {
                case 1:
                    return OLD_BOOK_ID;
                case 2:
                    return NEW_BOOK_ID;
                case 3:
                    return MAIN_PAGE_POPUP_TITLE;
                case 4:
                    return MAIN_PAGE_POPUP_CONTENT;
                case 5:
                    return MAIN_PAGE_POPUP_OK_TEXT;
                case 6:
                    return MAIN_PAGE_POPUP_CANCEL_TEXT;
                case 7:
                    return FORCE_UPDATE;
                default:
                    return null;
            }
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
        hashMap.put(StandardScheme.class, new BookReplaceInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new BookReplaceInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.OLD_BOOK_ID, (_Fields) new FieldMetaData("old_book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.NEW_BOOK_ID, (_Fields) new FieldMetaData("new_book_id", (byte) 1, new FieldValueMetaData((byte) 8)));
        enumMap.put((EnumMap) _Fields.MAIN_PAGE_POPUP_TITLE, (_Fields) new FieldMetaData("main_page_popup_title", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MAIN_PAGE_POPUP_CONTENT, (_Fields) new FieldMetaData("main_page_popup_content", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MAIN_PAGE_POPUP_OK_TEXT, (_Fields) new FieldMetaData("main_page_popup_ok_text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.MAIN_PAGE_POPUP_CANCEL_TEXT, (_Fields) new FieldMetaData("main_page_popup_cancel_text", (byte) 1, new FieldValueMetaData((byte) 11)));
        enumMap.put((EnumMap) _Fields.FORCE_UPDATE, (_Fields) new FieldMetaData("force_update", (byte) 1, new FieldValueMetaData((byte) 2)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(BookReplaceInfo.class, unmodifiableMap);
    }

    public BookReplaceInfo() {
        this.__isset_bitfield = (byte) 0;
    }

    private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = (byte) 0;
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
        setOld_book_idIsSet(false);
        this.old_book_id = 0;
        setNew_book_idIsSet(false);
        this.new_book_id = 0;
        this.main_page_popup_title = null;
        this.main_page_popup_content = null;
        this.main_page_popup_ok_text = null;
        this.main_page_popup_cancel_text = null;
        setForce_updateIsSet(false);
        this.force_update = false;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof BookReplaceInfo)) {
            return equals((BookReplaceInfo) that);
        }
        return false;
    }

    public String getMain_page_popup_cancel_text() {
        return this.main_page_popup_cancel_text;
    }

    public String getMain_page_popup_content() {
        return this.main_page_popup_content;
    }

    public String getMain_page_popup_ok_text() {
        return this.main_page_popup_ok_text;
    }

    public String getMain_page_popup_title() {
        return this.main_page_popup_title;
    }

    public int getNew_book_id() {
        return this.new_book_id;
    }

    public int getOld_book_id() {
        return this.old_book_id;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isForce_update() {
        return this.force_update;
    }

    public boolean isSetForce_update() {
        return EncodingUtils.testBit(this.__isset_bitfield, 2);
    }

    public boolean isSetMain_page_popup_cancel_text() {
        return this.main_page_popup_cancel_text != null;
    }

    public boolean isSetMain_page_popup_content() {
        return this.main_page_popup_content != null;
    }

    public boolean isSetMain_page_popup_ok_text() {
        return this.main_page_popup_ok_text != null;
    }

    public boolean isSetMain_page_popup_title() {
        return this.main_page_popup_title != null;
    }

    public boolean isSetNew_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 1);
    }

    public boolean isSetOld_book_id() {
        return EncodingUtils.testBit(this.__isset_bitfield, 0);
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public BookReplaceInfo setForce_update(boolean force_update) {
        this.force_update = force_update;
        setForce_updateIsSet(true);
        return this;
    }

    public void setForce_updateIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 2, value);
    }

    public BookReplaceInfo setMain_page_popup_cancel_text(String main_page_popup_cancel_text) {
        this.main_page_popup_cancel_text = main_page_popup_cancel_text;
        return this;
    }

    public void setMain_page_popup_cancel_textIsSet(boolean value) {
        if (value) {
            return;
        }
        this.main_page_popup_cancel_text = null;
    }

    public BookReplaceInfo setMain_page_popup_content(String main_page_popup_content) {
        this.main_page_popup_content = main_page_popup_content;
        return this;
    }

    public void setMain_page_popup_contentIsSet(boolean value) {
        if (value) {
            return;
        }
        this.main_page_popup_content = null;
    }

    public BookReplaceInfo setMain_page_popup_ok_text(String main_page_popup_ok_text) {
        this.main_page_popup_ok_text = main_page_popup_ok_text;
        return this;
    }

    public void setMain_page_popup_ok_textIsSet(boolean value) {
        if (value) {
            return;
        }
        this.main_page_popup_ok_text = null;
    }

    public BookReplaceInfo setMain_page_popup_title(String main_page_popup_title) {
        this.main_page_popup_title = main_page_popup_title;
        return this;
    }

    public void setMain_page_popup_titleIsSet(boolean value) {
        if (value) {
            return;
        }
        this.main_page_popup_title = null;
    }

    public BookReplaceInfo setNew_book_id(int new_book_id) {
        this.new_book_id = new_book_id;
        setNew_book_idIsSet(true);
        return this;
    }

    public void setNew_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 1, value);
    }

    public BookReplaceInfo setOld_book_id(int old_book_id) {
        this.old_book_id = old_book_id;
        setOld_book_idIsSet(true);
        return this;
    }

    public void setOld_book_idIsSet(boolean value) {
        this.__isset_bitfield = EncodingUtils.setBit(this.__isset_bitfield, 0, value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BookReplaceInfo(");
        sb2.append("old_book_id:");
        sb2.append(this.old_book_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("new_book_id:");
        sb2.append(this.new_book_id);
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("main_page_popup_title:");
        String str = this.main_page_popup_title;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(str);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("main_page_popup_content:");
        String str2 = this.main_page_popup_content;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("main_page_popup_ok_text:");
        String str3 = this.main_page_popup_ok_text;
        if (str3 == null) {
            sb2.append("null");
        } else {
            sb2.append(str3);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("main_page_popup_cancel_text:");
        String str4 = this.main_page_popup_cancel_text;
        if (str4 == null) {
            sb2.append("null");
        } else {
            sb2.append(str4);
        }
        sb2.append(org.junit.jupiter.api.j2.O);
        sb2.append("force_update:");
        sb2.append(this.force_update);
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetForce_update() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 2);
    }

    public void unsetMain_page_popup_cancel_text() {
        this.main_page_popup_cancel_text = null;
    }

    public void unsetMain_page_popup_content() {
        this.main_page_popup_content = null;
    }

    public void unsetMain_page_popup_ok_text() {
        this.main_page_popup_ok_text = null;
    }

    public void unsetMain_page_popup_title() {
        this.main_page_popup_title = null;
    }

    public void unsetNew_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 1);
    }

    public void unsetOld_book_id() {
        this.__isset_bitfield = EncodingUtils.clearBit(this.__isset_bitfield, 0);
    }

    public void validate() throws TException {
        if (this.main_page_popup_title == null) {
            throw new TProtocolException("Required field 'main_page_popup_title' was not present! Struct: " + toString());
        }
        if (this.main_page_popup_content == null) {
            throw new TProtocolException("Required field 'main_page_popup_content' was not present! Struct: " + toString());
        }
        if (this.main_page_popup_ok_text == null) {
            throw new TProtocolException("Required field 'main_page_popup_ok_text' was not present! Struct: " + toString());
        }
        if (this.main_page_popup_cancel_text != null) {
            return;
        }
        throw new TProtocolException("Required field 'main_page_popup_cancel_text' was not present! Struct: " + toString());
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BookReplaceInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        int compareTo7;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo8 = Boolean.valueOf(isSetOld_book_id()).compareTo(Boolean.valueOf(other.isSetOld_book_id()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetOld_book_id() && (compareTo7 = TBaseHelper.compareTo(this.old_book_id, other.old_book_id)) != 0) {
            return compareTo7;
        }
        int compareTo9 = Boolean.valueOf(isSetNew_book_id()).compareTo(Boolean.valueOf(other.isSetNew_book_id()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetNew_book_id() && (compareTo6 = TBaseHelper.compareTo(this.new_book_id, other.new_book_id)) != 0) {
            return compareTo6;
        }
        int compareTo10 = Boolean.valueOf(isSetMain_page_popup_title()).compareTo(Boolean.valueOf(other.isSetMain_page_popup_title()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetMain_page_popup_title() && (compareTo5 = TBaseHelper.compareTo(this.main_page_popup_title, other.main_page_popup_title)) != 0) {
            return compareTo5;
        }
        int compareTo11 = Boolean.valueOf(isSetMain_page_popup_content()).compareTo(Boolean.valueOf(other.isSetMain_page_popup_content()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetMain_page_popup_content() && (compareTo4 = TBaseHelper.compareTo(this.main_page_popup_content, other.main_page_popup_content)) != 0) {
            return compareTo4;
        }
        int compareTo12 = Boolean.valueOf(isSetMain_page_popup_ok_text()).compareTo(Boolean.valueOf(other.isSetMain_page_popup_ok_text()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (isSetMain_page_popup_ok_text() && (compareTo3 = TBaseHelper.compareTo(this.main_page_popup_ok_text, other.main_page_popup_ok_text)) != 0) {
            return compareTo3;
        }
        int compareTo13 = Boolean.valueOf(isSetMain_page_popup_cancel_text()).compareTo(Boolean.valueOf(other.isSetMain_page_popup_cancel_text()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (isSetMain_page_popup_cancel_text() && (compareTo2 = TBaseHelper.compareTo(this.main_page_popup_cancel_text, other.main_page_popup_cancel_text)) != 0) {
            return compareTo2;
        }
        int compareTo14 = Boolean.valueOf(isSetForce_update()).compareTo(Boolean.valueOf(other.isSetForce_update()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (!isSetForce_update() || (compareTo = TBaseHelper.compareTo(this.force_update, other.force_update)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<BookReplaceInfo, _Fields> deepCopy2() {
        return new BookReplaceInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[field.ordinal()]) {
            case 1:
                return Integer.valueOf(getOld_book_id());
            case 2:
                return Integer.valueOf(getNew_book_id());
            case 3:
                return getMain_page_popup_title();
            case 4:
                return getMain_page_popup_content();
            case 5:
                return getMain_page_popup_ok_text();
            case 6:
                return getMain_page_popup_cancel_text();
            case 7:
                return Boolean.valueOf(isForce_update());
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetOld_book_id();
            case 2:
                return isSetNew_book_id();
            case 3:
                return isSetMain_page_popup_title();
            case 4:
                return isSetMain_page_popup_content();
            case 5:
                return isSetMain_page_popup_ok_text();
            case 6:
                return isSetMain_page_popup_cancel_text();
            case 7:
                return isSetForce_update();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$user_study_api$BookReplaceInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setOld_book_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetOld_book_id();
                    break;
                }
            case 2:
                if (value != null) {
                    setNew_book_id(((Integer) value).intValue());
                    break;
                } else {
                    unsetNew_book_id();
                    break;
                }
            case 3:
                if (value != null) {
                    setMain_page_popup_title((String) value);
                    break;
                } else {
                    unsetMain_page_popup_title();
                    break;
                }
            case 4:
                if (value != null) {
                    setMain_page_popup_content((String) value);
                    break;
                } else {
                    unsetMain_page_popup_content();
                    break;
                }
            case 5:
                if (value != null) {
                    setMain_page_popup_ok_text((String) value);
                    break;
                } else {
                    unsetMain_page_popup_ok_text();
                    break;
                }
            case 6:
                if (value != null) {
                    setMain_page_popup_cancel_text((String) value);
                    break;
                } else {
                    unsetMain_page_popup_cancel_text();
                    break;
                }
            case 7:
                if (value != null) {
                    setForce_update(((Boolean) value).booleanValue());
                    break;
                } else {
                    unsetForce_update();
                    break;
                }
        }
    }

    public BookReplaceInfo(int old_book_id, int new_book_id, String main_page_popup_title, String main_page_popup_content, String main_page_popup_ok_text, String main_page_popup_cancel_text, boolean force_update) {
        this();
        this.old_book_id = old_book_id;
        setOld_book_idIsSet(true);
        this.new_book_id = new_book_id;
        setNew_book_idIsSet(true);
        this.main_page_popup_title = main_page_popup_title;
        this.main_page_popup_content = main_page_popup_content;
        this.main_page_popup_ok_text = main_page_popup_ok_text;
        this.main_page_popup_cancel_text = main_page_popup_cancel_text;
        this.force_update = force_update;
        setForce_updateIsSet(true);
    }

    public boolean equals(BookReplaceInfo that) {
        if (that == null || this.old_book_id != that.old_book_id || this.new_book_id != that.new_book_id) {
            return false;
        }
        boolean isSetMain_page_popup_title = isSetMain_page_popup_title();
        boolean isSetMain_page_popup_title2 = that.isSetMain_page_popup_title();
        if ((isSetMain_page_popup_title || isSetMain_page_popup_title2) && !(isSetMain_page_popup_title && isSetMain_page_popup_title2 && this.main_page_popup_title.equals(that.main_page_popup_title))) {
            return false;
        }
        boolean isSetMain_page_popup_content = isSetMain_page_popup_content();
        boolean isSetMain_page_popup_content2 = that.isSetMain_page_popup_content();
        if ((isSetMain_page_popup_content || isSetMain_page_popup_content2) && !(isSetMain_page_popup_content && isSetMain_page_popup_content2 && this.main_page_popup_content.equals(that.main_page_popup_content))) {
            return false;
        }
        boolean isSetMain_page_popup_ok_text = isSetMain_page_popup_ok_text();
        boolean isSetMain_page_popup_ok_text2 = that.isSetMain_page_popup_ok_text();
        if ((isSetMain_page_popup_ok_text || isSetMain_page_popup_ok_text2) && !(isSetMain_page_popup_ok_text && isSetMain_page_popup_ok_text2 && this.main_page_popup_ok_text.equals(that.main_page_popup_ok_text))) {
            return false;
        }
        boolean isSetMain_page_popup_cancel_text = isSetMain_page_popup_cancel_text();
        boolean isSetMain_page_popup_cancel_text2 = that.isSetMain_page_popup_cancel_text();
        return (!(isSetMain_page_popup_cancel_text || isSetMain_page_popup_cancel_text2) || (isSetMain_page_popup_cancel_text && isSetMain_page_popup_cancel_text2 && this.main_page_popup_cancel_text.equals(that.main_page_popup_cancel_text))) && this.force_update == that.force_update;
    }

    public BookReplaceInfo(BookReplaceInfo other) {
        this.__isset_bitfield = (byte) 0;
        this.__isset_bitfield = other.__isset_bitfield;
        this.old_book_id = other.old_book_id;
        this.new_book_id = other.new_book_id;
        if (other.isSetMain_page_popup_title()) {
            this.main_page_popup_title = other.main_page_popup_title;
        }
        if (other.isSetMain_page_popup_content()) {
            this.main_page_popup_content = other.main_page_popup_content;
        }
        if (other.isSetMain_page_popup_ok_text()) {
            this.main_page_popup_ok_text = other.main_page_popup_ok_text;
        }
        if (other.isSetMain_page_popup_cancel_text()) {
            this.main_page_popup_cancel_text = other.main_page_popup_cancel_text;
        }
        this.force_update = other.force_update;
    }
}
