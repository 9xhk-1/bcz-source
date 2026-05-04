package l30;

import kotlin.jvm.internal.g0;
import l30.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a0 implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f69761a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends a0 {

        /* renamed from: b, reason: collision with root package name */
        public final int f69762b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f69762b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l30.a0.a.<init>(int):void");
        }

        @Override // l30.f
        public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.g().size() >= this.f69762b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a0 {

        /* renamed from: b, reason: collision with root package name */
        public final int f69763b;

        public b(int i11) {
            super("must have exactly " + i11 + " value parameters", null);
            this.f69763b = i11;
        }

        @Override // l30.f
        public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.g().size() == this.f69763b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final c f69764b = new c();

        public c() {
            super("must have no value parameters", null);
        }

        @Override // l30.f
        public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.g().isEmpty();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends a0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final d f69765b = new d();

        public d() {
            super("must have a single value parameter", null);
        }

        @Override // l30.f
        public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            g0.p(functionDescriptor, "functionDescriptor");
            return functionDescriptor.g().size() == 1;
        }
    }

    public /* synthetic */ a0(String str, kotlin.jvm.internal.v vVar) {
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
        return this.f69761a;
    }

    public a0(String str) {
        this.f69761a = str;
    }
}
