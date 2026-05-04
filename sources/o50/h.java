package o50;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,263:1\n31#1,3:264\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n15#1:264,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt$polymorphic$1\n*L\n1#1,263:1\n*E\n"})
    public static final class a implements l<b<Object>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f75935a = new a();

        public final void a(b<Object> bVar) {
            g0.p(bVar, "<this>");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(b<Object> bVar) {
            a(bVar);
            return g2.f100423a;
        }
    }

    @m80.k
    public static final f a() {
        return k.a();
    }

    @m80.k
    public static final f b(@m80.k l<? super g, g2> builderAction) {
        g0.p(builderAction, "builderAction");
        g gVar = new g();
        builderAction.invoke(gVar);
        return gVar.k();
    }

    public static final /* synthetic */ <T> void c(g gVar, f50.i<T> serializer) {
        g0.p(gVar, "<this>");
        g0.p(serializer, "serializer");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        gVar.d(o0.d(Object.class), serializer);
    }

    public static final <Base> void d(@m80.k g gVar, @m80.k h10.d<Base> baseClass, @m80.l f50.i<Base> iVar, @m80.k l<? super b<? super Base>, g2> builderAction) {
        g0.p(gVar, "<this>");
        g0.p(baseClass, "baseClass");
        g0.p(builderAction, "builderAction");
        b bVar = new b(baseClass, iVar);
        builderAction.invoke(bVar);
        bVar.a(gVar);
    }

    public static /* synthetic */ void e(g gVar, h10.d baseClass, f50.i iVar, l builderAction, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iVar = null;
        }
        if ((i11 & 4) != 0) {
            builderAction = a.f75935a;
        }
        g0.p(gVar, "<this>");
        g0.p(baseClass, "baseClass");
        g0.p(builderAction, "builderAction");
        b bVar = new b(baseClass, iVar);
        builderAction.invoke(bVar);
        bVar.a(gVar);
    }

    public static final /* synthetic */ <T> f f(f50.i<T> serializer) {
        g0.p(serializer, "serializer");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return g(o0.d(Object.class), serializer);
    }

    @m80.k
    public static final <T> f g(@m80.k h10.d<T> kClass, @m80.k f50.i<T> serializer) {
        g0.p(kClass, "kClass");
        g0.p(serializer, "serializer");
        g gVar = new g();
        gVar.d(kClass, serializer);
        return gVar.k();
    }
}
