package l60;

import java.util.List;
import java.util.RandomAccess;
import l60.v0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j1<T> extends a00.d<T> implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f70443c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v0 f70444a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<T> f70445b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final <T> j1<T> a(@m80.k Iterable<? extends T> values, @m80.k x00.l<? super T, ? extends ByteString> encode) {
            kotlin.jvm.internal.g0.p(values, "values");
            kotlin.jvm.internal.g0.p(encode, "encode");
            List a62 = a00.r0.a6(values);
            v0.a aVar = v0.f70499c;
            int size = a62.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i11 = 0; i11 < size; i11++) {
                byteStringArr[i11] = encode.invoke((Object) a62.get(i11));
            }
            return new j1<>(a62, aVar.d(byteStringArr));
        }

        public a() {
        }
    }

    public j1(@m80.k List<? extends T> list, @m80.k v0 options) {
        kotlin.jvm.internal.g0.p(list, "list");
        kotlin.jvm.internal.g0.p(options, "options");
        this.f70444a = options;
        List<T> a62 = a00.r0.a6(list);
        this.f70445b = a62;
        if (a62.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @w00.o
    @m80.k
    public static final <T> j1<T> g(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends ByteString> lVar) {
        return f70443c.a(iterable, lVar);
    }

    @m80.k
    public final List<T> d() {
        return this.f70445b;
    }

    @m80.k
    public final v0 f() {
        return this.f70444a;
    }

    @Override // a00.d, java.util.List
    @m80.k
    public T get(int i11) {
        return this.f70445b.get(i11);
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.f70445b.size();
    }
}
