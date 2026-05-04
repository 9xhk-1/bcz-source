package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends e10.a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0780a f67075b = new C0780a(null);
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final java.util.Random f67076a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.random.a$a, reason: collision with other inner class name */
    public static final class C0780a {
        public /* synthetic */ C0780a(v vVar) {
            this();
        }

        public C0780a() {
        }
    }

    public a(@k java.util.Random impl) {
        g0.p(impl, "impl");
        this.f67076a = impl;
    }

    @Override // e10.a
    @k
    public java.util.Random a() {
        return this.f67076a;
    }
}
