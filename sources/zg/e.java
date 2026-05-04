package zg;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import com.baicizhan.main.model.data.TabInfo;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTabInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabInfo.kt\ncom/baicizhan/main/model/data/TabInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f102649a = "tab_info";

    /* renamed from: b, reason: collision with root package name */
    public static final int f102650b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f102651c = 2;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f102652d = "default";

    public static final int a(boolean z11) {
        return z11 ? 2 : 1;
    }

    public static final BitmapDrawable b(Context context, String str) {
        return new BitmapDrawable(context.getResources(), hc.c.p(str).get());
    }

    public static final Drawable c(Context context, boolean z11) {
        return ResourcesCompat.getDrawable(context.getResources(), z11 ? R.drawable.ic_state_taobao : R.drawable.ic_state_mall, null);
    }

    public static final String d(boolean z11) {
        String string = pb.a.a().getString(z11 ? R.string.main_tab_name_store : R.string.main_tab_name_store_mall);
        g0.o(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r13.getServerRecommend() != 1) goto L12;
     */
    @androidx.annotation.WorkerThread
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final zg.g e(@m80.l com.baicizhan.main.model.data.TabInfo r13, @m80.k android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.e.e(com.baicizhan.main.model.data.TabInfo, android.content.Context, boolean):zg.g");
    }

    public static /* synthetic */ g f(TabInfo tabInfo, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return e(tabInfo, context, z11);
    }
}
