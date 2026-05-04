package m0;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import o0.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResourceIntMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,26:1\n29#2:27\n*S KotlinDebug\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n*L\n15#1:27\n*E\n"})
/* loaded from: classes3.dex */
public final class e implements d<Integer, Uri> {
    @Override // m0.d
    public /* bridge */ /* synthetic */ Uri a(Integer num, j jVar) {
        return c(num.intValue(), jVar);
    }

    public final boolean b(@DrawableRes int i11, Context context) {
        return context.getResources().getResourceEntryName(i11) != null;
    }

    @l
    public Uri c(@DrawableRes int i11, @k j jVar) {
        if (!b(i11, jVar.g())) {
            return null;
        }
        return Uri.parse("android.resource://" + jVar.g().getPackageName() + '/' + i11);
    }
}
