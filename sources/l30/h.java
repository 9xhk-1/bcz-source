package l30;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.g0;
import kotlin.text.Regex;
import l30.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final n20.f f69776a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Regex f69777b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Collection<n20.f> f69778c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> f69779d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final f[] f69780e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f69781a = new a();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            g0.p(eVar, "<this>");
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f69782a = new b();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            g0.p(eVar, "<this>");
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f69783a = new c();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            g0.p(eVar, "<this>");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(n20.f fVar, Regex regex, Collection<n20.f> collection, x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> lVar, f... fVarArr) {
        this.f69776a = fVar;
        this.f69777b = regex;
        this.f69778c = collection;
        this.f69779d = lVar;
        this.f69780e = fVarArr;
    }

    @m80.k
    public final g a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f69780e) {
            String a11 = fVar.a(functionDescriptor);
            if (a11 != null) {
                return new g.b(a11);
            }
        }
        String invoke = this.f69779d.invoke(functionDescriptor);
        return invoke != null ? new g.b(invoke) : g.c.f69775b;
    }

    public final boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        if (this.f69776a != null && !g0.g(functionDescriptor.getName(), this.f69776a)) {
            return false;
        }
        if (this.f69777b != null) {
            String b11 = functionDescriptor.getName().b();
            g0.o(b11, "asString(...)");
            if (!this.f69777b.matches(b11)) {
                return false;
            }
        }
        Collection<n20.f> collection = this.f69778c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ h(n20.f fVar, f[] fVarArr, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this(fVar, fVarArr, (x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) ((i11 & 4) != 0 ? a.f69781a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@m80.k n20.f name, @m80.k f[] checks, @m80.k x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> additionalChecks) {
        this(name, (Regex) null, (Collection<n20.f>) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        g0.p(name, "name");
        g0.p(checks, "checks");
        g0.p(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Regex regex, f[] fVarArr, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this(regex, fVarArr, (x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) ((i11 & 4) != 0 ? b.f69782a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@m80.k Regex regex, @m80.k f[] checks, @m80.k x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> additionalChecks) {
        this((n20.f) null, regex, (Collection<n20.f>) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        g0.p(regex, "regex");
        g0.p(checks, "checks");
        g0.p(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this((Collection<n20.f>) collection, fVarArr, (x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) ((i11 & 4) != 0 ? c.f69783a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@m80.k Collection<n20.f> nameList, @m80.k f[] checks, @m80.k x00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> additionalChecks) {
        this((n20.f) null, (Regex) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        g0.p(nameList, "nameList");
        g0.p(checks, "checks");
        g0.p(additionalChecks, "additionalChecks");
    }
}
