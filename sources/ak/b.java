package ak;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import com.baicizhan.client.business.util.AutoSizeMgr;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ProvidableCompositionLocal<Boolean> f2665a = CompositionLocalKt.staticCompositionLocalOf(new x00.a() { // from class: ak.a
        @Override // x00.a
        public final Object invoke() {
            boolean b11;
            b11 = b.b();
            return Boolean.valueOf(b11);
        }
    });

    public static final boolean b() {
        return AutoSizeMgr.INSTANCE.getUserCloseAutoSize();
    }

    @k
    public static final ProvidableCompositionLocal<Boolean> c() {
        return f2665a;
    }
}
