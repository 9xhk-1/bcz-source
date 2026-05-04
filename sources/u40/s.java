package u40;

import a00.h0;
import a00.r0;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class s<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d0<Target> f91808a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<String> f91809b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f91810c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements w40.a<Target, String> {
        public a() {
        }

        @Override // w40.a
        @m80.l
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String d(Target target, @m80.k String newValue) {
            g0.p(newValue, "newValue");
            Integer d11 = s.this.h().a().d(target, Integer.valueOf(s.this.f91809b.indexOf(newValue) + s.this.h().f()));
            if (d11 == null) {
                return null;
            }
            s<Target> sVar = s.this;
            return (String) sVar.f91809b.get(d11.intValue() - sVar.h().f());
        }

        @Override // w40.a
        @m80.k
        public String getName() {
            return s.this.f91810c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<Target, String> {
        public b(Object obj) {
            super(1, obj, s.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Target target) {
            return ((s) this.receiver).i(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@m80.k d0<? super Target> field, @m80.k List<String> values, @m80.k String name) {
        g0.p(field, "field");
        g0.p(values, "values");
        g0.p(name, "name");
        this.f91808a = field;
        this.f91809b = values;
        this.f91810c = name;
        if (values.size() == (field.e() - field.f()) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + values.size() + ") in " + values + " does not match the range of the field (" + ((field.e() - field.f()) + 1) + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(Target target) {
        int intValue = this.f91808a.a().c(target).intValue();
        String str = (String) r0.b3(this.f91809b, intValue - this.f91808a.f());
        if (str != null) {
            return str;
        }
        return "The value " + intValue + " of " + this.f91808a.getName() + " does not have a corresponding string representation";
    }

    @Override // u40.l
    @m80.k
    public v40.e<Target> a() {
        return new v40.j(new b(this));
    }

    @Override // u40.l
    @m80.k
    public w40.t<Target> b() {
        return new w40.t<>(a00.g0.l(new w40.b0(this.f91809b, new a(), "one of " + this.f91809b + " for " + this.f91810c)), h0.J());
    }

    @Override // u40.l
    public /* bridge */ /* synthetic */ n c() {
        return this.f91808a;
    }

    @m80.k
    public final d0<Target> h() {
        return this.f91808a;
    }
}
