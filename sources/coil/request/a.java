package coil.request;

import coil.request.ImageRequest;
import f0.p;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Gifs")
@u0({"SMAP\nGifs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gifs.kt\ncoil/request/Gifs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @c0.a
    @k
    public static final ImageRequest.Builder a(@k ImageRequest.Builder builder, @k s0.a aVar) {
        return ImageRequest.Builder.c0(builder, p.f50335f, aVar, null, 4, null);
    }

    @l
    @c0.a
    public static final s0.a b(@k b bVar) {
        return (s0.a) bVar.h(p.f50335f);
    }

    @l
    public static final x00.a<g2> c(@k b bVar) {
        return (x00.a) bVar.h(p.f50337h);
    }

    @l
    public static final x00.a<g2> d(@k b bVar) {
        return (x00.a) bVar.h(p.f50336g);
    }

    @k
    public static final ImageRequest.Builder e(@k ImageRequest.Builder builder, @l x00.a<g2> aVar) {
        return ImageRequest.Builder.c0(builder, p.f50337h, aVar, null, 4, null);
    }

    @k
    public static final ImageRequest.Builder f(@k ImageRequest.Builder builder, @l x00.a<g2> aVar) {
        return ImageRequest.Builder.c0(builder, p.f50336g, aVar, null, 4, null);
    }

    @k
    public static final ImageRequest.Builder g(@k ImageRequest.Builder builder, int i11) {
        if (i11 >= -1) {
            return ImageRequest.Builder.c0(builder, p.f50334e, Integer.valueOf(i11), null, 4, null);
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i11).toString());
    }

    @l
    public static final Integer h(@k b bVar) {
        return (Integer) bVar.h(p.f50334e);
    }
}
