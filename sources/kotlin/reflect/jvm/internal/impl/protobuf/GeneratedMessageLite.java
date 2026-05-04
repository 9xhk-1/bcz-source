package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class GeneratedMessageLite extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67516a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f67516a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67516a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<MessageType extends GeneratedMessageLite, BuilderType extends b> extends a.AbstractC0798a<BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.protobuf.d f67517a = kotlin.reflect.jvm.internal.impl.protobuf.d.f67542a;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0798a
        /* renamed from: d */
        public BuilderType l() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
        /* renamed from: e */
        public abstract MessageType getDefaultInstanceForType();

        public final kotlin.reflect.jvm.internal.impl.protobuf.d f() {
            return this.f67517a;
        }

        public abstract BuilderType g(MessageType messagetype);

        public final BuilderType h(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f67517a = dVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c<MessageType extends ExtendableMessage<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements d<MessageType> {

        /* renamed from: b, reason: collision with root package name */
        public g<e> f67518b = g.g();

        /* renamed from: c, reason: collision with root package name */
        public boolean f67519c;

        public final g<e> j() {
            this.f67518b.q();
            this.f67519c = false;
            return this.f67518b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b
        public BuilderType l() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void m() {
            if (this.f67519c) {
                return;
            }
            this.f67518b = this.f67518b.clone();
            this.f67519c = true;
        }

        public boolean n() {
            return this.f67518b.n();
        }

        public final void o(MessageType messagetype) {
            m();
            this.f67518b.r(((ExtendableMessage) messagetype).extensions);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<MessageType extends ExtendableMessage> extends o {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements g.b<e> {

        /* renamed from: a, reason: collision with root package name */
        public final h.b<?> f67520a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67521b;

        /* renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f67522c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f67523d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f67524e;

        public e(h.b<?> bVar, int i11, WireFormat.FieldType fieldType, boolean z11, boolean z12) {
            this.f67520a = bVar;
            this.f67521b = i11;
            this.f67522c = fieldType;
            this.f67523d = z11;
            this.f67524e = z12;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public n.a Q(n.a aVar, n nVar) {
            return ((b) aVar).g((GeneratedMessageLite) nVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f67521b - eVar.f67521b;
        }

        public h.b<?> b() {
            return this.f67520a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public WireFormat.JavaType getLiteJavaType() {
            return this.f67522c.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public WireFormat.FieldType getLiteType() {
            return this.f67522c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
            return this.f67521b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f67524e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isRepeated() {
            return this.f67523d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<ContainingType extends n, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final ContainingType f67525a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f67526b;

        /* renamed from: c, reason: collision with root package name */
        public final n f67527c;

        /* renamed from: d, reason: collision with root package name */
        public final e f67528d;

        /* renamed from: e, reason: collision with root package name */
        public final Class f67529e;

        /* renamed from: f, reason: collision with root package name */
        public final Method f67530f;

        public f(ContainingType containingtype, Type type, n nVar, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.getLiteType() == WireFormat.FieldType.MESSAGE && nVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f67525a = containingtype;
            this.f67526b = type;
            this.f67527c = nVar;
            this.f67528d = eVar;
            this.f67529e = cls;
            if (h.a.class.isAssignableFrom(cls)) {
                this.f67530f = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
            } else {
                this.f67530f = null;
            }
        }

        public Object a(Object obj) {
            if (!this.f67528d.isRepeated()) {
                return e(obj);
            }
            if (this.f67528d.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f67525a;
        }

        public n c() {
            return this.f67527c;
        }

        public int d() {
            return this.f67528d.getNumber();
        }

        public Object e(Object obj) {
            return this.f67528d.getLiteJavaType() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.invokeOrDie(this.f67530f, null, (Integer) obj) : obj;
        }

        public Object f(Object obj) {
            return this.f67528d.getLiteJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((h.a) obj).getNumber()) : obj;
        }
    }

    public GeneratedMessageLite() {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e11) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e11);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingType extends n, Type> f<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, n nVar, h.b<?> bVar, int i11, WireFormat.FieldType fieldType, boolean z11, Class cls) {
        return new f<>(containingtype, Collections.EMPTY_LIST, nVar, new e(bVar, i11, fieldType, true, z11), cls);
    }

    public static <ContainingType extends n, Type> f<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, n nVar, h.b<?> bVar, int i11, WireFormat.FieldType fieldType, Class cls) {
        return new f<>(containingtype, type, nVar, new e(bVar, i11, fieldType, false, false), cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public p<? extends n> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i11) throws IOException {
        return eVar.P(i11, codedOutputStream);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements d<MessageType> {
        private final g<e> extensions;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<e, Object>> f67512a;

            /* renamed from: b, reason: collision with root package name */
            public Map.Entry<e, Object> f67513b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f67514c;

            public /* synthetic */ a(ExtendableMessage extendableMessage, boolean z11, a aVar) {
                this(z11);
            }

            public void a(int i11, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.f67513b;
                    if (entry == null || entry.getKey().getNumber() >= i11) {
                        return;
                    }
                    e key = this.f67513b.getKey();
                    if (this.f67514c && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.f0(key.getNumber(), (n) this.f67513b.getValue());
                    } else {
                        g.z(key, this.f67513b.getValue(), codedOutputStream);
                    }
                    if (this.f67512a.hasNext()) {
                        this.f67513b = this.f67512a.next();
                    } else {
                        this.f67513b = null;
                    }
                }
            }

            public a(boolean z11) {
                Iterator<Map.Entry<e, Object>> p11 = ExtendableMessage.this.extensions.p();
                this.f67512a = p11;
                if (p11.hasNext()) {
                    this.f67513b = p11.next();
                }
                this.f67514c = z11;
            }
        }

        public ExtendableMessage() {
            this.extensions = g.t();
        }

        private void verifyExtensionContainingType(f<MessageType, ?> fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.n();
        }

        public int extensionsSerializedSize() {
            return this.extensions.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(f<MessageType, Type> fVar) {
            verifyExtensionContainingType(fVar);
            Object h11 = this.extensions.h(fVar.f67528d);
            return h11 == null ? fVar.f67526b : (Type) fVar.a(h11);
        }

        public final <Type> int getExtensionCount(f<MessageType, List<Type>> fVar) {
            verifyExtensionContainingType(fVar);
            return this.extensions.j(fVar.f67528d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(f<MessageType, Type> fVar) {
            verifyExtensionContainingType(fVar);
            return this.extensions.m(fVar.f67528d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.q();
        }

        public ExtendableMessage<MessageType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i11) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), eVar, codedOutputStream, fVar, i11);
        }

        public ExtendableMessage(c<MessageType, ?> cVar) {
            this.extensions = cVar.j();
        }

        public final <Type> Type getExtension(f<MessageType, List<Type>> fVar, int i11) {
            verifyExtensionContainingType(fVar);
            return (Type) fVar.e(this.extensions.i(fVar.f67528d, i11));
        }
    }

    public GeneratedMessageLite(b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.n> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    public void makeExtensionsImmutable() {
    }
}
