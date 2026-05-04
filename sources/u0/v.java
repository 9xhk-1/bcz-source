package u0;

import kotlin.jvm.internal.u0;
import q0.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,215:1\n57#2:216\n57#2:217\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n*L\n45#1:216\n46#1:217\n*E\n"})
/* loaded from: classes3.dex */
public final class v implements s {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f91486b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f91487c = 100;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final w f91488a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public v(@m80.l w wVar) {
        this.f91488a = wVar;
    }

    @Override // u0.s
    public boolean a() {
        return r.f91471a.b(this.f91488a);
    }

    @Override // u0.s
    public boolean b(@m80.k q0.g gVar) {
        q0.c f11 = gVar.f();
        if ((f11 instanceof c.a ? ((c.a) f11).f81358a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        q0.c e11 = gVar.e();
        return (e11 instanceof c.a ? ((c.a) e11).f81358a : Integer.MAX_VALUE) > 100;
    }
}
