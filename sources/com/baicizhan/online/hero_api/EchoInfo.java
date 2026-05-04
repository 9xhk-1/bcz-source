package com.baicizhan.online.hero_api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
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
public class EchoInfo implements TBase<EchoInfo, _Fields>, Serializable, Cloneable, Comparable<EchoInfo> {
    public static final Map<_Fields, FieldMetaData> metaDataMap;
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes;
    public LiveInfo live_info;
    private _Fields[] optionals;
    public ScoreInfo score_info;
    public SystemInfo sys_info;
    public TopicInfo topic_info;
    public UserInfo user_info;
    public VideoInfo video_info;
    private static final TStruct STRUCT_DESC = new TStruct("EchoInfo");
    private static final TField SYS_INFO_FIELD_DESC = new TField("sys_info", (byte) 12, 1);
    private static final TField USER_INFO_FIELD_DESC = new TField(i9.m.f60424b, (byte) 12, 2);
    private static final TField TOPIC_INFO_FIELD_DESC = new TField("topic_info", (byte) 12, 3);
    private static final TField SCORE_INFO_FIELD_DESC = new TField("score_info", (byte) 12, 4);
    private static final TField VIDEO_INFO_FIELD_DESC = new TField("video_info", (byte) 12, 5);
    private static final TField LIVE_INFO_FIELD_DESC = new TField("live_info", (byte) 12, 6);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.online.hero_api.EchoInfo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields;

        static {
            int[] iArr = new int[_Fields.values().length];
            $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields = iArr;
            try {
                iArr[_Fields.SYS_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[_Fields.USER_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[_Fields.TOPIC_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[_Fields.SCORE_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[_Fields.VIDEO_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[_Fields.LIVE_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EchoInfoStandardScheme extends StandardScheme<EchoInfo> {
        private EchoInfoStandardScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol iprot, EchoInfo struct) throws TException {
            iprot.readStructBegin();
            while (true) {
                TField readFieldBegin = iprot.readFieldBegin();
                byte b11 = readFieldBegin.type;
                if (b11 == 0) {
                    iprot.readStructEnd();
                    struct.validate();
                    return;
                }
                switch (readFieldBegin.f77768id) {
                    case 1:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            SystemInfo systemInfo = new SystemInfo();
                            struct.sys_info = systemInfo;
                            systemInfo.read(iprot);
                            struct.setSys_infoIsSet(true);
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            UserInfo userInfo = new UserInfo();
                            struct.user_info = userInfo;
                            userInfo.read(iprot);
                            struct.setUser_infoIsSet(true);
                            break;
                        }
                    case 3:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            TopicInfo topicInfo = new TopicInfo();
                            struct.topic_info = topicInfo;
                            topicInfo.read(iprot);
                            struct.setTopic_infoIsSet(true);
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            ScoreInfo scoreInfo = new ScoreInfo();
                            struct.score_info = scoreInfo;
                            scoreInfo.read(iprot);
                            struct.setScore_infoIsSet(true);
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            VideoInfo videoInfo = new VideoInfo();
                            struct.video_info = videoInfo;
                            videoInfo.read(iprot);
                            struct.setVideo_infoIsSet(true);
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            TProtocolUtil.skip(iprot, b11);
                            break;
                        } else {
                            LiveInfo liveInfo = new LiveInfo();
                            struct.live_info = liveInfo;
                            liveInfo.read(iprot);
                            struct.setLive_infoIsSet(true);
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
        public void write(TProtocol oprot, EchoInfo struct) throws TException {
            struct.validate();
            oprot.writeStructBegin(EchoInfo.STRUCT_DESC);
            if (struct.sys_info != null) {
                oprot.writeFieldBegin(EchoInfo.SYS_INFO_FIELD_DESC);
                struct.sys_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.user_info != null) {
                oprot.writeFieldBegin(EchoInfo.USER_INFO_FIELD_DESC);
                struct.user_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.topic_info != null && struct.isSetTopic_info()) {
                oprot.writeFieldBegin(EchoInfo.TOPIC_INFO_FIELD_DESC);
                struct.topic_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.score_info != null && struct.isSetScore_info()) {
                oprot.writeFieldBegin(EchoInfo.SCORE_INFO_FIELD_DESC);
                struct.score_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.video_info != null && struct.isSetVideo_info()) {
                oprot.writeFieldBegin(EchoInfo.VIDEO_INFO_FIELD_DESC);
                struct.video_info.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.live_info != null && struct.isSetLive_info()) {
                oprot.writeFieldBegin(EchoInfo.LIVE_INFO_FIELD_DESC);
                struct.live_info.write(oprot);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EchoInfoStandardSchemeFactory implements SchemeFactory {
        private EchoInfoStandardSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EchoInfoStandardScheme getScheme() {
            return new EchoInfoStandardScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EchoInfoTupleScheme extends TupleScheme<EchoInfo> {
        private EchoInfoTupleScheme() {
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void read(TProtocol prot, EchoInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            SystemInfo systemInfo = new SystemInfo();
            struct.sys_info = systemInfo;
            systemInfo.read(tTupleProtocol);
            struct.setSys_infoIsSet(true);
            UserInfo userInfo = new UserInfo();
            struct.user_info = userInfo;
            userInfo.read(tTupleProtocol);
            struct.setUser_infoIsSet(true);
            BitSet readBitSet = tTupleProtocol.readBitSet(4);
            if (readBitSet.get(0)) {
                TopicInfo topicInfo = new TopicInfo();
                struct.topic_info = topicInfo;
                topicInfo.read(tTupleProtocol);
                struct.setTopic_infoIsSet(true);
            }
            if (readBitSet.get(1)) {
                ScoreInfo scoreInfo = new ScoreInfo();
                struct.score_info = scoreInfo;
                scoreInfo.read(tTupleProtocol);
                struct.setScore_infoIsSet(true);
            }
            if (readBitSet.get(2)) {
                VideoInfo videoInfo = new VideoInfo();
                struct.video_info = videoInfo;
                videoInfo.read(tTupleProtocol);
                struct.setVideo_infoIsSet(true);
            }
            if (readBitSet.get(3)) {
                LiveInfo liveInfo = new LiveInfo();
                struct.live_info = liveInfo;
                liveInfo.read(tTupleProtocol);
                struct.setLive_infoIsSet(true);
            }
        }

        @Override // org.apache.thrift.scheme.IScheme
        public void write(TProtocol prot, EchoInfo struct) throws TException {
            TTupleProtocol tTupleProtocol = (TTupleProtocol) prot;
            struct.sys_info.write(tTupleProtocol);
            struct.user_info.write(tTupleProtocol);
            BitSet bitSet = new BitSet();
            if (struct.isSetTopic_info()) {
                bitSet.set(0);
            }
            if (struct.isSetScore_info()) {
                bitSet.set(1);
            }
            if (struct.isSetVideo_info()) {
                bitSet.set(2);
            }
            if (struct.isSetLive_info()) {
                bitSet.set(3);
            }
            tTupleProtocol.writeBitSet(bitSet, 4);
            if (struct.isSetTopic_info()) {
                struct.topic_info.write(tTupleProtocol);
            }
            if (struct.isSetScore_info()) {
                struct.score_info.write(tTupleProtocol);
            }
            if (struct.isSetVideo_info()) {
                struct.video_info.write(tTupleProtocol);
            }
            if (struct.isSetLive_info()) {
                struct.live_info.write(tTupleProtocol);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class EchoInfoTupleSchemeFactory implements SchemeFactory {
        private EchoInfoTupleSchemeFactory() {
        }

        @Override // org.apache.thrift.scheme.SchemeFactory
        public EchoInfoTupleScheme getScheme() {
            return new EchoInfoTupleScheme();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum _Fields implements TFieldIdEnum {
        SYS_INFO(1, "sys_info"),
        USER_INFO(2, i9.m.f60424b),
        TOPIC_INFO(3, "topic_info"),
        SCORE_INFO(4, "score_info"),
        VIDEO_INFO(5, "video_info"),
        LIVE_INFO(6, "live_info");

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
                    return SYS_INFO;
                case 2:
                    return USER_INFO;
                case 3:
                    return TOPIC_INFO;
                case 4:
                    return SCORE_INFO;
                case 5:
                    return VIDEO_INFO;
                case 6:
                    return LIVE_INFO;
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
        hashMap.put(StandardScheme.class, new EchoInfoStandardSchemeFactory());
        hashMap.put(TupleScheme.class, new EchoInfoTupleSchemeFactory());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put((EnumMap) _Fields.SYS_INFO, (_Fields) new FieldMetaData("sys_info", (byte) 1, new StructMetaData((byte) 12, SystemInfo.class)));
        enumMap.put((EnumMap) _Fields.USER_INFO, (_Fields) new FieldMetaData(i9.m.f60424b, (byte) 1, new StructMetaData((byte) 12, UserInfo.class)));
        enumMap.put((EnumMap) _Fields.TOPIC_INFO, (_Fields) new FieldMetaData("topic_info", (byte) 2, new StructMetaData((byte) 12, TopicInfo.class)));
        enumMap.put((EnumMap) _Fields.SCORE_INFO, (_Fields) new FieldMetaData("score_info", (byte) 2, new StructMetaData((byte) 12, ScoreInfo.class)));
        enumMap.put((EnumMap) _Fields.VIDEO_INFO, (_Fields) new FieldMetaData("video_info", (byte) 2, new StructMetaData((byte) 12, VideoInfo.class)));
        enumMap.put((EnumMap) _Fields.LIVE_INFO, (_Fields) new FieldMetaData("live_info", (byte) 2, new StructMetaData((byte) 12, LiveInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        FieldMetaData.addStructMetaDataMap(EchoInfo.class, unmodifiableMap);
    }

    public EchoInfo() {
        this.optionals = new _Fields[]{_Fields.TOPIC_INFO, _Fields.SCORE_INFO, _Fields.VIDEO_INFO, _Fields.LIVE_INFO};
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
        this.sys_info = null;
        this.user_info = null;
        this.topic_info = null;
        this.score_info = null;
        this.video_info = null;
        this.live_info = null;
    }

    public boolean equals(Object that) {
        if (that != null && (that instanceof EchoInfo)) {
            return equals((EchoInfo) that);
        }
        return false;
    }

    public LiveInfo getLive_info() {
        return this.live_info;
    }

    public ScoreInfo getScore_info() {
        return this.score_info;
    }

    public SystemInfo getSys_info() {
        return this.sys_info;
    }

    public TopicInfo getTopic_info() {
        return this.topic_info;
    }

    public UserInfo getUser_info() {
        return this.user_info;
    }

    public VideoInfo getVideo_info() {
        return this.video_info;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isSetLive_info() {
        return this.live_info != null;
    }

    public boolean isSetScore_info() {
        return this.score_info != null;
    }

    public boolean isSetSys_info() {
        return this.sys_info != null;
    }

    public boolean isSetTopic_info() {
        return this.topic_info != null;
    }

    public boolean isSetUser_info() {
        return this.user_info != null;
    }

    public boolean isSetVideo_info() {
        return this.video_info != null;
    }

    @Override // org.apache.thrift.TBase
    public void read(TProtocol iprot) throws TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public EchoInfo setLive_info(LiveInfo live_info) {
        this.live_info = live_info;
        return this;
    }

    public void setLive_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.live_info = null;
    }

    public EchoInfo setScore_info(ScoreInfo score_info) {
        this.score_info = score_info;
        return this;
    }

    public void setScore_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.score_info = null;
    }

    public EchoInfo setSys_info(SystemInfo sys_info) {
        this.sys_info = sys_info;
        return this;
    }

    public void setSys_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.sys_info = null;
    }

    public EchoInfo setTopic_info(TopicInfo topic_info) {
        this.topic_info = topic_info;
        return this;
    }

    public void setTopic_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.topic_info = null;
    }

    public EchoInfo setUser_info(UserInfo user_info) {
        this.user_info = user_info;
        return this;
    }

    public void setUser_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.user_info = null;
    }

    public EchoInfo setVideo_info(VideoInfo video_info) {
        this.video_info = video_info;
        return this;
    }

    public void setVideo_infoIsSet(boolean value) {
        if (value) {
            return;
        }
        this.video_info = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EchoInfo(");
        sb2.append("sys_info:");
        SystemInfo systemInfo = this.sys_info;
        if (systemInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(systemInfo);
        }
        sb2.append(j2.O);
        sb2.append("user_info:");
        UserInfo userInfo = this.user_info;
        if (userInfo == null) {
            sb2.append("null");
        } else {
            sb2.append(userInfo);
        }
        if (isSetTopic_info()) {
            sb2.append(j2.O);
            sb2.append("topic_info:");
            TopicInfo topicInfo = this.topic_info;
            if (topicInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(topicInfo);
            }
        }
        if (isSetScore_info()) {
            sb2.append(j2.O);
            sb2.append("score_info:");
            ScoreInfo scoreInfo = this.score_info;
            if (scoreInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(scoreInfo);
            }
        }
        if (isSetVideo_info()) {
            sb2.append(j2.O);
            sb2.append("video_info:");
            VideoInfo videoInfo = this.video_info;
            if (videoInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(videoInfo);
            }
        }
        if (isSetLive_info()) {
            sb2.append(j2.O);
            sb2.append("live_info:");
            LiveInfo liveInfo = this.live_info;
            if (liveInfo == null) {
                sb2.append("null");
            } else {
                sb2.append(liveInfo);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public void unsetLive_info() {
        this.live_info = null;
    }

    public void unsetScore_info() {
        this.score_info = null;
    }

    public void unsetSys_info() {
        this.sys_info = null;
    }

    public void unsetTopic_info() {
        this.topic_info = null;
    }

    public void unsetUser_info() {
        this.user_info = null;
    }

    public void unsetVideo_info() {
        this.video_info = null;
    }

    public void validate() throws TException {
        SystemInfo systemInfo = this.sys_info;
        if (systemInfo == null) {
            throw new TProtocolException("Required field 'sys_info' was not present! Struct: " + toString());
        }
        if (this.user_info == null) {
            throw new TProtocolException("Required field 'user_info' was not present! Struct: " + toString());
        }
        if (systemInfo != null) {
            systemInfo.validate();
        }
        UserInfo userInfo = this.user_info;
        if (userInfo != null) {
            userInfo.validate();
        }
        TopicInfo topicInfo = this.topic_info;
        if (topicInfo != null) {
            topicInfo.validate();
        }
        ScoreInfo scoreInfo = this.score_info;
        if (scoreInfo != null) {
            scoreInfo.validate();
        }
        VideoInfo videoInfo = this.video_info;
        if (videoInfo != null) {
            videoInfo.validate();
        }
        LiveInfo liveInfo = this.live_info;
        if (liveInfo != null) {
            liveInfo.validate();
        }
    }

    @Override // org.apache.thrift.TBase
    public void write(TProtocol oprot) throws TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override // java.lang.Comparable
    public int compareTo(EchoInfo other) {
        int compareTo;
        int compareTo2;
        int compareTo3;
        int compareTo4;
        int compareTo5;
        int compareTo6;
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int compareTo7 = Boolean.valueOf(isSetSys_info()).compareTo(Boolean.valueOf(other.isSetSys_info()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (isSetSys_info() && (compareTo6 = TBaseHelper.compareTo((Comparable) this.sys_info, (Comparable) other.sys_info)) != 0) {
            return compareTo6;
        }
        int compareTo8 = Boolean.valueOf(isSetUser_info()).compareTo(Boolean.valueOf(other.isSetUser_info()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (isSetUser_info() && (compareTo5 = TBaseHelper.compareTo((Comparable) this.user_info, (Comparable) other.user_info)) != 0) {
            return compareTo5;
        }
        int compareTo9 = Boolean.valueOf(isSetTopic_info()).compareTo(Boolean.valueOf(other.isSetTopic_info()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (isSetTopic_info() && (compareTo4 = TBaseHelper.compareTo((Comparable) this.topic_info, (Comparable) other.topic_info)) != 0) {
            return compareTo4;
        }
        int compareTo10 = Boolean.valueOf(isSetScore_info()).compareTo(Boolean.valueOf(other.isSetScore_info()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (isSetScore_info() && (compareTo3 = TBaseHelper.compareTo((Comparable) this.score_info, (Comparable) other.score_info)) != 0) {
            return compareTo3;
        }
        int compareTo11 = Boolean.valueOf(isSetVideo_info()).compareTo(Boolean.valueOf(other.isSetVideo_info()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (isSetVideo_info() && (compareTo2 = TBaseHelper.compareTo((Comparable) this.video_info, (Comparable) other.video_info)) != 0) {
            return compareTo2;
        }
        int compareTo12 = Boolean.valueOf(isSetLive_info()).compareTo(Boolean.valueOf(other.isSetLive_info()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (!isSetLive_info() || (compareTo = TBaseHelper.compareTo((Comparable) this.live_info, (Comparable) other.live_info)) == 0) {
            return 0;
        }
        return compareTo;
    }

    @Override // org.apache.thrift.TBase
    /* renamed from: deepCopy */
    public TBase<EchoInfo, _Fields> deepCopy2() {
        return new EchoInfo(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.thrift.TBase
    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    @Override // org.apache.thrift.TBase
    public Object getFieldValue(_Fields field) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[field.ordinal()]) {
            case 1:
                return getSys_info();
            case 2:
                return getUser_info();
            case 3:
                return getTopic_info();
            case 4:
                return getScore_info();
            case 5:
                return getVideo_info();
            case 6:
                return getLive_info();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[field.ordinal()]) {
            case 1:
                return isSetSys_info();
            case 2:
                return isSetUser_info();
            case 3:
                return isSetTopic_info();
            case 4:
                return isSetScore_info();
            case 5:
                return isSetVideo_info();
            case 6:
                return isSetLive_info();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // org.apache.thrift.TBase
    public void setFieldValue(_Fields field, Object value) {
        switch (AnonymousClass1.$SwitchMap$com$baicizhan$online$hero_api$EchoInfo$_Fields[field.ordinal()]) {
            case 1:
                if (value != null) {
                    setSys_info((SystemInfo) value);
                    break;
                } else {
                    unsetSys_info();
                    break;
                }
            case 2:
                if (value != null) {
                    setUser_info((UserInfo) value);
                    break;
                } else {
                    unsetUser_info();
                    break;
                }
            case 3:
                if (value != null) {
                    setTopic_info((TopicInfo) value);
                    break;
                } else {
                    unsetTopic_info();
                    break;
                }
            case 4:
                if (value != null) {
                    setScore_info((ScoreInfo) value);
                    break;
                } else {
                    unsetScore_info();
                    break;
                }
            case 5:
                if (value != null) {
                    setVideo_info((VideoInfo) value);
                    break;
                } else {
                    unsetVideo_info();
                    break;
                }
            case 6:
                if (value != null) {
                    setLive_info((LiveInfo) value);
                    break;
                } else {
                    unsetLive_info();
                    break;
                }
        }
    }

    public EchoInfo(SystemInfo sys_info, UserInfo user_info) {
        this();
        this.sys_info = sys_info;
        this.user_info = user_info;
    }

    public boolean equals(EchoInfo that) {
        if (that == null) {
            return false;
        }
        boolean isSetSys_info = isSetSys_info();
        boolean isSetSys_info2 = that.isSetSys_info();
        if ((isSetSys_info || isSetSys_info2) && !(isSetSys_info && isSetSys_info2 && this.sys_info.equals(that.sys_info))) {
            return false;
        }
        boolean isSetUser_info = isSetUser_info();
        boolean isSetUser_info2 = that.isSetUser_info();
        if ((isSetUser_info || isSetUser_info2) && !(isSetUser_info && isSetUser_info2 && this.user_info.equals(that.user_info))) {
            return false;
        }
        boolean isSetTopic_info = isSetTopic_info();
        boolean isSetTopic_info2 = that.isSetTopic_info();
        if ((isSetTopic_info || isSetTopic_info2) && !(isSetTopic_info && isSetTopic_info2 && this.topic_info.equals(that.topic_info))) {
            return false;
        }
        boolean isSetScore_info = isSetScore_info();
        boolean isSetScore_info2 = that.isSetScore_info();
        if ((isSetScore_info || isSetScore_info2) && !(isSetScore_info && isSetScore_info2 && this.score_info.equals(that.score_info))) {
            return false;
        }
        boolean isSetVideo_info = isSetVideo_info();
        boolean isSetVideo_info2 = that.isSetVideo_info();
        if ((isSetVideo_info || isSetVideo_info2) && !(isSetVideo_info && isSetVideo_info2 && this.video_info.equals(that.video_info))) {
            return false;
        }
        boolean isSetLive_info = isSetLive_info();
        boolean isSetLive_info2 = that.isSetLive_info();
        if (isSetLive_info || isSetLive_info2) {
            return isSetLive_info && isSetLive_info2 && this.live_info.equals(that.live_info);
        }
        return true;
    }

    public EchoInfo(EchoInfo other) {
        this.optionals = new _Fields[]{_Fields.TOPIC_INFO, _Fields.SCORE_INFO, _Fields.VIDEO_INFO, _Fields.LIVE_INFO};
        if (other.isSetSys_info()) {
            this.sys_info = new SystemInfo(other.sys_info);
        }
        if (other.isSetUser_info()) {
            this.user_info = new UserInfo(other.user_info);
        }
        if (other.isSetTopic_info()) {
            this.topic_info = new TopicInfo(other.topic_info);
        }
        if (other.isSetScore_info()) {
            this.score_info = new ScoreInfo(other.score_info);
        }
        if (other.isSetVideo_info()) {
            this.video_info = new VideoInfo(other.video_info);
        }
        if (other.isSetLive_info()) {
            this.live_info = new LiveInfo(other.live_info);
        }
    }
}
