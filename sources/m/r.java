package m;

import android.database.AbstractWindowedCursor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f71760a = new r();

    @w00.o
    @DoNotInline
    public static final void a(@m80.k AbstractWindowedCursor abstractWindowedCursor, long j11) {
        g0.p(abstractWindowedCursor, "<this>");
        abstractWindowedCursor.setWindow(q.a(null, j11));
    }
}
