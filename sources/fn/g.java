package fn;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class g {
    public g() {
        throw new UnsupportedOperationException();
    }

    public static l a(l lVar) {
        return b(lVar) ? l.a(lVar.d(), lVar.c(), 70.0d) : lVar;
    }

    public static boolean b(l lVar) {
        return ((((double) Math.round(lVar.d())) > 90.0d ? 1 : (((double) Math.round(lVar.d())) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(lVar.d())) > 111.0d ? 1 : (((double) Math.round(lVar.d())) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(lVar.c())) > 16.0d ? 1 : (((double) Math.round(lVar.c())) == 16.0d ? 0 : -1)) > 0) && ((((double) Math.round(lVar.e())) > 65.0d ? 1 : (((double) Math.round(lVar.e())) == 65.0d ? 0 : -1)) < 0);
    }
}
