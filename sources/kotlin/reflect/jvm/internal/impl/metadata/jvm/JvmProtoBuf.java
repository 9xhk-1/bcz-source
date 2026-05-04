package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.e;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.p;
import l20.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class JvmProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Constructor, JvmMethodSignature> f67471a;

    /* renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Function, JvmMethodSignature> f67472b;

    /* renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Function, Integer> f67473c;

    /* renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Property, JvmPropertySignature> f67474d;

    /* renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Property, Integer> f67475e;

    /* renamed from: f, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Type, List<ProtoBuf.Annotation>> f67476f;

    /* renamed from: g, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Type, Boolean> f67477g;

    /* renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f67478h;

    /* renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, Integer> f67479i;

    /* renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, List<ProtoBuf.Property>> f67480j;

    /* renamed from: k, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, Integer> f67481k;

    /* renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Class, Integer> f67482l;

    /* renamed from: m, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Package, Integer> f67483m;

    /* renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageLite.f<ProtoBuf.Package, List<ProtoBuf.Property>> f67484n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class JvmFieldSignature extends GeneratedMessageLite implements l20.a {
        public static p<JvmFieldSignature> PARSER = new a();
        private static final JvmFieldSignature defaultInstance;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(eVar, fVar);
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            defaultInstance = jvmFieldSignature;
            jvmFieldSignature.initFields();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public static b newBuilder() {
            return b.n();
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.desc_);
            }
            int size = o11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.desc_);
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().g(jvmFieldSignature);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public JvmFieldSignature getDefaultInstanceForType() {
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

        private JvmFieldSignature(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private JvmFieldSignature(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private JvmFieldSignature(e eVar, f fVar) throws InvalidProtocolBufferException {
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
                                this.name_ = eVar.s();
                            } else if (K != 16) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.desc_ = eVar.s();
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
        public static final class b extends GeneratedMessageLite.b<JvmFieldSignature, b> implements l20.a {

            /* renamed from: b, reason: collision with root package name */
            public int f67485b;

            /* renamed from: c, reason: collision with root package name */
            public int f67486c;

            /* renamed from: d, reason: collision with root package name */
            public int f67487d;

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
            public JvmFieldSignature build() {
                JvmFieldSignature l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public JvmFieldSignature l() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i11 = this.f67485b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.name_ = this.f67486c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                jvmFieldSignature.desc_ = this.f67487d;
                jvmFieldSignature.bitField0_ = i12;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b g(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    u(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    t(jvmFieldSignature.getDesc());
                }
                h(f().b(jvmFieldSignature.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b");
            }

            public b t(int i11) {
                this.f67485b |= 2;
                this.f67487d = i11;
                return this;
            }

            public b u(int i11) {
                this.f67485b |= 1;
                this.f67486c = i11;
                return this;
            }

            private void p() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class JvmMethodSignature extends GeneratedMessageLite implements l20.b {
        public static p<JvmMethodSignature> PARSER = new a();
        private static final JvmMethodSignature defaultInstance;
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(eVar, fVar);
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            defaultInstance = jvmMethodSignature;
            jvmMethodSignature.initFields();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public static b newBuilder() {
            return b.n();
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                o11 += CodedOutputStream.o(2, this.desc_);
            }
            int size = o11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) == 2;
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.a0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.a0(2, this.desc_);
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().g(jvmMethodSignature);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public JvmMethodSignature getDefaultInstanceForType() {
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

        private JvmMethodSignature(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private JvmMethodSignature(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private JvmMethodSignature(e eVar, f fVar) throws InvalidProtocolBufferException {
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
                                this.name_ = eVar.s();
                            } else if (K != 16) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.desc_ = eVar.s();
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
        public static final class b extends GeneratedMessageLite.b<JvmMethodSignature, b> implements l20.b {

            /* renamed from: b, reason: collision with root package name */
            public int f67488b;

            /* renamed from: c, reason: collision with root package name */
            public int f67489c;

            /* renamed from: d, reason: collision with root package name */
            public int f67490d;

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
            public JvmMethodSignature build() {
                JvmMethodSignature l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public JvmMethodSignature l() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i11 = this.f67488b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.name_ = this.f67489c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                jvmMethodSignature.desc_ = this.f67490d;
                jvmMethodSignature.bitField0_ = i12;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public b g(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    u(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    t(jvmMethodSignature.getDesc());
                }
                h(f().b(jvmMethodSignature.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b");
            }

            public b t(int i11) {
                this.f67488b |= 2;
                this.f67490d = i11;
                return this;
            }

            public b u(int i11) {
                this.f67488b |= 1;
                this.f67489c = i11;
                return this;
            }

            private void p() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class JvmPropertySignature extends GeneratedMessageLite implements c {
        public static p<JvmPropertySignature> PARSER = new a();
        private static final JvmPropertySignature defaultInstance;
        private int bitField0_;
        private JvmMethodSignature delegateMethod_;
        private JvmFieldSignature field_;
        private JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private JvmMethodSignature setter_;
        private JvmMethodSignature syntheticMethod_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(eVar, fVar);
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            defaultInstance = jvmPropertySignature;
            jvmPropertySignature.initFields();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.field_ = JvmFieldSignature.getDefaultInstance();
            this.syntheticMethod_ = JvmMethodSignature.getDefaultInstance();
            this.getter_ = JvmMethodSignature.getDefaultInstance();
            this.setter_ = JvmMethodSignature.getDefaultInstance();
            this.delegateMethod_ = JvmMethodSignature.getDefaultInstance();
        }

        public static b newBuilder() {
            return b.n();
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.delegateMethod_;
        }

        public JvmFieldSignature getField() {
            return this.field_;
        }

        public JvmMethodSignature getGetter() {
            return this.getter_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int s11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.s(1, this.field_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                s11 += CodedOutputStream.s(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                s11 += CodedOutputStream.s(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                s11 += CodedOutputStream.s(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                s11 += CodedOutputStream.s(5, this.delegateMethod_);
            }
            int size = s11 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.setter_;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.syntheticMethod_;
        }

        public boolean hasDelegateMethod() {
            return (this.bitField0_ & 16) == 16;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.bitField0_ & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.d0(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.d0(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.d0(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.d0(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.d0(5, this.delegateMethod_);
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().g(jvmPropertySignature);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public JvmPropertySignature getDefaultInstanceForType() {
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

        private JvmPropertySignature(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private JvmPropertySignature(boolean z11) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        private JvmPropertySignature(e eVar, f fVar) throws InvalidProtocolBufferException {
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
                            if (K == 10) {
                                JvmFieldSignature.b builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) eVar.u(JvmFieldSignature.PARSER, fVar);
                                this.field_ = jvmFieldSignature;
                                if (builder != null) {
                                    builder.g(jvmFieldSignature);
                                    this.field_ = builder.l();
                                }
                                this.bitField0_ |= 1;
                            } else if (K == 18) {
                                JvmMethodSignature.b builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) eVar.u(JvmMethodSignature.PARSER, fVar);
                                this.syntheticMethod_ = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.g(jvmMethodSignature);
                                    this.syntheticMethod_ = builder2.l();
                                }
                                this.bitField0_ |= 2;
                            } else if (K == 26) {
                                JvmMethodSignature.b builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) eVar.u(JvmMethodSignature.PARSER, fVar);
                                this.getter_ = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.g(jvmMethodSignature2);
                                    this.getter_ = builder3.l();
                                }
                                this.bitField0_ |= 4;
                            } else if (K == 34) {
                                JvmMethodSignature.b builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) eVar.u(JvmMethodSignature.PARSER, fVar);
                                this.setter_ = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.g(jvmMethodSignature3);
                                    this.setter_ = builder4.l();
                                }
                                this.bitField0_ |= 8;
                            } else if (K != 42) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                JvmMethodSignature.b builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) eVar.u(JvmMethodSignature.PARSER, fVar);
                                this.delegateMethod_ = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.g(jvmMethodSignature4);
                                    this.delegateMethod_ = builder5.l();
                                }
                                this.bitField0_ |= 16;
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
        public static final class b extends GeneratedMessageLite.b<JvmPropertySignature, b> implements c {

            /* renamed from: b, reason: collision with root package name */
            public int f67491b;

            /* renamed from: c, reason: collision with root package name */
            public JvmFieldSignature f67492c = JvmFieldSignature.getDefaultInstance();

            /* renamed from: d, reason: collision with root package name */
            public JvmMethodSignature f67493d = JvmMethodSignature.getDefaultInstance();

            /* renamed from: e, reason: collision with root package name */
            public JvmMethodSignature f67494e = JvmMethodSignature.getDefaultInstance();

            /* renamed from: f, reason: collision with root package name */
            public JvmMethodSignature f67495f = JvmMethodSignature.getDefaultInstance();

            /* renamed from: g, reason: collision with root package name */
            public JvmMethodSignature f67496g = JvmMethodSignature.getDefaultInstance();

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
            public JvmPropertySignature build() {
                JvmPropertySignature l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public JvmPropertySignature l() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i11 = this.f67491b;
                int i12 = (i11 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.field_ = this.f67492c;
                if ((i11 & 2) == 2) {
                    i12 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.f67493d;
                if ((i11 & 4) == 4) {
                    i12 |= 4;
                }
                jvmPropertySignature.getter_ = this.f67494e;
                if ((i11 & 8) == 8) {
                    i12 |= 8;
                }
                jvmPropertySignature.setter_ = this.f67495f;
                if ((i11 & 16) == 16) {
                    i12 |= 16;
                }
                jvmPropertySignature.delegateMethod_ = this.f67496g;
                jvmPropertySignature.bitField0_ = i12;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            public b q(JvmMethodSignature jvmMethodSignature) {
                if ((this.f67491b & 16) != 16 || this.f67496g == JvmMethodSignature.getDefaultInstance()) {
                    this.f67496g = jvmMethodSignature;
                } else {
                    this.f67496g = JvmMethodSignature.newBuilder(this.f67496g).g(jvmMethodSignature).l();
                }
                this.f67491b |= 16;
                return this;
            }

            public b s(JvmFieldSignature jvmFieldSignature) {
                if ((this.f67491b & 1) != 1 || this.f67492c == JvmFieldSignature.getDefaultInstance()) {
                    this.f67492c = jvmFieldSignature;
                } else {
                    this.f67492c = JvmFieldSignature.newBuilder(this.f67492c).g(jvmFieldSignature).l();
                }
                this.f67491b |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b g(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    s(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    x(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    v(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    w(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    q(jvmPropertySignature.getDelegateMethod());
                }
                h(f().b(jvmPropertySignature.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$b");
            }

            public b v(JvmMethodSignature jvmMethodSignature) {
                if ((this.f67491b & 4) != 4 || this.f67494e == JvmMethodSignature.getDefaultInstance()) {
                    this.f67494e = jvmMethodSignature;
                } else {
                    this.f67494e = JvmMethodSignature.newBuilder(this.f67494e).g(jvmMethodSignature).l();
                }
                this.f67491b |= 4;
                return this;
            }

            public b w(JvmMethodSignature jvmMethodSignature) {
                if ((this.f67491b & 8) != 8 || this.f67495f == JvmMethodSignature.getDefaultInstance()) {
                    this.f67495f = jvmMethodSignature;
                } else {
                    this.f67495f = JvmMethodSignature.newBuilder(this.f67495f).g(jvmMethodSignature).l();
                }
                this.f67491b |= 8;
                return this;
            }

            public b x(JvmMethodSignature jvmMethodSignature) {
                if ((this.f67491b & 2) != 2 || this.f67493d == JvmMethodSignature.getDefaultInstance()) {
                    this.f67493d = jvmMethodSignature;
                } else {
                    this.f67493d = JvmMethodSignature.newBuilder(this.f67493d).g(jvmMethodSignature).l();
                }
                this.f67491b |= 2;
                return this;
            }

            private void p() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StringTableTypes extends GeneratedMessageLite implements l20.e {
        public static p<StringTableTypes> PARSER = new a();
        private static final StringTableTypes defaultInstance;
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<Record> record_;
        private final d unknownFields;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Record extends GeneratedMessageLite implements l20.d {
            public static p<Record> PARSER = new a();
            private static final Record defaultInstance;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private Operation operation_;
            private int predefinedIndex_;
            private int range_;
            private int replaceCharMemoizedSerializedSize;
            private List<Integer> replaceChar_;
            private Object string_;
            private int substringIndexMemoizedSerializedSize;
            private List<Integer> substringIndex_;
            private final d unknownFields;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public enum Operation implements h.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static h.b<Operation> internalValueMap = new a();
                private final int value;

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                public static class a implements h.b<Operation> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Operation findValueByNumber(int i11) {
                        return Operation.valueOf(i11);
                    }
                }

                Operation(int i11, int i12) {
                    this.value = i12;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i11) {
                    if (i11 == 0) {
                        return NONE;
                    }
                    if (i11 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i11 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Record d(e eVar, f fVar) throws InvalidProtocolBufferException {
                    return new Record(eVar, fVar);
                }
            }

            static {
                Record record = new Record(true);
                defaultInstance = record;
                record.initFields();
            }

            public static Record getDefaultInstance() {
                return defaultInstance;
            }

            private void initFields() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.substringIndex_ = list;
                this.replaceChar_ = list;
            }

            public static b newBuilder() {
                return b.n();
            }

            public Operation getOperation() {
                return this.operation_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
            public p<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.predefinedIndex_;
            }

            public int getRange() {
                return this.range_;
            }

            public int getReplaceCharCount() {
                return this.replaceChar_.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.replaceChar_;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public int getSerializedSize() {
                int i11 = this.memoizedSerializedSize;
                if (i11 != -1) {
                    return i11;
                }
                int o11 = (this.bitField0_ & 1) == 1 ? CodedOutputStream.o(1, this.range_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    o11 += CodedOutputStream.o(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    o11 += CodedOutputStream.h(3, this.operation_.getNumber());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.substringIndex_.size(); i13++) {
                    i12 += CodedOutputStream.p(this.substringIndex_.get(i13).intValue());
                }
                int i14 = o11 + i12;
                if (!getSubstringIndexList().isEmpty()) {
                    i14 = i14 + 1 + CodedOutputStream.p(i12);
                }
                this.substringIndexMemoizedSerializedSize = i12;
                int i15 = 0;
                for (int i16 = 0; i16 < this.replaceChar_.size(); i16++) {
                    i15 += CodedOutputStream.p(this.replaceChar_.get(i16).intValue());
                }
                int i17 = i14 + i15;
                if (!getReplaceCharList().isEmpty()) {
                    i17 = i17 + 1 + CodedOutputStream.p(i15);
                }
                this.replaceCharMemoizedSerializedSize = i15;
                if ((this.bitField0_ & 4) == 4) {
                    i17 += CodedOutputStream.d(6, getStringBytes());
                }
                int size = i17 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                d dVar = (d) obj;
                String w11 = dVar.w();
                if (dVar.n()) {
                    this.string_ = w11;
                }
                return w11;
            }

            public d getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (d) obj;
                }
                d h11 = d.h((String) obj);
                this.string_ = h11;
                return h11;
            }

            public int getSubstringIndexCount() {
                return this.substringIndex_.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.substringIndex_;
            }

            public boolean hasOperation() {
                return (this.bitField0_ & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.bitField0_ & 2) == 2;
            }

            public boolean hasRange() {
                return (this.bitField0_ & 1) == 1;
            }

            public boolean hasString() {
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
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.a0(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.a0(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.S(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.substringIndexMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.substringIndex_.size(); i11++) {
                    codedOutputStream.b0(this.substringIndex_.get(i11).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.replaceCharMemoizedSerializedSize);
                }
                for (int i12 = 0; i12 < this.replaceChar_.size(); i12++) {
                    codedOutputStream.b0(this.replaceChar_.get(i12).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.O(6, getStringBytes());
                }
                codedOutputStream.i0(this.unknownFields);
            }

            public static b newBuilder(Record record) {
                return newBuilder().g(record);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
            public Record getDefaultInstanceForType() {
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

            private Record(GeneratedMessageLite.b bVar) {
                super(bVar);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.f();
            }

            private Record(boolean z11) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = d.f67542a;
            }

            private Record(e eVar, f fVar) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
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
                                    this.range_ = eVar.s();
                                } else if (K == 16) {
                                    this.bitField0_ |= 2;
                                    this.predefinedIndex_ = eVar.s();
                                } else if (K == 24) {
                                    int n11 = eVar.n();
                                    Operation valueOf = Operation.valueOf(n11);
                                    if (valueOf == null) {
                                        J.o0(K);
                                        J.o0(n11);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.operation_ = valueOf;
                                    }
                                } else if (K == 32) {
                                    if ((i11 & 16) != 16) {
                                        this.substringIndex_ = new ArrayList();
                                        i11 |= 16;
                                    }
                                    this.substringIndex_.add(Integer.valueOf(eVar.s()));
                                } else if (K == 34) {
                                    int j11 = eVar.j(eVar.A());
                                    if ((i11 & 16) != 16 && eVar.e() > 0) {
                                        this.substringIndex_ = new ArrayList();
                                        i11 |= 16;
                                    }
                                    while (eVar.e() > 0) {
                                        this.substringIndex_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j11);
                                } else if (K == 40) {
                                    if ((i11 & 32) != 32) {
                                        this.replaceChar_ = new ArrayList();
                                        i11 |= 32;
                                    }
                                    this.replaceChar_.add(Integer.valueOf(eVar.s()));
                                } else if (K == 42) {
                                    int j12 = eVar.j(eVar.A());
                                    if ((i11 & 32) != 32 && eVar.e() > 0) {
                                        this.replaceChar_ = new ArrayList();
                                        i11 |= 32;
                                    }
                                    while (eVar.e() > 0) {
                                        this.replaceChar_.add(Integer.valueOf(eVar.s()));
                                    }
                                    eVar.i(j12);
                                } else if (K != 50) {
                                    if (!parseUnknownField(eVar, J, fVar, K)) {
                                    }
                                } else {
                                    d l11 = eVar.l();
                                    this.bitField0_ |= 4;
                                    this.string_ = l11;
                                }
                            }
                            z11 = true;
                        } catch (Throwable th2) {
                            if ((i11 & 16) == 16) {
                                this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                            }
                            if ((i11 & 32) == 32) {
                                this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
                if ((i11 & 16) == 16) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if ((i11 & 32) == 32) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
            public static final class b extends GeneratedMessageLite.b<Record, b> implements l20.d {

                /* renamed from: b, reason: collision with root package name */
                public int f67497b;

                /* renamed from: d, reason: collision with root package name */
                public int f67499d;

                /* renamed from: g, reason: collision with root package name */
                public List<Integer> f67502g;

                /* renamed from: h, reason: collision with root package name */
                public List<Integer> f67503h;

                /* renamed from: c, reason: collision with root package name */
                public int f67498c = 1;

                /* renamed from: e, reason: collision with root package name */
                public Object f67500e = "";

                /* renamed from: f, reason: collision with root package name */
                public Operation f67501f = Operation.NONE;

                public b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f67502g = list;
                    this.f67503h = list;
                    s();
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
                public Record build() {
                    Record l11 = l();
                    if (l11.isInitialized()) {
                        return l11;
                    }
                    throw a.AbstractC0798a.c(l11);
                }

                public Record l() {
                    Record record = new Record(this);
                    int i11 = this.f67497b;
                    int i12 = (i11 & 1) != 1 ? 0 : 1;
                    record.range_ = this.f67498c;
                    if ((i11 & 2) == 2) {
                        i12 |= 2;
                    }
                    record.predefinedIndex_ = this.f67499d;
                    if ((i11 & 4) == 4) {
                        i12 |= 4;
                    }
                    record.string_ = this.f67500e;
                    if ((i11 & 8) == 8) {
                        i12 |= 8;
                    }
                    record.operation_ = this.f67501f;
                    if ((this.f67497b & 16) == 16) {
                        this.f67502g = Collections.unmodifiableList(this.f67502g);
                        this.f67497b &= -17;
                    }
                    record.substringIndex_ = this.f67502g;
                    if ((this.f67497b & 32) == 32) {
                        this.f67503h = Collections.unmodifiableList(this.f67503h);
                        this.f67497b &= -33;
                    }
                    record.replaceChar_ = this.f67503h;
                    record.bitField0_ = i12;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public b l() {
                    return n().g(l());
                }

                public final void o() {
                    if ((this.f67497b & 32) != 32) {
                        this.f67503h = new ArrayList(this.f67503h);
                        this.f67497b |= 32;
                    }
                }

                public final void p() {
                    if ((this.f67497b & 16) != 16) {
                        this.f67502g = new ArrayList(this.f67502g);
                        this.f67497b |= 16;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public b g(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        x(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        w(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f67497b |= 4;
                        this.f67500e = record.string_;
                    }
                    if (record.hasOperation()) {
                        v(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.f67502g.isEmpty()) {
                            this.f67502g = record.substringIndex_;
                            this.f67497b &= -17;
                        } else {
                            p();
                            this.f67502g.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.f67503h.isEmpty()) {
                            this.f67503h = record.replaceChar_;
                            this.f67497b &= -33;
                        } else {
                            o();
                            this.f67503h.addAll(record.replaceChar_);
                        }
                    }
                    h(f().b(record.unknownFields));
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$b");
                }

                public b v(Operation operation) {
                    operation.getClass();
                    this.f67497b |= 8;
                    this.f67501f = operation;
                    return this;
                }

                public b w(int i11) {
                    this.f67497b |= 2;
                    this.f67499d = i11;
                    return this;
                }

                public b x(int i11) {
                    this.f67497b |= 1;
                    this.f67498c = i11;
                    return this;
                }

                private void s() {
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTableTypes d(e eVar, f fVar) throws InvalidProtocolBufferException {
                return new StringTableTypes(eVar, fVar);
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            defaultInstance = stringTableTypes;
            stringTableTypes.initFields();
        }

        public static StringTableTypes getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            List list = Collections.EMPTY_LIST;
            this.record_ = list;
            this.localName_ = list;
        }

        public static b newBuilder() {
            return b.n();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, f fVar) throws IOException {
            return PARSER.a(inputStream, fVar);
        }

        public List<Integer> getLocalNameList() {
            return this.localName_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.n
        public p<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.record_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
        public int getSerializedSize() {
            int i11 = this.memoizedSerializedSize;
            if (i11 != -1) {
                return i11;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.record_.size(); i13++) {
                i12 += CodedOutputStream.s(1, this.record_.get(i13));
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.localName_.size(); i15++) {
                i14 += CodedOutputStream.p(this.localName_.get(i15).intValue());
            }
            int i16 = i12 + i14;
            if (!getLocalNameList().isEmpty()) {
                i16 = i16 + 1 + CodedOutputStream.p(i14);
            }
            this.localNameMemoizedSerializedSize = i14;
            int size = i16 + this.unknownFields.size();
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
            for (int i11 = 0; i11 < this.record_.size(); i11++) {
                codedOutputStream.d0(1, this.record_.get(i11));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.localNameMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.localName_.size(); i12++) {
                codedOutputStream.b0(this.localName_.get(i12).intValue());
            }
            codedOutputStream.i0(this.unknownFields);
        }

        public static b newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().g(stringTableTypes);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        public StringTableTypes getDefaultInstanceForType() {
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

        private StringTableTypes(GeneratedMessageLite.b bVar) {
            super(bVar);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f();
        }

        private StringTableTypes(boolean z11) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = d.f67542a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private StringTableTypes(e eVar, f fVar) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
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
                            if (K == 10) {
                                if ((i11 & 1) != 1) {
                                    this.record_ = new ArrayList();
                                    i11 |= 1;
                                }
                                this.record_.add(eVar.u(Record.PARSER, fVar));
                            } else if (K == 40) {
                                if ((i11 & 2) != 2) {
                                    this.localName_ = new ArrayList();
                                    i11 |= 2;
                                }
                                this.localName_.add(Integer.valueOf(eVar.s()));
                            } else if (K != 42) {
                                if (!parseUnknownField(eVar, J, fVar, K)) {
                                }
                            } else {
                                int j11 = eVar.j(eVar.A());
                                if ((i11 & 2) != 2 && eVar.e() > 0) {
                                    this.localName_ = new ArrayList();
                                    i11 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.localName_.add(Integer.valueOf(eVar.s()));
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
                    if ((i11 & 1) == 1) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if ((i11 & 2) == 2) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
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
            if ((i11 & 1) == 1) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if ((i11 & 2) == 2) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
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
        public static final class b extends GeneratedMessageLite.b<StringTableTypes, b> implements l20.e {

            /* renamed from: b, reason: collision with root package name */
            public int f67504b;

            /* renamed from: c, reason: collision with root package name */
            public List<Record> f67505c;

            /* renamed from: d, reason: collision with root package name */
            public List<Integer> f67506d;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.f67505c = list;
                this.f67506d = list;
                s();
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
            public StringTableTypes build() {
                StringTableTypes l11 = l();
                if (l11.isInitialized()) {
                    return l11;
                }
                throw a.AbstractC0798a.c(l11);
            }

            public StringTableTypes l() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f67504b & 1) == 1) {
                    this.f67505c = Collections.unmodifiableList(this.f67505c);
                    this.f67504b &= -2;
                }
                stringTableTypes.record_ = this.f67505c;
                if ((this.f67504b & 2) == 2) {
                    this.f67506d = Collections.unmodifiableList(this.f67506d);
                    this.f67504b &= -3;
                }
                stringTableTypes.localName_ = this.f67506d;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b l() {
                return n().g(l());
            }

            public final void o() {
                if ((this.f67504b & 2) != 2) {
                    this.f67506d = new ArrayList(this.f67506d);
                    this.f67504b |= 2;
                }
            }

            public final void p() {
                if ((this.f67504b & 1) != 1) {
                    this.f67505c = new ArrayList(this.f67505c);
                    this.f67504b |= 1;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b, kotlin.reflect.jvm.internal.impl.protobuf.o
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public b g(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.f67505c.isEmpty()) {
                        this.f67505c = stringTableTypes.record_;
                        this.f67504b &= -2;
                    } else {
                        p();
                        this.f67505c.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.f67506d.isEmpty()) {
                        this.f67506d = stringTableTypes.localName_;
                        this.f67504b &= -3;
                    } else {
                        o();
                        this.f67506d.addAll(stringTableTypes.localName_);
                    }
                }
                h(f().b(stringTableTypes.unknownFields));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a, kotlin.reflect.jvm.internal.impl.protobuf.n.a
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.b r(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.PARSER     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.b.r(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$b");
            }

            private void s() {
            }
        }
    }

    static {
        ProtoBuf.Constructor defaultInstance = ProtoBuf.Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f67471a = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        f67472b = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        f67473c = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        f67474d = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        f67475e = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f67476f = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f67477g = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        f67478h = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f67479i = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f67480j = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        f67481k = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        f67482l = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        f67483m = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        f67484n = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    public static void a(f fVar) {
        fVar.a(f67471a);
        fVar.a(f67472b);
        fVar.a(f67473c);
        fVar.a(f67474d);
        fVar.a(f67475e);
        fVar.a(f67476f);
        fVar.a(f67477g);
        fVar.a(f67478h);
        fVar.a(f67479i);
        fVar.a(f67480j);
        fVar.a(f67481k);
        fVar.a(f67482l);
        fVar.a(f67483m);
        fVar.a(f67484n);
    }
}
