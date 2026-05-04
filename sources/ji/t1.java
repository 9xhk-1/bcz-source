package ji;

import android.content.Context;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t1 {
    public static final void a(@m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        BczWebExecutorKt.startFullScreenWeb$default(context, BczWebExecutorKt.URL_MY_DEVICES, 0, 0, 12, null);
    }

    public static final void b(@m80.k Context context, long j11, long j12) {
        kotlin.jvm.internal.g0.p(context, "context");
        String string = context.getString(R.string.vld_word_list, String.valueOf(j11), String.valueOf(j12));
        kotlin.jvm.internal.g0.o(string, "getString(...)");
        BczWebExecutorKt.startFullScreenWeb$default(context, string, 0, 0, 12, null);
    }
}
