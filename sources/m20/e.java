package m20;

import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends k20.a {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f71806h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @k
    public static final e f71807i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @k
    public static final e f71808j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @k
    public static final e f71809k;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f71810g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        e eVar = new e(2, 0, 0);
        f71807i = eVar;
        f71808j = eVar.m();
        f71809k = new e(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@k int[] versionArray, boolean z11) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        g0.p(versionArray, "versionArray");
        this.f71810g = z11;
    }

    public final boolean h(@k e metadataVersionFromLanguageVersion) {
        g0.p(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            e eVar = f71807i;
            if (eVar.a() == 1 && eVar.b() == 8) {
                return true;
            }
        }
        return i(metadataVersionFromLanguageVersion.k(this.f71810g));
    }

    public final boolean i(e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    public final boolean j() {
        return this.f71810g;
    }

    @k
    public final e k(boolean z11) {
        e eVar = z11 ? f71807i : f71808j;
        return eVar.l(this) ? eVar : this;
    }

    public final boolean l(e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    @k
    public final e m() {
        return (a() == 1 && b() == 9) ? new e(2, 0, 0) : new e(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@k int... numbers) {
        this(numbers, false);
        g0.p(numbers, "numbers");
    }
}
