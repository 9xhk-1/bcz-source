package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import x00.p;
import yz.g2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@u0({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: classes8.dex */
public final class CombinedContext implements d, Serializable {

    @k
    private final d.b element;

    @k
    private final d left;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,200:1\n13216#2,3:201\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n197#1:201,3\n*E\n"})
    public static final class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0778a f66929b = new C0778a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d[] f66930a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlin.coroutines.CombinedContext$a$a, reason: collision with other inner class name */
        public static final class C0778a {
            public /* synthetic */ C0778a(v vVar) {
                this();
            }

            public C0778a() {
            }
        }

        public a(@k d[] elements) {
            g0.p(elements, "elements");
            this.f66930a = elements;
        }

        private final Object readResolve() {
            d[] dVarArr = this.f66930a;
            d dVar = EmptyCoroutineContext.INSTANCE;
            for (d dVar2 : dVarArr) {
                dVar = dVar.plus(dVar2);
            }
            return dVar;
        }

        @k
        public final d[] a() {
            return this.f66930a;
        }
    }

    public CombinedContext(@k d left, @k d.b element) {
        g0.p(left, "left");
        g0.p(element, "element");
        this.left = left;
        this.element = element;
    }

    private final boolean contains(d.b bVar) {
        return g0.g(get(bVar.getKey()), bVar);
    }

    private final boolean containsAll(CombinedContext combinedContext) {
        while (contains(combinedContext.element)) {
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                g0.n(dVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((d.b) dVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
        return false;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final int size() {
        int i11 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.left;
            combinedContext = dVar instanceof CombinedContext ? (CombinedContext) dVar : null;
            if (combinedContext == null) {
                return i11;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toString$lambda$0(String acc, d.b element) {
        g0.p(acc, "acc");
        g0.p(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + j2.O + element;
    }

    private final Object writeReplace() {
        int size = size();
        final d[] dVarArr = new d[size];
        final Ref.IntRef intRef = new Ref.IntRef();
        fold(g2.f100423a, new p() { // from class: j00.a
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 writeReplace$lambda$0;
                writeReplace$lambda$0 = CombinedContext.writeReplace$lambda$0(dVarArr, intRef, (g2) obj, (d.b) obj2);
                return writeReplace$lambda$0;
            }
        });
        if (intRef.element == size) {
            return new a(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 writeReplace$lambda$0(d[] dVarArr, Ref.IntRef intRef, g2 g2Var, d.b element) {
        g0.p(g2Var, "<unused var>");
        g0.p(element, "element");
        int i11 = intRef.element;
        intRef.element = i11 + 1;
        dVarArr[i11] = element;
        return g2.f100423a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) obj;
        return combinedContext.size() == size() && combinedContext.containsAll(this);
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> operation) {
        g0.p(operation, "operation");
        return operation.invoke((Object) this.left.fold(r11, operation), this.element);
    }

    @Override // kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> key) {
        g0.p(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e11 = (E) combinedContext.element.get(key);
            if (e11 != null) {
                return e11;
            }
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                return (E) dVar.get(key);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> key) {
        g0.p(key, "key");
        if (this.element.get(key) != null) {
            return this.left;
        }
        d minusKey = this.left.minusKey(key);
        return minusKey == this.left ? this : minusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(minusKey, this.element);
    }

    @Override // kotlin.coroutines.d
    @k
    public /* bridge */ d plus(@k d dVar) {
        return d.a.b(this, dVar);
    }

    @k
    public String toString() {
        return '[' + ((String) fold("", new p() { // from class: j00.b
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                String string$lambda$0;
                string$lambda$0 = CombinedContext.toString$lambda$0((String) obj, (d.b) obj2);
                return string$lambda$0;
            }
        })) + l50.b.f69930l;
    }
}
