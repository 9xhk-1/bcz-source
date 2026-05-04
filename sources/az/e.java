package az;

import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e implements az.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h10.d<?> f5567a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final x00.l<List<String>, Object> f5568b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final x00.l<Object, List<String>> f5569c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h10.d<T> f5570a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public x00.l<? super List<String>, ? extends T> f5571b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public x00.l<? super T, ? extends List<String>> f5572c;

        @v0
        public a(@k h10.d<T> klass) {
            g0.p(klass, "klass");
            this.f5570a = klass;
        }

        public final void a(@k x00.l<? super List<String>, ? extends T> converter) {
            g0.p(converter, "converter");
            if (this.f5571b == null) {
                this.f5571b = converter;
                return;
            }
            throw new IllegalStateException("Decoder has already been set for type '" + this.f5570a + '\'');
        }

        public final void b(@k x00.l<? super T, ? extends List<String>> converter) {
            g0.p(converter, "converter");
            if (this.f5572c == null) {
                this.f5572c = converter;
                return;
            }
            throw new IllegalStateException("Encoder has already been set for type '" + this.f5570a + '\'');
        }

        @l
        public final x00.l<List<String>, T> c() {
            return this.f5571b;
        }

        @l
        public final x00.l<T, List<String>> d() {
            return this.f5572c;
        }

        @k
        public final h10.d<T> e() {
            return this.f5570a;
        }

        public final void f(@l x00.l<? super List<String>, ? extends T> lVar) {
            this.f5571b = lVar;
        }

        public final void g(@l x00.l<? super T, ? extends List<String>> lVar) {
            this.f5572c = lVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k h10.d<?> klass, @l x00.l<? super List<String>, ? extends Object> lVar, @l x00.l<Object, ? extends List<String>> lVar2) {
        g0.p(klass, "klass");
        this.f5567a = klass;
        this.f5568b = lVar;
        this.f5569c = lVar2;
    }

    @Override // az.a
    @l
    public Object a(@k List<String> values, @k gz.a type) {
        g0.p(values, "values");
        g0.p(type, "type");
        x00.l<List<String>, Object> lVar = this.f5568b;
        if (lVar != null) {
            return lVar.invoke(values);
        }
        throw new IllegalStateException("Decoder was not specified for type '" + this.f5567a + '\'');
    }

    @Override // az.a
    @k
    public List<String> b(@l Object obj) {
        x00.l<Object, List<String>> lVar = this.f5569c;
        if (lVar != null) {
            return lVar.invoke(obj);
        }
        throw new IllegalStateException("Encoder was not specified for type '" + this.f5567a + '\'');
    }
}
