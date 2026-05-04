package l30;

import kotlin.jvm.internal.g0;
import l30.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f69787a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final a f69788b = new a();

        public a() {
            super("must be a member function", null);
        }

        @Override // l30.f
        public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.d0() != null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f69789b = new b();

        public b() {
            super("must be a member or an extension function", null);
        }

        @Override // l30.f
        public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.d0() == null && functionDescriptor.f0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, kotlin.jvm.internal.v vVar) {
        this(str);
    }

    @Override // l30.f
    @m80.l
    public String a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // l30.f
    @m80.k
    public String getDescription() {
        return this.f69787a;
    }

    public k(String str) {
        this.f69787a = str;
    }
}
