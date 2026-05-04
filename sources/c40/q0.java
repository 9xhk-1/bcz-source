package c40;

import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q0 extends kotlin.coroutines.a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f7924b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f7925a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements d.c<q0> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public q0(@m80.k String str) {
        super(f7924b);
        this.f7925a = str;
    }

    public static /* synthetic */ q0 E(q0 q0Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = q0Var.f7925a;
        }
        return q0Var.w(str);
    }

    @m80.k
    public final String H() {
        return this.f7925a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && kotlin.jvm.internal.g0.g(this.f7925a, ((q0) obj).f7925a);
    }

    public int hashCode() {
        return this.f7925a.hashCode();
    }

    @m80.k
    public final String q() {
        return this.f7925a;
    }

    @m80.k
    public String toString() {
        return "CoroutineName(" + this.f7925a + ')';
    }

    @m80.k
    public final q0 w(@m80.k String str) {
        return new q0(str);
    }
}
