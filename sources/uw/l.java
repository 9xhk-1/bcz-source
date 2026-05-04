package uw;

import ix.t2;
import java.util.Map;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(level = DeprecationLevel.ERROR, message = "Use new [CacheStorage] instead.")
/* loaded from: classes8.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f92527a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x00.a<l> f92528b = new x00.a() { // from class: uw.k
        @Override // x00.a
        public final Object invoke() {
            p b11;
            b11 = l.b();
            return b11;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final l f92529c = e.f92460d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final l a() {
            return l.f92529c;
        }

        @m80.k
        public final x00.a<l> b() {
            return l.f92528b;
        }

        public a() {
        }
    }

    public static final p b() {
        return new p();
    }

    @m80.l
    public abstract tw.c e(@m80.k t2 t2Var, @m80.k Map<String, String> map);

    @m80.k
    public abstract Set<tw.c> f(@m80.k t2 t2Var);

    public abstract void g(@m80.k t2 t2Var, @m80.k tw.c cVar);
}
