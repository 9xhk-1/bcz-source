package l30;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n11345#2,11:146\n13474#2,2:157\n13476#2:160\n11356#2:161\n1#3:159\n*S KotlinDebug\n*F\n+ 1 ArrayMap.kt\norg/jetbrains/kotlin/util/ArrayMapImpl\n*L\n140#1:146,11\n140#1:157,2\n140#1:160\n140#1:161\n140#1:159\n*E\n"})
/* loaded from: classes8.dex */
public final class d<T> extends c<T> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f69766c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public Object[] f69767a;

    /* renamed from: b, reason: collision with root package name */
    public int f69768b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a00.c<T> {

        /* renamed from: c, reason: collision with root package name */
        public int f69769c = -1;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d<T> f69770d;

        public b(d<T> dVar) {
            this.f69770d = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // a00.c
        public void a() {
            do {
                int i11 = this.f69769c + 1;
                this.f69769c = i11;
                if (i11 >= this.f69770d.f69767a.length) {
                    break;
                }
            } while (this.f69770d.f69767a[this.f69769c] == null);
            if (this.f69769c >= this.f69770d.f69767a.length) {
                b();
                return;
            }
            Object obj = this.f69770d.f69767a[this.f69769c];
            g0.n(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            c(obj);
        }
    }

    public d(Object[] objArr, int i11) {
        super(null);
        this.f69767a = objArr;
        this.f69768b = i11;
    }

    private final void f(int i11) {
        Object[] objArr = this.f69767a;
        if (objArr.length > i11) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i11);
        Object[] copyOf = Arrays.copyOf(this.f69767a, length);
        g0.o(copyOf, "copyOf(...)");
        this.f69767a = copyOf;
    }

    @Override // l30.c
    public int a() {
        return this.f69768b;
    }

    @Override // l30.c
    public void b(int i11, @m80.k T value) {
        g0.p(value, "value");
        f(i11);
        if (this.f69767a[i11] == null) {
            this.f69768b = a() + 1;
        }
        this.f69767a[i11] = value;
    }

    @Override // l30.c
    @m80.l
    public T get(int i11) {
        return (T) a00.a0.hf(this.f69767a, i11);
    }

    @Override // l30.c, java.lang.Iterable
    @m80.k
    public Iterator<T> iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
