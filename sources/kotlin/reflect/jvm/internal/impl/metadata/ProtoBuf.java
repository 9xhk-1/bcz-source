package kotlin.reflect.jvm.internal.impl.metadata;

import com.jiongji.andriod.card.R;
import i20.c;
import i20.g;
import i20.i;
import i20.j;
import i20.k;
import i20.l;
import i20.m;
import i20.n;
import i20.o;
import i20.r;
import i20.s;
import i20.t;
import i20.u;
import i20.v;
import i20.w;
import i20.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import kotlin.reflect.jvm.internal.impl.protobuf.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ProtoBuf {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Annotation extends GeneratedMessageLite implements c {
        public static p<Annotation> PARSER = new a();
        private static final Annotation defaultInstance;
        private List<Argument> argument_;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Argument extends GeneratedMessageLite implements i20.b {
            public static p<Argument> PARSER = new a();
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int nameId_;
            private final d unknownFields;
            private Value value_;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class Value extends GeneratedMessageLite implements i20.a {
                public static p<Value> PARSER = new a();
                private static final Value defaultInstance;
                private Annotation annotation_;
                private int arrayDimensionCount_;
                private List<Value> arrayElement_;
                private int bitField0_;
                private int classId_;
                private double doubleValue_;
                private int enumValueId_;
                private int flags_;
                private float floatValue_;
                private long intValue_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                private int stringValue_;
                private Type type_;
                private final d unknownFields;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public enum Type implements h.a {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);

                    private static h.b<Type> internalValueMap = new a();
                    private final int value;

                    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                    public static class a implements h.b<Type> {
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public Type findValueByNumber(int i11) {
                            return Type.valueOf(i11);
                        }
                    }

                    Type(int i11, int i12) {
                        this.value = i12;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i11) {
                        switch (i11) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public Value d(e eVar, f fVar) throws InvalidProtocolBufferException {
                        return new Value(eVar, fVar);
                    }
                }

                static {
                    Value value = new Value(true);
                    defaultInstance = value;
                    value.initFields();
                }

                public static Value getDefaultInstance() {
                    return defaultInstance;
                }

                private void initFields() {
                    this.type_ = Type.BYTE;
                    this.intValue_ = 0L;
                    this.floatValue_ = 0.0f;
                    this.doubleValue_ = 0.0d;
                    this.stringValue_ = 0;
                    this.classId_ = 0;
                    this.enumValueId_ = 0;
                    this.annotation_ = Annotation.getDefaultInstance();
                    this.arrayElement_ = Collections.EMPTY_LIST;
                    this.arrayDimensionCount_ = 0;
                    this.flags_ = 0;
                }

                public static b newBuilder() {
                    return b.n();
                }

                public Annotation getAnnotation() {
                    return this.annotation_;
                }

                public int getArrayDimensionCount() {
                    return this.arrayDimensionCount_;
                }

                public Value getArrayElement(int i11) {
                    return this.arrayElement_.get(i11);
                }

                public int getArrayElementCount() {
                    return this.arrayElement_.size();
                }

                public List<Value> getArrayElementList() {
                    return this.arrayElement_;
                }

                public int getClassId() {
                    return this.classId_;
                }

                public double getDoubleValue() {
                    return this.doubleValue_;
                }

                public int getEnumValueId() {
                    return this.enumValueId_;
                }

                public int getFlags() {
                    return this.flags_;
                }

                public float getFloatValue() {
                    return this.floatValue_;
                }

                public long getIntValue() {
                    return this.intValue_;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
                public p<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                public int getSerializedSize() {
                    int i11 = this.memoizedSerializedSize;
                    if (i11 != -1) {
                        return i11;
                    }
                    int h11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.h(1, this.type_.getNumber()) : 0;
                    if ((this.bitField0_ & 2) == 2) {
                        h11 += CodedOutputStream.A(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        h11 += CodedOutputStream.l(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        h11 += CodedOutputStream.f(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        h11 += CodedOutputStream.o(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        h11 += CodedOutputStream.o(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        h11 += CodedOutputStream.o(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        h11 += CodedOutputStream.s(8, this.annotation_);
                    }
                    for (int i12 = 0; i12 < this.arrayElement_.size(); i12++) {
                        h11 += CodedOutputStream.s(9, this.arrayElement_.get(i12));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        h11 += CodedOutputStream.o(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        h11 += CodedOutputStream.o(11, this.arrayDimensionCount_);
                    }
                    int size = h11 + this.unknownFields.size();
                    this.memoizedSerializedSize = size;
                    return size;
                }

                public int getStringValue() {
                    return this.stringValue_;
                }

                public Type getType() {
                    return this.type_;
                }

                public boolean hasAnnotation() {
                    return (this.bitField0_ & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.bitField0_ & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.bitField0_ & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.bitField0_ & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.bitField0_ & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.bitField0_ & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.bitField0_ & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.bitField0_ & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.bitField0_ & 16) == 16;
                }

                public boolean hasType() {
                    return (this.bitField0_ & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean isInitialized() {
                    byte b11 = this.memoizedIsInitialized;
                    if (b11 == 1) {
                        return true;
                    }
                    if (b11 == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                    for (int i11 = 0; i11 < getArrayElementCount(); i11++) {
                        if (!getArrayElement(i11).isInitialized()) {
                            this.memoizedIsInitialized = (byte) 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.bitField0_ & 1) == 1) {
                        codedOutputStream.S(1, this.type_.getNumber());
                    }
                    if ((this.bitField0_ & 2) == 2) {
                        codedOutputStream.t0(2, this.intValue_);
                    }
                    if ((this.bitField0_ & 4) == 4) {
                        codedOutputStream.W(3, this.floatValue_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.Q(4, this.doubleValue_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.a0(5, this.stringValue_);
                    }
                    if ((this.bitField0_ & 32) == 32) {
                        codedOutputStream.a0(6, this.classId_);
                    }
                    if ((this.bitField0_ & 64) == 64) {
                        codedOutputStream.a0(7, this.enumValueId_);
                    }
                    if ((this.bitField0_ & 128) == 128) {
                        codedOutputStream.d0(8, this.annotation_);
                    }
                    for (int i11 = 0; i11 < this.arrayElement_.size(); i11++) {
                        codedOutputStream.d0(9, this.arrayElement_.get(i11));
                    }
                    if ((this.bitField0_ & 512) == 512) {
                        codedOutputStream.a0(10, this.flags_);
                    }
                    if ((this.bitField0_ & 256) == 256) {
                        codedOutputStream.a0(11, this.arrayDimensionCount_);
                    }
                    codedOutputStream.i0(this.unknownFields);
                }

                public static b newBuilder(Value value) {
                    return newBuilder().g(value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public Value getDefaultInstanceForType() {
                    return defaultInstance;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                public b newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
                public b toBuilder() {
                    return newBuilder(this);
                }

                private Value(GeneratedMessageLite.b bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = bVar.f();
                }

                private Value(boolean z11) {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    this.unknownFields = d.f67542a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private Value(e eVar, f fVar) throws InvalidProtocolBufferException {
                    this.memoizedIsInitialized = (byte) -1;
                    this.memoizedSerializedSize = -1;
                    initFields();
                    d.b q11 = d.q();
                    CodedOutputStream J = CodedOutputStream.J(q11, 1);
                    boolean z11 = false;
                    char c11 = 0;
                    while (true) {
                        ?? r52 = 256;
                        if (!z11) {
                            try {
                                try {
                                    int K = eVar.K();
                                    switch (K) {
                                        case 0:
                                            z11 = true;
                                        case 8:
                                            int n11 = eVar.n();
                                            Type valueOf = Type.valueOf(n11);
                                            if (valueOf == null) {
                                                J.o0(K);
                                                J.o0(n11);
                                            } else {
                                                this.bitField0_ |= 1;
                                                this.type_ = valueOf;
                                            }
                                        case 16:
                                            this.bitField0_ |= 2;
                                            this.intValue_ = eVar.H();
                                        case 29:
                                            this.bitField0_ |= 4;
                                            this.floatValue_ = eVar.q();
                                        case 33:
                                            this.bitField0_ |= 8;
                                            this.doubleValue_ = eVar.m();
                                        case 40:
                                            this.bitField0_ |= 16;
                                            this.stringValue_ = eVar.s();
                                        case 48:
                                            this.bitField0_ |= 32;
                                            this.classId_ = eVar.s();
                                        case 56:
                                            this.bitField0_ |= 64;
                                            this.enumValueId_ = eVar.s();
                                        case 66:
                                            b builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                            Annotation annotation = (Annotation) eVar.u(Annotation.PARSER, fVar);
                                            this.annotation_ = annotation;
                                            if (builder != null) {
                                                builder.g(annotation);
                                                this.annotation_ = builder.l();
                                            }
                                            this.bitField0_ |= 128;
                                        case 74:
                                            if ((c11 & 256) != 256) {
                                                this.arrayElement_ = new ArrayList();
                                                c11 = 256;
                                            }
                                            this.arrayElement_.add(eVar.u(PARSER, fVar));
                                        case 80:
                                            this.bitField0_ |= 512;
                                            this.flags_ = eVar.s();
                                        case 88:
                                            this.bitField0_ |= 256;
                                            this.arrayDimensionCount_ = eVar.s();
                                        default:
                                            r52 = parseUnknownField(eVar, J, fVar, K);
                                            if (r52 == 0) {
                                                z11 = true;
                                            }
                                    }
                                } catch (Throwable th2) {
                                    if ((c11 & 256) == r52) {
                                        this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                                    }
                                    try {
                                        J.I();
                                    } catch (IOException unused) {
                                    } catch (Throwable th3) {
                                        this.unknownFields = q11.j();
                                        throw th3;
                                    }
                                    this.unknownFields = q11.j();
                                    makeExtensionsImmutable();
                                    throw th2;
                                }
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            } catch (IOException e12) {
                                throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                            }
                        } else {
                            if ((c11 & 256) == 256) {
                                this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                            }
                            try {
                                J.I();
                            } catch (IOException unused2) {
                            } catch (Throwable th4) {
                                this.unknownFields = q11.j();
                                throw th4;
                            }
                            this.unknownFields = q11.j();
                            makeExtensionsImmutable();
                            return;
                        }
                    }
                }

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static final class b extends GeneratedMessageLite.b<Value, b> implements i20.a {

                    /* renamed from: b, reason: collision with root package name */
                    public int f67305b;

                    /* renamed from: d, reason: collision with root package name */
                    public long f67307d;

                    /* renamed from: e, reason: collision with root package name */
                    public float f67308e;

                    /* renamed from: f, reason: collision with root package name */
                    public double f67309f;

                    /* renamed from: g, reason: collision with root package name */
                    public int f67310g;

                    /* renamed from: h, reason: collision with root package name */
                    public int f67311h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f67312i;

                    /* renamed from: l, reason: collision with root package name */
                    public int f67315l;

                    /* renamed from: m, reason: collision with root package name */
                    public int f67316m;

                    /* renamed from: c, reason: collision with root package name */
                    public Type f67306c = Type.BYTE;

                    /* renamed from: j, reason: collision with root package name */
                    public Annotation f67313j = Annotation.getDefaultInstance();

                    /* renamed from: k, reason: collision with root package name */
                    public List<Value> f67314k = Collections.EMPTY_LIST;

                    public b() {
                        v();
                    }

                    public static b n() {
                        return new b();
                    }

                    public b A(int i11) {
                        this.f67305b |= 32;
                        this.f67311h = i11;
                        return this;
                    }

                    public b B(double d11) {
                        this.f67305b |= 8;
                        this.f67309f = d11;
                        return this;
                    }

                    public b E(int i11) {
                        this.f67305b |= 64;
                        this.f67312i = i11;
                        return this;
                    }

                    public b F(int i11) {
                        this.f67305b |= 1024;
                        this.f67316m = i11;
                        return this;
                    }

                    public b G(float f11) {
                        this.f67305b |= 4;
                        this.f67308e = f11;
                        return this;
                    }

                    public b J(long j11) {
                        this.f67305b |= 2;
                        this.f67307d = j11;
                        return this;
                    }

                    public b K(int i11) {
                        this.f67305b |= 16;
                        this.f67310g = i11;
                        return this;
                    }

                    public b M(Type type) {
                        type.getClass();
                        this.f67305b |= 1;
                        this.f67306c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                    public final boolean isInitialized() {
                        if (u() && !p().isInitialized()) {
                            return false;
                        }
                        for (int i11 = 0; i11 < s(); i11++) {
                            if (!q(i11).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public Value build() {
                        Value l11 = l();
                        if (l11.isInitialized()) {
                            return l11;
                        }
                        throw a.AbstractC0798a.c(l11);
                    }

                    public Value l() {
                        Value value = new Value(this);
                        int i11 = this.f67305b;
                        int i12 = (i11 & 1) != 1 ? 0 : 1;
                        value.type_ = this.f67306c;
                        if ((i11 & 2) == 2) {
                            i12 |= 2;
                        }
                        value.intValue_ = this.f67307d;
                        if ((i11 & 4) == 4) {
                            i12 |= 4;
                        }
                        value.floatValue_ = this.f67308e;
                        if ((i11 & 8) == 8) {
                            i12 |= 8;
                        }
                        value.doubleValue_ = this.f67309f;
                        if ((i11 & 16) == 16) {
                            i12 |= 16;
                        }
                        value.stringValue_ = this.f67310g;
                        if ((i11 & 32) == 32) {
                            i12 |= 32;
                        }
                        value.classId_ = this.f67311h;
                        if ((i11 & 64) == 64) {
                            i12 |= 64;
                        }
                        value.enumValueId_ = this.f67312i;
                        if ((i11 & 128) == 128) {
                            i12 |= 128;
                        }
                        value.annotation_ = this.f67313j;
                        if ((this.f67305b & 256) == 256) {
                            this.f67314k = Collections.unmodifiableList(this.f67314k);
                            this.f67305b &= -257;
                        }
                        value.arrayElement_ = this.f67314k;
                        if ((i11 & 512) == 512) {
                            i12 |= 256;
                        }
                        value.arrayDimensionCount_ = this.f67315l;
                        if ((i11 & 1024) == 1024) {
                            i12 |= 512;
                        }
                        value.flags_ = this.f67316m;
                        value.bitField0_ = i12;
                        return value;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public b l() {
                        return n().g(l());
                    }

                    public final void o() {
                        if ((this.f67305b & 256) != 256) {
                            this.f67314k = new ArrayList(this.f67314k);
                            this.f67305b |= 256;
                        }
                    }

                    public Annotation p() {
                        return this.f67313j;
                    }

                    public Value q(int i11) {
                        return this.f67314k.get(i11);
                    }

                    public int s() {
                        return this.f67314k.size();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                    /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    public boolean u() {
                        return (this.f67305b & 128) == 128;
                    }

                    public b w(Annotation annotation) {
                        if ((this.f67305b & 128) != 128 || this.f67313j == Annotation.getDefaultInstance()) {
                            this.f67313j = annotation;
                        } else {
                            this.f67313j = Annotation.newBuilder(this.f67313j).g(annotation).l();
                        }
                        this.f67305b |= 128;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public b g(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            M(value.getType());
                        }
                        if (value.hasIntValue()) {
                            J(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            G(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            B(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            K(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            A(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            E(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            w(value.getAnnotation());
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.f67314k.isEmpty()) {
                                this.f67314k = value.arrayElement_;
                                this.f67305b &= -257;
                            } else {
                                o();
                                this.f67314k.addAll(value.arrayElement_);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            z(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            F(value.getFlags());
                        }
                        h(f().b(value.unknownFields));
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
                    /* renamed from: y, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            if (r3 == 0) goto Le
                            r2.g(r3)
                        Le:
                            return r2
                        Lf:
                            r3 = move-exception
                            goto L1b
                        L11:
                            r3 = move-exception
                            kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> Lf
                            throw r3     // Catch: java.lang.Throwable -> L19
                        L19:
                            r3 = move-exception
                            r0 = r4
                        L1b:
                            if (r0 == 0) goto L20
                            r2.g(r0)
                        L20:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.b.b(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b");
                    }

                    public b z(int i11) {
                        this.f67305b |= 512;
                        this.f67315l = i11;
                        return this;
                    }

                    public final void v() {
                    }
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument d(e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new Argument(eVar, fVar);
                }
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.nameId_ = 0;
                this.value_ = Value.getDefaultInstance();
            }

            public static b newBuilder() {
                return b.n();
            }

            public int getNameId() {
                return this.nameId_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public p<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.nameId_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    o11 += CodedOutputStream.s(2, this.value_);
                }
                int size = o11 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public Value getValue() {
                return this.value_;
            }

            public boolean hasNameId() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                byte b11 = this.memoizedIsInitialized;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.a0(1, this.nameId_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.d0(2, this.value_);
                }
                codedOutputStream.i0(this.unknownFields);
            }

            public static b newBuilder(Argument argument) {
                return newBuilder().g(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public b newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public b toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.f();
            }

            private Argument(boolean z11) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = d.f67542a;
            }

            private Argument(e eVar, f fVar) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                d.b q11 = d.q();
                CodedOutputStream J = CodedOutputStream.J(q11, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.bitField0_ |= 1;
                                    this.nameId_ = eVar.s();
                                } else if (K != 18) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    Value.b builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                                    Value value = (Value) eVar.u(Value.PARSER, fVar);
                                    this.value_ = value;
                                    if (builder != null) {
                                        builder.g(value);
                                        this.value_ = builder.l();
                                    }
                                    this.bitField0_ |= 2;
                                }
                            }
                            z11 = true;
                        } catch (Throwable th2) {
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.unknownFields = q11.j();
                                throw th3;
                            }
                            this.unknownFields = q11.j();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.unknownFields = q11.j();
                    throw th4;
                }
                this.unknownFields = q11.j();
                makeExtensionsImmutable();
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class b extends GeneratedMessageLite.b<Argument, b> implements i20.b {

                /* renamed from: b, reason: collision with root package name */
                public int f67317b;

                /* renamed from: c, reason: collision with root package name */
                public int f67318c;

                /* renamed from: d, reason: collision with root package name */
                public Value f67319d = Value.getDefaultInstance();

                public b() {
                    t();
                }

                public static b n() {
                    return new b();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean isInitialized() {
                    return q() && s() && p().isInitialized();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument l11 = l();
                    if (l11.isInitialized()) {
                        return l11;
                    }
                    throw a.AbstractC0798a.c(l11);
                }

                public Argument l() {
                    Argument argument = new Argument(this);
                    int i11 = this.f67317b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    argument.nameId_ = this.f67318c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    argument.value_ = this.f67319d;
                    argument.bitField0_ = i12;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public b l() {
                    return n().g(l());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                public Value p() {
                    return this.f67319d;
                }

                public boolean q() {
                    return (this.f67317b & 1) == 1;
                }

                public boolean s() {
                    return (this.f67317b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public b g(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        x(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        w(argument.getValue());
                    }
                    h(f().b(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.g(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.g(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$b");
                }

                public b w(Value value) {
                    if ((this.f67317b & 2) != 2 || this.f67319d == Value.getDefaultInstance()) {
                        this.f67319d = value;
                    } else {
                        this.f67319d = Value.newBuilder(this.f67319d).g(value).l();
                    }
                    this.f67317b |= 2;
                    return this;
                }

                public b x(int i11) {
                    this.f67317b |= 1;
                    this.f67318c = i11;
                    return this;
                }

                private void t() {
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Annotation d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Annotation(eVar, fVar);
            }
        }

        static {
            Annotation annotation = new Annotation(true);
            defaultInstance = annotation;
            annotation.initFields();
        }

        public static Annotation getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.id_ = 0;
            this.argument_ = Collections.EMPTY_LIST;
        }

        public static b newBuilder() {
            return b.n();
        }

        public Argument getArgument(int i11) {
            return this.argument_.get(i11);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getId() {
            return this.id_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.id_) : 0;
            for (int i12 = 0; i12 < this.argument_.size(); i12++) {
                o11 += CodedOutputStream.s(2, this.argument_.get(i12));
            }
            int size = o11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                if (!getArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.id_);
            }
            for (int i11 = 0; i11 < this.argument_.size(); i11++) {
                codedOutputStream.d0(2, this.argument_.get(i11));
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Annotation annotation) {
            return newBuilder().g(annotation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Annotation getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Annotation(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private Annotation(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Annotation(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = eVar.s();
                            } else if (K != 18) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                if ((c11 & 2) != 2) {
                                    this.argument_ = new ArrayList();
                                    c11 = 2;
                                }
                                this.argument_.add(eVar.u(Argument.PARSER, fVar));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.argument_ = Collections.unmodifiableList(this.argument_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<Annotation, b> implements c {

            /* renamed from: b, reason: collision with root package name */
            public int f67320b;

            /* renamed from: c, reason: collision with root package name */
            public int f67321c;

            /* renamed from: d, reason: collision with root package name */
            public List<Argument> f67322d = Collections.EMPTY_LIST;

            public b() {
                u();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!t()) {
                    return false;
                }
                for (int i11 = 0; i11 < q(); i11++) {
                    if (!p(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Annotation build() {
                Annotation l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public Annotation l() {
                Annotation annotation = new Annotation(this);
                int i11 = (this.f67320b & 1) != 1 ? 0 : 1;
                annotation.id_ = this.f67321c;
                if ((this.f67320b & 2) == 2) {
                    this.f67322d = Collections.unmodifiableList(this.f67322d);
                    this.f67320b &= -3;
                }
                annotation.argument_ = this.f67322d;
                annotation.bitField0_ = i11;
                return annotation;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67320b & 2) != 2) {
                    this.f67322d = new ArrayList(this.f67322d);
                    this.f67320b |= 2;
                }
            }

            public Argument p(int i11) {
                return this.f67322d.get(i11);
            }

            public int q() {
                return this.f67322d.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            public boolean t() {
                return (this.f67320b & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public b g(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    x(annotation.getId());
                }
                if (!annotation.argument_.isEmpty()) {
                    if (this.f67322d.isEmpty()) {
                        this.f67322d = annotation.argument_;
                        this.f67320b &= -3;
                    } else {
                        o();
                        this.f67322d.addAll(annotation.argument_);
                    }
                }
                h(f().b(annotation.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b");
            }

            public b x(int i11) {
                this.f67320b |= 1;
                this.f67321c = i11;
                return this;
            }

            private void u() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements i20.d {
        public static p<Class> PARSER = new a();
        private static final Class defaultInstance;
        private int bitField0_;
        private int companionObjectName_;
        private List<Constructor> constructor_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private List<EnumEntry> enumEntry_;
        private int flags_;
        private int fqName_;
        private List<Function> function_;
        private int inlineClassUnderlyingPropertyName_;
        private int inlineClassUnderlyingTypeId_;
        private Type inlineClassUnderlyingType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int multiFieldValueClassUnderlyingNameMemoizedSerializedSize;
        private List<Integer> multiFieldValueClassUnderlyingName_;
        private int multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize;
        private List<Integer> multiFieldValueClassUnderlyingTypeId_;
        private List<Type> multiFieldValueClassUnderlyingType_;
        private int nestedClassNameMemoizedSerializedSize;
        private List<Integer> nestedClassName_;
        private List<Property> property_;
        private int sealedSubclassFqNameMemoizedSerializedSize;
        private List<Integer> sealedSubclassFqName_;
        private int supertypeIdMemoizedSerializedSize;
        private List<Integer> supertypeId_;
        private List<Type> supertype_;
        private List<TypeAlias> typeAlias_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final d unknownFields;
        private VersionRequirementTable versionRequirementTable_;
        private List<Integer> versionRequirement_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum Kind implements h.a {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);

            private static h.b<Kind> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<Kind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Kind findValueByNumber(int i11) {
                    return Kind.valueOf(i11);
                }
            }

            Kind(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i11) {
                switch (i11) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Class d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Class(eVar, fVar);
            }
        }

        static {
            Class r02 = new Class(true);
            defaultInstance = r02;
            r02.initFields();
        }

        public static Class getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            this.fqName_ = 0;
            this.companionObjectName_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.supertype_ = list;
            this.supertypeId_ = list;
            this.nestedClassName_ = list;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.constructor_ = list;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.enumEntry_ = list;
            this.sealedSubclassFqName_ = list;
            this.inlineClassUnderlyingPropertyName_ = 0;
            this.inlineClassUnderlyingType_ = Type.getDefaultInstance();
            this.inlineClassUnderlyingTypeId_ = 0;
            this.multiFieldValueClassUnderlyingName_ = list;
            this.multiFieldValueClassUnderlyingType_ = list;
            this.multiFieldValueClassUnderlyingTypeId_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        public static b newBuilder() {
            return b.u();
        }

        public static Class parseFrom(InputStream inputStream, f fVar) throws IOException {
            return PARSER.b(inputStream, fVar);
        }

        public int getCompanionObjectName() {
            return this.companionObjectName_;
        }

        public Constructor getConstructor(int i11) {
            return this.constructor_.get(i11);
        }

        public int getConstructorCount() {
            return this.constructor_.size();
        }

        public List<Constructor> getConstructorList() {
            return this.constructor_;
        }

        public Type getContextReceiverType(int i11) {
            return this.contextReceiverType_.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public EnumEntry getEnumEntry(int i11) {
            return this.enumEntry_.get(i11);
        }

        public int getEnumEntryCount() {
            return this.enumEntry_.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.enumEntry_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFqName() {
            return this.fqName_;
        }

        public Function getFunction(int i11) {
            return this.function_.get(i11);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.inlineClassUnderlyingPropertyName_;
        }

        public Type getInlineClassUnderlyingType() {
            return this.inlineClassUnderlyingType_;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.inlineClassUnderlyingTypeId_;
        }

        public int getMultiFieldValueClassUnderlyingNameCount() {
            return this.multiFieldValueClassUnderlyingName_.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
            return this.multiFieldValueClassUnderlyingName_;
        }

        public Type getMultiFieldValueClassUnderlyingType(int i11) {
            return this.multiFieldValueClassUnderlyingType_.get(i11);
        }

        public int getMultiFieldValueClassUnderlyingTypeCount() {
            return this.multiFieldValueClassUnderlyingType_.size();
        }

        public int getMultiFieldValueClassUnderlyingTypeIdCount() {
            return this.multiFieldValueClassUnderlyingTypeId_.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
            return this.multiFieldValueClassUnderlyingTypeId_;
        }

        public List<Type> getMultiFieldValueClassUnderlyingTypeList() {
            return this.multiFieldValueClassUnderlyingType_;
        }

        public List<Integer> getNestedClassNameList() {
            return this.nestedClassName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i11) {
            return this.property_.get(i11);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.sealedSubclassFqName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.flags_) : 0;
            int i12 = 0;
            for (int i13 = 0; i13 < this.supertypeId_.size(); i13++) {
                i12 += CodedOutputStream.p(this.supertypeId_.get(i13).intValue());
            }
            int i14 = o11 + i12;
            if (!getSupertypeIdList().isEmpty()) {
                i14 = i14 + 1 + CodedOutputStream.p(i12);
            }
            this.supertypeIdMemoizedSerializedSize = i12;
            if ((this.bitField0_ & 2) == 2) {
                i14 += CodedOutputStream.o(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i14 += CodedOutputStream.o(4, this.companionObjectName_);
            }
            for (int i15 = 0; i15 < this.typeParameter_.size(); i15++) {
                i14 += CodedOutputStream.s(5, this.typeParameter_.get(i15));
            }
            for (int i16 = 0; i16 < this.supertype_.size(); i16++) {
                i14 += CodedOutputStream.s(6, this.supertype_.get(i16));
            }
            int i17 = 0;
            for (int i18 = 0; i18 < this.nestedClassName_.size(); i18++) {
                i17 += CodedOutputStream.p(this.nestedClassName_.get(i18).intValue());
            }
            int i19 = i14 + i17;
            if (!getNestedClassNameList().isEmpty()) {
                i19 = i19 + 1 + CodedOutputStream.p(i17);
            }
            this.nestedClassNameMemoizedSerializedSize = i17;
            for (int i21 = 0; i21 < this.constructor_.size(); i21++) {
                i19 += CodedOutputStream.s(8, this.constructor_.get(i21));
            }
            for (int i22 = 0; i22 < this.function_.size(); i22++) {
                i19 += CodedOutputStream.s(9, this.function_.get(i22));
            }
            for (int i23 = 0; i23 < this.property_.size(); i23++) {
                i19 += CodedOutputStream.s(10, this.property_.get(i23));
            }
            for (int i24 = 0; i24 < this.typeAlias_.size(); i24++) {
                i19 += CodedOutputStream.s(11, this.typeAlias_.get(i24));
            }
            for (int i25 = 0; i25 < this.enumEntry_.size(); i25++) {
                i19 += CodedOutputStream.s(13, this.enumEntry_.get(i25));
            }
            int i26 = 0;
            for (int i27 = 0; i27 < this.sealedSubclassFqName_.size(); i27++) {
                i26 += CodedOutputStream.p(this.sealedSubclassFqName_.get(i27).intValue());
            }
            int i28 = i19 + i26;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                i28 = i28 + 2 + CodedOutputStream.p(i26);
            }
            this.sealedSubclassFqNameMemoizedSerializedSize = i26;
            if ((this.bitField0_ & 8) == 8) {
                i28 += CodedOutputStream.o(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i28 += CodedOutputStream.s(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                i28 += CodedOutputStream.o(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i29 = 0; i29 < this.contextReceiverType_.size(); i29++) {
                i28 += CodedOutputStream.s(20, this.contextReceiverType_.get(i29));
            }
            int i31 = 0;
            for (int i32 = 0; i32 < this.contextReceiverTypeId_.size(); i32++) {
                i31 += CodedOutputStream.p(this.contextReceiverTypeId_.get(i32).intValue());
            }
            int i33 = i28 + i31;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i33 = i33 + 2 + CodedOutputStream.p(i31);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = i31;
            int i34 = 0;
            for (int i35 = 0; i35 < this.multiFieldValueClassUnderlyingName_.size(); i35++) {
                i34 += CodedOutputStream.p(this.multiFieldValueClassUnderlyingName_.get(i35).intValue());
            }
            int i36 = i33 + i34;
            if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
                i36 = i36 + 2 + CodedOutputStream.p(i34);
            }
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = i34;
            for (int i37 = 0; i37 < this.multiFieldValueClassUnderlyingType_.size(); i37++) {
                i36 += CodedOutputStream.s(23, this.multiFieldValueClassUnderlyingType_.get(i37));
            }
            int i38 = 0;
            for (int i39 = 0; i39 < this.multiFieldValueClassUnderlyingTypeId_.size(); i39++) {
                i38 += CodedOutputStream.p(this.multiFieldValueClassUnderlyingTypeId_.get(i39).intValue());
            }
            int i41 = i36 + i38;
            if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
                i41 = i41 + 2 + CodedOutputStream.p(i38);
            }
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = i38;
            if ((this.bitField0_ & 64) == 64) {
                i41 += CodedOutputStream.s(30, this.typeTable_);
            }
            int i42 = 0;
            for (int i43 = 0; i43 < this.versionRequirement_.size(); i43++) {
                i42 += CodedOutputStream.p(this.versionRequirement_.get(i43).intValue());
            }
            int size = i41 + i42 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 128) == 128) {
                size += CodedOutputStream.s(32, this.versionRequirementTable_);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public Type getSupertype(int i11) {
            return this.supertype_.get(i11);
        }

        public int getSupertypeCount() {
            return this.supertype_.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.supertypeId_;
        }

        public List<Type> getSupertypeList() {
            return this.supertype_;
        }

        public TypeAlias getTypeAlias(int i11) {
            return this.typeAlias_.get(i11);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasCompanionObjectName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getSupertypeCount(); i12++) {
                if (!getSupertype(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getContextReceiverTypeCount(); i13++) {
                if (!getContextReceiverType(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < getConstructorCount(); i14++) {
                if (!getConstructor(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getFunctionCount(); i15++) {
                if (!getFunction(i15).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getPropertyCount(); i16++) {
                if (!getProperty(i16).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getTypeAliasCount(); i17++) {
                if (!getTypeAlias(i17).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i18 = 0; i18 < getEnumEntryCount(); i18++) {
                if (!getEnumEntry(i18).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i19 = 0; i19 < getMultiFieldValueClassUnderlyingTypeCount(); i19++) {
                if (!getMultiFieldValueClassUnderlyingType(i19).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.flags_);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.o0(18);
                codedOutputStream.o0(this.supertypeIdMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.supertypeId_.size(); i11++) {
                codedOutputStream.b0(this.supertypeId_.get(i11).intValue());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(3, this.fqName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.a0(4, this.companionObjectName_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                codedOutputStream.d0(5, this.typeParameter_.get(i12));
            }
            for (int i13 = 0; i13 < this.supertype_.size(); i13++) {
                codedOutputStream.d0(6, this.supertype_.get(i13));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.o0(58);
                codedOutputStream.o0(this.nestedClassNameMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.nestedClassName_.size(); i14++) {
                codedOutputStream.b0(this.nestedClassName_.get(i14).intValue());
            }
            for (int i15 = 0; i15 < this.constructor_.size(); i15++) {
                codedOutputStream.d0(8, this.constructor_.get(i15));
            }
            for (int i16 = 0; i16 < this.function_.size(); i16++) {
                codedOutputStream.d0(9, this.function_.get(i16));
            }
            for (int i17 = 0; i17 < this.property_.size(); i17++) {
                codedOutputStream.d0(10, this.property_.get(i17));
            }
            for (int i18 = 0; i18 < this.typeAlias_.size(); i18++) {
                codedOutputStream.d0(11, this.typeAlias_.get(i18));
            }
            for (int i19 = 0; i19 < this.enumEntry_.size(); i19++) {
                codedOutputStream.d0(13, this.enumEntry_.get(i19));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.o0(130);
                codedOutputStream.o0(this.sealedSubclassFqNameMemoizedSerializedSize);
            }
            for (int i21 = 0; i21 < this.sealedSubclassFqName_.size(); i21++) {
                codedOutputStream.b0(this.sealedSubclassFqName_.get(i21).intValue());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.a0(17, this.inlineClassUnderlyingPropertyName_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.d0(18, this.inlineClassUnderlyingType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.a0(19, this.inlineClassUnderlyingTypeId_);
            }
            for (int i22 = 0; i22 < this.contextReceiverType_.size(); i22++) {
                codedOutputStream.d0(20, this.contextReceiverType_.get(i22));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.o0(170);
                codedOutputStream.o0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i23 = 0; i23 < this.contextReceiverTypeId_.size(); i23++) {
                codedOutputStream.b0(this.contextReceiverTypeId_.get(i23).intValue());
            }
            if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
                codedOutputStream.o0(178);
                codedOutputStream.o0(this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize);
            }
            for (int i24 = 0; i24 < this.multiFieldValueClassUnderlyingName_.size(); i24++) {
                codedOutputStream.b0(this.multiFieldValueClassUnderlyingName_.get(i24).intValue());
            }
            for (int i25 = 0; i25 < this.multiFieldValueClassUnderlyingType_.size(); i25++) {
                codedOutputStream.d0(23, this.multiFieldValueClassUnderlyingType_.get(i25));
            }
            if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
                codedOutputStream.o0(194);
                codedOutputStream.o0(this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize);
            }
            for (int i26 = 0; i26 < this.multiFieldValueClassUnderlyingTypeId_.size(); i26++) {
                codedOutputStream.b0(this.multiFieldValueClassUnderlyingTypeId_.get(i26).intValue());
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.d0(30, this.typeTable_);
            }
            for (int i27 = 0; i27 < this.versionRequirement_.size(); i27++) {
                codedOutputStream.a0(31, this.versionRequirement_.get(i27).intValue());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.d0(32, this.versionRequirementTable_);
            }
            newExtensionWriter.a(19000, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Class r12) {
            return newBuilder().g(r12);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Class getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Class(GeneratedMessageLite.c<Class, ?> cVar) {
            super(cVar);
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private Class(boolean z11) {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<Class, b> implements i20.d {
            public List<Integer> A;
            public VersionRequirementTable B;

            /* renamed from: d, reason: collision with root package name */
            public int f67323d;

            /* renamed from: e, reason: collision with root package name */
            public int f67324e = 6;

            /* renamed from: f, reason: collision with root package name */
            public int f67325f;

            /* renamed from: g, reason: collision with root package name */
            public int f67326g;

            /* renamed from: h, reason: collision with root package name */
            public List<TypeParameter> f67327h;

            /* renamed from: i, reason: collision with root package name */
            public List<Type> f67328i;

            /* renamed from: j, reason: collision with root package name */
            public List<Integer> f67329j;

            /* renamed from: k, reason: collision with root package name */
            public List<Integer> f67330k;

            /* renamed from: l, reason: collision with root package name */
            public List<Type> f67331l;

            /* renamed from: m, reason: collision with root package name */
            public List<Integer> f67332m;

            /* renamed from: n, reason: collision with root package name */
            public List<Constructor> f67333n;

            /* renamed from: o, reason: collision with root package name */
            public List<Function> f67334o;

            /* renamed from: p, reason: collision with root package name */
            public List<Property> f67335p;

            /* renamed from: q, reason: collision with root package name */
            public List<TypeAlias> f67336q;

            /* renamed from: r, reason: collision with root package name */
            public List<EnumEntry> f67337r;

            /* renamed from: s, reason: collision with root package name */
            public List<Integer> f67338s;

            /* renamed from: t, reason: collision with root package name */
            public int f67339t;

            /* renamed from: u, reason: collision with root package name */
            public Type f67340u;

            /* renamed from: v, reason: collision with root package name */
            public int f67341v;

            /* renamed from: w, reason: collision with root package name */
            public List<Integer> f67342w;

            /* renamed from: x, reason: collision with root package name */
            public List<Type> f67343x;

            /* renamed from: y, reason: collision with root package name */
            public List<Integer> f67344y;

            /* renamed from: z, reason: collision with root package name */
            public TypeTable f67345z;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67327h = list;
                this.f67328i = list;
                this.f67329j = list;
                this.f67330k = list;
                this.f67331l = list;
                this.f67332m = list;
                this.f67333n = list;
                this.f67334o = list;
                this.f67335p = list;
                this.f67336q = list;
                this.f67337r = list;
                this.f67338s = list;
                this.f67340u = Type.getDefaultInstance();
                this.f67342w = list;
                this.f67343x = list;
                this.f67344y = list;
                this.f67345z = TypeTable.getDefaultInstance();
                this.A = list;
                this.B = VersionRequirementTable.getDefaultInstance();
                u0();
            }

            public static b u() {
                return new b();
            }

            public final void A() {
                if ((this.f67323d & 262144) != 262144) {
                    this.f67342w = new ArrayList(this.f67342w);
                    this.f67323d |= 262144;
                }
            }

            public b A0(TypeTable typeTable) {
                if ((this.f67323d & 2097152) != 2097152 || this.f67345z == TypeTable.getDefaultInstance()) {
                    this.f67345z = typeTable;
                } else {
                    this.f67345z = TypeTable.newBuilder(this.f67345z).g(typeTable).l();
                }
                this.f67323d |= 2097152;
                return this;
            }

            public final void B() {
                if ((this.f67323d & 1048576) != 1048576) {
                    this.f67344y = new ArrayList(this.f67344y);
                    this.f67323d |= 1048576;
                }
            }

            public b B0(VersionRequirementTable versionRequirementTable) {
                if ((this.f67323d & 8388608) != 8388608 || this.B == VersionRequirementTable.getDefaultInstance()) {
                    this.B = versionRequirementTable;
                } else {
                    this.B = VersionRequirementTable.newBuilder(this.B).g(versionRequirementTable).l();
                }
                this.f67323d |= 8388608;
                return this;
            }

            public final void E() {
                if ((this.f67323d & 524288) != 524288) {
                    this.f67343x = new ArrayList(this.f67343x);
                    this.f67323d |= 524288;
                }
            }

            public b E0(int i11) {
                this.f67323d |= 4;
                this.f67326g = i11;
                return this;
            }

            public final void F() {
                if ((this.f67323d & 64) != 64) {
                    this.f67330k = new ArrayList(this.f67330k);
                    this.f67323d |= 64;
                }
            }

            public b F0(int i11) {
                this.f67323d |= 1;
                this.f67324e = i11;
                return this;
            }

            public final void G() {
                if ((this.f67323d & 2048) != 2048) {
                    this.f67335p = new ArrayList(this.f67335p);
                    this.f67323d |= 2048;
                }
            }

            public b G0(int i11) {
                this.f67323d |= 2;
                this.f67325f = i11;
                return this;
            }

            public b I0(int i11) {
                this.f67323d |= 32768;
                this.f67339t = i11;
                return this;
            }

            public final void J() {
                if ((this.f67323d & 16384) != 16384) {
                    this.f67338s = new ArrayList(this.f67338s);
                    this.f67323d |= 16384;
                }
            }

            public b J0(int i11) {
                this.f67323d |= 131072;
                this.f67341v = i11;
                return this;
            }

            public final void K() {
                if ((this.f67323d & 32) != 32) {
                    this.f67329j = new ArrayList(this.f67329j);
                    this.f67323d |= 32;
                }
            }

            public final void M() {
                if ((this.f67323d & 16) != 16) {
                    this.f67328i = new ArrayList(this.f67328i);
                    this.f67323d |= 16;
                }
            }

            public final void N() {
                if ((this.f67323d & 4096) != 4096) {
                    this.f67336q = new ArrayList(this.f67336q);
                    this.f67323d |= 4096;
                }
            }

            public final void O() {
                if ((this.f67323d & 8) != 8) {
                    this.f67327h = new ArrayList(this.f67327h);
                    this.f67323d |= 8;
                }
            }

            public final void P() {
                if ((this.f67323d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.f67323d |= 4194304;
                }
            }

            public Constructor Q(int i11) {
                return this.f67333n.get(i11);
            }

            public int R() {
                return this.f67333n.size();
            }

            public Type T(int i11) {
                return this.f67331l.get(i11);
            }

            public int W() {
                return this.f67331l.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            public EnumEntry Y(int i11) {
                return this.f67337r.get(i11);
            }

            public int Z() {
                return this.f67337r.size();
            }

            public Function a0(int i11) {
                return this.f67334o.get(i11);
            }

            public int b0() {
                return this.f67334o.size();
            }

            public Type c0() {
                return this.f67340u;
            }

            public Type e0(int i11) {
                return this.f67343x.get(i11);
            }

            public int f0() {
                return this.f67343x.size();
            }

            public Property g0(int i11) {
                return this.f67335p.get(i11);
            }

            public int h0() {
                return this.f67335p.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!r0()) {
                    return false;
                }
                for (int i11 = 0; i11 < p0(); i11++) {
                    if (!o0(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < l0(); i12++) {
                    if (!j0(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < W(); i13++) {
                    if (!T(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < R(); i14++) {
                    if (!Q(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < b0(); i15++) {
                    if (!a0(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < h0(); i16++) {
                    if (!g0(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < n0(); i17++) {
                    if (!m0(i17).isInitialized()) {
                        return false;
                    }
                }
                for (int i18 = 0; i18 < Z(); i18++) {
                    if (!Y(i18).isInitialized()) {
                        return false;
                    }
                }
                if (s0() && !c0().isInitialized()) {
                    return false;
                }
                for (int i19 = 0; i19 < f0(); i19++) {
                    if (!e0(i19).isInitialized()) {
                        return false;
                    }
                }
                return (!t0() || q0().isInitialized()) && n();
            }

            public Type j0(int i11) {
                return this.f67328i.get(i11);
            }

            public int l0() {
                return this.f67328i.size();
            }

            public TypeAlias m0(int i11) {
                return this.f67336q.get(i11);
            }

            public int n0() {
                return this.f67336q.size();
            }

            public TypeParameter o0(int i11) {
                return this.f67327h.get(i11);
            }

            public int p0() {
                return this.f67327h.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Class build() {
                Class s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public TypeTable q0() {
                return this.f67345z;
            }

            public boolean r0() {
                return (this.f67323d & 2) == 2;
            }

            public Class s() {
                Class r02 = new Class(this);
                int i11 = this.f67323d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                r02.flags_ = this.f67324e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                r02.fqName_ = this.f67325f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                r02.companionObjectName_ = this.f67326g;
                if ((this.f67323d & 8) == 8) {
                    this.f67327h = Collections.unmodifiableList(this.f67327h);
                    this.f67323d &= -9;
                }
                r02.typeParameter_ = this.f67327h;
                if ((this.f67323d & 16) == 16) {
                    this.f67328i = Collections.unmodifiableList(this.f67328i);
                    this.f67323d &= -17;
                }
                r02.supertype_ = this.f67328i;
                if ((this.f67323d & 32) == 32) {
                    this.f67329j = Collections.unmodifiableList(this.f67329j);
                    this.f67323d &= -33;
                }
                r02.supertypeId_ = this.f67329j;
                if ((this.f67323d & 64) == 64) {
                    this.f67330k = Collections.unmodifiableList(this.f67330k);
                    this.f67323d &= -65;
                }
                r02.nestedClassName_ = this.f67330k;
                if ((this.f67323d & 128) == 128) {
                    this.f67331l = Collections.unmodifiableList(this.f67331l);
                    this.f67323d &= -129;
                }
                r02.contextReceiverType_ = this.f67331l;
                if ((this.f67323d & 256) == 256) {
                    this.f67332m = Collections.unmodifiableList(this.f67332m);
                    this.f67323d &= -257;
                }
                r02.contextReceiverTypeId_ = this.f67332m;
                if ((this.f67323d & 512) == 512) {
                    this.f67333n = Collections.unmodifiableList(this.f67333n);
                    this.f67323d &= -513;
                }
                r02.constructor_ = this.f67333n;
                if ((this.f67323d & 1024) == 1024) {
                    this.f67334o = Collections.unmodifiableList(this.f67334o);
                    this.f67323d &= -1025;
                }
                r02.function_ = this.f67334o;
                if ((this.f67323d & 2048) == 2048) {
                    this.f67335p = Collections.unmodifiableList(this.f67335p);
                    this.f67323d &= -2049;
                }
                r02.property_ = this.f67335p;
                if ((this.f67323d & 4096) == 4096) {
                    this.f67336q = Collections.unmodifiableList(this.f67336q);
                    this.f67323d &= -4097;
                }
                r02.typeAlias_ = this.f67336q;
                if ((this.f67323d & 8192) == 8192) {
                    this.f67337r = Collections.unmodifiableList(this.f67337r);
                    this.f67323d &= -8193;
                }
                r02.enumEntry_ = this.f67337r;
                if ((this.f67323d & 16384) == 16384) {
                    this.f67338s = Collections.unmodifiableList(this.f67338s);
                    this.f67323d &= -16385;
                }
                r02.sealedSubclassFqName_ = this.f67338s;
                if ((i11 & 32768) == 32768) {
                    i12 |= 8;
                }
                r02.inlineClassUnderlyingPropertyName_ = this.f67339t;
                if ((i11 & 65536) == 65536) {
                    i12 |= 16;
                }
                r02.inlineClassUnderlyingType_ = this.f67340u;
                if ((i11 & 131072) == 131072) {
                    i12 |= 32;
                }
                r02.inlineClassUnderlyingTypeId_ = this.f67341v;
                if ((this.f67323d & 262144) == 262144) {
                    this.f67342w = Collections.unmodifiableList(this.f67342w);
                    this.f67323d &= -262145;
                }
                r02.multiFieldValueClassUnderlyingName_ = this.f67342w;
                if ((this.f67323d & 524288) == 524288) {
                    this.f67343x = Collections.unmodifiableList(this.f67343x);
                    this.f67323d &= -524289;
                }
                r02.multiFieldValueClassUnderlyingType_ = this.f67343x;
                if ((this.f67323d & 1048576) == 1048576) {
                    this.f67344y = Collections.unmodifiableList(this.f67344y);
                    this.f67323d &= -1048577;
                }
                r02.multiFieldValueClassUnderlyingTypeId_ = this.f67344y;
                if ((i11 & 2097152) == 2097152) {
                    i12 |= 64;
                }
                r02.typeTable_ = this.f67345z;
                if ((this.f67323d & 4194304) == 4194304) {
                    this.A = Collections.unmodifiableList(this.A);
                    this.f67323d &= -4194305;
                }
                r02.versionRequirement_ = this.A;
                if ((i11 & 8388608) == 8388608) {
                    i12 |= 128;
                }
                r02.versionRequirementTable_ = this.B;
                r02.bitField0_ = i12;
                return r02;
            }

            public boolean s0() {
                return (this.f67323d & 65536) == 65536;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public boolean t0() {
                return (this.f67323d & 2097152) == 2097152;
            }

            public final void v() {
                if ((this.f67323d & 512) != 512) {
                    this.f67333n = new ArrayList(this.f67333n);
                    this.f67323d |= 512;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: v0, reason: merged with bridge method [inline-methods] */
            public b g(Class r32) {
                if (r32 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r32.hasFlags()) {
                    F0(r32.getFlags());
                }
                if (r32.hasFqName()) {
                    G0(r32.getFqName());
                }
                if (r32.hasCompanionObjectName()) {
                    E0(r32.getCompanionObjectName());
                }
                if (!r32.typeParameter_.isEmpty()) {
                    if (this.f67327h.isEmpty()) {
                        this.f67327h = r32.typeParameter_;
                        this.f67323d &= -9;
                    } else {
                        O();
                        this.f67327h.addAll(r32.typeParameter_);
                    }
                }
                if (!r32.supertype_.isEmpty()) {
                    if (this.f67328i.isEmpty()) {
                        this.f67328i = r32.supertype_;
                        this.f67323d &= -17;
                    } else {
                        M();
                        this.f67328i.addAll(r32.supertype_);
                    }
                }
                if (!r32.supertypeId_.isEmpty()) {
                    if (this.f67329j.isEmpty()) {
                        this.f67329j = r32.supertypeId_;
                        this.f67323d &= -33;
                    } else {
                        K();
                        this.f67329j.addAll(r32.supertypeId_);
                    }
                }
                if (!r32.nestedClassName_.isEmpty()) {
                    if (this.f67330k.isEmpty()) {
                        this.f67330k = r32.nestedClassName_;
                        this.f67323d &= -65;
                    } else {
                        F();
                        this.f67330k.addAll(r32.nestedClassName_);
                    }
                }
                if (!r32.contextReceiverType_.isEmpty()) {
                    if (this.f67331l.isEmpty()) {
                        this.f67331l = r32.contextReceiverType_;
                        this.f67323d &= -129;
                    } else {
                        x();
                        this.f67331l.addAll(r32.contextReceiverType_);
                    }
                }
                if (!r32.contextReceiverTypeId_.isEmpty()) {
                    if (this.f67332m.isEmpty()) {
                        this.f67332m = r32.contextReceiverTypeId_;
                        this.f67323d &= -257;
                    } else {
                        w();
                        this.f67332m.addAll(r32.contextReceiverTypeId_);
                    }
                }
                if (!r32.constructor_.isEmpty()) {
                    if (this.f67333n.isEmpty()) {
                        this.f67333n = r32.constructor_;
                        this.f67323d &= -513;
                    } else {
                        v();
                        this.f67333n.addAll(r32.constructor_);
                    }
                }
                if (!r32.function_.isEmpty()) {
                    if (this.f67334o.isEmpty()) {
                        this.f67334o = r32.function_;
                        this.f67323d &= -1025;
                    } else {
                        z();
                        this.f67334o.addAll(r32.function_);
                    }
                }
                if (!r32.property_.isEmpty()) {
                    if (this.f67335p.isEmpty()) {
                        this.f67335p = r32.property_;
                        this.f67323d &= -2049;
                    } else {
                        G();
                        this.f67335p.addAll(r32.property_);
                    }
                }
                if (!r32.typeAlias_.isEmpty()) {
                    if (this.f67336q.isEmpty()) {
                        this.f67336q = r32.typeAlias_;
                        this.f67323d &= -4097;
                    } else {
                        N();
                        this.f67336q.addAll(r32.typeAlias_);
                    }
                }
                if (!r32.enumEntry_.isEmpty()) {
                    if (this.f67337r.isEmpty()) {
                        this.f67337r = r32.enumEntry_;
                        this.f67323d &= -8193;
                    } else {
                        y();
                        this.f67337r.addAll(r32.enumEntry_);
                    }
                }
                if (!r32.sealedSubclassFqName_.isEmpty()) {
                    if (this.f67338s.isEmpty()) {
                        this.f67338s = r32.sealedSubclassFqName_;
                        this.f67323d &= -16385;
                    } else {
                        J();
                        this.f67338s.addAll(r32.sealedSubclassFqName_);
                    }
                }
                if (r32.hasInlineClassUnderlyingPropertyName()) {
                    I0(r32.getInlineClassUnderlyingPropertyName());
                }
                if (r32.hasInlineClassUnderlyingType()) {
                    z0(r32.getInlineClassUnderlyingType());
                }
                if (r32.hasInlineClassUnderlyingTypeId()) {
                    J0(r32.getInlineClassUnderlyingTypeId());
                }
                if (!r32.multiFieldValueClassUnderlyingName_.isEmpty()) {
                    if (this.f67342w.isEmpty()) {
                        this.f67342w = r32.multiFieldValueClassUnderlyingName_;
                        this.f67323d &= -262145;
                    } else {
                        A();
                        this.f67342w.addAll(r32.multiFieldValueClassUnderlyingName_);
                    }
                }
                if (!r32.multiFieldValueClassUnderlyingType_.isEmpty()) {
                    if (this.f67343x.isEmpty()) {
                        this.f67343x = r32.multiFieldValueClassUnderlyingType_;
                        this.f67323d &= -524289;
                    } else {
                        E();
                        this.f67343x.addAll(r32.multiFieldValueClassUnderlyingType_);
                    }
                }
                if (!r32.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                    if (this.f67344y.isEmpty()) {
                        this.f67344y = r32.multiFieldValueClassUnderlyingTypeId_;
                        this.f67323d &= -1048577;
                    } else {
                        B();
                        this.f67344y.addAll(r32.multiFieldValueClassUnderlyingTypeId_);
                    }
                }
                if (r32.hasTypeTable()) {
                    A0(r32.getTypeTable());
                }
                if (!r32.versionRequirement_.isEmpty()) {
                    if (this.A.isEmpty()) {
                        this.A = r32.versionRequirement_;
                        this.f67323d &= -4194305;
                    } else {
                        P();
                        this.A.addAll(r32.versionRequirement_);
                    }
                }
                if (r32.hasVersionRequirementTable()) {
                    B0(r32.getVersionRequirementTable());
                }
                o(r32);
                h(f().b(r32.unknownFields));
                return this;
            }

            public final void w() {
                if ((this.f67323d & 256) != 256) {
                    this.f67332m = new ArrayList(this.f67332m);
                    this.f67323d |= 256;
                }
            }

            public final void x() {
                if ((this.f67323d & 128) != 128) {
                    this.f67331l = new ArrayList(this.f67331l);
                    this.f67323d |= 128;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: x0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$b");
            }

            public final void y() {
                if ((this.f67323d & 8192) != 8192) {
                    this.f67337r = new ArrayList(this.f67337r);
                    this.f67323d |= 8192;
                }
            }

            public final void z() {
                if ((this.f67323d & 1024) != 1024) {
                    this.f67334o = new ArrayList(this.f67334o);
                    this.f67323d |= 1024;
                }
            }

            public b z0(Type type) {
                if ((this.f67323d & 65536) != 65536 || this.f67340u == Type.getDefaultInstance()) {
                    this.f67340u = type;
                } else {
                    this.f67340u = Type.newBuilder(this.f67340u).g(type).s();
                }
                this.f67323d |= 65536;
                return this;
            }

            private void u0() {
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r7v23 */
        /* JADX WARN: Type inference failed for: r7v25 */
        /* JADX WARN: Type inference failed for: r7v27 */
        /* JADX WARN: Type inference failed for: r7v29 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v31 */
        /* JADX WARN: Type inference failed for: r7v33 */
        /* JADX WARN: Type inference failed for: r7v35 */
        /* JADX WARN: Type inference failed for: r7v37 */
        /* JADX WARN: Type inference failed for: r7v39 */
        /* JADX WARN: Type inference failed for: r7v41 */
        /* JADX WARN: Type inference failed for: r7v43 */
        /* JADX WARN: Type inference failed for: r7v45 */
        /* JADX WARN: Type inference failed for: r7v47 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        private Class(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.supertypeIdMemoizedSerializedSize = -1;
            this.nestedClassNameMemoizedSerializedSize = -1;
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.sealedSubclassFqNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
            this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            boolean z11 = true;
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z12 = false;
            char c11 = 0;
            while (true) {
                boolean z13 = z11;
                if (!z12) {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z12 = z13;
                                    z11 = z13;
                                    c11 = c11;
                                case 8:
                                    this.bitField0_ |= 1;
                                    this.flags_ = eVar.s();
                                    z11 = z13;
                                    c11 = c11;
                                case 16:
                                    int i11 = (c11 == true ? 1 : 0) & 32;
                                    c11 = c11;
                                    if (i11 != 32) {
                                        this.supertypeId_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | ' ';
                                    }
                                    this.supertypeId_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 18:
                                    int j11 = eVar.j(eVar.A());
                                    int i12 = (c11 == true ? 1 : 0) & 32;
                                    c11 = c11;
                                    if (i12 != 32) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.supertypeId_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | ' ';
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.supertypeId_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                    z11 = z13;
                                    c11 = c11;
                                case 24:
                                    this.bitField0_ |= 2;
                                    this.fqName_ = eVar.s();
                                    z11 = z13;
                                    c11 = c11;
                                case 32:
                                    this.bitField0_ |= 4;
                                    this.companionObjectName_ = eVar.s();
                                    z11 = z13;
                                    c11 = c11;
                                case 42:
                                    int i13 = (c11 == true ? 1 : 0) & 8;
                                    c11 = c11;
                                    if (i13 != 8) {
                                        this.typeParameter_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | '\b';
                                    }
                                    this.typeParameter_.add(eVar.u(TypeParameter.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 50:
                                    int i14 = (c11 == true ? 1 : 0) & 16;
                                    c11 = c11;
                                    if (i14 != 16) {
                                        this.supertype_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 16;
                                    }
                                    this.supertype_.add(eVar.u(Type.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 56:
                                    int i15 = (c11 == true ? 1 : 0) & 64;
                                    c11 = c11;
                                    if (i15 != 64) {
                                        this.nestedClassName_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | '@';
                                    }
                                    this.nestedClassName_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 58:
                                    int j12 = eVar.j(eVar.A());
                                    int i16 = (c11 == true ? 1 : 0) & 64;
                                    c11 = c11;
                                    if (i16 != 64) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.nestedClassName_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | '@';
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.nestedClassName_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j12);
                                    z11 = z13;
                                    c11 = c11;
                                case 66:
                                    int i17 = (c11 == true ? 1 : 0) & 512;
                                    c11 = c11;
                                    if (i17 != 512) {
                                        this.constructor_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 512;
                                    }
                                    this.constructor_.add(eVar.u(Constructor.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 74:
                                    int i18 = (c11 == true ? 1 : 0) & 1024;
                                    c11 = c11;
                                    if (i18 != 1024) {
                                        this.function_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 1024;
                                    }
                                    this.function_.add(eVar.u(Function.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 82:
                                    int i19 = (c11 == true ? 1 : 0) & 2048;
                                    c11 = c11;
                                    if (i19 != 2048) {
                                        this.property_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 2048;
                                    }
                                    this.property_.add(eVar.u(Property.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 90:
                                    int i21 = (c11 == true ? 1 : 0) & 4096;
                                    c11 = c11;
                                    if (i21 != 4096) {
                                        this.typeAlias_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 4096;
                                    }
                                    this.typeAlias_.add(eVar.u(TypeAlias.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 106:
                                    int i22 = (c11 == true ? 1 : 0) & 8192;
                                    c11 = c11;
                                    if (i22 != 8192) {
                                        this.enumEntry_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 8192;
                                    }
                                    this.enumEntry_.add(eVar.u(EnumEntry.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 128:
                                    int i23 = (c11 == true ? 1 : 0) & 16384;
                                    c11 = c11;
                                    if (i23 != 16384) {
                                        this.sealedSubclassFqName_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 16384;
                                    }
                                    this.sealedSubclassFqName_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 130:
                                    int j13 = eVar.j(eVar.A());
                                    int i24 = (c11 == true ? 1 : 0) & 16384;
                                    c11 = c11;
                                    if (i24 != 16384) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.sealedSubclassFqName_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 16384;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.sealedSubclassFqName_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j13);
                                    z11 = z13;
                                    c11 = c11;
                                case 136:
                                    this.bitField0_ |= 8;
                                    this.inlineClassUnderlyingPropertyName_ = eVar.s();
                                    z11 = z13;
                                    c11 = c11;
                                case 146:
                                    Type.b builder = (this.bitField0_ & 16) == 16 ? this.inlineClassUnderlyingType_.toBuilder() : null;
                                    Type type = (Type) eVar.u(Type.PARSER, fVar);
                                    this.inlineClassUnderlyingType_ = type;
                                    if (builder != null) {
                                        builder.g(type);
                                        this.inlineClassUnderlyingType_ = builder.s();
                                    }
                                    this.bitField0_ |= 16;
                                    z11 = z13;
                                    c11 = c11;
                                case 152:
                                    this.bitField0_ |= 32;
                                    this.inlineClassUnderlyingTypeId_ = eVar.s();
                                    z11 = z13;
                                    c11 = c11;
                                case 162:
                                    int i25 = (c11 == true ? 1 : 0) & 128;
                                    c11 = c11;
                                    if (i25 != 128) {
                                        this.contextReceiverType_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 128;
                                    }
                                    this.contextReceiverType_.add(eVar.u(Type.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 168:
                                    int i26 = (c11 == true ? 1 : 0) & 256;
                                    c11 = c11;
                                    if (i26 != 256) {
                                        this.contextReceiverTypeId_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 256;
                                    }
                                    this.contextReceiverTypeId_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 170:
                                    int j14 = eVar.j(eVar.A());
                                    int i27 = (c11 == true ? 1 : 0) & 256;
                                    c11 = c11;
                                    if (i27 != 256) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.contextReceiverTypeId_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 256;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.contextReceiverTypeId_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j14);
                                    z11 = z13;
                                    c11 = c11;
                                case 176:
                                    int i28 = (c11 == true ? 1 : 0) & 262144;
                                    c11 = c11;
                                    if (i28 != 262144) {
                                        this.multiFieldValueClassUnderlyingName_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                    this.multiFieldValueClassUnderlyingName_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 178:
                                    int j15 = eVar.j(eVar.A());
                                    int i29 = (c11 == true ? 1 : 0) & 262144;
                                    c11 = c11;
                                    if (i29 != 262144) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.multiFieldValueClassUnderlyingName_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.multiFieldValueClassUnderlyingName_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j15);
                                    z11 = z13;
                                    c11 = c11;
                                case 186:
                                    int i31 = (c11 == true ? 1 : 0) & 524288;
                                    c11 = c11;
                                    if (i31 != 524288) {
                                        this.multiFieldValueClassUnderlyingType_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                    this.multiFieldValueClassUnderlyingType_.add(eVar.u(Type.PARSER, fVar));
                                    z11 = z13;
                                    c11 = c11;
                                case 192:
                                    int i32 = (c11 == true ? 1 : 0) & 1048576;
                                    c11 = c11;
                                    if (i32 != 1048576) {
                                        this.multiFieldValueClassUnderlyingTypeId_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                    this.multiFieldValueClassUnderlyingTypeId_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 194:
                                    int j16 = eVar.j(eVar.A());
                                    int i33 = (c11 == true ? 1 : 0) & 1048576;
                                    c11 = c11;
                                    if (i33 != 1048576) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.multiFieldValueClassUnderlyingTypeId_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.multiFieldValueClassUnderlyingTypeId_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j16);
                                    z11 = z13;
                                    c11 = c11;
                                case R.styleable.Theme_drawable_time /* 242 */:
                                    TypeTable.b builder2 = (this.bitField0_ & 64) == 64 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) eVar.u(TypeTable.PARSER, fVar);
                                    this.typeTable_ = typeTable;
                                    if (builder2 != null) {
                                        builder2.g(typeTable);
                                        this.typeTable_ = builder2.l();
                                    }
                                    this.bitField0_ |= 64;
                                    z11 = z13;
                                    c11 = c11;
                                case R.styleable.Theme_drawable_walk_sound4 /* 248 */:
                                    int i34 = (c11 == true ? 1 : 0) & 4194304;
                                    c11 = c11;
                                    if (i34 != 4194304) {
                                        this.versionRequirement_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 0;
                                    }
                                    this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                    z11 = z13;
                                    c11 = c11;
                                case 250:
                                    int j17 = eVar.j(eVar.A());
                                    int i35 = (c11 == true ? 1 : 0) & 4194304;
                                    c11 = c11;
                                    if (i35 != 4194304) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.versionRequirement_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 0;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j17);
                                    z11 = z13;
                                    c11 = c11;
                                case 258:
                                    try {
                                        VersionRequirementTable.b builder3 = (this.bitField0_ & 128) == 128 ? this.versionRequirementTable_.toBuilder() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) eVar.u(VersionRequirementTable.PARSER, fVar);
                                        this.versionRequirementTable_ = versionRequirementTable;
                                        if (builder3 != null) {
                                            builder3.g(versionRequirementTable);
                                            this.versionRequirementTable_ = builder3.l();
                                        }
                                        this.bitField0_ |= 128;
                                        z11 = z13;
                                        c11 = c11;
                                    } catch (InvalidProtocolBufferException e11) {
                                        e = e11;
                                        throw e.setUnfinishedMessage(this);
                                    } catch (IOException e12) {
                                        e = e12;
                                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (((c11 == true ? 1 : 0) & 32) == 32) {
                                            this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 8) == 8) {
                                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 16) == 16) {
                                            this.supertype_ = Collections.unmodifiableList(this.supertype_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 64) == 64) {
                                            this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 512) == 512) {
                                            this.constructor_ = Collections.unmodifiableList(this.constructor_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 1024) == 1024) {
                                            this.function_ = Collections.unmodifiableList(this.function_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 2048) == 2048) {
                                            this.property_ = Collections.unmodifiableList(this.property_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                                            this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 16384) == 16384) {
                                            this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 128) == 128) {
                                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 256) == 256) {
                                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 262144) == 262144) {
                                            this.multiFieldValueClassUnderlyingName_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingName_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 524288) == 524288) {
                                            this.multiFieldValueClassUnderlyingType_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingType_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 1048576) == 1048576) {
                                            this.multiFieldValueClassUnderlyingTypeId_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingTypeId_);
                                        }
                                        if (((c11 == true ? 1 : 0) & 4194304) == 4194304) {
                                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                                        }
                                        try {
                                            J.I();
                                        } catch (IOException unused) {
                                        } catch (Throwable th3) {
                                            this.unknownFields = q11.j();
                                            throw th3;
                                        }
                                        this.unknownFields = q11.j();
                                        makeExtensionsImmutable();
                                        throw th;
                                    }
                                default:
                                    if (parseUnknownField(eVar, J, fVar, K)) {
                                        z11 = z13;
                                        c11 = c11;
                                    }
                                    z12 = z13;
                                    z11 = z13;
                                    c11 = c11;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (InvalidProtocolBufferException e13) {
                        e = e13;
                    } catch (IOException e14) {
                        e = e14;
                    }
                } else {
                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                        this.supertypeId_ = Collections.unmodifiableList(this.supertypeId_);
                    }
                    if (((c11 == true ? 1 : 0) & 8) == 8) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c11 == true ? 1 : 0) & 16) == 16) {
                        this.supertype_ = Collections.unmodifiableList(this.supertype_);
                    }
                    if (((c11 == true ? 1 : 0) & 64) == 64) {
                        this.nestedClassName_ = Collections.unmodifiableList(this.nestedClassName_);
                    }
                    if (((c11 == true ? 1 : 0) & 512) == 512) {
                        this.constructor_ = Collections.unmodifiableList(this.constructor_);
                    }
                    if (((c11 == true ? 1 : 0) & 1024) == 1024) {
                        this.function_ = Collections.unmodifiableList(this.function_);
                    }
                    if (((c11 == true ? 1 : 0) & 2048) == 2048) {
                        this.property_ = Collections.unmodifiableList(this.property_);
                    }
                    if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                    }
                    if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                        this.enumEntry_ = Collections.unmodifiableList(this.enumEntry_);
                    }
                    if (((c11 == true ? 1 : 0) & 16384) == 16384) {
                        this.sealedSubclassFqName_ = Collections.unmodifiableList(this.sealedSubclassFqName_);
                    }
                    if (((c11 == true ? 1 : 0) & 128) == 128) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c11 == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c11 == true ? 1 : 0) & 262144) == 262144) {
                        this.multiFieldValueClassUnderlyingName_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingName_);
                    }
                    if (((c11 == true ? 1 : 0) & 524288) == 524288) {
                        this.multiFieldValueClassUnderlyingType_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingType_);
                    }
                    if (((c11 == true ? 1 : 0) & 1048576) == 1048576) {
                        this.multiFieldValueClassUnderlyingTypeId_ = Collections.unmodifiableList(this.multiFieldValueClassUnderlyingTypeId_);
                    }
                    if (((c11 == true ? 1 : 0) & 4194304) == 4194304) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th5) {
                        this.unknownFields = q11.j();
                        throw th5;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements i20.e {
        public static p<Constructor> PARSER = new a();
        private static final Constructor defaultInstance;
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final d unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Constructor d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Constructor(eVar, fVar);
            }
        }

        static {
            Constructor constructor = new Constructor(true);
            defaultInstance = constructor;
            constructor.initFields();
        }

        public static Constructor getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            List list = Collections.EMPTY_LIST;
            this.valueParameter_ = list;
            this.versionRequirement_ = list;
        }

        public static b newBuilder() {
            return b.u();
        }

        public int getFlags() {
            return this.flags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.flags_) : 0;
            for (int i12 = 0; i12 < this.valueParameter_.size(); i12++) {
                o11 += CodedOutputStream.s(2, this.valueParameter_.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                i13 += CodedOutputStream.p(this.versionRequirement_.get(i14).intValue());
            }
            int size = o11 + i13 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public ValueParameter getValueParameter(int i11) {
            return this.valueParameter_.get(i11);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getValueParameterCount(); i11++) {
                if (!getValueParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.flags_);
            }
            for (int i11 = 0; i11 < this.valueParameter_.size(); i11++) {
                codedOutputStream.d0(2, this.valueParameter_.get(i11));
            }
            for (int i12 = 0; i12 < this.versionRequirement_.size(); i12++) {
                codedOutputStream.a0(31, this.versionRequirement_.get(i12).intValue());
            }
            newExtensionWriter.a(19000, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Constructor constructor) {
            return newBuilder().g(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Constructor getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Constructor(GeneratedMessageLite.c<Constructor, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private Constructor(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Constructor(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K == 8) {
                                    this.bitField0_ |= 1;
                                    this.flags_ = eVar.s();
                                } else if (K == 18) {
                                    if ((i11 & 2) != 2) {
                                        this.valueParameter_ = new ArrayList();
                                        i11 |= 2;
                                    }
                                    this.valueParameter_.add(eVar.u(ValueParameter.PARSER, fVar));
                                } else if (K == 248) {
                                    if ((i11 & 4) != 4) {
                                        this.versionRequirement_ = new ArrayList();
                                        i11 |= 4;
                                    }
                                    this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                } else if (K != 250) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    int j11 = eVar.j(eVar.A());
                                    if ((i11 & 4) != 4 && eVar.e() > 0) {
                                        this.versionRequirement_ = new ArrayList();
                                        i11 |= 4;
                                    }
                                    while (eVar.e() > 0) {
                                        this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 2) == 2) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if ((i11 & 4) == 4) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i11 & 2) == 2) {
                this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
            }
            if ((i11 & 4) == 4) {
                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<Constructor, b> implements i20.e {

            /* renamed from: d, reason: collision with root package name */
            public int f67346d;

            /* renamed from: e, reason: collision with root package name */
            public int f67347e = 6;

            /* renamed from: f, reason: collision with root package name */
            public List<ValueParameter> f67348f;

            /* renamed from: g, reason: collision with root package name */
            public List<Integer> f67349g;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67348f = list;
                this.f67349g = list;
                A();
            }

            public static b u() {
                return new b();
            }

            private void w() {
                if ((this.f67346d & 4) != 4) {
                    this.f67349g = new ArrayList(this.f67349g);
                    this.f67346d |= 4;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public b g(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    F(constructor.getFlags());
                }
                if (!constructor.valueParameter_.isEmpty()) {
                    if (this.f67348f.isEmpty()) {
                        this.f67348f = constructor.valueParameter_;
                        this.f67346d &= -3;
                    } else {
                        v();
                        this.f67348f.addAll(constructor.valueParameter_);
                    }
                }
                if (!constructor.versionRequirement_.isEmpty()) {
                    if (this.f67349g.isEmpty()) {
                        this.f67349g = constructor.versionRequirement_;
                        this.f67346d &= -5;
                    } else {
                        w();
                        this.f67349g.addAll(constructor.versionRequirement_);
                    }
                }
                o(constructor);
                h(f().b(constructor.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$b");
            }

            public b F(int i11) {
                this.f67346d |= 1;
                this.f67347e = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < z(); i11++) {
                    if (!y(i11).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Constructor build() {
                Constructor s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public Constructor s() {
                Constructor constructor = new Constructor(this);
                int i11 = (this.f67346d & 1) != 1 ? 0 : 1;
                constructor.flags_ = this.f67347e;
                if ((this.f67346d & 2) == 2) {
                    this.f67348f = Collections.unmodifiableList(this.f67348f);
                    this.f67346d &= -3;
                }
                constructor.valueParameter_ = this.f67348f;
                if ((this.f67346d & 4) == 4) {
                    this.f67349g = Collections.unmodifiableList(this.f67349g);
                    this.f67346d &= -5;
                }
                constructor.versionRequirement_ = this.f67349g;
                constructor.bitField0_ = i11;
                return constructor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public final void v() {
                if ((this.f67346d & 2) != 2) {
                    this.f67348f = new ArrayList(this.f67348f);
                    this.f67346d |= 2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            public ValueParameter y(int i11) {
                return this.f67348f.get(i11);
            }

            public int z() {
                return this.f67348f.size();
            }

            private void A() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Contract extends GeneratedMessageLite implements i20.f {
        public static p<Contract> PARSER = new a();
        private static final Contract defaultInstance;
        private List<Effect> effect_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Contract d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Contract(eVar, fVar);
            }
        }

        static {
            Contract contract = new Contract(true);
            defaultInstance = contract;
            contract.initFields();
        }

        public static Contract getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.effect_ = Collections.EMPTY_LIST;
        }

        public static b newBuilder() {
            return b.n();
        }

        public Effect getEffect(int i11) {
            return this.effect_.get(i11);
        }

        public int getEffectCount() {
            return this.effect_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.effect_.size(); i13++) {
                i12 += CodedOutputStream.s(1, this.effect_.get(i13));
            }
            int size = i12 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getEffectCount(); i11++) {
                if (!getEffect(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.effect_.size(); i11++) {
                codedOutputStream.d0(1, this.effect_.get(i11));
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Contract contract) {
            return newBuilder().g(contract);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Contract getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Contract(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private Contract(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Contract(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 10) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.effect_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.effect_.add(eVar.u(Effect.PARSER, fVar));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.effect_ = Collections.unmodifiableList(this.effect_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.effect_ = Collections.unmodifiableList(this.effect_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<Contract, b> implements i20.f {

            /* renamed from: b, reason: collision with root package name */
            public int f67350b;

            /* renamed from: c, reason: collision with root package name */
            public List<Effect> f67351c = Collections.EMPTY_LIST;

            public b() {
                t();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < s(); i11++) {
                    if (!q(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Contract build() {
                Contract l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public Contract l() {
                Contract contract = new Contract(this);
                if ((this.f67350b & 1) == 1) {
                    this.f67351c = Collections.unmodifiableList(this.f67351c);
                    this.f67350b &= -2;
                }
                contract.effect_ = this.f67351c;
                return contract;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67350b & 1) != 1) {
                    this.f67351c = new ArrayList(this.f67351c);
                    this.f67350b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            public Effect q(int i11) {
                return this.f67351c.get(i11);
            }

            public int s() {
                return this.f67351c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b g(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.effect_.isEmpty()) {
                    if (this.f67351c.isEmpty()) {
                        this.f67351c = contract.effect_;
                        this.f67350b &= -2;
                    } else {
                        o();
                        this.f67351c.addAll(contract.effect_);
                    }
                }
                h(f().b(contract.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b");
            }

            private void t() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Effect extends GeneratedMessageLite implements g {
        public static p<Effect> PARSER = new a();
        private static final Effect defaultInstance;
        private int bitField0_;
        private Expression conclusionOfConditionalEffect_;
        private List<Expression> effectConstructorArgument_;
        private EffectType effectType_;
        private InvocationKind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum EffectType implements h.a {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);

            private static h.b<EffectType> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<EffectType> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public EffectType findValueByNumber(int i11) {
                    return EffectType.valueOf(i11);
                }
            }

            EffectType(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i11) {
                if (i11 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i11 == 1) {
                    return CALLS;
                }
                if (i11 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum InvocationKind implements h.a {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);

            private static h.b<InvocationKind> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<InvocationKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public InvocationKind findValueByNumber(int i11) {
                    return InvocationKind.valueOf(i11);
                }
            }

            InvocationKind(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i11) {
                if (i11 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i11 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i11 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Effect d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Effect(eVar, fVar);
            }
        }

        static {
            Effect effect = new Effect(true);
            defaultInstance = effect;
            effect.initFields();
        }

        public static Effect getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.effectType_ = EffectType.RETURNS_CONSTANT;
            this.effectConstructorArgument_ = Collections.EMPTY_LIST;
            this.conclusionOfConditionalEffect_ = Expression.getDefaultInstance();
            this.kind_ = InvocationKind.AT_MOST_ONCE;
        }

        public static b newBuilder() {
            return b.n();
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.conclusionOfConditionalEffect_;
        }

        public Expression getEffectConstructorArgument(int i11) {
            return this.effectConstructorArgument_.get(i11);
        }

        public int getEffectConstructorArgumentCount() {
            return this.effectConstructorArgument_.size();
        }

        public EffectType getEffectType() {
            return this.effectType_;
        }

        public InvocationKind getKind() {
            return this.kind_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int h11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.h(1, this.effectType_.getNumber()) : 0;
            for (int i12 = 0; i12 < this.effectConstructorArgument_.size(); i12++) {
                h11 += CodedOutputStream.s(2, this.effectConstructorArgument_.get(i12));
            }
            if ((this.bitField0_ & 2) == 2) {
                h11 += CodedOutputStream.s(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                h11 += CodedOutputStream.h(4, this.kind_.getNumber());
            }
            int size = h11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasKind() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getEffectConstructorArgumentCount(); i11++) {
                if (!getEffectConstructorArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.S(1, this.effectType_.getNumber());
            }
            for (int i11 = 0; i11 < this.effectConstructorArgument_.size(); i11++) {
                codedOutputStream.d0(2, this.effectConstructorArgument_.get(i11));
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.d0(3, this.conclusionOfConditionalEffect_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.S(4, this.kind_.getNumber());
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Effect effect) {
            return newBuilder().g(effect);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Effect getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Effect(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private Effect(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Effect(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                int n11 = eVar.n();
                                EffectType valueOf = EffectType.valueOf(n11);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(n11);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.effectType_ = valueOf;
                                }
                            } else if (K == 18) {
                                if ((c11 & 2) != 2) {
                                    this.effectConstructorArgument_ = new ArrayList();
                                    c11 = 2;
                                }
                                this.effectConstructorArgument_.add(eVar.u(Expression.PARSER, fVar));
                            } else if (K == 26) {
                                Expression.b builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                                Expression expression = (Expression) eVar.u(Expression.PARSER, fVar);
                                this.conclusionOfConditionalEffect_ = expression;
                                if (builder != null) {
                                    builder.g(expression);
                                    this.conclusionOfConditionalEffect_ = builder.l();
                                }
                                this.bitField0_ |= 2;
                            } else if (K != 32) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                int n12 = eVar.n();
                                InvocationKind valueOf2 = InvocationKind.valueOf(n12);
                                if (valueOf2 == null) {
                                    J.o0(K);
                                    J.o0(n12);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = valueOf2;
                                }
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((c11 & 2) == 2) {
                            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((c11 & 2) == 2) {
                this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<Effect, b> implements g {

            /* renamed from: b, reason: collision with root package name */
            public int f67352b;

            /* renamed from: c, reason: collision with root package name */
            public EffectType f67353c = EffectType.RETURNS_CONSTANT;

            /* renamed from: d, reason: collision with root package name */
            public List<Expression> f67354d = Collections.EMPTY_LIST;

            /* renamed from: e, reason: collision with root package name */
            public Expression f67355e = Expression.getDefaultInstance();

            /* renamed from: f, reason: collision with root package name */
            public InvocationKind f67356f = InvocationKind.AT_MOST_ONCE;

            public b() {
                v();
            }

            public static b n() {
                return new b();
            }

            public b A(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f67352b |= 8;
                this.f67356f = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < t(); i11++) {
                    if (!s(i11).isInitialized()) {
                        return false;
                    }
                }
                return !u() || p().isInitialized();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Effect build() {
                Effect l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public Effect l() {
                Effect effect = new Effect(this);
                int i11 = this.f67352b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                effect.effectType_ = this.f67353c;
                if ((this.f67352b & 2) == 2) {
                    this.f67354d = Collections.unmodifiableList(this.f67354d);
                    this.f67352b &= -3;
                }
                effect.effectConstructorArgument_ = this.f67354d;
                if ((i11 & 4) == 4) {
                    i12 |= 2;
                }
                effect.conclusionOfConditionalEffect_ = this.f67355e;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                effect.kind_ = this.f67356f;
                effect.bitField0_ = i12;
                return effect;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67352b & 2) != 2) {
                    this.f67354d = new ArrayList(this.f67354d);
                    this.f67352b |= 2;
                }
            }

            public Expression p() {
                return this.f67355e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            public Expression s(int i11) {
                return this.f67354d.get(i11);
            }

            public int t() {
                return this.f67354d.size();
            }

            public boolean u() {
                return (this.f67352b & 4) == 4;
            }

            public b w(Expression expression) {
                if ((this.f67352b & 4) != 4 || this.f67355e == Expression.getDefaultInstance()) {
                    this.f67355e = expression;
                } else {
                    this.f67355e = Expression.newBuilder(this.f67355e).g(expression).l();
                }
                this.f67352b |= 4;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b g(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    z(effect.getEffectType());
                }
                if (!effect.effectConstructorArgument_.isEmpty()) {
                    if (this.f67354d.isEmpty()) {
                        this.f67354d = effect.effectConstructorArgument_;
                        this.f67352b &= -3;
                    } else {
                        o();
                        this.f67354d.addAll(effect.effectConstructorArgument_);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    w(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    A(effect.getKind());
                }
                h(f().b(effect.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$b");
            }

            public b z(EffectType effectType) {
                effectType.getClass();
                this.f67352b |= 1;
                this.f67353c = effectType;
                return this;
            }

            private void v() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements i20.h {
        public static p<EnumEntry> PARSER = new a();
        private static final EnumEntry defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public EnumEntry d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new EnumEntry(eVar, fVar);
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            defaultInstance = enumEntry;
            enumEntry.initFields();
        }

        public static EnumEntry getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
        }

        public static b newBuilder() {
            return b.u();
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = ((this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.name_) : 0) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = o11;
            return o11;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.name_);
            }
            newExtensionWriter.a(200, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(EnumEntry enumEntry) {
            return newBuilder().g(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public EnumEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private EnumEntry(GeneratedMessageLite.c<EnumEntry, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private EnumEntry(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private EnumEntry(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 8) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.bitField0_ |= 1;
                                    this.name_ = eVar.s();
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<EnumEntry, b> implements i20.h {

            /* renamed from: d, reason: collision with root package name */
            public int f67357d;

            /* renamed from: e, reason: collision with root package name */
            public int f67358e;

            public b() {
                w();
            }

            public static b u() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                return n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public EnumEntry build() {
                EnumEntry s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public EnumEntry s() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i11 = (this.f67357d & 1) != 1 ? 0 : 1;
                enumEntry.name_ = this.f67358e;
                enumEntry.bitField0_ = i11;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public b g(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    z(enumEntry.getName());
                }
                o(enumEntry);
                h(f().b(enumEntry.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$b");
            }

            public b z(int i11) {
                this.f67357d |= 1;
                this.f67358e = i11;
                return this;
            }

            private void w() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Expression extends GeneratedMessageLite implements i {
        public static p<Expression> PARSER = new a();
        private static final Expression defaultInstance;
        private List<Expression> andArgument_;
        private int bitField0_;
        private ConstantValue constantValue_;
        private int flags_;
        private int isInstanceTypeId_;
        private Type isInstanceType_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Expression> orArgument_;
        private final d unknownFields;
        private int valueParameterReference_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum ConstantValue implements h.a {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);

            private static h.b<ConstantValue> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<ConstantValue> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public ConstantValue findValueByNumber(int i11) {
                    return ConstantValue.valueOf(i11);
                }
            }

            ConstantValue(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i11) {
                if (i11 == 0) {
                    return TRUE;
                }
                if (i11 == 1) {
                    return FALSE;
                }
                if (i11 != 2) {
                    return null;
                }
                return NULL;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Expression d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Expression(eVar, fVar);
            }
        }

        static {
            Expression expression = new Expression(true);
            defaultInstance = expression;
            expression.initFields();
        }

        public static Expression getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 0;
            this.valueParameterReference_ = 0;
            this.constantValue_ = ConstantValue.TRUE;
            this.isInstanceType_ = Type.getDefaultInstance();
            this.isInstanceTypeId_ = 0;
            List<Expression> list = Collections.EMPTY_LIST;
            this.andArgument_ = list;
            this.orArgument_ = list;
        }

        public static b newBuilder() {
            return b.n();
        }

        public Expression getAndArgument(int i11) {
            return this.andArgument_.get(i11);
        }

        public int getAndArgumentCount() {
            return this.andArgument_.size();
        }

        public ConstantValue getConstantValue() {
            return this.constantValue_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public Type getIsInstanceType() {
            return this.isInstanceType_;
        }

        public int getIsInstanceTypeId() {
            return this.isInstanceTypeId_;
        }

        public Expression getOrArgument(int i11) {
            return this.orArgument_.get(i11);
        }

        public int getOrArgumentCount() {
            return this.orArgument_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.h(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.s(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.o(5, this.isInstanceTypeId_);
            }
            for (int i12 = 0; i12 < this.andArgument_.size(); i12++) {
                o11 += CodedOutputStream.s(6, this.andArgument_.get(i12));
            }
            for (int i13 = 0; i13 < this.orArgument_.size(); i13++) {
                o11 += CodedOutputStream.s(7, this.orArgument_.get(i13));
            }
            int size = o11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.valueParameterReference_;
        }

        public boolean hasConstantValue() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getAndArgumentCount(); i11++) {
                if (!getAndArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getOrArgumentCount(); i12++) {
                if (!getOrArgument(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.valueParameterReference_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.S(3, this.constantValue_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.d0(4, this.isInstanceType_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.a0(5, this.isInstanceTypeId_);
            }
            for (int i11 = 0; i11 < this.andArgument_.size(); i11++) {
                codedOutputStream.d0(6, this.andArgument_.get(i11));
            }
            for (int i12 = 0; i12 < this.orArgument_.size(); i12++) {
                codedOutputStream.d0(7, this.orArgument_.get(i12));
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Expression expression) {
            return newBuilder().g(expression);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Expression getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Expression(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private Expression(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Expression(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = eVar.s();
                            } else if (K == 16) {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = eVar.s();
                            } else if (K == 24) {
                                int n11 = eVar.n();
                                ConstantValue valueOf = ConstantValue.valueOf(n11);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(n11);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.constantValue_ = valueOf;
                                }
                            } else if (K == 34) {
                                Type.b builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                                Type type = (Type) eVar.u(Type.PARSER, fVar);
                                this.isInstanceType_ = type;
                                if (builder != null) {
                                    builder.g(type);
                                    this.isInstanceType_ = builder.s();
                                }
                                this.bitField0_ |= 8;
                            } else if (K == 40) {
                                this.bitField0_ |= 16;
                                this.isInstanceTypeId_ = eVar.s();
                            } else if (K == 50) {
                                if ((i11 & 32) != 32) {
                                    this.andArgument_ = new ArrayList();
                                    i11 |= 32;
                                }
                                this.andArgument_.add(eVar.u(PARSER, fVar));
                            } else if (K != 58) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                if ((i11 & 64) != 64) {
                                    this.orArgument_ = new ArrayList();
                                    i11 |= 64;
                                }
                                this.orArgument_.add(eVar.u(PARSER, fVar));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if ((i11 & 32) == 32) {
                            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                        }
                        if ((i11 & 64) == 64) {
                            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i11 & 32) == 32) {
                this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
            }
            if ((i11 & 64) == 64) {
                this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<Expression, b> implements i {

            /* renamed from: b, reason: collision with root package name */
            public int f67359b;

            /* renamed from: c, reason: collision with root package name */
            public int f67360c;

            /* renamed from: d, reason: collision with root package name */
            public int f67361d;

            /* renamed from: e, reason: collision with root package name */
            public ConstantValue f67362e = ConstantValue.TRUE;

            /* renamed from: f, reason: collision with root package name */
            public Type f67363f = Type.getDefaultInstance();

            /* renamed from: g, reason: collision with root package name */
            public int f67364g;

            /* renamed from: h, reason: collision with root package name */
            public List<Expression> f67365h;

            /* renamed from: i, reason: collision with root package name */
            public List<Expression> f67366i;

            public b() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.f67365h = list;
                this.f67366i = list;
                y();
            }

            public static b n() {
                return new b();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$b");
            }

            public b B(Type type) {
                if ((this.f67359b & 8) != 8 || this.f67363f == Type.getDefaultInstance()) {
                    this.f67363f = type;
                } else {
                    this.f67363f = Type.newBuilder(this.f67363f).g(type).s();
                }
                this.f67359b |= 8;
                return this;
            }

            public b E(ConstantValue constantValue) {
                constantValue.getClass();
                this.f67359b |= 4;
                this.f67362e = constantValue;
                return this;
            }

            public b F(int i11) {
                this.f67359b |= 1;
                this.f67360c = i11;
                return this;
            }

            public b G(int i11) {
                this.f67359b |= 16;
                this.f67364g = i11;
                return this;
            }

            public b J(int i11) {
                this.f67359b |= 2;
                this.f67361d = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (x() && !u().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < s(); i11++) {
                    if (!q(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < w(); i12++) {
                    if (!v(i12).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public Expression build() {
                Expression l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public Expression l() {
                Expression expression = new Expression(this);
                int i11 = this.f67359b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                expression.flags_ = this.f67360c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                expression.valueParameterReference_ = this.f67361d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                expression.constantValue_ = this.f67362e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                expression.isInstanceType_ = this.f67363f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                expression.isInstanceTypeId_ = this.f67364g;
                if ((this.f67359b & 32) == 32) {
                    this.f67365h = Collections.unmodifiableList(this.f67365h);
                    this.f67359b &= -33;
                }
                expression.andArgument_ = this.f67365h;
                if ((this.f67359b & 64) == 64) {
                    this.f67366i = Collections.unmodifiableList(this.f67366i);
                    this.f67359b &= -65;
                }
                expression.orArgument_ = this.f67366i;
                expression.bitField0_ = i12;
                return expression;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67359b & 32) != 32) {
                    this.f67365h = new ArrayList(this.f67365h);
                    this.f67359b |= 32;
                }
            }

            public final void p() {
                if ((this.f67359b & 64) != 64) {
                    this.f67366i = new ArrayList(this.f67366i);
                    this.f67359b |= 64;
                }
            }

            public Expression q(int i11) {
                return this.f67365h.get(i11);
            }

            public int s() {
                return this.f67365h.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            public Type u() {
                return this.f67363f;
            }

            public Expression v(int i11) {
                return this.f67366i.get(i11);
            }

            public int w() {
                return this.f67366i.size();
            }

            public boolean x() {
                return (this.f67359b & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public b g(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    F(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    J(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    E(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    B(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    G(expression.getIsInstanceTypeId());
                }
                if (!expression.andArgument_.isEmpty()) {
                    if (this.f67365h.isEmpty()) {
                        this.f67365h = expression.andArgument_;
                        this.f67359b &= -33;
                    } else {
                        o();
                        this.f67365h.addAll(expression.andArgument_);
                    }
                }
                if (!expression.orArgument_.isEmpty()) {
                    if (this.f67366i.isEmpty()) {
                        this.f67366i = expression.orArgument_;
                        this.f67359b &= -65;
                    } else {
                        p();
                        this.f67366i.addAll(expression.orArgument_);
                    }
                }
                h(f().b(expression.unknownFields));
                return this;
            }

            private void y() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements j {
        public static p<Function> PARSER = new a();
        private static final Function defaultInstance;
        private int bitField0_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private Contract contract_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private List<TypeParameter> typeParameter_;
        private TypeTable typeTable_;
        private final d unknownFields;
        private List<ValueParameter> valueParameter_;
        private List<Integer> versionRequirement_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Function d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Function(eVar, fVar);
            }
        }

        static {
            Function function = new Function(true);
            defaultInstance = function;
            function.initFields();
        }

        public static Function getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            this.oldFlags_ = 6;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.valueParameter_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirement_ = list;
            this.contract_ = Contract.getDefaultInstance();
        }

        public static b newBuilder() {
            return b.u();
        }

        public static Function parseFrom(InputStream inputStream, f fVar) throws IOException {
            return PARSER.b(inputStream, fVar);
        }

        public Type getContextReceiverType(int i11) {
            return this.contextReceiverType_.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public Contract getContract() {
            return this.contract_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 2) == 2 ? CodedOutputStream.o(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.o(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.s(3, this.returnType_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                o11 += CodedOutputStream.s(4, this.typeParameter_.get(i12));
            }
            if ((this.bitField0_ & 32) == 32) {
                o11 += CodedOutputStream.s(5, this.receiverType_);
            }
            for (int i13 = 0; i13 < this.valueParameter_.size(); i13++) {
                o11 += CodedOutputStream.s(6, this.valueParameter_.get(i13));
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.o(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                o11 += CodedOutputStream.o(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                o11 += CodedOutputStream.o(9, this.flags_);
            }
            for (int i14 = 0; i14 < this.contextReceiverType_.size(); i14++) {
                o11 += CodedOutputStream.s(10, this.contextReceiverType_.get(i14));
            }
            int i15 = 0;
            for (int i16 = 0; i16 < this.contextReceiverTypeId_.size(); i16++) {
                i15 += CodedOutputStream.p(this.contextReceiverTypeId_.get(i16).intValue());
            }
            int i17 = o11 + i15;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i17 = i17 + 1 + CodedOutputStream.p(i15);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = i15;
            if ((this.bitField0_ & 128) == 128) {
                i17 += CodedOutputStream.s(30, this.typeTable_);
            }
            int i18 = 0;
            for (int i19 = 0; i19 < this.versionRequirement_.size(); i19++) {
                i18 += CodedOutputStream.p(this.versionRequirement_.get(i19).intValue());
            }
            int size = i17 + i18 + (getVersionRequirementList().size() * 2);
            if ((this.bitField0_ & 256) == 256) {
                size += CodedOutputStream.s(32, this.contract_);
            }
            int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public ValueParameter getValueParameter(int i11) {
            return this.valueParameter_.get(i11);
        }

        public int getValueParameterCount() {
            return this.valueParameter_.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.valueParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasContract() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getValueParameterCount(); i13++) {
                if (!getValueParameter(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.a0(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.d0(3, this.returnType_);
            }
            for (int i11 = 0; i11 < this.typeParameter_.size(); i11++) {
                codedOutputStream.d0(4, this.typeParameter_.get(i11));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.d0(5, this.receiverType_);
            }
            for (int i12 = 0; i12 < this.valueParameter_.size(); i12++) {
                codedOutputStream.d0(6, this.valueParameter_.get(i12));
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.a0(7, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.a0(8, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(9, this.flags_);
            }
            for (int i13 = 0; i13 < this.contextReceiverType_.size(); i13++) {
                codedOutputStream.d0(10, this.contextReceiverType_.get(i13));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.o0(90);
                codedOutputStream.o0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.contextReceiverTypeId_.size(); i14++) {
                codedOutputStream.b0(this.contextReceiverTypeId_.get(i14).intValue());
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.d0(30, this.typeTable_);
            }
            for (int i15 = 0; i15 < this.versionRequirement_.size(); i15++) {
                codedOutputStream.a0(31, this.versionRequirement_.get(i15).intValue());
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.d0(32, this.contract_);
            }
            newExtensionWriter.a(19000, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Function function) {
            return newBuilder().g(function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Function getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Function(GeneratedMessageLite.c<Function, ?> cVar) {
            super(cVar);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private Function(boolean z11) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private Function(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            char c11 = 0;
            while (true) {
                ?? r52 = 1024;
                if (!z11) {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z11 = true;
                                case 8:
                                    this.bitField0_ |= 2;
                                    this.oldFlags_ = eVar.s();
                                case 16:
                                    this.bitField0_ |= 4;
                                    this.name_ = eVar.s();
                                case 26:
                                    Type.b builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                    Type type = (Type) eVar.u(Type.PARSER, fVar);
                                    this.returnType_ = type;
                                    if (builder != null) {
                                        builder.g(type);
                                        this.returnType_ = builder.s();
                                    }
                                    this.bitField0_ |= 8;
                                case 34:
                                    int i11 = (c11 == true ? 1 : 0) & 32;
                                    c11 = c11;
                                    if (i11 != 32) {
                                        this.typeParameter_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | ' ';
                                    }
                                    this.typeParameter_.add(eVar.u(TypeParameter.PARSER, fVar));
                                case 42:
                                    Type.b builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                    Type type2 = (Type) eVar.u(Type.PARSER, fVar);
                                    this.receiverType_ = type2;
                                    if (builder2 != null) {
                                        builder2.g(type2);
                                        this.receiverType_ = builder2.s();
                                    }
                                    this.bitField0_ |= 32;
                                case 50:
                                    int i12 = (c11 == true ? 1 : 0) & 1024;
                                    c11 = c11;
                                    if (i12 != 1024) {
                                        this.valueParameter_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 1024;
                                    }
                                    this.valueParameter_.add(eVar.u(ValueParameter.PARSER, fVar));
                                case 56:
                                    this.bitField0_ |= 16;
                                    this.returnTypeId_ = eVar.s();
                                case 64:
                                    this.bitField0_ |= 64;
                                    this.receiverTypeId_ = eVar.s();
                                case 72:
                                    this.bitField0_ |= 1;
                                    this.flags_ = eVar.s();
                                case 82:
                                    int i13 = (c11 == true ? 1 : 0) & 256;
                                    c11 = c11;
                                    if (i13 != 256) {
                                        this.contextReceiverType_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 256;
                                    }
                                    this.contextReceiverType_.add(eVar.u(Type.PARSER, fVar));
                                case 88:
                                    int i14 = (c11 == true ? 1 : 0) & 512;
                                    c11 = c11;
                                    if (i14 != 512) {
                                        this.contextReceiverTypeId_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 512;
                                    }
                                    this.contextReceiverTypeId_.add(Integer.valueOf(eVar.s()));
                                case 90:
                                    int j11 = eVar.j(eVar.A());
                                    int i15 = (c11 == true ? 1 : 0) & 512;
                                    c11 = c11;
                                    if (i15 != 512) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.contextReceiverTypeId_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.contextReceiverTypeId_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                case R.styleable.Theme_drawable_time /* 242 */:
                                    TypeTable.b builder3 = (this.bitField0_ & 128) == 128 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) eVar.u(TypeTable.PARSER, fVar);
                                    this.typeTable_ = typeTable;
                                    if (builder3 != null) {
                                        builder3.g(typeTable);
                                        this.typeTable_ = builder3.l();
                                    }
                                    this.bitField0_ |= 128;
                                case R.styleable.Theme_drawable_walk_sound4 /* 248 */:
                                    int i16 = (c11 == true ? 1 : 0) & 4096;
                                    c11 = c11;
                                    if (i16 != 4096) {
                                        this.versionRequirement_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 4096;
                                    }
                                    this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                case 250:
                                    int j12 = eVar.j(eVar.A());
                                    int i17 = (c11 == true ? 1 : 0) & 4096;
                                    c11 = c11;
                                    if (i17 != 4096) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.versionRequirement_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j12);
                                case 258:
                                    Contract.b builder4 = (this.bitField0_ & 256) == 256 ? this.contract_.toBuilder() : null;
                                    Contract contract = (Contract) eVar.u(Contract.PARSER, fVar);
                                    this.contract_ = contract;
                                    if (builder4 != null) {
                                        builder4.g(contract);
                                        this.contract_ = builder4.l();
                                    }
                                    this.bitField0_ |= 256;
                                default:
                                    r52 = parseUnknownField(eVar, J, fVar, K);
                                    if (r52 == 0) {
                                        z11 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & 32) == 32) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                        }
                        if (((c11 == true ? 1 : 0) & 1024) == r52) {
                            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                        }
                        if (((c11 == true ? 1 : 0) & 256) == 256) {
                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                        }
                        if (((c11 == true ? 1 : 0) & 512) == 512) {
                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                        }
                        if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } else {
                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c11 == true ? 1 : 0) & 1024) == 1024) {
                        this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                    }
                    if (((c11 == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c11 == true ? 1 : 0) & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c11 == true ? 1 : 0) & 4096) == 4096) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.unknownFields = q11.j();
                        throw th4;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    return;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<Function, b> implements j {

            /* renamed from: d, reason: collision with root package name */
            public int f67367d;

            /* renamed from: g, reason: collision with root package name */
            public int f67370g;

            /* renamed from: i, reason: collision with root package name */
            public int f67372i;

            /* renamed from: j, reason: collision with root package name */
            public List<TypeParameter> f67373j;

            /* renamed from: k, reason: collision with root package name */
            public Type f67374k;

            /* renamed from: l, reason: collision with root package name */
            public int f67375l;

            /* renamed from: m, reason: collision with root package name */
            public List<Type> f67376m;

            /* renamed from: n, reason: collision with root package name */
            public List<Integer> f67377n;

            /* renamed from: o, reason: collision with root package name */
            public List<ValueParameter> f67378o;

            /* renamed from: p, reason: collision with root package name */
            public TypeTable f67379p;

            /* renamed from: q, reason: collision with root package name */
            public List<Integer> f67380q;

            /* renamed from: r, reason: collision with root package name */
            public Contract f67381r;

            /* renamed from: e, reason: collision with root package name */
            public int f67368e = 6;

            /* renamed from: f, reason: collision with root package name */
            public int f67369f = 6;

            /* renamed from: h, reason: collision with root package name */
            public Type f67371h = Type.getDefaultInstance();

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67373j = list;
                this.f67374k = Type.getDefaultInstance();
                this.f67376m = list;
                this.f67377n = list;
                this.f67378o = list;
                this.f67379p = TypeTable.getDefaultInstance();
                this.f67380q = list;
                this.f67381r = Contract.getDefaultInstance();
                Y();
            }

            public static b u() {
                return new b();
            }

            private void v() {
                if ((this.f67367d & 512) != 512) {
                    this.f67377n = new ArrayList(this.f67377n);
                    this.f67367d |= 512;
                }
            }

            private void w() {
                if ((this.f67367d & 256) != 256) {
                    this.f67376m = new ArrayList(this.f67376m);
                    this.f67367d |= 256;
                }
            }

            private void x() {
                if ((this.f67367d & 32) != 32) {
                    this.f67373j = new ArrayList(this.f67373j);
                    this.f67367d |= 32;
                }
            }

            private void y() {
                if ((this.f67367d & 1024) != 1024) {
                    this.f67378o = new ArrayList(this.f67378o);
                    this.f67367d |= 1024;
                }
            }

            private void z() {
                if ((this.f67367d & 4096) != 4096) {
                    this.f67380q = new ArrayList(this.f67380q);
                    this.f67367d |= 4096;
                }
            }

            public Type A(int i11) {
                return this.f67376m.get(i11);
            }

            public int B() {
                return this.f67376m.size();
            }

            public Contract E() {
                return this.f67381r;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            public Type G() {
                return this.f67374k;
            }

            public Type J() {
                return this.f67371h;
            }

            public TypeParameter K(int i11) {
                return this.f67373j.get(i11);
            }

            public int M() {
                return this.f67373j.size();
            }

            public TypeTable N() {
                return this.f67379p;
            }

            public ValueParameter O(int i11) {
                return this.f67378o.get(i11);
            }

            public int P() {
                return this.f67378o.size();
            }

            public boolean Q() {
                return (this.f67367d & 8192) == 8192;
            }

            public boolean R() {
                return (this.f67367d & 4) == 4;
            }

            public boolean T() {
                return (this.f67367d & 64) == 64;
            }

            public boolean W() {
                return (this.f67367d & 8) == 8;
            }

            public boolean X() {
                return (this.f67367d & 2048) == 2048;
            }

            public b Z(Contract contract) {
                if ((this.f67367d & 8192) != 8192 || this.f67381r == Contract.getDefaultInstance()) {
                    this.f67381r = contract;
                } else {
                    this.f67381r = Contract.newBuilder(this.f67381r).g(contract).l();
                }
                this.f67367d |= 8192;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: a0, reason: merged with bridge method [inline-methods] */
            public b g(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    g0(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    j0(function.getOldFlags());
                }
                if (function.hasName()) {
                    h0(function.getName());
                }
                if (function.hasReturnType()) {
                    e0(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    m0(function.getReturnTypeId());
                }
                if (!function.typeParameter_.isEmpty()) {
                    if (this.f67373j.isEmpty()) {
                        this.f67373j = function.typeParameter_;
                        this.f67367d &= -33;
                    } else {
                        x();
                        this.f67373j.addAll(function.typeParameter_);
                    }
                }
                if (function.hasReceiverType()) {
                    c0(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    l0(function.getReceiverTypeId());
                }
                if (!function.contextReceiverType_.isEmpty()) {
                    if (this.f67376m.isEmpty()) {
                        this.f67376m = function.contextReceiverType_;
                        this.f67367d &= -257;
                    } else {
                        w();
                        this.f67376m.addAll(function.contextReceiverType_);
                    }
                }
                if (!function.contextReceiverTypeId_.isEmpty()) {
                    if (this.f67377n.isEmpty()) {
                        this.f67377n = function.contextReceiverTypeId_;
                        this.f67367d &= -513;
                    } else {
                        v();
                        this.f67377n.addAll(function.contextReceiverTypeId_);
                    }
                }
                if (!function.valueParameter_.isEmpty()) {
                    if (this.f67378o.isEmpty()) {
                        this.f67378o = function.valueParameter_;
                        this.f67367d &= -1025;
                    } else {
                        y();
                        this.f67378o.addAll(function.valueParameter_);
                    }
                }
                if (function.hasTypeTable()) {
                    f0(function.getTypeTable());
                }
                if (!function.versionRequirement_.isEmpty()) {
                    if (this.f67380q.isEmpty()) {
                        this.f67380q = function.versionRequirement_;
                        this.f67367d &= -4097;
                    } else {
                        z();
                        this.f67380q.addAll(function.versionRequirement_);
                    }
                }
                if (function.hasContract()) {
                    Z(function.getContract());
                }
                o(function);
                h(f().b(function.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: b0, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$b");
            }

            public b c0(Type type) {
                if ((this.f67367d & 64) != 64 || this.f67374k == Type.getDefaultInstance()) {
                    this.f67374k = type;
                } else {
                    this.f67374k = Type.newBuilder(this.f67374k).g(type).s();
                }
                this.f67367d |= 64;
                return this;
            }

            public b e0(Type type) {
                if ((this.f67367d & 8) != 8 || this.f67371h == Type.getDefaultInstance()) {
                    this.f67371h = type;
                } else {
                    this.f67371h = Type.newBuilder(this.f67371h).g(type).s();
                }
                this.f67367d |= 8;
                return this;
            }

            public b f0(TypeTable typeTable) {
                if ((this.f67367d & 2048) != 2048 || this.f67379p == TypeTable.getDefaultInstance()) {
                    this.f67379p = typeTable;
                } else {
                    this.f67379p = TypeTable.newBuilder(this.f67379p).g(typeTable).l();
                }
                this.f67367d |= 2048;
                return this;
            }

            public b g0(int i11) {
                this.f67367d |= 1;
                this.f67368e = i11;
                return this;
            }

            public b h0(int i11) {
                this.f67367d |= 4;
                this.f67370g = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!R()) {
                    return false;
                }
                if (W() && !J().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < M(); i11++) {
                    if (!K(i11).isInitialized()) {
                        return false;
                    }
                }
                if (T() && !G().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < B(); i12++) {
                    if (!A(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < P(); i13++) {
                    if (!O(i13).isInitialized()) {
                        return false;
                    }
                }
                if (!X() || N().isInitialized()) {
                    return (!Q() || E().isInitialized()) && n();
                }
                return false;
            }

            public b j0(int i11) {
                this.f67367d |= 2;
                this.f67369f = i11;
                return this;
            }

            public b l0(int i11) {
                this.f67367d |= 128;
                this.f67375l = i11;
                return this;
            }

            public b m0(int i11) {
                this.f67367d |= 16;
                this.f67372i = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Function build() {
                Function s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public Function s() {
                Function function = new Function(this);
                int i11 = this.f67367d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                function.flags_ = this.f67368e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                function.oldFlags_ = this.f67369f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                function.name_ = this.f67370g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                function.returnType_ = this.f67371h;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                function.returnTypeId_ = this.f67372i;
                if ((this.f67367d & 32) == 32) {
                    this.f67373j = Collections.unmodifiableList(this.f67373j);
                    this.f67367d &= -33;
                }
                function.typeParameter_ = this.f67373j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                function.receiverType_ = this.f67374k;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                function.receiverTypeId_ = this.f67375l;
                if ((this.f67367d & 256) == 256) {
                    this.f67376m = Collections.unmodifiableList(this.f67376m);
                    this.f67367d &= -257;
                }
                function.contextReceiverType_ = this.f67376m;
                if ((this.f67367d & 512) == 512) {
                    this.f67377n = Collections.unmodifiableList(this.f67377n);
                    this.f67367d &= -513;
                }
                function.contextReceiverTypeId_ = this.f67377n;
                if ((this.f67367d & 1024) == 1024) {
                    this.f67378o = Collections.unmodifiableList(this.f67378o);
                    this.f67367d &= -1025;
                }
                function.valueParameter_ = this.f67378o;
                if ((i11 & 2048) == 2048) {
                    i12 |= 128;
                }
                function.typeTable_ = this.f67379p;
                if ((this.f67367d & 4096) == 4096) {
                    this.f67380q = Collections.unmodifiableList(this.f67380q);
                    this.f67367d &= -4097;
                }
                function.versionRequirement_ = this.f67380q;
                if ((i11 & 8192) == 8192) {
                    i12 |= 256;
                }
                function.contract_ = this.f67381r;
                function.bitField0_ = i12;
                return function;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            private void Y() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum MemberKind implements h.a {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);

        private static h.b<MemberKind> internalValueMap = new a();
        private final int value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements h.b<MemberKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberKind findValueByNumber(int i11) {
                return MemberKind.valueOf(i11);
            }
        }

        MemberKind(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i11) {
            if (i11 == 0) {
                return DECLARATION;
            }
            if (i11 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i11 == 2) {
                return DELEGATION;
            }
            if (i11 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Modality implements h.a {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);

        private static h.b<Modality> internalValueMap = new a();
        private final int value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements h.b<Modality> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Modality findValueByNumber(int i11) {
                return Modality.valueOf(i11);
            }
        }

        Modality(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i11) {
            if (i11 == 0) {
                return FINAL;
            }
            if (i11 == 1) {
                return OPEN;
            }
            if (i11 == 2) {
                return ABSTRACT;
            }
            if (i11 != 3) {
                return null;
            }
            return SEALED;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements l {
        public static p<Package> PARSER = new a();
        private static final Package defaultInstance;
        private int bitField0_;
        private List<Function> function_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Property> property_;
        private List<TypeAlias> typeAlias_;
        private TypeTable typeTable_;
        private final d unknownFields;
        private VersionRequirementTable versionRequirementTable_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Package d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Package(eVar, fVar);
            }
        }

        static {
            Package r02 = new Package(true);
            defaultInstance = r02;
            r02.initFields();
        }

        public static Package getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            List list = Collections.EMPTY_LIST;
            this.function_ = list;
            this.property_ = list;
            this.typeAlias_ = list;
            this.typeTable_ = TypeTable.getDefaultInstance();
            this.versionRequirementTable_ = VersionRequirementTable.getDefaultInstance();
        }

        public static b newBuilder() {
            return b.u();
        }

        public static Package parseFrom(InputStream inputStream, f fVar) throws IOException {
            return PARSER.b(inputStream, fVar);
        }

        public Function getFunction(int i11) {
            return this.function_.get(i11);
        }

        public int getFunctionCount() {
            return this.function_.size();
        }

        public List<Function> getFunctionList() {
            return this.function_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i11) {
            return this.property_.get(i11);
        }

        public int getPropertyCount() {
            return this.property_.size();
        }

        public List<Property> getPropertyList() {
            return this.property_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.function_.size(); i13++) {
                i12 += CodedOutputStream.s(3, this.function_.get(i13));
            }
            for (int i14 = 0; i14 < this.property_.size(); i14++) {
                i12 += CodedOutputStream.s(4, this.property_.get(i14));
            }
            for (int i15 = 0; i15 < this.typeAlias_.size(); i15++) {
                i12 += CodedOutputStream.s(5, this.typeAlias_.get(i15));
            }
            if ((this.bitField0_ & 1) == 1) {
                i12 += CodedOutputStream.s(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i12 += CodedOutputStream.s(32, this.versionRequirementTable_);
            }
            int extensionsSerializedSize = i12 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public TypeAlias getTypeAlias(int i11) {
            return this.typeAlias_.get(i11);
        }

        public int getTypeAliasCount() {
            return this.typeAlias_.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.typeAlias_;
        }

        public TypeTable getTypeTable() {
            return this.typeTable_;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.versionRequirementTable_;
        }

        public boolean hasTypeTable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getFunctionCount(); i11++) {
                if (!getFunction(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getPropertyCount(); i12++) {
                if (!getProperty(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getTypeAliasCount(); i13++) {
                if (!getTypeAlias(i13).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            for (int i11 = 0; i11 < this.function_.size(); i11++) {
                codedOutputStream.d0(3, this.function_.get(i11));
            }
            for (int i12 = 0; i12 < this.property_.size(); i12++) {
                codedOutputStream.d0(4, this.property_.get(i12));
            }
            for (int i13 = 0; i13 < this.typeAlias_.size(); i13++) {
                codedOutputStream.d0(5, this.typeAlias_.get(i13));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.d0(30, this.typeTable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.d0(32, this.versionRequirementTable_);
            }
            newExtensionWriter.a(200, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Package r12) {
            return newBuilder().g(r12);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Package getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Package(GeneratedMessageLite.c<Package, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private Package(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private Package(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 26) {
                                int i11 = (c11 == true ? 1 : 0) & 1;
                                c11 = c11;
                                if (i11 != 1) {
                                    this.function_ = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 1;
                                }
                                this.function_.add(eVar.u(Function.PARSER, fVar));
                            } else if (K == 34) {
                                int i12 = (c11 == true ? 1 : 0) & 2;
                                c11 = c11;
                                if (i12 != 2) {
                                    this.property_ = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 2;
                                }
                                this.property_.add(eVar.u(Property.PARSER, fVar));
                            } else if (K != 42) {
                                if (K == 242) {
                                    TypeTable.b builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                    TypeTable typeTable = (TypeTable) eVar.u(TypeTable.PARSER, fVar);
                                    this.typeTable_ = typeTable;
                                    if (builder != null) {
                                        builder.g(typeTable);
                                        this.typeTable_ = builder.l();
                                    }
                                    this.bitField0_ |= 1;
                                } else if (K != 258) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    VersionRequirementTable.b builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) eVar.u(VersionRequirementTable.PARSER, fVar);
                                    this.versionRequirementTable_ = versionRequirementTable;
                                    if (builder2 != null) {
                                        builder2.g(versionRequirementTable);
                                        this.versionRequirementTable_ = builder2.l();
                                    }
                                    this.bitField0_ |= 2;
                                }
                            } else {
                                int i13 = (c11 == true ? 1 : 0) & 4;
                                c11 = c11;
                                if (i13 != 4) {
                                    this.typeAlias_ = new ArrayList();
                                    c11 = (c11 == true ? 1 : 0) | 4;
                                }
                                this.typeAlias_.add(eVar.u(TypeAlias.PARSER, fVar));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & 1) == 1) {
                            this.function_ = Collections.unmodifiableList(this.function_);
                        }
                        if (((c11 == true ? 1 : 0) & 2) == 2) {
                            this.property_ = Collections.unmodifiableList(this.property_);
                        }
                        if (((c11 == true ? 1 : 0) & 4) == 4) {
                            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c11 == true ? 1 : 0) & 1) == 1) {
                this.function_ = Collections.unmodifiableList(this.function_);
            }
            if (((c11 == true ? 1 : 0) & 2) == 2) {
                this.property_ = Collections.unmodifiableList(this.property_);
            }
            if (((c11 == true ? 1 : 0) & 4) == 4) {
                this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<Package, b> implements l {

            /* renamed from: d, reason: collision with root package name */
            public int f67382d;

            /* renamed from: e, reason: collision with root package name */
            public List<Function> f67383e;

            /* renamed from: f, reason: collision with root package name */
            public List<Property> f67384f;

            /* renamed from: g, reason: collision with root package name */
            public List<TypeAlias> f67385g;

            /* renamed from: h, reason: collision with root package name */
            public TypeTable f67386h;

            /* renamed from: i, reason: collision with root package name */
            public VersionRequirementTable f67387i;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67383e = list;
                this.f67384f = list;
                this.f67385g = list;
                this.f67386h = TypeTable.getDefaultInstance();
                this.f67387i = VersionRequirementTable.getDefaultInstance();
                M();
            }

            public static b u() {
                return new b();
            }

            private void v() {
                if ((this.f67382d & 1) != 1) {
                    this.f67383e = new ArrayList(this.f67383e);
                    this.f67382d |= 1;
                }
            }

            private void w() {
                if ((this.f67382d & 2) != 2) {
                    this.f67384f = new ArrayList(this.f67384f);
                    this.f67382d |= 2;
                }
            }

            private void x() {
                if ((this.f67382d & 4) != 4) {
                    this.f67385g = new ArrayList(this.f67385g);
                    this.f67382d |= 4;
                }
            }

            public int A() {
                return this.f67383e.size();
            }

            public Property B(int i11) {
                return this.f67384f.get(i11);
            }

            public int E() {
                return this.f67384f.size();
            }

            public TypeAlias F(int i11) {
                return this.f67385g.get(i11);
            }

            public int G() {
                return this.f67385g.size();
            }

            public TypeTable J() {
                return this.f67386h;
            }

            public boolean K() {
                return (this.f67382d & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public b g(Package r32) {
                if (r32 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r32.function_.isEmpty()) {
                    if (this.f67383e.isEmpty()) {
                        this.f67383e = r32.function_;
                        this.f67382d &= -2;
                    } else {
                        v();
                        this.f67383e.addAll(r32.function_);
                    }
                }
                if (!r32.property_.isEmpty()) {
                    if (this.f67384f.isEmpty()) {
                        this.f67384f = r32.property_;
                        this.f67382d &= -3;
                    } else {
                        w();
                        this.f67384f.addAll(r32.property_);
                    }
                }
                if (!r32.typeAlias_.isEmpty()) {
                    if (this.f67385g.isEmpty()) {
                        this.f67385g = r32.typeAlias_;
                        this.f67382d &= -5;
                    } else {
                        x();
                        this.f67385g.addAll(r32.typeAlias_);
                    }
                }
                if (r32.hasTypeTable()) {
                    P(r32.getTypeTable());
                }
                if (r32.hasVersionRequirementTable()) {
                    Q(r32.getVersionRequirementTable());
                }
                o(r32);
                h(f().b(r32.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b");
            }

            public b P(TypeTable typeTable) {
                if ((this.f67382d & 8) != 8 || this.f67386h == TypeTable.getDefaultInstance()) {
                    this.f67386h = typeTable;
                } else {
                    this.f67386h = TypeTable.newBuilder(this.f67386h).g(typeTable).l();
                }
                this.f67382d |= 8;
                return this;
            }

            public b Q(VersionRequirementTable versionRequirementTable) {
                if ((this.f67382d & 16) != 16 || this.f67387i == VersionRequirementTable.getDefaultInstance()) {
                    this.f67387i = versionRequirementTable;
                } else {
                    this.f67387i = VersionRequirementTable.newBuilder(this.f67387i).g(versionRequirementTable).l();
                }
                this.f67382d |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < A(); i11++) {
                    if (!z(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < E(); i12++) {
                    if (!B(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < G(); i13++) {
                    if (!F(i13).isInitialized()) {
                        return false;
                    }
                }
                return (!K() || J().isInitialized()) && n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Package build() {
                Package s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public Package s() {
                Package r02 = new Package(this);
                int i11 = this.f67382d;
                if ((i11 & 1) == 1) {
                    this.f67383e = Collections.unmodifiableList(this.f67383e);
                    this.f67382d &= -2;
                }
                r02.function_ = this.f67383e;
                if ((this.f67382d & 2) == 2) {
                    this.f67384f = Collections.unmodifiableList(this.f67384f);
                    this.f67382d &= -3;
                }
                r02.property_ = this.f67384f;
                if ((this.f67382d & 4) == 4) {
                    this.f67385g = Collections.unmodifiableList(this.f67385g);
                    this.f67382d &= -5;
                }
                r02.typeAlias_ = this.f67385g;
                int i12 = (i11 & 8) != 8 ? 0 : 1;
                r02.typeTable_ = this.f67386h;
                if ((i11 & 16) == 16) {
                    i12 |= 2;
                }
                r02.versionRequirementTable_ = this.f67387i;
                r02.bitField0_ = i12;
                return r02;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            public Function z(int i11) {
                return this.f67383e.get(i11);
            }

            private void M() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements k {
        public static p<PackageFragment> PARSER = new a();
        private static final PackageFragment defaultInstance;
        private int bitField0_;
        private List<Class> class__;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Package package_;
        private QualifiedNameTable qualifiedNames_;
        private StringTable strings_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public PackageFragment d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new PackageFragment(eVar, fVar);
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            defaultInstance = packageFragment;
            packageFragment.initFields();
        }

        public static PackageFragment getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.strings_ = StringTable.getDefaultInstance();
            this.qualifiedNames_ = QualifiedNameTable.getDefaultInstance();
            this.package_ = Package.getDefaultInstance();
            this.class__ = Collections.EMPTY_LIST;
        }

        public static b newBuilder() {
            return b.u();
        }

        public static PackageFragment parseFrom(InputStream inputStream, f fVar) throws IOException {
            return PARSER.b(inputStream, fVar);
        }

        public Class getClass_(int i11) {
            return this.class__.get(i11);
        }

        public int getClass_Count() {
            return this.class__.size();
        }

        public List<Class> getClass_List() {
            return this.class__;
        }

        public Package getPackage() {
            return this.package_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.qualifiedNames_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int s11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.s(1, this.strings_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                s11 += CodedOutputStream.s(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                s11 += CodedOutputStream.s(3, this.package_);
            }
            for (int i12 = 0; i12 < this.class__.size(); i12++) {
                s11 += CodedOutputStream.s(4, this.class__.get(i12));
            }
            int extensionsSerializedSize = s11 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public StringTable getStrings() {
            return this.strings_;
        }

        public boolean hasPackage() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getClass_Count(); i11++) {
                if (!getClass_(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.d0(1, this.strings_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.d0(2, this.qualifiedNames_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.d0(3, this.package_);
            }
            for (int i11 = 0; i11 < this.class__.size(); i11++) {
                codedOutputStream.d0(4, this.class__.get(i11));
            }
            newExtensionWriter.a(200, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(PackageFragment packageFragment) {
            return newBuilder().g(packageFragment);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public PackageFragment getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private PackageFragment(GeneratedMessageLite.c<PackageFragment, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private PackageFragment(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PackageFragment(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            char c11 = 0;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                StringTable.b builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                                StringTable stringTable = (StringTable) eVar.u(StringTable.PARSER, fVar);
                                this.strings_ = stringTable;
                                if (builder != null) {
                                    builder.g(stringTable);
                                    this.strings_ = builder.l();
                                }
                                this.bitField0_ |= 1;
                            } else if (K == 18) {
                                QualifiedNameTable.b builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) eVar.u(QualifiedNameTable.PARSER, fVar);
                                this.qualifiedNames_ = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.g(qualifiedNameTable);
                                    this.qualifiedNames_ = builder2.l();
                                }
                                this.bitField0_ |= 2;
                            } else if (K == 26) {
                                Package.b builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                                Package r62 = (Package) eVar.u(Package.PARSER, fVar);
                                this.package_ = r62;
                                if (builder3 != null) {
                                    builder3.g(r62);
                                    this.package_ = builder3.s();
                                }
                                this.bitField0_ |= 4;
                            } else if (K != 34) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                int i11 = (c11 == true ? 1 : 0) & '\b';
                                c11 = c11;
                                if (i11 != 8) {
                                    this.class__ = new ArrayList();
                                    c11 = '\b';
                                }
                                this.class__.add(eVar.u(Class.PARSER, fVar));
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & '\b') == 8) {
                            this.class__ = Collections.unmodifiableList(this.class__);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c11 == true ? 1 : 0) & '\b') == 8) {
                this.class__ = Collections.unmodifiableList(this.class__);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<PackageFragment, b> implements k {

            /* renamed from: d, reason: collision with root package name */
            public int f67388d;

            /* renamed from: e, reason: collision with root package name */
            public StringTable f67389e = StringTable.getDefaultInstance();

            /* renamed from: f, reason: collision with root package name */
            public QualifiedNameTable f67390f = QualifiedNameTable.getDefaultInstance();

            /* renamed from: g, reason: collision with root package name */
            public Package f67391g = Package.getDefaultInstance();

            /* renamed from: h, reason: collision with root package name */
            public List<Class> f67392h = Collections.EMPTY_LIST;

            public b() {
                F();
            }

            public static b u() {
                return new b();
            }

            public QualifiedNameTable A() {
                return this.f67390f;
            }

            public boolean B() {
                return (this.f67388d & 4) == 4;
            }

            public boolean E() {
                return (this.f67388d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public b g(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    N(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    M(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    K(packageFragment.getPackage());
                }
                if (!packageFragment.class__.isEmpty()) {
                    if (this.f67392h.isEmpty()) {
                        this.f67392h = packageFragment.class__;
                        this.f67388d &= -9;
                    } else {
                        v();
                        this.f67392h.addAll(packageFragment.class__);
                    }
                }
                o(packageFragment);
                h(f().b(packageFragment.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$b");
            }

            public b K(Package r42) {
                if ((this.f67388d & 4) != 4 || this.f67391g == Package.getDefaultInstance()) {
                    this.f67391g = r42;
                } else {
                    this.f67391g = Package.newBuilder(this.f67391g).g(r42).s();
                }
                this.f67388d |= 4;
                return this;
            }

            public b M(QualifiedNameTable qualifiedNameTable) {
                if ((this.f67388d & 2) != 2 || this.f67390f == QualifiedNameTable.getDefaultInstance()) {
                    this.f67390f = qualifiedNameTable;
                } else {
                    this.f67390f = QualifiedNameTable.newBuilder(this.f67390f).g(qualifiedNameTable).l();
                }
                this.f67388d |= 2;
                return this;
            }

            public b N(StringTable stringTable) {
                if ((this.f67388d & 1) != 1 || this.f67389e == StringTable.getDefaultInstance()) {
                    this.f67389e = stringTable;
                } else {
                    this.f67389e = StringTable.newBuilder(this.f67389e).g(stringTable).l();
                }
                this.f67388d |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (E() && !A().isInitialized()) {
                    return false;
                }
                if (B() && !z().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < x(); i11++) {
                    if (!w(i11).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public PackageFragment build() {
                PackageFragment s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public PackageFragment s() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i11 = this.f67388d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                packageFragment.strings_ = this.f67389e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                packageFragment.qualifiedNames_ = this.f67390f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                packageFragment.package_ = this.f67391g;
                if ((this.f67388d & 8) == 8) {
                    this.f67392h = Collections.unmodifiableList(this.f67392h);
                    this.f67388d &= -9;
                }
                packageFragment.class__ = this.f67392h;
                packageFragment.bitField0_ = i12;
                return packageFragment;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public final void v() {
                if ((this.f67388d & 8) != 8) {
                    this.f67392h = new ArrayList(this.f67392h);
                    this.f67388d |= 8;
                }
            }

            public Class w(int i11) {
                return this.f67392h.get(i11);
            }

            public int x() {
                return this.f67392h.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            public Package z() {
                return this.f67391g;
            }

            private void F() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements m {
        public static p<Property> PARSER = new a();
        private static final Property defaultInstance;
        private int bitField0_;
        private int contextReceiverTypeIdMemoizedSerializedSize;
        private List<Integer> contextReceiverTypeId_;
        private List<Type> contextReceiverType_;
        private int flags_;
        private int getterFlags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int oldFlags_;
        private int receiverTypeId_;
        private Type receiverType_;
        private int returnTypeId_;
        private Type returnType_;
        private int setterFlags_;
        private ValueParameter setterValueParameter_;
        private List<TypeParameter> typeParameter_;
        private final d unknownFields;
        private List<Integer> versionRequirement_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Property d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Property(eVar, fVar);
            }
        }

        static {
            Property property = new Property(true);
            defaultInstance = property;
            property.initFields();
        }

        public static Property getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = com.badlogic.gdx.graphics.f.f11614k2;
            this.oldFlags_ = 2054;
            this.name_ = 0;
            this.returnType_ = Type.getDefaultInstance();
            this.returnTypeId_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.receiverType_ = Type.getDefaultInstance();
            this.receiverTypeId_ = 0;
            this.contextReceiverType_ = list;
            this.contextReceiverTypeId_ = list;
            this.setterValueParameter_ = ValueParameter.getDefaultInstance();
            this.getterFlags_ = 0;
            this.setterFlags_ = 0;
            this.versionRequirement_ = list;
        }

        public static b newBuilder() {
            return b.u();
        }

        public Type getContextReceiverType(int i11) {
            return this.contextReceiverType_.get(i11);
        }

        public int getContextReceiverTypeCount() {
            return this.contextReceiverType_.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.contextReceiverTypeId_;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.contextReceiverType_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getGetterFlags() {
            return this.getterFlags_;
        }

        public int getName() {
            return this.name_;
        }

        public int getOldFlags() {
            return this.oldFlags_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.receiverType_;
        }

        public int getReceiverTypeId() {
            return this.receiverTypeId_;
        }

        public Type getReturnType() {
            return this.returnType_;
        }

        public int getReturnTypeId() {
            return this.returnTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 2) == 2 ? CodedOutputStream.o(1, this.oldFlags_) : 0;
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.o(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.s(3, this.returnType_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                o11 += CodedOutputStream.s(4, this.typeParameter_.get(i12));
            }
            if ((this.bitField0_ & 32) == 32) {
                o11 += CodedOutputStream.s(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                o11 += CodedOutputStream.s(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                o11 += CodedOutputStream.o(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                o11 += CodedOutputStream.o(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.o(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                o11 += CodedOutputStream.o(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                o11 += CodedOutputStream.o(11, this.flags_);
            }
            for (int i13 = 0; i13 < this.contextReceiverType_.size(); i13++) {
                o11 += CodedOutputStream.s(12, this.contextReceiverType_.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.contextReceiverTypeId_.size(); i15++) {
                i14 += CodedOutputStream.p(this.contextReceiverTypeId_.get(i15).intValue());
            }
            int i16 = o11 + i14;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                i16 = i16 + 1 + CodedOutputStream.p(i14);
            }
            this.contextReceiverTypeIdMemoizedSerializedSize = i14;
            int i17 = 0;
            for (int i18 = 0; i18 < this.versionRequirement_.size(); i18++) {
                i17 += CodedOutputStream.p(this.versionRequirement_.get(i18).intValue());
            }
            int size = i16 + i17 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getSetterFlags() {
            return this.setterFlags_;
        }

        public ValueParameter getSetterValueParameter() {
            return this.setterValueParameter_;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasName() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.bitField0_ & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.bitField0_ & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(1, this.oldFlags_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.a0(2, this.name_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.d0(3, this.returnType_);
            }
            for (int i11 = 0; i11 < this.typeParameter_.size(); i11++) {
                codedOutputStream.d0(4, this.typeParameter_.get(i11));
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.d0(5, this.receiverType_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.d0(6, this.setterValueParameter_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.a0(7, this.getterFlags_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.a0(8, this.setterFlags_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.a0(9, this.returnTypeId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.a0(10, this.receiverTypeId_);
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(11, this.flags_);
            }
            for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
                codedOutputStream.d0(12, this.contextReceiverType_.get(i12));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.o0(106);
                codedOutputStream.o0(this.contextReceiverTypeIdMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.contextReceiverTypeId_.size(); i13++) {
                codedOutputStream.b0(this.contextReceiverTypeId_.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.versionRequirement_.size(); i14++) {
                codedOutputStream.a0(31, this.versionRequirement_.get(i14).intValue());
            }
            newExtensionWriter.a(19000, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Property property) {
            return newBuilder().g(property);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Property getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Property(GeneratedMessageLite.c<Property, ?> cVar) {
            super(cVar);
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private Property(boolean z11) {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private Property(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.contextReceiverTypeIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            char c11 = 0;
            while (true) {
                ?? r52 = 256;
                if (!z11) {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z11 = true;
                                case 8:
                                    this.bitField0_ |= 2;
                                    this.oldFlags_ = eVar.s();
                                case 16:
                                    this.bitField0_ |= 4;
                                    this.name_ = eVar.s();
                                case 26:
                                    Type.b builder = (this.bitField0_ & 8) == 8 ? this.returnType_.toBuilder() : null;
                                    Type type = (Type) eVar.u(Type.PARSER, fVar);
                                    this.returnType_ = type;
                                    if (builder != null) {
                                        builder.g(type);
                                        this.returnType_ = builder.s();
                                    }
                                    this.bitField0_ |= 8;
                                case 34:
                                    int i11 = (c11 == true ? 1 : 0) & 32;
                                    c11 = c11;
                                    if (i11 != 32) {
                                        this.typeParameter_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | ' ';
                                    }
                                    this.typeParameter_.add(eVar.u(TypeParameter.PARSER, fVar));
                                case 42:
                                    Type.b builder2 = (this.bitField0_ & 32) == 32 ? this.receiverType_.toBuilder() : null;
                                    Type type2 = (Type) eVar.u(Type.PARSER, fVar);
                                    this.receiverType_ = type2;
                                    if (builder2 != null) {
                                        builder2.g(type2);
                                        this.receiverType_ = builder2.s();
                                    }
                                    this.bitField0_ |= 32;
                                case 50:
                                    ValueParameter.b builder3 = (this.bitField0_ & 128) == 128 ? this.setterValueParameter_.toBuilder() : null;
                                    ValueParameter valueParameter = (ValueParameter) eVar.u(ValueParameter.PARSER, fVar);
                                    this.setterValueParameter_ = valueParameter;
                                    if (builder3 != null) {
                                        builder3.g(valueParameter);
                                        this.setterValueParameter_ = builder3.s();
                                    }
                                    this.bitField0_ |= 128;
                                case 56:
                                    this.bitField0_ |= 256;
                                    this.getterFlags_ = eVar.s();
                                case 64:
                                    this.bitField0_ |= 512;
                                    this.setterFlags_ = eVar.s();
                                case 72:
                                    this.bitField0_ |= 16;
                                    this.returnTypeId_ = eVar.s();
                                case 80:
                                    this.bitField0_ |= 64;
                                    this.receiverTypeId_ = eVar.s();
                                case 88:
                                    this.bitField0_ |= 1;
                                    this.flags_ = eVar.s();
                                case 98:
                                    int i12 = (c11 == true ? 1 : 0) & 256;
                                    c11 = c11;
                                    if (i12 != 256) {
                                        this.contextReceiverType_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 256;
                                    }
                                    this.contextReceiverType_.add(eVar.u(Type.PARSER, fVar));
                                case 104:
                                    int i13 = (c11 == true ? 1 : 0) & 512;
                                    c11 = c11;
                                    if (i13 != 512) {
                                        this.contextReceiverTypeId_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 512;
                                    }
                                    this.contextReceiverTypeId_.add(Integer.valueOf(eVar.s()));
                                case 106:
                                    int j11 = eVar.j(eVar.A());
                                    int i14 = (c11 == true ? 1 : 0) & 512;
                                    c11 = c11;
                                    if (i14 != 512) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.contextReceiverTypeId_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.contextReceiverTypeId_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                case R.styleable.Theme_drawable_walk_sound4 /* 248 */:
                                    int i15 = (c11 == true ? 1 : 0) & 8192;
                                    c11 = c11;
                                    if (i15 != 8192) {
                                        this.versionRequirement_ = new ArrayList();
                                        c11 = (c11 == true ? 1 : 0) | 8192;
                                    }
                                    this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                case 250:
                                    int j12 = eVar.j(eVar.A());
                                    int i16 = (c11 == true ? 1 : 0) & 8192;
                                    c11 = c11;
                                    if (i16 != 8192) {
                                        c11 = c11;
                                        if (eVar.e() > 0) {
                                            this.versionRequirement_ = new ArrayList();
                                            c11 = (c11 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (eVar.e() > 0) {
                                        this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j12);
                                default:
                                    r52 = parseUnknownField(eVar, J, fVar, K);
                                    if (r52 == 0) {
                                        z11 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((c11 == true ? 1 : 0) & 32) == 32) {
                            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                        }
                        if (((c11 == true ? 1 : 0) & 256) == r52) {
                            this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                        }
                        if (((c11 == true ? 1 : 0) & 512) == 512) {
                            this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                        }
                        if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } else {
                    if (((c11 == true ? 1 : 0) & 32) == 32) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if (((c11 == true ? 1 : 0) & 256) == 256) {
                        this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                    }
                    if (((c11 == true ? 1 : 0) & 512) == 512) {
                        this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                    }
                    if (((c11 == true ? 1 : 0) & 8192) == 8192) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.unknownFields = q11.j();
                        throw th4;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    return;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<Property, b> implements m {

            /* renamed from: d, reason: collision with root package name */
            public int f67393d;

            /* renamed from: g, reason: collision with root package name */
            public int f67396g;

            /* renamed from: i, reason: collision with root package name */
            public int f67398i;

            /* renamed from: j, reason: collision with root package name */
            public List<TypeParameter> f67399j;

            /* renamed from: k, reason: collision with root package name */
            public Type f67400k;

            /* renamed from: l, reason: collision with root package name */
            public int f67401l;

            /* renamed from: m, reason: collision with root package name */
            public List<Type> f67402m;

            /* renamed from: n, reason: collision with root package name */
            public List<Integer> f67403n;

            /* renamed from: o, reason: collision with root package name */
            public ValueParameter f67404o;

            /* renamed from: p, reason: collision with root package name */
            public int f67405p;

            /* renamed from: q, reason: collision with root package name */
            public int f67406q;

            /* renamed from: r, reason: collision with root package name */
            public List<Integer> f67407r;

            /* renamed from: e, reason: collision with root package name */
            public int f67394e = com.badlogic.gdx.graphics.f.f11614k2;

            /* renamed from: f, reason: collision with root package name */
            public int f67395f = 2054;

            /* renamed from: h, reason: collision with root package name */
            public Type f67397h = Type.getDefaultInstance();

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67399j = list;
                this.f67400k = Type.getDefaultInstance();
                this.f67402m = list;
                this.f67403n = list;
                this.f67404o = ValueParameter.getDefaultInstance();
                this.f67407r = list;
                Q();
            }

            public static b u() {
                return new b();
            }

            private void v() {
                if ((this.f67393d & 512) != 512) {
                    this.f67403n = new ArrayList(this.f67403n);
                    this.f67393d |= 512;
                }
            }

            private void w() {
                if ((this.f67393d & 256) != 256) {
                    this.f67402m = new ArrayList(this.f67402m);
                    this.f67393d |= 256;
                }
            }

            private void x() {
                if ((this.f67393d & 32) != 32) {
                    this.f67399j = new ArrayList(this.f67399j);
                    this.f67393d |= 32;
                }
            }

            private void y() {
                if ((this.f67393d & 8192) != 8192) {
                    this.f67407r = new ArrayList(this.f67407r);
                    this.f67393d |= 8192;
                }
            }

            public int A() {
                return this.f67402m.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            public Type E() {
                return this.f67400k;
            }

            public Type F() {
                return this.f67397h;
            }

            public ValueParameter G() {
                return this.f67404o;
            }

            public TypeParameter J(int i11) {
                return this.f67399j.get(i11);
            }

            public int K() {
                return this.f67399j.size();
            }

            public boolean M() {
                return (this.f67393d & 4) == 4;
            }

            public boolean N() {
                return (this.f67393d & 64) == 64;
            }

            public boolean O() {
                return (this.f67393d & 8) == 8;
            }

            public boolean P() {
                return (this.f67393d & 1024) == 1024;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public b g(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    Z(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    c0(property.getOldFlags());
                }
                if (property.hasName()) {
                    b0(property.getName());
                }
                if (property.hasReturnType()) {
                    X(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    f0(property.getReturnTypeId());
                }
                if (!property.typeParameter_.isEmpty()) {
                    if (this.f67399j.isEmpty()) {
                        this.f67399j = property.typeParameter_;
                        this.f67393d &= -33;
                    } else {
                        x();
                        this.f67399j.addAll(property.typeParameter_);
                    }
                }
                if (property.hasReceiverType()) {
                    W(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    e0(property.getReceiverTypeId());
                }
                if (!property.contextReceiverType_.isEmpty()) {
                    if (this.f67402m.isEmpty()) {
                        this.f67402m = property.contextReceiverType_;
                        this.f67393d &= -257;
                    } else {
                        w();
                        this.f67402m.addAll(property.contextReceiverType_);
                    }
                }
                if (!property.contextReceiverTypeId_.isEmpty()) {
                    if (this.f67403n.isEmpty()) {
                        this.f67403n = property.contextReceiverTypeId_;
                        this.f67393d &= -513;
                    } else {
                        v();
                        this.f67403n.addAll(property.contextReceiverTypeId_);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    Y(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    a0(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    g0(property.getSetterFlags());
                }
                if (!property.versionRequirement_.isEmpty()) {
                    if (this.f67407r.isEmpty()) {
                        this.f67407r = property.versionRequirement_;
                        this.f67393d &= -8193;
                    } else {
                        y();
                        this.f67407r.addAll(property.versionRequirement_);
                    }
                }
                o(property);
                h(f().b(property.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$b");
            }

            public b W(Type type) {
                if ((this.f67393d & 64) != 64 || this.f67400k == Type.getDefaultInstance()) {
                    this.f67400k = type;
                } else {
                    this.f67400k = Type.newBuilder(this.f67400k).g(type).s();
                }
                this.f67393d |= 64;
                return this;
            }

            public b X(Type type) {
                if ((this.f67393d & 8) != 8 || this.f67397h == Type.getDefaultInstance()) {
                    this.f67397h = type;
                } else {
                    this.f67397h = Type.newBuilder(this.f67397h).g(type).s();
                }
                this.f67393d |= 8;
                return this;
            }

            public b Y(ValueParameter valueParameter) {
                if ((this.f67393d & 1024) != 1024 || this.f67404o == ValueParameter.getDefaultInstance()) {
                    this.f67404o = valueParameter;
                } else {
                    this.f67404o = ValueParameter.newBuilder(this.f67404o).g(valueParameter).s();
                }
                this.f67393d |= 1024;
                return this;
            }

            public b Z(int i11) {
                this.f67393d |= 1;
                this.f67394e = i11;
                return this;
            }

            public b a0(int i11) {
                this.f67393d |= 2048;
                this.f67405p = i11;
                return this;
            }

            public b b0(int i11) {
                this.f67393d |= 4;
                this.f67396g = i11;
                return this;
            }

            public b c0(int i11) {
                this.f67393d |= 2;
                this.f67395f = i11;
                return this;
            }

            public b e0(int i11) {
                this.f67393d |= 128;
                this.f67401l = i11;
                return this;
            }

            public b f0(int i11) {
                this.f67393d |= 16;
                this.f67398i = i11;
                return this;
            }

            public b g0(int i11) {
                this.f67393d |= 4096;
                this.f67406q = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!M()) {
                    return false;
                }
                if (O() && !F().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < K(); i11++) {
                    if (!J(i11).isInitialized()) {
                        return false;
                    }
                }
                if (N() && !E().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < A(); i12++) {
                    if (!z(i12).isInitialized()) {
                        return false;
                    }
                }
                return (!P() || G().isInitialized()) && n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Property build() {
                Property s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public Property s() {
                Property property = new Property(this);
                int i11 = this.f67393d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                property.flags_ = this.f67394e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                property.oldFlags_ = this.f67395f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                property.name_ = this.f67396g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                property.returnType_ = this.f67397h;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                property.returnTypeId_ = this.f67398i;
                if ((this.f67393d & 32) == 32) {
                    this.f67399j = Collections.unmodifiableList(this.f67399j);
                    this.f67393d &= -33;
                }
                property.typeParameter_ = this.f67399j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                property.receiverType_ = this.f67400k;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                property.receiverTypeId_ = this.f67401l;
                if ((this.f67393d & 256) == 256) {
                    this.f67402m = Collections.unmodifiableList(this.f67402m);
                    this.f67393d &= -257;
                }
                property.contextReceiverType_ = this.f67402m;
                if ((this.f67393d & 512) == 512) {
                    this.f67403n = Collections.unmodifiableList(this.f67403n);
                    this.f67393d &= -513;
                }
                property.contextReceiverTypeId_ = this.f67403n;
                if ((i11 & 1024) == 1024) {
                    i12 |= 128;
                }
                property.setterValueParameter_ = this.f67404o;
                if ((i11 & 2048) == 2048) {
                    i12 |= 256;
                }
                property.getterFlags_ = this.f67405p;
                if ((i11 & 4096) == 4096) {
                    i12 |= 512;
                }
                property.setterFlags_ = this.f67406q;
                if ((this.f67393d & 8192) == 8192) {
                    this.f67407r = Collections.unmodifiableList(this.f67407r);
                    this.f67393d &= -8193;
                }
                property.versionRequirement_ = this.f67407r;
                property.bitField0_ = i12;
                return property;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public Type z(int i11) {
                return this.f67402m.get(i11);
            }

            private void Q() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class QualifiedNameTable extends GeneratedMessageLite implements o {
        public static p<QualifiedNameTable> PARSER = new a();
        private static final QualifiedNameTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<QualifiedName> qualifiedName_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class QualifiedName extends GeneratedMessageLite implements n {
            public static p<QualifiedName> PARSER = new a();
            private static final QualifiedName defaultInstance;
            private int bitField0_;
            private Kind kind_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int parentQualifiedName_;
            private int shortName_;
            private final d unknownFields;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public enum Kind implements h.a {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);

                private static h.b<Kind> internalValueMap = new a();
                private final int value;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static class a implements h.b<Kind> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Kind findValueByNumber(int i11) {
                        return Kind.valueOf(i11);
                    }
                }

                Kind(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i11) {
                    if (i11 == 0) {
                        return CLASS;
                    }
                    if (i11 == 1) {
                        return PACKAGE;
                    }
                    if (i11 != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public QualifiedName d(e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new QualifiedName(eVar, fVar);
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                defaultInstance = qualifiedName;
                qualifiedName.initFields();
            }

            public static QualifiedName getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.parentQualifiedName_ = -1;
                this.shortName_ = 0;
                this.kind_ = Kind.PACKAGE;
            }

            public static b newBuilder() {
                return b.n();
            }

            public Kind getKind() {
                return this.kind_;
            }

            public int getParentQualifiedName() {
                return this.parentQualifiedName_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public p<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.parentQualifiedName_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    o11 += CodedOutputStream.o(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    o11 += CodedOutputStream.h(3, this.kind_.getNumber());
                }
                int size = o11 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getShortName() {
                return this.shortName_;
            }

            public boolean hasKind() {
                return (this.bitField0_ & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                byte b11 = this.memoizedIsInitialized;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.a0(1, this.parentQualifiedName_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.a0(2, this.shortName_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.S(3, this.kind_.getNumber());
                }
                codedOutputStream.i0(this.unknownFields);
            }

            public static b newBuilder(QualifiedName qualifiedName) {
                return newBuilder().g(qualifiedName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public QualifiedName getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public b newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public b toBuilder() {
                return newBuilder(this);
            }

            private QualifiedName(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.f();
            }

            private QualifiedName(boolean z11) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = d.f67542a;
            }

            private QualifiedName(e eVar, f fVar) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                d.b q11 = d.q();
                CodedOutputStream J = CodedOutputStream.J(q11, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            try {
                                int K = eVar.K();
                                if (K != 0) {
                                    if (K == 8) {
                                        this.bitField0_ |= 1;
                                        this.parentQualifiedName_ = eVar.s();
                                    } else if (K == 16) {
                                        this.bitField0_ |= 2;
                                        this.shortName_ = eVar.s();
                                    } else if (K != 24) {
                                        if (!parseUnknownField(eVar, J, fVar, K)) {
                                        }
                                    } else {
                                        int n11 = eVar.n();
                                        Kind valueOf = Kind.valueOf(n11);
                                        if (valueOf == null) {
                                            J.o0(K);
                                            J.o0(n11);
                                        } else {
                                            this.bitField0_ |= 4;
                                            this.kind_ = valueOf;
                                        }
                                    }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            }
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.unknownFields = q11.j();
                    throw th4;
                }
                this.unknownFields = q11.j();
                makeExtensionsImmutable();
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class b extends GeneratedMessageLite.b<QualifiedName, b> implements n {

                /* renamed from: b, reason: collision with root package name */
                public int f67408b;

                /* renamed from: d, reason: collision with root package name */
                public int f67410d;

                /* renamed from: c, reason: collision with root package name */
                public int f67409c = -1;

                /* renamed from: e, reason: collision with root package name */
                public Kind f67411e = Kind.PACKAGE;

                public b() {
                    q();
                }

                public static b n() {
                    return new b();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean isInitialized() {
                    return p();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public QualifiedName build() {
                    QualifiedName l11 = l();
                    if (l11.isInitialized()) {
                        return l11;
                    }
                    throw a.AbstractC0798a.c(l11);
                }

                public QualifiedName l() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i11 = this.f67408b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    qualifiedName.parentQualifiedName_ = this.f67409c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    qualifiedName.shortName_ = this.f67410d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    qualifiedName.kind_ = this.f67411e;
                    qualifiedName.bitField0_ = i12;
                    return qualifiedName;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public b l() {
                    return n().g(l());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                public boolean p() {
                    return (this.f67408b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public b g(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        v(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        w(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        u(qualifiedName.getKind());
                    }
                    h(f().b(qualifiedName.unknownFields));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.g(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.g(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$b");
                }

                public b u(Kind kind) {
                    kind.getClass();
                    this.f67408b |= 4;
                    this.f67411e = kind;
                    return this;
                }

                public b v(int i11) {
                    this.f67408b |= 1;
                    this.f67409c = i11;
                    return this;
                }

                public b w(int i11) {
                    this.f67408b |= 2;
                    this.f67410d = i11;
                    return this;
                }

                private void q() {
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(eVar, fVar);
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            defaultInstance = qualifiedNameTable;
            qualifiedNameTable.initFields();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.qualifiedName_ = Collections.EMPTY_LIST;
        }

        public static b newBuilder() {
            return b.n();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i11) {
            return this.qualifiedName_.get(i11);
        }

        public int getQualifiedNameCount() {
            return this.qualifiedName_.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.qualifiedName_.size(); i13++) {
                i12 += CodedOutputStream.s(1, this.qualifiedName_.get(i13));
            }
            int size = i12 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getQualifiedNameCount(); i11++) {
                if (!getQualifiedName(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.qualifiedName_.size(); i11++) {
                codedOutputStream.d0(1, this.qualifiedName_.get(i11));
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().g(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public QualifiedNameTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private QualifiedNameTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private QualifiedNameTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private QualifiedNameTable(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 10) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.qualifiedName_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.qualifiedName_.add(eVar.u(QualifiedName.PARSER, fVar));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<QualifiedNameTable, b> implements o {

            /* renamed from: b, reason: collision with root package name */
            public int f67412b;

            /* renamed from: c, reason: collision with root package name */
            public List<QualifiedName> f67413c = Collections.EMPTY_LIST;

            public b() {
                t();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < s(); i11++) {
                    if (!q(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable build() {
                QualifiedNameTable l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public QualifiedNameTable l() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f67412b & 1) == 1) {
                    this.f67413c = Collections.unmodifiableList(this.f67413c);
                    this.f67412b &= -2;
                }
                qualifiedNameTable.qualifiedName_ = this.f67413c;
                return qualifiedNameTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67412b & 1) != 1) {
                    this.f67413c = new ArrayList(this.f67413c);
                    this.f67412b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            public QualifiedName q(int i11) {
                return this.f67413c.get(i11);
            }

            public int s() {
                return this.f67413c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b g(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.f67413c.isEmpty()) {
                        this.f67413c = qualifiedNameTable.qualifiedName_;
                        this.f67412b &= -2;
                    } else {
                        o();
                        this.f67413c.addAll(qualifiedNameTable.qualifiedName_);
                    }
                }
                h(f().b(qualifiedNameTable.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b");
            }

            private void t() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StringTable extends GeneratedMessageLite implements i20.p {
        public static p<StringTable> PARSER = new a();
        private static final StringTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private kotlin.reflect.jvm.internal.impl.protobuf.l string_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTable d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new StringTable(eVar, fVar);
            }
        }

        static {
            StringTable stringTable = new StringTable(true);
            defaultInstance = stringTable;
            stringTable.initFields();
        }

        public static StringTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.string_ = kotlin.reflect.jvm.internal.impl.protobuf.k.f67584b;
        }

        public static b newBuilder() {
            return b.n();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.string_.size(); i13++) {
                i12 += CodedOutputStream.e(this.string_.getByteString(i13));
            }
            int size = i12 + getStringList().size() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public String getString(int i11) {
            return this.string_.get(i11);
        }

        public q getStringList() {
            return this.string_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.string_.size(); i11++) {
                codedOutputStream.O(1, this.string_.getByteString(i11));
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(StringTable stringTable) {
            return newBuilder().g(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public StringTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private StringTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private StringTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private StringTable(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 10) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    d l11 = eVar.l();
                                    if (!z12) {
                                        this.string_ = new kotlin.reflect.jvm.internal.impl.protobuf.k();
                                        z12 = true;
                                    }
                                    this.string_.E0(l11);
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.string_ = this.string_.getUnmodifiableView();
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.string_ = this.string_.getUnmodifiableView();
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<StringTable, b> implements i20.p {

            /* renamed from: b, reason: collision with root package name */
            public int f67414b;

            /* renamed from: c, reason: collision with root package name */
            public kotlin.reflect.jvm.internal.impl.protobuf.l f67415c = kotlin.reflect.jvm.internal.impl.protobuf.k.f67584b;

            public b() {
                q();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public StringTable build() {
                StringTable l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public StringTable l() {
                StringTable stringTable = new StringTable(this);
                if ((this.f67414b & 1) == 1) {
                    this.f67415c = this.f67415c.getUnmodifiableView();
                    this.f67414b &= -2;
                }
                stringTable.string_ = this.f67415c;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67414b & 1) != 1) {
                    this.f67415c = new kotlin.reflect.jvm.internal.impl.protobuf.k(this.f67415c);
                    this.f67414b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b g(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.string_.isEmpty()) {
                    if (this.f67415c.isEmpty()) {
                        this.f67415c = stringTable.string_;
                        this.f67414b &= -2;
                    } else {
                        o();
                        this.f67415c.addAll(stringTable.string_);
                    }
                }
                h(f().b(stringTable.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b");
            }

            private void q() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements s {
        public static p<Type> PARSER = new a();
        private static final Type defaultInstance;
        private int abbreviatedTypeId_;
        private Type abbreviatedType_;
        private List<Argument> argument_;
        private int bitField0_;
        private int className_;
        private int flags_;
        private int flexibleTypeCapabilitiesId_;
        private int flexibleUpperBoundId_;
        private Type flexibleUpperBound_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private boolean nullable_;
        private int outerTypeId_;
        private Type outerType_;
        private int typeAliasName_;
        private int typeParameterName_;
        private int typeParameter_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Argument extends GeneratedMessageLite implements i20.q {
            public static p<Argument> PARSER = new a();
            private static final Argument defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Projection projection_;
            private int typeId_;
            private Type type_;
            private final d unknownFields;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public enum Projection implements h.a {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);

                private static h.b<Projection> internalValueMap = new a();
                private final int value;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static class a implements h.b<Projection> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Projection findValueByNumber(int i11) {
                        return Projection.valueOf(i11);
                    }
                }

                Projection(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i11) {
                    if (i11 == 0) {
                        return IN;
                    }
                    if (i11 == 1) {
                        return OUT;
                    }
                    if (i11 == 2) {
                        return INV;
                    }
                    if (i11 != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument d(e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new Argument(eVar, fVar);
                }
            }

            static {
                Argument argument = new Argument(true);
                defaultInstance = argument;
                argument.initFields();
            }

            public static Argument getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.projection_ = Projection.INV;
                this.type_ = Type.getDefaultInstance();
                this.typeId_ = 0;
            }

            public static b newBuilder() {
                return b.n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public p<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.projection_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int h11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.h(1, this.projection_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    h11 += CodedOutputStream.s(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    h11 += CodedOutputStream.o(3, this.typeId_);
                }
                int size = h11 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public Type getType() {
                return this.type_;
            }

            public int getTypeId() {
                return this.typeId_;
            }

            public boolean hasProjection() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasType() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                byte b11 = this.memoizedIsInitialized;
                if (b11 == 1) {
                    return true;
                }
                if (b11 == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.S(1, this.projection_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.d0(2, this.type_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.a0(3, this.typeId_);
                }
                codedOutputStream.i0(this.unknownFields);
            }

            public static b newBuilder(Argument argument) {
                return newBuilder().g(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public Argument getDefaultInstanceForType() {
                return defaultInstance;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public b newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public b toBuilder() {
                return newBuilder(this);
            }

            private Argument(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.f();
            }

            private Argument(boolean z11) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = d.f67542a;
            }

            private Argument(e eVar, f fVar) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                initFields();
                d.b q11 = d.q();
                CodedOutputStream J = CodedOutputStream.J(q11, 1);
                boolean z11 = false;
                while (!z11) {
                    try {
                        try {
                            try {
                                int K = eVar.K();
                                if (K != 0) {
                                    if (K == 8) {
                                        int n11 = eVar.n();
                                        Projection valueOf = Projection.valueOf(n11);
                                        if (valueOf == null) {
                                            J.o0(K);
                                            J.o0(n11);
                                        } else {
                                            this.bitField0_ |= 1;
                                            this.projection_ = valueOf;
                                        }
                                    } else if (K == 18) {
                                        b builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                                        Type type = (Type) eVar.u(Type.PARSER, fVar);
                                        this.type_ = type;
                                        if (builder != null) {
                                            builder.g(type);
                                            this.type_ = builder.s();
                                        }
                                        this.bitField0_ |= 2;
                                    } else if (K != 24) {
                                        if (!parseUnknownField(eVar, J, fVar, K)) {
                                        }
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.typeId_ = eVar.s();
                                    }
                                }
                                z11 = true;
                            } catch (InvalidProtocolBufferException e11) {
                                throw e11.setUnfinishedMessage(this);
                            }
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                try {
                    J.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.unknownFields = q11.j();
                    throw th4;
                }
                this.unknownFields = q11.j();
                makeExtensionsImmutable();
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class b extends GeneratedMessageLite.b<Argument, b> implements i20.q {

                /* renamed from: b, reason: collision with root package name */
                public int f67416b;

                /* renamed from: c, reason: collision with root package name */
                public Projection f67417c = Projection.INV;

                /* renamed from: d, reason: collision with root package name */
                public Type f67418d = Type.getDefaultInstance();

                /* renamed from: e, reason: collision with root package name */
                public int f67419e;

                public b() {
                    s();
                }

                public static b n() {
                    return new b();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
                public final boolean isInitialized() {
                    return !q() || p().isInitialized();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument l11 = l();
                    if (l11.isInitialized()) {
                        return l11;
                    }
                    throw a.AbstractC0798a.c(l11);
                }

                public Argument l() {
                    Argument argument = new Argument(this);
                    int i11 = this.f67416b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    argument.projection_ = this.f67417c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    argument.type_ = this.f67418d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    argument.typeId_ = this.f67419e;
                    argument.bitField0_ = i12;
                    return argument;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public b l() {
                    return n().g(l());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                public Type p() {
                    return this.f67418d;
                }

                public boolean q() {
                    return (this.f67416b & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public b g(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        w(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        v(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        x(argument.getTypeId());
                    }
                    h(f().b(argument.unknownFields));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.g(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.g(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$b");
                }

                public b v(Type type) {
                    if ((this.f67416b & 2) != 2 || this.f67418d == Type.getDefaultInstance()) {
                        this.f67418d = type;
                    } else {
                        this.f67418d = Type.newBuilder(this.f67418d).g(type).s();
                    }
                    this.f67416b |= 2;
                    return this;
                }

                public b w(Projection projection) {
                    projection.getClass();
                    this.f67416b |= 1;
                    this.f67417c = projection;
                    return this;
                }

                public b x(int i11) {
                    this.f67416b |= 4;
                    this.f67419e = i11;
                    return this;
                }

                private void s() {
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Type d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new Type(eVar, fVar);
            }
        }

        static {
            Type type = new Type(true);
            defaultInstance = type;
            type.initFields();
        }

        public static Type getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.argument_ = Collections.EMPTY_LIST;
            this.nullable_ = false;
            this.flexibleTypeCapabilitiesId_ = 0;
            this.flexibleUpperBound_ = getDefaultInstance();
            this.flexibleUpperBoundId_ = 0;
            this.className_ = 0;
            this.typeParameter_ = 0;
            this.typeParameterName_ = 0;
            this.typeAliasName_ = 0;
            this.outerType_ = getDefaultInstance();
            this.outerTypeId_ = 0;
            this.abbreviatedType_ = getDefaultInstance();
            this.abbreviatedTypeId_ = 0;
            this.flags_ = 0;
        }

        public static b newBuilder() {
            return b.u();
        }

        public Type getAbbreviatedType() {
            return this.abbreviatedType_;
        }

        public int getAbbreviatedTypeId() {
            return this.abbreviatedTypeId_;
        }

        public Argument getArgument(int i11) {
            return this.argument_.get(i11);
        }

        public int getArgumentCount() {
            return this.argument_.size();
        }

        public List<Argument> getArgumentList() {
            return this.argument_;
        }

        public int getClassName() {
            return this.className_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.flexibleTypeCapabilitiesId_;
        }

        public Type getFlexibleUpperBound() {
            return this.flexibleUpperBound_;
        }

        public int getFlexibleUpperBoundId() {
            return this.flexibleUpperBoundId_;
        }

        public boolean getNullable() {
            return this.nullable_;
        }

        public Type getOuterType() {
            return this.outerType_;
        }

        public int getOuterTypeId() {
            return this.outerTypeId_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 4096) == 4096 ? CodedOutputStream.o(1, this.flags_) : 0;
            for (int i12 = 0; i12 < this.argument_.size(); i12++) {
                o11 += CodedOutputStream.s(2, this.argument_.get(i12));
            }
            if ((this.bitField0_ & 1) == 1) {
                o11 += CodedOutputStream.a(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.s(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.o(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                o11 += CodedOutputStream.o(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.o(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                o11 += CodedOutputStream.o(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                o11 += CodedOutputStream.s(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                o11 += CodedOutputStream.o(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                o11 += CodedOutputStream.o(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                o11 += CodedOutputStream.s(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                o11 += CodedOutputStream.o(14, this.abbreviatedTypeId_);
            }
            int extensionsSerializedSize = o11 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public int getTypeAliasName() {
            return this.typeAliasName_;
        }

        public int getTypeParameter() {
            return this.typeParameter_;
        }

        public int getTypeParameterName() {
            return this.typeParameterName_;
        }

        public boolean hasAbbreviatedType() {
            return (this.bitField0_ & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.bitField0_ & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.bitField0_ & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.bitField0_ & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.bitField0_ & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getArgumentCount(); i11++) {
                if (!getArgument(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.a0(1, this.flags_);
            }
            for (int i11 = 0; i11 < this.argument_.size(); i11++) {
                codedOutputStream.d0(2, this.argument_.get(i11));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.L(3, this.nullable_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(4, this.flexibleTypeCapabilitiesId_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.d0(5, this.flexibleUpperBound_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.a0(6, this.className_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.a0(7, this.typeParameter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.a0(8, this.flexibleUpperBoundId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.a0(9, this.typeParameterName_);
            }
            if ((this.bitField0_ & 256) == 256) {
                codedOutputStream.d0(10, this.outerType_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.a0(11, this.outerTypeId_);
            }
            if ((this.bitField0_ & 128) == 128) {
                codedOutputStream.a0(12, this.typeAliasName_);
            }
            if ((this.bitField0_ & 1024) == 1024) {
                codedOutputStream.d0(13, this.abbreviatedType_);
            }
            if ((this.bitField0_ & 2048) == 2048) {
                codedOutputStream.a0(14, this.abbreviatedTypeId_);
            }
            newExtensionWriter.a(200, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(Type type) {
            return newBuilder().g(type);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public Type getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private Type(GeneratedMessageLite.c<Type, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private Type(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Type(e eVar, f fVar) throws InvalidProtocolBufferException {
            b builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z11 = true;
                                case 8:
                                    this.bitField0_ |= 4096;
                                    this.flags_ = eVar.s();
                                case 18:
                                    if (!z12) {
                                        this.argument_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.argument_.add(eVar.u(Argument.PARSER, fVar));
                                case 24:
                                    this.bitField0_ |= 1;
                                    this.nullable_ = eVar.k();
                                case 32:
                                    this.bitField0_ |= 2;
                                    this.flexibleTypeCapabilitiesId_ = eVar.s();
                                case 42:
                                    builder = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : null;
                                    Type type = (Type) eVar.u(PARSER, fVar);
                                    this.flexibleUpperBound_ = type;
                                    if (builder != null) {
                                        builder.g(type);
                                        this.flexibleUpperBound_ = builder.s();
                                    }
                                    this.bitField0_ |= 4;
                                case 48:
                                    this.bitField0_ |= 16;
                                    this.className_ = eVar.s();
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.typeParameter_ = eVar.s();
                                case 64:
                                    this.bitField0_ |= 8;
                                    this.flexibleUpperBoundId_ = eVar.s();
                                case 72:
                                    this.bitField0_ |= 64;
                                    this.typeParameterName_ = eVar.s();
                                case 82:
                                    builder = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : null;
                                    Type type2 = (Type) eVar.u(PARSER, fVar);
                                    this.outerType_ = type2;
                                    if (builder != null) {
                                        builder.g(type2);
                                        this.outerType_ = builder.s();
                                    }
                                    this.bitField0_ |= 256;
                                case 88:
                                    this.bitField0_ |= 512;
                                    this.outerTypeId_ = eVar.s();
                                case 96:
                                    this.bitField0_ |= 128;
                                    this.typeAliasName_ = eVar.s();
                                case 106:
                                    builder = (this.bitField0_ & 1024) == 1024 ? this.abbreviatedType_.toBuilder() : null;
                                    Type type3 = (Type) eVar.u(PARSER, fVar);
                                    this.abbreviatedType_ = type3;
                                    if (builder != null) {
                                        builder.g(type3);
                                        this.abbreviatedType_ = builder.s();
                                    }
                                    this.bitField0_ |= 1024;
                                case 112:
                                    this.bitField0_ |= 2048;
                                    this.abbreviatedTypeId_ = eVar.s();
                                default:
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                        z11 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.argument_ = Collections.unmodifiableList(this.argument_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.argument_ = Collections.unmodifiableList(this.argument_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<Type, b> implements s {

            /* renamed from: d, reason: collision with root package name */
            public int f67420d;

            /* renamed from: f, reason: collision with root package name */
            public boolean f67422f;

            /* renamed from: g, reason: collision with root package name */
            public int f67423g;

            /* renamed from: i, reason: collision with root package name */
            public int f67425i;

            /* renamed from: j, reason: collision with root package name */
            public int f67426j;

            /* renamed from: k, reason: collision with root package name */
            public int f67427k;

            /* renamed from: l, reason: collision with root package name */
            public int f67428l;

            /* renamed from: m, reason: collision with root package name */
            public int f67429m;

            /* renamed from: o, reason: collision with root package name */
            public int f67431o;

            /* renamed from: q, reason: collision with root package name */
            public int f67433q;

            /* renamed from: r, reason: collision with root package name */
            public int f67434r;

            /* renamed from: e, reason: collision with root package name */
            public List<Argument> f67421e = Collections.EMPTY_LIST;

            /* renamed from: h, reason: collision with root package name */
            public Type f67424h = Type.getDefaultInstance();

            /* renamed from: n, reason: collision with root package name */
            public Type f67430n = Type.getDefaultInstance();

            /* renamed from: p, reason: collision with root package name */
            public Type f67432p = Type.getDefaultInstance();

            public b() {
                J();
            }

            public static b u() {
                return new b();
            }

            private void v() {
                if ((this.f67420d & 1) != 1) {
                    this.f67421e = new ArrayList(this.f67421e);
                    this.f67420d |= 1;
                }
            }

            public Type A() {
                return this.f67424h;
            }

            public Type B() {
                return this.f67430n;
            }

            public boolean E() {
                return (this.f67420d & 2048) == 2048;
            }

            public boolean F() {
                return (this.f67420d & 8) == 8;
            }

            public boolean G() {
                return (this.f67420d & 512) == 512;
            }

            public b K(Type type) {
                if ((this.f67420d & 2048) != 2048 || this.f67432p == Type.getDefaultInstance()) {
                    this.f67432p = type;
                } else {
                    this.f67432p = Type.newBuilder(this.f67432p).g(type).s();
                }
                this.f67420d |= 2048;
                return this;
            }

            public b M(Type type) {
                if ((this.f67420d & 8) != 8 || this.f67424h == Type.getDefaultInstance()) {
                    this.f67424h = type;
                } else {
                    this.f67424h = Type.newBuilder(this.f67424h).g(type).s();
                }
                this.f67420d |= 8;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public b g(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.argument_.isEmpty()) {
                    if (this.f67421e.isEmpty()) {
                        this.f67421e = type.argument_;
                        this.f67420d &= -2;
                    } else {
                        v();
                        this.f67421e.addAll(type.argument_);
                    }
                }
                if (type.hasNullable()) {
                    Y(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    W(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    M(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    X(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    R(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    b0(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    c0(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    a0(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    P(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    Z(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    K(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    Q(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    T(type.getFlags());
                }
                o(type);
                h(f().b(type.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: O, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b");
            }

            public b P(Type type) {
                if ((this.f67420d & 512) != 512 || this.f67430n == Type.getDefaultInstance()) {
                    this.f67430n = type;
                } else {
                    this.f67430n = Type.newBuilder(this.f67430n).g(type).s();
                }
                this.f67420d |= 512;
                return this;
            }

            public b Q(int i11) {
                this.f67420d |= 4096;
                this.f67433q = i11;
                return this;
            }

            public b R(int i11) {
                this.f67420d |= 32;
                this.f67426j = i11;
                return this;
            }

            public b T(int i11) {
                this.f67420d |= 8192;
                this.f67434r = i11;
                return this;
            }

            public b W(int i11) {
                this.f67420d |= 4;
                this.f67423g = i11;
                return this;
            }

            public b X(int i11) {
                this.f67420d |= 16;
                this.f67425i = i11;
                return this;
            }

            public b Y(boolean z11) {
                this.f67420d |= 2;
                this.f67422f = z11;
                return this;
            }

            public b Z(int i11) {
                this.f67420d |= 1024;
                this.f67431o = i11;
                return this;
            }

            public b a0(int i11) {
                this.f67420d |= 256;
                this.f67429m = i11;
                return this;
            }

            public b b0(int i11) {
                this.f67420d |= 64;
                this.f67427k = i11;
                return this;
            }

            public b c0(int i11) {
                this.f67420d |= 128;
                this.f67428l = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < y(); i11++) {
                    if (!x(i11).isInitialized()) {
                        return false;
                    }
                }
                if (F() && !A().isInitialized()) {
                    return false;
                }
                if (!G() || B().isInitialized()) {
                    return (!E() || w().isInitialized()) && n();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Type build() {
                Type s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public Type s() {
                Type type = new Type(this);
                int i11 = this.f67420d;
                if ((i11 & 1) == 1) {
                    this.f67421e = Collections.unmodifiableList(this.f67421e);
                    this.f67420d &= -2;
                }
                type.argument_ = this.f67421e;
                int i12 = (i11 & 2) != 2 ? 0 : 1;
                type.nullable_ = this.f67422f;
                if ((i11 & 4) == 4) {
                    i12 |= 2;
                }
                type.flexibleTypeCapabilitiesId_ = this.f67423g;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                type.flexibleUpperBound_ = this.f67424h;
                if ((i11 & 16) == 16) {
                    i12 |= 8;
                }
                type.flexibleUpperBoundId_ = this.f67425i;
                if ((i11 & 32) == 32) {
                    i12 |= 16;
                }
                type.className_ = this.f67426j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                type.typeParameter_ = this.f67427k;
                if ((i11 & 128) == 128) {
                    i12 |= 64;
                }
                type.typeParameterName_ = this.f67428l;
                if ((i11 & 256) == 256) {
                    i12 |= 128;
                }
                type.typeAliasName_ = this.f67429m;
                if ((i11 & 512) == 512) {
                    i12 |= 256;
                }
                type.outerType_ = this.f67430n;
                if ((i11 & 1024) == 1024) {
                    i12 |= 512;
                }
                type.outerTypeId_ = this.f67431o;
                if ((i11 & 2048) == 2048) {
                    i12 |= 1024;
                }
                type.abbreviatedType_ = this.f67432p;
                if ((i11 & 4096) == 4096) {
                    i12 |= 2048;
                }
                type.abbreviatedTypeId_ = this.f67433q;
                if ((i11 & 8192) == 8192) {
                    i12 |= 4096;
                }
                type.flags_ = this.f67434r;
                type.bitField0_ = i12;
                return type;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public Type w() {
                return this.f67432p;
            }

            public Argument x(int i11) {
                return this.f67421e.get(i11);
            }

            public int y() {
                return this.f67421e.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            private void J() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements r {
        public static p<TypeAlias> PARSER = new a();
        private static final TypeAlias defaultInstance;
        private List<Annotation> annotation_;
        private int bitField0_;
        private int expandedTypeId_;
        private Type expandedType_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private List<TypeParameter> typeParameter_;
        private int underlyingTypeId_;
        private Type underlyingType_;
        private final d unknownFields;
        private List<Integer> versionRequirement_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeAlias d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new TypeAlias(eVar, fVar);
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            defaultInstance = typeAlias;
            typeAlias.initFields();
        }

        public static TypeAlias getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 6;
            this.name_ = 0;
            List list = Collections.EMPTY_LIST;
            this.typeParameter_ = list;
            this.underlyingType_ = Type.getDefaultInstance();
            this.underlyingTypeId_ = 0;
            this.expandedType_ = Type.getDefaultInstance();
            this.expandedTypeId_ = 0;
            this.annotation_ = list;
            this.versionRequirement_ = list;
        }

        public static b newBuilder() {
            return b.u();
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, f fVar) throws IOException {
            return PARSER.a(inputStream, fVar);
        }

        public Annotation getAnnotation(int i11) {
            return this.annotation_.get(i11);
        }

        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public Type getExpandedType() {
            return this.expandedType_;
        }

        public int getExpandedTypeId() {
            return this.expandedTypeId_;
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.name_);
            }
            for (int i12 = 0; i12 < this.typeParameter_.size(); i12++) {
                o11 += CodedOutputStream.s(3, this.typeParameter_.get(i12));
            }
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.s(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.o(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.s(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                o11 += CodedOutputStream.o(7, this.expandedTypeId_);
            }
            for (int i13 = 0; i13 < this.annotation_.size(); i13++) {
                o11 += CodedOutputStream.s(8, this.annotation_.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.versionRequirement_.size(); i15++) {
                i14 += CodedOutputStream.p(this.versionRequirement_.get(i15).intValue());
            }
            int size = o11 + i14 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public TypeParameter getTypeParameter(int i11) {
            return this.typeParameter_.get(i11);
        }

        public int getTypeParameterCount() {
            return this.typeParameter_.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.typeParameter_;
        }

        public Type getUnderlyingType() {
            return this.underlyingType_;
        }

        public int getUnderlyingTypeId() {
            return this.underlyingTypeId_;
        }

        public List<Integer> getVersionRequirementList() {
            return this.versionRequirement_;
        }

        public boolean hasExpandedType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getTypeParameterCount(); i11++) {
                if (!getTypeParameter(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < getAnnotationCount(); i12++) {
                if (!getAnnotation(i12).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.name_);
            }
            for (int i11 = 0; i11 < this.typeParameter_.size(); i11++) {
                codedOutputStream.d0(3, this.typeParameter_.get(i11));
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.d0(4, this.underlyingType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.a0(5, this.underlyingTypeId_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.d0(6, this.expandedType_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.a0(7, this.expandedTypeId_);
            }
            for (int i12 = 0; i12 < this.annotation_.size(); i12++) {
                codedOutputStream.d0(8, this.annotation_.get(i12));
            }
            for (int i13 = 0; i13 < this.versionRequirement_.size(); i13++) {
                codedOutputStream.a0(31, this.versionRequirement_.get(i13).intValue());
            }
            newExtensionWriter.a(200, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(TypeAlias typeAlias) {
            return newBuilder().g(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public TypeAlias getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private TypeAlias(GeneratedMessageLite.c<TypeAlias, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private TypeAlias(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private TypeAlias(e eVar, f fVar) throws InvalidProtocolBufferException {
            Type.b builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                ?? r52 = 128;
                if (!z11) {
                    try {
                        try {
                            int K = eVar.K();
                            switch (K) {
                                case 0:
                                    z11 = true;
                                case 8:
                                    this.bitField0_ |= 1;
                                    this.flags_ = eVar.s();
                                case 16:
                                    this.bitField0_ |= 2;
                                    this.name_ = eVar.s();
                                case 26:
                                    if ((i11 & 4) != 4) {
                                        this.typeParameter_ = new ArrayList();
                                        i11 |= 4;
                                    }
                                    this.typeParameter_.add(eVar.u(TypeParameter.PARSER, fVar));
                                case 34:
                                    builder = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : null;
                                    Type type = (Type) eVar.u(Type.PARSER, fVar);
                                    this.underlyingType_ = type;
                                    if (builder != null) {
                                        builder.g(type);
                                        this.underlyingType_ = builder.s();
                                    }
                                    this.bitField0_ |= 4;
                                case 40:
                                    this.bitField0_ |= 8;
                                    this.underlyingTypeId_ = eVar.s();
                                case 50:
                                    builder = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : null;
                                    Type type2 = (Type) eVar.u(Type.PARSER, fVar);
                                    this.expandedType_ = type2;
                                    if (builder != null) {
                                        builder.g(type2);
                                        this.expandedType_ = builder.s();
                                    }
                                    this.bitField0_ |= 16;
                                case 56:
                                    this.bitField0_ |= 32;
                                    this.expandedTypeId_ = eVar.s();
                                case 66:
                                    if ((i11 & 128) != 128) {
                                        this.annotation_ = new ArrayList();
                                        i11 |= 128;
                                    }
                                    this.annotation_.add(eVar.u(Annotation.PARSER, fVar));
                                case R.styleable.Theme_drawable_walk_sound4 /* 248 */:
                                    if ((i11 & 256) != 256) {
                                        this.versionRequirement_ = new ArrayList();
                                        i11 |= 256;
                                    }
                                    this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                case 250:
                                    int j11 = eVar.j(eVar.A());
                                    if ((i11 & 256) != 256 && eVar.e() > 0) {
                                        this.versionRequirement_ = new ArrayList();
                                        i11 |= 256;
                                    }
                                    while (eVar.e() > 0) {
                                        this.versionRequirement_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                    break;
                                default:
                                    r52 = parseUnknownField(eVar, J, fVar, K);
                                    if (r52 == 0) {
                                        z11 = true;
                                    }
                            }
                        } catch (Throwable th2) {
                            if ((i11 & 4) == 4) {
                                this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                            }
                            if ((i11 & 128) == r52) {
                                this.annotation_ = Collections.unmodifiableList(this.annotation_);
                            }
                            if ((i11 & 256) == 256) {
                                this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                            }
                            try {
                                J.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.unknownFields = q11.j();
                                throw th3;
                            }
                            this.unknownFields = q11.j();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } else {
                    if ((i11 & 4) == 4) {
                        this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                    }
                    if ((i11 & 128) == 128) {
                        this.annotation_ = Collections.unmodifiableList(this.annotation_);
                    }
                    if ((i11 & 256) == 256) {
                        this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.unknownFields = q11.j();
                        throw th4;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    return;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<TypeAlias, b> implements r {

            /* renamed from: d, reason: collision with root package name */
            public int f67435d;

            /* renamed from: e, reason: collision with root package name */
            public int f67436e = 6;

            /* renamed from: f, reason: collision with root package name */
            public int f67437f;

            /* renamed from: g, reason: collision with root package name */
            public List<TypeParameter> f67438g;

            /* renamed from: h, reason: collision with root package name */
            public Type f67439h;

            /* renamed from: i, reason: collision with root package name */
            public int f67440i;

            /* renamed from: j, reason: collision with root package name */
            public Type f67441j;

            /* renamed from: k, reason: collision with root package name */
            public int f67442k;

            /* renamed from: l, reason: collision with root package name */
            public List<Annotation> f67443l;

            /* renamed from: m, reason: collision with root package name */
            public List<Integer> f67444m;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67438g = list;
                this.f67439h = Type.getDefaultInstance();
                this.f67441j = Type.getDefaultInstance();
                this.f67443l = list;
                this.f67444m = list;
                N();
            }

            public static b u() {
                return new b();
            }

            private void w() {
                if ((this.f67435d & 4) != 4) {
                    this.f67438g = new ArrayList(this.f67438g);
                    this.f67435d |= 4;
                }
            }

            private void x() {
                if ((this.f67435d & 256) != 256) {
                    this.f67444m = new ArrayList(this.f67444m);
                    this.f67435d |= 256;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            public Type B() {
                return this.f67441j;
            }

            public TypeParameter E(int i11) {
                return this.f67438g.get(i11);
            }

            public int F() {
                return this.f67438g.size();
            }

            public Type G() {
                return this.f67439h;
            }

            public boolean J() {
                return (this.f67435d & 32) == 32;
            }

            public boolean K() {
                return (this.f67435d & 2) == 2;
            }

            public boolean M() {
                return (this.f67435d & 8) == 8;
            }

            public b O(Type type) {
                if ((this.f67435d & 32) != 32 || this.f67441j == Type.getDefaultInstance()) {
                    this.f67441j = type;
                } else {
                    this.f67441j = Type.newBuilder(this.f67441j).g(type).s();
                }
                this.f67435d |= 32;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: P, reason: merged with bridge method [inline-methods] */
            public b g(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    W(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    X(typeAlias.getName());
                }
                if (!typeAlias.typeParameter_.isEmpty()) {
                    if (this.f67438g.isEmpty()) {
                        this.f67438g = typeAlias.typeParameter_;
                        this.f67435d &= -5;
                    } else {
                        w();
                        this.f67438g.addAll(typeAlias.typeParameter_);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    R(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    Y(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    O(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    T(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.annotation_.isEmpty()) {
                    if (this.f67443l.isEmpty()) {
                        this.f67443l = typeAlias.annotation_;
                        this.f67435d &= -129;
                    } else {
                        v();
                        this.f67443l.addAll(typeAlias.annotation_);
                    }
                }
                if (!typeAlias.versionRequirement_.isEmpty()) {
                    if (this.f67444m.isEmpty()) {
                        this.f67444m = typeAlias.versionRequirement_;
                        this.f67435d &= -257;
                    } else {
                        x();
                        this.f67444m.addAll(typeAlias.versionRequirement_);
                    }
                }
                o(typeAlias);
                h(f().b(typeAlias.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: Q, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$b");
            }

            public b R(Type type) {
                if ((this.f67435d & 8) != 8 || this.f67439h == Type.getDefaultInstance()) {
                    this.f67439h = type;
                } else {
                    this.f67439h = Type.newBuilder(this.f67439h).g(type).s();
                }
                this.f67435d |= 8;
                return this;
            }

            public b T(int i11) {
                this.f67435d |= 64;
                this.f67442k = i11;
                return this;
            }

            public b W(int i11) {
                this.f67435d |= 1;
                this.f67436e = i11;
                return this;
            }

            public b X(int i11) {
                this.f67435d |= 2;
                this.f67437f = i11;
                return this;
            }

            public b Y(int i11) {
                this.f67435d |= 16;
                this.f67440i = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!K()) {
                    return false;
                }
                for (int i11 = 0; i11 < F(); i11++) {
                    if (!E(i11).isInitialized()) {
                        return false;
                    }
                }
                if (M() && !G().isInitialized()) {
                    return false;
                }
                if (J() && !B().isInitialized()) {
                    return false;
                }
                for (int i12 = 0; i12 < z(); i12++) {
                    if (!y(i12).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeAlias build() {
                TypeAlias s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public TypeAlias s() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i11 = this.f67435d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                typeAlias.flags_ = this.f67436e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                typeAlias.name_ = this.f67437f;
                if ((this.f67435d & 4) == 4) {
                    this.f67438g = Collections.unmodifiableList(this.f67438g);
                    this.f67435d &= -5;
                }
                typeAlias.typeParameter_ = this.f67438g;
                if ((i11 & 8) == 8) {
                    i12 |= 4;
                }
                typeAlias.underlyingType_ = this.f67439h;
                if ((i11 & 16) == 16) {
                    i12 |= 8;
                }
                typeAlias.underlyingTypeId_ = this.f67440i;
                if ((i11 & 32) == 32) {
                    i12 |= 16;
                }
                typeAlias.expandedType_ = this.f67441j;
                if ((i11 & 64) == 64) {
                    i12 |= 32;
                }
                typeAlias.expandedTypeId_ = this.f67442k;
                if ((this.f67435d & 128) == 128) {
                    this.f67443l = Collections.unmodifiableList(this.f67443l);
                    this.f67435d &= -129;
                }
                typeAlias.annotation_ = this.f67443l;
                if ((this.f67435d & 256) == 256) {
                    this.f67444m = Collections.unmodifiableList(this.f67444m);
                    this.f67435d &= -257;
                }
                typeAlias.versionRequirement_ = this.f67444m;
                typeAlias.bitField0_ = i12;
                return typeAlias;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public final void v() {
                if ((this.f67435d & 128) != 128) {
                    this.f67443l = new ArrayList(this.f67443l);
                    this.f67435d |= 128;
                }
            }

            public Annotation y(int i11) {
                return this.f67443l.get(i11);
            }

            public int z() {
                return this.f67443l.size();
            }

            private void N() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements t {
        public static p<TypeParameter> PARSER = new a();
        private static final TypeParameter defaultInstance;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private boolean reified_;
        private final d unknownFields;
        private int upperBoundIdMemoizedSerializedSize;
        private List<Integer> upperBoundId_;
        private List<Type> upperBound_;
        private Variance variance_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum Variance implements h.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);

            private static h.b<Variance> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<Variance> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Variance findValueByNumber(int i11) {
                    return Variance.valueOf(i11);
                }
            }

            Variance(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i11) {
                if (i11 == 0) {
                    return IN;
                }
                if (i11 == 1) {
                    return OUT;
                }
                if (i11 != 2) {
                    return null;
                }
                return INV;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeParameter d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new TypeParameter(eVar, fVar);
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            defaultInstance = typeParameter;
            typeParameter.initFields();
        }

        public static TypeParameter getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.id_ = 0;
            this.name_ = 0;
            this.reified_ = false;
            this.variance_ = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.upperBound_ = list;
            this.upperBoundId_ = list;
        }

        public static b newBuilder() {
            return b.u();
        }

        public int getId() {
            return this.id_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.reified_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.id_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.a(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.h(4, this.variance_.getNumber());
            }
            for (int i12 = 0; i12 < this.upperBound_.size(); i12++) {
                o11 += CodedOutputStream.s(5, this.upperBound_.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.upperBoundId_.size(); i14++) {
                i13 += CodedOutputStream.p(this.upperBoundId_.get(i14).intValue());
            }
            int i15 = o11 + i13;
            if (!getUpperBoundIdList().isEmpty()) {
                i15 = i15 + 1 + CodedOutputStream.p(i13);
            }
            this.upperBoundIdMemoizedSerializedSize = i13;
            int extensionsSerializedSize = i15 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public Type getUpperBound(int i11) {
            return this.upperBound_.get(i11);
        }

        public int getUpperBoundCount() {
            return this.upperBound_.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.upperBoundId_;
        }

        public List<Type> getUpperBoundList() {
            return this.upperBound_;
        }

        public Variance getVariance() {
            return this.variance_;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasReified() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getUpperBoundCount(); i11++) {
                if (!getUpperBound(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.id_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.L(3, this.reified_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.S(4, this.variance_.getNumber());
            }
            for (int i11 = 0; i11 < this.upperBound_.size(); i11++) {
                codedOutputStream.d0(5, this.upperBound_.get(i11));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.o0(50);
                codedOutputStream.o0(this.upperBoundIdMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.upperBoundId_.size(); i12++) {
                codedOutputStream.b0(this.upperBoundId_.get(i12).intValue());
            }
            newExtensionWriter.a(1000, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(TypeParameter typeParameter) {
            return newBuilder().g(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public TypeParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private TypeParameter(GeneratedMessageLite.c<TypeParameter, ?> cVar) {
            super(cVar);
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private TypeParameter(boolean z11) {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeParameter(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.upperBoundIdMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.bitField0_ |= 1;
                                this.id_ = eVar.s();
                            } else if (K == 16) {
                                this.bitField0_ |= 2;
                                this.name_ = eVar.s();
                            } else if (K == 24) {
                                this.bitField0_ |= 4;
                                this.reified_ = eVar.k();
                            } else if (K == 32) {
                                int n11 = eVar.n();
                                Variance valueOf = Variance.valueOf(n11);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(n11);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.variance_ = valueOf;
                                }
                            } else if (K == 42) {
                                if ((i11 & 16) != 16) {
                                    this.upperBound_ = new ArrayList();
                                    i11 |= 16;
                                }
                                this.upperBound_.add(eVar.u(Type.PARSER, fVar));
                            } else if (K == 48) {
                                if ((i11 & 32) != 32) {
                                    this.upperBoundId_ = new ArrayList();
                                    i11 |= 32;
                                }
                                this.upperBoundId_.add(Integer.valueOf(eVar.s()));
                            } else if (K != 50) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j11 = eVar.j(eVar.A());
                                if ((i11 & 32) != 32 && eVar.e() > 0) {
                                    this.upperBoundId_ = new ArrayList();
                                    i11 |= 32;
                                }
                                while (eVar.e() > 0) {
                                    this.upperBoundId_.add(Integer.valueOf(eVar.s()));
                                }
                                eVar.i(j11);
                            }
                        }
                        z11 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i11 & 16) == 16) {
                        this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                    }
                    if ((i11 & 32) == 32) {
                        this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i11 & 16) == 16) {
                this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
            }
            if ((i11 & 32) == 32) {
                this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<TypeParameter, b> implements t {

            /* renamed from: d, reason: collision with root package name */
            public int f67445d;

            /* renamed from: e, reason: collision with root package name */
            public int f67446e;

            /* renamed from: f, reason: collision with root package name */
            public int f67447f;

            /* renamed from: g, reason: collision with root package name */
            public boolean f67448g;

            /* renamed from: h, reason: collision with root package name */
            public Variance f67449h = Variance.INV;

            /* renamed from: i, reason: collision with root package name */
            public List<Type> f67450i;

            /* renamed from: j, reason: collision with root package name */
            public List<Integer> f67451j;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67450i = list;
                this.f67451j = list;
                E();
            }

            public static b u() {
                return new b();
            }

            public boolean A() {
                return (this.f67445d & 1) == 1;
            }

            public boolean B() {
                return (this.f67445d & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public b g(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    J(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    K(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    M(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    N(typeParameter.getVariance());
                }
                if (!typeParameter.upperBound_.isEmpty()) {
                    if (this.f67450i.isEmpty()) {
                        this.f67450i = typeParameter.upperBound_;
                        this.f67445d &= -17;
                    } else {
                        w();
                        this.f67450i.addAll(typeParameter.upperBound_);
                    }
                }
                if (!typeParameter.upperBoundId_.isEmpty()) {
                    if (this.f67451j.isEmpty()) {
                        this.f67451j = typeParameter.upperBoundId_;
                        this.f67445d &= -33;
                    } else {
                        v();
                        this.f67451j.addAll(typeParameter.upperBoundId_);
                    }
                }
                o(typeParameter);
                h(f().b(typeParameter.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$b");
            }

            public b J(int i11) {
                this.f67445d |= 1;
                this.f67446e = i11;
                return this;
            }

            public b K(int i11) {
                this.f67445d |= 2;
                this.f67447f = i11;
                return this;
            }

            public b M(boolean z11) {
                this.f67445d |= 4;
                this.f67448g = z11;
                return this;
            }

            public b N(Variance variance) {
                variance.getClass();
                this.f67445d |= 8;
                this.f67449h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!A() || !B()) {
                    return false;
                }
                for (int i11 = 0; i11 < z(); i11++) {
                    if (!y(i11).isInitialized()) {
                        return false;
                    }
                }
                return n();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeParameter build() {
                TypeParameter s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public TypeParameter s() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i11 = this.f67445d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                typeParameter.id_ = this.f67446e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                typeParameter.name_ = this.f67447f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                typeParameter.reified_ = this.f67448g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                typeParameter.variance_ = this.f67449h;
                if ((this.f67445d & 16) == 16) {
                    this.f67450i = Collections.unmodifiableList(this.f67450i);
                    this.f67445d &= -17;
                }
                typeParameter.upperBound_ = this.f67450i;
                if ((this.f67445d & 32) == 32) {
                    this.f67451j = Collections.unmodifiableList(this.f67451j);
                    this.f67445d &= -33;
                }
                typeParameter.upperBoundId_ = this.f67451j;
                typeParameter.bitField0_ = i12;
                return typeParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            public final void v() {
                if ((this.f67445d & 32) != 32) {
                    this.f67451j = new ArrayList(this.f67451j);
                    this.f67445d |= 32;
                }
            }

            public final void w() {
                if ((this.f67445d & 16) != 16) {
                    this.f67450i = new ArrayList(this.f67450i);
                    this.f67445d |= 16;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            public Type y(int i11) {
                return this.f67450i.get(i11);
            }

            public int z() {
                return this.f67450i.size();
            }

            private void E() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TypeTable extends GeneratedMessageLite implements u {
        public static p<TypeTable> PARSER = new a();
        private static final TypeTable defaultInstance;
        private int bitField0_;
        private int firstNullable_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Type> type_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeTable d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new TypeTable(eVar, fVar);
            }
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            defaultInstance = typeTable;
            typeTable.initFields();
        }

        public static TypeTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.type_ = Collections.EMPTY_LIST;
            this.firstNullable_ = -1;
        }

        public static b newBuilder() {
            return b.n();
        }

        public int getFirstNullable() {
            return this.firstNullable_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                i12 += CodedOutputStream.s(1, this.type_.get(i13));
            }
            if ((this.bitField0_ & 1) == 1) {
                i12 += CodedOutputStream.o(2, this.firstNullable_);
            }
            int size = i12 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public Type getType(int i11) {
            return this.type_.get(i11);
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public List<Type> getTypeList() {
            return this.type_;
        }

        public boolean hasFirstNullable() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            for (int i11 = 0; i11 < getTypeCount(); i11++) {
                if (!getType(i11).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.type_.size(); i11++) {
                codedOutputStream.d0(1, this.type_.get(i11));
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(2, this.firstNullable_);
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(TypeTable typeTable) {
            return newBuilder().g(typeTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public TypeTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private TypeTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private TypeTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeTable(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 10) {
                                if (!z12) {
                                    this.type_ = new ArrayList();
                                    z12 = true;
                                }
                                this.type_.add(eVar.u(Type.PARSER, fVar));
                            } else if (K != 16) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = eVar.s();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        if (z12) {
                            this.type_ = Collections.unmodifiableList(this.type_);
                        }
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z12) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<TypeTable, b> implements u {

            /* renamed from: b, reason: collision with root package name */
            public int f67452b;

            /* renamed from: c, reason: collision with root package name */
            public List<Type> f67453c = Collections.EMPTY_LIST;

            /* renamed from: d, reason: collision with root package name */
            public int f67454d = -1;

            public b() {
                t();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                for (int i11 = 0; i11 < s(); i11++) {
                    if (!q(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public TypeTable build() {
                TypeTable l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public TypeTable l() {
                TypeTable typeTable = new TypeTable(this);
                int i11 = this.f67452b;
                if ((i11 & 1) == 1) {
                    this.f67453c = Collections.unmodifiableList(this.f67453c);
                    this.f67452b &= -2;
                }
                typeTable.type_ = this.f67453c;
                int i12 = (i11 & 2) != 2 ? 0 : 1;
                typeTable.firstNullable_ = this.f67454d;
                typeTable.bitField0_ = i12;
                return typeTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67452b & 1) != 1) {
                    this.f67453c = new ArrayList(this.f67453c);
                    this.f67452b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            public Type q(int i11) {
                return this.f67453c.get(i11);
            }

            public int s() {
                return this.f67453c.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b g(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.type_.isEmpty()) {
                    if (this.f67453c.isEmpty()) {
                        this.f67453c = typeTable.type_;
                        this.f67452b &= -2;
                    } else {
                        o();
                        this.f67453c.addAll(typeTable.type_);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    w(typeTable.getFirstNullable());
                }
                h(f().b(typeTable.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b");
            }

            public b w(int i11) {
                this.f67452b |= 2;
                this.f67454d = i11;
                return this;
            }

            private void t() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements v {
        public static p<ValueParameter> PARSER = new a();
        private static final ValueParameter defaultInstance;
        private int bitField0_;
        private int flags_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private int typeId_;
        private Type type_;
        private final d unknownFields;
        private int varargElementTypeId_;
        private Type varargElementType_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public ValueParameter d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new ValueParameter(eVar, fVar);
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            defaultInstance = valueParameter;
            valueParameter.initFields();
        }

        public static ValueParameter getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.flags_ = 0;
            this.name_ = 0;
            this.type_ = Type.getDefaultInstance();
            this.typeId_ = 0;
            this.varargElementType_ = Type.getDefaultInstance();
            this.varargElementTypeId_ = 0;
        }

        public static b newBuilder() {
            return b.u();
        }

        public int getFlags() {
            return this.flags_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.flags_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.s(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.s(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.o(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                o11 += CodedOutputStream.o(6, this.varargElementTypeId_);
            }
            int extensionsSerializedSize = o11 + extensionsSerializedSize() + this.unknownFields.size();
            this.memoizedSerializedSize = extensionsSerializedSize;
            return extensionsSerializedSize;
        }

        public Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public Type getVarargElementType() {
            return this.varargElementType_;
        }

        public int getVarargElementTypeId() {
            return this.varargElementTypeId_;
        }

        public boolean hasFlags() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasName() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasType() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.a newExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.flags_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.name_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.d0(3, this.type_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.d0(4, this.varargElementType_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.a0(5, this.typeId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.a0(6, this.varargElementTypeId_);
            }
            newExtensionWriter.a(200, codedOutputStream);
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(ValueParameter valueParameter) {
            return newBuilder().g(valueParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public ValueParameter getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private ValueParameter(GeneratedMessageLite.c<ValueParameter, ?> cVar) {
            super(cVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = cVar.f();
        }

        private ValueParameter(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private ValueParameter(e eVar, f fVar) throws InvalidProtocolBufferException {
            Type.b builder;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = eVar.s();
                            } else if (K != 16) {
                                if (K == 26) {
                                    builder = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : null;
                                    Type type = (Type) eVar.u(Type.PARSER, fVar);
                                    this.type_ = type;
                                    if (builder != null) {
                                        builder.g(type);
                                        this.type_ = builder.s();
                                    }
                                    this.bitField0_ |= 4;
                                } else if (K == 34) {
                                    builder = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : null;
                                    Type type2 = (Type) eVar.u(Type.PARSER, fVar);
                                    this.varargElementType_ = type2;
                                    if (builder != null) {
                                        builder.g(type2);
                                        this.varargElementType_ = builder.s();
                                    }
                                    this.bitField0_ |= 16;
                                } else if (K == 40) {
                                    this.bitField0_ |= 8;
                                    this.typeId_ = eVar.s();
                                } else if (K != 48) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    this.bitField0_ |= 32;
                                    this.varargElementTypeId_ = eVar.s();
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.name_ = eVar.s();
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.c<ValueParameter, b> implements v {

            /* renamed from: d, reason: collision with root package name */
            public int f67455d;

            /* renamed from: e, reason: collision with root package name */
            public int f67456e;

            /* renamed from: f, reason: collision with root package name */
            public int f67457f;

            /* renamed from: h, reason: collision with root package name */
            public int f67459h;

            /* renamed from: j, reason: collision with root package name */
            public int f67461j;

            /* renamed from: g, reason: collision with root package name */
            public Type f67458g = Type.getDefaultInstance();

            /* renamed from: i, reason: collision with root package name */
            public Type f67460i = Type.getDefaultInstance();

            public b() {
                B();
            }

            public static b u() {
                return new b();
            }

            public boolean A() {
                return (this.f67455d & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public b g(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    K(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    M(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    G(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    N(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    J(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    O(valueParameter.getVarargElementTypeId());
                }
                o(valueParameter);
                h(f().b(valueParameter.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b");
            }

            public b G(Type type) {
                if ((this.f67455d & 4) != 4 || this.f67458g == Type.getDefaultInstance()) {
                    this.f67458g = type;
                } else {
                    this.f67458g = Type.newBuilder(this.f67458g).g(type).s();
                }
                this.f67455d |= 4;
                return this;
            }

            public b J(Type type) {
                if ((this.f67455d & 16) != 16 || this.f67460i == Type.getDefaultInstance()) {
                    this.f67460i = type;
                } else {
                    this.f67460i = Type.newBuilder(this.f67460i).g(type).s();
                }
                this.f67455d |= 16;
                return this;
            }

            public b K(int i11) {
                this.f67455d |= 1;
                this.f67456e = i11;
                return this;
            }

            public b M(int i11) {
                this.f67455d |= 2;
                this.f67457f = i11;
                return this;
            }

            public b N(int i11) {
                this.f67455d |= 8;
                this.f67459h = i11;
                return this;
            }

            public b O(int i11) {
                this.f67455d |= 32;
                this.f67461j = i11;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                if (!y()) {
                    return false;
                }
                if (!z() || w().isInitialized()) {
                    return (!A() || x().isInitialized()) && n();
                }
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public ValueParameter build() {
                ValueParameter s11 = s();
                if (s11.isInitialized()) {
                    return s11;
                }
                throw a.AbstractC0798a.c(s11);
            }

            public ValueParameter s() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i11 = this.f67455d;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                valueParameter.flags_ = this.f67456e;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                valueParameter.name_ = this.f67457f;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                valueParameter.type_ = this.f67458g;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                valueParameter.typeId_ = this.f67459h;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                valueParameter.varargElementType_ = this.f67460i;
                if ((i11 & 32) == 32) {
                    i12 |= 32;
                }
                valueParameter.varargElementTypeId_ = this.f67461j;
                valueParameter.bitField0_ = i12;
                return valueParameter;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.c
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b l() {
                return u().g(s());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            public Type w() {
                return this.f67458g;
            }

            public Type x() {
                return this.f67460i;
            }

            public boolean y() {
                return (this.f67455d & 2) == 2;
            }

            public boolean z() {
                return (this.f67455d & 4) == 4;
            }

            private void B() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VersionRequirement extends GeneratedMessageLite implements w {
        public static p<VersionRequirement> PARSER = new a();
        private static final VersionRequirement defaultInstance;
        private int bitField0_;
        private int errorCode_;
        private Level level_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int message_;
        private final d unknownFields;
        private int versionFull_;
        private VersionKind versionKind_;
        private int version_;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum Level implements h.a {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);

            private static h.b<Level> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<Level> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Level findValueByNumber(int i11) {
                    return Level.valueOf(i11);
                }
            }

            Level(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i11) {
                if (i11 == 0) {
                    return WARNING;
                }
                if (i11 == 1) {
                    return ERROR;
                }
                if (i11 != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum VersionKind implements h.a {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);

            private static h.b<VersionKind> internalValueMap = new a();
            private final int value;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a implements h.b<VersionKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public VersionKind findValueByNumber(int i11) {
                    return VersionKind.valueOf(i11);
                }
            }

            VersionKind(int i11, int i12) {
                this.value = i12;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i11) {
                if (i11 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i11 == 1) {
                    return COMPILER_VERSION;
                }
                if (i11 != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirement d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new VersionRequirement(eVar, fVar);
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            defaultInstance = versionRequirement;
            versionRequirement.initFields();
        }

        public static VersionRequirement getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.version_ = 0;
            this.versionFull_ = 0;
            this.level_ = Level.ERROR;
            this.errorCode_ = 0;
            this.message_ = 0;
            this.versionKind_ = VersionKind.LANGUAGE_VERSION;
        }

        public static b newBuilder() {
            return b.n();
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public Level getLevel() {
            return this.level_;
        }

        public int getMessage() {
            return this.message_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.version_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                o11 += CodedOutputStream.h(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                o11 += CodedOutputStream.o(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                o11 += CodedOutputStream.o(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                o11 += CodedOutputStream.h(6, this.versionKind_.getNumber());
            }
            int size = o11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getVersion() {
            return this.version_;
        }

        public int getVersionFull() {
            return this.versionFull_;
        }

        public VersionKind getVersionKind() {
            return this.versionKind_;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.version_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.versionFull_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.S(3, this.level_.getNumber());
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.a0(4, this.errorCode_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.a0(5, this.message_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.S(6, this.versionKind_.getNumber());
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().g(versionRequirement);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public VersionRequirement getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirement(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private VersionRequirement(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private VersionRequirement(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            while (!z11) {
                try {
                    try {
                        int K = eVar.K();
                        if (K != 0) {
                            if (K == 8) {
                                this.bitField0_ |= 1;
                                this.version_ = eVar.s();
                            } else if (K == 16) {
                                this.bitField0_ |= 2;
                                this.versionFull_ = eVar.s();
                            } else if (K == 24) {
                                int n11 = eVar.n();
                                Level valueOf = Level.valueOf(n11);
                                if (valueOf == null) {
                                    J.o0(K);
                                    J.o0(n11);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = valueOf;
                                }
                            } else if (K == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = eVar.s();
                            } else if (K == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = eVar.s();
                            } else if (K != 48) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                int n12 = eVar.n();
                                VersionKind valueOf2 = VersionKind.valueOf(n12);
                                if (valueOf2 == null) {
                                    J.o0(K);
                                    J.o0(n12);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = valueOf2;
                                }
                            }
                        }
                        z11 = true;
                    } catch (Throwable th2) {
                        try {
                            J.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.unknownFields = q11.j();
                            throw th3;
                        }
                        this.unknownFields = q11.j();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<VersionRequirement, b> implements w {

            /* renamed from: b, reason: collision with root package name */
            public int f67462b;

            /* renamed from: c, reason: collision with root package name */
            public int f67463c;

            /* renamed from: d, reason: collision with root package name */
            public int f67464d;

            /* renamed from: f, reason: collision with root package name */
            public int f67466f;

            /* renamed from: g, reason: collision with root package name */
            public int f67467g;

            /* renamed from: e, reason: collision with root package name */
            public Level f67465e = Level.ERROR;

            /* renamed from: h, reason: collision with root package name */
            public VersionKind f67468h = VersionKind.LANGUAGE_VERSION;

            public b() {
                p();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public VersionRequirement build() {
                VersionRequirement l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public VersionRequirement l() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i11 = this.f67462b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                versionRequirement.version_ = this.f67463c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                versionRequirement.versionFull_ = this.f67464d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                versionRequirement.level_ = this.f67465e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                versionRequirement.errorCode_ = this.f67466f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                versionRequirement.message_ = this.f67467g;
                if ((i11 & 32) == 32) {
                    i12 |= 32;
                }
                versionRequirement.versionKind_ = this.f67468h;
                versionRequirement.bitField0_ = i12;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b g(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    w(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    x(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    u(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    t(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    v(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    y(versionRequirement.getVersionKind());
                }
                h(f().b(versionRequirement.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$b");
            }

            public b t(int i11) {
                this.f67462b |= 8;
                this.f67466f = i11;
                return this;
            }

            public b u(Level level) {
                level.getClass();
                this.f67462b |= 4;
                this.f67465e = level;
                return this;
            }

            public b v(int i11) {
                this.f67462b |= 16;
                this.f67467g = i11;
                return this;
            }

            public b w(int i11) {
                this.f67462b |= 1;
                this.f67463c = i11;
                return this;
            }

            public b x(int i11) {
                this.f67462b |= 2;
                this.f67464d = i11;
                return this;
            }

            public b y(VersionKind versionKind) {
                versionKind.getClass();
                this.f67462b |= 32;
                this.f67468h = versionKind;
                return this;
            }

            private void p() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VersionRequirementTable extends GeneratedMessageLite implements x {
        public static p<VersionRequirementTable> PARSER = new a();
        private static final VersionRequirementTable defaultInstance;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<VersionRequirement> requirement_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(eVar, fVar);
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            defaultInstance = versionRequirementTable;
            versionRequirementTable.initFields();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.requirement_ = Collections.EMPTY_LIST;
        }

        public static b newBuilder() {
            return b.n();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.requirement_.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.requirement_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.requirement_.size(); i13++) {
                i12 += CodedOutputStream.s(1, this.requirement_.get(i13));
            }
            int size = i12 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public final boolean isInitialized() {
            byte b11 = this.memoizedIsInitialized;
            if (b11 == 1) {
                return true;
            }
            if (b11 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i11 = 0; i11 < this.requirement_.size(); i11++) {
                codedOutputStream.d0(1, this.requirement_.get(i11));
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().g(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public VersionRequirementTable getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public b toBuilder() {
            return newBuilder(this);
        }

        private VersionRequirementTable(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private VersionRequirementTable(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private VersionRequirementTable(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            d.b q11 = d.q();
            CodedOutputStream J = CodedOutputStream.J(q11, 1);
            boolean z11 = false;
            boolean z12 = false;
            while (!z11) {
                try {
                    try {
                        try {
                            int K = eVar.K();
                            if (K != 0) {
                                if (K != 10) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    if (!z12) {
                                        this.requirement_ = new ArrayList();
                                        z12 = true;
                                    }
                                    this.requirement_.add(eVar.u(VersionRequirement.PARSER, fVar));
                                }
                            }
                            z11 = true;
                        } catch (InvalidProtocolBufferException e11) {
                            throw e11.setUnfinishedMessage(this);
                        }
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z12) {
                        this.requirement_ = Collections.unmodifiableList(this.requirement_);
                    }
                    try {
                        J.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.unknownFields = q11.j();
                        throw th3;
                    }
                    this.unknownFields = q11.j();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z12) {
                this.requirement_ = Collections.unmodifiableList(this.requirement_);
            }
            try {
                J.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.unknownFields = q11.j();
                throw th4;
            }
            this.unknownFields = q11.j();
            makeExtensionsImmutable();
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b extends GeneratedMessageLite.b<VersionRequirementTable, b> implements x {

            /* renamed from: b, reason: collision with root package name */
            public int f67469b;

            /* renamed from: c, reason: collision with root package name */
            public List<VersionRequirement> f67470c = Collections.EMPTY_LIST;

            public b() {
                q();
            }

            public static b n() {
                return new b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable build() {
                VersionRequirementTable l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public VersionRequirementTable l() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f67469b & 1) == 1) {
                    this.f67470c = Collections.unmodifiableList(this.f67470c);
                    this.f67469b &= -2;
                }
                versionRequirementTable.requirement_ = this.f67470c;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67469b & 1) != 1) {
                    this.f67470c = new ArrayList(this.f67470c);
                    this.f67469b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public b g(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.requirement_.isEmpty()) {
                    if (this.f67470c.isEmpty()) {
                        this.f67470c = versionRequirementTable.requirement_;
                        this.f67469b &= -2;
                    } else {
                        o();
                        this.f67470c.addAll(versionRequirementTable.requirement_);
                    }
                }
                h(f().b(versionRequirementTable.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.g(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.n r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.g(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b");
            }

            private void q() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Visibility implements h.a {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);

        private static h.b<Visibility> internalValueMap = new a();
        private final int value;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements h.b<Visibility> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Visibility findValueByNumber(int i11) {
                return Visibility.valueOf(i11);
            }
        }

        Visibility(int i11, int i12) {
            this.value = i12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i11) {
            if (i11 == 0) {
                return INTERNAL;
            }
            if (i11 == 1) {
                return PRIVATE;
            }
            if (i11 == 2) {
                return PROTECTED;
            }
            if (i11 == 3) {
                return PUBLIC;
            }
            if (i11 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i11 != 5) {
                return null;
            }
            return LOCAL;
        }
    }
}
